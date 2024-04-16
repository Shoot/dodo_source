package ru.dodopizza.backend.domain.pizzeria.dto;

import kotlin.Metadata;
/* compiled from: RestaurantServiceTypeDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lru/dodopizza/backend/domain/pizzeria/dto/RestaurantServiceTypeDto;", "", "serviceType", "Lru/dodopizza/backend/domain/pizzeria/dto/RestaurantServiceTypeDto$ServiceTypeDto;", "priority", "", "(Lru/dodopizza/backend/domain/pizzeria/dto/RestaurantServiceTypeDto$ServiceTypeDto;I)V", "getPriority", "()I", "getServiceType", "()Lru/dodopizza/backend/domain/pizzeria/dto/RestaurantServiceTypeDto$ServiceTypeDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "ServiceTypeDto", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RestaurantServiceTypeDto {
    @uca("priority")
    private final int priority;
    @uca("serviceType")
    private final ServiceTypeDto serviceType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RestaurantServiceTypeDto.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/dodopizza/backend/domain/pizzeria/dto/RestaurantServiceTypeDto$ServiceTypeDto;", "", "(Ljava/lang/String;I)V", "DINE_IN", "TAKEAWAY", "TABLE", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ServiceTypeDto {
        private static final /* synthetic */ kj3 $ENTRIES;
        private static final /* synthetic */ ServiceTypeDto[] $VALUES;
        @uca("dineIn")
        public static final ServiceTypeDto DINE_IN = new ServiceTypeDto("DINE_IN", 0);
        @uca("takeaway")
        public static final ServiceTypeDto TAKEAWAY = new ServiceTypeDto("TAKEAWAY", 1);
        @uca("table")
        public static final ServiceTypeDto TABLE = new ServiceTypeDto("TABLE", 2);

        private static final /* synthetic */ ServiceTypeDto[] $values() {
            return new ServiceTypeDto[]{DINE_IN, TAKEAWAY, TABLE};
        }

        static {
            ServiceTypeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = lj3.a($values);
        }

        private ServiceTypeDto(String str, int i) {
        }

        public static kj3<ServiceTypeDto> getEntries() {
            return $ENTRIES;
        }

        public static ServiceTypeDto valueOf(String str) {
            return (ServiceTypeDto) Enum.valueOf(ServiceTypeDto.class, str);
        }

        public static ServiceTypeDto[] values() {
            return (ServiceTypeDto[]) $VALUES.clone();
        }
    }

    public RestaurantServiceTypeDto(ServiceTypeDto serviceTypeDto, int i) {
        this.serviceType = serviceTypeDto;
        this.priority = i;
    }

    public static /* synthetic */ RestaurantServiceTypeDto copy$default(RestaurantServiceTypeDto restaurantServiceTypeDto, ServiceTypeDto serviceTypeDto, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            serviceTypeDto = restaurantServiceTypeDto.serviceType;
        }
        if ((i2 & 2) != 0) {
            i = restaurantServiceTypeDto.priority;
        }
        return restaurantServiceTypeDto.copy(serviceTypeDto, i);
    }

    public final ServiceTypeDto component1() {
        return this.serviceType;
    }

    public final int component2() {
        return this.priority;
    }

    public final RestaurantServiceTypeDto copy(ServiceTypeDto serviceTypeDto, int i) {
        return new RestaurantServiceTypeDto(serviceTypeDto, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RestaurantServiceTypeDto)) {
            return false;
        }
        RestaurantServiceTypeDto restaurantServiceTypeDto = (RestaurantServiceTypeDto) obj;
        if (this.serviceType == restaurantServiceTypeDto.serviceType && this.priority == restaurantServiceTypeDto.priority) {
            return true;
        }
        return false;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final ServiceTypeDto getServiceType() {
        return this.serviceType;
    }

    public int hashCode() {
        int hashCode;
        ServiceTypeDto serviceTypeDto = this.serviceType;
        if (serviceTypeDto == null) {
            hashCode = 0;
        } else {
            hashCode = serviceTypeDto.hashCode();
        }
        return (hashCode * 31) + this.priority;
    }

    public String toString() {
        ServiceTypeDto serviceTypeDto = this.serviceType;
        int i = this.priority;
        return "RestaurantServiceTypeDto(serviceType=" + serviceTypeDto + ", priority=" + i + ")";
    }
}
