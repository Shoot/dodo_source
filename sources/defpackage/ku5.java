package defpackage;
/* compiled from: LocalityModule_ProvideAddressDetailsFieldDesignServiceFactory.java */
/* renamed from: ku5  reason: default package */
/* loaded from: classes3.dex */
public final class ku5 implements no3<h7> {
    private final as8<i7> a;

    public ku5(as8<i7> as8Var) {
        this.a = as8Var;
    }

    public static ku5 a(as8<i7> as8Var) {
        return new ku5(as8Var);
    }

    public static h7 c(i7 i7Var) {
        return (h7) jh8.e(iu5.a.a(i7Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public h7 get() {
        return c(this.a.get());
    }
}
