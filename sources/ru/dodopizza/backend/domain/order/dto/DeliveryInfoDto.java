package ru.dodopizza.backend.domain.order.dto;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.state.dto.DeliveryAddressDto;
import ru.dodopizza.backend.domain.state.dto.PackageTypeDto;
/* compiled from: DeliveryInfoDto.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\t\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/dodopizza/backend/domain/order/dto/DeliveryInfoDto;", "", "orderType", "", "address", "Lru/dodopizza/backend/domain/state/dto/DeliveryAddressDto;", "pizzeriaId", "", "deferredTime", "isTakeaway", "", "tableNumber", "packageType", "Lru/dodopizza/backend/domain/state/dto/PackageTypeDto;", "(ILru/dodopizza/backend/domain/state/dto/DeliveryAddressDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lru/dodopizza/backend/domain/state/dto/PackageTypeDto;)V", "getAddress", "()Lru/dodopizza/backend/domain/state/dto/DeliveryAddressDto;", "getDeferredTime", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOrderType", "()I", "getPackageType", "()Lru/dodopizza/backend/domain/state/dto/PackageTypeDto;", "getPizzeriaId", "getTableNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryInfoDto {
    @uca("address")
    private final DeliveryAddressDto address;
    @uca("deferredOrderDateTime")
    private final String deferredTime;
    @uca("isTakeaway")
    private final Boolean isTakeaway;
    @uca("orderType")
    private final int orderType;
    @uca("packageType")
    private final PackageTypeDto packageType;
    @uca("pizzeriaId")
    private final String pizzeriaId;
    @uca("tableNumber")
    private final Integer tableNumber;

    public DeliveryInfoDto(int i, DeliveryAddressDto deliveryAddressDto, String str, String str2, Boolean bool, Integer num, PackageTypeDto packageTypeDto) {
        this.orderType = i;
        this.address = deliveryAddressDto;
        this.pizzeriaId = str;
        this.deferredTime = str2;
        this.isTakeaway = bool;
        this.tableNumber = num;
        this.packageType = packageTypeDto;
    }

    public final DeliveryAddressDto getAddress() {
        return this.address;
    }

    public final String getDeferredTime() {
        return this.deferredTime;
    }

    public final int getOrderType() {
        return this.orderType;
    }

    public final PackageTypeDto getPackageType() {
        return this.packageType;
    }

    public final String getPizzeriaId() {
        return this.pizzeriaId;
    }

    public final Integer getTableNumber() {
        return this.tableNumber;
    }

    public final Boolean isTakeaway() {
        return this.isTakeaway;
    }
}
