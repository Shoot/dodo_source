package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import ru.dodopizza.backend.domain.geo.UndeliverableAddressField;
import ru.dodopizza.backend.domain.state.dto.deliverylocation.CoordinatesDto;
/* compiled from: DeliveryLocation.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0012\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0000¨\u0006\t"}, d2 = {"Ljx2;", "", Action.KEY_ATTRIBUTE, "value", c.a, "deliveryLocation", "b", "Lru/dodopizza/backend/domain/geo/UndeliverableAddressField;", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: oy2  reason: default package */
/* loaded from: classes4.dex */
public final class oy2 {
    public static final UndeliverableAddressField a(jx2 jx2Var) {
        z65.h(jx2Var, "<this>");
        return new UndeliverableAddressField(jx2Var.f(), new CoordinatesDto(jx2Var.d().b(), jx2Var.d().c()), jx2Var.e());
    }

    public static final jx2 b(jx2 jx2Var, jx2 jx2Var2) {
        z65.h(jx2Var, "<this>");
        z65.h(jx2Var2, "deliveryLocation");
        return jx2.b(jx2Var, null, null, jx2Var2.c(), null, 11, null);
    }

    public static final jx2 c(jx2 jx2Var, String str, String str2) {
        Map x;
        z65.h(jx2Var, "<this>");
        z65.h(str, Action.KEY_ATTRIBUTE);
        z65.h(str2, "value");
        x = g86.x(jx2Var.c());
        x.put(str, str2);
        Unit unit = Unit.a;
        return jx2.b(jx2Var, null, null, x, null, 11, null);
    }
}
