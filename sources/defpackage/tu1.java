package defpackage;
/* compiled from: ContextModule_ProvidePermissionHandlerFactory.java */
/* renamed from: tu1  reason: default package */
/* loaded from: classes3.dex */
public final class tu1 implements no3<my7> {
    private final as8<hy7> a;

    public tu1(as8<hy7> as8Var) {
        this.a = as8Var;
    }

    public static tu1 a(as8<hy7> as8Var) {
        return new tu1(as8Var);
    }

    public static my7 c(hy7 hy7Var) {
        return (my7) jh8.e(lu1.a.h(hy7Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public my7 get() {
        return c(this.a.get());
    }
}
