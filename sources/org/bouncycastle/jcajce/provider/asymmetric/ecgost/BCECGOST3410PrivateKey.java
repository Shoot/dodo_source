package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
/* loaded from: classes3.dex */
public class BCECGOST3410PrivateKey implements ECPrivateKey, lb3, rn7 {
    static final long serialVersionUID = 7245981689601667138L;
    private String algorithm;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient h0 gostParams;
    private transient j0 publicKey;
    private boolean withCompression;

    protected BCECGOST3410PrivateKey() {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void extractBytes(byte[] bArr, int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i2 = 0; i2 != 32; i2++) {
            bArr[i + i2] = byteArray[(byteArray.length - 1) - i2];
        }
    }

    private j0 getPublicKeyDetails(BCECGOST3410PublicKey bCECGOST3410PublicKey) {
        try {
            return b1b.u(n.z(bCECGOST3410PublicKey.getEncoded())).v();
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void populateFromPrivKeyInfo(defpackage.dk8 r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey.populateFromPrivKeyInfo(dk8):void");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        populateFromPrivKeyInfo(dk8.u(n.z((byte[]) objectInputStream.readObject())));
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    ib3 engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec != null) {
            return EC5Util.convertSpec(eCParameterSpec);
        }
        return ff0.b.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410PrivateKey)) {
            return false;
        }
        BCECGOST3410PrivateKey bCECGOST3410PrivateKey = (BCECGOST3410PrivateKey) obj;
        if (!getD().equals(bCECGOST3410PrivateKey.getD()) || !engineGetSpec().equals(bCECGOST3410PrivateKey.engineGetSpec())) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // defpackage.rn7
    public h0 getBagAttribute(k kVar) {
        return this.attrCarrier.getBagAttribute(kVar);
    }

