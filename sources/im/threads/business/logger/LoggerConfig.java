package im.threads.business.logger;

import android.content.Context;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LoggerConfig.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0002\t\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lim/threads/business/logger/LoggerConfig;", "", "builder", "Lim/threads/business/logger/LoggerConfig$Builder;", "(Lim/threads/business/logger/LoggerConfig$Builder;)V", "getBuilder", "()Lim/threads/business/logger/LoggerConfig$Builder;", "toString", "", "Builder", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoggerConfig {
    public static final Companion Companion = new Companion(null);
    private static LoggerConfig config;
    private final Builder builder;

    /* compiled from: LoggerConfig.kt */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u00106\u001a\u000207J\u0010\u00108\u001a\u00020\u00002\b\u00108\u001a\u0004\u0018\u000109J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\u0000J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010:\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%J\u000e\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020+J\u000e\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u000201R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u000201X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006="}, d2 = {"Lim/threads/business/logger/LoggerConfig$Builder;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext$threads_release", "()Landroid/content/Context;", "dirPath", "", "getDirPath$threads_release", "()Ljava/lang/String;", "setDirPath$threads_release", "(Ljava/lang/String;)V", "fileName", "getFileName$threads_release", "setFileName$threads_release", "formatter", "Lim/threads/business/logger/LoggerFileFormatter;", "getFormatter$threads_release", "()Lim/threads/business/logger/LoggerFileFormatter;", "logToFile", "", "getLogToFile$threads_release", "()Z", "setLogToFile$threads_release", "(Z)V", "logger", "Lim/threads/business/logger/LogcatLogger;", "getLogger$threads_release", "()Lim/threads/business/logger/LogcatLogger;", "maxFileCount", "", "getMaxFileCount$threads_release", "()I", "setMaxFileCount$threads_release", "(I)V", "maxSize", "", "getMaxSize$threads_release", "()J", "setMaxSize$threads_release", "(J)V", "minLevel", "Lim/threads/business/logger/LoggerLevel;", "getMinLevel$threads_release", "()Lim/threads/business/logger/LoggerLevel;", "setMinLevel$threads_release", "(Lim/threads/business/logger/LoggerLevel;)V", "retentionPolicy", "Lim/threads/business/logger/LoggerRetentionPolicy;", "getRetentionPolicy$threads_release", "()Lim/threads/business/logger/LoggerRetentionPolicy;", "setRetentionPolicy$threads_release", "(Lim/threads/business/logger/LoggerRetentionPolicy;)V", "build", "Lim/threads/business/logger/LoggerConfig;", "dir", "Ljava/io/File;", "maxTotalSize", "minLogLevel", "level", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Builder {
        private final Context context;
        private String dirPath;
        private String fileName;
        private final LoggerFileFormatter formatter;
        private boolean logToFile;
        private final LogcatLogger logger;
        private int maxFileCount;
        private long maxSize;
        private LoggerLevel minLevel;
        private LoggerRetentionPolicy retentionPolicy;

        /* compiled from: LoggerConfig.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LoggerRetentionPolicy.values().length];
                try {
                    iArr[LoggerRetentionPolicy.FILE_COUNT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LoggerRetentionPolicy.TOTAL_SIZE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LoggerRetentionPolicy.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Builder(Context context) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            Context applicationContext = context.getApplicationContext();
            z65.g(applicationContext, "context.applicationContext");
            this.context = applicationContext;
            this.logger = new LogcatLogger();
            this.formatter = new LoggerFileFormatter();
            this.minLevel = LoggerLevel.VERBOSE;
            this.retentionPolicy = LoggerRetentionPolicy.FILE_COUNT;
            this.maxFileCount = 168;
            this.maxSize = 33554432L;
        }

        public final LoggerConfig build() {
            if (this.logToFile) {
                String str = this.dirPath;
                if (str == null || str.length() == 0) {
                    File externalFilesDir = this.context.getExternalFilesDir("log");
                    if (externalFilesDir != null) {
                        this.dirPath = externalFilesDir.getAbsolutePath();
                    } else {
                        Log.e("Logger", "failed to get log file directory");
                    }
                }
                int i = WhenMappings.$EnumSwitchMapping$0[this.retentionPolicy.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            throw new IllegalArgumentException("Retention policy must be FILE_COUNT or TOTAL_SIZE".toString());
                        }
                    } else if (this.maxSize <= 0) {
                        throw new IllegalArgumentException("max total size must be > 0".toString());
                    }
                } else if (this.maxFileCount <= 0) {
                    throw new IllegalArgumentException("max file count must be > 0".toString());
                }
            }
            return new LoggerConfig(this);
        }

        public final Builder dir(File file) {
            String absolutePath;
            if (file != null) {
                String name = file.getName();
                z65.g(name, "dir.name");
                if (name.length() != 0) {
                    absolutePath = file.getAbsolutePath();
                    this.dirPath = absolutePath;
                    return this;
                }
            }
            absolutePath = new File(this.context.getFilesDir(), "logs").getAbsolutePath();
            this.dirPath = absolutePath;
            return this;
        }

        public final Builder fileName(String str) {
            z65.h(str, "fileName");
            if (str.length() > 0) {
                this.fileName = str;
            }
            return this;
        }

        public final Context getContext$threads_release() {
            return this.context;
        }

        public final String getDirPath$threads_release() {
            return this.dirPath;
        }

        public final String getFileName$threads_release() {
            return this.fileName;
        }

        public final LoggerFileFormatter getFormatter$threads_release() {
            return this.formatter;
        }

        public final boolean getLogToFile$threads_release() {
            return this.logToFile;
        }

        public final LogcatLogger getLogger$threads_release() {
            return this.logger;
        }

        public final int getMaxFileCount$threads_release() {
            return this.maxFileCount;
        }

        public final long getMaxSize$threads_release() {
            return this.maxSize;
        }

        public final LoggerLevel getMinLevel$threads_release() {
            return this.minLevel;
        }

        public final LoggerRetentionPolicy getRetentionPolicy$threads_release() {
            return this.retentionPolicy;
        }

        public final Builder logToFile() {
            this.logToFile = true;
            return this;
        }

        public final Builder maxFileCount(int i) {
            this.maxFileCount = i;
            return this;
        }

        public final Builder maxTotalSize(long j) {
            this.maxSize = j;
            return this;
        }

        public final Builder minLogLevel(LoggerLevel loggerLevel) {
            z65.h(loggerLevel, "level");
            this.minLevel = loggerLevel;
            return this;
        }

        public final Builder retentionPolicy(LoggerRetentionPolicy loggerRetentionPolicy) {
            z65.h(loggerRetentionPolicy, "retentionPolicy");
            this.retentionPolicy = loggerRetentionPolicy;
            return this;
        }

        public final void setDirPath$threads_release(String str) {
            this.dirPath = str;
        }

        public final void setFileName$threads_release(String str) {
            this.fileName = str;
        }

        public final void setLogToFile$threads_release(boolean z) {
            this.logToFile = z;
        }

        public final void setMaxFileCount$threads_release(int i) {
            this.maxFileCount = i;
        }

        public final void setMaxSize$threads_release(long j) {
            this.maxSize = j;
        }

        public final void setMinLevel$threads_release(LoggerLevel loggerLevel) {
            z65.h(loggerLevel, "<set-?>");
            this.minLevel = loggerLevel;
        }

        public final void setRetentionPolicy$threads_release(LoggerRetentionPolicy loggerRetentionPolicy) {
            z65.h(loggerRetentionPolicy, "<set-?>");
            this.retentionPolicy = loggerRetentionPolicy;
        }
    }

    /* compiled from: LoggerConfig.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lim/threads/business/logger/LoggerConfig$Companion;", "", "()V", "config", "Lim/threads/business/logger/LoggerConfig;", "getConfig", "()Lim/threads/business/logger/LoggerConfig;", "setConfig", "(Lim/threads/business/logger/LoggerConfig;)V", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LoggerConfig getConfig() {
            return LoggerConfig.config;
        }

        public final void setConfig(LoggerConfig loggerConfig) {
            LoggerConfig.config = loggerConfig;
        }
    }

    public LoggerConfig(Builder builder) {
        z65.h(builder, "builder");
        this.builder = builder;
    }

    public final Builder getBuilder() {
        return this.builder;
    }

    public String toString() {
        String dirPath$threads_release = this.builder.getDirPath$threads_release();
        String fileName$threads_release = this.builder.getFileName$threads_release();
        LoggerLevel minLevel$threads_release = this.builder.getMinLevel$threads_release();
        boolean logToFile$threads_release = this.builder.getLogToFile$threads_release();
        String name = this.builder.getRetentionPolicy$threads_release().name();
        int maxFileCount$threads_release = this.builder.getMaxFileCount$threads_release();
        long maxSize$threads_release = this.builder.getMaxSize$threads_release();
        return "Logger config: dirPath: " + dirPath$threads_release + " | fileName: " + fileName$threads_release + " | minLevel: " + minLevel$threads_release + " | logToFile: " + logToFile$threads_release + " | retentionPolicy: " + name + " | maxFileCount: " + maxFileCount$threads_release + " | maxSize: " + maxSize$threads_release + ",";
    }
}
