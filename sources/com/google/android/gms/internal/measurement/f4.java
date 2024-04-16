package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class f4 {
    private static final g4 a;

    static {
        if (e4.w()) {
            e4.z();
        }
        a = new j4();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new i4(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(String str, byte[] bArr, int i, int i2) {
        return a.b(str, bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int c(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    byte b2 = bArr[i];
                    byte b3 = bArr[i + 1];
                    if (b > -12 || b2 > -65 || b3 > -65) {
                        return -1;
                    }
                    return (b3 << 16) ^ ((b2 << 8) ^ b);
                }
                throw new AssertionError();
            }
            byte b4 = bArr[i];
            if (b > -12 || b4 > -65) {
                return -1;
            }
            return (b4 << 8) ^ b;
        } else if (b > -12) {
            return -1;
        } else {
            return b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(byte[] bArr) {
        return a.d(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(byte[] bArr, int i, int i2) throws zzjq {
        return a.c(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(byte[] bArr, int i, int i2) {
        return a.d(bArr, i, i2);
    }
}
