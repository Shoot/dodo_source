package defpackage;

import com.google.crypto.tink.internal.TinkBugException;
import java.security.SecureRandom;
/* compiled from: Util.java */
/* renamed from: xub  reason: default package */
/* loaded from: classes2.dex */
public final class xub {
    public static Integer a() {
        return jh0.a();
    }

    public static int b() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    private static final byte c(char c) {
        if (c >= '!' && c <= '~') {
            return (byte) c;
        }
        throw new TinkBugException("Not a printable ASCII character: " + c);
    }

    public static final mk0 d(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bArr[i] = c(str.charAt(i));
        }
        return mk0.a(bArr);
    }
}
