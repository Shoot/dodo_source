package defpackage;

import android.util.Log;
import android.view.MotionEvent;
import java.lang.reflect.Method;
/* compiled from: MultiTouchController.java */
/* renamed from: xp6  reason: default package */
/* loaded from: classes3.dex */
public class xp6<T> {
    private static Method A = null;
    private static Method B = null;
    private static Method C = null;
    private static Method D = null;
    private static int E = 6;
    private static int F = 8;
    private static final float[] G;
    private static final float[] H;
    private static final float[] I;
    private static final int[] J;
    public static final boolean v;
    private static Method w;
    private static Method x;
    private static Method y;
    private static Method z;
    a<T> a;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private boolean j;
    private long m;
    private long n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private T k = null;
    private c l = new c();
    private int u = 0;
    private b b = new b();
    private b c = new b();

    /* compiled from: MultiTouchController.java */
    /* renamed from: xp6$a */
    /* loaded from: classes3.dex */
    public interface a<T> {
        void a(T t, b bVar);

        void b(T t, c cVar);

        boolean c(T t, c cVar, b bVar);

        T d(b bVar);
    }

    /* compiled from: MultiTouchController.java */
    /* renamed from: xp6$b */
    /* loaded from: classes3.dex */
    public static class b {
        private int a;
        private float[] b = new float[20];
        private float[] c = new float[20];
        private float[] d = new float[20];
        private int[] e = new int[20];
        private float f;
        private float g;
        private float h;
        private float i;
        private float j;
        private float k;
        private float l;
        private float m;
        private boolean n;
        private boolean o;
        private boolean p;
        private boolean q;
        private boolean r;
        private int s;
        private long t;

