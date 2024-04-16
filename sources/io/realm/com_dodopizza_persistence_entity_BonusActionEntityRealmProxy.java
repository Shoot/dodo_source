package io.realm;

import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
public class com_dodopizza_persistence_entity_BonusActionEntityRealmProxy extends BonusActionEntity implements r89, pec {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<BonusActionEntity> c;

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

        a(OsSchemaInfo osSchemaInfo) {
            super(9);
            OsObjectSchemaInfo b = osSchemaInfo.b("BonusActionEntity");
            this.e = a(ShoppingInfoEntity.FIELD_EXTERNAL_ID, ShoppingInfoEntity.FIELD_EXTERNAL_ID, b);
            this.f = a("title", "title", b);
            this.g = a("description", "description", b);
            this.h = a("imageUrl", "imageUrl", b);
            this.i = a("actionType", "actionType", b);
            this.j = a("actionValue", "actionValue", b);
            this.k = a(BonusActionEntity.PLACE_ID, BonusActionEntity.PLACE_ID, b);
            this.l = a(BonusActionEntity.ORDER, BonusActionEntity.ORDER, b);
            this.m = a("id", "id", b);
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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_BonusActionEntityRealmProxy() {
        this.c.p();
    }

    public static BonusActionEntity c(d0 d0Var, a aVar, BonusActionEntity bonusActionEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(bonusActionEntity);
        if (r89Var != null) {
            return (BonusActionEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(BonusActionEntity.class), set);
        osObjectBuilder.E0(aVar.e, bonusActionEntity.realmGet$externalId());
        osObjectBuilder.E0(aVar.f, bonusActionEntity.realmGet$title());
        osObjectBuilder.E0(aVar.g, bonusActionEntity.realmGet$description());
        osObjectBuilder.E0(aVar.h, bonusActionEntity.realmGet$imageUrl());
        osObjectBuilder.o0(aVar.i, Integer.valueOf(bonusActionEntity.realmGet$actionType()));
        osObjectBuilder.E0(aVar.j, bonusActionEntity.realmGet$actionValue());
        osObjectBuilder.E0(aVar.k, bonusActionEntity.realmGet$placeId());
        osObjectBuilder.o0(aVar.l, Integer.valueOf(bonusActionEntity.realmGet$order()));
        osObjectBuilder.E0(aVar.m, bonusActionEntity.realmGet$id());
        com_dodopizza_persistence_entity_BonusActionEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(bonusActionEntity, j);
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dodopizza.persistence.entity.BonusActionEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_BonusActionEntityRealmProxy.a r9, com.dodopizza.persistence.entity.BonusActionEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.BonusActionEntity r1 = (com.dodopizza.persistence.entity.BonusActionEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.BonusActionEntity> r2 = com.dodopizza.persistence.entity.BonusActionEntity.class
            io.realm.internal.Table r2 = r8.I0(r2)
            long r3 = r9.m
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
            io.realm.com_dodopizza_persistence_entity_BonusActionEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_BonusActionEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.BonusActionEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.BonusActionEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_BonusActionEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_BonusActionEntityRealmProxy$a, com.dodopizza.persistence.entity.BonusActionEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.BonusActionEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static BonusActionEntity f(BonusActionEntity bonusActionEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        BonusActionEntity bonusActionEntity2;
        if (i <= i2 && bonusActionEntity != null) {
            r89.a<o89> aVar = map.get(bonusActionEntity);
            if (aVar == null) {
                bonusActionEntity2 = new BonusActionEntity();
                map.put(bonusActionEntity, new r89.a<>(i, bonusActionEntity2));
            } else if (i >= aVar.a) {
                return (BonusActionEntity) aVar.b;
            } else {
                aVar.a = i;
                bonusActionEntity2 = (BonusActionEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) bonusActionEntity).a().f();
            bonusActionEntity2.realmSet$externalId(bonusActionEntity.realmGet$externalId());
            bonusActionEntity2.realmSet$title(bonusActionEntity.realmGet$title());
            bonusActionEntity2.realmSet$description(bonusActionEntity.realmGet$description());
            bonusActionEntity2.realmSet$imageUrl(bonusActionEntity.realmGet$imageUrl());
            bonusActionEntity2.realmSet$actionType(bonusActionEntity.realmGet$actionType());
            bonusActionEntity2.realmSet$actionValue(bonusActionEntity.realmGet$actionValue());
            bonusActionEntity2.realmSet$placeId(bonusActionEntity.realmGet$placeId());
            bonusActionEntity2.realmSet$order(bonusActionEntity.realmGet$order());
            bonusActionEntity2.realmSet$id(bonusActionEntity.realmGet$id());
            return bonusActionEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "BonusActionEntity", false, 9, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", ShoppingInfoEntity.FIELD_EXTERNAL_ID, realmFieldType, false, false, false);
        bVar.b("", "title", realmFieldType, false, false, false);
        bVar.b("", "description", realmFieldType, false, false, false);
        bVar.b("", "imageUrl", realmFieldType, false, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.b("", "actionType", realmFieldType2, false, false, true);
        bVar.b("", "actionValue", realmFieldType, false, false, true);
        bVar.b("", BonusActionEntity.PLACE_ID, realmFieldType, false, false, false);
        bVar.b("", BonusActionEntity.ORDER, realmFieldType2, false, false, true);
        bVar.b("", "id", realmFieldType, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, BonusActionEntity bonusActionEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((bonusActionEntity instanceof r89) && !n0.isFrozen(bonusActionEntity)) {
            r89 r89Var = (r89) bonusActionEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(BonusActionEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(BonusActionEntity.class);
        long j = aVar.m;
        String realmGet$id = bonusActionEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(bonusActionEntity, Long.valueOf(j2));
        String realmGet$externalId = bonusActionEntity.realmGet$externalId();
        if (realmGet$externalId != null) {
            Table.nativeSetString(nativePtr, aVar.e, j2, realmGet$externalId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.e, j2, false);
        }
        String realmGet$title = bonusActionEntity.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, aVar.f, j2, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f, j2, false);
        }
        String realmGet$description = bonusActionEntity.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, aVar.g, j2, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j2, false);
        }
        String realmGet$imageUrl = bonusActionEntity.realmGet$imageUrl();
        if (realmGet$imageUrl != null) {
            Table.nativeSetString(nativePtr, aVar.h, j2, realmGet$imageUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, j2, false);
        }
        Table.nativeSetLong(nativePtr, aVar.i, j2, bonusActionEntity.realmGet$actionType(), false);
        String realmGet$actionValue = bonusActionEntity.realmGet$actionValue();
        if (realmGet$actionValue != null) {
            Table.nativeSetString(nativePtr, aVar.j, j2, realmGet$actionValue, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.j, j2, false);
        }
        String realmGet$placeId = bonusActionEntity.realmGet$placeId();
        if (realmGet$placeId != null) {
            Table.nativeSetString(nativePtr, aVar.k, j2, realmGet$placeId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.k, j2, false);
        }
        Table.nativeSetLong(nativePtr, aVar.l, j2, bonusActionEntity.realmGet$order(), false);
        return j2;
    }

    static com_dodopizza_persistence_entity_BonusActionEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(BonusActionEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_BonusActionEntityRealmProxy com_dodopizza_persistence_entity_bonusactionentityrealmproxy = new com_dodopizza_persistence_entity_BonusActionEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_bonusactionentityrealmproxy;
    }

    static BonusActionEntity k(d0 d0Var, a aVar, BonusActionEntity bonusActionEntity, BonusActionEntity bonusActionEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(BonusActionEntity.class), set);
        osObjectBuilder.E0(aVar.e, bonusActionEntity2.realmGet$externalId());
        osObjectBuilder.E0(aVar.f, bonusActionEntity2.realmGet$title());
        osObjectBuilder.E0(aVar.g, bonusActionEntity2.realmGet$description());
        osObjectBuilder.E0(aVar.h, bonusActionEntity2.realmGet$imageUrl());
        osObjectBuilder.o0(aVar.i, Integer.valueOf(bonusActionEntity2.realmGet$actionType()));
        osObjectBuilder.E0(aVar.j, bonusActionEntity2.realmGet$actionValue());
        osObjectBuilder.E0(aVar.k, bonusActionEntity2.realmGet$placeId());
        osObjectBuilder.o0(aVar.l, Integer.valueOf(bonusActionEntity2.realmGet$order()));
        osObjectBuilder.E0(aVar.m, bonusActionEntity2.realmGet$id());
        osObjectBuilder.K0();
        return bonusActionEntity;
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
        c0<BonusActionEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_BonusActionEntityRealmProxy com_dodopizza_persistence_entity_bonusactionentityrealmproxy = (com_dodopizza_persistence_entity_BonusActionEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_bonusactionentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_bonusactionentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_bonusactionentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.BonusActionEntity, defpackage.pec
    public int realmGet$actionType() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.BonusActionEntity, defpackage.pec
    public String realmGet$actionValue() {
        this.c.f().c();
        return this.c.g().p0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.BonusActionEntity, defpackage.pec
    public String realmGet$description() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.BonusActionEntity, defpackage.pec
    public String realmGet$externalId() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.BonusActionEntity, defpackage.pec
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.m);
    }

    @Override // com.dodopizza.persistence.entity.BonusActionEntity, defpackage.pec
    public String realmGet$imageUrl() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.BonusActionEntity, defpackage.pec
    public int realmGet$order() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.l);
    }

    @Override // com.dodopizza.persistence.entity.BonusActionEntity, defpackage.pec
    public String realmGet$placeId() {
        this.c.f().c();
        return this.c.g().p0(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.BonusActionEntity, defpackage.pec
    public String realmGet$title() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.BonusActionEntity, defpackage.pec
    public void realmSet$actionType(int i) {
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

    @Override // com.dodopizza.persistence.entity.BonusActionEntity, defpackage.pec
    public void realmSet$actionValue(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.j, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'actionValue' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.j, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'actionValue' to null.");
    }

    @Override // com.dodopizza.persistence.entity.BonusActionEntity, defpackage.pec
    public void realmSet$description(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.g, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.g, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.g);
        } else {
            this.c.g().i(this.b.g, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.BonusActionEntity, defpackage.pec
    public void realmSet$externalId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.e, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.e, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.e);
        } else {
            this.c.g().i(this.b.e, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.BonusActionEntity, defpackage.pec
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.BonusActionEntity, defpackage.pec
    public void realmSet$imageUrl(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.h, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.h, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.h);
        } else {
            this.c.g().i(this.b.h, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.BonusActionEntity, defpackage.pec
    public void realmSet$order(int i) {
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

    @Override // com.dodopizza.persistence.entity.BonusActionEntity, defpackage.pec
    public void realmSet$placeId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.k, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.k, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.k);
        } else {
            this.c.g().i(this.b.k, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.BonusActionEntity, defpackage.pec
    public void realmSet$title(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.f, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.f, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.f);
        } else {
            this.c.g().i(this.b.f, str);
        }
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("BonusActionEntity = proxy[");
        sb.append("{externalId:");
        String str6 = "null";
        if (realmGet$externalId() == null) {
            str = "null";
        } else {
            str = realmGet$externalId();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        if (realmGet$title() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$title();
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{description:");
        if (realmGet$description() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$description();
        }
        sb.append(str3);
        sb.append("}");
        sb.append(",");
        sb.append("{imageUrl:");
        if (realmGet$imageUrl() == null) {
            str4 = "null";
        } else {
            str4 = realmGet$imageUrl();
        }
        sb.append(str4);
        sb.append("}");
        sb.append(",");
        sb.append("{actionType:");
        sb.append(realmGet$actionType());
        sb.append("}");
        sb.append(",");
        sb.append("{actionValue:");
        sb.append(realmGet$actionValue());
        sb.append("}");
        sb.append(",");
        sb.append("{placeId:");
        if (realmGet$placeId() == null) {
            str5 = "null";
        } else {
            str5 = realmGet$placeId();
        }
        sb.append(str5);
        sb.append("}");
        sb.append(",");
        sb.append("{order:");
        sb.append(realmGet$order());
        sb.append("}");
        sb.append(",");
        sb.append("{id:");
        if (realmGet$id() != null) {
            str6 = realmGet$id();
        }
        sb.append(str6);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
