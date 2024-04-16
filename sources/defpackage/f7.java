package defpackage;

import com.dodopizza.persistence.entity.address.AddressEntity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.backend.domain.customer.dto.CustomerAddressDto;
/* compiled from: AddressConversions.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\"#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006\"#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\f"}, d2 = {"Lkotlin/Function1;", "Lw6;", "Lcom/dodopizza/persistence/entity/address/AddressEntity;", "a", "Lkotlin/jvm/functions/Function1;", "b", "()Lkotlin/jvm/functions/Function1;", "toEntity", com.huawei.hms.opendevice.c.a, "toModel", "Lru/dodopizza/backend/domain/customer/dto/CustomerAddressDto;", "dtoToModel", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: f7  reason: default package */
/* loaded from: classes4.dex */
public final class f7 {
    private static final Function1<w6, AddressEntity> a = b.a;
    private static final Function1<AddressEntity, w6> b = c.a;
    private static final Function1<CustomerAddressDto, w6> c = a.a;

    /* compiled from: AddressConversions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/backend/domain/customer/dto/CustomerAddressDto;", "Lw6;", "a", "(Lru/dodopizza/backend/domain/customer/dto/CustomerAddressDto;)Lw6;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f7$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<CustomerAddressDto, w6> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final w6 invoke(CustomerAddressDto customerAddressDto) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            z65.h(customerAddressDto, "$this$null");
            bza bzaVar = new bza(customerAddressDto.getStreetId(), customerAddressDto.getStreetName(), customerAddressDto.getShortStreetName());
            String id = customerAddressDto.getId();
            String houseNumber = customerAddressDto.getHouseNumber();
            if (houseNumber == null) {
                str = "";
            } else {
                str = houseNumber;
            }
            String building = customerAddressDto.getBuilding();
            if (building == null) {
                str2 = "";
            } else {
                str2 = building;
            }
            String apartment = customerAddressDto.getApartment();
            if (apartment == null) {
                str3 = "";
            } else {
                str3 = apartment;
            }
            String entrance = customerAddressDto.getEntrance();
            if (entrance == null) {
                str4 = "";
            } else {
                str4 = entrance;
            }
            String floor = customerAddressDto.getFloor();
            if (floor == null) {
                str5 = "";
            } else {
                str5 = floor;
            }
            String intercom = customerAddressDto.getIntercom();
            if (intercom == null) {
                str6 = "";
            } else {
                str6 = intercom;
            }
            String addressAlias = customerAddressDto.getAddressAlias();
            if (addressAlias == null) {
                str7 = "";
            } else {
                str7 = addressAlias;
            }
            String comment = customerAddressDto.getComment();
            if (comment == null) {
                str8 = "";
            } else {
                str8 = comment;
            }
            String postalcode = customerAddressDto.getPostalcode();
            if (postalcode == null) {
                postalcode = "";
            }
            return new w6(id, bzaVar, str, str2, str3, str4, str5, str6, str7, str8, postalcode);
        }
    }

    /* compiled from: AddressConversions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw6;", "Lcom/dodopizza/persistence/entity/address/AddressEntity;", "a", "(Lw6;)Lcom/dodopizza/persistence/entity/address/AddressEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f7$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<w6, AddressEntity> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AddressEntity invoke(w6 w6Var) {
            CharSequence R0;
            CharSequence R02;
            CharSequence R03;
            CharSequence R04;
            CharSequence R05;
            CharSequence R06;
            CharSequence R07;
            CharSequence R08;
            z65.h(w6Var, "$this$null");
            String id = w6Var.getId();
            R0 = m0b.R0(w6Var.c());
            String obj = R0.toString();
            String b = w6Var.n().b();
            z65.g(b, "getStreetId(...)");
            String c = w6Var.n().c();
            z65.g(c, "getStreetName(...)");
            String a2 = w6Var.n().a();
            z65.g(a2, "getShortStreetName(...)");
            R02 = m0b.R0(w6Var.k());
            String obj2 = R02.toString();
            R03 = m0b.R0(w6Var.e());
            String obj3 = R03.toString();
            R04 = m0b.R0(w6Var.d());
            String obj4 = R04.toString();
            R05 = m0b.R0(w6Var.i());
            String obj5 = R05.toString();
            R06 = m0b.R0(w6Var.j());
            String obj6 = R06.toString();
            R07 = m0b.R0(w6Var.l());
            String obj7 = R07.toString();
            R08 = m0b.R0(w6Var.f());
            return new AddressEntity(id, obj, b, c, a2, obj2, obj3, obj4, obj5, obj6, obj7, R08.toString(), w6Var.m());
        }
    }

    /* compiled from: AddressConversions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/persistence/entity/address/AddressEntity;", "Lw6;", "a", "(Lcom/dodopizza/persistence/entity/address/AddressEntity;)Lw6;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f7$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function1<AddressEntity, w6> {
        public static final c a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final w6 invoke(AddressEntity addressEntity) {
            z65.h(addressEntity, "$this$null");
            String id = addressEntity.getId();
            if (id == null) {
                id = "";
            }
            return new w6(id, new bza(addressEntity.getStreetId(), addressEntity.getStreetName(), addressEntity.getShortStreetName()), addressEntity.getHouseNumber(), addressEntity.getBuilding(), addressEntity.getApartment(), addressEntity.getEntrance(), addressEntity.getFloor(), addressEntity.getIntercome(), addressEntity.getAddressName(), addressEntity.getComment(), addressEntity.getPostalcode());
        }
    }

    public static final Function1<CustomerAddressDto, w6> a() {
        return c;
    }

    public static final Function1<w6, AddressEntity> b() {
        return a;
    }

    public static final Function1<AddressEntity, w6> c() {
        return b;
    }
}
