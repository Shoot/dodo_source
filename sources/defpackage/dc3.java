package defpackage;
/* compiled from: EasyBonusModule_ProvideEasyBonusServiceFactory.java */
/* renamed from: dc3  reason: default package */
/* loaded from: classes3.dex */
public final class dc3 implements no3<ec3> {
    private final as8<fc3> a;

    public dc3(as8<fc3> as8Var) {
        this.a = as8Var;
    }

    public static dc3 a(as8<fc3> as8Var) {
        return new dc3(as8Var);
    }

    public static ec3 c(fc3 fc3Var) {
        return (ec3) jh8.e(ac3.a.c(fc3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ec3 get() {
        return c(this.a.get());
    }
}
