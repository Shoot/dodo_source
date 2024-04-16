package defpackage;

import ru.dodopizza.app.domain.menu.promo.PromoActionsService;
/* compiled from: MenuModule_ProvideMenuConverterFactory.java */
/* renamed from: pf6  reason: default package */
/* loaded from: classes3.dex */
public final class pf6 implements no3<id6> {
    private final as8<hq3> a;
    private final as8<PromoActionsService> b;

    public pf6(as8<hq3> as8Var, as8<PromoActionsService> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static pf6 a(as8<hq3> as8Var, as8<PromoActionsService> as8Var2) {
        return new pf6(as8Var, as8Var2);
    }

    public static id6 c(hq3 hq3Var, PromoActionsService promoActionsService) {
        return (id6) jh8.e(jf6.a.f(hq3Var, promoActionsService));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public id6 get() {
        return c(this.a.get(), this.b.get());
    }
}
