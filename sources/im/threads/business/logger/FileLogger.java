package im.threads.business.logger;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import im.threads.business.logger.LogData;
import im.threads.business.logger.LoggerFileThread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FileLogger.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0002JV\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lim/threads/business/logger/FileLogger;", "", "()V", "logQueue", "Ljava/util/concurrent/BlockingQueue;", "Lim/threads/business/logger/LogData;", "ensureThread", "", "logFile", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "fileName", "", "dirPath", "line", CrashHianalyticsData.TIME, "", "retentionPolicy", "Lim/threads/business/logger/LoggerRetentionPolicy;", "maxFileCount", "", "maxTotalSize", "flush", "", "Companion", "InstanceHolder", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileLogger {
    public static final Companion Companion = new Companion(null);
    private final BlockingQueue<LogData> logQueue = new LinkedBlockingDeque();

    /* compiled from: FileLogger.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lim/threads/business/logger/FileLogger$Companion;", "", "()V", "instance", "Lim/threads/business/logger/FileLogger;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FileLogger instance() {
            return InstanceHolder.INSTANCE.getINSTANCE();
        }
    }

    /* compiled from: FileLogger.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u0004¢\u0006\n\n\u0002\b\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lim/threads/business/logger/FileLogger$InstanceHolder;", "", "()V", "INSTANCE", "Lim/threads/business/logger/FileLogger;", "getINSTANCE", "()Lim/threads/business/logger/FileLogger;", "INSTANCE$1", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        public static final InstanceHolder INSTANCE = new InstanceHolder();
        private static final FileLogger INSTANCE$1 = new FileLogger();

        private InstanceHolder() {
        }

        public final FileLogger getINSTANCE() {
            return INSTANCE$1;
        }
    }

    private final void ensureThread() {
        LoggerFileThread.Companion companion = LoggerFileThread.Companion;
        if (!companion.isRunning()) {
            synchronized (this) {
                try {
                    if (!companion.isRunning()) {
                        companion.setRunning(true);
                        LoggerEdna.debug("start file logger thread");
                        new LoggerFileThread(this.logQueue).start();
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void logFile(Context context, String str, String str2, String str3, long j, LoggerRetentionPolicy loggerRetentionPolicy, int i, long j2, boolean z) {
        z65.h(loggerRetentionPolicy, "retentionPolicy");
        ensureThread();
        if (!this.logQueue.offer(new LogData.Builder().context(context).fileName(str).dirPath(str2).line(str3).time(j).retentionPolicy(loggerRetentionPolicy).maxFileCount(i).maxSize(j2).flush(z).build())) {
            LoggerEdna.warning("failed to add to file logger service queue");
        }
    }
}
