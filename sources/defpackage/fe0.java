package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.bonus.BonusActionApi;
import ru.dodopizza.backend.domain.state.WorkflowApi;
/* compiled from: BonusActionModule.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u00102J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007JR\u0010%\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\b\u0001\u0010#\u001a\u00020\"H\u0007J\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020&H\u0007J \u0010/\u001a\u00020\u00162\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0007J \u00100\u001a\u00020\u00182\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0007¨\u00063"}, d2 = {"Lfe0;", "", "Lretrofit2/Retrofit;", "retrofit", "Lru/dodopizza/backend/domain/bonus/BonusActionApi;", "a", "Lrra;", "impl", "Lqra;", Image.TYPE_HIGH, "Ln67;", "b", "Lfda;", "serverDateTimeParser", "Lf5b;", "systemTimeProvider", "Lbq;", "applyedPromoOfferRepository", "Lhq3;", "featureService", "Ll08;", c.a, "Ldq8;", "promoCodeService", "Lx18;", "personalPromoActionService", "Lrp8;", "promoCodeConditionProvider", "Lgc;", "analytics", "Lx26;", "loyaltyService", "Lt52;", "customerService", "Lkx1;", "ioDispatcher", "Lnfa;", "g", "Lc63;", "dodoResources", e.a, "Lf8c;", "workflowIdProvider", "Lru/dodopizza/backend/domain/state/WorkflowApi;", "workflowApi", "Ldua;", "stateAnalyzer", "f", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: fe0  reason: default package */
/* loaded from: classes3.dex */
public final class fe0 {
    public static final fe0 a = new fe0();

    private fe0() {
    }

    public final BonusActionApi a(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (BonusActionApi) retrofit.create(BonusActionApi.class);
    }

    public final n67 b() {
        return new o67();
    }

    public final l08 c(fda fdaVar, f5b f5bVar, bq bqVar, hq3 hq3Var) {
        z65.h(fdaVar, "serverDateTimeParser");
        z65.h(f5bVar, "systemTimeProvider");
        z65.h(bqVar, "applyedPromoOfferRepository");
        z65.h(hq3Var, "featureService");
        return new l08(fdaVar, f5bVar, bqVar, hq3Var);
    }

    public final x18 d(f8c f8cVar, WorkflowApi workflowApi, dua duaVar) {
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(workflowApi, "workflowApi");
        z65.h(duaVar, "stateAnalyzer");
        return new x18(f8cVar, workflowApi, duaVar);
    }

    public final rp8 e(c63 c63Var) {
        z65.h(c63Var, "dodoResources");
        return new rp8(c63Var);
    }

    public final dq8 f(f8c f8cVar, WorkflowApi workflowApi, dua duaVar) {
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(workflowApi, "workflowApi");
        z65.h(duaVar, "stateAnalyzer");
        return new dq8(f8cVar, workflowApi, duaVar);
    }

    public final nfa g(dq8 dq8Var, x18 x18Var, rp8 rp8Var, gc gcVar, hq3 hq3Var, bq bqVar, x26 x26Var, t52 t52Var, kx1 kx1Var) {
        z65.h(dq8Var, "promoCodeService");
        z65.h(x18Var, "personalPromoActionService");
        z65.h(rp8Var, "promoCodeConditionProvider");
        z65.h(gcVar, "analytics");
        z65.h(hq3Var, "featureService");
        z65.h(bqVar, "applyedPromoOfferRepository");
        z65.h(x26Var, "loyaltyService");
        z65.h(t52Var, "customerService");
        z65.h(kx1Var, "ioDispatcher");
        return new nfa(dq8Var, x18Var, rp8Var, gcVar, hq3Var, bqVar, x26Var, t52Var, kx1Var);
    }

    public final qra h(rra rraVar) {
        z65.h(rraVar, "impl");
        return rraVar;
    }
}
