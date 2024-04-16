package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
/* loaded from: classes3.dex */
public interface PBE {
    public static final int GOST3411 = 6;
    public static final int MD2 = 5;
    public static final int MD5 = 0;
    public static final int OPENSSL = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S1_UTF8 = 4;
    public static final int PKCS5S2 = 1;
    public static final int PKCS5S2_UTF8 = 5;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;
    public static final int SHA224 = 7;
    public static final int SHA256 = 4;
    public static final int SHA384 = 8;
    public static final int SHA3_224 = 10;
    public static final int SHA3_256 = 11;
    public static final int SHA3_384 = 12;
    public static final int SHA3_512 = 13;
    public static final int SHA512 = 9;
    public static final int SM3 = 14;
    public static final int TIGER = 3;

    /* loaded from: classes3.dex */
    public static class Util {
        private static byte[] convertPassword(int i, PBEKeySpec pBEKeySpec) {
            if (i == 2) {
                return ym7.a(pBEKeySpec.getPassword());
            }
            if (i != 5 && i != 4) {
                return ym7.b(pBEKeySpec.getPassword());
            }
            return ym7.c(pBEKeySpec.getPassword());
        }

        private static ym7 makePBEGenerator(int i, int i2) {
            if (i != 0 && i != 4) {
                if (i != 1 && i != 5) {
                    if (i == 2) {
                        switch (i2) {
                            case 0:
                                return new vn7(f23.a());
                            case 1:
                                return new vn7(f23.b());
                            case 2:
                                return new vn7(new d39());
                            case 3:
                                return new vn7(new wfb());
                            case 4:
                                return new vn7(f23.d());
                            case 5:
                                return new vn7(new o36());
                            case 6:
                                return new vn7(new vb4());
                            case 7:
                                return new vn7(f23.c());
                            case 8:
                                return new vn7(f23.e());
                            case 9:
                                return new vn7(f23.j());
                            default:
                                throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                        }
                    }
                    return new sa7();
                }
                switch (i2) {
                    case 0:
                        return new zn7(f23.a());
                    case 1:
                        return new zn7(f23.b());
                    case 2:
                        return new zn7(new d39());
                    case 3:
                        return new zn7(new wfb());
                    case 4:
                        return new zn7(f23.d());
                    case 5:
                        return new zn7(new o36());
                    case 6:
                        return new zn7(new vb4());
                    case 7:
                        return new zn7(f23.c());
                    case 8:
                        return new zn7(f23.e());
                    case 9:
                        return new zn7(f23.j());
                    case 10:
                        return new zn7(f23.f());
                    case 11:
                        return new zn7(f23.g());
                    case 12:
                        return new zn7(f23.h());
                    case 13:
                        return new zn7(f23.i());
                    case 14:
                        return new zn7(new sq9());
                    default:
                        throw new IllegalStateException("unknown digest scheme for PBE PKCS5S2 encryption.");
                }
            } else if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 5) {
                        return new yn7(new o36());
                    }
                    throw new IllegalStateException("PKCS5 scheme 1 only supports MD2, MD5 and SHA1.");
                }
                return new yn7(f23.b());
            } else {
                return new yn7(f23.a());
            }
        }

        public static v71 makePBEMacParameters(SecretKey secretKey, int i, int i2, int i3, PBEParameterSpec pBEParameterSpec) {
            ym7 makePBEGenerator = makePBEGenerator(i, i2);
            byte[] encoded = secretKey.getEncoded();
            makePBEGenerator.g(secretKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            v71 d = makePBEGenerator.d(i3);
            for (int i4 = 0; i4 != encoded.length; i4++) {
                encoded[i4] = 0;
            }
            return d;
        }

        public static v71 makePBEParameters(PBEKeySpec pBEKeySpec, int i, int i2, int i3, int i4) {
            ym7 makePBEGenerator = makePBEGenerator(i, i2);
            byte[] convertPassword = convertPassword(i, pBEKeySpec);
            makePBEGenerator.g(convertPassword, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            v71 f = i4 != 0 ? makePBEGenerator.f(i3, i4) : makePBEGenerator.e(i3);
            for (int i5 = 0; i5 != convertPassword.length; i5++) {
                convertPassword[i5] = 0;
            }
            return f;
        }

        public static v71 makePBEMacParameters(PBEKeySpec pBEKeySpec, int i, int i2, int i3) {
            ym7 makePBEGenerator = makePBEGenerator(i, i2);
            byte[] convertPassword = convertPassword(i, pBEKeySpec);
            makePBEGenerator.g(convertPassword, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            v71 d = makePBEGenerator.d(i3);
            for (int i4 = 0; i4 != convertPassword.length; i4++) {
                convertPassword[i4] = 0;
            }
            return d;
        }

        public static v71 makePBEParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, String str) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            ym7 makePBEGenerator = makePBEGenerator(bCPBEKey.getType(), bCPBEKey.getDigest());
            byte[] encoded = bCPBEKey.getEncoded();
            if (bCPBEKey.shouldTryWrongPKCS12()) {
                encoded = new byte[2];
            }
            makePBEGenerator.g(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            v71 f = bCPBEKey.getIvSize() != 0 ? makePBEGenerator.f(bCPBEKey.getKeySize(), bCPBEKey.getIvSize()) : makePBEGenerator.e(bCPBEKey.getKeySize());
            if (str.startsWith("DES")) {
                if (f instanceof pq7) {
                    n62.c(((lf5) ((pq7) f).b()).a());
                } else {
                    n62.c(((lf5) f).a());
                }
            }
            return f;
        }

        public static v71 makePBEMacParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            ym7 makePBEGenerator = makePBEGenerator(bCPBEKey.getType(), bCPBEKey.getDigest());
            makePBEGenerator.g(bCPBEKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            return makePBEGenerator.d(bCPBEKey.getKeySize());
        }

        public static v71 makePBEParameters(byte[] bArr, int i, int i2, int i3, int i4, AlgorithmParameterSpec algorithmParameterSpec, String str) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidAlgorithmParameterException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            ym7 makePBEGenerator = makePBEGenerator(i, i2);
            makePBEGenerator.g(bArr, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            v71 f = i4 != 0 ? makePBEGenerator.f(i3, i4) : makePBEGenerator.e(i3);
            if (str.startsWith("DES")) {
                if (f instanceof pq7) {
                    n62.c(((lf5) ((pq7) f).b()).a());
                } else {
                    n62.c(((lf5) f).a());
                }
            }
            return f;
        }
    }
}
