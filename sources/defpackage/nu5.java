package defpackage;
/* compiled from: LocalityModule_ProvideCountryFilterFactory.java */
/* renamed from: nu5  reason: default package */
/* loaded from: classes3.dex */
public final class nu5 implements no3<ly1> {
    private final as8<yhb> a;

    public nu5(as8<yhb> as8Var) {
        this.a = as8Var;
    }

    public static nu5 a(as8<yhb> as8Var) {
        return new nu5(as8Var);
    }

    public static ly1 c(yhb yhbVar) {
        return (ly1) jh8.e(iu5.a.b(yhbVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ly1 get() {
        return c(this.a.get());
    }
}
