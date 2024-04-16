package defpackage;
/* compiled from: SpecialOfferModule_ProvideSpecialOfferDialogInteractorFactory.java */
/* renamed from: ora  reason: default package */
/* loaded from: classes2.dex */
public final class ora implements no3<jra> {
    private final as8<ah6> a;

    public ora(as8<ah6> as8Var) {
        this.a = as8Var;
    }

    public static ora a(as8<ah6> as8Var) {
        return new ora(as8Var);
    }

    public static jra c(ah6 ah6Var) {
        return (jra) jh8.e(nra.a.a(ah6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public jra get() {
        return c(this.a.get());
    }
}
