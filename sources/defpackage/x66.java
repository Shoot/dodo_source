package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.m76;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: MapTileApproximater.java */
/* renamed from: x66  reason: default package */
/* loaded from: classes3.dex */
public class x66 extends m76 {
    private final List<m76> e;
    private int f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: MapTileApproximater.java */
    /* renamed from: x66$a */
    /* loaded from: classes3.dex */
    public class a extends m76.b {
        protected a() {
            super();
        }

        @Override // defpackage.m76.b
        public Drawable a(long j) {
            Bitmap o = x66.this.o(j);
            if (o != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(o);
                jn3.b(bitmapDrawable, -3);
                return bitmapDrawable;
            }
            return null;
        }
    }

    public x66() {
        this(dq1.a().F(), dq1.a().c());
    }

    public static Bitmap q(m76 m76Var, long j, int i) {
        int e;
        if (i <= 0 || (e = k76.e(j) - i) < m76Var.e() || e > m76Var.d()) {
            return null;
        }
        try {
            Drawable b = m76Var.h().b(k76.b(e, k76.c(j) >> i, k76.d(j) >> i));
            if (!(b instanceof BitmapDrawable)) {
                return null;
            }
            return r((BitmapDrawable) b, j, i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap r(android.graphics.drawable.BitmapDrawable r10, long r11, int r13) {
        /*
            r0 = 0
            if (r13 > 0) goto L4
            return r0
        L4:
            android.graphics.Bitmap r1 = r10.getBitmap()
            int r1 = r1.getWidth()
            android.graphics.Bitmap r2 = t(r1)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            boolean r4 = r10 instanceof defpackage.bm9
            if (r4 == 0) goto L1d
            r5 = r10
            bm9 r5 = (defpackage.bm9) r5
            goto L1e
        L1d:
            r5 = r0
        L1e:
            if (r4 == 0) goto L23
            r5.c()
        L23:
            r6 = 0
            if (r4 == 0) goto L2f
            boolean r7 = r5.e()     // Catch: java.lang.Throwable -> L2d
            if (r7 == 0) goto L5a
            goto L2f
        L2d:
            r10 = move-exception
            goto L63
        L2f:
            int r7 = r1 >> r13
            if (r7 != 0) goto L34
            goto L5a
        L34:
            int r8 = defpackage.k76.c(r11)     // Catch: java.lang.Throwable -> L2d
            r9 = 1
            int r13 = r9 << r13
            int r8 = r8 % r13
            int r8 = r8 * r7
            int r11 = defpackage.k76.d(r11)     // Catch: java.lang.Throwable -> L2d
            int r11 = r11 % r13
            int r11 = r11 * r7
            android.graphics.Rect r12 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L2d
            int r13 = r8 + r7
            int r7 = r7 + r11
            r12.<init>(r8, r11, r13, r7)     // Catch: java.lang.Throwable -> L2d
            android.graphics.Rect r11 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L2d
            r11.<init>(r6, r6, r1, r1)     // Catch: java.lang.Throwable -> L2d
            android.graphics.Bitmap r10 = r10.getBitmap()     // Catch: java.lang.Throwable -> L2d
            r3.drawBitmap(r10, r12, r11, r0)     // Catch: java.lang.Throwable -> L2d
            r6 = 1
        L5a:
            if (r4 == 0) goto L5f
            r5.d()
        L5f:
            if (r6 != 0) goto L62
            return r0
        L62:
            return r2
        L63:
            if (r4 == 0) goto L68
            r5.d()
        L68:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x66.r(android.graphics.drawable.BitmapDrawable, long, int):android.graphics.Bitmap");
    }

    private void s() {
        this.f = 0;
        boolean z = true;
        for (m76 m76Var : this.e) {
            int e = m76Var.e();
            if (z) {
                this.f = e;
                z = false;
            } else {
                this.f = Math.min(this.f, e);
            }
        }
    }

    public static Bitmap t(int i) {
        Bitmap e = fc0.d().e(i, i);
        if (e != null) {
            e.setHasAlpha(true);
            e.eraseColor(0);
            return e;
        }
        return Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
    }

    @Override // defpackage.m76
    public void c() {
        super.c();
        this.e.clear();
    }

    @Override // defpackage.m76
    public int d() {
        return cgb.u();
    }

    @Override // defpackage.m76
    public int e() {
        return this.f;
    }

    @Override // defpackage.m76
    protected String f() {
        return "Offline Tile Approximation Provider";
    }

    @Override // defpackage.m76
    protected String g() {
        return "approximater";
    }

    @Override // defpackage.m76
    public boolean i() {
        return false;
    }

    public void n(m76 m76Var) {
        this.e.add(m76Var);
        s();
    }

    public Bitmap o(long j) {
        for (int i = 1; k76.e(j) - i >= 0; i++) {
            Bitmap p = p(j, i);
            if (p != null) {
                return p;
            }
        }
        return null;
    }

    public Bitmap p(long j, int i) {
        for (m76 m76Var : this.e) {
            Bitmap q = q(m76Var, j, i);
            if (q != null) {
                return q;
            }
        }
        return null;
    }

    @Override // defpackage.m76
    /* renamed from: u */
    public a h() {
        return new a();
    }

    public x66(int i, int i2) {
        super(i, i2);
        this.e = new CopyOnWriteArrayList();
    }

    @Override // defpackage.m76
    @Deprecated
    public void m(org.osmdroid.tileprovider.tilesource.a aVar) {
    }
}
