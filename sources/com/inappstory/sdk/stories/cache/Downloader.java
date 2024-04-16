package com.inappstory.sdk.stories.cache;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.NonNull;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.lrudiskcache.FileManager;
import com.inappstory.sdk.lrudiskcache.LruDiskCache;
import com.inappstory.sdk.network.NetworkHandler;
import com.inappstory.sdk.stories.api.models.CacheFontObject;
import com.inappstory.sdk.stories.api.models.logs.ApiLogRequest;
import com.inappstory.sdk.stories.api.models.logs.ApiLogRequestHeader;
import com.inappstory.sdk.stories.api.models.logs.ApiLogResponse;
import com.inappstory.sdk.stories.statistic.ProfilingManager;
import com.inappstory.sdk.stories.utils.KeyValueStorage;
import defpackage.tmb;
import im.threads.ui.fragments.ChatFragment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes3.dex */
public class Downloader {
    private static final ExecutorService fontDownloader = Executors.newFixedThreadPool(1);
    private static final ExecutorService tmpFileDownloader = Executors.newFixedThreadPool(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a implements Callable<File> {
        final /* synthetic */ String a;
        final /* synthetic */ LruDiskCache b;

        a(String str, LruDiskCache lruDiskCache) {
            this.a = str;
            this.b = lruDiskCache;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public File call() throws Exception {
            return FileManager.getFullFile(Downloader.downloadOrGetFile(this.a, true, this.b, null, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b implements Callable {
        final /* synthetic */ LruDiskCache a;
        final /* synthetic */ FileLoadProgressCallback b;
        final /* synthetic */ String c;
        final /* synthetic */ boolean d;
        final /* synthetic */ DownloadInterruption e;

        b(LruDiskCache lruDiskCache, FileLoadProgressCallback fileLoadProgressCallback, String str, boolean z, DownloadInterruption downloadInterruption) {
            this.a = lruDiskCache;
            this.b = fileLoadProgressCallback;
            this.c = str;
            this.d = z;
            this.e = downloadInterruption;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public File call() {
            LruDiskCache lruDiskCache = this.a;
            if (lruDiskCache == null) {
                FileLoadProgressCallback fileLoadProgressCallback = this.b;
                if (fileLoadProgressCallback != null) {
                    fileLoadProgressCallback.onError("Cache does not exist");
                }
                return null;
            }
            try {
                return FileManager.getFullFile(Downloader.downloadOrGetFile(this.c, this.d, lruDiskCache, null, this.b, this.e, null));
            } catch (Exception e) {
                e.printStackTrace();
                FileLoadProgressCallback fileLoadProgressCallback2 = this.b;
                if (fileLoadProgressCallback2 != null) {
                    fileLoadProgressCallback2.onError(e.getMessage());
                }
                return null;
            }
        }
    }

    static void checkAndReplaceFile(LruDiskCache lruDiskCache, String str, String str2, DownloadFileState downloadFileState) throws IOException {
        String fileExtensionFromUrl = getFileExtensionFromUrl(str);
        if (!downloadFileState.file.getAbsolutePath().endsWith(fileExtensionFromUrl)) {
            File file = new File(downloadFileState.file.getAbsolutePath() + fileExtensionFromUrl);
            downloadFileState.file.renameTo(file);
            downloadFileState.file = file;
            lruDiskCache.put(str2, file);
        }
    }

    public static void compressFile(File file, String str) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file.getAbsolutePath());
        BitmapFactory.Options options = new BitmapFactory.Options();
        char c = 0;
        options.inJustDecodeBounds = false;
        options.inSampleSize = 2;
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(file.getPath(), options);
            switch (str.hashCode()) {
                case -1487394660:
                    if (str.equals("image/jpeg")) {
                        break;
                    }
                    c = 65535;
                    break;
                case -1487018032:
                    if (str.equals("image/webp")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -879264467:
                    if (str.equals("image/jpg")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -879258763:
                    if (str.equals("image/png")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0 && c != 1) {
                if (c != 2) {
                    if (c == 3) {
                        decodeFile.compress(Bitmap.CompressFormat.WEBP, 70, fileOutputStream);
                    }
                } else {
                    decodeFile.compress(Bitmap.CompressFormat.PNG, 70, fileOutputStream);
                }
            } else {
                decodeFile.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        fileOutputStream.close();
    }

    public static String cropUrl(String str, boolean z) {
        if (z) {
            return str.split("\\?")[0];
        }
        return str;
    }

    private static void downFontFile(String str, LruDiskCache lruDiskCache) {
        fontDownloader.submit(new a(str, lruDiskCache));
    }

    private static DownloadFileState downloadFile(String str, File file, FileLoadProgressCallback fileLoadProgressCallback, ApiLogResponse apiLogResponse, DownloadInterruption downloadInterruption, long j) throws Exception {
        File file2;
        boolean z;
        InputStream inputStream;
        int i;
        InAppStoryManager.showDLog("InAppStory_File", str);
        file.getParentFile().mkdirs();
        if (!file.exists()) {
            file.createNewFile();
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestProperty("Accept-Encoding", "br, gzip");
        httpURLConnection.setConnectTimeout(300000);
        httpURLConnection.setReadTimeout(300000);
        httpURLConnection.setRequestMethod(NetworkHandler.GET);
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i2 > 0) {
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-");
        }
        try {
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            HashMap<String, String> hashMap = new HashMap<>();
            long contentLength = httpURLConnection.getContentLength();
            long freeSpace = file.getFreeSpace();
            if (freeSpace > 0 && contentLength > freeSpace) {
                httpURLConnection.disconnect();
                return null;
            }
            boolean z2 = false;
            for (String str2 : httpURLConnection.getHeaderFields().keySet()) {
                if (str2 != null && !httpURLConnection.getHeaderFields().get(str2).isEmpty()) {
                    hashMap.put(str2, httpURLConnection.getHeaderFields().get(str2).get(0));
                    if (str2.equalsIgnoreCase("Content-Range")) {
                        String str3 = httpURLConnection.getHeaderFields().get(str2).get(0);
                        if (!str3.equalsIgnoreCase("none")) {
                            try {
                                contentLength = Long.parseLong(str3.split("/")[1]);
                            } catch (Exception unused) {
                            }
                            z2 = true;
                        }
                    }
                }
            }
            apiLogResponse.contentLength = contentLength;
            HashMap<String, String> headers = NetworkHandler.getHeaders(httpURLConnection);
            String str4 = headers.containsKey("Content-Encoding") ? headers.get("Content-Encoding") : null;
            if (headers.containsKey("content-encoding")) {
                str4 = headers.get("content-encoding");
            }
            if (responseCode > 350) {
                apiLogResponse.generateFile(responseCode, NetworkHandler.getResponseFromStream(httpURLConnection.getErrorStream(), str4), hashMap);
                return null;
            }
            if (!z2 || i2 <= 0) {
                file2 = file;
                z = false;
            } else {
                file2 = file;
                z = true;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2, z);
            FileLock lock = fileOutputStream.getChannel().lock();
            InputStream decompressedStream = NetworkHandler.getDecompressedStream(httpURLConnection.getInputStream(), str4);
            String headerField = httpURLConnection.getHeaderField("Content-Type");
            if (headerField != null) {
                KeyValueStorage.saveString(file.getName(), headerField);
            } else {
                KeyValueStorage.saveString(file.getName(), "image/jpeg");
            }
            byte[] bArr = new byte[1024];
            int i3 = 0;
            while (true) {
                try {
                    int read = decompressedStream.read(bArr);
                    if (read > 0) {
                        if (downloadInterruption != null) {
                            inputStream = decompressedStream;
                            if (downloadInterruption.active) {
                                releaseStreamAndFile(fileOutputStream, lock);
                                return new DownloadFileState(file, contentLength, file.length());
                            }
                        } else {
                            inputStream = decompressedStream;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        i3 += read;
                        if (fileLoadProgressCallback != null) {
                            i = responseCode;
                            fileLoadProgressCallback.onProgress(i3 + j, contentLength);
                        } else {
                            i = responseCode;
                        }
                        responseCode = i;
                        decompressedStream = inputStream;
                    } else {
                        releaseStreamAndFile(fileOutputStream, lock);
                        apiLogResponse.generateFile(responseCode, file.getAbsolutePath(), hashMap);
                        return new DownloadFileState(file, file.length(), file.length());
                    }
                } catch (Exception unused2) {
                    releaseStreamAndFile(fileOutputStream, lock);
                    return new DownloadFileState(file, contentLength, file.length());
                }
            }
        } catch (Exception unused3) {
            return null;
        }
    }

    public static void downloadFileBackground(String str, boolean z, LruDiskCache lruDiskCache, FileLoadProgressCallback fileLoadProgressCallback) {
        downloadFileBackground(str, z, lruDiskCache, fileLoadProgressCallback, null);
    }

    public static void downloadFonts(List<CacheFontObject> list) {
        if (list != null) {
            for (CacheFontObject cacheFontObject : list) {
                if (InAppStoryService.isNull()) {
                    return;
                }
                downFontFile(cacheFontObject.url, InAppStoryService.getInstance().getCommonCache());
            }
        }
    }

    public static DownloadFileState downloadOrGetFile(@NonNull String str, boolean z, LruDiskCache lruDiskCache, File file, FileLoadProgressCallback fileLoadProgressCallback) throws Exception {
        return downloadOrGetFile(str, z, lruDiskCache, file, fileLoadProgressCallback, null, null);
    }

    @NonNull
    public static boolean downloadOrGetResourceFile(@NonNull String str, @NonNull String str2, LruDiskCache lruDiskCache, File file, FileLoadProgressCallback fileLoadProgressCallback) throws Exception {
        long j;
        File file2;
        DownloadFileState downloadFileState;
        File file3;
        String str3 = str2 + "_" + cropUrlOld(str, true);
        if (lruDiskCache.hasKey(str3) && (downloadFileState = lruDiskCache.get(str3)) != null && (file3 = downloadFileState.file) != null && file3.exists()) {
            checkAndReplaceFile(lruDiskCache, str, str3, downloadFileState);
            long j2 = downloadFileState.totalSize;
            long j3 = downloadFileState.downloadedSize;
            if (j2 == j3) {
                return false;
            }
            j = j3;
        } else {
            j = 0;
        }
        if (file == null) {
            file2 = lruDiskCache.getFileFromKey(str3);
        } else {
            file2 = file;
        }
        DownloadFileState downloadFile = downloadFile(str, file2, fileLoadProgressCallback, new ApiLogResponse(), null, j);
        if (downloadFile != null) {
            lruDiskCache.put(str3, downloadFile.file, downloadFile.totalSize, downloadFile.downloadedSize);
        }
        return true;
    }

    public static File getCoverVideo(@NonNull String str, LruDiskCache lruDiskCache) throws IOException {
        String cropUrlOld = cropUrlOld(str, false);
        if (lruDiskCache.hasKey(cropUrlOld)) {
            return updateFile(lruDiskCache.getFullFile(cropUrlOld), str, lruDiskCache, cropUrlOld);
        }
        return null;
    }

    static String getFileExtensionFromUrl(String str) {
        String cropUrl = cropUrl(str, true);
        return cropUrl.substring(cropUrl.lastIndexOf("."));
    }

    public static String getFontFile(String str) {
        File fullFile;
        if (str != null && !str.isEmpty()) {
            String cropUrlOld = cropUrlOld(str, true);
            InAppStoryService inAppStoryService = InAppStoryService.getInstance();
            if (inAppStoryService == null) {
                return null;
            }
            LruDiskCache commonCache = inAppStoryService.getCommonCache();
            if (commonCache.hasKey(cropUrlOld)) {
                try {
                    fullFile = updateFile(commonCache.getFullFile(cropUrlOld), str, commonCache, cropUrlOld);
                } catch (IOException unused) {
                    fullFile = commonCache.getFullFile(cropUrlOld);
                }
            } else {
                fullFile = null;
            }
            if (fullFile != null && fullFile.exists()) {
                return fullFile.getAbsolutePath();
            }
        }
        return null;
    }

    private static void releaseStreamAndFile(FileOutputStream fileOutputStream, FileLock fileLock) throws IOException {
        fileOutputStream.flush();
        try {
            fileLock.release();
        } catch (Exception unused) {
        }
        fileOutputStream.close();
    }

    public static File updateFile(File file, String str, LruDiskCache lruDiskCache, String str2) throws IOException {
        if (file != null) {
            String fileExtensionFromUrl = getFileExtensionFromUrl(str);
            if (!file.getAbsolutePath().endsWith(fileExtensionFromUrl)) {
                File file2 = new File(file.getAbsolutePath() + fileExtensionFromUrl);
                file.renameTo(file2);
                lruDiskCache.put(str2, file2);
                return file2;
            }
        }
        return file;
    }

    public static void downloadFileBackground(String str, boolean z, LruDiskCache lruDiskCache, FileLoadProgressCallback fileLoadProgressCallback, DownloadInterruption downloadInterruption) {
        tmpFileDownloader.submit(new b(lruDiskCache, fileLoadProgressCallback, str, z, downloadInterruption));
    }

    public static DownloadFileState downloadOrGetFile(@NonNull String str, boolean z, LruDiskCache lruDiskCache, File file, FileLoadProgressCallback fileLoadProgressCallback, DownloadInterruption downloadInterruption, String str2) throws Exception {
        long j;
        File file2;
        DownloadFileState downloadFileState;
        File file3;
        String uuid = UUID.randomUUID().toString();
        ApiLogRequest apiLogRequest = new ApiLogRequest();
        ApiLogResponse apiLogResponse = new ApiLogResponse();
        apiLogRequest.method = NetworkHandler.GET;
        apiLogRequest.url = str;
        apiLogRequest.isStatic = true;
        apiLogRequest.id = uuid;
        apiLogResponse.id = uuid;
        String cropUrlOld = cropUrlOld(str, z);
        HashMap<String, String> hashMap = new HashMap<>();
        if (!lruDiskCache.hasKey(cropUrlOld) || (downloadFileState = lruDiskCache.get(cropUrlOld)) == null || (file3 = downloadFileState.file) == null || !file3.exists()) {
            j = 0;
        } else {
            checkAndReplaceFile(lruDiskCache, str, cropUrlOld, downloadFileState);
            j = downloadFileState.downloadedSize;
            if (j == downloadFileState.totalSize) {
                if (fileLoadProgressCallback != null) {
                    fileLoadProgressCallback.onSuccess(downloadFileState.file);
                }
                hashMap.put("From Cache", tmb.h.TRUE_JSON_NAME);
                apiLogResponse.generateFile(ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY, downloadFileState.file.getAbsolutePath(), hashMap);
                InAppStoryManager.sendApiRequestResponseLog(apiLogRequest, apiLogResponse);
                return downloadFileState;
            }
        }
        InAppStoryManager.sendApiRequestLog(apiLogRequest);
        if (str2 != null) {
            ProfilingManager.getInstance().addTask("game_download", str2);
        }
        DownloadFileState downloadFile = downloadFile(str, file == null ? lruDiskCache.getFileFromKey(cropUrlOld) : file, fileLoadProgressCallback, apiLogResponse, downloadInterruption, j);
        if (downloadFile != null && (file2 = downloadFile.file) != null) {
            lruDiskCache.put(cropUrlOld, file2, downloadFile.totalSize, downloadFile.downloadedSize);
            if (downloadFile.totalSize == downloadFile.downloadedSize) {
                if (fileLoadProgressCallback != null) {
                    fileLoadProgressCallback.onSuccess(downloadFile.file);
                }
            } else if (fileLoadProgressCallback != null) {
                fileLoadProgressCallback.onError("Partial content");
            }
        } else if (fileLoadProgressCallback != null) {
            fileLoadProgressCallback.onError("File haven't downloaded");
        }
        apiLogResponse.responseHeaders.add(new ApiLogRequestHeader("From Cache", "false"));
        InAppStoryManager.sendApiResponseLog(apiLogResponse);
        return downloadFile;
    }

    public static String cropUrlOld(String str, boolean z) {
        return str;
    }
}
