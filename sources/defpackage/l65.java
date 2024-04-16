package defpackage;
/* renamed from: l65  reason: default package */
/* loaded from: classes3.dex */
public class l65 {
    public static long a(int i) {
        int a = kc0.a(kc0.a(kc0.a(kc0.a(i, 65280, 8), 15728880, 4), 202116108, 2), 572662306, 1);
        return (((a >>> 1) & 1431655765) << 32) | (1431655765 & a);
    }

    public static void b(long j, long[] jArr, int i) {
        long b = kc0.b(kc0.b(kc0.b(kc0.b(kc0.b(j, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
        jArr[i] = b & 6148914691236517205L;
        jArr[i + 1] = (b >>> 1) & 6148914691236517205L;
    }

    public static void c(long[] jArr, int i, int i2, long[] jArr2, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            b(jArr[i + i4], jArr2, i3);
            i3 += 2;
        }
    }

    public static void d(long j, long[] jArr, int i) {
        long b = kc0.b(kc0.b(kc0.b(kc0.b(kc0.b(j, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
        jArr[i] = b & (-6148914691236517206L);
        jArr[i + 1] = (b << 1) & (-6148914691236517206L);
    }

    public static int e(int i) {
        int i2 = i & 255;
        int i3 = (i2 | (i2 << 4)) & 3855;
        int i4 = (i3 | (i3 << 2)) & 13107;
        return (i4 | (i4 << 1)) & 21845;
    }

    public static int f(int i) {
        return kc0.a(kc0.a(kc0.a(kc0.a(i, 11141290, 7), 52428, 14), 15728880, 4), 65280, 8);
    }

    public static long g(long j) {
        return kc0.b(kc0.b(kc0.b(kc0.b(kc0.b(j, 2459565876494606882L, 1), 868082074056920076L, 2), 67555025218437360L, 4), 280375465148160L, 8), 4294901760L, 16);
    }
}
