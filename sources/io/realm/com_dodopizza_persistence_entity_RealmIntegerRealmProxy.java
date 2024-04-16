package io.realm;

import com.dodopizza.persistence.entity.RealmInteger;
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
public class com_dodopizza_persistence_entity_RealmIntegerRealmProxy extends RealmInteger implements r89, zec {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<RealmInteger> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;

        a(OsSchemaInfo osSchemaInfo) {
            super(1);
            this.e = a("value", "value", osSchemaInfo.b("RealmInteger"));
        }

        @Override // defpackage.sf1
        protected final void b(sf1 sf1Var, sf1 sf1Var2) {
            ((a) sf1Var2).e = ((a) sf1Var).e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_RealmIntegerRealmProxy() {
        this.c.p();
    }

    public static RealmInteger c(d0 d0Var, a aVar, RealmInteger realmInteger, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(realmInteger);
        if (r89Var != null) {
            return (RealmInteger) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(RealmInteger.class), set);
        osObjectBuilder.o0(aVar.e, Integer.valueOf(realmInteger.realmGet$value()));
        com_dodopizza_persistence_entity_RealmIntegerRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(realmInteger, j);
        return j;
    }

    public static RealmInteger d(d0 d0Var, a aVar, RealmInteger realmInteger, boolean z, Map<o89, r89> map, Set<ex4> set) {
        if ((realmInteger instanceof r89) && !n0.isFrozen(realmInteger)) {
            r89 r89Var = (r89) realmInteger;
            if (r89Var.a().f() != null) {
                io.realm.a f = r89Var.a().f();
                if (f.b == d0Var.b) {
                    if (f.getPath().equals(d0Var.getPath())) {
                        return realmInteger;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.k.get();
        r89 r89Var2 = map.get(realmInteger);
        if (r89Var2 != null) {
            return (RealmInteger) r89Var2;
        }
        return c(d0Var, aVar, realmInteger, z, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static RealmInteger f(RealmInteger realmInteger, int i, int i2, Map<o89, r89.a<o89>> map) {
        RealmInteger realmInteger2;
        if (i <= i2 && realmInteger != null) {
            r89.a<o89> aVar = map.get(realmInteger);
            if (aVar == null) {
                realmInteger2 = new RealmInteger();
                map.put(realmInteger, new r89.a<>(i, realmInteger2));
            } else if (i >= aVar.a) {
                return (RealmInteger) aVar.b;
            } else {
                aVar.a = i;
                realmInteger2 = (RealmInteger) aVar.b;
            }
            d0 d0Var = (d0) ((r89) realmInteger).a().f();
            realmInteger2.realmSet$value(realmInteger.realmGet$value());
            return realmInteger2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "RealmInteger", false, 1, 0);
        bVar.b("", "value", RealmFieldType.INTEGER, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, RealmInteger realmInteger, Map<o89, Long> map) {
        if ((realmInteger instanceof r89) && !n0.isFrozen(realmInteger)) {
            r89 r89Var = (r89) realmInteger;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(RealmInteger.class);
        long nativePtr = I0.getNativePtr();
        long createRow = OsObject.createRow(I0);
        map.put(realmInteger, Long.valueOf(createRow));
        Table.nativeSetLong(nativePtr, ((a) d0Var.u().e(RealmInteger.class)).e, createRow, realmInteger.realmGet$value(), false);
        return createRow;
    }

    static com_dodopizza_persistence_entity_RealmIntegerRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(RealmInteger.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_RealmIntegerRealmProxy com_dodopizza_persistence_entity_realmintegerrealmproxy = new com_dodopizza_persistence_entity_RealmIntegerRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_realmintegerrealmproxy;
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
        c0<RealmInteger> c0Var = new c0<>(this);
        this.c = c0Var;
        c0Var.r(cVar.e());
        this.c.s(cVar.f());
        this.c.o(cVar.b());
        this.c.q(cVar.d());
    }

    @Override // com.dodopizza.persistence.entity.RealmInteger, defpackage.zec
    public int realmGet$value() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.RealmInteger, defpackage.zec
    public void realmSet$value(int i) {
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

    public String toString() {
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        return "RealmInteger = proxy[{value:" + realmGet$value() + "}]";
    }
}
