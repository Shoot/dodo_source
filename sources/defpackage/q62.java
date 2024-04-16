package defpackage;
/* renamed from: q62  reason: default package */
/* loaded from: classes3.dex */
public class q62 extends n62 {
    public static boolean d(byte[] bArr, int i) {
        boolean z = false;
        for (int i2 = i; i2 != i + 8; i2++) {
            if (bArr[i2] != bArr[i2 + 8]) {
                z = true;
            }
        }
        return z;
    }

    public static boolean e(byte[] bArr, int i) {
        boolean z;
        boolean z2;
        int i2 = i;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            boolean z6 = true;
            if (i2 == i + 8) {
                break;
            }
            byte b = bArr[i2];
            byte b2 = bArr[i2 + 8];
            if (b != b2) {
                z = true;
            } else {
                z = false;
            }
            z3 |= z;
            byte b3 = bArr[i2 + 16];
            if (b != b3) {
                z2 = true;
            } else {
                z2 = false;
            }
            z4 |= z2;
            if (b2 == b3) {
                z6 = false;
            }
            z5 |= z6;
            i2++;
        }
        if (!z3 || !z4 || !z5) {
            return false;
        }
        return true;
    }

    public static boolean f(byte[] bArr, int i) {
        if (bArr.length == 16) {
            return d(bArr, i);
        }
        return e(bArr, i);
    }

    public static boolean g(byte[] bArr, int i, int i2) {
        while (i < i2) {
            if (n62.b(bArr, i)) {
                return true;
            }
            i += 8;
        }
        return false;
    }
}
