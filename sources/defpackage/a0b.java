package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
/* renamed from: a0b  reason: default package */
/* loaded from: classes3.dex */
public final class a0b {
    private static String a;

    /* renamed from: a0b$a */
    /* loaded from: classes3.dex */
    static class a implements PrivilegedAction<String> {
        a() {
        }

        @Override // java.security.PrivilegedAction
        /* renamed from: a */
        public String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            try {
                a = (String) AccessController.doPrivileged(new a());
            } catch (Exception unused) {
                a = String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
            a = "\n";
        }
    }

    public static char[] a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    public static String b(byte[] bArr) {
        return new String(a(bArr));
    }

    public static String c(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int b = upb.b(bArr, cArr);
        if (b >= 0) {
            return new String(cArr, 0, b);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    public static String d() {
        return a;
    }

    public static byte[] e(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static String f(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) (c + ' ');
                z = true;
            }
        }
        if (z) {
            return new String(charArray);
        }
        return str;
    }

    public static void g(char[] cArr, OutputStream outputStream) throws IOException {
        int i;
        char c;
        int i2 = 0;
        while (i2 < cArr.length) {
            char c2 = cArr[i2];
            char c3 = c2;
            if (c2 >= 128) {
                if (c2 < 2048) {
                    i = (c2 >> 6) | 192;
                } else if (c2 >= 55296 && c2 <= 57343) {
                    i2++;
                    if (i2 < cArr.length) {
                        char c4 = cArr[i2];
                        if (c2 <= 56319) {
                            int i3 = (((c2 & 1023) << 10) | (c4 & 1023)) + 65536;
                            outputStream.write((i3 >> 18) | 240);
                            outputStream.write(((i3 >> 12) & 63) | 128);
                            outputStream.write(((i3 >> 6) & 63) | 128);
                            c = i3;
                            c3 = (c & 63) | 128;
                        } else {
                            throw new IllegalStateException("invalid UTF-16 codepoint");
                        }
                    } else {
                        throw new IllegalStateException("invalid UTF-16 codepoint");
                    }
                } else {
                    outputStream.write((c2 >> '\f') | 224);
                    i = ((c2 >> 6) & 63) | 128;
                }
                outputStream.write(i);
                c = c2;
                c3 = (c & 63) | 128;
            }
            outputStream.write(c3);
            i2++;
        }
    }

    public static byte[] h(String str) {
        return i(str.toCharArray());
    }

    public static byte[] i(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            g(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }

    public static String j(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) (c - ' ');
                z = true;
            }
        }
        if (z) {
            return new String(charArray);
        }
        return str;
    }
}
