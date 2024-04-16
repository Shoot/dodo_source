package defpackage;

import defpackage.hr1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: ConstraintWidget.java */
/* renamed from: lr1  reason: default package */
/* loaded from: classes.dex */
public class lr1 {
    public static float S0 = 0.5f;
    boolean A0;
    boolean B0;
    boolean C0;
    boolean D0;
    public boolean E;
    boolean E0;
    public boolean F;
    boolean F0;
    boolean G0;
    int H0;
    int I0;
    boolean J0;
    boolean K0;
    private boolean L;
    public float[] L0;
    protected lr1[] M0;
    protected lr1[] N0;
    lr1 O0;
    lr1 P0;
    public int Q0;
    public int R0;
    public hr1 W;
    public hr1[] X;
    protected ArrayList<hr1> Y;
    private boolean[] Z;
    public b[] a0;
    public lr1 b0;
    public wu0 c;
    int c0;
    public wu0 d;
    int d0;
    public float e0;
    protected int f0;
    protected int g0;
    protected int h0;
    int i0;
    int j0;
    protected int k0;
    protected int l0;
    int m0;
    protected int n0;
    protected int o0;
    float p0;
    float q0;
    private Object r0;
    private int s0;
    private int t0;
    private String u0;
    private String v0;
    int w0;
    int x0;
    int y0;
    int z0;
    public boolean a = false;
    public t4c[] b = new t4c[2];
    public ap4 e = null;
    public gyb f = null;
    public boolean[] g = {true, true};
    boolean h = false;
    private boolean i = true;
    private boolean j = false;
    private boolean k = true;
    private int l = -1;
    private int m = -1;
    public r4c n = new r4c(this);
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private boolean r = false;
    public int s = -1;
    public int t = -1;
    private int u = 0;
    public int v = 0;
    public int w = 0;
    public int[] x = new int[2];
    public int y = 0;
    public int z = 0;
    public float A = 1.0f;
    public int B = 0;
    public int C = 0;
    public float D = 1.0f;
    int G = -1;
    float H = 1.0f;
    private int[] I = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float J = 0.0f;
    private boolean K = false;
    private boolean M = false;
    private int N = 0;
    private int O = 0;
    public hr1 P = new hr1(this, hr1.b.LEFT);
    public hr1 Q = new hr1(this, hr1.b.TOP);
    public hr1 R = new hr1(this, hr1.b.RIGHT);
    public hr1 S = new hr1(this, hr1.b.BOTTOM);
    public hr1 T = new hr1(this, hr1.b.BASELINE);
    hr1 U = new hr1(this, hr1.b.CENTER_X);
    hr1 V = new hr1(this, hr1.b.CENTER_Y);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintWidget.java */
    /* renamed from: lr1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.values().length];
            b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[hr1.b.values().length];
            a = iArr2;
            try {
                iArr2[hr1.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[hr1.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[hr1.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[hr1.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[hr1.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[hr1.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[hr1.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[hr1.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[hr1.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: ConstraintWidget.java */
    /* renamed from: lr1$b */
    /* loaded from: classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public lr1() {
        hr1 hr1Var = new hr1(this, hr1.b.CENTER);
        this.W = hr1Var;
        this.X = new hr1[]{this.P, this.R, this.Q, this.S, this.T, hr1Var};
        this.Y = new ArrayList<>();
        this.Z = new boolean[2];
        b bVar = b.FIXED;
        this.a0 = new b[]{bVar, bVar};
        this.b0 = null;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0.0f;
        this.f0 = -1;
        this.g0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        float f = S0;
        this.p0 = f;
        this.q0 = f;
        this.s0 = 0;
        this.t0 = 0;
        this.u0 = null;
        this.v0 = null;
        this.G0 = false;
        this.H0 = 0;
        this.I0 = 0;
        this.L0 = new float[]{-1.0f, -1.0f};
        this.M0 = new lr1[]{null, null};
        this.N0 = new lr1[]{null, null};
        this.O0 = null;
        this.P0 = null;
        this.Q0 = -1;
        this.R0 = -1;
        d();
    }

    private void d() {
        this.Y.add(this.P);
        this.Y.add(this.Q);
        this.Y.add(this.R);
        this.Y.add(this.S);
        this.Y.add(this.U);
        this.Y.add(this.V);
        this.Y.add(this.W);
        this.Y.add(this.T);
    }

    private boolean d0(int i) {
        hr1 hr1Var;
        hr1 hr1Var2;
        int i2 = i * 2;
        hr1[] hr1VarArr = this.X;
        hr1 hr1Var3 = hr1VarArr[i2];
        hr1 hr1Var4 = hr1Var3.f;
        if (hr1Var4 != null && hr1Var4.f != hr1Var3 && (hr1Var2 = (hr1Var = hr1VarArr[i2 + 1]).f) != null && hr1Var2.f == hr1Var) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x0462, code lost:
        if ((r4 instanceof defpackage.q60) != false) goto L214;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0500 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x051a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0548 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:379:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:382:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(defpackage.gq5 r37, boolean r38, boolean r39, boolean r40, boolean r41, defpackage.lqa r42, defpackage.lqa r43, defpackage.lr1.b r44, boolean r45, defpackage.hr1 r46, defpackage.hr1 r47, int r48, int r49, int r50, int r51, float r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, int r58, int r59, int r60, int r61, float r62, boolean r63) {
        /*
            Method dump skipped, instructions count: 1407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr1.i(gq5, boolean, boolean, boolean, boolean, lqa, lqa, lr1$b, boolean, hr1, hr1, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public int A() {
        return this.H0;
    }

    public void A0(int i, int i2) {
        if (this.o) {
            return;
        }
        this.P.t(i);
        this.R.t(i2);
        this.g0 = i;
        this.c0 = i2 - i;
        this.o = true;
    }

    public b B() {
        return this.a0[0];
    }

    public void B0(int i) {
        this.P.t(i);
        this.g0 = i;
    }

    public int C() {
        int i;
        hr1 hr1Var = this.P;
        if (hr1Var != null) {
            i = hr1Var.g;
        } else {
            i = 0;
        }
        hr1 hr1Var2 = this.R;
        if (hr1Var2 != null) {
            return i + hr1Var2.g;
        }
        return i;
    }

    public void C0(int i) {
        this.Q.t(i);
        this.h0 = i;
    }

    public int D() {
        return this.N;
    }

    public void D0(int i, int i2) {
        if (this.p) {
            return;
        }
        this.Q.t(i);
        this.S.t(i2);
        this.h0 = i;
        this.d0 = i2 - i;
        if (this.K) {
            this.T.t(i + this.m0);
        }
        this.p = true;
    }

    public int E() {
        return this.O;
    }

    public void E0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.g0 = i;
        this.h0 = i2;
        if (this.t0 == 8) {
            this.c0 = 0;
            this.d0 = 0;
            return;
        }
        b[] bVarArr = this.a0;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i7 < (i6 = this.c0)) {
            i7 = i6;
        }
        if (bVarArr[1] == bVar2 && i8 < (i5 = this.d0)) {
            i8 = i5;
        }
        this.c0 = i7;
        this.d0 = i8;
        int i9 = this.o0;
        if (i8 < i9) {
            this.d0 = i9;
        }
        int i10 = this.n0;
        if (i7 < i10) {
            this.c0 = i10;
        }
        int i11 = this.z;
        if (i11 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.c0 = Math.min(this.c0, i11);
        }
        int i12 = this.C;
        if (i12 > 0 && this.a0[1] == b.MATCH_CONSTRAINT) {
            this.d0 = Math.min(this.d0, i12);
        }
        int i13 = this.c0;
        if (i7 != i13) {
            this.l = i13;
        }
        int i14 = this.d0;
        if (i8 != i14) {
            this.m = i14;
        }
    }

    public int F(int i) {
        if (i == 0) {
            return U();
        }
        if (i == 1) {
            return y();
        }
        return 0;
    }

    public void F0(boolean z) {
        this.K = z;
    }

    public int G() {
        return this.I[1];
    }

    public void G0(int i) {
        this.d0 = i;
        int i2 = this.o0;
        if (i < i2) {
            this.d0 = i2;
        }
    }

    public int H() {
        return this.I[0];
    }

    public void H0(float f) {
        this.p0 = f;
    }

    public int I() {
        return this.o0;
    }

    public void I0(int i) {
        this.H0 = i;
    }

    public int J() {
        return this.n0;
    }

    public void J0(int i, int i2) {
        this.g0 = i;
        int i3 = i2 - i;
        this.c0 = i3;
        int i4 = this.n0;
        if (i3 < i4) {
            this.c0 = i4;
        }
    }

    public lr1 K(int i) {
        hr1 hr1Var;
        hr1 hr1Var2;
        if (i == 0) {
            hr1 hr1Var3 = this.R;
            hr1 hr1Var4 = hr1Var3.f;
            if (hr1Var4 != null && hr1Var4.f == hr1Var3) {
                return hr1Var4.d;
            }
            return null;
        } else if (i == 1 && (hr1Var2 = (hr1Var = this.S).f) != null && hr1Var2.f == hr1Var) {
            return hr1Var2.d;
        } else {
            return null;
        }
    }

    public void K0(b bVar) {
        this.a0[0] = bVar;
    }

    public lr1 L() {
        return this.b0;
    }

    public void L0(int i, int i2, int i3, float f) {
        this.v = i;
        this.y = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.z = i3;
        this.A = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.v = 2;
        }
    }

    public lr1 M(int i) {
        hr1 hr1Var;
        hr1 hr1Var2;
        if (i == 0) {
            hr1 hr1Var3 = this.P;
            hr1 hr1Var4 = hr1Var3.f;
            if (hr1Var4 != null && hr1Var4.f == hr1Var3) {
                return hr1Var4.d;
            }
            return null;
        } else if (i == 1 && (hr1Var2 = (hr1Var = this.Q).f) != null && hr1Var2.f == hr1Var) {
            return hr1Var2.d;
        } else {
            return null;
        }
    }

    public void M0(float f) {
        this.L0[0] = f;
    }

    public int N() {
        return V() + this.c0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void N0(int i, boolean z) {
        this.Z[i] = z;
    }

    public t4c O(int i) {
        if (i == 0) {
            return this.e;
        }
        if (i == 1) {
            return this.f;
        }
        return null;
    }

    public void O0(boolean z) {
        this.L = z;
    }

    public float P() {
        return this.q0;
    }

    public void P0(boolean z) {
        this.M = z;
    }

    public int Q() {
        return this.I0;
    }

    public void Q0(int i, int i2) {
        this.N = i;
        this.O = i2;
        T0(false);
    }

    public b R() {
        return this.a0[1];
    }

    public void R0(int i) {
        this.I[1] = i;
    }

    public int S() {
        int i;
        if (this.P != null) {
            i = this.Q.g;
        } else {
            i = 0;
        }
        if (this.R != null) {
            return i + this.S.g;
        }
        return i;
    }

    public void S0(int i) {
        this.I[0] = i;
    }

    public int T() {
        return this.t0;
    }

    public void T0(boolean z) {
        this.i = z;
    }

    public int U() {
        if (this.t0 == 8) {
            return 0;
        }
        return this.c0;
    }

    public void U0(int i) {
        if (i < 0) {
            this.o0 = 0;
        } else {
            this.o0 = i;
        }
    }

    public int V() {
        lr1 lr1Var = this.b0;
        if (lr1Var != null && (lr1Var instanceof mr1)) {
            return ((mr1) lr1Var).a1 + this.g0;
        }
        return this.g0;
    }

    public void V0(int i) {
        if (i < 0) {
            this.n0 = 0;
        } else {
            this.n0 = i;
        }
    }

    public int W() {
        lr1 lr1Var = this.b0;
        if (lr1Var != null && (lr1Var instanceof mr1)) {
            return ((mr1) lr1Var).b1 + this.h0;
        }
        return this.h0;
    }

    public void W0(int i, int i2) {
        this.g0 = i;
        this.h0 = i2;
    }

    public boolean X() {
        return this.K;
    }

    public void X0(lr1 lr1Var) {
        this.b0 = lr1Var;
    }

    public boolean Y(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            if (this.P.f != null) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.R.f != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i5 + i6 >= 2) {
                return false;
            }
            return true;
        }
        if (this.Q.f != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.S.f != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i7 = i2 + i3;
        if (this.T.f != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i7 + i4 >= 2) {
            return false;
        }
        return true;
    }

    public void Y0(float f) {
        this.q0 = f;
    }

    public boolean Z() {
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            if (this.Y.get(i).m()) {
                return true;
            }
        }
        return false;
    }

    public void Z0(int i) {
        this.I0 = i;
    }

    public boolean a0() {
        if (this.l == -1 && this.m == -1) {
            return false;
        }
        return true;
    }

    public void a1(int i, int i2) {
        this.h0 = i;
        int i3 = i2 - i;
        this.d0 = i3;
        int i4 = this.o0;
        if (i3 < i4) {
            this.d0 = i4;
        }
    }

    public boolean b0(int i, int i2) {
        hr1 hr1Var;
        hr1 hr1Var2;
        if (i == 0) {
            hr1 hr1Var3 = this.P.f;
            if (hr1Var3 != null && hr1Var3.n() && (hr1Var2 = this.R.f) != null && hr1Var2.n() && (this.R.f.e() - this.R.f()) - (this.P.f.e() + this.P.f()) >= i2) {
                return true;
            }
            return false;
        }
        hr1 hr1Var4 = this.Q.f;
        if (hr1Var4 != null && hr1Var4.n() && (hr1Var = this.S.f) != null && hr1Var.n() && (this.S.f.e() - this.S.f()) - (this.Q.f.e() + this.Q.f()) >= i2) {
            return true;
        }
        return false;
        return false;
    }

    public void b1(b bVar) {
        this.a0[1] = bVar;
    }

    public void c0(hr1.b bVar, lr1 lr1Var, hr1.b bVar2, int i, int i2) {
        p(bVar).b(lr1Var.p(bVar2), i, i2, true);
    }

    public void c1(int i, int i2, int i3, float f) {
        this.w = i;
        this.B = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.C = i3;
        this.D = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.w = 2;
        }
    }

    public void d1(float f) {
        this.L0[1] = f;
    }

    public void e(mr1 mr1Var, gq5 gq5Var, HashSet<lr1> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            lb7.a(mr1Var, gq5Var, this);
            hashSet.remove(this);
            g(gq5Var, mr1Var.P1(64));
        }
        if (i == 0) {
            HashSet<hr1> d = this.P.d();
            if (d != null) {
                Iterator<hr1> it = d.iterator();
                while (it.hasNext()) {
                    it.next().d.e(mr1Var, gq5Var, hashSet, i, true);
                }
            }
            HashSet<hr1> d2 = this.R.d();
            if (d2 != null) {
                Iterator<hr1> it2 = d2.iterator();
                while (it2.hasNext()) {
                    it2.next().d.e(mr1Var, gq5Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<hr1> d3 = this.Q.d();
        if (d3 != null) {
            Iterator<hr1> it3 = d3.iterator();
            while (it3.hasNext()) {
                it3.next().d.e(mr1Var, gq5Var, hashSet, i, true);
            }
        }
        HashSet<hr1> d4 = this.S.d();
        if (d4 != null) {
            Iterator<hr1> it4 = d4.iterator();
            while (it4.hasNext()) {
                it4.next().d.e(mr1Var, gq5Var, hashSet, i, true);
            }
        }
        HashSet<hr1> d5 = this.T.d();
        if (d5 != null) {
            Iterator<hr1> it5 = d5.iterator();
            while (it5.hasNext()) {
                it5.next().d.e(mr1Var, gq5Var, hashSet, i, true);
            }
        }
    }

    public boolean e0() {
        return this.q;
    }

    public void e1(int i) {
        this.t0 = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        if (!(this instanceof s1c) && !(this instanceof vi4)) {
            return false;
        }
        return true;
    }

    public boolean f0(int i) {
        return this.Z[i];
    }

    public void f1(int i) {
        this.c0 = i;
        int i2 = this.n0;
        if (i < i2) {
            this.c0 = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x049e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(defpackage.gq5 r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr1.g(gq5, boolean):void");
    }

    public boolean g0() {
        hr1 hr1Var = this.P;
        hr1 hr1Var2 = hr1Var.f;
        if (hr1Var2 == null || hr1Var2.f != hr1Var) {
            hr1 hr1Var3 = this.R;
            hr1 hr1Var4 = hr1Var3.f;
            if (hr1Var4 != null && hr1Var4.f == hr1Var3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void g1(int i) {
        if (i >= 0 && i <= 3) {
            this.u = i;
        }
    }

    public boolean h() {
        if (this.t0 != 8) {
            return true;
        }
        return false;
    }

    public boolean h0() {
        return this.L;
    }

    public void h1(int i) {
        this.g0 = i;
    }

    public boolean i0() {
        hr1 hr1Var = this.Q;
        hr1 hr1Var2 = hr1Var.f;
        if (hr1Var2 == null || hr1Var2.f != hr1Var) {
            hr1 hr1Var3 = this.S;
            hr1 hr1Var4 = hr1Var3.f;
            if (hr1Var4 != null && hr1Var4.f == hr1Var3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void i1(int i) {
        this.h0 = i;
    }

    public void j(hr1.b bVar, lr1 lr1Var, hr1.b bVar2, int i) {
        hr1.b bVar3;
        hr1.b bVar4;
        boolean z;
        hr1.b bVar5 = hr1.b.CENTER;
        if (bVar == bVar5) {
            if (bVar2 == bVar5) {
                hr1.b bVar6 = hr1.b.LEFT;
                hr1 p = p(bVar6);
                hr1.b bVar7 = hr1.b.RIGHT;
                hr1 p2 = p(bVar7);
                hr1.b bVar8 = hr1.b.TOP;
                hr1 p3 = p(bVar8);
                hr1.b bVar9 = hr1.b.BOTTOM;
                hr1 p4 = p(bVar9);
                boolean z2 = true;
                if ((p != null && p.o()) || (p2 != null && p2.o())) {
                    z = false;
                } else {
                    j(bVar6, lr1Var, bVar6, 0);
                    j(bVar7, lr1Var, bVar7, 0);
                    z = true;
                }
                if ((p3 != null && p3.o()) || (p4 != null && p4.o())) {
                    z2 = false;
                } else {
                    j(bVar8, lr1Var, bVar8, 0);
                    j(bVar9, lr1Var, bVar9, 0);
                }
                if (z && z2) {
                    p(bVar5).a(lr1Var.p(bVar5), 0);
                    return;
                } else if (z) {
                    hr1.b bVar10 = hr1.b.CENTER_X;
                    p(bVar10).a(lr1Var.p(bVar10), 0);
                    return;
                } else if (z2) {
                    hr1.b bVar11 = hr1.b.CENTER_Y;
                    p(bVar11).a(lr1Var.p(bVar11), 0);
                    return;
                } else {
                    return;
                }
            }
            hr1.b bVar12 = hr1.b.LEFT;
            if (bVar2 != bVar12 && bVar2 != hr1.b.RIGHT) {
                hr1.b bVar13 = hr1.b.TOP;
                if (bVar2 == bVar13 || bVar2 == hr1.b.BOTTOM) {
                    j(bVar13, lr1Var, bVar2, 0);
                    j(hr1.b.BOTTOM, lr1Var, bVar2, 0);
                    p(bVar5).a(lr1Var.p(bVar2), 0);
                    return;
                }
                return;
            }
            j(bVar12, lr1Var, bVar2, 0);
            j(hr1.b.RIGHT, lr1Var, bVar2, 0);
            p(bVar5).a(lr1Var.p(bVar2), 0);
            return;
        }
        hr1.b bVar14 = hr1.b.CENTER_X;
        if (bVar == bVar14 && (bVar2 == (bVar4 = hr1.b.LEFT) || bVar2 == hr1.b.RIGHT)) {
            hr1 p5 = p(bVar4);
            hr1 p6 = lr1Var.p(bVar2);
            hr1 p7 = p(hr1.b.RIGHT);
            p5.a(p6, 0);
            p7.a(p6, 0);
            p(bVar14).a(p6, 0);
            return;
        }
        hr1.b bVar15 = hr1.b.CENTER_Y;
        if (bVar == bVar15 && (bVar2 == (bVar3 = hr1.b.TOP) || bVar2 == hr1.b.BOTTOM)) {
            hr1 p8 = lr1Var.p(bVar2);
            p(bVar3).a(p8, 0);
            p(hr1.b.BOTTOM).a(p8, 0);
            p(bVar15).a(p8, 0);
        } else if (bVar == bVar14 && bVar2 == bVar14) {
            hr1.b bVar16 = hr1.b.LEFT;
            p(bVar16).a(lr1Var.p(bVar16), 0);
            hr1.b bVar17 = hr1.b.RIGHT;
            p(bVar17).a(lr1Var.p(bVar17), 0);
            p(bVar14).a(lr1Var.p(bVar2), 0);
        } else if (bVar == bVar15 && bVar2 == bVar15) {
            hr1.b bVar18 = hr1.b.TOP;
            p(bVar18).a(lr1Var.p(bVar18), 0);
            hr1.b bVar19 = hr1.b.BOTTOM;
            p(bVar19).a(lr1Var.p(bVar19), 0);
            p(bVar15).a(lr1Var.p(bVar2), 0);
        } else {
            hr1 p9 = p(bVar);
            hr1 p10 = lr1Var.p(bVar2);
            if (p9.p(p10)) {
                hr1.b bVar20 = hr1.b.BASELINE;
                if (bVar == bVar20) {
                    hr1 p11 = p(hr1.b.TOP);
                    hr1 p12 = p(hr1.b.BOTTOM);
                    if (p11 != null) {
                        p11.q();
                    }
                    if (p12 != null) {
                        p12.q();
                    }
                } else if (bVar != hr1.b.TOP && bVar != hr1.b.BOTTOM) {
                    if (bVar == hr1.b.LEFT || bVar == hr1.b.RIGHT) {
                        hr1 p13 = p(bVar5);
                        if (p13.j() != p10) {
                            p13.q();
                        }
                        hr1 g = p(bVar).g();
                        hr1 p14 = p(bVar14);
                        if (p14.o()) {
                            g.q();
                            p14.q();
                        }
                    }
                } else {
                    hr1 p15 = p(bVar20);
                    if (p15 != null) {
                        p15.q();
                    }
                    hr1 p16 = p(bVar5);
                    if (p16.j() != p10) {
                        p16.q();
                    }
                    hr1 g2 = p(bVar).g();
                    hr1 p17 = p(bVar15);
                    if (p17.o()) {
                        g2.q();
                        p17.q();
                    }
                }
                p9.a(p10, i);
            }
        }
    }

    public boolean j0() {
        return this.M;
    }

    public void j1(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.G == -1) {
            if (z3 && !z4) {
                this.G = 0;
            } else if (!z3 && z4) {
                this.G = 1;
                if (this.f0 == -1) {
                    this.H = 1.0f / this.H;
                }
            }
        }
        if (this.G == 0 && (!this.Q.o() || !this.S.o())) {
            this.G = 1;
        } else if (this.G == 1 && (!this.P.o() || !this.R.o())) {
            this.G = 0;
        }
        if (this.G == -1 && (!this.Q.o() || !this.S.o() || !this.P.o() || !this.R.o())) {
            if (this.Q.o() && this.S.o()) {
                this.G = 0;
            } else if (this.P.o() && this.R.o()) {
                this.H = 1.0f / this.H;
                this.G = 1;
            }
        }
        if (this.G == -1) {
            int i = this.y;
            if (i > 0 && this.B == 0) {
                this.G = 0;
            } else if (i == 0 && this.B > 0) {
                this.H = 1.0f / this.H;
                this.G = 1;
            }
        }
    }

    public void k(hr1 hr1Var, hr1 hr1Var2, int i) {
        if (hr1Var.h() == this) {
            j(hr1Var.k(), hr1Var2.h(), hr1Var2.k(), i);
        }
    }

    public boolean k0() {
        if (this.i && this.t0 != 8) {
            return true;
        }
        return false;
    }

    public void k1(boolean z, boolean z2) {
        int i;
        int i2;
        boolean k = z & this.e.k();
        boolean k2 = z2 & this.f.k();
        ap4 ap4Var = this.e;
        int i3 = ap4Var.h.g;
        gyb gybVar = this.f;
        int i4 = gybVar.h.g;
        int i5 = ap4Var.i.g;
        int i6 = gybVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (k) {
            this.g0 = i3;
        }
        if (k2) {
            this.h0 = i4;
        }
        if (this.t0 == 8) {
            this.c0 = 0;
            this.d0 = 0;
            return;
        }
        if (k) {
            if (this.a0[0] == b.FIXED && i8 < (i2 = this.c0)) {
                i8 = i2;
            }
            this.c0 = i8;
            int i10 = this.n0;
            if (i8 < i10) {
                this.c0 = i10;
            }
        }
        if (k2) {
            if (this.a0[1] == b.FIXED && i9 < (i = this.d0)) {
                i9 = i;
            }
            this.d0 = i9;
            int i11 = this.o0;
            if (i9 < i11) {
                this.d0 = i11;
            }
        }
    }

    public void l(lr1 lr1Var, float f, int i) {
        hr1.b bVar = hr1.b.CENTER;
        c0(bVar, lr1Var, bVar, i, 0);
        this.J = f;
    }

    public boolean l0() {
        if (!this.o && (!this.P.n() || !this.R.n())) {
            return false;
        }
        return true;
    }

    public void l1(gq5 gq5Var, boolean z) {
        gyb gybVar;
        ap4 ap4Var;
        int y = gq5Var.y(this.P);
        int y2 = gq5Var.y(this.Q);
        int y3 = gq5Var.y(this.R);
        int y4 = gq5Var.y(this.S);
        if (z && (ap4Var = this.e) != null) {
            i03 i03Var = ap4Var.h;
            if (i03Var.j) {
                i03 i03Var2 = ap4Var.i;
                if (i03Var2.j) {
                    y = i03Var.g;
                    y3 = i03Var2.g;
                }
            }
        }
        if (z && (gybVar = this.f) != null) {
            i03 i03Var3 = gybVar.h;
            if (i03Var3.j) {
                i03 i03Var4 = gybVar.i;
                if (i03Var4.j) {
                    y2 = i03Var3.g;
                    y4 = i03Var4.g;
                }
            }
        }
        int i = y4 - y2;
        if (y3 - y < 0 || i < 0 || y == Integer.MIN_VALUE || y == Integer.MAX_VALUE || y2 == Integer.MIN_VALUE || y2 == Integer.MAX_VALUE || y3 == Integer.MIN_VALUE || y3 == Integer.MAX_VALUE || y4 == Integer.MIN_VALUE || y4 == Integer.MAX_VALUE) {
            y = 0;
            y4 = 0;
            y2 = 0;
            y3 = 0;
        }
        E0(y, y2, y3, y4);
    }

    public void m(lr1 lr1Var, HashMap<lr1, lr1> hashMap) {
        lr1 lr1Var2;
        lr1 lr1Var3;
        this.s = lr1Var.s;
        this.t = lr1Var.t;
        this.v = lr1Var.v;
        this.w = lr1Var.w;
        int[] iArr = this.x;
        int[] iArr2 = lr1Var.x;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.y = lr1Var.y;
        this.z = lr1Var.z;
        this.B = lr1Var.B;
        this.C = lr1Var.C;
        this.D = lr1Var.D;
        this.E = lr1Var.E;
        this.F = lr1Var.F;
        this.G = lr1Var.G;
        this.H = lr1Var.H;
        int[] iArr3 = lr1Var.I;
        this.I = Arrays.copyOf(iArr3, iArr3.length);
        this.J = lr1Var.J;
        this.K = lr1Var.K;
        this.L = lr1Var.L;
        this.P.q();
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.W.q();
        this.a0 = (b[]) Arrays.copyOf(this.a0, 2);
        lr1 lr1Var4 = null;
        if (this.b0 == null) {
            lr1Var2 = null;
        } else {
            lr1Var2 = hashMap.get(lr1Var.b0);
        }
        this.b0 = lr1Var2;
        this.c0 = lr1Var.c0;
        this.d0 = lr1Var.d0;
        this.e0 = lr1Var.e0;
        this.f0 = lr1Var.f0;
        this.g0 = lr1Var.g0;
        this.h0 = lr1Var.h0;
        this.i0 = lr1Var.i0;
        this.j0 = lr1Var.j0;
        this.k0 = lr1Var.k0;
        this.l0 = lr1Var.l0;
        this.m0 = lr1Var.m0;
        this.n0 = lr1Var.n0;
        this.o0 = lr1Var.o0;
        this.p0 = lr1Var.p0;
        this.q0 = lr1Var.q0;
        this.r0 = lr1Var.r0;
        this.s0 = lr1Var.s0;
        this.t0 = lr1Var.t0;
        this.u0 = lr1Var.u0;
        this.v0 = lr1Var.v0;
        this.w0 = lr1Var.w0;
        this.x0 = lr1Var.x0;
        this.y0 = lr1Var.y0;
        this.z0 = lr1Var.z0;
        this.A0 = lr1Var.A0;
        this.B0 = lr1Var.B0;
        this.C0 = lr1Var.C0;
        this.D0 = lr1Var.D0;
        this.E0 = lr1Var.E0;
        this.F0 = lr1Var.F0;
        this.H0 = lr1Var.H0;
        this.I0 = lr1Var.I0;
        this.J0 = lr1Var.J0;
        this.K0 = lr1Var.K0;
        float[] fArr = this.L0;
        float[] fArr2 = lr1Var.L0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        lr1[] lr1VarArr = this.M0;
        lr1[] lr1VarArr2 = lr1Var.M0;
        lr1VarArr[0] = lr1VarArr2[0];
        lr1VarArr[1] = lr1VarArr2[1];
        lr1[] lr1VarArr3 = this.N0;
        lr1[] lr1VarArr4 = lr1Var.N0;
        lr1VarArr3[0] = lr1VarArr4[0];
        lr1VarArr3[1] = lr1VarArr4[1];
        lr1 lr1Var5 = lr1Var.O0;
        if (lr1Var5 == null) {
            lr1Var3 = null;
        } else {
            lr1Var3 = hashMap.get(lr1Var5);
        }
        this.O0 = lr1Var3;
        lr1 lr1Var6 = lr1Var.P0;
        if (lr1Var6 != null) {
            lr1Var4 = hashMap.get(lr1Var6);
        }
        this.P0 = lr1Var4;
    }

    public boolean m0() {
        if (!this.p && (!this.Q.n() || !this.S.n())) {
            return false;
        }
        return true;
    }

    public void n(gq5 gq5Var) {
        gq5Var.q(this.P);
        gq5Var.q(this.Q);
        gq5Var.q(this.R);
        gq5Var.q(this.S);
        if (this.m0 > 0) {
            gq5Var.q(this.T);
        }
    }

    public boolean n0() {
        return this.r;
    }

    public void o() {
        if (this.e == null) {
            this.e = new ap4(this);
        }
        if (this.f == null) {
            this.f = new gyb(this);
        }
    }

    public void o0() {
        this.q = true;
    }

    public hr1 p(hr1.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return this.P;
            case 2:
                return this.Q;
            case 3:
                return this.R;
            case 4:
                return this.S;
            case 5:
                return this.T;
            case 6:
                return this.W;
            case 7:
                return this.U;
            case 8:
                return this.V;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void p0() {
        this.r = true;
    }

    public int q() {
        return this.m0;
    }

    public boolean q0() {
        b[] bVarArr = this.a0;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        if (bVar != bVar2 || bVarArr[1] != bVar2) {
            return false;
        }
        return true;
    }

    public float r(int i) {
        if (i == 0) {
            return this.p0;
        }
        if (i == 1) {
            return this.q0;
        }
        return -1.0f;
    }

    public void r0() {
        this.P.q();
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.W.q();
        this.b0 = null;
        this.J = 0.0f;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0.0f;
        this.f0 = -1;
        this.g0 = 0;
        this.h0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = 0;
        float f = S0;
        this.p0 = f;
        this.q0 = f;
        b[] bVarArr = this.a0;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.r0 = null;
        this.s0 = 0;
        this.t0 = 0;
        this.v0 = null;
        this.E0 = false;
        this.F0 = false;
        this.H0 = 0;
        this.I0 = 0;
        this.J0 = false;
        this.K0 = false;
        float[] fArr = this.L0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.s = -1;
        this.t = -1;
        int[] iArr = this.I;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.v = 0;
        this.w = 0;
        this.A = 1.0f;
        this.D = 1.0f;
        this.z = Integer.MAX_VALUE;
        this.C = Integer.MAX_VALUE;
        this.y = 0;
        this.B = 0;
        this.h = false;
        this.G = -1;
        this.H = 1.0f;
        this.G0 = false;
        boolean[] zArr = this.g;
        zArr[0] = true;
        zArr[1] = true;
        this.M = false;
        boolean[] zArr2 = this.Z;
        zArr2[0] = false;
        zArr2[1] = false;
        this.i = true;
        int[] iArr2 = this.x;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.l = -1;
        this.m = -1;
    }

    public int s() {
        return W() + this.d0;
    }

    public void s0() {
        lr1 L = L();
        if (L != null && (L instanceof mr1) && ((mr1) L()).H1()) {
            return;
        }
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            this.Y.get(i).q();
        }
    }

    public Object t() {
        return this.r0;
    }

    public void t0() {
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            this.Y.get(i).r();
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.v0 == null) {
            str = "";
        } else {
            str = "type: " + this.v0 + " ";
        }
        sb.append(str);
        if (this.u0 != null) {
            str2 = "id: " + this.u0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.g0);
        sb.append(", ");
        sb.append(this.h0);
        sb.append(") - (");
        sb.append(this.c0);
        sb.append(" x ");
        sb.append(this.d0);
        sb.append(")");
        return sb.toString();
    }

    public String u() {
        return this.u0;
    }

    public void u0(kl0 kl0Var) {
        this.P.s(kl0Var);
        this.Q.s(kl0Var);
        this.R.s(kl0Var);
        this.S.s(kl0Var);
        this.T.s(kl0Var);
        this.W.s(kl0Var);
        this.U.s(kl0Var);
        this.V.s(kl0Var);
    }

    public b v(int i) {
        if (i == 0) {
            return B();
        }
        if (i == 1) {
            return R();
        }
        return null;
    }

    public void v0(int i) {
        boolean z;
        this.m0 = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.K = z;
    }

    public float w() {
        return this.e0;
    }

    public void w0(Object obj) {
        this.r0 = obj;
    }

    public int x() {
        return this.f0;
    }

    public void x0(String str) {
        this.u0 = str;
    }

    public int y() {
        if (this.t0 == 8) {
            return 0;
        }
        return this.d0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0087 -> B:41:0x0088). Please submit an issue!!! */
    public void y0(String str) {
        float f;
        int i = 0;
        if (str != null && str.length() != 0) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            int i3 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                }
                i3 = i2;
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i2, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        if (i3 == 1) {
                            f = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f = 0.0f;
            } else {
                String substring4 = str.substring(i2);
                if (substring4.length() > 0) {
                    f = Float.parseFloat(substring4);
                }
                f = 0.0f;
            }
            i = (f > i ? 1 : (f == i ? 0 : -1));
            if (i > 0) {
                this.e0 = f;
                this.f0 = i3;
                return;
            }
            return;
        }
        this.e0 = 0.0f;
    }

    public float z() {
        return this.p0;
    }

    public void z0(int i) {
        if (!this.K) {
            return;
        }
        int i2 = i - this.m0;
        int i3 = this.d0 + i2;
        this.h0 = i2;
        this.Q.t(i2);
        this.S.t(i3);
        this.T.t(i);
        this.p = true;
    }
}
