package im.threads.business.utils;

import android.content.Context;
import android.content.res.AssetManager;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huawei.hms.push.e;
import com.inappstory.sdk.network.NetworkHandler;
import im.threads.business.UserInfoBuilder;
import im.threads.business.config.BaseConfig;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.SslSocketFactoryConfig;
import im.threads.business.preferences.Preferences;
import im.threads.business.transport.AuthHeadersProvider;
import im.threads.business.utils.FileDownloader;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.NoSuchElementException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FileDownloader.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002+,B7\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b)\u0010*J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lim/threads/business/utils/FileDownloader;", "", "Ljava/net/HttpURLConnection;", "urlConnection", "", "getFileLength", "(Ljava/net/HttpURLConnection;)Ljava/lang/Long;", "Ljava/net/URLConnection;", "Ljava/io/File;", "getFileFromFileUrl", "", "fileName", "getFileFromAssets", "", "download", "stop", "path", "Ljava/lang/String;", "Landroid/content/Context;", "ctx", "Landroid/content/Context;", "Lim/threads/business/utils/FileDownloader$DownloadListener;", "downloadListener", "Lim/threads/business/utils/FileDownloader$DownloadListener;", "Lim/threads/business/preferences/Preferences;", "preferences", "Lim/threads/business/preferences/Preferences;", "Lim/threads/business/transport/AuthHeadersProvider;", "authHeadersProvider", "Lim/threads/business/transport/AuthHeadersProvider;", "Lim/threads/business/utils/ClientUseCase;", "clientUseCase$delegate", "Lrn5;", "getClientUseCase", "()Lim/threads/business/utils/ClientUseCase;", "clientUseCase", "outputFile", "Ljava/io/File;", "", "isStopped", "Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lim/threads/business/utils/FileDownloader$DownloadListener;Lim/threads/business/preferences/Preferences;Lim/threads/business/transport/AuthHeadersProvider;)V", "Companion", "DownloadListener", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class FileDownloader {
    public static final Companion Companion = new Companion(null);
    private final AuthHeadersProvider authHeadersProvider;
    private final rn5 clientUseCase$delegate;
    private final Context ctx;
    private final DownloadListener downloadListener;
    private final String fileName;
    private boolean isStopped;
    private final File outputFile;
    private final String path;
    private final Preferences preferences;

    /* compiled from: FileDownloader.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lim/threads/business/utils/FileDownloader$Companion;", "", "()V", "getDownloadDir", "Ljava/io/File;", "ctx", "Landroid/content/Context;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final File getDownloadDir(Context context) {
            z65.h(context, "ctx");
            File filesDir = context.getFilesDir();
            z65.g(filesDir, "ctx.filesDir");
            return filesDir;
        }
    }

    /* compiled from: FileDownloader.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lim/threads/business/utils/FileDownloader$DownloadListener;", "", "onComplete", "", Action.FILE_ATTRIBUTE, "Ljava/io/File;", "onFileDownloadError", e.a, "Ljava/lang/Exception;", "Lkotlin/Exception;", "onProgress", "progress", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface DownloadListener {
        void onComplete(File file);

        void onFileDownloadError(Exception exc);

        void onProgress(double d);
    }

    public FileDownloader(String str, String str2, Context context, DownloadListener downloadListener, Preferences preferences, AuthHeadersProvider authHeadersProvider) {
        rn5 b;
        z65.h(str, "path");
        z65.h(str2, "fileName");
        z65.h(context, "ctx");
        z65.h(downloadListener, "downloadListener");
        z65.h(preferences, "preferences");
        z65.h(authHeadersProvider, "authHeadersProvider");
        this.path = str;
        this.fileName = str2;
        this.ctx = context;
        this.downloadListener = downloadListener;
        this.preferences = preferences;
        this.authHeadersProvider = authHeadersProvider;
        b = yn5.b(FileDownloader$special$$inlined$inject$1.INSTANCE);
        this.clientUseCase$delegate = b;
        this.outputFile = new File(Companion.getDownloadDir(context), str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean download$lambda$0(FileDownloader fileDownloader, File file, String str) {
        z65.h(fileDownloader, "this$0");
        return z65.c(str, fileDownloader.fileName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean download$lambda$2(String str, SSLSession sSLSession) {
        return true;
    }

    private final ClientUseCase getClientUseCase() {
        return (ClientUseCase) this.clientUseCase$delegate.getValue();
    }

    public static final File getDownloadDir(Context context) {
        return Companion.getDownloadDir(context);
    }

    private final File getFileFromAssets(String str) {
        File file = new File(this.ctx.getCacheDir(), str);
        if (!file.exists()) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                AssetManager assets = this.ctx.getAssets();
                InputStream open = assets.open("test_files/" + str);
                z65.g(open, "inputStream");
                kk0.b(open, fileOutputStream, 0, 2, null);
                aa1.a(open, null);
                aa1.a(fileOutputStream, null);
            } finally {
            }
        }
        return file;
    }

    private final File getFileFromFileUrl(URLConnection uRLConnection) {
        List y0;
        Object k0;
        try {
            String path = uRLConnection.getURL().getPath();
            z65.g(path, "urlConnection.url.path");
            y0 = m0b.y0(path, new String[]{"/"}, false, 0, 6, null);
            k0 = sc1.k0(y0);
            return getFileFromAssets((String) k0);
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    private final Long getFileLength(HttpURLConnection httpURLConnection) {
        String str;
        try {
            List<String> list = httpURLConnection.getHeaderFields().get("Content-Length");
            if (list == null || !(!list.isEmpty()) || (str = list.get(0)) == null) {
                return null;
            }
            return Long.valueOf(Long.parseLong(str));
        } catch (Exception e) {
            LoggerEdna.error("download. getFileLength() error: " + e);
        }
        return null;
    }

    public final void download() {
        boolean v;
        boolean v2;
        URLConnection uRLConnection;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        String str;
        long j;
        File file;
        Long l;
        BufferedInputStream bufferedInputStream;
        try {
            URL url = new URL(this.path);
            File[] listFiles = Companion.getDownloadDir(this.ctx).listFiles(new FilenameFilter() { // from class: tt3
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    boolean download$lambda$0;
                    download$lambda$0 = FileDownloader.download$lambda$0(FileDownloader.this, file2, str2);
                    return download$lambda$0;
                }
            });
            int i = 0;
            if (listFiles != null && listFiles.length != 0) {
                this.downloadListener.onProgress(100.0d);
                DownloadListener downloadListener = this.downloadListener;
                File file2 = listFiles[0];
                z65.g(file2, "files[0]");
                downloadListener.onComplete(file2);
                return;
            }
            SslSocketFactoryConfig sslSocketFactoryConfig = BaseConfig.Companion.getInstance().getSslSocketFactoryConfig();
            if (sslSocketFactoryConfig != null) {
                HttpsURLConnection.setDefaultSSLSocketFactory(sslSocketFactoryConfig.getSslSocketFactory());
            }
            v = l0b.v(url.getProtocol(), Action.FILE_ATTRIBUTE, true);
            if (!v) {
                v2 = l0b.v(url.getProtocol(), "https", true);
                if (v2) {
                    URLConnection uRLConnection2 = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                    z65.f(uRLConnection2, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    uRLConnection = (HttpsURLConnection) uRLConnection2;
                } else {
                    URLConnection uRLConnection3 = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                    z65.f(uRLConnection3, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    uRLConnection = (HttpURLConnection) uRLConnection3;
                }
            } else {
                uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            }
            URLConnection uRLConnection4 = uRLConnection;
            UserInfoBuilder userInfo = getClientUseCase().getUserInfo();
            try {
                if (uRLConnection4 instanceof HttpURLConnection) {
                    httpURLConnection2 = (HttpURLConnection) uRLConnection4;
                } else {
                    httpURLConnection2 = null;
                }
                if (httpURLConnection2 != null) {
                    httpURLConnection2.setRequestMethod(NetworkHandler.GET);
                }
                if (userInfo != null) {
                    str = userInfo.getClientId();
                } else {
                    str = null;
                }
                if (str != null) {
                    uRLConnection4.setRequestProperty("X-Ext-Client-ID", userInfo.getClientId());
                }
                AuthHeadersProvider authHeadersProvider = this.authHeadersProvider;
                z65.g(uRLConnection4, "urlConnection");
                authHeadersProvider.setHeadersToUrlConnection(userInfo, uRLConnection4);
                uRLConnection4.setDoOutput(false);
                uRLConnection4.setUseCaches(false);
                uRLConnection4.setDoInput(true);
                uRLConnection4.setConnectTimeout(60000);
                uRLConnection4.setReadTimeout(60000);
                if (uRLConnection4 instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) uRLConnection4).setHostnameVerifier(new HostnameVerifier() { // from class: ut3
                        @Override // javax.net.ssl.HostnameVerifier
                        public final boolean verify(String str2, SSLSession sSLSession) {
                            boolean download$lambda$2;
                            download$lambda$2 = FileDownloader.download$lambda$2(str2, sSLSession);
                            return download$lambda$2;
                        }
                    });
                }
                long j2 = 0;
                if (uRLConnection4 instanceof HttpURLConnection) {
                    l = getFileLength((HttpURLConnection) uRLConnection4);
                    file = null;
                } else {
                    File fileFromFileUrl = getFileFromFileUrl(uRLConnection4);
                    if (fileFromFileUrl != null) {
                        j = fileFromFileUrl.length();
                    } else {
                        j = 0;
                    }
                    Long valueOf = Long.valueOf(j);
                    file = fileFromFileUrl;
                    l = valueOf;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(this.outputFile);
                if (file == null) {
                    bufferedInputStream = new BufferedInputStream(uRLConnection4.getInputStream());
                } else {
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                }
                long currentTimeMillis = System.currentTimeMillis();
                byte[] bArr = new byte[8192];
                int i2 = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read <= 0 || this.isStopped) {
                        break;
                    }
                    fileOutputStream.write(bArr, i, read);
                    j2 += read;
                    if (System.currentTimeMillis() > 50 + currentTimeMillis) {
                        if (l != null) {
                            currentTimeMillis = System.currentTimeMillis();
                            this.downloadListener.onProgress((int) Math.floor((j2 / l.longValue()) * 100));
                        } else {
                            i2 += 2;
                            if (i2 >= 100) {
                                i2 = 0;
                            }
                            this.downloadListener.onProgress(i2);
                        }
                    }
                    i = 0;
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                if (!this.isStopped) {
                    this.downloadListener.onComplete(this.outputFile);
                } else {
                    LoggerEdna.debug("Download stopped.");
                }
                if (uRLConnection4 instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) uRLConnection4;
                } else {
                    httpURLConnection = null;
                }
                if (httpURLConnection == null) {
                    return;
                }
            } catch (Exception e) {
                LoggerEdna.error("First catch called: " + e + ".");
                this.downloadListener.onFileDownloadError(e);
                if (uRLConnection4 instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) uRLConnection4;
                } else {
                    httpURLConnection = null;
                }
                if (httpURLConnection == null) {
                    return;
                }
            }
            httpURLConnection.disconnect();
        } catch (Exception e2) {
            LoggerEdna.error("Second catch called: " + e2);
            this.downloadListener.onFileDownloadError(e2);
        }
    }

    public final void stop() {
        this.isStopped = true;
    }
}
