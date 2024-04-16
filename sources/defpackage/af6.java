package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.xl8;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.dodopizza.app.domain.menu.promo.ProductPromoAction;
import ru.dodopizza.app.domain.menu.promo.PromoActionCode;
/* compiled from: MenuItemVOConverter.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020$¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\r\u001a\u00020\u0007*\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J;\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010%¨\u0006)"}, d2 = {"Laf6;", "Lze6;", "Lqd6;", "menuItem", "Lye6;", DateTokenConverter.CONVERTER_KEY, "menuItemVO", "", "isForSearch", e.a, "Lxl8;", "j", "g", "i", "f", "promoActionVO", Image.TYPE_HIGH, "Liu;", c.a, "a", "Ldd6;", "menuCategory", "", "Ldh6;", "selectedSubcategories", "", "allMenuItems", "Lfd6;", "b", "(Lqd6;Ldd6;Ljava/util/List;[Lqd6;)Lfd6;", "Lhq3;", "Lhq3;", "featureService", "Lkh1;", "Lkh1;", "comboMenuItemVOProvider", "Lz83;", "Lz83;", "drinksTwoColumnChecker", "<init>", "(Lhq3;Lkh1;Lz83;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: af6  reason: default package */
/* loaded from: classes4.dex */
public final class af6 implements ze6 {
    private final hq3 a;
    private final kh1 b;
    private final z83 c;

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: af6$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((x0b) t).d()), Integer.valueOf(((x0b) t2).d()));
            return d;
        }
    }

    public af6(hq3 hq3Var, kh1 kh1Var, z83 z83Var) {
        z65.h(hq3Var, "featureService");
        z65.h(kh1Var, "comboMenuItemVOProvider");
        z65.h(z83Var, "drinksTwoColumnChecker");
        this.a = hq3Var;
        this.b = kh1Var;
        this.c = z83Var;
    }

    private final iu c(qd6 qd6Var) {
        Integer num = null;
        if (i(qd6Var)) {
            l18 j = qd6Var.j();
            if (j != null) {
                Pair c = bf6.c(qd6Var, j);
                hn6 hn6Var = (hn6) c.a();
                hn6 hn6Var2 = (hn6) c.b();
                String f = qd6Var.f();
                String h = qd6Var.h();
                String i = qd6Var.i();
                km8 a2 = de6.a(qd6Var);
                String d = qd6Var.d();
                String c2 = qd6Var.c();
                re6 b = de6.b(qd6Var);
                kl8 b2 = qd6Var.b();
                String g = qd6Var.g();
                Collection<qja> d2 = de6.d(qd6Var);
                if (d2 != null) {
                    num = Integer.valueOf(d2.size());
                }
                return new iu(f, h, i, a2, d, c2, b, b2, g, qd6Var.p(), qd6Var.a(), qd6Var.m(), hn6Var, qd6Var.j(), ((Number) mh5.c(num, 1)).intValue(), hn6Var2, true, j.d(), hf6.a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        String f2 = qd6Var.f();
        String h2 = qd6Var.h();
        String i2 = qd6Var.i();
        km8 a3 = de6.a(qd6Var);
        String d3 = qd6Var.d();
        String c3 = qd6Var.c();
        re6 b3 = de6.b(qd6Var);
        kl8 b4 = qd6Var.b();
        String g2 = qd6Var.g();
        Collection<qja> d4 = de6.d(qd6Var);
        if (d4 != null) {
            num = Integer.valueOf(d4.size());
        }
        return new iu(f2, h2, i2, a3, d3, c3, b3, b4, g2, qd6Var.p(), qd6Var.a(), qd6Var.m(), qd6Var.k(), qd6Var.j(), ((Number) mh5.c(num, 1)).intValue(), null, false, 0L, hf6.a, 229376, null);
    }

    private final ye6 d(qd6 qd6Var) {
        Integer num;
        String f = qd6Var.f();
        String h = qd6Var.h();
        String i = qd6Var.i();
        km8 a2 = de6.a(qd6Var);
        String d = qd6Var.d();
        String c = qd6Var.c();
        re6 b = de6.b(qd6Var);
        kl8 b2 = qd6Var.b();
        String g = qd6Var.g();
        Collection<qja> d2 = de6.d(qd6Var);
        if (d2 != null) {
            num = Integer.valueOf(d2.size());
        } else {
            num = null;
        }
        return new b93(f, h, i, a2, d, c, b, b2, g, qd6Var.p(), qd6Var.a(), qd6Var.m(), qd6Var.k(), qd6Var.j(), ((Number) mh5.c(num, 1)).intValue(), null, false, 0L, hf6.a, 229376, null);
    }

    private final ye6 e(ye6 ye6Var, boolean z) {
        if (!bf6.a(ye6Var, z)) {
            return ye6Var;
        }
        if (ye6Var instanceof rc9) {
            return new fo4(ye6Var.x(), ye6Var.B(), ye6Var.getName(), ye6Var.a(), ye6Var.getDescription(), ye6Var.w(), ye6Var.H(), ye6Var.z(), ye6Var.y(), ye6Var.p(), ye6Var.D(), ye6Var.F(), ye6Var.h(), ye6Var.v(), ye6Var.G(), ye6Var.A(), ye6Var.E(), ye6Var.C(), hf6.a);
        } else if (!(ye6Var instanceof b93)) {
            return ye6Var;
        } else {
            return new fo4(ye6Var.x(), ye6Var.B(), ye6Var.getName(), ye6Var.a(), ye6Var.getDescription(), ye6Var.w(), ye6Var.H(), ye6Var.z(), ye6Var.y(), ye6Var.p(), ye6Var.D(), ye6Var.F(), ye6Var.h(), ye6Var.v(), ye6Var.G(), ye6Var.A(), ye6Var.E(), ye6Var.C(), hf6.a);
        }
    }

    private final ye6 f(qd6 qd6Var, boolean z) {
        l18 j = qd6Var.j();
        if (j != null) {
            Pair c = bf6.c(qd6Var, j);
            hn6 hn6Var = (hn6) c.a();
            hn6 hn6Var2 = (hn6) c.b();
            Integer num = null;
            if (bf6.b(qd6Var, this.c, z)) {
                String f = qd6Var.f();
                String h = qd6Var.h();
                String i = qd6Var.i();
                km8 a2 = de6.a(qd6Var);
                String d = qd6Var.d();
                String c2 = qd6Var.c();
                re6 b = de6.b(qd6Var);
                kl8 b2 = qd6Var.b();
                String g = qd6Var.g();
                Collection<qja> d2 = de6.d(qd6Var);
                if (d2 != null) {
                    num = Integer.valueOf(d2.size());
                }
                return new b93(f, h, i, a2, d, c2, b, b2, g, qd6Var.p(), qd6Var.a(), qd6Var.m(), hn6Var, qd6Var.j(), ((Number) mh5.c(num, 1)).intValue(), hn6Var2, true, j.d(), hf6.a);
            }
            String f2 = qd6Var.f();
            String h2 = qd6Var.h();
            String i2 = qd6Var.i();
            km8 a3 = de6.a(qd6Var);
            String d3 = qd6Var.d();
            String c3 = qd6Var.c();
            re6 b3 = de6.b(qd6Var);
            kl8 b4 = qd6Var.b();
            String g2 = qd6Var.g();
            Collection<qja> d4 = de6.d(qd6Var);
            if (d4 != null) {
                num = Integer.valueOf(d4.size());
            }
            return new rc9(f2, h2, i2, a3, d3, c3, b3, b4, g2, qd6Var.p(), qd6Var.a(), qd6Var.m(), hn6Var, qd6Var.j(), ((Number) mh5.c(num, 1)).intValue(), hn6Var2, true, j.d(), hf6.a);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final ye6 g(qd6 qd6Var) {
        Integer num;
        String f = qd6Var.f();
        String h = qd6Var.h();
        String i = qd6Var.i();
        km8 a2 = de6.a(qd6Var);
        String d = qd6Var.d();
        String c = qd6Var.c();
        re6 b = de6.b(qd6Var);
        kl8 b2 = qd6Var.b();
        String g = qd6Var.g();
        Collection<qja> d2 = de6.d(qd6Var);
        if (d2 != null) {
            num = Integer.valueOf(d2.size());
        } else {
            num = null;
        }
        return new rc9(f, h, i, a2, d, c, b, b2, g, qd6Var.p(), qd6Var.a(), qd6Var.m(), qd6Var.k(), qd6Var.j(), ((Number) mh5.c(num, 1)).intValue(), null, false, 0L, hf6.a, 229376, null);
    }

    private final ye6 h(qd6 qd6Var, xl8 xl8Var) {
        if (xl8Var instanceof xl8.a) {
            return c(qd6Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean i(qd6 qd6Var) {
        if (qd6Var.j() != null) {
            return true;
        }
        return false;
    }

    private final xl8 j(qd6 qd6Var, boolean z) {
        Object obj;
        String str;
        if (z) {
            return null;
        }
        Iterator<T> it = qd6Var.m().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ProductPromoAction) obj).getKind() == 0) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ProductPromoAction productPromoAction = (ProductPromoAction) obj;
        if (productPromoAction != null) {
            str = productPromoAction.getCode();
        } else {
            str = null;
        }
        if (!z65.c(str, PromoActionCode.ASSISTANT.getCode())) {
            return null;
        }
        return xl8.a.a;
    }

    @Override // defpackage.ze6
    public ye6 a(qd6 qd6Var, boolean z) {
        Integer num;
        ye6 rc9Var;
        z65.h(qd6Var, "menuItem");
        xl8 j = j(qd6Var, z);
        if (j != null) {
            rc9Var = h(qd6Var, j);
        } else if (qd6Var.b() == kl8.h) {
            rc9Var = g(qd6Var);
        } else if (qd6Var.b() == kl8.i && this.a.a(bq3.r5)) {
            rc9Var = this.b.a(qd6Var);
        } else if (i(qd6Var)) {
            rc9Var = f(qd6Var, z);
        } else if (bf6.b(qd6Var, this.c, z)) {
            rc9Var = d(qd6Var);
        } else {
            String f = qd6Var.f();
            String h = qd6Var.h();
            String i = qd6Var.i();
            km8 a2 = de6.a(qd6Var);
            String d = qd6Var.d();
            String c = qd6Var.c();
            re6 b = de6.b(qd6Var);
            kl8 b2 = qd6Var.b();
            String g = qd6Var.g();
            Collection<qja> d2 = de6.d(qd6Var);
            if (d2 != null) {
                num = Integer.valueOf(d2.size());
            } else {
                num = null;
            }
            rc9Var = new rc9(f, h, i, a2, d, c, b, b2, g, qd6Var.p(), qd6Var.a(), qd6Var.m(), qd6Var.k(), qd6Var.j(), ((Number) mh5.c(num, 1)).intValue(), null, false, 0L, hf6.a, 229376, null);
        }
        return e(rc9Var, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d A[SYNTHETIC] */
    @Override // defpackage.ze6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.fd6 b(defpackage.qd6 r30, defpackage.dd6 r31, java.util.List<defpackage.dh6> r32, defpackage.qd6[] r33) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af6.b(qd6, dd6, java.util.List, qd6[]):fd6");
    }
}
