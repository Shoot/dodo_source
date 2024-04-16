package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.qd6;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.domain.menu.promo.PromoActionCode;
/* compiled from: MenuItemVOConverterV5.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0012B)\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020%¢\u0006\u0004\b+\u0010,J \u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\f\u0010\n\u001a\u00020\u0006*\u00020\tH\u0002J\f\u0010\u000b\u001a\u00020\u0006*\u00020\tH\u0002J\f\u0010\f\u001a\u00020\u0006*\u00020\tH\u0002J \u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0002J\f\u0010\u0014\u001a\u00020\u0013*\u00020\tH\u0002J&\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00172\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J \u0010\u0019\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0002J \u0010\u001a\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0002J \u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010)¨\u0006-"}, d2 = {"Lff6;", "", "Lye6;", "menuItemVO", "Ly2a;", "sectionItemV5", "", "isForSearch", "g", "Lte6;", "i", Image.TYPE_HIGH, "j", "Lz2a;", "section", "Lqd6;", "menuItem", "menuItemV5", "a", "Lhn6;", e.a, "Ll18;", "personalPrice", "Lkotlin/Pair;", "f", DateTokenConverter.CONVERTER_KEY, "b", c.a, "Lhq3;", "Lhq3;", "featureService", "Lah6;", "Lah6;", "menuService", "Lee6;", "Lee6;", "menuItemForwardCompatibilityRepository", "Lue6;", "Lue6;", "menuItemV5ImageResolver", "Lxv4;", "Lxv4;", "menuImageSize", "<init>", "(Lhq3;Lah6;Lee6;Lue6;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ff6  reason: default package */
/* loaded from: classes4.dex */
public final class ff6 {
    private static final a f = new a(null);
    private final hq3 a;
    private final ah6 b;
    private final ee6 c;
    private final ue6 d;
    private final xv4 e;

