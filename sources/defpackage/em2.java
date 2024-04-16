package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.bm4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: DatabaseConnectorImpl.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J)\u0010\n\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0016\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lem2;", "Lbm4;", "C", "Ldm2;", "", "b", DateTokenConverter.CONVERTER_KEY, "T", "Lkotlin/Function1;", "action", c.a, "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lam2;", "a", "Lam2;", "databaseConnectionDriver", "Lcm2;", "Lcm2;", "databaseConnectionHolder", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "", "isConnected", "()Z", e.a, "()Lbm4;", "connection", "<init>", "(Lam2;Lcm2;)V", "persistence_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: em2  reason: default package */
/* loaded from: classes2.dex */
public final class em2<C extends bm4> implements dm2<C> {
    private final am2<C> a;
    private final cm2<C> b;
    private final Logger c;

    public em2(am2<C> am2Var, cm2<C> cm2Var) {
        z65.h(am2Var, "databaseConnectionDriver");
        z65.h(cm2Var, "databaseConnectionHolder");
        this.a = am2Var;
        this.b = cm2Var;
        this.c = LoggerFactory.getLogger("DatabaseConnectorImpl");
    }

    @Override // defpackage.dm2
    public void b() {
        C a = this.a.c().a();
        a.invalidate();
        this.b.b(a);
        int a2 = this.a.a();
        Logger logger = this.c;
        logger.debug("Open realm connection [instance count = " + a2 + ']');
    }

    @Override // defpackage.dm2
    public <T> T c(Function1<? super C, ? extends T> function1) {
        z65.h(function1, "action");
        k33 k33Var = k33.a;
        long b = k33Var.b();
        Logger logger = this.c;
        logger.trace("executeOnConnectionContext [availableMemory = " + k33Var.a(b) + ']');
        if (isConnected()) {
            return function1.invoke(a());
        }
        b();
        try {
            return function1.invoke(a());
        } finally {
            d();
        }
    }

    public void d() {
        C a = this.b.a();
        if (a != null) {
            a.close();
            int a2 = this.a.a();
            Logger logger = this.c;
            logger.trace("Close realm connection [instance count = " + a2 + ']');
            if (a2 == 0) {
                this.a.b();
            }
        }
        this.b.b(null);
    }

    @Override // defpackage.dm2
    /* renamed from: e */
    public C a() {
        C a = this.b.a();
        if (a != null) {
            if (!a.isClosed()) {
                return a;
            }
            throw new IllegalStateException("Database connection already closed");
        }
        throw new IllegalStateException("Database connection must be used only database thread");
    }

    @Override // defpackage.dm2
    public boolean isConnected() {
        if (this.b.a() != null) {
            return true;
        }
        return false;
    }
}
