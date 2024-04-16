package defpackage;

import ch.qos.logback.core.net.SyslogConstants;
import defpackage.m9c;
import java.security.SecureRandom;
/* renamed from: oc3  reason: default package */
/* loaded from: classes3.dex */
public abstract class oc3 {
    private static final byte[] a = {83, 105, 103, 69, 100, 52, 52, 56};
    private static final int[] b = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    private static final int[] c = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, 1073741823};
    private static final int[] d = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};
    private static final int[] e = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};
    private static final Object f = new Object();
    private static b[] g = null;
    private static int[] h = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oc3$b */
    /* loaded from: classes3.dex */
    public static class b {
        int[] a;
        int[] b;
        int[] c;

        private b() {
            this.a = o9c.g();
            this.b = o9c.g();
            this.c = o9c.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oc3$c */
    /* loaded from: classes3.dex */
    public static class c {
        int[] a;
        int[] b;

        private c() {
            this.a = o9c.g();
            this.b = o9c.g();
        }
    }

    private static void A(boolean z, b bVar, b bVar2) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] g2 = o9c.g();
        int[] g3 = o9c.g();
        int[] g4 = o9c.g();
        int[] g5 = o9c.g();
        int[] g6 = o9c.g();
        int[] g7 = o9c.g();
        int[] g8 = o9c.g();
        int[] g9 = o9c.g();
        if (z) {
            o9c.J(bVar.b, bVar.a, g9);
            iArr2 = g3;
            iArr = g6;
            iArr4 = g7;
            iArr3 = g8;
        } else {
            o9c.a(bVar.b, bVar.a, g9);
            iArr = g3;
            iArr2 = g6;
            iArr3 = g7;
            iArr4 = g8;
        }
        o9c.A(bVar.c, bVar2.c, g2);
        o9c.H(g2, g3);
        o9c.A(bVar.a, bVar2.a, g4);
        o9c.A(bVar.b, bVar2.b, g5);
        o9c.A(g4, g5, g6);
        o9c.z(g6, 39081, g6);
        o9c.a(g3, g6, iArr3);
        o9c.J(g3, g6, iArr4);
        o9c.a(bVar2.a, bVar2.b, g6);
        o9c.A(g9, g6, g9);
        o9c.a(g5, g4, iArr);
        o9c.J(g5, g4, iArr2);
        o9c.c(iArr);
        o9c.J(g9, g3, g9);
        o9c.A(g9, g2, g9);
        o9c.A(g6, g2, g6);
        o9c.A(g7, g9, bVar2.a);
        o9c.A(g6, g8, bVar2.b);
        o9c.A(g7, g8, bVar2.c);
    }

    private static b B(b bVar) {
        b bVar2 = new b();
        C(bVar, bVar2);
        return bVar2;
    }

    private static void C(b bVar, b bVar2) {
        o9c.f(bVar.a, 0, bVar2.a, 0);
        o9c.f(bVar.b, 0, bVar2.b, 0);
        o9c.f(bVar.c, 0, bVar2.c, 0);
    }

    private static void D(b bVar) {
        int[] g2 = o9c.g();
        int[] g3 = o9c.g();
        int[] g4 = o9c.g();
        int[] g5 = o9c.g();
        int[] g6 = o9c.g();
        int[] g7 = o9c.g();
        o9c.a(bVar.a, bVar.b, g2);
        o9c.H(g2, g2);
        o9c.H(bVar.a, g3);
        o9c.H(bVar.b, g4);
        o9c.a(g3, g4, g5);
        o9c.c(g5);
        o9c.H(bVar.c, g6);
        o9c.a(g6, g6, g6);
        o9c.c(g6);
        o9c.J(g5, g6, g7);
        o9c.J(g2, g5, g2);
        o9c.J(g3, g4, g3);
        o9c.A(g2, g7, bVar.a);
        o9c.A(g5, g3, bVar.b);
        o9c.A(g5, g7, bVar.c);
    }

    private static void E(b bVar) {
        o9c.D(bVar.c);
    }

    private static void F(int i, int i2, c cVar) {
        int i3 = i * 512;
        for (int i4 = 0; i4 < 16; i4++) {
            int i5 = ((i4 ^ i2) - 1) >> 31;
            o9c.d(i5, h, i3, cVar.a, 0);
            o9c.d(i5, h, i3 + 16, cVar.b, 0);
            i3 += 32;
        }
    }

    private static b[] G(b bVar, int i) {
        b B = B(bVar);
        D(B);
        b[] bVarArr = new b[i];
        bVarArr[0] = B(bVar);
        for (int i2 = 1; i2 < i; i2++) {
            b B2 = B(bVarArr[i2 - 1]);
            bVarArr[i2] = B2;
            A(false, B, B2);
        }
        return bVarArr;
    }

    private static void H(b bVar) {
        o9c.L(bVar.a);
        o9c.D(bVar.b);
        o9c.D(bVar.c);
    }

    public static void I() {
        synchronized (f) {
            try {
                if (h != null) {
                    return;
                }
                b bVar = new b();
                o9c.f(d, 0, bVar.a, 0);
                o9c.f(e, 0, bVar.b, 0);
                E(bVar);
                g = G(bVar, 32);
                h = o9c.h(SyslogConstants.LOG_LOCAL4);
                int i = 0;
                for (int i2 = 0; i2 < 5; i2++) {
                    b[] bVarArr = new b[5];
                    b bVar2 = new b();
                    H(bVar2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 5) {
                            break;
                        }
                        A(true, bVar, bVar2);
                        D(bVar);
                        bVarArr[i3] = B(bVar);
                        if (i2 + i3 != 8) {
                            for (int i4 = 1; i4 < 18; i4++) {
                                D(bVar);
                            }
                        }
                        i3++;
                    }
                    b[] bVarArr2 = new b[16];
                    bVarArr2[0] = bVar2;
                    int i5 = 1;
                    for (int i6 = 0; i6 < 4; i6++) {
                        int i7 = 1 << i6;
                        int i8 = 0;
                        while (i8 < i7) {
                            b B = B(bVarArr2[i5 - i7]);
                            bVarArr2[i5] = B;
                            A(false, bVarArr[i6], B);
                            i8++;
                            i5++;
                        }
                    }
                    int[] h2 = o9c.h(16);
                    int[] g2 = o9c.g();
                    o9c.f(bVarArr2[0].c, 0, g2, 0);
                    o9c.f(g2, 0, h2, 0);
                    int i9 = 0;
                    while (true) {
                        int i10 = i9 + 1;
                        if (i10 >= 16) {
                            break;
                        }
                        o9c.A(g2, bVarArr2[i10].c, g2);
                        o9c.f(g2, 0, h2, i10 * 16);
                        i9 = i10;
                    }
                    o9c.w(g2, g2);
                    int[] g3 = o9c.g();
                    while (i9 > 0) {
                        int i11 = i9 - 1;
                        o9c.f(h2, i11 * 16, g3, 0);
                        o9c.A(g3, g2, g3);
                        o9c.f(g3, 0, h2, i9 * 16);
                        o9c.A(g2, bVarArr2[i9].c, g2);
                        i9 = i11;
                    }
                    o9c.f(g2, 0, h2, 0);
                    for (int i12 = 0; i12 < 16; i12++) {
                        b bVar3 = bVarArr2[i12];
                        o9c.f(h2, i12 * 16, bVar3.c, 0);
                        int[] iArr = bVar3.a;
                        o9c.A(iArr, bVar3.c, iArr);
                        int[] iArr2 = bVar3.b;
                        o9c.A(iArr2, bVar3.c, iArr2);
                        o9c.f(bVar3.a, 0, h, i);
                        o9c.f(bVar3.b, 0, h, i + 16);
                        i += 32;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void J(byte[] bArr, int i, byte[] bArr2) {
        System.arraycopy(bArr, i, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | 128);
        bArr2[56] = 0;
    }

    private static byte[] K(byte[] bArr) {
        long k = k(bArr, 84);
        long j = k & 4294967295L;
        long k2 = k(bArr, 91);
        long j2 = k2 & 4294967295L;
        long k3 = k(bArr, 98);
        long j3 = k3 & 4294967295L;
        long k4 = k(bArr, 105);
        long j4 = k4 & 4294967295L;
        long i = i(bArr, 112) & 4294967295L;
        long j5 = ((j(bArr, 109) << 4) & 4294967295L) + (j4 >>> 28);
        long j6 = k4 & 268435455;
        long k5 = (k(bArr, 56) & 4294967295L) + (i * 43969588) + (j5 * 30366549);
        long j7 = ((j(bArr, 60) << 4) & 4294967295L) + (i * 30366549) + (j5 * 163752818);
        long k6 = (k(bArr, 63) & 4294967295L) + (i * 163752818) + (j5 * 258169998);
        long j8 = ((j(bArr, 67) << 4) & 4294967295L) + (i * 258169998) + (j5 * 96434764);
        long k7 = (k(bArr, 77) & 4294967295L) + (i * 149865618) + (j5 * 550336261);
        long k8 = (k(bArr, 49) & 4294967295L) + (j6 * 43969588);
        long j9 = ((j(bArr, 102) << 4) & 4294967295L) + (j3 >>> 28);
        long j10 = k3 & 268435455;
        long k9 = (k(bArr, 70) & 4294967295L) + (i * 96434764) + (j5 * 227822194) + (j6 * 149865618) + (j9 * 550336261);
        long k10 = (k(bArr, 42) & 4294967295L) + (j10 * 43969588);
        long j11 = ((j(bArr, 95) << 4) & 4294967295L) + (j2 >>> 28);
        long j12 = k2 & 268435455;
        long j13 = k6 + (j6 * 96434764) + (j9 * 227822194) + (j10 * 149865618) + (j11 * 550336261);
        long j14 = j7 + (j6 * 258169998) + (j9 * 96434764) + (j10 * 227822194) + (j11 * 149865618) + (j12 * 550336261);
        long j15 = ((j(bArr, 88) << 4) & 4294967295L) + (j >>> 28);
        long j16 = ((j(bArr, 74) << 4) & 4294967295L) + (i * 227822194) + (j5 * 149865618) + (j6 * 550336261) + (k9 >>> 28);
        long j17 = k7 + (j16 >>> 28);
        long j18 = ((j(bArr, 81) << 4) & 4294967295L) + (i * 550336261) + (j17 >>> 28);
        long j19 = j17 & 268435455;
        long j20 = (k & 268435455) + (j18 >>> 28);
        long j21 = j18 & 268435455;
        long j22 = ((j(bArr, 25) << 4) & 4294967295L) + (j21 * 43969588);
        long k11 = (k(bArr, 28) & 4294967295L) + (j20 * 43969588) + (j21 * 30366549);
        long j23 = ((j(bArr, 32) << 4) & 4294967295L) + (j15 * 43969588) + (j20 * 30366549) + (j21 * 163752818);
        long k12 = (k(bArr, 35) & 4294967295L) + (j12 * 43969588) + (j15 * 30366549) + (j20 * 163752818) + (j21 * 258169998);
        long j24 = ((j(bArr, 39) << 4) & 4294967295L) + (j11 * 43969588) + (j12 * 30366549) + (j15 * 163752818) + (j20 * 258169998) + (j21 * 96434764);
        long j25 = k10 + (j11 * 30366549) + (j12 * 163752818) + (j15 * 258169998) + (j20 * 96434764) + (j21 * 227822194);
        long j26 = k8 + (j9 * 30366549) + (j10 * 163752818) + (j11 * 258169998) + (j12 * 96434764) + (j15 * 227822194) + (j20 * 149865618) + (j21 * 550336261);
        long k13 = (k(bArr, 21) & 4294967295L) + (j19 * 43969588);
        long j27 = j13 + (j14 >>> 28);
        long j28 = j8 + (j6 * 227822194) + (j9 * 149865618) + (j10 * 550336261) + (j27 >>> 28);
        long j29 = (k9 & 268435455) + (j28 >>> 28);
        long j30 = j28 & 268435455;
        long j31 = (j16 & 268435455) + (j29 >>> 28);
        long j32 = j29 & 268435455;
        long j33 = j24 + (j19 * 227822194) + (j31 * 149865618) + (j32 * 550336261);
        long j34 = k12 + (j19 * 96434764) + (j31 * 227822194) + (j32 * 149865618) + (j30 * 550336261);
        long j35 = ((j(bArr, 53) << 4) & 4294967295L) + (j5 * 43969588) + (j6 * 30366549) + (j9 * 163752818) + (j10 * 258169998) + (j11 * 96434764) + (j12 * 227822194) + (j15 * 149865618) + (j20 * 550336261) + (j26 >>> 28);
        long j36 = k5 + (j6 * 163752818) + (j9 * 258169998) + (j10 * 96434764) + (j11 * 227822194) + (j12 * 149865618) + (j15 * 550336261) + (j35 >>> 28);
        long j37 = (j14 & 268435455) + (j36 >>> 28);
        long j38 = (j27 & 268435455) + (j37 >>> 28);
        long j39 = j37 & 268435455;
        long k14 = (k(bArr, 14) & 4294967295L) + (j32 * 43969588) + (j30 * 30366549) + (j38 * 163752818);
        long j40 = ((j(bArr, 18) << 4) & 4294967295L) + (j31 * 43969588) + (j32 * 30366549) + (j30 * 163752818) + (j38 * 258169998);
        long j41 = k13 + (j31 * 30366549) + (j32 * 163752818) + (j30 * 258169998) + (j38 * 96434764);
        long j42 = j22 + (j19 * 30366549) + (j31 * 163752818) + (j32 * 258169998) + (j30 * 96434764) + (j38 * 227822194);
        long j43 = j23 + (j19 * 258169998) + (j31 * 96434764) + (j32 * 227822194) + (j30 * 149865618) + (j38 * 550336261);
        long j44 = ((j36 & 268435455) * 4) + ((j35 & 268435455) >>> 26) + 1;
        long k15 = (k(bArr, 0) & 4294967295L) + (78101261 * j44);
        long j45 = ((j(bArr, 4) << 4) & 4294967295L) + (43969588 * j39) + (141809365 * j44) + (k15 >>> 28);
        long k16 = (k(bArr, 7) & 4294967295L) + (j38 * 43969588) + (30366549 * j39) + (175155932 * j44) + (j45 >>> 28);
        long j46 = ((j(bArr, 11) << 4) & 4294967295L) + (j30 * 43969588) + (j38 * 30366549) + (163752818 * j39) + (64542499 * j44) + (k16 >>> 28);
        long j47 = k14 + (258169998 * j39) + (158326419 * j44) + (j46 >>> 28);
        long j48 = j40 + (96434764 * j39) + (191173276 * j44) + (j47 >>> 28);
        long j49 = j47 & 268435455;
        long j50 = j41 + (227822194 * j39) + (104575268 * j44) + (j48 >>> 28);
        long j51 = j48 & 268435455;
        long j52 = j42 + (149865618 * j39) + (j44 * 137584065) + (j50 >>> 28);
        long j53 = k11 + (j19 * 163752818) + (j31 * 258169998) + (j32 * 96434764) + (j30 * 227822194) + (j38 * 149865618) + (j39 * 550336261) + (j52 >>> 28);
        long j54 = j43 + (j53 >>> 28);
        long j55 = j53 & 268435455;
        long j56 = j34 + (j54 >>> 28);
        long j57 = j33 + (j56 >>> 28);
        long j58 = j25 + (j19 * 149865618) + (j31 * 550336261) + (j57 >>> 28);
        long j59 = j57 & 268435455;
        long j60 = ((j(bArr, 46) << 4) & 4294967295L) + (j9 * 43969588) + (j10 * 30366549) + (j11 * 163752818) + (j12 * 258169998) + (j15 * 96434764) + (j20 * 227822194) + (j21 * 149865618) + (j19 * 550336261) + (j58 >>> 28);
        long j61 = (j26 & 268435455) + (j60 >>> 28);
        long j62 = (j35 & 67108863) + (j61 >>> 28);
        long j63 = (j62 >>> 26) - 1;
        long j64 = (k15 & 268435455) - (j63 & 78101261);
        long j65 = ((j45 & 268435455) - (j63 & 141809365)) + (j64 >> 28);
        long j66 = ((k16 & 268435455) - (j63 & 175155932)) + (j65 >> 28);
        long j67 = ((j46 & 268435455) - (j63 & 64542499)) + (j66 >> 28);
        long j68 = j66 & 268435455;
        long j69 = (j49 - (j63 & 158326419)) + (j67 >> 28);
        long j70 = (j51 - (j63 & 191173276)) + (j69 >> 28);
        long j71 = ((j50 & 268435455) - (j63 & 104575268)) + (j70 >> 28);
        long j72 = ((j52 & 268435455) - (j63 & 137584065)) + (j71 >> 28);
        long j73 = j55 + (j72 >> 28);
        long j74 = (j54 & 268435455) + (j73 >> 28);
        long j75 = (j56 & 268435455) + (j74 >> 28);
        long j76 = j59 + (j75 >> 28);
        long j77 = (j58 & 268435455) + (j76 >> 28);
        long j78 = (j60 & 268435455) + (j77 >> 28);
        long j79 = (j61 & 268435455) + (j78 >> 28);
        byte[] bArr2 = new byte[57];
        r(((j65 & 268435455) << 28) | (j64 & 268435455), bArr2, 0);
        r(((j67 & 268435455) << 28) | j68, bArr2, 7);
        r((j69 & 268435455) | ((j70 & 268435455) << 28), bArr2, 14);
        r((j71 & 268435455) | ((j72 & 268435455) << 28), bArr2, 21);
        r((j73 & 268435455) | ((j74 & 268435455) << 28), bArr2, 28);
        r((j75 & 268435455) | ((j76 & 268435455) << 28), bArr2, 35);
        r((j77 & 268435455) | ((j78 & 268435455) << 28), bArr2, 42);
        r((((j62 & 67108863) + (j79 >> 28)) << 28) | (j79 & 268435455), bArr2, 49);
        return bArr2;
    }

    private static void L(byte[] bArr, b bVar) {
        I();
        int[] iArr = new int[15];
        n(bArr, 0, iArr);
        iArr[14] = et6.h(14, (~iArr[0]) & 1, iArr, c, iArr) + 4;
        et6.F(15, iArr, 0);
        c cVar = new c();
        H(bVar);
        int i = 17;
        while (true) {
            int i2 = i;
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = 0;
                for (int i5 = 0; i5 < 5; i5++) {
                    i4 = (i4 & (~(1 << i5))) ^ ((iArr[i2 >>> 5] >>> (i2 & 31)) << i5);
                    i2 += 18;
                }
                int i6 = (i4 >>> 4) & 1;
                F(i3, ((-i6) ^ i4) & 15, cVar);
                o9c.e(i6, cVar.a);
                z(cVar, bVar);
            }
            i--;
            if (i < 0) {
                return;
            }
            D(bVar);
        }
    }

    private static void M(byte[] bArr, byte[] bArr2, int i) {
        b bVar = new b();
        L(bArr, bVar);
        if (s(bVar, bArr2, i) != 0) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void N(m9c.a aVar, byte[] bArr, int i, int[] iArr, int[] iArr2) {
        if (aVar != null) {
            byte[] bArr2 = new byte[57];
            J(bArr, i, bArr2);
            b bVar = new b();
            L(bArr2, bVar);
            if (d(bVar.a, bVar.b, bVar.c) != 0) {
                o9c.f(bVar.a, 0, iArr, 0);
                o9c.f(bVar.b, 0, iArr2, 0);
                return;
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("This method is only for use by X448");
    }

    private static void O(int[] iArr, int[] iArr2, b bVar, b bVar2) {
        boolean z;
        I();
        byte[] v = v(iArr, 7);
        byte[] v2 = v(iArr2, 5);
        b[] G = G(bVar, 8);
        H(bVar2);
        int i = 446;
        while (true) {
            byte b2 = v[i];
            boolean z2 = false;
            if (b2 != 0) {
                int i2 = b2 >> 31;
                int i3 = (b2 ^ i2) >>> 1;
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                A(z, g[i3], bVar2);
            }
            byte b3 = v2[i];
            if (b3 != 0) {
                int i4 = b3 >> 31;
                int i5 = (b3 ^ i4) >>> 1;
                if (i4 != 0) {
                    z2 = true;
                }
                A(z2, G[i5], bVar2);
            }
            i--;
            if (i < 0) {
                return;
            }
            D(bVar2);
        }
    }

    public static void P(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        x(bArr, i, bArr2, i2, bArr3, (byte) 0, bArr4, i3, i4, bArr5, i5);
    }

    public static void Q(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, byte[] bArr5, int i4) {
        x(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, i3, 64, bArr5, i4);
    }

    public static boolean R(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4) {
        return y(bArr, i, bArr2, i2, bArr3, (byte) 0, bArr4, i3, i4);
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[28];
        n(bArr, 0, iArr);
        int[] iArr2 = new int[14];
        n(bArr2, 0, iArr2);
        int[] iArr3 = new int[14];
        n(bArr3, 0, iArr3);
        et6.D(14, iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[114];
        for (int i = 0; i < 28; i++) {
            q(iArr[i], bArr4, i * 4);
        }
        return K(bArr4);
    }

    private static boolean b(byte[] bArr) {
        if (bArr != null && bArr.length < 256) {
            return true;
        }
        return false;
    }

    private static int c(int[] iArr, int[] iArr2) {
        int[] g2 = o9c.g();
        int[] g3 = o9c.g();
        int[] g4 = o9c.g();
        o9c.H(iArr, g3);
        o9c.H(iArr2, g4);
        o9c.A(g3, g4, g2);
        o9c.a(g3, g4, g3);
        o9c.z(g2, 39081, g2);
        o9c.K(g2);
        o9c.a(g2, g3, g2);
        o9c.C(g2);
        return o9c.x(g2);
    }

    private static int d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] g2 = o9c.g();
        int[] g3 = o9c.g();
        int[] g4 = o9c.g();
        int[] g5 = o9c.g();
        o9c.H(iArr, g3);
        o9c.H(iArr2, g4);
        o9c.H(iArr3, g5);
        o9c.A(g3, g4, g2);
        o9c.a(g3, g4, g3);
        o9c.A(g3, g5, g3);
        o9c.H(g5, g5);
        o9c.z(g2, 39081, g2);
        o9c.J(g2, g5, g2);
        o9c.a(g2, g3, g2);
        o9c.C(g2);
        return o9c.x(g2);
    }

    private static boolean e(byte[] bArr) {
        if ((bArr[56] & Byte.MAX_VALUE) != 0) {
            return false;
        }
        int[] iArr = new int[14];
        l(bArr, 0, iArr, 0, 14);
        return !et6.u(14, iArr, b);
    }

    private static boolean f(byte[] bArr, int[] iArr) {
        if (bArr[56] != 0) {
            return false;
        }
        n(bArr, 0, iArr);
        return !et6.u(14, iArr, c);
    }

    private static byte[] g(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    private static acc h() {
        return new jq9(256);
    }

    private static int i(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    private static int j(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    private static int k(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static void l(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i2 + i4] = k(bArr, (i4 * 4) + i);
        }
    }

    private static boolean m(byte[] bArr, int i, boolean z, b bVar) {
        byte[] g2 = g(bArr, i, 57);
        boolean z2 = false;
        if (!e(g2)) {
            return false;
        }
        byte b2 = g2[56];
        int i2 = (b2 & 128) >>> 7;
        g2[56] = (byte) (b2 & Byte.MAX_VALUE);
        o9c.j(g2, 0, bVar.b);
        int[] g3 = o9c.g();
        int[] g4 = o9c.g();
        o9c.H(bVar.b, g3);
        o9c.z(g3, 39081, g4);
        o9c.B(g3, g3);
        o9c.b(g3);
        o9c.b(g4);
        if (!o9c.I(g3, g4, bVar.a)) {
            return false;
        }
        o9c.C(bVar.a);
        if (i2 == 1 && o9c.y(bVar.a)) {
            return false;
        }
        int[] iArr = bVar.a;
        if (i2 != (iArr[0] & 1)) {
            z2 = true;
        }
        if (z ^ z2) {
            o9c.B(iArr, iArr);
        }
        E(bVar);
        return true;
    }

    private static void n(byte[] bArr, int i, int[] iArr) {
        l(bArr, i, iArr, 0, 14);
    }

    private static void o(acc accVar, byte b2, byte[] bArr) {
        byte[] bArr2 = a;
        int length = bArr2.length;
        int i = length + 2;
        int length2 = bArr.length + i;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        bArr3[length] = b2;
        bArr3[length + 1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr3, i, bArr.length);
        accVar.update(bArr3, 0, length2);
    }

    private static void p(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
    }

    private static void q(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private static void r(long j, byte[] bArr, int i) {
        q((int) j, bArr, i);
        p((int) (j >>> 32), bArr, i + 4);
    }

    private static int s(b bVar, byte[] bArr, int i) {
        int[] g2 = o9c.g();
        int[] g3 = o9c.g();
        o9c.v(bVar.c, g3);
        o9c.A(bVar.a, g3, g2);
        o9c.A(bVar.b, g3, g3);
        o9c.C(g2);
        o9c.C(g3);
        int c2 = c(g2, g3);
        o9c.p(g3, bArr, i);
        bArr[i + 56] = (byte) ((g2[0] & 1) << 7);
        return c2;
    }

    public static void t(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    public static void u(byte[] bArr, int i, byte[] bArr2, int i2) {
        acc h2 = h();
        byte[] bArr3 = new byte[114];
        h2.update(bArr, i, 57);
        h2.c(bArr3, 0, 114);
        byte[] bArr4 = new byte[57];
        J(bArr3, 0, bArr4);
        M(bArr4, bArr2, i2);
    }

    private static byte[] v(int[] iArr, int i) {
        int[] iArr2 = new int[28];
        int i2 = 0;
        int i3 = 14;
        int i4 = 28;
        int i5 = 0;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            int i6 = iArr[i3];
            iArr2[i4 - 1] = (i5 << 16) | (i6 >>> 16);
            i4 -= 2;
            iArr2[i4] = i6;
            i5 = i6;
        }
        byte[] bArr = new byte[447];
        int i7 = 32 - i;
        int i8 = 0;
        int i9 = 0;
        while (i2 < 28) {
            int i10 = iArr2[i2];
            while (i8 < 16) {
                int i11 = i10 >>> i8;
                if ((i11 & 1) == i9) {
                    i8++;
                } else {
                    int i12 = (i11 | 1) << i7;
                    bArr[(i2 << 4) + i8] = (byte) (i12 >> i7);
                    i8 += i;
                    i9 = i12 >>> 31;
                }
            }
            i2++;
            i8 -= 16;
        }
        return bArr;
    }

    private static void w(acc accVar, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte b2, byte[] bArr5, int i2, int i3, byte[] bArr6, int i4) {
        o(accVar, b2, bArr4);
        accVar.update(bArr, 57, 57);
        accVar.update(bArr5, i2, i3);
        accVar.c(bArr, 0, bArr.length);
        byte[] K = K(bArr);
        byte[] bArr7 = new byte[57];
        M(K, bArr7, 0);
        o(accVar, b2, bArr4);
        accVar.update(bArr7, 0, 57);
        accVar.update(bArr3, i, 57);
        accVar.update(bArr5, i2, i3);
        accVar.c(bArr, 0, bArr.length);
        byte[] a2 = a(K, K(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i4, 57);
        System.arraycopy(a2, 0, bArr6, i4 + 57, 57);
    }

    private static void x(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b2, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        if (b(bArr3)) {
            acc h2 = h();
            byte[] bArr6 = new byte[114];
            h2.update(bArr, i, 57);
            h2.c(bArr6, 0, 114);
            byte[] bArr7 = new byte[57];
            J(bArr6, 0, bArr7);
            w(h2, bArr6, bArr7, bArr2, i2, bArr3, b2, bArr4, i3, i4, bArr5, i5);
            return;
        }
        throw new IllegalArgumentException("ctx");
    }

    private static boolean y(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b2, byte[] bArr4, int i3, int i4) {
        if (b(bArr3)) {
            byte[] g2 = g(bArr, i, 57);
            byte[] g3 = g(bArr, i + 57, 57);
            if (!e(g2)) {
                return false;
            }
            int[] iArr = new int[14];
            if (!f(g3, iArr)) {
                return false;
            }
            b bVar = new b();
            if (!m(bArr2, i2, true, bVar)) {
                return false;
            }
            acc h2 = h();
            byte[] bArr5 = new byte[114];
            o(h2, b2, bArr3);
            h2.update(g2, 0, 57);
            h2.update(bArr2, i2, 57);
            h2.update(bArr4, i3, i4);
            h2.c(bArr5, 0, 114);
            int[] iArr2 = new int[14];
            n(K(bArr5), 0, iArr2);
            b bVar2 = new b();
            O(iArr, iArr2, bVar, bVar2);
            byte[] bArr6 = new byte[57];
            if (s(bVar2, bArr6, 0) == 0 || !tr.c(bArr6, g2)) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("ctx");
    }

    private static void z(c cVar, b bVar) {
        int[] g2 = o9c.g();
        int[] g3 = o9c.g();
        int[] g4 = o9c.g();
        int[] g5 = o9c.g();
        int[] g6 = o9c.g();
        int[] g7 = o9c.g();
        int[] g8 = o9c.g();
        o9c.H(bVar.c, g2);
        o9c.A(cVar.a, bVar.a, g3);
        o9c.A(cVar.b, bVar.b, g4);
        o9c.A(g3, g4, g5);
        o9c.z(g5, 39081, g5);
        o9c.a(g2, g5, g6);
        o9c.J(g2, g5, g7);
        o9c.a(cVar.a, cVar.b, g2);
        o9c.a(bVar.a, bVar.b, g5);
        o9c.A(g2, g5, g8);
        o9c.a(g4, g3, g2);
        o9c.J(g4, g3, g5);
        o9c.c(g2);
        o9c.J(g8, g2, g8);
        o9c.A(g8, bVar.c, g8);
        o9c.A(g5, bVar.c, g5);
        o9c.A(g6, g8, bVar.a);
        o9c.A(g5, g7, bVar.b);
        o9c.A(g6, g7, bVar.c);
    }
}
