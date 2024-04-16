package io.realm;

import com.dodopizza.persistence.entity.deliverylocation.AddressAdditionEntity;
import com.dodopizza.persistence.entity.deliverylocation.CoordinatesEntity;
import com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity;
import defpackage.r89;
import im.threads.business.transport.MessageAttributes;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_deliverylocation_AddressAdditionEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_deliverylocation_CoordinatesEntityRealmProxy;
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
public class com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy extends DeliveryLocationEntity implements r89, jgc {
    private static final OsObjectSchemaInfo e = g();
    private a b;
    private c0<DeliveryLocationEntity> c;
    private k0<AddressAdditionEntity> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;
        long f;
        long g;
        long h;
        long i;

        a(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo b = osSchemaInfo.b("DeliveryLocationEntity");
            this.e = a("formattedAddress", "formattedAddress", b);
            this.f = a("additions", "additions", b);
            this.g = a(MessageAttributes.COORDINATES, MessageAttributes.COORDINATES, b);
            this.h = a("encodedComponents", "encodedComponents", b);
            this.i = a("id", "id", b);
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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy() {
        this.c.p();
    }

    public static DeliveryLocationEntity c(d0 d0Var, a aVar, DeliveryLocationEntity deliveryLocationEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(deliveryLocationEntity);
        if (r89Var != null) {
            return (DeliveryLocationEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(DeliveryLocationEntity.class), set);
        osObjectBuilder.E0(aVar.e, deliveryLocationEntity.realmGet$formattedAddress());
        osObjectBuilder.E0(aVar.h, deliveryLocationEntity.realmGet$encodedComponents());
        osObjectBuilder.E0(aVar.i, deliveryLocationEntity.realmGet$id());
        com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(deliveryLocationEntity, j);
        k0<AddressAdditionEntity> realmGet$additions = deliveryLocationEntity.realmGet$additions();
        if (realmGet$additions != null) {
            k0<AddressAdditionEntity> realmGet$additions2 = j.realmGet$additions();
            realmGet$additions2.clear();
            for (int i = 0; i < realmGet$additions.size(); i++) {
                AddressAdditionEntity addressAdditionEntity = realmGet$additions.get(i);
                AddressAdditionEntity addressAdditionEntity2 = (AddressAdditionEntity) map.get(addressAdditionEntity);
                if (addressAdditionEntity2 != null) {
                    realmGet$additions2.add(addressAdditionEntity2);
                } else {
                    realmGet$additions2.add(com_dodopizza_persistence_entity_deliverylocation_AddressAdditionEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_deliverylocation_AddressAdditionEntityRealmProxy.a) d0Var.u().e(AddressAdditionEntity.class), addressAdditionEntity, z, map, set));
                }
            }
        }
        CoordinatesEntity realmGet$coordinates = deliveryLocationEntity.realmGet$coordinates();
        if (realmGet$coordinates == null) {
            j.realmSet$coordinates(null);
        } else {
            CoordinatesEntity coordinatesEntity = (CoordinatesEntity) map.get(realmGet$coordinates);
            if (coordinatesEntity != null) {
                j.realmSet$coordinates(coordinatesEntity);
            } else {
                j.realmSet$coordinates(com_dodopizza_persistence_entity_deliverylocation_CoordinatesEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_deliverylocation_CoordinatesEntityRealmProxy.a) d0Var.u().e(CoordinatesEntity.class), realmGet$coordinates, z, map, set));
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
    public static com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy.a r9, com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity r1 = (com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity> r2 = com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity.class
            io.realm.internal.Table r2 = r8.I0(r2)
            long r3 = r9.i
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
            io.realm.com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy$a, com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static DeliveryLocationEntity f(DeliveryLocationEntity deliveryLocationEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        DeliveryLocationEntity deliveryLocationEntity2;
        if (i > i2 || deliveryLocationEntity == null) {
            return null;
        }
        r89.a<o89> aVar = map.get(deliveryLocationEntity);
        if (aVar == null) {
            deliveryLocationEntity2 = new DeliveryLocationEntity();
            map.put(deliveryLocationEntity, new r89.a<>(i, deliveryLocationEntity2));
        } else if (i >= aVar.a) {
            return (DeliveryLocationEntity) aVar.b;
        } else {
            aVar.a = i;
            deliveryLocationEntity2 = (DeliveryLocationEntity) aVar.b;
        }
        d0 d0Var = (d0) ((r89) deliveryLocationEntity).a().f();
        deliveryLocationEntity2.realmSet$formattedAddress(deliveryLocationEntity.realmGet$formattedAddress());
        if (i == i2) {
            deliveryLocationEntity2.realmSet$additions(null);
        } else {
            k0<AddressAdditionEntity> realmGet$additions = deliveryLocationEntity.realmGet$additions();
            k0<AddressAdditionEntity> k0Var = new k0<>();
            deliveryLocationEntity2.realmSet$additions(k0Var);
            int i3 = i + 1;
            int size = realmGet$additions.size();
            for (int i4 = 0; i4 < size; i4++) {
                k0Var.add(com_dodopizza_persistence_entity_deliverylocation_AddressAdditionEntityRealmProxy.f(realmGet$additions.get(i4), i3, i2, map));
            }
        }
        deliveryLocationEntity2.realmSet$coordinates(com_dodopizza_persistence_entity_deliverylocation_CoordinatesEntityRealmProxy.f(deliveryLocationEntity.realmGet$coordinates(), i + 1, i2, map));
        deliveryLocationEntity2.realmSet$encodedComponents(deliveryLocationEntity.realmGet$encodedComponents());
        deliveryLocationEntity2.realmSet$id(deliveryLocationEntity.realmGet$id());
        return deliveryLocationEntity2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "DeliveryLocationEntity", false, 5, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "formattedAddress", realmFieldType, false, false, true);
        bVar.a("", "additions", RealmFieldType.LIST, "AddressAdditionEntity");
        bVar.a("", MessageAttributes.COORDINATES, RealmFieldType.OBJECT, "CoordinatesEntity");
        bVar.b("", "encodedComponents", realmFieldType, false, false, true);
        bVar.b("", "id", realmFieldType, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return e;
    }

    public static long i(d0 d0Var, DeliveryLocationEntity deliveryLocationEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        long j;
        long j2;
        long j3;
        if ((deliveryLocationEntity instanceof r89) && !n0.isFrozen(deliveryLocationEntity)) {
            r89 r89Var = (r89) deliveryLocationEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(DeliveryLocationEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(DeliveryLocationEntity.class);
        long j4 = aVar.i;
        String realmGet$id = deliveryLocationEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j4);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j4, realmGet$id);
        }
        long j5 = nativeFindFirstString;
        map.put(deliveryLocationEntity, Long.valueOf(j5));
        String realmGet$formattedAddress = deliveryLocationEntity.realmGet$formattedAddress();
        if (realmGet$formattedAddress != null) {
            j = j5;
            Table.nativeSetString(nativePtr, aVar.e, j5, realmGet$formattedAddress, false);
        } else {
            j = j5;
            Table.nativeSetNull(nativePtr, aVar.e, j, false);
        }
        long j6 = j;
        OsList osList = new OsList(I0.r(j6), aVar.f);
        k0<AddressAdditionEntity> realmGet$additions = deliveryLocationEntity.realmGet$additions();
        if (realmGet$additions != null && realmGet$additions.size() == osList.X()) {
            int size = realmGet$additions.size();
            int i = 0;
            while (i < size) {
                AddressAdditionEntity addressAdditionEntity = realmGet$additions.get(i);
                Long l = map.get(addressAdditionEntity);
                if (l == null) {
                    l = Long.valueOf(com_dodopizza_persistence_entity_deliverylocation_AddressAdditionEntityRealmProxy.i(d0Var, addressAdditionEntity, map));
                }
                osList.U(i, l.longValue());
                i++;
                j6 = j6;
            }
            j2 = j6;
        } else {
            j2 = j6;
            osList.J();
            if (realmGet$additions != null) {
                Iterator<AddressAdditionEntity> it = realmGet$additions.iterator();
                while (it.hasNext()) {
                    AddressAdditionEntity next = it.next();
                    Long l2 = map.get(next);
                    if (l2 == null) {
                        l2 = Long.valueOf(com_dodopizza_persistence_entity_deliverylocation_AddressAdditionEntityRealmProxy.i(d0Var, next, map));
                    }
                    osList.k(l2.longValue());
                }
            }
        }
        CoordinatesEntity realmGet$coordinates = deliveryLocationEntity.realmGet$coordinates();
        if (realmGet$coordinates != null) {
            Long l3 = map.get(realmGet$coordinates);
            if (l3 == null) {
                l3 = Long.valueOf(com_dodopizza_persistence_entity_deliverylocation_CoordinatesEntityRealmProxy.i(d0Var, realmGet$coordinates, map));
            }
            j3 = j2;
            Table.nativeSetLink(nativePtr, aVar.g, j2, l3.longValue(), false);
        } else {
            j3 = j2;
            Table.nativeNullifyLink(nativePtr, aVar.g, j3);
        }
        String realmGet$encodedComponents = deliveryLocationEntity.realmGet$encodedComponents();
        if (realmGet$encodedComponents != null) {
            Table.nativeSetString(nativePtr, aVar.h, j3, realmGet$encodedComponents, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, j3, false);
        }
        return j3;
    }

    static com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(DeliveryLocationEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy com_dodopizza_persistence_entity_deliverylocation_deliverylocationentityrealmproxy = new com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_deliverylocation_deliverylocationentityrealmproxy;
    }

    static DeliveryLocationEntity k(d0 d0Var, a aVar, DeliveryLocationEntity deliveryLocationEntity, DeliveryLocationEntity deliveryLocationEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(DeliveryLocationEntity.class), set);
        osObjectBuilder.E0(aVar.e, deliveryLocationEntity2.realmGet$formattedAddress());
        k0<AddressAdditionEntity> realmGet$additions = deliveryLocationEntity2.realmGet$additions();
        if (realmGet$additions != null) {
            k0 k0Var = new k0();
            for (int i = 0; i < realmGet$additions.size(); i++) {
                AddressAdditionEntity addressAdditionEntity = realmGet$additions.get(i);
                AddressAdditionEntity addressAdditionEntity2 = (AddressAdditionEntity) map.get(addressAdditionEntity);
                if (addressAdditionEntity2 != null) {
                    k0Var.add(addressAdditionEntity2);
                } else {
                    k0Var.add(com_dodopizza_persistence_entity_deliverylocation_AddressAdditionEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_deliverylocation_AddressAdditionEntityRealmProxy.a) d0Var.u().e(AddressAdditionEntity.class), addressAdditionEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.f, k0Var);
        } else {
            osObjectBuilder.z0(aVar.f, new k0());
        }
        CoordinatesEntity realmGet$coordinates = deliveryLocationEntity2.realmGet$coordinates();
        if (realmGet$coordinates == null) {
            osObjectBuilder.r0(aVar.g);
        } else {
            CoordinatesEntity coordinatesEntity = (CoordinatesEntity) map.get(realmGet$coordinates);
            if (coordinatesEntity != null) {
                osObjectBuilder.x0(aVar.g, coordinatesEntity);
            } else {
                osObjectBuilder.x0(aVar.g, com_dodopizza_persistence_entity_deliverylocation_CoordinatesEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_deliverylocation_CoordinatesEntityRealmProxy.a) d0Var.u().e(CoordinatesEntity.class), realmGet$coordinates, true, map, set));
            }
        }
        osObjectBuilder.E0(aVar.h, deliveryLocationEntity2.realmGet$encodedComponents());
        osObjectBuilder.E0(aVar.i, deliveryLocationEntity2.realmGet$id());
        osObjectBuilder.K0();
        return deliveryLocationEntity;
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
        c0<DeliveryLocationEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy com_dodopizza_persistence_entity_deliverylocation_deliverylocationentityrealmproxy = (com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_deliverylocation_deliverylocationentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_deliverylocation_deliverylocationentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_deliverylocation_deliverylocationentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity, defpackage.jgc
    public k0<AddressAdditionEntity> realmGet$additions() {
        this.c.f().c();
        k0<AddressAdditionEntity> k0Var = this.d;
        if (k0Var != null) {
            return k0Var;
        }
        k0<AddressAdditionEntity> k0Var2 = new k0<>(AddressAdditionEntity.class, this.c.g().f0(this.b.f), this.c.f());
        this.d = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity, defpackage.jgc
    public CoordinatesEntity realmGet$coordinates() {
        this.c.f().c();
        if (this.c.g().o0(this.b.g)) {
            return null;
        }
        return (CoordinatesEntity) this.c.f().o(CoordinatesEntity.class, this.c.g().L(this.b.g), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity, defpackage.jgc
    public String realmGet$encodedComponents() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity, defpackage.jgc
    public String realmGet$formattedAddress() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity, defpackage.jgc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity, defpackage.jgc
    public void realmSet$additions(k0<AddressAdditionEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("additions")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<AddressAdditionEntity> k0Var2 = new k0<>();
                Iterator<AddressAdditionEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    AddressAdditionEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((AddressAdditionEntity) d0Var.j0(next, new ex4[0]));
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
                AddressAdditionEntity addressAdditionEntity = k0Var.get(i);
                this.c.c(addressAdditionEntity);
                f0.U(i, ((r89) addressAdditionEntity).a().g().E0());
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
            AddressAdditionEntity addressAdditionEntity2 = k0Var.get(i);
            this.c.c(addressAdditionEntity2);
            f0.k(((r89) addressAdditionEntity2).a().g().E0());
            i++;
        }
    }

    @Override // com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity, defpackage.jgc
    public void realmSet$coordinates(CoordinatesEntity coordinatesEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains(MessageAttributes.COORDINATES)) {
                return;
            }
            if (coordinatesEntity != null && !n0.isManaged(coordinatesEntity)) {
                coordinatesEntity = (CoordinatesEntity) d0Var.j0(coordinatesEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (coordinatesEntity == null) {
                g.l0(this.b.g);
                return;
            }
            this.c.c(coordinatesEntity);
            g.o().B(this.b.g, g.E0(), ((r89) coordinatesEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (coordinatesEntity == null) {
            this.c.g().l0(this.b.g);
            return;
        }
        this.c.c(coordinatesEntity);
        this.c.g().s(this.b.g, ((r89) coordinatesEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity, defpackage.jgc
    public void realmSet$encodedComponents(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.h, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'encodedComponents' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.h, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'encodedComponents' to null.");
    }

    @Override // com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity, defpackage.jgc
    public void realmSet$formattedAddress(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.e, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'formattedAddress' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.e, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'formattedAddress' to null.");
    }

    @Override // com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity, defpackage.jgc
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
        StringBuilder sb = new StringBuilder("DeliveryLocationEntity = proxy[");
        sb.append("{formattedAddress:");
        sb.append(realmGet$formattedAddress());
        sb.append("}");
        sb.append(",");
        sb.append("{additions:");
        sb.append("RealmList<AddressAdditionEntity>[");
        sb.append(realmGet$additions().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{coordinates:");
        String str2 = "null";
        if (realmGet$coordinates() == null) {
            str = "null";
        } else {
            str = "CoordinatesEntity";
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{encodedComponents:");
        sb.append(realmGet$encodedComponents());
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
