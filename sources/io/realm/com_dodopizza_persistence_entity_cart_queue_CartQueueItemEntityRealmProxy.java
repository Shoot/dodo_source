package io.realm;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.cart.CartComboSlotProductEntity;
import com.dodopizza.persistence.entity.cart.CartProductEntity;
import com.dodopizza.persistence.entity.cart.CustomizationEntity;
import com.dodopizza.persistence.entity.cart.DiscountEntity;
import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy;
import io.realm.exceptions.RealmException;
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
public class com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy extends CartQueueItemEntity implements r89, egc {
    private static final OsObjectSchemaInfo f = g();
    private a b;
    private c0<CartQueueItemEntity> c;
    private k0<CartProductEntity> d;
    private k0<CartComboSlotProductEntity> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;
        long f;
        long g;
        long h;
        long i;
        long j;
        long k;
        long l;
        long m;
        long n;
        long o;
        long p;
        long q;
        long r;
        long s;
        long t;
        long u;
        long v;
        long w;

        a(OsSchemaInfo osSchemaInfo) {
            super(19);
            OsObjectSchemaInfo b = osSchemaInfo.b("CartQueueItemEntity");
            this.e = a("id", "id", b);
            this.f = a("operation", "operation", b);
            this.g = a("count", "count", b);
            this.h = a(Action.NAME_ATTRIBUTE, Action.NAME_ATTRIBUTE, b);
            this.i = a("imageUrl", "imageUrl", b);
            this.j = a("doughId", "doughId", b);
            this.k = a("doughTypeName", "doughTypeName", b);
            this.l = a("sizeId", "sizeId", b);
            this.m = a("sizeGroupName", "sizeGroupName", b);
            this.n = a("price", "price", b);
            this.o = a("customization", "customization", b);
            this.p = a("isGift", "isGift", b);
            this.q = a("shoppingItemId", "shoppingItemId", b);
            this.r = a("productCategory", "productCategory", b);
            this.s = a("cartItemId", "cartItemId", b);
            this.t = a("isCartItemPersisted", "isCartItemPersisted", b);
            this.u = a("pizzaHalves", "pizzaHalves", b);
            this.v = a("comboProducts", "comboProducts", b);
            this.w = a("discount", "discount", b);
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
            aVar2.k = aVar.k;
            aVar2.l = aVar.l;
            aVar2.m = aVar.m;
            aVar2.n = aVar.n;
            aVar2.o = aVar.o;
            aVar2.p = aVar.p;
            aVar2.q = aVar.q;
            aVar2.r = aVar.r;
            aVar2.s = aVar.s;
            aVar2.t = aVar.t;
            aVar2.u = aVar.u;
            aVar2.v = aVar.v;
            aVar2.w = aVar.w;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy() {
        this.c.p();
    }

    public static CartQueueItemEntity c(d0 d0Var, a aVar, CartQueueItemEntity cartQueueItemEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(cartQueueItemEntity);
        if (r89Var != null) {
            return (CartQueueItemEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(CartQueueItemEntity.class), set);
        osObjectBuilder.E0(aVar.e, cartQueueItemEntity.realmGet$id());
        osObjectBuilder.E0(aVar.f, cartQueueItemEntity.realmGet$operation());
        osObjectBuilder.o0(aVar.g, Integer.valueOf(cartQueueItemEntity.realmGet$count()));
        osObjectBuilder.E0(aVar.h, cartQueueItemEntity.realmGet$name());
        osObjectBuilder.E0(aVar.i, cartQueueItemEntity.realmGet$imageUrl());
        osObjectBuilder.o0(aVar.j, Integer.valueOf(cartQueueItemEntity.realmGet$doughId()));
        osObjectBuilder.E0(aVar.k, cartQueueItemEntity.realmGet$doughTypeName());
        osObjectBuilder.o0(aVar.l, Integer.valueOf(cartQueueItemEntity.realmGet$sizeId()));
        osObjectBuilder.E0(aVar.m, cartQueueItemEntity.realmGet$sizeGroupName());
        osObjectBuilder.l0(aVar.n, Double.valueOf(cartQueueItemEntity.realmGet$price()));
        osObjectBuilder.j0(aVar.p, Boolean.valueOf(cartQueueItemEntity.realmGet$isGift()));
        osObjectBuilder.E0(aVar.q, cartQueueItemEntity.realmGet$shoppingItemId());
        osObjectBuilder.E0(aVar.r, cartQueueItemEntity.realmGet$productCategory());
        osObjectBuilder.E0(aVar.s, cartQueueItemEntity.realmGet$cartItemId());
        osObjectBuilder.j0(aVar.t, Boolean.valueOf(cartQueueItemEntity.realmGet$isCartItemPersisted()));
        com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(cartQueueItemEntity, j);
        CustomizationEntity realmGet$customization = cartQueueItemEntity.realmGet$customization();
        if (realmGet$customization == null) {
            j.realmSet$customization(null);
        } else {
            CustomizationEntity customizationEntity = (CustomizationEntity) map.get(realmGet$customization);
            if (customizationEntity != null) {
                j.realmSet$customization(customizationEntity);
            } else {
                j.realmSet$customization(com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.a) d0Var.u().e(CustomizationEntity.class), realmGet$customization, z, map, set));
            }
        }
        k0<CartProductEntity> realmGet$pizzaHalves = cartQueueItemEntity.realmGet$pizzaHalves();
        if (realmGet$pizzaHalves != null) {
            k0<CartProductEntity> realmGet$pizzaHalves2 = j.realmGet$pizzaHalves();
            realmGet$pizzaHalves2.clear();
            for (int i = 0; i < realmGet$pizzaHalves.size(); i++) {
                CartProductEntity cartProductEntity = realmGet$pizzaHalves.get(i);
                CartProductEntity cartProductEntity2 = (CartProductEntity) map.get(cartProductEntity);
                if (cartProductEntity2 != null) {
                    realmGet$pizzaHalves2.add(cartProductEntity2);
                } else {
                    realmGet$pizzaHalves2.add(com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.a) d0Var.u().e(CartProductEntity.class), cartProductEntity, z, map, set));
                }
            }
        }
        k0<CartComboSlotProductEntity> realmGet$comboProducts = cartQueueItemEntity.realmGet$comboProducts();
        if (realmGet$comboProducts != null) {
            k0<CartComboSlotProductEntity> realmGet$comboProducts2 = j.realmGet$comboProducts();
            realmGet$comboProducts2.clear();
            for (int i2 = 0; i2 < realmGet$comboProducts.size(); i2++) {
                CartComboSlotProductEntity cartComboSlotProductEntity = realmGet$comboProducts.get(i2);
                CartComboSlotProductEntity cartComboSlotProductEntity2 = (CartComboSlotProductEntity) map.get(cartComboSlotProductEntity);
                if (cartComboSlotProductEntity2 != null) {
                    realmGet$comboProducts2.add(cartComboSlotProductEntity2);
                } else {
                    realmGet$comboProducts2.add(com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.a) d0Var.u().e(CartComboSlotProductEntity.class), cartComboSlotProductEntity, z, map, set));
                }
            }
        }
        DiscountEntity realmGet$discount = cartQueueItemEntity.realmGet$discount();
        if (realmGet$discount == null) {
            j.realmSet$discount(null);
        } else {
            DiscountEntity discountEntity = (DiscountEntity) map.get(realmGet$discount);
            if (discountEntity != null) {
                j.realmSet$discount(discountEntity);
            } else {
                j.realmSet$discount(com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy.a) d0Var.u().e(DiscountEntity.class), realmGet$discount, z, map, set));
            }
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy.a r9, com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
        /*
            boolean r0 = r10 instanceof defpackage.r89
            if (r0 == 0) goto L3e
            boolean r0 = io.realm.n0.isFrozen(r10)
            if (r0 != 0) goto L3e
            r0 = r10
            r89 r0 = (defpackage.r89) r0
            io.realm.c0 r1 = r0.a()
            io.realm.a r1 = r1.f()
            if (r1 == 0) goto L3e
            io.realm.c0 r0 = r0.a()
            io.realm.a r0 = r0.f()
            long r1 = r0.b
            long r3 = r8.b
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L36
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = r8.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
            return r10
        L36:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r8.<init>(r9)
            throw r8
        L3e:
            io.realm.a$d r0 = io.realm.a.k
            java.lang.Object r0 = r0.get()
            io.realm.a$c r0 = (io.realm.a.c) r0
            java.lang.Object r1 = r12.get(r10)
            r89 r1 = (defpackage.r89) r1
            if (r1 == 0) goto L51
            com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity r1 = (com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity> r2 = com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity.class
            io.realm.internal.Table r2 = r8.I0(r2)
            long r3 = r9.e
            java.lang.String r5 = r10.realmGet$id()
            if (r5 != 0) goto L67
            long r3 = r2.c(r3)
            goto L6b
        L67:
            long r3 = r2.d(r3, r5)
        L6b:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L74
            r0 = 0
        L72:
            r3 = r1
            goto L95
        L74:
            io.realm.internal.UncheckedRow r3 = r2.r(r3)     // Catch: java.lang.Throwable -> L90
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L90
            r1 = r0
            r2 = r8
            r4 = r9
            r1.g(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L90
            io.realm.com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy     // Catch: java.lang.Throwable -> L90
            r1.<init>()     // Catch: java.lang.Throwable -> L90
            r12.put(r10, r1)     // Catch: java.lang.Throwable -> L90
            r0.a()
        L8e:
            r0 = r11
            goto L72
        L90:
            r8 = move-exception
            r0.a()
            throw r8
        L95:
            if (r0 == 0) goto La1
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy$a, com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static CartQueueItemEntity f(CartQueueItemEntity cartQueueItemEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        CartQueueItemEntity cartQueueItemEntity2;
        if (i > i2 || cartQueueItemEntity == null) {
            return null;
        }
        r89.a<o89> aVar = map.get(cartQueueItemEntity);
        if (aVar == null) {
            cartQueueItemEntity2 = new CartQueueItemEntity();
            map.put(cartQueueItemEntity, new r89.a<>(i, cartQueueItemEntity2));
        } else if (i >= aVar.a) {
            return (CartQueueItemEntity) aVar.b;
        } else {
            aVar.a = i;
            cartQueueItemEntity2 = (CartQueueItemEntity) aVar.b;
        }
        d0 d0Var = (d0) ((r89) cartQueueItemEntity).a().f();
        cartQueueItemEntity2.realmSet$id(cartQueueItemEntity.realmGet$id());
        cartQueueItemEntity2.realmSet$operation(cartQueueItemEntity.realmGet$operation());
        cartQueueItemEntity2.realmSet$count(cartQueueItemEntity.realmGet$count());
        cartQueueItemEntity2.realmSet$name(cartQueueItemEntity.realmGet$name());
        cartQueueItemEntity2.realmSet$imageUrl(cartQueueItemEntity.realmGet$imageUrl());
        cartQueueItemEntity2.realmSet$doughId(cartQueueItemEntity.realmGet$doughId());
        cartQueueItemEntity2.realmSet$doughTypeName(cartQueueItemEntity.realmGet$doughTypeName());
        cartQueueItemEntity2.realmSet$sizeId(cartQueueItemEntity.realmGet$sizeId());
        cartQueueItemEntity2.realmSet$sizeGroupName(cartQueueItemEntity.realmGet$sizeGroupName());
        cartQueueItemEntity2.realmSet$price(cartQueueItemEntity.realmGet$price());
        int i3 = i + 1;
        cartQueueItemEntity2.realmSet$customization(com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.f(cartQueueItemEntity.realmGet$customization(), i3, i2, map));
        cartQueueItemEntity2.realmSet$isGift(cartQueueItemEntity.realmGet$isGift());
        cartQueueItemEntity2.realmSet$shoppingItemId(cartQueueItemEntity.realmGet$shoppingItemId());
        cartQueueItemEntity2.realmSet$productCategory(cartQueueItemEntity.realmGet$productCategory());
        cartQueueItemEntity2.realmSet$cartItemId(cartQueueItemEntity.realmGet$cartItemId());
        cartQueueItemEntity2.realmSet$isCartItemPersisted(cartQueueItemEntity.realmGet$isCartItemPersisted());
        if (i == i2) {
            cartQueueItemEntity2.realmSet$pizzaHalves(null);
        } else {
            k0<CartProductEntity> realmGet$pizzaHalves = cartQueueItemEntity.realmGet$pizzaHalves();
            k0<CartProductEntity> k0Var = new k0<>();
            cartQueueItemEntity2.realmSet$pizzaHalves(k0Var);
            int size = realmGet$pizzaHalves.size();
            for (int i4 = 0; i4 < size; i4++) {
                k0Var.add(com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.f(realmGet$pizzaHalves.get(i4), i3, i2, map));
            }
        }
        if (i == i2) {
            cartQueueItemEntity2.realmSet$comboProducts(null);
        } else {
            k0<CartComboSlotProductEntity> realmGet$comboProducts = cartQueueItemEntity.realmGet$comboProducts();
            k0<CartComboSlotProductEntity> k0Var2 = new k0<>();
            cartQueueItemEntity2.realmSet$comboProducts(k0Var2);
            int size2 = realmGet$comboProducts.size();
            for (int i5 = 0; i5 < size2; i5++) {
                k0Var2.add(com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.f(realmGet$comboProducts.get(i5), i3, i2, map));
            }
        }
        cartQueueItemEntity2.realmSet$discount(com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy.f(cartQueueItemEntity.realmGet$discount(), i3, i2, map));
        return cartQueueItemEntity2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "CartQueueItemEntity", false, 19, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, false);
        bVar.b("", "operation", realmFieldType, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.b("", "count", realmFieldType2, false, false, true);
        bVar.b("", Action.NAME_ATTRIBUTE, realmFieldType, false, false, true);
        bVar.b("", "imageUrl", realmFieldType, false, false, true);
        bVar.b("", "doughId", realmFieldType2, false, false, true);
        bVar.b("", "doughTypeName", realmFieldType, false, false, true);
        bVar.b("", "sizeId", realmFieldType2, false, false, true);
        bVar.b("", "sizeGroupName", realmFieldType, false, false, true);
        bVar.b("", "price", RealmFieldType.DOUBLE, false, false, true);
        RealmFieldType realmFieldType3 = RealmFieldType.OBJECT;
        bVar.a("", "customization", realmFieldType3, "CustomizationEntity");
        RealmFieldType realmFieldType4 = RealmFieldType.BOOLEAN;
        bVar.b("", "isGift", realmFieldType4, false, false, true);
        bVar.b("", "shoppingItemId", realmFieldType, false, false, true);
        bVar.b("", "productCategory", realmFieldType, false, false, true);
        bVar.b("", "cartItemId", realmFieldType, false, false, true);
        bVar.b("", "isCartItemPersisted", realmFieldType4, false, false, true);
        RealmFieldType realmFieldType5 = RealmFieldType.LIST;
        bVar.a("", "pizzaHalves", realmFieldType5, "CartProductEntity");
        bVar.a("", "comboProducts", realmFieldType5, "CartComboSlotProductEntity");
        bVar.a("", "discount", realmFieldType3, "DiscountEntity");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f;
    }

    public static long i(d0 d0Var, CartQueueItemEntity cartQueueItemEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        long j;
        long j2;
        long j3;
        if ((cartQueueItemEntity instanceof r89) && !n0.isFrozen(cartQueueItemEntity)) {
            r89 r89Var = (r89) cartQueueItemEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(CartQueueItemEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(CartQueueItemEntity.class);
        long j4 = aVar.e;
        String realmGet$id = cartQueueItemEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j4);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j4, realmGet$id);
        }
        long j5 = nativeFindFirstString;
        map.put(cartQueueItemEntity, Long.valueOf(j5));
        String realmGet$operation = cartQueueItemEntity.realmGet$operation();
        if (realmGet$operation != null) {
            j = j5;
            Table.nativeSetString(nativePtr, aVar.f, j5, realmGet$operation, false);
        } else {
            j = j5;
            Table.nativeSetNull(nativePtr, aVar.f, j, false);
        }
        Table.nativeSetLong(nativePtr, aVar.g, j, cartQueueItemEntity.realmGet$count(), false);
        String realmGet$name = cartQueueItemEntity.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, aVar.h, j, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, j, false);
        }
        String realmGet$imageUrl = cartQueueItemEntity.realmGet$imageUrl();
        if (realmGet$imageUrl != null) {
            Table.nativeSetString(nativePtr, aVar.i, j, realmGet$imageUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.i, j, false);
        }
        Table.nativeSetLong(nativePtr, aVar.j, j, cartQueueItemEntity.realmGet$doughId(), false);
        String realmGet$doughTypeName = cartQueueItemEntity.realmGet$doughTypeName();
        if (realmGet$doughTypeName != null) {
            Table.nativeSetString(nativePtr, aVar.k, j, realmGet$doughTypeName, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.k, j, false);
        }
        Table.nativeSetLong(nativePtr, aVar.l, j, cartQueueItemEntity.realmGet$sizeId(), false);
        String realmGet$sizeGroupName = cartQueueItemEntity.realmGet$sizeGroupName();
        if (realmGet$sizeGroupName != null) {
            Table.nativeSetString(nativePtr, aVar.m, j, realmGet$sizeGroupName, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.m, j, false);
        }
        Table.nativeSetDouble(nativePtr, aVar.n, j, cartQueueItemEntity.realmGet$price(), false);
        CustomizationEntity realmGet$customization = cartQueueItemEntity.realmGet$customization();
        if (realmGet$customization != null) {
            Long l = map.get(realmGet$customization);
            if (l == null) {
                l = Long.valueOf(com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.i(d0Var, realmGet$customization, map));
            }
            Table.nativeSetLink(nativePtr, aVar.o, j, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.o, j);
        }
        Table.nativeSetBoolean(nativePtr, aVar.p, j, cartQueueItemEntity.realmGet$isGift(), false);
        String realmGet$shoppingItemId = cartQueueItemEntity.realmGet$shoppingItemId();
        if (realmGet$shoppingItemId != null) {
            Table.nativeSetString(nativePtr, aVar.q, j, realmGet$shoppingItemId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.q, j, false);
        }
        String realmGet$productCategory = cartQueueItemEntity.realmGet$productCategory();
        if (realmGet$productCategory != null) {
            Table.nativeSetString(nativePtr, aVar.r, j, realmGet$productCategory, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.r, j, false);
        }
        String realmGet$cartItemId = cartQueueItemEntity.realmGet$cartItemId();
        if (realmGet$cartItemId != null) {
            Table.nativeSetString(nativePtr, aVar.s, j, realmGet$cartItemId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.s, j, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.t, j, cartQueueItemEntity.realmGet$isCartItemPersisted(), false);
        long j6 = j;
        OsList osList = new OsList(I0.r(j6), aVar.u);
        k0<CartProductEntity> realmGet$pizzaHalves = cartQueueItemEntity.realmGet$pizzaHalves();
        if (realmGet$pizzaHalves != null && realmGet$pizzaHalves.size() == osList.X()) {
            int size = realmGet$pizzaHalves.size();
            int i = 0;
            while (i < size) {
                CartProductEntity cartProductEntity = realmGet$pizzaHalves.get(i);
                Long l2 = map.get(cartProductEntity);
                if (l2 == null) {
                    l2 = Long.valueOf(com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.i(d0Var, cartProductEntity, map));
                }
                osList.U(i, l2.longValue());
                i++;
                size = size;
                j6 = j6;
            }
            j2 = j6;
        } else {
            j2 = j6;
            osList.J();
            if (realmGet$pizzaHalves != null) {
                Iterator<CartProductEntity> it = realmGet$pizzaHalves.iterator();
                while (it.hasNext()) {
                    CartProductEntity next = it.next();
                    Long l3 = map.get(next);
                    if (l3 == null) {
                        l3 = Long.valueOf(com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.i(d0Var, next, map));
                    }
                    osList.k(l3.longValue());
                }
            }
        }
        long j7 = j2;
        OsList osList2 = new OsList(I0.r(j7), aVar.v);
        k0<CartComboSlotProductEntity> realmGet$comboProducts = cartQueueItemEntity.realmGet$comboProducts();
        if (realmGet$comboProducts != null && realmGet$comboProducts.size() == osList2.X()) {
            int size2 = realmGet$comboProducts.size();
            int i2 = 0;
            while (i2 < size2) {
                CartComboSlotProductEntity cartComboSlotProductEntity = realmGet$comboProducts.get(i2);
                Long l4 = map.get(cartComboSlotProductEntity);
                if (l4 == null) {
                    l4 = Long.valueOf(com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.i(d0Var, cartComboSlotProductEntity, map));
                }
                osList2.U(i2, l4.longValue());
                i2++;
                j7 = j7;
            }
            j3 = j7;
        } else {
            j3 = j7;
            osList2.J();
            if (realmGet$comboProducts != null) {
                Iterator<CartComboSlotProductEntity> it2 = realmGet$comboProducts.iterator();
                while (it2.hasNext()) {
                    CartComboSlotProductEntity next2 = it2.next();
                    Long l5 = map.get(next2);
                    if (l5 == null) {
                        l5 = Long.valueOf(com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.i(d0Var, next2, map));
                    }
                    osList2.k(l5.longValue());
                }
            }
        }
        DiscountEntity realmGet$discount = cartQueueItemEntity.realmGet$discount();
        if (realmGet$discount != null) {
            Long l6 = map.get(realmGet$discount);
            if (l6 == null) {
                l6 = Long.valueOf(com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy.i(d0Var, realmGet$discount, map));
            }
            long j8 = j3;
            Table.nativeSetLink(nativePtr, aVar.w, j8, l6.longValue(), false);
            return j8;
        }
        long j9 = j3;
        Table.nativeNullifyLink(nativePtr, aVar.w, j9);
        return j9;
    }

    static com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(CartQueueItemEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy com_dodopizza_persistence_entity_cart_queue_cartqueueitementityrealmproxy = new com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_cart_queue_cartqueueitementityrealmproxy;
    }

    static CartQueueItemEntity k(d0 d0Var, a aVar, CartQueueItemEntity cartQueueItemEntity, CartQueueItemEntity cartQueueItemEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(CartQueueItemEntity.class), set);
        osObjectBuilder.E0(aVar.e, cartQueueItemEntity2.realmGet$id());
        osObjectBuilder.E0(aVar.f, cartQueueItemEntity2.realmGet$operation());
        osObjectBuilder.o0(aVar.g, Integer.valueOf(cartQueueItemEntity2.realmGet$count()));
        osObjectBuilder.E0(aVar.h, cartQueueItemEntity2.realmGet$name());
        osObjectBuilder.E0(aVar.i, cartQueueItemEntity2.realmGet$imageUrl());
        osObjectBuilder.o0(aVar.j, Integer.valueOf(cartQueueItemEntity2.realmGet$doughId()));
        osObjectBuilder.E0(aVar.k, cartQueueItemEntity2.realmGet$doughTypeName());
        osObjectBuilder.o0(aVar.l, Integer.valueOf(cartQueueItemEntity2.realmGet$sizeId()));
        osObjectBuilder.E0(aVar.m, cartQueueItemEntity2.realmGet$sizeGroupName());
        osObjectBuilder.l0(aVar.n, Double.valueOf(cartQueueItemEntity2.realmGet$price()));
        CustomizationEntity realmGet$customization = cartQueueItemEntity2.realmGet$customization();
        if (realmGet$customization == null) {
            osObjectBuilder.r0(aVar.o);
        } else {
            CustomizationEntity customizationEntity = (CustomizationEntity) map.get(realmGet$customization);
            if (customizationEntity != null) {
                osObjectBuilder.x0(aVar.o, customizationEntity);
            } else {
                osObjectBuilder.x0(aVar.o, com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.a) d0Var.u().e(CustomizationEntity.class), realmGet$customization, true, map, set));
            }
        }
        osObjectBuilder.j0(aVar.p, Boolean.valueOf(cartQueueItemEntity2.realmGet$isGift()));
        osObjectBuilder.E0(aVar.q, cartQueueItemEntity2.realmGet$shoppingItemId());
        osObjectBuilder.E0(aVar.r, cartQueueItemEntity2.realmGet$productCategory());
        osObjectBuilder.E0(aVar.s, cartQueueItemEntity2.realmGet$cartItemId());
        osObjectBuilder.j0(aVar.t, Boolean.valueOf(cartQueueItemEntity2.realmGet$isCartItemPersisted()));
        k0<CartProductEntity> realmGet$pizzaHalves = cartQueueItemEntity2.realmGet$pizzaHalves();
        if (realmGet$pizzaHalves != null) {
            k0 k0Var = new k0();
            for (int i = 0; i < realmGet$pizzaHalves.size(); i++) {
                CartProductEntity cartProductEntity = realmGet$pizzaHalves.get(i);
                CartProductEntity cartProductEntity2 = (CartProductEntity) map.get(cartProductEntity);
                if (cartProductEntity2 != null) {
                    k0Var.add(cartProductEntity2);
                } else {
                    k0Var.add(com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.a) d0Var.u().e(CartProductEntity.class), cartProductEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.u, k0Var);
        } else {
            osObjectBuilder.z0(aVar.u, new k0());
        }
        k0<CartComboSlotProductEntity> realmGet$comboProducts = cartQueueItemEntity2.realmGet$comboProducts();
        if (realmGet$comboProducts != null) {
            k0 k0Var2 = new k0();
            for (int i2 = 0; i2 < realmGet$comboProducts.size(); i2++) {
                CartComboSlotProductEntity cartComboSlotProductEntity = realmGet$comboProducts.get(i2);
                CartComboSlotProductEntity cartComboSlotProductEntity2 = (CartComboSlotProductEntity) map.get(cartComboSlotProductEntity);
                if (cartComboSlotProductEntity2 != null) {
                    k0Var2.add(cartComboSlotProductEntity2);
                } else {
                    k0Var2.add(com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.a) d0Var.u().e(CartComboSlotProductEntity.class), cartComboSlotProductEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.v, k0Var2);
        } else {
            osObjectBuilder.z0(aVar.v, new k0());
        }
        DiscountEntity realmGet$discount = cartQueueItemEntity2.realmGet$discount();
        if (realmGet$discount == null) {
            osObjectBuilder.r0(aVar.w);
        } else {
            DiscountEntity discountEntity = (DiscountEntity) map.get(realmGet$discount);
            if (discountEntity != null) {
                osObjectBuilder.x0(aVar.w, discountEntity);
            } else {
                osObjectBuilder.x0(aVar.w, com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy.a) d0Var.u().e(DiscountEntity.class), realmGet$discount, true, map, set));
            }
        }
        osObjectBuilder.K0();
        return cartQueueItemEntity;
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
        c0<CartQueueItemEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy com_dodopizza_persistence_entity_cart_queue_cartqueueitementityrealmproxy = (com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy) obj;
        io.realm.a f2 = this.c.f();
        io.realm.a f3 = com_dodopizza_persistence_entity_cart_queue_cartqueueitementityrealmproxy.c.f();
        String path = f2.getPath();
        String path2 = f3.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f2.E() != f3.E() || !f2.e.getVersionID().equals(f3.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_cart_queue_cartqueueitementityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_cart_queue_cartqueueitementityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public String realmGet$cartItemId() {
        this.c.f().c();
        return this.c.g().p0(this.b.s);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public k0<CartComboSlotProductEntity> realmGet$comboProducts() {
        this.c.f().c();
        k0<CartComboSlotProductEntity> k0Var = this.e;
        if (k0Var != null) {
            return k0Var;
        }
        k0<CartComboSlotProductEntity> k0Var2 = new k0<>(CartComboSlotProductEntity.class, this.c.g().f0(this.b.v), this.c.f());
        this.e = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public int realmGet$count() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public CustomizationEntity realmGet$customization() {
        this.c.f().c();
        if (this.c.g().o0(this.b.o)) {
            return null;
        }
        return (CustomizationEntity) this.c.f().o(CustomizationEntity.class, this.c.g().L(this.b.o), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public DiscountEntity realmGet$discount() {
        this.c.f().c();
        if (this.c.g().o0(this.b.w)) {
            return null;
        }
        return (DiscountEntity) this.c.f().o(DiscountEntity.class, this.c.g().L(this.b.w), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public int realmGet$doughId() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public String realmGet$doughTypeName() {
        this.c.f().c();
        return this.c.g().p0(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public String realmGet$imageUrl() {
        this.c.f().c();
        return this.c.g().p0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public boolean realmGet$isCartItemPersisted() {
        this.c.f().c();
        return this.c.g().b0(this.b.t);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public boolean realmGet$isGift() {
        this.c.f().c();
        return this.c.g().b0(this.b.p);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public String realmGet$name() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public String realmGet$operation() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public k0<CartProductEntity> realmGet$pizzaHalves() {
        this.c.f().c();
        k0<CartProductEntity> k0Var = this.d;
        if (k0Var != null) {
            return k0Var;
        }
        k0<CartProductEntity> k0Var2 = new k0<>(CartProductEntity.class, this.c.g().f0(this.b.u), this.c.f());
        this.d = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public double realmGet$price() {
        this.c.f().c();
        return this.c.g().K(this.b.n);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public String realmGet$productCategory() {
        this.c.f().c();
        return this.c.g().p0(this.b.r);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public String realmGet$shoppingItemId() {
        this.c.f().c();
        return this.c.g().p0(this.b.q);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public String realmGet$sizeGroupName() {
        this.c.f().c();
        return this.c.g().p0(this.b.m);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public int realmGet$sizeId() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.l);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public void realmSet$cartItemId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.s, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'cartItemId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.s, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'cartItemId' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public void realmSet$comboProducts(k0<CartComboSlotProductEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("comboProducts")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<CartComboSlotProductEntity> k0Var2 = new k0<>();
                Iterator<CartComboSlotProductEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    CartComboSlotProductEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((CartComboSlotProductEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.v);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i < size) {
                CartComboSlotProductEntity cartComboSlotProductEntity = k0Var.get(i);
                this.c.c(cartComboSlotProductEntity);
                f0.U(i, ((r89) cartComboSlotProductEntity).a().g().E0());
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
            CartComboSlotProductEntity cartComboSlotProductEntity2 = k0Var.get(i);
            this.c.c(cartComboSlotProductEntity2);
            f0.k(((r89) cartComboSlotProductEntity2).a().g().E0());
            i++;
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public void realmSet$count(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.g, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.g, i);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public void realmSet$customization(CustomizationEntity customizationEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("customization")) {
                return;
            }
            if (customizationEntity != null && !n0.isManaged(customizationEntity)) {
                customizationEntity = (CustomizationEntity) d0Var.j0(customizationEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (customizationEntity == null) {
                g.l0(this.b.o);
                return;
            }
            this.c.c(customizationEntity);
            g.o().B(this.b.o, g.E0(), ((r89) customizationEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (customizationEntity == null) {
            this.c.g().l0(this.b.o);
            return;
        }
        this.c.c(customizationEntity);
        this.c.g().s(this.b.o, ((r89) customizationEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public void realmSet$discount(DiscountEntity discountEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("discount")) {
                return;
            }
            if (discountEntity != null && !n0.isManaged(discountEntity)) {
                discountEntity = (DiscountEntity) d0Var.j0(discountEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (discountEntity == null) {
                g.l0(this.b.w);
                return;
            }
            this.c.c(discountEntity);
            g.o().B(this.b.w, g.E0(), ((r89) discountEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (discountEntity == null) {
            this.c.g().l0(this.b.w);
            return;
        }
        this.c.c(discountEntity);
        this.c.g().s(this.b.w, ((r89) discountEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public void realmSet$doughId(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.j, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.j, i);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public void realmSet$doughTypeName(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.k, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'doughTypeName' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.k, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'doughTypeName' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public void realmSet$imageUrl(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.i, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'imageUrl' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.i, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'imageUrl' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public void realmSet$isCartItemPersisted(boolean z) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().y(this.b.t, g.E0(), z, true);
            return;
        }
        this.c.f().c();
        this.c.g().Q(this.b.t, z);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public void realmSet$isGift(boolean z) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().y(this.b.p, g.E0(), z, true);
            return;
        }
        this.c.f().c();
        this.c.g().Q(this.b.p, z);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public void realmSet$name(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.h, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.h, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public void realmSet$operation(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.f, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'operation' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'operation' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public void realmSet$pizzaHalves(k0<CartProductEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("pizzaHalves")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<CartProductEntity> k0Var2 = new k0<>();
                Iterator<CartProductEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    CartProductEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((CartProductEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.u);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i < size) {
                CartProductEntity cartProductEntity = k0Var.get(i);
                this.c.c(cartProductEntity);
                f0.U(i, ((r89) cartProductEntity).a().g().E0());
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
            CartProductEntity cartProductEntity2 = k0Var.get(i);
            this.c.c(cartProductEntity2);
            f0.k(((r89) cartProductEntity2).a().g().E0());
            i++;
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public void realmSet$price(double d) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.n, g.E0(), d, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.n, d);
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public void realmSet$productCategory(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.r, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'productCategory' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.r, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'productCategory' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public void realmSet$shoppingItemId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.q, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'shoppingItemId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.q, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'shoppingItemId' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public void realmSet$sizeGroupName(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.m, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'sizeGroupName' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.m, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'sizeGroupName' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity, defpackage.egc
    public void realmSet$sizeId(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.l, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.l, i);
    }

    public String toString() {
        String str;
        String str2;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CartQueueItemEntity = proxy[");
        sb.append("{id:");
        String str3 = "null";
        if (realmGet$id() == null) {
            str = "null";
        } else {
            str = realmGet$id();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{operation:");
        sb.append(realmGet$operation());
        sb.append("}");
        sb.append(",");
        sb.append("{count:");
        sb.append(realmGet$count());
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(realmGet$name());
        sb.append("}");
        sb.append(",");
        sb.append("{imageUrl:");
        sb.append(realmGet$imageUrl());
        sb.append("}");
        sb.append(",");
        sb.append("{doughId:");
        sb.append(realmGet$doughId());
        sb.append("}");
        sb.append(",");
        sb.append("{doughTypeName:");
        sb.append(realmGet$doughTypeName());
        sb.append("}");
        sb.append(",");
        sb.append("{sizeId:");
        sb.append(realmGet$sizeId());
        sb.append("}");
        sb.append(",");
        sb.append("{sizeGroupName:");
        sb.append(realmGet$sizeGroupName());
        sb.append("}");
        sb.append(",");
        sb.append("{price:");
        sb.append(realmGet$price());
        sb.append("}");
        sb.append(",");
        sb.append("{customization:");
        if (realmGet$customization() == null) {
            str2 = "null";
        } else {
            str2 = "CustomizationEntity";
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{isGift:");
        sb.append(realmGet$isGift());
        sb.append("}");
        sb.append(",");
        sb.append("{shoppingItemId:");
        sb.append(realmGet$shoppingItemId());
        sb.append("}");
        sb.append(",");
        sb.append("{productCategory:");
        sb.append(realmGet$productCategory());
        sb.append("}");
        sb.append(",");
        sb.append("{cartItemId:");
        sb.append(realmGet$cartItemId());
        sb.append("}");
        sb.append(",");
        sb.append("{isCartItemPersisted:");
        sb.append(realmGet$isCartItemPersisted());
        sb.append("}");
        sb.append(",");
        sb.append("{pizzaHalves:");
        sb.append("RealmList<CartProductEntity>[");
        sb.append(realmGet$pizzaHalves().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{comboProducts:");
        sb.append("RealmList<CartComboSlotProductEntity>[");
        sb.append(realmGet$comboProducts().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{discount:");
        if (realmGet$discount() != null) {
            str3 = "DiscountEntity";
        }
        sb.append(str3);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
