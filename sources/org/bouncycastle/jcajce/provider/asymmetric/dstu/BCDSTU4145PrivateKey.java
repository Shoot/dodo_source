package org.bouncycastle.jcajce.provider.asymmetric.dstu;

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
public class BCDSTU4145PrivateKey implements ECPrivateKey, lb3, rn7 {
    static final long serialVersionUID = 7245981689601667138L;
    private String algorithm;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient j0 publicKey;
    private boolean withCompression;

    protected BCDSTU4145PrivateKey() {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private j0 getPublicKeyDetails(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        try {
            return b1b.u(n.z(bCDSTU4145PublicKey.getEncoded())).v();
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void populateFromPrivKeyInfo(defpackage.dk8 r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey.populateFromPrivKeyInfo(dk8):void");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        populateFromPrivKeyInfo(dk8.u(n.z((byte[]) objectInputStream.readObject())));
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void reverseBytes(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
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
        if (!(obj instanceof BCDSTU4145PrivateKey)) {
            return false;
        }
        BCDSTU4145PrivateKey bCDSTU4145PrivateKey = (BCDSTU4145PrivateKey) obj;
        if (!getD().equals(bCDSTU4145PrivateKey.getD()) || !engineGetSpec().equals(bCDSTU4145PrivateKey.engineGetSpec())) {
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad A[Catch: IOException -> 0x00dd, TryCatch #0 {IOException -> 0x00dd, blocks: (B:16:0x00a3, B:18:0x00ad, B:20:0x00d6, B:19:0x00c2), top: B:23:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c2 A[Catch: IOException -> 0x00dd, TryCatch #0 {IOException -> 0x00dd, blocks: (B:16:0x00a3, B:18:0x00ad, B:20:0x00d6, B:19:0x00c2), top: B:23:0x00a3 }] */
    @Override // java.security.Key
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] getEncoded() {
        /*
            r9 = this;
            java.security.spec.ECParameterSpec r0 = r9.ecSpec
            boolean r1 = r0 instanceof defpackage.fb3
            r2 = 0
            if (r1 == 0) goto L36
            fb3 r0 = (defpackage.fb3) r0
            java.lang.String r0 = r0.c()
            org.bouncycastle.asn1.k r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveOid(r0)
            if (r0 != 0) goto L20
            org.bouncycastle.asn1.k r0 = new org.bouncycastle.asn1.k
            java.security.spec.ECParameterSpec r1 = r9.ecSpec
            fb3 r1 = (defpackage.fb3) r1
            java.lang.String r1 = r1.c()
            r0.<init>(r1)
        L20:
            gac r1 = new gac
            r1.<init>(r0)
        L25:
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = defpackage.ff0.b
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            java.math.BigInteger r3 = r3.getOrder()
            java.math.BigInteger r4 = r9.getS()
            int r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r0, r3, r4)
            goto L8a
        L36:
            if (r0 != 0) goto L4a
            gac r1 = new gac
            org.bouncycastle.asn1.q0 r0 = org.bouncycastle.asn1.q0.a
            r1.<init>(r0)
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = defpackage.ff0.b
            java.math.BigInteger r3 = r9.getS()
            int r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r0, r2, r3)
            goto L8a
        L4a:
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            ea3 r4 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r0)
            iac r0 = new iac
            kac r5 = new kac
            java.security.spec.ECParameterSpec r1 = r9.ecSpec
            java.security.spec.ECPoint r1 = r1.getGenerator()
            jb3 r1 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r4, r1)
            boolean r3 = r9.withCompression
            r5.<init>(r1, r3)
            java.security.spec.ECParameterSpec r1 = r9.ecSpec
            java.math.BigInteger r6 = r1.getOrder()
            java.security.spec.ECParameterSpec r1 = r9.ecSpec
            int r1 = r1.getCofactor()
            long r7 = (long) r1
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r7)
            java.security.spec.ECParameterSpec r1 = r9.ecSpec
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            byte[] r8 = r1.getSeed()
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            gac r1 = new gac
            r1.<init>(r0)
            goto L25
        L8a:
            org.bouncycastle.asn1.j0 r3 = r9.publicKey
            if (r3 == 0) goto L9a
            mb3 r3 = new mb3
            java.math.BigInteger r4 = r9.getS()
            org.bouncycastle.asn1.j0 r5 = r9.publicKey
            r3.<init>(r0, r4, r5, r1)
            goto La3
        L9a:
            mb3 r3 = new mb3
            java.math.BigInteger r4 = r9.getS()
            r3.<init>(r0, r4, r1)
        La3:
            java.lang.String r0 = r9.algorithm     // Catch: java.io.IOException -> Ldd
            java.lang.String r4 = "DSTU4145"
            boolean r0 = r0.equals(r4)     // Catch: java.io.IOException -> Ldd
            if (r0 == 0) goto Lc2
            dk8 r0 = new dk8     // Catch: java.io.IOException -> Ldd
            eb r4 = new eb     // Catch: java.io.IOException -> Ldd
            org.bouncycastle.asn1.k r5 = defpackage.hpb.c     // Catch: java.io.IOException -> Ldd
            org.bouncycastle.asn1.n r1 = r1.f()     // Catch: java.io.IOException -> Ldd
            r4.<init>(r5, r1)     // Catch: java.io.IOException -> Ldd
            org.bouncycastle.asn1.n r1 = r3.f()     // Catch: java.io.IOException -> Ldd
            r0.<init>(r4, r1)     // Catch: java.io.IOException -> Ldd
            goto Ld6
        Lc2:
            dk8 r0 = new dk8     // Catch: java.io.IOException -> Ldd
            eb r4 = new eb     // Catch: java.io.IOException -> Ldd
            org.bouncycastle.asn1.k r5 = defpackage.oac.C3     // Catch: java.io.IOException -> Ldd
            org.bouncycastle.asn1.n r1 = r1.f()     // Catch: java.io.IOException -> Ldd
            r4.<init>(r5, r1)     // Catch: java.io.IOException -> Ldd
            org.bouncycastle.asn1.n r1 = r3.f()     // Catch: java.io.IOException -> Ldd
            r0.<init>(r4, r1)     // Catch: java.io.IOException -> Ldd
        Ld6:
            java.lang.String r1 = "DER"
            byte[] r0 = r0.p(r1)     // Catch: java.io.IOException -> Ldd
            return r0
        Ldd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey.getEncoded():byte[]");
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

    public BCDSTU4145PrivateKey(ob3 ob3Var) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = ob3Var.b();
        this.ecSpec = ob3Var.a() != null ? EC5Util.convertSpec(EC5Util.convertCurve(ob3Var.a().a(), ob3Var.a().e()), ob3Var.a()) : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDSTU4145PrivateKey(dk8 dk8Var) throws IOException {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        populateFromPrivKeyInfo(dk8Var);
    }

    public BCDSTU4145PrivateKey(String str, nb3 nb3Var) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = nb3Var.c();
        this.ecSpec = null;
    }

    public BCDSTU4145PrivateKey(String str, nb3 nb3Var, BCDSTU4145PublicKey bCDSTU4145PublicKey, ib3 ib3Var) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        la3 b = nb3Var.b();
        this.algorithm = str;
        this.d = nb3Var.c();
        this.ecSpec = ib3Var == null ? new ECParameterSpec(EC5Util.convertCurve(b.a(), b.f()), EC5Util.convertPoint(b.b()), b.e(), b.c().intValue()) : new ECParameterSpec(EC5Util.convertCurve(ib3Var.a(), ib3Var.e()), EC5Util.convertPoint(ib3Var.b()), ib3Var.d(), ib3Var.c().intValue());
        this.publicKey = getPublicKeyDetails(bCDSTU4145PublicKey);
    }

    public BCDSTU4145PrivateKey(String str, nb3 nb3Var, BCDSTU4145PublicKey bCDSTU4145PublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        la3 b = nb3Var.b();
        this.algorithm = str;
        this.d = nb3Var.c();
        if (eCParameterSpec == null) {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(b.a(), b.f()), EC5Util.convertPoint(b.b()), b.e(), b.c().intValue());
        } else {
            this.ecSpec = eCParameterSpec;
        }
        this.publicKey = getPublicKeyDetails(bCDSTU4145PublicKey);
    }

    public BCDSTU4145PrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public BCDSTU4145PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public BCDSTU4145PrivateKey(BCDSTU4145PrivateKey bCDSTU4145PrivateKey) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = bCDSTU4145PrivateKey.d;
        this.ecSpec = bCDSTU4145PrivateKey.ecSpec;
        this.withCompression = bCDSTU4145PrivateKey.withCompression;
        this.attrCarrier = bCDSTU4145PrivateKey.attrCarrier;
        this.publicKey = bCDSTU4145PrivateKey.publicKey;
    }
}
