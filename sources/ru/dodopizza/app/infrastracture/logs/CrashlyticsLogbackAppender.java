package ru.dodopizza.app.infrastracture.logs;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.ThrowableProxy;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.Layout;
import com.google.firebase.crashlytics.a;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Metadata;
import retrofit2.HttpException;
import ru.dodopizza.backend.client.common.error.APIRequestExecuteException;
/* compiled from: CrashlyticsLogbackAppender.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0014R$\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lru/dodopizza/app/infrastracture/logs/CrashlyticsLogbackAppender;", "Lch/qos/logback/core/AppenderBase;", "Lch/qos/logback/classic/spi/ILoggingEvent;", "", "throwable", "", "b", "Lch/qos/logback/classic/Level;", "level", "", "a", "eventObject", "", "append", "Lch/qos/logback/classic/encoder/PatternLayoutEncoder;", "Lch/qos/logback/classic/encoder/PatternLayoutEncoder;", "getEncoder", "()Lch/qos/logback/classic/encoder/PatternLayoutEncoder;", "setEncoder", "(Lch/qos/logback/classic/encoder/PatternLayoutEncoder;)V", "encoder", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CrashlyticsLogbackAppender extends AppenderBase<ILoggingEvent> {
    private PatternLayoutEncoder a;

    private final String a(Level level) {
        int i = level.levelInt;
        if (i != Integer.MIN_VALUE) {
            if (i != 5000) {
                if (i != 10000) {
                    if (i == 20000) {
                        return "I";
                    }
                    if (i != 30000) {
                        if (i != 40000) {
                            return "I";
                        }
                        return "E";
                    }
                    return "W";
                }
                return "D";
            }
            return "V";
        }
        return "A";
    }

    private final boolean b(Throwable th) {
        if (!(th instanceof UnknownHostException) && !(th instanceof ConnectException) && !(th instanceof SocketException) && !(th instanceof HttpException) && !(th instanceof SSLHandshakeException) && !(th instanceof SocketTimeoutException) && !(th instanceof APIRequestExecuteException) && !(th.getCause() instanceof UnknownHostException) && !(th.getCause() instanceof ConnectException) && !(th.getCause() instanceof SocketException) && !(th.getCause() instanceof HttpException) && !(th.getCause() instanceof SSLHandshakeException) && !(th.getCause() instanceof SocketTimeoutException) && !(th.getCause() instanceof APIRequestExecuteException)) {
            return false;
        }
        return true;
    }

    public final PatternLayoutEncoder getEncoder() {
        return this.a;
    }

    public final void setEncoder(PatternLayoutEncoder patternLayoutEncoder) {
        this.a = patternLayoutEncoder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ch.qos.logback.core.AppenderBase
    public void append(ILoggingEvent iLoggingEvent) {
        IThrowableProxy throwableProxy;
        Layout<ILoggingEvent> layout;
        z65.h(iLoggingEvent, "eventObject");
        a a = a.a();
        z65.g(a, "getInstance(...)");
        if (isStarted()) {
            Level level = iLoggingEvent.getLevel();
            z65.g(level, "getLevel(...)");
            String a2 = a(level);
            PatternLayoutEncoder patternLayoutEncoder = this.a;
            a.c(a2 + ": " + ((patternLayoutEncoder == null || (layout = patternLayoutEncoder.getLayout()) == null) ? null : layout.doLayout(iLoggingEvent)));
            if (iLoggingEvent.getLevel().levelInt != 40000) {
                iLoggingEvent = null;
            }
            if (iLoggingEvent == null || (throwableProxy = iLoggingEvent.getThrowableProxy()) == null || !(throwableProxy instanceof ThrowableProxy)) {
                return;
            }
            ThrowableProxy throwableProxy2 = (ThrowableProxy) throwableProxy;
            if (throwableProxy2.getThrowable() != null) {
                Throwable throwable = throwableProxy2.getThrowable();
                z65.g(throwable, "getThrowable(...)");
                if (b(throwable)) {
                    return;
                }
                a.d(throwableProxy2.getThrowable());
            }
        }
    }
}
