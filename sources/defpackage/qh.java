package defpackage;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;
/* compiled from: AndroidLog.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lqh;", "Ljava/util/logging/Handler;", "Ljava/util/logging/LogRecord;", "record", "", "publish", "flush", "close", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: qh  reason: default package */
/* loaded from: classes3.dex */
public final class qh extends Handler {
    public static final qh a = new qh();

    private qh() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        int b;
        z65.h(logRecord, "record");
        ph phVar = ph.a;
        String loggerName = logRecord.getLoggerName();
        z65.g(loggerName, "getLoggerName(...)");
        b = rh.b(logRecord);
        String message = logRecord.getMessage();
        z65.g(message, "getMessage(...)");
        phVar.a(loggerName, b, message, logRecord.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
