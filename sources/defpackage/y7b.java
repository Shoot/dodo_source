package defpackage;
/* compiled from: TaxPayerIdModule_ProvideTaxPayerIdValidatorFactory.java */
/* renamed from: y7b  reason: default package */
/* loaded from: classes3.dex */
public final class y7b implements no3<b8b> {
    private final as8<ay1> a;

    public y7b(as8<ay1> as8Var) {
        this.a = as8Var;
    }

    public static y7b a(as8<ay1> as8Var) {
        return new y7b(as8Var);
    }

    public static b8b c(ay1 ay1Var) {
        return (b8b) jh8.e(w7b.a.b(ay1Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public b8b get() {
        return c(this.a.get());
    }
}
