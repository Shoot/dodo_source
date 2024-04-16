package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.jm7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: ShapeContainingUtil.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a8\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000\u001a \u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002\u001a4\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\f\u0010\u0012\u001a\u00020\b*\u00020\u0011H\u0002\u001a=\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a4\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Ljm7;", "outline", "", "x", "y", "Lor7;", "tmpTouchPointPath", "tmpOpPath", "", "b", "Lk99;", "rect", DateTokenConverter.CONVERTER_KEY, "Ljm7$c;", "touchPointPath", "opPath", e.a, "Lgo9;", "a", "Lbx1;", "cornerRadius", "centerX", "centerY", "f", "(FFJFF)Z", "path", c.a, "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: wga  reason: default package */
/* loaded from: classes.dex */
public final class wga {
    private static final boolean a(go9 go9Var) {
        if (bx1.d(go9Var.h()) + bx1.d(go9Var.i()) <= go9Var.j() && bx1.d(go9Var.b()) + bx1.d(go9Var.c()) <= go9Var.j() && bx1.e(go9Var.h()) + bx1.e(go9Var.b()) <= go9Var.d() && bx1.e(go9Var.i()) + bx1.e(go9Var.c()) <= go9Var.d()) {
            return true;
        }
        return false;
    }

    public static final boolean b(jm7 jm7Var, float f, float f2, or7 or7Var, or7 or7Var2) {
        z65.h(jm7Var, "outline");
        if (jm7Var instanceof jm7.b) {
            return d(((jm7.b) jm7Var).a(), f, f2);
        }
        if (jm7Var instanceof jm7.c) {
            return e((jm7.c) jm7Var, f, f2, or7Var, or7Var2);
        }
        if (jm7Var instanceof jm7.a) {
            return c(((jm7.a) jm7Var).a(), f, f2, or7Var, or7Var2);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean c(or7 or7Var, float f, float f2, or7 or7Var2, or7 or7Var3) {
        k99 k99Var = new k99(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (or7Var2 == null) {
            or7Var2 = ji.a();
        }
        or7Var2.i(k99Var);
        if (or7Var3 == null) {
            or7Var3 = ji.a();
        }
        or7Var3.k(or7Var, or7Var2, bs7.a.b());
        boolean isEmpty = or7Var3.isEmpty();
        or7Var3.reset();
        or7Var2.reset();
        return !isEmpty;
    }

    private static final boolean d(k99 k99Var, float f, float f2) {
        if (k99Var.f() <= f && f < k99Var.g() && k99Var.i() <= f2 && f2 < k99Var.c()) {
            return true;
        }
        return false;
    }

    private static final boolean e(jm7.c cVar, float f, float f2, or7 or7Var, or7 or7Var2) {
        or7 or7Var3;
        go9 a = cVar.a();
        if (f >= a.e() && f < a.f() && f2 >= a.g() && f2 < a.a()) {
            if (!a(a)) {
                if (or7Var2 == null) {
                    or7Var3 = ji.a();
                } else {
                    or7Var3 = or7Var2;
                }
                or7Var3.h(a);
                return c(or7Var3, f, f2, or7Var, or7Var2);
            }
            float d = bx1.d(a.h()) + a.e();
            float e = bx1.e(a.h()) + a.g();
            float f3 = a.f() - bx1.d(a.i());
            float e2 = bx1.e(a.i()) + a.g();
            float f4 = a.f() - bx1.d(a.c());
            float a2 = a.a() - bx1.e(a.c());
            float a3 = a.a() - bx1.e(a.b());
            float d2 = bx1.d(a.b()) + a.e();
            if (f < d && f2 < e) {
                return f(f, f2, a.h(), d, e);
            }
            if (f < d2 && f2 > a3) {
                return f(f, f2, a.b(), d2, a3);
            }
            if (f > f3 && f2 < e2) {
                return f(f, f2, a.i(), f3, e2);
            }
            if (f > f4 && f2 > a2) {
                return f(f, f2, a.c(), f4, a2);
            }
            return true;
        }
        return false;
    }

    private static final boolean f(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float d = bx1.d(j);
        float e = bx1.e(j);
        if (((f5 * f5) / (d * d)) + ((f6 * f6) / (e * e)) <= 1.0f) {
            return true;
        }
        return false;
    }
}
