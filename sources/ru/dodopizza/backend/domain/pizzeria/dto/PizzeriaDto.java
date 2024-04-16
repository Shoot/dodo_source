package ru.dodopizza.backend.domain.pizzeria.dto;

import ch.qos.logback.core.joran.action.Action;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PizzeriaDto.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\bU\b\u0086\b\u0018\u00002\u00020\u0001Bï\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0014HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0011\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0007HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u0010\u0010`\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010a\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010h\u001a\u00020\bHÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jú\u0001\u0010k\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010lJ\u0013\u0010m\u001a\u00020\u001c2\b\u0010n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010o\u001a\u00020\bHÖ\u0001J\t\u0010p\u001a\u00020\u0003HÖ\u0001R \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010!\"\u0004\b4\u0010#R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010!\"\u0004\b6\u0010#R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010!\"\u0004\b8\u0010#R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010!\"\u0004\b>\u0010#R&\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010!\"\u0004\bH\u0010#R \u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010)\"\u0004\bJ\u0010+R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010@R\u001e\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR \u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010!\"\u0004\bU\u0010#R \u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010!\"\u0004\bW\u0010#¨\u0006q"}, d2 = {"Lru/dodopizza/backend/domain/pizzeria/dto/PizzeriaDto;", "", "id", "", Action.NAME_ATTRIBUTE, "localityId", "operationalTypeValues", "", "", "postcode", MessageAttributes.COORDINATES, "Lru/dodopizza/backend/domain/pizzeria/dto/CoordinatesDto;", "status", "managerPhoneNumber", "deliverySchedule", "Lru/dodopizza/backend/domain/pizzeria/dto/ScheduleDto;", "restaurantSchedule", "timeZoneUtcOffset", "cameraUrl", "minDeliveryPrice", "", "pizzeriaAddressInfo", "Lru/dodopizza/backend/domain/pizzeria/dto/PizzeriaAddressInfoDto;", "restaurantServiceTypes", "Lru/dodopizza/backend/domain/pizzeria/dto/RestaurantServiceTypeDto;", "tableDelivery", "Lru/dodopizza/backend/domain/pizzeria/dto/TableDeliveryDto;", "hasKidsPlayground", "", "hasWorkshops", "workshopUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lru/dodopizza/backend/domain/pizzeria/dto/CoordinatesDto;ILjava/lang/String;Lru/dodopizza/backend/domain/pizzeria/dto/ScheduleDto;Lru/dodopizza/backend/domain/pizzeria/dto/ScheduleDto;Ljava/lang/String;Ljava/lang/String;DLru/dodopizza/backend/domain/pizzeria/dto/PizzeriaAddressInfoDto;Ljava/util/List;Lru/dodopizza/backend/domain/pizzeria/dto/TableDeliveryDto;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getCameraUrl", "()Ljava/lang/String;", "setCameraUrl", "(Ljava/lang/String;)V", "getCoordinates", "()Lru/dodopizza/backend/domain/pizzeria/dto/CoordinatesDto;", "setCoordinates", "(Lru/dodopizza/backend/domain/pizzeria/dto/CoordinatesDto;)V", "getDeliverySchedule", "()Lru/dodopizza/backend/domain/pizzeria/dto/ScheduleDto;", "setDeliverySchedule", "(Lru/dodopizza/backend/domain/pizzeria/dto/ScheduleDto;)V", "getHasKidsPlayground", "()Ljava/lang/Boolean;", "setHasKidsPlayground", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getHasWorkshops", "setHasWorkshops", "getId", "setId", "getLocalityId", "setLocalityId", "getManagerPhoneNumber", "setManagerPhoneNumber", "getMinDeliveryPrice", "()D", "setMinDeliveryPrice", "(D)V", "getName", "setName", "getOperationalTypeValues", "()Ljava/util/List;", "setOperationalTypeValues", "(Ljava/util/List;)V", "getPizzeriaAddressInfo", "()Lru/dodopizza/backend/domain/pizzeria/dto/PizzeriaAddressInfoDto;", "setPizzeriaAddressInfo", "(Lru/dodopizza/backend/domain/pizzeria/dto/PizzeriaAddressInfoDto;)V", "getPostcode", "setPostcode", "getRestaurantSchedule", "setRestaurantSchedule", "getRestaurantServiceTypes", "getStatus", "()I", "setStatus", "(I)V", "getTableDelivery", "()Lru/dodopizza/backend/domain/pizzeria/dto/TableDeliveryDto;", "setTableDelivery", "(Lru/dodopizza/backend/domain/pizzeria/dto/TableDeliveryDto;)V", "getTimeZoneUtcOffset", "setTimeZoneUtcOffset", "getWorkshopUrl", "setWorkshopUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lru/dodopizza/backend/domain/pizzeria/dto/CoordinatesDto;ILjava/lang/String;Lru/dodopizza/backend/domain/pizzeria/dto/ScheduleDto;Lru/dodopizza/backend/domain/pizzeria/dto/ScheduleDto;Ljava/lang/String;Ljava/lang/String;DLru/dodopizza/backend/domain/pizzeria/dto/PizzeriaAddressInfoDto;Ljava/util/List;Lru/dodopizza/backend/domain/pizzeria/dto/TableDeliveryDto;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lru/dodopizza/backend/domain/pizzeria/dto/PizzeriaDto;", "equals", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PizzeriaDto {
    @uca("cameraUrl")
    private String cameraUrl;
    @uca(MessageAttributes.COORDINATES)
    private CoordinatesDto coordinates;
    @uca("deliverySchedule")
    private ScheduleDto deliverySchedule;
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
    @uca("minDeliveryPrice")
    private double minDeliveryPrice;
    @uca(Action.NAME_ATTRIBUTE)
    private String name;
    @uca("operationalTypes")
    private List<Integer> operationalTypeValues;
    @uca("pizzeriaAddressInfo")
    private PizzeriaAddressInfoDto pizzeriaAddressInfo;
    @uca("postcode")
    private String postcode;
    @uca("restaurantSchedule")
    private ScheduleDto restaurantSchedule;
    @uca("restaurantServiceTypes")
    private final List<RestaurantServiceTypeDto> restaurantServiceTypes;
    @uca("status")
    private int status;
    @uca("tableDelivery")
    private TableDeliveryDto tableDelivery;
    @uca("timeZoneUtcOffset")
    private String timeZoneUtcOffset;
    @uca("workshopUrl")
    private String workshopUrl;

    public PizzeriaDto(String str, String str2, String str3, List<Integer> list, String str4, CoordinatesDto coordinatesDto, int i, String str5, ScheduleDto scheduleDto, ScheduleDto scheduleDto2, String str6, String str7, double d, PizzeriaAddressInfoDto pizzeriaAddressInfoDto, List<RestaurantServiceTypeDto> list2, TableDeliveryDto tableDeliveryDto, Boolean bool, Boolean bool2, String str8) {
        this.id = str;
        this.name = str2;
        this.localityId = str3;
        this.operationalTypeValues = list;
        this.postcode = str4;
        this.coordinates = coordinatesDto;
        this.status = i;
        this.managerPhoneNumber = str5;
        this.deliverySchedule = scheduleDto;
        this.restaurantSchedule = scheduleDto2;
        this.timeZoneUtcOffset = str6;
        this.cameraUrl = str7;
        this.minDeliveryPrice = d;
        this.pizzeriaAddressInfo = pizzeriaAddressInfoDto;
        this.restaurantServiceTypes = list2;
        this.tableDelivery = tableDeliveryDto;
        this.hasKidsPlayground = bool;
        this.hasWorkshops = bool2;
        this.workshopUrl = str8;
    }

    public final String component1() {
        return this.id;
    }

    public final ScheduleDto component10() {
        return this.restaurantSchedule;
    }

    public final String component11() {
        return this.timeZoneUtcOffset;
    }

    public final String component12() {
        return this.cameraUrl;
    }

    public final double component13() {
        return this.minDeliveryPrice;
    }

    public final PizzeriaAddressInfoDto component14() {
        return this.pizzeriaAddressInfo;
    }

    public final List<RestaurantServiceTypeDto> component15() {
        return this.restaurantServiceTypes;
    }

    public final TableDeliveryDto component16() {
        return this.tableDelivery;
    }

    public final Boolean component17() {
        return this.hasKidsPlayground;
    }

    public final Boolean component18() {
        return this.hasWorkshops;
    }

    public final String component19() {
        return this.workshopUrl;
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

    public final String component5() {
        return this.postcode;
    }

    public final CoordinatesDto component6() {
        return this.coordinates;
    }

    public final int component7() {
        return this.status;
    }

    public final String component8() {
        return this.managerPhoneNumber;
    }

    public final ScheduleDto component9() {
        return this.deliverySchedule;
    }

    public final PizzeriaDto copy(String str, String str2, String str3, List<Integer> list, String str4, CoordinatesDto coordinatesDto, int i, String str5, ScheduleDto scheduleDto, ScheduleDto scheduleDto2, String str6, String str7, double d, PizzeriaAddressInfoDto pizzeriaAddressInfoDto, List<RestaurantServiceTypeDto> list2, TableDeliveryDto tableDeliveryDto, Boolean bool, Boolean bool2, String str8) {
        return new PizzeriaDto(str, str2, str3, list, str4, coordinatesDto, i, str5, scheduleDto, scheduleDto2, str6, str7, d, pizzeriaAddressInfoDto, list2, tableDeliveryDto, bool, bool2, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PizzeriaDto)) {
            return false;
        }
        PizzeriaDto pizzeriaDto = (PizzeriaDto) obj;
        if (z65.c(this.id, pizzeriaDto.id) && z65.c(this.name, pizzeriaDto.name) && z65.c(this.localityId, pizzeriaDto.localityId) && z65.c(this.operationalTypeValues, pizzeriaDto.operationalTypeValues) && z65.c(this.postcode, pizzeriaDto.postcode) && z65.c(this.coordinates, pizzeriaDto.coordinates) && this.status == pizzeriaDto.status && z65.c(this.managerPhoneNumber, pizzeriaDto.managerPhoneNumber) && z65.c(this.deliverySchedule, pizzeriaDto.deliverySchedule) && z65.c(this.restaurantSchedule, pizzeriaDto.restaurantSchedule) && z65.c(this.timeZoneUtcOffset, pizzeriaDto.timeZoneUtcOffset) && z65.c(this.cameraUrl, pizzeriaDto.cameraUrl) && Double.compare(this.minDeliveryPrice, pizzeriaDto.minDeliveryPrice) == 0 && z65.c(this.pizzeriaAddressInfo, pizzeriaDto.pizzeriaAddressInfo) && z65.c(this.restaurantServiceTypes, pizzeriaDto.restaurantServiceTypes) && z65.c(this.tableDelivery, pizzeriaDto.tableDelivery) && z65.c(this.hasKidsPlayground, pizzeriaDto.hasKidsPlayground) && z65.c(this.hasWorkshops, pizzeriaDto.hasWorkshops) && z65.c(this.workshopUrl, pizzeriaDto.workshopUrl)) {
            return true;
        }
        return false;
    }

    public final String getCameraUrl() {
        return this.cameraUrl;
    }

    public final CoordinatesDto getCoordinates() {
        return this.coordinates;
    }

    public final ScheduleDto getDeliverySchedule() {
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

    public final double getMinDeliveryPrice() {
        return this.minDeliveryPrice;
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

    public final String getPostcode() {
        return this.postcode;
    }

    public final ScheduleDto getRestaurantSchedule() {
        return this.restaurantSchedule;
    }

    public final List<RestaurantServiceTypeDto> getRestaurantServiceTypes() {
        return this.restaurantServiceTypes;
    }

    public final int getStatus() {
        return this.status;
    }

    public final TableDeliveryDto getTableDelivery() {
        return this.tableDelivery;
    }

    public final String getTimeZoneUtcOffset() {
        return this.timeZoneUtcOffset;
    }

    public final String getWorkshopUrl() {
        return this.workshopUrl;
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
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
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
        String str4 = this.postcode;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        CoordinatesDto coordinatesDto = this.coordinates;
        if (coordinatesDto == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = coordinatesDto.hashCode();
        }
        int i7 = (((i6 + hashCode6) * 31) + this.status) * 31;
        String str5 = this.managerPhoneNumber;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        ScheduleDto scheduleDto = this.deliverySchedule;
        if (scheduleDto == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = scheduleDto.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        ScheduleDto scheduleDto2 = this.restaurantSchedule;
        if (scheduleDto2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = scheduleDto2.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        String str6 = this.timeZoneUtcOffset;
        if (str6 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str6.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        String str7 = this.cameraUrl;
        if (str7 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str7.hashCode();
        }
        int a = (((i11 + hashCode11) * 31) + nkb.a(this.minDeliveryPrice)) * 31;
        PizzeriaAddressInfoDto pizzeriaAddressInfoDto = this.pizzeriaAddressInfo;
        if (pizzeriaAddressInfoDto == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = pizzeriaAddressInfoDto.hashCode();
        }
        int i12 = (a + hashCode12) * 31;
        List<RestaurantServiceTypeDto> list2 = this.restaurantServiceTypes;
        if (list2 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = list2.hashCode();
        }
        int i13 = (i12 + hashCode13) * 31;
        TableDeliveryDto tableDeliveryDto = this.tableDelivery;
        if (tableDeliveryDto == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = tableDeliveryDto.hashCode();
        }
        int i14 = (i13 + hashCode14) * 31;
        Boolean bool = this.hasKidsPlayground;
        if (bool == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = bool.hashCode();
        }
        int i15 = (i14 + hashCode15) * 31;
        Boolean bool2 = this.hasWorkshops;
        if (bool2 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = bool2.hashCode();
        }
        int i16 = (i15 + hashCode16) * 31;
        String str8 = this.workshopUrl;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return i16 + i;
    }

    public final void setCameraUrl(String str) {
        this.cameraUrl = str;
    }

    public final void setCoordinates(CoordinatesDto coordinatesDto) {
        this.coordinates = coordinatesDto;
    }

    public final void setDeliverySchedule(ScheduleDto scheduleDto) {
        this.deliverySchedule = scheduleDto;
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

    public final void setMinDeliveryPrice(double d) {
        this.minDeliveryPrice = d;
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

    public final void setPostcode(String str) {
        this.postcode = str;
    }

    public final void setRestaurantSchedule(ScheduleDto scheduleDto) {
        this.restaurantSchedule = scheduleDto;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTableDelivery(TableDeliveryDto tableDeliveryDto) {
        this.tableDelivery = tableDeliveryDto;
    }

    public final void setTimeZoneUtcOffset(String str) {
        this.timeZoneUtcOffset = str;
    }

    public final void setWorkshopUrl(String str) {
        this.workshopUrl = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.localityId;
        List<Integer> list = this.operationalTypeValues;
        String str4 = this.postcode;
        CoordinatesDto coordinatesDto = this.coordinates;
        int i = this.status;
        String str5 = this.managerPhoneNumber;
        ScheduleDto scheduleDto = this.deliverySchedule;
        ScheduleDto scheduleDto2 = this.restaurantSchedule;
        String str6 = this.timeZoneUtcOffset;
        String str7 = this.cameraUrl;
        double d = this.minDeliveryPrice;
        PizzeriaAddressInfoDto pizzeriaAddressInfoDto = this.pizzeriaAddressInfo;
        List<RestaurantServiceTypeDto> list2 = this.restaurantServiceTypes;
        TableDeliveryDto tableDeliveryDto = this.tableDelivery;
        Boolean bool = this.hasKidsPlayground;
        Boolean bool2 = this.hasWorkshops;
        String str8 = this.workshopUrl;
        return "PizzeriaDto(id=" + str + ", name=" + str2 + ", localityId=" + str3 + ", operationalTypeValues=" + list + ", postcode=" + str4 + ", coordinates=" + coordinatesDto + ", status=" + i + ", managerPhoneNumber=" + str5 + ", deliverySchedule=" + scheduleDto + ", restaurantSchedule=" + scheduleDto2 + ", timeZoneUtcOffset=" + str6 + ", cameraUrl=" + str7 + ", minDeliveryPrice=" + d + ", pizzeriaAddressInfo=" + pizzeriaAddressInfoDto + ", restaurantServiceTypes=" + list2 + ", tableDelivery=" + tableDeliveryDto + ", hasKidsPlayground=" + bool + ", hasWorkshops=" + bool2 + ", workshopUrl=" + str8 + ")";
    }

    public /* synthetic */ PizzeriaDto(String str, String str2, String str3, List list, String str4, CoordinatesDto coordinatesDto, int i, String str5, ScheduleDto scheduleDto, ScheduleDto scheduleDto2, String str6, String str7, double d, PizzeriaAddressInfoDto pizzeriaAddressInfoDto, List list2, TableDeliveryDto tableDeliveryDto, Boolean bool, Boolean bool2, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : coordinatesDto, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? null : scheduleDto, (i2 & 512) != 0 ? null : scheduleDto2, (i2 & 1024) != 0 ? null : str6, (i2 & 2048) != 0 ? null : str7, (i2 & 4096) != 0 ? 0.0d : d, (i2 & 8192) != 0 ? null : pizzeriaAddressInfoDto, list2, (32768 & i2) != 0 ? null : tableDeliveryDto, (65536 & i2) != 0 ? null : bool, (131072 & i2) != 0 ? null : bool2, (i2 & 262144) != 0 ? null : str8);
    }
}
