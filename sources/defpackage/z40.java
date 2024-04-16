package defpackage;

import java.io.IOException;
import java.security.PublicKey;
/* renamed from: z40  reason: default package */
/* loaded from: classes3.dex */
public class z40 implements v71, PublicKey {
    private db6 a;

    public z40(db6 db6Var) {
        this.a = db6Var;
    }

    public ia4 a() {
        return this.a.c();
    }

    public int b() {
        return this.a.d();
    }

    public int c() {
        return this.a.e();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof z40)) {
            return false;
        }
        z40 z40Var = (z40) obj;
        if (this.a.d() != z40Var.b() || this.a.e() != z40Var.c() || !this.a.c().equals(z40Var.a())) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new b1b(new eb(ko7.n), new cb6(this.a.d(), this.a.e(), this.a.c(), lvb.a(this.a.b()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.a.d() + (this.a.e() * 37)) * 37) + this.a.c().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.a.d() + "\n") + " error correction capability: " + this.a.e() + "\n") + " generator matrix           : " + this.a.c().toString();
    }
}
