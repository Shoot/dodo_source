package org.bouncycastle.jcajce.provider.asymmetric.util;
/* loaded from: classes3.dex */
public class IESUtil {
    public static pr4 guessParameterSpec(ch0 ch0Var, byte[] bArr) {
        if (ch0Var == null) {
            return new pr4(null, null, 128);
        }
        xc0 d = ch0Var.d();
        if (!d.getAlgorithmName().equals("DES") && !d.getAlgorithmName().equals("RC2") && !d.getAlgorithmName().equals("RC5-32") && !d.getAlgorithmName().equals("RC5-64")) {
            if (d.getAlgorithmName().equals("SKIPJACK")) {
                return new pr4(null, null, 80, 80, bArr);
            }
            if (d.getAlgorithmName().equals("GOST28147")) {
                return new pr4(null, null, 256, 256, bArr);
            }
            return new pr4(null, null, 128, 128, bArr);
        }
        return new pr4(null, null, 64, 64, bArr);
    }
}
