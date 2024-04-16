package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.j1;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.y;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ArrayDecoders.java */
/* loaded from: classes2.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArrayDecoders.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[j1.b.values().length];
            a = iArr;
            try {
                iArr[j1.b.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[j1.b.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[j1.b.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[j1.b.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[j1.b.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[j1.b.o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[j1.b.h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[j1.b.r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[j1.b.i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[j1.b.q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[j1.b.j.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[j1.b.s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[j1.b.t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[j1.b.p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[j1.b.n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[j1.b.k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[j1.b.l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[j1.b.m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArrayDecoders.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public int a;
        public long b;
        public Object c;
        public final o d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(o oVar) {
            oVar.getClass();
            this.d = oVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int A(int i, byte[] bArr, int i2, int i3, y.i<?> iVar, b bVar) {
        x xVar = (x) iVar;
        int I = I(bArr, i2, bVar);
        xVar.S0(i.b(bVar.a));
        while (I < i3) {
            int I2 = I(bArr, I, bVar);
            if (i != bVar.a) {
                break;
            }
            I = I(bArr, I2, bVar);
            xVar.S0(i.b(bVar.a));
        }
        return I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int B(int i, byte[] bArr, int i2, int i3, y.i<?> iVar, b bVar) {
        d0 d0Var = (d0) iVar;
        int L = L(bArr, i2, bVar);
        d0Var.h(i.c(bVar.b));
        while (L < i3) {
            int I = I(bArr, L, bVar);
            if (i != bVar.a) {
                break;
            }
            L = L(bArr, I, bVar);
            d0Var.h(i.c(bVar.b));
        }
        return L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int C(byte[] bArr, int i, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i, bVar);
        int i2 = bVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                bVar.c = "";
                return I;
            }
            bVar.c = new String(bArr, I, i2, y.b);
            return I + i2;
        }
        throw InvalidProtocolBufferException.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x001a -> B:9:0x001b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int D(int r4, byte[] r5, int r6, int r7, com.google.crypto.tink.shaded.protobuf.y.i<?> r8, com.google.crypto.tink.shaded.protobuf.e.b r9) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            int r6 = I(r5, r6, r9)
            int r0 = r9.a
            if (r0 < 0) goto L45
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r8.add(r1)
            goto L1b
        L10:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.y.b
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L1a:
            int r6 = r6 + r0
        L1b:
            if (r6 >= r7) goto L44
            int r0 = I(r5, r6, r9)
            int r2 = r9.a
            if (r4 == r2) goto L26
            goto L44
        L26:
            int r6 = I(r5, r0, r9)
            int r0 = r9.a
            if (r0 < 0) goto L3f
            if (r0 != 0) goto L34
            r8.add(r1)
            goto L1b
        L34:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.y.b
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
            goto L1a
        L3f:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r4 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.i()
            throw r4
        L44:
            return r6
        L45:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r4 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.i()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.D(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.y$i, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0023). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int E(int r5, byte[] r6, int r7, int r8, com.google.crypto.tink.shaded.protobuf.y.i<?> r9, com.google.crypto.tink.shaded.protobuf.e.b r10) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            int r7 = I(r6, r7, r10)
            int r0 = r10.a
            if (r0 < 0) goto L5f
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r9.add(r1)
            goto L23
        L10:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.i1.n(r6, r7, r2)
            if (r3 == 0) goto L5a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.y.b
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L22:
            r7 = r2
        L23:
            if (r7 >= r8) goto L59
            int r0 = I(r6, r7, r10)
            int r2 = r10.a
            if (r5 == r2) goto L2e
            goto L59
        L2e:
            int r7 = I(r6, r0, r10)
            int r0 = r10.a
            if (r0 < 0) goto L54
            if (r0 != 0) goto L3c
            r9.add(r1)
            goto L23
        L3c:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.i1.n(r6, r7, r2)
            if (r3 == 0) goto L4f
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.y.b
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
            goto L22
        L4f:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.d()
            throw r5
        L54:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.i()
            throw r5
        L59:
            return r7
        L5a:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.d()
            throw r5
        L5f:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.i()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.E(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.y$i, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F(byte[] bArr, int i, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i, bVar);
        int i2 = bVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                bVar.c = "";
                return I;
            }
            bVar.c = i1.e(bArr, I, i2);
            return I + i2;
        }
        throw InvalidProtocolBufferException.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int G(int i, byte[] bArr, int i2, int i3, f1 f1Var, b bVar) throws InvalidProtocolBufferException {
        if (j1.a(i) != 0) {
            int b2 = j1.b(i);
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (b2 != 3) {
                            if (b2 == 5) {
                                f1Var.m(i, Integer.valueOf(h(bArr, i2)));
                                return i2 + 4;
                            }
                            throw InvalidProtocolBufferException.c();
                        }
                        f1 j = f1.j();
                        int i4 = (i & (-8)) | 4;
                        int i5 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int I = I(bArr, i2, bVar);
                            int i6 = bVar.a;
                            if (i6 == i4) {
                                i5 = i6;
                                i2 = I;
                                break;
                            }
                            i5 = i6;
                            i2 = G(i6, bArr, I, i3, j, bVar);
                        }
                        if (i2 <= i3 && i5 == i4) {
                            f1Var.m(i, j);
                            return i2;
                        }
                        throw InvalidProtocolBufferException.j();
                    }
                    int I2 = I(bArr, i2, bVar);
                    int i7 = bVar.a;
                    if (i7 >= 0) {
                        if (i7 <= bArr.length - I2) {
                            if (i7 == 0) {
                                f1Var.m(i, h.b);
                            } else {
                                f1Var.m(i, h.w(bArr, I2, i7));
                            }
                            return I2 + i7;
                        }
                        throw InvalidProtocolBufferException.m();
                    }
                    throw InvalidProtocolBufferException.i();
                }
                f1Var.m(i, Long.valueOf(j(bArr, i2)));
                return i2 + 8;
            }
            int L = L(bArr, i2, bVar);
            f1Var.m(i, Long.valueOf(bVar.b));
            return L;
        }
        throw InvalidProtocolBufferException.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H(int i, byte[] bArr, int i2, b bVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            bVar.a = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            bVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            bVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            bVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                bVar.a = i11;
                return i12;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int I(byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 >= 0) {
            bVar.a = b2;
            return i2;
        }
        return H(b2, bArr, i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int J(int i, byte[] bArr, int i2, int i3, y.i<?> iVar, b bVar) {
        x xVar = (x) iVar;
        int I = I(bArr, i2, bVar);
        xVar.S0(bVar.a);
        while (I < i3) {
            int I2 = I(bArr, I, bVar);
            if (i != bVar.a) {
                break;
            }
            I = I(bArr, I2, bVar);
            xVar.S0(bVar.a);
        }
        return I;
    }

    static int K(long j, byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i3 = 7;
        while (b2 < 0) {
            int i4 = i2 + 1;
            byte b3 = bArr[i2];
            i3 += 7;
            j2 |= (b3 & Byte.MAX_VALUE) << i3;
            i2 = i4;
            b2 = b3;
        }
        bVar.b = j2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int L(byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            bVar.b = j;
            return i2;
        }
        return K(j, bArr, i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int M(int i, byte[] bArr, int i2, int i3, y.i<?> iVar, b bVar) {
        d0 d0Var = (d0) iVar;
        int L = L(bArr, i2, bVar);
        d0Var.h(bVar.b);
        while (L < i3) {
            int I = I(bArr, L, bVar);
            if (i != bVar.a) {
                break;
            }
            L = L(bArr, I, bVar);
            d0Var.h(bVar.b);
        }
        return L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int N(int i, byte[] bArr, int i2, int i3, b bVar) throws InvalidProtocolBufferException {
        if (j1.a(i) != 0) {
            int b2 = j1.b(i);
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (b2 != 3) {
                            if (b2 == 5) {
                                return i2 + 4;
                            }
                            throw InvalidProtocolBufferException.c();
                        }
                        int i4 = (i & (-8)) | 4;
                        int i5 = 0;
                        while (i2 < i3) {
                            i2 = I(bArr, i2, bVar);
                            i5 = bVar.a;
                            if (i5 == i4) {
                                break;
                            }
                            i2 = N(i5, bArr, i2, i3, bVar);
                        }
                        if (i2 <= i3 && i5 == i4) {
                            return i2;
                        }
                        throw InvalidProtocolBufferException.j();
                    }
                    return I(bArr, i2, bVar) + bVar.a;
                }
                return i2 + 8;
            }
            return L(bArr, i2, bVar);
        }
        throw InvalidProtocolBufferException.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, int i3, y.i<?> iVar, b bVar) {
        boolean z;
        boolean z2;
        g gVar = (g) iVar;
        int L = L(bArr, i2, bVar);
        if (bVar.b != 0) {
            z = true;
        } else {
            z = false;
        }
        gVar.h(z);
        while (L < i3) {
            int I = I(bArr, L, bVar);
            if (i != bVar.a) {
                break;
            }
            L = L(bArr, I, bVar);
            if (bVar.b != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            gVar.h(z2);
        }
        return L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(byte[] bArr, int i, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i, bVar);
        int i2 = bVar.a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - I) {
                if (i2 == 0) {
                    bVar.c = h.b;
                    return I;
                }
                bVar.c = h.w(bArr, I, i2);
                return I + i2;
            }
            throw InvalidProtocolBufferException.m();
        }
        throw InvalidProtocolBufferException.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x001b -> B:10:0x001c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r2, byte[] r3, int r4, int r5, com.google.crypto.tink.shaded.protobuf.y.i<?> r6, com.google.crypto.tink.shaded.protobuf.e.b r7) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            int r4 = I(r3, r4, r7)
            int r0 = r7.a
            if (r0 < 0) goto L53
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L4e
            if (r0 != 0) goto L14
            com.google.crypto.tink.shaded.protobuf.h r0 = com.google.crypto.tink.shaded.protobuf.h.b
            r6.add(r0)
            goto L1c
        L14:
            com.google.crypto.tink.shaded.protobuf.h r1 = com.google.crypto.tink.shaded.protobuf.h.w(r3, r4, r0)
            r6.add(r1)
        L1b:
            int r4 = r4 + r0
        L1c:
            if (r4 >= r5) goto L4d
            int r0 = I(r3, r4, r7)
            int r1 = r7.a
            if (r2 == r1) goto L27
            goto L4d
        L27:
            int r4 = I(r3, r0, r7)
            int r0 = r7.a
            if (r0 < 0) goto L48
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L43
            if (r0 != 0) goto L3b
            com.google.crypto.tink.shaded.protobuf.h r0 = com.google.crypto.tink.shaded.protobuf.h.b
            r6.add(r0)
            goto L1c
        L3b:
            com.google.crypto.tink.shaded.protobuf.h r1 = com.google.crypto.tink.shaded.protobuf.h.w(r3, r4, r0)
            r6.add(r1)
            goto L1b
        L43:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.m()
            throw r2
        L48:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.i()
            throw r2
        L4d:
            return r4
        L4e:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.m()
            throw r2
        L53:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.i()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.c(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.y$i, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double d(byte[] bArr, int i) {
        return Double.longBitsToDouble(j(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i, byte[] bArr, int i2, int i3, y.i<?> iVar, b bVar) {
        l lVar = (l) iVar;
        lVar.g(d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.a) {
                break;
            }
            lVar.g(d(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    static int f(int i, byte[] bArr, int i2, int i3, w.c<?, ?> cVar, w.e<?, ?> eVar, e1<f1, f1> e1Var, b bVar) throws IOException {
        boolean z;
        Object i4;
        t<w.d> tVar = cVar.extensions;
        int i5 = i >>> 3;
        Object obj = null;
        if (eVar.b.j() && eVar.b.n()) {
            switch (a.a[eVar.a().ordinal()]) {
                case 1:
                    l lVar = new l();
                    int s = s(bArr, i2, lVar, bVar);
                    tVar.w(eVar.b, lVar);
                    return s;
                case 2:
                    u uVar = new u();
                    int v = v(bArr, i2, uVar, bVar);
                    tVar.w(eVar.b, uVar);
                    return v;
                case 3:
                case 4:
                    d0 d0Var = new d0();
                    int z2 = z(bArr, i2, d0Var, bVar);
                    tVar.w(eVar.b, d0Var);
                    return z2;
                case 5:
                case 6:
                    x xVar = new x();
                    int y = y(bArr, i2, xVar, bVar);
                    tVar.w(eVar.b, xVar);
                    return y;
                case 7:
                case 8:
                    d0 d0Var2 = new d0();
                    int u = u(bArr, i2, d0Var2, bVar);
                    tVar.w(eVar.b, d0Var2);
                    return u;
                case 9:
                case 10:
                    x xVar2 = new x();
                    int t = t(bArr, i2, xVar2, bVar);
                    tVar.w(eVar.b, xVar2);
                    return t;
                case 11:
                    g gVar = new g();
                    int r = r(bArr, i2, gVar, bVar);
                    tVar.w(eVar.b, gVar);
                    return r;
                case 12:
                    x xVar3 = new x();
                    int w = w(bArr, i2, xVar3, bVar);
                    tVar.w(eVar.b, xVar3);
                    return w;
                case 13:
                    d0 d0Var3 = new d0();
                    int x = x(bArr, i2, d0Var3, bVar);
                    tVar.w(eVar.b, d0Var3);
                    return x;
                case 14:
                    x xVar4 = new x();
                    int y2 = y(bArr, i2, xVar4, bVar);
                    f1 f1Var = cVar.unknownFields;
                    if (f1Var != f1.c()) {
                        obj = f1Var;
                    }
                    f1 f1Var2 = (f1) a1.z(i5, xVar4, eVar.b.g(), obj, e1Var);
                    if (f1Var2 != null) {
                        cVar.unknownFields = f1Var2;
                    }
                    tVar.w(eVar.b, xVar4);
                    return y2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.b.l());
            }
        }
        if (eVar.a() == j1.b.p) {
            i2 = I(bArr, i2, bVar);
            if (eVar.b.g().a(bVar.a) == null) {
                f1 f1Var3 = cVar.unknownFields;
                if (f1Var3 == f1.c()) {
                    f1Var3 = f1.j();
                    cVar.unknownFields = f1Var3;
                }
                a1.L(i5, bVar.a, f1Var3, e1Var);
                return i2;
            }
            obj = Integer.valueOf(bVar.a);
        } else {
            switch (a.a[eVar.a().ordinal()]) {
                case 1:
                    obj = Double.valueOf(d(bArr, i2));
                    i2 += 8;
                    break;
                case 2:
                    obj = Float.valueOf(l(bArr, i2));
                    i2 += 4;
                    break;
                case 3:
                case 4:
                    i2 = L(bArr, i2, bVar);
                    obj = Long.valueOf(bVar.b);
                    break;
                case 5:
                case 6:
                    i2 = I(bArr, i2, bVar);
                    obj = Integer.valueOf(bVar.a);
                    break;
                case 7:
                case 8:
                    obj = Long.valueOf(j(bArr, i2));
                    i2 += 8;
                    break;
                case 9:
                case 10:
                    obj = Integer.valueOf(h(bArr, i2));
                    i2 += 4;
                    break;
                case 11:
                    i2 = L(bArr, i2, bVar);
                    if (bVar.b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    obj = Boolean.valueOf(z);
                    break;
                case 12:
                    i2 = I(bArr, i2, bVar);
                    obj = Integer.valueOf(i.b(bVar.a));
                    break;
                case 13:
                    i2 = L(bArr, i2, bVar);
                    obj = Long.valueOf(i.c(bVar.b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i2 = b(bArr, i2, bVar);
                    obj = bVar.c;
                    break;
                case 16:
                    i2 = C(bArr, i2, bVar);
                    obj = bVar.c;
                    break;
                case 17:
                    i2 = n(u0.a().d(eVar.b().getClass()), bArr, i2, i3, (i5 << 3) | 4, bVar);
                    obj = bVar.c;
                    break;
                case 18:
                    i2 = p(u0.a().d(eVar.b().getClass()), bArr, i2, i3, bVar);
                    obj = bVar.c;
                    break;
            }
        }
        if (eVar.d()) {
            tVar.a(eVar.b, obj);
        } else {
            int i6 = a.a[eVar.a().ordinal()];
            if ((i6 == 17 || i6 == 18) && (i4 = tVar.i(eVar.b)) != null) {
                obj = y.h(i4, obj);
            }
            tVar.w(eVar.b, obj);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(int i, byte[] bArr, int i2, int i3, Object obj, m0 m0Var, e1<f1, f1> e1Var, b bVar) throws IOException {
        w.e a2 = bVar.d.a(m0Var, i >>> 3);
        if (a2 == null) {
            return G(i, bArr, i2, i3, o0.v(obj), bVar);
        }
        w.c cVar = (w.c) obj;
        cVar.L();
        return f(i, bArr, i2, i3, cVar, a2, e1Var, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i, byte[] bArr, int i2, int i3, y.i<?> iVar, b bVar) {
        x xVar = (x) iVar;
        xVar.S0(h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.a) {
                break;
            }
            xVar.S0(h(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long j(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i, byte[] bArr, int i2, int i3, y.i<?> iVar, b bVar) {
        d0 d0Var = (d0) iVar;
        d0Var.h(j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.a) {
                break;
            }
            d0Var.h(j(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float l(byte[] bArr, int i) {
        return Float.intBitsToFloat(h(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(int i, byte[] bArr, int i2, int i3, y.i<?> iVar, b bVar) {
        u uVar = (u) iVar;
        uVar.g(l(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.a) {
                break;
            }
            uVar.g(l(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(y0 y0Var, byte[] bArr, int i, int i2, int i3, b bVar) throws IOException {
        o0 o0Var = (o0) y0Var;
        Object e = o0Var.e();
        int c0 = o0Var.c0(e, bArr, i, i2, i3, bVar);
        o0Var.b(e);
        bVar.c = e;
        return c0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(y0 y0Var, int i, byte[] bArr, int i2, int i3, y.i<?> iVar, b bVar) throws IOException {
        int i4 = (i & (-8)) | 4;
        int n = n(y0Var, bArr, i2, i3, i4, bVar);
        iVar.add(bVar.c);
        while (n < i3) {
            int I = I(bArr, n, bVar);
            if (i != bVar.a) {
                break;
            }
            n = n(y0Var, bArr, I, i3, i4, bVar);
            iVar.add(bVar.c);
        }
        return n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(y0 y0Var, byte[] bArr, int i, int i2, b bVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = H(i4, bArr, i3, bVar);
            i4 = bVar.a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object e = y0Var.e();
            int i6 = i4 + i5;
            y0Var.h(e, bArr, i5, i6, bVar);
            y0Var.b(e);
            bVar.c = e;
            return i6;
        }
        throw InvalidProtocolBufferException.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(y0<?> y0Var, int i, byte[] bArr, int i2, int i3, y.i<?> iVar, b bVar) throws IOException {
        int p = p(y0Var, bArr, i2, i3, bVar);
        iVar.add(bVar.c);
        while (p < i3) {
            int I = I(bArr, p, bVar);
            if (i != bVar.a) {
                break;
            }
            p = p(y0Var, bArr, I, i3, bVar);
            iVar.add(bVar.c);
        }
        return p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(byte[] bArr, int i, y.i<?> iVar, b bVar) throws IOException {
        boolean z;
        g gVar = (g) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.a + I;
        while (I < i2) {
            I = L(bArr, I, bVar);
            if (bVar.b != 0) {
                z = true;
            } else {
                z = false;
            }
            gVar.h(z);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(byte[] bArr, int i, y.i<?> iVar, b bVar) throws IOException {
        l lVar = (l) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.a + I;
        while (I < i2) {
            lVar.g(d(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(byte[] bArr, int i, y.i<?> iVar, b bVar) throws IOException {
        x xVar = (x) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.a + I;
        while (I < i2) {
            xVar.S0(h(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(byte[] bArr, int i, y.i<?> iVar, b bVar) throws IOException {
        d0 d0Var = (d0) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.a + I;
        while (I < i2) {
            d0Var.h(j(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(byte[] bArr, int i, y.i<?> iVar, b bVar) throws IOException {
        u uVar = (u) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.a + I;
        while (I < i2) {
            uVar.g(l(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(byte[] bArr, int i, y.i<?> iVar, b bVar) throws IOException {
        x xVar = (x) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.a + I;
        while (I < i2) {
            I = I(bArr, I, bVar);
            xVar.S0(i.b(bVar.a));
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(byte[] bArr, int i, y.i<?> iVar, b bVar) throws IOException {
        d0 d0Var = (d0) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.a + I;
        while (I < i2) {
            I = L(bArr, I, bVar);
            d0Var.h(i.c(bVar.b));
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(byte[] bArr, int i, y.i<?> iVar, b bVar) throws IOException {
        x xVar = (x) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.a + I;
        while (I < i2) {
            I = I(bArr, I, bVar);
            xVar.S0(bVar.a);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(byte[] bArr, int i, y.i<?> iVar, b bVar) throws IOException {
        d0 d0Var = (d0) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.a + I;
        while (I < i2) {
            I = L(bArr, I, bVar);
            d0Var.h(bVar.b);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.m();
    }
}
