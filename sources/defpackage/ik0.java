package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ByteQuadsCanonicalizer.java */
/* renamed from: ik0  reason: default package */
/* loaded from: classes2.dex */
public final class ik0 {
    protected final AtomicReference<a> b;
    protected final int c;
    protected int[] f;
    protected int g;
    protected int h;
    protected int i;
    protected int k;
    protected final ik0 a = null;
    protected int j = 0;
    protected boolean l = true;
    protected final boolean d = false;
    protected final boolean e = true;

    /* compiled from: ByteQuadsCanonicalizer.java */
    /* renamed from: ik0$a */
    /* loaded from: classes2.dex */
    private static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int[] d;
        public final String[] e;
        public final int f;
        public final int g;

        public a(int i, int i2, int i3, int[] iArr, String[] strArr, int i4, int i5) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = iArr;
            this.e = strArr;
            this.f = i4;
            this.g = i5;
        }

        public static a a(int i) {
            int i2 = i << 3;
            return new a(i, 0, ik0.a(i), new int[i2], new String[i << 1], i2 - i, i2);
        }
    }

    private ik0(int i, int i2) {
        this.c = i2;
        int i3 = 16;
        if (i < 16) {
            i = 16;
        } else if (((i - 1) & i) != 0) {
            while (i3 < i) {
                i3 += i3;
            }
            i = i3;
        }
        this.b = new AtomicReference<>(a.a(i));
    }

    static int a(int i) {
        int i2 = i >> 2;
        if (i2 < 64) {
            return 4;
        }
        if (i2 <= 256) {
            return 5;
        }
        if (i2 <= 1024) {
            return 6;
        }
        return 7;
    }

    private final int b() {
        int i = this.g;
        return (i << 3) - i;
    }

    public static ik0 c() {
        long currentTimeMillis = System.currentTimeMillis();
        return d((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    protected static ik0 d(int i) {
        return new ik0(64, i);
    }

    public int e() {
        int i = this.h;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public int f() {
        int i = this.i;
        int i2 = 0;
        for (int i3 = this.h + 3; i3 < i; i3 += 4) {
            if (this.f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public int g() {
        return (this.k - b()) >> 2;
    }

    public int h() {
        int i = this.i + 3;
        int i2 = this.g + i;
        int i3 = 0;
        while (i < i2) {
            if (this.f[i] != 0) {
                i3++;
            }
            i += 4;
        }
        return i3;
    }

    public int i() {
        int i = this.g << 3;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public String toString() {
        int e = e();
        int f = f();
        int h = h();
        int g = g();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", ik0.class.getName(), Integer.valueOf(this.j), Integer.valueOf(this.g), Integer.valueOf(e), Integer.valueOf(f), Integer.valueOf(h), Integer.valueOf(g), Integer.valueOf(e + f + h + g), Integer.valueOf(i()));
    }
}
