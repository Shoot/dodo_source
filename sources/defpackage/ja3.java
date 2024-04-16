package defpackage;
/* renamed from: ja3  reason: default package */
/* loaded from: classes3.dex */
public class ja3 implements v71 {
    private qb3 a;
    private qb3 b;

    public ja3(qb3 qb3Var, qb3 qb3Var2) {
        if (qb3Var != null) {
            if (qb3Var2 != null) {
                if (qb3Var.b().equals(qb3Var2.b())) {
                    this.a = qb3Var;
                    this.b = qb3Var2;
                    return;
                }
                throw new IllegalArgumentException("static and ephemeral public keys have different domain parameters");
            }
            throw new NullPointerException("ephemeralPublicKey cannot be null");
        }
        throw new NullPointerException("staticPublicKey cannot be null");
    }

    public qb3 a() {
        return this.b;
    }

    public qb3 b() {
        return this.a;
    }
}
