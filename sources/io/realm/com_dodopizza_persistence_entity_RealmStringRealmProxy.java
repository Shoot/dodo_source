package io.realm;

import com.dodopizza.persistence.entity.RealmString;
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
public class com_dodopizza_persistence_entity_RealmStringRealmProxy extends RealmString implements r89, afc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<RealmString> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;

        a(OsSchemaInfo osSchemaInfo) {
            super(1);
            this.e = a("value", "value", osSchemaInfo.b("RealmString"));
        }

        @Override // defpackage.sf1
        protected final void b(sf1 sf1Var, sf1 sf1Var2) {
            ((a) sf1Var2).e = ((a) sf1Var).e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_RealmStringRealmProxy() {
        this.c.p();
    }

    public static RealmString c(d0 d0Var, a aVar, RealmString realmString, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(realmString);
        if (r89Var != null) {
            return (RealmString) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(RealmString.class), set);
        osObjectBuilder.E0(aVar.e, realmString.realmGet$value());
        com_dodopizza_persistence_entity_RealmStringRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(realmString, j);
        return j;
    }

    public static RealmString d(d0 d0Var, a aVar, RealmString realmString, boolean z, Map<o89, r89> map, Set<ex4> set) {
        if ((realmString instanceof r89) && !n0.isFrozen(realmString)) {
            r89 r89Var = (r89) realmString;
            if (r89Var.a().f() != null) {
                io.realm.a f = r89Var.a().f();
                if (f.b == d0Var.b) {
                    if (f.getPath().equals(d0Var.getPath())) {
                        return realmString;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.k.get();
        r89 r89Var2 = map.get(realmString);
        if (r89Var2 != null) {
            return (RealmString) r89Var2;
        }
        return c(d0Var, aVar, realmString, z, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static RealmString f(RealmString realmString, int i, int i2, Map<o89, r89.a<o89>> map) {
        RealmString realmString2;
        if (i <= i2 && realmString != null) {
            r89.a<o89> aVar = map.get(realmString);
            if (aVar == null) {
                realmString2 = new RealmString();
                map.put(realmString, new r89.a<>(i, realmString2));
            } else if (i >= aVar.a) {
                return (RealmString) aVar.b;
            } else {
                aVar.a = i;
                realmString2 = (RealmString) aVar.b;
            }
            d0 d0Var = (d0) ((r89) realmString).a().f();
            realmString2.realmSet$value(realmString.realmGet$value());
            return realmString2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "RealmString", false, 1, 0);
        bVar.b("", "value", RealmFieldType.STRING, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, RealmString realmString, Map<o89, Long> map) {
        if ((realmString instanceof r89) && !n0.isFrozen(realmString)) {
            r89 r89Var = (r89) realmString;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(RealmString.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(RealmString.class);
        long createRow = OsObject.createRow(I0);
        map.put(realmString, Long.valueOf(createRow));
        String realmGet$value = realmString.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, aVar.e, createRow, realmGet$value, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.e, createRow, false);
        }
        return createRow;
    }

    static com_dodopizza_persistence_entity_RealmStringRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(RealmString.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_RealmStringRealmProxy com_dodopizza_persistence_entity_realmstringrealmproxy = new com_dodopizza_persistence_entity_RealmStringRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_realmstringrealmproxy;
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
        c0<RealmString> c0Var = new c0<>(this);
        this.c = c0Var;
        c0Var.r(cVar.e());
        this.c.s(cVar.f());
        this.c.o(cVar.b());
        this.c.q(cVar.d());
    }

    @Override // com.dodopizza.persistence.entity.RealmString, defpackage.afc
    public String realmGet$value() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.RealmString, defpackage.afc
    public void realmSet$value(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.e, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'value' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.e, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'value' to null.");
    }

    public String toString() {
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        return "RealmString = proxy[{value:" + realmGet$value() + "}]";
    }
}
