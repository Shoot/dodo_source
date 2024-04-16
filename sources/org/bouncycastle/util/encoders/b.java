package org.bouncycastle.util.encoders;

import java.io.ByteArrayOutputStream;
/* loaded from: classes3.dex */
public class b {
    private static final c a = new c();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.c(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException("exception decoding Hex string: " + e.getMessage(), e);
        }
    }

    public static byte[] b(String str) {
        try {
            return a.d(str, 0, str.length());
        } catch (Exception e) {
            throw new DecoderException("exception decoding Hex string: " + e.getMessage(), e);
        }
    }

    public static byte[] c(String str, int i, int i2) {
        try {
            return a.d(str, i, i2);
        } catch (Exception e) {
            throw new DecoderException("exception decoding Hex string: " + e.getMessage(), e);
        }
    }

    public static byte[] d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static byte[] e(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.b(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new EncoderException("exception encoding Hex string: " + e.getMessage(), e);
        }
    }

    public static String f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static String g(byte[] bArr, int i, int i2) {
        return a0b.b(e(bArr, i, i2));
    }
}
