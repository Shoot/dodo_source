package defpackage;
/* renamed from: e72  reason: default package */
/* loaded from: classes3.dex */
public class e72 implements v71 {
    private k72 a;
    private k72 b;
    private l72 c;

    public e72(k72 k72Var, k72 k72Var2) {
        this(k72Var, k72Var2, null);
    }

    public k72 a() {
        return this.b;
    }

    public l72 b() {
        return this.c;
    }

    public k72 c() {
        return this.a;
    }

    public e72(k72 k72Var, k72 k72Var2, l72 l72Var) {
        if (k72Var == null) {
            throw new NullPointerException("staticPrivateKey cannot be null");
        }
        if (k72Var2 == null) {
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
        h72 b = k72Var.b();
        if (!b.equals(k72Var2.b())) {
            throw new IllegalArgumentException("Static and ephemeral private keys have different domain parameters");
        }
        if (l72Var == null) {
            l72Var = new l72(b.b().multiply(k72Var2.c()), b);
        } else if (!b.equals(l72Var.b())) {
            throw new IllegalArgumentException("Ephemeral public key has different domain parameters");
        }
        this.a = k72Var;
        this.b = k72Var2;
        this.c = l72Var;
    }
}
