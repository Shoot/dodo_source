package io.realm;

import com.dodopizza.persistence.entity.cart.CartProductEntity;
import com.dodopizza.persistence.entity.cart.PizzaHalvesEntity;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy;
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
public class com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy extends PizzaHalvesEntity implements r89, vfc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<PizzaHalvesEntity> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;
        long f;
        long g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b = osSchemaInfo.b("PizzaHalvesEntity");
            this.e = a(ElementGenerator.TEXT_ALIGN_LEFT, ElementGenerator.TEXT_ALIGN_LEFT, b);
            this.f = a(ElementGenerator.TEXT_ALIGN_RIGHT, ElementGenerator.TEXT_ALIGN_RIGHT, b);
            this.g = a("id", "id", b);
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
    public com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy() {
        this.c.p();
    }

    public static PizzaHalvesEntity c(d0 d0Var, a aVar, PizzaHalvesEntity pizzaHalvesEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(pizzaHalvesEntity);
        if (r89Var != null) {
            return (PizzaHalvesEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PizzaHalvesEntity.class), set);
        osObjectBuilder.E0(aVar.g, pizzaHalvesEntity.realmGet$id());
        com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(pizzaHalvesEntity, j);
        CartProductEntity realmGet$left = pizzaHalvesEntity.realmGet$left();
        if (realmGet$left == null) {
            j.realmSet$left(null);
        } else {
            CartProductEntity cartProductEntity = (CartProductEntity) map.get(realmGet$left);
            if (cartProductEntity != null) {
                j.realmSet$left(cartProductEntity);
            } else {
                j.realmSet$left(com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.a) d0Var.u().e(CartProductEntity.class), realmGet$left, z, map, set));
            }
        }
        CartProductEntity realmGet$right = pizzaHalvesEntity.realmGet$right();
        if (realmGet$right == null) {
            j.realmSet$right(null);
        } else {
            CartProductEntity cartProductEntity2 = (CartProductEntity) map.get(realmGet$right);
            if (cartProductEntity2 != null) {
                j.realmSet$right(cartProductEntity2);
            } else {
                j.realmSet$right(com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.a) d0Var.u().e(CartProductEntity.class), realmGet$right, z, map, set));
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
    public static com.dodopizza.persistence.entity.cart.PizzaHalvesEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy.a r9, com.dodopizza.persistence.entity.cart.PizzaHalvesEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.cart.PizzaHalvesEntity r1 = (com.dodopizza.persistence.entity.cart.PizzaHalvesEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.cart.PizzaHalvesEntity> r2 = com.dodopizza.persistence.entity.cart.PizzaHalvesEntity.class
            io.realm.internal.Table r2 = r8.I0(r2)
            long r3 = r9.g
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
            io.realm.com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.cart.PizzaHalvesEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.cart.PizzaHalvesEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy$a, com.dodopizza.persistence.entity.cart.PizzaHalvesEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.cart.PizzaHalvesEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static PizzaHalvesEntity f(PizzaHalvesEntity pizzaHalvesEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        PizzaHalvesEntity pizzaHalvesEntity2;
        if (i <= i2 && pizzaHalvesEntity != null) {
            r89.a<o89> aVar = map.get(pizzaHalvesEntity);
            if (aVar == null) {
                pizzaHalvesEntity2 = new PizzaHalvesEntity();
                map.put(pizzaHalvesEntity, new r89.a<>(i, pizzaHalvesEntity2));
            } else if (i >= aVar.a) {
                return (PizzaHalvesEntity) aVar.b;
            } else {
                aVar.a = i;
                pizzaHalvesEntity2 = (PizzaHalvesEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) pizzaHalvesEntity).a().f();
            int i3 = i + 1;
            pizzaHalvesEntity2.realmSet$left(com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.f(pizzaHalvesEntity.realmGet$left(), i3, i2, map));
            pizzaHalvesEntity2.realmSet$right(com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.f(pizzaHalvesEntity.realmGet$right(), i3, i2, map));
            pizzaHalvesEntity2.realmSet$id(pizzaHalvesEntity.realmGet$id());
            return pizzaHalvesEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "PizzaHalvesEntity", false, 3, 0);
        RealmFieldType realmFieldType = RealmFieldType.OBJECT;
        bVar.a("", ElementGenerator.TEXT_ALIGN_LEFT, realmFieldType, "CartProductEntity");
        bVar.a("", ElementGenerator.TEXT_ALIGN_RIGHT, realmFieldType, "CartProductEntity");
        bVar.b("", "id", RealmFieldType.STRING, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, PizzaHalvesEntity pizzaHalvesEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((pizzaHalvesEntity instanceof r89) && !n0.isFrozen(pizzaHalvesEntity)) {
            r89 r89Var = (r89) pizzaHalvesEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(PizzaHalvesEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(PizzaHalvesEntity.class);
        long j = aVar.g;
        String realmGet$id = pizzaHalvesEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(pizzaHalvesEntity, Long.valueOf(j2));
        CartProductEntity realmGet$left = pizzaHalvesEntity.realmGet$left();
        if (realmGet$left != null) {
            Long l = map.get(realmGet$left);
            if (l == null) {
                l = Long.valueOf(com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.i(d0Var, realmGet$left, map));
            }
            Table.nativeSetLink(nativePtr, aVar.e, j2, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.e, j2);
        }
        CartProductEntity realmGet$right = pizzaHalvesEntity.realmGet$right();
        if (realmGet$right != null) {
            Long l2 = map.get(realmGet$right);
            if (l2 == null) {
                l2 = Long.valueOf(com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.i(d0Var, realmGet$right, map));
            }
            Table.nativeSetLink(nativePtr, aVar.f, j2, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f, j2);
        }
        return j2;
    }

    static com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(PizzaHalvesEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy com_dodopizza_persistence_entity_cart_pizzahalvesentityrealmproxy = new com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_cart_pizzahalvesentityrealmproxy;
    }

    static PizzaHalvesEntity k(d0 d0Var, a aVar, PizzaHalvesEntity pizzaHalvesEntity, PizzaHalvesEntity pizzaHalvesEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PizzaHalvesEntity.class), set);
        CartProductEntity realmGet$left = pizzaHalvesEntity2.realmGet$left();
        if (realmGet$left == null) {
            osObjectBuilder.r0(aVar.e);
        } else {
            CartProductEntity cartProductEntity = (CartProductEntity) map.get(realmGet$left);
            if (cartProductEntity != null) {
                osObjectBuilder.x0(aVar.e, cartProductEntity);
            } else {
                osObjectBuilder.x0(aVar.e, com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.a) d0Var.u().e(CartProductEntity.class), realmGet$left, true, map, set));
            }
        }
        CartProductEntity realmGet$right = pizzaHalvesEntity2.realmGet$right();
        if (realmGet$right == null) {
            osObjectBuilder.r0(aVar.f);
        } else {
            CartProductEntity cartProductEntity2 = (CartProductEntity) map.get(realmGet$right);
            if (cartProductEntity2 != null) {
                osObjectBuilder.x0(aVar.f, cartProductEntity2);
            } else {
                osObjectBuilder.x0(aVar.f, com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.a) d0Var.u().e(CartProductEntity.class), realmGet$right, true, map, set));
            }
        }
        osObjectBuilder.E0(aVar.g, pizzaHalvesEntity2.realmGet$id());
        osObjectBuilder.K0();
        return pizzaHalvesEntity;
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
        c0<PizzaHalvesEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy com_dodopizza_persistence_entity_cart_pizzahalvesentityrealmproxy = (com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_cart_pizzahalvesentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_cart_pizzahalvesentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_cart_pizzahalvesentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.cart.PizzaHalvesEntity, defpackage.vfc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.cart.PizzaHalvesEntity, defpackage.vfc
    public CartProductEntity realmGet$left() {
        this.c.f().c();
        if (this.c.g().o0(this.b.e)) {
            return null;
        }
        return (CartProductEntity) this.c.f().o(CartProductEntity.class, this.c.g().L(this.b.e), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.PizzaHalvesEntity, defpackage.vfc
    public CartProductEntity realmGet$right() {
        this.c.f().c();
        if (this.c.g().o0(this.b.f)) {
            return null;
        }
        return (CartProductEntity) this.c.f().o(CartProductEntity.class, this.c.g().L(this.b.f), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.PizzaHalvesEntity, defpackage.vfc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.cart.PizzaHalvesEntity, defpackage.vfc
    public void realmSet$left(CartProductEntity cartProductEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains(ElementGenerator.TEXT_ALIGN_LEFT)) {
                return;
            }
            if (cartProductEntity != null && !n0.isManaged(cartProductEntity)) {
                cartProductEntity = (CartProductEntity) d0Var.j0(cartProductEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (cartProductEntity == null) {
                g.l0(this.b.e);
                return;
            }
            this.c.c(cartProductEntity);
            g.o().B(this.b.e, g.E0(), ((r89) cartProductEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (cartProductEntity == null) {
            this.c.g().l0(this.b.e);
            return;
        }
        this.c.c(cartProductEntity);
        this.c.g().s(this.b.e, ((r89) cartProductEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.PizzaHalvesEntity, defpackage.vfc
    public void realmSet$right(CartProductEntity cartProductEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains(ElementGenerator.TEXT_ALIGN_RIGHT)) {
                return;
            }
            if (cartProductEntity != null && !n0.isManaged(cartProductEntity)) {
                cartProductEntity = (CartProductEntity) d0Var.j0(cartProductEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (cartProductEntity == null) {
                g.l0(this.b.f);
                return;
            }
            this.c.c(cartProductEntity);
            g.o().B(this.b.f, g.E0(), ((r89) cartProductEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (cartProductEntity == null) {
            this.c.g().l0(this.b.f);
            return;
        }
        this.c.c(cartProductEntity);
        this.c.g().s(this.b.f, ((r89) cartProductEntity).a().g().E0());
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("PizzaHalvesEntity = proxy[");
        sb.append("{left:");
        String str2 = "CartProductEntity";
        String str3 = "null";
        if (realmGet$left() != null) {
            str = "CartProductEntity";
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{right:");
        if (realmGet$right() == null) {
            str2 = "null";
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
