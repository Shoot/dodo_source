package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.CartEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.HttpException;
import ru.dodopizza.backend.domain.state.WorkflowApi;
import ru.dodopizza.backend.domain.state.dto.SetPromoActionRequestDto;
/* compiled from: PersonalPromoActionService.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lx18;", "", "", "promoId", "Lw18;", "a", "", "b", "Lf8c;", "Lf8c;", "workflowIdProvider", "Lru/dodopizza/backend/domain/state/WorkflowApi;", "Lru/dodopizza/backend/domain/state/WorkflowApi;", "workflowApi", "Ldua;", c.a, "Ldua;", "stateAnalyzer", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lorg/slf4j/Logger;", "logger", "<init>", "(Lf8c;Lru/dodopizza/backend/domain/state/WorkflowApi;Ldua;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: x18  reason: default package */
/* loaded from: classes4.dex */
public final class x18 {
    private final f8c a;
    private final WorkflowApi b;
    private final dua c;
    private final Logger d;

    public x18(f8c f8cVar, WorkflowApi workflowApi, dua duaVar) {
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(workflowApi, "workflowApi");
        z65.h(duaVar, "stateAnalyzer");
        this.a = f8cVar;
        this.b = workflowApi;
        this.c = duaVar;
        this.d = LoggerFactory.getLogger("PromoCodeService");
    }

    public final w18 a(String str) {
        z65.h(str, "promoId");
        try {
            CartEntity cart = this.c.d(this.b.setPersonalAction(new SetPromoActionRequestDto(this.a.b(), str))).getCart();
            z65.e(cart);
            return iq8.a(cart.getPromoAction());
        } catch (Exception e) {
            this.d.warn("Failed to apply promo code. ", (Throwable) e);
            if ((e instanceof HttpException) && ((HttpException) e).code() == 400) {
                return new w18(str, 0, "", "", "", "", eq8.e);
            }
            return new w18(str, 0, "", "", "", "", eq8.d);
        }
    }

    public final void b() {
        this.c.d(this.b.deletePromoAction(this.a.b()));
    }
}
