package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.k;
import org.bouncycastle.openssl.EncryptionException;
import org.bouncycastle.openssl.PEMException;
/* renamed from: on7  reason: default package */
/* loaded from: classes3.dex */
class on7 {
    private static final Map a;
    private static final Set b;
    private static final Set c;
    private static final Map d;
    private static final Map e;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashSet hashSet = new HashSet();
        b = hashSet;
        HashSet hashSet2 = new HashSet();
        c = hashSet2;
        HashMap hashMap2 = new HashMap();
        d = hashMap2;
        HashMap hashMap3 = new HashMap();
        e = hashMap3;
        hashSet.add(co7.n0);
        hashSet.add(co7.o0);
        hashSet.add(co7.p0);
        hashSet.add(co7.q0);
        hashSet.add(co7.r0);
        hashSet.add(co7.s0);
        hashSet2.add(co7.t0);
        k kVar = co7.w0;
        hashSet2.add(kVar);
        k kVar2 = ms6.y;
        hashSet2.add(kVar2);
        k kVar3 = ms6.G;
        hashSet2.add(kVar3);
        k kVar4 = ms6.O;
        hashSet2.add(kVar4);
        hashMap.put(kVar.H(), g65.d(192));
        hashMap.put(kVar2.H(), g65.d(128));
        hashMap.put(kVar3.H(), g65.d(192));
        hashMap.put(kVar4.H(), g65.d(256));
        hashMap.put(co7.E2.H(), g65.d(128));
        hashMap.put(co7.F2, g65.d(40));
        hashMap.put(co7.H2, g65.d(128));
        hashMap.put(co7.G2, g65.d(192));
        hashMap.put(co7.I2, g65.d(128));
        hashMap.put(co7.J2, g65.d(40));
        k kVar5 = co7.D0;
        hashMap2.put(kVar5, "PBKDF2withHMACSHA1");
        k kVar6 = co7.F0;
        hashMap2.put(kVar6, "PBKDF2withHMACSHA256");
        k kVar7 = co7.H0;
        hashMap2.put(kVar7, "PBKDF2withHMACSHA512");
        k kVar8 = co7.E0;
        hashMap2.put(kVar8, "PBKDF2withHMACSHA224");
        k kVar9 = co7.G0;
        hashMap2.put(kVar9, "PBKDF2withHMACSHA384");
        k kVar10 = ms6.o;
        hashMap2.put(kVar10, "PBKDF2withHMACSHA3-224");
        k kVar11 = ms6.p;
        hashMap2.put(kVar11, "PBKDF2withHMACSHA3-256");
        k kVar12 = ms6.q;
        hashMap2.put(kVar12, "PBKDF2withHMACSHA3-384");
        k kVar13 = ms6.r;
        hashMap2.put(kVar13, "PBKDF2withHMACSHA3-512");
        k kVar14 = y22.c;
        hashMap2.put(kVar14, "PBKDF2withHMACGOST3411");
        hashMap3.put(kVar5, g65.d(20));
        hashMap3.put(kVar6, g65.d(32));
        hashMap3.put(kVar7, g65.d(64));
        hashMap3.put(kVar8, g65.d(28));
        hashMap3.put(kVar9, g65.d(48));
        hashMap3.put(kVar10, g65.d(28));
        hashMap3.put(kVar11, g65.d(32));
        hashMap3.put(kVar12, g65.d(48));
        hashMap3.put(kVar13, g65.d(64));
        hashMap3.put(kVar14, g65.d(32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a(boolean z, d95 d95Var, byte[] bArr, char[] cArr, String str, byte[] bArr2) throws PEMException {
        String str2;
        String str3;
        String str4;
        String str5;
        byte[] bArr3;
        String str6;
        SecretKey b2;
        RC2ParameterSpec rC2ParameterSpec;
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        if (str.endsWith("-CFB")) {
            str2 = "CFB";
            str3 = "NoPadding";
        } else {
            str2 = "CBC";
            str3 = "PKCS5Padding";
        }
        if (str.endsWith("-ECB") || "DES-EDE".equals(str) || "DES-EDE3".equals(str)) {
            str2 = "ECB";
            ivParameterSpec = null;
        }
        RC2ParameterSpec rC2ParameterSpec2 = ivParameterSpec;
        if (str.endsWith("-OFB")) {
            str5 = "OFB";
            str4 = "NoPadding";
        } else {
            str4 = str3;
            str5 = str2;
        }
        int i = 1;
        if (str.startsWith("DES-EDE")) {
            str6 = "DESede";
            b2 = c(d95Var, cArr, "DESede", 24, bArr2, !str.startsWith("DES-EDE3"));
        } else if (str.startsWith("DES-")) {
            str6 = "DES";
            b2 = b(d95Var, cArr, "DES", 8, bArr2);
        } else if (str.startsWith("BF-")) {
            str6 = "Blowfish";
            b2 = b(d95Var, cArr, "Blowfish", 16, bArr2);
        } else {
            int i2 = 128;
            if (str.startsWith("RC2-")) {
                if (str.startsWith("RC2-40-")) {
                    i2 = 40;
                } else if (str.startsWith("RC2-64-")) {
                    i2 = 64;
                }
                str6 = "RC2";
                b2 = b(d95Var, cArr, "RC2", i2 / 8, bArr2);
                if (rC2ParameterSpec2 == null) {
                    rC2ParameterSpec = new RC2ParameterSpec(i2);
                } else {
                    rC2ParameterSpec = new RC2ParameterSpec(i2, bArr2);
                }
                rC2ParameterSpec2 = rC2ParameterSpec;
            } else if (str.startsWith("AES-")) {
                if (bArr2.length > 8) {
                    bArr3 = new byte[8];
                    System.arraycopy(bArr2, 0, bArr3, 0, 8);
                } else {
                    bArr3 = bArr2;
                }
                if (!str.startsWith("AES-128-")) {
                    if (str.startsWith("AES-192-")) {
                        i2 = 192;
                    } else if (str.startsWith("AES-256-")) {
                        i2 = 256;
                    } else {
                        throw new EncryptionException("unknown AES encryption with private key");
                    }
                }
                str6 = "AES";
                b2 = b(d95Var, cArr, "AES", i2 / 8, bArr3);
            } else {
                throw new EncryptionException("unknown encryption with private key");
            }
        }
        try {
            Cipher a2 = d95Var.a(str6 + "/" + str5 + "/" + str4);
            if (!z) {
                i = 2;
            }
            if (rC2ParameterSpec2 == null) {
                a2.init(i, b2);
            } else {
                a2.init(i, b2, rC2ParameterSpec2);
            }
            return a2.doFinal(bArr);
        } catch (Exception e2) {
            throw new EncryptionException("exception using cipher - please check password and data.", e2);
        }
    }

    private static SecretKey b(d95 d95Var, char[] cArr, String str, int i, byte[] bArr) throws PEMException {
        return c(d95Var, cArr, str, i, bArr, false);
    }

    private static SecretKey c(d95 d95Var, char[] cArr, String str, int i, byte[] bArr, boolean z) throws PEMException {
        try {
            byte[] encoded = d95Var.c("PBKDF-OpenSSL").generateSecret(new PBEKeySpec(cArr, bArr, 1, i * 8)).getEncoded();
            if (z && encoded.length >= 24) {
                System.arraycopy(encoded, 0, encoded, 16, 8);
            }
            return new SecretKeySpec(encoded, str);
        } catch (GeneralSecurityException e2) {
            throw new PEMException("Unable to create OpenSSL PBDKF: " + e2.getMessage(), e2);
        }
    }
}
