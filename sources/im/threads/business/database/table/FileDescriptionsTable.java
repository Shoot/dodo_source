package im.threads.business.database.table;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.huawei.hms.opendevice.c;
import im.threads.business.database.table.Table;
import im.threads.business.models.FileDescription;
import im.threads.business.models.enums.AttachmentStateEnum;
import im.threads.business.models.enums.ErrorStateEnum;
import im.threads.business.utils.FileUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FileDescriptionsTable.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ \u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¨\u0006\u0015"}, d2 = {"Lim/threads/business/database/table/FileDescriptionsTable;", "Lim/threads/business/database/table/Table;", "()V", "cleanTable", "", "sqlHelper", "Landroid/database/sqlite/SQLiteOpenHelper;", "createTable", "db", "Landroid/database/sqlite/SQLiteDatabase;", "getAllFileDescriptions", "", "Lim/threads/business/models/FileDescription;", "getFileDescription", "messageUuid", "", "upgradeTable", "oldVersion", "", "newVersion", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileDescriptionsTable extends Table {
    private static final String COLUMN_FD_ATTACHMENT_STATE = "ATTACHMENT_STATE";
    private static final String COLUMN_FD_DOWNLOAD_PROGRESS = "COLUMN_FD_DOWNLOAD_PROGRESS";
    private static final String COLUMN_FD_ERROR_CODE = "ERROR_CODE";
    private static final String COLUMN_FD_ERROR_MESSAGE = "ERROR_MESSAGE";
    private static final String COLUMN_FD_FILENAME = "COLUMN_FD_FILENAME";
    private static final String COLUMN_FD_FROM = "COLUMN_FD_FROM";
    private static final String COLUMN_FD_IS_FROM_QUOTE = "COLUMN_FD_IS_FROM_QUOTE";
    private static final String COLUMN_FD_MESSAGE_UUID_EXT = "COLUMN_FD_MESSAGE_UUID_EXT";
    private static final String COLUMN_FD_MIME_TYPE = "COLUMN_FD_MIME_TYPE";
    private static final String COLUMN_FD_PATH = "COLUMN_FD_PATH";
    private static final String COLUMN_FD_SIZE = "COLUMN_FD_SIZE";
    private static final String COLUMN_FD_TIMESTAMP = "COLUMN_FD_TIMESTAMP";
    private static final String COLUMN_FD_URL = "COLUMN_URL";
    public static final Companion Companion = new Companion(null);
    private static final String TABLE_FILE_DESCRIPTION = "TABLE_FILE_DESCRIPTION";

    /* compiled from: FileDescriptionsTable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lim/threads/business/database/table/FileDescriptionsTable$Companion;", "", "()V", "COLUMN_FD_ATTACHMENT_STATE", "", FileDescriptionsTable.COLUMN_FD_DOWNLOAD_PROGRESS, "COLUMN_FD_ERROR_CODE", "COLUMN_FD_ERROR_MESSAGE", FileDescriptionsTable.COLUMN_FD_FILENAME, FileDescriptionsTable.COLUMN_FD_FROM, FileDescriptionsTable.COLUMN_FD_IS_FROM_QUOTE, FileDescriptionsTable.COLUMN_FD_MESSAGE_UUID_EXT, FileDescriptionsTable.COLUMN_FD_MIME_TYPE, FileDescriptionsTable.COLUMN_FD_PATH, FileDescriptionsTable.COLUMN_FD_SIZE, FileDescriptionsTable.COLUMN_FD_TIMESTAMP, "COLUMN_FD_URL", FileDescriptionsTable.TABLE_FILE_DESCRIPTION, "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
        sQLiteOpenHelper.getWritableDatabase().execSQL("delete from TABLE_FILE_DESCRIPTION");
    }

    @Override // im.threads.business.database.table.Table
    public void createTable(SQLiteDatabase sQLiteDatabase) {
        z65.h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("CREATE TABLE TABLE_FILE_DESCRIPTION ( COLUMN_FD_FROM text, COLUMN_FD_PATH text, COLUMN_FD_TIMESTAMP integer, COLUMN_FD_MESSAGE_UUID_EXT integer, COLUMN_URL text, COLUMN_FD_SIZE integer, COLUMN_FD_IS_FROM_QUOTE integer, COLUMN_FD_FILENAME text,COLUMN_FD_MIME_TYPE text,COLUMN_FD_DOWNLOAD_PROGRESS integer, ATTACHMENT_STATE text, ERROR_CODE text, ERROR_MESSAGE text )");
    }

    public final List<FileDescription> getAllFileDescriptions(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        pza pzaVar = pza.a;
        String format = String.format(Locale.US, "select * from %s order by %s desc", Arrays.copyOf(new Object[]{TABLE_FILE_DESCRIPTION, COLUMN_FD_TIMESTAMP}, 2));
        z65.g(format, "format(locale, format, *args)");
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = sQLiteOpenHelper.getWritableDatabase().rawQuery(format, new String[0]);
        try {
            if (!rawQuery.moveToFirst()) {
                aa1.a(rawQuery, null);
                return arrayList;
            }
            rawQuery.moveToFirst();
            while (!rawQuery.isAfterLast()) {
                Table.Companion companion = Table.Companion;
                z65.g(rawQuery, c.a);
                FileDescription fileDescription = new FileDescription(companion.cGetString(rawQuery, COLUMN_FD_FROM), FileUtils.safeParse(companion.cGetString(rawQuery, COLUMN_FD_PATH)), companion.cGetLong(rawQuery, COLUMN_FD_SIZE), companion.cGetLong(rawQuery, COLUMN_FD_TIMESTAMP));
                fileDescription.setDownloadProgress(companion.cGetInt(rawQuery, COLUMN_FD_DOWNLOAD_PROGRESS));
                fileDescription.setIncomingName(companion.cGetString(rawQuery, COLUMN_FD_FILENAME));
                fileDescription.setMimeType(companion.cGetString(rawQuery, COLUMN_FD_MIME_TYPE));
                fileDescription.setDownloadPath(companion.cGetString(rawQuery, COLUMN_FD_URL));
                AttachmentStateEnum.Companion companion2 = AttachmentStateEnum.Companion;
                String cGetString = companion.cGetString(rawQuery, COLUMN_FD_ATTACHMENT_STATE);
                z65.e(cGetString);
                fileDescription.setState(companion2.fromString(cGetString));
                ErrorStateEnum.Companion companion3 = ErrorStateEnum.Companion;
                String cGetString2 = companion.cGetString(rawQuery, COLUMN_FD_ERROR_CODE);
                z65.e(cGetString2);
                fileDescription.setErrorCode(companion3.errorStateEnumFromString(cGetString2));
                fileDescription.setErrorMessage(companion.cGetString(rawQuery, COLUMN_FD_ERROR_MESSAGE));
                arrayList.add(fileDescription);
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

    public final FileDescription getFileDescription(SQLiteOpenHelper sQLiteOpenHelper, String str) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        pza pzaVar = pza.a;
        String format = String.format(Locale.US, "select * from %s where %s = ?", Arrays.copyOf(new Object[]{TABLE_FILE_DESCRIPTION, COLUMN_FD_MESSAGE_UUID_EXT}, 2));
        z65.g(format, "format(locale, format, *args)");
        Cursor rawQuery = sQLiteOpenHelper.getWritableDatabase().rawQuery(format, new String[]{str});
        try {
            if (!rawQuery.moveToFirst()) {
                aa1.a(rawQuery, null);
                return null;
            }
            Table.Companion companion = Table.Companion;
            z65.g(rawQuery, c.a);
            FileDescription fileDescription = new FileDescription(companion.cGetString(rawQuery, COLUMN_FD_FROM), FileUtils.safeParse(companion.cGetString(rawQuery, COLUMN_FD_PATH)), companion.cGetLong(rawQuery, COLUMN_FD_SIZE), companion.cGetLong(rawQuery, COLUMN_FD_TIMESTAMP));
            fileDescription.setDownloadProgress(companion.cGetInt(rawQuery, COLUMN_FD_DOWNLOAD_PROGRESS));
            fileDescription.setDownloadPath(companion.cGetString(rawQuery, COLUMN_FD_URL));
            fileDescription.setIncomingName(companion.cGetString(rawQuery, COLUMN_FD_FILENAME));
            fileDescription.setMimeType(companion.cGetString(rawQuery, COLUMN_FD_MIME_TYPE));
            AttachmentStateEnum.Companion companion2 = AttachmentStateEnum.Companion;
            String cGetString = companion.cGetString(rawQuery, COLUMN_FD_ATTACHMENT_STATE);
            z65.e(cGetString);
            fileDescription.setState(companion2.fromString(cGetString));
            ErrorStateEnum.Companion companion3 = ErrorStateEnum.Companion;
            String cGetString2 = companion.cGetString(rawQuery, COLUMN_FD_ERROR_CODE);
            z65.e(cGetString2);
            fileDescription.setErrorCode(companion3.errorStateEnumFromString(cGetString2));
            fileDescription.setErrorMessage(companion.cGetString(rawQuery, COLUMN_FD_ERROR_MESSAGE));
            fileDescription.setMimeType(companion.cGetString(rawQuery, COLUMN_FD_MIME_TYPE));
            aa1.a(rawQuery, null);
            return fileDescription;
        } finally {
        }
    }

    @Override // im.threads.business.database.table.Table
    public void upgradeTable(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        z65.h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS TABLE_FILE_DESCRIPTION");
    }
}
