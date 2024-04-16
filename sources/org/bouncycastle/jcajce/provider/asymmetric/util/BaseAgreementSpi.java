package org.bouncycastle.jcajce.provider.asymmetric.util;

import ch.qos.logback.core.net.SyslogConstants;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.k;
/* loaded from: classes3.dex */
public abstract class BaseAgreementSpi extends KeyAgreementSpi {
    private static final Map<String, k> defaultOids;
    private static final Hashtable des;
    private static final Map<String, Integer> keySizes;
    private static final Map<String, String> nameTable;
    private static final Hashtable oids;
    protected final String kaAlgorithm;
    protected final q03 kdf;
    protected byte[] ukmParameters;

    static {
        HashMap hashMap = new HashMap();
        defaultOids = hashMap;
        HashMap hashMap2 = new HashMap();
        keySizes = hashMap2;
        HashMap hashMap3 = new HashMap();
        nameTable = hashMap3;
        Hashtable hashtable = new Hashtable();
        oids = hashtable;
        Hashtable hashtable2 = new Hashtable();
        des = hashtable2;
        Integer d = g65.d(64);
        Integer d2 = g65.d(128);
        Integer d3 = g65.d(192);
        Integer d4 = g65.d(256);
        hashMap2.put("DES", d);
        hashMap2.put("DESEDE", d3);
        hashMap2.put("BLOWFISH", d2);
        hashMap2.put("AES", d4);
        hashMap2.put(ms6.x.H(), d2);
        hashMap2.put(ms6.F.H(), d3);
        hashMap2.put(ms6.N.H(), d4);
        hashMap2.put(ms6.y.H(), d2);
        hashMap2.put(ms6.G.H(), d3);
        k kVar = ms6.O;
        hashMap2.put(kVar.H(), d4);
        hashMap2.put(ms6.A.H(), d2);
        hashMap2.put(ms6.I.H(), d3);
        hashMap2.put(ms6.Q.H(), d4);
        hashMap2.put(ms6.z.H(), d2);
        hashMap2.put(ms6.H.H(), d3);
        hashMap2.put(ms6.P.H(), d4);
        k kVar2 = ms6.B;
        hashMap2.put(kVar2.H(), d2);
        hashMap2.put(ms6.J.H(), d3);
        hashMap2.put(ms6.R.H(), d4);
        k kVar3 = ms6.D;
        hashMap2.put(kVar3.H(), d2);
        hashMap2.put(ms6.L.H(), d3);
        hashMap2.put(ms6.T.H(), d4);
        hashMap2.put(ms6.C.H(), d2);
        hashMap2.put(ms6.K.H(), d3);
        hashMap2.put(ms6.S.H(), d4);
        k kVar4 = os6.d;
        hashMap2.put(kVar4.H(), d2);
        k kVar5 = os6.e;
        hashMap2.put(kVar5.H(), d3);
        k kVar6 = os6.f;
        hashMap2.put(kVar6.H(), d4);
        k kVar7 = ae5.d;
        hashMap2.put(kVar7.H(), d2);
        k kVar8 = co7.L2;
        hashMap2.put(kVar8.H(), d3);
        k kVar9 = co7.w0;
        hashMap2.put(kVar9.H(), d3);
        k kVar10 = g47.e;
        hashMap2.put(kVar10.H(), d);
        k kVar11 = y22.f;
        hashMap2.put(kVar11.H(), d4);
        hashMap2.put(y22.d.H(), d4);
        hashMap2.put(y22.e.H(), d4);
        k kVar12 = co7.D0;
        hashMap2.put(kVar12.H(), g65.d(SyslogConstants.LOG_LOCAL4));
        k kVar13 = co7.F0;
        hashMap2.put(kVar13.H(), d4);
        k kVar14 = co7.G0;
        hashMap2.put(kVar14.H(), g65.d(384));
        k kVar15 = co7.H0;
        hashMap2.put(kVar15.H(), g65.d(512));
        hashMap.put("DESEDE", kVar9);
        hashMap.put("AES", kVar);
        k kVar16 = os6.c;
        hashMap.put("CAMELLIA", kVar16);
        k kVar17 = ae5.a;
        hashMap.put("SEED", kVar17);
        hashMap.put("DES", kVar10);
        hashMap3.put(pl6.u.H(), "CAST5");
        hashMap3.put(pl6.w.H(), "IDEA");
        hashMap3.put(pl6.z.H(), "Blowfish");
        hashMap3.put(pl6.A.H(), "Blowfish");
        hashMap3.put(pl6.B.H(), "Blowfish");
        hashMap3.put(pl6.C.H(), "Blowfish");
        hashMap3.put(g47.d.H(), "DES");
        hashMap3.put(kVar10.H(), "DES");
        hashMap3.put(g47.g.H(), "DES");
        hashMap3.put(g47.f.H(), "DES");
        hashMap3.put(g47.h.H(), "DESede");
        hashMap3.put(kVar9.H(), "DESede");
        hashMap3.put(kVar8.H(), "DESede");
        hashMap3.put(co7.M2.H(), "RC2");
        hashMap3.put(kVar12.H(), "HmacSHA1");
        hashMap3.put(co7.E0.H(), "HmacSHA224");
        hashMap3.put(kVar13.H(), "HmacSHA256");
        hashMap3.put(kVar14.H(), "HmacSHA384");
        hashMap3.put(kVar15.H(), "HmacSHA512");
        hashMap3.put(os6.a.H(), "Camellia");
        hashMap3.put(os6.b.H(), "Camellia");
        hashMap3.put(kVar16.H(), "Camellia");
        hashMap3.put(kVar4.H(), "Camellia");
        hashMap3.put(kVar5.H(), "Camellia");
        hashMap3.put(kVar6.H(), "Camellia");
        hashMap3.put(kVar7.H(), "SEED");
        hashMap3.put(kVar17.H(), "SEED");
        hashMap3.put(ae5.b.H(), "SEED");
        hashMap3.put(kVar11.H(), "GOST28147");
        hashMap3.put(kVar2.H(), "AES");
        hashMap3.put(kVar3.H(), "AES");
        hashMap3.put(kVar3.H(), "AES");
        hashtable.put("DESEDE", kVar9);
        hashtable.put("AES", kVar);
        hashtable.put("DES", kVar10);
        hashtable2.put("DES", "DES");
        hashtable2.put("DESEDE", "DES");
        hashtable2.put(kVar10.H(), "DES");
        hashtable2.put(kVar9.H(), "DES");
        hashtable2.put(kVar8.H(), "DES");
    }

