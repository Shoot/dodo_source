package defpackage;
/* compiled from: ShoppingCartModule_ProvideVOFactoryFactory.java */
/* renamed from: dja  reason: default package */
/* loaded from: classes2.dex */
public final class dja implements no3<e61> {
    private final as8<f61> a;

    public dja(as8<f61> as8Var) {
        this.a = as8Var;
    }

    public static dja a(as8<f61> as8Var) {
        return new dja(as8Var);
    }

    public static e61 c(f61 f61Var) {
        return (e61) jh8.e(yia.a.e(f61Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public e61 get() {
        return c(this.a.get());
    }
}
