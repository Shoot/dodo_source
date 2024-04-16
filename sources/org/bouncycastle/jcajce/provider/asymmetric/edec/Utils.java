package org.bouncycastle.jcajce.provider.asymmetric.edec;

import org.bouncycastle.util.encoders.b;
/* loaded from: classes3.dex */
class Utils {
    Utils() {
    }

    private static String generateKeyFingerprint(byte[] bArr) {
        return new gv3(bArr).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isValidPrefix(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return !isValidPrefix(bArr, bArr);
        }
        int i = 0;
        for (int i2 = 0; i2 != bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String keyToString(String str, String str2, ux uxVar) {
        byte[] encoded;
        StringBuffer stringBuffer = new StringBuffer();
        String d = a0b.d();
        if (uxVar instanceof s9c) {
            encoded = ((s9c) uxVar).getEncoded();
        } else if (uxVar instanceof sc3) {
            encoded = ((sc3) uxVar).getEncoded();
        } else if (uxVar instanceof l9c) {
            encoded = ((l9c) uxVar).getEncoded();
        } else {
            encoded = ((mc3) uxVar).getEncoded();
        }
        stringBuffer.append(str2);
        stringBuffer.append(" ");
        stringBuffer.append(str);
        stringBuffer.append(" [");
        stringBuffer.append(generateKeyFingerprint(encoded));
        stringBuffer.append("]");
        stringBuffer.append(d);
        stringBuffer.append("    public data: ");
        stringBuffer.append(b.f(encoded));
        stringBuffer.append(d);
        return stringBuffer.toString();
    }
}
