package io.realm;

import com.dodopizza.persistence.entity.cart.AppliedInfoEntity;
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
public class com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy extends AppliedInfoEntity implements r89, jfc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<AppliedInfoEntity> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;
        long f;
        long g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b = osSchemaInfo.b("AppliedInfoEntity");
            this.e = a("status", "status", b);
            this.f = a("description", "description", b);
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
    public com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy() {
        this.c.p();
    }

    public static AppliedInfoEntity c(d0 d0Var, a aVar, AppliedInfoEntity appliedInfoEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(appliedInfoEntity);
        if (r89Var != null) {
            return (AppliedInfoEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(AppliedInfoEntity.class), set);
        osObjectBuilder.o0(aVar.e, Integer.valueOf(appliedInfoEntity.realmGet$status()));
        osObjectBuilder.E0(aVar.f, appliedInfoEntity.realmGet$description());
        osObjectBuilder.E0(aVar.g, appliedInfoEntity.realmGet$id());
        com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(appliedInfoEntity, j);
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dodopizza.persistence.entity.cart.AppliedInfoEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy.a r9, com.dodopizza.persistence.entity.cart.AppliedInfoEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.cart.AppliedInfoEntity r1 = (com.dodopizza.persistence.entity.cart.AppliedInfoEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.cart.AppliedInfoEntity> r2 = com.dodopizza.persistence.entity.cart.AppliedInfoEntity.class
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
            io.realm.com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.cart.AppliedInfoEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.cart.AppliedInfoEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy$a, com.dodopizza.persistence.entity.cart.AppliedInfoEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.cart.AppliedInfoEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static AppliedInfoEntity f(AppliedInfoEntity appliedInfoEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        AppliedInfoEntity appliedInfoEntity2;
        if (i <= i2 && appliedInfoEntity != null) {
            r89.a<o89> aVar = map.get(appliedInfoEntity);
            if (aVar == null) {
                appliedInfoEntity2 = new AppliedInfoEntity();
                map.put(appliedInfoEntity, new r89.a<>(i, appliedInfoEntity2));
            } else if (i >= aVar.a) {
                return (AppliedInfoEntity) aVar.b;
            } else {
                aVar.a = i;
                appliedInfoEntity2 = (AppliedInfoEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) appliedInfoEntity).a().f();
            appliedInfoEntity2.realmSet$status(appliedInfoEntity.realmGet$status());
            appliedInfoEntity2.realmSet$description(appliedInfoEntity.realmGet$description());
            appliedInfoEntity2.realmSet$id(appliedInfoEntity.realmGet$id());
            return appliedInfoEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "AppliedInfoEntity", false, 3, 0);
        bVar.b("", "status", RealmFieldType.INTEGER, false, false, true);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "description", realmFieldType, false, false, false);
        bVar.b("", "id", realmFieldType, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, AppliedInfoEntity appliedInfoEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((appliedInfoEntity instanceof r89) && !n0.isFrozen(appliedInfoEntity)) {
            r89 r89Var = (r89) appliedInfoEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(AppliedInfoEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(AppliedInfoEntity.class);
        long j = aVar.g;
        String realmGet$id = appliedInfoEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(appliedInfoEntity, Long.valueOf(j2));
        Table.nativeSetLong(nativePtr, aVar.e, j2, appliedInfoEntity.realmGet$status(), false);
        String realmGet$description = appliedInfoEntity.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, aVar.f, j2, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f, j2, false);
        }
        return j2;
    }

    static com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(AppliedInfoEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy com_dodopizza_persistence_entity_cart_appliedinfoentityrealmproxy = new com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_cart_appliedinfoentityrealmproxy;
    }

    static AppliedInfoEntity k(d0 d0Var, a aVar, AppliedInfoEntity appliedInfoEntity, AppliedInfoEntity appliedInfoEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(AppliedInfoEntity.class), set);
        osObjectBuilder.o0(aVar.e, Integer.valueOf(appliedInfoEntity2.realmGet$status()));
        osObjectBuilder.E0(aVar.f, appliedInfoEntity2.realmGet$description());
        osObjectBuilder.E0(aVar.g, appliedInfoEntity2.realmGet$id());
        osObjectBuilder.K0();
        return appliedInfoEntity;
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
        c0<AppliedInfoEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy com_dodopizza_persistence_entity_cart_appliedinfoentityrealmproxy = (com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_cart_appliedinfoentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_cart_appliedinfoentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_cart_appliedinfoentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.cart.AppliedInfoEntity, defpackage.jfc
    public String realmGet$description() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.cart.AppliedInfoEntity, defpackage.jfc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.cart.AppliedInfoEntity, defpackage.jfc
    public int realmGet$status() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.cart.AppliedInfoEntity, defpackage.jfc
    public void realmSet$description(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.f, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.f, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.f);
        } else {
            this.c.g().i(this.b.f, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.AppliedInfoEntity, defpackage.jfc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.cart.AppliedInfoEntity, defpackage.jfc
    public void realmSet$status(int i) {
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
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("AppliedInfoEntity = proxy[");
        sb.append("{status:");
        sb.append(realmGet$status());
        sb.append("}");
        sb.append(",");
        sb.append("{description:");
        String str2 = "null";
        if (realmGet$description() == null) {
            str = "null";
        } else {
            str = realmGet$description();
        }
        sb.append(str);
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
