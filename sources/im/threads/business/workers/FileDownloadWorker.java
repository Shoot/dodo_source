package im.threads.business.workers;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import defpackage.aa7;
import im.threads.business.broadcastReceivers.ProgressReceiver;
import im.threads.business.config.BaseConfig;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.FileDescription;
import im.threads.business.models.FileDescriptionUri;
import im.threads.business.models.enums.AttachmentStateEnum;
import im.threads.business.preferences.Preferences;
import im.threads.business.secureDatabase.DatabaseHolder;
import im.threads.business.transport.AuthHeadersProvider;
import im.threads.business.utils.FileDownloader;
import im.threads.business.utils.FileProvider;
import im.threads.business.utils.FileUtils;
import im.threads.business.utils.WorkerUtils;
import java.io.File;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FileDownloadWorker.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0001/B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R2\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u0011j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012`\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010)¨\u00060"}, d2 = {"Lim/threads/business/workers/FileDownloadWorker;", "Landroidx/work/Worker;", "Lim/threads/business/models/FileDescription;", "fileDescription", "", "sendDownloadProgressBroadcast", "sendFinishBroadcast", "", "throwable", "sendDownloadErrorBroadcast", "Landroidx/work/ListenableWorker$a;", "doWork", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/util/HashMap;", "Lim/threads/business/utils/FileDownloader;", "Lkotlin/collections/HashMap;", "runningDownloads", "Ljava/util/HashMap;", "Lim/threads/business/preferences/Preferences;", "preferences$delegate", "Lrn5;", "getPreferences", "()Lim/threads/business/preferences/Preferences;", "preferences", "Lim/threads/business/secureDatabase/DatabaseHolder;", "database$delegate", "getDatabase", "()Lim/threads/business/secureDatabase/DatabaseHolder;", "database", "Lim/threads/business/transport/AuthHeadersProvider;", "authHeadersProvider$delegate", "getAuthHeadersProvider", "()Lim/threads/business/transport/AuthHeadersProvider;", "authHeadersProvider", "Lim/threads/business/utils/FileProvider;", "fileProvider$delegate", "getFileProvider", "()Lim/threads/business/utils/FileProvider;", "fileProvider", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class FileDownloadWorker extends Worker {
    public static final Companion Companion = new Companion(null);
    public static final String FD_TAG = "im.threads.business.workers.FileDownloadWorker.FD_TAG";
    public static final String PREVIEW_TAG = "im.threads.business.workers.FileDownloadWorker.PREVIEW_TAG";
    public static final String START_DOWNLOAD_ACTION = "im.threads.business.workers.FileDownloadWorker.Action";
    public static final String START_DOWNLOAD_FD_TAG = "im.threads.business.workers.FileDownloadWorker.START_DOWNLOAD_FD_TAG";
    public static final String START_DOWNLOAD_WITH_NO_STOP = "im.threads.business.workers.FileDownloadWorker.START_DOWNLOAD_WITH_NO_STOP";
    private static final String WORKER_NAME = "im.threads.business.workers.FileDownloadWorker";
    private final rn5 authHeadersProvider$delegate;
    private final Context context;
    private final rn5 database$delegate;
    private final rn5 fileProvider$delegate;
    private final rn5 preferences$delegate;
    private HashMap<FileDescription, FileDownloader> runningDownloads;

    /* compiled from: FileDownloadWorker.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lim/threads/business/workers/FileDownloadWorker$Companion;", "", "()V", "FD_TAG", "", "PREVIEW_TAG", "START_DOWNLOAD_ACTION", "START_DOWNLOAD_FD_TAG", "START_DOWNLOAD_WITH_NO_STOP", "WORKER_NAME", "startDownload", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "fileDescription", "Lim/threads/business/models/FileDescription;", "isDownloadNonstop", "", "isPreview", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void startDownload$default(Companion companion, Context context, FileDescription fileDescription, boolean z, boolean z2, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                z2 = false;
            }
            companion.startDownload(context, fileDescription, z, z2);
        }

        public final synchronized void startDownload(Context context, FileDescription fileDescription, boolean z, boolean z2) {
            String str;
            try {
                z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
                z65.h(fileDescription, "fileDescription");
                if (z) {
                    str = FileDownloadWorker.START_DOWNLOAD_WITH_NO_STOP;
                } else {
                    str = FileDownloadWorker.START_DOWNLOAD_FD_TAG;
                }
                b.a f = new b.a().h(FileDownloadWorker.START_DOWNLOAD_ACTION, str).e(FileDownloadWorker.PREVIEW_TAG, z2).f(FileDownloadWorker.FD_TAG, WorkerUtils.INSTANCE.marshall(fileDescription));
                z65.g(f, "Builder()\n              …arshall(fileDescription))");
                aa7 b = new aa7.a(FileDownloadWorker.class).h(f.a()).b();
                z65.g(b, "OneTimeWorkRequestBuilde…\n                .build()");
                h7c i = h7c.i(context);
                String downloadPath = fileDescription.getDownloadPath();
                i.f(FileDownloadWorker.WORKER_NAME + downloadPath, ym3.KEEP, b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileDownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        rn5 b;
        rn5 b2;
        rn5 b3;
        rn5 b4;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(workerParameters, "workerParameters");
        this.context = context;
        this.runningDownloads = new HashMap<>();
        b = yn5.b(FileDownloadWorker$special$$inlined$inject$1.INSTANCE);
        this.preferences$delegate = b;
        b2 = yn5.b(FileDownloadWorker$special$$inlined$inject$2.INSTANCE);
        this.database$delegate = b2;
        b3 = yn5.b(FileDownloadWorker$special$$inlined$inject$3.INSTANCE);
        this.authHeadersProvider$delegate = b3;
        b4 = yn5.b(FileDownloadWorker$special$$inlined$inject$4.INSTANCE);
        this.fileProvider$delegate = b4;
    }

    private final AuthHeadersProvider getAuthHeadersProvider() {
        return (AuthHeadersProvider) this.authHeadersProvider$delegate.getValue();
    }

    public final DatabaseHolder getDatabase() {
        return (DatabaseHolder) this.database$delegate.getValue();
    }

    public final FileProvider getFileProvider() {
        return (FileProvider) this.fileProvider$delegate.getValue();
    }

    private final Preferences getPreferences() {
        return (Preferences) this.preferences$delegate.getValue();
    }

    public final void sendDownloadErrorBroadcast(FileDescription fileDescription, Throwable th) {
        cs5.b(this.context).d(new Intent(ProgressReceiver.DOWNLOAD_ERROR_BROADCAST).putExtra(FD_TAG, fileDescription).putExtra(ProgressReceiver.DOWNLOAD_ERROR_BROADCAST, th));
    }

    public final void sendDownloadProgressBroadcast(FileDescription fileDescription) {
        cs5.b(this.context).d(new Intent(ProgressReceiver.PROGRESS_BROADCAST).putExtra(FD_TAG, fileDescription));
    }

    public final void sendFinishBroadcast(FileDescription fileDescription) {
        cs5.b(this.context).d(new Intent(ProgressReceiver.DOWNLOADED_SUCCESSFULLY_BROADCAST).putExtra(FD_TAG, fileDescription));
    }

    public static final synchronized void startDownload(Context context, FileDescription fileDescription, boolean z, boolean z2) {
        synchronized (FileDownloadWorker.class) {
            Companion.startDownload(context, fileDescription, z, z2);
        }
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        Parcel parcel;
        final boolean i = getInputData().i(PREVIEW_TAG, false);
        byte[] j = getInputData().j(FD_TAG);
        if (j != null) {
            parcel = WorkerUtils.INSTANCE.unmarshall(j);
        } else {
            parcel = null;
        }
        final FileDescription createFromParcel = FileDescription.CREATOR.createFromParcel(parcel);
        if (createFromParcel == null) {
            ListenableWorker.a a = ListenableWorker.a.a();
            z65.g(a, "failure()");
            return a;
        } else if (createFromParcel.getDownloadPath() != null && createFromParcel.getFileUri() == null) {
            if (createFromParcel.getState() != AttachmentStateEnum.READY) {
                LoggerEdna.error("cant download with fileDescription = " + createFromParcel + ". File state not READY");
                ListenableWorker.a a2 = ListenableWorker.a.a();
                z65.g(a2, "failure()");
                return a2;
            } else if (this.runningDownloads.containsKey(createFromParcel)) {
                ListenableWorker.a a3 = ListenableWorker.a.a();
                z65.g(a3, "failure()");
                return a3;
            } else {
                String downloadPath = createFromParcel.getDownloadPath();
                z65.e(downloadPath);
                FileDownloader fileDownloader = new FileDownloader(downloadPath, FileUtils.generateFileName(createFromParcel), this.context, new FileDownloader.DownloadListener() { // from class: im.threads.business.workers.FileDownloadWorker$doWork$fileDownloader$1
                    @Override // im.threads.business.utils.FileDownloader.DownloadListener
                    public void onComplete(File file) {
                        FileProvider fileProvider;
                        HashMap hashMap;
                        DatabaseHolder database;
                        z65.h(file, Action.FILE_ATTRIBUTE);
                        FileDescription.this.setDownloadProgress(100);
                        fileProvider = this.getFileProvider();
                        Uri uriForFile = fileProvider.getUriForFile(BaseConfig.Companion.getInstance().context, file);
                        FileDescription.this.setFileUri(uriForFile);
                        if (!i) {
                            database = this.getDatabase();
                            database.updateFileDescription(FileDescription.this);
                        }
                        hashMap = this.runningDownloads;
                        hashMap.remove(FileDescription.this);
                        this.sendFinishBroadcast(FileDescription.this);
                        ks8<FileDescriptionUri> onCompleteSubject = FileDescription.this.getOnCompleteSubject();
                        String downloadPath2 = FileDescription.this.getDownloadPath();
                        if (downloadPath2 == null) {
                            downloadPath2 = "";
                        }
                        onCompleteSubject.d(new FileDescriptionUri(downloadPath2, uriForFile));
                    }

                    @Override // im.threads.business.utils.FileDownloader.DownloadListener
                    public void onFileDownloadError(Exception exc) {
                        DatabaseHolder database;
                        LoggerEdna.error("error while downloading file: " + exc);
                        FileDescription.this.setDownloadProgress(0);
                        if (!i) {
                            database = this.getDatabase();
                            database.updateFileDescription(FileDescription.this);
                        }
                        if (exc != null) {
                            this.sendDownloadErrorBroadcast(FileDescription.this, exc);
                        }
                    }

                    @Override // im.threads.business.utils.FileDownloader.DownloadListener
                    public void onProgress(double d) {
                        DatabaseHolder database;
                        if (d < 1.0d) {
                            d = 1.0d;
                        }
                        FileDescription.this.setDownloadProgress((int) d);
                        if (!i) {
                            database = this.getDatabase();
                            database.updateFileDescription(FileDescription.this);
                            this.sendDownloadProgressBroadcast(FileDescription.this);
                        }
                    }
                }, getPreferences(), getAuthHeadersProvider());
                if (z65.c(START_DOWNLOAD_FD_TAG, getInputData().m(START_DOWNLOAD_ACTION))) {
                    if (this.runningDownloads.containsKey(createFromParcel)) {
                        FileDownloader fileDownloader2 = this.runningDownloads.get(createFromParcel);
                        this.runningDownloads.remove(createFromParcel);
                        if (fileDownloader2 != null) {
                            fileDownloader2.stop();
                        }
                        createFromParcel.setDownloadProgress(0);
                        sendDownloadProgressBroadcast(createFromParcel);
                        if (!i) {
                            getDatabase().updateFileDescription(createFromParcel);
                        }
                    } else {
                        this.runningDownloads.put(createFromParcel, fileDownloader);
                        createFromParcel.setDownloadProgress(1);
                        sendDownloadProgressBroadcast(createFromParcel);
                        this.runningDownloads.put(createFromParcel, fileDownloader);
                        fileDownloader.download();
                    }
                } else if (z65.c(START_DOWNLOAD_WITH_NO_STOP, getInputData().m(START_DOWNLOAD_ACTION)) && !this.runningDownloads.containsKey(createFromParcel)) {
                    this.runningDownloads.put(createFromParcel, fileDownloader);
                    createFromParcel.setDownloadProgress(1);
                    sendDownloadProgressBroadcast(createFromParcel);
                    this.runningDownloads.put(createFromParcel, fileDownloader);
                    fileDownloader.download();
                }
                ListenableWorker.a c = ListenableWorker.a.c();
                z65.g(c, "success()");
                return c;
            }
        } else {
            LoggerEdna.error("cant download with fileDescription = " + createFromParcel);
            ListenableWorker.a a4 = ListenableWorker.a.a();
            z65.g(a4, "failure()");
            return a4;
        }
    }

    public final Context getContext() {
        return this.context;
    }
}
