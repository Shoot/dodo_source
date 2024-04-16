package defpackage;

import defpackage.f9c;
import java.security.SecureRandom;
/* renamed from: ic3  reason: default package */
/* loaded from: classes3.dex */
public abstract class ic3 {
    private static final byte[] a = {83, 105, 103, 69, 100, 50, 53, 53, 49, 57, 32, 110, 111, 32, 69, 100, 50, 53, 53, 49, 57, 32, 99, 111, 108, 108, 105, 115, 105, 111, 110, 115};
    private static final int[] b = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] c = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    private static final int[] d = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};
    private static final int[] e = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};
    private static final int[] f = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};
    private static final int[] g = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};
    private static final int[] h = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};
    private static final Object i = new Object();
    private static d[] j = null;
    private static int[] k = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ic3$b */
    /* loaded from: classes3.dex */
    public static class b {
        int[] a;
        int[] b;
        int[] c;
        int[] d;
        int[] e;

        private b() {
            this.a = h9c.h();
            this.b = h9c.h();
            this.c = h9c.h();
            this.d = h9c.h();
            this.e = h9c.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ic3$c */
    /* loaded from: classes3.dex */
    public static class c {
        int[] a;
        int[] b;

        private c() {
            this.a = h9c.h();
            this.b = h9c.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ic3$d */
    /* loaded from: classes3.dex */
    public static class d {
        int[] a;
        int[] b;
        int[] c;
        int[] d;

        private d() {
            this.a = h9c.h();
            this.b = h9c.h();
            this.c = h9c.h();
            this.d = h9c.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ic3$e */
    /* loaded from: classes3.dex */
    public static class e {
        int[] a;
        int[] b;
        int[] c;

        private e() {
            this.a = h9c.h();
            this.b = h9c.h();
            this.c = h9c.h();
        }
    }

    private static void A(boolean z, d dVar, d dVar2, d dVar3) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] h2 = h9c.h();
        int[] h3 = h9c.h();
        int[] h4 = h9c.h();
        int[] h5 = h9c.h();
        int[] h6 = h9c.h();
        int[] h7 = h9c.h();
        int[] h8 = h9c.h();
        int[] h9 = h9c.h();
        if (z) {
            iArr2 = h4;
            iArr = h5;
            iArr4 = h7;
            iArr3 = h8;
        } else {
            iArr = h4;
            iArr2 = h5;
            iArr3 = h7;
            iArr4 = h8;
        }
        h9c.c(dVar.b, dVar.a, h3, h2);
        h9c.c(dVar2.b, dVar2.a, iArr2, iArr);
        h9c.z(h2, h4, h2);
        h9c.z(h3, h5, h3);
        h9c.z(dVar.d, dVar2.d, h4);
        h9c.z(h4, g, h4);
        h9c.z(dVar.c, dVar2.c, h5);
        h9c.a(h5, h5, h5);
        h9c.c(h3, h2, h9, h6);
        h9c.c(h5, h4, iArr4, iArr3);
        h9c.d(iArr4);
        h9c.z(h6, h7, dVar3.a);
        h9c.z(h8, h9, dVar3.b);
        h9c.z(h7, h8, dVar3.c);
        h9c.z(h6, h9, dVar3.d);
    }

    private static d B(b bVar) {
        d dVar = new d();
        h9c.g(bVar.a, 0, dVar.a, 0);
        h9c.g(bVar.b, 0, dVar.b, 0);
        h9c.g(bVar.c, 0, dVar.c, 0);
        h9c.z(bVar.d, bVar.e, dVar.d);
        return dVar;
    }

    private static d C(c cVar) {
        d dVar = new d();
        h9c.g(cVar.a, 0, dVar.a, 0);
        h9c.g(cVar.b, 0, dVar.b, 0);
        H(dVar);
        return dVar;
    }

    private static d D(d dVar) {
        d dVar2 = new d();
        E(dVar, dVar2);
        return dVar2;
    }

    private static void E(d dVar, d dVar2) {
        h9c.g(dVar.a, 0, dVar2.a, 0);
        h9c.g(dVar.b, 0, dVar2.b, 0);
        h9c.g(dVar.c, 0, dVar2.c, 0);
        h9c.g(dVar.d, 0, dVar2.d, 0);
    }

    private static void F(b bVar) {
        int[] h2 = h9c.h();
        int[] h3 = h9c.h();
        int[] h4 = h9c.h();
        int[] iArr = bVar.d;
        int[] h5 = h9c.h();
        int[] h6 = h9c.h();
        int[] iArr2 = bVar.e;
        h9c.G(bVar.a, h2);
        h9c.G(bVar.b, h3);
        h9c.G(bVar.c, h4);
        h9c.a(h4, h4, h4);
        h9c.c(h2, h3, iArr2, h6);
        h9c.a(bVar.a, bVar.b, iArr);
        h9c.G(iArr, iArr);
        h9c.I(iArr2, iArr, iArr);
        h9c.a(h4, h6, h5);
        h9c.d(h5);
        h9c.z(iArr, h5, bVar.a);
        h9c.z(h6, iArr2, bVar.b);
        h9c.z(h5, h6, bVar.c);
    }

    private static void G(b bVar) {
        h9c.C(bVar.c);
        h9c.g(bVar.a, 0, bVar.d, 0);
        h9c.g(bVar.b, 0, bVar.e, 0);
    }

    private static void H(d dVar) {
        h9c.C(dVar.c);
        h9c.z(dVar.a, dVar.b, dVar.d);
    }

    private static void I(int i2, int i3, e eVar) {
        int i4 = i2 * 240;
        for (int i5 = 0; i5 < 8; i5++) {
            int i6 = ((i5 ^ i3) - 1) >> 31;
            h9c.e(i6, k, i4, eVar.a, 0);
            h9c.e(i6, k, i4 + 10, eVar.b, 0);
            h9c.e(i6, k, i4 + 20, eVar.c, 0);
            i4 += 30;
        }
    }

    private static d[] J(d dVar, int i2) {
        d dVar2 = new d();
        A(false, dVar, dVar, dVar2);
        d[] dVarArr = new d[i2];
        dVarArr[0] = D(dVar);
        for (int i3 = 1; i3 < i2; i3++) {
            d dVar3 = dVarArr[i3 - 1];
            d dVar4 = new d();
            dVarArr[i3] = dVar4;
            A(false, dVar3, dVar2, dVar4);
        }
        return dVarArr;
    }

    private static void K(b bVar) {
        h9c.K(bVar.a);
        h9c.C(bVar.b);
        h9c.C(bVar.c);
        h9c.K(bVar.d);
        h9c.C(bVar.e);
    }

    private static void L(d dVar) {
        h9c.K(dVar.a);
        h9c.C(dVar.b);
        h9c.C(dVar.c);
        h9c.K(dVar.d);
    }

    public static void M() {
        int i2;
        synchronized (i) {
            try {
                if (k != null) {
                    return;
                }
                d dVar = new d();
                int[] iArr = d;
                h9c.g(iArr, 0, dVar.a, 0);
                int[] iArr2 = e;
                h9c.g(iArr2, 0, dVar.b, 0);
                H(dVar);
                j = J(dVar, 32);
                b bVar = new b();
                h9c.g(iArr, 0, bVar.a, 0);
                h9c.g(iArr2, 0, bVar.b, 0);
                G(bVar);
                k = h9c.i(192);
                int i3 = 0;
                for (int i4 = 0; i4 < 8; i4++) {
                    d[] dVarArr = new d[4];
                    d dVar2 = new d();
                    L(dVar2);
                    int i5 = 0;
                    while (true) {
                        i2 = 1;
                        if (i5 >= 4) {
                            break;
                        }
                        A(true, dVar2, B(bVar), dVar2);
                        F(bVar);
                        dVarArr[i5] = B(bVar);
                        if (i4 + i5 != 10) {
                            while (i2 < 8) {
                                F(bVar);
                                i2++;
                            }
                        }
                        i5++;
                    }
                    d[] dVarArr2 = new d[8];
                    dVarArr2[0] = dVar2;
                    int i6 = 0;
                    int i7 = 1;
                    while (i6 < 3) {
                        int i8 = i2 << i6;
                        int i9 = 0;
                        while (i9 < i8) {
                            d dVar3 = dVarArr2[i7 - i8];
                            d dVar4 = dVarArr[i6];
                            d dVar5 = new d();
                            dVarArr2[i7] = dVar5;
                            A(false, dVar3, dVar4, dVar5);
                            i9++;
                            i7++;
                        }
                        i6++;
                        i2 = 1;
                    }
                    int[] i10 = h9c.i(8);
                    int[] h2 = h9c.h();
                    h9c.g(dVarArr2[0].c, 0, h2, 0);
                    h9c.g(h2, 0, i10, 0);
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        if (i12 >= 8) {
                            break;
                        }
                        h9c.z(h2, dVarArr2[i12].c, h2);
                        h9c.g(h2, 0, i10, i12 * 10);
                        i11 = i12;
                    }
                    h9c.a(h2, h2, h2);
                    h9c.v(h2, h2);
                    int[] h3 = h9c.h();
                    while (i11 > 0) {
                        int i13 = i11 - 1;
                        h9c.g(i10, i13 * 10, h3, 0);
                        h9c.z(h3, h2, h3);
                        h9c.g(h3, 0, i10, i11 * 10);
                        h9c.z(h2, dVarArr2[i11].c, h2);
                        i11 = i13;
                    }
                    h9c.g(h2, 0, i10, 0);
                    for (int i14 = 0; i14 < 8; i14++) {
                        d dVar6 = dVarArr2[i14];
                        int[] h4 = h9c.h();
                        int[] h5 = h9c.h();
                        h9c.g(i10, i14 * 10, h5, 0);
                        h9c.z(dVar6.a, h5, h4);
                        h9c.z(dVar6.b, h5, h5);
                        e eVar = new e();
                        h9c.c(h5, h4, eVar.a, eVar.b);
                        h9c.z(h4, h5, eVar.c);
                        int[] iArr3 = eVar.c;
                        h9c.z(iArr3, h, iArr3);
                        h9c.B(eVar.a);
                        h9c.B(eVar.b);
                        h9c.g(eVar.a, 0, k, i3);
                        h9c.g(eVar.b, 0, k, i3 + 10);
                        h9c.g(eVar.c, 0, k, i3 + 20);
                        i3 += 30;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void N(byte[] bArr, int i2, byte[] bArr2) {
        System.arraycopy(bArr, i2, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        byte b2 = (byte) (bArr2[31] & Byte.MAX_VALUE);
        bArr2[31] = b2;
        bArr2[31] = (byte) (b2 | 64);
    }

    private static byte[] O(byte[] bArr) {
        long j2 = j(bArr, 49);
        long j3 = j2 & 4294967295L;
        long j4 = j(bArr, 56);
        long j5 = j4 & 4294967295L;
        long j6 = bArr[63] & 255;
        long i2 = ((i(bArr, 60) << 4) & 4294967295L) + (j5 >> 28);
        long j7 = j4 & 268435455;
        long j8 = ((j(bArr, 42) & 4294967295L) - (j6 * (-6428113))) - (i2 * 5343);
        long i3 = ((((i(bArr, 39) << 4) & 4294967295L) - (j6 * 127719000)) - (i2 * (-6428113))) - (j7 * 5343);
        long i4 = ((i(bArr, 53) << 4) & 4294967295L) + (j3 >> 28);
        long j9 = j2 & 268435455;
        long j10 = ((((j(bArr, 35) & 4294967295L) - (j6 * 19280294)) - (i2 * 127719000)) - (j7 * (-6428113))) - (i4 * 5343);
        long i5 = ((((((i(bArr, 32) << 4) & 4294967295L) - (j6 * (-50998291))) - (i2 * 19280294)) - (j7 * 127719000)) - (i4 * (-6428113))) - (j9 * 5343);
        long i6 = (((i(bArr, 46) << 4) & 4294967295L) - (j6 * 5343)) + (j8 >> 28);
        long j11 = (j8 & 268435455) + (i3 >> 28);
        long i7 = ((((i(bArr, 18) << 4) & 4294967295L) - (j9 * (-50998291))) - (i6 * 19280294)) - (j11 * 127719000);
        long i8 = ((((((i(bArr, 25) << 4) & 4294967295L) - (j7 * (-50998291))) - (i4 * 19280294)) - (j9 * 127719000)) - (i6 * (-6428113))) - (j11 * 5343);
        long j12 = (i3 & 268435455) + (j10 >> 28);
        long i9 = (((i(bArr, 11) << 4) & 4294967295L) - (j11 * (-50998291))) - (j12 * 19280294);
        long j13 = (((j(bArr, 14) & 4294967295L) - (i6 * (-50998291))) - (j11 * 19280294)) - (j12 * 127719000);
        long j14 = (((((j(bArr, 21) & 4294967295L) - (i4 * (-50998291))) - (j9 * 19280294)) - (i6 * 127719000)) - (j11 * (-6428113))) - (j12 * 5343);
        long j15 = (j10 & 268435455) + (i5 >> 28);
        long j16 = i5 & 268435455;
        long i10 = ((i(bArr, 4) << 4) & 4294967295L) - (j15 * (-50998291));
        long j17 = ((j(bArr, 7) & 4294967295L) - (j12 * (-50998291))) - (j15 * 19280294);
        long j18 = i9 - (j15 * 127719000);
        long j19 = j13 - (j15 * (-6428113));
        long j20 = (i7 - (j12 * (-6428113))) - (j15 * 5343);
        long j21 = ((((((j(bArr, 28) & 4294967295L) - (i2 * (-50998291))) - (j7 * 19280294)) - (i4 * 127719000)) - (j9 * (-6428113))) - (i6 * 5343)) + (i8 >> 28);
        long j22 = j21 & 268435455;
        long j23 = j22 >>> 27;
        long j24 = j16 + (j21 >> 28) + j23;
        long j25 = (j(bArr, 0) & 4294967295L) - (j24 * (-50998291));
        long j26 = (i10 - (j24 * 19280294)) + (j25 >> 28);
        long j27 = j25 & 268435455;
        long j28 = (j17 - (j24 * 127719000)) + (j26 >> 28);
        long j29 = (j18 - (j24 * (-6428113))) + (j28 >> 28);
        long j30 = (j19 - (j24 * 5343)) + (j29 >> 28);
        long j31 = j20 + (j30 >> 28);
        long j32 = j30 & 268435455;
        long j33 = j14 + (j31 >> 28);
        long j34 = (i8 & 268435455) + (j33 >> 28);
        long j35 = j22 + (j34 >> 28);
        long j36 = (j35 >> 28) - j23;
        long j37 = j27 + (j36 & (-50998291));
        long j38 = (j26 & 268435455) + (j36 & 19280294) + (j37 >> 28);
        long j39 = (j28 & 268435455) + (j36 & 127719000) + (j38 >> 28);
        long j40 = (j29 & 268435455) + (j36 & (-6428113)) + (j39 >> 28);
        long j41 = j32 + (j36 & 5343) + (j40 >> 28);
        long j42 = (j31 & 268435455) + (j41 >> 28);
        long j43 = (j33 & 268435455) + (j42 >> 28);
        long j44 = (j34 & 268435455) + (j43 >> 28);
        byte[] bArr2 = new byte[32];
        q((j37 & 268435455) | ((j38 & 268435455) << 28), bArr2, 0);
        q(((j40 & 268435455) << 28) | (j39 & 268435455), bArr2, 7);
        q((j41 & 268435455) | ((j42 & 268435455) << 28), bArr2, 14);
        q((j43 & 268435455) | ((j44 & 268435455) << 28), bArr2, 21);
        p((int) ((j35 & 268435455) + (j44 >> 28)), bArr2, 28);
        return bArr2;
    }

    private static void P(byte[] bArr, b bVar) {
        M();
        int[] iArr = new int[8];
        m(bArr, 0, iArr);
        et6.h(8, (~iArr[0]) & 1, iArr, c, iArr);
        et6.F(8, iArr, 1);
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = l65.f(iArr[i2]);
        }
        e eVar = new e();
        K(bVar);
        int i3 = 28;
        while (true) {
            for (int i4 = 0; i4 < 8; i4++) {
                int i5 = iArr[i4] >>> i3;
                int i6 = (i5 >>> 3) & 1;
                I(i4, (i5 ^ (-i6)) & 7, eVar);
                h9c.j(i6, eVar.a, eVar.b);
                h9c.f(i6, eVar.c);
                y(eVar, bVar);
            }
            i3 -= 4;
            if (i3 < 0) {
                return;
            }
            F(bVar);
        }
    }

    private static void Q(byte[] bArr, byte[] bArr2, int i2) {
        b bVar = new b();
        P(bArr, bVar);
        if (r(bVar, bArr2, i2) != 0) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void R(f9c.a aVar, byte[] bArr, int i2, int[] iArr, int[] iArr2) {
        if (aVar != null) {
            byte[] bArr2 = new byte[32];
            N(bArr, i2, bArr2);
            b bVar = new b();
            P(bArr2, bVar);
            if (d(bVar.a, bVar.b, bVar.c) != 0) {
                h9c.g(bVar.b, 0, iArr, 0);
                h9c.g(bVar.c, 0, iArr2, 0);
                return;
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("This method is only for use by X25519");
    }

    private static void S(int[] iArr, int[] iArr2, c cVar, b bVar) {
        boolean z;
        M();
        byte[] u = u(iArr, 7);
        byte[] u2 = u(iArr2, 5);
        d[] J = J(C(cVar), 8);
        K(bVar);
        int i2 = 252;
        while (true) {
            byte b2 = u[i2];
            boolean z2 = false;
            if (b2 != 0) {
                int i3 = b2 >> 31;
                int i4 = (b2 ^ i3) >>> 1;
                if (i3 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                z(z, j[i4], bVar);
            }
            byte b3 = u2[i2];
            if (b3 != 0) {
                int i5 = b3 >> 31;
                int i6 = (b3 ^ i5) >>> 1;
                if (i5 != 0) {
                    z2 = true;
                }
                z(z2, J[i6], bVar);
            }
            i2--;
            if (i2 < 0) {
                return;
            }
            F(bVar);
        }
    }

    public static void T(byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, int i4, int i5, byte[] bArr4, int i6) {
        w(bArr, i2, bArr2, i3, null, (byte) 0, bArr3, i4, i5, bArr4, i6);
    }

    public static void U(byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, byte[] bArr4, int i4, int i5, byte[] bArr5, int i6) {
        w(bArr, i2, bArr2, i3, bArr3, (byte) 0, bArr4, i4, i5, bArr5, i6);
    }

    public static void V(byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, byte[] bArr4, int i4, byte[] bArr5, int i5) {
        w(bArr, i2, bArr2, i3, bArr3, (byte) 1, bArr4, i4, 64, bArr5, i5);
    }

    public static boolean W(byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, int i4, int i5) {
        return x(bArr, i2, bArr2, i3, null, (byte) 0, bArr3, i4, i5);
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[16];
        m(bArr, 0, iArr);
        int[] iArr2 = new int[8];
        m(bArr2, 0, iArr2);
        int[] iArr3 = new int[8];
        m(bArr3, 0, iArr3);
        ys6.C(iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[64];
        for (int i2 = 0; i2 < 16; i2++) {
            p(iArr[i2], bArr4, i2 * 4);
        }
        return O(bArr4);
    }

    private static boolean b(byte[] bArr, byte b2) {
        if ((bArr == null && b2 == 0) || (bArr != null && bArr.length < 256)) {
            return true;
        }
        return false;
    }

    private static int c(int[] iArr, int[] iArr2) {
        int[] h2 = h9c.h();
        int[] h3 = h9c.h();
        int[] h4 = h9c.h();
        h9c.G(iArr, h3);
        h9c.G(iArr2, h4);
        h9c.z(h3, h4, h2);
        h9c.I(h4, h3, h4);
        h9c.z(h2, f, h2);
        h9c.b(h2);
        h9c.I(h2, h4, h2);
        h9c.B(h2);
        return h9c.w(h2);
    }

    private static int d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] h2 = h9c.h();
        int[] h3 = h9c.h();
        int[] h4 = h9c.h();
        int[] h5 = h9c.h();
        h9c.G(iArr, h3);
        h9c.G(iArr2, h4);
        h9c.G(iArr3, h5);
        h9c.z(h3, h4, h2);
        h9c.I(h4, h3, h4);
        h9c.z(h4, h5, h4);
        h9c.G(h5, h5);
        h9c.z(h2, f, h2);
        h9c.a(h2, h5, h2);
        h9c.I(h2, h4, h2);
        h9c.B(h2);
        return h9c.w(h2);
    }

    private static boolean e(byte[] bArr) {
        int[] iArr = new int[8];
        k(bArr, 0, iArr, 0, 8);
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        return !ys6.s(iArr, b);
    }

    private static boolean f(byte[] bArr, int[] iArr) {
        m(bArr, 0, iArr);
        return !ys6.s(iArr, c);
    }

    private static byte[] g(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    private static e23 h() {
        return new gq9();
    }

    private static int i(byte[] bArr, int i2) {
        return ((bArr[i2 + 2] & 255) << 16) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8);
    }

    private static int j(byte[] bArr, int i2) {
        return (bArr[i2 + 3] << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    private static void k(byte[] bArr, int i2, int[] iArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            iArr[i3 + i5] = j(bArr, (i5 * 4) + i2);
        }
    }

    private static boolean l(byte[] bArr, int i2, boolean z, c cVar) {
        byte[] g2 = g(bArr, i2, 32);
        boolean z2 = false;
        if (!e(g2)) {
            return false;
        }
        byte b2 = g2[31];
        int i3 = (b2 & 128) >>> 7;
        g2[31] = (byte) (b2 & Byte.MAX_VALUE);
        h9c.k(g2, 0, cVar.b);
        int[] h2 = h9c.h();
        int[] h3 = h9c.h();
        h9c.G(cVar.b, h2);
        h9c.z(f, h2, h3);
        h9c.J(h2);
        h9c.b(h3);
        if (!h9c.H(h2, h3, cVar.a)) {
            return false;
        }
        h9c.B(cVar.a);
        if (i3 == 1 && h9c.x(cVar.a)) {
            return false;
        }
        int[] iArr = cVar.a;
        if (i3 != (iArr[0] & 1)) {
            z2 = true;
        }
        if (z ^ z2) {
            h9c.A(iArr, iArr);
        }
        return true;
    }

    private static void m(byte[] bArr, int i2, int[] iArr) {
        k(bArr, i2, iArr, 0, 8);
    }

    private static void n(e23 e23Var, byte b2, byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = a;
            int length = bArr2.length;
            int i2 = length + 2;
            int length2 = bArr.length + i2;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArr2, 0, bArr3, 0, length);
            bArr3[length] = b2;
            bArr3[length + 1] = (byte) bArr.length;
            System.arraycopy(bArr, 0, bArr3, i2, bArr.length);
            e23Var.update(bArr3, 0, length2);
        }
    }

    private static void o(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) (i2 >>> 16);
    }

    private static void p(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) (i2 >>> 16);
        bArr[i3 + 3] = (byte) (i2 >>> 24);
    }

    private static void q(long j2, byte[] bArr, int i2) {
        p((int) j2, bArr, i2);
        o((int) (j2 >>> 32), bArr, i2 + 4);
    }

    private static int r(b bVar, byte[] bArr, int i2) {
        int[] h2 = h9c.h();
        int[] h3 = h9c.h();
        h9c.u(bVar.c, h3);
        h9c.z(bVar.a, h3, h2);
        h9c.z(bVar.b, h3, h3);
        h9c.B(h2);
        h9c.B(h3);
        int c2 = c(h2, h3);
        h9c.p(h3, bArr, i2);
        int i3 = i2 + 31;
        bArr[i3] = (byte) (((h2[0] & 1) << 7) | bArr[i3]);
        return c2;
    }

    public static void s(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    public static void t(byte[] bArr, int i2, byte[] bArr2, int i3) {
        e23 h2 = h();
        byte[] bArr3 = new byte[h2.getDigestSize()];
        h2.update(bArr, i2, 32);
        h2.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[32];
        N(bArr3, 0, bArr4);
        Q(bArr4, bArr2, i3);
    }

    private static byte[] u(int[] iArr, int i2) {
        int[] iArr2 = new int[16];
        int i3 = 0;
        int i4 = 8;
        int i5 = 16;
        int i6 = 0;
        while (true) {
            i4--;
            if (i4 < 0) {
                break;
            }
            int i7 = iArr[i4];
            iArr2[i5 - 1] = (i6 << 16) | (i7 >>> 16);
            i5 -= 2;
            iArr2[i5] = i7;
            i6 = i7;
        }
        byte[] bArr = new byte[253];
        int i8 = 32 - i2;
        int i9 = 0;
        int i10 = 0;
        while (i3 < 16) {
            int i11 = iArr2[i3];
            while (i9 < 16) {
                int i12 = i11 >>> i9;
                if ((i12 & 1) == i10) {
                    i9++;
                } else {
                    int i13 = (i12 | 1) << i8;
                    bArr[(i3 << 4) + i9] = (byte) (i13 >> i8);
                    i9 += i2;
                    i10 = i13 >>> 31;
                }
            }
            i3++;
            i9 -= 16;
        }
        return bArr;
    }

    private static void v(e23 e23Var, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, byte[] bArr4, byte b2, byte[] bArr5, int i3, int i4, byte[] bArr6, int i5) {
        n(e23Var, b2, bArr4);
        e23Var.update(bArr, 32, 32);
        e23Var.update(bArr5, i3, i4);
        e23Var.doFinal(bArr, 0);
        byte[] O = O(bArr);
        byte[] bArr7 = new byte[32];
        Q(O, bArr7, 0);
        n(e23Var, b2, bArr4);
        e23Var.update(bArr7, 0, 32);
        e23Var.update(bArr3, i2, 32);
        e23Var.update(bArr5, i3, i4);
        e23Var.doFinal(bArr, 0);
        byte[] a2 = a(O, O(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i5, 32);
        System.arraycopy(a2, 0, bArr6, i5 + 32, 32);
    }

    private static void w(byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, byte b2, byte[] bArr4, int i4, int i5, byte[] bArr5, int i6) {
        if (b(bArr3, b2)) {
            e23 h2 = h();
            byte[] bArr6 = new byte[h2.getDigestSize()];
            h2.update(bArr, i2, 32);
            h2.doFinal(bArr6, 0);
            byte[] bArr7 = new byte[32];
            N(bArr6, 0, bArr7);
            v(h2, bArr6, bArr7, bArr2, i3, bArr3, b2, bArr4, i4, i5, bArr5, i6);
            return;
        }
        throw new IllegalArgumentException("ctx");
    }

    private static boolean x(byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, byte b2, byte[] bArr4, int i4, int i5) {
        if (b(bArr3, b2)) {
            byte[] g2 = g(bArr, i2, 32);
            byte[] g3 = g(bArr, i2 + 32, 32);
            if (!e(g2)) {
                return false;
            }
            int[] iArr = new int[8];
            if (!f(g3, iArr)) {
                return false;
            }
            c cVar = new c();
            if (!l(bArr2, i3, true, cVar)) {
                return false;
            }
            e23 h2 = h();
            byte[] bArr5 = new byte[h2.getDigestSize()];
            n(h2, b2, bArr3);
            h2.update(g2, 0, 32);
            h2.update(bArr2, i3, 32);
            h2.update(bArr4, i4, i5);
            h2.doFinal(bArr5, 0);
            int[] iArr2 = new int[8];
            m(O(bArr5), 0, iArr2);
            b bVar = new b();
            S(iArr, iArr2, cVar, bVar);
            byte[] bArr6 = new byte[32];
            if (r(bVar, bArr6, 0) == 0 || !tr.c(bArr6, g2)) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("ctx");
    }

    private static void y(e eVar, b bVar) {
        int[] h2 = h9c.h();
        int[] h3 = h9c.h();
        int[] h4 = h9c.h();
        int[] iArr = bVar.d;
        int[] h5 = h9c.h();
        int[] h6 = h9c.h();
        int[] iArr2 = bVar.e;
        h9c.c(bVar.b, bVar.a, h3, h2);
        h9c.z(h2, eVar.b, h2);
        h9c.z(h3, eVar.a, h3);
        h9c.z(bVar.d, bVar.e, h4);
        h9c.z(h4, eVar.c, h4);
        h9c.c(h3, h2, iArr2, iArr);
        h9c.c(bVar.c, h4, h6, h5);
        h9c.d(h6);
        h9c.z(iArr, h5, bVar.a);
        h9c.z(h6, iArr2, bVar.b);
        h9c.z(h5, h6, bVar.c);
    }

    private static void z(boolean z, d dVar, b bVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] h2 = h9c.h();
        int[] h3 = h9c.h();
        int[] h4 = h9c.h();
        int[] h5 = h9c.h();
        int[] iArr5 = bVar.d;
        int[] h6 = h9c.h();
        int[] h7 = h9c.h();
        int[] iArr6 = bVar.e;
        if (z) {
            iArr2 = h4;
            iArr = h5;
            iArr4 = h6;
            iArr3 = h7;
        } else {
            iArr = h4;
            iArr2 = h5;
            iArr3 = h6;
            iArr4 = h7;
        }
        h9c.c(bVar.b, bVar.a, h3, h2);
        h9c.c(dVar.b, dVar.a, iArr2, iArr);
        h9c.z(h2, h4, h2);
        h9c.z(h3, h5, h3);
        h9c.z(bVar.d, bVar.e, h4);
        h9c.z(h4, dVar.d, h4);
        h9c.z(h4, g, h4);
        h9c.z(bVar.c, dVar.c, h5);
        h9c.a(h5, h5, h5);
        h9c.c(h3, h2, iArr6, iArr5);
        h9c.c(h5, h4, iArr4, iArr3);
        h9c.d(iArr4);
        h9c.z(iArr5, h6, bVar.a);
        h9c.z(h7, iArr6, bVar.b);
        h9c.z(h6, h7, bVar.c);
    }
}
