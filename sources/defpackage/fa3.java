package defpackage;

import java.math.BigInteger;
/* renamed from: fa3  reason: default package */
/* loaded from: classes3.dex */
public class fa3 implements x80 {
    private nb3 a;

    @Override // defpackage.x80
    public int a() {
        return (this.a.b().a().t() + 7) / 8;
    }

    @Override // defpackage.x80
    public BigInteger b(v71 v71Var) {
        qb3 qb3Var = (qb3) v71Var;
        la3 b = this.a.b();
        if (b.equals(qb3Var.b())) {
            BigInteger c = this.a.c();
            jb3 a = ca3.a(b.a(), qb3Var.c());
            if (!a.u()) {
                BigInteger c2 = b.c();
                if (!c2.equals(da3.b)) {
                    c = b.d().multiply(c).mod(b.e());
                    a = ca3.q(a, c2);
                }
                jb3 A = a.y(c).A();
                if (!A.u()) {
                    return A.f().t();
                }
                throw new IllegalStateException("Infinity is not a valid agreement value for ECDH");
            }
            throw new IllegalStateException("Infinity is not a valid public key for ECDH");
        }
        throw new IllegalStateException("ECDH public key has wrong domain parameters");
    }

    @Override // defpackage.x80
    public void init(v71 v71Var) {
        this.a = (nb3) v71Var;
    }
}
