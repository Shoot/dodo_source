package defpackage;
/* compiled from: CheckoutDetailsModule_ProvideInteractorFactory.java */
/* renamed from: o41  reason: default package */
/* loaded from: classes3.dex */
public final class o41 implements no3<i41> {
    private final as8<j41> a;

    public o41(as8<j41> as8Var) {
        this.a = as8Var;
    }

    public static o41 a(as8<j41> as8Var) {
        return new o41(as8Var);
    }

    public static i41 c(j41 j41Var) {
        return (i41) jh8.e(l41.a.c(j41Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public i41 get() {
        return c(this.a.get());
    }
}
