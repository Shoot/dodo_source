package io.realm;

import com.dodopizza.persistence.entity.MoneyType;
import com.dodopizza.persistence.entity.menu.PersonalPriceEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_MoneyTypeRealmProxy;
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
public class com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy extends PersonalPriceEntity implements r89, ugc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<PersonalPriceEntity> c;

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
            OsObjectSchemaInfo b = osSchemaInfo.b("PersonalPriceEntity");
            this.e = a(ShoppingInfoEntity.FIELD_PRODUCT_ID, ShoppingInfoEntity.FIELD_PRODUCT_ID, b);
            this.f = a("personalPrice", "personalPrice", b);
            this.g = a("discountEndTime", "discountEndTime", b);
            this.h = a("personalDiscount", "personalDiscount", b);
            this.i = a("discountMode", "discountMode", b);
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
    public com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy() {
        this.c.p();
    }

    public static PersonalPriceEntity c(d0 d0Var, a aVar, PersonalPriceEntity personalPriceEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(personalPriceEntity);
        if (r89Var != null) {
            return (PersonalPriceEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PersonalPriceEntity.class), set);
        osObjectBuilder.E0(aVar.e, personalPriceEntity.realmGet$productId());
        osObjectBuilder.p0(aVar.g, Long.valueOf(personalPriceEntity.realmGet$discountEndTime()));
        osObjectBuilder.o0(aVar.h, Integer.valueOf(personalPriceEntity.realmGet$personalDiscount()));
        osObjectBuilder.o0(aVar.i, Integer.valueOf(personalPriceEntity.realmGet$discountMode()));
        osObjectBuilder.E0(aVar.j, personalPriceEntity.realmGet$id());
        com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(personalPriceEntity, j);
        MoneyType realmGet$personalPrice = personalPriceEntity.realmGet$personalPrice();
        if (realmGet$personalPrice == null) {
            j.realmSet$personalPrice(null);
        } else {
            MoneyType moneyType = (MoneyType) map.get(realmGet$personalPrice);
            if (moneyType != null) {
                j.realmSet$personalPrice(moneyType);
            } else {
                j.realmSet$personalPrice(com_dodopizza_persistence_entity_MoneyTypeRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_MoneyTypeRealmProxy.a) d0Var.u().e(MoneyType.class), realmGet$personalPrice, z, map, set));
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
    public static com.dodopizza.persistence.entity.menu.PersonalPriceEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.a r9, com.dodopizza.persistence.entity.menu.PersonalPriceEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.menu.PersonalPriceEntity r1 = (com.dodopizza.persistence.entity.menu.PersonalPriceEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.menu.PersonalPriceEntity> r2 = com.dodopizza.persistence.entity.menu.PersonalPriceEntity.class
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
            io.realm.com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.menu.PersonalPriceEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.menu.PersonalPriceEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy$a, com.dodopizza.persistence.entity.menu.PersonalPriceEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.menu.PersonalPriceEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static PersonalPriceEntity f(PersonalPriceEntity personalPriceEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        PersonalPriceEntity personalPriceEntity2;
        if (i <= i2 && personalPriceEntity != null) {
            r89.a<o89> aVar = map.get(personalPriceEntity);
            if (aVar == null) {
                personalPriceEntity2 = new PersonalPriceEntity();
                map.put(personalPriceEntity, new r89.a<>(i, personalPriceEntity2));
            } else if (i >= aVar.a) {
                return (PersonalPriceEntity) aVar.b;
            } else {
                aVar.a = i;
                personalPriceEntity2 = (PersonalPriceEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) personalPriceEntity).a().f();
            personalPriceEntity2.realmSet$productId(personalPriceEntity.realmGet$productId());
            personalPriceEntity2.realmSet$personalPrice(com_dodopizza_persistence_entity_MoneyTypeRealmProxy.f(personalPriceEntity.realmGet$personalPrice(), i + 1, i2, map));
            personalPriceEntity2.realmSet$discountEndTime(personalPriceEntity.realmGet$discountEndTime());
            personalPriceEntity2.realmSet$personalDiscount(personalPriceEntity.realmGet$personalDiscount());
            personalPriceEntity2.realmSet$discountMode(personalPriceEntity.realmGet$discountMode());
            personalPriceEntity2.realmSet$id(personalPriceEntity.realmGet$id());
            return personalPriceEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "PersonalPriceEntity", false, 6, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", ShoppingInfoEntity.FIELD_PRODUCT_ID, realmFieldType, false, false, true);
        bVar.a("", "personalPrice", RealmFieldType.OBJECT, "MoneyType");
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.b("", "discountEndTime", realmFieldType2, false, false, true);
        bVar.b("", "personalDiscount", realmFieldType2, false, false, true);
        bVar.b("", "discountMode", realmFieldType2, false, false, true);
        bVar.b("", "id", realmFieldType, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, PersonalPriceEntity personalPriceEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((personalPriceEntity instanceof r89) && !n0.isFrozen(personalPriceEntity)) {
            r89 r89Var = (r89) personalPriceEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(PersonalPriceEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(PersonalPriceEntity.class);
        long j = aVar.j;
        String realmGet$id = personalPriceEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(personalPriceEntity, Long.valueOf(j2));
        String realmGet$productId = personalPriceEntity.realmGet$productId();
        if (realmGet$productId != null) {
            Table.nativeSetString(nativePtr, aVar.e, j2, realmGet$productId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.e, j2, false);
        }
        MoneyType realmGet$personalPrice = personalPriceEntity.realmGet$personalPrice();
        if (realmGet$personalPrice != null) {
            Long l = map.get(realmGet$personalPrice);
            if (l == null) {
                l = Long.valueOf(com_dodopizza_persistence_entity_MoneyTypeRealmProxy.i(d0Var, realmGet$personalPrice, map));
            }
            Table.nativeSetLink(nativePtr, aVar.f, j2, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f, j2);
        }
        Table.nativeSetLong(nativePtr, aVar.g, j2, personalPriceEntity.realmGet$discountEndTime(), false);
        Table.nativeSetLong(nativePtr, aVar.h, j2, personalPriceEntity.realmGet$personalDiscount(), false);
        Table.nativeSetLong(nativePtr, aVar.i, j2, personalPriceEntity.realmGet$discountMode(), false);
        return j2;
    }

    static com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(PersonalPriceEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy com_dodopizza_persistence_entity_menu_personalpriceentityrealmproxy = new com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_menu_personalpriceentityrealmproxy;
    }

    static PersonalPriceEntity k(d0 d0Var, a aVar, PersonalPriceEntity personalPriceEntity, PersonalPriceEntity personalPriceEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PersonalPriceEntity.class), set);
        osObjectBuilder.E0(aVar.e, personalPriceEntity2.realmGet$productId());
        MoneyType realmGet$personalPrice = personalPriceEntity2.realmGet$personalPrice();
        if (realmGet$personalPrice == null) {
            osObjectBuilder.r0(aVar.f);
        } else {
            MoneyType moneyType = (MoneyType) map.get(realmGet$personalPrice);
            if (moneyType != null) {
                osObjectBuilder.x0(aVar.f, moneyType);
            } else {
                osObjectBuilder.x0(aVar.f, com_dodopizza_persistence_entity_MoneyTypeRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_MoneyTypeRealmProxy.a) d0Var.u().e(MoneyType.class), realmGet$personalPrice, true, map, set));
            }
        }
        osObjectBuilder.p0(aVar.g, Long.valueOf(personalPriceEntity2.realmGet$discountEndTime()));
        osObjectBuilder.o0(aVar.h, Integer.valueOf(personalPriceEntity2.realmGet$personalDiscount()));
        osObjectBuilder.o0(aVar.i, Integer.valueOf(personalPriceEntity2.realmGet$discountMode()));
        osObjectBuilder.E0(aVar.j, personalPriceEntity2.realmGet$id());
        osObjectBuilder.K0();
        return personalPriceEntity;
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
        c0<PersonalPriceEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy com_dodopizza_persistence_entity_menu_personalpriceentityrealmproxy = (com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_menu_personalpriceentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_menu_personalpriceentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_menu_personalpriceentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.menu.PersonalPriceEntity, defpackage.ugc
    public long realmGet$discountEndTime() {
        this.c.f().c();
        return this.c.g().e0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.menu.PersonalPriceEntity, defpackage.ugc
    public int realmGet$discountMode() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.menu.PersonalPriceEntity, defpackage.ugc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.menu.PersonalPriceEntity, defpackage.ugc
    public int realmGet$personalDiscount() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.menu.PersonalPriceEntity, defpackage.ugc
    public MoneyType realmGet$personalPrice() {
        this.c.f().c();
        if (this.c.g().o0(this.b.f)) {
            return null;
        }
        return (MoneyType) this.c.f().o(MoneyType.class, this.c.g().L(this.b.f), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.menu.PersonalPriceEntity, defpackage.ugc
    public String realmGet$productId() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.menu.PersonalPriceEntity, defpackage.ugc
    public void realmSet$discountEndTime(long j) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.g, g.E0(), j, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.g, j);
    }

    @Override // com.dodopizza.persistence.entity.menu.PersonalPriceEntity, defpackage.ugc
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

    @Override // com.dodopizza.persistence.entity.menu.PersonalPriceEntity, defpackage.ugc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.menu.PersonalPriceEntity, defpackage.ugc
    public void realmSet$personalDiscount(int i) {
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

    @Override // com.dodopizza.persistence.entity.menu.PersonalPriceEntity, defpackage.ugc
    public void realmSet$personalPrice(MoneyType moneyType) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("personalPrice")) {
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

    @Override // com.dodopizza.persistence.entity.menu.PersonalPriceEntity, defpackage.ugc
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

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("PersonalPriceEntity = proxy[");
        sb.append("{productId:");
        sb.append(realmGet$productId());
        sb.append("}");
        sb.append(",");
        sb.append("{personalPrice:");
        String str2 = "null";
        if (realmGet$personalPrice() == null) {
            str = "null";
        } else {
            str = "MoneyType";
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{discountEndTime:");
        sb.append(realmGet$discountEndTime());
        sb.append("}");
        sb.append(",");
        sb.append("{personalDiscount:");
        sb.append(realmGet$personalDiscount());
        sb.append("}");
        sb.append(",");
        sb.append("{discountMode:");
        sb.append(realmGet$discountMode());
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
