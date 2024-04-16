package im.threads.business.secureDatabase.table;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Table.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u000f"}, d2 = {"Lim/threads/business/secureDatabase/table/Table;", "", "()V", "cleanTable", "", "sqlHelper", "Landroid/database/sqlite/SQLiteOpenHelper;", "createTable", "db", "Landroid/database/sqlite/SQLiteDatabase;", "upgradeTable", "oldVersion", "", "newVersion", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Table {
    public static final Companion Companion = new Companion(null);

    /* compiled from: Table.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000f"}, d2 = {"Lim/threads/business/secureDatabase/table/Table$Companion;", "", "()V", "cursorGetBool", "", c.a, "Landroid/database/Cursor;", "columnName", "", "cursorGetInt", "", "cursorGetLong", "", "cursorGetString", "isCursorNull", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean cursorGetBool(Cursor cursor, String str) {
            z65.h(cursor, c.a);
            z65.h(str, "columnName");
            try {
                if (cursorGetInt(cursor, str) != 1) {
                    return false;
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        @SuppressLint({"Range"})
        public final int cursorGetInt(Cursor cursor, String str) {
            z65.h(cursor, c.a);
            z65.h(str, "columnName");
            try {
                if (isCursorNull(cursor, str)) {
                    return 0;
                }
                return cursor.getInt(cursor.getColumnIndex(str));
            } catch (Exception unused) {
                return -1;
            }
        }

        @SuppressLint({"Range"})
        public final long cursorGetLong(Cursor cursor, String str) {
            z65.h(cursor, c.a);
            z65.h(str, "columnName");
            try {
                return cursor.getLong(cursor.getColumnIndex(str));
            } catch (Exception unused) {
                return -1L;
            }
        }

        @SuppressLint({"Range"})
        public final String cursorGetString(Cursor cursor, String str) {
            z65.h(cursor, c.a);
            z65.h(str, "columnName");
            try {
                if (isCursorNull(cursor, str)) {
                    return null;
                }
                return cursor.getString(cursor.getColumnIndex(str));
            } catch (Exception unused) {
                return null;
            }
        }

        @SuppressLint({"Range"})
        public final boolean isCursorNull(Cursor cursor, String str) {
            z65.h(cursor, c.a);
            z65.h(str, "columnName");
            return cursor.isNull(cursor.getColumnIndex(str));
        }
    }

    public abstract void cleanTable(SQLiteOpenHelper sQLiteOpenHelper);

    public abstract void createTable(SQLiteDatabase sQLiteDatabase);

    public abstract void upgradeTable(SQLiteDatabase sQLiteDatabase, int i, int i2);
}
