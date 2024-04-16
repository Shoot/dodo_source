package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.state.dto.deliverylocation.CoordinatesDto;
import ru.dodopizza.backend.domain.state.dto.deliverylocation.SetClientDeliveryLocationDto;
import ru.dodopizza.backend.domain.state.dto.deliverylocation.SetDeliveryLocationDto;
/* compiled from: DeliveryLocationDtoConverter.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0012"}, d2 = {"Lhy2;", "Lgy2;", "Ljx2;", "Lru/dodopizza/backend/domain/state/dto/deliverylocation/SetDeliveryLocationDto;", c.a, "Lqw1;", "Lru/dodopizza/backend/domain/state/dto/deliverylocation/CoordinatesDto;", "b", "", "stateId", "Le91;", "clientDeliveryLocation", "", "setDeliveryOrderType", "Lru/dodopizza/backend/domain/state/dto/deliverylocation/SetClientDeliveryLocationDto;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hy2  reason: default package */
/* loaded from: classes4.dex */
public final class hy2 implements gy2 {
    private final CoordinatesDto b(qw1 qw1Var) {
        return new CoordinatesDto(qw1Var.b(), qw1Var.c());
    }

    private final SetDeliveryLocationDto c(jx2 jx2Var) {
        return new SetDeliveryLocationDto(jx2Var.f(), jx2Var.c(), b(jx2Var.d()), jx2Var.e());
    }

    @Override // defpackage.gy2
    public SetClientDeliveryLocationDto a(String str, e91 e91Var, boolean z) {
        z65.h(str, "stateId");
        z65.h(e91Var, "clientDeliveryLocation");
        return new SetClientDeliveryLocationDto(str, e91Var.getId(), c(e91Var.c()), z);
    }
}
