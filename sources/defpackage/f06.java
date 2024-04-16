package defpackage;

import kotlin.Metadata;
import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.loyalty.LoyaltyApi;
/* compiled from: LoyaltyDataModule.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\f"}, d2 = {"Lf06;", "", "Ly26;", "impl", "Lx26;", "b", "Lretrofit2/Retrofit;", "retrofit", "Lru/dodopizza/backend/domain/loyalty/LoyaltyApi;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: f06  reason: default package */
/* loaded from: classes3.dex */
public final class f06 {
    public static final f06 a = new f06();

    private f06() {
    }

    public final LoyaltyApi a(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (LoyaltyApi) retrofit.create(LoyaltyApi.class);
    }

    public final x26 b(y26 y26Var) {
        z65.h(y26Var, "impl");
        return y26Var;
    }
}
