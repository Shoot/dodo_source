package io.realm;

import com.dodopizza.persistence.entity.ClientDeliveryFeeLevelEntity;
import com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_ClientDeliveryFeeLevelEntityRealmProxy;
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
public class com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy extends DeliveryFeeLevelsEntity implements r89, tec {
    private static final OsObjectSchemaInfo e = g();
    private a b;
    private c0<DeliveryFeeLevelsEntity> c;
    private k0<ClientDeliveryFeeLevelEntity> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;
        long f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b = osSchemaInfo.b("DeliveryFeeLevelsEntity");
            this.e = a("feeLevels", "feeLevels", b);
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
    public com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy() {
        this.c.p();
    }

    public static DeliveryFeeLevelsEntity c(d0 d0Var, a aVar, DeliveryFeeLevelsEntity deliveryFeeLevelsEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(deliveryFeeLevelsEntity);
        if (r89Var != null) {
            return (DeliveryFeeLevelsEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(DeliveryFeeLevelsEntity.class), set);
        osObjectBuilder.E0(aVar.f, deliveryFeeLevelsEntity.realmGet$id());
        com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(deliveryFeeLevelsEntity, j);
        k0<ClientDeliveryFeeLevelEntity> realmGet$feeLevels = deliveryFeeLevelsEntity.realmGet$feeLevels();
        if (realmGet$feeLevels != null) {
            k0<ClientDeliveryFeeLevelEntity> realmGet$feeLevels2 = j.realmGet$feeLevels();
            realmGet$feeLevels2.clear();
            for (int i = 0; i < realmGet$feeLevels.size(); i++) {
                ClientDeliveryFeeLevelEntity clientDeliveryFeeLevelEntity = realmGet$feeLevels.get(i);
                ClientDeliveryFeeLevelEntity clientDeliveryFeeLevelEntity2 = (ClientDeliveryFeeLevelEntity) map.get(clientDeliveryFeeLevelEntity);
                if (clientDeliveryFeeLevelEntity2 != null) {
                    realmGet$feeLevels2.add(clientDeliveryFeeLevelEntity2);
                } else {
                    realmGet$feeLevels2.add(com_dodopizza_persistence_entity_ClientDeliveryFeeLevelEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_ClientDeliveryFeeLevelEntityRealmProxy.a) d0Var.u().e(ClientDeliveryFeeLevelEntity.class), clientDeliveryFeeLevelEntity, z, map, set));
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
    public static com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy.a r9, com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity r1 = (com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity> r2 = com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity.class
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
            io.realm.com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy$a, com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static DeliveryFeeLevelsEntity f(DeliveryFeeLevelsEntity deliveryFeeLevelsEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        DeliveryFeeLevelsEntity deliveryFeeLevelsEntity2;
        if (i > i2 || deliveryFeeLevelsEntity == null) {
            return null;
        }
        r89.a<o89> aVar = map.get(deliveryFeeLevelsEntity);
        if (aVar == null) {
            deliveryFeeLevelsEntity2 = new DeliveryFeeLevelsEntity();
            map.put(deliveryFeeLevelsEntity, new r89.a<>(i, deliveryFeeLevelsEntity2));
        } else if (i >= aVar.a) {
            return (DeliveryFeeLevelsEntity) aVar.b;
        } else {
            aVar.a = i;
            deliveryFeeLevelsEntity2 = (DeliveryFeeLevelsEntity) aVar.b;
        }
        d0 d0Var = (d0) ((r89) deliveryFeeLevelsEntity).a().f();
        if (i == i2) {
            deliveryFeeLevelsEntity2.realmSet$feeLevels(null);
        } else {
            k0<ClientDeliveryFeeLevelEntity> realmGet$feeLevels = deliveryFeeLevelsEntity.realmGet$feeLevels();
            k0<ClientDeliveryFeeLevelEntity> k0Var = new k0<>();
            deliveryFeeLevelsEntity2.realmSet$feeLevels(k0Var);
            int i3 = i + 1;
            int size = realmGet$feeLevels.size();
            for (int i4 = 0; i4 < size; i4++) {
                k0Var.add(com_dodopizza_persistence_entity_ClientDeliveryFeeLevelEntityRealmProxy.f(realmGet$feeLevels.get(i4), i3, i2, map));
            }
        }
        deliveryFeeLevelsEntity2.realmSet$id(deliveryFeeLevelsEntity.realmGet$id());
        return deliveryFeeLevelsEntity2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "DeliveryFeeLevelsEntity", false, 2, 0);
        bVar.a("", "feeLevels", RealmFieldType.LIST, "ClientDeliveryFeeLevelEntity");
        bVar.b("", "id", RealmFieldType.STRING, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return e;
    }

    public static long i(d0 d0Var, DeliveryFeeLevelsEntity deliveryFeeLevelsEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((deliveryFeeLevelsEntity instanceof r89) && !n0.isFrozen(deliveryFeeLevelsEntity)) {
            r89 r89Var = (r89) deliveryFeeLevelsEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(DeliveryFeeLevelsEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(DeliveryFeeLevelsEntity.class);
        long j = aVar.f;
        String realmGet$id = deliveryFeeLevelsEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        map.put(deliveryFeeLevelsEntity, Long.valueOf(nativeFindFirstString));
        OsList osList = new OsList(I0.r(nativeFindFirstString), aVar.e);
        k0<ClientDeliveryFeeLevelEntity> realmGet$feeLevels = deliveryFeeLevelsEntity.realmGet$feeLevels();
        if (realmGet$feeLevels != null && realmGet$feeLevels.size() == osList.X()) {
            int size = realmGet$feeLevels.size();
            for (int i = 0; i < size; i++) {
                ClientDeliveryFeeLevelEntity clientDeliveryFeeLevelEntity = realmGet$feeLevels.get(i);
                Long l = map.get(clientDeliveryFeeLevelEntity);
                if (l == null) {
                    l = Long.valueOf(com_dodopizza_persistence_entity_ClientDeliveryFeeLevelEntityRealmProxy.i(d0Var, clientDeliveryFeeLevelEntity, map));
                }
                osList.U(i, l.longValue());
            }
        } else {
            osList.J();
            if (realmGet$feeLevels != null) {
                Iterator<ClientDeliveryFeeLevelEntity> it = realmGet$feeLevels.iterator();
                while (it.hasNext()) {
                    ClientDeliveryFeeLevelEntity next = it.next();
                    Long l2 = map.get(next);
                    if (l2 == null) {
                        l2 = Long.valueOf(com_dodopizza_persistence_entity_ClientDeliveryFeeLevelEntityRealmProxy.i(d0Var, next, map));
                    }
                    osList.k(l2.longValue());
                }
            }
        }
        return nativeFindFirstString;
    }

    static com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(DeliveryFeeLevelsEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy com_dodopizza_persistence_entity_deliveryfeelevelsentityrealmproxy = new com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_deliveryfeelevelsentityrealmproxy;
    }

    static DeliveryFeeLevelsEntity k(d0 d0Var, a aVar, DeliveryFeeLevelsEntity deliveryFeeLevelsEntity, DeliveryFeeLevelsEntity deliveryFeeLevelsEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(DeliveryFeeLevelsEntity.class), set);
        k0<ClientDeliveryFeeLevelEntity> realmGet$feeLevels = deliveryFeeLevelsEntity2.realmGet$feeLevels();
        if (realmGet$feeLevels != null) {
            k0 k0Var = new k0();
            for (int i = 0; i < realmGet$feeLevels.size(); i++) {
                ClientDeliveryFeeLevelEntity clientDeliveryFeeLevelEntity = realmGet$feeLevels.get(i);
                ClientDeliveryFeeLevelEntity clientDeliveryFeeLevelEntity2 = (ClientDeliveryFeeLevelEntity) map.get(clientDeliveryFeeLevelEntity);
                if (clientDeliveryFeeLevelEntity2 != null) {
                    k0Var.add(clientDeliveryFeeLevelEntity2);
                } else {
                    k0Var.add(com_dodopizza_persistence_entity_ClientDeliveryFeeLevelEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_ClientDeliveryFeeLevelEntityRealmProxy.a) d0Var.u().e(ClientDeliveryFeeLevelEntity.class), clientDeliveryFeeLevelEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.e, k0Var);
        } else {
            osObjectBuilder.z0(aVar.e, new k0());
        }
        osObjectBuilder.E0(aVar.f, deliveryFeeLevelsEntity2.realmGet$id());
        osObjectBuilder.K0();
        return deliveryFeeLevelsEntity;
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
        c0<DeliveryFeeLevelsEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy com_dodopizza_persistence_entity_deliveryfeelevelsentityrealmproxy = (com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_deliveryfeelevelsentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_deliveryfeelevelsentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_deliveryfeelevelsentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity, defpackage.tec
    public k0<ClientDeliveryFeeLevelEntity> realmGet$feeLevels() {
        this.c.f().c();
        k0<ClientDeliveryFeeLevelEntity> k0Var = this.d;
        if (k0Var != null) {
            return k0Var;
        }
        k0<ClientDeliveryFeeLevelEntity> k0Var2 = new k0<>(ClientDeliveryFeeLevelEntity.class, this.c.g().f0(this.b.e), this.c.f());
        this.d = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity, defpackage.tec
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity, defpackage.tec
    public void realmSet$feeLevels(k0<ClientDeliveryFeeLevelEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("feeLevels")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<ClientDeliveryFeeLevelEntity> k0Var2 = new k0<>();
                Iterator<ClientDeliveryFeeLevelEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    ClientDeliveryFeeLevelEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((ClientDeliveryFeeLevelEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.e);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i < size) {
                ClientDeliveryFeeLevelEntity clientDeliveryFeeLevelEntity = k0Var.get(i);
                this.c.c(clientDeliveryFeeLevelEntity);
                f0.U(i, ((r89) clientDeliveryFeeLevelEntity).a().g().E0());
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
            ClientDeliveryFeeLevelEntity clientDeliveryFeeLevelEntity2 = k0Var.get(i);
            this.c.c(clientDeliveryFeeLevelEntity2);
            f0.k(((r89) clientDeliveryFeeLevelEntity2).a().g().E0());
            i++;
        }
    }

    @Override // com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity, defpackage.tec
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
        StringBuilder sb = new StringBuilder("DeliveryFeeLevelsEntity = proxy[");
        sb.append("{feeLevels:");
        sb.append("RealmList<ClientDeliveryFeeLevelEntity>[");
        sb.append(realmGet$feeLevels().size());
        sb.append("]");
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
