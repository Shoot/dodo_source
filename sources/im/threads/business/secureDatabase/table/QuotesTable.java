package im.threads.business.secureDatabase.table;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.hms.opendevice.c;
import im.threads.business.models.FileDescription;
import im.threads.business.models.Quote;
import im.threads.business.models.enums.ModificationStateEnum;
import im.threads.business.secureDatabase.table.Table;
import im.threads.business.transport.MessageAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: QuotesTable.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u0006\u0010\u0007\u001a\u00020\bJ\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\rJ\"\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\rJ \u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lim/threads/business/secureDatabase/table/QuotesTable;", "Lim/threads/business/secureDatabase/table/Table;", "fileDescriptionsTable", "Lim/threads/business/secureDatabase/table/FileDescriptionsTable;", "(Lim/threads/business/secureDatabase/table/FileDescriptionsTable;)V", "cleanTable", "", "sqlHelper", "Landroid/database/sqlite/SQLiteOpenHelper;", "createTable", "db", "Landroid/database/sqlite/SQLiteDatabase;", "getQuote", "Lim/threads/business/models/Quote;", "quotedByMessageUuid", "", "getQuoteByUuid", MessageAttributes.UUID, "getQuotes", "", "putQuote", "quote", "updateQuoteByUuid", "upgradeTable", "oldVersion", "", "newVersion", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuotesTable extends Table {
    private static final String COLUMN_MODIFICATION_STATE = "COLUMN_MODIFICATION_STATE";
    private static final String COLUMN_QUOTED_BY_MESSAGE_UUID_EXT = "COLUMN_QUOTED_BY_MESSAGE_UUID_EXT";
    private static final String COLUMN_QUOTE_BODY = "COLUMN_QUOTE_BODY";
    private static final String COLUMN_QUOTE_FROM = "COLUMN_QUOTE_HEADER";
    private static final String COLUMN_QUOTE_TIMESTAMP = "COLUMN_QUOTE_TIMESTAMP";
    private static final String COLUMN_QUOTE_UUID = "COLUMN_QUOTE_UUID";
    public static final Companion Companion = new Companion(null);
    public static final String TABLE_QUOTE = "TABLE_QUOTE";
    private final FileDescriptionsTable fileDescriptionsTable;

    /* compiled from: QuotesTable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lim/threads/business/secureDatabase/table/QuotesTable$Companion;", "", "()V", QuotesTable.COLUMN_MODIFICATION_STATE, "", QuotesTable.COLUMN_QUOTED_BY_MESSAGE_UUID_EXT, QuotesTable.COLUMN_QUOTE_BODY, "COLUMN_QUOTE_FROM", QuotesTable.COLUMN_QUOTE_TIMESTAMP, QuotesTable.COLUMN_QUOTE_UUID, QuotesTable.TABLE_QUOTE, "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public QuotesTable(FileDescriptionsTable fileDescriptionsTable) {
        z65.h(fileDescriptionsTable, "fileDescriptionsTable");
        this.fileDescriptionsTable = fileDescriptionsTable;
    }

    @Override // im.threads.business.secureDatabase.table.Table
    public void cleanTable(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        sQLiteOpenHelper.getWritableDatabase().execSQL("delete from TABLE_QUOTE");
    }

    @Override // im.threads.business.secureDatabase.table.Table
    public void createTable(SQLiteDatabase sQLiteDatabase) {
        z65.h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("CREATE TABLE TABLE_QUOTE(COLUMN_QUOTE_UUID text,COLUMN_QUOTE_HEADER text, COLUMN_QUOTE_BODY text, COLUMN_QUOTE_TIMESTAMP integer, COLUMN_QUOTED_BY_MESSAGE_UUID_EXT integer, COLUMN_MODIFICATION_STATE text)");
    }

    public final Quote getQuote(SQLiteOpenHelper sQLiteOpenHelper, String str) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        if (str == null || str.length() == 0) {
            return null;
        }
        pza pzaVar = pza.a;
        String format = String.format(Locale.US, "select * from %s where %s = ?", Arrays.copyOf(new Object[]{TABLE_QUOTE, COLUMN_QUOTED_BY_MESSAGE_UUID_EXT}, 2));
        z65.g(format, "format(locale, format, *args)");
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery(format, new String[]{str});
        try {
            if (rawQuery.moveToFirst()) {
                Table.Companion companion = Table.Companion;
                z65.g(rawQuery, c.a);
                Quote quote = new Quote(companion.cursorGetString(rawQuery, COLUMN_QUOTE_UUID), companion.cursorGetString(rawQuery, COLUMN_QUOTE_FROM), companion.cursorGetString(rawQuery, COLUMN_QUOTE_BODY), this.fileDescriptionsTable.getFileDescription(sQLiteOpenHelper, companion.cursorGetString(rawQuery, COLUMN_QUOTE_UUID)), companion.cursorGetLong(rawQuery, COLUMN_QUOTE_TIMESTAMP), ModificationStateEnum.Companion.fromString(companion.cursorGetString(rawQuery, COLUMN_MODIFICATION_STATE)));
                aa1.a(rawQuery, null);
                return quote;
            }
            Unit unit = Unit.a;
            aa1.a(rawQuery, null);
            return null;
        } finally {
        }
    }

    public final Quote getQuoteByUuid(SQLiteOpenHelper sQLiteOpenHelper, String str) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        if (str == null || str.length() == 0) {
            return null;
        }
        pza pzaVar = pza.a;
        String format = String.format(Locale.US, "select * from %s where %s = ?", Arrays.copyOf(new Object[]{TABLE_QUOTE, COLUMN_QUOTE_UUID}, 2));
        z65.g(format, "format(locale, format, *args)");
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery(format, new String[]{str});
        try {
            try {
                if (rawQuery.moveToFirst()) {
                    Table.Companion companion = Table.Companion;
                    z65.g(rawQuery, c.a);
                    Quote quote = new Quote(companion.cursorGetString(rawQuery, COLUMN_QUOTE_UUID), companion.cursorGetString(rawQuery, COLUMN_QUOTE_FROM), companion.cursorGetString(rawQuery, COLUMN_QUOTE_BODY), this.fileDescriptionsTable.getFileDescription(sQLiteOpenHelper, companion.cursorGetString(rawQuery, COLUMN_QUOTE_UUID)), companion.cursorGetLong(rawQuery, COLUMN_QUOTE_TIMESTAMP), ModificationStateEnum.Companion.fromString(companion.cursorGetString(rawQuery, COLUMN_MODIFICATION_STATE)));
                    aa1.a(rawQuery, null);
                    return quote;
                }
                Unit unit = Unit.a;
                aa1.a(rawQuery, null);
                return null;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    throw th2;
                } catch (Throwable th3) {
                    aa1.a(rawQuery, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final List<Quote> getQuotes(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        pza pzaVar = pza.a;
        String format = String.format(Locale.US, "select * from %s order by %s desc", Arrays.copyOf(new Object[]{TABLE_QUOTE, COLUMN_QUOTE_TIMESTAMP}, 2));
        z65.g(format, "format(locale, format, *args)");
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery(format, new String[0]);
        try {
            Throwable th = null;
            if (!rawQuery.moveToFirst()) {
                aa1.a(rawQuery, null);
                return arrayList;
            }
            rawQuery.moveToFirst();
            while (!rawQuery.isAfterLast()) {
                Table.Companion companion = Table.Companion;
                z65.g(rawQuery, c.a);
                arrayList.add(new Quote(companion.cursorGetString(rawQuery, COLUMN_QUOTE_UUID), companion.cursorGetString(rawQuery, COLUMN_QUOTE_FROM), companion.cursorGetString(rawQuery, COLUMN_QUOTE_BODY), this.fileDescriptionsTable.getFileDescription(sQLiteOpenHelper, companion.cursorGetString(rawQuery, COLUMN_QUOTE_UUID)), companion.cursorGetLong(rawQuery, COLUMN_QUOTE_TIMESTAMP), ModificationStateEnum.Companion.fromString(companion.cursorGetString(rawQuery, COLUMN_MODIFICATION_STATE))));
                rawQuery.moveToNext();
                th = null;
            }
            aa1.a(rawQuery, th);
            return arrayList;
        } finally {
        }
    }

    public final void putQuote(SQLiteOpenHelper sQLiteOpenHelper, String str, Quote quote) {
        String uuid;
        z65.h(sQLiteOpenHelper, "sqlHelper");
        if (quote != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.clear();
            contentValues.put(COLUMN_QUOTE_UUID, quote.getUuid());
            contentValues.put(COLUMN_QUOTED_BY_MESSAGE_UUID_EXT, str);
            contentValues.put(COLUMN_QUOTE_FROM, quote.getPhraseOwnerTitle());
            contentValues.put(COLUMN_QUOTE_BODY, quote.getText());
            contentValues.put(COLUMN_QUOTE_TIMESTAMP, Long.valueOf(quote.getTimeStamp()));
            contentValues.put(COLUMN_MODIFICATION_STATE, quote.getModified().getState());
            Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery("select COLUMN_QUOTED_BY_MESSAGE_UUID_EXT from TABLE_QUOTE where COLUMN_QUOTED_BY_MESSAGE_UUID_EXT = ?", new String[]{str});
            try {
                if (rawQuery.getCount() > 0) {
                    sQLiteOpenHelper.getWritableDatabase().update(TABLE_QUOTE, contentValues, "COLUMN_QUOTED_BY_MESSAGE_UUID_EXT = ? ", new String[]{str});
                } else {
                    sQLiteOpenHelper.getWritableDatabase().insert(TABLE_QUOTE, null, contentValues);
                }
                FileDescription fileDescription = quote.getFileDescription();
                if (fileDescription != null && (uuid = quote.getUuid()) != null) {
                    this.fileDescriptionsTable.putFileDescription(sQLiteOpenHelper, fileDescription, uuid, true);
                    Unit unit = Unit.a;
                }
                aa1.a(rawQuery, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    aa1.a(rawQuery, th);
                    throw th2;
                }
            }
        }
    }

    public final void updateQuoteByUuid(SQLiteOpenHelper sQLiteOpenHelper, String str, Quote quote) {
        String uuid;
        z65.h(sQLiteOpenHelper, "sqlHelper");
        if (quote != null) {
            Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery("select COLUMN_QUOTE_UUID, COLUMN_QUOTED_BY_MESSAGE_UUID_EXT from TABLE_QUOTE where COLUMN_QUOTE_UUID = ?", new String[]{str});
            try {
                if (rawQuery.getCount() > 0) {
                    rawQuery.moveToFirst();
                    Table.Companion companion = Table.Companion;
                    z65.g(rawQuery, c.a);
                    String cursorGetString = companion.cursorGetString(rawQuery, COLUMN_QUOTED_BY_MESSAGE_UUID_EXT);
                    ContentValues contentValues = new ContentValues();
                    contentValues.clear();
                    contentValues.put(COLUMN_QUOTE_UUID, quote.getUuid());
                    contentValues.put(COLUMN_QUOTE_FROM, quote.getPhraseOwnerTitle());
                    contentValues.put(COLUMN_QUOTE_BODY, quote.getText());
                    contentValues.put(COLUMN_QUOTE_TIMESTAMP, Long.valueOf(quote.getTimeStamp()));
                    contentValues.put(COLUMN_MODIFICATION_STATE, quote.getModified().getState());
                    contentValues.put(COLUMN_QUOTED_BY_MESSAGE_UUID_EXT, cursorGetString);
                    sQLiteOpenHelper.getWritableDatabase().update(TABLE_QUOTE, contentValues, "COLUMN_QUOTED_BY_MESSAGE_UUID_EXT = ? ", new String[]{cursorGetString});
                }
                FileDescription fileDescription = quote.getFileDescription();
                if (fileDescription != null && (uuid = quote.getUuid()) != null) {
                    this.fileDescriptionsTable.putFileDescription(sQLiteOpenHelper, fileDescription, uuid, true);
                    Unit unit = Unit.a;
                }
                aa1.a(rawQuery, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    aa1.a(rawQuery, th);
                    throw th2;
                }
            }
        }
    }

    @Override // im.threads.business.secureDatabase.table.Table
    public void upgradeTable(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        z65.h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS TABLE_QUOTE");
    }
}
