package defpackage;

import defpackage.b77;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.dodopizza.backend.domain.payment.dto.sbp.SbpBankListAPI;
/* compiled from: SbpDomainModule.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lzu9;", "", "Lrn2;", "configurator", "Lru/dodopizza/backend/domain/payment/dto/sbp/SbpBankListAPI;", "a", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zu9  reason: default package */
/* loaded from: classes2.dex */
public final class zu9 {
    public static final zu9 a = new zu9();

    private zu9() {
    }

    public final SbpBankListAPI a(rn2 rn2Var) {
        z65.h(rn2Var, "configurator");
        b77.a aVar = new b77.a();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        b77.a O = aVar.e(1L, timeUnit).S(5L, timeUnit).O(5L, TimeUnit.SECONDS);
        rn2Var.a(O, "http_nspk");
        Object create = new Retrofit.Builder().baseUrl("https://qr.nspk.ru/").addCallAdapterFactory(y3b.a()).addConverterFactory(GsonConverterFactory.create()).client(O.c()).build().create(SbpBankListAPI.class);
        z65.g(create, "create(...)");
        return (SbpBankListAPI) create;
    }
}