    @Override // defpackage.rn7
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // defpackage.lb3
    public BigInteger getD() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5  */
    @Override // java.security.Key
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] getEncoded() {
        /*
            r9 = this;
            h0 r0 = r9.gostParams
            java.lang.String r1 = "DER"
            r2 = 0
            if (r0 == 0) goto L2c
            r0 = 32
            byte[] r0 = new byte[r0]
            r3 = 0
            java.math.BigInteger r4 = r9.getS()
            r9.extractBytes(r0, r3, r4)
            dk8 r3 = new dk8     // Catch: java.io.IOException -> L2b
            eb r4 = new eb     // Catch: java.io.IOException -> L2b
            org.bouncycastle.asn1.k r5 = defpackage.y22.m     // Catch: java.io.IOException -> L2b
            h0 r6 = r9.gostParams     // Catch: java.io.IOException -> L2b
            r4.<init>(r5, r6)     // Catch: java.io.IOException -> L2b
            org.bouncycastle.asn1.s0 r5 = new org.bouncycastle.asn1.s0     // Catch: java.io.IOException -> L2b
            r5.<init>(r0)     // Catch: java.io.IOException -> L2b
            r3.<init>(r4, r5)     // Catch: java.io.IOException -> L2b
            byte[] r0 = r3.p(r1)     // Catch: java.io.IOException -> L2b
            return r0
        L2b:
            return r2
        L2c:
            java.security.spec.ECParameterSpec r0 = r9.ecSpec
            boolean r3 = r0 instanceof defpackage.fb3
            if (r3 == 0) goto L61
            fb3 r0 = (defpackage.fb3) r0
            java.lang.String r0 = r0.c()
            org.bouncycastle.asn1.k r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveOid(r0)
            if (r0 != 0) goto L4b
            org.bouncycastle.asn1.k r0 = new org.bouncycastle.asn1.k
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            fb3 r3 = (defpackage.fb3) r3
            java.lang.String r3 = r3.c()
            r0.<init>(r3)
        L4b:
            gac r3 = new gac
            r3.<init>(r0)
        L50:
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = defpackage.ff0.b
            java.security.spec.ECParameterSpec r4 = r9.ecSpec
            java.math.BigInteger r4 = r4.getOrder()
            java.math.BigInteger r5 = r9.getS()
            int r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r0, r4, r5)
            goto Lb5
        L61:
            if (r0 != 0) goto L75
            gac r3 = new gac
            org.bouncycastle.asn1.q0 r0 = org.bouncycastle.asn1.q0.a
            r3.<init>(r0)
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = defpackage.ff0.b
            java.math.BigInteger r4 = r9.getS()
            int r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r0, r2, r4)
            goto Lb5
        L75:
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            ea3 r4 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r0)
            iac r0 = new iac
            kac r5 = new kac
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            java.security.spec.ECPoint r3 = r3.getGenerator()
            jb3 r3 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r4, r3)
            boolean r6 = r9.withCompression
            r5.<init>(r3, r6)
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            java.math.BigInteger r6 = r3.getOrder()
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            int r3 = r3.getCofactor()
            long r7 = (long) r3
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r7)
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            java.security.spec.EllipticCurve r3 = r3.getCurve()
            byte[] r8 = r3.getSeed()
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            gac r3 = new gac
            r3.<init>(r0)
            goto L50
        Lb5:
            org.bouncycastle.asn1.j0 r4 = r9.publicKey
            if (r4 == 0) goto Lc5
            mb3 r4 = new mb3
            java.math.BigInteger r5 = r9.getS()
            org.bouncycastle.asn1.j0 r6 = r9.publicKey
            r4.<init>(r0, r5, r6, r3)
            goto Lce
        Lc5:
            mb3 r4 = new mb3
            java.math.BigInteger r5 = r9.getS()
            r4.<init>(r0, r5, r3)
        Lce:
            dk8 r0 = new dk8     // Catch: java.io.IOException -> Le7
            eb r5 = new eb     // Catch: java.io.IOException -> Le7
            org.bouncycastle.asn1.k r6 = defpackage.y22.m     // Catch: java.io.IOException -> Le7
            org.bouncycastle.asn1.n r3 = r3.f()     // Catch: java.io.IOException -> Le7
            r5.<init>(r6, r3)     // Catch: java.io.IOException -> Le7
            org.bouncycastle.asn1.n r3 = r4.f()     // Catch: java.io.IOException -> Le7
            r0.<init>(r5, r3)     // Catch: java.io.IOException -> Le7
            byte[] r0 = r0.p(r1)     // Catch: java.io.IOException -> Le7
            return r0
        Le7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey.getEncoded():byte[]");
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // defpackage.ua3
    public ib3 getParameters() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.d;
    }

    public int hashCode() {
        return getD().hashCode() ^ engineGetSpec().hashCode();
    }

    @Override // defpackage.rn7
    public void setBagAttribute(k kVar, h0 h0Var) {
        this.attrCarrier.setBagAttribute(kVar, h0Var);
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.privateKeyToString(this.algorithm, this.d, engineGetSpec());
    }

    public BCECGOST3410PrivateKey(ob3 ob3Var) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = ob3Var.b();
        this.ecSpec = ob3Var.a() != null ? EC5Util.convertSpec(EC5Util.convertCurve(ob3Var.a().a(), ob3Var.a().e()), ob3Var.a()) : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCECGOST3410PrivateKey(dk8 dk8Var) throws IOException {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        populateFromPrivKeyInfo(dk8Var);
    }

    public BCECGOST3410PrivateKey(String str, nb3 nb3Var) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = nb3Var.c();
        this.ecSpec = null;
    }

    public BCECGOST3410PrivateKey(String str, nb3 nb3Var, BCECGOST3410PublicKey bCECGOST3410PublicKey, ib3 ib3Var) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = nb3Var.c();
        if (ib3Var == null) {
            la3 b = nb3Var.b();
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(b.a(), b.f()), EC5Util.convertPoint(b.b()), b.e(), b.c().intValue());
        } else {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(ib3Var.a(), ib3Var.e()), EC5Util.convertPoint(ib3Var.b()), ib3Var.d(), ib3Var.c().intValue());
        }
        this.gostParams = bCECGOST3410PublicKey.getGostParams();
        this.publicKey = getPublicKeyDetails(bCECGOST3410PublicKey);
    }

    public BCECGOST3410PrivateKey(String str, nb3 nb3Var, BCECGOST3410PublicKey bCECGOST3410PublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = nb3Var.c();
        if (eCParameterSpec == null) {
            la3 b = nb3Var.b();
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(b.a(), b.f()), EC5Util.convertPoint(b.b()), b.e(), b.c().intValue());
        }
        this.ecSpec = eCParameterSpec;
        this.gostParams = bCECGOST3410PublicKey.getGostParams();
        this.publicKey = getPublicKeyDetails(bCECGOST3410PublicKey);
    }

    public BCECGOST3410PrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public BCECGOST3410PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public BCECGOST3410PrivateKey(BCECGOST3410PrivateKey bCECGOST3410PrivateKey) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = bCECGOST3410PrivateKey.d;
        this.ecSpec = bCECGOST3410PrivateKey.ecSpec;
        this.withCompression = bCECGOST3410PrivateKey.withCompression;
        this.attrCarrier = bCECGOST3410PrivateKey.attrCarrier;
        this.publicKey = bCECGOST3410PrivateKey.publicKey;
        this.gostParams = bCECGOST3410PrivateKey.gostParams;
    }
}
