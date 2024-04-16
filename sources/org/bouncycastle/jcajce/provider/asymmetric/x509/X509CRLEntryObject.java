package org.bouncycastle.jcajce.provider.asymmetric.x509;

import defpackage.i5b;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.e;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.k;
/* loaded from: classes3.dex */
class X509CRLEntryObject extends X509CRLEntry {
    private i5b.b c;
    private t9c certificateIssuer;
    private volatile int hashValue;
    private volatile boolean hashValueSet;

    protected X509CRLEntryObject(i5b.b bVar) {
        this.c = bVar;
        this.certificateIssuer = null;
    }

    private on3 getExtension(k kVar) {
        rn3 t = this.c.t();
        if (t != null) {
            return t.t(kVar);
        }
        return null;
    }

    private Set getExtensionOIDs(boolean z) {
        rn3 t = this.c.t();
        if (t != null) {
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

    private t9c loadCertificateIssuer(boolean z, t9c t9cVar) {
        if (!z) {
            return null;
        }
        on3 extension = getExtension(on3.q);
        if (extension == null) {
            return t9cVar;
        }
        try {
            fd4[] w = gd4.u(extension.x()).w();
            for (int i = 0; i < w.length; i++) {
                if (w[i].v() == 4) {
                    return t9c.u(w[i].u());
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X509CRLEntryObject) {
            X509CRLEntryObject x509CRLEntryObject = (X509CRLEntryObject) obj;
            if (this.hashValueSet && x509CRLEntryObject.hashValueSet && this.hashValue != x509CRLEntryObject.hashValue) {
                return false;
            }
            return this.c.equals(x509CRLEntryObject.c);
        }
        return super.equals(this);
    }

    @Override // java.security.cert.X509CRLEntry
    public X500Principal getCertificateIssuer() {
        if (this.certificateIssuer == null) {
            return null;
        }
        try {
            return new X500Principal(this.certificateIssuer.getEncoded());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    @Override // java.security.cert.X509CRLEntry
    public byte[] getEncoded() throws CRLException {
        try {
            return this.c.p("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        on3 extension = getExtension(new k(str));
        if (extension != null) {
            try {
                return extension.v().getEncoded();
            } catch (Exception e) {
                throw new IllegalStateException("Exception encoding: " + e.toString());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    @Override // java.security.cert.X509CRLEntry
    public Date getRevocationDate() {
        return this.c.v().t();
    }

    @Override // java.security.cert.X509CRLEntry
    public BigInteger getSerialNumber() {
        return this.c.w().G();
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean hasExtensions() {
        if (this.c.t() != null) {
            return true;
        }
        return false;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // java.security.cert.X509CRLEntry
    public int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = super.hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    @Override // java.security.cert.X509CRLEntry
    public String toString() {
        Object u;
        StringBuffer stringBuffer = new StringBuffer();
        String d = a0b.d();
        stringBuffer.append("      userCertificate: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(d);
        stringBuffer.append("       revocationDate: ");
        stringBuffer.append(getRevocationDate());
        stringBuffer.append(d);
        stringBuffer.append("       certificateIssuer: ");
        stringBuffer.append(getCertificateIssuer());
        stringBuffer.append(d);
        rn3 t = this.c.t();
        if (t != null) {
            Enumeration v = t.v();
            if (v.hasMoreElements()) {
                String str = "   crlEntryExtensions:";
                loop0: while (true) {
                    stringBuffer.append(str);
                    while (true) {
                        stringBuffer.append(d);
                        while (v.hasMoreElements()) {
                            k kVar = (k) v.nextElement();
                            on3 t2 = t.t(kVar);
                            if (t2.v() != null) {
                                h hVar = new h(t2.v().F());
                                stringBuffer.append("                       critical(");
                                stringBuffer.append(t2.z());
                                stringBuffer.append(") ");
                                try {
                                    if (kVar.x(on3.l)) {
                                        u = fl0.t(e.E(hVar.l()));
                                    } else if (kVar.x(on3.q)) {
                                        stringBuffer.append("Certificate issuer: ");
                                        u = gd4.u(hVar.l());
                                    } else {
                                        stringBuffer.append(kVar.H());
                                        stringBuffer.append(" value = ");
                                        stringBuffer.append(g0.c(hVar.l()));
                                        stringBuffer.append(d);
                                    }
                                    stringBuffer.append(u);
                                    stringBuffer.append(d);
                                } catch (Exception unused) {
                                    stringBuffer.append(kVar.H());
                                    stringBuffer.append(" value = ");
                                    str = "*****";
                                }
                            }
                        }
                    }
                }
            }
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public X509CRLEntryObject(i5b.b bVar, boolean z, t9c t9cVar) {
        this.c = bVar;
        this.certificateIssuer = loadCertificateIssuer(z, t9cVar);
    }
}
