package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.ServerDeltaTimeEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.mk2;
import kotlin.Metadata;
import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.servertime.ServerTimeApi;
/* compiled from: ServerTimeModule.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\u0016\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¨\u0006\u0016"}, d2 = {"Lmda;", "", "Lretrofit2/Retrofit;", "retrofit", "Lru/dodopizza/backend/domain/servertime/ServerTimeApi;", DateTokenConverter.CONVERTER_KEY, "Ljk2;", "daoFactory", "Lgk2;", "Lcom/dodopizza/persistence/entity/ServerDeltaTimeEntity;", "b", "Lfda;", "a", "dao", "Lida;", c.a, "Luda;", "impl", "Ltda;", e.a, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: mda  reason: default package */
/* loaded from: classes3.dex */
public final class mda {
    public static final mda a = new mda();

    private mda() {
    }

    public final fda a() {
        return new gda();
    }

    public final gk2<ServerDeltaTimeEntity> b(jk2 jk2Var) {
        z65.h(jk2Var, "daoFactory");
        return jk2Var.a(bc9.b(ServerDeltaTimeEntity.class), mk2.b.a);
    }

    public final ida c(gk2<ServerDeltaTimeEntity> gk2Var) {
        z65.h(gk2Var, "dao");
        return new jda(gk2Var);
    }

    public final ServerTimeApi d(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (ServerTimeApi) retrofit.create(ServerTimeApi.class);
    }

    public final tda e(uda udaVar) {
        z65.h(udaVar, "impl");
        return udaVar;
    }
}
