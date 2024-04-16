package io.realm;

import com.dodopizza.persistence.entity.cart.PriceEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
public class com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy extends PriceEntity implements r89, wfc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<PriceEntity> c;

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

        a(OsSchemaInfo osSchemaInfo) {
            super(10);
            OsObjectSchemaInfo b = osSchemaInfo.b("PriceEntity");
            this.e = a("total", "total", b);
            this.f = a("subtotal", "subtotal", b);
            this.g = a("rawPrice", "rawPrice", b);
            this.h = a("rawPriceWithoutGoods", "rawPriceWithoutGoods", b);
            this.i = a("minOrderPriceForDelivery", "minOrderPriceForDelivery", b);
            this.j = a("sauces", "sauces", b);
            this.k = a("dodoRubles", "dodoRubles", b);
            this.l = a("totalDiscount", "totalDiscount", b);
            this.m = a("deliveryFee", "deliveryFee", b);
            this.n = a("loyaltyRewardSum", "loyaltyRewardSum", b);
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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy() {
        this.c.p();
    }

    public static PriceEntity c(d0 d0Var, a aVar, PriceEntity priceEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(priceEntity);
        if (r89Var != null) {
            return (PriceEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PriceEntity.class), set);
        osObjectBuilder.l0(aVar.e, Double.valueOf(priceEntity.realmGet$total()));
        osObjectBuilder.l0(aVar.f, Double.valueOf(priceEntity.realmGet$subtotal()));
        osObjectBuilder.l0(aVar.g, Double.valueOf(priceEntity.realmGet$rawPrice()));
        osObjectBuilder.l0(aVar.h, Double.valueOf(priceEntity.realmGet$rawPriceWithoutGoods()));
        osObjectBuilder.l0(aVar.i, Double.valueOf(priceEntity.realmGet$minOrderPriceForDelivery()));
        osObjectBuilder.l0(aVar.j, Double.valueOf(priceEntity.realmGet$sauces()));
        osObjectBuilder.l0(aVar.k, Double.valueOf(priceEntity.realmGet$dodoRubles()));
        osObjectBuilder.l0(aVar.l, Double.valueOf(priceEntity.realmGet$totalDiscount()));
        osObjectBuilder.l0(aVar.m, Double.valueOf(priceEntity.realmGet$deliveryFee()));
        osObjectBuilder.l0(aVar.n, Double.valueOf(priceEntity.realmGet$loyaltyRewardSum()));
        com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(priceEntity, j);
        return j;
    }

    public static PriceEntity d(d0 d0Var, a aVar, PriceEntity priceEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        if ((priceEntity instanceof r89) && !n0.isFrozen(priceEntity)) {
            r89 r89Var = (r89) priceEntity;
            if (r89Var.a().f() != null) {
                io.realm.a f = r89Var.a().f();
                if (f.b == d0Var.b) {
                    if (f.getPath().equals(d0Var.getPath())) {
                        return priceEntity;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.k.get();
        r89 r89Var2 = map.get(priceEntity);
        if (r89Var2 != null) {
            return (PriceEntity) r89Var2;
        }
        return c(d0Var, aVar, priceEntity, z, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static PriceEntity f(PriceEntity priceEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        PriceEntity priceEntity2;
        if (i <= i2 && priceEntity != null) {
            r89.a<o89> aVar = map.get(priceEntity);
            if (aVar == null) {
                priceEntity2 = new PriceEntity();
                map.put(priceEntity, new r89.a<>(i, priceEntity2));
            } else if (i >= aVar.a) {
                return (PriceEntity) aVar.b;
            } else {
                aVar.a = i;
                priceEntity2 = (PriceEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) priceEntity).a().f();
            priceEntity2.realmSet$total(priceEntity.realmGet$total());
            priceEntity2.realmSet$subtotal(priceEntity.realmGet$subtotal());
            priceEntity2.realmSet$rawPrice(priceEntity.realmGet$rawPrice());
            priceEntity2.realmSet$rawPriceWithoutGoods(priceEntity.realmGet$rawPriceWithoutGoods());
            priceEntity2.realmSet$minOrderPriceForDelivery(priceEntity.realmGet$minOrderPriceForDelivery());
            priceEntity2.realmSet$sauces(priceEntity.realmGet$sauces());
            priceEntity2.realmSet$dodoRubles(priceEntity.realmGet$dodoRubles());
            priceEntity2.realmSet$totalDiscount(priceEntity.realmGet$totalDiscount());
            priceEntity2.realmSet$deliveryFee(priceEntity.realmGet$deliveryFee());
            priceEntity2.realmSet$loyaltyRewardSum(priceEntity.realmGet$loyaltyRewardSum());
            return priceEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "PriceEntity", false, 10, 0);
        RealmFieldType realmFieldType = RealmFieldType.DOUBLE;
        bVar.b("", "total", realmFieldType, false, false, true);
        bVar.b("", "subtotal", realmFieldType, false, false, true);
        bVar.b("", "rawPrice", realmFieldType, false, false, true);
        bVar.b("", "rawPriceWithoutGoods", realmFieldType, false, false, true);
        bVar.b("", "minOrderPriceForDelivery", realmFieldType, false, false, true);
        bVar.b("", "sauces", realmFieldType, false, false, true);
        bVar.b("", "dodoRubles", realmFieldType, false, false, true);
        bVar.b("", "totalDiscount", realmFieldType, false, false, true);
        bVar.b("", "deliveryFee", realmFieldType, false, false, true);
        bVar.b("", "loyaltyRewardSum", realmFieldType, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, PriceEntity priceEntity, Map<o89, Long> map) {
        if ((priceEntity instanceof r89) && !n0.isFrozen(priceEntity)) {
            r89 r89Var = (r89) priceEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(PriceEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(PriceEntity.class);
        long createRow = OsObject.createRow(I0);
        map.put(priceEntity, Long.valueOf(createRow));
        Table.nativeSetDouble(nativePtr, aVar.e, createRow, priceEntity.realmGet$total(), false);
        Table.nativeSetDouble(nativePtr, aVar.f, createRow, priceEntity.realmGet$subtotal(), false);
        Table.nativeSetDouble(nativePtr, aVar.g, createRow, priceEntity.realmGet$rawPrice(), false);
        Table.nativeSetDouble(nativePtr, aVar.h, createRow, priceEntity.realmGet$rawPriceWithoutGoods(), false);
        Table.nativeSetDouble(nativePtr, aVar.i, createRow, priceEntity.realmGet$minOrderPriceForDelivery(), false);
        Table.nativeSetDouble(nativePtr, aVar.j, createRow, priceEntity.realmGet$sauces(), false);
        Table.nativeSetDouble(nativePtr, aVar.k, createRow, priceEntity.realmGet$dodoRubles(), false);
        Table.nativeSetDouble(nativePtr, aVar.l, createRow, priceEntity.realmGet$totalDiscount(), false);
        Table.nativeSetDouble(nativePtr, aVar.m, createRow, priceEntity.realmGet$deliveryFee(), false);
        Table.nativeSetDouble(nativePtr, aVar.n, createRow, priceEntity.realmGet$loyaltyRewardSum(), false);
        return createRow;
    }

    static com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(PriceEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy com_dodopizza_persistence_entity_cart_priceentityrealmproxy = new com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_cart_priceentityrealmproxy;
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
        c0<PriceEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy com_dodopizza_persistence_entity_cart_priceentityrealmproxy = (com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_cart_priceentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_cart_priceentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_cart_priceentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public double realmGet$deliveryFee() {
        this.c.f().c();
        return this.c.g().K(this.b.m);
    }

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public double realmGet$dodoRubles() {
        this.c.f().c();
        return this.c.g().K(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public double realmGet$loyaltyRewardSum() {
        this.c.f().c();
        return this.c.g().K(this.b.n);
    }

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public double realmGet$minOrderPriceForDelivery() {
        this.c.f().c();
        return this.c.g().K(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public double realmGet$rawPrice() {
        this.c.f().c();
        return this.c.g().K(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public double realmGet$rawPriceWithoutGoods() {
        this.c.f().c();
        return this.c.g().K(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public double realmGet$sauces() {
        this.c.f().c();
        return this.c.g().K(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public double realmGet$subtotal() {
        this.c.f().c();
        return this.c.g().K(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public double realmGet$total() {
        this.c.f().c();
        return this.c.g().K(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public double realmGet$totalDiscount() {
        this.c.f().c();
        return this.c.g().K(this.b.l);
    }

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public void realmSet$deliveryFee(double d2) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.m, g.E0(), d2, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.m, d2);
    }

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public void realmSet$dodoRubles(double d2) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.k, g.E0(), d2, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.k, d2);
    }

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public void realmSet$loyaltyRewardSum(double d2) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.n, g.E0(), d2, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.n, d2);
    }

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public void realmSet$minOrderPriceForDelivery(double d2) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.i, g.E0(), d2, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.i, d2);
    }

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public void realmSet$rawPrice(double d2) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.g, g.E0(), d2, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.g, d2);
    }

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public void realmSet$rawPriceWithoutGoods(double d2) {
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

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public void realmSet$sauces(double d2) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.j, g.E0(), d2, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.j, d2);
    }

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public void realmSet$subtotal(double d2) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.f, g.E0(), d2, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.f, d2);
    }

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public void realmSet$total(double d2) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.e, g.E0(), d2, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.e, d2);
    }

    @Override // com.dodopizza.persistence.entity.cart.PriceEntity, defpackage.wfc
    public void realmSet$totalDiscount(double d2) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.l, g.E0(), d2, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.l, d2);
    }

    public String toString() {
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        return "PriceEntity = proxy[{total:" + realmGet$total() + "},{subtotal:" + realmGet$subtotal() + "},{rawPrice:" + realmGet$rawPrice() + "},{rawPriceWithoutGoods:" + realmGet$rawPriceWithoutGoods() + "},{minOrderPriceForDelivery:" + realmGet$minOrderPriceForDelivery() + "},{sauces:" + realmGet$sauces() + "},{dodoRubles:" + realmGet$dodoRubles() + "},{totalDiscount:" + realmGet$totalDiscount() + "},{deliveryFee:" + realmGet$deliveryFee() + "},{loyaltyRewardSum:" + realmGet$loyaltyRewardSum() + "}]";
    }
}
