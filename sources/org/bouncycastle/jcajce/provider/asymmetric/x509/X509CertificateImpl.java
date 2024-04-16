package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.p0;
import org.bouncycastle.asn1.q0;
/* loaded from: classes3.dex */
abstract class X509CertificateImpl extends X509Certificate {
    protected b90 basicConstraints;
    protected d95 bcHelper;
    protected bu0 c;
    protected boolean[] keyUsage;
    protected String sigAlgName;
    protected byte[] sigAlgParams;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X509CertificateImpl(d95 d95Var, bu0 bu0Var, b90 b90Var, boolean[] zArr, String str, byte[] bArr) {
        this.bcHelper = d95Var;
        this.c = bu0Var;
        this.basicConstraints = b90Var;
        this.keyUsage = zArr;
        this.sigAlgName = str;
        this.sigAlgParams = bArr;
    }

    private void checkSignature(PublicKey publicKey, Signature signature, h0 h0Var, byte[] bArr) throws CertificateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (isAlgIdEqual(this.c.z(), this.c.D().A())) {
            X509SignatureUtil.setSignatureParameters(signature, h0Var);
            signature.initVerify(publicKey);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(nm7.a(signature), 512);
                this.c.D().k(bufferedOutputStream, "DER");
                bufferedOutputStream.close();
                if (signature.verify(bArr)) {
                    return;
                }
                throw new SignatureException("certificate does not verify with supplied key");
            } catch (IOException e) {
                throw new CertificateEncodingException(e.toString());
            }
        }
        throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
    }

    private void doVerify(PublicKey publicKey, SignatureCreator signatureCreator) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException, NoSuchProviderException {
        boolean z = publicKey instanceof bo1;
        int i = 0;
        if (z && X509SignatureUtil.isCompositeAlgorithm(this.c.z())) {
            List<PublicKey> a = ((bo1) publicKey).a();
            p D = p.D(this.c.z().w());
            p D2 = p.D(j0.I(this.c.x()).E());
            boolean z2 = false;
            while (i != a.size()) {
                if (a.get(i) != null) {
                    eb u = eb.u(D.F(i));
                    try {
                        checkSignature(a.get(i), signatureCreator.createSignature(X509SignatureUtil.getSignatureName(u)), u.w(), j0.I(D2.F(i)).E());
                        e = null;
                        z2 = true;
                    } catch (SignatureException e) {
                        e = e;
                    }
                    if (e != null) {
                        throw e;
                    }
                }
                i++;
            }
            if (!z2) {
                throw new InvalidKeyException("no matching key found");
            }
        } else if (X509SignatureUtil.isCompositeAlgorithm(this.c.z())) {
            p D3 = p.D(this.c.z().w());
            p D4 = p.D(j0.I(this.c.x()).E());
            boolean z3 = false;
            while (i != D4.size()) {
                eb u2 = eb.u(D3.F(i));
                try {
                    checkSignature(publicKey, signatureCreator.createSignature(X509SignatureUtil.getSignatureName(u2)), u2.w(), j0.I(D4.F(i)).E());
                    e = null;
                    z3 = true;
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
            if (!z3) {
                throw new InvalidKeyException("no matching key found");
            }
        } else {
            Signature createSignature = signatureCreator.createSignature(X509SignatureUtil.getSignatureName(this.c.z()));
            if (z) {
                List<PublicKey> a2 = ((bo1) publicKey).a();
                while (i != a2.size()) {
                    try {
                        checkSignature(a2.get(i), createSignature, this.c.z().w(), getSignature());
                        return;
                    } catch (InvalidKeyException unused2) {
                        i++;
                    }
                }
                throw new InvalidKeyException("no matching signature found");
            }
            checkSignature(publicKey, createSignature, this.c.z().w(), getSignature());
        }
    }

    private static Collection getAlternativeNames(bu0 bu0Var, String str) throws CertificateParsingException {
        String g;
        byte[] extensionOctets = getExtensionOctets(bu0Var, str);
        if (extensionOctets == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration G = p.D(extensionOctets).G();
            while (G.hasMoreElements()) {
                fd4 t = fd4.t(G.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(g65.d(t.v()));
                switch (t.v()) {
                    case 0:
                    case 3:
                    case 5:
                        arrayList2.add(t.getEncoded());
                        break;
                    case 1:
                    case 2:
                    case 6:
                        g = ((m0) t.u()).g();
                        arrayList2.add(g);
                        break;
                    case 4:
                        g = t9c.t(a39.V, t.u()).toString();
                        arrayList2.add(g);
                        break;
                    case 7:
                        try {
                            g = InetAddress.getByAddress(l.D(t.u()).F()).getHostAddress();
                            arrayList2.add(g);
                            break;
                        } catch (UnknownHostException unused) {
                            break;
                        }
                    case 8:
                        g = k.I(t.u()).H();
                        arrayList2.add(g);
                        break;
                    default:
                        throw new IOException("Bad tag number: " + t.v());
                }
                arrayList.add(Collections.unmodifiableList(arrayList2));
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return Collections.unmodifiableCollection(arrayList);
        } catch (Exception e) {
            throw new CertificateParsingException(e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] getExtensionOctets(bu0 bu0Var, String str) {
        l extensionValue = getExtensionValue(bu0Var, str);
        if (extensionValue != null) {
            return extensionValue.F();
        }
        return null;
    }

    protected static l getExtensionValue(bu0 bu0Var, String str) {
        on3 t;
        rn3 u = bu0Var.D().u();
        if (u == null || (t = u.t(new k(str))) == null) {
            return null;
        }
        return t.v();
    }

    private boolean isAlgIdEqual(eb ebVar, eb ebVar2) {
        if (!ebVar.t().x(ebVar2.t())) {
            return false;
        }
        if (pq8.c("org.bouncycastle.x509.allow_absent_equiv_NULL")) {
            if (ebVar.w() == null) {
                if (ebVar2.w() != null && !ebVar2.w().equals(q0.a)) {
                    return false;
                }
                return true;
            } else if (ebVar2.w() == null) {
                if (ebVar.w() != null && !ebVar.w().equals(q0.a)) {
                    return false;
                }
                return true;
            }
        }
        if (ebVar.w() != null) {
            return ebVar.w().equals(ebVar2.w());
        }
        if (ebVar2.w() == null) {
            return true;
        }
        return ebVar2.w().equals(ebVar.w());
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        checkValidity(new Date());
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        b90 b90Var = this.basicConstraints;
        if (b90Var == null || !b90Var.v()) {
            return -1;
        }
        if (this.basicConstraints.u() == null) {
            return Integer.MAX_VALUE;
        }
        return this.basicConstraints.u().intValue();
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet hashSet = new HashSet();
            rn3 u = this.c.D().u();
            if (u != null) {
                Enumeration v = u.v();
                while (v.hasMoreElements()) {
                    k kVar = (k) v.nextElement();
                    if (u.t(kVar).z()) {
                        hashSet.add(kVar.H());
                    }
                }
                return hashSet;
            }
            return null;
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public List getExtendedKeyUsage() throws CertificateParsingException {
        byte[] extensionOctets = getExtensionOctets(this.c, "2.5.29.37");
        if (extensionOctets == null) {
            return null;
        }
        try {
            p D = p.D(n.z(extensionOctets));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != D.size(); i++) {
                arrayList.add(((k) D.F(i)).H());
            }
            return Collections.unmodifiableList(arrayList);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    @Override // java.security.cert.X509Certificate
    public Collection getIssuerAlternativeNames() throws CertificateParsingException {
        return getAlternativeNames(this.c, on3.i.H());
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        return new bac(this.c.v());
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        boolean z;
        j0 x = this.c.D().x();
        if (x != null) {
            byte[] E = x.E();
            int length = (E.length * 8) - x.G();
            boolean[] zArr = new boolean[length];
            for (int i = 0; i != length; i++) {
                if ((E[i / 8] & (128 >>> (i % 8))) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                zArr[i] = z;
            }
            return zArr;
        }
        return null;
    }

    public t9c getIssuerX500Name() {
        return this.c.v();
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.c.v().p("DER"));
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return tr.o(this.keyUsage);
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet hashSet = new HashSet();
            rn3 u = this.c.D().u();
            if (u != null) {
                Enumeration v = u.v();
                while (v.hasMoreElements()) {
                    k kVar = (k) v.nextElement();
                    if (!u.t(kVar).z()) {
                        hashSet.add(kVar.H());
                    }
                }
                return hashSet;
            }
            return null;
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        return this.c.t().t();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return this.c.A().t();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        try {
            return ff0.e(this.c.C());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return this.c.w().G();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        return this.sigAlgName;
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return this.c.z().t().H();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        return tr.h(this.sigAlgParams);
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.c.x().F();
    }

    @Override // java.security.cert.X509Certificate
    public Collection getSubjectAlternativeNames() throws CertificateParsingException {
        return getAlternativeNames(this.c, on3.h.H());
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return new bac(this.c.B());
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        boolean z;
        j0 E = this.c.D().E();
        if (E != null) {
            byte[] E2 = E.E();
            int length = (E2.length * 8) - E.G();
            boolean[] zArr = new boolean[length];
            for (int i = 0; i != length; i++) {
                if ((E2[i / 8] & (128 >>> (i % 8))) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                zArr[i] = z;
            }
            return zArr;
        }
        return null;
    }

    public t9c getSubjectX500Name() {
        return this.c.B();
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.c.B().p("DER"));
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode subject DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws CertificateEncodingException {
        try {
            return this.c.D().p("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    public j5b getTBSCertificateNative() {
        return this.c.D();
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.c.E();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        rn3 u;
        if (getVersion() == 3 && (u = this.c.D().u()) != null) {
            Enumeration v = u.v();
            while (v.hasMoreElements()) {
                k kVar = (k) v.nextElement();
                if (!kVar.x(on3.f) && !kVar.x(on3.t) && !kVar.x(on3.u) && !kVar.x(on3.z) && !kVar.x(on3.s) && !kVar.x(on3.p) && !kVar.x(on3.o) && !kVar.x(on3.w) && !kVar.x(on3.j) && !kVar.x(on3.h) && !kVar.x(on3.r) && u.t(kVar).z()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        Object aybVar;
        StringBuffer stringBuffer = new StringBuffer();
        String d = a0b.d();
        stringBuffer.append("  [0]         Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(d);
        stringBuffer.append("         SerialNumber: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(d);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(d);
        stringBuffer.append("           Start Date: ");
        stringBuffer.append(getNotBefore());
        stringBuffer.append(d);
        stringBuffer.append("           Final Date: ");
        stringBuffer.append(getNotAfter());
        stringBuffer.append(d);
        stringBuffer.append("            SubjectDN: ");
        stringBuffer.append(getSubjectDN());
        stringBuffer.append(d);
        stringBuffer.append("           Public Key: ");
        stringBuffer.append(getPublicKey());
        stringBuffer.append(d);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(d);
        X509SignatureUtil.prettyPrintSignature(getSignature(), stringBuffer, d);
        rn3 u = this.c.D().u();
        if (u != null) {
            Enumeration v = u.v();
            if (v.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
            }
            while (v.hasMoreElements()) {
                k kVar = (k) v.nextElement();
                on3 t = u.t(kVar);
                if (t.v() != null) {
                    h hVar = new h(t.v().F());
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(t.z());
                    stringBuffer.append(") ");
                    try {
                    } catch (Exception unused) {
                        stringBuffer.append(kVar.H());
                        stringBuffer.append(" value = ");
                        stringBuffer.append("*****");
                    }
                    if (kVar.x(on3.j)) {
                        aybVar = b90.t(hVar.l());
                    } else if (kVar.x(on3.f)) {
                        aybVar = zf5.t(hVar.l());
                    } else if (kVar.x(pl6.b)) {
                        aybVar = new qv6(j0.I(hVar.l()));
                    } else if (kVar.x(pl6.d)) {
                        aybVar = new rv6(p0.D(hVar.l()));
                    } else if (kVar.x(pl6.k)) {
                        aybVar = new ayb(p0.D(hVar.l()));
                    } else {
                        stringBuffer.append(kVar.H());
                        stringBuffer.append(" value = ");
                        stringBuffer.append(g0.c(hVar.l()));
                        stringBuffer.append(d);
                    }
                    stringBuffer.append(aybVar);
                    stringBuffer.append(d);
                }
                stringBuffer.append(d);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl.1
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str) throws NoSuchAlgorithmException {
                try {
                    return X509CertificateImpl.this.bcHelper.createSignature(str);
                } catch (Exception unused) {
                    return Signature.getInstance(str);
                }
            }
        });
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        if (date.getTime() > getNotAfter().getTime()) {
            throw new CertificateExpiredException("certificate expired on " + this.c.t().v());
        } else if (date.getTime() >= getNotBefore().getTime()) {
        } else {
            throw new CertificateNotYetValidException("certificate not valid till " + this.c.A().v());
        }
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

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, final String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl.2
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

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, final Provider provider) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        try {
            doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl.3
                @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
                public Signature createSignature(String str) throws NoSuchAlgorithmException {
                    Provider provider2 = provider;
                    if (provider2 != null) {
                        return Signature.getInstance(str, provider2);
                    }
                    return Signature.getInstance(str);
                }
            });
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException("provider issue: " + e.getMessage());
        }
    }
}
