package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p;
import androidx.lifecycle.d;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MainNavigator.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020%\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010(¢\u0006\u0004\b/\u00100J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0002J\u001f\u0010\u001d\u001a\u00020\u00042\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010-¨\u00061"}, d2 = {"Ly46;", "Lcv6;", "Lr54;", "command", "", "i", "Lu6;", "f", "Lyja;", DateTokenConverter.CONVERTER_KEY, "Lmg9;", "j", "g", "Ly50;", "backTo", Image.TYPE_HIGH, "b", "l", "Lyw9;", "screen", "Landroidx/fragment/app/Fragment;", c.a, "", "data", "k", e.a, "", "Lhj1;", "commands", "a", "([Lhj1;)V", "Ltu6;", "Ltu6;", "navigationHost", "", "I", "containerId", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lw64;", "Lw64;", "fragmentTransactionConductor", "Ljava/util/LinkedList;", "", "Ljava/util/LinkedList;", "backStackSnapshot", "<init>", "(Ltu6;ILandroidx/fragment/app/FragmentManager;Lw64;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: y46  reason: default package */
/* loaded from: classes4.dex */
public final class y46 implements cv6 {
    private final tu6 a;
    private final int b;
    private final FragmentManager c;
    private final w64 d;
    private LinkedList<String> e;

    public y46(tu6 tu6Var, int i, FragmentManager fragmentManager, w64 w64Var) {
        z65.h(tu6Var, "navigationHost");
        z65.h(fragmentManager, "fragmentManager");
        this.a = tu6Var;
        this.b = i;
        this.c = fragmentManager;
        this.d = w64Var;
        this.e = new LinkedList<>();
    }

    private final void b() {
        this.c.i1(null, 1);
        this.e.clear();
    }

    private final Fragment c(yw9 yw9Var) {
        if (yw9Var instanceof s64) {
            return ((s64) yw9Var).a();
        }
        String b = yw9Var.b();
        throw new IllegalStateException(("Unsupported screen type: " + yw9Var + " (screen key: " + b + ")").toString());
    }

    private final void d(yja yjaVar) {
        yw9 a = yjaVar.a();
        Fragment c = c(a);
        if (c instanceof androidx.fragment.app.c) {
            p i = this.c.p().i(a.b());
            z65.g(i, "addToBackStack(...)");
            Fragment e = e();
            w64 w64Var = this.d;
            if (w64Var != null) {
                w64Var.a(yjaVar, e, c, i);
            }
            if (e != null) {
                i.A(e, d.b.STARTED);
            }
            ((androidx.fragment.app.c) c).show(i, a.b());
            this.e.add(a.b());
            return;
        }
        throw new IllegalArgumentException((a + " doesn't represent a dialog (" + c + " is not a DialogFragment)").toString());
    }

    private final Fragment e() {
        Object l0;
        Object l02;
        FragmentManager fragmentManager = this.c;
        l0 = sc1.l0(this.e);
        Fragment l03 = fragmentManager.l0((String) l0);
        if (l03 == null) {
            Fragment k0 = this.c.k0(this.b);
            if (k0 == null) {
                List<Fragment> y0 = this.c.y0();
                z65.g(y0, "getFragments(...)");
                l02 = sc1.l0(y0);
                return (Fragment) l02;
            }
            return k0;
        }
        return l03;
    }

    private final void f(u6 u6Var) {
        yw9 a = u6Var.a();
        Fragment c = c(a);
        Fragment e = e();
        if (!(e instanceof androidx.fragment.app.c)) {
            p p = this.c.p();
            z65.g(p, "beginTransaction(...)");
            w64 w64Var = this.d;
            if (w64Var != null) {
                w64Var.a(u6Var, e, c, p);
            }
            if (e != null) {
                p = p.s(e);
                z65.g(p, "hide(...)");
            }
            p.c(this.b, c, a.b()).i(a.b()).k();
            this.e.add(a.b());
            return;
        }
        throw new IllegalStateException(("Adding a view (" + c + ") on top of a dialog (" + e + ") is not supported").toString());
    }

    private final void g() {
        if (this.e.size() > 0) {
            this.c.g1();
            this.e.removeLast();
            return;
        }
        this.a.finish();
    }

    private final void h(y50 y50Var) {
        String str;
        yw9 a = y50Var.a();
        Object obj = null;
        if (a != null) {
            str = a.b();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (str.length() > 0 && this.e.contains(str)) {
            int size = this.e.size() - this.e.indexOf(str);
            for (int i = 1; i < size; i++) {
                this.e.removeLast();
            }
            this.c.i1(str, 0);
        } else {
            b();
        }
        if (a != null) {
            obj = i6c.a(a);
        }
        if (obj != null) {
            k(obj);
        }
    }

    private final void i(r54 r54Var) {
        String str;
        yw9 a = r54Var.a();
        if (a instanceof raa) {
            ((raa) a).c();
            return;
        }
        Fragment e = e();
        if (l6c.a(a)) {
            if (e != null) {
                str = e.getTag();
            } else {
                str = null;
            }
            if (z65.c(str, a.b())) {
                return;
            }
        }
        Fragment c = c(a);
        p p = this.c.p();
        z65.g(p, "beginTransaction(...)");
        w64 w64Var = this.d;
        if (w64Var != null) {
            w64Var.a(r54Var, e, c, p);
        }
        if (e instanceof androidx.fragment.app.c) {
            p.t(e);
        }
        p.v(this.b, c, a.b()).i(a.b()).k();
        this.e.add(a.b());
    }

    private final void j(mg9 mg9Var) {
        yw9 a = mg9Var.a();
        Fragment c = c(a);
        if (this.e.size() > 0) {
            this.c.g1();
            this.e.removeLast();
            p p = this.c.p();
            z65.g(p, "beginTransaction(...)");
            Fragment e = e();
            w64 w64Var = this.d;
            if (w64Var != null) {
                w64Var.a(mg9Var, e, c, p);
            }
            if (e instanceof androidx.fragment.app.c) {
                p.t(e);
            }
            p.v(this.b, c, a.b()).i(a.b()).k();
            this.e.add(a.b());
            return;
        }
        p p2 = this.c.p();
        z65.g(p2, "beginTransaction(...)");
        Fragment e2 = e();
        w64 w64Var2 = this.d;
        if (w64Var2 != null) {
            w64Var2.a(mg9Var, e2, c, p2);
        }
        if (e2 instanceof androidx.fragment.app.c) {
            p2.t(e2);
        }
        p2.v(this.b, c, a.b()).k();
    }

    private final void k(Object obj) {
        this.c.h0();
        Fragment e = e();
        if (e instanceof bl2) {
            ((bl2) e).ve(obj);
        }
    }

    private final void l() {
        this.e = new LinkedList<>();
        int s0 = this.c.s0();
        for (int i = 0; i < s0; i++) {
            FragmentManager.j r0 = this.c.r0(i);
            z65.g(r0, "getBackStackEntryAt(...)");
            Object b = mh5.b(r0.getName(), "Transaction must be named");
            z65.g(b, "notNullOrError(...)");
            this.e.add((String) b);
        }
    }

    @Override // defpackage.cv6
    public void a(hj1[] hj1VarArr) {
        z65.h(hj1VarArr, "commands");
        this.c.h0();
        l();
        for (hj1 hj1Var : hj1VarArr) {
            if (hj1Var instanceof yja) {
                d((yja) hj1Var);
            } else if (hj1Var instanceof r54) {
                i((r54) hj1Var);
            } else if (hj1Var instanceof u6) {
                f((u6) hj1Var);
            } else if (hj1Var instanceof mg9) {
                j((mg9) hj1Var);
            } else if (hj1Var instanceof y50) {
                h((y50) hj1Var);
            } else if (hj1Var instanceof u50) {
                g();
            }
        }
    }

    public /* synthetic */ y46(tu6 tu6Var, int i, FragmentManager fragmentManager, w64 w64Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(tu6Var, i, fragmentManager, (i2 & 8) != 0 ? null : w64Var);
    }
}
