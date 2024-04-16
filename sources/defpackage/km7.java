package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.jm7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: Outline.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aQ\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aQ\u0010\u0012\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0016\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0016\u0010\u0019\u001a\u00020\u0018*\u00020\u0014H\u0002ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u0016\u0010\u001b\u001a\u00020\u0015*\u00020\u001aH\u0002ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0016\u0010\u001d\u001a\u00020\u0018*\u00020\u001aH\u0002ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001c\u001a\f\u0010\u001f\u001a\u00020\u001e*\u00020\u001aH\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"Ly73;", "Ljm7;", "outline", "Luc1;", RemoteMessageConst.Notification.COLOR, "", "alpha", "Lz73;", "style", "Lwc1;", "colorFilter", "Lpc0;", "blendMode", "", DateTokenConverter.CONVERTER_KEY, "(Ly73;Ljm7;JFLz73;Lwc1;I)V", "Lmg0;", "brush", "b", "(Ly73;Ljm7;Lmg0;FLz73;Lwc1;I)V", "Lk99;", "Ls67;", "i", "(Lk99;)J", "Lcna;", "g", "Lgo9;", "j", "(Lgo9;)J", Image.TYPE_HIGH, "", "f", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: km7 */
/* loaded from: classes.dex */
public final class km7 {
    public static final void b(y73 y73Var, jm7 jm7Var, mg0 mg0Var, float f, z73 z73Var, wc1 wc1Var, int i) {
        or7 a;
        z65.h(y73Var, "$this$drawOutline");
        z65.h(jm7Var, "outline");
        z65.h(mg0Var, "brush");
        z65.h(z73Var, "style");
        if (jm7Var instanceof jm7.b) {
            k99 a2 = ((jm7.b) jm7Var).a();
            y73Var.A0(mg0Var, i(a2), g(a2), f, z73Var, wc1Var, i);
            return;
        }
        if (jm7Var instanceof jm7.c) {
            jm7.c cVar = (jm7.c) jm7Var;
            a = cVar.b();
            if (a == null) {
                go9 a3 = cVar.a();
                y73Var.R(mg0Var, j(a3), h(a3), cx1.b(bx1.d(a3.b()), 0.0f, 2, null), f, z73Var, wc1Var, i);
                return;
            }
        } else if (jm7Var instanceof jm7.a) {
            a = ((jm7.a) jm7Var).a();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        y73Var.s0(a, mg0Var, f, z73Var, wc1Var, i);
    }

    public static /* synthetic */ void c(y73 y73Var, jm7 jm7Var, mg0 mg0Var, float f, z73 z73Var, wc1 wc1Var, int i, int i2, Object obj) {
        float f2;
        if ((i2 & 4) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 8) != 0) {
            z73Var = uu3.a;
        }
        z73 z73Var2 = z73Var;
        if ((i2 & 16) != 0) {
            wc1Var = null;
        }
        wc1 wc1Var2 = wc1Var;
        if ((i2 & 32) != 0) {
            i = y73.L.a();
        }
        b(y73Var, jm7Var, mg0Var, f2, z73Var2, wc1Var2, i);
    }

    public static final void d(y73 y73Var, jm7 jm7Var, long j, float f, z73 z73Var, wc1 wc1Var, int i) {
        or7 a;
        z65.h(y73Var, "$this$drawOutline");
        z65.h(jm7Var, "outline");
        z65.h(z73Var, "style");
        if (jm7Var instanceof jm7.b) {
            k99 a2 = ((jm7.b) jm7Var).a();
            y73Var.t0(j, i(a2), g(a2), f, z73Var, wc1Var, i);
            return;
        }
        if (jm7Var instanceof jm7.c) {
            jm7.c cVar = (jm7.c) jm7Var;
            a = cVar.b();
            if (a == null) {
                go9 a3 = cVar.a();
                y73Var.q0(j, j(a3), h(a3), cx1.b(bx1.d(a3.b()), 0.0f, 2, null), z73Var, f, wc1Var, i);
                return;
            }
        } else if (jm7Var instanceof jm7.a) {
            a = ((jm7.a) jm7Var).a();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        y73Var.g0(a, j, f, z73Var, wc1Var, i);
    }

    public static /* synthetic */ void e(y73 y73Var, jm7 jm7Var, long j, float f, z73 z73Var, wc1 wc1Var, int i, int i2, Object obj) {
        float f2;
        uu3 uu3Var;
        wc1 wc1Var2;
        int i3;
        if ((i2 & 4) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 8) != 0) {
            uu3Var = uu3.a;
        } else {
            uu3Var = z73Var;
        }
        if ((i2 & 16) != 0) {
            wc1Var2 = null;
        } else {
            wc1Var2 = wc1Var;
        }
        if ((i2 & 32) != 0) {
            i3 = y73.L.a();
        } else {
            i3 = i;
        }
        d(y73Var, jm7Var, j, f2, uu3Var, wc1Var2, i3);
    }

    public static final boolean f(go9 go9Var) {
        boolean z;
        boolean z2;
        if (bx1.d(go9Var.b()) == bx1.d(go9Var.c()) && bx1.d(go9Var.c()) == bx1.d(go9Var.i()) && bx1.d(go9Var.i()) == bx1.d(go9Var.h())) {
            z = true;
        } else {
            z = false;
        }
        if (bx1.e(go9Var.b()) == bx1.e(go9Var.c()) && bx1.e(go9Var.c()) == bx1.e(go9Var.i()) && bx1.e(go9Var.i()) == bx1.e(go9Var.h())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    private static final long g(k99 k99Var) {
        return ina.a(k99Var.j(), k99Var.e());
    }

    private static final long h(go9 go9Var) {
        return ina.a(go9Var.j(), go9Var.d());
    }

    private static final long i(k99 k99Var) {
        return x67.a(k99Var.f(), k99Var.i());
    }

    private static final long j(go9 go9Var) {
        return x67.a(go9Var.e(), go9Var.g());
    }
}
