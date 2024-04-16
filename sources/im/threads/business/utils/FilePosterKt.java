package im.threads.business.utils;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import ch.qos.logback.core.joran.action.Action;
import defpackage.fq6;
import im.threads.business.chatUpdates.ChatUpdateProcessor;
import im.threads.business.config.BaseConfig;
import im.threads.business.imageLoading.ImageLoader;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.ErrorResponse;
import im.threads.business.models.FileDescription;
import im.threads.business.models.FileUploadResponse;
import im.threads.business.models.enums.AttachmentStateEnum;
import im.threads.business.rest.queries.DatastoreApi;
import im.threads.business.rest.queries.ThreadsApi;
import im.threads.business.transport.InputStreamRequestBody;
import im.threads.business.transport.MessageAttributes;
import im.threads.business.transport.TransportException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.Response;
/* compiled from: FilePoster.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a(\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0014\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u001a\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0002\"\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, d2 = {"Lim/threads/business/models/FileDescription;", "fileDescription", "", MessageAttributes.CLIENT_ID, "postFile", "Landroid/net/Uri;", "uri", "mimeType", "token", "sendFile", "Lji9;", "getFileRequestBody", "", "isJpeg", "getJpegRequestBody", "Ljava/io/InputStream;", "inputStream", "", "getBytes", "Ljava/io/File;", "compressImage", "message", "", "showErrorMessageLog", "", "PHOTO_RESIZE_MAX_SIDE", "I", "Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "chatUpdateProcessor", "threads_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class FilePosterKt {
    private static final int PHOTO_RESIZE_MAX_SIDE = 1600;

    private static final File compressImage(Uri uri) {
        ImageLoader autoRotateWithExif = ImageLoader.Companion.get().load(String.valueOf(uri)).resize(PHOTO_RESIZE_MAX_SIDE, PHOTO_RESIZE_MAX_SIDE).onlyScaleDown().scales(ImageView.ScaleType.CENTER_INSIDE).autoRotateWithExif(true);
        BaseConfig.Companion companion = BaseConfig.Companion;
        Bitmap bitmapSync = autoRotateWithExif.getBitmapSync(companion.getInstance().context);
        File file = new File(companion.getInstance().context.getCacheDir(), FileUtils.getFileName(uri));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmapSync != null) {
            bitmapSync.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.flush();
                bitmapSync.recycle();
                aa1.a(fileOutputStream, null);
                return file;
            } catch (IOException e) {
                LoggerEdna.error("downsizeImage error: " + e);
                bitmapSync.recycle();
                file.delete();
            }
        }
        return null;
    }

    private static final byte[] getBytes(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    z65.g(byteArray, "byteBuffer.toByteArray()");
                    aa1.a(byteArrayOutputStream, null);
                    return byteArray;
                }
            }
        } finally {
        }
    }

    private static final ji9 getFileRequestBody(Uri uri, String str) {
        ji9 jpegRequestBody;
        if (isJpeg(uri) && (jpegRequestBody = getJpegRequestBody(uri)) != null) {
            return jpegRequestBody;
        }
        qc6 b = qc6.e.b(str);
        ContentResolver contentResolver = BaseConfig.Companion.getInstance().context.getContentResolver();
        z65.g(contentResolver, "BaseConfig.getInstance().context.contentResolver");
        return new InputStreamRequestBody(b, contentResolver, uri);
    }

    private static final ji9 getJpegRequestBody(Uri uri) {
        File compressImage = compressImage(uri);
        if (compressImage == null) {
            return null;
        }
        return ji9.Companion.i(compressImage, qc6.e.b("image/jpeg"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r1[2] == (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean isJpeg(android.net.Uri r6) {
        /*
            r0 = 0
            im.threads.business.config.BaseConfig$Companion r1 = im.threads.business.config.BaseConfig.Companion     // Catch: java.io.IOException -> L37
            im.threads.business.config.BaseConfig r1 = r1.getInstance()     // Catch: java.io.IOException -> L37
            android.content.Context r1 = r1.context     // Catch: java.io.IOException -> L37
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.IOException -> L37
            java.io.InputStream r6 = r1.openInputStream(r6)     // Catch: java.io.IOException -> L37
            if (r6 == 0) goto L37
            byte[] r1 = getBytes(r6)     // Catch: java.lang.Throwable -> L29
            r2 = r1[r0]     // Catch: java.lang.Throwable -> L29
            r3 = -1
            if (r2 != r3) goto L2b
            r2 = 1
            r4 = r1[r2]     // Catch: java.lang.Throwable -> L29
            r5 = -40
            if (r4 != r5) goto L2b
            r4 = 2
            r1 = r1[r4]     // Catch: java.lang.Throwable -> L29
            if (r1 != r3) goto L2b
            goto L2c
        L29:
            r1 = move-exception
            goto L31
        L2b:
            r2 = 0
        L2c:
            r1 = 0
            defpackage.aa1.a(r6, r1)     // Catch: java.io.IOException -> L37
            return r2
        L31:
            throw r1     // Catch: java.lang.Throwable -> L32
        L32:
            r2 = move-exception
            defpackage.aa1.a(r6, r1)     // Catch: java.io.IOException -> L37
            throw r2     // Catch: java.io.IOException -> L37
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.utils.FilePosterKt.isJpeg(android.net.Uri):boolean");
    }

    public static final String postFile(FileDescription fileDescription, String str) {
        rn5 b;
        boolean y;
        boolean y2;
        z65.h(fileDescription, "fileDescription");
        b = yn5.b(FilePosterKt$postFile$$inlined$inject$1.INSTANCE);
        if (str != null) {
            y = l0b.y(str);
            if (!y) {
                try {
                    Uri fileUri = fileDescription.getFileUri();
                    if (fileUri != null) {
                        String uri = fileUri.toString();
                        z65.g(uri, "it.toString()");
                        if (uri.length() > 0) {
                            return sendFile(fileUri, FileUtils.getMimeType(fileUri), str, fileDescription);
                        }
                    }
                    String downloadPath = fileDescription.getDownloadPath();
                    if (downloadPath != null) {
                        y2 = l0b.y(downloadPath);
                        if (!y2) {
                            return fileDescription.getDownloadPath();
                        }
                    }
                } catch (Exception e) {
                    postFile$lambda$0(b).postError(new TransportException(e.getMessage()));
                }
            }
        }
        postFile$lambda$0(b).postError(new TransportException("No client id"));
        return null;
    }

    private static final ChatUpdateProcessor postFile$lambda$0(rn5<ChatUpdateProcessor> rn5Var) {
        return rn5Var.getValue();
    }

    private static final String sendFile(Uri uri, String str, String str2, FileDescription fileDescription) {
        rn5 b;
        b = yn5.b(FilePosterKt$sendFile$$inlined$inject$1.INSTANCE);
        Response<FileUploadResponse> response = null;
        try {
            Call<FileUploadResponse> upload = DatastoreApi.Companion.get().upload(fq6.c.c.b(Action.FILE_ATTRIBUTE, FileUtils.getFileName(uri), getFileRequestBody(uri, str)), ji9.Companion.k(str2, qc6.e.b("text/plain")), StringExtensionsKt.encodeUrl(str2));
            if (upload != null) {
                response = upload.execute();
            }
        } catch (Exception e) {
            sendFile$lambda$2(b).postError(new TransportException(e.getMessage()));
        }
        if (response != null) {
            if (response.isSuccessful()) {
                FileUploadResponse body = response.body();
                if (body != null) {
                    ChatUpdateProcessor sendFile$lambda$2 = sendFile$lambda$2(b);
                    fileDescription.setState(AttachmentStateEnum.READY);
                    sendFile$lambda$2.postUploadResult(fileDescription);
                    return body.getResult();
                }
            } else {
                kk9 errorBody = response.errorBody();
                if (errorBody != null) {
                    ChatUpdateProcessor sendFile$lambda$22 = sendFile$lambda$2(b);
                    fileDescription.setState(AttachmentStateEnum.ERROR);
                    sendFile$lambda$22.postUploadResult(fileDescription);
                    Object k = BaseConfig.Companion.getInstance().gson.k(errorBody.string(), ErrorResponse.class);
                    z65.g(k, "BaseConfig.getInstance()…rrorResponse::class.java)");
                    ErrorResponse errorResponse = (ErrorResponse) k;
                    String message = errorResponse.getMessage();
                    if (message != null && message.length() != 0) {
                        showErrorMessageLog(errorResponse.getMessage());
                        throw new IOException(errorResponse.getCode());
                    }
                }
            }
        }
        LoggerEdna.error(ThreadsApi.REST_TAG, "Sending file error. Response: " + response);
        throw new IOException(String.valueOf(response));
    }

    private static final ChatUpdateProcessor sendFile$lambda$2(rn5<ChatUpdateProcessor> rn5Var) {
        return rn5Var.getValue();
    }

    private static final void showErrorMessageLog(String str) {
        LoggerEdna.error(ThreadsApi.REST_TAG, "Sending file error. Reason: " + str + ".");
    }
}
