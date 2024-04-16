package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
/* loaded from: classes3.dex */
public abstract class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {

    /* loaded from: classes3.dex */
    public static class OAEP extends AlgorithmParametersSpi {
        OAEPParameterSpec currentSpec;

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            k oid = DigestFactory.getOID(this.currentSpec.getDigestAlgorithm());
            q0 q0Var = q0.a;
            try {
                return new k39(new eb(oid, q0Var), new eb(co7.b0, new eb(DigestFactory.getOID(((MGF1ParameterSpec) this.currentSpec.getMGFParameters()).getDigestAlgorithm()), q0Var)), new eb(co7.c0, new s0(((PSource.PSpecified) this.currentSpec.getPSource()).getValue()))).p("DER");
            } catch (IOException unused) {
                throw new RuntimeException("Error encoding OAEPParameters");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
                throw new InvalidParameterSpecException("OAEPParameterSpec required to initialise an OAEP algorithm parameters object");
            }
            this.currentSpec = (OAEPParameterSpec) algorithmParameterSpec;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "OAEP Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls != OAEPParameterSpec.class && cls != AlgorithmParameterSpec.class) {
                throw new InvalidParameterSpecException("unknown parameter spec passed to OAEP parameters object.");
            }
            return this.currentSpec;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) throws IOException {
            try {
                k39 u = k39.u(bArr);
                if (u.v().t().x(co7.b0)) {
                    this.currentSpec = new OAEPParameterSpec(xh6.a(u.t().t()), OAEPParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(xh6.a(eb.u(u.v().w()).t())), new PSource.PSpecified(l.D(u.w().w()).F()));
                    return;
                }
                throw new IOException("unknown mask generation function: " + u.v().t());
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Not a valid OAEP Parameter encoding.");
            } catch (ClassCastException unused2) {
                throw new IOException("Not a valid OAEP Parameter encoding.");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) throws IOException {
            if (str.equalsIgnoreCase("X.509") || str.equalsIgnoreCase("ASN.1")) {
                engineInit(bArr);
                return;
            }
            throw new IOException("Unknown parameter format " + str);
        }
    }

    /* loaded from: classes3.dex */
    public static class PSS extends AlgorithmParametersSpi {
        PSSParameterSpec currentSpec;

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() throws IOException {
            PSSParameterSpec pSSParameterSpec = this.currentSpec;
            k oid = DigestFactory.getOID(pSSParameterSpec.getDigestAlgorithm());
            q0 q0Var = q0.a;
            eb ebVar = new eb(oid, q0Var);
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) pSSParameterSpec.getMGFParameters();
            if (mGF1ParameterSpec != null) {
                return new r39(ebVar, new eb(co7.b0, new eb(DigestFactory.getOID(mGF1ParameterSpec.getDigestAlgorithm()), q0Var)), new i(pSSParameterSpec.getSaltLength()), new i(pSSParameterSpec.getTrailerField())).p("DER");
            }
            return new r39(ebVar, new eb(pSSParameterSpec.getMGFAlgorithm().equals("SHAKE128") ? ms6.m : ms6.n), new i(pSSParameterSpec.getSaltLength()), new i(pSSParameterSpec.getTrailerField())).p("DER");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
                throw new InvalidParameterSpecException("PSSParameterSpec required to initialise an PSS algorithm parameters object");
            }
            this.currentSpec = (PSSParameterSpec) algorithmParameterSpec;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "PSS Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls != PSSParameterSpec.class && cls != AlgorithmParameterSpec.class) {
                throw new InvalidParameterSpecException("unknown parameter spec passed to PSS parameters object.");
            }
            return this.currentSpec;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) throws IOException {
            if (str.equalsIgnoreCase("X.509") || str.equalsIgnoreCase("ASN.1")) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) throws IOException {
            try {
                r39 u = r39.u(bArr);
                k t = u.v().t();
                if (t.x(co7.b0)) {
                    this.currentSpec = new PSSParameterSpec(xh6.a(u.t().t()), PSSParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(xh6.a(eb.u(u.v().w()).t())), u.w().intValue(), u.x().intValue());
                    return;
                }
                k kVar = ms6.m;
                if (!t.x(kVar) && !t.x(ms6.n)) {
                    throw new IOException("unknown mask generation function: " + u.v().t());
                }
                this.currentSpec = new PSSParameterSpec(xh6.a(u.t().t()), t.x(kVar) ? "SHAKE128" : "SHAKE256", null, u.w().intValue(), u.x().intValue());
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Not a valid PSS Parameter encoding.");
            } catch (ClassCastException unused2) {
                throw new IOException("Not a valid PSS Parameter encoding.");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) throws IOException {
            if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
                engineInit(bArr);
                return;
            }
            throw new IOException("Unknown parameter format " + str);
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls != null) {
            return localEngineGetParameterSpec(cls);
        }
        throw new NullPointerException("argument to getParameterSpec must not be null");
    }

    protected boolean isASN1FormatString(String str) {
        if (str != null && !str.equals("ASN.1")) {
            return false;
        }
        return true;
    }

    protected abstract AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException;
}
