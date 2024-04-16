package defpackage;

import defpackage.b77;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/* compiled from: ECommPayApiBuilderProvider.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lub3;", "", "Lb77;", "b", "Lretrofit2/Retrofit$Builder;", "a", "Lrn2;", "Lrn2;", "okHttpClientConfigurator", "<init>", "(Lrn2;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ub3  reason: default package */
/* loaded from: classes2.dex */
public final class ub3 {
    private final rn2 a;

    public ub3(rn2 rn2Var) {
        z65.h(rn2Var, "okHttpClientConfigurator");
        this.a = rn2Var;
    }

    private final b77 b() {
        b77.a aVar = new b77.a();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        b77.a O = aVar.e(1L, timeUnit).S(5L, timeUnit).O(5L, TimeUnit.SECONDS);
        this.a.a(O, "http_ecommpay_jetpay");
        return O.c();
    }

    public final Retrofit.Builder a() {
        Retrofit.Builder client = new Retrofit.Builder().addCallAdapterFactory(y3b.a()).addConverterFactory(GsonConverterFactory.create()).client(b());
        z65.g(client, "client(...)");
        return client;
    }
}