    public BaseAgreementSpi(String str, q03 q03Var) {
        this.kaAlgorithm = str;
        this.kdf = q03Var;
    }

    protected static String getAlgorithm(String str) {
        if (str.indexOf(91) > 0) {
            return str.substring(0, str.indexOf(91));
        }
        if (str.startsWith(ms6.w.H())) {
            return "AES";
        }
        if (str.startsWith(sa4.i.H())) {
            return "Serpent";
        }
        String str2 = nameTable.get(a0b.j(str));
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    protected static int getKeySize(String str) {
        if (str.indexOf(91) > 0) {
            return Integer.parseInt(str.substring(str.indexOf(91) + 1, str.indexOf(93)));
        }
        String j = a0b.j(str);
        Map<String, Integer> map = keySizes;
        if (!map.containsKey(j)) {
            return -1;
        }
        return map.get(j).intValue();
    }

    private byte[] getSharedSecretBytes(byte[] bArr, String str, int i) throws NoSuchAlgorithmException {
        r03 rd5Var;
        q03 q03Var = this.kdf;
        if (q03Var != null) {
            if (i >= 0) {
                int i2 = i / 8;
                byte[] bArr2 = new byte[i2];
                if (q03Var instanceof z62) {
                    if (str != null) {
                        try {
                            rd5Var = new y62(new k(str), i, bArr, this.ukmParameters);
                        } catch (IllegalArgumentException unused) {
                            throw new NoSuchAlgorithmException("no OID for algorithm: " + str);
                        }
                    } else {
                        throw new NoSuchAlgorithmException("algorithm OID is null");
                    }
                } else {
                    rd5Var = new rd5(bArr, this.ukmParameters);
                }
                this.kdf.a(rd5Var);
                this.kdf.b(bArr2, 0, i2);
                tr.g(bArr);
                return bArr2;
            }
            throw new NoSuchAlgorithmException("unknown algorithm encountered: " + str);
        } else if (i > 0) {
            int i3 = i / 8;
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, 0, bArr3, 0, i3);
            tr.g(bArr);
            return bArr3;
        } else {
            return bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] trimZeroes(byte[] bArr) {
        if (bArr[0] != 0) {
            return bArr;
        }
        int i = 0;
        while (i < bArr.length && bArr[i] == 0) {
            i++;
        }
        int length = bArr.length - i;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i, bArr2, 0, length);
        return bArr2;
    }

    protected abstract byte[] calcSecret();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i) throws IllegalStateException, ShortBufferException {
        byte[] engineGenerateSecret = engineGenerateSecret();
        if (bArr.length - i >= engineGenerateSecret.length) {
            System.arraycopy(engineGenerateSecret, 0, bArr, i, engineGenerateSecret.length);
            return engineGenerateSecret.length;
        }
        throw new ShortBufferException(this.kaAlgorithm + " key agreement: need " + engineGenerateSecret.length + " bytes");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) throws NoSuchAlgorithmException {
        String j = a0b.j(str);
        Hashtable hashtable = oids;
        String H = hashtable.containsKey(j) ? ((k) hashtable.get(j)).H() : str;
        byte[] sharedSecretBytes = getSharedSecretBytes(calcSecret(), H, getKeySize(H));
        String algorithm = getAlgorithm(str);
        if (des.containsKey(algorithm)) {
            n62.c(sharedSecretBytes);
        }
        return new SecretKeySpec(sharedSecretBytes, algorithm);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() throws IllegalStateException {
        if (this.kdf != null) {
            byte[] calcSecret = calcSecret();
            try {
                return getSharedSecretBytes(calcSecret, null, calcSecret.length * 8);
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalStateException(e.getMessage());
            }
        }
        return calcSecret();
    }
}
