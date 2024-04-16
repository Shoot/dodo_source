package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public final class d2 {
    private static final Charset a = Charset.forName("US-ASCII");
    static final Charset b = Charset.forName("UTF-8");
    private static final Charset c = Charset.forName("ISO-8859-1");
    public static final byte[] d;
    private static final ByteBuffer e;
    private static final p1 f;

    static {
        byte[] bArr = new byte[0];
        d = bArr;
        e = ByteBuffer.wrap(bArr);
        f = p1.c(bArr, 0, bArr.length, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int c(boolean z) {
        if (z) {
            return 1231;
        }
        return 1237;
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        int a2 = a(length, bArr, 0, length);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T e(T t) {
        t.getClass();
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(h3d h3dVar) {
        if (h3dVar instanceof m0d) {
            m0d m0dVar = (m0d) h3dVar;
            return false;
        }
        return false;
    }

    public static String h(byte[] bArr) {
        return new String(bArr, b);
    }

    public static boolean i(byte[] bArr) {
        return f4.d(bArr);
    }
}
