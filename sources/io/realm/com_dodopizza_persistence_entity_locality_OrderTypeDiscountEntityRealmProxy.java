package io.realm;

import com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity;
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
public class com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy extends OrderTypeDiscountEntity implements r89, ogc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<OrderTypeDiscountEntity> c;

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
            OsObjectSchemaInfo b = osSchemaInfo.b("OrderTypeDiscountEntity");
            this.e = a("carryout", "carryout", b);
            this.f = a("restaurant", "restaurant", b);
            this.g = a("carryoutText", "carryoutText", b);
            this.h = a("restaurantText", "restaurantText", b);
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
    public com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy() {
        this.c.p();
    }

    public static OrderTypeDiscountEntity c(d0 d0Var, a aVar, OrderTypeDiscountEntity orderTypeDiscountEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(orderTypeDiscountEntity);
        if (r89Var != null) {
            return (OrderTypeDiscountEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(OrderTypeDiscountEntity.class), set);
        osObjectBuilder.o0(aVar.e, Integer.valueOf(orderTypeDiscountEntity.realmGet$carryout()));
        osObjectBuilder.o0(aVar.f, Integer.valueOf(orderTypeDiscountEntity.realmGet$restaurant()));
        osObjectBuilder.E0(aVar.g, orderTypeDiscountEntity.realmGet$carryoutText());
        osObjectBuilder.E0(aVar.h, orderTypeDiscountEntity.realmGet$restaurantText());
        osObjectBuilder.E0(aVar.i, orderTypeDiscountEntity.realmGet$id());
        com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(orderTypeDiscountEntity, j);
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy.a r9, com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity r1 = (com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity> r2 = com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity.class
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
            io.realm.com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy$a, com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static OrderTypeDiscountEntity f(OrderTypeDiscountEntity orderTypeDiscountEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        OrderTypeDiscountEntity orderTypeDiscountEntity2;
        if (i <= i2 && orderTypeDiscountEntity != null) {
            r89.a<o89> aVar = map.get(orderTypeDiscountEntity);
            if (aVar == null) {
                orderTypeDiscountEntity2 = new OrderTypeDiscountEntity();
                map.put(orderTypeDiscountEntity, new r89.a<>(i, orderTypeDiscountEntity2));
            } else if (i >= aVar.a) {
                return (OrderTypeDiscountEntity) aVar.b;
            } else {
                aVar.a = i;
                orderTypeDiscountEntity2 = (OrderTypeDiscountEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) orderTypeDiscountEntity).a().f();
            orderTypeDiscountEntity2.realmSet$carryout(orderTypeDiscountEntity.realmGet$carryout());
            orderTypeDiscountEntity2.realmSet$restaurant(orderTypeDiscountEntity.realmGet$restaurant());
            orderTypeDiscountEntity2.realmSet$carryoutText(orderTypeDiscountEntity.realmGet$carryoutText());
            orderTypeDiscountEntity2.realmSet$restaurantText(orderTypeDiscountEntity.realmGet$restaurantText());
            orderTypeDiscountEntity2.realmSet$id(orderTypeDiscountEntity.realmGet$id());
            return orderTypeDiscountEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "OrderTypeDiscountEntity", false, 5, 0);
        RealmFieldType realmFieldType = RealmFieldType.INTEGER;
        bVar.b("", "carryout", realmFieldType, false, false, true);
        bVar.b("", "restaurant", realmFieldType, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.STRING;
        bVar.b("", "carryoutText", realmFieldType2, false, false, true);
        bVar.b("", "restaurantText", realmFieldType2, false, false, true);
        bVar.b("", "id", realmFieldType2, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, OrderTypeDiscountEntity orderTypeDiscountEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((orderTypeDiscountEntity instanceof r89) && !n0.isFrozen(orderTypeDiscountEntity)) {
            r89 r89Var = (r89) orderTypeDiscountEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(OrderTypeDiscountEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(OrderTypeDiscountEntity.class);
        long j = aVar.i;
        String realmGet$id = orderTypeDiscountEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(orderTypeDiscountEntity, Long.valueOf(j2));
        Table.nativeSetLong(nativePtr, aVar.e, j2, orderTypeDiscountEntity.realmGet$carryout(), false);
        Table.nativeSetLong(nativePtr, aVar.f, j2, orderTypeDiscountEntity.realmGet$restaurant(), false);
        String realmGet$carryoutText = orderTypeDiscountEntity.realmGet$carryoutText();
        if (realmGet$carryoutText != null) {
            Table.nativeSetString(nativePtr, aVar.g, j2, realmGet$carryoutText, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j2, false);
        }
        String realmGet$restaurantText = orderTypeDiscountEntity.realmGet$restaurantText();
        if (realmGet$restaurantText != null) {
            Table.nativeSetString(nativePtr, aVar.h, j2, realmGet$restaurantText, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, j2, false);
        }
        return j2;
    }

    static com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(OrderTypeDiscountEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy com_dodopizza_persistence_entity_locality_ordertypediscountentityrealmproxy = new com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_locality_ordertypediscountentityrealmproxy;
    }

    static OrderTypeDiscountEntity k(d0 d0Var, a aVar, OrderTypeDiscountEntity orderTypeDiscountEntity, OrderTypeDiscountEntity orderTypeDiscountEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(OrderTypeDiscountEntity.class), set);
        osObjectBuilder.o0(aVar.e, Integer.valueOf(orderTypeDiscountEntity2.realmGet$carryout()));
        osObjectBuilder.o0(aVar.f, Integer.valueOf(orderTypeDiscountEntity2.realmGet$restaurant()));
        osObjectBuilder.E0(aVar.g, orderTypeDiscountEntity2.realmGet$carryoutText());
        osObjectBuilder.E0(aVar.h, orderTypeDiscountEntity2.realmGet$restaurantText());
        osObjectBuilder.E0(aVar.i, orderTypeDiscountEntity2.realmGet$id());
        osObjectBuilder.K0();
        return orderTypeDiscountEntity;
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
        c0<OrderTypeDiscountEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy com_dodopizza_persistence_entity_locality_ordertypediscountentityrealmproxy = (com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_locality_ordertypediscountentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_locality_ordertypediscountentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_locality_ordertypediscountentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity, defpackage.ogc
    public int realmGet$carryout() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity, defpackage.ogc
    public String realmGet$carryoutText() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity, defpackage.ogc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity, defpackage.ogc
    public int realmGet$restaurant() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity, defpackage.ogc
    public String realmGet$restaurantText() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity, defpackage.ogc
    public void realmSet$carryout(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.e, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.e, i);
    }

    @Override // com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity, defpackage.ogc
    public void realmSet$carryoutText(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.g, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'carryoutText' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'carryoutText' to null.");
    }

    @Override // com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity, defpackage.ogc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity, defpackage.ogc
    public void realmSet$restaurant(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.f, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.f, i);
    }

    @Override // com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity, defpackage.ogc
    public void realmSet$restaurantText(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.h, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'restaurantText' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.h, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'restaurantText' to null.");
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("OrderTypeDiscountEntity = proxy[");
        sb.append("{carryout:");
        sb.append(realmGet$carryout());
        sb.append("}");
        sb.append(",");
        sb.append("{restaurant:");
        sb.append(realmGet$restaurant());
        sb.append("}");
        sb.append(",");
        sb.append("{carryoutText:");
        sb.append(realmGet$carryoutText());
        sb.append("}");
        sb.append(",");
        sb.append("{restaurantText:");
        sb.append(realmGet$restaurantText());
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
