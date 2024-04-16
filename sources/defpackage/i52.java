package defpackage;
/* compiled from: CustomerModule_ProvideAddressFormatterFactoryFactory.java */
/* renamed from: i52  reason: default package */
/* loaded from: classes3.dex */
public final class i52 implements no3<i8> {
    private final as8<hq3> a;

    public i52(as8<hq3> as8Var) {
        this.a = as8Var;
    }

    public static i52 a(as8<hq3> as8Var) {
        return new i52(as8Var);
    }

    public static i8 c(hq3 hq3Var) {
        return (i8) jh8.e(g52.a.b(hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public i8 get() {
        return c(this.a.get());
    }
}
