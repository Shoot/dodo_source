package defpackage;
/* compiled from: ContextModule_ProvidePermissionCheckerFactory.java */
/* renamed from: ru1  reason: default package */
/* loaded from: classes3.dex */
public final class ru1 implements no3<fy7> {
    private final as8<hy7> a;

    public ru1(as8<hy7> as8Var) {
        this.a = as8Var;
    }

    public static ru1 a(as8<hy7> as8Var) {
        return new ru1(as8Var);
    }

    public static fy7 c(hy7 hy7Var) {
        return (fy7) jh8.e(lu1.a.f(hy7Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public fy7 get() {
        return c(this.a.get());
    }
}
