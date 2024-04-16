package org.bouncycastle.jcajce.provider.asymmetric.x509;

import defpackage.i5b;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
/* loaded from: classes3.dex */
abstract class X509CRLImpl extends X509CRL {
    protected d95 bcHelper;
    protected fu0 c;
    protected boolean isIndirect;
    protected String sigAlgName;
    protected byte[] sigAlgParams;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X509CRLImpl(d95 d95Var, fu0 fu0Var, String str, byte[] bArr, boolean z) {
        this.bcHelper = d95Var;
        this.c = fu0Var;
        this.sigAlgName = str;
        this.sigAlgParams = bArr;
        this.isIndirect = z;
    }

    private void checkSignature(PublicKey publicKey, Signature signature, h0 h0Var, byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException {
        if (h0Var != null) {
            X509SignatureUtil.setSignatureParameters(signature, h0Var);
        }
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(nm7.a(signature), 512);
            this.c.A().k(bufferedOutputStream, "DER");
            bufferedOutputStream.close();
            if (signature.verify(bArr)) {
                return;
            }
            throw new SignatureException("CRL does not verify with supplied public key.");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    private void doVerify(PublicKey publicKey, SignatureCreator signatureCreator) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException, NoSuchProviderException {
        if (this.c.z().equals(this.c.A().z())) {
            int i = 0;
            if ((publicKey instanceof bo1) && X509SignatureUtil.isCompositeAlgorithm(this.c.z())) {
                List<PublicKey> a = ((bo1) publicKey).a();
                p D = p.D(this.c.z().w());
                p D2 = p.D(j0.I(this.c.x()).E());
                boolean z = false;
                while (i != a.size()) {
                    if (a.get(i) != null) {
                        eb u = eb.u(D.F(i));
                        try {
                            checkSignature(a.get(i), signatureCreator.createSignature(X509SignatureUtil.getSignatureName(u)), u.w(), j0.I(D2.F(i)).E());
                            e = null;
                            z = true;
                        } catch (SignatureException e) {
                            e = e;
                        }
                        if (e != null) {
                            throw e;
                        }
                    }
                    i++;
                }
                if (!z) {
                    throw new InvalidKeyException("no matching key found");
                }
                return;
            } else if (X509SignatureUtil.isCompositeAlgorithm(this.c.z())) {
                p D3 = p.D(this.c.z().w());
                p D4 = p.D(j0.I(this.c.x()).E());
                boolean z2 = false;
                while (i != D4.size()) {
                    eb u2 = eb.u(D3.F(i));
                    try {
                        checkSignature(publicKey, signatureCreator.createSignature(X509SignatureUtil.getSignatureName(u2)), u2.w(), j0.I(D4.F(i)).E());
                        e = null;
                        z2 = true;
                    } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
                        e = null;
                    } catch (SignatureException e2) {
                        e = e2;
                    }
                    if (e == null) {
                        i++;
                    } else {
                        throw e;
                    }
                }
                if (!z2) {
                    throw new InvalidKeyException("no matching key found");
                }
                return;
            } else {
                Signature createSignature = signatureCreator.createSignature(getSigAlgName());
                byte[] bArr = this.sigAlgParams;
                if (bArr == null) {
                    checkSignature(publicKey, createSignature, null, getSignature());
                    return;
                }
                try {
                    checkSignature(publicKey, createSignature, n.z(bArr), getSignature());
                    return;
                } catch (IOException e3) {
                    throw new SignatureException("cannot decode signature parameters: " + e3.getMessage());
                }
            }
        }
        throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
    }

    private Set getExtensionOIDs(boolean z) {
        rn3 t;
        if (getVersion() == 2 && (t = this.c.A().t()) != null) {
            HashSet hashSet = new HashSet();
            Enumeration v = t.v();
            while (v.hasMoreElements()) {
                k kVar = (k) v.nextElement();
                if (z == t.t(kVar).z()) {
                    hashSet.add(kVar.H());
                }
            }
            return hashSet;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] getExtensionOctets(fu0 fu0Var, String str) {
        l extensionValue = getExtensionValue(fu0Var, str);
        if (extensionValue != null) {
            return extensionValue.F();
        }
        return null;
    }

    protected static l getExtensionValue(fu0 fu0Var, String str) {
        on3 t;
        rn3 t2 = fu0Var.A().t();
        if (t2 == null || (t = t2.t(new k(str))) == null) {
            return null;
        }
        return t.v();
    }

    private Set loadCRLEntries() {
        on3 t;
        HashSet hashSet = new HashSet();
        Enumeration w = this.c.w();
        t9c t9cVar = null;
        while (w.hasMoreElements()) {
            i5b.b bVar = (i5b.b) w.nextElement();
            hashSet.add(new X509CRLEntryObject(bVar, this.isIndirect, t9cVar));
            if (this.isIndirect && bVar.x() && (t = bVar.t().t(on3.q)) != null) {
                t9cVar = t9c.u(gd4.u(t.x()).w()[0].u());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    @Override // java.security.cert.X509CRL
    public Principal getIssuerDN() {
        return new bac(t9c.u(this.c.u().f()));
    }

    @Override // java.security.cert.X509CRL
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.c.u().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getNextUpdate() {
        ggb v = this.c.v();
        if (v == null) {
            return null;
        }
        return v.t();
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        on3 t;
        Enumeration w = this.c.w();
        t9c t9cVar = null;
        while (w.hasMoreElements()) {
            i5b.b bVar = (i5b.b) w.nextElement();
            if (bVar.w().I(bigInteger)) {
                return new X509CRLEntryObject(bVar, this.isIndirect, t9cVar);
            }
            if (this.isIndirect && bVar.x() && (t = bVar.t().t(on3.q)) != null) {
                t9cVar = t9c.u(gd4.u(t.x()).w()[0].u());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public Set getRevokedCertificates() {
        Set loadCRLEntries = loadCRLEntries();
        if (!loadCRLEntries.isEmpty()) {
            return Collections.unmodifiableSet(loadCRLEntries);
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgName() {
        return this.sigAlgName;
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgOID() {
        return this.c.z().t().H();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSigAlgParams() {
        return tr.h(this.sigAlgParams);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSignature() {
        return this.c.x().F();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() throws CRLException {
        try {
            return this.c.A().p("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getThisUpdate() {
        return this.c.B().t();
    }

    @Override // java.security.cert.X509CRL
    public int getVersion() {
        return this.c.C();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(on3.p.H());
        criticalExtensionOIDs.remove(on3.o.H());
        return !criticalExtensionOIDs.isEmpty();
    }

    @Override // java.security.cert.CRL
    public boolean isRevoked(Certificate certificate) {
        t9c v;
        on3 t;
        if (certificate.getType().equals("X.509")) {
            Enumeration w = this.c.w();
            t9c u = this.c.u();
            if (w.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                BigInteger serialNumber = x509Certificate.getSerialNumber();
                while (w.hasMoreElements()) {
                    i5b.b u2 = i5b.b.u(w.nextElement());
                    if (this.isIndirect && u2.x() && (t = u2.t().t(on3.q)) != null) {
                        u = t9c.u(gd4.u(t.x()).w()[0].u());
                    }
                    if (u2.w().I(serialNumber)) {
                        if (certificate instanceof X509Certificate) {
                            v = t9c.u(x509Certificate.getIssuerX500Principal().getEncoded());
                        } else {
                            try {
                                v = bu0.u(certificate.getEncoded()).v();
                            } catch (CertificateEncodingException e) {
                                throw new IllegalArgumentException("Cannot process certificate: " + e.getMessage());
                            }
                        }
                        if (!u.equals(v)) {
                            return false;
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        throw new IllegalArgumentException("X.509 CRL used with non X.509 Cert");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0143 -> B:7:0x0075). Please submit an issue!!! */
    @Override // java.security.cert.CRL
    public String toString() {
        String str;
        String c;
        Object u;
        StringBuffer stringBuffer = new StringBuffer();
        String d = a0b.d();
        stringBuffer.append("              Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(d);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(d);
        stringBuffer.append("          This update: ");
        stringBuffer.append(getThisUpdate());
        stringBuffer.append(d);
        stringBuffer.append("          Next update: ");
        stringBuffer.append(getNextUpdate());
        stringBuffer.append(d);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(d);
        X509SignatureUtil.prettyPrintSignature(getSignature(), stringBuffer, d);
        rn3 t = this.c.A().t();
        if (t != null) {
            Enumeration v = t.v();
            if (v.hasMoreElements()) {
                str = "           Extensions: ";
                stringBuffer.append(str);
                stringBuffer.append(d);
            }
            while (v.hasMoreElements()) {
                k kVar = (k) v.nextElement();
                on3 t2 = t.t(kVar);
                if (t2.v() == null) {
                    stringBuffer.append(d);
                } else {
                    h hVar = new h(t2.v().F());
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(t2.z());
                    stringBuffer.append(") ");
                    try {
                    } catch (Exception unused) {
                        stringBuffer.append(kVar.H());
                        stringBuffer.append(" value = ");
                        str = "*****";
                    }
                    if (kVar.x(on3.k)) {
                        u = new el0(i.D(hVar.l()).F());
                    } else {
                        if (kVar.x(on3.o)) {
                            c = "Base CRL: " + new el0(i.D(hVar.l()).F());
                        } else if (kVar.x(on3.p)) {
                            u = x75.v(hVar.l());
                        } else if (kVar.x(on3.s)) {
                            u = dl0.u(hVar.l());
                        } else if (kVar.x(on3.y)) {
                            u = dl0.u(hVar.l());
                        } else {
                            stringBuffer.append(kVar.H());
                            stringBuffer.append(" value = ");
                            c = g0.c(hVar.l());
                        }
                        stringBuffer.append(c);
                        stringBuffer.append(d);
                    }
                    stringBuffer.append(u);
                    stringBuffer.append(d);
                }
            }
        }
        Set<Object> revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            for (Object obj : revokedCertificates) {
                stringBuffer.append(obj);
                stringBuffer.append(d);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.1
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
                try {
                    return X509CRLImpl.this.bcHelper.createSignature(str);
                } catch (Exception unused) {
                    return Signature.getInstance(str);
                }
            }
        });
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        l extensionValue = getExtensionValue(this.c, str);
        if (extensionValue != null) {
            try {
                return extensionValue.getEncoded();
            } catch (Exception e) {
                throw new IllegalStateException("error parsing " + e.toString());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, final String str) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.2
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str2) throws NoSuchAlgorithmException, NoSuchProviderException {
                String str3 = str;
                if (str3 != null) {
                    return Signature.getInstance(str2, str3);
                }
                return Signature.getInstance(str2);
            }
        });
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, final Provider provider) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        try {
            doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.3
                @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
                public Signature createSignature(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
                    if (provider != null) {
                        return Signature.getInstance(X509CRLImpl.this.getSigAlgName(), provider);
                    }
                    return Signature.getInstance(X509CRLImpl.this.getSigAlgName());
                }
            });
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException("provider issue: " + e.getMessage());
        }
    }
}
