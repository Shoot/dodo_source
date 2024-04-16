package io.realm;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.menu.MenuItemEntity;
import com.dodopizza.persistence.entity.menu.PersonalPriceEntity;
import com.dodopizza.persistence.entity.menu.PromoActionEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import defpackage.r89;
import im.threads.business.transport.MessageAttributes;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_menu_PromoActionEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy;
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
public class com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy extends MenuItemEntity implements r89, tgc {
    private static final OsObjectSchemaInfo h = g();
    private a b;
    private c0<MenuItemEntity> c;
    private k0<ShoppingInfoEntity> d;
    private k0<ShoppingInfoEntity> e;
    private k0<String> f;
    private k0<PromoActionEntity> g;

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
            OsObjectSchemaInfo b = osSchemaInfo.b("MenuItemEntity");
            this.e = a("id", "id", b);
            this.f = a("forwardCompatibilityId", "forwardCompatibilityId", b);
            this.g = a(MessageAttributes.TYPE, MessageAttributes.TYPE, b);
            this.h = a("category", "category", b);
            this.i = a(Action.NAME_ATTRIBUTE, Action.NAME_ATTRIBUTE, b);
            this.j = a("description", "description", b);
            this.k = a("compositeDescription", "compositeDescription", b);
            this.l = a("imageUrl", "imageUrl", b);
            this.m = a("priority", "priority", b);
            this.n = a("shoppingInfo", "shoppingInfo", b);
            this.o = a("customShoppingItems", "customShoppingItems", b);
            this.p = a("isEnabled", "isEnabled", b);
            this.q = a("sizeMeasure", "sizeMeasure", b);
            this.r = a("sizeValue", "sizeValue", b);
            this.s = a("menuCategoryId", "menuCategoryId", b);
            this.t = a("subMenuCategoryIds", "subMenuCategoryIds", b);
            this.u = a("isPizza", "isPizza", b);
            this.v = a("promoActions", "promoActions", b);
            this.w = a("personalPrice", "personalPrice", b);
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
    public com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy() {
        this.c.p();
    }

