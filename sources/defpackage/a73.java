package defpackage;
/* compiled from: DownsampleStrategy.java */
/* renamed from: a73  reason: default package */
/* loaded from: classes.dex */
public abstract class a73 {
    public static final a73 a = new a();
    public static final a73 b = new b();
    public static final a73 c = new e();
    public static final a73 d = new c();
    public static final a73 e;
    public static final a73 f;
    public static final a73 g;
    public static final mb7<a73> h;
    static final boolean i;

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: a73$a */
    /* loaded from: classes.dex */
    private static class a extends a73 {
        a() {
        }

        @Override // defpackage.a73
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // defpackage.a73
        public float b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(min);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: a73$b */
    /* loaded from: classes.dex */
    private static class b extends a73 {
        b() {
        }

        @Override // defpackage.a73
        public g a(int i, int i2, int i3, int i4) {
            return g.MEMORY;
        }

        @Override // defpackage.a73
        public float b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / (max << i5);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: a73$c */
    /* loaded from: classes.dex */
    private static class c extends a73 {
        c() {
        }

        @Override // defpackage.a73
        public g a(int i, int i2, int i3, int i4) {
            if (b(i, i2, i3, i4) == 1.0f) {
                return g.QUALITY;
            }
            return a73.c.a(i, i2, i3, i4);
        }

        @Override // defpackage.a73
        public float b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, a73.c.b(i, i2, i3, i4));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: a73$d */
    /* loaded from: classes.dex */
    private static class d extends a73 {
        d() {
        }

        @Override // defpackage.a73
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // defpackage.a73
        public float b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: a73$e */
    /* loaded from: classes.dex */
    private static class e extends a73 {
        e() {
        }

        @Override // defpackage.a73
        public g a(int i, int i2, int i3, int i4) {
            if (a73.i) {
                return g.QUALITY;
            }
            return g.MEMORY;
        }

        @Override // defpackage.a73
        public float b(int i, int i2, int i3, int i4) {
            if (a73.i) {
                return Math.min(i3 / i, i4 / i2);
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(max);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: a73$f */
    /* loaded from: classes.dex */
    private static class f extends a73 {
        f() {
        }

        @Override // defpackage.a73
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // defpackage.a73
        public float b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: a73$g */
    /* loaded from: classes.dex */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        e = dVar;
        f = new f();
        g = dVar;
        h = mb7.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        i = true;
    }

    public abstract g a(int i2, int i3, int i4, int i5);

    public abstract float b(int i2, int i3, int i4, int i5);
}
