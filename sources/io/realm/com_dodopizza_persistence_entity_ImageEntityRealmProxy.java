package io.realm;

import com.dodopizza.persistence.entity.ImageEntity;
import com.huawei.hms.push.constant.RemoteMessageConst;
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
public class com_dodopizza_persistence_entity_ImageEntityRealmProxy extends ImageEntity implements r89, uec {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<ImageEntity> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;
        long f;
        long g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b = osSchemaInfo.b("ImageEntity");
            this.e = a("size", "size", b);
            this.f = a(RemoteMessageConst.Notification.URL, RemoteMessageConst.Notification.URL, b);
            this.g = a("id", "id", b);
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
    public com_dodopizza_persistence_entity_ImageEntityRealmProxy() {
        this.c.p();
    }

    public static ImageEntity c(d0 d0Var, a aVar, ImageEntity imageEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(imageEntity);
        if (r89Var != null) {
            return (ImageEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(ImageEntity.class), set);
        osObjectBuilder.o0(aVar.e, Integer.valueOf(imageEntity.realmGet$size()));
        osObjectBuilder.E0(aVar.f, imageEntity.realmGet$url());
        osObjectBuilder.E0(aVar.g, imageEntity.realmGet$id());
        com_dodopizza_persistence_entity_ImageEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(imageEntity, j);
        return j;
    }

    public static ImageEntity d(d0 d0Var, a aVar, ImageEntity imageEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        if ((imageEntity instanceof r89) && !n0.isFrozen(imageEntity)) {
            r89 r89Var = (r89) imageEntity;
            if (r89Var.a().f() != null) {
                io.realm.a f = r89Var.a().f();
                if (f.b == d0Var.b) {
                    if (f.getPath().equals(d0Var.getPath())) {
                        return imageEntity;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.k.get();
        r89 r89Var2 = map.get(imageEntity);
        if (r89Var2 != null) {
            return (ImageEntity) r89Var2;
        }
        return c(d0Var, aVar, imageEntity, z, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static ImageEntity f(ImageEntity imageEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        ImageEntity imageEntity2;
        if (i <= i2 && imageEntity != null) {
            r89.a<o89> aVar = map.get(imageEntity);
            if (aVar == null) {
                imageEntity2 = new ImageEntity();
                map.put(imageEntity, new r89.a<>(i, imageEntity2));
            } else if (i >= aVar.a) {
                return (ImageEntity) aVar.b;
            } else {
                aVar.a = i;
                imageEntity2 = (ImageEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) imageEntity).a().f();
            imageEntity2.realmSet$size(imageEntity.realmGet$size());
            imageEntity2.realmSet$url(imageEntity.realmGet$url());
            imageEntity2.realmSet$id(imageEntity.realmGet$id());
            return imageEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "ImageEntity", false, 3, 0);
        bVar.b("", "size", RealmFieldType.INTEGER, false, false, true);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", RemoteMessageConst.Notification.URL, realmFieldType, false, false, true);
        bVar.b("", "id", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, ImageEntity imageEntity, Map<o89, Long> map) {
        if ((imageEntity instanceof r89) && !n0.isFrozen(imageEntity)) {
            r89 r89Var = (r89) imageEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(ImageEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(ImageEntity.class);
        long createRow = OsObject.createRow(I0);
        map.put(imageEntity, Long.valueOf(createRow));
        Table.nativeSetLong(nativePtr, aVar.e, createRow, imageEntity.realmGet$size(), false);
        String realmGet$url = imageEntity.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, aVar.f, createRow, realmGet$url, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f, createRow, false);
        }
        String realmGet$id = imageEntity.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, aVar.g, createRow, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, createRow, false);
        }
        return createRow;
    }

    static com_dodopizza_persistence_entity_ImageEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(ImageEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_ImageEntityRealmProxy com_dodopizza_persistence_entity_imageentityrealmproxy = new com_dodopizza_persistence_entity_ImageEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_imageentityrealmproxy;
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
        c0<ImageEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_ImageEntityRealmProxy com_dodopizza_persistence_entity_imageentityrealmproxy = (com_dodopizza_persistence_entity_ImageEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_imageentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_imageentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_imageentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.ImageEntity, defpackage.uec
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.ImageEntity, defpackage.uec
    public int realmGet$size() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.ImageEntity, defpackage.uec
    public String realmGet$url() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.ImageEntity, defpackage.uec
    public void realmSet$id(String str) {
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

    @Override // com.dodopizza.persistence.entity.ImageEntity, defpackage.uec
    public void realmSet$size(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.e, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.e, i);
    }

    @Override // com.dodopizza.persistence.entity.ImageEntity, defpackage.uec
    public void realmSet$url(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.f, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'url' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'url' to null.");
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ImageEntity = proxy[");
        sb.append("{size:");
        sb.append(realmGet$size());
        sb.append("}");
        sb.append(",");
        sb.append("{url:");
        sb.append(realmGet$url());
        sb.append("}");
        sb.append(",");
        sb.append("{id:");
        if (realmGet$id() != null) {
            str = realmGet$id();
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
