package ru.dodopizza.backend.domain.order.dto;

import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.cart.dto.ComboCartItemDto;
import ru.dodopizza.backend.domain.cart.dto.ProductCartItemDto;
/* compiled from: DataOrderDto.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bG\b\u0086\b\u0018\u00002\u00020\u0001B¡\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u000e\u0012\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u000e\u0012\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u000e\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u000e¢\u0006\u0002\u0010)J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010S\u001a\u00020\nHÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u001aHÆ\u0003J\t\u0010V\u001a\u00020\nHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010GJ\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u001aHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010!HÆ\u0003J\u0011\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u000eHÆ\u0003J\u0011\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u000eHÆ\u0003J\u0011\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u000eHÆ\u0003J\u000f\u0010a\u001a\b\u0012\u0004\u0012\u00020(0\u000eHÆ\u0003J\t\u0010b\u001a\u00020\u0007HÆ\u0003J\t\u0010c\u001a\u00020\u0005HÆ\u0003J\t\u0010d\u001a\u00020\nHÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0003Jâ\u0002\u0010i\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u001a2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\u0010\b\u0002\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u000e2\u0010\b\u0002\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u000e2\u0010\b\u0002\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u000e2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u000eHÆ\u0001¢\u0006\u0002\u0010jJ\u0013\u0010k\u001a\u00020\n2\b\u0010l\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010m\u001a\u00020\u0005HÖ\u0001J\t\u0010n\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0017\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0016\u0010\u001f\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u0018\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010+R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00100R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010+R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010+R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010-R\u0016\u0010\u001b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010-R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010=R\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010+R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00100R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010+R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010+R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010+R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010H\u001a\u0004\bF\u0010GR\u0016\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u00103R\u001e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u00100R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u00106R\u0016\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010+¨\u0006o"}, d2 = {"Lru/dodopizza/backend/domain/order/dto/DataOrderDto;", "", "id", "", "orderNumber", "", "orderStateInfo", "Lru/dodopizza/backend/domain/order/dto/OrderStateInfoDto;", "orderType", "isDeferredOrder", "", "clientName", "address", "productCartItems", "", "Lru/dodopizza/backend/domain/cart/dto/ProductCartItemDto;", "comboCartItems", "Lru/dodopizza/backend/domain/cart/dto/ComboCartItemDto;", "guaranteedDeliveryDateLocal", "guaranteedDeliveryDateUtc", "receiptDateLocal", "startExecutionDateLocal", "startExecutionDateUtc", "canBeCancelled", "pizzeriaId", "totalPrice", "", "isRatable", "estimatedTimeOfArrival", "tableNumber", MessageAttributes.UUID, "deliveryFee", "deliveryLocation", "Lru/dodopizza/backend/domain/order/dto/OrderLocationDto;", "unitLocation", "deliveryIcons", "Lru/dodopizza/backend/domain/order/dto/LocationIconsDto;", "unitIcons", "courierIcons", "gameIcons", "Lru/dodopizza/backend/domain/order/dto/GameIconsDto;", "(Ljava/lang/String;ILru/dodopizza/backend/domain/order/dto/OrderStateInfoDto;IZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;DZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;DLru/dodopizza/backend/domain/order/dto/OrderLocationDto;Lru/dodopizza/backend/domain/order/dto/OrderLocationDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAddress", "()Ljava/lang/String;", "getCanBeCancelled", "()Z", "getClientName", "getComboCartItems", "()Ljava/util/List;", "getCourierIcons", "getDeliveryFee", "()D", "getDeliveryIcons", "getDeliveryLocation", "()Lru/dodopizza/backend/domain/order/dto/OrderLocationDto;", "getEstimatedTimeOfArrival", "getGameIcons", "getGuaranteedDeliveryDateLocal", "getGuaranteedDeliveryDateUtc", "getId", "getOrderNumber", "()I", "getOrderStateInfo", "()Lru/dodopizza/backend/domain/order/dto/OrderStateInfoDto;", "getOrderType", "getPizzeriaId", "getProductCartItems", "getReceiptDateLocal", "getStartExecutionDateLocal", "getStartExecutionDateUtc", "getTableNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalPrice", "getUnitIcons", "getUnitLocation", "getUuid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ILru/dodopizza/backend/domain/order/dto/OrderStateInfoDto;IZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;DZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;DLru/dodopizza/backend/domain/order/dto/OrderLocationDto;Lru/dodopizza/backend/domain/order/dto/OrderLocationDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lru/dodopizza/backend/domain/order/dto/DataOrderDto;", "equals", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataOrderDto {
    @uca("address")
    private final String address;
    @uca("canBeCancelled")
    private final boolean canBeCancelled;
    @uca("clientName")
    private final String clientName;
    @uca("comboCartItems")
    private final List<ComboCartItemDto> comboCartItems;
    @uca("courierIcons")
    private final List<LocationIconsDto> courierIcons;
    @uca("deliveryFee")
    private final double deliveryFee;
    @uca("deliveryLocationIcons")
    private final List<LocationIconsDto> deliveryIcons;
    @uca("deliveryLocation")
    private final OrderLocationDto deliveryLocation;
    @uca("estimatedDeliveryArrivalTimeUtc")
    private final String estimatedTimeOfArrival;
    @uca("gameIcons")
    private final List<GameIconsDto> gameIcons;
    @uca("guaranteedDeliveryDateLocal")
    private final String guaranteedDeliveryDateLocal;
    @uca("guaranteedDeliveryDateUtc")
    private final String guaranteedDeliveryDateUtc;
    @uca("id")
    private final String id;
    @uca("isDeferredOrder")
    private final boolean isDeferredOrder;
    @uca("isRatable")
    private final boolean isRatable;
    @uca("orderNumber")
    private final int orderNumber;
    @uca("orderStateInfo")
    private final OrderStateInfoDto orderStateInfo;
    @uca("orderType")
    private final int orderType;
    @uca("pizzeriaId")
    private final String pizzeriaId;
    @uca("productCartItems")
    private final List<ProductCartItemDto> productCartItems;
    @uca("receiptDateLocal")
    private final String receiptDateLocal;
    @uca("startExecutionDateLocal")
    private final String startExecutionDateLocal;
    @uca("startExecutionDateUtc")
    private final String startExecutionDateUtc;
    @uca("tableNumber")
    private final Integer tableNumber;
    @uca("totalPrice")
    private final double totalPrice;
    @uca("unitIcons")
    private final List<LocationIconsDto> unitIcons;
    @uca("unitLocation")
    private final OrderLocationDto unitLocation;
    @uca("orderUUId")
    private final String uuid;

    public DataOrderDto(String str, int i, OrderStateInfoDto orderStateInfoDto, int i2, boolean z, String str2, String str3, List<ProductCartItemDto> list, List<ComboCartItemDto> list2, String str4, String str5, String str6, String str7, String str8, boolean z2, String str9, double d, boolean z3, String str10, Integer num, String str11, double d2, OrderLocationDto orderLocationDto, OrderLocationDto orderLocationDto2, List<LocationIconsDto> list3, List<LocationIconsDto> list4, List<LocationIconsDto> list5, List<GameIconsDto> list6) {
        z65.h(str, "id");
        z65.h(orderStateInfoDto, "orderStateInfo");
        z65.h(str2, "clientName");
        z65.h(str3, "address");
        z65.h(list, "productCartItems");
        z65.h(list2, "comboCartItems");
        z65.h(str9, "pizzeriaId");
        z65.h(str11, MessageAttributes.UUID);
        z65.h(list3, "deliveryIcons");
        z65.h(list4, "unitIcons");
        z65.h(list5, "courierIcons");
        z65.h(list6, "gameIcons");
        this.id = str;
        this.orderNumber = i;
        this.orderStateInfo = orderStateInfoDto;
        this.orderType = i2;
        this.isDeferredOrder = z;
        this.clientName = str2;
        this.address = str3;
        this.productCartItems = list;
        this.comboCartItems = list2;
        this.guaranteedDeliveryDateLocal = str4;
        this.guaranteedDeliveryDateUtc = str5;
        this.receiptDateLocal = str6;
        this.startExecutionDateLocal = str7;
        this.startExecutionDateUtc = str8;
        this.canBeCancelled = z2;
        this.pizzeriaId = str9;
        this.totalPrice = d;
        this.isRatable = z3;
        this.estimatedTimeOfArrival = str10;
        this.tableNumber = num;
        this.uuid = str11;
        this.deliveryFee = d2;
        this.deliveryLocation = orderLocationDto;
        this.unitLocation = orderLocationDto2;
        this.deliveryIcons = list3;
        this.unitIcons = list4;
        this.courierIcons = list5;
        this.gameIcons = list6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataOrderDto copy$default(DataOrderDto dataOrderDto, String str, int i, OrderStateInfoDto orderStateInfoDto, int i2, boolean z, String str2, String str3, List list, List list2, String str4, String str5, String str6, String str7, String str8, boolean z2, String str9, double d, boolean z3, String str10, Integer num, String str11, double d2, OrderLocationDto orderLocationDto, OrderLocationDto orderLocationDto2, List list3, List list4, List list5, List list6, int i3, Object obj) {
        String str12 = (i3 & 1) != 0 ? dataOrderDto.id : str;
        int i4 = (i3 & 2) != 0 ? dataOrderDto.orderNumber : i;
        OrderStateInfoDto orderStateInfoDto2 = (i3 & 4) != 0 ? dataOrderDto.orderStateInfo : orderStateInfoDto;
        int i5 = (i3 & 8) != 0 ? dataOrderDto.orderType : i2;
        boolean z4 = (i3 & 16) != 0 ? dataOrderDto.isDeferredOrder : z;
        String str13 = (i3 & 32) != 0 ? dataOrderDto.clientName : str2;
        String str14 = (i3 & 64) != 0 ? dataOrderDto.address : str3;
        List<ProductCartItemDto> list7 = (i3 & 128) != 0 ? dataOrderDto.productCartItems : list;
        List<ComboCartItemDto> list8 = (i3 & 256) != 0 ? dataOrderDto.comboCartItems : list2;
        String str15 = (i3 & 512) != 0 ? dataOrderDto.guaranteedDeliveryDateLocal : str4;
        String str16 = (i3 & 1024) != 0 ? dataOrderDto.guaranteedDeliveryDateUtc : str5;
        String str17 = (i3 & 2048) != 0 ? dataOrderDto.receiptDateLocal : str6;
        String str18 = (i3 & 4096) != 0 ? dataOrderDto.startExecutionDateLocal : str7;
        return dataOrderDto.copy(str12, i4, orderStateInfoDto2, i5, z4, str13, str14, list7, list8, str15, str16, str17, str18, (i3 & 8192) != 0 ? dataOrderDto.startExecutionDateUtc : str8, (i3 & 16384) != 0 ? dataOrderDto.canBeCancelled : z2, (i3 & 32768) != 0 ? dataOrderDto.pizzeriaId : str9, (i3 & 65536) != 0 ? dataOrderDto.totalPrice : d, (i3 & 131072) != 0 ? dataOrderDto.isRatable : z3, (262144 & i3) != 0 ? dataOrderDto.estimatedTimeOfArrival : str10, (i3 & 524288) != 0 ? dataOrderDto.tableNumber : num, (i3 & 1048576) != 0 ? dataOrderDto.uuid : str11, (i3 & 2097152) != 0 ? dataOrderDto.deliveryFee : d2, (i3 & 4194304) != 0 ? dataOrderDto.deliveryLocation : orderLocationDto, (8388608 & i3) != 0 ? dataOrderDto.unitLocation : orderLocationDto2, (i3 & 16777216) != 0 ? dataOrderDto.deliveryIcons : list3, (i3 & 33554432) != 0 ? dataOrderDto.unitIcons : list4, (i3 & 67108864) != 0 ? dataOrderDto.courierIcons : list5, (i3 & 134217728) != 0 ? dataOrderDto.gameIcons : list6);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.guaranteedDeliveryDateLocal;
    }

    public final String component11() {
        return this.guaranteedDeliveryDateUtc;
    }

    public final String component12() {
        return this.receiptDateLocal;
    }

    public final String component13() {
        return this.startExecutionDateLocal;
    }

    public final String component14() {
        return this.startExecutionDateUtc;
    }

    public final boolean component15() {
        return this.canBeCancelled;
    }

    public final String component16() {
        return this.pizzeriaId;
    }

    public final double component17() {
        return this.totalPrice;
    }

    public final boolean component18() {
        return this.isRatable;
    }

    public final String component19() {
        return this.estimatedTimeOfArrival;
    }

    public final int component2() {
        return this.orderNumber;
    }

    public final Integer component20() {
        return this.tableNumber;
    }

    public final String component21() {
        return this.uuid;
    }

    public final double component22() {
        return this.deliveryFee;
    }

    public final OrderLocationDto component23() {
        return this.deliveryLocation;
    }

    public final OrderLocationDto component24() {
        return this.unitLocation;
    }

    public final List<LocationIconsDto> component25() {
        return this.deliveryIcons;
    }

    public final List<LocationIconsDto> component26() {
        return this.unitIcons;
    }

    public final List<LocationIconsDto> component27() {
        return this.courierIcons;
    }

    public final List<GameIconsDto> component28() {
        return this.gameIcons;
    }

    public final OrderStateInfoDto component3() {
        return this.orderStateInfo;
    }

    public final int component4() {
        return this.orderType;
    }

    public final boolean component5() {
        return this.isDeferredOrder;
    }

    public final String component6() {
        return this.clientName;
    }

    public final String component7() {
        return this.address;
    }

    public final List<ProductCartItemDto> component8() {
        return this.productCartItems;
    }

    public final List<ComboCartItemDto> component9() {
        return this.comboCartItems;
    }

    public final DataOrderDto copy(String str, int i, OrderStateInfoDto orderStateInfoDto, int i2, boolean z, String str2, String str3, List<ProductCartItemDto> list, List<ComboCartItemDto> list2, String str4, String str5, String str6, String str7, String str8, boolean z2, String str9, double d, boolean z3, String str10, Integer num, String str11, double d2, OrderLocationDto orderLocationDto, OrderLocationDto orderLocationDto2, List<LocationIconsDto> list3, List<LocationIconsDto> list4, List<LocationIconsDto> list5, List<GameIconsDto> list6) {
        z65.h(str, "id");
        z65.h(orderStateInfoDto, "orderStateInfo");
        z65.h(str2, "clientName");
        z65.h(str3, "address");
        z65.h(list, "productCartItems");
        z65.h(list2, "comboCartItems");
        z65.h(str9, "pizzeriaId");
        z65.h(str11, MessageAttributes.UUID);
        z65.h(list3, "deliveryIcons");
        z65.h(list4, "unitIcons");
        z65.h(list5, "courierIcons");
        z65.h(list6, "gameIcons");
        return new DataOrderDto(str, i, orderStateInfoDto, i2, z, str2, str3, list, list2, str4, str5, str6, str7, str8, z2, str9, d, z3, str10, num, str11, d2, orderLocationDto, orderLocationDto2, list3, list4, list5, list6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataOrderDto)) {
            return false;
        }
        DataOrderDto dataOrderDto = (DataOrderDto) obj;
        if (z65.c(this.id, dataOrderDto.id) && this.orderNumber == dataOrderDto.orderNumber && z65.c(this.orderStateInfo, dataOrderDto.orderStateInfo) && this.orderType == dataOrderDto.orderType && this.isDeferredOrder == dataOrderDto.isDeferredOrder && z65.c(this.clientName, dataOrderDto.clientName) && z65.c(this.address, dataOrderDto.address) && z65.c(this.productCartItems, dataOrderDto.productCartItems) && z65.c(this.comboCartItems, dataOrderDto.comboCartItems) && z65.c(this.guaranteedDeliveryDateLocal, dataOrderDto.guaranteedDeliveryDateLocal) && z65.c(this.guaranteedDeliveryDateUtc, dataOrderDto.guaranteedDeliveryDateUtc) && z65.c(this.receiptDateLocal, dataOrderDto.receiptDateLocal) && z65.c(this.startExecutionDateLocal, dataOrderDto.startExecutionDateLocal) && z65.c(this.startExecutionDateUtc, dataOrderDto.startExecutionDateUtc) && this.canBeCancelled == dataOrderDto.canBeCancelled && z65.c(this.pizzeriaId, dataOrderDto.pizzeriaId) && Double.compare(this.totalPrice, dataOrderDto.totalPrice) == 0 && this.isRatable == dataOrderDto.isRatable && z65.c(this.estimatedTimeOfArrival, dataOrderDto.estimatedTimeOfArrival) && z65.c(this.tableNumber, dataOrderDto.tableNumber) && z65.c(this.uuid, dataOrderDto.uuid) && Double.compare(this.deliveryFee, dataOrderDto.deliveryFee) == 0 && z65.c(this.deliveryLocation, dataOrderDto.deliveryLocation) && z65.c(this.unitLocation, dataOrderDto.unitLocation) && z65.c(this.deliveryIcons, dataOrderDto.deliveryIcons) && z65.c(this.unitIcons, dataOrderDto.unitIcons) && z65.c(this.courierIcons, dataOrderDto.courierIcons) && z65.c(this.gameIcons, dataOrderDto.gameIcons)) {
            return true;
        }
        return false;
    }

    public final String getAddress() {
        return this.address;
    }

    public final boolean getCanBeCancelled() {
        return this.canBeCancelled;
    }

    public final String getClientName() {
        return this.clientName;
    }

    public final List<ComboCartItemDto> getComboCartItems() {
        return this.comboCartItems;
    }

    public final List<LocationIconsDto> getCourierIcons() {
        return this.courierIcons;
    }

    public final double getDeliveryFee() {
        return this.deliveryFee;
    }

    public final List<LocationIconsDto> getDeliveryIcons() {
        return this.deliveryIcons;
    }

    public final OrderLocationDto getDeliveryLocation() {
        return this.deliveryLocation;
    }

    public final String getEstimatedTimeOfArrival() {
        return this.estimatedTimeOfArrival;
    }

    public final List<GameIconsDto> getGameIcons() {
        return this.gameIcons;
    }

    public final String getGuaranteedDeliveryDateLocal() {
        return this.guaranteedDeliveryDateLocal;
    }

    public final String getGuaranteedDeliveryDateUtc() {
        return this.guaranteedDeliveryDateUtc;
    }

    public final String getId() {
        return this.id;
    }

    public final int getOrderNumber() {
        return this.orderNumber;
    }

    public final OrderStateInfoDto getOrderStateInfo() {
        return this.orderStateInfo;
    }

    public final int getOrderType() {
        return this.orderType;
    }

    public final String getPizzeriaId() {
        return this.pizzeriaId;
    }

    public final List<ProductCartItemDto> getProductCartItems() {
        return this.productCartItems;
    }

    public final String getReceiptDateLocal() {
        return this.receiptDateLocal;
    }

    public final String getStartExecutionDateLocal() {
        return this.startExecutionDateLocal;
    }

    public final String getStartExecutionDateUtc() {
        return this.startExecutionDateUtc;
    }

    public final Integer getTableNumber() {
        return this.tableNumber;
    }

    public final double getTotalPrice() {
        return this.totalPrice;
    }

    public final List<LocationIconsDto> getUnitIcons() {
        return this.unitIcons;
    }

    public final OrderLocationDto getUnitLocation() {
        return this.unitLocation;
    }

    public final String getUuid() {
        return this.uuid;
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
        int hashCode9 = ((((((((((((((((this.id.hashCode() * 31) + this.orderNumber) * 31) + this.orderStateInfo.hashCode()) * 31) + this.orderType) * 31) + a91.a(this.isDeferredOrder)) * 31) + this.clientName.hashCode()) * 31) + this.address.hashCode()) * 31) + this.productCartItems.hashCode()) * 31) + this.comboCartItems.hashCode()) * 31;
        String str = this.guaranteedDeliveryDateLocal;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode9 + hashCode) * 31;
        String str2 = this.guaranteedDeliveryDateUtc;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.receiptDateLocal;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.startExecutionDateLocal;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.startExecutionDateUtc;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int a = (((((((((i5 + hashCode5) * 31) + a91.a(this.canBeCancelled)) * 31) + this.pizzeriaId.hashCode()) * 31) + nkb.a(this.totalPrice)) * 31) + a91.a(this.isRatable)) * 31;
        String str6 = this.estimatedTimeOfArrival;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i6 = (a + hashCode6) * 31;
        Integer num = this.tableNumber;
        if (num == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num.hashCode();
        }
        int hashCode10 = (((((i6 + hashCode7) * 31) + this.uuid.hashCode()) * 31) + nkb.a(this.deliveryFee)) * 31;
        OrderLocationDto orderLocationDto = this.deliveryLocation;
        if (orderLocationDto == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = orderLocationDto.hashCode();
        }
        int i7 = (hashCode10 + hashCode8) * 31;
        OrderLocationDto orderLocationDto2 = this.unitLocation;
        if (orderLocationDto2 != null) {
            i = orderLocationDto2.hashCode();
        }
        return ((((((((i7 + i) * 31) + this.deliveryIcons.hashCode()) * 31) + this.unitIcons.hashCode()) * 31) + this.courierIcons.hashCode()) * 31) + this.gameIcons.hashCode();
    }

    public final boolean isDeferredOrder() {
        return this.isDeferredOrder;
    }

    public final boolean isRatable() {
        return this.isRatable;
    }

    public String toString() {
        String str = this.id;
        int i = this.orderNumber;
        OrderStateInfoDto orderStateInfoDto = this.orderStateInfo;
        int i2 = this.orderType;
        boolean z = this.isDeferredOrder;
        String str2 = this.clientName;
        String str3 = this.address;
        List<ProductCartItemDto> list = this.productCartItems;
        List<ComboCartItemDto> list2 = this.comboCartItems;
        String str4 = this.guaranteedDeliveryDateLocal;
        String str5 = this.guaranteedDeliveryDateUtc;
        String str6 = this.receiptDateLocal;
        String str7 = this.startExecutionDateLocal;
        String str8 = this.startExecutionDateUtc;
        boolean z2 = this.canBeCancelled;
        String str9 = this.pizzeriaId;
        double d = this.totalPrice;
        boolean z3 = this.isRatable;
        String str10 = this.estimatedTimeOfArrival;
        Integer num = this.tableNumber;
        String str11 = this.uuid;
        double d2 = this.deliveryFee;
        OrderLocationDto orderLocationDto = this.deliveryLocation;
        OrderLocationDto orderLocationDto2 = this.unitLocation;
        List<LocationIconsDto> list3 = this.deliveryIcons;
        List<LocationIconsDto> list4 = this.unitIcons;
        List<LocationIconsDto> list5 = this.courierIcons;
        List<GameIconsDto> list6 = this.gameIcons;
        return "DataOrderDto(id=" + str + ", orderNumber=" + i + ", orderStateInfo=" + orderStateInfoDto + ", orderType=" + i2 + ", isDeferredOrder=" + z + ", clientName=" + str2 + ", address=" + str3 + ", productCartItems=" + list + ", comboCartItems=" + list2 + ", guaranteedDeliveryDateLocal=" + str4 + ", guaranteedDeliveryDateUtc=" + str5 + ", receiptDateLocal=" + str6 + ", startExecutionDateLocal=" + str7 + ", startExecutionDateUtc=" + str8 + ", canBeCancelled=" + z2 + ", pizzeriaId=" + str9 + ", totalPrice=" + d + ", isRatable=" + z3 + ", estimatedTimeOfArrival=" + str10 + ", tableNumber=" + num + ", uuid=" + str11 + ", deliveryFee=" + d2 + ", deliveryLocation=" + orderLocationDto + ", unitLocation=" + orderLocationDto2 + ", deliveryIcons=" + list3 + ", unitIcons=" + list4 + ", courierIcons=" + list5 + ", gameIcons=" + list6 + ")";
    }
}
