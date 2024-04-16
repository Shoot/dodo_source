package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
/* loaded from: classes3.dex */
public class BCRSAPublicKey implements RSAPublicKey {
    static final eb DEFAULT_ALGORITHM_IDENTIFIER = new eb(co7.R, q0.a);
    static final long serialVersionUID = 2675817738516720772L;
    private transient eb algorithmIdentifier;
    private BigInteger modulus;
    private BigInteger publicExponent;
    private transient n39 rsaPublicKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPublicKey(eb ebVar, n39 n39Var) {
        this.algorithmIdentifier = ebVar;
        this.modulus = n39Var.c();
        this.publicExponent = n39Var.b();
        this.rsaPublicKey = n39Var;
    }

    private void populateFromPublicKeyInfo(b1b b1bVar) {
        try {
            q39 t = q39.t(b1bVar.w());
            this.algorithmIdentifier = b1bVar.t();
            this.modulus = t.u();
            this.publicExponent = t.v();
            this.rsaPublicKey = new n39(false, this.modulus, this.publicExponent);
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in RSA public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        try {
            this.algorithmIdentifier = eb.u(objectInputStream.readObject());
        } catch (Exception unused) {
            this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        }
        this.rsaPublicKey = new n39(false, this.modulus, this.publicExponent);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        if (!this.algorithmIdentifier.equals(DEFAULT_ALGORITHM_IDENTIFIER)) {
            objectOutputStream.writeObject(this.algorithmIdentifier.getEncoded());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n39 engineGetKeyParameters() {
        return this.rsaPublicKey;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPublicKey)) {
            return false;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) obj;
        if (getModulus().equals(rSAPublicKey.getModulus()) && getPublicExponent().equals(rSAPublicKey.getPublicExponent())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        if (this.algorithmIdentifier.t().x(co7.d0)) {
            return "RSASSA-PSS";
        }
        return "RSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedSubjectPublicKeyInfo(this.algorithmIdentifier, new q39(getModulus(), getPublicExponent()));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        return this.modulus;
    }

    @Override // java.security.interfaces.RSAPublicKey
    public BigInteger getPublicExponent() {
        return this.publicExponent;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPublicExponent().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d = a0b.d();
        stringBuffer.append("RSA Public Key [");
        stringBuffer.append(RSAUtil.generateKeyFingerprint(getModulus()));
        stringBuffer.append("]");
        stringBuffer.append(",[");
        stringBuffer.append(RSAUtil.generateExponentFingerprint(getPublicExponent()));
        stringBuffer.append("]");
        stringBuffer.append(d);
        stringBuffer.append("        modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(d);
        stringBuffer.append("public exponent: ");
        stringBuffer.append(getPublicExponent().toString(16));
        stringBuffer.append(d);
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPublicKey(n39 n39Var) {
        this(DEFAULT_ALGORITHM_IDENTIFIER, n39Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPublicKey(b1b b1bVar) {
        populateFromPublicKeyInfo(b1bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPublicKey(RSAPublicKey rSAPublicKey) {
        this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        this.modulus = rSAPublicKey.getModulus();
        this.publicExponent = rSAPublicKey.getPublicExponent();
        this.rsaPublicKey = new n39(false, this.modulus, this.publicExponent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPublicKey(RSAPublicKeySpec rSAPublicKeySpec) {
        this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        this.modulus = rSAPublicKeySpec.getModulus();
        this.publicExponent = rSAPublicKeySpec.getPublicExponent();
        this.rsaPublicKey = new n39(false, this.modulus, this.publicExponent);
    }
}
