package defpackage;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: CursorUtil.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a%\u0010\u0001\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0001\u0010\f¨\u0006\r"}, d2 = {"Landroid/database/Cursor;", c.a, "a", "", Action.NAME_ATTRIBUTE, "", DateTokenConverter.CONVERTER_KEY, e.a, "cursor", "b", "", "columnNames", "([Ljava/lang/String;Ljava/lang/String;)I", "room-runtime_release"}, k = 2, mv = {1, 7, 1})
/* renamed from: n32  reason: default package */
/* loaded from: classes.dex */
public final class n32 {
    public static final Cursor a(Cursor cursor) {
        z65.h(cursor, c.a);
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                int columnCount = cursor.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    int type = cursor.getType(i);
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 2) {
                                if (type != 3) {
                                    if (type == 4) {
                                        objArr[i] = cursor.getBlob(i);
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                } else {
                                    objArr[i] = cursor.getString(i);
                                }
                            } else {
                                objArr[i] = Double.valueOf(cursor.getDouble(i));
                            }
                        } else {
                            objArr[i] = Long.valueOf(cursor.getLong(i));
                        }
                    } else {
                        objArr[i] = null;
                    }
                }
                matrixCursor.addRow(objArr);
            }
            aa1.a(cursor, null);
            return matrixCursor;
        } finally {
        }
    }

    private static final int b(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        z65.g(columnNames, "columnNames");
        return c(columnNames, str);
    }

    public static final int c(String[] strArr, String str) {
        boolean u;
        boolean u2;
        z65.h(strArr, "columnNames");
        z65.h(str, Action.NAME_ATTRIBUTE);
        String str2 = CoreConstants.DOT + str;
        String str3 = CoreConstants.DOT + str + '`';
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str4 = strArr[i];
            int i3 = i2 + 1;
            if (str4.length() >= str.length() + 2) {
                u = l0b.u(str4, str2, false, 2, null);
                if (u) {
                    return i2;
                }
                if (str4.charAt(0) == '`') {
                    u2 = l0b.u(str4, str3, false, 2, null);
                    if (u2) {
                        return i2;
                    }
                } else {
                    continue;
                }
            }
            i++;
            i2 = i3;
        }
        return -1;
    }

    public static final int d(Cursor cursor, String str) {
        z65.h(cursor, c.a);
        z65.h(str, Action.NAME_ATTRIBUTE);
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex('`' + str + '`');
        if (columnIndex2 < 0) {
            return b(cursor, str);
        }
        return columnIndex2;
    }

    public static final int e(Cursor cursor, String str) {
        String str2;
        z65.h(cursor, c.a);
        z65.h(str, Action.NAME_ATTRIBUTE);
        int d = d(cursor, str);
        if (d >= 0) {
            return d;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            z65.g(columnNames, "c.columnNames");
            str2 = yr.O(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}
