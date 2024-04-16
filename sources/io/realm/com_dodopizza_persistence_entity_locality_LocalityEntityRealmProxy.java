package io.realm;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import defpackage.r89;
import im.threads.business.transport.MessageAttributes;
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
public class com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy extends LocalityEntity implements r89, mgc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<LocalityEntity> c;

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
            OsObjectSchemaInfo b = osSchemaInfo.b("LocalityEntity");
            this.e = a("id", "id", b);
            this.f = a(ShoppingInfoEntity.FIELD_EXTERNAL_ID, ShoppingInfoEntity.FIELD_EXTERNAL_ID, b);
            this.g = a(MessageAttributes.UUID, MessageAttributes.UUID, b);
            this.h = a(Action.NAME_ATTRIBUTE, Action.NAME_ATTRIBUTE, b);
            this.i = a(LocalityEntity.FIELD_COUNTRY_CODE, LocalityEntity.FIELD_COUNTRY_CODE, b);
            this.j = a(BonusActionEntity.ORDER, BonusActionEntity.ORDER, b);
            this.k = a("isTop", "isTop", b);
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
    public com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy() {
        this.c.p();
    }

    public static LocalityEntity c(d0 d0Var, a aVar, LocalityEntity localityEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(localityEntity);
        if (r89Var != null) {
            return (LocalityEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(LocalityEntity.class), set);
        osObjectBuilder.E0(aVar.e, localityEntity.realmGet$id());
        osObjectBuilder.E0(aVar.f, localityEntity.realmGet$externalId());
        osObjectBuilder.E0(aVar.g, localityEntity.realmGet$uuid());
        osObjectBuilder.E0(aVar.h, localityEntity.realmGet$name());
        osObjectBuilder.E0(aVar.i, localityEntity.realmGet$countryCode());
        osObjectBuilder.o0(aVar.j, Integer.valueOf(localityEntity.realmGet$order()));
        osObjectBuilder.j0(aVar.k, Boolean.valueOf(localityEntity.realmGet$isTop()));
        com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(localityEntity, j);
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dodopizza.persistence.entity.locality.LocalityEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy.a r9, com.dodopizza.persistence.entity.locality.LocalityEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.locality.LocalityEntity r1 = (com.dodopizza.persistence.entity.locality.LocalityEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.locality.LocalityEntity> r2 = com.dodopizza.persistence.entity.locality.LocalityEntity.class
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
            io.realm.com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.locality.LocalityEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.locality.LocalityEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy$a, com.dodopizza.persistence.entity.locality.LocalityEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.locality.LocalityEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static LocalityEntity f(LocalityEntity localityEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        LocalityEntity localityEntity2;
        if (i <= i2 && localityEntity != null) {
            r89.a<o89> aVar = map.get(localityEntity);
            if (aVar == null) {
                localityEntity2 = new LocalityEntity();
                map.put(localityEntity, new r89.a<>(i, localityEntity2));
            } else if (i >= aVar.a) {
                return (LocalityEntity) aVar.b;
            } else {
                aVar.a = i;
                localityEntity2 = (LocalityEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) localityEntity).a().f();
            localityEntity2.realmSet$id(localityEntity.realmGet$id());
            localityEntity2.realmSet$externalId(localityEntity.realmGet$externalId());
            localityEntity2.realmSet$uuid(localityEntity.realmGet$uuid());
            localityEntity2.realmSet$name(localityEntity.realmGet$name());
            localityEntity2.realmSet$countryCode(localityEntity.realmGet$countryCode());
            localityEntity2.realmSet$order(localityEntity.realmGet$order());
            localityEntity2.realmSet$isTop(localityEntity.realmGet$isTop());
            return localityEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "LocalityEntity", false, 7, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, false);
        bVar.b("", ShoppingInfoEntity.FIELD_EXTERNAL_ID, realmFieldType, false, false, true);
        bVar.b("", MessageAttributes.UUID, realmFieldType, false, false, true);
        bVar.b("", Action.NAME_ATTRIBUTE, realmFieldType, false, false, true);
        bVar.b("", LocalityEntity.FIELD_COUNTRY_CODE, realmFieldType, false, false, true);
        bVar.b("", BonusActionEntity.ORDER, RealmFieldType.INTEGER, false, false, true);
        bVar.b("", "isTop", RealmFieldType.BOOLEAN, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, LocalityEntity localityEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((localityEntity instanceof r89) && !n0.isFrozen(localityEntity)) {
            r89 r89Var = (r89) localityEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(LocalityEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(LocalityEntity.class);
        long j = aVar.e;
        String realmGet$id = localityEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(localityEntity, Long.valueOf(j2));
        String realmGet$externalId = localityEntity.realmGet$externalId();
        if (realmGet$externalId != null) {
            Table.nativeSetString(nativePtr, aVar.f, j2, realmGet$externalId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f, j2, false);
        }
        String realmGet$uuid = localityEntity.realmGet$uuid();
        if (realmGet$uuid != null) {
            Table.nativeSetString(nativePtr, aVar.g, j2, realmGet$uuid, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j2, false);
        }
        String realmGet$name = localityEntity.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, aVar.h, j2, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, j2, false);
        }
        String realmGet$countryCode = localityEntity.realmGet$countryCode();
        if (realmGet$countryCode != null) {
            Table.nativeSetString(nativePtr, aVar.i, j2, realmGet$countryCode, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.i, j2, false);
        }
        Table.nativeSetLong(nativePtr, aVar.j, j2, localityEntity.realmGet$order(), false);
        Table.nativeSetBoolean(nativePtr, aVar.k, j2, localityEntity.realmGet$isTop(), false);
        return j2;
    }

    static com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(LocalityEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy com_dodopizza_persistence_entity_locality_localityentityrealmproxy = new com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_locality_localityentityrealmproxy;
    }

    static LocalityEntity k(d0 d0Var, a aVar, LocalityEntity localityEntity, LocalityEntity localityEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(LocalityEntity.class), set);
        osObjectBuilder.E0(aVar.e, localityEntity2.realmGet$id());
        osObjectBuilder.E0(aVar.f, localityEntity2.realmGet$externalId());
        osObjectBuilder.E0(aVar.g, localityEntity2.realmGet$uuid());
        osObjectBuilder.E0(aVar.h, localityEntity2.realmGet$name());
        osObjectBuilder.E0(aVar.i, localityEntity2.realmGet$countryCode());
        osObjectBuilder.o0(aVar.j, Integer.valueOf(localityEntity2.realmGet$order()));
        osObjectBuilder.j0(aVar.k, Boolean.valueOf(localityEntity2.realmGet$isTop()));
        osObjectBuilder.K0();
        return localityEntity;
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
        c0<LocalityEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy com_dodopizza_persistence_entity_locality_localityentityrealmproxy = (com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_locality_localityentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_locality_localityentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_locality_localityentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.locality.LocalityEntity, defpackage.mgc
    public String realmGet$countryCode() {
        this.c.f().c();
        return this.c.g().p0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityEntity, defpackage.mgc
    public String realmGet$externalId() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityEntity, defpackage.mgc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityEntity, defpackage.mgc
    public boolean realmGet$isTop() {
        this.c.f().c();
        return this.c.g().b0(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityEntity, defpackage.mgc
    public String realmGet$name() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityEntity, defpackage.mgc
    public int realmGet$order() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityEntity, defpackage.mgc
    public String realmGet$uuid() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityEntity, defpackage.mgc
    public void realmSet$countryCode(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.i, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'countryCode' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.i, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'countryCode' to null.");
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityEntity, defpackage.mgc
    public void realmSet$externalId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.f, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'externalId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'externalId' to null.");
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityEntity, defpackage.mgc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityEntity, defpackage.mgc
    public void realmSet$isTop(boolean z) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().y(this.b.k, g.E0(), z, true);
            return;
        }
        this.c.f().c();
        this.c.g().Q(this.b.k, z);
    }

    @Override // com.dodopizza.persistence.entity.locality.LocalityEntity, defpackage.mgc
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

    @Override // com.dodopizza.persistence.entity.locality.LocalityEntity, defpackage.mgc
    public void realmSet$order(int i) {
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

    @Override // com.dodopizza.persistence.entity.locality.LocalityEntity, defpackage.mgc
    public void realmSet$uuid(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.g, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'uuid' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'uuid' to null.");
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("LocalityEntity = proxy[");
        sb.append("{id:");
        if (realmGet$id() != null) {
            str = realmGet$id();
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{externalId:");
        sb.append(realmGet$externalId());
        sb.append("}");
        sb.append(",");
        sb.append("{uuid:");
        sb.append(realmGet$uuid());
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(realmGet$name());
        sb.append("}");
        sb.append(",");
        sb.append("{countryCode:");
        sb.append(realmGet$countryCode());
        sb.append("}");
        sb.append(",");
        sb.append("{order:");
        sb.append(realmGet$order());
        sb.append("}");
        sb.append(",");
        sb.append("{isTop:");
        sb.append(realmGet$isTop());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
