package com.inappstory.sdk.utils;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.lrudiskcache.FileManager;
import com.inappstory.sdk.lrudiskcache.LruDiskCache;
import com.inappstory.sdk.stories.api.models.GameCenterData;
import com.inappstory.sdk.stories.api.models.WebResource;
import com.inappstory.sdk.stories.cache.DownloadFileState;
import com.inappstory.sdk.stories.cache.DownloadInterruption;
import com.inappstory.sdk.stories.cache.Downloader;
import com.inappstory.sdk.stories.cache.FileLoadProgressCallback;
import com.inappstory.sdk.stories.statistic.ProfilingManager;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes3.dex */
public class ZipLoader {
    public static final String FILE = "file://";
    private static final String INDEX_NAME = "/index.html";
    private static ZipLoader INSTANCE;
    boolean terminate = false;
    private static final Object lock = new Object();
    private static final ExecutorService downloadFileThread = Executors.newFixedThreadPool(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        final /* synthetic */ File a;
        final /* synthetic */ ZipLoadCallback b;

        a(File file, ZipLoadCallback zipLoadCallback) {
            this.a = file;
            this.b = zipLoadCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            File file = new File(this.a.getAbsolutePath() + ZipLoader.INDEX_NAME);
            try {
                if (file.exists()) {
                    ZipLoadCallback zipLoadCallback = this.b;
                    zipLoadCallback.onLoad(ZipLoader.FILE + file.getAbsolutePath(), ZipLoader.this.getStringFromFile(file));
                } else {
                    this.b.onError("No index file");
                }
            } catch (Exception e) {
                InAppStoryService.createExceptionLog(e);
                e.printStackTrace();
            }
        }
    }

    private ZipLoader() {
    }

