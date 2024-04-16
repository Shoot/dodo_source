package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
/* compiled from: ShapeAppearanceModel.java */
/* renamed from: uga  reason: default package */
/* loaded from: classes2.dex */
public class uga {
    public static final dx1 m = new sc9(0.5f);
    gx1 a;
    gx1 b;
    gx1 c;
    gx1 d;
    dx1 e;
    dx1 f;
    dx1 g;
    dx1 h;
    zc3 i;
    zc3 j;
    zc3 k;
    zc3 l;

    /* compiled from: ShapeAppearanceModel.java */
    /* renamed from: uga$c */
    /* loaded from: classes2.dex */
    public interface c {
        @NonNull
        dx1 a(@NonNull dx1 dx1Var);
    }

    @NonNull
    public static b a() {
        return new b();
    }

    @NonNull
    public static b b(Context context, int i, int i2) {
        return c(context, i, i2, 0);
    }

    @NonNull
    private static b c(Context context, int i, int i2, int i3) {
        return d(context, i, i2, new u0(i3));
    }

    @NonNull
    private static b d(Context context, int i, int i2, @NonNull dx1 dx1Var) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, b29.C6);
        try {
            int i3 = obtainStyledAttributes.getInt(b29.D6, 0);
            int i4 = obtainStyledAttributes.getInt(b29.G6, i3);
            int i5 = obtainStyledAttributes.getInt(b29.H6, i3);
            int i6 = obtainStyledAttributes.getInt(b29.F6, i3);
            int i7 = obtainStyledAttributes.getInt(b29.E6, i3);
            dx1 m2 = m(obtainStyledAttributes, b29.I6, dx1Var);
            dx1 m3 = m(obtainStyledAttributes, b29.L6, m2);
            dx1 m4 = m(obtainStyledAttributes, b29.M6, m2);
            dx1 m5 = m(obtainStyledAttributes, b29.K6, m2);
            return new b().B(i4, m3).F(i5, m4).x(i6, m5).t(i7, m(obtainStyledAttributes, b29.J6, m2));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static b e(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        return f(context, attributeSet, i, i2, 0);
    }

    @NonNull
    public static b f(@NonNull Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return g(context, attributeSet, i, i2, new u0(i3));
    }

    @NonNull
    public static b g(@NonNull Context context, AttributeSet attributeSet, int i, int i2, @NonNull dx1 dx1Var) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b29.I4, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(b29.J4, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(b29.K4, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, dx1Var);
    }

    @NonNull
    private static dx1 m(TypedArray typedArray, int i, @NonNull dx1 dx1Var) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return dx1Var;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new u0(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new sc9(peekValue.getFraction(1.0f, 1.0f));
        }
        return dx1Var;
    }

    @NonNull
    public zc3 h() {
        return this.k;
    }

    @NonNull
    public gx1 i() {
        return this.d;
    }

    @NonNull
    public dx1 j() {
        return this.h;
    }

    @NonNull
    public gx1 k() {
        return this.c;
    }

    @NonNull
    public dx1 l() {
        return this.g;
    }

    @NonNull
    public zc3 n() {
        return this.l;
    }

    @NonNull
    public zc3 o() {
        return this.j;
    }

    @NonNull
    public zc3 p() {
        return this.i;
    }

    @NonNull
    public gx1 q() {
        return this.a;
    }

    @NonNull
    public dx1 r() {
        return this.e;
    }

    @NonNull
    public gx1 s() {
        return this.b;
    }

    @NonNull
    public dx1 t() {
        return this.f;
    }

    public boolean u(@NonNull RectF rectF) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.l.getClass().equals(zc3.class) && this.j.getClass().equals(zc3.class) && this.i.getClass().equals(zc3.class) && this.k.getClass().equals(zc3.class)) {
            z = true;
        } else {
            z = false;
        }
        float a2 = this.e.a(rectF);
        if (this.f.a(rectF) == a2 && this.h.a(rectF) == a2 && this.g.a(rectF) == a2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((this.b instanceof lo9) && (this.a instanceof lo9) && (this.c instanceof lo9) && (this.d instanceof lo9)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    @NonNull
    public b v() {
        return new b(this);
    }

    @NonNull
    public uga w(float f) {
        return v().o(f).m();
    }

    @NonNull
    public uga x(@NonNull dx1 dx1Var) {
        return v().p(dx1Var).m();
    }

    @NonNull
    public uga y(@NonNull c cVar) {
        return v().E(cVar.a(r())).I(cVar.a(t())).w(cVar.a(j())).A(cVar.a(l())).m();
    }

    private uga(@NonNull b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
    }

    /* compiled from: ShapeAppearanceModel.java */
    /* renamed from: uga$b */
    /* loaded from: classes2.dex */
    public static final class b {
        @NonNull
        private gx1 a;
        @NonNull
        private gx1 b;
        @NonNull
        private gx1 c;
        @NonNull
        private gx1 d;
        @NonNull
        private dx1 e;
        @NonNull
        private dx1 f;
        @NonNull
        private dx1 g;
        @NonNull
        private dx1 h;
        @NonNull
        private zc3 i;
        @NonNull
        private zc3 j;
        @NonNull
        private zc3 k;
        @NonNull
        private zc3 l;

        public b() {
            this.a = ga6.b();
            this.b = ga6.b();
            this.c = ga6.b();
            this.d = ga6.b();
            this.e = new u0(0.0f);
            this.f = new u0(0.0f);
            this.g = new u0(0.0f);
            this.h = new u0(0.0f);
            this.i = ga6.c();
            this.j = ga6.c();
            this.k = ga6.c();
            this.l = ga6.c();
        }

        private static float n(gx1 gx1Var) {
            if (gx1Var instanceof lo9) {
                return ((lo9) gx1Var).a;
            }
            if (gx1Var instanceof h62) {
                return ((h62) gx1Var).a;
            }
            return -1.0f;
        }

        @NonNull
        public b A(@NonNull dx1 dx1Var) {
            this.g = dx1Var;
            return this;
        }

        @NonNull
        public b B(int i, @NonNull dx1 dx1Var) {
            return C(ga6.a(i)).E(dx1Var);
        }

        @NonNull
        public b C(@NonNull gx1 gx1Var) {
            this.a = gx1Var;
            float n = n(gx1Var);
            if (n != -1.0f) {
                D(n);
            }
            return this;
        }

        @NonNull
        public b D(float f) {
            this.e = new u0(f);
            return this;
        }

        @NonNull
        public b E(@NonNull dx1 dx1Var) {
            this.e = dx1Var;
            return this;
        }

        @NonNull
        public b F(int i, @NonNull dx1 dx1Var) {
            return G(ga6.a(i)).I(dx1Var);
        }

        @NonNull
        public b G(@NonNull gx1 gx1Var) {
            this.b = gx1Var;
            float n = n(gx1Var);
            if (n != -1.0f) {
                H(n);
            }
            return this;
        }

        @NonNull
        public b H(float f) {
            this.f = new u0(f);
            return this;
        }

        @NonNull
        public b I(@NonNull dx1 dx1Var) {
            this.f = dx1Var;
            return this;
        }

        @NonNull
        public uga m() {
            return new uga(this);
        }

        @NonNull
        public b o(float f) {
            return D(f).H(f).z(f).v(f);
        }

        @NonNull
        public b p(@NonNull dx1 dx1Var) {
            return E(dx1Var).I(dx1Var).A(dx1Var).w(dx1Var);
        }

        @NonNull
        public b q(int i, float f) {
            return r(ga6.a(i)).o(f);
        }

        @NonNull
        public b r(@NonNull gx1 gx1Var) {
            return C(gx1Var).G(gx1Var).y(gx1Var).u(gx1Var);
        }

        @NonNull
        public b s(@NonNull zc3 zc3Var) {
            this.k = zc3Var;
            return this;
        }

        @NonNull
        public b t(int i, @NonNull dx1 dx1Var) {
            return u(ga6.a(i)).w(dx1Var);
        }

        @NonNull
        public b u(@NonNull gx1 gx1Var) {
            this.d = gx1Var;
            float n = n(gx1Var);
            if (n != -1.0f) {
                v(n);
            }
            return this;
        }

        @NonNull
        public b v(float f) {
            this.h = new u0(f);
            return this;
        }

        @NonNull
        public b w(@NonNull dx1 dx1Var) {
            this.h = dx1Var;
            return this;
        }

        @NonNull
        public b x(int i, @NonNull dx1 dx1Var) {
            return y(ga6.a(i)).A(dx1Var);
        }

        @NonNull
        public b y(@NonNull gx1 gx1Var) {
            this.c = gx1Var;
            float n = n(gx1Var);
            if (n != -1.0f) {
                z(n);
            }
            return this;
        }

        @NonNull
        public b z(float f) {
            this.g = new u0(f);
            return this;
        }

        public b(@NonNull uga ugaVar) {
            this.a = ga6.b();
            this.b = ga6.b();
            this.c = ga6.b();
            this.d = ga6.b();
            this.e = new u0(0.0f);
            this.f = new u0(0.0f);
            this.g = new u0(0.0f);
            this.h = new u0(0.0f);
            this.i = ga6.c();
            this.j = ga6.c();
            this.k = ga6.c();
            this.l = ga6.c();
            this.a = ugaVar.a;
            this.b = ugaVar.b;
            this.c = ugaVar.c;
            this.d = ugaVar.d;
            this.e = ugaVar.e;
            this.f = ugaVar.f;
            this.g = ugaVar.g;
            this.h = ugaVar.h;
            this.i = ugaVar.i;
            this.j = ugaVar.j;
            this.k = ugaVar.k;
            this.l = ugaVar.l;
        }
    }

    public uga() {
        this.a = ga6.b();
        this.b = ga6.b();
        this.c = ga6.b();
        this.d = ga6.b();
        this.e = new u0(0.0f);
        this.f = new u0(0.0f);
        this.g = new u0(0.0f);
        this.h = new u0(0.0f);
        this.i = ga6.c();
        this.j = ga6.c();
        this.k = ga6.c();
        this.l = ga6.c();
    }
}
