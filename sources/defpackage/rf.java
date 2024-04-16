package defpackage;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import defpackage.pc0;
import kotlin.Metadata;
/* compiled from: AndroidBlendMode.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lpc0;", "Landroid/graphics/PorterDuff$Mode;", "b", "(I)Landroid/graphics/PorterDuff$Mode;", "Landroid/graphics/BlendMode;", "a", "(I)Landroid/graphics/BlendMode;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: rf  reason: default package */
/* loaded from: classes.dex */
public final class rf {
    public static final BlendMode a(int i) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        pc0.a aVar = pc0.b;
        if (pc0.G(i, aVar.a())) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        } else if (pc0.G(i, aVar.x())) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        } else if (pc0.G(i, aVar.g())) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        } else if (pc0.G(i, aVar.B())) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        } else if (pc0.G(i, aVar.k())) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        } else if (pc0.G(i, aVar.z())) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        } else if (pc0.G(i, aVar.i())) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        } else if (pc0.G(i, aVar.A())) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        } else if (pc0.G(i, aVar.j())) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        } else if (pc0.G(i, aVar.y())) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        } else if (pc0.G(i, aVar.h())) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        } else if (pc0.G(i, aVar.C())) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        } else if (pc0.G(i, aVar.t())) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        } else if (pc0.G(i, aVar.q())) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        } else if (pc0.G(i, aVar.v())) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        } else if (pc0.G(i, aVar.s())) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        } else if (pc0.G(i, aVar.e())) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        } else if (pc0.G(i, aVar.o())) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        } else if (pc0.G(i, aVar.d())) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        } else if (pc0.G(i, aVar.c())) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        } else if (pc0.G(i, aVar.m())) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        } else if (pc0.G(i, aVar.w())) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        } else if (pc0.G(i, aVar.f())) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        } else if (pc0.G(i, aVar.l())) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        } else if (pc0.G(i, aVar.r())) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        } else if (pc0.G(i, aVar.n())) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        } else if (pc0.G(i, aVar.u())) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        } else if (pc0.G(i, aVar.b())) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        } else if (pc0.G(i, aVar.p())) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        } else {
            blendMode = BlendMode.SRC_OVER;
            return blendMode;
        }
    }

    public static final PorterDuff.Mode b(int i) {
        pc0.a aVar = pc0.b;
        if (pc0.G(i, aVar.a())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (pc0.G(i, aVar.x())) {
            return PorterDuff.Mode.SRC;
        }
        if (pc0.G(i, aVar.g())) {
            return PorterDuff.Mode.DST;
        }
        if (pc0.G(i, aVar.B())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (pc0.G(i, aVar.k())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (pc0.G(i, aVar.z())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (pc0.G(i, aVar.i())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (pc0.G(i, aVar.A())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (pc0.G(i, aVar.j())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (pc0.G(i, aVar.y())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (pc0.G(i, aVar.h())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (pc0.G(i, aVar.C())) {
            return PorterDuff.Mode.XOR;
        }
        if (pc0.G(i, aVar.t())) {
            return PorterDuff.Mode.ADD;
        }
        if (pc0.G(i, aVar.v())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (pc0.G(i, aVar.s())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (pc0.G(i, aVar.e())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (pc0.G(i, aVar.o())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (pc0.G(i, aVar.q())) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
