package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Collection;
import kotlin.Metadata;
import ru.dodopizza.app.data.dto.response.OrderResponse;
/* compiled from: OrderService.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H&J\u001a\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0012H&J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0018"}, d2 = {"Lli7;", "", "", "Lbc7;", "getActiveOrders", "", "orderId", "g", "Llp7;", "a", "Ls51;", "checkoutRequest", "Lru/dodopizza/app/data/dto/response/OrderResponse;", "f", "", "b", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, DateTokenConverter.CONVERTER_KEY, "", "attemptsCount", "Ljp7;", e.a, "Lwf8;", c.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: li7  reason: default package */
/* loaded from: classes4.dex */
public interface li7 {

    /* compiled from: OrderService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: li7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ jp7 a(li7 li7Var, String str, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    i = 60;
                }
                return li7Var.e(str, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPlacedOrder");
        }
    }

    lp7 a();

    void b(String str);

    wf8 c(String str);

    void d(String str, String str2);

    jp7 e(String str, int i);

    OrderResponse f(s51 s51Var);

    bc7 g(String str);

    Collection<bc7> getActiveOrders();
}
