package defpackage;
/* compiled from: ThreadsLibNotification_Factory.java */
/* renamed from: ffb  reason: default package */
/* loaded from: classes3.dex */
public final class ffb {
    private final as8<bfb> a;
    private final as8<kfb> b;
    private final as8<gc> c;

    public ffb(as8<bfb> as8Var, as8<kfb> as8Var2, as8<gc> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static ffb a(as8<bfb> as8Var, as8<kfb> as8Var2, as8<gc> as8Var3) {
        return new ffb(as8Var, as8Var2, as8Var3);
    }

    public static efb c(bfb bfbVar, kfb kfbVar, gc gcVar, u27 u27Var) {
        return new efb(bfbVar, kfbVar, gcVar, u27Var);
    }

    public efb b(u27 u27Var) {
        return c(this.a.get(), this.b.get(), this.c.get(), u27Var);
    }
}