        private int m(int i) {
            int i2 = 0;
            int i3 = 32768;
            int i4 = 15;
            while (true) {
                int i5 = i4 - 1;
                int i6 = ((i2 << 1) + i3) << i4;
                if (i >= i6) {
                    i2 += i3;
                    i -= i6;
                }
                i3 >>= 1;
                if (i3 <= 0) {
                    return i2;
                }
                i4 = i5;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(int i, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i2, boolean z, long j) {
            boolean z2;
            this.t = j;
            this.s = i2;
            this.a = i;
            for (int i3 = 0; i3 < i; i3++) {
                this.b[i3] = fArr[i3];
                this.c[i3] = fArr2[i3];
                this.d[i3] = fArr3[i3];
                this.e[i3] = iArr[i3];
            }
            this.n = z;
            if (i >= 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.o = z2;
            if (z2) {
                float f = fArr[0];
                float f2 = fArr[1];
                this.f = (f + f2) * 0.5f;
                this.g = (fArr2[0] + fArr2[1]) * 0.5f;
                this.h = (fArr3[0] + fArr3[1]) * 0.5f;
                this.i = Math.abs(f2 - f);
                this.j = Math.abs(fArr2[1] - fArr2[0]);
            } else {
                this.f = fArr[0];
                this.g = fArr2[0];
                this.h = fArr3[0];
                this.j = 0.0f;
                this.i = 0.0f;
            }
            this.r = false;
            this.q = false;
            this.p = false;
        }

        public long c() {
            return this.t;
        }

        public float d() {
            if (!this.r) {
                if (!this.o) {
                    this.m = 0.0f;
                } else {
                    float[] fArr = this.c;
                    float[] fArr2 = this.b;
                    this.m = (float) Math.atan2(fArr[1] - fArr[0], fArr2[1] - fArr2[0]);
                }
                this.r = true;
            }
            return this.m;
        }

        public float e() {
            if (!this.q) {
                float f = 0.0f;
                if (!this.o) {
                    this.k = 0.0f;
                } else {
                    float f2 = f();
                    if (f2 != 0.0f) {
                        f = m((int) (f2 * 256.0f)) / 16.0f;
                    }
                    this.k = f;
                    float f3 = this.i;
                    if (f < f3) {
                        this.k = f3;
                    }
                    float f4 = this.k;
                    float f5 = this.j;
                    if (f4 < f5) {
                        this.k = f5;
                    }
                }
                this.q = true;
            }
            return this.k;
        }

        public float f() {
            float f;
            if (!this.p) {
                if (this.o) {
                    float f2 = this.i;
                    float f3 = this.j;
                    f = (f2 * f2) + (f3 * f3);
                } else {
                    f = 0.0f;
                }
                this.l = f;
                this.p = true;
            }
            return this.l;
        }

        public float g() {
            if (this.o) {
                return this.j;
            }
            return 0.0f;
        }

        public float h() {
            if (this.o) {
                return this.i;
            }
            return 0.0f;
        }

        public float i() {
            return this.f;
        }

        public float j() {
            return this.g;
        }

        public boolean k() {
            return this.n;
        }

        public boolean l() {
            return this.o;
        }
    }

    /* compiled from: MultiTouchController.java */
    /* renamed from: xp6$c */
    /* loaded from: classes3.dex */
    public static class c {
        private float a;
        private float b;
        private float c;
        private float d;
        private float e;
        private float f;
        private boolean g;
        private boolean h;
        private boolean i;

        public float j() {
            if (!this.g) {
                return 1.0f;
            }
            return this.c;
        }

        public float k() {
            return this.a;
        }

        public float l() {
            return this.b;
        }

        protected void m(float f, float f2, float f3, float f4, float f5, float f6) {
            this.a = f;
            this.b = f2;
            if (f3 == 0.0f) {
                f3 = 1.0f;
            }
            this.c = f3;
            if (f4 == 0.0f) {
                f4 = 1.0f;
            }
            this.d = f4;
            if (f5 == 0.0f) {
                f5 = 1.0f;
            }
            this.e = f5;
            this.f = f6;
        }

        public void n(float f, float f2, boolean z, float f3, boolean z2, float f4, float f5, boolean z3, float f6) {
            this.a = f;
            this.b = f2;
            this.g = z;
            if (f3 == 0.0f) {
                f3 = 1.0f;
            }
            this.c = f3;
            this.h = z2;
            if (f4 == 0.0f) {
                f4 = 1.0f;
            }
            this.d = f4;
            if (f5 == 0.0f) {
                f5 = 1.0f;
            }
            this.e = f5;
            this.i = z3;
            this.f = f6;
        }
    }

    static {
        boolean z2 = false;
        try {
            w = MotionEvent.class.getMethod("getPointerCount", new Class[0]);
            Class cls = Integer.TYPE;
            x = MotionEvent.class.getMethod("getPointerId", cls);
            y = MotionEvent.class.getMethod("getPressure", cls);
            z = MotionEvent.class.getMethod("getHistoricalX", cls, cls);
            A = MotionEvent.class.getMethod("getHistoricalY", cls, cls);
            B = MotionEvent.class.getMethod("getHistoricalPressure", cls, cls);
            C = MotionEvent.class.getMethod("getX", cls);
            D = MotionEvent.class.getMethod("getY", cls);
            z2 = true;
        } catch (Exception e) {
            Log.e("MultiTouchController", "static initializer failed", e);
        }
        v = z2;
        if (z2) {
            try {
                E = MotionEvent.class.getField("ACTION_POINTER_UP").getInt(null);
                F = MotionEvent.class.getField("ACTION_POINTER_INDEX_SHIFT").getInt(null);
            } catch (Exception unused) {
            }
        }
        G = new float[20];
        H = new float[20];
        I = new float[20];
        J = new int[20];
    }

    public xp6(a<T> aVar, boolean z2) {
        this.j = z2;
        this.a = aVar;
    }

    private void a() {
        float f;
        T t = this.k;
        if (t == null) {
            return;
        }
        this.a.b(t, this.l);
        if (this.l.g && this.l.c != 0.0f) {
            f = this.l.c;
        } else {
            f = 1.0f;
        }
        float f2 = 1.0f / f;
        c();
        this.o = (this.d - this.l.a) * f2;
        this.p = (this.e - this.l.b) * f2;
        this.q = this.l.c / this.f;
        this.s = this.l.d / this.g;
        this.t = this.l.e / this.h;
        this.r = this.l.f - this.i;
    }

    private void b(int i, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i2, boolean z2, long j) {
        b bVar = this.c;
        this.c = this.b;
        this.b = bVar;
        bVar.n(i, fArr, fArr2, fArr3, iArr, i2, z2, j);
        e();
    }

    private void c() {
        float e;
        float h;
        float g;
        this.d = this.b.i();
        this.e = this.b.j();
        float f = 0.0f;
        if (!this.l.g) {
            e = 0.0f;
        } else {
            e = this.b.e();
        }
        this.f = Math.max(21.3f, e);
        if (!this.l.h) {
            h = 0.0f;
        } else {
            h = this.b.h();
        }
        this.g = Math.max(30.0f, h);
        if (!this.l.h) {
            g = 0.0f;
        } else {
            g = this.b.g();
        }
        this.h = Math.max(30.0f, g);
        if (this.l.i) {
            f = this.b.d();
        }
        this.i = f;
    }

    private void e() {
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (this.b.l() && this.b.k()) {
                        if (Math.abs(this.b.i() - this.c.i()) <= 30.0f && Math.abs(this.b.j() - this.c.j()) <= 30.0f && Math.abs(this.b.h() - this.c.h()) * 0.5f <= 40.0f && Math.abs(this.b.g() - this.c.g()) * 0.5f <= 40.0f) {
                            if (this.b.t < this.n) {
                                a();
                                return;
                            } else {
                                g();
                                return;
                            }
                        }
                        a();
                        long c2 = this.b.c();
                        this.m = c2;
                        this.n = c2 + 20;
                    } else if (!this.b.k()) {
                        this.u = 0;
                        a<T> aVar = this.a;
                        this.k = null;
                        aVar.a(null, this.b);
                    } else {
                        this.u = 1;
                        a();
                        long c3 = this.b.c();
                        this.m = c3;
                        this.n = c3 + 20;
                    }
                }
            } else if (!this.b.k()) {
                this.u = 0;
                a<T> aVar2 = this.a;
                this.k = null;
                aVar2.a(null, this.b);
            } else if (this.b.l()) {
                this.u = 2;
                a();
                long c4 = this.b.c();
                this.m = c4;
                this.n = c4 + 20;
            } else if (this.b.c() < this.n) {
                a();
            } else {
                g();
            }
        } else if (this.b.k()) {
            T d = this.a.d(this.b);
            this.k = d;
            if (d != null) {
                this.u = 1;
                this.a.a(d, this.b);
                a();
                long c5 = this.b.c();
                this.n = c5;
                this.m = c5;
            }
        }
    }

