package defpackage;

import defpackage.gi1;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ComboMenuItemVOProvider.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Llh1;", "Lkh1;", "Lqd6;", "menuItem", "Lye6;", "a", "Lgi1;", "Lgi1;", "comboSlotsService", "<init>", "(Lgi1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: lh1  reason: default package */
/* loaded from: classes4.dex */
public final class lh1 implements kh1 {
    private final gi1 a;

    public lh1(gi1 gi1Var) {
        z65.h(gi1Var, "comboSlotsService");
        this.a = gi1Var;
    }

    @Override // defpackage.kh1
    public ye6 a(qd6 qd6Var) {
        hn6 hn6Var;
        z65.h(qd6Var, "menuItem");
        List a = gi1.a.a(this.a, qd6Var.f(), "", true, null, 8, null);
        hn6 k = qd6Var.k();
        List<fi1> list = a;
        hn6 f = kn6.f();
        for (fi1 fi1Var : list) {
            f = rn6.f(f, fi1Var.d());
        }
        hn6 f2 = rn6.f(k, f);
        hn6 f3 = kn6.f();
        for (fi1 fi1Var2 : list) {
            f3 = rn6.f(f3, fi1Var2.f());
        }
        Integer num = null;
        if (f3.a() > f2.a()) {
            hn6Var = f3;
        } else {
            hn6Var = null;
        }
        String f4 = qd6Var.f();
        String h = qd6Var.h();
        String i = qd6Var.i();
        km8 a2 = de6.a(qd6Var);
        String d = qd6Var.d();
        String c = qd6Var.c();
        re6 re6Var = re6.d;
        kl8 b = qd6Var.b();
        String g = qd6Var.g();
        Collection<qja> d2 = de6.d(qd6Var);
        if (d2 != null) {
            num = Integer.valueOf(d2.size());
        }
        return new rc9(f4, h, i, a2, d, c, re6Var, b, g, qd6Var.p(), qd6Var.a(), qd6Var.m(), qd6Var.k(), qd6Var.j(), ((Number) mh5.c(num, 1)).intValue(), hn6Var, false, 0L, hf6.a, 196608, null);
    }
}
