package io.realm;

import com.dodopizza.persistence.entity.PackageWidgetDataEntity;
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
public class com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy extends PackageWidgetDataEntity implements r89, xec {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<PackageWidgetDataEntity> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;
        long f;
        long g;
        long h;
        long i;

        a(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo b = osSchemaInfo.b("PackageWidgetDataEntity");
            this.e = a("title", "title", b);
            this.f = a("description", "description", b);
            this.g = a("switcherTitle", "switcherTitle", b);
            this.h = a("actionTitle", "actionTitle", b);
            this.i = a("actionUrl", "actionUrl", b);
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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy() {
        this.c.p();
    }

    public static PackageWidgetDataEntity c(d0 d0Var, a aVar, PackageWidgetDataEntity packageWidgetDataEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(packageWidgetDataEntity);
        if (r89Var != null) {
            return (PackageWidgetDataEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PackageWidgetDataEntity.class), set);
        osObjectBuilder.E0(aVar.e, packageWidgetDataEntity.realmGet$title());
        osObjectBuilder.E0(aVar.f, packageWidgetDataEntity.realmGet$description());
        osObjectBuilder.E0(aVar.g, packageWidgetDataEntity.realmGet$switcherTitle());
        osObjectBuilder.E0(aVar.h, packageWidgetDataEntity.realmGet$actionTitle());
        osObjectBuilder.E0(aVar.i, packageWidgetDataEntity.realmGet$actionUrl());
        com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(packageWidgetDataEntity, j);
        return j;
    }

    public static PackageWidgetDataEntity d(d0 d0Var, a aVar, PackageWidgetDataEntity packageWidgetDataEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        if ((packageWidgetDataEntity instanceof r89) && !n0.isFrozen(packageWidgetDataEntity)) {
            r89 r89Var = (r89) packageWidgetDataEntity;
            if (r89Var.a().f() != null) {
                io.realm.a f = r89Var.a().f();
                if (f.b == d0Var.b) {
                    if (f.getPath().equals(d0Var.getPath())) {
                        return packageWidgetDataEntity;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.k.get();
        r89 r89Var2 = map.get(packageWidgetDataEntity);
        if (r89Var2 != null) {
            return (PackageWidgetDataEntity) r89Var2;
        }
        return c(d0Var, aVar, packageWidgetDataEntity, z, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static PackageWidgetDataEntity f(PackageWidgetDataEntity packageWidgetDataEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        PackageWidgetDataEntity packageWidgetDataEntity2;
        if (i <= i2 && packageWidgetDataEntity != null) {
            r89.a<o89> aVar = map.get(packageWidgetDataEntity);
            if (aVar == null) {
                packageWidgetDataEntity2 = new PackageWidgetDataEntity();
                map.put(packageWidgetDataEntity, new r89.a<>(i, packageWidgetDataEntity2));
            } else if (i >= aVar.a) {
                return (PackageWidgetDataEntity) aVar.b;
            } else {
                aVar.a = i;
                packageWidgetDataEntity2 = (PackageWidgetDataEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) packageWidgetDataEntity).a().f();
            packageWidgetDataEntity2.realmSet$title(packageWidgetDataEntity.realmGet$title());
            packageWidgetDataEntity2.realmSet$description(packageWidgetDataEntity.realmGet$description());
            packageWidgetDataEntity2.realmSet$switcherTitle(packageWidgetDataEntity.realmGet$switcherTitle());
            packageWidgetDataEntity2.realmSet$actionTitle(packageWidgetDataEntity.realmGet$actionTitle());
            packageWidgetDataEntity2.realmSet$actionUrl(packageWidgetDataEntity.realmGet$actionUrl());
            return packageWidgetDataEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "PackageWidgetDataEntity", false, 5, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "title", realmFieldType, false, false, false);
        bVar.b("", "description", realmFieldType, false, false, false);
        bVar.b("", "switcherTitle", realmFieldType, false, false, false);
        bVar.b("", "actionTitle", realmFieldType, false, false, false);
        bVar.b("", "actionUrl", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, PackageWidgetDataEntity packageWidgetDataEntity, Map<o89, Long> map) {
        if ((packageWidgetDataEntity instanceof r89) && !n0.isFrozen(packageWidgetDataEntity)) {
            r89 r89Var = (r89) packageWidgetDataEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(PackageWidgetDataEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(PackageWidgetDataEntity.class);
        long createRow = OsObject.createRow(I0);
        map.put(packageWidgetDataEntity, Long.valueOf(createRow));
        String realmGet$title = packageWidgetDataEntity.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, aVar.e, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.e, createRow, false);
        }
        String realmGet$description = packageWidgetDataEntity.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, aVar.f, createRow, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f, createRow, false);
        }
        String realmGet$switcherTitle = packageWidgetDataEntity.realmGet$switcherTitle();
        if (realmGet$switcherTitle != null) {
            Table.nativeSetString(nativePtr, aVar.g, createRow, realmGet$switcherTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, createRow, false);
        }
        String realmGet$actionTitle = packageWidgetDataEntity.realmGet$actionTitle();
        if (realmGet$actionTitle != null) {
            Table.nativeSetString(nativePtr, aVar.h, createRow, realmGet$actionTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, createRow, false);
        }
        String realmGet$actionUrl = packageWidgetDataEntity.realmGet$actionUrl();
        if (realmGet$actionUrl != null) {
            Table.nativeSetString(nativePtr, aVar.i, createRow, realmGet$actionUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.i, createRow, false);
        }
        return createRow;
    }

    static com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(PackageWidgetDataEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy com_dodopizza_persistence_entity_packagewidgetdataentityrealmproxy = new com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_packagewidgetdataentityrealmproxy;
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
        c0<PackageWidgetDataEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy com_dodopizza_persistence_entity_packagewidgetdataentityrealmproxy = (com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_packagewidgetdataentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_packagewidgetdataentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_packagewidgetdataentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.PackageWidgetDataEntity, defpackage.xec
    public String realmGet$actionTitle() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.PackageWidgetDataEntity, defpackage.xec
    public String realmGet$actionUrl() {
        this.c.f().c();
        return this.c.g().p0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.PackageWidgetDataEntity, defpackage.xec
    public String realmGet$description() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.PackageWidgetDataEntity, defpackage.xec
    public String realmGet$switcherTitle() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.PackageWidgetDataEntity, defpackage.xec
    public String realmGet$title() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.PackageWidgetDataEntity, defpackage.xec
    public void realmSet$actionTitle(String str) {
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

    @Override // com.dodopizza.persistence.entity.PackageWidgetDataEntity, defpackage.xec
    public void realmSet$actionUrl(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.i, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.i, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.i);
        } else {
            this.c.g().i(this.b.i, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.PackageWidgetDataEntity, defpackage.xec
    public void realmSet$description(String str) {
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

    @Override // com.dodopizza.persistence.entity.PackageWidgetDataEntity, defpackage.xec
    public void realmSet$switcherTitle(String str) {
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

    @Override // com.dodopizza.persistence.entity.PackageWidgetDataEntity, defpackage.xec
    public void realmSet$title(String str) {
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

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("PackageWidgetDataEntity = proxy[");
        sb.append("{title:");
        String str5 = "null";
        if (realmGet$title() == null) {
            str = "null";
        } else {
            str = realmGet$title();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{description:");
        if (realmGet$description() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$description();
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{switcherTitle:");
        if (realmGet$switcherTitle() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$switcherTitle();
        }
        sb.append(str3);
        sb.append("}");
        sb.append(",");
        sb.append("{actionTitle:");
        if (realmGet$actionTitle() == null) {
            str4 = "null";
        } else {
            str4 = realmGet$actionTitle();
        }
        sb.append(str4);
        sb.append("}");
        sb.append(",");
        sb.append("{actionUrl:");
        if (realmGet$actionUrl() != null) {
            str5 = realmGet$actionUrl();
        }
        sb.append(str5);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
