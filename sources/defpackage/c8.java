package defpackage;
/* compiled from: AddressFormFragmentModule_ProvideFormBuilderFactory.java */
/* renamed from: c8  reason: default package */
/* loaded from: classes3.dex */
public final class c8 implements no3<h54> {
    private final as8<j54> a;

    public c8(as8<j54> as8Var) {
        this.a = as8Var;
    }

    public static c8 a(as8<j54> as8Var) {
        return new c8(as8Var);
    }

    public static h54 c(j54 j54Var) {
        return (h54) jh8.e(z7.a.c(j54Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public h54 get() {
        return c(this.a.get());
    }
}
