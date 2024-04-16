package im.threads.business.database.table;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.huawei.hms.opendevice.c;
import im.threads.business.database.table.Table;
import im.threads.business.models.Quote;
import im.threads.business.models.enums.ModificationStateEnum;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: QuotesTable.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ \u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lim/threads/business/database/table/QuotesTable;", "Lim/threads/business/database/table/Table;", "fileDescriptionsTable", "Lim/threads/business/database/table/FileDescriptionsTable;", "(Lim/threads/business/database/table/FileDescriptionsTable;)V", "cleanTable", "", "sqlHelper", "Landroid/database/sqlite/SQLiteOpenHelper;", "createTable", "db", "Landroid/database/sqlite/SQLiteDatabase;", "getQuote", "Lim/threads/business/models/Quote;", "quotedByMessageUuid", "", "upgradeTable", "oldVersion", "", "newVersion", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuotesTable extends Table {
    private static final String COLUMN_MODIFICATION_STATE = "COLUMN_MODIFICATION_STATE";
    private static final String COLUMN_QUOTED_BY_MESSAGE_UUID_EXT = "COLUMN_QUOTED_BY_MESSAGE_UUID_EXT";
    private static final String COLUMN_QUOTE_BODY = "COLUMN_QUOTE_BODY";
    private static final String COLUMN_QUOTE_FROM = "COLUMN_QUOTE_HEADER";
    private static final String COLUMN_QUOTE_TIMESTAMP = "COLUMN_QUOTE_TIMESTAMP";
    private static final String COLUMN_QUOTE_UUID = "COLUMN_QUOTE_UUID";
    public static final Companion Companion = new Companion(null);
    private static final String TABLE_QUOTE = "TABLE_QUOTE";
    private final FileDescriptionsTable fileDescriptionsTable;

    /* compiled from: QuotesTable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lim/threads/business/database/table/QuotesTable$Companion;", "", "()V", QuotesTable.COLUMN_MODIFICATION_STATE, "", QuotesTable.COLUMN_QUOTED_BY_MESSAGE_UUID_EXT, QuotesTable.COLUMN_QUOTE_BODY, "COLUMN_QUOTE_FROM", QuotesTable.COLUMN_QUOTE_TIMESTAMP, QuotesTable.COLUMN_QUOTE_UUID, "TABLE_QUOTE", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    @Override // im.threads.business.database.table.Table
    public void cleanTable(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        sQLiteOpenHelper.getWritableDatabase().execSQL("delete from TABLE_QUOTE");
    }

    @Override // im.threads.business.database.table.Table
    public void createTable(SQLiteDatabase sQLiteDatabase) {
        z65.h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("CREATE TABLE TABLE_QUOTE(COLUMN_QUOTE_UUID text,COLUMN_QUOTE_HEADER text, COLUMN_QUOTE_BODY text, COLUMN_QUOTE_TIMESTAMP integer, COLUMN_QUOTED_BY_MESSAGE_UUID_EXT integer)");
    }

    public final Quote getQuote(SQLiteOpenHelper sQLiteOpenHelper, String str) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        pza pzaVar = pza.a;
        String format = String.format(Locale.US, "select * from %s where %s = ?", Arrays.copyOf(new Object[]{"TABLE_QUOTE", COLUMN_QUOTED_BY_MESSAGE_UUID_EXT}, 2));
        z65.g(format, "format(locale, format, *args)");
        Cursor rawQuery = sQLiteOpenHelper.getWritableDatabase().rawQuery(format, new String[]{str});
        try {
            if (rawQuery.moveToFirst()) {
                Table.Companion companion = Table.Companion;
                z65.g(rawQuery, c.a);
                Quote quote = new Quote(companion.cGetString(rawQuery, COLUMN_QUOTE_UUID), companion.cGetString(rawQuery, COLUMN_QUOTE_FROM), companion.cGetString(rawQuery, COLUMN_QUOTE_BODY), this.fileDescriptionsTable.getFileDescription(sQLiteOpenHelper, companion.cGetString(rawQuery, COLUMN_QUOTE_UUID)), companion.cGetLong(rawQuery, COLUMN_QUOTE_TIMESTAMP), ModificationStateEnum.Companion.fromString(companion.cGetString(rawQuery, COLUMN_MODIFICATION_STATE)));
                aa1.a(rawQuery, null);
                return quote;
            }
            Unit unit = Unit.a;
            aa1.a(rawQuery, null);
            return null;
        } finally {
        }
    }

    @Override // im.threads.business.database.table.Table
    public void upgradeTable(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        z65.h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS TABLE_QUOTE");
    }
}
