package io.realm;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity;
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
public class com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy extends MenuPersonalPriceInfoEntity implements r89, jhc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<MenuPersonalPriceInfoEntity> c;

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
            OsObjectSchemaInfo b = osSchemaInfo.b("MenuPersonalPriceInfoEntity");
            this.e = a(ShoppingInfoEntity.FIELD_PRODUCT_ID, ShoppingInfoEntity.FIELD_PRODUCT_ID, b);
            this.f = a("rawPrice", "rawPrice", b);
            this.g = a("discountedPrice", "discountedPrice", b);
            this.h = a("discount", "discount", b);
            this.i = a("discountMode", "discountMode", b);
            this.j = a("endDateTimeUtc", "endDateTimeUtc", b);
            this.k = a("priority", "priority", b);
            this.l = a("menuCategoryId", "menuCategoryId", b);
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
    public com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy() {
        this.c.p();
    }

    public static MenuPersonalPriceInfoEntity c(d0 d0Var, a aVar, MenuPersonalPriceInfoEntity menuPersonalPriceInfoEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(menuPersonalPriceInfoEntity);
        if (r89Var != null) {
            return (MenuPersonalPriceInfoEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(MenuPersonalPriceInfoEntity.class), set);
        osObjectBuilder.E0(aVar.e, menuPersonalPriceInfoEntity.realmGet$productId());
        osObjectBuilder.l0(aVar.f, Double.valueOf(menuPersonalPriceInfoEntity.realmGet$rawPrice()));
        osObjectBuilder.l0(aVar.g, Double.valueOf(menuPersonalPriceInfoEntity.realmGet$discountedPrice()));
        osObjectBuilder.o0(aVar.h, Integer.valueOf(menuPersonalPriceInfoEntity.realmGet$discount()));
        osObjectBuilder.o0(aVar.i, Integer.valueOf(menuPersonalPriceInfoEntity.realmGet$discountMode()));
        osObjectBuilder.E0(aVar.j, menuPersonalPriceInfoEntity.realmGet$endDateTimeUtc());
        osObjectBuilder.o0(aVar.k, Integer.valueOf(menuPersonalPriceInfoEntity.realmGet$priority()));
        osObjectBuilder.E0(aVar.l, menuPersonalPriceInfoEntity.realmGet$menuCategoryId());
        osObjectBuilder.E0(aVar.m, menuPersonalPriceInfoEntity.realmGet$id());
        com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(menuPersonalPriceInfoEntity, j);
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy.a r9, com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity r1 = (com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity> r2 = com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity.class
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
            io.realm.com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy$a, com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static MenuPersonalPriceInfoEntity f(MenuPersonalPriceInfoEntity menuPersonalPriceInfoEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        MenuPersonalPriceInfoEntity menuPersonalPriceInfoEntity2;
        if (i <= i2 && menuPersonalPriceInfoEntity != null) {
            r89.a<o89> aVar = map.get(menuPersonalPriceInfoEntity);
            if (aVar == null) {
                menuPersonalPriceInfoEntity2 = new MenuPersonalPriceInfoEntity();
                map.put(menuPersonalPriceInfoEntity, new r89.a<>(i, menuPersonalPriceInfoEntity2));
            } else if (i >= aVar.a) {
                return (MenuPersonalPriceInfoEntity) aVar.b;
            } else {
                aVar.a = i;
                menuPersonalPriceInfoEntity2 = (MenuPersonalPriceInfoEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) menuPersonalPriceInfoEntity).a().f();
            menuPersonalPriceInfoEntity2.realmSet$productId(menuPersonalPriceInfoEntity.realmGet$productId());
            menuPersonalPriceInfoEntity2.realmSet$rawPrice(menuPersonalPriceInfoEntity.realmGet$rawPrice());
            menuPersonalPriceInfoEntity2.realmSet$discountedPrice(menuPersonalPriceInfoEntity.realmGet$discountedPrice());
            menuPersonalPriceInfoEntity2.realmSet$discount(menuPersonalPriceInfoEntity.realmGet$discount());
            menuPersonalPriceInfoEntity2.realmSet$discountMode(menuPersonalPriceInfoEntity.realmGet$discountMode());
            menuPersonalPriceInfoEntity2.realmSet$endDateTimeUtc(menuPersonalPriceInfoEntity.realmGet$endDateTimeUtc());
            menuPersonalPriceInfoEntity2.realmSet$priority(menuPersonalPriceInfoEntity.realmGet$priority());
            menuPersonalPriceInfoEntity2.realmSet$menuCategoryId(menuPersonalPriceInfoEntity.realmGet$menuCategoryId());
            menuPersonalPriceInfoEntity2.realmSet$id(menuPersonalPriceInfoEntity.realmGet$id());
            return menuPersonalPriceInfoEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "MenuPersonalPriceInfoEntity", false, 9, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", ShoppingInfoEntity.FIELD_PRODUCT_ID, realmFieldType, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.DOUBLE;
        bVar.b("", "rawPrice", realmFieldType2, false, false, true);
        bVar.b("", "discountedPrice", realmFieldType2, false, false, true);
        RealmFieldType realmFieldType3 = RealmFieldType.INTEGER;
        bVar.b("", "discount", realmFieldType3, false, false, true);
        bVar.b("", "discountMode", realmFieldType3, false, false, true);
        bVar.b("", "endDateTimeUtc", realmFieldType, false, false, true);
        bVar.b("", "priority", realmFieldType3, false, false, true);
        bVar.b("", "menuCategoryId", realmFieldType, false, false, true);
        bVar.b("", "id", realmFieldType, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, MenuPersonalPriceInfoEntity menuPersonalPriceInfoEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((menuPersonalPriceInfoEntity instanceof r89) && !n0.isFrozen(menuPersonalPriceInfoEntity)) {
            r89 r89Var = (r89) menuPersonalPriceInfoEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(MenuPersonalPriceInfoEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(MenuPersonalPriceInfoEntity.class);
        long j = aVar.m;
        String realmGet$id = menuPersonalPriceInfoEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(menuPersonalPriceInfoEntity, Long.valueOf(j2));
        String realmGet$productId = menuPersonalPriceInfoEntity.realmGet$productId();
        if (realmGet$productId != null) {
            Table.nativeSetString(nativePtr, aVar.e, j2, realmGet$productId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.e, j2, false);
        }
        Table.nativeSetDouble(nativePtr, aVar.f, j2, menuPersonalPriceInfoEntity.realmGet$rawPrice(), false);
        Table.nativeSetDouble(nativePtr, aVar.g, j2, menuPersonalPriceInfoEntity.realmGet$discountedPrice(), false);
        Table.nativeSetLong(nativePtr, aVar.h, j2, menuPersonalPriceInfoEntity.realmGet$discount(), false);
        Table.nativeSetLong(nativePtr, aVar.i, j2, menuPersonalPriceInfoEntity.realmGet$discountMode(), false);
        String realmGet$endDateTimeUtc = menuPersonalPriceInfoEntity.realmGet$endDateTimeUtc();
        if (realmGet$endDateTimeUtc != null) {
            Table.nativeSetString(nativePtr, aVar.j, j2, realmGet$endDateTimeUtc, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.j, j2, false);
        }
        Table.nativeSetLong(nativePtr, aVar.k, j2, menuPersonalPriceInfoEntity.realmGet$priority(), false);
        String realmGet$menuCategoryId = menuPersonalPriceInfoEntity.realmGet$menuCategoryId();
        if (realmGet$menuCategoryId != null) {
            Table.nativeSetString(nativePtr, aVar.l, j2, realmGet$menuCategoryId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.l, j2, false);
        }
        return j2;
    }

    static com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(MenuPersonalPriceInfoEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy com_dodopizza_persistence_entity_personalization_menupersonalpriceinfoentityrealmproxy = new com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_personalization_menupersonalpriceinfoentityrealmproxy;
    }

    static MenuPersonalPriceInfoEntity k(d0 d0Var, a aVar, MenuPersonalPriceInfoEntity menuPersonalPriceInfoEntity, MenuPersonalPriceInfoEntity menuPersonalPriceInfoEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(MenuPersonalPriceInfoEntity.class), set);
        osObjectBuilder.E0(aVar.e, menuPersonalPriceInfoEntity2.realmGet$productId());
        osObjectBuilder.l0(aVar.f, Double.valueOf(menuPersonalPriceInfoEntity2.realmGet$rawPrice()));
        osObjectBuilder.l0(aVar.g, Double.valueOf(menuPersonalPriceInfoEntity2.realmGet$discountedPrice()));
        osObjectBuilder.o0(aVar.h, Integer.valueOf(menuPersonalPriceInfoEntity2.realmGet$discount()));
        osObjectBuilder.o0(aVar.i, Integer.valueOf(menuPersonalPriceInfoEntity2.realmGet$discountMode()));
        osObjectBuilder.E0(aVar.j, menuPersonalPriceInfoEntity2.realmGet$endDateTimeUtc());
        osObjectBuilder.o0(aVar.k, Integer.valueOf(menuPersonalPriceInfoEntity2.realmGet$priority()));
        osObjectBuilder.E0(aVar.l, menuPersonalPriceInfoEntity2.realmGet$menuCategoryId());
        osObjectBuilder.E0(aVar.m, menuPersonalPriceInfoEntity2.realmGet$id());
        osObjectBuilder.K0();
        return menuPersonalPriceInfoEntity;
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
        c0<MenuPersonalPriceInfoEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy com_dodopizza_persistence_entity_personalization_menupersonalpriceinfoentityrealmproxy = (com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_personalization_menupersonalpriceinfoentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_personalization_menupersonalpriceinfoentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_personalization_menupersonalpriceinfoentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity, defpackage.jhc
    public int realmGet$discount() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity, defpackage.jhc
    public int realmGet$discountMode() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity, defpackage.jhc
    public double realmGet$discountedPrice() {
        this.c.f().c();
        return this.c.g().K(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity, defpackage.jhc
    public String realmGet$endDateTimeUtc() {
        this.c.f().c();
        return this.c.g().p0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity, defpackage.jhc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.m);
    }

    @Override // com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity, defpackage.jhc
    public String realmGet$menuCategoryId() {
        this.c.f().c();
        return this.c.g().p0(this.b.l);
    }

    @Override // com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity, defpackage.jhc
    public int realmGet$priority() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity, defpackage.jhc
    public String realmGet$productId() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity, defpackage.jhc
    public double realmGet$rawPrice() {
        this.c.f().c();
        return this.c.g().K(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity, defpackage.jhc
    public void realmSet$discount(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.h, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.h, i);
    }

    @Override // com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity, defpackage.jhc
    public void realmSet$discountMode(int i) {
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

    @Override // com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity, defpackage.jhc
    public void realmSet$discountedPrice(double d2) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.g, g.E0(), d2, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.g, d2);
    }

    @Override // com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity, defpackage.jhc
    public void realmSet$endDateTimeUtc(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.j, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'endDateTimeUtc' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.j, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'endDateTimeUtc' to null.");
    }

    @Override // com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity, defpackage.jhc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity, defpackage.jhc
    public void realmSet$menuCategoryId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.l, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'menuCategoryId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.l, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'menuCategoryId' to null.");
    }

    @Override // com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity, defpackage.jhc
    public void realmSet$priority(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.k, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.k, i);
    }

    @Override // com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity, defpackage.jhc
    public void realmSet$productId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.e, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'productId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.e, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'productId' to null.");
    }

    @Override // com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity, defpackage.jhc
    public void realmSet$rawPrice(double d2) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.f, g.E0(), d2, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.f, d2);
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("MenuPersonalPriceInfoEntity = proxy[");
        sb.append("{productId:");
        sb.append(realmGet$productId());
        sb.append("}");
        sb.append(",");
        sb.append("{rawPrice:");
        sb.append(realmGet$rawPrice());
        sb.append("}");
        sb.append(",");
        sb.append("{discountedPrice:");
        sb.append(realmGet$discountedPrice());
        sb.append("}");
        sb.append(",");
        sb.append("{discount:");
        sb.append(realmGet$discount());
        sb.append("}");
        sb.append(",");
        sb.append("{discountMode:");
        sb.append(realmGet$discountMode());
        sb.append("}");
        sb.append(",");
        sb.append("{endDateTimeUtc:");
        sb.append(realmGet$endDateTimeUtc());
        sb.append("}");
        sb.append(",");
        sb.append("{priority:");
        sb.append(realmGet$priority());
        sb.append("}");
        sb.append(",");
        sb.append("{menuCategoryId:");
        sb.append(realmGet$menuCategoryId());
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
