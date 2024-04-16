package io.realm;

import ch.qos.logback.core.joran.action.Action;
import com.appsflyer.AppsFlyerProperties;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.CountryEntity;
import defpackage.r89;
import io.realm.a;
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
public class com_dodopizza_persistence_entity_CountryEntityRealmProxy extends CountryEntity implements r89, sec {
    private static final OsObjectSchemaInfo f = g();
    private a b;
    private c0<CountryEntity> c;
    private k0<String> d;
    private k0<String> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long A;
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
            super(23);
            OsObjectSchemaInfo b = osSchemaInfo.b("CountryEntity");
            this.e = a("id", "id", b);
            this.f = a(Action.NAME_ATTRIBUTE, Action.NAME_ATTRIBUTE, b);
            this.g = a("code", "code", b);
            this.h = a("isoName", "isoName", b);
            this.i = a(AppsFlyerProperties.CURRENCY_CODE, AppsFlyerProperties.CURRENCY_CODE, b);
            this.j = a("customSymbol", "customSymbol", b);
            this.k = a("phoneCode", "phoneCode", b);
            this.l = a("phoneMask", "phoneMask", b);
            this.m = a("feedbackPhone", "feedbackPhone", b);
            this.n = a("feedbackEmail", "feedbackEmail", b);
            this.o = a("languages", "languages", b);
            this.p = a("features", "features", b);
            this.q = a("state", "state", b);
            this.r = a("controllingWebsite", "controllingWebsite", b);
            this.s = a("generalWebsite", "generalWebsite", b);
            this.t = a("recruitingWebsite", "recruitingWebsite", b);
            this.u = a("noGloves", "noGloves", b);
            this.v = a("baseUrl", "baseUrl", b);
            this.w = a(BonusActionEntity.ORDER, BonusActionEntity.ORDER, b);
            this.x = a("mapBoundsUpperLeftCornerLat", "mapBoundsUpperLeftCornerLat", b);
            this.y = a("mapBoundsUpperLeftCornerLon", "mapBoundsUpperLeftCornerLon", b);
            this.z = a("mapBoundsLowerRightCornerLat", "mapBoundsLowerRightCornerLat", b);
            this.A = a("mapBoundsLowerRightCornerLon", "mapBoundsLowerRightCornerLon", b);
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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_CountryEntityRealmProxy() {
        this.c.p();
    }

