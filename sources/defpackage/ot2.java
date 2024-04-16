package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.pizzeria.PizzeriaAPI;
/* compiled from: DeferredTimeService.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001!B7\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\""}, d2 = {"Lot2;", "Lnt2;", "Lxl0;", "Lava;", DateTokenConverter.CONVERTER_KEY, "Lava;", "stateProvider", "Lpgb;", e.a, "Lpgb;", "dateTimeParser", "Lru/dodopizza/backend/domain/pizzeria/PizzeriaAPI;", "f", "Lru/dodopizza/backend/domain/pizzeria/PizzeriaAPI;", "pizzeriaAPI", "Lf5b;", "g", "Lf5b;", "systemTimeProvider", "Lhq3;", Image.TYPE_HIGH, "Lhq3;", "featureService", "", "", "i", "Ljava/util/List;", "deliveryDeferredTimes", "Lml0;", "cacheInspector", "<init>", "(Lava;Lpgb;Lru/dodopizza/backend/domain/pizzeria/PizzeriaAPI;Lf5b;Lhq3;Lml0;)V", "j", "a", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ot2  reason: default package */
/* loaded from: classes4.dex */
public final class ot2 extends xl0 implements nt2 {
    public static final a j = new a(null);
    private static final long k = TimeUnit.MINUTES.toMillis(1);
    private final ava d;
    private final pgb e;
    private final PizzeriaAPI f;
    private final f5b g;
    private final hq3 h;
    private List<Object> i;

    /* compiled from: DeferredTimeService.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lot2$a;", "", "", "CACHE_DURATION", "J", "", "CACHE_KEY_DELIVERY_DEFERRED_TIME", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ot2$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot2(ava avaVar, pgb pgbVar, PizzeriaAPI pizzeriaAPI, f5b f5bVar, hq3 hq3Var, ml0 ml0Var) {
        super(ml0Var);
        List<Object> l;
        z65.h(avaVar, "stateProvider");
        z65.h(pgbVar, "dateTimeParser");
        z65.h(pizzeriaAPI, "pizzeriaAPI");
        z65.h(f5bVar, "systemTimeProvider");
        z65.h(hq3Var, "featureService");
        z65.h(ml0Var, "cacheInspector");
        this.d = avaVar;
        this.e = pgbVar;
        this.f = pizzeriaAPI;
        this.g = f5bVar;
        this.h = hq3Var;
        l = kc1.l();
        this.i = l;
    }
}
