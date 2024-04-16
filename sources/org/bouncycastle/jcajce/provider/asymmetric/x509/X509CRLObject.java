package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.IOException;
import java.security.cert.CRLException;
import org.bouncycastle.asn1.j0;
/* loaded from: classes3.dex */
class X509CRLObject extends X509CRLImpl {
    private final Object cacheLock;
    private volatile int hashValue;
    private volatile boolean hashValueSet;
    private X509CRLInternal internalCRLValue;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class X509CRLException extends CRLException {
        private final Throwable cause;

        X509CRLException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        X509CRLException(Throwable th) {
            this.cause = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public X509CRLObject(d95 d95Var, fu0 fu0Var) throws CRLException {
        super(d95Var, fu0Var, createSigAlgName(fu0Var), createSigAlgParams(fu0Var), isIndirectCRL(fu0Var));
        this.cacheLock = new Object();
    }

    private static String createSigAlgName(fu0 fu0Var) throws CRLException {
        try {
            return X509SignatureUtil.getSignatureName(fu0Var.z());
        } catch (Exception e) {
            throw new X509CRLException("CRL contents invalid: " + e.getMessage(), e);
        }
    }

    private static byte[] createSigAlgParams(fu0 fu0Var) throws CRLException {
        try {
            h0 w = fu0Var.z().w();
            if (w == null) {
                return null;
            }
            return w.f().p("DER");
        } catch (Exception e) {
            throw new CRLException("CRL contents invalid: " + e);
        }
    }

    private X509CRLInternal getInternalCRL() {
        byte[] bArr;
        X509CRLException x509CRLException;
        X509CRLInternal x509CRLInternal;
        synchronized (this.cacheLock) {
            try {
                X509CRLInternal x509CRLInternal2 = this.internalCRLValue;
                if (x509CRLInternal2 != null) {
                    return x509CRLInternal2;
                }
                try {
                    x509CRLException = null;
                    bArr = this.c.p("DER");
                } catch (IOException e) {
                    bArr = null;
                    x509CRLException = new X509CRLException(e);
                }
                X509CRLInternal x509CRLInternal3 = new X509CRLInternal(this.bcHelper, this.c, this.sigAlgName, this.sigAlgParams, this.isIndirect, bArr, x509CRLException);
                synchronized (this.cacheLock) {
                    try {
                        if (this.internalCRLValue == null) {
                            this.internalCRLValue = x509CRLInternal3;
                        }
                        x509CRLInternal = this.internalCRLValue;
                    } finally {
                    }
                }
                return x509CRLInternal;
            } finally {
            }
        }
    }

    private static boolean isIndirectCRL(fu0 fu0Var) throws CRLException {
        try {
            byte[] extensionOctets = X509CRLImpl.getExtensionOctets(fu0Var, on3.p.H());
            if (extensionOctets == null) {
                return false;
            }
            return x75.v(extensionOctets).w();
        } catch (Exception e) {
            throw new ExtCRLException("Exception reading IssuingDistributionPoint", e);
        }
    }

    @Override // java.security.cert.X509CRL
    public boolean equals(Object obj) {
        X509CRLInternal internalCRL;
        j0 x;
        if (this == obj) {
            return true;
        }
        if (obj instanceof X509CRLObject) {
            X509CRLObject x509CRLObject = (X509CRLObject) obj;
            if (this.hashValueSet && x509CRLObject.hashValueSet) {
                if (this.hashValue != x509CRLObject.hashValue) {
                    return false;
                }
            } else if ((this.internalCRLValue == null || x509CRLObject.internalCRLValue == null) && (x = this.c.x()) != null && !x.x(x509CRLObject.c.x())) {
                return false;
            }
            internalCRL = getInternalCRL();
            obj = x509CRLObject.getInternalCRL();
        } else {
            internalCRL = getInternalCRL();
        }
        return internalCRL.equals(obj);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() throws CRLException {
        return tr.h(getInternalCRL().getEncoded());
    }

    @Override // java.security.cert.X509CRL
    public int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = getInternalCRL().hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }
}
