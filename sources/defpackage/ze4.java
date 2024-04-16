package defpackage;
/* compiled from: GeopositionModule_ProvideLastLocationProviderFactory.java */
/* renamed from: ze4  reason: default package */
/* loaded from: classes3.dex */
public final class ze4 implements no3<zl5> {
    private final as8<je4> a;
    private final as8<jgb> b;

    public ze4(as8<je4> as8Var, as8<jgb> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static ze4 a(as8<je4> as8Var, as8<jgb> as8Var2) {
        return new ze4(as8Var, as8Var2);
    }

    public static zl5 c(je4 je4Var, jgb jgbVar) {
        return (zl5) jh8.e(we4.a.c(je4Var, jgbVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public zl5 get() {
        return c(this.a.get(), this.b.get());
    }
}
