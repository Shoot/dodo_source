package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.math.BigInteger;
import java.security.AccessController;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Enumeration;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
/* loaded from: classes3.dex */
public class ECUtil {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] convertMidTerms(int[] iArr) {
        int i;
        int[] iArr2 = new int[3];
        if (iArr.length == 1) {
            iArr2[0] = iArr[0];
        } else if (iArr.length == 3) {
            int i2 = iArr[0];
            int i3 = iArr[1];
            if (i2 < i3 && i2 < (i = iArr[2])) {
                iArr2[0] = i2;
                if (i3 < i) {
                    iArr2[1] = i3;
                    iArr2[2] = i;
                } else {
                    iArr2[1] = i;
                    iArr2[2] = iArr[1];
                }
            } else {
                int i4 = iArr[2];
                if (i3 < i4) {
                    iArr2[0] = i3;
                    int i5 = iArr[0];
                    if (i5 < i4) {
                        iArr2[1] = i5;
                        iArr2[2] = i4;
                    } else {
                        iArr2[1] = i4;
                        iArr2[2] = i5;
                    }
                } else {
                    iArr2[0] = i4;
                    int i6 = iArr[0];
                    if (i6 < i3) {
                        iArr2[1] = i6;
                        iArr2[2] = iArr[1];
                    } else {
                        iArr2[1] = i3;
                        iArr2[2] = i6;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
        }
        return iArr2;
    }

    public static String generateKeyFingerprint(jb3 jb3Var, ib3 ib3Var) {
        ea3 a = ib3Var.a();
        jb3 b = ib3Var.b();
        if (a != null) {
            return new gv3(tr.r(jb3Var.l(false), a.n().e(), a.o().e(), b.l(false))).toString();
        }
        return new gv3(jb3Var.l(false)).toString();
    }

    public static ux generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof lb3) {
            lb3 lb3Var = (lb3) privateKey;
            ib3 parameters = lb3Var.getParameters();
            if (parameters == null) {
                parameters = ff0.b.getEcImplicitlyCa();
            }
            if (lb3Var.getParameters() instanceof eb3) {
                return new nb3(lb3Var.getD(), new hb3(gb3.f(((eb3) lb3Var.getParameters()).f()), parameters.a(), parameters.b(), parameters.d(), parameters.c(), parameters.e()));
            }
            return new nb3(lb3Var.getD(), new la3(parameters.a(), parameters.b(), parameters.d(), parameters.c(), parameters.e()));
        } else if (privateKey instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) privateKey;
            ib3 convertSpec = EC5Util.convertSpec(eCPrivateKey.getParams());
            return new nb3(eCPrivateKey.getS(), new la3(convertSpec.a(), convertSpec.b(), convertSpec.d(), convertSpec.c(), convertSpec.e()));
        } else {
            try {
                byte[] encoded = privateKey.getEncoded();
                if (encoded != null) {
                    PrivateKey d = ff0.d(dk8.u(encoded));
                    if (d instanceof ECPrivateKey) {
                        return generatePrivateKeyParameter(d);
                    }
                    throw new InvalidKeyException("can't identify EC private key.");
                }
                throw new InvalidKeyException("no encoding for EC private key");
            } catch (Exception e) {
                throw new InvalidKeyException("cannot identify EC private key: " + e.toString());
            }
        }
    }

    public static ux generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof pb3) {
            pb3 pb3Var = (pb3) publicKey;
            ib3 parameters = pb3Var.getParameters();
            return new qb3(pb3Var.getQ(), new la3(parameters.a(), parameters.b(), parameters.d(), parameters.c(), parameters.e()));
        } else if (publicKey instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            ib3 convertSpec = EC5Util.convertSpec(eCPublicKey.getParams());
            return new qb3(EC5Util.convertPoint(eCPublicKey.getParams(), eCPublicKey.getW()), new la3(convertSpec.a(), convertSpec.b(), convertSpec.d(), convertSpec.c(), convertSpec.e()));
        } else {
            try {
                byte[] encoded = publicKey.getEncoded();
                if (encoded != null) {
                    PublicKey e = ff0.e(b1b.u(encoded));
                    if (e instanceof ECPublicKey) {
                        return generatePublicKeyParameter(e);
                    }
                    throw new InvalidKeyException("cannot identify EC public key.");
                }
                throw new InvalidKeyException("no encoding for EC public key");
            } catch (Exception e2) {
                throw new InvalidKeyException("cannot identify EC public key: " + e2.toString());
            }
        }
    }

    public static String getCurveName(k kVar) {
        return gb3.d(kVar);
    }

    public static la3 getDomainParameters(ProviderConfiguration providerConfiguration, ib3 ib3Var) {
        if (ib3Var instanceof eb3) {
            eb3 eb3Var = (eb3) ib3Var;
            return new hb3(getNamedCurveOid(eb3Var.f()), eb3Var.a(), eb3Var.b(), eb3Var.d(), eb3Var.c(), eb3Var.e());
        } else if (ib3Var == null) {
            ib3 ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
            return new la3(ecImplicitlyCa.a(), ecImplicitlyCa.b(), ecImplicitlyCa.d(), ecImplicitlyCa.c(), ecImplicitlyCa.e());
        } else {
            return new la3(ib3Var.a(), ib3Var.b(), ib3Var.d(), ib3Var.c(), ib3Var.e());
        }
    }

    public static String getNameFrom(final AlgorithmParameterSpec algorithmParameterSpec) {
        return (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                try {
                    return algorithmParameterSpec.getClass().getMethod("getName", new Class[0]).invoke(algorithmParameterSpec, new Object[0]);
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    public static iac getNamedCurveByName(String str) {
        iac i = y32.i(str);
        if (i == null) {
            return gb3.b(str);
        }
        return i;
    }

    public static iac getNamedCurveByOid(k kVar) {
        iac j = y32.j(kVar);
        if (j == null) {
            return gb3.c(kVar);
        }
        return j;
    }

    public static k getNamedCurveOid(ib3 ib3Var) {
        Enumeration e = gb3.e();
        while (e.hasMoreElements()) {
            String str = (String) e.nextElement();
            iac b = gb3.b(str);
            if (b.x().equals(ib3Var.d()) && b.v().equals(ib3Var.c()) && b.t().l(ib3Var.a()) && b.u().e(ib3Var.b())) {
                return gb3.f(str);
            }
        }
        return null;
    }

    private static k getOID(String str) {
        char charAt = str.charAt(0);
        if (charAt >= '0' && charAt <= '2') {
            try {
                return new k(str);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public static int getOrderBitLength(ProviderConfiguration providerConfiguration, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger == null) {
            ib3 ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
            if (ecImplicitlyCa == null) {
                return bigInteger2.bitLength();
            }
            return ecImplicitlyCa.d().bitLength();
        }
        return bigInteger.bitLength();
    }

    public static String privateKeyToString(String str, BigInteger bigInteger, ib3 ib3Var) {
        StringBuffer stringBuffer = new StringBuffer();
        String d = a0b.d();
        jb3 A = new ry3().a(ib3Var.b(), bigInteger).A();
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [");
        stringBuffer.append(generateKeyFingerprint(A, ib3Var));
        stringBuffer.append("]");
        stringBuffer.append(d);
        stringBuffer.append("            X: ");
        stringBuffer.append(A.f().t().toString(16));
        stringBuffer.append(d);
        stringBuffer.append("            Y: ");
        stringBuffer.append(A.g().t().toString(16));
        stringBuffer.append(d);
        return stringBuffer.toString();
    }

    public static String publicKeyToString(String str, jb3 jb3Var, ib3 ib3Var) {
        StringBuffer stringBuffer = new StringBuffer();
        String d = a0b.d();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [");
        stringBuffer.append(generateKeyFingerprint(jb3Var, ib3Var));
        stringBuffer.append("]");
        stringBuffer.append(d);
        stringBuffer.append("            X: ");
        stringBuffer.append(jb3Var.f().t().toString(16));
        stringBuffer.append(d);
        stringBuffer.append("            Y: ");
        stringBuffer.append(jb3Var.g().t().toString(16));
        stringBuffer.append(d);
        return stringBuffer.toString();
    }

    public static la3 getDomainParameters(ProviderConfiguration providerConfiguration, gac gacVar) {
        la3 la3Var;
        if (gacVar.w()) {
            k I = k.I(gacVar.u());
            iac namedCurveByOid = getNamedCurveByOid(I);
            if (namedCurveByOid == null) {
                namedCurveByOid = (iac) providerConfiguration.getAdditionalECParameters().get(I);
            }
            return new hb3(I, namedCurveByOid);
        }
        if (gacVar.v()) {
            ib3 ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
            la3Var = new la3(ecImplicitlyCa.a(), ecImplicitlyCa.b(), ecImplicitlyCa.d(), ecImplicitlyCa.c(), ecImplicitlyCa.e());
        } else {
            iac w = iac.w(gacVar.u());
            la3Var = new la3(w.t(), w.u(), w.x(), w.v(), w.z());
        }
        return la3Var;
    }

    public static k getNamedCurveOid(String str) {
        if (str == null || str.length() < 1) {
            return null;
        }
        int indexOf = str.indexOf(32);
        if (indexOf > 0) {
            str = str.substring(indexOf + 1);
        }
        k oid = getOID(str);
        return oid != null ? oid : gb3.f(str);
    }
}
