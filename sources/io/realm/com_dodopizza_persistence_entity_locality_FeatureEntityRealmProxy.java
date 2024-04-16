package io.realm;

import com.dodopizza.persistence.entity.locality.FeatureEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
public class com_dodopizza_persistence_entity_locality_FeatureEntityRealmProxy extends FeatureEntity implements r89, kgc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<FeatureEntity> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;
        long f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b = osSchemaInfo.b("FeatureEntity");
            this.e = a("code", "code", b);
            this.f = a("id", "id", b);
        }

        @Override // defpackage.sf1
        protected final void b(sf1 sf1Var, sf1 sf1Var2) {
            a aVar = (a) sf1Var;
            a aVar2 = (a) sf1Var2;
            aVar2.e = aVar.e;
            aVar2.f = aVar.f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_locality_FeatureEntityRealmProxy() {
        this.c.p();
    }

    public static FeatureEntity c(d0 d0Var, a aVar, FeatureEntity featureEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(featureEntity);
        if (r89Var != null) {
            return (FeatureEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(FeatureEntity.class), set);
        osObjectBuilder.E0(aVar.e, featureEntity.realmGet$code());
        osObjectBuilder.E0(aVar.f, featureEntity.realmGet$id());
        com_dodopizza_persistence_entity_locality_FeatureEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(featureEntity, j);
        return j;
    }

    public static FeatureEntity d(d0 d0Var, a aVar, FeatureEntity featureEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        if ((featureEntity instanceof r89) && !n0.isFrozen(featureEntity)) {
            r89 r89Var = (r89) featureEntity;
            if (r89Var.a().f() != null) {
                io.realm.a f = r89Var.a().f();
                if (f.b == d0Var.b) {
                    if (f.getPath().equals(d0Var.getPath())) {
                        return featureEntity;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.k.get();
        r89 r89Var2 = map.get(featureEntity);
        if (r89Var2 != null) {
            return (FeatureEntity) r89Var2;
        }
        return c(d0Var, aVar, featureEntity, z, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static FeatureEntity f(FeatureEntity featureEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        FeatureEntity featureEntity2;
        if (i <= i2 && featureEntity != null) {
            r89.a<o89> aVar = map.get(featureEntity);
            if (aVar == null) {
                featureEntity2 = new FeatureEntity();
                map.put(featureEntity, new r89.a<>(i, featureEntity2));
            } else if (i >= aVar.a) {
                return (FeatureEntity) aVar.b;
            } else {
                aVar.a = i;
                featureEntity2 = (FeatureEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) featureEntity).a().f();
            featureEntity2.realmSet$code(featureEntity.realmGet$code());
            featureEntity2.realmSet$id(featureEntity.realmGet$id());
            return featureEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "FeatureEntity", false, 2, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "code", realmFieldType, false, false, false);
        bVar.b("", "id", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, FeatureEntity featureEntity, Map<o89, Long> map) {
        if ((featureEntity instanceof r89) && !n0.isFrozen(featureEntity)) {
            r89 r89Var = (r89) featureEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(FeatureEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(FeatureEntity.class);
        long createRow = OsObject.createRow(I0);
        map.put(featureEntity, Long.valueOf(createRow));
        String realmGet$code = featureEntity.realmGet$code();
        if (realmGet$code != null) {
            Table.nativeSetString(nativePtr, aVar.e, createRow, realmGet$code, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.e, createRow, false);
        }
        String realmGet$id = featureEntity.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, aVar.f, createRow, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f, createRow, false);
        }
        return createRow;
    }

    static com_dodopizza_persistence_entity_locality_FeatureEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(FeatureEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_locality_FeatureEntityRealmProxy com_dodopizza_persistence_entity_locality_featureentityrealmproxy = new com_dodopizza_persistence_entity_locality_FeatureEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_locality_featureentityrealmproxy;
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
        c0<FeatureEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_locality_FeatureEntityRealmProxy com_dodopizza_persistence_entity_locality_featureentityrealmproxy = (com_dodopizza_persistence_entity_locality_FeatureEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_locality_featureentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_locality_featureentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_locality_featureentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.locality.FeatureEntity, defpackage.kgc
    public String realmGet$code() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.locality.FeatureEntity, defpackage.kgc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.locality.FeatureEntity, defpackage.kgc
    public void realmSet$code(String str) {
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

    @Override // com.dodopizza.persistence.entity.locality.FeatureEntity, defpackage.kgc
    public void realmSet$id(String str) {
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
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("FeatureEntity = proxy[");
        sb.append("{code:");
        String str2 = "null";
        if (realmGet$code() == null) {
            str = "null";
        } else {
            str = realmGet$code();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{id:");
        if (realmGet$id() != null) {
            str2 = realmGet$id();
        }
        sb.append(str2);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
