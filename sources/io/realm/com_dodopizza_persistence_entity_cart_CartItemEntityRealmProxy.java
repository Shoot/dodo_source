package io.realm;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.ImageEntity;
import com.dodopizza.persistence.entity.cart.CartComboSlotProductEntity;
import com.dodopizza.persistence.entity.cart.CartItemEntity;
import com.dodopizza.persistence.entity.cart.CustomizationEntity;
import com.dodopizza.persistence.entity.cart.DiscountEntity;
import com.dodopizza.persistence.entity.cart.PizzaHalvesEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_ImageEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy;
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
public class com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy extends CartItemEntity implements r89, mfc {
    private static final OsObjectSchemaInfo e = g();
    private a b;
    private c0<CartItemEntity> c;
    private k0<CartComboSlotProductEntity> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long A;
        long B;
        long C;
        long D;
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
        long x;
        long y;
        long z;

        a(OsSchemaInfo osSchemaInfo) {
            super(26);
            OsObjectSchemaInfo b = osSchemaInfo.b("CartItemEntity");
            this.e = a("id", "id", b);
            this.f = a("count", "count", b);
            this.g = a("maxCount", "maxCount", b);
            this.h = a("availableMore", "availableMore", b);
            this.i = a(Action.NAME_ATTRIBUTE, Action.NAME_ATTRIBUTE, b);
            this.j = a("description", "description", b);
            this.k = a("sizeMeasurement", "sizeMeasurement", b);
            this.l = a("sizeValue", "sizeValue", b);
            this.m = a("doughTypeId", "doughTypeId", b);
            this.n = a("doughTypeName", "doughTypeName", b);
            this.o = a("sizeGroupId", "sizeGroupId", b);
            this.p = a("sizeGroupName", "sizeGroupName", b);
            this.q = a(ElementGenerator.TYPE_IMAGE, ElementGenerator.TYPE_IMAGE, b);
            this.r = a("category", "category", b);
            this.s = a("customizationEntity", "customizationEntity", b);
            this.t = a("pizzaHalves", "pizzaHalves", b);
            this.u = a("cartComboProducts", "cartComboProducts", b);
            this.v = a("errorCode", "errorCode", b);
            this.w = a("isGift", "isGift", b);
            this.x = a("price", "price", b);
            this.y = a(BonusActionEntity.ORDER, BonusActionEntity.ORDER, b);
            this.z = a("shoppingItemId", "shoppingItemId", b);
            this.A = a(ShoppingInfoEntity.FIELD_PRODUCT_ID, ShoppingInfoEntity.FIELD_PRODUCT_ID, b);
            this.B = a("discount", "discount", b);
            this.C = a("totalPrice", "totalPrice", b);
            this.D = a("isEditable", "isEditable", b);
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
            aVar2.x = aVar.x;
            aVar2.y = aVar.y;
            aVar2.z = aVar.z;
            aVar2.A = aVar.A;
            aVar2.B = aVar.B;
            aVar2.C = aVar.C;
            aVar2.D = aVar.D;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy() {
        this.c.p();
    }

    public static CartItemEntity c(d0 d0Var, a aVar, CartItemEntity cartItemEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(cartItemEntity);
        if (r89Var != null) {
            return (CartItemEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(CartItemEntity.class), set);
        osObjectBuilder.E0(aVar.e, cartItemEntity.realmGet$id());
        osObjectBuilder.o0(aVar.f, Integer.valueOf(cartItemEntity.realmGet$count()));
        osObjectBuilder.o0(aVar.g, Integer.valueOf(cartItemEntity.realmGet$maxCount()));
        osObjectBuilder.o0(aVar.h, Integer.valueOf(cartItemEntity.realmGet$availableMore()));
        osObjectBuilder.E0(aVar.i, cartItemEntity.realmGet$name());
        osObjectBuilder.E0(aVar.j, cartItemEntity.realmGet$description());
        osObjectBuilder.o0(aVar.k, Integer.valueOf(cartItemEntity.realmGet$sizeMeasurement()));
        osObjectBuilder.n0(aVar.l, Float.valueOf(cartItemEntity.realmGet$sizeValue()));
        osObjectBuilder.o0(aVar.m, Integer.valueOf(cartItemEntity.realmGet$doughTypeId()));
        osObjectBuilder.E0(aVar.n, cartItemEntity.realmGet$doughTypeName());
        osObjectBuilder.o0(aVar.o, Integer.valueOf(cartItemEntity.realmGet$sizeGroupId()));
        osObjectBuilder.E0(aVar.p, cartItemEntity.realmGet$sizeGroupName());
        osObjectBuilder.E0(aVar.r, cartItemEntity.realmGet$category());
        osObjectBuilder.o0(aVar.v, Integer.valueOf(cartItemEntity.realmGet$errorCode()));
        osObjectBuilder.j0(aVar.w, Boolean.valueOf(cartItemEntity.realmGet$isGift()));
        osObjectBuilder.l0(aVar.x, Double.valueOf(cartItemEntity.realmGet$price()));
        osObjectBuilder.o0(aVar.y, Integer.valueOf(cartItemEntity.realmGet$order()));
        osObjectBuilder.E0(aVar.z, cartItemEntity.realmGet$shoppingItemId());
        osObjectBuilder.E0(aVar.A, cartItemEntity.realmGet$productId());
        osObjectBuilder.l0(aVar.C, Double.valueOf(cartItemEntity.realmGet$totalPrice()));
        osObjectBuilder.j0(aVar.D, Boolean.valueOf(cartItemEntity.realmGet$isEditable()));
        com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(cartItemEntity, j);
        ImageEntity realmGet$image = cartItemEntity.realmGet$image();
        if (realmGet$image == null) {
            j.realmSet$image(null);
        } else {
            ImageEntity imageEntity = (ImageEntity) map.get(realmGet$image);
            if (imageEntity != null) {
                j.realmSet$image(imageEntity);
            } else {
                j.realmSet$image(com_dodopizza_persistence_entity_ImageEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_ImageEntityRealmProxy.a) d0Var.u().e(ImageEntity.class), realmGet$image, z, map, set));
            }
        }
        CustomizationEntity realmGet$customizationEntity = cartItemEntity.realmGet$customizationEntity();
        if (realmGet$customizationEntity == null) {
            j.realmSet$customizationEntity(null);
        } else {
            CustomizationEntity customizationEntity = (CustomizationEntity) map.get(realmGet$customizationEntity);
            if (customizationEntity != null) {
                j.realmSet$customizationEntity(customizationEntity);
            } else {
                j.realmSet$customizationEntity(com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.a) d0Var.u().e(CustomizationEntity.class), realmGet$customizationEntity, z, map, set));
            }
        }
        PizzaHalvesEntity realmGet$pizzaHalves = cartItemEntity.realmGet$pizzaHalves();
        if (realmGet$pizzaHalves == null) {
            j.realmSet$pizzaHalves(null);
        } else {
            PizzaHalvesEntity pizzaHalvesEntity = (PizzaHalvesEntity) map.get(realmGet$pizzaHalves);
            if (pizzaHalvesEntity != null) {
                j.realmSet$pizzaHalves(pizzaHalvesEntity);
            } else {
                j.realmSet$pizzaHalves(com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy.a) d0Var.u().e(PizzaHalvesEntity.class), realmGet$pizzaHalves, z, map, set));
            }
        }
        k0<CartComboSlotProductEntity> realmGet$cartComboProducts = cartItemEntity.realmGet$cartComboProducts();
        if (realmGet$cartComboProducts != null) {
            k0<CartComboSlotProductEntity> realmGet$cartComboProducts2 = j.realmGet$cartComboProducts();
            realmGet$cartComboProducts2.clear();
            for (int i = 0; i < realmGet$cartComboProducts.size(); i++) {
                CartComboSlotProductEntity cartComboSlotProductEntity = realmGet$cartComboProducts.get(i);
                CartComboSlotProductEntity cartComboSlotProductEntity2 = (CartComboSlotProductEntity) map.get(cartComboSlotProductEntity);
                if (cartComboSlotProductEntity2 != null) {
                    realmGet$cartComboProducts2.add(cartComboSlotProductEntity2);
                } else {
                    realmGet$cartComboProducts2.add(com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.a) d0Var.u().e(CartComboSlotProductEntity.class), cartComboSlotProductEntity, z, map, set));
                }
            }
        }
        DiscountEntity realmGet$discount = cartItemEntity.realmGet$discount();
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
    public static com.dodopizza.persistence.entity.cart.CartItemEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.a r9, com.dodopizza.persistence.entity.cart.CartItemEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.cart.CartItemEntity r1 = (com.dodopizza.persistence.entity.cart.CartItemEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.cart.CartItemEntity> r2 = com.dodopizza.persistence.entity.cart.CartItemEntity.class
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
            io.realm.com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.cart.CartItemEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.cart.CartItemEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy$a, com.dodopizza.persistence.entity.cart.CartItemEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.cart.CartItemEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static CartItemEntity f(CartItemEntity cartItemEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        CartItemEntity cartItemEntity2;
        if (i > i2 || cartItemEntity == null) {
            return null;
        }
        r89.a<o89> aVar = map.get(cartItemEntity);
        if (aVar == null) {
            cartItemEntity2 = new CartItemEntity();
            map.put(cartItemEntity, new r89.a<>(i, cartItemEntity2));
        } else if (i >= aVar.a) {
            return (CartItemEntity) aVar.b;
        } else {
            aVar.a = i;
            cartItemEntity2 = (CartItemEntity) aVar.b;
        }
        d0 d0Var = (d0) ((r89) cartItemEntity).a().f();
        cartItemEntity2.realmSet$id(cartItemEntity.realmGet$id());
        cartItemEntity2.realmSet$count(cartItemEntity.realmGet$count());
        cartItemEntity2.realmSet$maxCount(cartItemEntity.realmGet$maxCount());
        cartItemEntity2.realmSet$availableMore(cartItemEntity.realmGet$availableMore());
        cartItemEntity2.realmSet$name(cartItemEntity.realmGet$name());
        cartItemEntity2.realmSet$description(cartItemEntity.realmGet$description());
        cartItemEntity2.realmSet$sizeMeasurement(cartItemEntity.realmGet$sizeMeasurement());
        cartItemEntity2.realmSet$sizeValue(cartItemEntity.realmGet$sizeValue());
        cartItemEntity2.realmSet$doughTypeId(cartItemEntity.realmGet$doughTypeId());
        cartItemEntity2.realmSet$doughTypeName(cartItemEntity.realmGet$doughTypeName());
        cartItemEntity2.realmSet$sizeGroupId(cartItemEntity.realmGet$sizeGroupId());
        cartItemEntity2.realmSet$sizeGroupName(cartItemEntity.realmGet$sizeGroupName());
        int i3 = i + 1;
        cartItemEntity2.realmSet$image(com_dodopizza_persistence_entity_ImageEntityRealmProxy.f(cartItemEntity.realmGet$image(), i3, i2, map));
        cartItemEntity2.realmSet$category(cartItemEntity.realmGet$category());
        cartItemEntity2.realmSet$customizationEntity(com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.f(cartItemEntity.realmGet$customizationEntity(), i3, i2, map));
        cartItemEntity2.realmSet$pizzaHalves(com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy.f(cartItemEntity.realmGet$pizzaHalves(), i3, i2, map));
        if (i == i2) {
            cartItemEntity2.realmSet$cartComboProducts(null);
        } else {
            k0<CartComboSlotProductEntity> realmGet$cartComboProducts = cartItemEntity.realmGet$cartComboProducts();
            k0<CartComboSlotProductEntity> k0Var = new k0<>();
            cartItemEntity2.realmSet$cartComboProducts(k0Var);
            int size = realmGet$cartComboProducts.size();
            for (int i4 = 0; i4 < size; i4++) {
                k0Var.add(com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.f(realmGet$cartComboProducts.get(i4), i3, i2, map));
            }
        }
        cartItemEntity2.realmSet$errorCode(cartItemEntity.realmGet$errorCode());
        cartItemEntity2.realmSet$isGift(cartItemEntity.realmGet$isGift());
        cartItemEntity2.realmSet$price(cartItemEntity.realmGet$price());
        cartItemEntity2.realmSet$order(cartItemEntity.realmGet$order());
        cartItemEntity2.realmSet$shoppingItemId(cartItemEntity.realmGet$shoppingItemId());
        cartItemEntity2.realmSet$productId(cartItemEntity.realmGet$productId());
        cartItemEntity2.realmSet$discount(com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy.f(cartItemEntity.realmGet$discount(), i3, i2, map));
        cartItemEntity2.realmSet$totalPrice(cartItemEntity.realmGet$totalPrice());
        cartItemEntity2.realmSet$isEditable(cartItemEntity.realmGet$isEditable());
        return cartItemEntity2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "CartItemEntity", false, 26, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.b("", "count", realmFieldType2, false, false, true);
        bVar.b("", "maxCount", realmFieldType2, false, false, true);
        bVar.b("", "availableMore", realmFieldType2, false, false, true);
        bVar.b("", Action.NAME_ATTRIBUTE, realmFieldType, false, false, true);
        bVar.b("", "description", realmFieldType, false, false, true);
        bVar.b("", "sizeMeasurement", realmFieldType2, false, false, true);
        bVar.b("", "sizeValue", RealmFieldType.FLOAT, false, false, true);
        bVar.b("", "doughTypeId", realmFieldType2, false, false, true);
        bVar.b("", "doughTypeName", realmFieldType, false, false, false);
        bVar.b("", "sizeGroupId", realmFieldType2, false, false, true);
        bVar.b("", "sizeGroupName", realmFieldType, false, false, false);
        RealmFieldType realmFieldType3 = RealmFieldType.OBJECT;
        bVar.a("", ElementGenerator.TYPE_IMAGE, realmFieldType3, "ImageEntity");
        bVar.b("", "category", realmFieldType, false, false, true);
        bVar.a("", "customizationEntity", realmFieldType3, "CustomizationEntity");
        bVar.a("", "pizzaHalves", realmFieldType3, "PizzaHalvesEntity");
        bVar.a("", "cartComboProducts", RealmFieldType.LIST, "CartComboSlotProductEntity");
        bVar.b("", "errorCode", realmFieldType2, false, false, true);
        RealmFieldType realmFieldType4 = RealmFieldType.BOOLEAN;
        bVar.b("", "isGift", realmFieldType4, false, false, true);
        RealmFieldType realmFieldType5 = RealmFieldType.DOUBLE;
        bVar.b("", "price", realmFieldType5, false, false, true);
        bVar.b("", BonusActionEntity.ORDER, realmFieldType2, false, false, true);
        bVar.b("", "shoppingItemId", realmFieldType, false, false, true);
        bVar.b("", ShoppingInfoEntity.FIELD_PRODUCT_ID, realmFieldType, false, false, false);
        bVar.a("", "discount", realmFieldType3, "DiscountEntity");
        bVar.b("", "totalPrice", realmFieldType5, false, false, true);
        bVar.b("", "isEditable", realmFieldType4, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return e;
    }

    public static long i(d0 d0Var, CartItemEntity cartItemEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        long j;
        if ((cartItemEntity instanceof r89) && !n0.isFrozen(cartItemEntity)) {
            r89 r89Var = (r89) cartItemEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(CartItemEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(CartItemEntity.class);
        long j2 = aVar.e;
        String realmGet$id = cartItemEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j2, realmGet$id);
        }
        long j3 = nativeFindFirstString;
        map.put(cartItemEntity, Long.valueOf(j3));
        Table.nativeSetLong(nativePtr, aVar.f, j3, cartItemEntity.realmGet$count(), false);
        Table.nativeSetLong(nativePtr, aVar.g, j3, cartItemEntity.realmGet$maxCount(), false);
        Table.nativeSetLong(nativePtr, aVar.h, j3, cartItemEntity.realmGet$availableMore(), false);
        String realmGet$name = cartItemEntity.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, aVar.i, j3, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.i, j3, false);
        }
        String realmGet$description = cartItemEntity.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, aVar.j, j3, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.j, j3, false);
        }
        Table.nativeSetLong(nativePtr, aVar.k, j3, cartItemEntity.realmGet$sizeMeasurement(), false);
        Table.nativeSetFloat(nativePtr, aVar.l, j3, cartItemEntity.realmGet$sizeValue(), false);
        Table.nativeSetLong(nativePtr, aVar.m, j3, cartItemEntity.realmGet$doughTypeId(), false);
        String realmGet$doughTypeName = cartItemEntity.realmGet$doughTypeName();
        if (realmGet$doughTypeName != null) {
            Table.nativeSetString(nativePtr, aVar.n, j3, realmGet$doughTypeName, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.n, j3, false);
        }
        Table.nativeSetLong(nativePtr, aVar.o, j3, cartItemEntity.realmGet$sizeGroupId(), false);
        String realmGet$sizeGroupName = cartItemEntity.realmGet$sizeGroupName();
        if (realmGet$sizeGroupName != null) {
            Table.nativeSetString(nativePtr, aVar.p, j3, realmGet$sizeGroupName, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.p, j3, false);
        }
        ImageEntity realmGet$image = cartItemEntity.realmGet$image();
        if (realmGet$image != null) {
            Long l = map.get(realmGet$image);
            if (l == null) {
                l = Long.valueOf(com_dodopizza_persistence_entity_ImageEntityRealmProxy.i(d0Var, realmGet$image, map));
            }
            Table.nativeSetLink(nativePtr, aVar.q, j3, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.q, j3);
        }
        String realmGet$category = cartItemEntity.realmGet$category();
        if (realmGet$category != null) {
            Table.nativeSetString(nativePtr, aVar.r, j3, realmGet$category, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.r, j3, false);
        }
        CustomizationEntity realmGet$customizationEntity = cartItemEntity.realmGet$customizationEntity();
        if (realmGet$customizationEntity != null) {
            Long l2 = map.get(realmGet$customizationEntity);
            if (l2 == null) {
                l2 = Long.valueOf(com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.i(d0Var, realmGet$customizationEntity, map));
            }
            Table.nativeSetLink(nativePtr, aVar.s, j3, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.s, j3);
        }
        PizzaHalvesEntity realmGet$pizzaHalves = cartItemEntity.realmGet$pizzaHalves();
        if (realmGet$pizzaHalves != null) {
            Long l3 = map.get(realmGet$pizzaHalves);
            if (l3 == null) {
                l3 = Long.valueOf(com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy.i(d0Var, realmGet$pizzaHalves, map));
            }
            Table.nativeSetLink(nativePtr, aVar.t, j3, l3.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.t, j3);
        }
        long j4 = j3;
        OsList osList = new OsList(I0.r(j4), aVar.u);
        k0<CartComboSlotProductEntity> realmGet$cartComboProducts = cartItemEntity.realmGet$cartComboProducts();
        if (realmGet$cartComboProducts != null && realmGet$cartComboProducts.size() == osList.X()) {
            int size = realmGet$cartComboProducts.size();
            int i = 0;
            while (i < size) {
                CartComboSlotProductEntity cartComboSlotProductEntity = realmGet$cartComboProducts.get(i);
                Long l4 = map.get(cartComboSlotProductEntity);
                if (l4 == null) {
                    l4 = Long.valueOf(com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.i(d0Var, cartComboSlotProductEntity, map));
                }
                osList.U(i, l4.longValue());
                i++;
                j4 = j4;
            }
            j = j4;
        } else {
            j = j4;
            osList.J();
            if (realmGet$cartComboProducts != null) {
                Iterator<CartComboSlotProductEntity> it = realmGet$cartComboProducts.iterator();
                while (it.hasNext()) {
                    CartComboSlotProductEntity next = it.next();
                    Long l5 = map.get(next);
                    if (l5 == null) {
                        l5 = Long.valueOf(com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.i(d0Var, next, map));
                    }
                    osList.k(l5.longValue());
                }
            }
        }
        long j5 = j;
        Table.nativeSetLong(nativePtr, aVar.v, j, cartItemEntity.realmGet$errorCode(), false);
        Table.nativeSetBoolean(nativePtr, aVar.w, j5, cartItemEntity.realmGet$isGift(), false);
        Table.nativeSetDouble(nativePtr, aVar.x, j5, cartItemEntity.realmGet$price(), false);
        Table.nativeSetLong(nativePtr, aVar.y, j5, cartItemEntity.realmGet$order(), false);
        String realmGet$shoppingItemId = cartItemEntity.realmGet$shoppingItemId();
        if (realmGet$shoppingItemId != null) {
            Table.nativeSetString(nativePtr, aVar.z, j5, realmGet$shoppingItemId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.z, j5, false);
        }
        String realmGet$productId = cartItemEntity.realmGet$productId();
        if (realmGet$productId != null) {
            Table.nativeSetString(nativePtr, aVar.A, j5, realmGet$productId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.A, j5, false);
        }
        DiscountEntity realmGet$discount = cartItemEntity.realmGet$discount();
        if (realmGet$discount != null) {
            Long l6 = map.get(realmGet$discount);
            if (l6 == null) {
                l6 = Long.valueOf(com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy.i(d0Var, realmGet$discount, map));
            }
            Table.nativeSetLink(nativePtr, aVar.B, j5, l6.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.B, j5);
        }
        Table.nativeSetDouble(nativePtr, aVar.C, j5, cartItemEntity.realmGet$totalPrice(), false);
        Table.nativeSetBoolean(nativePtr, aVar.D, j5, cartItemEntity.realmGet$isEditable(), false);
        return j5;
    }

    static com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(CartItemEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy com_dodopizza_persistence_entity_cart_cartitementityrealmproxy = new com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_cart_cartitementityrealmproxy;
    }

    static CartItemEntity k(d0 d0Var, a aVar, CartItemEntity cartItemEntity, CartItemEntity cartItemEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(CartItemEntity.class), set);
        osObjectBuilder.E0(aVar.e, cartItemEntity2.realmGet$id());
        osObjectBuilder.o0(aVar.f, Integer.valueOf(cartItemEntity2.realmGet$count()));
        osObjectBuilder.o0(aVar.g, Integer.valueOf(cartItemEntity2.realmGet$maxCount()));
        osObjectBuilder.o0(aVar.h, Integer.valueOf(cartItemEntity2.realmGet$availableMore()));
        osObjectBuilder.E0(aVar.i, cartItemEntity2.realmGet$name());
        osObjectBuilder.E0(aVar.j, cartItemEntity2.realmGet$description());
        osObjectBuilder.o0(aVar.k, Integer.valueOf(cartItemEntity2.realmGet$sizeMeasurement()));
        osObjectBuilder.n0(aVar.l, Float.valueOf(cartItemEntity2.realmGet$sizeValue()));
        osObjectBuilder.o0(aVar.m, Integer.valueOf(cartItemEntity2.realmGet$doughTypeId()));
        osObjectBuilder.E0(aVar.n, cartItemEntity2.realmGet$doughTypeName());
        osObjectBuilder.o0(aVar.o, Integer.valueOf(cartItemEntity2.realmGet$sizeGroupId()));
        osObjectBuilder.E0(aVar.p, cartItemEntity2.realmGet$sizeGroupName());
        ImageEntity realmGet$image = cartItemEntity2.realmGet$image();
        if (realmGet$image == null) {
            osObjectBuilder.r0(aVar.q);
        } else {
            ImageEntity imageEntity = (ImageEntity) map.get(realmGet$image);
            if (imageEntity != null) {
                osObjectBuilder.x0(aVar.q, imageEntity);
            } else {
                osObjectBuilder.x0(aVar.q, com_dodopizza_persistence_entity_ImageEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_ImageEntityRealmProxy.a) d0Var.u().e(ImageEntity.class), realmGet$image, true, map, set));
            }
        }
        osObjectBuilder.E0(aVar.r, cartItemEntity2.realmGet$category());
        CustomizationEntity realmGet$customizationEntity = cartItemEntity2.realmGet$customizationEntity();
        if (realmGet$customizationEntity == null) {
            osObjectBuilder.r0(aVar.s);
        } else {
            CustomizationEntity customizationEntity = (CustomizationEntity) map.get(realmGet$customizationEntity);
            if (customizationEntity != null) {
                osObjectBuilder.x0(aVar.s, customizationEntity);
            } else {
                osObjectBuilder.x0(aVar.s, com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.a) d0Var.u().e(CustomizationEntity.class), realmGet$customizationEntity, true, map, set));
            }
        }
        PizzaHalvesEntity realmGet$pizzaHalves = cartItemEntity2.realmGet$pizzaHalves();
        if (realmGet$pizzaHalves == null) {
            osObjectBuilder.r0(aVar.t);
        } else {
            PizzaHalvesEntity pizzaHalvesEntity = (PizzaHalvesEntity) map.get(realmGet$pizzaHalves);
            if (pizzaHalvesEntity != null) {
                osObjectBuilder.x0(aVar.t, pizzaHalvesEntity);
            } else {
                osObjectBuilder.x0(aVar.t, com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy.a) d0Var.u().e(PizzaHalvesEntity.class), realmGet$pizzaHalves, true, map, set));
            }
        }
        k0<CartComboSlotProductEntity> realmGet$cartComboProducts = cartItemEntity2.realmGet$cartComboProducts();
        if (realmGet$cartComboProducts != null) {
            k0 k0Var = new k0();
            for (int i = 0; i < realmGet$cartComboProducts.size(); i++) {
                CartComboSlotProductEntity cartComboSlotProductEntity = realmGet$cartComboProducts.get(i);
                CartComboSlotProductEntity cartComboSlotProductEntity2 = (CartComboSlotProductEntity) map.get(cartComboSlotProductEntity);
                if (cartComboSlotProductEntity2 != null) {
                    k0Var.add(cartComboSlotProductEntity2);
                } else {
                    k0Var.add(com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.a) d0Var.u().e(CartComboSlotProductEntity.class), cartComboSlotProductEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.u, k0Var);
        } else {
            osObjectBuilder.z0(aVar.u, new k0());
        }
        osObjectBuilder.o0(aVar.v, Integer.valueOf(cartItemEntity2.realmGet$errorCode()));
        osObjectBuilder.j0(aVar.w, Boolean.valueOf(cartItemEntity2.realmGet$isGift()));
        osObjectBuilder.l0(aVar.x, Double.valueOf(cartItemEntity2.realmGet$price()));
        osObjectBuilder.o0(aVar.y, Integer.valueOf(cartItemEntity2.realmGet$order()));
        osObjectBuilder.E0(aVar.z, cartItemEntity2.realmGet$shoppingItemId());
        osObjectBuilder.E0(aVar.A, cartItemEntity2.realmGet$productId());
        DiscountEntity realmGet$discount = cartItemEntity2.realmGet$discount();
        if (realmGet$discount == null) {
            osObjectBuilder.r0(aVar.B);
        } else {
            DiscountEntity discountEntity = (DiscountEntity) map.get(realmGet$discount);
            if (discountEntity != null) {
                osObjectBuilder.x0(aVar.B, discountEntity);
            } else {
                osObjectBuilder.x0(aVar.B, com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy.a) d0Var.u().e(DiscountEntity.class), realmGet$discount, true, map, set));
            }
        }
        osObjectBuilder.l0(aVar.C, Double.valueOf(cartItemEntity2.realmGet$totalPrice()));
        osObjectBuilder.j0(aVar.D, Boolean.valueOf(cartItemEntity2.realmGet$isEditable()));
        osObjectBuilder.K0();
        return cartItemEntity;
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
        c0<CartItemEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy com_dodopizza_persistence_entity_cart_cartitementityrealmproxy = (com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_cart_cartitementityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_cart_cartitementityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_cart_cartitementityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public int realmGet$availableMore() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public k0<CartComboSlotProductEntity> realmGet$cartComboProducts() {
        this.c.f().c();
        k0<CartComboSlotProductEntity> k0Var = this.d;
        if (k0Var != null) {
            return k0Var;
        }
        k0<CartComboSlotProductEntity> k0Var2 = new k0<>(CartComboSlotProductEntity.class, this.c.g().f0(this.b.u), this.c.f());
        this.d = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public String realmGet$category() {
        this.c.f().c();
        return this.c.g().p0(this.b.r);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public int realmGet$count() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public CustomizationEntity realmGet$customizationEntity() {
        this.c.f().c();
        if (this.c.g().o0(this.b.s)) {
            return null;
        }
        return (CustomizationEntity) this.c.f().o(CustomizationEntity.class, this.c.g().L(this.b.s), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public String realmGet$description() {
        this.c.f().c();
        return this.c.g().p0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public DiscountEntity realmGet$discount() {
        this.c.f().c();
        if (this.c.g().o0(this.b.B)) {
            return null;
        }
        return (DiscountEntity) this.c.f().o(DiscountEntity.class, this.c.g().L(this.b.B), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public int realmGet$doughTypeId() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.m);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public String realmGet$doughTypeName() {
        this.c.f().c();
        return this.c.g().p0(this.b.n);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public int realmGet$errorCode() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.v);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public ImageEntity realmGet$image() {
        this.c.f().c();
        if (this.c.g().o0(this.b.q)) {
            return null;
        }
        return (ImageEntity) this.c.f().o(ImageEntity.class, this.c.g().L(this.b.q), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public boolean realmGet$isEditable() {
        this.c.f().c();
        return this.c.g().b0(this.b.D);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public boolean realmGet$isGift() {
        this.c.f().c();
        return this.c.g().b0(this.b.w);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public int realmGet$maxCount() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public String realmGet$name() {
        this.c.f().c();
        return this.c.g().p0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public int realmGet$order() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.y);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public PizzaHalvesEntity realmGet$pizzaHalves() {
        this.c.f().c();
        if (this.c.g().o0(this.b.t)) {
            return null;
        }
        return (PizzaHalvesEntity) this.c.f().o(PizzaHalvesEntity.class, this.c.g().L(this.b.t), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public double realmGet$price() {
        this.c.f().c();
        return this.c.g().K(this.b.x);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public String realmGet$productId() {
        this.c.f().c();
        return this.c.g().p0(this.b.A);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public String realmGet$shoppingItemId() {
        this.c.f().c();
        return this.c.g().p0(this.b.z);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public int realmGet$sizeGroupId() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.o);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public String realmGet$sizeGroupName() {
        this.c.f().c();
        return this.c.g().p0(this.b.p);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public int realmGet$sizeMeasurement() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public float realmGet$sizeValue() {
        this.c.f().c();
        return this.c.g().M(this.b.l);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public double realmGet$totalPrice() {
        this.c.f().c();
        return this.c.g().K(this.b.C);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$availableMore(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.h, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.h, i);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$cartComboProducts(k0<CartComboSlotProductEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("cartComboProducts")) {
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
        OsList f0 = this.c.g().f0(this.b.u);
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

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$category(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.r, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'category' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.r, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'category' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$count(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.f, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.f, i);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$customizationEntity(CustomizationEntity customizationEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("customizationEntity")) {
                return;
            }
            if (customizationEntity != null && !n0.isManaged(customizationEntity)) {
                customizationEntity = (CustomizationEntity) d0Var.j0(customizationEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (customizationEntity == null) {
                g.l0(this.b.s);
                return;
            }
            this.c.c(customizationEntity);
            g.o().B(this.b.s, g.E0(), ((r89) customizationEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (customizationEntity == null) {
            this.c.g().l0(this.b.s);
            return;
        }
        this.c.c(customizationEntity);
        this.c.g().s(this.b.s, ((r89) customizationEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$description(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.j, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'description' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.j, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'description' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
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
                g.l0(this.b.B);
                return;
            }
            this.c.c(discountEntity);
            g.o().B(this.b.B, g.E0(), ((r89) discountEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (discountEntity == null) {
            this.c.g().l0(this.b.B);
            return;
        }
        this.c.c(discountEntity);
        this.c.g().s(this.b.B, ((r89) discountEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$doughTypeId(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.m, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.m, i);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$doughTypeName(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.n, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.n, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.n);
        } else {
            this.c.g().i(this.b.n, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$errorCode(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.v, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.v, i);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$image(ImageEntity imageEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains(ElementGenerator.TYPE_IMAGE)) {
                return;
            }
            if (imageEntity != null && !n0.isManaged(imageEntity)) {
                imageEntity = (ImageEntity) d0Var.f0(imageEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (imageEntity == null) {
                g.l0(this.b.q);
                return;
            }
            this.c.c(imageEntity);
            g.o().B(this.b.q, g.E0(), ((r89) imageEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (imageEntity == null) {
            this.c.g().l0(this.b.q);
            return;
        }
        this.c.c(imageEntity);
        this.c.g().s(this.b.q, ((r89) imageEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$isEditable(boolean z) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().y(this.b.D, g.E0(), z, true);
            return;
        }
        this.c.f().c();
        this.c.g().Q(this.b.D, z);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$isGift(boolean z) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().y(this.b.w, g.E0(), z, true);
            return;
        }
        this.c.f().c();
        this.c.g().Q(this.b.w, z);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$maxCount(int i) {
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

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$name(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.i, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.i, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$order(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.y, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.y, i);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$pizzaHalves(PizzaHalvesEntity pizzaHalvesEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("pizzaHalves")) {
                return;
            }
            if (pizzaHalvesEntity != null && !n0.isManaged(pizzaHalvesEntity)) {
                pizzaHalvesEntity = (PizzaHalvesEntity) d0Var.j0(pizzaHalvesEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (pizzaHalvesEntity == null) {
                g.l0(this.b.t);
                return;
            }
            this.c.c(pizzaHalvesEntity);
            g.o().B(this.b.t, g.E0(), ((r89) pizzaHalvesEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (pizzaHalvesEntity == null) {
            this.c.g().l0(this.b.t);
            return;
        }
        this.c.c(pizzaHalvesEntity);
        this.c.g().s(this.b.t, ((r89) pizzaHalvesEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$price(double d) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.x, g.E0(), d, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.x, d);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$productId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.A, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.A, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.A);
        } else {
            this.c.g().i(this.b.A, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$shoppingItemId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.z, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'shoppingItemId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.z, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'shoppingItemId' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$sizeGroupId(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.o, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.o, i);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$sizeGroupName(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.p, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.p, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.p);
        } else {
            this.c.g().i(this.b.p, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$sizeMeasurement(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.k, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.k, i);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$sizeValue(float f) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().A(this.b.l, g.E0(), f, true);
            return;
        }
        this.c.f().c();
        this.c.g().k(this.b.l, f);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartItemEntity, defpackage.mfc
    public void realmSet$totalPrice(double d) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.C, g.E0(), d, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.C, d);
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CartItemEntity = proxy[");
        sb.append("{id:");
        String str8 = "null";
        if (realmGet$id() == null) {
            str = "null";
        } else {
            str = realmGet$id();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{count:");
        sb.append(realmGet$count());
        sb.append("}");
        sb.append(",");
        sb.append("{maxCount:");
        sb.append(realmGet$maxCount());
        sb.append("}");
        sb.append(",");
        sb.append("{availableMore:");
        sb.append(realmGet$availableMore());
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(realmGet$name());
        sb.append("}");
        sb.append(",");
        sb.append("{description:");
        sb.append(realmGet$description());
        sb.append("}");
        sb.append(",");
        sb.append("{sizeMeasurement:");
        sb.append(realmGet$sizeMeasurement());
        sb.append("}");
        sb.append(",");
        sb.append("{sizeValue:");
        sb.append(realmGet$sizeValue());
        sb.append("}");
        sb.append(",");
        sb.append("{doughTypeId:");
        sb.append(realmGet$doughTypeId());
        sb.append("}");
        sb.append(",");
        sb.append("{doughTypeName:");
        if (realmGet$doughTypeName() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$doughTypeName();
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{sizeGroupId:");
        sb.append(realmGet$sizeGroupId());
        sb.append("}");
        sb.append(",");
        sb.append("{sizeGroupName:");
        if (realmGet$sizeGroupName() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$sizeGroupName();
        }
        sb.append(str3);
        sb.append("}");
        sb.append(",");
        sb.append("{image:");
        if (realmGet$image() == null) {
            str4 = "null";
        } else {
            str4 = "ImageEntity";
        }
        sb.append(str4);
        sb.append("}");
        sb.append(",");
        sb.append("{category:");
        sb.append(realmGet$category());
        sb.append("}");
        sb.append(",");
        sb.append("{customizationEntity:");
        if (realmGet$customizationEntity() == null) {
            str5 = "null";
        } else {
            str5 = "CustomizationEntity";
        }
        sb.append(str5);
        sb.append("}");
        sb.append(",");
        sb.append("{pizzaHalves:");
        if (realmGet$pizzaHalves() == null) {
            str6 = "null";
        } else {
            str6 = "PizzaHalvesEntity";
        }
        sb.append(str6);
        sb.append("}");
        sb.append(",");
        sb.append("{cartComboProducts:");
        sb.append("RealmList<CartComboSlotProductEntity>[");
        sb.append(realmGet$cartComboProducts().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{errorCode:");
        sb.append(realmGet$errorCode());
        sb.append("}");
        sb.append(",");
        sb.append("{isGift:");
        sb.append(realmGet$isGift());
        sb.append("}");
        sb.append(",");
        sb.append("{price:");
        sb.append(realmGet$price());
        sb.append("}");
        sb.append(",");
        sb.append("{order:");
        sb.append(realmGet$order());
        sb.append("}");
        sb.append(",");
        sb.append("{shoppingItemId:");
        sb.append(realmGet$shoppingItemId());
        sb.append("}");
        sb.append(",");
        sb.append("{productId:");
        if (realmGet$productId() == null) {
            str7 = "null";
        } else {
            str7 = realmGet$productId();
        }
        sb.append(str7);
        sb.append("}");
        sb.append(",");
        sb.append("{discount:");
        if (realmGet$discount() != null) {
            str8 = "DiscountEntity";
        }
        sb.append(str8);
        sb.append("}");
        sb.append(",");
        sb.append("{totalPrice:");
        sb.append(realmGet$totalPrice());
        sb.append("}");
        sb.append(",");
        sb.append("{isEditable:");
        sb.append(realmGet$isEditable());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
