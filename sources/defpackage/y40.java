package defpackage;

import java.io.IOException;
import java.security.PrivateKey;
/* renamed from: y40  reason: default package */
/* loaded from: classes3.dex */
public class y40 implements PrivateKey {
    private bb6 a;

    public y40(bb6 bb6Var) {
        this.a = bb6Var;
    }

    public ka4 a() {
        return this.a.c();
    }

    public we8 b() {
        return this.a.d();
    }

    public ia4 c() {
        return this.a.e();
    }

    public int d() {
        return this.a.f();
    }

    public int e() {
        return this.a.g();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof y40)) {
            return false;
        }
        y40 y40Var = (y40) obj;
        if (e() != y40Var.e() || d() != y40Var.d() || !a().equals(y40Var.a()) || !b().equals(y40Var.b()) || !f().equals(y40Var.f()) || !c().equals(y40Var.c())) {
            return false;
        }
        return true;
    }

    public wy7 f() {
        return this.a.h();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new dk8(new eb(ko7.n), new ab6(e(), d(), a(), b(), f(), lvb.a(this.a.b()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (((((((((this.a.f() * 37) + this.a.g()) * 37) + this.a.c().hashCode()) * 37) + this.a.d().hashCode()) * 37) + this.a.h().hashCode()) * 37) + this.a.e().hashCode();
    }
}
