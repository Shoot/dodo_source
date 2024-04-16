package defpackage;
/* compiled from: RetrofitModule_ProvideIgnoreQueriesProviderFactory.java */
/* renamed from: pl9  reason: default package */
/* loaded from: classes3.dex */
public final class pl9 implements no3<yt4> {
    private final gl9 a;

    public pl9(gl9 gl9Var) {
        this.a = gl9Var;
    }

    public static pl9 a(gl9 gl9Var) {
        return new pl9(gl9Var);
    }

    public static yt4 c(gl9 gl9Var) {
        return (yt4) jh8.e(gl9Var.i());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public yt4 get() {
        return c(this.a);
    }
}
