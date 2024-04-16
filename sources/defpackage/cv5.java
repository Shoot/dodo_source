package defpackage;
/* compiled from: LocalityModule_ProvidePhoneParserFactory.java */
/* renamed from: cv5  reason: default package */
/* loaded from: classes3.dex */
public final class cv5 implements no3<h48> {
    private final as8<m28> a;
    private final as8<ay1> b;

    public cv5(as8<m28> as8Var, as8<ay1> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static cv5 a(as8<m28> as8Var, as8<ay1> as8Var2) {
        return new cv5(as8Var, as8Var2);
    }

    public static h48 c(m28 m28Var, ay1 ay1Var) {
        return (h48) jh8.e(ju5.a.i(m28Var, ay1Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public h48 get() {
        return c(this.a.get(), this.b.get());
    }
}
