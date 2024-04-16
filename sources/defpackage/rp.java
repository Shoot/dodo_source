package defpackage;
/* compiled from: ApplicationModule_ProvideBaseUrlProviderFactory.java */
/* renamed from: rp  reason: default package */
/* loaded from: classes3.dex */
public final class rp implements no3<p80> {
    private final as8<s80> a;

    public rp(as8<s80> as8Var) {
        this.a = as8Var;
    }

    public static rp a(as8<s80> as8Var) {
        return new rp(as8Var);
    }

    public static p80 c(s80 s80Var) {
        return (p80) jh8.e(pp.a.b(s80Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public p80 get() {
        return c(this.a.get());
    }
}
