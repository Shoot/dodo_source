package io.realm;

import com.dodopizza.persistence.entity.cart.UpsaleEntity;
import com.dodopizza.persistence.entity.cart.UpsaleProductEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy;
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
public class com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy extends UpsaleEntity implements r89, agc {
    private static final OsObjectSchemaInfo e = g();
    private a b;
    private c0<UpsaleEntity> c;
    private k0<UpsaleProductEntity> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;
        long f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b = osSchemaInfo.b("UpsaleEntity");
            this.e = a("products", "products", b);
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
    public com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy() {
        this.c.p();
    }

    public static UpsaleEntity c(d0 d0Var, a aVar, UpsaleEntity upsaleEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(upsaleEntity);
        if (r89Var != null) {
            return (UpsaleEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(UpsaleEntity.class), set);
        osObjectBuilder.E0(aVar.f, upsaleEntity.realmGet$id());
        com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(upsaleEntity, j);
        k0<UpsaleProductEntity> realmGet$products = upsaleEntity.realmGet$products();
        if (realmGet$products != null) {
            k0<UpsaleProductEntity> realmGet$products2 = j.realmGet$products();
            realmGet$products2.clear();
            for (int i = 0; i < realmGet$products.size(); i++) {
                UpsaleProductEntity upsaleProductEntity = realmGet$products.get(i);
                UpsaleProductEntity upsaleProductEntity2 = (UpsaleProductEntity) map.get(upsaleProductEntity);
                if (upsaleProductEntity2 != null) {
                    realmGet$products2.add(upsaleProductEntity2);
                } else {
                    realmGet$products2.add(com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy.a) d0Var.u().e(UpsaleProductEntity.class), upsaleProductEntity, z, map, set));
                }
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
    public static com.dodopizza.persistence.entity.cart.UpsaleEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy.a r9, com.dodopizza.persistence.entity.cart.UpsaleEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.cart.UpsaleEntity r1 = (com.dodopizza.persistence.entity.cart.UpsaleEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.cart.UpsaleEntity> r2 = com.dodopizza.persistence.entity.cart.UpsaleEntity.class
            io.realm.internal.Table r2 = r8.I0(r2)
            long r3 = r9.f
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
            io.realm.com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.cart.UpsaleEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.cart.UpsaleEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy$a, com.dodopizza.persistence.entity.cart.UpsaleEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.cart.UpsaleEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static UpsaleEntity f(UpsaleEntity upsaleEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        UpsaleEntity upsaleEntity2;
        if (i > i2 || upsaleEntity == null) {
            return null;
        }
        r89.a<o89> aVar = map.get(upsaleEntity);
        if (aVar == null) {
            upsaleEntity2 = new UpsaleEntity();
            map.put(upsaleEntity, new r89.a<>(i, upsaleEntity2));
        } else if (i >= aVar.a) {
            return (UpsaleEntity) aVar.b;
        } else {
            aVar.a = i;
            upsaleEntity2 = (UpsaleEntity) aVar.b;
        }
        d0 d0Var = (d0) ((r89) upsaleEntity).a().f();
        if (i == i2) {
            upsaleEntity2.realmSet$products(null);
        } else {
            k0<UpsaleProductEntity> realmGet$products = upsaleEntity.realmGet$products();
            k0<UpsaleProductEntity> k0Var = new k0<>();
            upsaleEntity2.realmSet$products(k0Var);
            int i3 = i + 1;
            int size = realmGet$products.size();
            for (int i4 = 0; i4 < size; i4++) {
                k0Var.add(com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy.f(realmGet$products.get(i4), i3, i2, map));
            }
        }
        upsaleEntity2.realmSet$id(upsaleEntity.realmGet$id());
        return upsaleEntity2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "UpsaleEntity", false, 2, 0);
        bVar.a("", "products", RealmFieldType.LIST, "UpsaleProductEntity");
        bVar.b("", "id", RealmFieldType.STRING, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return e;
    }

    public static long i(d0 d0Var, UpsaleEntity upsaleEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((upsaleEntity instanceof r89) && !n0.isFrozen(upsaleEntity)) {
            r89 r89Var = (r89) upsaleEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(UpsaleEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(UpsaleEntity.class);
        long j = aVar.f;
        String realmGet$id = upsaleEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        map.put(upsaleEntity, Long.valueOf(nativeFindFirstString));
        OsList osList = new OsList(I0.r(nativeFindFirstString), aVar.e);
        k0<UpsaleProductEntity> realmGet$products = upsaleEntity.realmGet$products();
        if (realmGet$products != null && realmGet$products.size() == osList.X()) {
            int size = realmGet$products.size();
            for (int i = 0; i < size; i++) {
                UpsaleProductEntity upsaleProductEntity = realmGet$products.get(i);
                Long l = map.get(upsaleProductEntity);
                if (l == null) {
                    l = Long.valueOf(com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy.i(d0Var, upsaleProductEntity, map));
                }
                osList.U(i, l.longValue());
            }
        } else {
            osList.J();
            if (realmGet$products != null) {
                Iterator<UpsaleProductEntity> it = realmGet$products.iterator();
                while (it.hasNext()) {
                    UpsaleProductEntity next = it.next();
                    Long l2 = map.get(next);
                    if (l2 == null) {
                        l2 = Long.valueOf(com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy.i(d0Var, next, map));
                    }
                    osList.k(l2.longValue());
                }
            }
        }
        return nativeFindFirstString;
    }

    static com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(UpsaleEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy com_dodopizza_persistence_entity_cart_upsaleentityrealmproxy = new com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_cart_upsaleentityrealmproxy;
    }

    static UpsaleEntity k(d0 d0Var, a aVar, UpsaleEntity upsaleEntity, UpsaleEntity upsaleEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(UpsaleEntity.class), set);
        k0<UpsaleProductEntity> realmGet$products = upsaleEntity2.realmGet$products();
        if (realmGet$products != null) {
            k0 k0Var = new k0();
            for (int i = 0; i < realmGet$products.size(); i++) {
                UpsaleProductEntity upsaleProductEntity = realmGet$products.get(i);
                UpsaleProductEntity upsaleProductEntity2 = (UpsaleProductEntity) map.get(upsaleProductEntity);
                if (upsaleProductEntity2 != null) {
                    k0Var.add(upsaleProductEntity2);
                } else {
                    k0Var.add(com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy.a) d0Var.u().e(UpsaleProductEntity.class), upsaleProductEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.e, k0Var);
        } else {
            osObjectBuilder.z0(aVar.e, new k0());
        }
        osObjectBuilder.E0(aVar.f, upsaleEntity2.realmGet$id());
        osObjectBuilder.K0();
        return upsaleEntity;
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
        c0<UpsaleEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy com_dodopizza_persistence_entity_cart_upsaleentityrealmproxy = (com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_cart_upsaleentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_cart_upsaleentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_cart_upsaleentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.cart.UpsaleEntity, defpackage.agc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleEntity, defpackage.agc
    public k0<UpsaleProductEntity> realmGet$products() {
        this.c.f().c();
        k0<UpsaleProductEntity> k0Var = this.d;
        if (k0Var != null) {
            return k0Var;
        }
        k0<UpsaleProductEntity> k0Var2 = new k0<>(UpsaleProductEntity.class, this.c.g().f0(this.b.e), this.c.f());
        this.d = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleEntity, defpackage.agc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleEntity, defpackage.agc
    public void realmSet$products(k0<UpsaleProductEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("products")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<UpsaleProductEntity> k0Var2 = new k0<>();
                Iterator<UpsaleProductEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    UpsaleProductEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((UpsaleProductEntity) d0Var.j0(next, new ex4[0]));
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
                UpsaleProductEntity upsaleProductEntity = k0Var.get(i);
                this.c.c(upsaleProductEntity);
                f0.U(i, ((r89) upsaleProductEntity).a().g().E0());
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
            UpsaleProductEntity upsaleProductEntity2 = k0Var.get(i);
            this.c.c(upsaleProductEntity2);
            f0.k(((r89) upsaleProductEntity2).a().g().E0());
            i++;
        }
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("UpsaleEntity = proxy[");
        sb.append("{products:");
        sb.append("RealmList<UpsaleProductEntity>[");
        sb.append(realmGet$products().size());
        sb.append("]");
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
