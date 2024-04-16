package io.realm;

import com.dodopizza.persistence.entity.locality.LegalInformationEntity;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.dodopizza.persistence.entity.locality.LocalityInfoEntity;
import com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity;
import com.dodopizza.persistence.entity.locality.SocialNetworkInfoEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_locality_LegalInformationEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_locality_SocialNetworkInfoEntityRealmProxy;
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
public class com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy extends LocalityInfoEntity implements r89, ngc {
    private static final OsObjectSchemaInfo f = g();
    private a b;
    private c0<LocalityInfoEntity> c;
    private k0<LegalInformationEntity> d;
    private k0<SocialNetworkInfoEntity> e;

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
            OsObjectSchemaInfo b = osSchemaInfo.b("LocalityInfoEntity");
            this.e = a("id", "id", b);
            this.f = a("localityId", "localityId", b);
            this.g = a("localityUuid", "localityUuid", b);
            this.h = a(LocalityEntity.FIELD_COUNTRY_CODE, LocalityEntity.FIELD_COUNTRY_CODE, b);
            this.i = a("mapUrl", "mapUrl", b);
            this.j = a("userAgreementUrl", "userAgreementUrl", b);
            this.k = a("userAgreementTitle", "userAgreementTitle", b);
            this.l = a("legalInformationList", "legalInformationList", b);
            this.m = a("socialNetworksList", "socialNetworksList", b);
            this.n = a("callCenterPhone", "callCenterPhone", b);
            this.o = a("isLanding", "isLanding", b);
            this.p = a("orderTypeDiscount", "orderTypeDiscount", b);
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
    public com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy() {
        this.c.p();
    }

