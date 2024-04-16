package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.landing.LandingApi;
/* compiled from: LandingModule.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\r\u001a\u00020\fH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007¨\u0006\u0012"}, d2 = {"Lwj5;", "", "Lnl5;", "impl", "Lml5;", DateTokenConverter.CONVERTER_KEY, "Lretrofit2/Retrofit;", "retrofit", "Lru/dodopizza/backend/domain/landing/LandingApi;", "a", "Ljj5;", "b", "Luk5;", c.a, "Lpl5;", e.a, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: wj5  reason: default package */
/* loaded from: classes3.dex */
public final class wj5 {
    public static final wj5 a = new wj5();

    private wj5() {
    }

    public final LandingApi a(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (LandingApi) retrofit.create(LandingApi.class);
    }

    public final jj5 b() {
        return new kj5();
    }

    public final uk5 c() {
        return new vk5();
    }

    public final ml5 d(nl5 nl5Var) {
        z65.h(nl5Var, "impl");
        return nl5Var;
    }

    public final pl5 e() {
        return new pl5(new lgb());
    }
}
