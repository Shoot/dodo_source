package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.menu.BuyMoreAPI;
/* compiled from: BuyMoreModule_ProvideBuyMoreAPIFactory.java */
/* renamed from: bj0  reason: default package */
/* loaded from: classes3.dex */
public final class bj0 implements no3<BuyMoreAPI> {
    private final as8<Retrofit> a;

    public bj0(as8<Retrofit> as8Var) {
        this.a = as8Var;
    }

    public static bj0 a(as8<Retrofit> as8Var) {
        return new bj0(as8Var);
    }

    public static BuyMoreAPI c(Retrofit retrofit) {
        return (BuyMoreAPI) jh8.e(aj0.a.a(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public BuyMoreAPI get() {
        return c(this.a.get());
    }
}
