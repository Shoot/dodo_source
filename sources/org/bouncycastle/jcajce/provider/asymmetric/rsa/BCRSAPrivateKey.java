package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
/* loaded from: classes3.dex */
public class BCRSAPrivateKey implements RSAPrivateKey, rn7 {
    private static BigInteger ZERO = BigInteger.valueOf(0);
    static final long serialVersionUID = 5110188922551353628L;
    protected transient eb algorithmIdentifier;
    private byte[] algorithmIdentifierEnc;
    protected transient PKCS12BagAttributeCarrierImpl attrCarrier;
    protected BigInteger modulus;
    protected BigInteger privateExponent;
    protected transient n39 rsaPrivateKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPrivateKey(eb ebVar, n39 n39Var) {
        eb ebVar2 = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(ebVar2);
        this.algorithmIdentifier = ebVar2;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithmIdentifier = ebVar;
        this.algorithmIdentifierEnc = getEncoding(ebVar);
        this.modulus = n39Var.c();
        this.privateExponent = n39Var.b();
        this.rsaPrivateKey = n39Var;
    }

    private static byte[] getEncoding(eb ebVar) {
        try {
            return ebVar.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        if (this.algorithmIdentifierEnc == null) {
            this.algorithmIdentifierEnc = getEncoding(BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER);
        }
        this.algorithmIdentifier = eb.u(this.algorithmIdentifierEnc);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.rsaPrivateKey = new n39(true, this.modulus, this.privateExponent);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n39 engineGetKeyParameters() {
        return this.rsaPrivateKey;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RSAPrivateKey)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) obj;
        if (!getModulus().equals(rSAPrivateKey.getModulus()) || !getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent())) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        if (this.algorithmIdentifier.t().x(co7.d0)) {
            return "RSASSA-PSS";
        }
        return "RSA";
    }

    @Override // defpackage.rn7
    public h0 getBagAttribute(k kVar) {
        return this.attrCarrier.getBagAttribute(kVar);
    }

    @Override // defpackage.rn7
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        eb ebVar = this.algorithmIdentifier;
        BigInteger modulus = getModulus();
        BigInteger bigInteger = ZERO;
        BigInteger privateExponent = getPrivateExponent();
        BigInteger bigInteger2 = ZERO;
        return KeyUtil.getEncodedPrivateKeyInfo(ebVar, new p39(modulus, bigInteger, privateExponent, bigInteger2, bigInteger2, bigInteger2, bigInteger2, bigInteger2));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        return this.modulus;
    }

    @Override // java.security.interfaces.RSAPrivateKey
    public BigInteger getPrivateExponent() {
        return this.privateExponent;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPrivateExponent().hashCode();
    }

    @Override // defpackage.rn7
    public void setBagAttribute(k kVar, h0 h0Var) {
        this.attrCarrier.setBagAttribute(kVar, h0Var);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d = a0b.d();
        stringBuffer.append("RSA Private Key [");
        stringBuffer.append(RSAUtil.generateKeyFingerprint(getModulus()));
        stringBuffer.append("],[]");
        stringBuffer.append(d);
        stringBuffer.append("            modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(d);
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPrivateKey(eb ebVar, p39 p39Var) {
        eb ebVar2 = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(ebVar2);
        this.algorithmIdentifier = ebVar2;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithmIdentifier = ebVar;
        this.algorithmIdentifierEnc = getEncoding(ebVar);
        this.modulus = p39Var.x();
        this.privateExponent = p39Var.B();
        this.rsaPrivateKey = new n39(true, this.modulus, this.privateExponent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPrivateKey(n39 n39Var) {
        eb ebVar = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(ebVar);
        this.algorithmIdentifier = ebVar;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.modulus = n39Var.c();
        this.privateExponent = n39Var.b();
        this.rsaPrivateKey = n39Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPrivateKey(RSAPrivateKey rSAPrivateKey) {
        eb ebVar = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(ebVar);
        this.algorithmIdentifier = ebVar;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.modulus = rSAPrivateKey.getModulus();
        this.privateExponent = rSAPrivateKey.getPrivateExponent();
        this.rsaPrivateKey = new n39(true, this.modulus, this.privateExponent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPrivateKey(RSAPrivateKeySpec rSAPrivateKeySpec) {
        eb ebVar = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(ebVar);
        this.algorithmIdentifier = ebVar;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.modulus = rSAPrivateKeySpec.getModulus();
        this.privateExponent = rSAPrivateKeySpec.getPrivateExponent();
        this.rsaPrivateKey = new n39(true, this.modulus, this.privateExponent);
    }
}
