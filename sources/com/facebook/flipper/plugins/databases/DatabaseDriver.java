package com.facebook.flipper.plugins.databases;

import android.content.Context;
import com.facebook.flipper.plugins.databases.DatabaseDescriptor;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class DatabaseDriver<DESCRIPTOR extends DatabaseDescriptor> {
    private final Context mContext;

    /* loaded from: classes2.dex */
    public static class DatabaseExecuteSqlResponse {
        public static final String TYPE_INSERT = "insert";
        public static final String TYPE_RAW = "raw";
        public static final String TYPE_SELECT = "select";
        public static final String TYPE_UPDATE_DELETE = "update_delete";
        public final Integer affectedCount;
        public final List<String> columns;
        public final Long insertedId;
        public final String type;
        public final List<List<Object>> values;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes2.dex */
        public @interface Type {
        }

        private DatabaseExecuteSqlResponse(String str, List<String> list, List<List<Object>> list2, Long l, Integer num) {
            this.type = str;
            this.columns = list;
            this.values = list2;
            this.insertedId = l;
            this.affectedCount = num;
        }

        public static DatabaseExecuteSqlResponse successfulInsert(long j) {
            return new DatabaseExecuteSqlResponse(TYPE_INSERT, null, null, Long.valueOf(j), null);
        }

        public static DatabaseExecuteSqlResponse successfulRawQuery() {
            return new DatabaseExecuteSqlResponse(TYPE_RAW, null, null, null, null);
        }

        public static DatabaseExecuteSqlResponse successfulSelect(List<String> list, List<List<Object>> list2) {
            return new DatabaseExecuteSqlResponse(TYPE_SELECT, list, list2, null, null);
        }

        public static DatabaseExecuteSqlResponse successfulUpdateDelete(int i) {
            return new DatabaseExecuteSqlResponse(TYPE_UPDATE_DELETE, null, null, null, Integer.valueOf(i));
        }
    }

    /* loaded from: classes2.dex */
    public static class DatabaseGetTableDataResponse {
        public final List<String> columns;
        public final Integer count;
        public final Integer start;
        public final Long total;
        public final List<List<Object>> values;

        public DatabaseGetTableDataResponse(List<String> list, List<List<Object>> list2, int i, int i2, long j) {
            this.columns = list;
            this.values = list2;
            this.start = Integer.valueOf(i);
            this.count = Integer.valueOf(i2);
            this.total = Long.valueOf(j);
        }
    }

    /* loaded from: classes2.dex */
    public static class DatabaseGetTableInfoResponse {
        public final String definition;

        public DatabaseGetTableInfoResponse(String str) {
            this.definition = str;
        }
    }

    /* loaded from: classes2.dex */
    public static class DatabaseGetTableStructureResponse {
        public final List<String> indexesColumns;
        public final List<List<Object>> indexesValues;
        public final List<String> structureColumns;
        public final List<List<Object>> structureValues;

        public DatabaseGetTableStructureResponse(List<String> list, List<List<Object>> list2, List<String> list3, List<List<Object>> list4) {
            this.structureColumns = list;
            this.structureValues = list2;
            this.indexesColumns = list3;
            this.indexesValues = list4;
        }
    }

    public DatabaseDriver(Context context) {
        this.mContext = context;
    }

    public abstract DatabaseExecuteSqlResponse executeSQL(DESCRIPTOR descriptor, String str);

    public Context getContext() {
        return this.mContext;
    }

    public abstract List<DESCRIPTOR> getDatabases();

    public abstract DatabaseGetTableDataResponse getTableData(DESCRIPTOR descriptor, String str, String str2, boolean z, int i, int i2);

    public abstract DatabaseGetTableInfoResponse getTableInfo(DESCRIPTOR descriptor, String str);

    public abstract List<String> getTableNames(DESCRIPTOR descriptor);

    public abstract DatabaseGetTableStructureResponse getTableStructure(DESCRIPTOR descriptor, String str);
}