    private String convertStreamToString(InputStream inputStream) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append("\n");
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    private void deleteFileIfNotPass(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteFolderRecursive(File file, boolean z) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteFolderRecursive(file2, true);
            }
        }
        if (z) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean downloadResources(List<WebResource> list, File file, ZipLoadCallback zipLoadCallback, String str, long j, long j2) {
        String str2;
        if (list == null) {
            return true;
        }
        if (this.terminate || InAppStoryService.isNull()) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        sb.append(absolutePath);
        String str3 = File.separator;
        sb.append(str3);
        if (str != null) {
            str2 = "resources_" + str;
        } else {
            str2 = "src";
        }
        sb.append(str2);
        sb.append(str3);
        File file2 = new File(sb.toString());
        long j3 = j2;
        boolean z = false;
        for (WebResource webResource : list) {
            if (this.terminate) {
                return false;
            }
            try {
                String str4 = webResource.url;
                String str5 = webResource.key;
                if (str4 != null && !str4.isEmpty() && str5 != null && !str5.isEmpty()) {
                    File file3 = new File(file2.getAbsolutePath() + "/" + str5);
                    if (file3.exists()) {
                        if (!FileManager.checkShaAndSize(file3, Long.valueOf(webResource.size), webResource.sha1)) {
                            deleteFileIfNotPass(file3);
                        } else {
                            j3 += webResource.size;
                            if (zipLoadCallback != null) {
                                zipLoadCallback.onProgress(j3, j);
                            }
                        }
                    }
                    z |= Downloader.downloadOrGetResourceFile(str4, str5, InAppStoryService.getInstance().getInfiniteCache(), file3, null);
                    if (!FileManager.checkShaAndSize(file3, Long.valueOf(webResource.size), webResource.sha1)) {
                        deleteFileIfNotPass(file3);
                    } else {
                        j3 += webResource.size;
                        if (zipLoadCallback != null) {
                            zipLoadCallback.onProgress(j3, j);
                        }
                    }
                }
            } catch (Exception e) {
                InAppStoryService.createExceptionLog(e);
                e.printStackTrace();
            }
        }
        if (zipLoadCallback != null) {
            new Handler(Looper.getMainLooper()).post(new a(file, zipLoadCallback));
        }
        return z;
    }

    private int downloadStream(URL url, File file, ZipLoadCallback zipLoadCallback, int i, int i2) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(FirebasePerfUrlConnection.openStream(url), 8192);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            int i3 = i;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                    i3 += read;
                    zipLoadCallback.onProgress(i3, i2);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    bufferedInputStream.close();
                    return i3;
                }
            }
        } catch (Exception e) {
            InAppStoryService.createExceptionLog(e);
            if (file.exists()) {
                file.delete();
            }
            return i;
        }
    }

    public static ZipLoader getInstance() {
        ZipLoader zipLoader;
        synchronized (lock) {
            try {
                if (INSTANCE == null) {
                    INSTANCE = new ZipLoader();
                }
                zipLoader = INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zipLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getStringFromFile(File file) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(file);
        String convertStreamToString = convertStreamToString(fileInputStream);
        fileInputStream.close();
        return convertStreamToString;
    }

    public static String[] urlParts(String str) {
        String[] split = str.split("/");
        return split[split.length - 1].split("\\.")[0].split("_");
    }

    public void downloadAndUnzip(List<WebResource> list, String str, String str2, ZipLoadCallback zipLoadCallback, String str3) {
        downloadAndUnzip(list, str, str2, null, null, zipLoadCallback, null, str3);
    }

    public void terminate() {
        this.terminate = true;
    }

    public void downloadAndUnzip(List<WebResource> list, String str, String str2, String str3, GameCenterData gameCenterData, ZipLoadCallback zipLoadCallback, DownloadInterruption downloadInterruption, String str4) {
        String str5 = str.split("\\?")[0];
        this.terminate = false;
        downloadFileThread.submit(new b(zipLoadCallback, str2, str5, list, gameCenterData, downloadInterruption, str4, str3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Callable {
        final /* synthetic */ ZipLoadCallback a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ List d;
        final /* synthetic */ GameCenterData e;
        final /* synthetic */ DownloadInterruption f;
        final /* synthetic */ String g;
        final /* synthetic */ String h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.inappstory.sdk.utils.ZipLoader$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0273b implements ProgressCallback {
            final /* synthetic */ File a;
            final /* synthetic */ long b;

            C0273b(File file, long j) {
                this.a = file;
                this.b = j;
            }

            @Override // com.inappstory.sdk.utils.ProgressCallback
            public void onProgress(long j, long j2) {
                ZipLoadCallback zipLoadCallback = b.this.a;
                long length = this.a.length();
                long j3 = this.b;
                zipLoadCallback.onProgress(length + (((((float) j3) * 0.2f) * ((float) j)) / ((float) j2)), (long) (j3 * 1.2d));
            }
        }

        b(ZipLoadCallback zipLoadCallback, String str, String str2, List list, GameCenterData gameCenterData, DownloadInterruption downloadInterruption, String str3, String str4) {
            this.a = zipLoadCallback;
            this.b = str;
            this.c = str2;
            this.d = list;
            this.e = gameCenterData;
            this.f = downloadInterruption;
            this.g = str3;
            this.h = str4;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            InAppStoryService inAppStoryService;
            GameCenterData gameCenterData;
            File[] listFiles;
            try {
                inAppStoryService = InAppStoryService.getInstance();
            } catch (Exception e) {
                InAppStoryService.createExceptionLog(e);
                e.printStackTrace();
                ZipLoadCallback zipLoadCallback = this.a;
                if (zipLoadCallback != null) {
                    zipLoadCallback.onError(e.getMessage());
                }
            }
            if (inAppStoryService == null) {
                ZipLoadCallback zipLoadCallback2 = this.a;
                if (zipLoadCallback2 != null) {
                    zipLoadCallback2.onError("InAppStoryService is not created");
                }
                return null;
            }
            LruDiskCache infiniteCache = inAppStoryService.getInfiniteCache();
            if (!this.b.contains("\\") && !this.b.contains("/")) {
                StringBuilder sb = new StringBuilder();
                sb.append(inAppStoryService.getInfiniteCache().getCacheDir());
                String str = File.separator;
                sb.append(str);
                sb.append("zip");
                sb.append(str);
                sb.append(this.b);
                sb.append(str);
                File file = new File(sb.toString());
                File file2 = new File(file, this.c.hashCode() + ".zip");
                if (!file2.getAbsolutePath().startsWith(infiniteCache.getCacheDir() + str + "zip")) {
                    return null;
                }
                List<WebResource> list = this.d;
                long j = 0;
                if (list != null) {
                    for (WebResource webResource : list) {
                        j += webResource.size;
                    }
                }
                long j2 = j;
                String uuid = UUID.randomUUID().toString();
                if (file.exists() && file.isDirectory()) {
                    for (File file3 : file.listFiles()) {
                        if (!file3.getAbsolutePath().contains("" + this.c.hashCode())) {
                            ZipLoader.this.deleteFolderRecursive(file3, true);
                        }
                    }
                }
                File fullFile = InAppStoryService.getInstance().getInfiniteCache().getFullFile(Downloader.cropUrlOld(this.c, true));
                if (fullFile != null && (gameCenterData = this.e) != null && !FileManager.checkShaAndSize(fullFile, gameCenterData.archiveSize, gameCenterData.archiveSha1)) {
                    InAppStoryService.getInstance().getInfiniteCache().delete(this.c);
                    File file4 = new File(file2.getParent() + File.separator + this.c.hashCode());
                    if (file4.exists()) {
                        ZipLoader.this.deleteFolderRecursive(file4, true);
                    }
                    fullFile = null;
                }
                if (fullFile == null || !fullFile.exists()) {
                    GameCenterData gameCenterData2 = this.e;
                    if (gameCenterData2 != null && gameCenterData2.getTotalSize() > infiniteCache.getCacheDir().getFreeSpace()) {
                        this.a.onError("No free space for download");
                        return null;
                    }
                    DownloadFileState downloadOrGetFile = Downloader.downloadOrGetFile(this.c, true, InAppStoryService.getInstance().getInfiniteCache(), file2, new a(j2), this.f, uuid);
                    if (downloadOrGetFile == null || (file2 = downloadOrGetFile.file) == null || downloadOrGetFile.downloadedSize != downloadOrGetFile.totalSize) {
                        file2 = null;
                    }
                }
                if (file2 != null && file2.exists()) {
                    GameCenterData gameCenterData3 = this.e;
                    if (gameCenterData3 != null && !FileManager.checkShaAndSize(file2, gameCenterData3.archiveSize, gameCenterData3.archiveSha1)) {
                        file2.delete();
                        ZipLoadCallback zipLoadCallback3 = this.a;
                        if (zipLoadCallback3 != null) {
                            zipLoadCallback3.onError("Wrong file sha or size");
                        }
                        return null;
                    }
                    ProfilingManager.getInstance().setReady(uuid);
                    File file5 = new File(file2.getParent() + File.separator + this.c.hashCode());
                    long length = j2 + file2.length();
                    if (file5.exists()) {
                        String addTask = ProfilingManager.getInstance().addTask(this.g + "_resources_download");
                        double d = (double) length;
                        if (ZipLoader.this.downloadResources(this.d, file5, this.a, this.h, (long) (1.2d * d), file2.length() + ((long) (d * 0.2d)))) {
                            ProfilingManager.getInstance().setReady(addTask);
                        }
                        if (InAppStoryService.getInstance().getInfiniteCache().get(file5.getName()) == null) {
                            InAppStoryService.getInstance().getInfiniteCache().put(file5.getName(), file5);
                        }
                    } else if (file2.exists()) {
                        String addTask2 = ProfilingManager.getInstance().addTask(this.g + "_unzip");
                        FileUnzipper.unzip(file2, file5, new C0273b(file2, length));
                        ProfilingManager.getInstance().setReady(addTask2);
                        InAppStoryService.getInstance().getInfiniteCache().put(file5.getName(), file5);
                        String addTask3 = ProfilingManager.getInstance().addTask(this.g + "_resources_download");
                        double d2 = (double) length;
                        if (ZipLoader.this.downloadResources(this.d, file5, this.a, this.h, (long) (1.2d * d2), file2.length() + ((long) (d2 * 0.2d)))) {
                            ProfilingManager.getInstance().setReady(addTask3);
                        }
                    } else {
                        ZipLoadCallback zipLoadCallback4 = this.a;
                        if (zipLoadCallback4 != null) {
                            zipLoadCallback4.onError("Zip file or unzipped directory not exists");
                        }
                    }
                    return null;
                }
                ZipLoadCallback zipLoadCallback5 = this.a;
                if (zipLoadCallback5 != null) {
                    zipLoadCallback5.onError("File download interrupted");
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements FileLoadProgressCallback {
            final /* synthetic */ long a;

            a(long j) {
                this.a = j;
            }

            @Override // com.inappstory.sdk.stories.cache.FileLoadProgressCallback
            public void onError(String str) {
                ZipLoadCallback zipLoadCallback = b.this.a;
                if (zipLoadCallback != null) {
                    zipLoadCallback.onError(str);
                }
            }

            @Override // com.inappstory.sdk.utils.ProgressCallback
            public void onProgress(long j, long j2) {
                b.this.a.onProgress(j, ((float) (this.a + j2)) * 1.2f);
            }

            @Override // com.inappstory.sdk.stories.cache.FileLoadProgressCallback
            public void onSuccess(File file) {
            }
        }
    }
}
