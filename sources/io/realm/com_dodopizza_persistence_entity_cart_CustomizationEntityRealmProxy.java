package io.realm;

import com.dodopizza.persistence.entity.cart.AddedIngredientEntity;
import com.dodopizza.persistence.entity.cart.CustomizationEntity;
import com.dodopizza.persistence.entity.cart.RemovedIngredientEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_cart_AddedIngredientEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_RemovedIngredientEntityRealmProxy;
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
public class com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy extends CustomizationEntity implements r89, ofc {
    private static final OsObjectSchemaInfo f = g();
    private a b;
    private c0<CustomizationEntity> c;
    private k0<AddedIngredientEntity> d;
    private k0<RemovedIngredientEntity> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;
        long f;
        long g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b = osSchemaInfo.b("CustomizationEntity");
            this.e = a("id", "id", b);
            this.f = a("addedIngredients", "addedIngredients", b);
            this.g = a("removedIngredients", "removedIngredients", b);
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
    public com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy() {
        this.c.p();
    }

    public static CustomizationEntity c(d0 d0Var, a aVar, CustomizationEntity customizationEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(customizationEntity);
        if (r89Var != null) {
            return (CustomizationEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(CustomizationEntity.class), set);
        osObjectBuilder.E0(aVar.e, customizationEntity.realmGet$id());
        com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(customizationEntity, j);
        k0<AddedIngredientEntity> realmGet$addedIngredients = customizationEntity.realmGet$addedIngredients();
        if (realmGet$addedIngredients != null) {
            k0<AddedIngredientEntity> realmGet$addedIngredients2 = j.realmGet$addedIngredients();
            realmGet$addedIngredients2.clear();
            for (int i = 0; i < realmGet$addedIngredients.size(); i++) {
                AddedIngredientEntity addedIngredientEntity = realmGet$addedIngredients.get(i);
                AddedIngredientEntity addedIngredientEntity2 = (AddedIngredientEntity) map.get(addedIngredientEntity);
                if (addedIngredientEntity2 != null) {
                    realmGet$addedIngredients2.add(addedIngredientEntity2);
                } else {
                    realmGet$addedIngredients2.add(com_dodopizza_persistence_entity_cart_AddedIngredientEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_AddedIngredientEntityRealmProxy.a) d0Var.u().e(AddedIngredientEntity.class), addedIngredientEntity, z, map, set));
                }
            }
        }
        k0<RemovedIngredientEntity> realmGet$removedIngredients = customizationEntity.realmGet$removedIngredients();
        if (realmGet$removedIngredients != null) {
            k0<RemovedIngredientEntity> realmGet$removedIngredients2 = j.realmGet$removedIngredients();
            realmGet$removedIngredients2.clear();
            for (int i2 = 0; i2 < realmGet$removedIngredients.size(); i2++) {
                RemovedIngredientEntity removedIngredientEntity = realmGet$removedIngredients.get(i2);
                RemovedIngredientEntity removedIngredientEntity2 = (RemovedIngredientEntity) map.get(removedIngredientEntity);
                if (removedIngredientEntity2 != null) {
                    realmGet$removedIngredients2.add(removedIngredientEntity2);
                } else {
                    realmGet$removedIngredients2.add(com_dodopizza_persistence_entity_cart_RemovedIngredientEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_RemovedIngredientEntityRealmProxy.a) d0Var.u().e(RemovedIngredientEntity.class), removedIngredientEntity, z, map, set));
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
    public static com.dodopizza.persistence.entity.cart.CustomizationEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.a r9, com.dodopizza.persistence.entity.cart.CustomizationEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.cart.CustomizationEntity r1 = (com.dodopizza.persistence.entity.cart.CustomizationEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.cart.CustomizationEntity> r2 = com.dodopizza.persistence.entity.cart.CustomizationEntity.class
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
            io.realm.com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.cart.CustomizationEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.cart.CustomizationEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy$a, com.dodopizza.persistence.entity.cart.CustomizationEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.cart.CustomizationEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static CustomizationEntity f(CustomizationEntity customizationEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        CustomizationEntity customizationEntity2;
        if (i > i2 || customizationEntity == null) {
            return null;
        }
        r89.a<o89> aVar = map.get(customizationEntity);
        if (aVar == null) {
            customizationEntity2 = new CustomizationEntity();
            map.put(customizationEntity, new r89.a<>(i, customizationEntity2));
        } else if (i >= aVar.a) {
            return (CustomizationEntity) aVar.b;
        } else {
            aVar.a = i;
            customizationEntity2 = (CustomizationEntity) aVar.b;
        }
        d0 d0Var = (d0) ((r89) customizationEntity).a().f();
        customizationEntity2.realmSet$id(customizationEntity.realmGet$id());
        if (i == i2) {
            customizationEntity2.realmSet$addedIngredients(null);
        } else {
            k0<AddedIngredientEntity> realmGet$addedIngredients = customizationEntity.realmGet$addedIngredients();
            k0<AddedIngredientEntity> k0Var = new k0<>();
            customizationEntity2.realmSet$addedIngredients(k0Var);
            int i3 = i + 1;
            int size = realmGet$addedIngredients.size();
            for (int i4 = 0; i4 < size; i4++) {
                k0Var.add(com_dodopizza_persistence_entity_cart_AddedIngredientEntityRealmProxy.f(realmGet$addedIngredients.get(i4), i3, i2, map));
            }
        }
        if (i == i2) {
            customizationEntity2.realmSet$removedIngredients(null);
        } else {
            k0<RemovedIngredientEntity> realmGet$removedIngredients = customizationEntity.realmGet$removedIngredients();
            k0<RemovedIngredientEntity> k0Var2 = new k0<>();
            customizationEntity2.realmSet$removedIngredients(k0Var2);
            int i5 = i + 1;
            int size2 = realmGet$removedIngredients.size();
            for (int i6 = 0; i6 < size2; i6++) {
                k0Var2.add(com_dodopizza_persistence_entity_cart_RemovedIngredientEntityRealmProxy.f(realmGet$removedIngredients.get(i6), i5, i2, map));
            }
        }
        return customizationEntity2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "CustomizationEntity", false, 3, 0);
        bVar.b("", "id", RealmFieldType.STRING, true, false, false);
        RealmFieldType realmFieldType = RealmFieldType.LIST;
        bVar.a("", "addedIngredients", realmFieldType, "AddedIngredientEntity");
        bVar.a("", "removedIngredients", realmFieldType, "RemovedIngredientEntity");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f;
    }

    public static long i(d0 d0Var, CustomizationEntity customizationEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((customizationEntity instanceof r89) && !n0.isFrozen(customizationEntity)) {
            r89 r89Var = (r89) customizationEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(CustomizationEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(CustomizationEntity.class);
        long j = aVar.e;
        String realmGet$id = customizationEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        map.put(customizationEntity, Long.valueOf(nativeFindFirstString));
        OsList osList = new OsList(I0.r(nativeFindFirstString), aVar.f);
        k0<AddedIngredientEntity> realmGet$addedIngredients = customizationEntity.realmGet$addedIngredients();
        if (realmGet$addedIngredients != null && realmGet$addedIngredients.size() == osList.X()) {
            int size = realmGet$addedIngredients.size();
            for (int i = 0; i < size; i++) {
                AddedIngredientEntity addedIngredientEntity = realmGet$addedIngredients.get(i);
                Long l = map.get(addedIngredientEntity);
                if (l == null) {
                    l = Long.valueOf(com_dodopizza_persistence_entity_cart_AddedIngredientEntityRealmProxy.i(d0Var, addedIngredientEntity, map));
                }
                osList.U(i, l.longValue());
            }
        } else {
            osList.J();
            if (realmGet$addedIngredients != null) {
                Iterator<AddedIngredientEntity> it = realmGet$addedIngredients.iterator();
                while (it.hasNext()) {
                    AddedIngredientEntity next = it.next();
                    Long l2 = map.get(next);
                    if (l2 == null) {
                        l2 = Long.valueOf(com_dodopizza_persistence_entity_cart_AddedIngredientEntityRealmProxy.i(d0Var, next, map));
                    }
                    osList.k(l2.longValue());
                }
            }
        }
        OsList osList2 = new OsList(I0.r(nativeFindFirstString), aVar.g);
        k0<RemovedIngredientEntity> realmGet$removedIngredients = customizationEntity.realmGet$removedIngredients();
        if (realmGet$removedIngredients != null && realmGet$removedIngredients.size() == osList2.X()) {
            int size2 = realmGet$removedIngredients.size();
            for (int i2 = 0; i2 < size2; i2++) {
                RemovedIngredientEntity removedIngredientEntity = realmGet$removedIngredients.get(i2);
                Long l3 = map.get(removedIngredientEntity);
                if (l3 == null) {
                    l3 = Long.valueOf(com_dodopizza_persistence_entity_cart_RemovedIngredientEntityRealmProxy.i(d0Var, removedIngredientEntity, map));
                }
                osList2.U(i2, l3.longValue());
            }
        } else {
            osList2.J();
            if (realmGet$removedIngredients != null) {
                Iterator<RemovedIngredientEntity> it2 = realmGet$removedIngredients.iterator();
                while (it2.hasNext()) {
                    RemovedIngredientEntity next2 = it2.next();
                    Long l4 = map.get(next2);
                    if (l4 == null) {
                        l4 = Long.valueOf(com_dodopizza_persistence_entity_cart_RemovedIngredientEntityRealmProxy.i(d0Var, next2, map));
                    }
                    osList2.k(l4.longValue());
                }
            }
        }
        return nativeFindFirstString;
    }

    static com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(CustomizationEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy com_dodopizza_persistence_entity_cart_customizationentityrealmproxy = new com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_cart_customizationentityrealmproxy;
    }

    static CustomizationEntity k(d0 d0Var, a aVar, CustomizationEntity customizationEntity, CustomizationEntity customizationEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(CustomizationEntity.class), set);
        osObjectBuilder.E0(aVar.e, customizationEntity2.realmGet$id());
        k0<AddedIngredientEntity> realmGet$addedIngredients = customizationEntity2.realmGet$addedIngredients();
        if (realmGet$addedIngredients != null) {
            k0 k0Var = new k0();
            for (int i = 0; i < realmGet$addedIngredients.size(); i++) {
                AddedIngredientEntity addedIngredientEntity = realmGet$addedIngredients.get(i);
                AddedIngredientEntity addedIngredientEntity2 = (AddedIngredientEntity) map.get(addedIngredientEntity);
                if (addedIngredientEntity2 != null) {
                    k0Var.add(addedIngredientEntity2);
                } else {
                    k0Var.add(com_dodopizza_persistence_entity_cart_AddedIngredientEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_AddedIngredientEntityRealmProxy.a) d0Var.u().e(AddedIngredientEntity.class), addedIngredientEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.f, k0Var);
        } else {
            osObjectBuilder.z0(aVar.f, new k0());
        }
        k0<RemovedIngredientEntity> realmGet$removedIngredients = customizationEntity2.realmGet$removedIngredients();
        if (realmGet$removedIngredients != null) {
            k0 k0Var2 = new k0();
            for (int i2 = 0; i2 < realmGet$removedIngredients.size(); i2++) {
                RemovedIngredientEntity removedIngredientEntity = realmGet$removedIngredients.get(i2);
                RemovedIngredientEntity removedIngredientEntity2 = (RemovedIngredientEntity) map.get(removedIngredientEntity);
                if (removedIngredientEntity2 != null) {
                    k0Var2.add(removedIngredientEntity2);
                } else {
                    k0Var2.add(com_dodopizza_persistence_entity_cart_RemovedIngredientEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_RemovedIngredientEntityRealmProxy.a) d0Var.u().e(RemovedIngredientEntity.class), removedIngredientEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.g, k0Var2);
        } else {
            osObjectBuilder.z0(aVar.g, new k0());
        }
        osObjectBuilder.K0();
        return customizationEntity;
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
        c0<CustomizationEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy com_dodopizza_persistence_entity_cart_customizationentityrealmproxy = (com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy) obj;
        io.realm.a f2 = this.c.f();
        io.realm.a f3 = com_dodopizza_persistence_entity_cart_customizationentityrealmproxy.c.f();
        String path = f2.getPath();
        String path2 = f3.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f2.E() != f3.E() || !f2.e.getVersionID().equals(f3.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_cart_customizationentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_cart_customizationentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.cart.CustomizationEntity, defpackage.ofc
    public k0<AddedIngredientEntity> realmGet$addedIngredients() {
        this.c.f().c();
        k0<AddedIngredientEntity> k0Var = this.d;
        if (k0Var != null) {
            return k0Var;
        }
        k0<AddedIngredientEntity> k0Var2 = new k0<>(AddedIngredientEntity.class, this.c.g().f0(this.b.f), this.c.f());
        this.d = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.cart.CustomizationEntity, defpackage.ofc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.cart.CustomizationEntity, defpackage.ofc
    public k0<RemovedIngredientEntity> realmGet$removedIngredients() {
        this.c.f().c();
        k0<RemovedIngredientEntity> k0Var = this.e;
        if (k0Var != null) {
            return k0Var;
        }
        k0<RemovedIngredientEntity> k0Var2 = new k0<>(RemovedIngredientEntity.class, this.c.g().f0(this.b.g), this.c.f());
        this.e = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.cart.CustomizationEntity, defpackage.ofc
    public void realmSet$addedIngredients(k0<AddedIngredientEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("addedIngredients")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<AddedIngredientEntity> k0Var2 = new k0<>();
                Iterator<AddedIngredientEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    AddedIngredientEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((AddedIngredientEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.f);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i < size) {
                AddedIngredientEntity addedIngredientEntity = k0Var.get(i);
                this.c.c(addedIngredientEntity);
                f0.U(i, ((r89) addedIngredientEntity).a().g().E0());
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
            AddedIngredientEntity addedIngredientEntity2 = k0Var.get(i);
            this.c.c(addedIngredientEntity2);
            f0.k(((r89) addedIngredientEntity2).a().g().E0());
            i++;
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.CustomizationEntity, defpackage.ofc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.cart.CustomizationEntity, defpackage.ofc
    public void realmSet$removedIngredients(k0<RemovedIngredientEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("removedIngredients")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<RemovedIngredientEntity> k0Var2 = new k0<>();
                Iterator<RemovedIngredientEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    RemovedIngredientEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((RemovedIngredientEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.g);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i < size) {
                RemovedIngredientEntity removedIngredientEntity = k0Var.get(i);
                this.c.c(removedIngredientEntity);
                f0.U(i, ((r89) removedIngredientEntity).a().g().E0());
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
            RemovedIngredientEntity removedIngredientEntity2 = k0Var.get(i);
            this.c.c(removedIngredientEntity2);
            f0.k(((r89) removedIngredientEntity2).a().g().E0());
            i++;
        }
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CustomizationEntity = proxy[");
        sb.append("{id:");
        if (realmGet$id() != null) {
            str = realmGet$id();
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{addedIngredients:");
        sb.append("RealmList<AddedIngredientEntity>[");
        sb.append(realmGet$addedIngredients().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{removedIngredients:");
        sb.append("RealmList<RemovedIngredientEntity>[");
        sb.append(realmGet$removedIngredients().size());
        sb.append("]");
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
