package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
/* compiled from: RequestBuilder.java */
/* loaded from: classes.dex */
public class g<TranscodeType> extends g80<g<TranscodeType>> implements Cloneable {
    protected static final xi9 a5 = new xi9().g(d33.c).b0(yj8.LOW).j0(true);
    private final Context A;
    private final h B;
    private final Class<TranscodeType> I;
    private Object S4;
    private List<vi9<TranscodeType>> T4;
    private g<TranscodeType> U4;
    private g<TranscodeType> V4;
    private Float W4;
    private final b X;
    private boolean X4 = true;
    private final d Y;
    private boolean Y4;
    @NonNull
    private i<?, ? super TranscodeType> Z;
    private boolean Z4;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RequestBuilder.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[yj8.values().length];
            b = iArr;
            try {
                iArr[yj8.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[yj8.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[yj8.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[yj8.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"CheckResult"})
    public g(@NonNull b bVar, h hVar, Class<TranscodeType> cls, Context context) {
        this.X = bVar;
        this.B = hVar;
        this.I = cls;
        this.A = context;
        this.Z = hVar.r(cls);
        this.Y = bVar.i();
        C0(hVar.p());
        b(hVar.q());
    }

    @NonNull
    private yj8 B0(@NonNull yj8 yj8Var) {
        int i = a.b[yj8Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new IllegalArgumentException("unknown priority: " + w());
                }
                return yj8.IMMEDIATE;
            }
            return yj8.HIGH;
        }
        return yj8.NORMAL;
    }

    @SuppressLint({"CheckResult"})
    private void C0(List<vi9<Object>> list) {
        for (vi9<Object> vi9Var : list) {
            u0(vi9Var);
        }
    }

    private <Y extends n6b<TranscodeType>> Y E0(@NonNull Y y, vi9<TranscodeType> vi9Var, g80<?> g80Var, Executor executor) {
        eh8.d(y);
        if (this.Y4) {
            ii9 x0 = x0(y, vi9Var, g80Var, executor);
            ii9 h = y.h();
            if (x0.h(h) && !H0(g80Var, h)) {
                if (!((ii9) eh8.d(h)).isRunning()) {
                    h.k();
                }
                return y;
            }
            this.B.m(y);
            y.j(x0);
            this.B.z(y, x0);
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    private boolean H0(g80<?> g80Var, ii9 ii9Var) {
        if (!g80Var.I() && ii9Var.g()) {
            return true;
        }
        return false;
    }

    @NonNull
    private g<TranscodeType> N0(Object obj) {
        if (G()) {
            return e().N0(obj);
        }
        this.S4 = obj;
        this.Y4 = true;
        return f0();
    }

    private ii9 O0(Object obj, n6b<TranscodeType> n6bVar, vi9<TranscodeType> vi9Var, g80<?> g80Var, ki9 ki9Var, i<?, ? super TranscodeType> iVar, yj8 yj8Var, int i, int i2, Executor executor) {
        Context context = this.A;
        d dVar = this.Y;
        return rma.y(context, dVar, obj, this.S4, this.I, g80Var, i, i2, yj8Var, n6bVar, vi9Var, this.T4, ki9Var, dVar.f(), iVar.c(), executor);
    }

    private g<TranscodeType> w0(g<TranscodeType> gVar) {
        return gVar.k0(this.A.getTheme()).h0(qi.c(this.A));
    }

    private ii9 x0(n6b<TranscodeType> n6bVar, vi9<TranscodeType> vi9Var, g80<?> g80Var, Executor executor) {
        return y0(new Object(), n6bVar, vi9Var, null, this.Z, g80Var.w(), g80Var.s(), g80Var.r(), g80Var, executor);
    }

    private ii9 y0(Object obj, n6b<TranscodeType> n6bVar, vi9<TranscodeType> vi9Var, ki9 ki9Var, i<?, ? super TranscodeType> iVar, yj8 yj8Var, int i, int i2, g80<?> g80Var, Executor executor) {
        lk3 lk3Var;
        lk3 lk3Var2;
        if (this.V4 != null) {
            lk3Var2 = new lk3(obj, ki9Var);
            lk3Var = lk3Var2;
        } else {
            lk3Var = null;
            lk3Var2 = ki9Var;
        }
        ii9 z0 = z0(obj, n6bVar, vi9Var, lk3Var2, iVar, yj8Var, i, i2, g80Var, executor);
        if (lk3Var == null) {
            return z0;
        }
        int s = this.V4.s();
        int r = this.V4.r();
        if (vub.v(i, i2) && !this.V4.Q()) {
            s = g80Var.s();
            r = g80Var.r();
        }
        g<TranscodeType> gVar = this.V4;
        lk3 lk3Var3 = lk3Var;
        lk3Var3.p(z0, gVar.y0(obj, n6bVar, vi9Var, lk3Var3, gVar.Z, gVar.w(), s, r, this.V4, executor));
        return lk3Var3;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [g80] */
    private ii9 z0(Object obj, n6b<TranscodeType> n6bVar, vi9<TranscodeType> vi9Var, ki9 ki9Var, i<?, ? super TranscodeType> iVar, yj8 yj8Var, int i, int i2, g80<?> g80Var, Executor executor) {
        i<?, ? super TranscodeType> iVar2;
        yj8 B0;
        g<TranscodeType> gVar = this.U4;
        if (gVar != null) {
            if (!this.Z4) {
                i<?, ? super TranscodeType> iVar3 = gVar.Z;
                if (gVar.X4) {
                    iVar2 = iVar;
                } else {
                    iVar2 = iVar3;
                }
                if (gVar.J()) {
                    B0 = this.U4.w();
                } else {
                    B0 = B0(yj8Var);
                }
                yj8 yj8Var2 = B0;
                int s = this.U4.s();
                int r = this.U4.r();
                if (vub.v(i, i2) && !this.U4.Q()) {
                    s = g80Var.s();
                    r = g80Var.r();
                }
                tfb tfbVar = new tfb(obj, ki9Var);
                ii9 O0 = O0(obj, n6bVar, vi9Var, g80Var, tfbVar, iVar, yj8Var, i, i2, executor);
                this.Z4 = true;
                g<TranscodeType> gVar2 = this.U4;
                ii9 y0 = gVar2.y0(obj, n6bVar, vi9Var, tfbVar, iVar2, yj8Var2, s, r, gVar2, executor);
                this.Z4 = false;
                tfbVar.o(O0, y0);
                return tfbVar;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.W4 != null) {
            tfb tfbVar2 = new tfb(obj, ki9Var);
            tfbVar2.o(O0(obj, n6bVar, vi9Var, g80Var, tfbVar2, iVar, yj8Var, i, i2, executor), O0(obj, n6bVar, vi9Var, g80Var.clone().i0(this.W4.floatValue()), tfbVar2, iVar, B0(yj8Var), i, i2, executor));
            return tfbVar2;
        } else {
            return O0(obj, n6bVar, vi9Var, g80Var, ki9Var, iVar, yj8Var, i, i2, executor);
        }
    }

    @Override // defpackage.g80
    /* renamed from: A0 */
    public g<TranscodeType> e() {
        g<TranscodeType> gVar = (g) super.clone();
        gVar.Z = (i<?, ? super TranscodeType>) gVar.Z.clone();
        if (gVar.T4 != null) {
            gVar.T4 = new ArrayList(gVar.T4);
        }
        g<TranscodeType> gVar2 = gVar.U4;
        if (gVar2 != null) {
            gVar.U4 = gVar2.e();
        }
        g<TranscodeType> gVar3 = gVar.V4;
        if (gVar3 != null) {
            gVar.V4 = gVar3.e();
        }
        return gVar;
    }

    @NonNull
    public <Y extends n6b<TranscodeType>> Y D0(@NonNull Y y) {
        return (Y) F0(y, null, im3.b());
    }

    @NonNull
    <Y extends n6b<TranscodeType>> Y F0(@NonNull Y y, vi9<TranscodeType> vi9Var, Executor executor) {
        return (Y) E0(y, vi9Var, this, executor);
    }

    @NonNull
    public r0c<ImageView, TranscodeType> G0(@NonNull ImageView imageView) {
        g<TranscodeType> gVar;
        vub.b();
        eh8.d(imageView);
        if (!P() && N() && imageView.getScaleType() != null) {
            switch (a.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    gVar = clone().T();
                    break;
                case 2:
                    gVar = clone().U();
                    break;
                case 3:
                case 4:
                case 5:
                    gVar = clone().V();
                    break;
                case 6:
                    gVar = clone().U();
                    break;
            }
            return (r0c) E0(this.Y.a(imageView, this.I), null, gVar, im3.b());
        }
        gVar = this;
        return (r0c) E0(this.Y.a(imageView, this.I), null, gVar, im3.b());
    }

    @NonNull
    public g<TranscodeType> J0(vi9<TranscodeType> vi9Var) {
        if (G()) {
            return e().J0(vi9Var);
        }
        this.T4 = null;
        return u0(vi9Var);
    }

    @NonNull
    public g<TranscodeType> K0(Integer num) {
        return w0(N0(num));
    }

    @NonNull
    public g<TranscodeType> L0(Object obj) {
        return N0(obj);
    }

    @NonNull
    public g<TranscodeType> M0(String str) {
        return N0(str);
    }

    @NonNull
    public n6b<TranscodeType> P0() {
        return Q0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @NonNull
    public n6b<TranscodeType> Q0(int i, int i2) {
        return D0(vi8.f(this.B, i, i2));
    }

    @NonNull
    public s94<TranscodeType> R0() {
        return S0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @NonNull
    public s94<TranscodeType> S0(int i, int i2) {
        ri9 ri9Var = new ri9(i, i2);
        return (s94) F0(ri9Var, ri9Var, im3.a());
    }

    @NonNull
    public g<TranscodeType> T0(@NonNull i<?, ? super TranscodeType> iVar) {
        if (G()) {
            return e().T0(iVar);
        }
        this.Z = (i) eh8.d(iVar);
        this.X4 = false;
        return f0();
    }

    @Override // defpackage.g80
    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!super.equals(gVar) || !Objects.equals(this.I, gVar.I) || !this.Z.equals(gVar.Z) || !Objects.equals(this.S4, gVar.S4) || !Objects.equals(this.T4, gVar.T4) || !Objects.equals(this.U4, gVar.U4) || !Objects.equals(this.V4, gVar.V4) || !Objects.equals(this.W4, gVar.W4) || this.X4 != gVar.X4 || this.Y4 != gVar.Y4) {
            return false;
        }
        return true;
    }

    @Override // defpackage.g80
    public int hashCode() {
        return vub.r(this.Y4, vub.r(this.X4, vub.q(this.W4, vub.q(this.V4, vub.q(this.U4, vub.q(this.T4, vub.q(this.S4, vub.q(this.Z, vub.q(this.I, super.hashCode())))))))));
    }

    @NonNull
    public g<TranscodeType> u0(vi9<TranscodeType> vi9Var) {
        if (G()) {
            return e().u0(vi9Var);
        }
        if (vi9Var != null) {
            if (this.T4 == null) {
                this.T4 = new ArrayList();
            }
            this.T4.add(vi9Var);
        }
        return f0();
    }

    @Override // defpackage.g80
    @NonNull
    /* renamed from: v0 */
    public g<TranscodeType> b(@NonNull g80<?> g80Var) {
        eh8.d(g80Var);
        return (g) super.b(g80Var);
    }
}
