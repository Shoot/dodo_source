package defpackage;
/* compiled from: CustomizationModule_ProvideCustomizationServiceFactory.java */
/* renamed from: z52  reason: default package */
/* loaded from: classes3.dex */
public final class z52 implements no3<c62> {
    private final as8<ljb> a;
    private final as8<de9> b;

    public z52(as8<ljb> as8Var, as8<de9> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static z52 a(as8<ljb> as8Var, as8<de9> as8Var2) {
        return new z52(as8Var, as8Var2);
    }

    public static c62 c(ljb ljbVar, de9 de9Var) {
        return (c62) jh8.e(y52.a.a(ljbVar, de9Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public c62 get() {
        return c(this.a.get(), this.b.get());
    }
}
