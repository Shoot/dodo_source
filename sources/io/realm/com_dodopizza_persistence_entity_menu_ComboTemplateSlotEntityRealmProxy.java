package io.realm;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity;
import com.dodopizza.persistence.entity.menu.ComboTemplateSlotProductEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_menu_ComboTemplateSlotProductEntityRealmProxy;
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
public class com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy extends ComboTemplateSlotEntity implements r89, qgc {
    private static final OsObjectSchemaInfo e = g();
    private a b;
    private c0<ComboTemplateSlotEntity> c;
    private k0<ComboTemplateSlotProductEntity> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;
        long f;
        long g;
        long h;
        long i;
        long j;

        a(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo b = osSchemaInfo.b("ComboTemplateSlotEntity");
            this.e = a(ShoppingInfoEntity.FIELD_EXTERNAL_ID, ShoppingInfoEntity.FIELD_EXTERNAL_ID, b);
            this.f = a(Action.NAME_ATTRIBUTE, Action.NAME_ATTRIBUTE, b);
            this.g = a("priority", "priority", b);
            this.h = a("defaultProduct", "defaultProduct", b);
            this.i = a("slotProducts", "slotProducts", b);
            this.j = a("id", "id", b);
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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy() {
        this.c.p();
    }

    public static ComboTemplateSlotEntity c(d0 d0Var, a aVar, ComboTemplateSlotEntity comboTemplateSlotEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(comboTemplateSlotEntity);
        if (r89Var != null) {
            return (ComboTemplateSlotEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(ComboTemplateSlotEntity.class), set);
        osObjectBuilder.E0(aVar.e, comboTemplateSlotEntity.realmGet$externalId());
        osObjectBuilder.E0(aVar.f, comboTemplateSlotEntity.realmGet$name());
        osObjectBuilder.o0(aVar.g, Integer.valueOf(comboTemplateSlotEntity.realmGet$priority()));
        osObjectBuilder.E0(aVar.h, comboTemplateSlotEntity.realmGet$defaultProduct());
        osObjectBuilder.E0(aVar.j, comboTemplateSlotEntity.realmGet$id());
        com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(comboTemplateSlotEntity, j);
        k0<ComboTemplateSlotProductEntity> realmGet$slotProducts = comboTemplateSlotEntity.realmGet$slotProducts();
        if (realmGet$slotProducts != null) {
            k0<ComboTemplateSlotProductEntity> realmGet$slotProducts2 = j.realmGet$slotProducts();
            realmGet$slotProducts2.clear();
            for (int i = 0; i < realmGet$slotProducts.size(); i++) {
                ComboTemplateSlotProductEntity comboTemplateSlotProductEntity = realmGet$slotProducts.get(i);
                ComboTemplateSlotProductEntity comboTemplateSlotProductEntity2 = (ComboTemplateSlotProductEntity) map.get(comboTemplateSlotProductEntity);
                if (comboTemplateSlotProductEntity2 != null) {
                    realmGet$slotProducts2.add(comboTemplateSlotProductEntity2);
                } else {
                    realmGet$slotProducts2.add(com_dodopizza_persistence_entity_menu_ComboTemplateSlotProductEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_ComboTemplateSlotProductEntityRealmProxy.a) d0Var.u().e(ComboTemplateSlotProductEntity.class), comboTemplateSlotProductEntity, z, map, set));
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
    public static com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy.a r9, com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity r1 = (com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity> r2 = com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity.class
            io.realm.internal.Table r2 = r8.I0(r2)
            long r3 = r9.j
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
            io.realm.com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy$a, com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static ComboTemplateSlotEntity f(ComboTemplateSlotEntity comboTemplateSlotEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        ComboTemplateSlotEntity comboTemplateSlotEntity2;
        if (i > i2 || comboTemplateSlotEntity == null) {
            return null;
        }
        r89.a<o89> aVar = map.get(comboTemplateSlotEntity);
        if (aVar == null) {
            comboTemplateSlotEntity2 = new ComboTemplateSlotEntity();
            map.put(comboTemplateSlotEntity, new r89.a<>(i, comboTemplateSlotEntity2));
        } else if (i >= aVar.a) {
            return (ComboTemplateSlotEntity) aVar.b;
        } else {
            aVar.a = i;
            comboTemplateSlotEntity2 = (ComboTemplateSlotEntity) aVar.b;
        }
        d0 d0Var = (d0) ((r89) comboTemplateSlotEntity).a().f();
        comboTemplateSlotEntity2.realmSet$externalId(comboTemplateSlotEntity.realmGet$externalId());
        comboTemplateSlotEntity2.realmSet$name(comboTemplateSlotEntity.realmGet$name());
        comboTemplateSlotEntity2.realmSet$priority(comboTemplateSlotEntity.realmGet$priority());
        comboTemplateSlotEntity2.realmSet$defaultProduct(comboTemplateSlotEntity.realmGet$defaultProduct());
        if (i == i2) {
            comboTemplateSlotEntity2.realmSet$slotProducts(null);
        } else {
            k0<ComboTemplateSlotProductEntity> realmGet$slotProducts = comboTemplateSlotEntity.realmGet$slotProducts();
            k0<ComboTemplateSlotProductEntity> k0Var = new k0<>();
            comboTemplateSlotEntity2.realmSet$slotProducts(k0Var);
            int i3 = i + 1;
            int size = realmGet$slotProducts.size();
            for (int i4 = 0; i4 < size; i4++) {
                k0Var.add(com_dodopizza_persistence_entity_menu_ComboTemplateSlotProductEntityRealmProxy.f(realmGet$slotProducts.get(i4), i3, i2, map));
            }
        }
        comboTemplateSlotEntity2.realmSet$id(comboTemplateSlotEntity.realmGet$id());
        return comboTemplateSlotEntity2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "ComboTemplateSlotEntity", false, 6, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", ShoppingInfoEntity.FIELD_EXTERNAL_ID, realmFieldType, false, false, false);
        bVar.b("", Action.NAME_ATTRIBUTE, realmFieldType, false, false, true);
        bVar.b("", "priority", RealmFieldType.INTEGER, false, false, true);
        bVar.b("", "defaultProduct", realmFieldType, false, false, false);
        bVar.a("", "slotProducts", RealmFieldType.LIST, "ComboTemplateSlotProductEntity");
        bVar.b("", "id", realmFieldType, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return e;
    }

    public static long i(d0 d0Var, ComboTemplateSlotEntity comboTemplateSlotEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        long j;
        if ((comboTemplateSlotEntity instanceof r89) && !n0.isFrozen(comboTemplateSlotEntity)) {
            r89 r89Var = (r89) comboTemplateSlotEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(ComboTemplateSlotEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(ComboTemplateSlotEntity.class);
        long j2 = aVar.j;
        String realmGet$id = comboTemplateSlotEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j2, realmGet$id);
        }
        long j3 = nativeFindFirstString;
        map.put(comboTemplateSlotEntity, Long.valueOf(j3));
        String realmGet$externalId = comboTemplateSlotEntity.realmGet$externalId();
        if (realmGet$externalId != null) {
            j = j3;
            Table.nativeSetString(nativePtr, aVar.e, j3, realmGet$externalId, false);
        } else {
            j = j3;
            Table.nativeSetNull(nativePtr, aVar.e, j, false);
        }
        String realmGet$name = comboTemplateSlotEntity.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, aVar.f, j, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f, j, false);
        }
        Table.nativeSetLong(nativePtr, aVar.g, j, comboTemplateSlotEntity.realmGet$priority(), false);
        String realmGet$defaultProduct = comboTemplateSlotEntity.realmGet$defaultProduct();
        if (realmGet$defaultProduct != null) {
            Table.nativeSetString(nativePtr, aVar.h, j, realmGet$defaultProduct, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, j, false);
        }
        long j4 = j;
        OsList osList = new OsList(I0.r(j4), aVar.i);
        k0<ComboTemplateSlotProductEntity> realmGet$slotProducts = comboTemplateSlotEntity.realmGet$slotProducts();
        if (realmGet$slotProducts != null && realmGet$slotProducts.size() == osList.X()) {
            int size = realmGet$slotProducts.size();
            for (int i = 0; i < size; i++) {
                ComboTemplateSlotProductEntity comboTemplateSlotProductEntity = realmGet$slotProducts.get(i);
                Long l = map.get(comboTemplateSlotProductEntity);
                if (l == null) {
                    l = Long.valueOf(com_dodopizza_persistence_entity_menu_ComboTemplateSlotProductEntityRealmProxy.i(d0Var, comboTemplateSlotProductEntity, map));
                }
                osList.U(i, l.longValue());
            }
        } else {
            osList.J();
            if (realmGet$slotProducts != null) {
                Iterator<ComboTemplateSlotProductEntity> it = realmGet$slotProducts.iterator();
                while (it.hasNext()) {
                    ComboTemplateSlotProductEntity next = it.next();
                    Long l2 = map.get(next);
                    if (l2 == null) {
                        l2 = Long.valueOf(com_dodopizza_persistence_entity_menu_ComboTemplateSlotProductEntityRealmProxy.i(d0Var, next, map));
                    }
                    osList.k(l2.longValue());
                }
            }
        }
        return j4;
    }

    static com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(ComboTemplateSlotEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy com_dodopizza_persistence_entity_menu_combotemplateslotentityrealmproxy = new com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_menu_combotemplateslotentityrealmproxy;
    }

    static ComboTemplateSlotEntity k(d0 d0Var, a aVar, ComboTemplateSlotEntity comboTemplateSlotEntity, ComboTemplateSlotEntity comboTemplateSlotEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(ComboTemplateSlotEntity.class), set);
        osObjectBuilder.E0(aVar.e, comboTemplateSlotEntity2.realmGet$externalId());
        osObjectBuilder.E0(aVar.f, comboTemplateSlotEntity2.realmGet$name());
        osObjectBuilder.o0(aVar.g, Integer.valueOf(comboTemplateSlotEntity2.realmGet$priority()));
        osObjectBuilder.E0(aVar.h, comboTemplateSlotEntity2.realmGet$defaultProduct());
        k0<ComboTemplateSlotProductEntity> realmGet$slotProducts = comboTemplateSlotEntity2.realmGet$slotProducts();
        if (realmGet$slotProducts != null) {
            k0 k0Var = new k0();
            for (int i = 0; i < realmGet$slotProducts.size(); i++) {
                ComboTemplateSlotProductEntity comboTemplateSlotProductEntity = realmGet$slotProducts.get(i);
                ComboTemplateSlotProductEntity comboTemplateSlotProductEntity2 = (ComboTemplateSlotProductEntity) map.get(comboTemplateSlotProductEntity);
                if (comboTemplateSlotProductEntity2 != null) {
                    k0Var.add(comboTemplateSlotProductEntity2);
                } else {
                    k0Var.add(com_dodopizza_persistence_entity_menu_ComboTemplateSlotProductEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_ComboTemplateSlotProductEntityRealmProxy.a) d0Var.u().e(ComboTemplateSlotProductEntity.class), comboTemplateSlotProductEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.i, k0Var);
        } else {
            osObjectBuilder.z0(aVar.i, new k0());
        }
        osObjectBuilder.E0(aVar.j, comboTemplateSlotEntity2.realmGet$id());
        osObjectBuilder.K0();
        return comboTemplateSlotEntity;
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
        c0<ComboTemplateSlotEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy com_dodopizza_persistence_entity_menu_combotemplateslotentityrealmproxy = (com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_menu_combotemplateslotentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_menu_combotemplateslotentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_menu_combotemplateslotentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity, defpackage.qgc
    public String realmGet$defaultProduct() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity, defpackage.qgc
    public String realmGet$externalId() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity, defpackage.qgc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity, defpackage.qgc
    public String realmGet$name() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity, defpackage.qgc
    public int realmGet$priority() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity, defpackage.qgc
    public k0<ComboTemplateSlotProductEntity> realmGet$slotProducts() {
        this.c.f().c();
        k0<ComboTemplateSlotProductEntity> k0Var = this.d;
        if (k0Var != null) {
            return k0Var;
        }
        k0<ComboTemplateSlotProductEntity> k0Var2 = new k0<>(ComboTemplateSlotProductEntity.class, this.c.g().f0(this.b.i), this.c.f());
        this.d = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity, defpackage.qgc
    public void realmSet$defaultProduct(String str) {
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

    @Override // com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity, defpackage.qgc
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

    @Override // com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity, defpackage.qgc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity, defpackage.qgc
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

    @Override // com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity, defpackage.qgc
    public void realmSet$priority(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.g, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.g, i);
    }

    @Override // com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity, defpackage.qgc
    public void realmSet$slotProducts(k0<ComboTemplateSlotProductEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("slotProducts")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<ComboTemplateSlotProductEntity> k0Var2 = new k0<>();
                Iterator<ComboTemplateSlotProductEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    ComboTemplateSlotProductEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((ComboTemplateSlotProductEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.i);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i < size) {
                ComboTemplateSlotProductEntity comboTemplateSlotProductEntity = k0Var.get(i);
                this.c.c(comboTemplateSlotProductEntity);
                f0.U(i, ((r89) comboTemplateSlotProductEntity).a().g().E0());
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
            ComboTemplateSlotProductEntity comboTemplateSlotProductEntity2 = k0Var.get(i);
            this.c.c(comboTemplateSlotProductEntity2);
            f0.k(((r89) comboTemplateSlotProductEntity2).a().g().E0());
            i++;
        }
    }

    public String toString() {
        String str;
        String str2;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ComboTemplateSlotEntity = proxy[");
        sb.append("{externalId:");
        String str3 = "null";
        if (realmGet$externalId() == null) {
            str = "null";
        } else {
            str = realmGet$externalId();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(realmGet$name());
        sb.append("}");
        sb.append(",");
        sb.append("{priority:");
        sb.append(realmGet$priority());
        sb.append("}");
        sb.append(",");
        sb.append("{defaultProduct:");
        if (realmGet$defaultProduct() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$defaultProduct();
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{slotProducts:");
        sb.append("RealmList<ComboTemplateSlotProductEntity>[");
        sb.append(realmGet$slotProducts().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{id:");
        if (realmGet$id() != null) {
            str3 = realmGet$id();
        }
        sb.append(str3);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
