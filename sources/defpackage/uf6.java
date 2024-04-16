package defpackage;

import ru.dodopizza.app.domain.menu.promo.PromoActionsRepository;
import ru.dodopizza.app.domain.menu.promo.PromoActionsService;
/* compiled from: MenuModule_ProvidePromoActionsServiceFactory.java */
/* renamed from: uf6  reason: default package */
/* loaded from: classes3.dex */
public final class uf6 implements no3<PromoActionsService> {
    private final as8<PromoActionsRepository> a;
    private final as8<hq3> b;

    public uf6(as8<PromoActionsRepository> as8Var, as8<hq3> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static uf6 a(as8<PromoActionsRepository> as8Var, as8<hq3> as8Var2) {
        return new uf6(as8Var, as8Var2);
    }

    public static PromoActionsService c(PromoActionsRepository promoActionsRepository, hq3 hq3Var) {
        return (PromoActionsService) jh8.e(jf6.a.k(promoActionsRepository, hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public PromoActionsService get() {
        return c(this.a.get(), this.b.get());
    }
}
