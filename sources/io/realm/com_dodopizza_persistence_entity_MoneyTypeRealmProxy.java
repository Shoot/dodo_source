package io.realm;

import com.dodopizza.persistence.entity.MoneyType;
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
public class com_dodopizza_persistence_entity_MoneyTypeRealmProxy extends MoneyType implements r89, vec {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<MoneyType> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;
        long f;
        long g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b = osSchemaInfo.b("MoneyType");
            this.e = a("currency", "currency", b);
            this.f = a("amount", "amount", b);
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
    public com_dodopizza_persistence_entity_MoneyTypeRealmProxy() {
        this.c.p();
    }

    public static MoneyType c(d0 d0Var, a aVar, MoneyType moneyType, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(moneyType);
        if (r89Var != null) {
            return (MoneyType) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(MoneyType.class), set);
        osObjectBuilder.E0(aVar.e, moneyType.realmGet$currency());
        osObjectBuilder.l0(aVar.f, Double.valueOf(moneyType.realmGet$amount()));
        osObjectBuilder.E0(aVar.g, moneyType.realmGet$id());
        com_dodopizza_persistence_entity_MoneyTypeRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(moneyType, j);
        return j;
    }

    public static MoneyType d(d0 d0Var, a aVar, MoneyType moneyType, boolean z, Map<o89, r89> map, Set<ex4> set) {
        if ((moneyType instanceof r89) && !n0.isFrozen(moneyType)) {
            r89 r89Var = (r89) moneyType;
            if (r89Var.a().f() != null) {
                io.realm.a f = r89Var.a().f();
                if (f.b == d0Var.b) {
                    if (f.getPath().equals(d0Var.getPath())) {
                        return moneyType;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.k.get();
        r89 r89Var2 = map.get(moneyType);
        if (r89Var2 != null) {
            return (MoneyType) r89Var2;
        }
        return c(d0Var, aVar, moneyType, z, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static MoneyType f(MoneyType moneyType, int i, int i2, Map<o89, r89.a<o89>> map) {
        MoneyType moneyType2;
        if (i <= i2 && moneyType != null) {
            r89.a<o89> aVar = map.get(moneyType);
            if (aVar == null) {
                moneyType2 = new MoneyType();
                map.put(moneyType, new r89.a<>(i, moneyType2));
            } else if (i >= aVar.a) {
                return (MoneyType) aVar.b;
            } else {
                aVar.a = i;
                moneyType2 = (MoneyType) aVar.b;
            }
            d0 d0Var = (d0) ((r89) moneyType).a().f();
            moneyType2.realmSet$currency(moneyType.realmGet$currency());
            moneyType2.realmSet$amount(moneyType.realmGet$amount());
            moneyType2.realmSet$id(moneyType.realmGet$id());
            return moneyType2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "MoneyType", false, 3, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "currency", realmFieldType, false, false, true);
        bVar.b("", "amount", RealmFieldType.DOUBLE, false, false, true);
        bVar.b("", "id", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, MoneyType moneyType, Map<o89, Long> map) {
        if ((moneyType instanceof r89) && !n0.isFrozen(moneyType)) {
            r89 r89Var = (r89) moneyType;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(MoneyType.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(MoneyType.class);
        long createRow = OsObject.createRow(I0);
        map.put(moneyType, Long.valueOf(createRow));
        String realmGet$currency = moneyType.realmGet$currency();
        if (realmGet$currency != null) {
            Table.nativeSetString(nativePtr, aVar.e, createRow, realmGet$currency, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.e, createRow, false);
        }
        Table.nativeSetDouble(nativePtr, aVar.f, createRow, moneyType.realmGet$amount(), false);
        String realmGet$id = moneyType.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, aVar.g, createRow, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, createRow, false);
        }
        return createRow;
    }

    static com_dodopizza_persistence_entity_MoneyTypeRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(MoneyType.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_MoneyTypeRealmProxy com_dodopizza_persistence_entity_moneytyperealmproxy = new com_dodopizza_persistence_entity_MoneyTypeRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_moneytyperealmproxy;
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
        c0<MoneyType> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_MoneyTypeRealmProxy com_dodopizza_persistence_entity_moneytyperealmproxy = (com_dodopizza_persistence_entity_MoneyTypeRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_moneytyperealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_moneytyperealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_moneytyperealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.MoneyType, defpackage.vec
    public double realmGet$amount() {
        this.c.f().c();
        return this.c.g().K(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.MoneyType, defpackage.vec
    public String realmGet$currency() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.MoneyType, defpackage.vec
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.MoneyType, defpackage.vec
    public void realmSet$amount(double d2) {
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

    @Override // com.dodopizza.persistence.entity.MoneyType, defpackage.vec
    public void realmSet$currency(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.e, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'currency' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.e, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'currency' to null.");
    }

    @Override // com.dodopizza.persistence.entity.MoneyType, defpackage.vec
    public void realmSet$id(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.g, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.g, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.g);
        } else {
            this.c.g().i(this.b.g, str);
        }
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("MoneyType = proxy[");
        sb.append("{currency:");
        sb.append(realmGet$currency());
        sb.append("}");
        sb.append(",");
        sb.append("{amount:");
        sb.append(realmGet$amount());
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
