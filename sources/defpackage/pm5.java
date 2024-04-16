package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: LayoutCoordinates.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0004*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0004*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0000*\u00020\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lom5;", "Ls67;", e.a, "(Lom5;)J", "Lk99;", "b", c.a, "a", DateTokenConverter.CONVERTER_KEY, "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: pm5  reason: default package */
/* loaded from: classes.dex */
public final class pm5 {
    public static final k99 a(om5 om5Var) {
        k99 a;
        z65.h(om5Var, "<this>");
        om5 F = om5Var.F();
        if (F == null || (a = nm5.a(F, om5Var, false, 2, null)) == null) {
            return new k99(0.0f, 0.0f, w55.g(om5Var.a()), w55.f(om5Var.a()));
        }
        return a;
    }

    public static final k99 b(om5 om5Var) {
        z65.h(om5Var, "<this>");
        return nm5.a(d(om5Var), om5Var, false, 2, null);
    }

    public static final k99 c(om5 om5Var) {
        float k;
        float k2;
        float k3;
        float k4;
        float h;
        float h2;
        float g;
        float g2;
        z65.h(om5Var, "<this>");
        om5 d = d(om5Var);
        k99 b = b(om5Var);
        float g3 = w55.g(d.a());
        float f = w55.f(d.a());
        k = i.k(b.f(), 0.0f, g3);
        k2 = i.k(b.i(), 0.0f, f);
        k3 = i.k(b.g(), 0.0f, g3);
        k4 = i.k(b.c(), 0.0f, f);
        if (k == k3 || k2 == k4) {
            return k99.e.a();
        }
        long B = d.B(x67.a(k, k2));
        long B2 = d.B(x67.a(k3, k2));
        long B3 = d.B(x67.a(k3, k4));
        long B4 = d.B(x67.a(k, k4));
        h = nk1.h(s67.l(B), s67.l(B2), s67.l(B4), s67.l(B3));
        h2 = nk1.h(s67.m(B), s67.m(B2), s67.m(B4), s67.m(B3));
        g = nk1.g(s67.l(B), s67.l(B2), s67.l(B4), s67.l(B3));
        g2 = nk1.g(s67.m(B), s67.m(B2), s67.m(B4), s67.m(B3));
        return new k99(h, h2, g, g2);
    }

    public static final om5 d(om5 om5Var) {
        om5 om5Var2;
        oz6 oz6Var;
        z65.h(om5Var, "<this>");
        om5 F = om5Var.F();
        while (true) {
            om5 om5Var3 = F;
            om5Var2 = om5Var;
            om5Var = om5Var3;
            if (om5Var == null) {
                break;
            }
            F = om5Var.F();
        }
        if (om5Var2 instanceof oz6) {
            oz6Var = (oz6) om5Var2;
        } else {
            oz6Var = null;
        }
        if (oz6Var == null) {
            return om5Var2;
        }
        oz6 B1 = oz6Var.B1();
        while (true) {
            oz6 oz6Var2 = B1;
            oz6 oz6Var3 = oz6Var;
            oz6Var = oz6Var2;
            if (oz6Var != null) {
                B1 = oz6Var.B1();
            } else {
                return oz6Var3;
            }
        }
    }

    public static final long e(om5 om5Var) {
        z65.h(om5Var, "<this>");
        return om5Var.I(s67.b.c());
    }
}
