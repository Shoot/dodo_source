package defpackage;

import defpackage.b77;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.dodopizza.mindbox.MindboxSdkApi;
/* compiled from: MindboxSdkApiFactory.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Luk6;", "", "Loj6;", "mindboxCredentials", "Lru/dodopizza/mindbox/MindboxSdkApi;", "a", "Lrn2;", "Lrn2;", "okHttpClientConfigurator", "<init>", "(Lrn2;)V", "mindbox_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: uk6  reason: default package */
/* loaded from: classes4.dex */
public final class uk6 {
    private final rn2 a;

    public uk6(rn2 rn2Var) {
        z65.h(rn2Var, "okHttpClientConfigurator");
        this.a = rn2Var;
    }

    public final MindboxSdkApi a(oj6 oj6Var) {
        z65.h(oj6Var, "mindboxCredentials");
        b77.a aVar = new b77.a();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        b77.a b = aVar.e(1L, timeUnit).S(5L, timeUnit).O(5L, TimeUnit.SECONDS).b(new vj6(oj6Var.c(), oj6Var.f()));
        this.a.a(b, "http_sdk_mindbox");
        b77 c = b.c();
        Retrofit.Builder builder = new Retrofit.Builder();
        String c2 = oj6Var.c();
        Object create = builder.baseUrl("https://" + c2 + "/").addCallAdapterFactory(y3b.a()).addConverterFactory(GsonConverterFactory.create()).client(c).build().create(MindboxSdkApi.class);
        z65.g(create, "create(...)");
        return (MindboxSdkApi) create;
    }
}
