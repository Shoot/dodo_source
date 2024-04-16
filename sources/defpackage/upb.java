package defpackage;
/* renamed from: upb  reason: default package */
/* loaded from: classes3.dex */
public class upb {
    private static final short[] a = new short[128];
    private static final byte[] b;

    static {
        byte[] bArr = new byte[112];
        b = bArr;
        byte[] bArr2 = new byte[128];
        a(bArr2, 0, 15, (byte) 1);
        a(bArr2, 16, 31, (byte) 2);
        a(bArr2, 32, 63, (byte) 3);
        a(bArr2, 64, 65, (byte) 0);
        a(bArr2, 66, 95, (byte) 4);
        a(bArr2, 96, 96, (byte) 5);
        a(bArr2, 97, 108, (byte) 6);
        a(bArr2, 109, 109, (byte) 7);
        a(bArr2, 110, 111, (byte) 6);
        a(bArr2, 112, 112, (byte) 8);
        a(bArr2, 113, 115, (byte) 9);
        a(bArr2, 116, 116, (byte) 10);
        a(bArr2, 117, 127, (byte) 0);
        a(bArr, 0, bArr.length - 1, (byte) -2);
        a(bArr, 8, 11, (byte) -1);
        a(bArr, 24, 27, (byte) 0);
        a(bArr, 40, 43, (byte) 16);
        a(bArr, 58, 59, (byte) 0);
        a(bArr, 72, 73, (byte) 0);
        a(bArr, 89, 91, (byte) 16);
        a(bArr, 104, 104, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96};
        for (int i = 0; i < 128; i++) {
            byte b2 = bArr2[i];
            a[i] = (short) (bArr4[b2] | ((bArr3[b2] & i) << 8));
        }
    }

    private static void a(byte[] bArr, int i, int i2, byte b2) {
        while (i <= i2) {
            bArr[i] = b2;
            i++;
        }
    }

    public static int b(byte[] bArr, char[] cArr) {
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                if (i2 >= cArr.length) {
                    return -1;
                }
                cArr[i2] = (char) b2;
                i = i3;
                i2++;
            } else {
                short s = a[b2 & Byte.MAX_VALUE];
                int i4 = s >>> 8;
                byte b3 = (byte) s;
                while (b3 >= 0) {
                    if (i3 >= bArr.length) {
                        return -1;
                    }
                    int i5 = i3 + 1;
                    byte b4 = bArr[i3];
                    i4 = (i4 << 6) | (b4 & 63);
                    b3 = b[b3 + ((b4 & 255) >>> 4)];
                    i3 = i5;
                }
                if (b3 == -2) {
                    return -1;
                }
                if (i4 <= 65535) {
                    if (i2 >= cArr.length) {
                        return -1;
                    }
                    cArr[i2] = (char) i4;
                    i2++;
                } else if (i2 >= cArr.length - 1) {
                    return -1;
                } else {
                    int i6 = i2 + 1;
                    cArr[i2] = (char) ((i4 >>> 10) + 55232);
                    i2 += 2;
                    cArr[i6] = (char) ((i4 & 1023) | 56320);
                }
                i = i3;
            }
        }
        return i2;
    }
}
