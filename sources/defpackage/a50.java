package defpackage;

import java.io.IOException;
import java.security.PrivateKey;
/* renamed from: a50  reason: default package */
/* loaded from: classes3.dex */
public class a50 implements v71, PrivateKey {
    private ib6 a;

    public a50(ib6 ib6Var) {
        this.a = ib6Var;
    }

    public ka4 a() {
        return this.a.b();
    }

    public we8 b() {
        return this.a.c();
    }

    public int c() {
        return this.a.d();
    }

    public int d() {
        return this.a.e();
    }

    public wy7 e() {
        return this.a.f();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a50)) {
            return false;
        }
        a50 a50Var = (a50) obj;
        if (d() != a50Var.d() || c() != a50Var.c() || !a().equals(a50Var.a()) || !b().equals(a50Var.b()) || !i().equals(a50Var.i()) || !e().equals(a50Var.e()) || !f().equals(a50Var.f())) {
            return false;
        }
        return true;
    }

    public wy7 f() {
        return this.a.g();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new dk8(new eb(ko7.m), new hb6(this.a.e(), this.a.d(), this.a.b(), this.a.c(), this.a.f(), this.a.g(), this.a.h())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (((((((((((this.a.d() * 37) + this.a.e()) * 37) + this.a.b().hashCode()) * 37) + this.a.c().hashCode()) * 37) + this.a.f().hashCode()) * 37) + this.a.g().hashCode()) * 37) + this.a.h().hashCode();
    }

    public ia4 i() {
        return this.a.h();
    }
}
