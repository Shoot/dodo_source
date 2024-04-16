package io.realm;

import com.dodopizza.persistence.entity.cart.AppliedBonusActionEntity;
import com.dodopizza.persistence.entity.cart.CartEntity;
import com.dodopizza.persistence.entity.cart.CartItemEntity;
import com.dodopizza.persistence.entity.cart.DataPromoCodeEntity;
import com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity;
import com.dodopizza.persistence.entity.cart.PriceEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
public class com_dodopizza_persistence_entity_cart_CartEntityRealmProxy extends CartEntity implements r89, lfc {
    private static final OsObjectSchemaInfo g = g();
    private a b;
    private c0<CartEntity> c;
    private k0<CartItemEntity> d;
    private k0<CartItemEntity> e;
    private k0<AppliedBonusActionEntity> f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;
        long f;
        long g;
        long h;
        long i;
        long j;

        a(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo b = osSchemaInfo.b("CartEntity");
            this.e = a("cartItems", "cartItems", b);
            this.f = a("price", "price", b);
            this.g = a("giftItems", "giftItems", b);
            this.h = a("promoCode", "promoCode", b);
            this.i = a("promoAction", "promoAction", b);
            this.j = a("appliedBonusActions", "appliedBonusActions", b);
        }

        @Override // defpackage.sf1
        protected final void b(sf1 sf1Var, sf1 sf1Var2) {
            a aVar = (a) sf1Var;
            a aVar2 = (a) sf1Var2;
            aVar2.e = aVar.e;
            aVar2.f = aVar.f;
            aVar2.g = aVar.g;
            aVar2.h = aVar.h;
            aVar2.i = aVar.i;
            aVar2.j = aVar.j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_cart_CartEntityRealmProxy() {
        this.c.p();
    }

    public static CartEntity c(d0 d0Var, a aVar, CartEntity cartEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        int i;
        r89 r89Var = map.get(cartEntity);
        if (r89Var != null) {
            return (CartEntity) r89Var;
        }
        com_dodopizza_persistence_entity_cart_CartEntityRealmProxy j = j(d0Var, new OsObjectBuilder(d0Var.I0(CartEntity.class), set).I0());
        map.put(cartEntity, j);
        k0<CartItemEntity> realmGet$cartItems = cartEntity.realmGet$cartItems();
        if (realmGet$cartItems != null) {
            k0<CartItemEntity> realmGet$cartItems2 = j.realmGet$cartItems();
            realmGet$cartItems2.clear();
            for (int i2 = 0; i2 < realmGet$cartItems.size(); i2++) {
                CartItemEntity cartItemEntity = realmGet$cartItems.get(i2);
                CartItemEntity cartItemEntity2 = (CartItemEntity) map.get(cartItemEntity);
                if (cartItemEntity2 != null) {
                    realmGet$cartItems2.add(cartItemEntity2);
                } else {
                    realmGet$cartItems2.add(com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.a) d0Var.u().e(CartItemEntity.class), cartItemEntity, z, map, set));
                }
            }
        }
        PriceEntity realmGet$price = cartEntity.realmGet$price();
        if (realmGet$price == null) {
            j.realmSet$price(null);
        } else {
            PriceEntity priceEntity = (PriceEntity) map.get(realmGet$price);
            if (priceEntity != null) {
                j.realmSet$price(priceEntity);
            } else {
                j.realmSet$price(com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy.a) d0Var.u().e(PriceEntity.class), realmGet$price, z, map, set));
            }
        }
        k0<CartItemEntity> realmGet$giftItems = cartEntity.realmGet$giftItems();
        if (realmGet$giftItems != null) {
            k0<CartItemEntity> realmGet$giftItems2 = j.realmGet$giftItems();
            realmGet$giftItems2.clear();
            int i3 = 0;
            while (i3 < realmGet$giftItems.size()) {
                CartItemEntity cartItemEntity3 = realmGet$giftItems.get(i3);
                CartItemEntity cartItemEntity4 = (CartItemEntity) map.get(cartItemEntity3);
                if (cartItemEntity4 != null) {
                    realmGet$giftItems2.add(cartItemEntity4);
                    i = i3;
                } else {
                    i = i3;
                    realmGet$giftItems2.add(com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.a) d0Var.u().e(CartItemEntity.class), cartItemEntity3, z, map, set));
                }
                i3 = i + 1;
            }
        }
        DataPromoCodeEntity realmGet$promoCode = cartEntity.realmGet$promoCode();
        if (realmGet$promoCode == null) {
            j.realmSet$promoCode(null);
        } else {
            DataPromoCodeEntity dataPromoCodeEntity = (DataPromoCodeEntity) map.get(realmGet$promoCode);
            if (dataPromoCodeEntity != null) {
                j.realmSet$promoCode(dataPromoCodeEntity);
            } else {
                j.realmSet$promoCode(com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy.a) d0Var.u().e(DataPromoCodeEntity.class), realmGet$promoCode, z, map, set));
            }
        }
        PersonalPromoActionEntity realmGet$promoAction = cartEntity.realmGet$promoAction();
        if (realmGet$promoAction == null) {
            j.realmSet$promoAction(null);
        } else {
            PersonalPromoActionEntity personalPromoActionEntity = (PersonalPromoActionEntity) map.get(realmGet$promoAction);
            if (personalPromoActionEntity != null) {
                j.realmSet$promoAction(personalPromoActionEntity);
            } else {
                j.realmSet$promoAction(com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy.a) d0Var.u().e(PersonalPromoActionEntity.class), realmGet$promoAction, z, map, set));
            }
        }
        k0<AppliedBonusActionEntity> realmGet$appliedBonusActions = cartEntity.realmGet$appliedBonusActions();
        if (realmGet$appliedBonusActions != null) {
            k0<AppliedBonusActionEntity> realmGet$appliedBonusActions2 = j.realmGet$appliedBonusActions();
            realmGet$appliedBonusActions2.clear();
            for (int i4 = 0; i4 < realmGet$appliedBonusActions.size(); i4++) {
                AppliedBonusActionEntity appliedBonusActionEntity = realmGet$appliedBonusActions.get(i4);
                AppliedBonusActionEntity appliedBonusActionEntity2 = (AppliedBonusActionEntity) map.get(appliedBonusActionEntity);
                if (appliedBonusActionEntity2 != null) {
                    realmGet$appliedBonusActions2.add(appliedBonusActionEntity2);
                } else {
                    realmGet$appliedBonusActions2.add(com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy.a) d0Var.u().e(AppliedBonusActionEntity.class), appliedBonusActionEntity, z, map, set));
                }
            }
        }
        return j;
    }

    public static CartEntity d(d0 d0Var, a aVar, CartEntity cartEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        if ((cartEntity instanceof r89) && !n0.isFrozen(cartEntity)) {
            r89 r89Var = (r89) cartEntity;
            if (r89Var.a().f() != null) {
                io.realm.a f = r89Var.a().f();
                if (f.b == d0Var.b) {
                    if (f.getPath().equals(d0Var.getPath())) {
                        return cartEntity;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.k.get();
        r89 r89Var2 = map.get(cartEntity);
        if (r89Var2 != null) {
            return (CartEntity) r89Var2;
        }
        return c(d0Var, aVar, cartEntity, z, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static CartEntity f(CartEntity cartEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        CartEntity cartEntity2;
        if (i > i2 || cartEntity == null) {
            return null;
        }
        r89.a<o89> aVar = map.get(cartEntity);
        if (aVar == null) {
            cartEntity2 = new CartEntity();
            map.put(cartEntity, new r89.a<>(i, cartEntity2));
        } else if (i >= aVar.a) {
            return (CartEntity) aVar.b;
        } else {
            aVar.a = i;
            cartEntity2 = (CartEntity) aVar.b;
        }
        d0 d0Var = (d0) ((r89) cartEntity).a().f();
        if (i == i2) {
            cartEntity2.realmSet$cartItems(null);
        } else {
            k0<CartItemEntity> realmGet$cartItems = cartEntity.realmGet$cartItems();
            k0<CartItemEntity> k0Var = new k0<>();
            cartEntity2.realmSet$cartItems(k0Var);
            int i3 = i + 1;
            int size = realmGet$cartItems.size();
            for (int i4 = 0; i4 < size; i4++) {
                k0Var.add(com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.f(realmGet$cartItems.get(i4), i3, i2, map));
            }
        }
        int i5 = i + 1;
        cartEntity2.realmSet$price(com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy.f(cartEntity.realmGet$price(), i5, i2, map));
        if (i == i2) {
            cartEntity2.realmSet$giftItems(null);
        } else {
            k0<CartItemEntity> realmGet$giftItems = cartEntity.realmGet$giftItems();
            k0<CartItemEntity> k0Var2 = new k0<>();
            cartEntity2.realmSet$giftItems(k0Var2);
            int size2 = realmGet$giftItems.size();
            for (int i6 = 0; i6 < size2; i6++) {
                k0Var2.add(com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.f(realmGet$giftItems.get(i6), i5, i2, map));
            }
        }
        cartEntity2.realmSet$promoCode(com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy.f(cartEntity.realmGet$promoCode(), i5, i2, map));
        cartEntity2.realmSet$promoAction(com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy.f(cartEntity.realmGet$promoAction(), i5, i2, map));
        if (i == i2) {
            cartEntity2.realmSet$appliedBonusActions(null);
        } else {
            k0<AppliedBonusActionEntity> realmGet$appliedBonusActions = cartEntity.realmGet$appliedBonusActions();
            k0<AppliedBonusActionEntity> k0Var3 = new k0<>();
            cartEntity2.realmSet$appliedBonusActions(k0Var3);
            int size3 = realmGet$appliedBonusActions.size();
            for (int i7 = 0; i7 < size3; i7++) {
                k0Var3.add(com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy.f(realmGet$appliedBonusActions.get(i7), i5, i2, map));
            }
        }
        return cartEntity2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "CartEntity", false, 6, 0);
        RealmFieldType realmFieldType = RealmFieldType.LIST;
        bVar.a("", "cartItems", realmFieldType, "CartItemEntity");
        RealmFieldType realmFieldType2 = RealmFieldType.OBJECT;
        bVar.a("", "price", realmFieldType2, "PriceEntity");
        bVar.a("", "giftItems", realmFieldType, "CartItemEntity");
        bVar.a("", "promoCode", realmFieldType2, "DataPromoCodeEntity");
        bVar.a("", "promoAction", realmFieldType2, "PersonalPromoActionEntity");
        bVar.a("", "appliedBonusActions", realmFieldType, "AppliedBonusActionEntity");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return g;
    }

    public static long i(d0 d0Var, CartEntity cartEntity, Map<o89, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        if ((cartEntity instanceof r89) && !n0.isFrozen(cartEntity)) {
            r89 r89Var = (r89) cartEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(CartEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(CartEntity.class);
        long createRow = OsObject.createRow(I0);
        map.put(cartEntity, Long.valueOf(createRow));
        OsList osList = new OsList(I0.r(createRow), aVar.e);
        k0<CartItemEntity> realmGet$cartItems = cartEntity.realmGet$cartItems();
        if (realmGet$cartItems != null && realmGet$cartItems.size() == osList.X()) {
            int size = realmGet$cartItems.size();
            int i = 0;
            while (i < size) {
                CartItemEntity cartItemEntity = realmGet$cartItems.get(i);
                Long l = map.get(cartItemEntity);
                if (l == null) {
                    l = Long.valueOf(com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.i(d0Var, cartItemEntity, map));
                }
                osList.U(i, l.longValue());
                i++;
                createRow = createRow;
            }
            j = createRow;
        } else {
            j = createRow;
            osList.J();
            if (realmGet$cartItems != null) {
                Iterator<CartItemEntity> it = realmGet$cartItems.iterator();
                while (it.hasNext()) {
                    CartItemEntity next = it.next();
                    Long l2 = map.get(next);
                    if (l2 == null) {
                        l2 = Long.valueOf(com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.i(d0Var, next, map));
                    }
                    osList.k(l2.longValue());
                }
            }
        }
        PriceEntity realmGet$price = cartEntity.realmGet$price();
        if (realmGet$price != null) {
            Long l3 = map.get(realmGet$price);
            if (l3 == null) {
                l3 = Long.valueOf(com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy.i(d0Var, realmGet$price, map));
            }
            j2 = j;
            Table.nativeSetLink(nativePtr, aVar.f, j, l3.longValue(), false);
        } else {
            j2 = j;
            Table.nativeNullifyLink(nativePtr, aVar.f, j2);
        }
        long j5 = j2;
        OsList osList2 = new OsList(I0.r(j5), aVar.g);
        k0<CartItemEntity> realmGet$giftItems = cartEntity.realmGet$giftItems();
        if (realmGet$giftItems != null && realmGet$giftItems.size() == osList2.X()) {
            int size2 = realmGet$giftItems.size();
            int i2 = 0;
            while (i2 < size2) {
                CartItemEntity cartItemEntity2 = realmGet$giftItems.get(i2);
                Long l4 = map.get(cartItemEntity2);
                if (l4 == null) {
                    l4 = Long.valueOf(com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.i(d0Var, cartItemEntity2, map));
                }
                osList2.U(i2, l4.longValue());
                i2++;
                j5 = j5;
            }
            j3 = j5;
        } else {
            j3 = j5;
            osList2.J();
            if (realmGet$giftItems != null) {
                Iterator<CartItemEntity> it2 = realmGet$giftItems.iterator();
                while (it2.hasNext()) {
                    CartItemEntity next2 = it2.next();
                    Long l5 = map.get(next2);
                    if (l5 == null) {
                        l5 = Long.valueOf(com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.i(d0Var, next2, map));
                    }
                    osList2.k(l5.longValue());
                }
            }
        }
        DataPromoCodeEntity realmGet$promoCode = cartEntity.realmGet$promoCode();
        if (realmGet$promoCode != null) {
            Long l6 = map.get(realmGet$promoCode);
            if (l6 == null) {
                l6 = Long.valueOf(com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy.i(d0Var, realmGet$promoCode, map));
            }
            j4 = j3;
            Table.nativeSetLink(nativePtr, aVar.h, j3, l6.longValue(), false);
        } else {
            j4 = j3;
            Table.nativeNullifyLink(nativePtr, aVar.h, j4);
        }
        PersonalPromoActionEntity realmGet$promoAction = cartEntity.realmGet$promoAction();
        if (realmGet$promoAction != null) {
            Long l7 = map.get(realmGet$promoAction);
            if (l7 == null) {
                l7 = Long.valueOf(com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy.i(d0Var, realmGet$promoAction, map));
            }
            Table.nativeSetLink(nativePtr, aVar.i, j4, l7.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.i, j4);
        }
        long j6 = j4;
        OsList osList3 = new OsList(I0.r(j6), aVar.j);
        k0<AppliedBonusActionEntity> realmGet$appliedBonusActions = cartEntity.realmGet$appliedBonusActions();
        if (realmGet$appliedBonusActions != null && realmGet$appliedBonusActions.size() == osList3.X()) {
            int size3 = realmGet$appliedBonusActions.size();
            for (int i3 = 0; i3 < size3; i3++) {
                AppliedBonusActionEntity appliedBonusActionEntity = realmGet$appliedBonusActions.get(i3);
                Long l8 = map.get(appliedBonusActionEntity);
                if (l8 == null) {
                    l8 = Long.valueOf(com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy.i(d0Var, appliedBonusActionEntity, map));
                }
                osList3.U(i3, l8.longValue());
            }
        } else {
            osList3.J();
            if (realmGet$appliedBonusActions != null) {
                Iterator<AppliedBonusActionEntity> it3 = realmGet$appliedBonusActions.iterator();
                while (it3.hasNext()) {
                    AppliedBonusActionEntity next3 = it3.next();
                    Long l9 = map.get(next3);
                    if (l9 == null) {
                        l9 = Long.valueOf(com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy.i(d0Var, next3, map));
                    }
                    osList3.k(l9.longValue());
                }
            }
        }
        return j6;
    }

    static com_dodopizza_persistence_entity_cart_CartEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(CartEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_cart_CartEntityRealmProxy com_dodopizza_persistence_entity_cart_cartentityrealmproxy = new com_dodopizza_persistence_entity_cart_CartEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_cart_cartentityrealmproxy;
    }

    @Override // defpackage.r89
    public c0<?> a() {
        return this.c;
    }

    @Override // defpackage.r89
    public void b() {
        if (this.c != null) {
            return;
        }
        a.c cVar = io.realm.a.k.get();
        this.b = (a) cVar.c();
        c0<CartEntity> c0Var = new c0<>(this);
        this.c = c0Var;
        c0Var.r(cVar.e());
        this.c.s(cVar.f());
        this.c.o(cVar.b());
        this.c.q(cVar.d());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_dodopizza_persistence_entity_cart_CartEntityRealmProxy com_dodopizza_persistence_entity_cart_cartentityrealmproxy = (com_dodopizza_persistence_entity_cart_CartEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_cart_cartentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_cart_cartentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_cart_cartentityrealmproxy.c.g().E0()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        String path = this.c.f().getPath();
        String o = this.c.g().o().o();
        long E0 = this.c.g().E0();
        int i2 = 0;
        if (path != null) {
            i = path.hashCode();
        } else {
            i = 0;
        }
        int i3 = (527 + i) * 31;
        if (o != null) {
            i2 = o.hashCode();
        }
        return ((i3 + i2) * 31) + ((int) ((E0 >>> 32) ^ E0));
    }

    @Override // com.dodopizza.persistence.entity.cart.CartEntity, defpackage.lfc
    public k0<AppliedBonusActionEntity> realmGet$appliedBonusActions() {
        this.c.f().c();
        k0<AppliedBonusActionEntity> k0Var = this.f;
        if (k0Var != null) {
            return k0Var;
        }
        k0<AppliedBonusActionEntity> k0Var2 = new k0<>(AppliedBonusActionEntity.class, this.c.g().f0(this.b.j), this.c.f());
        this.f = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.cart.CartEntity, defpackage.lfc
    public k0<CartItemEntity> realmGet$cartItems() {
        this.c.f().c();
        k0<CartItemEntity> k0Var = this.d;
        if (k0Var != null) {
            return k0Var;
        }
        k0<CartItemEntity> k0Var2 = new k0<>(CartItemEntity.class, this.c.g().f0(this.b.e), this.c.f());
        this.d = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.cart.CartEntity, defpackage.lfc
    public k0<CartItemEntity> realmGet$giftItems() {
        this.c.f().c();
        k0<CartItemEntity> k0Var = this.e;
        if (k0Var != null) {
            return k0Var;
        }
        k0<CartItemEntity> k0Var2 = new k0<>(CartItemEntity.class, this.c.g().f0(this.b.g), this.c.f());
        this.e = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.cart.CartEntity, defpackage.lfc
    public PriceEntity realmGet$price() {
        this.c.f().c();
        if (this.c.g().o0(this.b.f)) {
            return null;
        }
        return (PriceEntity) this.c.f().o(PriceEntity.class, this.c.g().L(this.b.f), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.CartEntity, defpackage.lfc
    public PersonalPromoActionEntity realmGet$promoAction() {
        this.c.f().c();
        if (this.c.g().o0(this.b.i)) {
            return null;
        }
        return (PersonalPromoActionEntity) this.c.f().o(PersonalPromoActionEntity.class, this.c.g().L(this.b.i), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.CartEntity, defpackage.lfc
    public DataPromoCodeEntity realmGet$promoCode() {
        this.c.f().c();
        if (this.c.g().o0(this.b.h)) {
            return null;
        }
        return (DataPromoCodeEntity) this.c.f().o(DataPromoCodeEntity.class, this.c.g().L(this.b.h), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.CartEntity, defpackage.lfc
    public void realmSet$appliedBonusActions(k0<AppliedBonusActionEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("appliedBonusActions")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<AppliedBonusActionEntity> k0Var2 = new k0<>();
                Iterator<AppliedBonusActionEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    AppliedBonusActionEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((AppliedBonusActionEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.j);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i < size) {
                AppliedBonusActionEntity appliedBonusActionEntity = k0Var.get(i);
                this.c.c(appliedBonusActionEntity);
                f0.U(i, ((r89) appliedBonusActionEntity).a().g().E0());
                i++;
            }
            return;
        }
        f0.J();
        if (k0Var == null) {
            return;
        }
        int size2 = k0Var.size();
        while (i < size2) {
            AppliedBonusActionEntity appliedBonusActionEntity2 = k0Var.get(i);
            this.c.c(appliedBonusActionEntity2);
            f0.k(((r89) appliedBonusActionEntity2).a().g().E0());
            i++;
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.CartEntity, defpackage.lfc
    public void realmSet$cartItems(k0<CartItemEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("cartItems")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<CartItemEntity> k0Var2 = new k0<>();
                Iterator<CartItemEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    CartItemEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((CartItemEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.e);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i < size) {
                CartItemEntity cartItemEntity = k0Var.get(i);
                this.c.c(cartItemEntity);
                f0.U(i, ((r89) cartItemEntity).a().g().E0());
                i++;
            }
            return;
        }
        f0.J();
        if (k0Var == null) {
            return;
        }
        int size2 = k0Var.size();
        while (i < size2) {
            CartItemEntity cartItemEntity2 = k0Var.get(i);
            this.c.c(cartItemEntity2);
            f0.k(((r89) cartItemEntity2).a().g().E0());
            i++;
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.CartEntity, defpackage.lfc
    public void realmSet$giftItems(k0<CartItemEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("giftItems")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<CartItemEntity> k0Var2 = new k0<>();
                Iterator<CartItemEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    CartItemEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((CartItemEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.g);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i < size) {
                CartItemEntity cartItemEntity = k0Var.get(i);
                this.c.c(cartItemEntity);
                f0.U(i, ((r89) cartItemEntity).a().g().E0());
                i++;
            }
            return;
        }
        f0.J();
        if (k0Var == null) {
            return;
        }
        int size2 = k0Var.size();
        while (i < size2) {
            CartItemEntity cartItemEntity2 = k0Var.get(i);
            this.c.c(cartItemEntity2);
            f0.k(((r89) cartItemEntity2).a().g().E0());
            i++;
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.CartEntity, defpackage.lfc
    public void realmSet$price(PriceEntity priceEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("price")) {
                return;
            }
            if (priceEntity != null && !n0.isManaged(priceEntity)) {
                priceEntity = (PriceEntity) d0Var.f0(priceEntity, new ex4[0]);
            }
            fp9 g2 = this.c.g();
            if (priceEntity == null) {
                g2.l0(this.b.f);
                return;
            }
            this.c.c(priceEntity);
            g2.o().B(this.b.f, g2.E0(), ((r89) priceEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (priceEntity == null) {
            this.c.g().l0(this.b.f);
            return;
        }
        this.c.c(priceEntity);
        this.c.g().s(this.b.f, ((r89) priceEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.CartEntity, defpackage.lfc
    public void realmSet$promoAction(PersonalPromoActionEntity personalPromoActionEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("promoAction")) {
                return;
            }
            if (personalPromoActionEntity != null && !n0.isManaged(personalPromoActionEntity)) {
                personalPromoActionEntity = (PersonalPromoActionEntity) d0Var.f0(personalPromoActionEntity, new ex4[0]);
            }
            fp9 g2 = this.c.g();
            if (personalPromoActionEntity == null) {
                g2.l0(this.b.i);
                return;
            }
            this.c.c(personalPromoActionEntity);
            g2.o().B(this.b.i, g2.E0(), ((r89) personalPromoActionEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (personalPromoActionEntity == null) {
            this.c.g().l0(this.b.i);
            return;
        }
        this.c.c(personalPromoActionEntity);
        this.c.g().s(this.b.i, ((r89) personalPromoActionEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.CartEntity, defpackage.lfc
    public void realmSet$promoCode(DataPromoCodeEntity dataPromoCodeEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("promoCode")) {
                return;
            }
            if (dataPromoCodeEntity != null && !n0.isManaged(dataPromoCodeEntity)) {
                dataPromoCodeEntity = (DataPromoCodeEntity) d0Var.f0(dataPromoCodeEntity, new ex4[0]);
            }
            fp9 g2 = this.c.g();
            if (dataPromoCodeEntity == null) {
                g2.l0(this.b.h);
                return;
            }
            this.c.c(dataPromoCodeEntity);
            g2.o().B(this.b.h, g2.E0(), ((r89) dataPromoCodeEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (dataPromoCodeEntity == null) {
            this.c.g().l0(this.b.h);
            return;
        }
        this.c.c(dataPromoCodeEntity);
        this.c.g().s(this.b.h, ((r89) dataPromoCodeEntity).a().g().E0());
    }

    public String toString() {
        String str;
        String str2;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CartEntity = proxy[");
        sb.append("{cartItems:");
        sb.append("RealmList<CartItemEntity>[");
        sb.append(realmGet$cartItems().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{price:");
        String str3 = "null";
        if (realmGet$price() == null) {
            str = "null";
        } else {
            str = "PriceEntity";
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{giftItems:");
        sb.append("RealmList<CartItemEntity>[");
        sb.append(realmGet$giftItems().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{promoCode:");
        if (realmGet$promoCode() == null) {
            str2 = "null";
        } else {
            str2 = "DataPromoCodeEntity";
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{promoAction:");
        if (realmGet$promoAction() != null) {
            str3 = "PersonalPromoActionEntity";
        }
        sb.append(str3);
        sb.append("}");
        sb.append(",");
        sb.append("{appliedBonusActions:");
        sb.append("RealmList<AppliedBonusActionEntity>[");
        sb.append(realmGet$appliedBonusActions().size());
        sb.append("]");
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
