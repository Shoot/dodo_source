package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public final class e4 {
    private static final Unsafe a;
    private static final Class<?> b;
    private static final boolean c;
    private static final boolean d;
    private static final c e;
    private static final boolean f;
    private static final boolean g;
    private static final long h;
    private static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final long n;
    private static final long o;
    private static final long p;
    private static final long q;
    private static final long r;
    private static final long s;
    private static final long t;
    private static final long u;
    private static final int v;
    static final boolean w;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    /* loaded from: classes2.dex */
    private static final class a extends c {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.e4.c
        public final double a(Object obj, long j) {
            return Double.longBitsToDouble(m(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.e4.c
        public final void b(Object obj, long j, byte b) {
            if (e4.w) {
                e4.u(obj, j, b);
            } else {
                e4.y(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.measurement.e4.c
        public final void c(Object obj, long j, double d) {
            f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.measurement.e4.c
        public final void d(Object obj, long j, float f) {
            e(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.measurement.e4.c
        public final void g(Object obj, long j, boolean z) {
            if (e4.w) {
                e4.k(obj, j, z);
            } else {
                e4.r(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.measurement.e4.c
        public final float i(Object obj, long j) {
            return Float.intBitsToFloat(l(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.e4.c
        public final boolean k(Object obj, long j) {
            if (e4.w) {
                return e4.D(obj, j);
            }
            return e4.E(obj, j);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    /* loaded from: classes2.dex */
    private static final class b extends c {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.e4.c
        public final double a(Object obj, long j) {
            return Double.longBitsToDouble(m(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.e4.c
        public final void b(Object obj, long j, byte b) {
            if (e4.w) {
                e4.u(obj, j, b);
            } else {
                e4.y(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.measurement.e4.c
        public final void c(Object obj, long j, double d) {
            f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.measurement.e4.c
        public final void d(Object obj, long j, float f) {
            e(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.measurement.e4.c
        public final void g(Object obj, long j, boolean z) {
            if (e4.w) {
                e4.k(obj, j, z);
            } else {
                e4.r(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.measurement.e4.c
        public final float i(Object obj, long j) {
            return Float.intBitsToFloat(l(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.e4.c
        public final boolean k(Object obj, long j) {
            if (e4.w) {
                return e4.D(obj, j);
            }
            return e4.E(obj, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    /* loaded from: classes2.dex */
    public static abstract class c {
        Unsafe a;

        c(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract double a(Object obj, long j);

        public abstract void b(Object obj, long j, byte b);

        public abstract void c(Object obj, long j, double d);

        public abstract void d(Object obj, long j, float f);

        public final void e(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void f(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public abstract void g(Object obj, long j, boolean z);

        public final boolean h() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                e4.l(th);
                return false;
            }
        }

        public abstract float i(Object obj, long j);

        public final boolean j() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                if (e4.c() == null) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                e4.l(th);
                return false;
            }
        }

        public abstract boolean k(Object obj, long j);

        public final int l(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long m(Object obj, long j) {
            return this.a.getLong(obj, j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    static {
        /*
            sun.misc.Unsafe r0 = p()
            com.google.android.gms.internal.measurement.e4.a = r0
            java.lang.Class r1 = com.google.android.gms.internal.measurement.a1.a()
            com.google.android.gms.internal.measurement.e4.b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = A(r1)
            com.google.android.gms.internal.measurement.e4.c = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = A(r2)
            com.google.android.gms.internal.measurement.e4.d = r2
            if (r0 == 0) goto L2e
            if (r1 == 0) goto L26
            com.google.android.gms.internal.measurement.e4$a r1 = new com.google.android.gms.internal.measurement.e4$a
            r1.<init>(r0)
            goto L2f
        L26:
            if (r2 == 0) goto L2e
            com.google.android.gms.internal.measurement.e4$b r1 = new com.google.android.gms.internal.measurement.e4$b
            r1.<init>(r0)
            goto L2f
        L2e:
            r1 = 0
        L2f:
            com.google.android.gms.internal.measurement.e4.e = r1
            r0 = 0
            if (r1 != 0) goto L36
            r2 = 0
            goto L3a
        L36:
            boolean r2 = r1.j()
        L3a:
            com.google.android.gms.internal.measurement.e4.f = r2
            if (r1 != 0) goto L40
            r2 = 0
            goto L44
        L40:
            boolean r2 = r1.h()
        L44:
            com.google.android.gms.internal.measurement.e4.g = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = o(r2)
            long r2 = (long) r2
            com.google.android.gms.internal.measurement.e4.h = r2
            java.lang.Class<boolean[]> r4 = boolean[].class
            int r5 = o(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.measurement.e4.i = r5
            int r4 = s(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.measurement.e4.j = r4
            java.lang.Class<int[]> r4 = int[].class
            int r5 = o(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.measurement.e4.k = r5
            int r4 = s(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.measurement.e4.l = r4
            java.lang.Class<long[]> r4 = long[].class
            int r5 = o(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.measurement.e4.m = r5
            int r4 = s(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.measurement.e4.n = r4
            java.lang.Class<float[]> r4 = float[].class
            int r5 = o(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.measurement.e4.o = r5
            int r4 = s(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.measurement.e4.p = r4
            java.lang.Class<double[]> r4 = double[].class
            int r5 = o(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.measurement.e4.q = r5
            int r4 = s(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.measurement.e4.r = r4
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            int r5 = o(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.measurement.e4.s = r5
            int r4 = s(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.measurement.e4.t = r4
            java.lang.reflect.Field r4 = C()
            if (r4 == 0) goto Lbf
            if (r1 != 0) goto Lb8
            goto Lbf
        Lb8:
            sun.misc.Unsafe r1 = r1.a
            long r4 = r1.objectFieldOffset(r4)
            goto Lc1
        Lbf:
            r4 = -1
        Lc1:
            com.google.android.gms.internal.measurement.e4.u = r4
            r4 = 7
            long r1 = r2 & r4
            int r2 = (int) r1
            com.google.android.gms.internal.measurement.e4.v = r2
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto Ld3
            r0 = 1
        Ld3:
            com.google.android.gms.internal.measurement.e4.w = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.e4.<clinit>():void");
    }

    private e4() {
    }

    private static boolean A(Class<?> cls) {
        try {
            Class<?> cls2 = b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object B(Object obj, long j2) {
        return e.a.getObject(obj, j2);
    }

    private static Field C() {
        Field d2 = d(Buffer.class, "effectiveDirectAddress");
        if (d2 != null) {
            return d2;
        }
        Field d3 = d(Buffer.class, "address");
        if (d3 != null && d3.getType() == Long.TYPE) {
            return d3;
        }
        return null;
    }

    static /* synthetic */ boolean D(Object obj, long j2) {
        if (((byte) (t(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3)))) != 0) {
            return true;
        }
        return false;
    }

    static /* synthetic */ boolean E(Object obj, long j2) {
        if (((byte) (t(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3)))) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean F(Object obj, long j2) {
        return e.k(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double a(Object obj, long j2) {
        return e.a(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T b(Class<T> cls) {
        try {
            return (T) a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static /* synthetic */ Field c() {
        return C();
    }

    private static Field d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Object obj, long j2, double d2) {
        e.c(obj, j2, d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Object obj, long j2, float f2) {
        e.d(obj, j2, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(Object obj, long j2, int i2) {
        e.e(obj, j2, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Object obj, long j2, long j3) {
        e.f(obj, j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(Object obj, long j2, Object obj2) {
        e.a.putObject(obj, j2, obj2);
    }

    static /* synthetic */ void k(Object obj, long j2, boolean z) {
        u(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    static /* synthetic */ void l(Throwable th) {
        Logger logger = Logger.getLogger(e4.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + valueOf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(byte[] bArr, long j2, byte b2) {
        e.b(bArr, h + j2, b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float n(Object obj, long j2) {
        return e.i(obj, j2);
    }

    private static int o(Class<?> cls) {
        if (g) {
            return e.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new d4());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void r(Object obj, long j2, boolean z) {
        y(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    private static int s(Class<?> cls) {
        if (g) {
            return e.a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(Object obj, long j2) {
        return e.l(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int t2 = t(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        h(obj, j3, ((255 & b2) << i2) | (t2 & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void v(Object obj, long j2, boolean z) {
        e.g(obj, j2, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean w() {
        return g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long x(Object obj, long j2) {
        return e.m(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        h(obj, j3, ((255 & b2) << i2) | (t(obj, j3) & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean z() {
        return f;
    }
}
