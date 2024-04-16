package org.bouncycastle.jcajce.provider.asymmetric.util;
/* loaded from: classes3.dex */
public class KeyUtil {
    public static byte[] getEncodedPrivateKeyInfo(eb ebVar, h0 h0Var) {
        try {
            return getEncodedPrivateKeyInfo(new dk8(ebVar, h0Var.f()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(eb ebVar, h0 h0Var) {
        try {
            return getEncodedSubjectPublicKeyInfo(new b1b(ebVar, h0Var));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedPrivateKeyInfo(dk8 dk8Var) {
        try {
            return dk8Var.p("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(eb ebVar, byte[] bArr) {
        try {
            return getEncodedSubjectPublicKeyInfo(new b1b(ebVar, bArr));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(b1b b1bVar) {
        try {
            return b1bVar.p("DER");
        } catch (Exception unused) {
            return null;
        }
    }
}
