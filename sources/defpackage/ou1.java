package defpackage;
/* compiled from: ContextModule_ProvideLocationPermissionCheckerFactory.java */
/* renamed from: ou1  reason: default package */
/* loaded from: classes3.dex */
public final class ou1 implements no3<wv5> {
    private final as8<fy7> a;

    public ou1(as8<fy7> as8Var) {
        this.a = as8Var;
    }

    public static ou1 a(as8<fy7> as8Var) {
        return new ou1(as8Var);
    }

    public static wv5 c(fy7 fy7Var) {
        return (wv5) jh8.e(lu1.a.c(fy7Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public wv5 get() {
        return c(this.a.get());
    }
}
