package defpackage;
/* compiled from: ComboProductCardModule_ProvideComboCustomizeBuilderInteractorFactory.java */
/* renamed from: yh1  reason: default package */
/* loaded from: classes3.dex */
public final class yh1 implements no3<ah1> {
    private final as8<c62> a;
    private final as8<mxa> b;

    public yh1(as8<c62> as8Var, as8<mxa> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static yh1 a(as8<c62> as8Var, as8<mxa> as8Var2) {
        return new yh1(as8Var, as8Var2);
    }

    public static ah1 c(c62 c62Var, mxa mxaVar) {
        return (ah1) jh8.e(vh1.a.c(c62Var, mxaVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ah1 get() {
        return c(this.a.get(), this.b.get());
    }
}
