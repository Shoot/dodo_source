package io.realm;

import com.dodopizza.persistence.entity.address.AddressEntity;
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
public class com_dodopizza_persistence_entity_address_AddressEntityRealmProxy extends AddressEntity implements r89, ffc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<AddressEntity> c;

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
        long n;
        long o;
        long p;
        long q;

        a(OsSchemaInfo osSchemaInfo) {
            super(13);
            OsObjectSchemaInfo b = osSchemaInfo.b("AddressEntity");
            this.e = a("id", "id", b);
            this.f = a("addressName", "addressName", b);
            this.g = a(AddressEntity.STREET_ID_FIELD_NAME, AddressEntity.STREET_ID_FIELD_NAME, b);
            this.h = a("streetName", "streetName", b);
            this.i = a("shortStreetName", "shortStreetName", b);
            this.j = a(AddressEntity.HOUSE_NUMBER_FIELD_NAME, AddressEntity.HOUSE_NUMBER_FIELD_NAME, b);
            this.k = a("building", "building", b);
            this.l = a(AddressEntity.APARTMENT_FIELD_NAME, AddressEntity.APARTMENT_FIELD_NAME, b);
            this.m = a("entrance", "entrance", b);
            this.n = a("floor", "floor", b);
            this.o = a("intercome", "intercome", b);
            this.p = a("comment", "comment", b);
            this.q = a("postalcode", "postalcode", b);
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
            aVar2.n = aVar.n;
            aVar2.o = aVar.o;
            aVar2.p = aVar.p;
            aVar2.q = aVar.q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_address_AddressEntityRealmProxy() {
        this.c.p();
    }

    public static AddressEntity c(d0 d0Var, a aVar, AddressEntity addressEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(addressEntity);
        if (r89Var != null) {
            return (AddressEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(AddressEntity.class), set);
        osObjectBuilder.E0(aVar.e, addressEntity.realmGet$id());
        osObjectBuilder.E0(aVar.f, addressEntity.realmGet$addressName());
        osObjectBuilder.E0(aVar.g, addressEntity.realmGet$streetId());
        osObjectBuilder.E0(aVar.h, addressEntity.realmGet$streetName());
        osObjectBuilder.E0(aVar.i, addressEntity.realmGet$shortStreetName());
        osObjectBuilder.E0(aVar.j, addressEntity.realmGet$houseNumber());
        osObjectBuilder.E0(aVar.k, addressEntity.realmGet$building());
        osObjectBuilder.E0(aVar.l, addressEntity.realmGet$apartment());
        osObjectBuilder.E0(aVar.m, addressEntity.realmGet$entrance());
        osObjectBuilder.E0(aVar.n, addressEntity.realmGet$floor());
        osObjectBuilder.E0(aVar.o, addressEntity.realmGet$intercome());
        osObjectBuilder.E0(aVar.p, addressEntity.realmGet$comment());
        osObjectBuilder.E0(aVar.q, addressEntity.realmGet$postalcode());
        com_dodopizza_persistence_entity_address_AddressEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(addressEntity, j);
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dodopizza.persistence.entity.address.AddressEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_address_AddressEntityRealmProxy.a r9, com.dodopizza.persistence.entity.address.AddressEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.address.AddressEntity r1 = (com.dodopizza.persistence.entity.address.AddressEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.address.AddressEntity> r2 = com.dodopizza.persistence.entity.address.AddressEntity.class
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
            io.realm.com_dodopizza_persistence_entity_address_AddressEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_address_AddressEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.address.AddressEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.address.AddressEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_address_AddressEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_address_AddressEntityRealmProxy$a, com.dodopizza.persistence.entity.address.AddressEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.address.AddressEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static AddressEntity f(AddressEntity addressEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        AddressEntity addressEntity2;
        if (i <= i2 && addressEntity != null) {
            r89.a<o89> aVar = map.get(addressEntity);
            if (aVar == null) {
                addressEntity2 = new AddressEntity();
                map.put(addressEntity, new r89.a<>(i, addressEntity2));
            } else if (i >= aVar.a) {
                return (AddressEntity) aVar.b;
            } else {
                aVar.a = i;
                addressEntity2 = (AddressEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) addressEntity).a().f();
            addressEntity2.realmSet$id(addressEntity.realmGet$id());
            addressEntity2.realmSet$addressName(addressEntity.realmGet$addressName());
            addressEntity2.realmSet$streetId(addressEntity.realmGet$streetId());
            addressEntity2.realmSet$streetName(addressEntity.realmGet$streetName());
            addressEntity2.realmSet$shortStreetName(addressEntity.realmGet$shortStreetName());
            addressEntity2.realmSet$houseNumber(addressEntity.realmGet$houseNumber());
            addressEntity2.realmSet$building(addressEntity.realmGet$building());
            addressEntity2.realmSet$apartment(addressEntity.realmGet$apartment());
            addressEntity2.realmSet$entrance(addressEntity.realmGet$entrance());
            addressEntity2.realmSet$floor(addressEntity.realmGet$floor());
            addressEntity2.realmSet$intercome(addressEntity.realmGet$intercome());
            addressEntity2.realmSet$comment(addressEntity.realmGet$comment());
            addressEntity2.realmSet$postalcode(addressEntity.realmGet$postalcode());
            return addressEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "AddressEntity", false, 13, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, false);
        bVar.b("", "addressName", realmFieldType, false, false, true);
        bVar.b("", AddressEntity.STREET_ID_FIELD_NAME, realmFieldType, false, false, true);
        bVar.b("", "streetName", realmFieldType, false, false, true);
        bVar.b("", "shortStreetName", realmFieldType, false, false, true);
        bVar.b("", AddressEntity.HOUSE_NUMBER_FIELD_NAME, realmFieldType, false, false, true);
        bVar.b("", "building", realmFieldType, false, false, true);
        bVar.b("", AddressEntity.APARTMENT_FIELD_NAME, realmFieldType, false, false, true);
        bVar.b("", "entrance", realmFieldType, false, false, true);
        bVar.b("", "floor", realmFieldType, false, false, true);
        bVar.b("", "intercome", realmFieldType, false, false, true);
        bVar.b("", "comment", realmFieldType, false, false, true);
        bVar.b("", "postalcode", realmFieldType, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, AddressEntity addressEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((addressEntity instanceof r89) && !n0.isFrozen(addressEntity)) {
            r89 r89Var = (r89) addressEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(AddressEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(AddressEntity.class);
        long j = aVar.e;
        String realmGet$id = addressEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(addressEntity, Long.valueOf(j2));
        String realmGet$addressName = addressEntity.realmGet$addressName();
        if (realmGet$addressName != null) {
            Table.nativeSetString(nativePtr, aVar.f, j2, realmGet$addressName, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f, j2, false);
        }
        String realmGet$streetId = addressEntity.realmGet$streetId();
        if (realmGet$streetId != null) {
            Table.nativeSetString(nativePtr, aVar.g, j2, realmGet$streetId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j2, false);
        }
        String realmGet$streetName = addressEntity.realmGet$streetName();
        if (realmGet$streetName != null) {
            Table.nativeSetString(nativePtr, aVar.h, j2, realmGet$streetName, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, j2, false);
        }
        String realmGet$shortStreetName = addressEntity.realmGet$shortStreetName();
        if (realmGet$shortStreetName != null) {
            Table.nativeSetString(nativePtr, aVar.i, j2, realmGet$shortStreetName, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.i, j2, false);
        }
        String realmGet$houseNumber = addressEntity.realmGet$houseNumber();
        if (realmGet$houseNumber != null) {
            Table.nativeSetString(nativePtr, aVar.j, j2, realmGet$houseNumber, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.j, j2, false);
        }
        String realmGet$building = addressEntity.realmGet$building();
        if (realmGet$building != null) {
            Table.nativeSetString(nativePtr, aVar.k, j2, realmGet$building, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.k, j2, false);
        }
        String realmGet$apartment = addressEntity.realmGet$apartment();
        if (realmGet$apartment != null) {
            Table.nativeSetString(nativePtr, aVar.l, j2, realmGet$apartment, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.l, j2, false);
        }
        String realmGet$entrance = addressEntity.realmGet$entrance();
        if (realmGet$entrance != null) {
            Table.nativeSetString(nativePtr, aVar.m, j2, realmGet$entrance, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.m, j2, false);
        }
        String realmGet$floor = addressEntity.realmGet$floor();
        if (realmGet$floor != null) {
            Table.nativeSetString(nativePtr, aVar.n, j2, realmGet$floor, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.n, j2, false);
        }
        String realmGet$intercome = addressEntity.realmGet$intercome();
        if (realmGet$intercome != null) {
            Table.nativeSetString(nativePtr, aVar.o, j2, realmGet$intercome, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.o, j2, false);
        }
        String realmGet$comment = addressEntity.realmGet$comment();
        if (realmGet$comment != null) {
            Table.nativeSetString(nativePtr, aVar.p, j2, realmGet$comment, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.p, j2, false);
        }
        String realmGet$postalcode = addressEntity.realmGet$postalcode();
        if (realmGet$postalcode != null) {
            Table.nativeSetString(nativePtr, aVar.q, j2, realmGet$postalcode, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.q, j2, false);
        }
        return j2;
    }

    static com_dodopizza_persistence_entity_address_AddressEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(AddressEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_address_AddressEntityRealmProxy com_dodopizza_persistence_entity_address_addressentityrealmproxy = new com_dodopizza_persistence_entity_address_AddressEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_address_addressentityrealmproxy;
    }

    static AddressEntity k(d0 d0Var, a aVar, AddressEntity addressEntity, AddressEntity addressEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(AddressEntity.class), set);
        osObjectBuilder.E0(aVar.e, addressEntity2.realmGet$id());
        osObjectBuilder.E0(aVar.f, addressEntity2.realmGet$addressName());
        osObjectBuilder.E0(aVar.g, addressEntity2.realmGet$streetId());
        osObjectBuilder.E0(aVar.h, addressEntity2.realmGet$streetName());
        osObjectBuilder.E0(aVar.i, addressEntity2.realmGet$shortStreetName());
        osObjectBuilder.E0(aVar.j, addressEntity2.realmGet$houseNumber());
        osObjectBuilder.E0(aVar.k, addressEntity2.realmGet$building());
        osObjectBuilder.E0(aVar.l, addressEntity2.realmGet$apartment());
        osObjectBuilder.E0(aVar.m, addressEntity2.realmGet$entrance());
        osObjectBuilder.E0(aVar.n, addressEntity2.realmGet$floor());
        osObjectBuilder.E0(aVar.o, addressEntity2.realmGet$intercome());
        osObjectBuilder.E0(aVar.p, addressEntity2.realmGet$comment());
        osObjectBuilder.E0(aVar.q, addressEntity2.realmGet$postalcode());
        osObjectBuilder.K0();
        return addressEntity;
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
        c0<AddressEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_address_AddressEntityRealmProxy com_dodopizza_persistence_entity_address_addressentityrealmproxy = (com_dodopizza_persistence_entity_address_AddressEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_address_addressentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_address_addressentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_address_addressentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public String realmGet$addressName() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public String realmGet$apartment() {
        this.c.f().c();
        return this.c.g().p0(this.b.l);
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public String realmGet$building() {
        this.c.f().c();
        return this.c.g().p0(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public String realmGet$comment() {
        this.c.f().c();
        return this.c.g().p0(this.b.p);
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public String realmGet$entrance() {
        this.c.f().c();
        return this.c.g().p0(this.b.m);
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public String realmGet$floor() {
        this.c.f().c();
        return this.c.g().p0(this.b.n);
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public String realmGet$houseNumber() {
        this.c.f().c();
        return this.c.g().p0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public String realmGet$intercome() {
        this.c.f().c();
        return this.c.g().p0(this.b.o);
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public String realmGet$postalcode() {
        this.c.f().c();
        return this.c.g().p0(this.b.q);
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public String realmGet$shortStreetName() {
        this.c.f().c();
        return this.c.g().p0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public String realmGet$streetId() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public String realmGet$streetName() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public void realmSet$addressName(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.f, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'addressName' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'addressName' to null.");
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public void realmSet$apartment(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.l, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'apartment' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.l, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'apartment' to null.");
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public void realmSet$building(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.k, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'building' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.k, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'building' to null.");
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public void realmSet$comment(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.p, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'comment' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.p, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'comment' to null.");
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public void realmSet$entrance(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.m, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'entrance' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.m, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'entrance' to null.");
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public void realmSet$floor(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.n, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'floor' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.n, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'floor' to null.");
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public void realmSet$houseNumber(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.j, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'houseNumber' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.j, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'houseNumber' to null.");
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public void realmSet$intercome(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.o, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'intercome' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.o, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'intercome' to null.");
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public void realmSet$postalcode(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.q, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'postalcode' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.q, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'postalcode' to null.");
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public void realmSet$shortStreetName(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.i, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'shortStreetName' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.i, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'shortStreetName' to null.");
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public void realmSet$streetId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.g, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'streetId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'streetId' to null.");
    }

    @Override // com.dodopizza.persistence.entity.address.AddressEntity, defpackage.ffc
    public void realmSet$streetName(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.h, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'streetName' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.h, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'streetName' to null.");
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("AddressEntity = proxy[");
        sb.append("{id:");
        if (realmGet$id() != null) {
            str = realmGet$id();
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{addressName:");
        sb.append(realmGet$addressName());
        sb.append("}");
        sb.append(",");
        sb.append("{streetId:");
        sb.append(realmGet$streetId());
        sb.append("}");
        sb.append(",");
        sb.append("{streetName:");
        sb.append(realmGet$streetName());
        sb.append("}");
        sb.append(",");
        sb.append("{shortStreetName:");
        sb.append(realmGet$shortStreetName());
        sb.append("}");
        sb.append(",");
        sb.append("{houseNumber:");
        sb.append(realmGet$houseNumber());
        sb.append("}");
        sb.append(",");
        sb.append("{building:");
        sb.append(realmGet$building());
        sb.append("}");
        sb.append(",");
        sb.append("{apartment:");
        sb.append(realmGet$apartment());
        sb.append("}");
        sb.append(",");
        sb.append("{entrance:");
        sb.append(realmGet$entrance());
        sb.append("}");
        sb.append(",");
        sb.append("{floor:");
        sb.append(realmGet$floor());
        sb.append("}");
        sb.append(",");
        sb.append("{intercome:");
        sb.append(realmGet$intercome());
        sb.append("}");
        sb.append(",");
        sb.append("{comment:");
        sb.append(realmGet$comment());
        sb.append("}");
        sb.append(",");
        sb.append("{postalcode:");
        sb.append(realmGet$postalcode());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