    public static LocalityInfoEntity c(d0 d0Var, a aVar, LocalityInfoEntity localityInfoEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(localityInfoEntity);
        if (r89Var != null) {
            return (LocalityInfoEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(LocalityInfoEntity.class), set);
        osObjectBuilder.E0(aVar.e, localityInfoEntity.realmGet$id());
        osObjectBuilder.E0(aVar.f, localityInfoEntity.realmGet$localityId());
        osObjectBuilder.E0(aVar.g, localityInfoEntity.realmGet$localityUuid());
        osObjectBuilder.E0(aVar.h, localityInfoEntity.realmGet$countryCode());
        osObjectBuilder.E0(aVar.i, localityInfoEntity.realmGet$mapUrl());
        osObjectBuilder.E0(aVar.j, localityInfoEntity.realmGet$userAgreementUrl());
        osObjectBuilder.E0(aVar.k, localityInfoEntity.realmGet$userAgreementTitle());
        osObjectBuilder.E0(aVar.n, localityInfoEntity.realmGet$callCenterPhone());
        osObjectBuilder.j0(aVar.o, Boolean.valueOf(localityInfoEntity.realmGet$isLanding()));
        com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(localityInfoEntity, j);
        k0<LegalInformationEntity> realmGet$legalInformationList = localityInfoEntity.realmGet$legalInformationList();
        if (realmGet$legalInformationList != null) {
            k0<LegalInformationEntity> realmGet$legalInformationList2 = j.realmGet$legalInformationList();
            realmGet$legalInformationList2.clear();
            for (int i = 0; i < realmGet$legalInformationList.size(); i++) {
                LegalInformationEntity legalInformationEntity = realmGet$legalInformationList.get(i);
                LegalInformationEntity legalInformationEntity2 = (LegalInformationEntity) map.get(legalInformationEntity);
                if (legalInformationEntity2 != null) {
                    realmGet$legalInformationList2.add(legalInformationEntity2);
                } else {
                    realmGet$legalInformationList2.add(com_dodopizza_persistence_entity_locality_LegalInformationEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_locality_LegalInformationEntityRealmProxy.a) d0Var.u().e(LegalInformationEntity.class), legalInformationEntity, z, map, set));
                }
            }
        }
        k0<SocialNetworkInfoEntity> realmGet$socialNetworksList = localityInfoEntity.realmGet$socialNetworksList();
        if (realmGet$socialNetworksList != null) {
            k0<SocialNetworkInfoEntity> realmGet$socialNetworksList2 = j.realmGet$socialNetworksList();
            realmGet$socialNetworksList2.clear();
            for (int i2 = 0; i2 < realmGet$socialNetworksList.size(); i2++) {
                SocialNetworkInfoEntity socialNetworkInfoEntity = realmGet$socialNetworksList.get(i2);
                SocialNetworkInfoEntity socialNetworkInfoEntity2 = (SocialNetworkInfoEntity) map.get(socialNetworkInfoEntity);
                if (socialNetworkInfoEntity2 != null) {
                    realmGet$socialNetworksList2.add(socialNetworkInfoEntity2);
                } else {
                    realmGet$socialNetworksList2.add(com_dodopizza_persistence_entity_locality_SocialNetworkInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_locality_SocialNetworkInfoEntityRealmProxy.a) d0Var.u().e(SocialNetworkInfoEntity.class), socialNetworkInfoEntity, z, map, set));
                }
            }
        }
        OrderTypeDiscountEntity realmGet$orderTypeDiscount = localityInfoEntity.realmGet$orderTypeDiscount();
        if (realmGet$orderTypeDiscount == null) {
            j.realmSet$orderTypeDiscount(null);
        } else {
            OrderTypeDiscountEntity orderTypeDiscountEntity = (OrderTypeDiscountEntity) map.get(realmGet$orderTypeDiscount);
            if (orderTypeDiscountEntity != null) {
                j.realmSet$orderTypeDiscount(orderTypeDiscountEntity);
            } else {
                j.realmSet$orderTypeDiscount(com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy.a) d0Var.u().e(OrderTypeDiscountEntity.class), realmGet$orderTypeDiscount, z, map, set));
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
    public static com.dodopizza.persistence.entity.locality.LocalityInfoEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy.a r9, com.dodopizza.persistence.entity.locality.LocalityInfoEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.locality.LocalityInfoEntity r1 = (com.dodopizza.persistence.entity.locality.LocalityInfoEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.locality.LocalityInfoEntity> r2 = com.dodopizza.persistence.entity.locality.LocalityInfoEntity.class
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
            io.realm.com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.locality.LocalityInfoEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.locality.LocalityInfoEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy$a, com.dodopizza.persistence.entity.locality.LocalityInfoEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.locality.LocalityInfoEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static LocalityInfoEntity f(LocalityInfoEntity localityInfoEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        LocalityInfoEntity localityInfoEntity2;
        if (i > i2 || localityInfoEntity == null) {
            return null;
        }
        r89.a<o89> aVar = map.get(localityInfoEntity);
        if (aVar == null) {
            localityInfoEntity2 = new LocalityInfoEntity();
            map.put(localityInfoEntity, new r89.a<>(i, localityInfoEntity2));
        } else if (i >= aVar.a) {
            return (LocalityInfoEntity) aVar.b;
        } else {
            aVar.a = i;
            localityInfoEntity2 = (LocalityInfoEntity) aVar.b;
        }
        d0 d0Var = (d0) ((r89) localityInfoEntity).a().f();
        localityInfoEntity2.realmSet$id(localityInfoEntity.realmGet$id());
        localityInfoEntity2.realmSet$localityId(localityInfoEntity.realmGet$localityId());
        localityInfoEntity2.realmSet$localityUuid(localityInfoEntity.realmGet$localityUuid());
        localityInfoEntity2.realmSet$countryCode(localityInfoEntity.realmGet$countryCode());
        localityInfoEntity2.realmSet$mapUrl(localityInfoEntity.realmGet$mapUrl());
        localityInfoEntity2.realmSet$userAgreementUrl(localityInfoEntity.realmGet$userAgreementUrl());
        localityInfoEntity2.realmSet$userAgreementTitle(localityInfoEntity.realmGet$userAgreementTitle());
        if (i == i2) {
            localityInfoEntity2.realmSet$legalInformationList(null);
        } else {
            k0<LegalInformationEntity> realmGet$legalInformationList = localityInfoEntity.realmGet$legalInformationList();
            k0<LegalInformationEntity> k0Var = new k0<>();
            localityInfoEntity2.realmSet$legalInformationList(k0Var);
            int i3 = i + 1;
            int size = realmGet$legalInformationList.size();
            for (int i4 = 0; i4 < size; i4++) {
                k0Var.add(com_dodopizza_persistence_entity_locality_LegalInformationEntityRealmProxy.f(realmGet$legalInformationList.get(i4), i3, i2, map));
            }
        }
        if (i == i2) {
            localityInfoEntity2.realmSet$socialNetworksList(null);
        } else {
            k0<SocialNetworkInfoEntity> realmGet$socialNetworksList = localityInfoEntity.realmGet$socialNetworksList();
            k0<SocialNetworkInfoEntity> k0Var2 = new k0<>();
            localityInfoEntity2.realmSet$socialNetworksList(k0Var2);
            int i5 = i + 1;
            int size2 = realmGet$socialNetworksList.size();
            for (int i6 = 0; i6 < size2; i6++) {
                k0Var2.add(com_dodopizza_persistence_entity_locality_SocialNetworkInfoEntityRealmProxy.f(realmGet$socialNetworksList.get(i6), i5, i2, map));
            }
        }
        localityInfoEntity2.realmSet$callCenterPhone(localityInfoEntity.realmGet$callCenterPhone());
        localityInfoEntity2.realmSet$isLanding(localityInfoEntity.realmGet$isLanding());
        localityInfoEntity2.realmSet$orderTypeDiscount(com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy.f(localityInfoEntity.realmGet$orderTypeDiscount(), i + 1, i2, map));
        return localityInfoEntity2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "LocalityInfoEntity", false, 12, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, false);
        bVar.b("", "localityId", realmFieldType, false, false, true);
        bVar.b("", "localityUuid", realmFieldType, false, false, true);
        bVar.b("", LocalityEntity.FIELD_COUNTRY_CODE, realmFieldType, false, false, true);
        bVar.b("", "mapUrl", realmFieldType, false, false, true);
        bVar.b("", "userAgreementUrl", realmFieldType, false, false, true);
        bVar.b("", "userAgreementTitle", realmFieldType, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.LIST;
        bVar.a("", "legalInformationList", realmFieldType2, "LegalInformationEntity");
        bVar.a("", "socialNetworksList", realmFieldType2, "SocialNetworkInfoEntity");
        bVar.b("", "callCenterPhone", realmFieldType, false, false, true);
        bVar.b("", "isLanding", RealmFieldType.BOOLEAN, false, false, true);
        bVar.a("", "orderTypeDiscount", RealmFieldType.OBJECT, "OrderTypeDiscountEntity");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f;
    }

    public static long i(d0 d0Var, LocalityInfoEntity localityInfoEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        long j;
        long j2;
        long j3;
        long j4;
        if ((localityInfoEntity instanceof r89) && !n0.isFrozen(localityInfoEntity)) {
            r89 r89Var = (r89) localityInfoEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(LocalityInfoEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(LocalityInfoEntity.class);
        long j5 = aVar.e;
        String realmGet$id = localityInfoEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j5);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j5, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j5, realmGet$id);
        }
        long j6 = nativeFindFirstString;
        map.put(localityInfoEntity, Long.valueOf(j6));
        String realmGet$localityId = localityInfoEntity.realmGet$localityId();
        if (realmGet$localityId != null) {
            j = j6;
            Table.nativeSetString(nativePtr, aVar.f, j6, realmGet$localityId, false);
        } else {
            j = j6;
            Table.nativeSetNull(nativePtr, aVar.f, j, false);
        }
        String realmGet$localityUuid = localityInfoEntity.realmGet$localityUuid();
        if (realmGet$localityUuid != null) {
            Table.nativeSetString(nativePtr, aVar.g, j, realmGet$localityUuid, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j, false);
        }
        String realmGet$countryCode = localityInfoEntity.realmGet$countryCode();
        if (realmGet$countryCode != null) {
            Table.nativeSetString(nativePtr, aVar.h, j, realmGet$countryCode, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, j, false);
        }
        String realmGet$mapUrl = localityInfoEntity.realmGet$mapUrl();
        if (realmGet$mapUrl != null) {
            Table.nativeSetString(nativePtr, aVar.i, j, realmGet$mapUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.i, j, false);
        }
        String realmGet$userAgreementUrl = localityInfoEntity.realmGet$userAgreementUrl();
        if (realmGet$userAgreementUrl != null) {
            Table.nativeSetString(nativePtr, aVar.j, j, realmGet$userAgreementUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.j, j, false);
        }
        String realmGet$userAgreementTitle = localityInfoEntity.realmGet$userAgreementTitle();
        if (realmGet$userAgreementTitle != null) {
            Table.nativeSetString(nativePtr, aVar.k, j, realmGet$userAgreementTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.k, j, false);
        }
        long j7 = j;
        OsList osList = new OsList(I0.r(j7), aVar.l);
        k0<LegalInformationEntity> realmGet$legalInformationList = localityInfoEntity.realmGet$legalInformationList();
        if (realmGet$legalInformationList != null && realmGet$legalInformationList.size() == osList.X()) {
            int size = realmGet$legalInformationList.size();
            int i = 0;
            while (i < size) {
                LegalInformationEntity legalInformationEntity = realmGet$legalInformationList.get(i);
                Long l = map.get(legalInformationEntity);
                if (l == null) {
                    l = Long.valueOf(com_dodopizza_persistence_entity_locality_LegalInformationEntityRealmProxy.i(d0Var, legalInformationEntity, map));
                }
                osList.U(i, l.longValue());
                i++;
                size = size;
                j7 = j7;
            }
            j2 = j7;
        } else {
            j2 = j7;
            osList.J();
            if (realmGet$legalInformationList != null) {
                Iterator<LegalInformationEntity> it = realmGet$legalInformationList.iterator();
                while (it.hasNext()) {
                    LegalInformationEntity next = it.next();
                    Long l2 = map.get(next);
                    if (l2 == null) {
                        l2 = Long.valueOf(com_dodopizza_persistence_entity_locality_LegalInformationEntityRealmProxy.i(d0Var, next, map));
                    }
                    osList.k(l2.longValue());
                }
            }
        }
        long j8 = j2;
        OsList osList2 = new OsList(I0.r(j8), aVar.m);
        k0<SocialNetworkInfoEntity> realmGet$socialNetworksList = localityInfoEntity.realmGet$socialNetworksList();
        if (realmGet$socialNetworksList != null && realmGet$socialNetworksList.size() == osList2.X()) {
            int size2 = realmGet$socialNetworksList.size();
            int i2 = 0;
            while (i2 < size2) {
                SocialNetworkInfoEntity socialNetworkInfoEntity = realmGet$socialNetworksList.get(i2);
                Long l3 = map.get(socialNetworkInfoEntity);
                if (l3 == null) {
                    l3 = Long.valueOf(com_dodopizza_persistence_entity_locality_SocialNetworkInfoEntityRealmProxy.i(d0Var, socialNetworkInfoEntity, map));
                }
                osList2.U(i2, l3.longValue());
                i2++;
                j8 = j8;
            }
            j3 = j8;
        } else {
            j3 = j8;
            osList2.J();
            if (realmGet$socialNetworksList != null) {
                Iterator<SocialNetworkInfoEntity> it2 = realmGet$socialNetworksList.iterator();
                while (it2.hasNext()) {
                    SocialNetworkInfoEntity next2 = it2.next();
                    Long l4 = map.get(next2);
                    if (l4 == null) {
                        l4 = Long.valueOf(com_dodopizza_persistence_entity_locality_SocialNetworkInfoEntityRealmProxy.i(d0Var, next2, map));
                    }
                    osList2.k(l4.longValue());
                }
            }
        }
        String realmGet$callCenterPhone = localityInfoEntity.realmGet$callCenterPhone();
        if (realmGet$callCenterPhone != null) {
            j4 = j3;
            Table.nativeSetString(nativePtr, aVar.n, j4, realmGet$callCenterPhone, false);
        } else {
            j4 = j3;
            Table.nativeSetNull(nativePtr, aVar.n, j4, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.o, j4, localityInfoEntity.realmGet$isLanding(), false);
        OrderTypeDiscountEntity realmGet$orderTypeDiscount = localityInfoEntity.realmGet$orderTypeDiscount();
        if (realmGet$orderTypeDiscount != null) {
            Long l5 = map.get(realmGet$orderTypeDiscount);
            if (l5 == null) {
                l5 = Long.valueOf(com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy.i(d0Var, realmGet$orderTypeDiscount, map));
            }
            Table.nativeSetLink(nativePtr, aVar.p, j4, l5.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.p, j4);
        }
        return j4;
    }

    static com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(LocalityInfoEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy com_dodopizza_persistence_entity_locality_localityinfoentityrealmproxy = new com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_locality_localityinfoentityrealmproxy;
    }

    static LocalityInfoEntity k(d0 d0Var, a aVar, LocalityInfoEntity localityInfoEntity, LocalityInfoEntity localityInfoEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(LocalityInfoEntity.class), set);
        osObjectBuilder.E0(aVar.e, localityInfoEntity2.realmGet$id());
        osObjectBuilder.E0(aVar.f, localityInfoEntity2.realmGet$localityId());
        osObjectBuilder.E0(aVar.g, localityInfoEntity2.realmGet$localityUuid());
        osObjectBuilder.E0(aVar.h, localityInfoEntity2.realmGet$countryCode());
        osObjectBuilder.E0(aVar.i, localityInfoEntity2.realmGet$mapUrl());
        osObjectBuilder.E0(aVar.j, localityInfoEntity2.realmGet$userAgreementUrl());
        osObjectBuilder.E0(aVar.k, localityInfoEntity2.realmGet$userAgreementTitle());
        k0<LegalInformationEntity> realmGet$legalInformationList = localityInfoEntity2.realmGet$legalInformationList();
        if (realmGet$legalInformationList != null) {
            k0 k0Var = new k0();
            for (int i = 0; i < realmGet$legalInformationList.size(); i++) {
                LegalInformationEntity legalInformationEntity = realmGet$legalInformationList.get(i);
                LegalInformationEntity legalInformationEntity2 = (LegalInformationEntity) map.get(legalInformationEntity);
                if (legalInformationEntity2 != null) {
                    k0Var.add(legalInformationEntity2);
                } else {
                    k0Var.add(com_dodopizza_persistence_entity_locality_LegalInformationEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_locality_LegalInformationEntityRealmProxy.a) d0Var.u().e(LegalInformationEntity.class), legalInformationEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.l, k0Var);
        } else {
            osObjectBuilder.z0(aVar.l, new k0());
        }
        k0<SocialNetworkInfoEntity> realmGet$socialNetworksList = localityInfoEntity2.realmGet$socialNetworksList();
        if (realmGet$socialNetworksList != null) {
            k0 k0Var2 = new k0();
            for (int i2 = 0; i2 < realmGet$socialNetworksList.size(); i2++) {
                SocialNetworkInfoEntity socialNetworkInfoEntity = realmGet$socialNetworksList.get(i2);
                SocialNetworkInfoEntity socialNetworkInfoEntity2 = (SocialNetworkInfoEntity) map.get(socialNetworkInfoEntity);
                if (socialNetworkInfoEntity2 != null) {
                    k0Var2.add(socialNetworkInfoEntity2);
                } else {
                    k0Var2.add(com_dodopizza_persistence_entity_locality_SocialNetworkInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_locality_SocialNetworkInfoEntityRealmProxy.a) d0Var.u().e(SocialNetworkInfoEntity.class), socialNetworkInfoEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.m, k0Var2);
        } else {
            osObjectBuilder.z0(aVar.m, new k0());
        }
        osObjectBuilder.E0(aVar.n, localityInfoEntity2.realmGet$callCenterPhone());
        osObjectBuilder.j0(aVar.o, Boolean.valueOf(localityInfoEntity2.realmGet$isLanding()));
        OrderTypeDiscountEntity realmGet$orderTypeDiscount = localityInfoEntity2.realmGet$orderTypeDiscount();
        if (realmGet$orderTypeDiscount == null) {
            osObjectBuilder.r0(aVar.p);
        } else {
            OrderTypeDiscountEntity orderTypeDiscountEntity = (OrderTypeDiscountEntity) map.get(realmGet$orderTypeDiscount);
            if (orderTypeDiscountEntity != null) {
                osObjectBuilder.x0(aVar.p, orderTypeDiscountEntity);
            } else {
                osObjectBuilder.x0(aVar.p, com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy.a) d0Var.u().e(OrderTypeDiscountEntity.class), realmGet$orderTypeDiscount, true, map, set));
            }
        }
        osObjectBuilder.K0();
        return localityInfoEntity;
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
        c0<LocalityInfoEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy com_dodopizza_persistence_entity_locality_localityinfoentityrealmproxy = (com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy) obj;
        io.realm.a f2 = this.c.f();
        io.realm.a f3 = com_dodopizza_persistence_entity_locality_localityinfoentityrealmproxy.c.f();
        String path = f2.getPath();
        String path2 = f3.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f2.E() != f3.E() || !f2.e.getVersionID().equals(f3.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_locality_localityinfoentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_locality_localityinfoentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public String realmGet$callCenterPhone() {
        this.c.f().c();
        return this.c.g().p0(this.b.n);
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public String realmGet$countryCode() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public boolean realmGet$isLanding() {
        this.c.f().c();
        return this.c.g().b0(this.b.o);
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public k0<LegalInformationEntity> realmGet$legalInformationList() {
        this.c.f().c();
        k0<LegalInformationEntity> k0Var = this.d;
        if (k0Var != null) {
            return k0Var;
        }
        k0<LegalInformationEntity> k0Var2 = new k0<>(LegalInformationEntity.class, this.c.g().f0(this.b.l), this.c.f());
        this.d = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public String realmGet$localityId() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public String realmGet$localityUuid() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public String realmGet$mapUrl() {
        this.c.f().c();
        return this.c.g().p0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public OrderTypeDiscountEntity realmGet$orderTypeDiscount() {
        this.c.f().c();
        if (this.c.g().o0(this.b.p)) {
            return null;
        }
        return (OrderTypeDiscountEntity) this.c.f().o(OrderTypeDiscountEntity.class, this.c.g().L(this.b.p), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public k0<SocialNetworkInfoEntity> realmGet$socialNetworksList() {
        this.c.f().c();
        k0<SocialNetworkInfoEntity> k0Var = this.e;
        if (k0Var != null) {
            return k0Var;
        }
        k0<SocialNetworkInfoEntity> k0Var2 = new k0<>(SocialNetworkInfoEntity.class, this.c.g().f0(this.b.m), this.c.f());
        this.e = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public String realmGet$userAgreementTitle() {
        this.c.f().c();
        return this.c.g().p0(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public String realmGet$userAgreementUrl() {
        this.c.f().c();
        return this.c.g().p0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public void realmSet$callCenterPhone(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.n, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'callCenterPhone' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.n, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'callCenterPhone' to null.");
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public void realmSet$countryCode(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.h, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'countryCode' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.h, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'countryCode' to null.");
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public void realmSet$isLanding(boolean z) {
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

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public void realmSet$legalInformationList(k0<LegalInformationEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("legalInformationList")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<LegalInformationEntity> k0Var2 = new k0<>();
                Iterator<LegalInformationEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    LegalInformationEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((LegalInformationEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.l);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i < size) {
                LegalInformationEntity legalInformationEntity = k0Var.get(i);
                this.c.c(legalInformationEntity);
                f0.U(i, ((r89) legalInformationEntity).a().g().E0());
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
            LegalInformationEntity legalInformationEntity2 = k0Var.get(i);
            this.c.c(legalInformationEntity2);
            f0.k(((r89) legalInformationEntity2).a().g().E0());
            i++;
        }
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public void realmSet$localityId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.f, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'localityId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'localityId' to null.");
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public void realmSet$localityUuid(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.g, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'localityUuid' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'localityUuid' to null.");
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public void realmSet$mapUrl(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.i, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'mapUrl' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.i, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'mapUrl' to null.");
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public void realmSet$orderTypeDiscount(OrderTypeDiscountEntity orderTypeDiscountEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("orderTypeDiscount")) {
                return;
            }
            if (orderTypeDiscountEntity != null && !n0.isManaged(orderTypeDiscountEntity)) {
                orderTypeDiscountEntity = (OrderTypeDiscountEntity) d0Var.j0(orderTypeDiscountEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (orderTypeDiscountEntity == null) {
                g.l0(this.b.p);
                return;
            }
            this.c.c(orderTypeDiscountEntity);
            g.o().B(this.b.p, g.E0(), ((r89) orderTypeDiscountEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (orderTypeDiscountEntity == null) {
            this.c.g().l0(this.b.p);
            return;
        }
        this.c.c(orderTypeDiscountEntity);
        this.c.g().s(this.b.p, ((r89) orderTypeDiscountEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public void realmSet$socialNetworksList(k0<SocialNetworkInfoEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("socialNetworksList")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<SocialNetworkInfoEntity> k0Var2 = new k0<>();
                Iterator<SocialNetworkInfoEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    SocialNetworkInfoEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((SocialNetworkInfoEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.m);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i < size) {
                SocialNetworkInfoEntity socialNetworkInfoEntity = k0Var.get(i);
                this.c.c(socialNetworkInfoEntity);
                f0.U(i, ((r89) socialNetworkInfoEntity).a().g().E0());
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
            SocialNetworkInfoEntity socialNetworkInfoEntity2 = k0Var.get(i);
            this.c.c(socialNetworkInfoEntity2);
            f0.k(((r89) socialNetworkInfoEntity2).a().g().E0());
            i++;
        }
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public void realmSet$userAgreementTitle(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.k, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'userAgreementTitle' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.k, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'userAgreementTitle' to null.");
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityInfoEntity, defpackage.ngc
    public void realmSet$userAgreementUrl(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.j, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'userAgreementUrl' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.j, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'userAgreementUrl' to null.");
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("LocalityInfoEntity = proxy[");
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
        sb.append("{localityId:");
        sb.append(realmGet$localityId());
        sb.append("}");
        sb.append(",");
        sb.append("{localityUuid:");
        sb.append(realmGet$localityUuid());
        sb.append("}");
        sb.append(",");
        sb.append("{countryCode:");
        sb.append(realmGet$countryCode());
        sb.append("}");
        sb.append(",");
        sb.append("{mapUrl:");
        sb.append(realmGet$mapUrl());
        sb.append("}");
        sb.append(",");
        sb.append("{userAgreementUrl:");
        sb.append(realmGet$userAgreementUrl());
        sb.append("}");
        sb.append(",");
        sb.append("{userAgreementTitle:");
        sb.append(realmGet$userAgreementTitle());
        sb.append("}");
        sb.append(",");
        sb.append("{legalInformationList:");
        sb.append("RealmList<LegalInformationEntity>[");
        sb.append(realmGet$legalInformationList().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{socialNetworksList:");
        sb.append("RealmList<SocialNetworkInfoEntity>[");
        sb.append(realmGet$socialNetworksList().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{callCenterPhone:");
        sb.append(realmGet$callCenterPhone());
        sb.append("}");
        sb.append(",");
        sb.append("{isLanding:");
        sb.append(realmGet$isLanding());
        sb.append("}");
        sb.append(",");
        sb.append("{orderTypeDiscount:");
        if (realmGet$orderTypeDiscount() != null) {
            str2 = "OrderTypeDiscountEntity";
        }
        sb.append(str2);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
