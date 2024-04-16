package defpackage;

import ru.dodopizza.app.domain.menu.promo.PromoActionsRepository;
/* compiled from: MenuModule_ProvidePromoActionsRepositoryFactory.java */
/* renamed from: tf6  reason: default package */
/* loaded from: classes3.dex */
public final class tf6 implements no3<PromoActionsRepository> {

    /* compiled from: MenuModule_ProvidePromoActionsRepositoryFactory.java */
    /* renamed from: tf6$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private static final tf6 a = new tf6();
    }

    public static tf6 a() {
        return a.a;
    }

    public static PromoActionsRepository c() {
        return (PromoActionsRepository) jh8.e(jf6.a.j());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public PromoActionsRepository get() {
        return c();
    }
}
