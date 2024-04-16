package io.realm;

import com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity;
import com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy;
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
public class com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy extends ClientDeliveryLocationProfileEntity implements r89, hgc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<ClientDeliveryLocationProfileEntity> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;
        long f;
        long g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b = osSchemaInfo.b("ClientDeliveryLocationProfileEntity");
            this.e = a("id", "id", b);
            this.f = a("deliveryLocation", "deliveryLocation", b);
            this.g = a("requiresAdditions", "requiresAdditions", b);
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
    public com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy() {
        this.c.p();
    }

    public static ClientDeliveryLocationProfileEntity c(d0 d0Var, a aVar, ClientDeliveryLocationProfileEntity clientDeliveryLocationProfileEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(clientDeliveryLocationProfileEntity);
        if (r89Var != null) {
            return (ClientDeliveryLocationProfileEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(ClientDeliveryLocationProfileEntity.class), set);
        osObjectBuilder.E0(aVar.e, clientDeliveryLocationProfileEntity.realmGet$id());
        osObjectBuilder.j0(aVar.g, Boolean.valueOf(clientDeliveryLocationProfileEntity.realmGet$requiresAdditions()));
        com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(clientDeliveryLocationProfileEntity, j);
        DeliveryLocationEntity realmGet$deliveryLocation = clientDeliveryLocationProfileEntity.realmGet$deliveryLocation();
        if (realmGet$deliveryLocation == null) {
            j.realmSet$deliveryLocation(null);
        } else {
            DeliveryLocationEntity deliveryLocationEntity = (DeliveryLocationEntity) map.get(realmGet$deliveryLocation);
            if (deliveryLocationEntity != null) {
                j.realmSet$deliveryLocation(deliveryLocationEntity);
            } else {
                j.realmSet$deliveryLocation(com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy.a) d0Var.u().e(DeliveryLocationEntity.class), realmGet$deliveryLocation, z, map, set));
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
    public static com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy.a r9, com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity r1 = (com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity> r2 = com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity.class
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
            io.realm.com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy$a, com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static ClientDeliveryLocationProfileEntity f(ClientDeliveryLocationProfileEntity clientDeliveryLocationProfileEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        ClientDeliveryLocationProfileEntity clientDeliveryLocationProfileEntity2;
        if (i <= i2 && clientDeliveryLocationProfileEntity != null) {
            r89.a<o89> aVar = map.get(clientDeliveryLocationProfileEntity);
            if (aVar == null) {
                clientDeliveryLocationProfileEntity2 = new ClientDeliveryLocationProfileEntity();
                map.put(clientDeliveryLocationProfileEntity, new r89.a<>(i, clientDeliveryLocationProfileEntity2));
            } else if (i >= aVar.a) {
                return (ClientDeliveryLocationProfileEntity) aVar.b;
            } else {
                aVar.a = i;
                clientDeliveryLocationProfileEntity2 = (ClientDeliveryLocationProfileEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) clientDeliveryLocationProfileEntity).a().f();
            clientDeliveryLocationProfileEntity2.realmSet$id(clientDeliveryLocationProfileEntity.realmGet$id());
            clientDeliveryLocationProfileEntity2.realmSet$deliveryLocation(com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy.f(clientDeliveryLocationProfileEntity.realmGet$deliveryLocation(), i + 1, i2, map));
            clientDeliveryLocationProfileEntity2.realmSet$requiresAdditions(clientDeliveryLocationProfileEntity.realmGet$requiresAdditions());
            return clientDeliveryLocationProfileEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "ClientDeliveryLocationProfileEntity", false, 3, 0);
        bVar.b("", "id", RealmFieldType.STRING, true, false, false);
        bVar.a("", "deliveryLocation", RealmFieldType.OBJECT, "DeliveryLocationEntity");
        bVar.b("", "requiresAdditions", RealmFieldType.BOOLEAN, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, ClientDeliveryLocationProfileEntity clientDeliveryLocationProfileEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((clientDeliveryLocationProfileEntity instanceof r89) && !n0.isFrozen(clientDeliveryLocationProfileEntity)) {
            r89 r89Var = (r89) clientDeliveryLocationProfileEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(ClientDeliveryLocationProfileEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(ClientDeliveryLocationProfileEntity.class);
        long j = aVar.e;
        String realmGet$id = clientDeliveryLocationProfileEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(clientDeliveryLocationProfileEntity, Long.valueOf(j2));
        DeliveryLocationEntity realmGet$deliveryLocation = clientDeliveryLocationProfileEntity.realmGet$deliveryLocation();
        if (realmGet$deliveryLocation != null) {
            Long l = map.get(realmGet$deliveryLocation);
            if (l == null) {
                l = Long.valueOf(com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy.i(d0Var, realmGet$deliveryLocation, map));
            }
            Table.nativeSetLink(nativePtr, aVar.f, j2, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f, j2);
        }
        Table.nativeSetBoolean(nativePtr, aVar.g, j2, clientDeliveryLocationProfileEntity.realmGet$requiresAdditions(), false);
        return j2;
    }

    static com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(ClientDeliveryLocationProfileEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy com_dodopizza_persistence_entity_deliverylocation_clientdeliverylocationprofileentityrealmproxy = new com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_deliverylocation_clientdeliverylocationprofileentityrealmproxy;
    }

    static ClientDeliveryLocationProfileEntity k(d0 d0Var, a aVar, ClientDeliveryLocationProfileEntity clientDeliveryLocationProfileEntity, ClientDeliveryLocationProfileEntity clientDeliveryLocationProfileEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(ClientDeliveryLocationProfileEntity.class), set);
        osObjectBuilder.E0(aVar.e, clientDeliveryLocationProfileEntity2.realmGet$id());
        DeliveryLocationEntity realmGet$deliveryLocation = clientDeliveryLocationProfileEntity2.realmGet$deliveryLocation();
        if (realmGet$deliveryLocation == null) {
            osObjectBuilder.r0(aVar.f);
        } else {
            DeliveryLocationEntity deliveryLocationEntity = (DeliveryLocationEntity) map.get(realmGet$deliveryLocation);
            if (deliveryLocationEntity != null) {
                osObjectBuilder.x0(aVar.f, deliveryLocationEntity);
            } else {
                osObjectBuilder.x0(aVar.f, com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy.a) d0Var.u().e(DeliveryLocationEntity.class), realmGet$deliveryLocation, true, map, set));
            }
        }
        osObjectBuilder.j0(aVar.g, Boolean.valueOf(clientDeliveryLocationProfileEntity2.realmGet$requiresAdditions()));
        osObjectBuilder.K0();
        return clientDeliveryLocationProfileEntity;
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
        c0<ClientDeliveryLocationProfileEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy com_dodopizza_persistence_entity_deliverylocation_clientdeliverylocationprofileentityrealmproxy = (com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_deliverylocation_clientdeliverylocationprofileentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_deliverylocation_clientdeliverylocationprofileentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_deliverylocation_clientdeliverylocationprofileentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity, defpackage.hgc
    public DeliveryLocationEntity realmGet$deliveryLocation() {
        this.c.f().c();
        if (this.c.g().o0(this.b.f)) {
            return null;
        }
        return (DeliveryLocationEntity) this.c.f().o(DeliveryLocationEntity.class, this.c.g().L(this.b.f), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity, defpackage.hgc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity, defpackage.hgc
    public boolean realmGet$requiresAdditions() {
        this.c.f().c();
        return this.c.g().b0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity, defpackage.hgc
    public void realmSet$deliveryLocation(DeliveryLocationEntity deliveryLocationEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("deliveryLocation")) {
                return;
            }
            if (deliveryLocationEntity != null && !n0.isManaged(deliveryLocationEntity)) {
                deliveryLocationEntity = (DeliveryLocationEntity) d0Var.j0(deliveryLocationEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (deliveryLocationEntity == null) {
                g.l0(this.b.f);
                return;
            }
            this.c.c(deliveryLocationEntity);
            g.o().B(this.b.f, g.E0(), ((r89) deliveryLocationEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (deliveryLocationEntity == null) {
            this.c.g().l0(this.b.f);
            return;
        }
        this.c.c(deliveryLocationEntity);
        this.c.g().s(this.b.f, ((r89) deliveryLocationEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity, defpackage.hgc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity, defpackage.hgc
    public void realmSet$requiresAdditions(boolean z) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().y(this.b.g, g.E0(), z, true);
            return;
        }
        this.c.f().c();
        this.c.g().Q(this.b.g, z);
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ClientDeliveryLocationProfileEntity = proxy[");
        sb.append("{id:");
        String str2 = "null";
        if (realmGet$id() == null) {
            str = "null";
        } else {
            str = realmGet$id();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{deliveryLocation:");
        if (realmGet$deliveryLocation() != null) {
            str2 = "DeliveryLocationEntity";
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{requiresAdditions:");
        sb.append(realmGet$requiresAdditions());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
