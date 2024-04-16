package ru.dodopizza.backend.domain.pizzeria.dto;

import ch.qos.logback.core.joran.action.Action;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: NewPizzeriaDto.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b?\b\u0086\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0017J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0011\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0007HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010E\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010H\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010J\u001a\u00020\bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u0011\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003JÌ\u0001\u0010N\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010OJ\u0013\u0010P\u001a\u00020\u00152\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010R\u001a\u00020\bHÖ\u0001J\t\u0010S\u001a\u00020\u0003HÖ\u0001R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R&\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001d\"\u0004\b2\u0010\u001fR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R&\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001d\"\u0004\b8\u0010\u001fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001dR\u001e\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010(\"\u0004\b?\u0010*¨\u0006T"}, d2 = {"Lru/dodopizza/backend/domain/pizzeria/dto/NewPizzeriaDto;", "", "id", "", Action.NAME_ATTRIBUTE, "localityId", "operationalTypeValues", "", "", MessageAttributes.COORDINATES, "Lru/dodopizza/backend/domain/pizzeria/dto/CoordinatesDto;", "status", "managerPhoneNumber", "deliverySchedule", "restaurantSchedule", "timeZoneUtcOffset", "pizzeriaAddressInfo", "Lru/dodopizza/backend/domain/pizzeria/dto/PizzeriaAddressInfoDto;", "restaurantServiceTypes", "Lru/dodopizza/backend/domain/pizzeria/dto/RestaurantServiceTypeDto;", "hasKidsPlayground", "", "hasWorkshops", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/dodopizza/backend/domain/pizzeria/dto/CoordinatesDto;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lru/dodopizza/backend/domain/pizzeria/dto/PizzeriaAddressInfoDto;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCoordinates", "()Lru/dodopizza/backend/domain/pizzeria/dto/CoordinatesDto;", "setCoordinates", "(Lru/dodopizza/backend/domain/pizzeria/dto/CoordinatesDto;)V", "getDeliverySchedule", "()Ljava/util/List;", "setDeliverySchedule", "(Ljava/util/List;)V", "getHasKidsPlayground", "()Ljava/lang/Boolean;", "setHasKidsPlayground", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getHasWorkshops", "setHasWorkshops", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getLocalityId", "setLocalityId", "getManagerPhoneNumber", "setManagerPhoneNumber", "getName", "setName", "getOperationalTypeValues", "setOperationalTypeValues", "getPizzeriaAddressInfo", "()Lru/dodopizza/backend/domain/pizzeria/dto/PizzeriaAddressInfoDto;", "setPizzeriaAddressInfo", "(Lru/dodopizza/backend/domain/pizzeria/dto/PizzeriaAddressInfoDto;)V", "getRestaurantSchedule", "setRestaurantSchedule", "getRestaurantServiceTypes", "getStatus", "()I", "setStatus", "(I)V", "getTimeZoneUtcOffset", "setTimeZoneUtcOffset", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/dodopizza/backend/domain/pizzeria/dto/CoordinatesDto;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lru/dodopizza/backend/domain/pizzeria/dto/PizzeriaAddressInfoDto;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/dodopizza/backend/domain/pizzeria/dto/NewPizzeriaDto;", "equals", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NewPizzeriaDto {
    @uca(MessageAttributes.COORDINATES)
    private CoordinatesDto coordinates;
    @uca("deliverySchedule")
    private List<String> deliverySchedule;
    @uca("hasKidsPlayground")
    private Boolean hasKidsPlayground;
    @uca("hasWorkshops")
    private Boolean hasWorkshops;
    @uca("id")
    private String id;
    @uca("localityId")
    private String localityId;
    @uca("managerPhoneNumber")
    private String managerPhoneNumber;
    @uca(Action.NAME_ATTRIBUTE)
    private String name;
    @uca("operationalTypes")
    private List<Integer> operationalTypeValues;
    @uca("pizzeriaAddressInfo")
    private PizzeriaAddressInfoDto pizzeriaAddressInfo;
    @uca("restaurantSchedule")
    private List<String> restaurantSchedule;
    @uca("restaurantServiceTypes")
    private final List<RestaurantServiceTypeDto> restaurantServiceTypes;
    @uca("status")
    private int status;
    @uca("timeZoneUtcOffset")
    private String timeZoneUtcOffset;

    public NewPizzeriaDto(String str, String str2, String str3, List<Integer> list, CoordinatesDto coordinatesDto, int i, String str4, List<String> list2, List<String> list3, String str5, PizzeriaAddressInfoDto pizzeriaAddressInfoDto, List<RestaurantServiceTypeDto> list4, Boolean bool, Boolean bool2) {
        this.id = str;
        this.name = str2;
        this.localityId = str3;
        this.operationalTypeValues = list;
        this.coordinates = coordinatesDto;
        this.status = i;
        this.managerPhoneNumber = str4;
        this.deliverySchedule = list2;
        this.restaurantSchedule = list3;
        this.timeZoneUtcOffset = str5;
        this.pizzeriaAddressInfo = pizzeriaAddressInfoDto;
        this.restaurantServiceTypes = list4;
        this.hasKidsPlayground = bool;
        this.hasWorkshops = bool2;
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.timeZoneUtcOffset;
    }

    public final PizzeriaAddressInfoDto component11() {
        return this.pizzeriaAddressInfo;
    }

    public final List<RestaurantServiceTypeDto> component12() {
        return this.restaurantServiceTypes;
    }

    public final Boolean component13() {
        return this.hasKidsPlayground;
    }

    public final Boolean component14() {
        return this.hasWorkshops;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.localityId;
    }

    public final List<Integer> component4() {
        return this.operationalTypeValues;
    }

    public final CoordinatesDto component5() {
        return this.coordinates;
    }

    public final int component6() {
        return this.status;
    }

    public final String component7() {
        return this.managerPhoneNumber;
    }

    public final List<String> component8() {
        return this.deliverySchedule;
    }

    public final List<String> component9() {
        return this.restaurantSchedule;
    }

    public final NewPizzeriaDto copy(String str, String str2, String str3, List<Integer> list, CoordinatesDto coordinatesDto, int i, String str4, List<String> list2, List<String> list3, String str5, PizzeriaAddressInfoDto pizzeriaAddressInfoDto, List<RestaurantServiceTypeDto> list4, Boolean bool, Boolean bool2) {
        return new NewPizzeriaDto(str, str2, str3, list, coordinatesDto, i, str4, list2, list3, str5, pizzeriaAddressInfoDto, list4, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewPizzeriaDto)) {
            return false;
        }
        NewPizzeriaDto newPizzeriaDto = (NewPizzeriaDto) obj;
        if (z65.c(this.id, newPizzeriaDto.id) && z65.c(this.name, newPizzeriaDto.name) && z65.c(this.localityId, newPizzeriaDto.localityId) && z65.c(this.operationalTypeValues, newPizzeriaDto.operationalTypeValues) && z65.c(this.coordinates, newPizzeriaDto.coordinates) && this.status == newPizzeriaDto.status && z65.c(this.managerPhoneNumber, newPizzeriaDto.managerPhoneNumber) && z65.c(this.deliverySchedule, newPizzeriaDto.deliverySchedule) && z65.c(this.restaurantSchedule, newPizzeriaDto.restaurantSchedule) && z65.c(this.timeZoneUtcOffset, newPizzeriaDto.timeZoneUtcOffset) && z65.c(this.pizzeriaAddressInfo, newPizzeriaDto.pizzeriaAddressInfo) && z65.c(this.restaurantServiceTypes, newPizzeriaDto.restaurantServiceTypes) && z65.c(this.hasKidsPlayground, newPizzeriaDto.hasKidsPlayground) && z65.c(this.hasWorkshops, newPizzeriaDto.hasWorkshops)) {
            return true;
        }
        return false;
    }

    public final CoordinatesDto getCoordinates() {
        return this.coordinates;
    }

    public final List<String> getDeliverySchedule() {
        return this.deliverySchedule;
    }

    public final Boolean getHasKidsPlayground() {
        return this.hasKidsPlayground;
    }

    public final Boolean getHasWorkshops() {
        return this.hasWorkshops;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLocalityId() {
        return this.localityId;
    }

    public final String getManagerPhoneNumber() {
        return this.managerPhoneNumber;
    }

    public final String getName() {
        return this.name;
    }

    public final List<Integer> getOperationalTypeValues() {
        return this.operationalTypeValues;
    }

    public final PizzeriaAddressInfoDto getPizzeriaAddressInfo() {
        return this.pizzeriaAddressInfo;
    }

    public final List<String> getRestaurantSchedule() {
        return this.restaurantSchedule;
    }

    public final List<RestaurantServiceTypeDto> getRestaurantServiceTypes() {
        return this.restaurantServiceTypes;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getTimeZoneUtcOffset() {
        return this.timeZoneUtcOffset;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        String str = this.id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.name;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.localityId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        List<Integer> list = this.operationalTypeValues;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        CoordinatesDto coordinatesDto = this.coordinates;
        if (coordinatesDto == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = coordinatesDto.hashCode();
        }
        int i6 = (((i5 + hashCode5) * 31) + this.status) * 31;
        String str4 = this.managerPhoneNumber;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        List<String> list2 = this.deliverySchedule;
        if (list2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list2.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        List<String> list3 = this.restaurantSchedule;
        if (list3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list3.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str5 = this.timeZoneUtcOffset;
        if (str5 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str5.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        PizzeriaAddressInfoDto pizzeriaAddressInfoDto = this.pizzeriaAddressInfo;
        if (pizzeriaAddressInfoDto == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = pizzeriaAddressInfoDto.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        List<RestaurantServiceTypeDto> list4 = this.restaurantServiceTypes;
        if (list4 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = list4.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        Boolean bool = this.hasKidsPlayground;
        if (bool == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = bool.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        Boolean bool2 = this.hasWorkshops;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return i13 + i;
    }

    public final void setCoordinates(CoordinatesDto coordinatesDto) {
        this.coordinates = coordinatesDto;
    }

    public final void setDeliverySchedule(List<String> list) {
        this.deliverySchedule = list;
    }

    public final void setHasKidsPlayground(Boolean bool) {
        this.hasKidsPlayground = bool;
    }

    public final void setHasWorkshops(Boolean bool) {
        this.hasWorkshops = bool;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setLocalityId(String str) {
        this.localityId = str;
    }

    public final void setManagerPhoneNumber(String str) {
        this.managerPhoneNumber = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOperationalTypeValues(List<Integer> list) {
        this.operationalTypeValues = list;
    }

    public final void setPizzeriaAddressInfo(PizzeriaAddressInfoDto pizzeriaAddressInfoDto) {
        this.pizzeriaAddressInfo = pizzeriaAddressInfoDto;
    }

    public final void setRestaurantSchedule(List<String> list) {
        this.restaurantSchedule = list;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTimeZoneUtcOffset(String str) {
        this.timeZoneUtcOffset = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.localityId;
        List<Integer> list = this.operationalTypeValues;
        CoordinatesDto coordinatesDto = this.coordinates;
        int i = this.status;
        String str4 = this.managerPhoneNumber;
        List<String> list2 = this.deliverySchedule;
        List<String> list3 = this.restaurantSchedule;
        String str5 = this.timeZoneUtcOffset;
        PizzeriaAddressInfoDto pizzeriaAddressInfoDto = this.pizzeriaAddressInfo;
        List<RestaurantServiceTypeDto> list4 = this.restaurantServiceTypes;
        Boolean bool = this.hasKidsPlayground;
        Boolean bool2 = this.hasWorkshops;
        return "NewPizzeriaDto(id=" + str + ", name=" + str2 + ", localityId=" + str3 + ", operationalTypeValues=" + list + ", coordinates=" + coordinatesDto + ", status=" + i + ", managerPhoneNumber=" + str4 + ", deliverySchedule=" + list2 + ", restaurantSchedule=" + list3 + ", timeZoneUtcOffset=" + str5 + ", pizzeriaAddressInfo=" + pizzeriaAddressInfoDto + ", restaurantServiceTypes=" + list4 + ", hasKidsPlayground=" + bool + ", hasWorkshops=" + bool2 + ")";
    }

    public /* synthetic */ NewPizzeriaDto(String str, String str2, String str3, List list, CoordinatesDto coordinatesDto, int i, String str4, List list2, List list3, String str5, PizzeriaAddressInfoDto pizzeriaAddressInfoDto, List list4, Boolean bool, Boolean bool2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : coordinatesDto, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : list2, (i2 & 256) != 0 ? null : list3, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : pizzeriaAddressInfoDto, list4, (i2 & 4096) != 0 ? null : bool, (i2 & 8192) != 0 ? null : bool2);
    }
}
