package im.threads.business.utils;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import im.threads.R;
import im.threads.business.config.BaseConfig;
import im.threads.business.imageLoading.ImageLoader;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.CampaignMessage;
import im.threads.business.models.FileDescription;
import im.threads.business.models.Quote;
import im.threads.business.models.UpcomingUserMessage;
import im.threads.business.secureDatabase.DatabaseHolder;
import im.threads.business.utils.FileUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: FileUtils.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0007J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\b\u001bJ\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0018H\u0002J\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0011H\u0007J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u000bH\u0002J\u0017\u0010\"\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\b$J\u0012\u0010%\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u001c\u0010&\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0010\u0010'\u001a\u00020(2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u001a\u0010)\u001a\u00020(2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0010\u0010*\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010*\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010+\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002JB\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110-2\b\u00100\u001a\u0004\u0018\u00010\u000b2\u0006\u00101\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0007J\u0010\u00106\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0018H\u0002J\u0012\u00107\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0007J\u001f\u00108\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0002\b9J\u0012\u0010:\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0007J\u0012\u0010;\u001a\u00020<2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0007J\u0014\u0010=\u001a\u0004\u0018\u00010\u00112\b\u0010>\u001a\u0004\u0018\u00010\u000bH\u0007J\u001a\u0010?\u001a\u00020<2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010@\u001a\u00020\u0015H\u0002J\u0010\u0010A\u001a\u00020<2\u0006\u0010\u001d\u001a\u00020\u0018H\u0007J\u001c\u0010B\u001a\u00020<2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010C\u001a\u0004\u0018\u00010\u0011H\u0002J\u0015\u0010D\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\bER\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006F²\u0006\n\u0010G\u001a\u00020HX\u008a\u0084\u0002"}, d2 = {"Lim/threads/business/utils/FileUtils;", "", "()V", "AUDIO", "", "JPEG", "OTHER_DOC_FORMATS", "PDF", "PNG", GrsBaseInfo.CountryCodeSource.UNKNOWN, "UNKNOWN_MIME_TYPE", "", "canBeSent", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "convertRelativeUrlToAbsolute", "relativeUrl", "createImageFile", "Ljava/io/File;", "generateFileName", "fd", "Lim/threads/business/models/FileDescription;", "generatePreviewFileName", "fileName", "generatePreviewFileName$threads_release", "getExtensionFromFileDescription", "fileDescription", "getExtensionFromMediaStore", "contentUri", "getExtensionFromMimeType", "mimeType", "getExtensionFromPath", "path", "getExtensionFromPath$threads_release", "getFileName", "getFileNameFromMediaStore", "getFileSize", "", "getFileSizeFromMediaStore", "getMimeType", "getNameByString", "getUpcomingUserMessagesFromSelection", "", "Lim/threads/business/models/UpcomingUserMessage;", "uris", "inputText", "fileDescriptionText", "campaignMessage", "Lim/threads/business/models/CampaignMessage;", "quote", "Lim/threads/business/models/Quote;", "isFileCorrupted", "isImage", "isPreviewFileExist", "isPreviewFileExist$threads_release", "isVoiceMessage", "removeFileIfCorrupted", "", "safeParse", KustoStorage.KustoTable.COLUMN_SOURCE, "saveImageToFile", "outputFile", "saveToDownloads", "saveToUri", "outputUri", "toAbsoluteUrl", "toAbsoluteUrl$threads_release", "threads_release", "database", "Lim/threads/business/secureDatabase/DatabaseHolder;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileUtils {
    private static final int AUDIO = 3;
    public static final FileUtils INSTANCE = new FileUtils();
    public static final int JPEG = 0;
    private static final int OTHER_DOC_FORMATS = 4;
    private static final int PDF = 2;
    private static final int PNG = 1;
    public static final int UNKNOWN = -1;
    private static final String UNKNOWN_MIME_TYPE = "*/*";

    private FileUtils() {
    }

    public static final boolean canBeSent(Context context, Uri uri) {
        boolean z;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(uri, "uri");
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null && openInputStream.read() != -1) {
                z = true;
            } else {
                z = false;
            }
            aa1.a(openInputStream, null);
            return z;
        } catch (IOException e) {
            LoggerEdna.error("file can't be sent. " + e);
            return false;
        }
    }

    public static final String convertRelativeUrlToAbsolute(String str) {
        boolean J;
        String str2;
        boolean u;
        if (!TextUtils.isEmpty(str)) {
            z65.e(str);
            J = l0b.J(str, "http", false, 2, null);
            if (!J) {
                String datastoreUrl = BaseConfig.Companion.getInstance().getDatastoreUrl();
                if (datastoreUrl != null) {
                    u = l0b.u(datastoreUrl, "/", false, 2, null);
                    if (u) {
                        str2 = datastoreUrl + "files";
                        return str2 + "/" + str;
                    }
                }
                str2 = datastoreUrl + "/files";
                return str2 + "/" + str;
            }
            return str;
        }
        return str;
    }

    public static final File createImageFile(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        long currentTimeMillis = System.currentTimeMillis();
        File file = new File(context.getFilesDir(), "thr" + currentTimeMillis + ".jpg");
        String absolutePath = file.getAbsolutePath();
        LoggerEdna.debug("File genereated into filesDir : " + absolutePath);
        return file;
    }

    public static final String generateFileName(FileDescription fileDescription) {
        Object obj;
        byte[] bArr;
        z65.h(fileDescription, "fd");
        if (fileDescription.getDownloadPath() != null) {
            String downloadPath = fileDescription.getDownloadPath();
            if (downloadPath != null) {
                bArr = downloadPath.getBytes(rw0.b);
                z65.g(bArr, "this as java.lang.String).getBytes(charset)");
            } else {
                bArr = null;
            }
            obj = UUID.nameUUIDFromBytes(bArr);
        } else {
            obj = "";
        }
        String incomingName = fileDescription.getIncomingName();
        if (incomingName == null) {
            incomingName = getFileName(fileDescription.getFileUri());
        }
        return obj + "_" + incomingName;
    }

    private final int getExtensionFromFileDescription(FileDescription fileDescription) {
        int extensionFromMimeType;
        String mimeType = getMimeType(fileDescription);
        if (!z65.c(mimeType, UNKNOWN_MIME_TYPE) && (extensionFromMimeType = getExtensionFromMimeType(mimeType)) != -1) {
            return extensionFromMimeType;
        }
        int extensionFromPath$threads_release = getExtensionFromPath$threads_release(fileDescription.getIncomingName());
        if (extensionFromPath$threads_release == -1) {
            return getExtensionFromPath$threads_release(fileDescription.getDownloadPath());
        }
        return extensionFromPath$threads_release;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String getExtensionFromMediaStore(android.content.Context r12, android.net.Uri r13) {
        /*
            r0 = 0
            if (r13 == 0) goto L5c
            if (r12 != 0) goto L6
            goto L5c
        L6:
            im.threads.business.utils.FileUtils r1 = im.threads.business.utils.FileUtils.INSTANCE
            java.lang.String r12 = r1.getFileNameFromMediaStore(r12, r13)
            java.lang.String r1 = "this as java.lang.String).substring(startIndex)"
            r8 = 2
            r9 = 0
            java.lang.String r10 = "."
            r11 = 1
            if (r12 == 0) goto L30
            boolean r2 = defpackage.c0b.O(r12, r10, r9, r8, r0)
            if (r2 != 0) goto L1c
            goto L30
        L1c:
            java.lang.String r3 = "."
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r12
            int r2 = defpackage.c0b.e0(r2, r3, r4, r5, r6, r7)
            int r2 = r2 + r11
            java.lang.String r12 = r12.substring(r2)
            defpackage.z65.g(r12, r1)
            goto L31
        L30:
            r12 = r0
        L31:
            if (r12 == 0) goto L35
            r0 = r12
            goto L5c
        L35:
            java.lang.String r12 = r13.getPath()
            if (r12 != 0) goto L3d
            java.lang.String r12 = ""
        L3d:
            int r13 = r12.length()
            if (r13 <= r11) goto L5c
            boolean r13 = defpackage.c0b.O(r12, r10, r9, r8, r0)
            if (r13 == 0) goto L5c
            java.lang.String r3 = "."
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r12
            int r13 = defpackage.c0b.e0(r2, r3, r4, r5, r6, r7)
            int r13 = r13 + r11
            java.lang.String r0 = r12.substring(r13)
            defpackage.z65.g(r0, r1)
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.utils.FileUtils.getExtensionFromMediaStore(android.content.Context, android.net.Uri):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0061 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int getExtensionFromMimeType(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1653115602: goto L71;
                case -1506009513: goto L6e;
                case -1487394660: goto L63;
                case -1248335792: goto L58;
                case -1248334925: goto L4d;
                case -1050893613: goto L4a;
                case -879258763: goto L3f;
                case -586683234: goto L36;
                case -366307023: goto L33;
                case 187091926: goto L2a;
                case 187099443: goto L21;
                case 817335912: goto L1e;
                case 904647503: goto L1b;
                case 1505115538: goto L11;
                case 1993842850: goto La;
                default: goto L8;
            }
        L8:
            goto L74
        La:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
        Lc:
            r3.equals(r0)
            goto L74
        L11:
            java.lang.String r0 = "audio/wave"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L61
            goto L74
        L1b:
            java.lang.String r0 = "application/msword"
            goto Lc
        L1e:
            java.lang.String r0 = "text/plain"
            goto Lc
        L21:
            java.lang.String r0 = "audio/wav"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L61
            goto L74
        L2a:
            java.lang.String r0 = "audio/ogg"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L61
            goto L74
        L33:
            java.lang.String r0 = "application/vnd.ms-excel"
            goto Lc
        L36:
            java.lang.String r0 = "audio/x-wav"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L61
            goto L74
        L3f:
            java.lang.String r0 = "image/png"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L48
            goto L74
        L48:
            r1 = 1
            goto L74
        L4a:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            goto Lc
        L4d:
            java.lang.String r0 = "application/pdf"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L56
            goto L74
        L56:
            r1 = 2
            goto L74
        L58:
            java.lang.String r0 = "application/ogg"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L61
            goto L74
        L61:
            r1 = 3
            goto L74
        L63:
            java.lang.String r0 = "image/jpeg"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6c
            goto L74
        L6c:
            r1 = 0
            goto L74
        L6e:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.template"
            goto Lc
        L71:
            java.lang.String r0 = "application/vnd.ms-excel.sheet.macroenabled.12"
            goto Lc
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.utils.FileUtils.getExtensionFromMimeType(java.lang.String):int");
    }

    public static final String getFileName(Uri uri) {
        String nameByString;
        if (uri != null) {
            try {
                Cursor query = BaseConfig.Companion.getInstance().context.getContentResolver().query(uri, null, null, null, null);
                if (query != null && query.moveToFirst()) {
                    int columnIndex = query.getColumnIndex("_display_name");
                    if (columnIndex >= 0) {
                        nameByString = query.getString(columnIndex);
                    } else {
                        nameByString = "";
                    }
                    z65.g(nameByString, "{\n                      …                        }");
                } else {
                    nameByString = INSTANCE.getNameByString(uri);
                }
                aa1.a(query, null);
                return nameByString;
            } catch (Exception unused) {
                INSTANCE.getNameByString(uri);
            }
        }
        UUID randomUUID = UUID.randomUUID();
        return "threads" + randomUUID;
    }

    public static final long getFileSize(Uri uri) {
        long j;
        z65.h(uri, "uri");
        try {
            Cursor query = BaseConfig.Companion.getInstance().context.getContentResolver().query(uri, null, null, null, null);
            if (query != null && query.moveToFirst()) {
                int columnIndex = query.getColumnIndex("_size");
                if (columnIndex >= 0) {
                    j = query.getLong(columnIndex);
                } else {
                    j = 0;
                }
                aa1.a(query, null);
                return j;
            }
            Unit unit = Unit.a;
            aa1.a(query, null);
            return 0L;
        } catch (Exception unused) {
            return 0L;
        }
    }

    @SuppressLint({"NewApi"})
    public static final long getFileSizeFromMediaStore(Context context, Uri uri) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        ContentResolver contentResolver = context.getContentResolver();
        z65.e(uri);
        Cursor query = contentResolver.query(uri, null, null, null, null);
        if (query == null) {
            aa1.a(query, null);
            return 0L;
        }
        try {
            int columnIndex = query.getColumnIndex("_size");
            query.moveToFirst();
            long j = query.getLong(columnIndex);
            aa1.a(query, null);
            return j;
        } finally {
        }
    }

    public static final String getMimeType(FileDescription fileDescription) {
        boolean y;
        z65.h(fileDescription, "fd");
        String mimeType = fileDescription.getMimeType();
        if (mimeType != null) {
            y = l0b.y(mimeType);
            if (!y) {
                String mimeType2 = fileDescription.getMimeType();
                return mimeType2 == null ? "" : mimeType2;
            }
        }
        if (fileDescription.getFileUri() != null) {
            Uri fileUri = fileDescription.getFileUri();
            z65.e(fileUri);
            return getMimeType(fileUri);
        }
        return UNKNOWN_MIME_TYPE;
    }

    private final String getNameByString(Uri uri) {
        int e0;
        int Z;
        int e02;
        try {
            String uri2 = uri.toString();
            z65.g(uri2, "uri.toString()");
            e0 = m0b.e0(uri2, "/", 0, false, 6, null);
            String substring = uri2.substring(e0 + 1);
            z65.g(substring, "this as java.lang.String).substring(startIndex)");
            Z = m0b.Z(substring, ".", 0, false, 6, null);
            if (Z > 0) {
                e02 = m0b.e0(substring, ".", 0, false, 6, null);
                String substring2 = substring.substring(0, e02);
                z65.g(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring2;
            }
            return substring;
        } catch (Exception unused) {
            UUID randomUUID = UUID.randomUUID();
            return "threads" + randomUUID;
        }
    }

    public static final List<UpcomingUserMessage> getUpcomingUserMessagesFromSelection(List<? extends Uri> list, String str, String str2, CampaignMessage campaignMessage, Quote quote) {
        String str3;
        boolean z;
        int i;
        boolean z2;
        z65.h(list, "uris");
        z65.h(str2, "fileDescriptionText");
        ArrayList arrayList = new ArrayList();
        Uri uri = list.get(0);
        FileDescription fileDescription = new FileDescription(str2, uri, getFileSize(uri), System.currentTimeMillis());
        if (str != null) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z3 = false;
            while (i2 <= length) {
                if (!z3) {
                    i = i2;
                } else {
                    i = length;
                }
                if (z65.j(str.charAt(i), 32) <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z3) {
                    if (!z2) {
                        z3 = true;
                    } else {
                        i2++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            str3 = str.subSequence(i2, length + 1).toString();
        } else {
            str3 = null;
        }
        String str4 = str3;
        if (str != null) {
            z = ClibpboardExtensionsKt.isLastCopyText(str);
        } else {
            z = false;
        }
        arrayList.add(new UpcomingUserMessage(fileDescription, campaignMessage, quote, str4, z));
        int size = list.size();
        for (int i3 = 1; i3 < size; i3++) {
            Uri uri2 = list.get(i3);
            arrayList.add(new UpcomingUserMessage(new FileDescription(str2, uri2, getFileSize(uri2), System.currentTimeMillis()), null, null, null, false));
        }
        return arrayList;
    }

    private final boolean isFileCorrupted(FileDescription fileDescription) {
        long j;
        Uri fileUri = fileDescription.getFileUri();
        if (fileUri != null) {
            j = getFileSize(fileUri);
        } else {
            j = 0;
        }
        if (fileDescription.getSize() != j) {
            return true;
        }
        return false;
    }

    public static final boolean isImage(FileDescription fileDescription) {
        if (fileDescription != null) {
            FileUtils fileUtils = INSTANCE;
            if (fileUtils.getExtensionFromFileDescription(fileDescription) == 0 || fileUtils.getExtensionFromFileDescription(fileDescription) == 1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isVoiceMessage(FileDescription fileDescription) {
        if (fileDescription != null && INSTANCE.getExtensionFromFileDescription(fileDescription) == 3) {
            return true;
        }
        return false;
    }

    public static final void removeFileIfCorrupted(final FileDescription fileDescription) {
        rn5 b;
        Uri uri;
        b = yn5.b(FileUtils$removeFileIfCorrupted$$inlined$inject$1.INSTANCE);
        Context context = BaseConfig.Companion.getInstance().context;
        if (fileDescription != null) {
            uri = fileDescription.getFileUri();
        } else {
            uri = null;
        }
        if (uri != null && INSTANCE.isFileCorrupted(fileDescription)) {
            Uri fileUri = fileDescription.getFileUri();
            z65.e(fileUri);
            m53 b2 = m53.b(context, fileUri);
            if (b2 != null) {
                b2.a();
            }
            File[] listFiles = FileDownloader.Companion.getDownloadDir(context).listFiles(new FilenameFilter() { // from class: ou3
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    boolean removeFileIfCorrupted$lambda$5;
                    removeFileIfCorrupted$lambda$5 = FileUtils.removeFileIfCorrupted$lambda$5(FileDescription.this, file, str);
                    return removeFileIfCorrupted$lambda$5;
                }
            });
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.exists()) {
                        file.delete();
                    }
                }
            }
            fileDescription.setFileUri(null);
            fileDescription.setDownloadProgress(0);
            removeFileIfCorrupted$lambda$4(b).updateFileDescription(fileDescription);
        }
    }

    private static final DatabaseHolder removeFileIfCorrupted$lambda$4(rn5<DatabaseHolder> rn5Var) {
        return rn5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeFileIfCorrupted$lambda$5(FileDescription fileDescription, File file, String str) {
        boolean u;
        z65.g(str, Action.NAME_ATTRIBUTE);
        String incomingName = fileDescription.getIncomingName();
        if (incomingName == null) {
            incomingName = "no name";
        }
        u = l0b.u(str, incomingName, false, 2, null);
        return u;
    }

    public static final Uri safeParse(String str) {
        if (str != null) {
            return Uri.parse(str);
        }
        return null;
    }

    private final void saveImageToFile(Uri uri, File file) throws IOException {
        Bitmap bitmapSync = ImageLoader.Companion.get().load(String.valueOf(uri)).getBitmapSync(BaseConfig.Companion.getInstance().context);
        if (bitmapSync != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapSync.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.flush();
                bitmapSync.recycle();
                Unit unit = Unit.a;
                aa1.a(fileOutputStream, null);
            } catch (IOException e) {
                LoggerEdna.error("saveToFile error: " + e);
                bitmapSync.recycle();
            }
        }
    }

    public static final void saveToDownloads(FileDescription fileDescription) throws IOException {
        Uri fileUri;
        Uri contentUri;
        z65.h(fileDescription, "fileDescription");
        String downloadPath = fileDescription.getDownloadPath();
        if (downloadPath != null && downloadPath.length() != 0) {
            fileUri = Uri.parse(fileDescription.getDownloadPath());
        } else {
            fileUri = fileDescription.getFileUri();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (fileUri != null) {
                ContentResolver contentResolver = BaseConfig.Companion.getInstance().context.getContentResolver();
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", fileDescription.getIncomingName());
                contentValues.put("mime_type", getMimeType(fileDescription));
                contentUri = MediaStore.Downloads.getContentUri("external_primary");
                z65.g(contentUri, "getContentUri(MediaStore.VOLUME_EXTERNAL_PRIMARY)");
                Uri insert = contentResolver.insert(contentUri, contentValues);
                if (insert == null) {
                    UUID randomUUID = UUID.randomUUID();
                    contentValues.put("_display_name", "threads" + randomUUID);
                    insert = contentResolver.insert(contentUri, contentValues);
                }
                INSTANCE.saveToUri(fileUri, insert);
            }
        } else if (fileUri != null) {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), generateFileName(fileDescription));
            if (!file.exists() && !file.createNewFile()) {
                throw new FileNotFoundException();
            }
            INSTANCE.saveImageToFile(fileUri, file);
            BaseConfig.Companion companion = BaseConfig.Companion;
            Object systemService = companion.getInstance().context.getSystemService("download");
            z65.f(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
            ((DownloadManager) systemService).addCompletedDownload(getFileName(fileUri), companion.getInstance().context.getString(R.string.ecc_media_description), true, getMimeType(fileUri), file.getPath(), file.length(), false);
        }
    }

    private final void saveToUri(Uri uri, Uri uri2) throws IOException {
        BaseConfig.Companion companion = BaseConfig.Companion;
        ContentResolver contentResolver = companion.getInstance().context.getContentResolver();
        Bitmap bitmapSync = ImageLoader.Companion.get().load(String.valueOf(uri)).getBitmapSync(companion.getInstance().context);
        if (bitmapSync != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapSync.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            try {
                z65.e(uri2);
                OutputStream openOutputStream = contentResolver.openOutputStream(uri2);
                if (openOutputStream != null) {
                    openOutputStream.write(byteArrayOutputStream.toByteArray());
                    openOutputStream.flush();
                    bitmapSync.recycle();
                }
                Unit unit = Unit.a;
                aa1.a(openOutputStream, null);
            } catch (IOException e) {
                LoggerEdna.error("cannot get bitmap in saveToUri: " + e);
                bitmapSync.recycle();
            }
        }
    }

    public final String generatePreviewFileName$threads_release(String str) {
        List y0;
        if (str != null && str.length() != 0) {
            y0 = m0b.y0(str, new String[]{"."}, false, 0, 6, null);
            String[] strArr = (String[]) y0.toArray(new String[0]);
            if (strArr.length >= 2) {
                String str2 = strArr[0];
                String str3 = strArr[strArr.length - 1];
                return str2 + "_small." + str3;
            }
            return null;
        }
        return null;
    }

    public final int getExtensionFromPath$threads_release(String str) {
        boolean O;
        int e0;
        boolean v;
        boolean v2;
        boolean v3;
        boolean v4;
        boolean v5;
        boolean v6;
        boolean v7;
        boolean v8;
        boolean v9;
        boolean v10;
        boolean v11;
        boolean v12;
        boolean v13;
        boolean v14;
        if (str != null) {
            O = m0b.O(str, ".", false, 2, null);
            if (O) {
                e0 = m0b.e0(str, ".", 0, false, 6, null);
                String substring = str.substring(e0 + 1);
                z65.g(substring, "this as java.lang.String).substring(startIndex)");
                v = l0b.v(substring, "jpg", true);
                if (!v) {
                    v2 = l0b.v(substring, "jpeg", true);
                    if (!v2) {
                        v3 = l0b.v(substring, "png", true);
                        if (!v3) {
                            v4 = l0b.v(substring, "pdf", true);
                            if (!v4) {
                                v5 = l0b.v(substring, "wav", true);
                                if (!v5) {
                                    v6 = l0b.v(substring, "ogg", true);
                                    if (!v6) {
                                        v7 = l0b.v(substring, "txt", true);
                                        if (!v7) {
                                            v8 = l0b.v(substring, "doc", true);
                                            if (!v8) {
                                                v9 = l0b.v(substring, "docx", true);
                                                if (!v9) {
                                                    v10 = l0b.v(substring, "xls", true);
                                                    if (!v10) {
                                                        v11 = l0b.v(substring, "xlsx", true);
                                                        if (!v11) {
                                                            v12 = l0b.v(substring, "xlsm", true);
                                                            if (!v12) {
                                                                v13 = l0b.v(substring, "xltx", true);
                                                                if (!v13) {
                                                                    v14 = l0b.v(substring, "xlt", true);
                                                                    if (!v14) {
                                                                        return -1;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return 4;
                                    }
                                    return 3;
                                }
                                return 3;
                            }
                            return 2;
                        }
                        return 1;
                    }
                }
                return 0;
            }
        }
        return -1;
    }

    @SuppressLint({"NewApi"})
    public final String getFileNameFromMediaStore(Context context, Uri uri) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        ContentResolver contentResolver = context.getContentResolver();
        z65.e(uri);
        Cursor query = contentResolver.query(uri, null, null, null, null);
        if (query == null) {
            aa1.a(query, null);
            return null;
        }
        try {
            int columnIndex = query.getColumnIndex("_display_name");
            query.moveToFirst();
            String string = query.getString(columnIndex);
            aa1.a(query, null);
            return string;
        } finally {
        }
    }

    public final boolean isPreviewFileExist$threads_release(Context context, FileDescription fileDescription) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (fileDescription != null) {
            return new File(FileDownloader.Companion.getDownloadDir(context), generateFileName(fileDescription)).exists();
        }
        return false;
    }

    public final String toAbsoluteUrl$threads_release(String str) {
        return convertRelativeUrlToAbsolute(str);
    }

    public static final String getMimeType(Uri uri) {
        z65.h(uri, "uri");
        String type = BaseConfig.Companion.getInstance().context.getContentResolver().getType(uri);
        if (type == null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()));
        }
        return type == null ? UNKNOWN_MIME_TYPE : type;
    }
}
