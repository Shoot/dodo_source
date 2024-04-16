package defpackage;

import java.io.IOException;
import java.security.PublicKey;
/* renamed from: b50  reason: default package */
/* loaded from: classes3.dex */
public class b50 implements PublicKey {
    private kb6 a;

    public b50(kb6 kb6Var) {
        this.a = kb6Var;
    }

    public ia4 a() {
        return this.a.b();
    }

    public int b() {
        return this.a.c();
    }

    public int c() {
        return this.a.d();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b50)) {
            return false;
        }
        b50 b50Var = (b50) obj;
        if (this.a.c() != b50Var.b() || this.a.d() != b50Var.c() || !this.a.b().equals(b50Var.a())) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new b1b(new eb(ko7.m), new jb6(this.a.c(), this.a.d(), this.a.b())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.a.c() + (this.a.d() * 37)) * 37) + this.a.b().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.a.c() + "\n") + " error correction capability: " + this.a.d() + "\n") + " generator matrix           : " + this.a.b();
    }
}
