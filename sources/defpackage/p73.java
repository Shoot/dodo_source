package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.sn0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: DrawCache.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010\u001cJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J?\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012R*\u0010\u001d\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u0016\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001f\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006,"}, d2 = {"Lp73;", "", "Ly73;", "", "a", "Lw55;", "size", "La03;", "density", "Lqm5;", "layoutDirection", "Lkotlin/Function1;", "block", "b", "(JLa03;Lqm5;Lkotlin/jvm/functions/Function1;)V", "target", "", "alpha", "Lwc1;", "colorFilter", c.a, "Leu4;", "Leu4;", "getMCachedImage", "()Leu4;", "setMCachedImage", "(Leu4;)V", "getMCachedImage$annotations", "()V", "mCachedImage", "Lqn0;", "Lqn0;", "cachedCanvas", "La03;", "scopeDensity", DateTokenConverter.CONVERTER_KEY, "Lqm5;", e.a, "J", "Lsn0;", "f", "Lsn0;", "cacheScope", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: p73  reason: default package */
/* loaded from: classes.dex */
public final class p73 {
    private eu4 a;
    private qn0 b;
    private a03 c;
    private qm5 d = qm5.Ltr;
    private long e = w55.b.a();
    private final sn0 f = new sn0();

    private final void a(y73 y73Var) {
        x73.g(y73Var, uc1.b.a(), 0L, 0L, 0.0f, null, null, pc0.b.a(), 62, null);
    }

    public final void b(long j, a03 a03Var, qm5 qm5Var, Function1<? super y73, Unit> function1) {
        z65.h(a03Var, "density");
        z65.h(qm5Var, "layoutDirection");
        z65.h(function1, "block");
        this.c = a03Var;
        this.d = qm5Var;
        eu4 eu4Var = this.a;
        qn0 qn0Var = this.b;
        if (eu4Var == null || qn0Var == null || w55.g(j) > eu4Var.getWidth() || w55.f(j) > eu4Var.getHeight()) {
            eu4Var = gu4.b(w55.g(j), w55.f(j), 0, false, null, 28, null);
            qn0Var = vn0.a(eu4Var);
            this.a = eu4Var;
            this.b = qn0Var;
        }
        this.e = j;
        sn0 sn0Var = this.f;
        long c = x55.c(j);
        sn0.a p = sn0Var.p();
        a03 a = p.a();
        qm5 b = p.b();
        qn0 c2 = p.c();
        long d = p.d();
        sn0.a p2 = sn0Var.p();
        p2.j(a03Var);
        p2.k(qm5Var);
        p2.i(qn0Var);
        p2.l(c);
        qn0Var.l();
        a(sn0Var);
        function1.invoke(sn0Var);
        qn0Var.g();
        sn0.a p3 = sn0Var.p();
        p3.j(a);
        p3.k(b);
        p3.i(c2);
        p3.l(d);
        eu4Var.a();
    }

    public final void c(y73 y73Var, float f, wc1 wc1Var) {
        z65.h(y73Var, "target");
        eu4 eu4Var = this.a;
        if (eu4Var != null) {
            x73.d(y73Var, eu4Var, 0L, this.e, 0L, 0L, f, null, wc1Var, 0, 0, 858, null);
            return;
        }
        throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
    }
}
