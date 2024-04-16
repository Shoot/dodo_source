package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.math.BigInteger;
/* loaded from: classes3.dex */
class GOSTUtil {
    GOSTUtil() {
    }

    private static String generateKeyFingerprint(BigInteger bigInteger, ib4 ib4Var) {
        return new gv3(tr.q(bigInteger.toByteArray(), ib4Var.b().toByteArray(), ib4Var.a().toByteArray())).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String privateKeyToString(String str, BigInteger bigInteger, ib4 ib4Var) {
        StringBuffer stringBuffer = new StringBuffer();
        String d = a0b.d();
        BigInteger modPow = ib4Var.a().modPow(bigInteger, ib4Var.b());
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [");
        stringBuffer.append(generateKeyFingerprint(modPow, ib4Var));
        stringBuffer.append("]");
        stringBuffer.append(d);
        stringBuffer.append("                  Y: ");
        stringBuffer.append(modPow.toString(16));
        stringBuffer.append(d);
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String publicKeyToString(String str, BigInteger bigInteger, ib4 ib4Var) {
        StringBuffer stringBuffer = new StringBuffer();
        String d = a0b.d();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [");
        stringBuffer.append(generateKeyFingerprint(bigInteger, ib4Var));
        stringBuffer.append("]");
        stringBuffer.append(d);
        stringBuffer.append("                 Y: ");
        stringBuffer.append(bigInteger.toString(16));
        stringBuffer.append(d);
        return stringBuffer.toString();
    }
}
