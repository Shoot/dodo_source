package ru.dodopizza.mindbox.dto;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import defpackage.tmb;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CustomerDto.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001:\u0004\u001a\u001b\u001c\u001dB_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/dodopizza/mindbox/dto/CustomerDto;", "", "ids", "Lru/dodopizza/mindbox/dto/CustomerDto$Ids;", "mobilePhone", "", "email", "fullName", "birthDate", "area", "Lru/dodopizza/mindbox/dto/CustomerDto$AreaDto;", "subscription", "", "Lru/dodopizza/mindbox/dto/CustomerDto$SubscriptionDto;", "(Lru/dodopizza/mindbox/dto/CustomerDto$Ids;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/mindbox/dto/CustomerDto$AreaDto;Ljava/util/List;)V", "getArea", "()Lru/dodopizza/mindbox/dto/CustomerDto$AreaDto;", "getBirthDate", "()Ljava/lang/String;", "getEmail", "getFullName", "getIds", "()Lru/dodopizza/mindbox/dto/CustomerDto$Ids;", "getMobilePhone", "getSubscription", "()Ljava/util/List;", "AreaDto", "AreaIdDto", "Ids", "SubscriptionDto", "mindbox_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomerDto {
    @uca("area")
    private final AreaDto area;
    @uca("birthDate")
    private final String birthDate;
    @uca("email")
    private final String email;
    @uca("fullName")
    private final String fullName;
    @uca("ids")
    private final Ids ids;
    @uca("mobilePhone")
    private final String mobilePhone;
    @uca("subscriptions")
    private final List<SubscriptionDto> subscription;

    /* compiled from: CustomerDto.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/dodopizza/mindbox/dto/CustomerDto$AreaDto;", "", "ids", "Lru/dodopizza/mindbox/dto/CustomerDto$AreaIdDto;", "(Lru/dodopizza/mindbox/dto/CustomerDto$AreaIdDto;)V", "getIds", "()Lru/dodopizza/mindbox/dto/CustomerDto$AreaIdDto;", "Companion", "mindbox_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class AreaDto {
        public static final Companion Companion = new Companion(null);
        @uca("ids")
        private final AreaIdDto ids;

        /* compiled from: CustomerDto.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lru/dodopizza/mindbox/dto/CustomerDto$AreaDto$Companion;", "", "()V", "build", "Lru/dodopizza/mindbox/dto/CustomerDto$AreaDto;", tmb.a.CITY_JSON_NAME, "", tmb.c.COUNTRY_JSON_NAME, "mindbox_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final AreaDto build(String str, String str2) {
                z65.h(str, tmb.a.CITY_JSON_NAME);
                z65.h(str2, tmb.c.COUNTRY_JSON_NAME);
                return new AreaDto(new AreaIdDto(str + " - " + str2));
            }
        }

        public AreaDto(AreaIdDto areaIdDto) {
            z65.h(areaIdDto, "ids");
            this.ids = areaIdDto;
        }

        public final AreaIdDto getIds() {
            return this.ids;
        }
    }

    /* compiled from: CustomerDto.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/dodopizza/mindbox/dto/CustomerDto$AreaIdDto;", "", ShoppingInfoEntity.FIELD_EXTERNAL_ID, "", "(Ljava/lang/String;)V", "getExternalId", "()Ljava/lang/String;", "mindbox_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class AreaIdDto {
        @uca(ShoppingInfoEntity.FIELD_EXTERNAL_ID)
        private final String externalId;

        public AreaIdDto(String str) {
            z65.h(str, ShoppingInfoEntity.FIELD_EXTERNAL_ID);
            this.externalId = str;
        }

        public final String getExternalId() {
            return this.externalId;
        }
    }

    /* compiled from: CustomerDto.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/dodopizza/mindbox/dto/CustomerDto$Ids;", "", "userguid", "", "(Ljava/lang/String;)V", "getUserguid", "()Ljava/lang/String;", "mindbox_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Ids {
        @uca("userguid")
        private final String userguid;

        public Ids(String str) {
            z65.h(str, "userguid");
            this.userguid = str;
        }

        public final String getUserguid() {
            return this.userguid;
        }
    }

    /* compiled from: CustomerDto.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lru/dodopizza/mindbox/dto/CustomerDto$SubscriptionDto;", "", "brand", "", "pointOfContact", "isSubscribed", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getBrand", "()Ljava/lang/String;", "()Z", "getPointOfContact", "mindbox_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SubscriptionDto {
        @uca("brand")
        private final String brand;
        @uca("isSubscribed")
        private final boolean isSubscribed;
        @uca("pointOfContact")
        private final String pointOfContact;

        public SubscriptionDto(String str, String str2, boolean z) {
            z65.h(str, "brand");
            z65.h(str2, "pointOfContact");
            this.brand = str;
            this.pointOfContact = str2;
            this.isSubscribed = z;
        }

        public final String getBrand() {
            return this.brand;
        }

        public final String getPointOfContact() {
            return this.pointOfContact;
        }

        public final boolean isSubscribed() {
            return this.isSubscribed;
        }
    }

    public CustomerDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final AreaDto getArea() {
        return this.area;
    }

    public final String getBirthDate() {
        return this.birthDate;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final Ids getIds() {
        return this.ids;
    }

    public final String getMobilePhone() {
        return this.mobilePhone;
    }

    public final List<SubscriptionDto> getSubscription() {
        return this.subscription;
    }

    public CustomerDto(Ids ids, String str, String str2, String str3, String str4, AreaDto areaDto, List<SubscriptionDto> list) {
        this.ids = ids;
        this.mobilePhone = str;
        this.email = str2;
        this.fullName = str3;
        this.birthDate = str4;
        this.area = areaDto;
        this.subscription = list;
    }

    public /* synthetic */ CustomerDto(Ids ids, String str, String str2, String str3, String str4, AreaDto areaDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ids, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : areaDto, (i & 64) != 0 ? null : list);
    }
}
