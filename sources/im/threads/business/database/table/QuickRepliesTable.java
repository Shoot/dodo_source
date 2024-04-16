package im.threads.business.database.table;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.hms.opendevice.c;
import im.threads.business.database.table.Table;
import im.threads.business.models.QuickReply;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: QuickRepliesTable.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ \u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¨\u0006\u0014"}, d2 = {"Lim/threads/business/database/table/QuickRepliesTable;", "Lim/threads/business/database/table/Table;", "()V", "cleanTable", "", "sqlHelper", "Landroid/database/sqlite/SQLiteOpenHelper;", "createTable", "db", "Landroid/database/sqlite/SQLiteDatabase;", "getQuickReplies", "", "Lim/threads/business/models/QuickReply;", "messageUUID", "", "upgradeTable", "oldVersion", "", "newVersion", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuickRepliesTable extends Table {
    private static final String COLUMN_QUICK_REPLIES_ID = "COLUMN_ID";
    private static final String COLUMN_QUICK_REPLIES_IMAGE_URL = "COLUMN_IMAGE_URL";
    private static final String COLUMN_QUICK_REPLIES_MESSAGE_UUID = "COLUMN_MESSAGE_UUID";
    private static final String COLUMN_QUICK_REPLIES_SERVER_ID = "COLUMN_SERVER_ID";
    private static final String COLUMN_QUICK_REPLIES_TEXT = "COLUMN_TEXT";
    private static final String COLUMN_QUICK_REPLIES_TYPE = "COLUMN_TYPE";
    private static final String COLUMN_QUICK_REPLIES_URL = "COLUMN_URL";
    public static final Companion Companion = new Companion(null);
    private static final String TABLE_QUICK_REPLIES = "TABLE_QUICK_REPLIES";

    /* compiled from: QuickRepliesTable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lim/threads/business/database/table/QuickRepliesTable$Companion;", "", "()V", "COLUMN_QUICK_REPLIES_ID", "", "COLUMN_QUICK_REPLIES_IMAGE_URL", "COLUMN_QUICK_REPLIES_MESSAGE_UUID", "COLUMN_QUICK_REPLIES_SERVER_ID", "COLUMN_QUICK_REPLIES_TEXT", "COLUMN_QUICK_REPLIES_TYPE", "COLUMN_QUICK_REPLIES_URL", QuickRepliesTable.TABLE_QUICK_REPLIES, "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // im.threads.business.database.table.Table
    public void cleanTable(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        sQLiteOpenHelper.getWritableDatabase().execSQL("delete from TABLE_QUICK_REPLIES");
    }

    @Override // im.threads.business.database.table.Table
    public void createTable(SQLiteDatabase sQLiteDatabase) {
        z65.h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("CREATE TABLE TABLE_QUICK_REPLIES(COLUMN_ID integer primary key autoincrement, COLUMN_SERVER_ID integer, COLUMN_MESSAGE_UUID string, COLUMN_TYPE text, COLUMN_TEXT text, COLUMN_IMAGE_URL text, COLUMN_URL text )");
    }

    public final List<QuickReply> getQuickReplies(SQLiteOpenHelper sQLiteOpenHelper, String str) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = sQLiteOpenHelper.getWritableDatabase().rawQuery("select * from TABLE_QUICK_REPLIES where COLUMN_MESSAGE_UUID = ?", new String[]{str});
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
                quickReply.setId(companion.cGetInt(rawQuery, COLUMN_QUICK_REPLIES_SERVER_ID));
                quickReply.setType(companion.cGetString(rawQuery, COLUMN_QUICK_REPLIES_TYPE));
                quickReply.setText(companion.cGetString(rawQuery, COLUMN_QUICK_REPLIES_TEXT));
                quickReply.setImageUrl(companion.cGetString(rawQuery, COLUMN_QUICK_REPLIES_IMAGE_URL));
                quickReply.setUrl(companion.cGetString(rawQuery, COLUMN_QUICK_REPLIES_URL));
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

    @Override // im.threads.business.database.table.Table
    public void upgradeTable(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        z65.h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS TABLE_QUICK_REPLIES");
    }
}
