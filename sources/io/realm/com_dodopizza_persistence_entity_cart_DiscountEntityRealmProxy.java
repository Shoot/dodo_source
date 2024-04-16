package io.realm;

import com.dodopizza.persistence.entity.cart.DiscountEntity;
import com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy;
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
public class com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy extends DiscountEntity implements r89, rfc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<DiscountEntity> c;

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

        a(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo b = osSchemaInfo.b("DiscountEntity");
            this.e = a("bonusActionId", "bonusActionId", b);
            this.f = a("title", "title", b);
            this.g = a("description", "description", b);
            this.h = a("amount", "amount", b);
            this.i = a("loyaltyCoinsUsed", "loyaltyCoinsUsed", b);
            this.j = a("personalPriceDiscount", "personalPriceDiscount", b);
            this.k = a("id", "id", b);
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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy() {
        this.c.p();
    }

    public static DiscountEntity c(d0 d0Var, a aVar, DiscountEntity discountEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(discountEntity);
        if (r89Var != null) {
            return (DiscountEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(DiscountEntity.class), set);
        osObjectBuilder.E0(aVar.e, discountEntity.realmGet$bonusActionId());
        osObjectBuilder.E0(aVar.f, discountEntity.realmGet$title());
        osObjectBuilder.E0(aVar.g, discountEntity.realmGet$description());
        osObjectBuilder.l0(aVar.h, Double.valueOf(discountEntity.realmGet$amount()));
        osObjectBuilder.p0(aVar.i, Long.valueOf(discountEntity.realmGet$loyaltyCoinsUsed()));
        osObjectBuilder.E0(aVar.k, discountEntity.realmGet$id());
        com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(discountEntity, j);
        PersonalPriceDiscountEntity realmGet$personalPriceDiscount = discountEntity.realmGet$personalPriceDiscount();
        if (realmGet$personalPriceDiscount == null) {
            j.realmSet$personalPriceDiscount(null);
        } else {
            PersonalPriceDiscountEntity personalPriceDiscountEntity = (PersonalPriceDiscountEntity) map.get(realmGet$personalPriceDiscount);
            if (personalPriceDiscountEntity != null) {
                j.realmSet$personalPriceDiscount(personalPriceDiscountEntity);
            } else {
                j.realmSet$personalPriceDiscount(com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy.a) d0Var.u().e(PersonalPriceDiscountEntity.class), realmGet$personalPriceDiscount, z, map, set));
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
    public static com.dodopizza.persistence.entity.cart.DiscountEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy.a r9, com.dodopizza.persistence.entity.cart.DiscountEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.cart.DiscountEntity r1 = (com.dodopizza.persistence.entity.cart.DiscountEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.cart.DiscountEntity> r2 = com.dodopizza.persistence.entity.cart.DiscountEntity.class
            io.realm.internal.Table r2 = r8.I0(r2)
            long r3 = r9.k
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
            io.realm.com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.cart.DiscountEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.cart.DiscountEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy$a, com.dodopizza.persistence.entity.cart.DiscountEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.cart.DiscountEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static DiscountEntity f(DiscountEntity discountEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        DiscountEntity discountEntity2;
        if (i <= i2 && discountEntity != null) {
            r89.a<o89> aVar = map.get(discountEntity);
            if (aVar == null) {
                discountEntity2 = new DiscountEntity();
                map.put(discountEntity, new r89.a<>(i, discountEntity2));
            } else if (i >= aVar.a) {
                return (DiscountEntity) aVar.b;
            } else {
                aVar.a = i;
                discountEntity2 = (DiscountEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) discountEntity).a().f();
            discountEntity2.realmSet$bonusActionId(discountEntity.realmGet$bonusActionId());
            discountEntity2.realmSet$title(discountEntity.realmGet$title());
            discountEntity2.realmSet$description(discountEntity.realmGet$description());
            discountEntity2.realmSet$amount(discountEntity.realmGet$amount());
            discountEntity2.realmSet$loyaltyCoinsUsed(discountEntity.realmGet$loyaltyCoinsUsed());
            discountEntity2.realmSet$personalPriceDiscount(com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy.f(discountEntity.realmGet$personalPriceDiscount(), i + 1, i2, map));
            discountEntity2.realmSet$id(discountEntity.realmGet$id());
            return discountEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "DiscountEntity", false, 7, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "bonusActionId", realmFieldType, false, false, false);
        bVar.b("", "title", realmFieldType, false, false, true);
        bVar.b("", "description", realmFieldType, false, false, true);
        bVar.b("", "amount", RealmFieldType.DOUBLE, false, false, true);
        bVar.b("", "loyaltyCoinsUsed", RealmFieldType.INTEGER, false, false, true);
        bVar.a("", "personalPriceDiscount", RealmFieldType.OBJECT, "PersonalPriceDiscountEntity");
        bVar.b("", "id", realmFieldType, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, DiscountEntity discountEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((discountEntity instanceof r89) && !n0.isFrozen(discountEntity)) {
            r89 r89Var = (r89) discountEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(DiscountEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(DiscountEntity.class);
        long j = aVar.k;
        String realmGet$id = discountEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(discountEntity, Long.valueOf(j2));
        String realmGet$bonusActionId = discountEntity.realmGet$bonusActionId();
        if (realmGet$bonusActionId != null) {
            Table.nativeSetString(nativePtr, aVar.e, j2, realmGet$bonusActionId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.e, j2, false);
        }
        String realmGet$title = discountEntity.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, aVar.f, j2, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f, j2, false);
        }
        String realmGet$description = discountEntity.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, aVar.g, j2, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j2, false);
        }
        Table.nativeSetDouble(nativePtr, aVar.h, j2, discountEntity.realmGet$amount(), false);
        Table.nativeSetLong(nativePtr, aVar.i, j2, discountEntity.realmGet$loyaltyCoinsUsed(), false);
        PersonalPriceDiscountEntity realmGet$personalPriceDiscount = discountEntity.realmGet$personalPriceDiscount();
        if (realmGet$personalPriceDiscount != null) {
            Long l = map.get(realmGet$personalPriceDiscount);
            if (l == null) {
                l = Long.valueOf(com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy.i(d0Var, realmGet$personalPriceDiscount, map));
            }
            Table.nativeSetLink(nativePtr, aVar.j, j2, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.j, j2);
        }
        return j2;
    }

    static com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(DiscountEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy com_dodopizza_persistence_entity_cart_discountentityrealmproxy = new com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_cart_discountentityrealmproxy;
    }

    static DiscountEntity k(d0 d0Var, a aVar, DiscountEntity discountEntity, DiscountEntity discountEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(DiscountEntity.class), set);
        osObjectBuilder.E0(aVar.e, discountEntity2.realmGet$bonusActionId());
        osObjectBuilder.E0(aVar.f, discountEntity2.realmGet$title());
        osObjectBuilder.E0(aVar.g, discountEntity2.realmGet$description());
        osObjectBuilder.l0(aVar.h, Double.valueOf(discountEntity2.realmGet$amount()));
        osObjectBuilder.p0(aVar.i, Long.valueOf(discountEntity2.realmGet$loyaltyCoinsUsed()));
        PersonalPriceDiscountEntity realmGet$personalPriceDiscount = discountEntity2.realmGet$personalPriceDiscount();
        if (realmGet$personalPriceDiscount == null) {
            osObjectBuilder.r0(aVar.j);
        } else {
            PersonalPriceDiscountEntity personalPriceDiscountEntity = (PersonalPriceDiscountEntity) map.get(realmGet$personalPriceDiscount);
            if (personalPriceDiscountEntity != null) {
                osObjectBuilder.x0(aVar.j, personalPriceDiscountEntity);
            } else {
                osObjectBuilder.x0(aVar.j, com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy.a) d0Var.u().e(PersonalPriceDiscountEntity.class), realmGet$personalPriceDiscount, true, map, set));
            }
        }
        osObjectBuilder.E0(aVar.k, discountEntity2.realmGet$id());
        osObjectBuilder.K0();
        return discountEntity;
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
        c0<DiscountEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy com_dodopizza_persistence_entity_cart_discountentityrealmproxy = (com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_cart_discountentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_cart_discountentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_cart_discountentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.cart.DiscountEntity, defpackage.rfc
    public double realmGet$amount() {
        this.c.f().c();
        return this.c.g().K(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.cart.DiscountEntity, defpackage.rfc
    public String realmGet$bonusActionId() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.cart.DiscountEntity, defpackage.rfc
    public String realmGet$description() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.cart.DiscountEntity, defpackage.rfc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.cart.DiscountEntity, defpackage.rfc
    public long realmGet$loyaltyCoinsUsed() {
        this.c.f().c();
        return this.c.g().e0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.cart.DiscountEntity, defpackage.rfc
    public PersonalPriceDiscountEntity realmGet$personalPriceDiscount() {
        this.c.f().c();
        if (this.c.g().o0(this.b.j)) {
            return null;
        }
        return (PersonalPriceDiscountEntity) this.c.f().o(PersonalPriceDiscountEntity.class, this.c.g().L(this.b.j), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.DiscountEntity, defpackage.rfc
    public String realmGet$title() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.cart.DiscountEntity, defpackage.rfc
    public void realmSet$amount(double d2) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.h, g.E0(), d2, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.h, d2);
    }

    @Override // com.dodopizza.persistence.entity.cart.DiscountEntity, defpackage.rfc
    public void realmSet$bonusActionId(String str) {
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

    @Override // com.dodopizza.persistence.entity.cart.DiscountEntity, defpackage.rfc
    public void realmSet$description(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.g, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'description' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'description' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.DiscountEntity, defpackage.rfc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.cart.DiscountEntity, defpackage.rfc
    public void realmSet$loyaltyCoinsUsed(long j) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.i, g.E0(), j, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.i, j);
    }

    @Override // com.dodopizza.persistence.entity.cart.DiscountEntity, defpackage.rfc
    public void realmSet$personalPriceDiscount(PersonalPriceDiscountEntity personalPriceDiscountEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("personalPriceDiscount")) {
                return;
            }
            if (personalPriceDiscountEntity != null && !n0.isManaged(personalPriceDiscountEntity)) {
                personalPriceDiscountEntity = (PersonalPriceDiscountEntity) d0Var.j0(personalPriceDiscountEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (personalPriceDiscountEntity == null) {
                g.l0(this.b.j);
                return;
            }
            this.c.c(personalPriceDiscountEntity);
            g.o().B(this.b.j, g.E0(), ((r89) personalPriceDiscountEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (personalPriceDiscountEntity == null) {
            this.c.g().l0(this.b.j);
            return;
        }
        this.c.c(personalPriceDiscountEntity);
        this.c.g().s(this.b.j, ((r89) personalPriceDiscountEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.DiscountEntity, defpackage.rfc
    public void realmSet$title(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.f, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
    }

    public String toString() {
        String str;
        String str2;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("DiscountEntity = proxy[");
        sb.append("{bonusActionId:");
        String str3 = "null";
        if (realmGet$bonusActionId() == null) {
            str = "null";
        } else {
            str = realmGet$bonusActionId();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title());
        sb.append("}");
        sb.append(",");
        sb.append("{description:");
        sb.append(realmGet$description());
        sb.append("}");
        sb.append(",");
        sb.append("{amount:");
        sb.append(realmGet$amount());
        sb.append("}");
        sb.append(",");
        sb.append("{loyaltyCoinsUsed:");
        sb.append(realmGet$loyaltyCoinsUsed());
        sb.append("}");
        sb.append(",");
        sb.append("{personalPriceDiscount:");
        if (realmGet$personalPriceDiscount() == null) {
            str2 = "null";
        } else {
            str2 = "PersonalPriceDiscountEntity";
        }
        sb.append(str2);
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
