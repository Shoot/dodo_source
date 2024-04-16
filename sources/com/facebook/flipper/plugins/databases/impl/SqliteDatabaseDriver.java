package com.facebook.flipper.plugins.databases.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.flipper.plugins.databases.DatabaseDescriptor;
import com.facebook.flipper.plugins.databases.DatabaseDriver;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.network.NetworkHandler;
import im.threads.business.transport.MessageAttributes;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes2.dex */
public class SqliteDatabaseDriver extends DatabaseDriver<SqliteDatabaseDescriptor> {
    private static final String SCHEMA_TABLE = "sqlite_master";
    private static final String TAG = "SqliteDatabaseDriver";
    private static final String[] UNINTERESTING_FILENAME_SUFFIXES = {"-journal", "-shm", "-uid", "-wal"};
    private final SqliteDatabaseConnectionProvider sqliteDatabaseConnectionProvider;
    private final SqliteDatabaseProvider sqliteDatabaseProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SqliteDatabaseDescriptor implements DatabaseDescriptor {
        public final File file;

        public SqliteDatabaseDescriptor(File file) {
            this.file = file;
        }

        @Override // com.facebook.flipper.plugins.databases.DatabaseDescriptor
        public String name() {
            return this.file.getName();
        }
    }

    public SqliteDatabaseDriver(Context context) {
        this(context, new DefaultSqliteDatabaseProvider(context));
    }

    private void close(y2b y2bVar) {
        try {
            y2bVar.close();
        } catch (IOException e) {
            Log.e(TAG, "Failed to close SQLite database", e);
        }
    }

