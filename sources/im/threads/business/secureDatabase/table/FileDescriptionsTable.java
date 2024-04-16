package im.threads.business.secureDatabase.table;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.hms.opendevice.c;
import im.threads.business.models.FileDescription;
import im.threads.business.models.enums.AttachmentStateEnum;
import im.threads.business.models.enums.ErrorStateEnum;
import im.threads.business.secureDatabase.table.Table;
import im.threads.business.utils.FileUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: FileDescriptionsTable.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J&\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bJ\u0016\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\fJ\u0016\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\fJ \u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¨\u0006\u001f"}, d2 = {"Lim/threads/business/secureDatabase/table/FileDescriptionsTable;", "Lim/threads/business/secureDatabase/table/Table;", "()V", "cleanTable", "", "sqlHelper", "Landroid/database/sqlite/SQLiteOpenHelper;", "createTable", "db", "Landroid/database/sqlite/SQLiteDatabase;", "getAllFileDescriptions", "", "Lim/threads/business/models/FileDescription;", "getCvFromFileDescription", "Landroid/content/ContentValues;", "fileDescription", "getFileDescription", "messageUuid", "", "putFileDescription", "fdMessageUuid", "isFromQuote", "", "putFileDescriptions", "fileDescriptions", "updateFileDescriptionByName", "updateFileDescriptionByUrl", "upgradeTable", "oldVersion", "", "newVersion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileDescriptionsTable extends Table {
    private final ContentValues getCvFromFileDescription(FileDescription fileDescription) {
        String str;
        ContentValues contentValues = new ContentValues();
        contentValues.put("COLUMN_FD_FROM", fileDescription.getFrom());
        if (fileDescription.getFileUri() != null) {
            str = String.valueOf(fileDescription.getFileUri());
        } else {
            str = null;
        }
        contentValues.put("COLUMN_FD_PATH", str);
        contentValues.put("COLUMN_URL", fileDescription.getDownloadPath());
        contentValues.put("COLUMN_FD_TIMESTAMP", Long.valueOf(fileDescription.getTimeStamp()));
        contentValues.put("COLUMN_FD_SIZE", Long.valueOf(fileDescription.getSize()));
        contentValues.put("COLUMN_FD_DOWNLOAD_PROGRESS", Integer.valueOf(fileDescription.getDownloadProgress()));
        contentValues.put("COLUMN_FD_FILENAME", fileDescription.getIncomingName());
        contentValues.put("COLUMN_FD_MIME_TYPE", fileDescription.getMimeType());
        contentValues.put("ATTACHMENT_STATE", fileDescription.getState().getState());
        contentValues.put("ERROR_CODE", fileDescription.getErrorCode().getState());
        contentValues.put("ERROR_MESSAGE", fileDescription.getErrorMessage());
        contentValues.put("COLUMN_LINK", fileDescription.getOfferLink());
        return contentValues;
    }

    @Override // im.threads.business.secureDatabase.table.Table
    public void cleanTable(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        sQLiteOpenHelper.getWritableDatabase().execSQL("delete from TABLE_FILE_DESCRIPTION");
    }

    @Override // im.threads.business.secureDatabase.table.Table
    public void createTable(SQLiteDatabase sQLiteDatabase) {
        z65.h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("CREATE TABLE TABLE_FILE_DESCRIPTION ( COLUMN_FD_FROM text, COLUMN_FD_PATH text, COLUMN_LINK text, COLUMN_FD_TIMESTAMP integer, COLUMN_FD_MESSAGE_UUID_EXT integer, COLUMN_URL text, COLUMN_FD_SIZE integer, COLUMN_FD_IS_FROM_QUOTE integer, COLUMN_FD_FILENAME text,COLUMN_FD_MIME_TYPE text,COLUMN_FD_DOWNLOAD_PROGRESS integer, ATTACHMENT_STATE text, ERROR_CODE text, ERROR_MESSAGE text )");
    }

    public final List<FileDescription> getAllFileDescriptions(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        pza pzaVar = pza.a;
        String format = String.format(Locale.US, "select * from %s order by %s desc", Arrays.copyOf(new Object[]{"TABLE_FILE_DESCRIPTION", "COLUMN_FD_TIMESTAMP"}, 2));
        z65.g(format, "format(locale, format, *args)");
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery(format, new String[0]);
        try {
            if (!rawQuery.moveToFirst()) {
                aa1.a(rawQuery, null);
                return arrayList;
            }
            rawQuery.moveToFirst();
            while (!rawQuery.isAfterLast()) {
                Table.Companion companion = Table.Companion;
                z65.g(rawQuery, c.a);
                FileDescription fileDescription = new FileDescription(companion.cursorGetString(rawQuery, "COLUMN_FD_FROM"), FileUtils.safeParse(companion.cursorGetString(rawQuery, "COLUMN_FD_PATH")), companion.cursorGetLong(rawQuery, "COLUMN_FD_SIZE"), companion.cursorGetLong(rawQuery, "COLUMN_FD_TIMESTAMP"));
                fileDescription.setDownloadProgress(companion.cursorGetInt(rawQuery, "COLUMN_FD_DOWNLOAD_PROGRESS"));
                fileDescription.setIncomingName(companion.cursorGetString(rawQuery, "COLUMN_FD_FILENAME"));
                fileDescription.setMimeType(companion.cursorGetString(rawQuery, "COLUMN_FD_MIME_TYPE"));
                fileDescription.setDownloadPath(companion.cursorGetString(rawQuery, "COLUMN_URL"));
                fileDescription.setState(AttachmentStateEnum.READY);
                String cursorGetString = companion.cursorGetString(rawQuery, "ATTACHMENT_STATE");
                if (cursorGetString != null) {
                    fileDescription.setState(AttachmentStateEnum.Companion.fromString(cursorGetString));
                }
                fileDescription.setErrorCode(ErrorStateEnum.ANY);
                String cursorGetString2 = companion.cursorGetString(rawQuery, "ERROR_CODE");
                if (cursorGetString2 != null) {
                    fileDescription.setErrorCode(ErrorStateEnum.Companion.errorStateEnumFromString(cursorGetString2));
                }
                fileDescription.setErrorMessage(companion.cursorGetString(rawQuery, "ERROR_MESSAGE"));
                fileDescription.setOfferLink(companion.cursorGetString(rawQuery, "COLUMN_LINK"));
                if (fileDescription.getFileUri() != null || fileDescription.getDownloadPath() != null) {
                    arrayList.add(fileDescription);
                }
                rawQuery.moveToNext();
            }
            aa1.a(rawQuery, null);
            return arrayList;
        } finally {
        }
    }

    public final FileDescription getFileDescription(SQLiteOpenHelper sQLiteOpenHelper, String str) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        if (str == null || str.length() == 0) {
            return null;
        }
        pza pzaVar = pza.a;
        String format = String.format(Locale.US, "select * from %s where %s = ?", Arrays.copyOf(new Object[]{"TABLE_FILE_DESCRIPTION", "COLUMN_FD_MESSAGE_UUID_EXT"}, 2));
        z65.g(format, "format(locale, format, *args)");
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery(format, new String[]{str});
        try {
            if (!rawQuery.moveToFirst()) {
                aa1.a(rawQuery, null);
                return null;
            }
            Table.Companion companion = Table.Companion;
            z65.g(rawQuery, c.a);
            FileDescription fileDescription = new FileDescription(companion.cursorGetString(rawQuery, "COLUMN_FD_FROM"), FileUtils.safeParse(companion.cursorGetString(rawQuery, "COLUMN_FD_PATH")), companion.cursorGetLong(rawQuery, "COLUMN_FD_SIZE"), companion.cursorGetLong(rawQuery, "COLUMN_FD_TIMESTAMP"));
            fileDescription.setDownloadProgress(companion.cursorGetInt(rawQuery, "COLUMN_FD_DOWNLOAD_PROGRESS"));
            fileDescription.setDownloadPath(companion.cursorGetString(rawQuery, "COLUMN_URL"));
            fileDescription.setIncomingName(companion.cursorGetString(rawQuery, "COLUMN_FD_FILENAME"));
            fileDescription.setMimeType(companion.cursorGetString(rawQuery, "COLUMN_FD_MIME_TYPE"));
            fileDescription.setState(AttachmentStateEnum.READY);
            String cursorGetString = companion.cursorGetString(rawQuery, "ATTACHMENT_STATE");
            if (cursorGetString != null) {
                fileDescription.setState(AttachmentStateEnum.Companion.fromString(cursorGetString));
            }
            fileDescription.setErrorCode(ErrorStateEnum.ANY);
            String cursorGetString2 = companion.cursorGetString(rawQuery, "ERROR_CODE");
            if (cursorGetString2 != null) {
                fileDescription.setErrorCode(ErrorStateEnum.Companion.errorStateEnumFromString(cursorGetString2));
            }
            fileDescription.setErrorMessage(companion.cursorGetString(rawQuery, "ERROR_MESSAGE"));
            fileDescription.setMimeType(companion.cursorGetString(rawQuery, "COLUMN_FD_MIME_TYPE"));
            fileDescription.setOfferLink(companion.cursorGetString(rawQuery, "COLUMN_LINK"));
            aa1.a(rawQuery, null);
            return fileDescription;
        } finally {
        }
    }

    public final void putFileDescription(SQLiteOpenHelper sQLiteOpenHelper, FileDescription fileDescription, String str, boolean z) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        z65.h(fileDescription, "fileDescription");
        z65.h(str, "fdMessageUuid");
        ContentValues contentValues = new ContentValues();
        contentValues.put("COLUMN_FD_MESSAGE_UUID_EXT", str);
        contentValues.put("COLUMN_FD_FROM", fileDescription.getFrom());
        if (fileDescription.getFileUri() != null) {
            contentValues.put("COLUMN_FD_PATH", String.valueOf(fileDescription.getFileUri()));
        }
        contentValues.put("COLUMN_URL", fileDescription.getDownloadPath());
        contentValues.put("COLUMN_FD_TIMESTAMP", Long.valueOf(fileDescription.getTimeStamp()));
        contentValues.put("COLUMN_FD_SIZE", Long.valueOf(fileDescription.getSize()));
        contentValues.put("COLUMN_FD_IS_FROM_QUOTE", Boolean.valueOf(z));
        contentValues.put("COLUMN_FD_FILENAME", fileDescription.getIncomingName());
        contentValues.put("COLUMN_FD_MIME_TYPE", fileDescription.getMimeType());
        contentValues.put("ATTACHMENT_STATE", fileDescription.getState().getState());
        contentValues.put("ERROR_CODE", fileDescription.getErrorCode().getState());
        contentValues.put("ERROR_MESSAGE", fileDescription.getErrorMessage());
        contentValues.put("COLUMN_LINK", fileDescription.getOfferLink());
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery("select COLUMN_FD_MESSAGE_UUID_EXT and COLUMN_FD_PATH from TABLE_FILE_DESCRIPTION where COLUMN_FD_MESSAGE_UUID_EXT = ?", new String[]{str});
        try {
            if (rawQuery.getCount() > 0) {
                rawQuery.moveToFirst();
                Table.Companion companion = Table.Companion;
                z65.g(rawQuery, c.a);
                String cursorGetString = companion.cursorGetString(rawQuery, "COLUMN_FD_PATH");
                if (cursorGetString != null) {
                    if (cursorGetString.length() == 0) {
                    }
                    sQLiteOpenHelper.getWritableDatabase().update("TABLE_FILE_DESCRIPTION", contentValues, "COLUMN_FD_MESSAGE_UUID_EXT = ? ", new String[]{str});
                }
                contentValues.put("COLUMN_FD_DOWNLOAD_PROGRESS", Integer.valueOf(fileDescription.getDownloadProgress()));
                sQLiteOpenHelper.getWritableDatabase().update("TABLE_FILE_DESCRIPTION", contentValues, "COLUMN_FD_MESSAGE_UUID_EXT = ? ", new String[]{str});
            } else {
                contentValues.put("COLUMN_FD_DOWNLOAD_PROGRESS", Integer.valueOf(fileDescription.getDownloadProgress()));
                sQLiteOpenHelper.getWritableDatabase().insert("TABLE_FILE_DESCRIPTION", null, contentValues);
            }
            aa1.a(rawQuery, null);
        } finally {
        }
    }

    public final void putFileDescriptions(SQLiteOpenHelper sQLiteOpenHelper, List<FileDescription> list) {
        String str;
        z65.h(sQLiteOpenHelper, "sqlHelper");
        z65.h(list, "fileDescriptions");
        for (FileDescription fileDescription : list) {
            if (fileDescription != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("COLUMN_FD_FROM", fileDescription.getFrom());
                if (fileDescription.getFileUri() != null) {
                    str = String.valueOf(fileDescription.getFileUri());
                } else {
                    str = null;
                }
                contentValues.put("COLUMN_FD_PATH", str);
                contentValues.put("COLUMN_URL", fileDescription.getDownloadPath());
                contentValues.put("COLUMN_FD_TIMESTAMP", Long.valueOf(fileDescription.getTimeStamp()));
                contentValues.put("COLUMN_FD_SIZE", Long.valueOf(fileDescription.getSize()));
                contentValues.put("COLUMN_FD_DOWNLOAD_PROGRESS", Integer.valueOf(fileDescription.getDownloadProgress()));
                contentValues.put("COLUMN_FD_FILENAME", fileDescription.getIncomingName());
                contentValues.put("COLUMN_FD_MIME_TYPE", fileDescription.getMimeType());
                contentValues.put("ATTACHMENT_STATE", fileDescription.getState().getState());
                contentValues.put("ERROR_CODE", fileDescription.getErrorCode().getState());
                contentValues.put("ERROR_MESSAGE", fileDescription.getErrorMessage());
                contentValues.put("COLUMN_LINK", fileDescription.getOfferLink());
                sQLiteOpenHelper.getWritableDatabase().update("TABLE_FILE_DESCRIPTION", contentValues, "COLUMN_FD_FILENAME like ? and COLUMN_URL like ?", new String[]{fileDescription.getIncomingName(), fileDescription.getDownloadPath()});
            }
        }
    }

    public final void updateFileDescriptionByName(SQLiteOpenHelper sQLiteOpenHelper, FileDescription fileDescription) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        z65.h(fileDescription, "fileDescription");
        sQLiteOpenHelper.getWritableDatabase().update("TABLE_FILE_DESCRIPTION", getCvFromFileDescription(fileDescription), "COLUMN_FD_FILENAME like ?", new String[]{fileDescription.getIncomingName()});
    }

    public final void updateFileDescriptionByUrl(SQLiteOpenHelper sQLiteOpenHelper, FileDescription fileDescription) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        z65.h(fileDescription, "fileDescription");
        sQLiteOpenHelper.getWritableDatabase().update("TABLE_FILE_DESCRIPTION", getCvFromFileDescription(fileDescription), "COLUMN_URL = ?", new String[]{fileDescription.getOriginalPath()});
    }

    @Override // im.threads.business.secureDatabase.table.Table
    public void upgradeTable(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        z65.h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS TABLE_FILE_DESCRIPTION");
    }
}