    public static MenuItemEntity c(d0 d0Var, a aVar, MenuItemEntity menuItemEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(menuItemEntity);
        if (r89Var != null) {
            return (MenuItemEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(MenuItemEntity.class), set);
        osObjectBuilder.E0(aVar.e, menuItemEntity.realmGet$id());
        osObjectBuilder.E0(aVar.f, menuItemEntity.realmGet$forwardCompatibilityId());
        osObjectBuilder.E0(aVar.g, menuItemEntity.realmGet$type());
        osObjectBuilder.E0(aVar.h, menuItemEntity.realmGet$category());
        osObjectBuilder.E0(aVar.i, menuItemEntity.realmGet$name());
        osObjectBuilder.E0(aVar.j, menuItemEntity.realmGet$description());
        osObjectBuilder.E0(aVar.k, menuItemEntity.realmGet$compositeDescription());
        osObjectBuilder.E0(aVar.l, menuItemEntity.realmGet$imageUrl());
        osObjectBuilder.o0(aVar.m, Integer.valueOf(menuItemEntity.realmGet$priority()));
        osObjectBuilder.j0(aVar.p, Boolean.valueOf(menuItemEntity.realmGet$isEnabled()));
        osObjectBuilder.E0(aVar.q, menuItemEntity.realmGet$sizeMeasure());
        osObjectBuilder.E0(aVar.r, menuItemEntity.realmGet$sizeValue());
        osObjectBuilder.E0(aVar.s, menuItemEntity.realmGet$menuCategoryId());
        osObjectBuilder.F0(aVar.t, menuItemEntity.realmGet$subMenuCategoryIds());
        osObjectBuilder.j0(aVar.u, Boolean.valueOf(menuItemEntity.realmGet$isPizza()));
        com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(menuItemEntity, j);
        k0<ShoppingInfoEntity> realmGet$shoppingInfo = menuItemEntity.realmGet$shoppingInfo();
        if (realmGet$shoppingInfo != null) {
            k0<ShoppingInfoEntity> realmGet$shoppingInfo2 = j.realmGet$shoppingInfo();
            realmGet$shoppingInfo2.clear();
            for (int i = 0; i < realmGet$shoppingInfo.size(); i++) {
                ShoppingInfoEntity shoppingInfoEntity = realmGet$shoppingInfo.get(i);
                ShoppingInfoEntity shoppingInfoEntity2 = (ShoppingInfoEntity) map.get(shoppingInfoEntity);
                if (shoppingInfoEntity2 != null) {
                    realmGet$shoppingInfo2.add(shoppingInfoEntity2);
                } else {
                    realmGet$shoppingInfo2.add(com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.a) d0Var.u().e(ShoppingInfoEntity.class), shoppingInfoEntity, z, map, set));
                }
            }
        }
        k0<ShoppingInfoEntity> realmGet$customShoppingItems = menuItemEntity.realmGet$customShoppingItems();
        if (realmGet$customShoppingItems != null) {
            k0<ShoppingInfoEntity> realmGet$customShoppingItems2 = j.realmGet$customShoppingItems();
            realmGet$customShoppingItems2.clear();
            for (int i2 = 0; i2 < realmGet$customShoppingItems.size(); i2++) {
                ShoppingInfoEntity shoppingInfoEntity3 = realmGet$customShoppingItems.get(i2);
                ShoppingInfoEntity shoppingInfoEntity4 = (ShoppingInfoEntity) map.get(shoppingInfoEntity3);
                if (shoppingInfoEntity4 != null) {
                    realmGet$customShoppingItems2.add(shoppingInfoEntity4);
                } else {
                    realmGet$customShoppingItems2.add(com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.a) d0Var.u().e(ShoppingInfoEntity.class), shoppingInfoEntity3, z, map, set));
                }
            }
        }
        k0<PromoActionEntity> realmGet$promoActions = menuItemEntity.realmGet$promoActions();
        if (realmGet$promoActions != null) {
            k0<PromoActionEntity> realmGet$promoActions2 = j.realmGet$promoActions();
            realmGet$promoActions2.clear();
            for (int i3 = 0; i3 < realmGet$promoActions.size(); i3++) {
                PromoActionEntity promoActionEntity = realmGet$promoActions.get(i3);
                PromoActionEntity promoActionEntity2 = (PromoActionEntity) map.get(promoActionEntity);
                if (promoActionEntity2 != null) {
                    realmGet$promoActions2.add(promoActionEntity2);
                } else {
                    realmGet$promoActions2.add(com_dodopizza_persistence_entity_menu_PromoActionEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_PromoActionEntityRealmProxy.a) d0Var.u().e(PromoActionEntity.class), promoActionEntity, z, map, set));
                }
            }
        }
        PersonalPriceEntity realmGet$personalPrice = menuItemEntity.realmGet$personalPrice();
        if (realmGet$personalPrice == null) {
            j.realmSet$personalPrice(null);
        } else {
            PersonalPriceEntity personalPriceEntity = (PersonalPriceEntity) map.get(realmGet$personalPrice);
            if (personalPriceEntity != null) {
                j.realmSet$personalPrice(personalPriceEntity);
            } else {
                j.realmSet$personalPrice(com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.a) d0Var.u().e(PersonalPriceEntity.class), realmGet$personalPrice, z, map, set));
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
    public static com.dodopizza.persistence.entity.menu.MenuItemEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy.a r9, com.dodopizza.persistence.entity.menu.MenuItemEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.menu.MenuItemEntity r1 = (com.dodopizza.persistence.entity.menu.MenuItemEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.menu.MenuItemEntity> r2 = com.dodopizza.persistence.entity.menu.MenuItemEntity.class
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
            io.realm.com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.menu.MenuItemEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.menu.MenuItemEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy$a, com.dodopizza.persistence.entity.menu.MenuItemEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.menu.MenuItemEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static MenuItemEntity f(MenuItemEntity menuItemEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        MenuItemEntity menuItemEntity2;
        if (i > i2 || menuItemEntity == null) {
            return null;
        }
        r89.a<o89> aVar = map.get(menuItemEntity);
        if (aVar == null) {
            menuItemEntity2 = new MenuItemEntity();
            map.put(menuItemEntity, new r89.a<>(i, menuItemEntity2));
        } else if (i >= aVar.a) {
            return (MenuItemEntity) aVar.b;
        } else {
            aVar.a = i;
            menuItemEntity2 = (MenuItemEntity) aVar.b;
        }
        d0 d0Var = (d0) ((r89) menuItemEntity).a().f();
        menuItemEntity2.realmSet$id(menuItemEntity.realmGet$id());
        menuItemEntity2.realmSet$forwardCompatibilityId(menuItemEntity.realmGet$forwardCompatibilityId());
        menuItemEntity2.realmSet$type(menuItemEntity.realmGet$type());
        menuItemEntity2.realmSet$category(menuItemEntity.realmGet$category());
        menuItemEntity2.realmSet$name(menuItemEntity.realmGet$name());
        menuItemEntity2.realmSet$description(menuItemEntity.realmGet$description());
        menuItemEntity2.realmSet$compositeDescription(menuItemEntity.realmGet$compositeDescription());
        menuItemEntity2.realmSet$imageUrl(menuItemEntity.realmGet$imageUrl());
        menuItemEntity2.realmSet$priority(menuItemEntity.realmGet$priority());
        if (i == i2) {
            menuItemEntity2.realmSet$shoppingInfo(null);
        } else {
            k0<ShoppingInfoEntity> realmGet$shoppingInfo = menuItemEntity.realmGet$shoppingInfo();
            k0<ShoppingInfoEntity> k0Var = new k0<>();
            menuItemEntity2.realmSet$shoppingInfo(k0Var);
            int i3 = i + 1;
            int size = realmGet$shoppingInfo.size();
            for (int i4 = 0; i4 < size; i4++) {
                k0Var.add(com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.f(realmGet$shoppingInfo.get(i4), i3, i2, map));
            }
        }
        if (i == i2) {
            menuItemEntity2.realmSet$customShoppingItems(null);
        } else {
            k0<ShoppingInfoEntity> realmGet$customShoppingItems = menuItemEntity.realmGet$customShoppingItems();
            k0<ShoppingInfoEntity> k0Var2 = new k0<>();
            menuItemEntity2.realmSet$customShoppingItems(k0Var2);
            int i5 = i + 1;
            int size2 = realmGet$customShoppingItems.size();
            for (int i6 = 0; i6 < size2; i6++) {
                k0Var2.add(com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.f(realmGet$customShoppingItems.get(i6), i5, i2, map));
            }
        }
        menuItemEntity2.realmSet$isEnabled(menuItemEntity.realmGet$isEnabled());
        menuItemEntity2.realmSet$sizeMeasure(menuItemEntity.realmGet$sizeMeasure());
        menuItemEntity2.realmSet$sizeValue(menuItemEntity.realmGet$sizeValue());
        menuItemEntity2.realmSet$menuCategoryId(menuItemEntity.realmGet$menuCategoryId());
        menuItemEntity2.realmSet$subMenuCategoryIds(new k0<>());
        menuItemEntity2.realmGet$subMenuCategoryIds().addAll(menuItemEntity.realmGet$subMenuCategoryIds());
        menuItemEntity2.realmSet$isPizza(menuItemEntity.realmGet$isPizza());
        if (i == i2) {
            menuItemEntity2.realmSet$promoActions(null);
        } else {
            k0<PromoActionEntity> realmGet$promoActions = menuItemEntity.realmGet$promoActions();
            k0<PromoActionEntity> k0Var3 = new k0<>();
            menuItemEntity2.realmSet$promoActions(k0Var3);
            int i7 = i + 1;
            int size3 = realmGet$promoActions.size();
            for (int i8 = 0; i8 < size3; i8++) {
                k0Var3.add(com_dodopizza_persistence_entity_menu_PromoActionEntityRealmProxy.f(realmGet$promoActions.get(i8), i7, i2, map));
            }
        }
        menuItemEntity2.realmSet$personalPrice(com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.f(menuItemEntity.realmGet$personalPrice(), i + 1, i2, map));
        return menuItemEntity2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "MenuItemEntity", false, 19, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, false);
        bVar.b("", "forwardCompatibilityId", realmFieldType, false, false, true);
        bVar.b("", MessageAttributes.TYPE, realmFieldType, false, false, true);
        bVar.b("", "category", realmFieldType, false, false, true);
        bVar.b("", Action.NAME_ATTRIBUTE, realmFieldType, false, false, true);
        bVar.b("", "description", realmFieldType, false, false, true);
        bVar.b("", "compositeDescription", realmFieldType, false, false, true);
        bVar.b("", "imageUrl", realmFieldType, false, false, true);
        bVar.b("", "priority", RealmFieldType.INTEGER, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.LIST;
        bVar.a("", "shoppingInfo", realmFieldType2, "ShoppingInfoEntity");
        bVar.a("", "customShoppingItems", realmFieldType2, "ShoppingInfoEntity");
        RealmFieldType realmFieldType3 = RealmFieldType.BOOLEAN;
        bVar.b("", "isEnabled", realmFieldType3, false, false, true);
        bVar.b("", "sizeMeasure", realmFieldType, false, false, true);
        bVar.b("", "sizeValue", realmFieldType, false, false, true);
        bVar.b("", "menuCategoryId", realmFieldType, false, false, true);
        bVar.c("", "subMenuCategoryIds", RealmFieldType.STRING_LIST, false);
        bVar.b("", "isPizza", realmFieldType3, false, false, true);
        bVar.a("", "promoActions", realmFieldType2, "PromoActionEntity");
        bVar.a("", "personalPrice", RealmFieldType.OBJECT, "PersonalPriceEntity");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return h;
    }

    public static long i(d0 d0Var, MenuItemEntity menuItemEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        long j;
        long j2;
        if ((menuItemEntity instanceof r89) && !n0.isFrozen(menuItemEntity)) {
            r89 r89Var = (r89) menuItemEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(MenuItemEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(MenuItemEntity.class);
        long j3 = aVar.e;
        String realmGet$id = menuItemEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j3, realmGet$id);
        }
        long j4 = nativeFindFirstString;
        map.put(menuItemEntity, Long.valueOf(j4));
        String realmGet$forwardCompatibilityId = menuItemEntity.realmGet$forwardCompatibilityId();
        if (realmGet$forwardCompatibilityId != null) {
            j = j4;
            Table.nativeSetString(nativePtr, aVar.f, j4, realmGet$forwardCompatibilityId, false);
        } else {
            j = j4;
            Table.nativeSetNull(nativePtr, aVar.f, j, false);
        }
        String realmGet$type = menuItemEntity.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, aVar.g, j, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j, false);
        }
        String realmGet$category = menuItemEntity.realmGet$category();
        if (realmGet$category != null) {
            Table.nativeSetString(nativePtr, aVar.h, j, realmGet$category, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, j, false);
        }
        String realmGet$name = menuItemEntity.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, aVar.i, j, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.i, j, false);
        }
        String realmGet$description = menuItemEntity.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, aVar.j, j, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.j, j, false);
        }
        String realmGet$compositeDescription = menuItemEntity.realmGet$compositeDescription();
        if (realmGet$compositeDescription != null) {
            Table.nativeSetString(nativePtr, aVar.k, j, realmGet$compositeDescription, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.k, j, false);
        }
        String realmGet$imageUrl = menuItemEntity.realmGet$imageUrl();
        if (realmGet$imageUrl != null) {
            Table.nativeSetString(nativePtr, aVar.l, j, realmGet$imageUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.l, j, false);
        }
        Table.nativeSetLong(nativePtr, aVar.m, j, menuItemEntity.realmGet$priority(), false);
        long j5 = j;
        OsList osList = new OsList(I0.r(j5), aVar.n);
        k0<ShoppingInfoEntity> realmGet$shoppingInfo = menuItemEntity.realmGet$shoppingInfo();
        if (realmGet$shoppingInfo != null && realmGet$shoppingInfo.size() == osList.X()) {
            int size = realmGet$shoppingInfo.size();
            int i = 0;
            while (i < size) {
                ShoppingInfoEntity shoppingInfoEntity = realmGet$shoppingInfo.get(i);
                Long l = map.get(shoppingInfoEntity);
                if (l == null) {
                    l = Long.valueOf(com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.i(d0Var, shoppingInfoEntity, map));
                }
                osList.U(i, l.longValue());
                i++;
                nativePtr = nativePtr;
            }
            j2 = nativePtr;
        } else {
            j2 = nativePtr;
            osList.J();
            if (realmGet$shoppingInfo != null) {
                Iterator<ShoppingInfoEntity> it = realmGet$shoppingInfo.iterator();
                while (it.hasNext()) {
                    ShoppingInfoEntity next = it.next();
                    Long l2 = map.get(next);
                    if (l2 == null) {
                        l2 = Long.valueOf(com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.i(d0Var, next, map));
                    }
                    osList.k(l2.longValue());
                }
            }
        }
        OsList osList2 = new OsList(I0.r(j5), aVar.o);
        k0<ShoppingInfoEntity> realmGet$customShoppingItems = menuItemEntity.realmGet$customShoppingItems();
        if (realmGet$customShoppingItems != null && realmGet$customShoppingItems.size() == osList2.X()) {
            int size2 = realmGet$customShoppingItems.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ShoppingInfoEntity shoppingInfoEntity2 = realmGet$customShoppingItems.get(i2);
                Long l3 = map.get(shoppingInfoEntity2);
                if (l3 == null) {
                    l3 = Long.valueOf(com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.i(d0Var, shoppingInfoEntity2, map));
                }
                osList2.U(i2, l3.longValue());
            }
        } else {
            osList2.J();
            if (realmGet$customShoppingItems != null) {
                Iterator<ShoppingInfoEntity> it2 = realmGet$customShoppingItems.iterator();
                while (it2.hasNext()) {
                    ShoppingInfoEntity next2 = it2.next();
                    Long l4 = map.get(next2);
                    if (l4 == null) {
                        l4 = Long.valueOf(com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.i(d0Var, next2, map));
                    }
                    osList2.k(l4.longValue());
                }
            }
        }
        Table.nativeSetBoolean(j2, aVar.p, j5, menuItemEntity.realmGet$isEnabled(), false);
        String realmGet$sizeMeasure = menuItemEntity.realmGet$sizeMeasure();
        if (realmGet$sizeMeasure != null) {
            Table.nativeSetString(j2, aVar.q, j5, realmGet$sizeMeasure, false);
        } else {
            Table.nativeSetNull(j2, aVar.q, j5, false);
        }
        String realmGet$sizeValue = menuItemEntity.realmGet$sizeValue();
        if (realmGet$sizeValue != null) {
            Table.nativeSetString(j2, aVar.r, j5, realmGet$sizeValue, false);
        } else {
            Table.nativeSetNull(j2, aVar.r, j5, false);
        }
        String realmGet$menuCategoryId = menuItemEntity.realmGet$menuCategoryId();
        if (realmGet$menuCategoryId != null) {
            Table.nativeSetString(j2, aVar.s, j5, realmGet$menuCategoryId, false);
        } else {
            Table.nativeSetNull(j2, aVar.s, j5, false);
        }
        OsList osList3 = new OsList(I0.r(j5), aVar.t);
        osList3.J();
        k0<String> realmGet$subMenuCategoryIds = menuItemEntity.realmGet$subMenuCategoryIds();
        if (realmGet$subMenuCategoryIds != null) {
            Iterator<String> it3 = realmGet$subMenuCategoryIds.iterator();
            while (it3.hasNext()) {
                String next3 = it3.next();
                if (next3 == null) {
                    osList3.h();
                } else {
                    osList3.l(next3);
                }
            }
        }
        Table.nativeSetBoolean(j2, aVar.u, j5, menuItemEntity.realmGet$isPizza(), false);
        OsList osList4 = new OsList(I0.r(j5), aVar.v);
        k0<PromoActionEntity> realmGet$promoActions = menuItemEntity.realmGet$promoActions();
        if (realmGet$promoActions != null && realmGet$promoActions.size() == osList4.X()) {
            int size3 = realmGet$promoActions.size();
            for (int i3 = 0; i3 < size3; i3++) {
                PromoActionEntity promoActionEntity = realmGet$promoActions.get(i3);
                Long l5 = map.get(promoActionEntity);
                if (l5 == null) {
                    l5 = Long.valueOf(com_dodopizza_persistence_entity_menu_PromoActionEntityRealmProxy.i(d0Var, promoActionEntity, map));
                }
                osList4.U(i3, l5.longValue());
            }
        } else {
            osList4.J();
            if (realmGet$promoActions != null) {
                Iterator<PromoActionEntity> it4 = realmGet$promoActions.iterator();
                while (it4.hasNext()) {
                    PromoActionEntity next4 = it4.next();
                    Long l6 = map.get(next4);
                    if (l6 == null) {
                        l6 = Long.valueOf(com_dodopizza_persistence_entity_menu_PromoActionEntityRealmProxy.i(d0Var, next4, map));
                    }
                    osList4.k(l6.longValue());
                }
            }
        }
        PersonalPriceEntity realmGet$personalPrice = menuItemEntity.realmGet$personalPrice();
        if (realmGet$personalPrice != null) {
            Long l7 = map.get(realmGet$personalPrice);
            if (l7 == null) {
                l7 = Long.valueOf(com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.i(d0Var, realmGet$personalPrice, map));
            }
            Table.nativeSetLink(j2, aVar.w, j5, l7.longValue(), false);
        } else {
            Table.nativeNullifyLink(j2, aVar.w, j5);
        }
        return j5;
    }

    static com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(MenuItemEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy com_dodopizza_persistence_entity_menu_menuitementityrealmproxy = new com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_menu_menuitementityrealmproxy;
    }

    static MenuItemEntity k(d0 d0Var, a aVar, MenuItemEntity menuItemEntity, MenuItemEntity menuItemEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(MenuItemEntity.class), set);
        osObjectBuilder.E0(aVar.e, menuItemEntity2.realmGet$id());
        osObjectBuilder.E0(aVar.f, menuItemEntity2.realmGet$forwardCompatibilityId());
        osObjectBuilder.E0(aVar.g, menuItemEntity2.realmGet$type());
        osObjectBuilder.E0(aVar.h, menuItemEntity2.realmGet$category());
        osObjectBuilder.E0(aVar.i, menuItemEntity2.realmGet$name());
        osObjectBuilder.E0(aVar.j, menuItemEntity2.realmGet$description());
        osObjectBuilder.E0(aVar.k, menuItemEntity2.realmGet$compositeDescription());
        osObjectBuilder.E0(aVar.l, menuItemEntity2.realmGet$imageUrl());
        osObjectBuilder.o0(aVar.m, Integer.valueOf(menuItemEntity2.realmGet$priority()));
        k0<ShoppingInfoEntity> realmGet$shoppingInfo = menuItemEntity2.realmGet$shoppingInfo();
        if (realmGet$shoppingInfo != null) {
            k0 k0Var = new k0();
            for (int i = 0; i < realmGet$shoppingInfo.size(); i++) {
                ShoppingInfoEntity shoppingInfoEntity = realmGet$shoppingInfo.get(i);
                ShoppingInfoEntity shoppingInfoEntity2 = (ShoppingInfoEntity) map.get(shoppingInfoEntity);
                if (shoppingInfoEntity2 != null) {
                    k0Var.add(shoppingInfoEntity2);
                } else {
                    k0Var.add(com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.a) d0Var.u().e(ShoppingInfoEntity.class), shoppingInfoEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.n, k0Var);
        } else {
            osObjectBuilder.z0(aVar.n, new k0());
        }
        k0<ShoppingInfoEntity> realmGet$customShoppingItems = menuItemEntity2.realmGet$customShoppingItems();
        if (realmGet$customShoppingItems != null) {
            k0 k0Var2 = new k0();
            for (int i2 = 0; i2 < realmGet$customShoppingItems.size(); i2++) {
                ShoppingInfoEntity shoppingInfoEntity3 = realmGet$customShoppingItems.get(i2);
                ShoppingInfoEntity shoppingInfoEntity4 = (ShoppingInfoEntity) map.get(shoppingInfoEntity3);
                if (shoppingInfoEntity4 != null) {
                    k0Var2.add(shoppingInfoEntity4);
                } else {
                    k0Var2.add(com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.a) d0Var.u().e(ShoppingInfoEntity.class), shoppingInfoEntity3, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.o, k0Var2);
        } else {
            osObjectBuilder.z0(aVar.o, new k0());
        }
        osObjectBuilder.j0(aVar.p, Boolean.valueOf(menuItemEntity2.realmGet$isEnabled()));
        osObjectBuilder.E0(aVar.q, menuItemEntity2.realmGet$sizeMeasure());
        osObjectBuilder.E0(aVar.r, menuItemEntity2.realmGet$sizeValue());
        osObjectBuilder.E0(aVar.s, menuItemEntity2.realmGet$menuCategoryId());
        osObjectBuilder.F0(aVar.t, menuItemEntity2.realmGet$subMenuCategoryIds());
        osObjectBuilder.j0(aVar.u, Boolean.valueOf(menuItemEntity2.realmGet$isPizza()));
        k0<PromoActionEntity> realmGet$promoActions = menuItemEntity2.realmGet$promoActions();
        if (realmGet$promoActions != null) {
            k0 k0Var3 = new k0();
            for (int i3 = 0; i3 < realmGet$promoActions.size(); i3++) {
                PromoActionEntity promoActionEntity = realmGet$promoActions.get(i3);
                PromoActionEntity promoActionEntity2 = (PromoActionEntity) map.get(promoActionEntity);
                if (promoActionEntity2 != null) {
                    k0Var3.add(promoActionEntity2);
                } else {
                    k0Var3.add(com_dodopizza_persistence_entity_menu_PromoActionEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_PromoActionEntityRealmProxy.a) d0Var.u().e(PromoActionEntity.class), promoActionEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.v, k0Var3);
        } else {
            osObjectBuilder.z0(aVar.v, new k0());
        }
        PersonalPriceEntity realmGet$personalPrice = menuItemEntity2.realmGet$personalPrice();
        if (realmGet$personalPrice == null) {
            osObjectBuilder.r0(aVar.w);
        } else {
            PersonalPriceEntity personalPriceEntity = (PersonalPriceEntity) map.get(realmGet$personalPrice);
            if (personalPriceEntity != null) {
                osObjectBuilder.x0(aVar.w, personalPriceEntity);
            } else {
                osObjectBuilder.x0(aVar.w, com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.a) d0Var.u().e(PersonalPriceEntity.class), realmGet$personalPrice, true, map, set));
            }
        }
        osObjectBuilder.K0();
        return menuItemEntity;
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
        c0<MenuItemEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy com_dodopizza_persistence_entity_menu_menuitementityrealmproxy = (com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_menu_menuitementityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_menu_menuitementityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_menu_menuitementityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public String realmGet$category() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public String realmGet$compositeDescription() {
        this.c.f().c();
        return this.c.g().p0(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public k0<ShoppingInfoEntity> realmGet$customShoppingItems() {
        this.c.f().c();
        k0<ShoppingInfoEntity> k0Var = this.e;
        if (k0Var != null) {
            return k0Var;
        }
        k0<ShoppingInfoEntity> k0Var2 = new k0<>(ShoppingInfoEntity.class, this.c.g().f0(this.b.o), this.c.f());
        this.e = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public String realmGet$description() {
        this.c.f().c();
        return this.c.g().p0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public String realmGet$forwardCompatibilityId() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public String realmGet$imageUrl() {
        this.c.f().c();
        return this.c.g().p0(this.b.l);
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public boolean realmGet$isEnabled() {
        this.c.f().c();
        return this.c.g().b0(this.b.p);
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public boolean realmGet$isPizza() {
        this.c.f().c();
        return this.c.g().b0(this.b.u);
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public String realmGet$menuCategoryId() {
        this.c.f().c();
        return this.c.g().p0(this.b.s);
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public String realmGet$name() {
        this.c.f().c();
        return this.c.g().p0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public PersonalPriceEntity realmGet$personalPrice() {
        this.c.f().c();
        if (this.c.g().o0(this.b.w)) {
            return null;
        }
        return (PersonalPriceEntity) this.c.f().o(PersonalPriceEntity.class, this.c.g().L(this.b.w), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public int realmGet$priority() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.m);
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public k0<PromoActionEntity> realmGet$promoActions() {
        this.c.f().c();
        k0<PromoActionEntity> k0Var = this.g;
        if (k0Var != null) {
            return k0Var;
        }
        k0<PromoActionEntity> k0Var2 = new k0<>(PromoActionEntity.class, this.c.g().f0(this.b.v), this.c.f());
        this.g = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public k0<ShoppingInfoEntity> realmGet$shoppingInfo() {
        this.c.f().c();
        k0<ShoppingInfoEntity> k0Var = this.d;
        if (k0Var != null) {
            return k0Var;
        }
        k0<ShoppingInfoEntity> k0Var2 = new k0<>(ShoppingInfoEntity.class, this.c.g().f0(this.b.n), this.c.f());
        this.d = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public String realmGet$sizeMeasure() {
        this.c.f().c();
        return this.c.g().p0(this.b.q);
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public String realmGet$sizeValue() {
        this.c.f().c();
        return this.c.g().p0(this.b.r);
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public k0<String> realmGet$subMenuCategoryIds() {
        this.c.f().c();
        k0<String> k0Var = this.f;
        if (k0Var != null) {
            return k0Var;
        }
        k0<String> k0Var2 = new k0<>(String.class, this.c.g().N(this.b.t, RealmFieldType.STRING_LIST), this.c.f());
        this.f = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public String realmGet$type() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public void realmSet$category(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.h, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'category' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.h, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'category' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public void realmSet$compositeDescription(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.k, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'compositeDescription' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.k, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'compositeDescription' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public void realmSet$customShoppingItems(k0<ShoppingInfoEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("customShoppingItems")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<ShoppingInfoEntity> k0Var2 = new k0<>();
                Iterator<ShoppingInfoEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    ShoppingInfoEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((ShoppingInfoEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.o);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i < size) {
                ShoppingInfoEntity shoppingInfoEntity = k0Var.get(i);
                this.c.c(shoppingInfoEntity);
                f0.U(i, ((r89) shoppingInfoEntity).a().g().E0());
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
            ShoppingInfoEntity shoppingInfoEntity2 = k0Var.get(i);
            this.c.c(shoppingInfoEntity2);
            f0.k(((r89) shoppingInfoEntity2).a().g().E0());
            i++;
        }
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
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

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public void realmSet$forwardCompatibilityId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.f, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'forwardCompatibilityId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'forwardCompatibilityId' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public void realmSet$imageUrl(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.l, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'imageUrl' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.l, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'imageUrl' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public void realmSet$isEnabled(boolean z) {
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

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public void realmSet$isPizza(boolean z) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().y(this.b.u, g.E0(), z, true);
            return;
        }
        this.c.f().c();
        this.c.g().Q(this.b.u, z);
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public void realmSet$menuCategoryId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.s, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'menuCategoryId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.s, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'menuCategoryId' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
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

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public void realmSet$personalPrice(PersonalPriceEntity personalPriceEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("personalPrice")) {
                return;
            }
            if (personalPriceEntity != null && !n0.isManaged(personalPriceEntity)) {
                personalPriceEntity = (PersonalPriceEntity) d0Var.j0(personalPriceEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (personalPriceEntity == null) {
                g.l0(this.b.w);
                return;
            }
            this.c.c(personalPriceEntity);
            g.o().B(this.b.w, g.E0(), ((r89) personalPriceEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (personalPriceEntity == null) {
            this.c.g().l0(this.b.w);
            return;
        }
        this.c.c(personalPriceEntity);
        this.c.g().s(this.b.w, ((r89) personalPriceEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public void realmSet$priority(int i) {
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

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public void realmSet$promoActions(k0<PromoActionEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("promoActions")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<PromoActionEntity> k0Var2 = new k0<>();
                Iterator<PromoActionEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    PromoActionEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((PromoActionEntity) d0Var.j0(next, new ex4[0]));
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
                PromoActionEntity promoActionEntity = k0Var.get(i);
                this.c.c(promoActionEntity);
                f0.U(i, ((r89) promoActionEntity).a().g().E0());
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
            PromoActionEntity promoActionEntity2 = k0Var.get(i);
            this.c.c(promoActionEntity2);
            f0.k(((r89) promoActionEntity2).a().g().E0());
            i++;
        }
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public void realmSet$shoppingInfo(k0<ShoppingInfoEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("shoppingInfo")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<ShoppingInfoEntity> k0Var2 = new k0<>();
                Iterator<ShoppingInfoEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    ShoppingInfoEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((ShoppingInfoEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.n);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i < size) {
                ShoppingInfoEntity shoppingInfoEntity = k0Var.get(i);
                this.c.c(shoppingInfoEntity);
                f0.U(i, ((r89) shoppingInfoEntity).a().g().E0());
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
            ShoppingInfoEntity shoppingInfoEntity2 = k0Var.get(i);
            this.c.c(shoppingInfoEntity2);
            f0.k(((r89) shoppingInfoEntity2).a().g().E0());
            i++;
        }
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public void realmSet$sizeMeasure(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.q, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'sizeMeasure' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.q, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'sizeMeasure' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public void realmSet$sizeValue(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.r, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'sizeValue' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.r, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'sizeValue' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public void realmSet$subMenuCategoryIds(k0<String> k0Var) {
        if (this.c.i() && (!this.c.d() || this.c.e().contains("subMenuCategoryIds"))) {
            return;
        }
        this.c.f().c();
        OsList N = this.c.g().N(this.b.t, RealmFieldType.STRING_LIST);
        N.J();
        if (k0Var == null) {
            return;
        }
        Iterator<String> it = k0Var.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next == null) {
                N.h();
            } else {
                N.l(next);
            }
        }
    }

    @Override // com.dodopizza.persistence.entity.menu.MenuItemEntity, defpackage.tgc
    public void realmSet$type(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.g, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("MenuItemEntity = proxy[");
        sb.append("{id:");
        String str2 = "null";
        if (realmGet$id() == null) {
            str = "null";
        } else {
            str = realmGet$id();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{forwardCompatibilityId:");
        sb.append(realmGet$forwardCompatibilityId());
        sb.append("}");
        sb.append(",");
        sb.append("{type:");
        sb.append(realmGet$type());
        sb.append("}");
        sb.append(",");
        sb.append("{category:");
        sb.append(realmGet$category());
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
        sb.append("{compositeDescription:");
        sb.append(realmGet$compositeDescription());
        sb.append("}");
        sb.append(",");
        sb.append("{imageUrl:");
        sb.append(realmGet$imageUrl());
        sb.append("}");
        sb.append(",");
        sb.append("{priority:");
        sb.append(realmGet$priority());
        sb.append("}");
        sb.append(",");
        sb.append("{shoppingInfo:");
        sb.append("RealmList<ShoppingInfoEntity>[");
        sb.append(realmGet$shoppingInfo().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{customShoppingItems:");
        sb.append("RealmList<ShoppingInfoEntity>[");
        sb.append(realmGet$customShoppingItems().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{isEnabled:");
        sb.append(realmGet$isEnabled());
        sb.append("}");
        sb.append(",");
        sb.append("{sizeMeasure:");
        sb.append(realmGet$sizeMeasure());
        sb.append("}");
        sb.append(",");
        sb.append("{sizeValue:");
        sb.append(realmGet$sizeValue());
        sb.append("}");
        sb.append(",");
        sb.append("{menuCategoryId:");
        sb.append(realmGet$menuCategoryId());
        sb.append("}");
        sb.append(",");
        sb.append("{subMenuCategoryIds:");
        sb.append("RealmList<String>[");
        sb.append(realmGet$subMenuCategoryIds().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{isPizza:");
        sb.append(realmGet$isPizza());
        sb.append("}");
        sb.append(",");
        sb.append("{promoActions:");
        sb.append("RealmList<PromoActionEntity>[");
        sb.append(realmGet$promoActions().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{personalPrice:");
        if (realmGet$personalPrice() != null) {
            str2 = "PersonalPriceEntity";
        }
        sb.append(str2);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
