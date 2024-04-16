package defpackage;

import android.annotation.SuppressLint;
/* renamed from: s70  reason: default package */
/* loaded from: classes3.dex */
public class s70 {
    private static final String a = "BaseKeyUtil";

    private static int a(int i, int i2, int i3) {
        if (i2 < i) {
            i = i2;
        }
        if (i3 >= i) {
            return i;
        }
        return i3;
    }

    private static boolean b(int i) {
        if (i >= 16) {
            return true;
        }
        return false;
    }

    private static boolean c(int i, byte[] bArr) {
        return b(i) & d(bArr);
    }

    private static boolean d(byte[] bArr) {
        if (bArr.length >= 16) {
            return true;
        }
        return false;
    }

    public static byte[] e(String str, String str2, String str3, String str4, int i, boolean z) {
        return g(str, str2, str3, jo4.b(str4), i, z);
    }

    public static byte[] f(String str, String str2, String str3, byte[] bArr, int i, int i2, boolean z) {
        byte[] b = jo4.b(str);
        byte[] b2 = jo4.b(str2);
        byte[] b3 = jo4.b(str3);
        int a2 = a(b.length, b2.length, b3.length);
        if (c(a2, bArr)) {
            char[] cArr = new char[a2];
            for (int i3 = 0; i3 < a2; i3++) {
                cArr[i3] = (char) ((b[i3] ^ b2[i3]) ^ b3[i3]);
            }
            if (!z) {
                jec.d(a, "exportRootKey: sha1");
                return cn7.b(cArr, bArr, i, i2 * 8);
            }
            jec.d(a, "exportRootKey: sha256");
            return cn7.c(cArr, bArr, i, i2 * 8);
        }
        throw new IllegalArgumentException("key length must be more than 128bit.");
    }

    @SuppressLint({"NewApi"})
    public static byte[] g(String str, String str2, String str3, byte[] bArr, int i, boolean z) {
        return f(str, str2, str3, bArr, 10000, i, z);
    }

    @SuppressLint({"NewApi"})
    public static byte[] h(String str, String str2, String str3, byte[] bArr, boolean z) {
        return g(str, str2, str3, bArr, 16, z);
    }
}
