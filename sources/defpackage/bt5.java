package defpackage;
/* compiled from: LocaleListServiceModule_ProvideLocaleListServiceFactory.java */
/* renamed from: bt5  reason: default package */
/* loaded from: classes3.dex */
public final class bt5 implements no3<ny1> {
    private final as8<wl5> a;
    private final as8<ry1> b;

    public bt5(as8<wl5> as8Var, as8<ry1> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static bt5 a(as8<wl5> as8Var, as8<ry1> as8Var2) {
        return new bt5(as8Var, as8Var2);
    }

    public static ny1 c(wl5 wl5Var, ry1 ry1Var) {
        return (ny1) jh8.e(zs5.a.b(wl5Var, ry1Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ny1 get() {
        return c(this.a.get(), this.b.get());
    }
}
