package defpackage;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.state.dto.DeliveryAddressDto;
/* compiled from: address_convertions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Lw6;", "address", "Lru/dodopizza/backend/domain/state/dto/DeliveryAddressDto;", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: j9  reason: default package */
/* loaded from: classes4.dex */
public final class j9 {
    public static final DeliveryAddressDto a(w6 w6Var) {
        z65.h(w6Var, "address");
        String id = w6Var.getId();
        String b = w6Var.n().b();
        z65.g(b, "getStreetId(...)");
        String c = w6Var.n().c();
        z65.g(c, "getStreetName(...)");
        return new DeliveryAddressDto(id, b, c, w6Var.k(), w6Var.e(), w6Var.d(), w6Var.i(), w6Var.j(), w6Var.l(), w6Var.f(), w6Var.c(), w6Var.m());
    }
}
