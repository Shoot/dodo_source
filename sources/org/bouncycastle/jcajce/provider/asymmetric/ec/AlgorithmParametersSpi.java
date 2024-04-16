package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.asn1.j;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
/* loaded from: classes3.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    private String curveName;
    private ECParameterSpec ecParameterSpec;

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() throws IOException {
        return engineGetEncoded("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (!ECParameterSpec.class.isAssignableFrom(cls) && cls != AlgorithmParameterSpec.class) {
            if (ECGenParameterSpec.class.isAssignableFrom(cls)) {
                String str = this.curveName;
                if (str != null) {
                    k namedCurveOid = ECUtil.getNamedCurveOid(str);
                    if (namedCurveOid != null) {
                        return new ECGenParameterSpec(namedCurveOid.H());
                    }
                    return new ECGenParameterSpec(this.curveName);
                }
                k namedCurveOid2 = ECUtil.getNamedCurveOid(EC5Util.convertSpec(this.ecParameterSpec));
                if (namedCurveOid2 != null) {
                    return new ECGenParameterSpec(namedCurveOid2.H());
                }
            }
            throw new InvalidParameterSpecException("EC AlgorithmParameters cannot convert to " + cls.getName());
        }
        return this.ecParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof ECGenParameterSpec)) {
            if (algorithmParameterSpec instanceof ECParameterSpec) {
                this.curveName = algorithmParameterSpec instanceof fb3 ? ((fb3) algorithmParameterSpec).c() : null;
                this.ecParameterSpec = (ECParameterSpec) algorithmParameterSpec;
                return;
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
        }
        ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) algorithmParameterSpec;
        iac domainParametersFromGenSpec = ECUtils.getDomainParametersFromGenSpec(eCGenParameterSpec, ff0.b);
        if (domainParametersFromGenSpec != null) {
            this.curveName = eCGenParameterSpec.getName();
            ECParameterSpec convertToSpec = EC5Util.convertToSpec(domainParametersFromGenSpec);
            this.ecParameterSpec = new fb3(this.curveName, convertToSpec.getCurve(), convertToSpec.getGenerator(), convertToSpec.getOrder(), BigInteger.valueOf(convertToSpec.getCofactor()));
            return;
        }
        throw new InvalidParameterSpecException("EC curve name not recognized: " + eCGenParameterSpec.getName());
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "EC Parameters";
    }

    protected boolean isASN1FormatString(String str) {
        if (str != null && !str.equals("ASN.1")) {
            return false;
        }
        return true;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) throws IOException {
        gac gacVar;
        if (!isASN1FormatString(str)) {
            throw new IOException("Unknown parameters format in AlgorithmParameters object: " + str);
        }
        ECParameterSpec eCParameterSpec = this.ecParameterSpec;
        if (eCParameterSpec == null) {
            gacVar = new gac((j) q0.a);
        } else {
            String str2 = this.curveName;
            if (str2 != null) {
                gacVar = new gac(ECUtil.getNamedCurveOid(str2));
            } else {
                ib3 convertSpec = EC5Util.convertSpec(eCParameterSpec);
                gacVar = new gac(new iac(convertSpec.a(), new kac(convertSpec.b(), false), convertSpec.d(), convertSpec.c(), convertSpec.e()));
            }
        }
        return gacVar.getEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws IOException {
        engineInit(bArr, "ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws IOException {
        if (!isASN1FormatString(str)) {
            throw new IOException("Unknown encoded parameters format in AlgorithmParameters object: " + str);
        }
        gac t = gac.t(bArr);
        ea3 curve = EC5Util.getCurve(ff0.b, t);
        if (t.w()) {
            k I = k.I(t.u());
            String d = gb3.d(I);
            this.curveName = d;
            if (d == null) {
                this.curveName = I.H();
            }
        }
        this.ecParameterSpec = EC5Util.convertToSpec(t, curve);
    }
}
