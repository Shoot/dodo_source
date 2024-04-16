package ru.dodopizza.backend.domain.order.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.state.dto.personalization.MinDeliveryPrice;
import ru.dodopizza.backend.domain.state.dto.personalization.UpsellProducts;
/* compiled from: OrderPersonalization.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/dodopizza/backend/domain/order/dto/OrderPersonalization;", "", "minDeliveryPrice", "Lru/dodopizza/backend/domain/state/dto/personalization/MinDeliveryPrice;", "upsellProducts", "Lru/dodopizza/backend/domain/state/dto/personalization/UpsellProducts;", "(Lru/dodopizza/backend/domain/state/dto/personalization/MinDeliveryPrice;Lru/dodopizza/backend/domain/state/dto/personalization/UpsellProducts;)V", "getMinDeliveryPrice", "()Lru/dodopizza/backend/domain/state/dto/personalization/MinDeliveryPrice;", "getUpsellProducts", "()Lru/dodopizza/backend/domain/state/dto/personalization/UpsellProducts;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderPersonalization {
    @uca("minDeliveryPrice")
    private final MinDeliveryPrice minDeliveryPrice;
    @uca("upsellProducts")
    private final UpsellProducts upsellProducts;

    public OrderPersonalization() {
        this(null, null, 3, null);
    }

    public final MinDeliveryPrice getMinDeliveryPrice() {
        return this.minDeliveryPrice;
    }

    public final UpsellProducts getUpsellProducts() {
        return this.upsellProducts;
    }

    public OrderPersonalization(MinDeliveryPrice minDeliveryPrice, UpsellProducts upsellProducts) {
        this.minDeliveryPrice = minDeliveryPrice;
        this.upsellProducts = upsellProducts;
    }

    public /* synthetic */ OrderPersonalization(MinDeliveryPrice minDeliveryPrice, UpsellProducts upsellProducts, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : minDeliveryPrice, (i & 2) != 0 ? null : upsellProducts);
    }
}
