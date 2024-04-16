package im.threads.business.secureDatabase.table;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.hms.opendevice.c;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.QuickReply;
import im.threads.business.secureDatabase.table.Table;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: QuickRepliesTable.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\fH\u0002J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¨\u0006\u0017"}, d2 = {"Lim/threads/business/secureDatabase/table/QuickRepliesTable;", "Lim/threads/business/secureDatabase/table/Table;", "()V", "cleanTable", "", "sqlHelper", "Landroid/database/sqlite/SQLiteOpenHelper;", "createTable", "db", "Landroid/database/sqlite/SQLiteDatabase;", "getQuickReplies", "", "Lim/threads/business/models/QuickReply;", "messageUUID", "", "putQuickReplies", "quickReplies", "putQuickReply", "quickReply", "upgradeTable", "oldVersion", "", "newVersion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuickRepliesTable extends Table {
    private final void putQuickReply(SQLiteOpenHelper sQLiteOpenHelper, String str, QuickReply quickReply) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("COLUMN_SERVER_ID", Integer.valueOf(quickReply.getId()));
        contentValues.put("COLUMN_MESSAGE_UUID", str);
        contentValues.put("COLUMN_TYPE", quickReply.getType());
        contentValues.put("COLUMN_TEXT", quickReply.getText());
        contentValues.put("COLUMN_IMAGE_URL", quickReply.getImageUrl());
        contentValues.put("COLUMN_URL", quickReply.getUrl());
        sQLiteOpenHelper.getWritableDatabase().insert("TABLE_QUICK_REPLIES", null, contentValues);
    }

    @Override // im.threads.business.secureDatabase.table.Table
    public void cleanTable(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        sQLiteOpenHelper.getWritableDatabase().execSQL("delete from TABLE_QUICK_REPLIES");
    }

    @Override // im.threads.business.secureDatabase.table.Table
    public void createTable(SQLiteDatabase sQLiteDatabase) {
        z65.h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("CREATE TABLE TABLE_QUICK_REPLIES(COLUMN_ID integer primary key autoincrement, COLUMN_SERVER_ID integer, COLUMN_MESSAGE_UUID string, COLUMN_TYPE text, COLUMN_TEXT text, COLUMN_IMAGE_URL text, COLUMN_URL text )");
    }

    public final List<QuickReply> getQuickReplies(SQLiteOpenHelper sQLiteOpenHelper, String str) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        z65.h(str, "messageUUID");
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery("select * from TABLE_QUICK_REPLIES where COLUMN_MESSAGE_UUID = ?", new String[]{str});
        try {
            if (rawQuery.getCount() == 0) {
                aa1.a(rawQuery, null);
                return arrayList;
            }
            rawQuery.moveToFirst();
            while (!rawQuery.isAfterLast()) {
                QuickReply quickReply = new QuickReply();
                Table.Companion companion = Table.Companion;
                z65.g(rawQuery, c.a);
                quickReply.setId(companion.cursorGetInt(rawQuery, "COLUMN_SERVER_ID"));
                quickReply.setType(companion.cursorGetString(rawQuery, "COLUMN_TYPE"));
                quickReply.setText(companion.cursorGetString(rawQuery, "COLUMN_TEXT"));
                quickReply.setImageUrl(companion.cursorGetString(rawQuery, "COLUMN_IMAGE_URL"));
                quickReply.setUrl(companion.cursorGetString(rawQuery, "COLUMN_URL"));
                arrayList.add(quickReply);
                rawQuery.moveToNext();
            }
            aa1.a(rawQuery, null);
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                aa1.a(rawQuery, th);
                throw th2;
            }
        }
    }

    public final void putQuickReplies(SQLiteOpenHelper sQLiteOpenHelper, String str, List<QuickReply> list) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        z65.h(str, "messageUUID");
        z65.h(list, "quickReplies");
        try {
            try {
                sQLiteOpenHelper.getWritableDatabase().beginTransaction();
                sQLiteOpenHelper.getWritableDatabase().execSQL("delete from TABLE_QUICK_REPLIES where COLUMN_MESSAGE_UUID = ? ", new String[]{str});
                for (QuickReply quickReply : list) {
                    putQuickReply(sQLiteOpenHelper, str, quickReply);
                }
                sQLiteOpenHelper.getWritableDatabase().setTransactionSuccessful();
            } catch (Exception e) {
                LoggerEdna.error("putQuickReplies", e);
            }
            sQLiteOpenHelper.getWritableDatabase().endTransaction();
        } catch (Throwable th) {
            sQLiteOpenHelper.getWritableDatabase().endTransaction();
            throw th;
        }
    }

    @Override // im.threads.business.secureDatabase.table.Table
    public void upgradeTable(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        z65.h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS TABLE_QUICK_REPLIES");
    }
}
