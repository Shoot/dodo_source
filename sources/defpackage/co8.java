package defpackage;
/* compiled from: ProfileModule_ProvideProfileSubscriptionServiceFactory.java */
/* renamed from: co8  reason: default package */
/* loaded from: classes3.dex */
public final class co8 implements no3<to8> {
    private final as8<ro8> a;

    public co8(as8<ro8> as8Var) {
        this.a = as8Var;
    }

    public static co8 a(as8<ro8> as8Var) {
        return new co8(as8Var);
    }

    public static to8 c(ro8 ro8Var) {
        return (to8) jh8.e(xn8.a.e(ro8Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public to8 get() {
        return c(this.a.get());
    }
}
