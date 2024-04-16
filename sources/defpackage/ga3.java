package defpackage;

import java.math.BigInteger;
/* renamed from: ga3  reason: default package */
/* loaded from: classes3.dex */
public class ga3 implements x80 {
    nb3 a;

    @Override // defpackage.x80
    public int a() {
        return (this.a.b().a().t() + 7) / 8;
    }

    @Override // defpackage.x80
    public BigInteger b(v71 v71Var) {
        qb3 qb3Var = (qb3) v71Var;
        la3 b = this.a.b();
        if (b.equals(qb3Var.b())) {
            BigInteger mod = b.c().multiply(this.a.c()).mod(b.e());
            jb3 a = ca3.a(b.a(), qb3Var.c());
            if (!a.u()) {
                jb3 A = a.y(mod).A();
                if (!A.u()) {
                    return A.f().t();
                }
                throw new IllegalStateException("Infinity is not a valid agreement value for ECDHC");
            }
            throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
        }
        throw new IllegalStateException("ECDHC public key has wrong domain parameters");
    }

    @Override // defpackage.x80
    public void init(v71 v71Var) {
        this.a = (nb3) v71Var;
    }
}
