package org.bouncycastle.util.encoders;

import java.io.ByteArrayOutputStream;
/* loaded from: classes3.dex */
public class a {
    private static final ah3 a = new t60();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            a.c(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException("unable to decode base64 string: " + e.getMessage(), e);
        }
    }

    public static byte[] b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    public static byte[] c(byte[] bArr, int i, int i2) {
        ah3 ah3Var = a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(ah3Var.a(i2));
        try {
            ah3Var.b(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new EncoderException("exception encoding base64 string: " + e.getMessage(), e);
        }
    }

    public static String d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static String e(byte[] bArr, int i, int i2) {
        return a0b.b(c(bArr, i, i2));
    }
}
