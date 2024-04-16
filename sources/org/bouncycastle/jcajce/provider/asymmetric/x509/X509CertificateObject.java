package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.util.Date;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
/* loaded from: classes3.dex */
class X509CertificateObject extends X509CertificateImpl implements rn7 {
    private rn7 attrCarrier;
    private final Object cacheLock;
    private volatile int hashValue;
    private volatile boolean hashValueSet;
    private X509CertificateInternal internalCertificateValue;
    private X500Principal issuerValue;
    private PublicKey publicKeyValue;
    private X500Principal subjectValue;
    private long[] validityValues;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class X509CertificateEncodingException extends CertificateEncodingException {
        private final Throwable cause;

        X509CertificateEncodingException(Throwable th) {
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public X509CertificateObject(d95 d95Var, bu0 bu0Var) throws CertificateParsingException {
        super(d95Var, bu0Var, createBasicConstraints(bu0Var), createKeyUsage(bu0Var), createSigAlgName(bu0Var), createSigAlgParams(bu0Var));
        this.cacheLock = new Object();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private static b90 createBasicConstraints(bu0 bu0Var) throws CertificateParsingException {
        try {
            byte[] extensionOctets = X509CertificateImpl.getExtensionOctets(bu0Var, "2.5.29.19");
            if (extensionOctets == null) {
                return null;
            }
            return b90.t(n.z(extensionOctets));
        } catch (Exception e) {
            throw new CertificateParsingException("cannot construct BasicConstraints: " + e);
        }
    }

    private static boolean[] createKeyUsage(bu0 bu0Var) throws CertificateParsingException {
        boolean z;
        try {
            byte[] extensionOctets = X509CertificateImpl.getExtensionOctets(bu0Var, "2.5.29.15");
            if (extensionOctets == null) {
                return null;
            }
            j0 I = j0.I(n.z(extensionOctets));
            byte[] E = I.E();
            int length = (E.length * 8) - I.G();
            int i = 9;
            if (length >= 9) {
                i = length;
            }
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 != length; i2++) {
                if ((E[i2 / 8] & (128 >>> (i2 % 8))) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                zArr[i2] = z;
            }
            return zArr;
        } catch (Exception e) {
            throw new CertificateParsingException("cannot construct KeyUsage: " + e);
        }
    }

    private static String createSigAlgName(bu0 bu0Var) throws CertificateParsingException {
        try {
            return X509SignatureUtil.getSignatureName(bu0Var.z());
        } catch (Exception e) {
            throw new CertificateParsingException("cannot construct SigAlgName: " + e);
        }
    }

    private static byte[] createSigAlgParams(bu0 bu0Var) throws CertificateParsingException {
        try {
            h0 w = bu0Var.z().w();
            if (w == null) {
                return null;
            }
            return w.f().p("DER");
        } catch (Exception e) {
            throw new CertificateParsingException("cannot construct SigAlgParams: " + e);
        }
    }

    private X509CertificateInternal getInternalCertificate() {
        byte[] bArr;
        X509CertificateEncodingException x509CertificateEncodingException;
        X509CertificateInternal x509CertificateInternal;
        synchronized (this.cacheLock) {
            try {
                X509CertificateInternal x509CertificateInternal2 = this.internalCertificateValue;
                if (x509CertificateInternal2 != null) {
                    return x509CertificateInternal2;
                }
                try {
                    x509CertificateEncodingException = null;
                    bArr = this.c.p("DER");
                } catch (IOException e) {
                    bArr = null;
                    x509CertificateEncodingException = new X509CertificateEncodingException(e);
                }
                X509CertificateInternal x509CertificateInternal3 = new X509CertificateInternal(this.bcHelper, this.c, this.basicConstraints, this.keyUsage, this.sigAlgName, this.sigAlgParams, bArr, x509CertificateEncodingException);
                synchronized (this.cacheLock) {
                    try {
                        if (this.internalCertificateValue == null) {
                            this.internalCertificateValue = x509CertificateInternal3;
                        }
                        x509CertificateInternal = this.internalCertificateValue;
                    } finally {
                    }
                }
                return x509CertificateInternal;
            } finally {
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        long time = date.getTime();
        long[] validityValues = getValidityValues();
        if (time <= validityValues[1]) {
            if (time >= validityValues[0]) {
                return;
            }
            throw new CertificateNotYetValidException("certificate not valid till " + this.c.A().v());
        }
        throw new CertificateExpiredException("certificate expired on " + this.c.t().v());
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        X509CertificateInternal internalCertificate;
        j0 x;
        if (obj == this) {
            return true;
        }
        if (obj instanceof X509CertificateObject) {
            X509CertificateObject x509CertificateObject = (X509CertificateObject) obj;
            if (this.hashValueSet && x509CertificateObject.hashValueSet) {
                if (this.hashValue != x509CertificateObject.hashValue) {
                    return false;
                }
            } else if ((this.internalCertificateValue == null || x509CertificateObject.internalCertificateValue == null) && (x = this.c.x()) != null && !x.x(x509CertificateObject.c.x())) {
                return false;
            }
            internalCertificate = getInternalCertificate();
            obj = x509CertificateObject.getInternalCertificate();
        } else {
            internalCertificate = getInternalCertificate();
        }
        return internalCertificate.equals(obj);
    }

    @Override // defpackage.rn7
    public h0 getBagAttribute(k kVar) {
        return this.attrCarrier.getBagAttribute(kVar);
    }

    @Override // defpackage.rn7
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        return tr.h(getInternalCertificate().getEncoded());
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        X500Principal x500Principal;
        synchronized (this.cacheLock) {
            try {
                X500Principal x500Principal2 = this.issuerValue;
                if (x500Principal2 != null) {
                    return x500Principal2;
                }
                X500Principal issuerX500Principal = super.getIssuerX500Principal();
                synchronized (this.cacheLock) {
                    try {
                        if (this.issuerValue == null) {
                            this.issuerValue = issuerX500Principal;
                        }
                        x500Principal = this.issuerValue;
                    } finally {
                    }
                }
                return x500Principal;
            } finally {
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.Certificate
    public PublicKey getPublicKey() {
        PublicKey publicKey;
        synchronized (this.cacheLock) {
            try {
                PublicKey publicKey2 = this.publicKeyValue;
                if (publicKey2 != null) {
                    return publicKey2;
                }
                PublicKey publicKey3 = super.getPublicKey();
                if (publicKey3 == null) {
                    return null;
                }
                synchronized (this.cacheLock) {
                    try {
                        if (this.publicKeyValue == null) {
                            this.publicKeyValue = publicKey3;
                        }
                        publicKey = this.publicKeyValue;
                    } finally {
                    }
                }
                return publicKey;
            } finally {
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        X500Principal x500Principal;
        synchronized (this.cacheLock) {
            try {
                X500Principal x500Principal2 = this.subjectValue;
                if (x500Principal2 != null) {
                    return x500Principal2;
                }
                X500Principal subjectX500Principal = super.getSubjectX500Principal();
                synchronized (this.cacheLock) {
                    try {
                        if (this.subjectValue == null) {
                            this.subjectValue = subjectX500Principal;
                        }
                        x500Principal = this.subjectValue;
                    } finally {
                    }
                }
                return x500Principal;
            } finally {
            }
        }
    }

    public long[] getValidityValues() {
        long[] jArr;
        synchronized (this.cacheLock) {
            try {
                long[] jArr2 = this.validityValues;
                if (jArr2 != null) {
                    return jArr2;
                }
                long[] jArr3 = {super.getNotBefore().getTime(), super.getNotAfter().getTime()};
                synchronized (this.cacheLock) {
                    try {
                        if (this.validityValues == null) {
                            this.validityValues = jArr3;
                        }
                        jArr = this.validityValues;
                    } finally {
                    }
                }
                return jArr;
            } finally {
            }
        }
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = getInternalCertificate().hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    public int originalHashCode() {
        try {
            byte[] encoded = getInternalCertificate().getEncoded();
            int i = 0;
            for (int i2 = 1; i2 < encoded.length; i2++) {
                i += encoded[i2] * i2;
            }
            return i;
        } catch (CertificateEncodingException unused) {
            return 0;
        }
    }

    @Override // defpackage.rn7
    public void setBagAttribute(k kVar, h0 h0Var) {
        this.attrCarrier.setBagAttribute(kVar, h0Var);
    }
}