    private static List<List<Object>> cursorToList(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int columnCount = cursor.getColumnCount();
        while (cursor.moveToNext()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < columnCount; i++) {
                arrayList2.add(getObjectFromColumnIndex(cursor, i));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    private static DatabaseDriver.DatabaseExecuteSqlResponse executeInsert(y2b y2bVar, String str) {
        return DatabaseDriver.DatabaseExecuteSqlResponse.successfulInsert(y2bVar.R0(str).D0());
    }

    private static DatabaseDriver.DatabaseExecuteSqlResponse executeRawQuery(y2b y2bVar, String str) {
        y2bVar.C(str);
        return DatabaseDriver.DatabaseExecuteSqlResponse.successfulRawQuery();
    }

    private static DatabaseDriver.DatabaseExecuteSqlResponse executeSelect(y2b y2bVar, String str) {
        Cursor H0 = y2bVar.H0(str, null);
        try {
            String[] columnNames = H0.getColumnNames();
            return DatabaseDriver.DatabaseExecuteSqlResponse.successfulSelect(Arrays.asList(columnNames), cursorToList(H0));
        } finally {
            H0.close();
        }
    }

    private static DatabaseDriver.DatabaseExecuteSqlResponse executeUpdateDelete(y2b y2bVar, String str) {
        return DatabaseDriver.DatabaseExecuteSqlResponse.successfulUpdateDelete(y2bVar.R0(str).I());
    }

    private static String getFirstWord(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(32);
        if (indexOf >= 0) {
            return trim.substring(0, indexOf);
        }
        return trim;
    }

    private static Object getObjectFromColumnIndex(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 4) {
                        return cursor.getString(i);
                    }
                    return cursor.getBlob(i);
                }
                return Double.valueOf(cursor.getDouble(i));
            }
            return Long.valueOf(cursor.getLong(i));
        }
        return null;
    }

    private long queryNumEntries(y2b y2bVar, String str) {
        Cursor m1 = y2bVar.m1("SELECT COUNT(*) FROM " + str);
        try {
            m1.moveToFirst();
            return m1.getLong(0);
        } finally {
            m1.close();
        }
    }

    private static String removeSuffix(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str.endsWith(str2)) {
                return str.substring(0, str.length() - str2.length());
            }
        }
        return str;
    }

    private static List<File> tidyDatabaseList(List<File> list) {
        HashSet hashSet = new HashSet(list);
        ArrayList arrayList = new ArrayList();
        for (File file : list) {
            String path = file.getPath();
            String removeSuffix = removeSuffix(path, UNINTERESTING_FILENAME_SUFFIXES);
            if (removeSuffix.equals(path) || !hashSet.contains(new File(removeSuffix))) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    @Override // com.facebook.flipper.plugins.databases.DatabaseDriver
    public List<SqliteDatabaseDescriptor> getDatabases() {
        ArrayList arrayList = new ArrayList();
        List<File> databaseFiles = this.sqliteDatabaseProvider.getDatabaseFiles();
        Collections.sort(databaseFiles);
        for (File file : tidyDatabaseList(databaseFiles)) {
            arrayList.add(new SqliteDatabaseDescriptor(file));
        }
        return arrayList;
    }

    public SqliteDatabaseDriver(Context context, SqliteDatabaseProvider sqliteDatabaseProvider) {
        this(context, sqliteDatabaseProvider, new DefaultSqliteDatabaseConnectionProvider());
    }

    @Override // com.facebook.flipper.plugins.databases.DatabaseDriver
    public DatabaseDriver.DatabaseExecuteSqlResponse executeSQL(SqliteDatabaseDescriptor sqliteDatabaseDescriptor, String str) {
        char c;
        y2b openDatabase = this.sqliteDatabaseConnectionProvider.openDatabase(sqliteDatabaseDescriptor.file);
        try {
            String upperCase = getFirstWord(str).toUpperCase();
            switch (upperCase.hashCode()) {
                case -2130463047:
                    if (upperCase.equals("INSERT")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1926899396:
                    if (upperCase.equals("PRAGMA")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1852692228:
                    if (upperCase.equals("SELECT")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1785516855:
                    if (upperCase.equals("UPDATE")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -591179561:
                    if (upperCase.equals("EXPLAIN")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 2012838315:
                    if (upperCase.equals(NetworkHandler.DELETE)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0 || c == 1) {
                DatabaseDriver.DatabaseExecuteSqlResponse executeUpdateDelete = executeUpdateDelete(openDatabase, str);
                close(openDatabase);
                return executeUpdateDelete;
            } else if (c == 2) {
                DatabaseDriver.DatabaseExecuteSqlResponse executeInsert = executeInsert(openDatabase, str);
                close(openDatabase);
                return executeInsert;
            } else if (c != 3 && c != 4 && c != 5) {
                DatabaseDriver.DatabaseExecuteSqlResponse executeRawQuery = executeRawQuery(openDatabase, str);
                close(openDatabase);
                return executeRawQuery;
            } else {
                DatabaseDriver.DatabaseExecuteSqlResponse executeSelect = executeSelect(openDatabase, str);
                close(openDatabase);
                return executeSelect;
            }
        } catch (Throwable th) {
            close(openDatabase);
            throw th;
        }
    }

    @Override // com.facebook.flipper.plugins.databases.DatabaseDriver
    public DatabaseDriver.DatabaseGetTableDataResponse getTableData(SqliteDatabaseDescriptor sqliteDatabaseDescriptor, String str, String str2, boolean z, int i, int i2) {
        String sb;
        String str3;
        y2b openDatabase = this.sqliteDatabaseConnectionProvider.openDatabase(sqliteDatabaseDescriptor.file);
        if (str2 != null) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(z ? " DESC" : " ASC");
                sb = sb2.toString();
            } catch (Throwable th) {
                close(openDatabase);
                throw th;
            }
        } else {
            sb = null;
        }
        if (sb != null) {
            str3 = "SELECT * from " + str + " ORDER BY " + sb + " LIMIT ?, ?";
        } else {
            str3 = "SELECT * from " + str + " LIMIT ?, ?";
        }
        Cursor H0 = openDatabase.H0(str3, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        long queryNumEntries = queryNumEntries(openDatabase, str);
        String[] columnNames = H0.getColumnNames();
        List<List<Object>> cursorToList = cursorToList(H0);
        DatabaseDriver.DatabaseGetTableDataResponse databaseGetTableDataResponse = new DatabaseDriver.DatabaseGetTableDataResponse(Arrays.asList(columnNames), cursorToList, i, cursorToList.size(), queryNumEntries);
        H0.close();
        close(openDatabase);
        return databaseGetTableDataResponse;
    }

    @Override // com.facebook.flipper.plugins.databases.DatabaseDriver
    public DatabaseDriver.DatabaseGetTableInfoResponse getTableInfo(SqliteDatabaseDescriptor sqliteDatabaseDescriptor, String str) {
        y2b openDatabase = this.sqliteDatabaseConnectionProvider.openDatabase(sqliteDatabaseDescriptor.file);
        try {
            Cursor H0 = openDatabase.H0("SELECT sql FROM sqlite_master WHERE name=?", new String[]{str});
            H0.moveToFirst();
            DatabaseDriver.DatabaseGetTableInfoResponse databaseGetTableInfoResponse = new DatabaseDriver.DatabaseGetTableInfoResponse(H0.getString(H0.getColumnIndex("sql")));
            H0.close();
            return databaseGetTableInfoResponse;
        } finally {
            close(openDatabase);
        }
    }

    @Override // com.facebook.flipper.plugins.databases.DatabaseDriver
    public List<String> getTableNames(SqliteDatabaseDescriptor sqliteDatabaseDescriptor) {
        try {
            y2b openDatabase = this.sqliteDatabaseConnectionProvider.openDatabase(sqliteDatabaseDescriptor.file);
            Cursor H0 = openDatabase.H0("SELECT name FROM sqlite_master WHERE type IN (?, ?)", new String[]{"table", "view"});
            try {
                ArrayList arrayList = new ArrayList();
                while (H0.moveToNext()) {
                    arrayList.add(H0.getString(0));
                }
                close(openDatabase);
                return arrayList;
            } finally {
                H0.close();
            }
        } catch (SQLiteException e) {
            Log.e(TAG, "Temporary SQLite exception caught and ignored.", e);
            return Collections.emptyList();
        }
    }

    @Override // com.facebook.flipper.plugins.databases.DatabaseDriver
    public DatabaseDriver.DatabaseGetTableStructureResponse getTableStructure(SqliteDatabaseDescriptor sqliteDatabaseDescriptor, String str) {
        String str2 = ")";
        y2b openDatabase = this.sqliteDatabaseConnectionProvider.openDatabase(sqliteDatabaseDescriptor.file);
        try {
            Cursor H0 = openDatabase.H0("PRAGMA table_info(" + str + ")", null);
            Cursor H02 = openDatabase.H0("PRAGMA foreign_key_list(" + str + ")", null);
            Cursor H03 = openDatabase.H0("PRAGMA index_list(" + str + ")", null);
            List asList = Arrays.asList("column_name", "data_type", "nullable", "default", "primary_key", "foreign_key");
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            while (H02.moveToNext()) {
                String string = H02.getString(H02.getColumnIndex(RemoteMessageConst.FROM));
                hashMap.put(string, H02.getString(H02.getColumnIndex("table")) + "(" + H02.getString(H02.getColumnIndex(RemoteMessageConst.TO)) + ")");
            }
            while (H0.moveToNext()) {
                String string2 = H0.getString(H0.getColumnIndex(Action.NAME_ATTRIBUTE));
                String str3 = hashMap.containsKey(string2) ? (String) hashMap.get(string2) : null;
                Object[] objArr = new Object[6];
                objArr[0] = string2;
                objArr[1] = H0.getString(H0.getColumnIndex(MessageAttributes.TYPE));
                objArr[2] = Boolean.valueOf(H0.getInt(H0.getColumnIndex("notnull")) == 0);
                objArr[3] = getObjectFromColumnIndex(H0, H0.getColumnIndex("dflt_value"));
                objArr[4] = Boolean.valueOf(H0.getInt(H0.getColumnIndex("pk")) == 1);
                objArr[5] = str3;
                arrayList.add(Arrays.asList(objArr));
            }
            List asList2 = Arrays.asList("index_name", "unique", "indexed_column_name");
            ArrayList arrayList2 = new ArrayList();
            while (H03.moveToNext()) {
                ArrayList arrayList3 = new ArrayList();
                String string3 = H03.getString(H03.getColumnIndex(Action.NAME_ATTRIBUTE));
                Cursor H04 = openDatabase.H0("PRAGMA index_info(" + string3 + str2, null);
                while (H04.moveToNext()) {
                    try {
                        arrayList3.add(H04.getString(H04.getColumnIndex(Action.NAME_ATTRIBUTE)));
                    } finally {
                        H04.close();
                    }
                }
                String str4 = str2;
                Object[] objArr2 = new Object[3];
                objArr2[0] = string3;
                objArr2[1] = Boolean.valueOf(H03.getInt(H03.getColumnIndex("unique")) == 1);
                objArr2[2] = TextUtils.join(",", arrayList3);
                arrayList2.add(Arrays.asList(objArr2));
                H04.close();
                str2 = str4;
            }
            DatabaseDriver.DatabaseGetTableStructureResponse databaseGetTableStructureResponse = new DatabaseDriver.DatabaseGetTableStructureResponse(asList, arrayList, asList2, arrayList2);
            H0.close();
            H02.close();
            H03.close();
            return databaseGetTableStructureResponse;
        } finally {
            close(openDatabase);
        }
    }

    public SqliteDatabaseDriver(Context context, SqliteDatabaseProvider sqliteDatabaseProvider, SqliteDatabaseConnectionProvider sqliteDatabaseConnectionProvider) {
        super(context);
        this.sqliteDatabaseProvider = sqliteDatabaseProvider;
        this.sqliteDatabaseConnectionProvider = sqliteDatabaseConnectionProvider;
    }
}
