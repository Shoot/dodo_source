package io.realm;

import com.dodopizza.persistence.entity.cart.AppliedBonusActionEntity;
import com.dodopizza.persistence.entity.cart.CartItemEntity;
import com.dodopizza.persistence.entity.cart.ShoppingCartEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy;
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
public class com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy extends ShoppingCartEntity implements r89, yfc {
    private static final OsObjectSchemaInfo f = g();
    private a b;
    private c0<ShoppingCartEntity> c;
    private k0<CartItemEntity> d;
    private k0<AppliedBonusActionEntity> e;

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

        a(OsSchemaInfo osSchemaInfo) {
            super(12);
            OsObjectSchemaInfo b = osSchemaInfo.b("ShoppingCartEntity");
            this.e = a("id", "id", b);
            this.f = a("items", "items", b);
            this.g = a("appliedBonusActions", "appliedBonusActions", b);
            this.h = a("saucesCount", "saucesCount", b);
            this.i = a("freeSaucesCount", "freeSaucesCount", b);
            this.j = a("saucesCost", "saucesCost", b);
            this.k = a("rawPrice", "rawPrice", b);
            this.l = a("rawPriceWithoutGoods", "rawPriceWithoutGoods", b);
            this.m = a("discount", "discount", b);
            this.n = a("total", "total", b);
            this.o = a("isReadyToCheckout", "isReadyToCheckout", b);
            this.p = a("orderType", "orderType", b);
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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy() {
        this.c.p();
    }

    public static ShoppingCartEntity c(d0 d0Var, a aVar, ShoppingCartEntity shoppingCartEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(shoppingCartEntity);
        if (r89Var != null) {
            return (ShoppingCartEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(ShoppingCartEntity.class), set);
        osObjectBuilder.E0(aVar.e, shoppingCartEntity.realmGet$id());
        osObjectBuilder.o0(aVar.h, Integer.valueOf(shoppingCartEntity.realmGet$saucesCount()));
        osObjectBuilder.o0(aVar.i, Integer.valueOf(shoppingCartEntity.realmGet$freeSaucesCount()));
        osObjectBuilder.l0(aVar.j, Double.valueOf(shoppingCartEntity.realmGet$saucesCost()));
        osObjectBuilder.l0(aVar.k, Double.valueOf(shoppingCartEntity.realmGet$rawPrice()));
        osObjectBuilder.l0(aVar.l, Double.valueOf(shoppingCartEntity.realmGet$rawPriceWithoutGoods()));
        osObjectBuilder.l0(aVar.m, Double.valueOf(shoppingCartEntity.realmGet$discount()));
        osObjectBuilder.l0(aVar.n, Double.valueOf(shoppingCartEntity.realmGet$total()));
        osObjectBuilder.j0(aVar.o, Boolean.valueOf(shoppingCartEntity.realmGet$isReadyToCheckout()));
        osObjectBuilder.o0(aVar.p, Integer.valueOf(shoppingCartEntity.realmGet$orderType()));
        com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(shoppingCartEntity, j);
        k0<CartItemEntity> realmGet$items = shoppingCartEntity.realmGet$items();
        if (realmGet$items != null) {
            k0<CartItemEntity> realmGet$items2 = j.realmGet$items();
            realmGet$items2.clear();
            for (int i = 0; i < realmGet$items.size(); i++) {
                CartItemEntity cartItemEntity = realmGet$items.get(i);
                CartItemEntity cartItemEntity2 = (CartItemEntity) map.get(cartItemEntity);
                if (cartItemEntity2 != null) {
                    realmGet$items2.add(cartItemEntity2);
                } else {
                    realmGet$items2.add(com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.a) d0Var.u().e(CartItemEntity.class), cartItemEntity, z, map, set));
                }
            }
        }
        k0<AppliedBonusActionEntity> realmGet$appliedBonusActions = shoppingCartEntity.realmGet$appliedBonusActions();
        if (realmGet$appliedBonusActions != null) {
            k0<AppliedBonusActionEntity> realmGet$appliedBonusActions2 = j.realmGet$appliedBonusActions();
            realmGet$appliedBonusActions2.clear();
            for (int i2 = 0; i2 < realmGet$appliedBonusActions.size(); i2++) {
                AppliedBonusActionEntity appliedBonusActionEntity = realmGet$appliedBonusActions.get(i2);
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

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dodopizza.persistence.entity.cart.ShoppingCartEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy.a r9, com.dodopizza.persistence.entity.cart.ShoppingCartEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.cart.ShoppingCartEntity r1 = (com.dodopizza.persistence.entity.cart.ShoppingCartEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.cart.ShoppingCartEntity> r2 = com.dodopizza.persistence.entity.cart.ShoppingCartEntity.class
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
            io.realm.com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.cart.ShoppingCartEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.cart.ShoppingCartEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy$a, com.dodopizza.persistence.entity.cart.ShoppingCartEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.cart.ShoppingCartEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static ShoppingCartEntity f(ShoppingCartEntity shoppingCartEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        ShoppingCartEntity shoppingCartEntity2;
        if (i > i2 || shoppingCartEntity == null) {
            return null;
        }
        r89.a<o89> aVar = map.get(shoppingCartEntity);
        if (aVar == null) {
            shoppingCartEntity2 = new ShoppingCartEntity();
            map.put(shoppingCartEntity, new r89.a<>(i, shoppingCartEntity2));
        } else if (i >= aVar.a) {
            return (ShoppingCartEntity) aVar.b;
        } else {
            aVar.a = i;
            shoppingCartEntity2 = (ShoppingCartEntity) aVar.b;
        }
        d0 d0Var = (d0) ((r89) shoppingCartEntity).a().f();
        shoppingCartEntity2.realmSet$id(shoppingCartEntity.realmGet$id());
        if (i == i2) {
            shoppingCartEntity2.realmSet$items(null);
        } else {
            k0<CartItemEntity> realmGet$items = shoppingCartEntity.realmGet$items();
            k0<CartItemEntity> k0Var = new k0<>();
            shoppingCartEntity2.realmSet$items(k0Var);
            int i3 = i + 1;
            int size = realmGet$items.size();
            for (int i4 = 0; i4 < size; i4++) {
                k0Var.add(com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.f(realmGet$items.get(i4), i3, i2, map));
            }
        }
        if (i == i2) {
            shoppingCartEntity2.realmSet$appliedBonusActions(null);
        } else {
            k0<AppliedBonusActionEntity> realmGet$appliedBonusActions = shoppingCartEntity.realmGet$appliedBonusActions();
            k0<AppliedBonusActionEntity> k0Var2 = new k0<>();
            shoppingCartEntity2.realmSet$appliedBonusActions(k0Var2);
            int i5 = i + 1;
            int size2 = realmGet$appliedBonusActions.size();
            for (int i6 = 0; i6 < size2; i6++) {
                k0Var2.add(com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy.f(realmGet$appliedBonusActions.get(i6), i5, i2, map));
            }
        }
        shoppingCartEntity2.realmSet$saucesCount(shoppingCartEntity.realmGet$saucesCount());
        shoppingCartEntity2.realmSet$freeSaucesCount(shoppingCartEntity.realmGet$freeSaucesCount());
        shoppingCartEntity2.realmSet$saucesCost(shoppingCartEntity.realmGet$saucesCost());
        shoppingCartEntity2.realmSet$rawPrice(shoppingCartEntity.realmGet$rawPrice());
        shoppingCartEntity2.realmSet$rawPriceWithoutGoods(shoppingCartEntity.realmGet$rawPriceWithoutGoods());
        shoppingCartEntity2.realmSet$discount(shoppingCartEntity.realmGet$discount());
        shoppingCartEntity2.realmSet$total(shoppingCartEntity.realmGet$total());
        shoppingCartEntity2.realmSet$isReadyToCheckout(shoppingCartEntity.realmGet$isReadyToCheckout());
        shoppingCartEntity2.realmSet$orderType(shoppingCartEntity.realmGet$orderType());
        return shoppingCartEntity2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "ShoppingCartEntity", false, 12, 0);
        bVar.b("", "id", RealmFieldType.STRING, true, false, false);
        RealmFieldType realmFieldType = RealmFieldType.LIST;
        bVar.a("", "items", realmFieldType, "CartItemEntity");
        bVar.a("", "appliedBonusActions", realmFieldType, "AppliedBonusActionEntity");
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.b("", "saucesCount", realmFieldType2, false, false, true);
        bVar.b("", "freeSaucesCount", realmFieldType2, false, false, true);
        RealmFieldType realmFieldType3 = RealmFieldType.DOUBLE;
        bVar.b("", "saucesCost", realmFieldType3, false, false, true);
        bVar.b("", "rawPrice", realmFieldType3, false, false, true);
        bVar.b("", "rawPriceWithoutGoods", realmFieldType3, false, false, true);
        bVar.b("", "discount", realmFieldType3, false, false, true);
        bVar.b("", "total", realmFieldType3, false, false, true);
        bVar.b("", "isReadyToCheckout", RealmFieldType.BOOLEAN, false, false, true);
        bVar.b("", "orderType", realmFieldType2, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f;
    }

    public static long i(d0 d0Var, ShoppingCartEntity shoppingCartEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        long j;
        long j2;
        if ((shoppingCartEntity instanceof r89) && !n0.isFrozen(shoppingCartEntity)) {
            r89 r89Var = (r89) shoppingCartEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(ShoppingCartEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(ShoppingCartEntity.class);
        long j3 = aVar.e;
        String realmGet$id = shoppingCartEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j3, realmGet$id);
        }
        long j4 = nativeFindFirstString;
        map.put(shoppingCartEntity, Long.valueOf(j4));
        OsList osList = new OsList(I0.r(j4), aVar.f);
        k0<CartItemEntity> realmGet$items = shoppingCartEntity.realmGet$items();
        if (realmGet$items != null && realmGet$items.size() == osList.X()) {
            int size = realmGet$items.size();
            int i = 0;
            while (i < size) {
                CartItemEntity cartItemEntity = realmGet$items.get(i);
                Long l = map.get(cartItemEntity);
                if (l == null) {
                    l = Long.valueOf(com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.i(d0Var, cartItemEntity, map));
                }
                osList.U(i, l.longValue());
                i++;
                size = size;
                j4 = j4;
            }
            j = j4;
        } else {
            j = j4;
            osList.J();
            if (realmGet$items != null) {
                Iterator<CartItemEntity> it = realmGet$items.iterator();
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
        long j5 = j;
        OsList osList2 = new OsList(I0.r(j5), aVar.g);
        k0<AppliedBonusActionEntity> realmGet$appliedBonusActions = shoppingCartEntity.realmGet$appliedBonusActions();
        if (realmGet$appliedBonusActions != null && realmGet$appliedBonusActions.size() == osList2.X()) {
            int size2 = realmGet$appliedBonusActions.size();
            int i2 = 0;
            while (i2 < size2) {
                AppliedBonusActionEntity appliedBonusActionEntity = realmGet$appliedBonusActions.get(i2);
                Long l3 = map.get(appliedBonusActionEntity);
                if (l3 == null) {
                    l3 = Long.valueOf(com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy.i(d0Var, appliedBonusActionEntity, map));
                }
                osList2.U(i2, l3.longValue());
                i2++;
                j5 = j5;
            }
            j2 = j5;
        } else {
            j2 = j5;
            osList2.J();
            if (realmGet$appliedBonusActions != null) {
                Iterator<AppliedBonusActionEntity> it2 = realmGet$appliedBonusActions.iterator();
                while (it2.hasNext()) {
                    AppliedBonusActionEntity next2 = it2.next();
                    Long l4 = map.get(next2);
                    if (l4 == null) {
                        l4 = Long.valueOf(com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy.i(d0Var, next2, map));
                    }
                    osList2.k(l4.longValue());
                }
            }
        }
        long j6 = j2;
        Table.nativeSetLong(nativePtr, aVar.h, j6, shoppingCartEntity.realmGet$saucesCount(), false);
        Table.nativeSetLong(nativePtr, aVar.i, j6, shoppingCartEntity.realmGet$freeSaucesCount(), false);
        Table.nativeSetDouble(nativePtr, aVar.j, j6, shoppingCartEntity.realmGet$saucesCost(), false);
        Table.nativeSetDouble(nativePtr, aVar.k, j6, shoppingCartEntity.realmGet$rawPrice(), false);
        Table.nativeSetDouble(nativePtr, aVar.l, j6, shoppingCartEntity.realmGet$rawPriceWithoutGoods(), false);
        Table.nativeSetDouble(nativePtr, aVar.m, j6, shoppingCartEntity.realmGet$discount(), false);
        Table.nativeSetDouble(nativePtr, aVar.n, j6, shoppingCartEntity.realmGet$total(), false);
        Table.nativeSetBoolean(nativePtr, aVar.o, j6, shoppingCartEntity.realmGet$isReadyToCheckout(), false);
        Table.nativeSetLong(nativePtr, aVar.p, j6, shoppingCartEntity.realmGet$orderType(), false);
        return j6;
    }

    static com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(ShoppingCartEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy com_dodopizza_persistence_entity_cart_shoppingcartentityrealmproxy = new com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_cart_shoppingcartentityrealmproxy;
    }

    static ShoppingCartEntity k(d0 d0Var, a aVar, ShoppingCartEntity shoppingCartEntity, ShoppingCartEntity shoppingCartEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(ShoppingCartEntity.class), set);
        osObjectBuilder.E0(aVar.e, shoppingCartEntity2.realmGet$id());
        k0<CartItemEntity> realmGet$items = shoppingCartEntity2.realmGet$items();
        if (realmGet$items != null) {
            k0 k0Var = new k0();
            for (int i = 0; i < realmGet$items.size(); i++) {
                CartItemEntity cartItemEntity = realmGet$items.get(i);
                CartItemEntity cartItemEntity2 = (CartItemEntity) map.get(cartItemEntity);
                if (cartItemEntity2 != null) {
                    k0Var.add(cartItemEntity2);
                } else {
                    k0Var.add(com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.a) d0Var.u().e(CartItemEntity.class), cartItemEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.f, k0Var);
        } else {
            osObjectBuilder.z0(aVar.f, new k0());
        }
        k0<AppliedBonusActionEntity> realmGet$appliedBonusActions = shoppingCartEntity2.realmGet$appliedBonusActions();
        if (realmGet$appliedBonusActions != null) {
            k0 k0Var2 = new k0();
            for (int i2 = 0; i2 < realmGet$appliedBonusActions.size(); i2++) {
                AppliedBonusActionEntity appliedBonusActionEntity = realmGet$appliedBonusActions.get(i2);
                AppliedBonusActionEntity appliedBonusActionEntity2 = (AppliedBonusActionEntity) map.get(appliedBonusActionEntity);
                if (appliedBonusActionEntity2 != null) {
                    k0Var2.add(appliedBonusActionEntity2);
                } else {
                    k0Var2.add(com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy.a) d0Var.u().e(AppliedBonusActionEntity.class), appliedBonusActionEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.g, k0Var2);
        } else {
            osObjectBuilder.z0(aVar.g, new k0());
        }
        osObjectBuilder.o0(aVar.h, Integer.valueOf(shoppingCartEntity2.realmGet$saucesCount()));
        osObjectBuilder.o0(aVar.i, Integer.valueOf(shoppingCartEntity2.realmGet$freeSaucesCount()));
        osObjectBuilder.l0(aVar.j, Double.valueOf(shoppingCartEntity2.realmGet$saucesCost()));
        osObjectBuilder.l0(aVar.k, Double.valueOf(shoppingCartEntity2.realmGet$rawPrice()));
        osObjectBuilder.l0(aVar.l, Double.valueOf(shoppingCartEntity2.realmGet$rawPriceWithoutGoods()));
        osObjectBuilder.l0(aVar.m, Double.valueOf(shoppingCartEntity2.realmGet$discount()));
        osObjectBuilder.l0(aVar.n, Double.valueOf(shoppingCartEntity2.realmGet$total()));
        osObjectBuilder.j0(aVar.o, Boolean.valueOf(shoppingCartEntity2.realmGet$isReadyToCheckout()));
        osObjectBuilder.o0(aVar.p, Integer.valueOf(shoppingCartEntity2.realmGet$orderType()));
        osObjectBuilder.K0();
        return shoppingCartEntity;
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
        c0<ShoppingCartEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy com_dodopizza_persistence_entity_cart_shoppingcartentityrealmproxy = (com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy) obj;
        io.realm.a f2 = this.c.f();
        io.realm.a f3 = com_dodopizza_persistence_entity_cart_shoppingcartentityrealmproxy.c.f();
        String path = f2.getPath();
        String path2 = f3.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f2.E() != f3.E() || !f2.e.getVersionID().equals(f3.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_cart_shoppingcartentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_cart_shoppingcartentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public k0<AppliedBonusActionEntity> realmGet$appliedBonusActions() {
        this.c.f().c();
        k0<AppliedBonusActionEntity> k0Var = this.e;
        if (k0Var != null) {
            return k0Var;
        }
        k0<AppliedBonusActionEntity> k0Var2 = new k0<>(AppliedBonusActionEntity.class, this.c.g().f0(this.b.g), this.c.f());
        this.e = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public double realmGet$discount() {
        this.c.f().c();
        return this.c.g().K(this.b.m);
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public int realmGet$freeSaucesCount() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public boolean realmGet$isReadyToCheckout() {
        this.c.f().c();
        return this.c.g().b0(this.b.o);
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public k0<CartItemEntity> realmGet$items() {
        this.c.f().c();
        k0<CartItemEntity> k0Var = this.d;
        if (k0Var != null) {
            return k0Var;
        }
        k0<CartItemEntity> k0Var2 = new k0<>(CartItemEntity.class, this.c.g().f0(this.b.f), this.c.f());
        this.d = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public int realmGet$orderType() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.p);
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public double realmGet$rawPrice() {
        this.c.f().c();
        return this.c.g().K(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public double realmGet$rawPriceWithoutGoods() {
        this.c.f().c();
        return this.c.g().K(this.b.l);
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public double realmGet$saucesCost() {
        this.c.f().c();
        return this.c.g().K(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public int realmGet$saucesCount() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public double realmGet$total() {
        this.c.f().c();
        return this.c.g().K(this.b.n);
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
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
        OsList f0 = this.c.g().f0(this.b.g);
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

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public void realmSet$discount(double d) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.m, g.E0(), d, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.m, d);
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public void realmSet$freeSaucesCount(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.i, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.i, i);
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public void realmSet$isReadyToCheckout(boolean z) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().y(this.b.o, g.E0(), z, true);
            return;
        }
        this.c.f().c();
        this.c.g().Q(this.b.o, z);
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public void realmSet$items(k0<CartItemEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("items")) {
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
        OsList f0 = this.c.g().f0(this.b.f);
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

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public void realmSet$orderType(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.p, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.p, i);
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public void realmSet$rawPrice(double d) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.k, g.E0(), d, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.k, d);
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public void realmSet$rawPriceWithoutGoods(double d) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.l, g.E0(), d, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.l, d);
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public void realmSet$saucesCost(double d) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.j, g.E0(), d, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.j, d);
    }

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public void realmSet$saucesCount(int i) {
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

    @Override // com.dodopizza.persistence.entity.cart.ShoppingCartEntity, defpackage.yfc
    public void realmSet$total(double d) {
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

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ShoppingCartEntity = proxy[");
        sb.append("{id:");
        if (realmGet$id() != null) {
            str = realmGet$id();
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{items:");
        sb.append("RealmList<CartItemEntity>[");
        sb.append(realmGet$items().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{appliedBonusActions:");
        sb.append("RealmList<AppliedBonusActionEntity>[");
        sb.append(realmGet$appliedBonusActions().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{saucesCount:");
        sb.append(realmGet$saucesCount());
        sb.append("}");
        sb.append(",");
        sb.append("{freeSaucesCount:");
        sb.append(realmGet$freeSaucesCount());
        sb.append("}");
        sb.append(",");
        sb.append("{saucesCost:");
        sb.append(realmGet$saucesCost());
        sb.append("}");
        sb.append(",");
        sb.append("{rawPrice:");
        sb.append(realmGet$rawPrice());
        sb.append("}");
        sb.append(",");
        sb.append("{rawPriceWithoutGoods:");
        sb.append(realmGet$rawPriceWithoutGoods());
        sb.append("}");
        sb.append(",");
        sb.append("{discount:");
        sb.append(realmGet$discount());
        sb.append("}");
        sb.append(",");
        sb.append("{total:");
        sb.append(realmGet$total());
        sb.append("}");
        sb.append(",");
        sb.append("{isReadyToCheckout:");
        sb.append(realmGet$isReadyToCheckout());
        sb.append("}");
        sb.append(",");
        sb.append("{orderType:");
        sb.append(realmGet$orderType());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
