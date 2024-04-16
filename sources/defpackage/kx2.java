package defpackage;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.backend.domain.state.dto.deliverylocation.ClientDeliveryLocationDto;
/* compiled from: DeliveryLocationConversions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lru/dodopizza/backend/domain/state/dto/deliverylocation/ClientDeliveryLocationDto;", "Le91;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "toModel", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: kx2  reason: default package */
/* loaded from: classes4.dex */
public final class kx2 {
    private static final Function1<ClientDeliveryLocationDto, e91> a = a.a;

    /* compiled from: DeliveryLocationConversions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/deliverylocation/ClientDeliveryLocationDto;", "Le91;", "a", "(Lru/dodopizza/backend/domain/state/dto/deliverylocation/ClientDeliveryLocationDto;)Le91;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kx2$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<ClientDeliveryLocationDto, e91> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final e91 invoke(ClientDeliveryLocationDto clientDeliveryLocationDto) {
            boolean z;
            z65.h(clientDeliveryLocationDto, "$this$null");
            qw1 qw1Var = new qw1(clientDeliveryLocationDto.getDeliveryLocation().getCoordinates().getLat(), clientDeliveryLocationDto.getDeliveryLocation().getCoordinates().getLon());
            String formattedAddress = clientDeliveryLocationDto.getDeliveryLocation().getFormattedAddress();
            Map<String, String> additions = clientDeliveryLocationDto.getDeliveryLocation().getAdditions();
            if (additions == null) {
                additions = g86.h();
            }
            jx2 jx2Var = new jx2(formattedAddress, qw1Var, additions, clientDeliveryLocationDto.getDeliveryLocation().getEncodedComponents());
            String id = clientDeliveryLocationDto.getId();
            Boolean requiresAdditions = clientDeliveryLocationDto.getRequiresAdditions();
            if (requiresAdditions != null) {
                z = requiresAdditions.booleanValue();
            } else {
                z = true;
            }
            return new e91(id, jx2Var, z);
        }
    }

    public static final Function1<ClientDeliveryLocationDto, e91> a() {
        return a;
    }
}
