package ru.dodopizza.backend.domain.customer.dto;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CustomerDto.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0016J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010&J\t\u00100\u001a\u00020\u0012HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ¬\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u000e2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\nHÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001d\u0010\u001aR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b(\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!¨\u0006A"}, d2 = {"Lru/dodopizza/backend/domain/customer/dto/CustomerDto;", "", "id", "", MessageAttributes.UUID, "phoneNumber", "firstName", "lastName", "email", "birthDay", "", "birthMonth", "birthYear", "subscribedToSms", "", "loyaltyProgramBalance", "", "addresses", "Lru/dodopizza/backend/domain/customer/dto/CustomerAddressesDto;", "clientDeliveryLocations", "Lru/dodopizza/backend/domain/customer/dto/ClientDeliveryLocationsDto;", "orderHistoryCount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Double;Lru/dodopizza/backend/domain/customer/dto/CustomerAddressesDto;Lru/dodopizza/backend/domain/customer/dto/ClientDeliveryLocationsDto;Ljava/lang/Integer;)V", "getAddresses", "()Lru/dodopizza/backend/domain/customer/dto/CustomerAddressesDto;", "getBirthDay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBirthMonth", "getBirthYear", "getClientDeliveryLocations", "()Lru/dodopizza/backend/domain/customer/dto/ClientDeliveryLocationsDto;", "getEmail", "()Ljava/lang/String;", "getFirstName", "getId", "getLastName", "getLoyaltyProgramBalance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getOrderHistoryCount", "getPhoneNumber", "getSubscribedToSms", "()Z", "getUuid", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Double;Lru/dodopizza/backend/domain/customer/dto/CustomerAddressesDto;Lru/dodopizza/backend/domain/customer/dto/ClientDeliveryLocationsDto;Ljava/lang/Integer;)Lru/dodopizza/backend/domain/customer/dto/CustomerDto;", "equals", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomerDto {
    @uca("addresses")
    private final CustomerAddressesDto addresses;
    @uca("birthDay")
    private final Integer birthDay;
    @uca("birthMonth")
    private final Integer birthMonth;
    @uca("birthYear")
    private final Integer birthYear;
    @uca("clientDeliveryLocations")
    private final ClientDeliveryLocationsDto clientDeliveryLocations;
    @uca("email")
    private final String email;
    @uca("firstName")
    private final String firstName;
    @uca("id")
    private final String id;
    @uca("lastName")
    private final String lastName;
    @uca("loyaltyProgramBalance")
    private final Double loyaltyProgramBalance;
    @uca("orderHistoryCount")
    private final Integer orderHistoryCount;
    @uca("phoneNumber")
    private final String phoneNumber;
    @uca("subscribedToSms")
    private final boolean subscribedToSms;
    @uca(MessageAttributes.UUID)
    private final String uuid;

    public CustomerDto(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, boolean z, Double d, CustomerAddressesDto customerAddressesDto, ClientDeliveryLocationsDto clientDeliveryLocationsDto, Integer num4) {
        z65.h(str, "id");
        z65.h(str2, MessageAttributes.UUID);
        z65.h(str3, "phoneNumber");
        z65.h(customerAddressesDto, "addresses");
        this.id = str;
        this.uuid = str2;
        this.phoneNumber = str3;
        this.firstName = str4;
        this.lastName = str5;
        this.email = str6;
        this.birthDay = num;
        this.birthMonth = num2;
        this.birthYear = num3;
        this.subscribedToSms = z;
        this.loyaltyProgramBalance = d;
        this.addresses = customerAddressesDto;
        this.clientDeliveryLocations = clientDeliveryLocationsDto;
        this.orderHistoryCount = num4;
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.subscribedToSms;
    }

    public final Double component11() {
        return this.loyaltyProgramBalance;
    }

    public final CustomerAddressesDto component12() {
        return this.addresses;
    }

    public final ClientDeliveryLocationsDto component13() {
        return this.clientDeliveryLocations;
    }

    public final Integer component14() {
        return this.orderHistoryCount;
    }

    public final String component2() {
        return this.uuid;
    }

    public final String component3() {
        return this.phoneNumber;
    }

    public final String component4() {
        return this.firstName;
    }

    public final String component5() {
        return this.lastName;
    }

    public final String component6() {
        return this.email;
    }

    public final Integer component7() {
        return this.birthDay;
    }

    public final Integer component8() {
        return this.birthMonth;
    }

    public final Integer component9() {
        return this.birthYear;
    }

    public final CustomerDto copy(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, boolean z, Double d, CustomerAddressesDto customerAddressesDto, ClientDeliveryLocationsDto clientDeliveryLocationsDto, Integer num4) {
        z65.h(str, "id");
        z65.h(str2, MessageAttributes.UUID);
        z65.h(str3, "phoneNumber");
        z65.h(customerAddressesDto, "addresses");
        return new CustomerDto(str, str2, str3, str4, str5, str6, num, num2, num3, z, d, customerAddressesDto, clientDeliveryLocationsDto, num4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerDto)) {
            return false;
        }
        CustomerDto customerDto = (CustomerDto) obj;
        if (z65.c(this.id, customerDto.id) && z65.c(this.uuid, customerDto.uuid) && z65.c(this.phoneNumber, customerDto.phoneNumber) && z65.c(this.firstName, customerDto.firstName) && z65.c(this.lastName, customerDto.lastName) && z65.c(this.email, customerDto.email) && z65.c(this.birthDay, customerDto.birthDay) && z65.c(this.birthMonth, customerDto.birthMonth) && z65.c(this.birthYear, customerDto.birthYear) && this.subscribedToSms == customerDto.subscribedToSms && z65.c(this.loyaltyProgramBalance, customerDto.loyaltyProgramBalance) && z65.c(this.addresses, customerDto.addresses) && z65.c(this.clientDeliveryLocations, customerDto.clientDeliveryLocations) && z65.c(this.orderHistoryCount, customerDto.orderHistoryCount)) {
            return true;
        }
        return false;
    }

    public final CustomerAddressesDto getAddresses() {
        return this.addresses;
    }

    public final Integer getBirthDay() {
        return this.birthDay;
    }

    public final Integer getBirthMonth() {
        return this.birthMonth;
    }

    public final Integer getBirthYear() {
        return this.birthYear;
    }

    public final ClientDeliveryLocationsDto getClientDeliveryLocations() {
        return this.clientDeliveryLocations;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final Double getLoyaltyProgramBalance() {
        return this.loyaltyProgramBalance;
    }

    public final Integer getOrderHistoryCount() {
        return this.orderHistoryCount;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final boolean getSubscribedToSms() {
        return this.subscribedToSms;
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
        int hashCode9 = ((((this.id.hashCode() * 31) + this.uuid.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31;
        String str = this.firstName;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode9 + hashCode) * 31;
        String str2 = this.lastName;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.email;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num = this.birthDay;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Integer num2 = this.birthMonth;
        if (num2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num2.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Integer num3 = this.birthYear;
        if (num3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num3.hashCode();
        }
        int a = (((i6 + hashCode6) * 31) + a91.a(this.subscribedToSms)) * 31;
        Double d = this.loyaltyProgramBalance;
        if (d == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = d.hashCode();
        }
        int hashCode10 = (((a + hashCode7) * 31) + this.addresses.hashCode()) * 31;
        ClientDeliveryLocationsDto clientDeliveryLocationsDto = this.clientDeliveryLocations;
        if (clientDeliveryLocationsDto == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = clientDeliveryLocationsDto.hashCode();
        }
        int i7 = (hashCode10 + hashCode8) * 31;
        Integer num4 = this.orderHistoryCount;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return i7 + i;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.uuid;
        String str3 = this.phoneNumber;
        String str4 = this.firstName;
        String str5 = this.lastName;
        String str6 = this.email;
        Integer num = this.birthDay;
        Integer num2 = this.birthMonth;
        Integer num3 = this.birthYear;
        boolean z = this.subscribedToSms;
        Double d = this.loyaltyProgramBalance;
        CustomerAddressesDto customerAddressesDto = this.addresses;
        ClientDeliveryLocationsDto clientDeliveryLocationsDto = this.clientDeliveryLocations;
        Integer num4 = this.orderHistoryCount;
        return "CustomerDto(id=" + str + ", uuid=" + str2 + ", phoneNumber=" + str3 + ", firstName=" + str4 + ", lastName=" + str5 + ", email=" + str6 + ", birthDay=" + num + ", birthMonth=" + num2 + ", birthYear=" + num3 + ", subscribedToSms=" + z + ", loyaltyProgramBalance=" + d + ", addresses=" + customerAddressesDto + ", clientDeliveryLocations=" + clientDeliveryLocationsDto + ", orderHistoryCount=" + num4 + ")";
    }

    public /* synthetic */ CustomerDto(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, boolean z, Double d, CustomerAddressesDto customerAddressesDto, ClientDeliveryLocationsDto clientDeliveryLocationsDto, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : num3, z, (i & 1024) != 0 ? null : d, customerAddressesDto, clientDeliveryLocationsDto, (i & 8192) != 0 ? null : num4);
    }
}