    public static CountryEntity c(d0 d0Var, a aVar, CountryEntity countryEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(countryEntity);
        if (r89Var != null) {
            return (CountryEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(CountryEntity.class), set);
        osObjectBuilder.E0(aVar.e, countryEntity.realmGet$id());
        osObjectBuilder.E0(aVar.f, countryEntity.realmGet$name());
        osObjectBuilder.E0(aVar.g, countryEntity.realmGet$code());
        osObjectBuilder.E0(aVar.h, countryEntity.realmGet$isoName());
        osObjectBuilder.E0(aVar.i, countryEntity.realmGet$currencyCode());
        osObjectBuilder.E0(aVar.j, countryEntity.realmGet$customSymbol());
        osObjectBuilder.E0(aVar.k, countryEntity.realmGet$phoneCode());
        osObjectBuilder.E0(aVar.l, countryEntity.realmGet$phoneMask());
        osObjectBuilder.E0(aVar.m, countryEntity.realmGet$feedbackPhone());
        osObjectBuilder.E0(aVar.n, countryEntity.realmGet$feedbackEmail());
        osObjectBuilder.F0(aVar.o, countryEntity.realmGet$languages());
        osObjectBuilder.F0(aVar.p, countryEntity.realmGet$features());
        osObjectBuilder.o0(aVar.q, Integer.valueOf(countryEntity.realmGet$state()));
        osObjectBuilder.E0(aVar.r, countryEntity.realmGet$controllingWebsite());
        osObjectBuilder.E0(aVar.s, countryEntity.realmGet$generalWebsite());
        osObjectBuilder.E0(aVar.t, countryEntity.realmGet$recruitingWebsite());
        osObjectBuilder.E0(aVar.u, countryEntity.realmGet$noGloves());
        osObjectBuilder.E0(aVar.v, countryEntity.realmGet$baseUrl());
        osObjectBuilder.o0(aVar.w, Integer.valueOf(countryEntity.realmGet$order()));
        osObjectBuilder.l0(aVar.x, Double.valueOf(countryEntity.realmGet$mapBoundsUpperLeftCornerLat()));
        osObjectBuilder.l0(aVar.y, Double.valueOf(countryEntity.realmGet$mapBoundsUpperLeftCornerLon()));
        osObjectBuilder.l0(aVar.z, Double.valueOf(countryEntity.realmGet$mapBoundsLowerRightCornerLat()));
        osObjectBuilder.l0(aVar.A, Double.valueOf(countryEntity.realmGet$mapBoundsLowerRightCornerLon()));
        com_dodopizza_persistence_entity_CountryEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(countryEntity, j);
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dodopizza.persistence.entity.CountryEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_CountryEntityRealmProxy.a r9, com.dodopizza.persistence.entity.CountryEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.CountryEntity r1 = (com.dodopizza.persistence.entity.CountryEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.CountryEntity> r2 = com.dodopizza.persistence.entity.CountryEntity.class
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
            io.realm.com_dodopizza_persistence_entity_CountryEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_CountryEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.CountryEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.CountryEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_CountryEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_CountryEntityRealmProxy$a, com.dodopizza.persistence.entity.CountryEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.CountryEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static CountryEntity f(CountryEntity countryEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        CountryEntity countryEntity2;
        if (i <= i2 && countryEntity != null) {
            r89.a<o89> aVar = map.get(countryEntity);
            if (aVar == null) {
                countryEntity2 = new CountryEntity();
                map.put(countryEntity, new r89.a<>(i, countryEntity2));
            } else if (i >= aVar.a) {
                return (CountryEntity) aVar.b;
            } else {
                aVar.a = i;
                countryEntity2 = (CountryEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) countryEntity).a().f();
            countryEntity2.realmSet$id(countryEntity.realmGet$id());
            countryEntity2.realmSet$name(countryEntity.realmGet$name());
            countryEntity2.realmSet$code(countryEntity.realmGet$code());
            countryEntity2.realmSet$isoName(countryEntity.realmGet$isoName());
            countryEntity2.realmSet$currencyCode(countryEntity.realmGet$currencyCode());
            countryEntity2.realmSet$customSymbol(countryEntity.realmGet$customSymbol());
            countryEntity2.realmSet$phoneCode(countryEntity.realmGet$phoneCode());
            countryEntity2.realmSet$phoneMask(countryEntity.realmGet$phoneMask());
            countryEntity2.realmSet$feedbackPhone(countryEntity.realmGet$feedbackPhone());
            countryEntity2.realmSet$feedbackEmail(countryEntity.realmGet$feedbackEmail());
            countryEntity2.realmSet$languages(new k0<>());
            countryEntity2.realmGet$languages().addAll(countryEntity.realmGet$languages());
            countryEntity2.realmSet$features(new k0<>());
            countryEntity2.realmGet$features().addAll(countryEntity.realmGet$features());
            countryEntity2.realmSet$state(countryEntity.realmGet$state());
            countryEntity2.realmSet$controllingWebsite(countryEntity.realmGet$controllingWebsite());
            countryEntity2.realmSet$generalWebsite(countryEntity.realmGet$generalWebsite());
            countryEntity2.realmSet$recruitingWebsite(countryEntity.realmGet$recruitingWebsite());
            countryEntity2.realmSet$noGloves(countryEntity.realmGet$noGloves());
            countryEntity2.realmSet$baseUrl(countryEntity.realmGet$baseUrl());
            countryEntity2.realmSet$order(countryEntity.realmGet$order());
            countryEntity2.realmSet$mapBoundsUpperLeftCornerLat(countryEntity.realmGet$mapBoundsUpperLeftCornerLat());
            countryEntity2.realmSet$mapBoundsUpperLeftCornerLon(countryEntity.realmGet$mapBoundsUpperLeftCornerLon());
            countryEntity2.realmSet$mapBoundsLowerRightCornerLat(countryEntity.realmGet$mapBoundsLowerRightCornerLat());
            countryEntity2.realmSet$mapBoundsLowerRightCornerLon(countryEntity.realmGet$mapBoundsLowerRightCornerLon());
            return countryEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "CountryEntity", false, 23, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, false);
        bVar.b("", Action.NAME_ATTRIBUTE, realmFieldType, false, false, true);
        bVar.b("", "code", realmFieldType, false, false, true);
        bVar.b("", "isoName", realmFieldType, false, false, true);
        bVar.b("", AppsFlyerProperties.CURRENCY_CODE, realmFieldType, false, false, true);
        bVar.b("", "customSymbol", realmFieldType, false, false, false);
        bVar.b("", "phoneCode", realmFieldType, false, false, true);
        bVar.b("", "phoneMask", realmFieldType, false, false, true);
        bVar.b("", "feedbackPhone", realmFieldType, false, false, true);
        bVar.b("", "feedbackEmail", realmFieldType, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.STRING_LIST;
        bVar.c("", "languages", realmFieldType2, false);
        bVar.c("", "features", realmFieldType2, false);
        RealmFieldType realmFieldType3 = RealmFieldType.INTEGER;
        bVar.b("", "state", realmFieldType3, false, false, true);
        bVar.b("", "controllingWebsite", realmFieldType, false, false, true);
        bVar.b("", "generalWebsite", realmFieldType, false, false, true);
        bVar.b("", "recruitingWebsite", realmFieldType, false, false, true);
        bVar.b("", "noGloves", realmFieldType, false, false, true);
        bVar.b("", "baseUrl", realmFieldType, false, false, true);
        bVar.b("", BonusActionEntity.ORDER, realmFieldType3, false, false, true);
        RealmFieldType realmFieldType4 = RealmFieldType.DOUBLE;
        bVar.b("", "mapBoundsUpperLeftCornerLat", realmFieldType4, false, false, true);
        bVar.b("", "mapBoundsUpperLeftCornerLon", realmFieldType4, false, false, true);
        bVar.b("", "mapBoundsLowerRightCornerLat", realmFieldType4, false, false, true);
        bVar.b("", "mapBoundsLowerRightCornerLon", realmFieldType4, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f;
    }

    public static long i(d0 d0Var, CountryEntity countryEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        long j;
        if ((countryEntity instanceof r89) && !n0.isFrozen(countryEntity)) {
            r89 r89Var = (r89) countryEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(CountryEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(CountryEntity.class);
        long j2 = aVar.e;
        String realmGet$id = countryEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j2, realmGet$id);
        }
        long j3 = nativeFindFirstString;
        map.put(countryEntity, Long.valueOf(j3));
        String realmGet$name = countryEntity.realmGet$name();
        if (realmGet$name != null) {
            j = j3;
            Table.nativeSetString(nativePtr, aVar.f, j3, realmGet$name, false);
        } else {
            j = j3;
            Table.nativeSetNull(nativePtr, aVar.f, j, false);
        }
        String realmGet$code = countryEntity.realmGet$code();
        if (realmGet$code != null) {
            Table.nativeSetString(nativePtr, aVar.g, j, realmGet$code, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j, false);
        }
        String realmGet$isoName = countryEntity.realmGet$isoName();
        if (realmGet$isoName != null) {
            Table.nativeSetString(nativePtr, aVar.h, j, realmGet$isoName, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, j, false);
        }
        String realmGet$currencyCode = countryEntity.realmGet$currencyCode();
        if (realmGet$currencyCode != null) {
            Table.nativeSetString(nativePtr, aVar.i, j, realmGet$currencyCode, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.i, j, false);
        }
        String realmGet$customSymbol = countryEntity.realmGet$customSymbol();
        if (realmGet$customSymbol != null) {
            Table.nativeSetString(nativePtr, aVar.j, j, realmGet$customSymbol, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.j, j, false);
        }
        String realmGet$phoneCode = countryEntity.realmGet$phoneCode();
        if (realmGet$phoneCode != null) {
            Table.nativeSetString(nativePtr, aVar.k, j, realmGet$phoneCode, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.k, j, false);
        }
        String realmGet$phoneMask = countryEntity.realmGet$phoneMask();
        if (realmGet$phoneMask != null) {
            Table.nativeSetString(nativePtr, aVar.l, j, realmGet$phoneMask, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.l, j, false);
        }
        String realmGet$feedbackPhone = countryEntity.realmGet$feedbackPhone();
        if (realmGet$feedbackPhone != null) {
            Table.nativeSetString(nativePtr, aVar.m, j, realmGet$feedbackPhone, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.m, j, false);
        }
        String realmGet$feedbackEmail = countryEntity.realmGet$feedbackEmail();
        if (realmGet$feedbackEmail != null) {
            Table.nativeSetString(nativePtr, aVar.n, j, realmGet$feedbackEmail, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.n, j, false);
        }
        long j4 = j;
        OsList osList = new OsList(I0.r(j4), aVar.o);
        osList.J();
        k0<String> realmGet$languages = countryEntity.realmGet$languages();
        if (realmGet$languages != null) {
            Iterator<String> it = realmGet$languages.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.h();
                } else {
                    osList.l(next);
                }
            }
        }
        OsList osList2 = new OsList(I0.r(j4), aVar.p);
        osList2.J();
        k0<String> realmGet$features = countryEntity.realmGet$features();
        if (realmGet$features != null) {
            Iterator<String> it2 = realmGet$features.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2 == null) {
                    osList2.h();
                } else {
                    osList2.l(next2);
                }
            }
        }
        Table.nativeSetLong(nativePtr, aVar.q, j4, countryEntity.realmGet$state(), false);
        String realmGet$controllingWebsite = countryEntity.realmGet$controllingWebsite();
        if (realmGet$controllingWebsite != null) {
            Table.nativeSetString(nativePtr, aVar.r, j4, realmGet$controllingWebsite, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.r, j4, false);
        }
        String realmGet$generalWebsite = countryEntity.realmGet$generalWebsite();
        if (realmGet$generalWebsite != null) {
            Table.nativeSetString(nativePtr, aVar.s, j4, realmGet$generalWebsite, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.s, j4, false);
        }
        String realmGet$recruitingWebsite = countryEntity.realmGet$recruitingWebsite();
        if (realmGet$recruitingWebsite != null) {
            Table.nativeSetString(nativePtr, aVar.t, j4, realmGet$recruitingWebsite, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.t, j4, false);
        }
        String realmGet$noGloves = countryEntity.realmGet$noGloves();
        if (realmGet$noGloves != null) {
            Table.nativeSetString(nativePtr, aVar.u, j4, realmGet$noGloves, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.u, j4, false);
        }
        String realmGet$baseUrl = countryEntity.realmGet$baseUrl();
        if (realmGet$baseUrl != null) {
            Table.nativeSetString(nativePtr, aVar.v, j4, realmGet$baseUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.v, j4, false);
        }
        Table.nativeSetLong(nativePtr, aVar.w, j4, countryEntity.realmGet$order(), false);
        Table.nativeSetDouble(nativePtr, aVar.x, j4, countryEntity.realmGet$mapBoundsUpperLeftCornerLat(), false);
        Table.nativeSetDouble(nativePtr, aVar.y, j4, countryEntity.realmGet$mapBoundsUpperLeftCornerLon(), false);
        Table.nativeSetDouble(nativePtr, aVar.z, j4, countryEntity.realmGet$mapBoundsLowerRightCornerLat(), false);
        Table.nativeSetDouble(nativePtr, aVar.A, j4, countryEntity.realmGet$mapBoundsLowerRightCornerLon(), false);
        return j4;
    }

    static com_dodopizza_persistence_entity_CountryEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(CountryEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_CountryEntityRealmProxy com_dodopizza_persistence_entity_countryentityrealmproxy = new com_dodopizza_persistence_entity_CountryEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_countryentityrealmproxy;
    }

    static CountryEntity k(d0 d0Var, a aVar, CountryEntity countryEntity, CountryEntity countryEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(CountryEntity.class), set);
        osObjectBuilder.E0(aVar.e, countryEntity2.realmGet$id());
        osObjectBuilder.E0(aVar.f, countryEntity2.realmGet$name());
        osObjectBuilder.E0(aVar.g, countryEntity2.realmGet$code());
        osObjectBuilder.E0(aVar.h, countryEntity2.realmGet$isoName());
        osObjectBuilder.E0(aVar.i, countryEntity2.realmGet$currencyCode());
        osObjectBuilder.E0(aVar.j, countryEntity2.realmGet$customSymbol());
        osObjectBuilder.E0(aVar.k, countryEntity2.realmGet$phoneCode());
        osObjectBuilder.E0(aVar.l, countryEntity2.realmGet$phoneMask());
        osObjectBuilder.E0(aVar.m, countryEntity2.realmGet$feedbackPhone());
        osObjectBuilder.E0(aVar.n, countryEntity2.realmGet$feedbackEmail());
        osObjectBuilder.F0(aVar.o, countryEntity2.realmGet$languages());
        osObjectBuilder.F0(aVar.p, countryEntity2.realmGet$features());
        osObjectBuilder.o0(aVar.q, Integer.valueOf(countryEntity2.realmGet$state()));
        osObjectBuilder.E0(aVar.r, countryEntity2.realmGet$controllingWebsite());
        osObjectBuilder.E0(aVar.s, countryEntity2.realmGet$generalWebsite());
        osObjectBuilder.E0(aVar.t, countryEntity2.realmGet$recruitingWebsite());
        osObjectBuilder.E0(aVar.u, countryEntity2.realmGet$noGloves());
        osObjectBuilder.E0(aVar.v, countryEntity2.realmGet$baseUrl());
        osObjectBuilder.o0(aVar.w, Integer.valueOf(countryEntity2.realmGet$order()));
        osObjectBuilder.l0(aVar.x, Double.valueOf(countryEntity2.realmGet$mapBoundsUpperLeftCornerLat()));
        osObjectBuilder.l0(aVar.y, Double.valueOf(countryEntity2.realmGet$mapBoundsUpperLeftCornerLon()));
        osObjectBuilder.l0(aVar.z, Double.valueOf(countryEntity2.realmGet$mapBoundsLowerRightCornerLat()));
        osObjectBuilder.l0(aVar.A, Double.valueOf(countryEntity2.realmGet$mapBoundsLowerRightCornerLon()));
        osObjectBuilder.K0();
        return countryEntity;
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
        c0<CountryEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_CountryEntityRealmProxy com_dodopizza_persistence_entity_countryentityrealmproxy = (com_dodopizza_persistence_entity_CountryEntityRealmProxy) obj;
        io.realm.a f2 = this.c.f();
        io.realm.a f3 = com_dodopizza_persistence_entity_countryentityrealmproxy.c.f();
        String path = f2.getPath();
        String path2 = f3.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f2.E() != f3.E() || !f2.e.getVersionID().equals(f3.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_countryentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_countryentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public String realmGet$baseUrl() {
        this.c.f().c();
        return this.c.g().p0(this.b.v);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public String realmGet$code() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public String realmGet$controllingWebsite() {
        this.c.f().c();
        return this.c.g().p0(this.b.r);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public String realmGet$currencyCode() {
        this.c.f().c();
        return this.c.g().p0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public String realmGet$customSymbol() {
        this.c.f().c();
        return this.c.g().p0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public k0<String> realmGet$features() {
        this.c.f().c();
        k0<String> k0Var = this.e;
        if (k0Var != null) {
            return k0Var;
        }
        k0<String> k0Var2 = new k0<>(String.class, this.c.g().N(this.b.p, RealmFieldType.STRING_LIST), this.c.f());
        this.e = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public String realmGet$feedbackEmail() {
        this.c.f().c();
        return this.c.g().p0(this.b.n);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public String realmGet$feedbackPhone() {
        this.c.f().c();
        return this.c.g().p0(this.b.m);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public String realmGet$generalWebsite() {
        this.c.f().c();
        return this.c.g().p0(this.b.s);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public String realmGet$isoName() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public k0<String> realmGet$languages() {
        this.c.f().c();
        k0<String> k0Var = this.d;
        if (k0Var != null) {
            return k0Var;
        }
        k0<String> k0Var2 = new k0<>(String.class, this.c.g().N(this.b.o, RealmFieldType.STRING_LIST), this.c.f());
        this.d = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public double realmGet$mapBoundsLowerRightCornerLat() {
        this.c.f().c();
        return this.c.g().K(this.b.z);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public double realmGet$mapBoundsLowerRightCornerLon() {
        this.c.f().c();
        return this.c.g().K(this.b.A);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public double realmGet$mapBoundsUpperLeftCornerLat() {
        this.c.f().c();
        return this.c.g().K(this.b.x);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public double realmGet$mapBoundsUpperLeftCornerLon() {
        this.c.f().c();
        return this.c.g().K(this.b.y);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public String realmGet$name() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public String realmGet$noGloves() {
        this.c.f().c();
        return this.c.g().p0(this.b.u);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public int realmGet$order() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.w);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public String realmGet$phoneCode() {
        this.c.f().c();
        return this.c.g().p0(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public String realmGet$phoneMask() {
        this.c.f().c();
        return this.c.g().p0(this.b.l);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public String realmGet$recruitingWebsite() {
        this.c.f().c();
        return this.c.g().p0(this.b.t);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public int realmGet$state() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.q);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$baseUrl(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.v, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'baseUrl' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.v, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'baseUrl' to null.");
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$code(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.g, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'code' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'code' to null.");
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$controllingWebsite(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.r, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'controllingWebsite' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.r, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'controllingWebsite' to null.");
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$currencyCode(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.i, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'currencyCode' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.i, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'currencyCode' to null.");
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$customSymbol(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.j, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.j, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.j);
        } else {
            this.c.g().i(this.b.j, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$features(k0<String> k0Var) {
        if (this.c.i() && (!this.c.d() || this.c.e().contains("features"))) {
            return;
        }
        this.c.f().c();
        OsList N = this.c.g().N(this.b.p, RealmFieldType.STRING_LIST);
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

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$feedbackEmail(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.n, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'feedbackEmail' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.n, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'feedbackEmail' to null.");
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$feedbackPhone(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.m, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'feedbackPhone' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.m, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'feedbackPhone' to null.");
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$generalWebsite(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.s, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'generalWebsite' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.s, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'generalWebsite' to null.");
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$isoName(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.h, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'isoName' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.h, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'isoName' to null.");
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$languages(k0<String> k0Var) {
        if (this.c.i() && (!this.c.d() || this.c.e().contains("languages"))) {
            return;
        }
        this.c.f().c();
        OsList N = this.c.g().N(this.b.o, RealmFieldType.STRING_LIST);
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

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$mapBoundsLowerRightCornerLat(double d) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.z, g.E0(), d, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.z, d);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$mapBoundsLowerRightCornerLon(double d) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.A, g.E0(), d, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.A, d);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$mapBoundsUpperLeftCornerLat(double d) {
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

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$mapBoundsUpperLeftCornerLon(double d) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.y, g.E0(), d, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.y, d);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$name(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.f, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$noGloves(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.u, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'noGloves' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.u, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'noGloves' to null.");
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$order(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.w, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.w, i);
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$phoneCode(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.k, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'phoneCode' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.k, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'phoneCode' to null.");
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$phoneMask(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.l, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'phoneMask' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.l, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'phoneMask' to null.");
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$recruitingWebsite(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.t, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'recruitingWebsite' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.t, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'recruitingWebsite' to null.");
    }

    @Override // com.dodopizza.persistence.entity.CountryEntity, defpackage.sec
    public void realmSet$state(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.q, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.q, i);
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CountryEntity = proxy[");
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
        sb.append("{name:");
        sb.append(realmGet$name());
        sb.append("}");
        sb.append(",");
        sb.append("{code:");
        sb.append(realmGet$code());
        sb.append("}");
        sb.append(",");
        sb.append("{isoName:");
        sb.append(realmGet$isoName());
        sb.append("}");
        sb.append(",");
        sb.append("{currencyCode:");
        sb.append(realmGet$currencyCode());
        sb.append("}");
        sb.append(",");
        sb.append("{customSymbol:");
        if (realmGet$customSymbol() != null) {
            str2 = realmGet$customSymbol();
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{phoneCode:");
        sb.append(realmGet$phoneCode());
        sb.append("}");
        sb.append(",");
        sb.append("{phoneMask:");
        sb.append(realmGet$phoneMask());
        sb.append("}");
        sb.append(",");
        sb.append("{feedbackPhone:");
        sb.append(realmGet$feedbackPhone());
        sb.append("}");
        sb.append(",");
        sb.append("{feedbackEmail:");
        sb.append(realmGet$feedbackEmail());
        sb.append("}");
        sb.append(",");
        sb.append("{languages:");
        sb.append("RealmList<String>[");
        sb.append(realmGet$languages().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{features:");
        sb.append("RealmList<String>[");
        sb.append(realmGet$features().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{state:");
        sb.append(realmGet$state());
        sb.append("}");
        sb.append(",");
        sb.append("{controllingWebsite:");
        sb.append(realmGet$controllingWebsite());
        sb.append("}");
        sb.append(",");
        sb.append("{generalWebsite:");
        sb.append(realmGet$generalWebsite());
        sb.append("}");
        sb.append(",");
        sb.append("{recruitingWebsite:");
        sb.append(realmGet$recruitingWebsite());
        sb.append("}");
        sb.append(",");
        sb.append("{noGloves:");
        sb.append(realmGet$noGloves());
        sb.append("}");
        sb.append(",");
        sb.append("{baseUrl:");
        sb.append(realmGet$baseUrl());
        sb.append("}");
        sb.append(",");
        sb.append("{order:");
        sb.append(realmGet$order());
        sb.append("}");
        sb.append(",");
        sb.append("{mapBoundsUpperLeftCornerLat:");
        sb.append(realmGet$mapBoundsUpperLeftCornerLat());
        sb.append("}");
        sb.append(",");
        sb.append("{mapBoundsUpperLeftCornerLon:");
        sb.append(realmGet$mapBoundsUpperLeftCornerLon());
        sb.append("}");
        sb.append(",");
        sb.append("{mapBoundsLowerRightCornerLat:");
        sb.append(realmGet$mapBoundsLowerRightCornerLat());
        sb.append("}");
        sb.append(",");
        sb.append("{mapBoundsLowerRightCornerLon:");
        sb.append(realmGet$mapBoundsLowerRightCornerLon());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
