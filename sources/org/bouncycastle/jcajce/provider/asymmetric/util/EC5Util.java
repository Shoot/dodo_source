package org.bouncycastle.jcajce.provider.asymmetric.util;

import defpackage.ea3;
import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.p;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
/* loaded from: classes3.dex */
public class EC5Util {
    private static Map customCurves = new HashMap();

    static {
        Enumeration l = y32.l();
        while (l.hasMoreElements()) {
            String str = (String) l.nextElement();
            iac b = gb3.b(str);
            if (b != null) {
                customCurves.put(b.t(), y32.i(str).t());
            }
        }
        ea3 t = y32.i("Curve25519").t();
        customCurves.put(new ea3.f(t.s().b(), t.n().t(), t.o().t(), t.w(), t.p()), t);
    }

    public static ea3 convertCurve(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        BigInteger a = ellipticCurve.getA();
        BigInteger b = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            ea3.f fVar = new ea3.f(((ECFieldFp) field).getP(), a, b);
            return customCurves.containsKey(fVar) ? (ea3) customCurves.get(fVar) : fVar;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m = eCFieldF2m.getM();
        int[] convertMidTerms = ECUtil.convertMidTerms(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new ea3.e(m, convertMidTerms[0], convertMidTerms[1], convertMidTerms[2], a, b);
    }

    public static ECField convertField(iv3 iv3Var) {
        if (ca3.o(iv3Var)) {
            return new ECFieldFp(iv3Var.b());
        }
        te8 c = ((ve8) iv3Var).c();
        int[] a = c.a();
        return new ECFieldF2m(c.b(), tr.R(tr.x(a, 1, a.length - 1)));
    }

    public static jb3 convertPoint(ea3 ea3Var, ECPoint eCPoint) {
        return ea3Var.g(eCPoint.getAffineX(), eCPoint.getAffineY());
    }

    public static ib3 convertSpec(ECParameterSpec eCParameterSpec) {
        ea3 convertCurve = convertCurve(eCParameterSpec.getCurve());
        jb3 convertPoint = convertPoint(convertCurve, eCParameterSpec.getGenerator());
        BigInteger order = eCParameterSpec.getOrder();
        BigInteger valueOf = BigInteger.valueOf(eCParameterSpec.getCofactor());
        byte[] seed = eCParameterSpec.getCurve().getSeed();
        return eCParameterSpec instanceof fb3 ? new eb3(((fb3) eCParameterSpec).c(), convertCurve, convertPoint, order, valueOf, seed) : new ib3(convertCurve, convertPoint, order, valueOf, seed);
    }

    public static ECParameterSpec convertToSpec(la3 la3Var) {
        return new ECParameterSpec(convertCurve(la3Var.a(), null), convertPoint(la3Var.b()), la3Var.e(), la3Var.c().intValue());
    }

    public static ea3 getCurve(ProviderConfiguration providerConfiguration, gac gacVar) {
        iac e;
        Set acceptableNamedCurves = providerConfiguration.getAcceptableNamedCurves();
        if (gacVar.w()) {
            k I = k.I(gacVar.u());
            if (!acceptableNamedCurves.isEmpty() && !acceptableNamedCurves.contains(I)) {
                throw new IllegalStateException("named curve not acceptable");
            }
            iac namedCurveByOid = ECUtil.getNamedCurveByOid(I);
            if (namedCurveByOid == null) {
                namedCurveByOid = (iac) providerConfiguration.getAdditionalECParameters().get(I);
            }
            return namedCurveByOid.t();
        } else if (gacVar.v()) {
            return providerConfiguration.getEcImplicitlyCa().a();
        } else {
            p D = p.D(gacVar.u());
            if (acceptableNamedCurves.isEmpty()) {
                if (D.size() > 3) {
                    e = iac.w(D);
                } else {
                    e = pa3.e(k.I(D.F(0)));
                }
                return e.t();
            }
            throw new IllegalStateException("encoded parameters not acceptable");
        }
    }

    public static la3 getDomainParameters(ProviderConfiguration providerConfiguration, ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec == null) {
            ib3 ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
            return new la3(ecImplicitlyCa.a(), ecImplicitlyCa.b(), ecImplicitlyCa.d(), ecImplicitlyCa.c(), ecImplicitlyCa.e());
        }
        return ECUtil.getDomainParameters(providerConfiguration, convertSpec(eCParameterSpec));
    }

    public static EllipticCurve convertCurve(ea3 ea3Var, byte[] bArr) {
        return new EllipticCurve(convertField(ea3Var.s()), ea3Var.n().t(), ea3Var.o().t(), null);
    }

    public static jb3 convertPoint(ECParameterSpec eCParameterSpec, ECPoint eCPoint) {
        return convertPoint(convertCurve(eCParameterSpec.getCurve()), eCPoint);
    }

    public static ECParameterSpec convertSpec(EllipticCurve ellipticCurve, ib3 ib3Var) {
        ECPoint convertPoint = convertPoint(ib3Var.b());
        return ib3Var instanceof eb3 ? new fb3(((eb3) ib3Var).f(), ellipticCurve, convertPoint, ib3Var.d(), ib3Var.c()) : new ECParameterSpec(ellipticCurve, convertPoint, ib3Var.d(), ib3Var.c().intValue());
    }

    public static ECParameterSpec convertToSpec(gac gacVar, ea3 ea3Var) {
        ECParameterSpec fb3Var;
        if (gacVar.w()) {
            k kVar = (k) gacVar.u();
            iac namedCurveByOid = ECUtil.getNamedCurveByOid(kVar);
            if (namedCurveByOid == null) {
                Map additionalECParameters = ff0.b.getAdditionalECParameters();
                if (!additionalECParameters.isEmpty()) {
                    namedCurveByOid = (iac) additionalECParameters.get(kVar);
                }
            }
            return new fb3(ECUtil.getCurveName(kVar), convertCurve(ea3Var, namedCurveByOid.z()), convertPoint(namedCurveByOid.u()), namedCurveByOid.x(), namedCurveByOid.v());
        } else if (gacVar.v()) {
            return null;
        } else {
            p D = p.D(gacVar.u());
            if (D.size() > 3) {
                iac w = iac.w(D);
                EllipticCurve convertCurve = convertCurve(ea3Var, w.z());
                fb3Var = w.v() != null ? new ECParameterSpec(convertCurve, convertPoint(w.u()), w.x(), w.v().intValue()) : new ECParameterSpec(convertCurve, convertPoint(w.u()), w.x(), 1);
            } else {
                pb4 v = pb4.v(D);
                eb3 a = oa3.a(pa3.f(v.w()));
                fb3Var = new fb3(pa3.f(v.w()), convertCurve(a.a(), a.e()), convertPoint(a.b()), a.d(), a.c());
            }
            return fb3Var;
        }
    }

    public static ECPoint convertPoint(jb3 jb3Var) {
        jb3 A = jb3Var.A();
        return new ECPoint(A.f().t(), A.g().t());
    }

    public static ECParameterSpec convertToSpec(iac iacVar) {
        return new ECParameterSpec(convertCurve(iacVar.t(), null), convertPoint(iacVar.u()), iacVar.x(), iacVar.v().intValue());
    }
}
