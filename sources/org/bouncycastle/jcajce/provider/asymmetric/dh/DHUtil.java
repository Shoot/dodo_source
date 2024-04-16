package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
/* loaded from: classes3.dex */
class DHUtil {
    DHUtil() {
    }

    private static String generateKeyFingerprint(BigInteger bigInteger, h72 h72Var) {
        return new gv3(tr.q(bigInteger.toByteArray(), h72Var.f().toByteArray(), h72Var.b().toByteArray())).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String privateKeyToString(String str, BigInteger bigInteger, h72 h72Var) {
        StringBuffer stringBuffer = new StringBuffer();
        String d = a0b.d();
        BigInteger modPow = h72Var.b().modPow(bigInteger, h72Var.f());
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [");
        stringBuffer.append(generateKeyFingerprint(modPow, h72Var));
        stringBuffer.append("]");
        stringBuffer.append(d);
        stringBuffer.append("              Y: ");
        stringBuffer.append(modPow.toString(16));
        stringBuffer.append(d);
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String publicKeyToString(String str, BigInteger bigInteger, h72 h72Var) {
        StringBuffer stringBuffer = new StringBuffer();
        String d = a0b.d();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [");
        stringBuffer.append(generateKeyFingerprint(bigInteger, h72Var));
        stringBuffer.append("]");
        stringBuffer.append(d);
        stringBuffer.append("             Y: ");
        stringBuffer.append(bigInteger.toString(16));
        stringBuffer.append(d);
        return stringBuffer.toString();
    }
}
