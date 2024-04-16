package defpackage;

import defpackage.dv0;
import kotlin.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: ChangeLocationLogicFactory.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u001c\u0010\u0010\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0013"}, d2 = {"Lfv0;", "Lev0;", "Ldt5;", "locality", "", "b", "newLocality", "forceChangeLocality", "Ldv0;", "a", "Ljv5;", "Ljv5;", "localityService", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "<init>", "(Ljv5;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: fv0  reason: default package */
/* loaded from: classes4.dex */
public final class fv0 implements ev0 {
    private final jv5 a;
    private final Logger b;

    public fv0(jv5 jv5Var) {
        z65.h(jv5Var, "localityService");
        this.a = jv5Var;
        this.b = LoggerFactory.getLogger("ChangeLocationLogicFactoryImpl");
    }

    private final boolean b(dt5 dt5Var) {
        try {
            return this.a.g(dt5Var);
        } catch (RuntimeException e) {
            this.b.error("Can't get landing flag", (Throwable) e);
            return false;
        }
    }

    @Override // defpackage.ev0
    public dv0 a(dt5 dt5Var, boolean z) {
        z65.h(dt5Var, "newLocality");
        dt5 i = this.a.i();
        if (b(dt5Var)) {
            return dv0.a.a;
        }
        if (z65.c(i, dt5Var) && !z) {
            return dv0.c.a;
        }
        return dv0.b.a;
    }
}
