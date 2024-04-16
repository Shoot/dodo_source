package io.realm;

import com.dodopizza.persistence.entity.PackageInfoEntity;
import com.dodopizza.persistence.entity.PackageWidgetDataEntity;
import defpackage.r89;
import im.threads.business.transport.MessageAttributes;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy;
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
public class com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy extends PackageInfoEntity implements r89, wec {
    private static final OsObjectSchemaInfo e = g();
    private a b;
    private c0<PackageInfoEntity> c;
    private k0<String> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;
        long f;
        long g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b = osSchemaInfo.b("PackageInfoEntity");
            this.e = a(MessageAttributes.TYPE, MessageAttributes.TYPE, b);
            this.f = a("availableTypes", "availableTypes", b);
            this.g = a("widgetData", "widgetData", b);
        }

        @Override // defpackage.sf1
        protected final void b(sf1 sf1Var, sf1 sf1Var2) {
            a aVar = (a) sf1Var;
            a aVar2 = (a) sf1Var2;
            aVar2.e = aVar.e;
            aVar2.f = aVar.f;
            aVar2.g = aVar.g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy() {
        this.c.p();
    }

    public static PackageInfoEntity c(d0 d0Var, a aVar, PackageInfoEntity packageInfoEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(packageInfoEntity);
        if (r89Var != null) {
            return (PackageInfoEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PackageInfoEntity.class), set);
        osObjectBuilder.E0(aVar.e, packageInfoEntity.realmGet$type());
        osObjectBuilder.F0(aVar.f, packageInfoEntity.realmGet$availableTypes());
        com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(packageInfoEntity, j);
        PackageWidgetDataEntity realmGet$widgetData = packageInfoEntity.realmGet$widgetData();
        if (realmGet$widgetData == null) {
            j.realmSet$widgetData(null);
        } else {
            PackageWidgetDataEntity packageWidgetDataEntity = (PackageWidgetDataEntity) map.get(realmGet$widgetData);
            if (packageWidgetDataEntity != null) {
                j.realmSet$widgetData(packageWidgetDataEntity);
            } else {
                j.realmSet$widgetData(com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy.a) d0Var.u().e(PackageWidgetDataEntity.class), realmGet$widgetData, z, map, set));
            }
        }
        return j;
    }

    public static PackageInfoEntity d(d0 d0Var, a aVar, PackageInfoEntity packageInfoEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        if ((packageInfoEntity instanceof r89) && !n0.isFrozen(packageInfoEntity)) {
            r89 r89Var = (r89) packageInfoEntity;
            if (r89Var.a().f() != null) {
                io.realm.a f = r89Var.a().f();
                if (f.b == d0Var.b) {
                    if (f.getPath().equals(d0Var.getPath())) {
                        return packageInfoEntity;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.k.get();
        r89 r89Var2 = map.get(packageInfoEntity);
        if (r89Var2 != null) {
            return (PackageInfoEntity) r89Var2;
        }
        return c(d0Var, aVar, packageInfoEntity, z, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static PackageInfoEntity f(PackageInfoEntity packageInfoEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        PackageInfoEntity packageInfoEntity2;
        if (i <= i2 && packageInfoEntity != null) {
            r89.a<o89> aVar = map.get(packageInfoEntity);
            if (aVar == null) {
                packageInfoEntity2 = new PackageInfoEntity();
                map.put(packageInfoEntity, new r89.a<>(i, packageInfoEntity2));
            } else if (i >= aVar.a) {
                return (PackageInfoEntity) aVar.b;
            } else {
                aVar.a = i;
                packageInfoEntity2 = (PackageInfoEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) packageInfoEntity).a().f();
            packageInfoEntity2.realmSet$type(packageInfoEntity.realmGet$type());
            packageInfoEntity2.realmSet$availableTypes(new k0<>());
            packageInfoEntity2.realmGet$availableTypes().addAll(packageInfoEntity.realmGet$availableTypes());
            packageInfoEntity2.realmSet$widgetData(com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy.f(packageInfoEntity.realmGet$widgetData(), i + 1, i2, map));
            return packageInfoEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "PackageInfoEntity", false, 3, 0);
        bVar.b("", MessageAttributes.TYPE, RealmFieldType.STRING, false, false, false);
        bVar.c("", "availableTypes", RealmFieldType.STRING_LIST, false);
        bVar.a("", "widgetData", RealmFieldType.OBJECT, "PackageWidgetDataEntity");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return e;
    }

    public static long i(d0 d0Var, PackageInfoEntity packageInfoEntity, Map<o89, Long> map) {
        long j;
        if ((packageInfoEntity instanceof r89) && !n0.isFrozen(packageInfoEntity)) {
            r89 r89Var = (r89) packageInfoEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(PackageInfoEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(PackageInfoEntity.class);
        long createRow = OsObject.createRow(I0);
        map.put(packageInfoEntity, Long.valueOf(createRow));
        String realmGet$type = packageInfoEntity.realmGet$type();
        if (realmGet$type != null) {
            j = createRow;
            Table.nativeSetString(nativePtr, aVar.e, createRow, realmGet$type, false);
        } else {
            j = createRow;
            Table.nativeSetNull(nativePtr, aVar.e, j, false);
        }
        long j2 = j;
        OsList osList = new OsList(I0.r(j2), aVar.f);
        osList.J();
        k0<String> realmGet$availableTypes = packageInfoEntity.realmGet$availableTypes();
        if (realmGet$availableTypes != null) {
            Iterator<String> it = realmGet$availableTypes.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.h();
                } else {
                    osList.l(next);
                }
            }
        }
        PackageWidgetDataEntity realmGet$widgetData = packageInfoEntity.realmGet$widgetData();
        if (realmGet$widgetData != null) {
            Long l = map.get(realmGet$widgetData);
            if (l == null) {
                l = Long.valueOf(com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy.i(d0Var, realmGet$widgetData, map));
            }
            Table.nativeSetLink(nativePtr, aVar.g, j2, l.longValue(), false);
            return j2;
        }
        Table.nativeNullifyLink(nativePtr, aVar.g, j2);
        return j2;
    }

    static com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(PackageInfoEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy com_dodopizza_persistence_entity_packageinfoentityrealmproxy = new com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_packageinfoentityrealmproxy;
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
        c0<PackageInfoEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy com_dodopizza_persistence_entity_packageinfoentityrealmproxy = (com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_packageinfoentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_packageinfoentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_packageinfoentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.PackageInfoEntity, defpackage.wec
    public k0<String> realmGet$availableTypes() {
        this.c.f().c();
        k0<String> k0Var = this.d;
        if (k0Var != null) {
            return k0Var;
        }
        k0<String> k0Var2 = new k0<>(String.class, this.c.g().N(this.b.f, RealmFieldType.STRING_LIST), this.c.f());
        this.d = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.PackageInfoEntity, defpackage.wec
    public String realmGet$type() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.PackageInfoEntity, defpackage.wec
    public PackageWidgetDataEntity realmGet$widgetData() {
        this.c.f().c();
        if (this.c.g().o0(this.b.g)) {
            return null;
        }
        return (PackageWidgetDataEntity) this.c.f().o(PackageWidgetDataEntity.class, this.c.g().L(this.b.g), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.PackageInfoEntity, defpackage.wec
    public void realmSet$availableTypes(k0<String> k0Var) {
        if (this.c.i() && (!this.c.d() || this.c.e().contains("availableTypes"))) {
            return;
        }
        this.c.f().c();
        OsList N = this.c.g().N(this.b.f, RealmFieldType.STRING_LIST);
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

    @Override // com.dodopizza.persistence.entity.PackageInfoEntity, defpackage.wec
    public void realmSet$type(String str) {
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

    @Override // com.dodopizza.persistence.entity.PackageInfoEntity, defpackage.wec
    public void realmSet$widgetData(PackageWidgetDataEntity packageWidgetDataEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("widgetData")) {
                return;
            }
            if (packageWidgetDataEntity != null && !n0.isManaged(packageWidgetDataEntity)) {
                packageWidgetDataEntity = (PackageWidgetDataEntity) d0Var.f0(packageWidgetDataEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (packageWidgetDataEntity == null) {
                g.l0(this.b.g);
                return;
            }
            this.c.c(packageWidgetDataEntity);
            g.o().B(this.b.g, g.E0(), ((r89) packageWidgetDataEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (packageWidgetDataEntity == null) {
            this.c.g().l0(this.b.g);
            return;
        }
        this.c.c(packageWidgetDataEntity);
        this.c.g().s(this.b.g, ((r89) packageWidgetDataEntity).a().g().E0());
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("PackageInfoEntity = proxy[");
        sb.append("{type:");
        String str2 = "null";
        if (realmGet$type() == null) {
            str = "null";
        } else {
            str = realmGet$type();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{availableTypes:");
        sb.append("RealmList<String>[");
        sb.append(realmGet$availableTypes().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{widgetData:");
        if (realmGet$widgetData() != null) {
            str2 = "PackageWidgetDataEntity";
        }
        sb.append(str2);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
