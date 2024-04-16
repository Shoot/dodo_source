package io.realm;

import com.dodopizza.persistence.entity.MoneyType;
import com.dodopizza.persistence.entity.menu.PersonalPriceEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_MoneyTypeRealmProxy;
import io.realm.com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy;
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
public class com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy extends ShoppingInfoEntity implements r89, ygc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<ShoppingInfoEntity> c;

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
            OsObjectSchemaInfo b = osSchemaInfo.b("ShoppingInfoEntity");
            this.e = a(ShoppingInfoEntity.FIELD_EXTERNAL_ID, ShoppingInfoEntity.FIELD_EXTERNAL_ID, b);
            this.f = a("price", "price", b);
            this.g = a(ShoppingInfoEntity.FIELD_PRODUCT_ID, ShoppingInfoEntity.FIELD_PRODUCT_ID, b);
            this.h = a("personalPrice", "personalPrice", b);
            this.i = a(ShoppingInfoEntity.FIELD_SHOPPING_ID, ShoppingInfoEntity.FIELD_SHOPPING_ID, b);
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
    public com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy() {
        this.c.p();
    }

    public static ShoppingInfoEntity c(d0 d0Var, a aVar, ShoppingInfoEntity shoppingInfoEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(shoppingInfoEntity);
        if (r89Var != null) {
            return (ShoppingInfoEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(ShoppingInfoEntity.class), set);
        osObjectBuilder.E0(aVar.e, shoppingInfoEntity.realmGet$externalId());
        osObjectBuilder.E0(aVar.g, shoppingInfoEntity.realmGet$productId());
        osObjectBuilder.E0(aVar.i, shoppingInfoEntity.realmGet$shoppingId());
        osObjectBuilder.E0(aVar.j, shoppingInfoEntity.realmGet$id());
        com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(shoppingInfoEntity, j);
        MoneyType realmGet$price = shoppingInfoEntity.realmGet$price();
        if (realmGet$price == null) {
            j.realmSet$price(null);
        } else {
            MoneyType moneyType = (MoneyType) map.get(realmGet$price);
            if (moneyType != null) {
                j.realmSet$price(moneyType);
            } else {
                j.realmSet$price(com_dodopizza_persistence_entity_MoneyTypeRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_MoneyTypeRealmProxy.a) d0Var.u().e(MoneyType.class), realmGet$price, z, map, set));
            }
        }
        PersonalPriceEntity realmGet$personalPrice = shoppingInfoEntity.realmGet$personalPrice();
        if (realmGet$personalPrice == null) {
            j.realmSet$personalPrice(null);
        } else {
            PersonalPriceEntity personalPriceEntity = (PersonalPriceEntity) map.get(realmGet$personalPrice);
            if (personalPriceEntity != null) {
                j.realmSet$personalPrice(personalPriceEntity);
            } else {
                j.realmSet$personalPrice(com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.a) d0Var.u().e(PersonalPriceEntity.class), realmGet$personalPrice, z, map, set));
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
    public static com.dodopizza.persistence.entity.menu.ShoppingInfoEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.a r9, com.dodopizza.persistence.entity.menu.ShoppingInfoEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.menu.ShoppingInfoEntity r1 = (com.dodopizza.persistence.entity.menu.ShoppingInfoEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.menu.ShoppingInfoEntity> r2 = com.dodopizza.persistence.entity.menu.ShoppingInfoEntity.class
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
            io.realm.com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.menu.ShoppingInfoEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.menu.ShoppingInfoEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy$a, com.dodopizza.persistence.entity.menu.ShoppingInfoEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.menu.ShoppingInfoEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static ShoppingInfoEntity f(ShoppingInfoEntity shoppingInfoEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        ShoppingInfoEntity shoppingInfoEntity2;
        if (i <= i2 && shoppingInfoEntity != null) {
            r89.a<o89> aVar = map.get(shoppingInfoEntity);
            if (aVar == null) {
                shoppingInfoEntity2 = new ShoppingInfoEntity();
                map.put(shoppingInfoEntity, new r89.a<>(i, shoppingInfoEntity2));
            } else if (i >= aVar.a) {
                return (ShoppingInfoEntity) aVar.b;
            } else {
                aVar.a = i;
                shoppingInfoEntity2 = (ShoppingInfoEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) shoppingInfoEntity).a().f();
            shoppingInfoEntity2.realmSet$externalId(shoppingInfoEntity.realmGet$externalId());
            int i3 = i + 1;
            shoppingInfoEntity2.realmSet$price(com_dodopizza_persistence_entity_MoneyTypeRealmProxy.f(shoppingInfoEntity.realmGet$price(), i3, i2, map));
            shoppingInfoEntity2.realmSet$productId(shoppingInfoEntity.realmGet$productId());
            shoppingInfoEntity2.realmSet$personalPrice(com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.f(shoppingInfoEntity.realmGet$personalPrice(), i3, i2, map));
            shoppingInfoEntity2.realmSet$shoppingId(shoppingInfoEntity.realmGet$shoppingId());
            shoppingInfoEntity2.realmSet$id(shoppingInfoEntity.realmGet$id());
            return shoppingInfoEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "ShoppingInfoEntity", false, 6, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", ShoppingInfoEntity.FIELD_EXTERNAL_ID, realmFieldType, false, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.OBJECT;
        bVar.a("", "price", realmFieldType2, "MoneyType");
        bVar.b("", ShoppingInfoEntity.FIELD_PRODUCT_ID, realmFieldType, false, false, true);
        bVar.a("", "personalPrice", realmFieldType2, "PersonalPriceEntity");
        bVar.b("", ShoppingInfoEntity.FIELD_SHOPPING_ID, realmFieldType, false, false, true);
        bVar.b("", "id", realmFieldType, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, ShoppingInfoEntity shoppingInfoEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((shoppingInfoEntity instanceof r89) && !n0.isFrozen(shoppingInfoEntity)) {
            r89 r89Var = (r89) shoppingInfoEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(ShoppingInfoEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(ShoppingInfoEntity.class);
        long j = aVar.j;
        String realmGet$id = shoppingInfoEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(shoppingInfoEntity, Long.valueOf(j2));
        String realmGet$externalId = shoppingInfoEntity.realmGet$externalId();
        if (realmGet$externalId != null) {
            Table.nativeSetString(nativePtr, aVar.e, j2, realmGet$externalId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.e, j2, false);
        }
        MoneyType realmGet$price = shoppingInfoEntity.realmGet$price();
        if (realmGet$price != null) {
            Long l = map.get(realmGet$price);
            if (l == null) {
                l = Long.valueOf(com_dodopizza_persistence_entity_MoneyTypeRealmProxy.i(d0Var, realmGet$price, map));
            }
            Table.nativeSetLink(nativePtr, aVar.f, j2, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f, j2);
        }
        String realmGet$productId = shoppingInfoEntity.realmGet$productId();
        if (realmGet$productId != null) {
            Table.nativeSetString(nativePtr, aVar.g, j2, realmGet$productId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j2, false);
        }
        PersonalPriceEntity realmGet$personalPrice = shoppingInfoEntity.realmGet$personalPrice();
        if (realmGet$personalPrice != null) {
            Long l2 = map.get(realmGet$personalPrice);
            if (l2 == null) {
                l2 = Long.valueOf(com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.i(d0Var, realmGet$personalPrice, map));
            }
            Table.nativeSetLink(nativePtr, aVar.h, j2, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.h, j2);
        }
        String realmGet$shoppingId = shoppingInfoEntity.realmGet$shoppingId();
        if (realmGet$shoppingId != null) {
            Table.nativeSetString(nativePtr, aVar.i, j2, realmGet$shoppingId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.i, j2, false);
        }
        return j2;
    }

    static com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(ShoppingInfoEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy com_dodopizza_persistence_entity_menu_shoppinginfoentityrealmproxy = new com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_menu_shoppinginfoentityrealmproxy;
    }

    static ShoppingInfoEntity k(d0 d0Var, a aVar, ShoppingInfoEntity shoppingInfoEntity, ShoppingInfoEntity shoppingInfoEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(ShoppingInfoEntity.class), set);
        osObjectBuilder.E0(aVar.e, shoppingInfoEntity2.realmGet$externalId());
        MoneyType realmGet$price = shoppingInfoEntity2.realmGet$price();
        if (realmGet$price == null) {
            osObjectBuilder.r0(aVar.f);
        } else {
            MoneyType moneyType = (MoneyType) map.get(realmGet$price);
            if (moneyType != null) {
                osObjectBuilder.x0(aVar.f, moneyType);
            } else {
                osObjectBuilder.x0(aVar.f, com_dodopizza_persistence_entity_MoneyTypeRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_MoneyTypeRealmProxy.a) d0Var.u().e(MoneyType.class), realmGet$price, true, map, set));
            }
        }
        osObjectBuilder.E0(aVar.g, shoppingInfoEntity2.realmGet$productId());
        PersonalPriceEntity realmGet$personalPrice = shoppingInfoEntity2.realmGet$personalPrice();
        if (realmGet$personalPrice == null) {
            osObjectBuilder.r0(aVar.h);
        } else {
            PersonalPriceEntity personalPriceEntity = (PersonalPriceEntity) map.get(realmGet$personalPrice);
            if (personalPriceEntity != null) {
                osObjectBuilder.x0(aVar.h, personalPriceEntity);
            } else {
                osObjectBuilder.x0(aVar.h, com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.a) d0Var.u().e(PersonalPriceEntity.class), realmGet$personalPrice, true, map, set));
            }
        }
        osObjectBuilder.E0(aVar.i, shoppingInfoEntity2.realmGet$shoppingId());
        osObjectBuilder.E0(aVar.j, shoppingInfoEntity2.realmGet$id());
        osObjectBuilder.K0();
        return shoppingInfoEntity;
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
        c0<ShoppingInfoEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy com_dodopizza_persistence_entity_menu_shoppinginfoentityrealmproxy = (com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_menu_shoppinginfoentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_menu_shoppinginfoentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_menu_shoppinginfoentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.menu.ShoppingInfoEntity, defpackage.ygc
    public String realmGet$externalId() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.menu.ShoppingInfoEntity, defpackage.ygc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.menu.ShoppingInfoEntity, defpackage.ygc
    public PersonalPriceEntity realmGet$personalPrice() {
        this.c.f().c();
        if (this.c.g().o0(this.b.h)) {
            return null;
        }
        return (PersonalPriceEntity) this.c.f().o(PersonalPriceEntity.class, this.c.g().L(this.b.h), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.menu.ShoppingInfoEntity, defpackage.ygc
    public MoneyType realmGet$price() {
        this.c.f().c();
        if (this.c.g().o0(this.b.f)) {
            return null;
        }
        return (MoneyType) this.c.f().o(MoneyType.class, this.c.g().L(this.b.f), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.menu.ShoppingInfoEntity, defpackage.ygc
    public String realmGet$productId() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.menu.ShoppingInfoEntity, defpackage.ygc
    public String realmGet$shoppingId() {
        this.c.f().c();
        return this.c.g().p0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.menu.ShoppingInfoEntity, defpackage.ygc
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

    @Override // com.dodopizza.persistence.entity.menu.ShoppingInfoEntity, defpackage.ygc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ShoppingInfoEntity, defpackage.ygc
    public void realmSet$personalPrice(PersonalPriceEntity personalPriceEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("personalPrice")) {
                return;
            }
            if (personalPriceEntity != null && !n0.isManaged(personalPriceEntity)) {
                personalPriceEntity = (PersonalPriceEntity) d0Var.j0(personalPriceEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (personalPriceEntity == null) {
                g.l0(this.b.h);
                return;
            }
            this.c.c(personalPriceEntity);
            g.o().B(this.b.h, g.E0(), ((r89) personalPriceEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (personalPriceEntity == null) {
            this.c.g().l0(this.b.h);
            return;
        }
        this.c.c(personalPriceEntity);
        this.c.g().s(this.b.h, ((r89) personalPriceEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.menu.ShoppingInfoEntity, defpackage.ygc
    public void realmSet$price(MoneyType moneyType) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("price")) {
                return;
            }
            if (moneyType != null && !n0.isManaged(moneyType)) {
                moneyType = (MoneyType) d0Var.f0(moneyType, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (moneyType == null) {
                g.l0(this.b.f);
                return;
            }
            this.c.c(moneyType);
            g.o().B(this.b.f, g.E0(), ((r89) moneyType).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (moneyType == null) {
            this.c.g().l0(this.b.f);
            return;
        }
        this.c.c(moneyType);
        this.c.g().s(this.b.f, ((r89) moneyType).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.menu.ShoppingInfoEntity, defpackage.ygc
    public void realmSet$productId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.g, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'productId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'productId' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ShoppingInfoEntity, defpackage.ygc
    public void realmSet$shoppingId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.i, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'shoppingId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.i, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'shoppingId' to null.");
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ShoppingInfoEntity = proxy[");
        sb.append("{externalId:");
        String str4 = "null";
        if (realmGet$externalId() == null) {
            str = "null";
        } else {
            str = realmGet$externalId();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{price:");
        if (realmGet$price() == null) {
            str2 = "null";
        } else {
            str2 = "MoneyType";
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{productId:");
        sb.append(realmGet$productId());
        sb.append("}");
        sb.append(",");
        sb.append("{personalPrice:");
        if (realmGet$personalPrice() == null) {
            str3 = "null";
        } else {
            str3 = "PersonalPriceEntity";
        }
        sb.append(str3);
        sb.append("}");
        sb.append(",");
        sb.append("{shoppingId:");
        sb.append(realmGet$shoppingId());
        sb.append("}");
        sb.append(",");
        sb.append("{id:");
        if (realmGet$id() != null) {
            str4 = realmGet$id();
        }
        sb.append(str4);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
