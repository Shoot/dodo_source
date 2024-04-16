package defpackage;
/* compiled from: LocalityModule_ProvideLocalityFactory.java */
/* renamed from: ru5  reason: default package */
/* loaded from: classes3.dex */
public final class ru5 implements no3<dt5> {
    private final as8<jv5> a;

    public ru5(as8<jv5> as8Var) {
        this.a = as8Var;
    }

    public static ru5 a(as8<jv5> as8Var) {
        return new ru5(as8Var);
    }

    public static dt5 c(jv5 jv5Var) {
        return (dt5) jh8.e(ju5.a.d(jv5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public dt5 get() {
        return c(this.a.get());
    }
}
