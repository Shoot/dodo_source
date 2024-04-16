package defpackage;
/* compiled from: BonusActionModule_ProvideSpecialOffersServiceFactory.java */
/* renamed from: ne0  reason: default package */
/* loaded from: classes3.dex */
public final class ne0 implements no3<qra> {
    private final as8<rra> a;

    public ne0(as8<rra> as8Var) {
        this.a = as8Var;
    }

    public static ne0 a(as8<rra> as8Var) {
        return new ne0(as8Var);
    }

    public static qra c(rra rraVar) {
        return (qra) jh8.e(fe0.a.h(rraVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public qra get() {
        return c(this.a.get());
    }
}
