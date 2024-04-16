package com.dodopizza.kustoworker;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import ch.qos.logback.core.CoreConstants;
import com.dodopizza.kustoworker.CommonUtils;
import com.google.gson.Gson;
import com.google.gson.a;
import com.google.gson.reflect.TypeToken;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
/* compiled from: KustoStorage.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J \u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014H\u0016J\u0014\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011J\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0012J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\tH\u0002J\u001c\u0010#\u001a\u00020\u000b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\rH\u0002R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/dodopizza/kustoworker/KustoStorage;", "Landroid/database/sqlite/SQLiteOpenHelper;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "deserializeDate", "Ljava/util/Date;", "dateString", "", "deserializeParams", "", "", "serializedParams", "getMessages", "", "Lcom/dodopizza/kustoworker/KustoMessage;", "limit", "", "onCreate", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "oldVersion", "newVersion", "removeMessages", "Lcom/dodopizza/kustoworker/CommonUtils$Done;", "ids", "saveMessage", "kustoMessage", "serializeDate", "date", "serializeParams", "params", "KustoTable", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class KustoStorage extends SQLiteOpenHelper {
    private final Gson gson;

    /* compiled from: KustoStorage.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/kustoworker/KustoStorage$KustoTable;", "Landroid/provider/BaseColumns;", "()V", "COLUMN_CREATED_AT", "", "COLUMN_ID", "COLUMN_SOURCE", "CREATE_TABLE", "DATABASE_VERSION", "", "DATE_COLUMN_FORMAT", "Ljava/text/SimpleDateFormat;", "getDATE_COLUMN_FORMAT", "()Ljava/text/SimpleDateFormat;", "setDATE_COLUMN_FORMAT", "(Ljava/text/SimpleDateFormat;)V", "TABLE_NAME", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class KustoTable implements BaseColumns {
        public static final String COLUMN_CREATED_AT = "created_at";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_SOURCE = "source";
        public static final String CREATE_TABLE = "CREATE TABLE kusto (id TEXT PRIMARY KEY, created_at TEXT, source TEXT );";
        public static final int DATABASE_VERSION = 1;
        public static final String TABLE_NAME = "kusto";
        public static final KustoTable INSTANCE = new KustoTable();
        private static SimpleDateFormat DATE_COLUMN_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());

        private KustoTable() {
        }

        public final SimpleDateFormat getDATE_COLUMN_FORMAT() {
            return DATE_COLUMN_FORMAT;
        }

        public final void setDATE_COLUMN_FORMAT(SimpleDateFormat simpleDateFormat) {
            z65.h(simpleDateFormat, "<set-?>");
            DATE_COLUMN_FORMAT = simpleDateFormat;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KustoStorage(Context context) {
        super(context, KustoTable.TABLE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.gson = new a().b();
    }

    private final Date deserializeDate(String str) {
        Date parse = KustoTable.INSTANCE.getDATE_COLUMN_FORMAT().parse(str);
        z65.g(parse, "DATE_COLUMN_FORMAT.parse(dateString)");
        return parse;
    }

    private final Map<String, Object> deserializeParams(String str) {
        Object l = this.gson.l(str, new TypeToken<Map<String, ? extends Object>>() { // from class: com.dodopizza.kustoworker.KustoStorage$deserializeParams$1
        }.getType());
        z65.g(l, "gson.fromJson(\n      ser…ng, Any>>() {}.type\n    )");
        return (Map) l;
    }

    private final String serializeDate(Date date) {
        String format = KustoTable.INSTANCE.getDATE_COLUMN_FORMAT().format(date);
        z65.g(format, "DATE_COLUMN_FORMAT.format(date)");
        return format;
    }

    private final String serializeParams(Map<String, ? extends Object> map) {
        String u = this.gson.u(map, new TypeToken<Map<String, ? extends Object>>() { // from class: com.dodopizza.kustoworker.KustoStorage$serializeParams$1
        }.getType());
        z65.g(u, "gson.toJson(\n      param…ng, Any>>() {}.type\n    )");
        return u;
    }

    public final List<KustoMessage> getMessages(int i) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  * FROM kusto", null);
        try {
            ArrayList arrayList = new ArrayList();
            if (rawQuery.moveToFirst()) {
                do {
                    String string = rawQuery.getString(0);
                    String string2 = rawQuery.getString(1);
                    z65.g(string2, "cursor.getString(1)");
                    Date deserializeDate = deserializeDate(string2);
                    String string3 = rawQuery.getString(2);
                    z65.g(string3, "cursor.getString(2)");
                    Map<String, Object> deserializeParams = deserializeParams(string3);
                    z65.g(string, "id");
                    arrayList.add(new KustoMessage(new KustoMessageMeta(string, deserializeDate), deserializeParams));
                    if (!rawQuery.moveToNext()) {
                        break;
                    }
                } while (1 < i);
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

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        z65.h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL(KustoTable.CREATE_TABLE);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        z65.h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS kusto");
        onCreate(sQLiteDatabase);
    }

    public final CommonUtils.Done removeMessages(List<String> list) {
        String i0;
        z65.h(list, "ids");
        SQLiteDatabase writableDatabase = getWritableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append("id IN (");
        i0 = sc1.i0(new IntRange(0, list.size()), null, null, null, 0, null, KustoStorage$removeMessages$1$statement$1.INSTANCE, 31, null);
        sb.append(i0);
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb2 = sb.toString();
        Object[] array = list.toArray(new String[0]);
        if (array != null) {
            writableDatabase.delete(KustoTable.TABLE_NAME, sb2, (String[]) array);
            return CommonUtils.Done.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final CommonUtils.Done saveMessage(KustoMessage kustoMessage) {
        z65.h(kustoMessage, "kustoMessage");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", kustoMessage.getMeta().getId());
        contentValues.put(KustoTable.COLUMN_CREATED_AT, serializeDate(kustoMessage.getMeta().getCreatedAt()));
        contentValues.put(KustoTable.COLUMN_SOURCE, serializeParams(kustoMessage.getData()));
        getWritableDatabase().replace(KustoTable.TABLE_NAME, null, contentValues);
        return CommonUtils.Done.INSTANCE;
    }
}
