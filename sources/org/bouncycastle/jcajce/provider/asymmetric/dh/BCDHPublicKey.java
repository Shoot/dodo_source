package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.p;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
/* loaded from: classes3.dex */
public class BCDHPublicKey implements DHPublicKey {
    static final long serialVersionUID = -216691575254424324L;
    private transient l72 dhPublicKey;
    private transient DHParameterSpec dhSpec;
    private transient b1b info;
    private BigInteger y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDHPublicKey(l72 l72Var) {
        this.y = l72Var.c();
        this.dhSpec = new u62(l72Var.b());
        this.dhPublicKey = l72Var;
    }

    private boolean isPKCSParam(p pVar) {
        if (pVar.size() == 2) {
            return true;
        }
        if (pVar.size() > 3) {
            return false;
        }
        if (i.D(pVar.F(2)).G().compareTo(BigInteger.valueOf(i.D(pVar.F(0)).G().bitLength())) <= 0) {
            return true;
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.info = null;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    public l72 engineGetKeyParameters() {
        return this.dhPublicKey;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) obj;
        if (!getY().equals(dHPublicKey.getY()) || !getParams().getG().equals(dHPublicKey.getParams().getG()) || !getParams().getP().equals(dHPublicKey.getParams().getP()) || getParams().getL() != dHPublicKey.getParams().getL()) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        wvb wvbVar;
        b1b b1bVar = this.info;
        if (b1bVar != null) {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(b1bVar);
        }
        DHParameterSpec dHParameterSpec = this.dhSpec;
        if ((dHParameterSpec instanceof u62) && ((u62) dHParameterSpec).b() != null) {
            h72 a = ((u62) this.dhSpec).a();
            q72 h = a.h();
            if (h != null) {
                wvbVar = new wvb(h.b(), h.a());
            } else {
                wvbVar = null;
            }
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new eb(oac.t4, new n63(a.f(), a.b(), a.g(), a.c(), wvbVar).f()), new i(this.y));
        }
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new eb(co7.l0, new g72(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL()).f()), new i(this.y));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.dhSpec;
    }

    @Override // javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.y;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public String toString() {
        return DHUtil.publicKeyToString("DH", this.y, new h72(this.dhSpec.getP(), this.dhSpec.getG()));
    }

    public BCDHPublicKey(b1b b1bVar) {
        l72 l72Var;
        this.info = b1bVar;
        try {
            this.y = ((i) b1bVar.w()).G();
            p D = p.D(b1bVar.t().w());
            k t = b1bVar.t().t();
            if (t.x(co7.l0) || isPKCSParam(D)) {
                g72 u = g72.u(D);
                if (u.v() != null) {
                    this.dhSpec = new DHParameterSpec(u.w(), u.t(), u.v().intValue());
                    l72Var = new l72(this.y, new h72(this.dhSpec.getP(), this.dhSpec.getG(), null, this.dhSpec.getL()));
                } else {
                    this.dhSpec = new DHParameterSpec(u.w(), u.t());
                    l72Var = new l72(this.y, new h72(this.dhSpec.getP(), this.dhSpec.getG()));
                }
                this.dhPublicKey = l72Var;
            } else if (!t.x(oac.t4)) {
                throw new IllegalArgumentException("unknown algorithm type: " + t);
            } else {
                n63 u2 = n63.u(D);
                wvb A = u2.A();
                if (A != null) {
                    this.dhPublicKey = new l72(this.y, new h72(u2.x(), u2.t(), u2.z(), u2.v(), new q72(A.v(), A.u().intValue())));
                } else {
                    this.dhPublicKey = new l72(this.y, new h72(u2.x(), u2.t(), u2.z(), u2.v(), null));
                }
                this.dhSpec = new u62(this.dhPublicKey.b());
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DH public key");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.y = bigInteger;
        this.dhSpec = dHParameterSpec;
        this.dhPublicKey = dHParameterSpec instanceof u62 ? new l72(bigInteger, ((u62) dHParameterSpec).a()) : new l72(bigInteger, new h72(dHParameterSpec.getP(), dHParameterSpec.getG()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDHPublicKey(DHPublicKey dHPublicKey) {
        this.y = dHPublicKey.getY();
        DHParameterSpec params = dHPublicKey.getParams();
        this.dhSpec = params;
        if (params instanceof u62) {
            this.dhPublicKey = new l72(this.y, ((u62) params).a());
        } else {
            this.dhPublicKey = new l72(this.y, new h72(this.dhSpec.getP(), this.dhSpec.getG()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.y = dHPublicKeySpec.getY();
        this.dhSpec = dHPublicKeySpec instanceof w62 ? ((w62) dHPublicKeySpec).a() : new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
        DHParameterSpec dHParameterSpec = this.dhSpec;
        if (dHParameterSpec instanceof u62) {
            this.dhPublicKey = new l72(this.y, ((u62) dHParameterSpec).a());
        } else {
            this.dhPublicKey = new l72(this.y, new h72(dHPublicKeySpec.getP(), dHPublicKeySpec.getG()));
        }
    }
}
