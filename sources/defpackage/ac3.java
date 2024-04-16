package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.bonus.EasyBonusApi;
/* compiled from: EasyBonusModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¨\u0006\u0011"}, d2 = {"Lac3;", "", "Lf8c;", "workflowIdProvider", "Lec3;", "easyBonusService", "Lzb3;", "b", "Lfc3;", "impl", c.a, "Lretrofit2/Retrofit;", "retrofit", "Lru/dodopizza/backend/domain/bonus/EasyBonusApi;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ac3  reason: default package */
/* loaded from: classes3.dex */
public final class ac3 {
    public static final ac3 a = new ac3();

    private ac3() {
    }

    public final EasyBonusApi a(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (EasyBonusApi) retrofit.create(EasyBonusApi.class);
    }

    public final zb3 b(f8c f8cVar, ec3 ec3Var) {
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(ec3Var, "easyBonusService");
        return new zb3(f8cVar, ec3Var, null, 4, null);
    }

    public final ec3 c(fc3 fc3Var) {
        z65.h(fc3Var, "impl");
        return fc3Var;
    }
}
