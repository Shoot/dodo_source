package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.flipper.plugins.network.FlipperOkhttpInterceptor;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import retrofit2.Retrofit;
import ru.dodopizza.app.domain.DodopizzaApi;
import ru.dodopizza.backend.domain.authorization.AuthorizationAPI;
import ru.dodopizza.backend.domain.checkout.CheckoutAPI;
import ru.dodopizza.backend.domain.clientcard.ClientCardAPI;
import ru.dodopizza.backend.domain.country.CountryApi;
import ru.dodopizza.backend.domain.customer.CustomerAPI;
import ru.dodopizza.backend.domain.locality.LocalityAPI;
import ru.dodopizza.backend.domain.payment.PaymentAPI;
import ru.dodopizza.backend.domain.pizzeria.PizzeriaAPI;
import ru.dodopizza.backend.domain.state.WorkflowApi;
import ru.dodopizza.backend.domain.upload.UploadAPI;
/* compiled from: RetrofitModule.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bH\u0007J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\bH\u0007J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\bH\u0007J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\bH\u0007J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\bH\u0007J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\bH\u0007J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\bH\u0007J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\bH\u0007J\u0010\u0010!\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\u001fH\u0007J\u0010\u0010#\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\bH\u0007J\u0010\u0010%\u001a\u00020$2\u0006\u0010\u000e\u001a\u00020\bH\u0007J\u0010\u0010'\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\bH\u0007¨\u0006*"}, d2 = {"Lgl9;", "", "Lyt4;", "i", "Lcom/facebook/flipper/plugins/network/FlipperOkhttpInterceptor;", Image.TYPE_HIGH, "Lel9;", "factory", "Lretrofit2/Retrofit;", "n", "Lsn2;", "impl", "Lrn2;", "k", "retrofit", "Lru/dodopizza/app/domain/DodopizzaApi;", "g", "Lru/dodopizza/backend/domain/locality/LocalityAPI;", "j", "Lru/dodopizza/backend/domain/pizzeria/PizzeriaAPI;", Image.TYPE_MEDIUM, "Lru/dodopizza/backend/domain/upload/UploadAPI;", "o", "Lru/dodopizza/backend/domain/customer/CustomerAPI;", "f", "Lru/dodopizza/backend/domain/payment/PaymentAPI;", "l", "Lru/dodopizza/backend/domain/clientcard/ClientCardAPI;", c.a, "Lru/dodopizza/backend/domain/country/CountryApi;", DateTokenConverter.CONVERTER_KEY, "Lcy1;", "Lby1;", e.a, "Lru/dodopizza/backend/domain/authorization/AuthorizationAPI;", "a", "Lru/dodopizza/backend/domain/state/WorkflowApi;", "p", "Lru/dodopizza/backend/domain/checkout/CheckoutAPI;", "b", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: gl9  reason: default package */
/* loaded from: classes3.dex */
public class gl9 {
    public final AuthorizationAPI a(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (AuthorizationAPI) retrofit.create(AuthorizationAPI.class);
    }

    public final CheckoutAPI b(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (CheckoutAPI) retrofit.create(CheckoutAPI.class);
    }

    public final ClientCardAPI c(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (ClientCardAPI) retrofit.create(ClientCardAPI.class);
    }

    public final CountryApi d(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (CountryApi) retrofit.create(CountryApi.class);
    }

    public final by1 e(cy1 cy1Var) {
        z65.h(cy1Var, "impl");
        return cy1Var;
    }

    public final CustomerAPI f(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (CustomerAPI) retrofit.create(CustomerAPI.class);
    }

    public final DodopizzaApi g(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (DodopizzaApi) retrofit.create(DodopizzaApi.class);
    }

    public final FlipperOkhttpInterceptor h() {
        return ez3.b();
    }

    public yt4 i() {
        return hz6.a;
    }

    public final LocalityAPI j(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (LocalityAPI) retrofit.create(LocalityAPI.class);
    }

    public final rn2 k(sn2 sn2Var) {
        z65.h(sn2Var, "impl");
        return sn2Var;
    }

    public final PaymentAPI l(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (PaymentAPI) retrofit.create(PaymentAPI.class);
    }

    public final PizzeriaAPI m(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (PizzeriaAPI) retrofit.create(PizzeriaAPI.class);
    }

    public final Retrofit n(el9 el9Var) {
        z65.h(el9Var, "factory");
        return el9Var.e();
    }

    public final UploadAPI o(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (UploadAPI) retrofit.create(UploadAPI.class);
    }

    public final WorkflowApi p(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (WorkflowApi) retrofit.create(WorkflowApi.class);
    }
}
