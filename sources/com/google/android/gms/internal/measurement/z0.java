package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public final class z0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static double a(byte[] bArr, int i) {
        return Double.longBitsToDouble(r(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, byte[] bArr, int i2, int i3, c1 c1Var) throws zzjq {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzjq.b();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = p(bArr, i2, c1Var);
                            i6 = c1Var.a;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = b(i6, bArr, i2, i3, c1Var);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw zzjq.e();
                    }
                    return p(bArr, i2, c1Var) + c1Var.a;
                }
                return i2 + 8;
            }
            return q(bArr, i2, c1Var);
        }
        throw zzjq.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i, byte[] bArr, int i2, int i3, a4 a4Var, c1 c1Var) throws zzjq {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                a4Var.e(i, Integer.valueOf(o(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzjq.b();
                        }
                        a4 l = a4.l();
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int p = p(bArr, i2, c1Var);
                            int i7 = c1Var.a;
                            i6 = i7;
                            if (i7 != i5) {
                                int c = c(i6, bArr, p, i3, l, c1Var);
                                i6 = i7;
                                i2 = c;
                            } else {
                                i2 = p;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            a4Var.e(i, l);
                            return i2;
                        }
                        throw zzjq.e();
                    }
                    int p2 = p(bArr, i2, c1Var);
                    int i8 = c1Var.a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - p2) {
                            if (i8 == 0) {
                                a4Var.e(i, d1.b);
                            } else {
                                a4Var.e(i, d1.x(bArr, p2, i8));
                            }
                            return p2 + i8;
                        }
                        throw zzjq.f();
                    }
                    throw zzjq.d();
                }
                a4Var.e(i, Long.valueOf(r(bArr, i2)));
                return i2 + 8;
            }
            int q = q(bArr, i2, c1Var);
            a4Var.e(i, Long.valueOf(c1Var.b));
            return q;
        }
        throw zzjq.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i, byte[] bArr, int i2, int i3, o2d<?> o2dVar, c1 c1Var) {
        e2 e2Var = (e2) o2dVar;
        int p = p(bArr, i2, c1Var);
        e2Var.g(c1Var.a);
        while (p < i3) {
            int p2 = p(bArr, p, c1Var);
            if (i != c1Var.a) {
                break;
            }
            p = p(bArr, p2, c1Var);
            e2Var.g(c1Var.a);
        }
        return p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i, byte[] bArr, int i2, c1 c1Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c1Var.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c1Var.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c1Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c1Var.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c1Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(j3<?> j3Var, int i, byte[] bArr, int i2, int i3, o2d<?> o2dVar, c1 c1Var) throws IOException {
        int h = h(j3Var, bArr, i2, i3, c1Var);
        o2dVar.add(c1Var.c);
        while (h < i3) {
            int p = p(bArr, h, c1Var);
            if (i != c1Var.a) {
                break;
            }
            h = h(j3Var, bArr, p, i3, c1Var);
            o2dVar.add(c1Var.c);
        }
        return h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(j3 j3Var, byte[] bArr, int i, int i2, int i3, c1 c1Var) throws IOException {
        Object zza = j3Var.zza();
        int i4 = i(zza, j3Var, bArr, i, i2, i3, c1Var);
        j3Var.c(zza);
        c1Var.c = zza;
        return i4;
    }

    static int h(j3 j3Var, byte[] bArr, int i, int i2, c1 c1Var) throws IOException {
        Object zza = j3Var.zza();
        int j = j(zza, j3Var, bArr, i, i2, c1Var);
        j3Var.c(zza);
        c1Var.c = zza;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(Object obj, j3 j3Var, byte[] bArr, int i, int i2, int i3, c1 c1Var) throws IOException {
        int l = ((z2) j3Var).l(obj, bArr, i, i2, i3, c1Var);
        c1Var.c = obj;
        return l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(Object obj, j3 j3Var, byte[] bArr, int i, int i2, c1 c1Var) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = e(i4, bArr, i3, c1Var);
            i4 = c1Var.a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = i4 + i5;
            j3Var.f(obj, bArr, i5, i6, c1Var);
            c1Var.c = obj;
            return i6;
        }
        throw zzjq.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(byte[] bArr, int i, c1 c1Var) throws zzjq {
        int p = p(bArr, i, c1Var);
        int i2 = c1Var.a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - p) {
                if (i2 == 0) {
                    c1Var.c = d1.b;
                    return p;
                }
                c1Var.c = d1.x(bArr, p, i2);
                return p + i2;
            }
            throw zzjq.f();
        }
        throw zzjq.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(byte[] bArr, int i, o2d<?> o2dVar, c1 c1Var) throws IOException {
        e2 e2Var = (e2) o2dVar;
        int p = p(bArr, i, c1Var);
        int i2 = c1Var.a + p;
        while (p < i2) {
            p = p(bArr, p, c1Var);
            e2Var.g(c1Var.a);
        }
        if (p == i2) {
            return p;
        }
        throw zzjq.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float m(byte[] bArr, int i) {
        return Float.intBitsToFloat(o(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(byte[] bArr, int i, c1 c1Var) throws zzjq {
        int p = p(bArr, i, c1Var);
        int i2 = c1Var.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c1Var.c = "";
                return p;
            }
            c1Var.c = f4.e(bArr, p, i2);
            return p + i2;
        }
        throw zzjq.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(byte[] bArr, int i, c1 c1Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c1Var.a = b;
            return i2;
        }
        return e(b, bArr, i2, c1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(byte[] bArr, int i, c1 c1Var) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c1Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        c1Var.b = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long r(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
