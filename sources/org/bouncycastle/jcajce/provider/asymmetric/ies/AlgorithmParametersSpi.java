package org.bouncycastle.jcajce.provider.asymmetric.ies;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;
/* loaded from: classes3.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    pr4 currentSpec;

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        try {
            d dVar = new d();
            if (this.currentSpec.b() != null) {
                dVar.a(new z0(false, 0, new s0(this.currentSpec.b())));
            }
            if (this.currentSpec.c() != null) {
                dVar.a(new z0(false, 1, new s0(this.currentSpec.c())));
            }
            dVar.a(new i(this.currentSpec.d()));
            if (this.currentSpec.e() != null) {
                d dVar2 = new d();
                dVar2.a(new i(this.currentSpec.a()));
                dVar2.a(new i(this.currentSpec.e()));
                dVar.a(new w0(dVar2));
            }
            return new w0(dVar).p("DER");
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding IESParameters");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls != null) {
            return localEngineGetParameterSpec(cls);
        }
        throw new NullPointerException("argument to getParameterSpec must not be null");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof pr4)) {
            throw new InvalidParameterSpecException("IESParameterSpec required to initialise a IES algorithm parameters object");
        }
        this.currentSpec = (pr4) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "IES Parameters";
    }

    protected boolean isASN1FormatString(String str) {
        if (str != null && !str.equals("ASN.1")) {
            return false;
        }
        return true;
    }

    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls != pr4.class && cls != AlgorithmParameterSpec.class) {
            throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
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
            p pVar = (p) n.z(bArr);
            if (pVar.size() == 1) {
                this.currentSpec = new pr4(null, null, i.D(pVar.F(0)).P());
            } else if (pVar.size() == 2) {
                s D = s.D(pVar.F(0));
                this.currentSpec = D.G() == 0 ? new pr4(l.E(D, false).F(), null, i.D(pVar.F(1)).P()) : new pr4(null, l.E(D, false).F(), i.D(pVar.F(1)).P());
            } else if (pVar.size() == 3) {
                this.currentSpec = new pr4(l.E(s.D(pVar.F(0)), false).F(), l.E(s.D(pVar.F(1)), false).F(), i.D(pVar.F(2)).P());
            } else if (pVar.size() == 4) {
                s D2 = s.D(pVar.F(0));
                s D3 = s.D(pVar.F(1));
                p D4 = p.D(pVar.F(3));
                this.currentSpec = new pr4(l.E(D2, false).F(), l.E(D3, false).F(), i.D(pVar.F(2)).P(), i.D(D4.F(0)).P(), l.D(D4.F(1)).F());
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IOException("Not a valid IES Parameter encoding.");
        } catch (ClassCastException unused2) {
            throw new IOException("Not a valid IES Parameter encoding.");
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
