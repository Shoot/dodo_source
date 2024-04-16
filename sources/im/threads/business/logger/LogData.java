package im.threads.business.logger;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;
/* compiled from: LogData.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001'B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001e¨\u0006("}, d2 = {"Lim/threads/business/logger/LogData;", "", "builder", "Lim/threads/business/logger/LogData$Builder;", "(Lim/threads/business/logger/LogData$Builder;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "dirPath", "", "getDirPath", "()Ljava/lang/String;", "fileName", "getFileName", "flush", "", "getFlush", "()Z", "setFlush", "(Z)V", "line", "getLine", "maxFileCount", "", "getMaxFileCount", "()I", "maxTotalSize", "", "getMaxTotalSize", "()J", "setMaxTotalSize", "(J)V", "retentionPolicy", "Lim/threads/business/logger/LoggerRetentionPolicy;", "getRetentionPolicy", "()Lim/threads/business/logger/LoggerRetentionPolicy;", CrashHianalyticsData.TIME, "getTime", "Builder", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LogData {
    private final Context context;
    private final String dirPath;
    private final String fileName;
    private boolean flush;
    private final String line;
    private final int maxFileCount;
    private long maxTotalSize;
    private final LoggerRetentionPolicy retentionPolicy;
    private final long time;

    /* compiled from: LogData.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00100\u001a\u000201J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u00102\u001a\u00020\u00002\u0006\u00102\u001a\u00020\"J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&¨\u00063"}, d2 = {"Lim/threads/business/logger/LogData$Builder;", "", "()V", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "dirPath", "", "getDirPath", "()Ljava/lang/String;", "setDirPath", "(Ljava/lang/String;)V", "fileName", "getFileName", "setFileName", "flush", "", "getFlush", "()Z", "setFlush", "(Z)V", "line", "getLine", "setLine", "maxFileCount", "", "getMaxFileCount", "()I", "setMaxFileCount", "(I)V", "maxTotalSize", "", "getMaxTotalSize", "()J", "setMaxTotalSize", "(J)V", "retentionPolicy", "Lim/threads/business/logger/LoggerRetentionPolicy;", "getRetentionPolicy", "()Lim/threads/business/logger/LoggerRetentionPolicy;", "setRetentionPolicy", "(Lim/threads/business/logger/LoggerRetentionPolicy;)V", CrashHianalyticsData.TIME, "getTime", "setTime", "build", "Lim/threads/business/logger/LogData;", "maxSize", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Builder {
        private Context context;
        private String dirPath;
        private String fileName;
        private boolean flush;
        private String line;
        private int maxFileCount;
        private long maxTotalSize;
        private LoggerRetentionPolicy retentionPolicy = LoggerRetentionPolicy.NONE;
        private long time;

        public final LogData build() {
            return new LogData(this);
        }

        public final Builder context(Context context) {
            this.context = context;
            return this;
        }

        public final Builder dirPath(String str) {
            this.dirPath = str;
            return this;
        }

        public final Builder fileName(String str) {
            this.fileName = str;
            return this;
        }

        public final Builder flush(boolean z) {
            this.flush = z;
            return this;
        }

        public final Context getContext() {
            return this.context;
        }

        public final String getDirPath() {
            return this.dirPath;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final boolean getFlush() {
            return this.flush;
        }

        public final String getLine() {
            return this.line;
        }

        public final int getMaxFileCount() {
            return this.maxFileCount;
        }

        public final long getMaxTotalSize() {
            return this.maxTotalSize;
        }

        public final LoggerRetentionPolicy getRetentionPolicy() {
            return this.retentionPolicy;
        }

        public final long getTime() {
            return this.time;
        }

        public final Builder line(String str) {
            this.line = str;
            return this;
        }

        public final Builder maxFileCount(int i) {
            this.maxFileCount = i;
            return this;
        }

        public final Builder maxSize(long j) {
            this.maxTotalSize = j;
            return this;
        }

        public final Builder retentionPolicy(LoggerRetentionPolicy loggerRetentionPolicy) {
            z65.h(loggerRetentionPolicy, "retentionPolicy");
            this.retentionPolicy = loggerRetentionPolicy;
            return this;
        }

        public final void setContext(Context context) {
            this.context = context;
        }

        public final void setDirPath(String str) {
            this.dirPath = str;
        }

        public final void setFileName(String str) {
            this.fileName = str;
        }

        public final void setFlush(boolean z) {
            this.flush = z;
        }

        public final void setLine(String str) {
            this.line = str;
        }

        public final void setMaxFileCount(int i) {
            this.maxFileCount = i;
        }

        public final void setMaxTotalSize(long j) {
            this.maxTotalSize = j;
        }

        public final void setRetentionPolicy(LoggerRetentionPolicy loggerRetentionPolicy) {
            z65.h(loggerRetentionPolicy, "<set-?>");
            this.retentionPolicy = loggerRetentionPolicy;
        }

        public final void setTime(long j) {
            this.time = j;
        }

        public final Builder time(long j) {
            this.time = j;
            return this;
        }
    }

    public LogData(Builder builder) {
        z65.h(builder, "builder");
        this.context = builder.getContext();
        this.fileName = builder.getFileName();
        this.dirPath = builder.getDirPath();
        this.line = builder.getLine();
        this.time = builder.getTime();
        this.retentionPolicy = builder.getRetentionPolicy();
        this.maxFileCount = builder.getMaxFileCount();
        this.maxTotalSize = builder.getMaxTotalSize();
        this.flush = builder.getFlush();
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getDirPath() {
        return this.dirPath;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final boolean getFlush() {
        return this.flush;
    }

    public final String getLine() {
        return this.line;
    }

    public final int getMaxFileCount() {
        return this.maxFileCount;
    }

    public final long getMaxTotalSize() {
        return this.maxTotalSize;
    }

    public final LoggerRetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setFlush(boolean z) {
        this.flush = z;
    }

    public final void setMaxTotalSize(long j) {
        this.maxTotalSize = j;
    }
}
