package im.threads.business.broadcastReceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.support.api.entity.core.CommonCode;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.FileDescription;
import im.threads.business.workers.FileDownloadWorker;
import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ProgressReceiver.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0002\f\rB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lim/threads/business/broadcastReceivers/ProgressReceiver;", "Landroid/content/BroadcastReceiver;", "callback", "Lim/threads/business/broadcastReceivers/ProgressReceiver$Callback;", "(Lim/threads/business/broadcastReceivers/ProgressReceiver$Callback;)V", "Ljava/lang/ref/SoftReference;", "onReceive", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "Callback", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProgressReceiver extends BroadcastReceiver {
    public static final Companion Companion = new Companion(null);
    public static final String DOWNLOADED_SUCCESSFULLY_BROADCAST = "im.threads.internal.controllers.DOWNLOADED_SUCCESSFULLY_BROADCAST";
    public static final String DOWNLOAD_ERROR_BROADCAST = "im.threads.internal.controllers.DOWNLOAD_ERROR_BROADCAST";
    public static final String PROGRESS_BROADCAST = "im.threads.internal.controllers.PROGRESS_BROADCAST";
    private final SoftReference<Callback> callback;

    /* compiled from: ProgressReceiver.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\t"}, d2 = {"Lim/threads/business/broadcastReceivers/ProgressReceiver$Callback;", "", "onDownloadError", "", "fileDescription", "Lim/threads/business/models/FileDescription;", "throwable", "", "updateProgress", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Callback {
        void onDownloadError(FileDescription fileDescription, Throwable th);

        void updateProgress(FileDescription fileDescription);
    }

    /* compiled from: ProgressReceiver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lim/threads/business/broadcastReceivers/ProgressReceiver$Companion;", "", "()V", "DOWNLOADED_SUCCESSFULLY_BROADCAST", "", "DOWNLOAD_ERROR_BROADCAST", "PROGRESS_BROADCAST", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ProgressReceiver(Callback callback) {
        this.callback = new SoftReference<>(callback);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Callback callback;
        FileDescription fileDescription;
        Callback callback2;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode != 475684044) {
            if (hashCode != 867285192) {
                if (hashCode == 1749463880 && action.equals(PROGRESS_BROADCAST) && (fileDescription = (FileDescription) intent.getParcelableExtra(FileDownloadWorker.FD_TAG)) != null && (callback2 = this.callback.get()) != null) {
                    callback2.updateProgress(fileDescription);
                }
            } else if (action.equals(DOWNLOADED_SUCCESSFULLY_BROADCAST)) {
                LoggerEdna.info("onReceive: DOWNLOADED_SUCCESSFULLY_BROADCAST ");
                FileDescription fileDescription2 = (FileDescription) intent.getParcelableExtra(FileDownloadWorker.FD_TAG);
                if (fileDescription2 != null) {
                    fileDescription2.setDownloadProgress(100);
                    Callback callback3 = this.callback.get();
                    if (callback3 != null) {
                        callback3.updateProgress(fileDescription2);
                    }
                }
            }
        } else if (action.equals(DOWNLOAD_ERROR_BROADCAST)) {
            LoggerEdna.error("onReceive: DOWNLOAD_ERROR_BROADCAST ");
            FileDescription fileDescription3 = (FileDescription) intent.getParcelableExtra(FileDownloadWorker.FD_TAG);
            if (fileDescription3 != null && (callback = this.callback.get()) != null) {
                callback.onDownloadError(fileDescription3, (Throwable) intent.getSerializableExtra(DOWNLOAD_ERROR_BROADCAST));
            }
        }
    }
}
