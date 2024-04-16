package defpackage;
/* compiled from: LocalityModule_ProvideMoneyStringFormatterFactory.java */
/* renamed from: av5  reason: default package */
/* loaded from: classes3.dex */
public final class av5 implements no3<tn6> {
    private final as8<mn6> a;

    public av5(as8<mn6> as8Var) {
        this.a = as8Var;
    }

    public static av5 a(as8<mn6> as8Var) {
        return new av5(as8Var);
    }

    public static tn6 c(mn6 mn6Var) {
        return (tn6) jh8.e(ju5.a.g(mn6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public tn6 get() {
        return c(this.a.get());
    }
}
