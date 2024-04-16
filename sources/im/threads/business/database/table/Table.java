package im.threads.business.database.table;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Table.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u000f"}, d2 = {"Lim/threads/business/database/table/Table;", "", "()V", "cleanTable", "", "sqlHelper", "Landroid/database/sqlite/SQLiteOpenHelper;", "createTable", "db", "Landroid/database/sqlite/SQLiteDatabase;", "upgradeTable", "oldVersion", "", "newVersion", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Table {
    public static final Companion Companion = new Companion(null);

    /* compiled from: Table.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001a\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\u000f"}, d2 = {"Lim/threads/business/database/table/Table$Companion;", "", "()V", "cGetBool", "", c.a, "Landroid/database/Cursor;", "columnName", "", "cGetInt", "", "cGetLong", "", "cGetString", "cIsNull", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean cGetBool(Cursor cursor, String str) {
            z65.h(cursor, c.a);
            if (cGetInt(cursor, str) == 1) {
                return true;
            }
            return false;
        }

        public final int cGetInt(Cursor cursor, String str) {
            z65.h(cursor, c.a);
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex >= 0 && !cIsNull(cursor, str)) {
                return cursor.getInt(columnIndex);
            }
            return 0;
        }

        public final long cGetLong(Cursor cursor, String str) {
            z65.h(cursor, c.a);
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex < 0) {
                return 0L;
            }
            return cursor.getLong(columnIndex);
        }

        public final String cGetString(Cursor cursor, String str) {
            z65.h(cursor, c.a);
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex >= 0 && !cIsNull(cursor, str)) {
                return cursor.getString(columnIndex);
            }
            return null;
        }

        public final boolean cIsNull(Cursor cursor, String str) {
            z65.h(cursor, c.a);
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex >= 0 && !cursor.isNull(columnIndex)) {
                return false;
            }
            return true;
        }
    }

    public abstract void cleanTable(SQLiteOpenHelper sQLiteOpenHelper);

    public abstract void createTable(SQLiteDatabase sQLiteDatabase);

    public abstract void upgradeTable(SQLiteDatabase sQLiteDatabase, int i, int i2);
}
