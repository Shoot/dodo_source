package io.realm;

import com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity;
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
public class com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy extends PersonalPriceDiscountEntity implements r89, tfc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<PersonalPriceDiscountEntity> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;
        long f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b = osSchemaInfo.b("PersonalPriceDiscountEntity");
            this.e = a("endDateTimeUtc", "endDateTimeUtc", b);
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
    public com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy() {
        this.c.p();
    }

    public static PersonalPriceDiscountEntity c(d0 d0Var, a aVar, PersonalPriceDiscountEntity personalPriceDiscountEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(personalPriceDiscountEntity);
        if (r89Var != null) {
            return (PersonalPriceDiscountEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PersonalPriceDiscountEntity.class), set);
        osObjectBuilder.p0(aVar.e, Long.valueOf(personalPriceDiscountEntity.realmGet$endDateTimeUtc()));
        osObjectBuilder.E0(aVar.f, personalPriceDiscountEntity.realmGet$id());
        com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(personalPriceDiscountEntity, j);
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy.a r9, com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity r1 = (com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity> r2 = com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity.class
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
            io.realm.com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy$a, com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static PersonalPriceDiscountEntity f(PersonalPriceDiscountEntity personalPriceDiscountEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        PersonalPriceDiscountEntity personalPriceDiscountEntity2;
        if (i <= i2 && personalPriceDiscountEntity != null) {
            r89.a<o89> aVar = map.get(personalPriceDiscountEntity);
            if (aVar == null) {
                personalPriceDiscountEntity2 = new PersonalPriceDiscountEntity();
                map.put(personalPriceDiscountEntity, new r89.a<>(i, personalPriceDiscountEntity2));
            } else if (i >= aVar.a) {
                return (PersonalPriceDiscountEntity) aVar.b;
            } else {
                aVar.a = i;
                personalPriceDiscountEntity2 = (PersonalPriceDiscountEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) personalPriceDiscountEntity).a().f();
            personalPriceDiscountEntity2.realmSet$endDateTimeUtc(personalPriceDiscountEntity.realmGet$endDateTimeUtc());
            personalPriceDiscountEntity2.realmSet$id(personalPriceDiscountEntity.realmGet$id());
            return personalPriceDiscountEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "PersonalPriceDiscountEntity", false, 2, 0);
        bVar.b("", "endDateTimeUtc", RealmFieldType.INTEGER, false, false, true);
        bVar.b("", "id", RealmFieldType.STRING, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, PersonalPriceDiscountEntity personalPriceDiscountEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((personalPriceDiscountEntity instanceof r89) && !n0.isFrozen(personalPriceDiscountEntity)) {
            r89 r89Var = (r89) personalPriceDiscountEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(PersonalPriceDiscountEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(PersonalPriceDiscountEntity.class);
        long j = aVar.f;
        String realmGet$id = personalPriceDiscountEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(personalPriceDiscountEntity, Long.valueOf(j2));
        Table.nativeSetLong(nativePtr, aVar.e, j2, personalPriceDiscountEntity.realmGet$endDateTimeUtc(), false);
        return j2;
    }

    static com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(PersonalPriceDiscountEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy com_dodopizza_persistence_entity_cart_personalpricediscountentityrealmproxy = new com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_cart_personalpricediscountentityrealmproxy;
    }

    static PersonalPriceDiscountEntity k(d0 d0Var, a aVar, PersonalPriceDiscountEntity personalPriceDiscountEntity, PersonalPriceDiscountEntity personalPriceDiscountEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PersonalPriceDiscountEntity.class), set);
        osObjectBuilder.p0(aVar.e, Long.valueOf(personalPriceDiscountEntity2.realmGet$endDateTimeUtc()));
        osObjectBuilder.E0(aVar.f, personalPriceDiscountEntity2.realmGet$id());
        osObjectBuilder.K0();
        return personalPriceDiscountEntity;
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
        c0<PersonalPriceDiscountEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy com_dodopizza_persistence_entity_cart_personalpricediscountentityrealmproxy = (com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_cart_personalpricediscountentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_cart_personalpricediscountentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_cart_personalpricediscountentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity, defpackage.tfc
    public long realmGet$endDateTimeUtc() {
        this.c.f().c();
        return this.c.g().e0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity, defpackage.tfc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity, defpackage.tfc
    public void realmSet$endDateTimeUtc(long j) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.e, g.E0(), j, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.e, j);
    }

    @Override // com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity, defpackage.tfc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("PersonalPriceDiscountEntity = proxy[");
        sb.append("{endDateTimeUtc:");
        sb.append(realmGet$endDateTimeUtc());
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