    private void g() {
        if (this.k == null) {
            return;
        }
        float f = 1.0f;
        if (this.l.g && this.l.c != 0.0f) {
            f = this.l.c;
        }
        c();
        this.l.m(this.d - (this.o * f), this.e - (this.p * f), this.q * this.f, this.s * this.g, this.t * this.h, this.r + this.i);
        this.a.c(this.k, this.l, this.b);
    }

    public boolean d() {
        if (this.u == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0149 A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:3:0x0005, B:5:0x000a, B:9:0x001e, B:11:0x0022, B:15:0x0029, B:20:0x003b, B:24:0x0044, B:26:0x004d, B:28:0x0069, B:30:0x008c, B:32:0x0098, B:34:0x00bb, B:36:0x00c7, B:38:0x00ea, B:37:0x00dc, B:33:0x00ad, B:29:0x007e, B:52:0x0123, B:66:0x0149, B:69:0x0155, B:68:0x0150, B:59:0x0137, B:39:0x00f6, B:41:0x00fa, B:43:0x0103, B:45:0x0109, B:47:0x0112, B:49:0x0118, B:51:0x0121, B:50:0x011d, B:46:0x010e, B:42:0x00ff), top: B:74:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0150 A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:3:0x0005, B:5:0x000a, B:9:0x001e, B:11:0x0022, B:15:0x0029, B:20:0x003b, B:24:0x0044, B:26:0x004d, B:28:0x0069, B:30:0x008c, B:32:0x0098, B:34:0x00bb, B:36:0x00c7, B:38:0x00ea, B:37:0x00dc, B:33:0x00ad, B:29:0x007e, B:52:0x0123, B:66:0x0149, B:69:0x0155, B:68:0x0150, B:59:0x0137, B:39:0x00f6, B:41:0x00fa, B:43:0x0103, B:45:0x0109, B:47:0x0112, B:49:0x0118, B:51:0x0121, B:50:0x011d, B:46:0x010e, B:42:0x00ff), top: B:74:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp6.f(android.view.MotionEvent):boolean");
    }
}
