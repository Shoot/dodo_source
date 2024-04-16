package im.threads.business.logger;

import android.util.SparseArray;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LoggerLevel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lim/threads/business/logger/LoggerLevel;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "VERBOSE", "DEBUG", "INFO", "WARNING", "ERROR", "FLUSH", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum LoggerLevel {
    VERBOSE(0),
    DEBUG(1),
    INFO(2),
    WARNING(3),
    ERROR(4),
    FLUSH(5);
    
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final LoggerLevel$Companion$levelNames$1 levelNames = new SparseArray<String>() { // from class: im.threads.business.logger.LoggerLevel$Companion$levelNames$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            append(LoggerLevel.VERBOSE.getValue(), "verbose");
            append(LoggerLevel.DEBUG.getValue(), "debug");
            append(LoggerLevel.INFO.getValue(), "info");
            append(LoggerLevel.WARNING.getValue(), "warning");
            append(LoggerLevel.ERROR.getValue(), "error");
            append(LoggerLevel.FLUSH.getValue(), "flush");
        }
    };

    /* compiled from: LoggerLevel.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\n"}, d2 = {"Lim/threads/business/logger/LoggerLevel$Companion;", "", "()V", "levelNames", "im/threads/business/logger/LoggerLevel$Companion$levelNames$1", "Lim/threads/business/logger/LoggerLevel$Companion$levelNames$1;", "getLevelName", "", "level", "Lim/threads/business/logger/LoggerLevel;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getLevelName(LoggerLevel loggerLevel) {
            z65.h(loggerLevel, "level");
            String str = LoggerLevel.levelNames.get(loggerLevel.getValue());
            z65.g(str, "levelNames[level.value]");
            return str;
        }
    }

    LoggerLevel(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
