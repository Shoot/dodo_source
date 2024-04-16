package io.realm;

import com.dodopizza.persistence.entity.personalization.DeliveryExperimentEntity;
import com.dodopizza.persistence.entity.personalization.DynamicDeliveryEntity;
import com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity;
import com.dodopizza.persistence.entity.personalization.PersonalCategoryEntity;
import com.dodopizza.persistence.entity.personalization.PersonalizationEntity;
import com.dodopizza.persistence.entity.personalization.UpsellProductsEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_personalization_DeliveryExperimentEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_personalization_DynamicDeliveryEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_personalization_PersonalCategoryEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_personalization_UpsellProductsEntityRealmProxy;
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
public class com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy extends PersonalizationEntity implements r89, lhc {
    private static final OsObjectSchemaInfo e = g();
    private a b;
    private c0<PersonalizationEntity> c;
    private k0<MenuPersonalPriceInfoEntity> d;

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

        a(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo b = osSchemaInfo.b("PersonalizationEntity");
            this.e = a("menuPersonalPricesInfo", "menuPersonalPricesInfo", b);
            this.f = a("personalCategory", "personalCategory", b);
            this.g = a("upsellProducts", "upsellProducts", b);
            this.h = a("deliveryExperimentInfo", "deliveryExperimentInfo", b);
            this.i = a("expiredTime", "expiredTime", b);
            this.j = a("dynamicDelivery", "dynamicDelivery", b);
            this.k = a("id", "id", b);
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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy() {
        this.c.p();
    }

    public static PersonalizationEntity c(d0 d0Var, a aVar, PersonalizationEntity personalizationEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(personalizationEntity);
        if (r89Var != null) {
            return (PersonalizationEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PersonalizationEntity.class), set);
        osObjectBuilder.p0(aVar.i, Long.valueOf(personalizationEntity.realmGet$expiredTime()));
        osObjectBuilder.E0(aVar.k, personalizationEntity.realmGet$id());
        com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(personalizationEntity, j);
        k0<MenuPersonalPriceInfoEntity> realmGet$menuPersonalPricesInfo = personalizationEntity.realmGet$menuPersonalPricesInfo();
        if (realmGet$menuPersonalPricesInfo != null) {
            k0<MenuPersonalPriceInfoEntity> realmGet$menuPersonalPricesInfo2 = j.realmGet$menuPersonalPricesInfo();
            realmGet$menuPersonalPricesInfo2.clear();
            for (int i = 0; i < realmGet$menuPersonalPricesInfo.size(); i++) {
                MenuPersonalPriceInfoEntity menuPersonalPriceInfoEntity = realmGet$menuPersonalPricesInfo.get(i);
                MenuPersonalPriceInfoEntity menuPersonalPriceInfoEntity2 = (MenuPersonalPriceInfoEntity) map.get(menuPersonalPriceInfoEntity);
                if (menuPersonalPriceInfoEntity2 != null) {
                    realmGet$menuPersonalPricesInfo2.add(menuPersonalPriceInfoEntity2);
                } else {
                    realmGet$menuPersonalPricesInfo2.add(com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy.a) d0Var.u().e(MenuPersonalPriceInfoEntity.class), menuPersonalPriceInfoEntity, z, map, set));
                }
            }
        }
        PersonalCategoryEntity realmGet$personalCategory = personalizationEntity.realmGet$personalCategory();
        if (realmGet$personalCategory == null) {
            j.realmSet$personalCategory(null);
        } else {
            PersonalCategoryEntity personalCategoryEntity = (PersonalCategoryEntity) map.get(realmGet$personalCategory);
            if (personalCategoryEntity != null) {
                j.realmSet$personalCategory(personalCategoryEntity);
            } else {
                j.realmSet$personalCategory(com_dodopizza_persistence_entity_personalization_PersonalCategoryEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_personalization_PersonalCategoryEntityRealmProxy.a) d0Var.u().e(PersonalCategoryEntity.class), realmGet$personalCategory, z, map, set));
            }
        }
        UpsellProductsEntity realmGet$upsellProducts = personalizationEntity.realmGet$upsellProducts();
        if (realmGet$upsellProducts == null) {
            j.realmSet$upsellProducts(null);
        } else {
            UpsellProductsEntity upsellProductsEntity = (UpsellProductsEntity) map.get(realmGet$upsellProducts);
            if (upsellProductsEntity != null) {
                j.realmSet$upsellProducts(upsellProductsEntity);
            } else {
                j.realmSet$upsellProducts(com_dodopizza_persistence_entity_personalization_UpsellProductsEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_personalization_UpsellProductsEntityRealmProxy.a) d0Var.u().e(UpsellProductsEntity.class), realmGet$upsellProducts, z, map, set));
            }
        }
        DeliveryExperimentEntity realmGet$deliveryExperimentInfo = personalizationEntity.realmGet$deliveryExperimentInfo();
        if (realmGet$deliveryExperimentInfo == null) {
            j.realmSet$deliveryExperimentInfo(null);
        } else {
            DeliveryExperimentEntity deliveryExperimentEntity = (DeliveryExperimentEntity) map.get(realmGet$deliveryExperimentInfo);
            if (deliveryExperimentEntity != null) {
                j.realmSet$deliveryExperimentInfo(deliveryExperimentEntity);
            } else {
                j.realmSet$deliveryExperimentInfo(com_dodopizza_persistence_entity_personalization_DeliveryExperimentEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_personalization_DeliveryExperimentEntityRealmProxy.a) d0Var.u().e(DeliveryExperimentEntity.class), realmGet$deliveryExperimentInfo, z, map, set));
            }
        }
        DynamicDeliveryEntity realmGet$dynamicDelivery = personalizationEntity.realmGet$dynamicDelivery();
        if (realmGet$dynamicDelivery == null) {
            j.realmSet$dynamicDelivery(null);
        } else {
            DynamicDeliveryEntity dynamicDeliveryEntity = (DynamicDeliveryEntity) map.get(realmGet$dynamicDelivery);
            if (dynamicDeliveryEntity != null) {
                j.realmSet$dynamicDelivery(dynamicDeliveryEntity);
            } else {
                j.realmSet$dynamicDelivery(com_dodopizza_persistence_entity_personalization_DynamicDeliveryEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_personalization_DynamicDeliveryEntityRealmProxy.a) d0Var.u().e(DynamicDeliveryEntity.class), realmGet$dynamicDelivery, z, map, set));
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
    public static com.dodopizza.persistence.entity.personalization.PersonalizationEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy.a r9, com.dodopizza.persistence.entity.personalization.PersonalizationEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.personalization.PersonalizationEntity r1 = (com.dodopizza.persistence.entity.personalization.PersonalizationEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.personalization.PersonalizationEntity> r2 = com.dodopizza.persistence.entity.personalization.PersonalizationEntity.class
            io.realm.internal.Table r2 = r8.I0(r2)
            long r3 = r9.k
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
            io.realm.com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.personalization.PersonalizationEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.personalization.PersonalizationEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy$a, com.dodopizza.persistence.entity.personalization.PersonalizationEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.personalization.PersonalizationEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static PersonalizationEntity f(PersonalizationEntity personalizationEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        PersonalizationEntity personalizationEntity2;
        if (i > i2 || personalizationEntity == null) {
            return null;
        }
        r89.a<o89> aVar = map.get(personalizationEntity);
        if (aVar == null) {
            personalizationEntity2 = new PersonalizationEntity();
            map.put(personalizationEntity, new r89.a<>(i, personalizationEntity2));
        } else if (i >= aVar.a) {
            return (PersonalizationEntity) aVar.b;
        } else {
            aVar.a = i;
            personalizationEntity2 = (PersonalizationEntity) aVar.b;
        }
        d0 d0Var = (d0) ((r89) personalizationEntity).a().f();
        if (i == i2) {
            personalizationEntity2.realmSet$menuPersonalPricesInfo(null);
        } else {
            k0<MenuPersonalPriceInfoEntity> realmGet$menuPersonalPricesInfo = personalizationEntity.realmGet$menuPersonalPricesInfo();
            k0<MenuPersonalPriceInfoEntity> k0Var = new k0<>();
            personalizationEntity2.realmSet$menuPersonalPricesInfo(k0Var);
            int i3 = i + 1;
            int size = realmGet$menuPersonalPricesInfo.size();
            for (int i4 = 0; i4 < size; i4++) {
                k0Var.add(com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy.f(realmGet$menuPersonalPricesInfo.get(i4), i3, i2, map));
            }
        }
        int i5 = i + 1;
        personalizationEntity2.realmSet$personalCategory(com_dodopizza_persistence_entity_personalization_PersonalCategoryEntityRealmProxy.f(personalizationEntity.realmGet$personalCategory(), i5, i2, map));
        personalizationEntity2.realmSet$upsellProducts(com_dodopizza_persistence_entity_personalization_UpsellProductsEntityRealmProxy.f(personalizationEntity.realmGet$upsellProducts(), i5, i2, map));
        personalizationEntity2.realmSet$deliveryExperimentInfo(com_dodopizza_persistence_entity_personalization_DeliveryExperimentEntityRealmProxy.f(personalizationEntity.realmGet$deliveryExperimentInfo(), i5, i2, map));
        personalizationEntity2.realmSet$expiredTime(personalizationEntity.realmGet$expiredTime());
        personalizationEntity2.realmSet$dynamicDelivery(com_dodopizza_persistence_entity_personalization_DynamicDeliveryEntityRealmProxy.f(personalizationEntity.realmGet$dynamicDelivery(), i5, i2, map));
        personalizationEntity2.realmSet$id(personalizationEntity.realmGet$id());
        return personalizationEntity2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "PersonalizationEntity", false, 7, 0);
        bVar.a("", "menuPersonalPricesInfo", RealmFieldType.LIST, "MenuPersonalPriceInfoEntity");
        RealmFieldType realmFieldType = RealmFieldType.OBJECT;
        bVar.a("", "personalCategory", realmFieldType, "PersonalCategoryEntity");
        bVar.a("", "upsellProducts", realmFieldType, "UpsellProductsEntity");
        bVar.a("", "deliveryExperimentInfo", realmFieldType, "DeliveryExperimentEntity");
        bVar.b("", "expiredTime", RealmFieldType.INTEGER, false, false, true);
        bVar.a("", "dynamicDelivery", realmFieldType, "DynamicDeliveryEntity");
        bVar.b("", "id", RealmFieldType.STRING, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return e;
    }

    public static long i(d0 d0Var, PersonalizationEntity personalizationEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        long j;
        if ((personalizationEntity instanceof r89) && !n0.isFrozen(personalizationEntity)) {
            r89 r89Var = (r89) personalizationEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(PersonalizationEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(PersonalizationEntity.class);
        long j2 = aVar.k;
        String realmGet$id = personalizationEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j2, realmGet$id);
        }
        long j3 = nativeFindFirstString;
        map.put(personalizationEntity, Long.valueOf(j3));
        OsList osList = new OsList(I0.r(j3), aVar.e);
        k0<MenuPersonalPriceInfoEntity> realmGet$menuPersonalPricesInfo = personalizationEntity.realmGet$menuPersonalPricesInfo();
        if (realmGet$menuPersonalPricesInfo != null && realmGet$menuPersonalPricesInfo.size() == osList.X()) {
            int size = realmGet$menuPersonalPricesInfo.size();
            int i = 0;
            while (i < size) {
                MenuPersonalPriceInfoEntity menuPersonalPriceInfoEntity = realmGet$menuPersonalPricesInfo.get(i);
                Long l = map.get(menuPersonalPriceInfoEntity);
                if (l == null) {
                    l = Long.valueOf(com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy.i(d0Var, menuPersonalPriceInfoEntity, map));
                }
                osList.U(i, l.longValue());
                i++;
                j3 = j3;
            }
            j = j3;
        } else {
            j = j3;
            osList.J();
            if (realmGet$menuPersonalPricesInfo != null) {
                Iterator<MenuPersonalPriceInfoEntity> it = realmGet$menuPersonalPricesInfo.iterator();
                while (it.hasNext()) {
                    MenuPersonalPriceInfoEntity next = it.next();
                    Long l2 = map.get(next);
                    if (l2 == null) {
                        l2 = Long.valueOf(com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy.i(d0Var, next, map));
                    }
                    osList.k(l2.longValue());
                }
            }
        }
        PersonalCategoryEntity realmGet$personalCategory = personalizationEntity.realmGet$personalCategory();
        if (realmGet$personalCategory != null) {
            Long l3 = map.get(realmGet$personalCategory);
            if (l3 == null) {
                l3 = Long.valueOf(com_dodopizza_persistence_entity_personalization_PersonalCategoryEntityRealmProxy.i(d0Var, realmGet$personalCategory, map));
            }
            Table.nativeSetLink(nativePtr, aVar.f, j, l3.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f, j);
        }
        UpsellProductsEntity realmGet$upsellProducts = personalizationEntity.realmGet$upsellProducts();
        if (realmGet$upsellProducts != null) {
            Long l4 = map.get(realmGet$upsellProducts);
            if (l4 == null) {
                l4 = Long.valueOf(com_dodopizza_persistence_entity_personalization_UpsellProductsEntityRealmProxy.i(d0Var, realmGet$upsellProducts, map));
            }
            Table.nativeSetLink(nativePtr, aVar.g, j, l4.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.g, j);
        }
        DeliveryExperimentEntity realmGet$deliveryExperimentInfo = personalizationEntity.realmGet$deliveryExperimentInfo();
        if (realmGet$deliveryExperimentInfo != null) {
            Long l5 = map.get(realmGet$deliveryExperimentInfo);
            if (l5 == null) {
                l5 = Long.valueOf(com_dodopizza_persistence_entity_personalization_DeliveryExperimentEntityRealmProxy.i(d0Var, realmGet$deliveryExperimentInfo, map));
            }
            Table.nativeSetLink(nativePtr, aVar.h, j, l5.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.h, j);
        }
        Table.nativeSetLong(nativePtr, aVar.i, j, personalizationEntity.realmGet$expiredTime(), false);
        DynamicDeliveryEntity realmGet$dynamicDelivery = personalizationEntity.realmGet$dynamicDelivery();
        if (realmGet$dynamicDelivery != null) {
            Long l6 = map.get(realmGet$dynamicDelivery);
            if (l6 == null) {
                l6 = Long.valueOf(com_dodopizza_persistence_entity_personalization_DynamicDeliveryEntityRealmProxy.i(d0Var, realmGet$dynamicDelivery, map));
            }
            Table.nativeSetLink(nativePtr, aVar.j, j, l6.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.j, j);
        }
        return j;
    }

    static com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(PersonalizationEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy com_dodopizza_persistence_entity_personalization_personalizationentityrealmproxy = new com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_personalization_personalizationentityrealmproxy;
    }

    static PersonalizationEntity k(d0 d0Var, a aVar, PersonalizationEntity personalizationEntity, PersonalizationEntity personalizationEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PersonalizationEntity.class), set);
        k0<MenuPersonalPriceInfoEntity> realmGet$menuPersonalPricesInfo = personalizationEntity2.realmGet$menuPersonalPricesInfo();
        if (realmGet$menuPersonalPricesInfo != null) {
            k0 k0Var = new k0();
            for (int i = 0; i < realmGet$menuPersonalPricesInfo.size(); i++) {
                MenuPersonalPriceInfoEntity menuPersonalPriceInfoEntity = realmGet$menuPersonalPricesInfo.get(i);
                MenuPersonalPriceInfoEntity menuPersonalPriceInfoEntity2 = (MenuPersonalPriceInfoEntity) map.get(menuPersonalPriceInfoEntity);
                if (menuPersonalPriceInfoEntity2 != null) {
                    k0Var.add(menuPersonalPriceInfoEntity2);
                } else {
                    k0Var.add(com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy.a) d0Var.u().e(MenuPersonalPriceInfoEntity.class), menuPersonalPriceInfoEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.e, k0Var);
        } else {
            osObjectBuilder.z0(aVar.e, new k0());
        }
        PersonalCategoryEntity realmGet$personalCategory = personalizationEntity2.realmGet$personalCategory();
        if (realmGet$personalCategory == null) {
            osObjectBuilder.r0(aVar.f);
        } else {
            PersonalCategoryEntity personalCategoryEntity = (PersonalCategoryEntity) map.get(realmGet$personalCategory);
            if (personalCategoryEntity != null) {
                osObjectBuilder.x0(aVar.f, personalCategoryEntity);
            } else {
                osObjectBuilder.x0(aVar.f, com_dodopizza_persistence_entity_personalization_PersonalCategoryEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_personalization_PersonalCategoryEntityRealmProxy.a) d0Var.u().e(PersonalCategoryEntity.class), realmGet$personalCategory, true, map, set));
            }
        }
        UpsellProductsEntity realmGet$upsellProducts = personalizationEntity2.realmGet$upsellProducts();
        if (realmGet$upsellProducts == null) {
            osObjectBuilder.r0(aVar.g);
        } else {
            UpsellProductsEntity upsellProductsEntity = (UpsellProductsEntity) map.get(realmGet$upsellProducts);
            if (upsellProductsEntity != null) {
                osObjectBuilder.x0(aVar.g, upsellProductsEntity);
            } else {
                osObjectBuilder.x0(aVar.g, com_dodopizza_persistence_entity_personalization_UpsellProductsEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_personalization_UpsellProductsEntityRealmProxy.a) d0Var.u().e(UpsellProductsEntity.class), realmGet$upsellProducts, true, map, set));
            }
        }
        DeliveryExperimentEntity realmGet$deliveryExperimentInfo = personalizationEntity2.realmGet$deliveryExperimentInfo();
        if (realmGet$deliveryExperimentInfo == null) {
            osObjectBuilder.r0(aVar.h);
        } else {
            DeliveryExperimentEntity deliveryExperimentEntity = (DeliveryExperimentEntity) map.get(realmGet$deliveryExperimentInfo);
            if (deliveryExperimentEntity != null) {
                osObjectBuilder.x0(aVar.h, deliveryExperimentEntity);
            } else {
                osObjectBuilder.x0(aVar.h, com_dodopizza_persistence_entity_personalization_DeliveryExperimentEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_personalization_DeliveryExperimentEntityRealmProxy.a) d0Var.u().e(DeliveryExperimentEntity.class), realmGet$deliveryExperimentInfo, true, map, set));
            }
        }
        osObjectBuilder.p0(aVar.i, Long.valueOf(personalizationEntity2.realmGet$expiredTime()));
        DynamicDeliveryEntity realmGet$dynamicDelivery = personalizationEntity2.realmGet$dynamicDelivery();
        if (realmGet$dynamicDelivery == null) {
            osObjectBuilder.r0(aVar.j);
        } else {
            DynamicDeliveryEntity dynamicDeliveryEntity = (DynamicDeliveryEntity) map.get(realmGet$dynamicDelivery);
            if (dynamicDeliveryEntity != null) {
                osObjectBuilder.x0(aVar.j, dynamicDeliveryEntity);
            } else {
                osObjectBuilder.x0(aVar.j, com_dodopizza_persistence_entity_personalization_DynamicDeliveryEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_personalization_DynamicDeliveryEntityRealmProxy.a) d0Var.u().e(DynamicDeliveryEntity.class), realmGet$dynamicDelivery, true, map, set));
            }
        }
        osObjectBuilder.E0(aVar.k, personalizationEntity2.realmGet$id());
        osObjectBuilder.K0();
        return personalizationEntity;
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
        c0<PersonalizationEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy com_dodopizza_persistence_entity_personalization_personalizationentityrealmproxy = (com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_personalization_personalizationentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_personalization_personalizationentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_personalization_personalizationentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.personalization.PersonalizationEntity, defpackage.lhc
    public DeliveryExperimentEntity realmGet$deliveryExperimentInfo() {
        this.c.f().c();
        if (this.c.g().o0(this.b.h)) {
            return null;
        }
        return (DeliveryExperimentEntity) this.c.f().o(DeliveryExperimentEntity.class, this.c.g().L(this.b.h), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.personalization.PersonalizationEntity, defpackage.lhc
    public DynamicDeliveryEntity realmGet$dynamicDelivery() {
        this.c.f().c();
        if (this.c.g().o0(this.b.j)) {
            return null;
        }
        return (DynamicDeliveryEntity) this.c.f().o(DynamicDeliveryEntity.class, this.c.g().L(this.b.j), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.personalization.PersonalizationEntity, defpackage.lhc
    public long realmGet$expiredTime() {
        this.c.f().c();
        return this.c.g().e0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.personalization.PersonalizationEntity, defpackage.lhc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.personalization.PersonalizationEntity, defpackage.lhc
    public k0<MenuPersonalPriceInfoEntity> realmGet$menuPersonalPricesInfo() {
        this.c.f().c();
        k0<MenuPersonalPriceInfoEntity> k0Var = this.d;
        if (k0Var != null) {
            return k0Var;
        }
        k0<MenuPersonalPriceInfoEntity> k0Var2 = new k0<>(MenuPersonalPriceInfoEntity.class, this.c.g().f0(this.b.e), this.c.f());
        this.d = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.personalization.PersonalizationEntity, defpackage.lhc
    public PersonalCategoryEntity realmGet$personalCategory() {
        this.c.f().c();
        if (this.c.g().o0(this.b.f)) {
            return null;
        }
        return (PersonalCategoryEntity) this.c.f().o(PersonalCategoryEntity.class, this.c.g().L(this.b.f), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.personalization.PersonalizationEntity, defpackage.lhc
    public UpsellProductsEntity realmGet$upsellProducts() {
        this.c.f().c();
        if (this.c.g().o0(this.b.g)) {
            return null;
        }
        return (UpsellProductsEntity) this.c.f().o(UpsellProductsEntity.class, this.c.g().L(this.b.g), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.personalization.PersonalizationEntity, defpackage.lhc
    public void realmSet$deliveryExperimentInfo(DeliveryExperimentEntity deliveryExperimentEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("deliveryExperimentInfo")) {
                return;
            }
            if (deliveryExperimentEntity != null && !n0.isManaged(deliveryExperimentEntity)) {
                deliveryExperimentEntity = (DeliveryExperimentEntity) d0Var.j0(deliveryExperimentEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (deliveryExperimentEntity == null) {
                g.l0(this.b.h);
                return;
            }
            this.c.c(deliveryExperimentEntity);
            g.o().B(this.b.h, g.E0(), ((r89) deliveryExperimentEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (deliveryExperimentEntity == null) {
            this.c.g().l0(this.b.h);
            return;
        }
        this.c.c(deliveryExperimentEntity);
        this.c.g().s(this.b.h, ((r89) deliveryExperimentEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.personalization.PersonalizationEntity, defpackage.lhc
    public void realmSet$dynamicDelivery(DynamicDeliveryEntity dynamicDeliveryEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("dynamicDelivery")) {
                return;
            }
            if (dynamicDeliveryEntity != null && !n0.isManaged(dynamicDeliveryEntity)) {
                dynamicDeliveryEntity = (DynamicDeliveryEntity) d0Var.j0(dynamicDeliveryEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (dynamicDeliveryEntity == null) {
                g.l0(this.b.j);
                return;
            }
            this.c.c(dynamicDeliveryEntity);
            g.o().B(this.b.j, g.E0(), ((r89) dynamicDeliveryEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (dynamicDeliveryEntity == null) {
            this.c.g().l0(this.b.j);
            return;
        }
        this.c.c(dynamicDeliveryEntity);
        this.c.g().s(this.b.j, ((r89) dynamicDeliveryEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.personalization.PersonalizationEntity, defpackage.lhc
    public void realmSet$expiredTime(long j) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.i, g.E0(), j, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.i, j);
    }

    @Override // com.dodopizza.persistence.entity.personalization.PersonalizationEntity, defpackage.lhc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.personalization.PersonalizationEntity, defpackage.lhc
    public void realmSet$menuPersonalPricesInfo(k0<MenuPersonalPriceInfoEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("menuPersonalPricesInfo")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<MenuPersonalPriceInfoEntity> k0Var2 = new k0<>();
                Iterator<MenuPersonalPriceInfoEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    MenuPersonalPriceInfoEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((MenuPersonalPriceInfoEntity) d0Var.j0(next, new ex4[0]));
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
                MenuPersonalPriceInfoEntity menuPersonalPriceInfoEntity = k0Var.get(i);
                this.c.c(menuPersonalPriceInfoEntity);
                f0.U(i, ((r89) menuPersonalPriceInfoEntity).a().g().E0());
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
            MenuPersonalPriceInfoEntity menuPersonalPriceInfoEntity2 = k0Var.get(i);
            this.c.c(menuPersonalPriceInfoEntity2);
            f0.k(((r89) menuPersonalPriceInfoEntity2).a().g().E0());
            i++;
        }
    }

    @Override // com.dodopizza.persistence.entity.personalization.PersonalizationEntity, defpackage.lhc
    public void realmSet$personalCategory(PersonalCategoryEntity personalCategoryEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("personalCategory")) {
                return;
            }
            if (personalCategoryEntity != null && !n0.isManaged(personalCategoryEntity)) {
                personalCategoryEntity = (PersonalCategoryEntity) d0Var.j0(personalCategoryEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (personalCategoryEntity == null) {
                g.l0(this.b.f);
                return;
            }
            this.c.c(personalCategoryEntity);
            g.o().B(this.b.f, g.E0(), ((r89) personalCategoryEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (personalCategoryEntity == null) {
            this.c.g().l0(this.b.f);
            return;
        }
        this.c.c(personalCategoryEntity);
        this.c.g().s(this.b.f, ((r89) personalCategoryEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.personalization.PersonalizationEntity, defpackage.lhc
    public void realmSet$upsellProducts(UpsellProductsEntity upsellProductsEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("upsellProducts")) {
                return;
            }
            if (upsellProductsEntity != null && !n0.isManaged(upsellProductsEntity)) {
                upsellProductsEntity = (UpsellProductsEntity) d0Var.j0(upsellProductsEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (upsellProductsEntity == null) {
                g.l0(this.b.g);
                return;
            }
            this.c.c(upsellProductsEntity);
            g.o().B(this.b.g, g.E0(), ((r89) upsellProductsEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (upsellProductsEntity == null) {
            this.c.g().l0(this.b.g);
            return;
        }
        this.c.c(upsellProductsEntity);
        this.c.g().s(this.b.g, ((r89) upsellProductsEntity).a().g().E0());
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("PersonalizationEntity = proxy[");
        sb.append("{menuPersonalPricesInfo:");
        sb.append("RealmList<MenuPersonalPriceInfoEntity>[");
        sb.append(realmGet$menuPersonalPricesInfo().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{personalCategory:");
        String str5 = "null";
        if (realmGet$personalCategory() == null) {
            str = "null";
        } else {
            str = "PersonalCategoryEntity";
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{upsellProducts:");
        if (realmGet$upsellProducts() == null) {
            str2 = "null";
        } else {
            str2 = "UpsellProductsEntity";
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{deliveryExperimentInfo:");
        if (realmGet$deliveryExperimentInfo() == null) {
            str3 = "null";
        } else {
            str3 = "DeliveryExperimentEntity";
        }
        sb.append(str3);
        sb.append("}");
        sb.append(",");
        sb.append("{expiredTime:");
        sb.append(realmGet$expiredTime());
        sb.append("}");
        sb.append(",");
        sb.append("{dynamicDelivery:");
        if (realmGet$dynamicDelivery() == null) {
            str4 = "null";
        } else {
            str4 = "DynamicDeliveryEntity";
        }
        sb.append(str4);
        sb.append("}");
        sb.append(",");
        sb.append("{id:");
        if (realmGet$id() != null) {
            str5 = realmGet$id();
        }
        sb.append(str5);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
