package io.realm;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.personalization.MapEntry;
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
public class com_dodopizza_persistence_entity_personalization_MapEntryRealmProxy extends MapEntry implements r89, ihc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<MapEntry> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;
        long f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b = osSchemaInfo.b("MapEntry");
            this.e = a(Action.KEY_ATTRIBUTE, Action.KEY_ATTRIBUTE, b);
            this.f = a("value", "value", b);
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
    public com_dodopizza_persistence_entity_personalization_MapEntryRealmProxy() {
        this.c.p();
    }

    public static MapEntry c(d0 d0Var, a aVar, MapEntry mapEntry, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(mapEntry);
        if (r89Var != null) {
            return (MapEntry) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(MapEntry.class), set);
        osObjectBuilder.E0(aVar.e, mapEntry.realmGet$key());
        osObjectBuilder.E0(aVar.f, mapEntry.realmGet$value());
        com_dodopizza_persistence_entity_personalization_MapEntryRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(mapEntry, j);
        return j;
    }

    public static MapEntry d(d0 d0Var, a aVar, MapEntry mapEntry, boolean z, Map<o89, r89> map, Set<ex4> set) {
        if ((mapEntry instanceof r89) && !n0.isFrozen(mapEntry)) {
            r89 r89Var = (r89) mapEntry;
            if (r89Var.a().f() != null) {
                io.realm.a f = r89Var.a().f();
                if (f.b == d0Var.b) {
                    if (f.getPath().equals(d0Var.getPath())) {
                        return mapEntry;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.k.get();
        r89 r89Var2 = map.get(mapEntry);
        if (r89Var2 != null) {
            return (MapEntry) r89Var2;
        }
        return c(d0Var, aVar, mapEntry, z, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static MapEntry f(MapEntry mapEntry, int i, int i2, Map<o89, r89.a<o89>> map) {
        MapEntry mapEntry2;
        if (i <= i2 && mapEntry != null) {
            r89.a<o89> aVar = map.get(mapEntry);
            if (aVar == null) {
                mapEntry2 = new MapEntry();
                map.put(mapEntry, new r89.a<>(i, mapEntry2));
            } else if (i >= aVar.a) {
                return (MapEntry) aVar.b;
            } else {
                aVar.a = i;
                mapEntry2 = (MapEntry) aVar.b;
            }
            d0 d0Var = (d0) ((r89) mapEntry).a().f();
            mapEntry2.realmSet$key(mapEntry.realmGet$key());
            mapEntry2.realmSet$value(mapEntry.realmGet$value());
            return mapEntry2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "MapEntry", false, 2, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", Action.KEY_ATTRIBUTE, realmFieldType, false, false, false);
        bVar.b("", "value", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, MapEntry mapEntry, Map<o89, Long> map) {
        if ((mapEntry instanceof r89) && !n0.isFrozen(mapEntry)) {
            r89 r89Var = (r89) mapEntry;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(MapEntry.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(MapEntry.class);
        long createRow = OsObject.createRow(I0);
        map.put(mapEntry, Long.valueOf(createRow));
        String realmGet$key = mapEntry.realmGet$key();
        if (realmGet$key != null) {
            Table.nativeSetString(nativePtr, aVar.e, createRow, realmGet$key, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.e, createRow, false);
        }
        String realmGet$value = mapEntry.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, aVar.f, createRow, realmGet$value, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f, createRow, false);
        }
        return createRow;
    }

    static com_dodopizza_persistence_entity_personalization_MapEntryRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(MapEntry.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_personalization_MapEntryRealmProxy com_dodopizza_persistence_entity_personalization_mapentryrealmproxy = new com_dodopizza_persistence_entity_personalization_MapEntryRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_personalization_mapentryrealmproxy;
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
        c0<MapEntry> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_personalization_MapEntryRealmProxy com_dodopizza_persistence_entity_personalization_mapentryrealmproxy = (com_dodopizza_persistence_entity_personalization_MapEntryRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_personalization_mapentryrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_personalization_mapentryrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_personalization_mapentryrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.personalization.MapEntry, defpackage.ihc
    public String realmGet$key() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.personalization.MapEntry, defpackage.ihc
    public String realmGet$value() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.personalization.MapEntry, defpackage.ihc
    public void realmSet$key(String str) {
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

    @Override // com.dodopizza.persistence.entity.personalization.MapEntry, defpackage.ihc
    public void realmSet$value(String str) {
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
        StringBuilder sb = new StringBuilder("MapEntry = proxy[");
        sb.append("{key:");
        String str2 = "null";
        if (realmGet$key() == null) {
            str = "null";
        } else {
            str = realmGet$key();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{value:");
        if (realmGet$value() != null) {
            str2 = realmGet$value();
        }
        sb.append(str2);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
