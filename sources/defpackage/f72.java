package defpackage;
/* renamed from: f72  reason: default package */
/* loaded from: classes3.dex */
public class f72 implements v71 {
    private l72 a;
    private l72 b;

    public f72(l72 l72Var, l72 l72Var2) {
        if (l72Var != null) {
            if (l72Var2 != null) {
                if (l72Var.b().equals(l72Var2.b())) {
                    this.a = l72Var;
                    this.b = l72Var2;
                    return;
                }
                throw new IllegalArgumentException("Static and ephemeral public keys have different domain parameters");
            }
            throw new NullPointerException("ephemeralPublicKey cannot be null");
        }
        throw new NullPointerException("staticPublicKey cannot be null");
    }

    public l72 a() {
        return this.b;
    }

    public l72 b() {
        return this.a;
    }
}
