package ch.qos.logback.classic.android;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import ch.qos.logback.classic.db.SQLBuilder;
import ch.qos.logback.classic.db.names.DBNameResolver;
import ch.qos.logback.classic.db.names.DefaultDBNameResolver;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import ch.qos.logback.core.android.AndroidContextUtil;
import ch.qos.logback.core.util.Duration;
import java.io.File;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class SQLiteAppender extends UnsynchronizedAppenderBase<ILoggingEvent> {
    private static final int ARG0_INDEX = 7;
    private static final int CALLER_CLASS_INDEX = 12;
    private static final int CALLER_FILENAME_INDEX = 11;
    private static final int CALLER_LINE_INDEX = 14;
    private static final int CALLER_METHOD_INDEX = 13;
    private static final short EXCEPTION_EXISTS = 2;
    private static final int FORMATTED_MESSAGE_INDEX = 2;
    private static final int LEVEL_STRING_INDEX = 4;
    private static final int LOGGER_NAME_INDEX = 3;
    private static final short PROPERTIES_EXIST = 1;
    private static final int REFERENCE_FLAG_INDEX = 6;
    private static final int THREAD_NAME_INDEX = 5;
    private static final int TIMESTMP_INDEX = 1;
    private SQLiteDatabase db;
    private DBNameResolver dbNameResolver;
    private String filename;
    private String insertExceptionSQL;
    private String insertPropertiesSQL;
    private String insertSQL;
    private SQLiteLogCleaner logCleaner;
    private Duration maxHistory;
    private long lastCleanupTime = 0;
    private Clock clock = new SystemClock();

    private String asStringTruncatedTo254(Object obj) {
        String str;
        if (obj != null) {
            str = obj.toString();
        } else {
            str = null;
        }
        if (str != null && str.length() > 254) {
            str = str.substring(0, 254);
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    private void bindCallerData(SQLiteStatement sQLiteStatement, StackTraceElement[] stackTraceElementArr) throws SQLException {
        StackTraceElement stackTraceElement;
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0 && (stackTraceElement = stackTraceElementArr[0]) != null) {
            bindString(sQLiteStatement, 11, stackTraceElement.getFileName());
            bindString(sQLiteStatement, 12, stackTraceElement.getClassName());
            bindString(sQLiteStatement, 13, stackTraceElement.getMethodName());
            bindString(sQLiteStatement, 14, Integer.toString(stackTraceElement.getLineNumber()));
        }
    }

    private void bindLoggingEvent(SQLiteStatement sQLiteStatement, ILoggingEvent iLoggingEvent) throws SQLException {
        sQLiteStatement.bindLong(1, iLoggingEvent.getTimeStamp());
        sQLiteStatement.bindString(2, iLoggingEvent.getFormattedMessage());
        sQLiteStatement.bindString(3, iLoggingEvent.getLoggerName());
        sQLiteStatement.bindString(4, iLoggingEvent.getLevel().toString());
        sQLiteStatement.bindString(5, iLoggingEvent.getThreadName());
        sQLiteStatement.bindLong(6, computeReferenceMask(iLoggingEvent));
    }

    private void bindLoggingEventArguments(SQLiteStatement sQLiteStatement, Object[] objArr) throws SQLException {
        int i;
        if (objArr != null) {
            i = objArr.length;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i && i2 < 4; i2++) {
            sQLiteStatement.bindString(i2 + 7, asStringTruncatedTo254(objArr[i2]));
        }
    }

    private void bindString(SQLiteStatement sQLiteStatement, int i, String str) {
        if (str != null) {
            sQLiteStatement.bindString(i, str);
        }
    }

    private void clearExpiredLogs(SQLiteDatabase sQLiteDatabase) {
        if (lastCheckExpired(this.maxHistory, this.lastCleanupTime)) {
            this.lastCleanupTime = this.clock.currentTimeMillis();
            getLogCleaner().performLogCleanup(sQLiteDatabase, this.maxHistory);
        }
    }

    private static short computeReferenceMask(ILoggingEvent iLoggingEvent) {
        int i;
        int i2;
        short s = 0;
        if (iLoggingEvent.getMDCPropertyMap() != null) {
            i = iLoggingEvent.getMDCPropertyMap().keySet().size();
        } else {
            i = 0;
        }
        if (iLoggingEvent.getLoggerContextVO().getPropertyMap() != null) {
            i2 = iLoggingEvent.getLoggerContextVO().getPropertyMap().size();
        } else {
            i2 = 0;
        }
        if (i > 0 || i2 > 0) {
            s = PROPERTIES_EXIST;
        }
        if (iLoggingEvent.getThrowableProxy() != null) {
            return (short) (s | EXCEPTION_EXISTS);
        }
        return s;
    }

    private void insertException(SQLiteStatement sQLiteStatement, String str, short s, long j) throws SQLException {
        sQLiteStatement.bindLong(1, j);
        sQLiteStatement.bindLong(2, s);
        sQLiteStatement.bindString(3, str);
        sQLiteStatement.executeInsert();
    }

    private void insertProperties(Map<String, String> map, long j) throws SQLException {
        if (map.size() > 0) {
            SQLiteStatement compileStatement = this.db.compileStatement(this.insertPropertiesSQL);
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    compileStatement.bindLong(1, j);
                    compileStatement.bindString(2, entry.getKey());
                    compileStatement.bindString(3, entry.getValue());
                    compileStatement.executeInsert();
                }
            } finally {
                compileStatement.close();
            }
        }
    }

    private void insertThrowable(IThrowableProxy iThrowableProxy, long j) throws SQLException {
        SQLiteStatement compileStatement = this.db.compileStatement(this.insertExceptionSQL);
        short s = 0;
        while (iThrowableProxy != null) {
            try {
                StringBuilder sb = new StringBuilder();
                ThrowableProxyUtil.subjoinFirstLine(sb, iThrowableProxy);
                insertException(compileStatement, sb.toString(), s, j);
                int commonFrames = iThrowableProxy.getCommonFrames();
                StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
                s = (short) (s + PROPERTIES_EXIST);
                int i = 0;
                while (i < stackTraceElementProxyArray.length - commonFrames) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('\t');
                    ThrowableProxyUtil.subjoinSTEP(sb2, stackTraceElementProxyArray[i]);
                    insertException(compileStatement, sb2.toString(), s, j);
                    i++;
                    s = (short) (s + PROPERTIES_EXIST);
                }
                if (commonFrames > 0) {
                    insertException(compileStatement, "\t... " + commonFrames + " common frames omitted", s, j);
                    s = (short) (s + PROPERTIES_EXIST);
                }
                iThrowableProxy = iThrowableProxy.getCause();
            } catch (Throwable th) {
                compileStatement.close();
                throw th;
            }
        }
        compileStatement.close();
    }

    private boolean lastCheckExpired(Duration duration, long j) {
        if (duration == null || duration.getMilliseconds() <= 0) {
            return false;
        }
        long currentTimeMillis = this.clock.currentTimeMillis() - j;
        if (j > 0 && currentTimeMillis < duration.getMilliseconds()) {
            return false;
        }
        return true;
    }

    private Map<String, String> mergePropertyMaps(ILoggingEvent iLoggingEvent) {
        HashMap hashMap = new HashMap();
        Map<String, String> propertyMap = iLoggingEvent.getLoggerContextVO().getPropertyMap();
        if (propertyMap != null) {
            hashMap.putAll(propertyMap);
        }
        Map<String, String> mDCPropertyMap = iLoggingEvent.getMDCPropertyMap();
        if (mDCPropertyMap != null) {
            hashMap.putAll(mDCPropertyMap);
        }
        return hashMap;
    }

    private void secondarySubAppend(ILoggingEvent iLoggingEvent, long j) throws SQLException {
        insertProperties(mergePropertyMaps(iLoggingEvent), j);
        if (iLoggingEvent.getThrowableProxy() != null) {
            insertThrowable(iLoggingEvent.getThrowableProxy(), j);
        }
    }

    private long subAppend(ILoggingEvent iLoggingEvent, SQLiteStatement sQLiteStatement) throws SQLException {
        bindLoggingEvent(sQLiteStatement, iLoggingEvent);
        bindLoggingEventArguments(sQLiteStatement, iLoggingEvent.getArgumentArray());
        bindCallerData(sQLiteStatement, iLoggingEvent.getCallerData());
        try {
            return sQLiteStatement.executeInsert();
        } catch (SQLiteException e) {
            addWarn("Failed to insert loggingEvent", e);
            return -1L;
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    public void append(ILoggingEvent iLoggingEvent) {
        if (isStarted()) {
            try {
                clearExpiredLogs(this.db);
                SQLiteStatement compileStatement = this.db.compileStatement(this.insertSQL);
                this.db.beginTransaction();
                long subAppend = subAppend(iLoggingEvent, compileStatement);
                if (subAppend != -1) {
                    secondarySubAppend(iLoggingEvent, subAppend);
                    this.db.setTransactionSuccessful();
                }
                if (this.db.inTransaction()) {
                    this.db.endTransaction();
                }
                compileStatement.close();
            } catch (Throwable th) {
                addError("Cannot append event", th);
            }
        }
    }

    protected void finalize() throws Throwable {
        this.db.close();
    }

    public File getDatabaseFile(String str) {
        File file;
        if (str != null && str.trim().length() > 0) {
            file = new File(str);
        } else {
            file = null;
        }
        if (file == null || file.isDirectory()) {
            return new File(new AndroidContextUtil().getDatabasePath("logback.db"));
        }
        return file;
    }

    public String getFilename() {
        return this.filename;
    }

    public SQLiteLogCleaner getLogCleaner() {
        if (this.logCleaner == null) {
            final Clock clock = this.clock;
            this.logCleaner = new SQLiteLogCleaner() { // from class: ch.qos.logback.classic.android.SQLiteAppender.1
                @Override // ch.qos.logback.classic.android.SQLiteLogCleaner
                public void performLogCleanup(SQLiteDatabase sQLiteDatabase, Duration duration) {
                    sQLiteDatabase.execSQL(SQLBuilder.buildDeleteExpiredLogsSQL(SQLiteAppender.this.dbNameResolver, clock.currentTimeMillis() - duration.getMilliseconds()));
                }
            };
        }
        return this.logCleaner;
    }

    public String getMaxHistory() {
        Duration duration = this.maxHistory;
        if (duration != null) {
            return duration.toString();
        }
        return "";
    }

    public long getMaxHistoryMs() {
        Duration duration = this.maxHistory;
        if (duration != null) {
            return duration.getMilliseconds();
        }
        return 0L;
    }

    void setClock(Clock clock) {
        this.clock = clock;
    }

    public void setDbNameResolver(DBNameResolver dBNameResolver) {
        this.dbNameResolver = dBNameResolver;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public void setLogCleaner(SQLiteLogCleaner sQLiteLogCleaner) {
        this.logCleaner = sQLiteLogCleaner;
    }

    public void setMaxHistory(String str) {
        this.maxHistory = Duration.valueOf(str);
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String str;
        this.started = false;
        File databaseFile = getDatabaseFile(this.filename);
        if (databaseFile == null) {
            addError("Cannot determine database filename");
            return;
        }
        try {
            databaseFile.getParentFile().mkdirs();
            addInfo("db path: " + databaseFile.getAbsolutePath());
            this.db = SQLiteDatabase.openOrCreateDatabase(databaseFile.getPath(), (SQLiteDatabase.CursorFactory) null);
            if (this.dbNameResolver == null) {
                this.dbNameResolver = new DefaultDBNameResolver();
            }
            this.insertExceptionSQL = SQLBuilder.buildInsertExceptionSQL(this.dbNameResolver);
            this.insertPropertiesSQL = SQLBuilder.buildInsertPropertiesSQL(this.dbNameResolver);
            this.insertSQL = SQLBuilder.buildInsertSQL(this.dbNameResolver);
        } catch (SQLiteException e) {
            e = e;
            str = "Cannot open database";
        }
        try {
            this.db.execSQL(SQLBuilder.buildCreateLoggingEventTableSQL(this.dbNameResolver));
            this.db.execSQL(SQLBuilder.buildCreatePropertyTableSQL(this.dbNameResolver));
            this.db.execSQL(SQLBuilder.buildCreateExceptionTableSQL(this.dbNameResolver));
            clearExpiredLogs(this.db);
            super.start();
            this.started = true;
        } catch (SQLiteException e2) {
            e = e2;
            str = "Cannot create database tables";
            addError(str, e);
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.db.close();
        this.lastCleanupTime = 0L;
    }
}
