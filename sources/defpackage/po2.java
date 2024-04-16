package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Decode.java */
/* renamed from: po2  reason: default package */
/* loaded from: classes3.dex */
public final class po2 {
    private static final int[] a = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private static final int[] b = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};
    private static final int[] c = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};
    private static final int[] d = {131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149};

    private static void a(aua auaVar) {
        ob0 ob0Var = auaVar.c;
        byte[] bArr = auaVar.d;
        int i = auaVar.g;
        if (i <= 0) {
            ob0.k(ob0Var);
            auaVar.a = 1;
            return;
        }
        int min = Math.min(auaVar.Q - auaVar.r, i);
        ob0.c(ob0Var, bArr, auaVar.r, min);
        auaVar.g -= min;
        int i2 = auaVar.r + min;
        auaVar.r = i2;
        int i3 = auaVar.Q;
        if (i2 == i3) {
            auaVar.b = 5;
            auaVar.Y = i3;
            auaVar.X = 0;
            auaVar.a = 12;
            return;
        }
        ob0.k(ob0Var);
        auaVar.a = 1;
    }

    private static void b(aua auaVar, int i) {
        int i2;
        ob0 ob0Var = auaVar.c;
        int[] iArr = auaVar.p;
        int i3 = i * 2;
        ob0.d(ob0Var);
        int i4 = i * 1080;
        int r = r(auaVar.e, i4, ob0Var);
        auaVar.n[i] = m(auaVar.f, i4, ob0Var);
        if (r == 1) {
            i2 = iArr[i3 + 1] + 1;
        } else if (r == 0) {
            i2 = iArr[i3];
        } else {
            i2 = r - 2;
        }
        int i5 = auaVar.o[i];
        if (i2 >= i5) {
            i2 -= i5;
        }
        int i6 = i3 + 1;
        iArr[i3] = iArr[i6];
        iArr[i6] = i2;
    }

    private static void c(aua auaVar) {
        b(auaVar, 1);
        auaVar.F = auaVar.l.c[auaVar.p[3]];
    }

    private static int d(int i, byte[] bArr, ob0 ob0Var) {
        boolean z;
        int i2;
        ob0.j(ob0Var);
        int h = h(ob0Var) + 1;
        if (h == 1) {
            mvb.a(bArr, 0, i);
            return h;
        }
        if (ob0.i(ob0Var, 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = ob0.i(ob0Var, 4) + 1;
        } else {
            i2 = 0;
        }
        int[] iArr = new int[1080];
        n(h + i2, iArr, 0, ob0Var);
        int i3 = 0;
        while (i3 < i) {
            ob0.j(ob0Var);
            ob0.d(ob0Var);
            int r = r(iArr, 0, ob0Var);
            if (r == 0) {
                bArr[i3] = 0;
            } else if (r <= i2) {
                for (int i4 = (1 << r) + ob0.i(ob0Var, r); i4 != 0; i4--) {
                    if (i3 < i) {
                        bArr[i3] = 0;
                        i3++;
                    } else {
                        throw new kg0("Corrupted context map");
                    }
                }
                continue;
            } else {
                bArr[i3] = (byte) (r - i2);
            }
            i3++;
        }
        if (ob0.i(ob0Var, 1) == 1) {
            j(bArr, i);
        }
        return h;
    }

    private static void e(aua auaVar) {
        b(auaVar, 2);
        auaVar.C = auaVar.p[5] << 2;
    }

    private static void f(aua auaVar) {
        b(auaVar, 0);
        int i = auaVar.p[1];
        int i2 = i << 6;
        auaVar.B = i2;
        int i3 = auaVar.A[i2] & 255;
        auaVar.v = i3;
        auaVar.w = auaVar.k.c[i3];
        byte b2 = auaVar.z[i];
        int[] iArr = fu1.b;
        auaVar.D = iArr[b2];
        auaVar.E = iArr[b2 + 1];
    }

    private static void g(ob0 ob0Var, aua auaVar) {
        boolean z;
        boolean z2 = true;
        if (ob0.i(ob0Var, 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        auaVar.h = z;
        auaVar.g = 0;
        auaVar.i = false;
        auaVar.j = false;
        if (z && ob0.i(ob0Var, 1) != 0) {
            return;
        }
        int i = ob0.i(ob0Var, 2) + 4;
        if (i == 7) {
            auaVar.j = true;
            if (ob0.i(ob0Var, 1) == 0) {
                int i2 = ob0.i(ob0Var, 2);
                if (i2 == 0) {
                    return;
                }
                for (int i3 = 0; i3 < i2; i3++) {
                    int i4 = ob0.i(ob0Var, 8);
                    if (i4 == 0 && i3 + 1 == i2 && i2 > 1) {
                        throw new kg0("Exuberant nibble");
                    }
                    auaVar.g = (i4 << (i3 * 8)) | auaVar.g;
                }
            } else {
                throw new kg0("Corrupted reserved bit");
            }
        } else {
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = ob0.i(ob0Var, 4);
                if (i6 == 0 && i5 + 1 == i && i > 4) {
                    throw new kg0("Exuberant nibble");
                }
                auaVar.g = (i6 << (i5 * 4)) | auaVar.g;
            }
        }
        auaVar.g++;
        if (!auaVar.h) {
            if (ob0.i(ob0Var, 1) != 1) {
                z2 = false;
            }
            auaVar.i = z2;
        }
    }

    private static int h(ob0 ob0Var) {
        if (ob0.i(ob0Var, 1) != 0) {
            int i = ob0.i(ob0Var, 3);
            if (i == 0) {
                return 1;
            }
            return ob0.i(ob0Var, i) + (1 << i);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:
        throw new defpackage.kg0("Invalid backward reference");
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013c A[LOOP:2: B:48:0x013c->B:54:0x0172, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(defpackage.aua r19) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po2.i(aua):void");
    }

    private static void j(byte[] bArr, int i) {
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = bArr[i3] & 255;
            bArr[i3] = (byte) iArr[i4];
            if (i4 != 0) {
                l(iArr, i4);
            }
        }
    }

    private static void k(aua auaVar) {
        int i;
        int i2 = auaVar.P;
        long j = auaVar.R;
        if (i2 > j) {
            while (true) {
                int i3 = i2 >> 1;
                if (i3 <= ((int) j) + auaVar.S.length) {
                    break;
                }
                i2 = i3;
            }
            if (!auaVar.h && i2 < 16384 && auaVar.P >= 16384) {
                i2 = 16384;
            }
        }
        int i4 = auaVar.Q;
        if (i2 <= i4) {
            return;
        }
        byte[] bArr = new byte[i2 + 37];
        byte[] bArr2 = auaVar.d;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, 0, i4);
        } else {
            byte[] bArr3 = auaVar.S;
            if (bArr3.length != 0) {
                int length = bArr3.length;
                int i5 = auaVar.O;
                if (length > i5) {
                    i = length - i5;
                } else {
                    i5 = length;
                    i = 0;
                }
                System.arraycopy(bArr3, i, bArr, 0, i5);
                auaVar.r = i5;
                auaVar.T = i5;
            }
        }
        auaVar.d = bArr;
        auaVar.Q = i2;
    }

    private static void l(int[] iArr, int i) {
        int i2 = iArr[i];
        while (i > 0) {
            iArr[i] = iArr[i - 1];
            i--;
        }
        iArr[0] = i2;
    }

    private static int m(int[] iArr, int i, ob0 ob0Var) {
        ob0.d(ob0Var);
        int r = r(iArr, i, ob0Var);
        return ti8.a[r] + ob0.i(ob0Var, ti8.b[r]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
        if (r4 != r3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bd, code lost:
        if (r8 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(int r15, int[] r16, int r17, defpackage.ob0 r18) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po2.n(int, int[], int, ob0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r4 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
        defpackage.mvb.b(r12, r2, r11 - r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
        throw new defpackage.kg0("Unused space");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void o(int[] r10, int r11, int[] r12, defpackage.ob0 r13) {
        /*
            r0 = 32
            int[] r0 = new int[r0]
            r1 = 5
            r2 = 18
            r3 = 0
            defpackage.zq4.a(r0, r3, r1, r10, r2)
            r10 = 8
            r1 = 32768(0x8000, float:4.5918E-41)
            r2 = 0
            r4 = 32768(0x8000, float:4.5918E-41)
            r5 = 0
        L15:
            r6 = 0
        L16:
            if (r2 >= r11) goto L7f
            if (r4 <= 0) goto L7f
            defpackage.ob0.j(r13)
            defpackage.ob0.d(r13)
            long r7 = r13.f
            int r9 = r13.g
            long r7 = r7 >>> r9
            int r8 = (int) r7
            r7 = r8 & 31
            r7 = r0[r7]
            int r8 = r7 >> 16
            int r9 = r9 + r8
            r13.g = r9
            r8 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r8
            r8 = 16
            if (r7 >= r8) goto L45
            int r6 = r2 + 1
            r12[r2] = r7
            if (r7 == 0) goto L43
            int r10 = r1 >> r7
            int r4 = r4 - r10
            r2 = r6
            r10 = r7
            goto L15
        L43:
            r2 = r6
            goto L15
        L45:
            int r9 = r7 + (-14)
            if (r7 != r8) goto L4b
            r7 = r10
            goto L4c
        L4b:
            r7 = 0
        L4c:
            if (r5 == r7) goto L50
            r5 = r7
            r6 = 0
        L50:
            if (r6 <= 0) goto L56
            int r7 = r6 + (-2)
            int r7 = r7 << r9
            goto L57
        L56:
            r7 = r6
        L57:
            int r8 = defpackage.ob0.i(r13, r9)
            int r8 = r8 + 3
            int r7 = r7 + r8
            int r6 = r7 - r6
            int r8 = r2 + r6
            if (r8 > r11) goto L77
            r8 = 0
        L65:
            if (r8 >= r6) goto L6f
            int r9 = r2 + 1
            r12[r2] = r5
            int r8 = r8 + 1
            r2 = r9
            goto L65
        L6f:
            if (r5 == 0) goto L75
            int r8 = 15 - r5
            int r6 = r6 << r8
            int r4 = r4 - r6
        L75:
            r6 = r7
            goto L16
        L77:
            kg0 r10 = new kg0
            java.lang.String r11 = "symbol + repeatDelta > numSymbols"
            r10.<init>(r11)
            throw r10
        L7f:
            if (r4 != 0) goto L86
            int r11 = r11 - r2
            defpackage.mvb.b(r12, r2, r11)
            return
        L86:
            kg0 r10 = new kg0
            java.lang.String r11 = "Unused space"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po2.o(int[], int, int[], ob0):void");
    }

    private static void p(aua auaVar) {
        int i;
        int[] iArr;
        ob0 ob0Var = auaVar.c;
        for (int i2 = 0; i2 < 3; i2++) {
            auaVar.o[i2] = h(ob0Var) + 1;
            auaVar.n[i2] = 268435456;
            int i3 = auaVar.o[i2];
            if (i3 > 1) {
                int i4 = i2 * 1080;
                n(i3 + 2, auaVar.e, i4, ob0Var);
                n(26, auaVar.f, i4, ob0Var);
                auaVar.n[i2] = m(auaVar.f, i4, ob0Var);
            }
        }
        ob0.j(ob0Var);
        auaVar.K = ob0.i(ob0Var, 2);
        int i5 = ob0.i(ob0Var, 4);
        int i6 = auaVar.K;
        int i7 = (i5 << i6) + 16;
        auaVar.I = i7;
        auaVar.J = (1 << i6) - 1;
        int i8 = i7 + (48 << i6);
        auaVar.z = new byte[auaVar.o[0]];
        int i9 = 0;
        while (true) {
            i = auaVar.o[0];
            if (i9 >= i) {
                break;
            }
            int min = Math.min(i9 + 96, i);
            while (i9 < min) {
                auaVar.z[i9] = (byte) (ob0.i(ob0Var, 2) << 1);
                i9++;
            }
            ob0.j(ob0Var);
        }
        byte[] bArr = new byte[i << 6];
        auaVar.A = bArr;
        int d2 = d(i << 6, bArr, ob0Var);
        auaVar.u = true;
        int i10 = 0;
        while (true) {
            iArr = auaVar.o;
            if (i10 >= (iArr[0] << 6)) {
                break;
            } else if (auaVar.A[i10] != (i10 >> 6)) {
                auaVar.u = false;
                break;
            } else {
                i10++;
            }
        }
        int i11 = iArr[2];
        byte[] bArr2 = new byte[i11 << 2];
        auaVar.H = bArr2;
        int d3 = d(i11 << 2, bArr2, ob0Var);
        ar4.b(auaVar.k, 256, d2);
        ar4.b(auaVar.l, 704, auaVar.o[1]);
        ar4.b(auaVar.m, i8, d3);
        ar4.a(auaVar.k, ob0Var);
        ar4.a(auaVar.l, ob0Var);
        ar4.a(auaVar.m, ob0Var);
        auaVar.B = 0;
        auaVar.C = 0;
        int[] iArr2 = fu1.b;
        byte b2 = auaVar.z[0];
        auaVar.D = iArr2[b2];
        auaVar.E = iArr2[b2 + 1];
        auaVar.v = 0;
        auaVar.w = auaVar.k.c[0];
        auaVar.F = auaVar.l.c[0];
        int[] iArr3 = auaVar.p;
        iArr3[4] = 1;
        iArr3[2] = 1;
        iArr3[0] = 1;
        iArr3[5] = 0;
        iArr3[3] = 0;
        iArr3[1] = 0;
    }

    private static void q(aua auaVar) {
        int i;
        ob0 ob0Var = auaVar.c;
        if (auaVar.h) {
            auaVar.b = 10;
            auaVar.Y = auaVar.r;
            auaVar.X = 0;
            auaVar.a = 12;
            return;
        }
        ar4 ar4Var = auaVar.k;
        ar4Var.b = null;
        ar4Var.c = null;
        ar4 ar4Var2 = auaVar.l;
        ar4Var2.b = null;
        ar4Var2.c = null;
        ar4 ar4Var3 = auaVar.m;
        ar4Var3.b = null;
        ar4Var3.c = null;
        ob0.j(ob0Var);
        g(ob0Var, auaVar);
        if (auaVar.g == 0 && !auaVar.j) {
            return;
        }
        if (!auaVar.i && !auaVar.j) {
            auaVar.a = 2;
        } else {
            ob0.g(ob0Var);
            if (auaVar.j) {
                i = 4;
            } else {
                i = 5;
            }
            auaVar.a = i;
        }
        if (auaVar.j) {
            return;
        }
        auaVar.R += auaVar.g;
        if (auaVar.Q < auaVar.P) {
            k(auaVar);
        }
    }

    private static int r(int[] iArr, int i, ob0 ob0Var) {
        long j = ob0Var.f;
        int i2 = ob0Var.g;
        int i3 = (int) (j >>> i2);
        int i4 = i + (i3 & 255);
        int i5 = iArr[i4];
        int i6 = i5 >> 16;
        int i7 = i5 & 65535;
        if (i6 <= 8) {
            ob0Var.g = i2 + i6;
            return i7;
        }
        int i8 = iArr[i4 + i7 + ((i3 & ((1 << i6) - 1)) >>> 8)];
        ob0Var.g = i2 + (i8 >> 16) + 8;
        return i8 & 65535;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void s(aua auaVar, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        auaVar.S = bArr;
    }

    private static int t(int i, int[] iArr, int i2) {
        if (i < 16) {
            return iArr[(i2 + b[i]) & 3] + c[i];
        }
        return i - 15;
    }

    private static boolean u(aua auaVar) {
        int i = auaVar.T;
        if (i != 0) {
            auaVar.X += i;
            auaVar.T = 0;
        }
        int min = Math.min(auaVar.V - auaVar.W, auaVar.Y - auaVar.X);
        if (min != 0) {
            System.arraycopy(auaVar.d, auaVar.X, auaVar.Z, auaVar.U + auaVar.W, min);
            auaVar.W += min;
            auaVar.X += min;
        }
        if (auaVar.W >= auaVar.V) {
            return false;
        }
        return true;
    }
}
