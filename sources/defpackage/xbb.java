package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.n;
import defpackage.k53;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: TextLayer.java */
/* renamed from: xbb  reason: default package */
/* loaded from: classes.dex */
public class xbb extends v70 {
    private final StringBuilder D;
    private final RectF E;
    private final Matrix F;
    private final Paint G;
    private final Paint H;
    private final Map<u24, List<jt1>> I;
    private final py5<String> J;
    private final vbb K;
    private final n L;
    private final ez5 M;
    private t70<Integer, Integer> N;
    private t70<Integer, Integer> O;
    private t70<Integer, Integer> P;
    private t70<Integer, Integer> Q;
    private t70<Float, Float> R;
    private t70<Float, Float> S;
    private t70<Float, Float> T;
    private t70<Float, Float> U;
    private t70<Float, Float> V;
    private t70<Typeface, Typeface> W;

    /* compiled from: TextLayer.java */
    /* renamed from: xbb$a */
    /* loaded from: classes.dex */
    class a extends Paint {
        a(int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* compiled from: TextLayer.java */
    /* renamed from: xbb$b */
    /* loaded from: classes.dex */
    class b extends Paint {
        b(int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextLayer.java */
    /* renamed from: xbb$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k53.a.values().length];
            a = iArr;
            try {
                iArr[k53.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[k53.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[k53.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public xbb(n nVar, em5 em5Var) {
        super(nVar, em5Var);
        pj pjVar;
        pj pjVar2;
        oj ojVar;
        oj ojVar2;
        this.D = new StringBuilder(2);
        this.E = new RectF();
        this.F = new Matrix();
        this.G = new a(1);
        this.H = new b(1);
        this.I = new HashMap();
        this.J = new py5<>();
        this.L = nVar;
        this.M = em5Var.b();
        vbb a2 = em5Var.s().a();
        this.K = a2;
        a2.a(this);
        i(a2);
        zj t = em5Var.t();
        if (t != null && (ojVar2 = t.a) != null) {
            t70<Integer, Integer> a3 = ojVar2.a();
            this.N = a3;
            a3.a(this);
            i(this.N);
        }
        if (t != null && (ojVar = t.b) != null) {
            t70<Integer, Integer> a4 = ojVar.a();
            this.P = a4;
            a4.a(this);
            i(this.P);
        }
        if (t != null && (pjVar2 = t.c) != null) {
            t70<Float, Float> a5 = pjVar2.a();
            this.R = a5;
            a5.a(this);
            i(this.R);
        }
        if (t != null && (pjVar = t.d) != null) {
            t70<Float, Float> a6 = pjVar.a();
            this.T = a6;
            a6.a(this);
            i(this.T);
        }
    }

    private void O(k53.a aVar, Canvas canvas, float f) {
        int i = c.a[aVar.ordinal()];
        if (i != 2) {
            if (i == 3) {
                canvas.translate((-f) / 2.0f, 0.0f);
                return;
            }
            return;
        }
        canvas.translate(-f, 0.0f);
    }

    private String P(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!c0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        if (this.J.e(j)) {
            return this.J.g(j);
        }
        this.D.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.D.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.D.toString();
        this.J.l(j, sb);
        return sb;
    }

    private void Q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void R(u24 u24Var, Matrix matrix, float f, k53 k53Var, Canvas canvas) {
        List<jt1> Y = Y(u24Var);
        for (int i = 0; i < Y.size(); i++) {
            Path path = Y.get(i).getPath();
            path.computeBounds(this.E, false);
            this.F.set(matrix);
            this.F.preTranslate(0.0f, (-k53Var.g) * fvb.e());
            this.F.preScale(f, f);
            path.transform(this.F);
            if (k53Var.k) {
                U(path, this.G, canvas);
                U(path, this.H, canvas);
            } else {
                U(path, this.H, canvas);
                U(path, this.G, canvas);
            }
        }
    }

    private void S(String str, k53 k53Var, Canvas canvas) {
        if (k53Var.k) {
            Q(str, this.G, canvas);
            Q(str, this.H, canvas);
            return;
        }
        Q(str, this.H, canvas);
        Q(str, this.G, canvas);
    }

    private void T(String str, k53 k53Var, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String P = P(str, i);
            i += P.length();
            S(P, k53Var, canvas);
            canvas.translate(this.G.measureText(P) + f, 0.0f);
        }
    }

    private void U(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void V(String str, k53 k53Var, Matrix matrix, r24 r24Var, Canvas canvas, float f, float f2) {
        float floatValue;
        for (int i = 0; i < str.length(); i++) {
            u24 g = this.M.c().g(u24.c(str.charAt(i), r24Var.a(), r24Var.c()));
            if (g != null) {
                R(g, matrix, f2, k53Var, canvas);
                float b2 = ((float) g.b()) * f2 * fvb.e() * f;
                float f3 = k53Var.e / 10.0f;
                t70<Float, Float> t70Var = this.U;
                if (t70Var != null) {
                    floatValue = t70Var.h().floatValue();
                } else {
                    t70<Float, Float> t70Var2 = this.T;
                    if (t70Var2 != null) {
                        floatValue = t70Var2.h().floatValue();
                    }
                    canvas.translate(b2 + (f3 * f), 0.0f);
                }
                f3 += floatValue;
                canvas.translate(b2 + (f3 * f), 0.0f);
            }
        }
    }

    private void W(k53 k53Var, Matrix matrix, r24 r24Var, Canvas canvas) {
        float f;
        t70<Float, Float> t70Var = this.V;
        if (t70Var != null) {
            f = t70Var.h().floatValue();
        } else {
            f = k53Var.c;
        }
        float f2 = f / 100.0f;
        float g = fvb.g(matrix);
        String str = k53Var.a;
        float e = k53Var.f * fvb.e();
        List<String> a0 = a0(str);
        int size = a0.size();
        for (int i = 0; i < size; i++) {
            String str2 = a0.get(i);
            float Z = Z(str2, r24Var, f2, g);
            canvas.save();
            O(k53Var.d, canvas, Z);
            canvas.translate(0.0f, (i * e) - (((size - 1) * e) / 2.0f));
            V(str2, k53Var, matrix, r24Var, canvas, g, f2);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0088 A[LOOP:0: B:17:0x0086->B:18:0x0088, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void X(defpackage.k53 r8, defpackage.r24 r9, android.graphics.Canvas r10) {
        /*
            r7 = this;
            android.graphics.Typeface r9 = r7.b0(r9)
            if (r9 != 0) goto L7
            return
        L7:
            java.lang.String r0 = r8.a
            com.airbnb.lottie.n r1 = r7.L
            r1.W()
            android.graphics.Paint r1 = r7.G
            r1.setTypeface(r9)
            t70<java.lang.Float, java.lang.Float> r9 = r7.V
            if (r9 == 0) goto L22
            java.lang.Object r9 = r9.h()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            goto L24
        L22:
            float r9 = r8.c
        L24:
            android.graphics.Paint r1 = r7.G
            float r2 = defpackage.fvb.e()
            float r2 = r2 * r9
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r7.H
            android.graphics.Paint r2 = r7.G
            android.graphics.Typeface r2 = r2.getTypeface()
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r7.H
            android.graphics.Paint r2 = r7.G
            float r2 = r2.getTextSize()
            r1.setTextSize(r2)
            float r1 = r8.f
            float r2 = defpackage.fvb.e()
            float r1 = r1 * r2
            int r2 = r8.e
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            t70<java.lang.Float, java.lang.Float> r3 = r7.U
            if (r3 == 0) goto L63
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L61:
            float r2 = r2 + r3
            goto L72
        L63:
            t70<java.lang.Float, java.lang.Float> r3 = r7.T
            if (r3 == 0) goto L72
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L61
        L72:
            float r3 = defpackage.fvb.e()
            float r2 = r2 * r3
            float r2 = r2 * r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r9
            java.util.List r9 = r7.a0(r0)
            int r0 = r9.size()
            r3 = 0
        L86:
            if (r3 >= r0) goto Lbf
            java.lang.Object r4 = r9.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.Paint r5 = r7.H
            float r5 = r5.measureText(r4)
            int r6 = r4.length()
            int r6 = r6 + (-1)
            float r6 = (float) r6
            float r6 = r6 * r2
            float r5 = r5 + r6
            r10.save()
            k53$a r6 = r8.d
            r7.O(r6, r10, r5)
            int r5 = r0 + (-1)
            float r5 = (float) r5
            float r5 = r5 * r1
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r6 = (float) r3
            float r6 = r6 * r1
            float r6 = r6 - r5
            r5 = 0
            r10.translate(r5, r6)
            r7.T(r4, r8, r10, r2)
            r10.restore()
            int r3 = r3 + 1
            goto L86
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbb.X(k53, r24, android.graphics.Canvas):void");
    }

    private List<jt1> Y(u24 u24Var) {
        if (this.I.containsKey(u24Var)) {
            return this.I.get(u24Var);
        }
        List<cha> a2 = u24Var.a();
        int size = a2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new jt1(this.L, this, a2.get(i)));
        }
        this.I.put(u24Var, arrayList);
        return arrayList;
    }

    private float Z(String str, r24 r24Var, float f, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            u24 g = this.M.c().g(u24.c(str.charAt(i), r24Var.a(), r24Var.c()));
            if (g != null) {
                f3 = (float) (f3 + (g.b() * f * fvb.e() * f2));
            }
        }
        return f3;
    }

    private List<String> a0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private Typeface b0(r24 r24Var) {
        Typeface h;
        t70<Typeface, Typeface> t70Var = this.W;
        if (t70Var != null && (h = t70Var.h()) != null) {
            return h;
        }
        Typeface X = this.L.X(r24Var.a(), r24Var.c());
        if (X != null) {
            return X;
        }
        return r24Var.d();
    }

    private boolean c0(int i) {
        if (Character.getType(i) != 16 && Character.getType(i) != 27 && Character.getType(i) != 6 && Character.getType(i) != 28 && Character.getType(i) != 8 && Character.getType(i) != 19) {
            return false;
        }
        return true;
    }

    @Override // defpackage.v70, defpackage.y83
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.M.b().width(), this.M.b().height());
    }

    @Override // defpackage.v70, defpackage.pf5
    public <T> void f(T t, b06<T> b06Var) {
        super.f(t, b06Var);
        if (t == xz5.a) {
            t70<Integer, Integer> t70Var = this.O;
            if (t70Var != null) {
                G(t70Var);
            }
            if (b06Var == null) {
                this.O = null;
                return;
            }
            dwb dwbVar = new dwb(b06Var);
            this.O = dwbVar;
            dwbVar.a(this);
            i(this.O);
        } else if (t == xz5.b) {
            t70<Integer, Integer> t70Var2 = this.Q;
            if (t70Var2 != null) {
                G(t70Var2);
            }
            if (b06Var == null) {
                this.Q = null;
                return;
            }
            dwb dwbVar2 = new dwb(b06Var);
            this.Q = dwbVar2;
            dwbVar2.a(this);
            i(this.Q);
        } else if (t == xz5.s) {
            t70<Float, Float> t70Var3 = this.S;
            if (t70Var3 != null) {
                G(t70Var3);
            }
            if (b06Var == null) {
                this.S = null;
                return;
            }
            dwb dwbVar3 = new dwb(b06Var);
            this.S = dwbVar3;
            dwbVar3.a(this);
            i(this.S);
        } else if (t == xz5.t) {
            t70<Float, Float> t70Var4 = this.U;
            if (t70Var4 != null) {
                G(t70Var4);
            }
            if (b06Var == null) {
                this.U = null;
                return;
            }
            dwb dwbVar4 = new dwb(b06Var);
            this.U = dwbVar4;
            dwbVar4.a(this);
            i(this.U);
        } else if (t == xz5.F) {
            t70<Float, Float> t70Var5 = this.V;
            if (t70Var5 != null) {
                G(t70Var5);
            }
            if (b06Var == null) {
                this.V = null;
                return;
            }
            dwb dwbVar5 = new dwb(b06Var);
            this.V = dwbVar5;
            dwbVar5.a(this);
            i(this.V);
        } else if (t == xz5.M) {
            t70<Typeface, Typeface> t70Var6 = this.W;
            if (t70Var6 != null) {
                G(t70Var6);
            }
            if (b06Var == null) {
                this.W = null;
                return;
            }
            dwb dwbVar6 = new dwb(b06Var);
            this.W = dwbVar6;
            dwbVar6.a(this);
            i(this.W);
        } else if (t == xz5.O) {
            this.K.q(b06Var);
        }
    }

    @Override // defpackage.v70
    void t(Canvas canvas, Matrix matrix, int i) {
        int intValue;
        canvas.save();
        if (!this.L.W0()) {
            canvas.concat(matrix);
        }
        k53 h = this.K.h();
        r24 r24Var = this.M.g().get(h.b);
        if (r24Var == null) {
            canvas.restore();
            return;
        }
        t70<Integer, Integer> t70Var = this.O;
        if (t70Var != null) {
            this.G.setColor(t70Var.h().intValue());
        } else {
            t70<Integer, Integer> t70Var2 = this.N;
            if (t70Var2 != null) {
                this.G.setColor(t70Var2.h().intValue());
            } else {
                this.G.setColor(h.h);
            }
        }
        t70<Integer, Integer> t70Var3 = this.Q;
        if (t70Var3 != null) {
            this.H.setColor(t70Var3.h().intValue());
        } else {
            t70<Integer, Integer> t70Var4 = this.P;
            if (t70Var4 != null) {
                this.H.setColor(t70Var4.h().intValue());
            } else {
                this.H.setColor(h.i);
            }
        }
        if (this.x.h() == null) {
            intValue = 100;
        } else {
            intValue = this.x.h().h().intValue();
        }
        int i2 = (intValue * 255) / 100;
        this.G.setAlpha(i2);
        this.H.setAlpha(i2);
        t70<Float, Float> t70Var5 = this.S;
        if (t70Var5 != null) {
            this.H.setStrokeWidth(t70Var5.h().floatValue());
        } else {
            t70<Float, Float> t70Var6 = this.R;
            if (t70Var6 != null) {
                this.H.setStrokeWidth(t70Var6.h().floatValue());
            } else {
                this.H.setStrokeWidth(h.j * fvb.e() * fvb.g(matrix));
            }
        }
        if (this.L.W0()) {
            W(h, matrix, r24Var, canvas);
        } else {
            X(h, r24Var, canvas);
        }
        canvas.restore();
    }
}
