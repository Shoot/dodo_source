package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.cart.CartAPI;
/* compiled from: CartModule_ProvideCartAPIFactory.java */
/* renamed from: zq0  reason: default package */
/* loaded from: classes3.dex */
public final class zq0 implements no3<CartAPI> {
    private final as8<Retrofit> a;

    public zq0(as8<Retrofit> as8Var) {
        this.a = as8Var;
    }

    public static zq0 a(as8<Retrofit> as8Var) {
        return new zq0(as8Var);
    }

    public static CartAPI c(Retrofit retrofit) {
        return (CartAPI) jh8.e(yq0.a.a(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public CartAPI get() {
        return c(this.a.get());
    }
}
