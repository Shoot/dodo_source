package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
/* loaded from: classes3.dex */
public class BCDSAPublicKey implements DSAPublicKey {
    private static BigInteger ZERO = BigInteger.valueOf(0);
    private static final long serialVersionUID = 1752452449903495175L;
    private transient DSAParams dsaSpec;
    private transient e82 lwKeyParams;
    private BigInteger y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDSAPublicKey(e82 e82Var) {
        this.y = e82Var.c();
        this.dsaSpec = e82Var.b() != null ? new DSAParameterSpec(e82Var.b().b(), e82Var.b().c(), e82Var.b().a()) : null;
        this.lwKeyParams = e82Var;
    }

    private boolean isNotNull(h0 h0Var) {
        if (h0Var != null && !q0.a.x(h0Var.f())) {
            return true;
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        BigInteger bigInteger = (BigInteger) objectInputStream.readObject();
        if (bigInteger.equals(ZERO)) {
            this.dsaSpec = null;
        } else {
            this.dsaSpec = new DSAParameterSpec(bigInteger, (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        }
        this.lwKeyParams = new e82(this.y, DSAUtil.toDSAParameters(this.dsaSpec));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        BigInteger g;
        objectOutputStream.defaultWriteObject();
        DSAParams dSAParams = this.dsaSpec;
        if (dSAParams == null) {
            g = ZERO;
        } else {
            objectOutputStream.writeObject(dSAParams.getP());
            objectOutputStream.writeObject(this.dsaSpec.getQ());
            g = this.dsaSpec.getG();
        }
        objectOutputStream.writeObject(g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e82 engineGetKeyParameters() {
        return this.lwKeyParams;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        if (this.dsaSpec != null) {
            if (!getY().equals(dSAPublicKey.getY()) || dSAPublicKey.getParams() == null || !getParams().getG().equals(dSAPublicKey.getParams().getG()) || !getParams().getP().equals(dSAPublicKey.getParams().getP()) || !getParams().getQ().equals(dSAPublicKey.getParams().getQ())) {
                return false;
            }
            return true;
        } else if (!getY().equals(dSAPublicKey.getY()) || dSAPublicKey.getParams() != null) {
            return false;
        } else {
            return true;
        }
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        DSAParams dSAParams = this.dsaSpec;
        if (dSAParams == null) {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new eb(oac.m4), new i(this.y));
        }
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new eb(oac.m4, new z72(dSAParams.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG()).f()), new i(this.y));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.DSAKey
    public DSAParams getParams() {
        return this.dsaSpec;
    }

    @Override // java.security.interfaces.DSAPublicKey
    public BigInteger getY() {
        return this.y;
    }

    public int hashCode() {
        if (this.dsaSpec != null) {
            return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
        }
        return getY().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d = a0b.d();
        stringBuffer.append("DSA Public Key [");
        stringBuffer.append(DSAUtil.generateKeyFingerprint(this.y, getParams()));
        stringBuffer.append("]");
        stringBuffer.append(d);
        stringBuffer.append("            Y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(d);
        return stringBuffer.toString();
    }

    public BCDSAPublicKey(b1b b1bVar) {
        try {
            this.y = ((i) b1bVar.w()).G();
            if (isNotNull(b1bVar.t().w())) {
                z72 u = z72.u(b1bVar.t().w());
                this.dsaSpec = new DSAParameterSpec(u.v(), u.w(), u.t());
            } else {
                this.dsaSpec = null;
            }
            this.lwKeyParams = new e82(this.y, DSAUtil.toDSAParameters(this.dsaSpec));
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDSAPublicKey(DSAPublicKey dSAPublicKey) {
        this.y = dSAPublicKey.getY();
        this.dsaSpec = dSAPublicKey.getParams();
        this.lwKeyParams = new e82(this.y, DSAUtil.toDSAParameters(this.dsaSpec));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
        this.y = dSAPublicKeySpec.getY();
        this.dsaSpec = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
        this.lwKeyParams = new e82(this.y, DSAUtil.toDSAParameters(this.dsaSpec));
    }
}