    /* compiled from: MenuItemVOConverterV5.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lff6$a;", "", "", "APPEARANCE", "Ljava/lang/String;", "", "DEFAULT_IMAGE_SIZE", "J", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ff6$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ff6(hq3 hq3Var, ah6 ah6Var, ee6 ee6Var, ue6 ue6Var) {
        z65.h(hq3Var, "featureService");
        z65.h(ah6Var, "menuService");
        z65.h(ee6Var, "menuItemForwardCompatibilityRepository");
        z65.h(ue6Var, "menuItemV5ImageResolver");
        this.a = hq3Var;
        this.b = ah6Var;
        this.c = ee6Var;
        this.d = ue6Var;
        this.e = new xv4(500L, 500L);
    }

    private final ye6 a(z2a z2aVar, qd6 qd6Var, te6 te6Var) {
        hn6 hn6Var;
        List l;
        Object obj;
        boolean v;
        hn6 i = te6Var.i();
        if (i == null) {
            i = kn6.f();
        }
        hn6 hn6Var2 = i;
        if (this.a.a(bq3.r5)) {
            hn6 f2 = kn6.f();
            for (fj1 fj1Var : te6Var.j()) {
                Iterator<T> it = fj1Var.b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        v = l0b.v(fj1Var.a(), ((ej1) obj).a().c(), true);
                        if (v) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ej1 ej1Var = (ej1) obj;
                if (ej1Var != null) {
                    f2 = rn6.f(f2, ej1Var.a().e());
                }
            }
            if (f2.a() > hn6Var2.a()) {
                hn6Var = f2;
                String e = te6Var.e();
                String c = z2aVar.c();
                String g = te6Var.g();
                km8 a2 = de6.a(qd6Var);
                String d = te6Var.d();
                String d2 = te6Var.d();
                re6 re6Var = re6.d;
                kl8 b = qd6Var.b();
                String c2 = ue6.c(this.d, te6Var.f(), this.e, null, 4, null);
                int size = te6Var.l().size();
                boolean q = this.b.q(te6Var);
                qd6.a a3 = qd6Var.a();
                l = kc1.l();
                return new rc9(e, c, g, a2, d, d2, re6Var, b, c2, q, a3, l, hn6Var2, te6Var.h(), size, hn6Var, false, 0L, hf6.b, 196608, null);
            }
        }
        hn6Var = null;
        String e2 = te6Var.e();
        String c3 = z2aVar.c();
        String g2 = te6Var.g();
        km8 a22 = de6.a(qd6Var);
        String d3 = te6Var.d();
        String d22 = te6Var.d();
        re6 re6Var2 = re6.d;
        kl8 b2 = qd6Var.b();
        String c22 = ue6.c(this.d, te6Var.f(), this.e, null, 4, null);
        int size2 = te6Var.l().size();
        boolean q2 = this.b.q(te6Var);
        qd6.a a32 = qd6Var.a();
        l = kc1.l();
        return new rc9(e2, c3, g2, a22, d3, d22, re6Var2, b2, c22, q2, a32, l, hn6Var2, te6Var.h(), size2, hn6Var, false, 0L, hf6.b, 196608, null);
    }

    private final ye6 b(z2a z2aVar, qd6 qd6Var, te6 te6Var) {
        List l;
        l18 h = te6Var.h();
        if (h != null) {
            Pair<hn6, hn6> f2 = f(te6Var, h);
            hn6 a2 = f2.a();
            hn6 b = f2.b();
            String e = te6Var.e();
            String c = z2aVar.c();
            String g = te6Var.g();
            km8 a3 = de6.a(qd6Var);
            String d = te6Var.d();
            String d2 = te6Var.d();
            re6 c2 = de6.c(te6Var);
            kl8 b2 = qd6Var.b();
            String c3 = ue6.c(this.d, te6Var.f(), this.e, null, 4, null);
            int size = te6Var.l().size();
            boolean q = this.b.q(te6Var);
            qd6.a a4 = qd6Var.a();
            l = kc1.l();
            return new rc9(e, c, g, a3, d, d2, c2, b2, c3, q, a4, l, a2, h, size, b, true, h.d(), hf6.b);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final ye6 d(z2a z2aVar, qd6 qd6Var, te6 te6Var) {
        List l;
        String e = te6Var.e();
        String c = z2aVar.c();
        String g = te6Var.g();
        km8 a2 = de6.a(qd6Var);
        String d = te6Var.d();
        String d2 = te6Var.d();
        re6 c2 = de6.c(te6Var);
        kl8 b = qd6Var.b();
        String c3 = ue6.c(this.d, te6Var.f(), this.e, null, 4, null);
        int size = te6Var.l().size();
        boolean q = this.b.q(te6Var);
        qd6.a a3 = qd6Var.a();
        l = kc1.l();
        return new rc9(e, c, g, a2, d, d2, c2, b, c3, q, a3, l, e(te6Var), te6Var.h(), size, null, false, 0L, hf6.b, 229376, null);
    }

    private final hn6 e(te6 te6Var) {
        Object next;
        hn6 hn6Var;
        tm8 a2;
        hn6 i = te6Var.i();
        if (i == null) {
            Iterator<T> it = te6Var.l().iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    double a3 = ((dxb) next).a().e().a();
                    do {
                        Object next2 = it.next();
                        double a4 = ((dxb) next2).a().e().a();
                        if (Double.compare(a3, a4) > 0) {
                            next = next2;
                            a3 = a4;
                        }
                    } while (it.hasNext());
                }
            }
            dxb dxbVar = (dxb) next;
            if (dxbVar != null && (a2 = dxbVar.a()) != null) {
                hn6Var = a2.e();
            } else {
                hn6Var = null;
            }
            if (hn6Var == null) {
                return kn6.f();
            }
            return hn6Var;
        }
        return i;
    }

    private final Pair<hn6, hn6> f(te6 te6Var, l18 l18Var) {
        hn6 e = e(te6Var);
        if (rn6.c(l18Var.c(), e) < 0) {
            return new Pair<>(l18Var.c(), e);
        }
        return new Pair<>(e, null);
    }

    private final ye6 g(ye6 ye6Var, y2a y2aVar, boolean z) {
        List<wv4> list;
        List<wv4> l;
        List<wv4> list2;
        List<wv4> l2;
        boolean v;
        if (y2aVar.c().isEmpty() || z) {
            return ye6Var;
        }
        List<wv4> list3 = null;
        String str = null;
        for (v6 v6Var : y2aVar.c()) {
            try {
                v = l0b.v(v6Var.a(), "appearance", true);
                if (v) {
                    str = v6Var.b();
                }
            } catch (Throwable unused) {
            }
        }
        if (z65.c(str, PromoActionCode.ASSISTANT.getCode())) {
            String x = ye6Var.x();
            String B = ye6Var.B();
            String name = ye6Var.getName();
            km8 a2 = ye6Var.a();
            String description = ye6Var.getDescription();
            String w = ye6Var.w();
            re6 H = ye6Var.H();
            kl8 z2 = ye6Var.z();
            ue6 ue6Var = this.d;
            te6 e = y2aVar.e();
            if (e != null) {
                list3 = e.f();
            }
            if (list3 == null) {
                l2 = kc1.l();
                list2 = l2;
            } else {
                list2 = list3;
            }
            return new iu(x, B, name, a2, description, w, H, z2, ue6.c(ue6Var, list2, this.e, null, 4, null), ye6Var.p(), ye6Var.D(), ye6Var.F(), ye6Var.h(), ye6Var.v(), ye6Var.G(), ye6Var.A(), ye6Var.E(), ye6Var.C(), hf6.b);
        } else if (!z65.c(str, PromoActionCode.HERO.getCode()) || !(ye6Var instanceof rc9) || ye6Var.p() || !this.a.a(bq3.F5)) {
            return ye6Var;
        } else {
            String x2 = ye6Var.x();
            String B2 = ye6Var.B();
            String name2 = ye6Var.getName();
            km8 a3 = ye6Var.a();
            String description2 = ye6Var.getDescription();
            String w2 = ye6Var.w();
            re6 H2 = ye6Var.H();
            kl8 z3 = ye6Var.z();
            ue6 ue6Var2 = this.d;
            te6 e2 = y2aVar.e();
            if (e2 != null) {
                list3 = e2.f();
            }
            if (list3 == null) {
                l = kc1.l();
                list = l;
            } else {
                list = list3;
            }
            return new fo4(x2, B2, name2, a3, description2, w2, H2, z3, ue6.c(ue6Var2, list, this.e, null, 4, null), ye6Var.p(), ye6Var.D(), ye6Var.F(), ye6Var.h(), ye6Var.v(), ye6Var.G(), ye6Var.A(), ye6Var.E(), ye6Var.C(), hf6.b);
        }
    }

    private final boolean h(te6 te6Var) {
        if (te6Var.h() != null) {
            return true;
        }
        return false;
    }

    private final boolean i(te6 te6Var) {
        if (te6Var.k() == se6.c) {
            return true;
        }
        return false;
    }

    private final boolean j(te6 te6Var) {
        if (te6Var.k() == se6.b) {
            List<dxb> l = te6Var.l();
            if (!(l instanceof Collection) || !l.isEmpty()) {
                for (dxb dxbVar : l) {
                    if (!dxbVar.a().h().a()) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final ye6 c(z2a z2aVar, y2a y2aVar, boolean z) {
        List l;
        ye6 rc9Var;
        z65.h(z2aVar, "section");
        z65.h(y2aVar, "sectionItemV5");
        te6 e = y2aVar.e();
        if (e != null) {
            qd6 a2 = this.c.a(e.e());
            if (a2 == null) {
                return null;
            }
            if (j(e)) {
                rc9Var = d(z2aVar, a2, e);
            } else if (i(e)) {
                rc9Var = a(z2aVar, a2, e);
            } else if (h(e)) {
                rc9Var = b(z2aVar, a2, e);
            } else {
                String e2 = e.e();
                String c = z2aVar.c();
                String g = e.g();
                km8 a3 = de6.a(a2);
                String d = e.d();
                String d2 = e.d();
                re6 c2 = de6.c(e);
                kl8 b = a2.b();
                String c3 = ue6.c(this.d, e.f(), this.e, null, 4, null);
                int size = e.l().size();
                boolean q = this.b.q(e);
                qd6.a a4 = a2.a();
                l = kc1.l();
                rc9Var = new rc9(e2, c, g, a3, d, d2, c2, b, c3, q, a4, l, e(e), e.h(), size, null, false, 0L, hf6.b, 229376, null);
            }
            return g(rc9Var, y2aVar, z);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
