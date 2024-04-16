package defpackage;
/* compiled from: UpsaleModule_ProvideUpsaleInteractorFactory.java */
/* renamed from: ysb  reason: default package */
/* loaded from: classes2.dex */
public final class ysb implements no3<rsb> {
    private final as8<tsb> a;
    private final as8<ktb> b;
    private final as8<gc> c;

    public ysb(as8<tsb> as8Var, as8<ktb> as8Var2, as8<gc> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static ysb a(as8<tsb> as8Var, as8<ktb> as8Var2, as8<gc> as8Var3) {
        return new ysb(as8Var, as8Var2, as8Var3);
    }

    public static rsb c(tsb tsbVar, ktb ktbVar, gc gcVar) {
        return (rsb) jh8.e(wsb.a.b(tsbVar, ktbVar, gcVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public rsb get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
