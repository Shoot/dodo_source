package defpackage;
/* renamed from: ia3  reason: default package */
/* loaded from: classes3.dex */
public class ia3 implements v71 {
    private nb3 a;
    private nb3 b;
    private qb3 c;

    public ia3(nb3 nb3Var, nb3 nb3Var2, qb3 qb3Var) {
        if (nb3Var != null) {
            if (nb3Var2 != null) {
                la3 b = nb3Var.b();
                if (b.equals(nb3Var2.b())) {
                    if (qb3Var == null) {
                        qb3Var = new qb3(new ry3().a(b.b(), nb3Var2.c()), b);
                    } else if (!b.equals(qb3Var.b())) {
                        throw new IllegalArgumentException("ephemeral public key has different domain parameters");
                    }
                    this.a = nb3Var;
                    this.b = nb3Var2;
                    this.c = qb3Var;
                    return;
                }
                throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
            }
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
        throw new NullPointerException("staticPrivateKey cannot be null");
    }

    public nb3 a() {
        return this.b;
    }

    public nb3 b() {
        return this.a;
    }
}
