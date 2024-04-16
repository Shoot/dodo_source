package im.threads.business.logger;

import android.util.Log;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.business.logger.LogData;
import im.threads.business.logger.LoggerFileThread;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
/* compiled from: LoggerFileThread.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 92\u00020\u0001:\u00019B\u0015\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\bH\u0002J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00040)j\b\u0012\u0004\u0012\u00020\u0004`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010(R\u0014\u0010.\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010&R\u0016\u0010/\u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010!R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\b038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0004038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105¨\u0006:"}, d2 = {"Lim/threads/business/logger/LoggerFileThread;", "Ljava/lang/Thread;", "", "checkQueueList", "Lim/threads/business/logger/LogData;", "log", "collectParams", "logLine", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Ljava/io/BufferedWriter;", "getWriter", "createWriter", "startFilesStoring", "", "maxCount", "storeFilesByCount", "", "maxSize", "storeFilesBySize", "dir", "", "ensureDirIsCorrect", "ensureFileIsCorrect", "closeWriter", "run", "Ljava/util/concurrent/BlockingQueue;", "queue", "Ljava/util/concurrent/BlockingQueue;", "writer", "Ljava/io/BufferedWriter;", "", "filePath", "Ljava/lang/String;", "Lim/threads/business/logger/LoggerRetentionPolicy;", "retentionPolicy", "Lim/threads/business/logger/LoggerRetentionPolicy;", "fileMaxCount", "I", "fileMaxSize", "J", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "queueBuffer", "Ljava/util/ArrayList;", "delayBetweenCheckMs", "maxQueueListSize", RemoteMessageConst.Notification.TAG, "Lqx1;", Action.SCOPE_ATTRIBUTE, "Lqx1;", "Ljava/util/Comparator;", "fileComparator", "Ljava/util/Comparator;", "logComparator", "<init>", "(Ljava/util/concurrent/BlockingQueue;)V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class LoggerFileThread extends Thread {
    public static final Companion Companion = new Companion(null);
    private static final cr6<Boolean> flushIsFinishedFlow = uha.b(0, 0, null, 7, null);
    private static volatile boolean isRunning;
    private final long delayBetweenCheckMs;
    private final Comparator<File> fileComparator;
    private int fileMaxCount;
    private long fileMaxSize;
    private String filePath;
    private final Comparator<LogData> logComparator;
    private final int maxQueueListSize;
    private final BlockingQueue<LogData> queue;
    private final ArrayList<LogData> queueBuffer;
    private LoggerRetentionPolicy retentionPolicy;
    private final qx1 scope;
    private final String tag;
    private BufferedWriter writer;

    /* compiled from: LoggerFileThread.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lim/threads/business/logger/LoggerFileThread$Companion;", "", "", "isRunning", "Z", "()Z", "setRunning", "(Z)V", "Lcr6;", "flushIsFinishedFlow", "Lcr6;", "getFlushIsFinishedFlow", "()Lcr6;", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final cr6<Boolean> getFlushIsFinishedFlow() {
            return LoggerFileThread.flushIsFinishedFlow;
        }

        public final boolean isRunning() {
            return LoggerFileThread.isRunning;
        }

        public final void setRunning(boolean z) {
            LoggerFileThread.isRunning = z;
        }
    }

    public LoggerFileThread(BlockingQueue<LogData> blockingQueue) {
        z65.h(blockingQueue, "queue");
        this.queue = blockingQueue;
        this.retentionPolicy = LoggerRetentionPolicy.NONE;
        this.queueBuffer = new ArrayList<>();
        this.delayBetweenCheckMs = 3000L;
        this.maxQueueListSize = 50;
        this.tag = bc9.b(LoggerFileThread.class).d();
        this.scope = rx1.a(v33.d());
        this.fileComparator = new Comparator() { // from class: ux5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int fileComparator$lambda$0;
                fileComparator$lambda$0 = LoggerFileThread.fileComparator$lambda$0((File) obj, (File) obj2);
                return fileComparator$lambda$0;
            }
        };
        this.logComparator = new Comparator() { // from class: vx5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int logComparator$lambda$1;
                logComparator$lambda$1 = LoggerFileThread.logComparator$lambda$1((LogData) obj, (LogData) obj2);
                return logComparator$lambda$1;
            }
        };
    }

    private final void checkQueueList() {
        boolean z;
        int n;
        int n2;
        IntRange m;
        int n3;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = false;
        if (this.queueBuffer.size() > this.maxQueueListSize) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<LogData> arrayList = this.queueBuffer;
        n = kc1.n(arrayList);
        if (currentTimeMillis - arrayList.get(n).getTime() > this.delayBetweenCheckMs) {
            z2 = true;
        }
        ArrayList<LogData> arrayList2 = this.queueBuffer;
        n2 = kc1.n(arrayList2);
        boolean flush = arrayList2.get(n2).getFlush();
        if (z || z2 || flush) {
            oc1.B(this.queueBuffer, this.logComparator);
            m = kc1.m(this.queueBuffer);
            Iterator<Integer> it = m.iterator();
            while (it.hasNext()) {
                int b = ((q55) it).b();
                LogData logData = this.queueBuffer.get(b);
                z65.g(logData, "queueBuffer[it]");
                LogData logData2 = logData;
                n3 = kc1.n(this.queueBuffer);
                if (b == n3) {
                    logData2.setFlush(true);
                }
                logLine(logData2);
            }
            this.queueBuffer.clear();
        }
    }

    private final void closeWriter() {
        try {
            try {
                BufferedWriter bufferedWriter = this.writer;
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                LoggerEdna.error("Logger", e);
            }
        } finally {
            this.writer = null;
        }
    }

    private final void collectParams(LogData logData) {
        this.retentionPolicy = logData.getRetentionPolicy();
        this.fileMaxCount = logData.getMaxFileCount();
        this.fileMaxSize = logData.getMaxTotalSize();
    }

    private final BufferedWriter createWriter(File file) {
        return new BufferedWriter(new FileWriter(file, true));
    }

    private final boolean ensureDirIsCorrect(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return true;
            }
            if (!file.delete()) {
                String absolutePath = file.getAbsolutePath();
                LoggerEdna.warning("failed to delete dir on log path: [" + absolutePath + "]");
                return false;
            }
        }
        if (file.mkdir()) {
            return true;
        }
        String absolutePath2 = file.getAbsolutePath();
        LoggerEdna.warning("failed to create log dir: [" + absolutePath2 + "]");
        return false;
    }

    private final void ensureFileIsCorrect(File file) {
        if (file.exists() && !file.isFile() && !file.delete()) {
            String absolutePath = file.getAbsolutePath();
            throw new IllegalStateException(("failed to delete dir on log file path: [" + absolutePath + "]").toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int fileComparator$lambda$0(File file, File file2) {
        int i = (file.lastModified() > file2.lastModified() ? 1 : (file.lastModified() == file2.lastModified() ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    private final BufferedWriter getWriter(File file) {
        if (this.writer != null && z65.c(file.getAbsolutePath(), this.filePath)) {
            BufferedWriter bufferedWriter = this.writer;
            z65.e(bufferedWriter);
            return bufferedWriter;
        }
        closeWriter();
        ensureFileIsCorrect(file);
        BufferedWriter createWriter = createWriter(file);
        this.writer = createWriter;
        z65.e(createWriter);
        return createWriter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int logComparator$lambda$1(LogData logData, LogData logData2) {
        if (logData.getTime() < logData2.getTime()) {
            return -1;
        }
        if (logData.getTime() == logData2.getTime()) {
            return 0;
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r0 != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void logLine(im.threads.business.logger.LogData r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getFileName()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L11
            boolean r0 = defpackage.c0b.y(r0)
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            r0 = r0 ^ r2
            java.lang.String r3 = "]"
            if (r0 == 0) goto La4
            java.lang.String r0 = r5.getDirPath()
            if (r0 == 0) goto L23
            boolean r0 = defpackage.c0b.y(r0)
            if (r0 == 0) goto L24
        L23:
            r1 = 1
        L24:
            r0 = r1 ^ 1
            if (r0 == 0) goto L82
            java.lang.String r0 = r5.getLine()
            if (r0 == 0) goto L7a
            boolean r0 = defpackage.c0b.y(r0)
            if (r0 == 0) goto L35
            goto L7a
        L35:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r5.getDirPath()
            r0.<init>(r1)
            boolean r0 = r4.ensureDirIsCorrect(r0)
            if (r0 != 0) goto L4c
            java.lang.String r5 = r4.tag
            java.lang.String r0 = "dir is incorrect"
            android.util.Log.d(r5, r0)
            return
        L4c:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r5.getDirPath()
            java.lang.String r2 = r5.getFileName()
            r0.<init>(r1, r2)
            java.io.BufferedWriter r0 = r4.getWriter(r0)
            java.lang.String r1 = r5.getLine()     // Catch: java.io.IOException -> L73
            r0.write(r1)     // Catch: java.io.IOException -> L73
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.io.IOException -> L73
            boolean r5 = r5.getFlush()     // Catch: java.io.IOException -> L73
            if (r5 == 0) goto L79
            r0.flush()     // Catch: java.io.IOException -> L73
            goto L79
        L73:
            r5 = move-exception
            java.lang.String r0 = "Logger"
            im.threads.business.logger.LoggerEdna.error(r0, r5)
        L79:
            return
        L7a:
            java.lang.String r5 = r4.tag
            java.lang.String r0 = "line is empty"
            android.util.Log.d(r5, r0)
            return
        L82:
            java.lang.String r5 = r5.getDirPath()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invalid directory path: ["
            r0.append(r1)
            r0.append(r5)
            r0.append(r3)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        La4:
            java.lang.String r5 = r5.getFileName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invalid file name: ["
            r0.append(r1)
            r0.append(r5)
            r0.append(r3)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.logger.LoggerFileThread.logLine(im.threads.business.logger.LogData):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void run$lambda$2(Thread thread, Throwable th) {
        th.printStackTrace();
        isRunning = false;
    }

    private final void startFilesStoring() {
        boolean y;
        String str = this.filePath;
        if (str != null) {
            y = l0b.y(str);
            if (!y) {
                LoggerRetentionPolicy loggerRetentionPolicy = this.retentionPolicy;
                if (loggerRetentionPolicy == LoggerRetentionPolicy.FILE_COUNT) {
                    storeFilesByCount(this.fileMaxCount);
                    return;
                } else if (loggerRetentionPolicy == LoggerRetentionPolicy.TOTAL_SIZE) {
                    storeFilesBySize(this.fileMaxSize);
                    return;
                } else {
                    return;
                }
            }
        }
        Log.d(this.tag, "filePath is null");
    }

    private final void storeFilesByCount(int i) {
        File[] listFiles;
        if (i > 0) {
            File parentFile = new File(this.filePath).getParentFile();
            if (parentFile != null && (listFiles = parentFile.listFiles()) != null && listFiles.length > i) {
                Arrays.sort(listFiles, this.fileComparator);
                int length = listFiles.length - i;
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (listFiles[i3].delete()) {
                        i2++;
                    }
                }
                int length2 = listFiles.length;
                LoggerEdna.debug("Logger", "house keeping complete: file count [" + length2 + " -> " + (listFiles.length - i2) + "]");
                return;
            }
            return;
        }
        throw new IllegalStateException(("invalid max file count: " + i).toString());
    }

    private final void storeFilesBySize(long j) {
        File[] listFiles;
        long j2 = 0;
        if (j > 0) {
            File parentFile = new File(this.filePath).getParentFile();
            if (parentFile == null || (listFiles = parentFile.listFiles()) == null) {
                return;
            }
            for (File file : listFiles) {
                j2 += file.length();
            }
            if (j2 <= j) {
                return;
            }
            Arrays.sort(listFiles, this.fileComparator);
            long j3 = j2;
            for (File file2 : listFiles) {
                long length = file2.length();
                if (file2.delete()) {
                    j3 -= length;
                    if (j3 <= j) {
                        break;
                    }
                }
            }
            LoggerEdna.debug("house keeping complete: total size [" + j2 + " -> " + j3 + "]");
            return;
        }
        throw new IllegalStateException(("invalid max total size: " + j).toString());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        super.run();
        Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: tx5
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                LoggerFileThread.run$lambda$2(thread, th);
            }
        });
        while (true) {
            try {
                LogData take = this.queue.take();
                this.queueBuffer.add(take);
                z65.g(take, "log");
                collectParams(take);
                while (true) {
                    LogData poll = this.queue.poll(2L, TimeUnit.SECONDS);
                    LogData logData = poll;
                    if (poll != null) {
                        this.queueBuffer.add(logData);
                        checkQueueList();
                        z65.g(logData, "log");
                        collectParams(logData);
                    }
                }
                closeWriter();
                startFilesStoring();
                sh0.d(this.scope, null, null, new LoggerFileThread$run$3(null), 3, null);
            } catch (InterruptedException e) {
                LoggerEdna.error("file logger service thread is interrupted", e);
                isRunning = false;
                return;
            }
        }
    }
}
