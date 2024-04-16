package defpackage;

import ch.qos.logback.core.joran.action.Action;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
/* compiled from: AnalyticsLoggerInterceptor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lnd;", "Lrc;", "Llc;", "consumer", "Lqc;", "event", "a", "Ljava/util/logging/Level;", "Ljava/util/logging/Level;", "getLevel", "()Ljava/util/logging/Level;", "level", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "b", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "logger", "", Action.NAME_ATTRIBUTE, "<init>", "(Ljava/lang/String;Ljava/util/logging/Level;)V", "analytics-core"}, k = 1, mv = {1, 7, 1})
/* renamed from: nd  reason: default package */
/* loaded from: classes.dex */
public final class nd implements rc {
    private final Level a;
    private final Logger b;

    public nd(String str, Level level) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(level, "level");
        this.a = level;
        this.b = Logger.getLogger(str);
    }

    @Override // defpackage.rc
    public qc a(lc lcVar, qc qcVar) {
        z65.h(lcVar, "consumer");
        z65.h(qcVar, "event");
        Logger logger = this.b;
        Level level = this.a;
        logger.log(level, "Send ==> " + lcVar.getClass().getSimpleName());
        Logger logger2 = this.b;
        Level level2 = this.a;
        logger2.log(level2, "Event: " + qcVar.c());
        Logger logger3 = this.b;
        Level level3 = this.a;
        logger3.log(level3, "Sum: " + qcVar.e());
        Logger logger4 = this.b;
        Level level4 = this.a;
        logger4.log(level4, "Params: " + qcVar.d());
        return qcVar;
    }
}
