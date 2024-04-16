package io.realm;

import com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity;
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
public class com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy extends PrizotekaLevelEntity implements r89, ohc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<PrizotekaLevelEntity> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;
        long f;
        long g;
        long h;

        a(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo b = osSchemaInfo.b("PrizotekaLevelEntity");
            this.e = a("minCartValue", "minCartValue", b);
            this.f = a("progressDescription", "progressDescription", b);
            this.g = a("giftDescription", "giftDescription", b);
            this.h = a("id", "id", b);
        }

        @Override // defpackage.sf1
        protected final void b(sf1 sf1Var, sf1 sf1Var2) {
            a aVar = (a) sf1Var;
            a aVar2 = (a) sf1Var2;
            aVar2.e = aVar.e;
            aVar2.f = aVar.f;
            aVar2.g = aVar.g;
            aVar2.h = aVar.h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy() {
        this.c.p();
    }

    public static PrizotekaLevelEntity c(d0 d0Var, a aVar, PrizotekaLevelEntity prizotekaLevelEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(prizotekaLevelEntity);
        if (r89Var != null) {
            return (PrizotekaLevelEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PrizotekaLevelEntity.class), set);
        osObjectBuilder.l0(aVar.e, Double.valueOf(prizotekaLevelEntity.realmGet$minCartValue()));
        osObjectBuilder.E0(aVar.f, prizotekaLevelEntity.realmGet$progressDescription());
        osObjectBuilder.E0(aVar.g, prizotekaLevelEntity.realmGet$giftDescription());
        osObjectBuilder.E0(aVar.h, prizotekaLevelEntity.realmGet$id());
        com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(prizotekaLevelEntity, j);
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy.a r9, com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity r1 = (com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity> r2 = com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity.class
            io.realm.internal.Table r2 = r8.I0(r2)
            long r3 = r9.h
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
            io.realm.com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy$a, com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static PrizotekaLevelEntity f(PrizotekaLevelEntity prizotekaLevelEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        PrizotekaLevelEntity prizotekaLevelEntity2;
        if (i <= i2 && prizotekaLevelEntity != null) {
            r89.a<o89> aVar = map.get(prizotekaLevelEntity);
            if (aVar == null) {
                prizotekaLevelEntity2 = new PrizotekaLevelEntity();
                map.put(prizotekaLevelEntity, new r89.a<>(i, prizotekaLevelEntity2));
            } else if (i >= aVar.a) {
                return (PrizotekaLevelEntity) aVar.b;
            } else {
                aVar.a = i;
                prizotekaLevelEntity2 = (PrizotekaLevelEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) prizotekaLevelEntity).a().f();
            prizotekaLevelEntity2.realmSet$minCartValue(prizotekaLevelEntity.realmGet$minCartValue());
            prizotekaLevelEntity2.realmSet$progressDescription(prizotekaLevelEntity.realmGet$progressDescription());
            prizotekaLevelEntity2.realmSet$giftDescription(prizotekaLevelEntity.realmGet$giftDescription());
            prizotekaLevelEntity2.realmSet$id(prizotekaLevelEntity.realmGet$id());
            return prizotekaLevelEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "PrizotekaLevelEntity", false, 4, 0);
        bVar.b("", "minCartValue", RealmFieldType.DOUBLE, false, false, true);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "progressDescription", realmFieldType, false, false, true);
        bVar.b("", "giftDescription", realmFieldType, false, false, true);
        bVar.b("", "id", realmFieldType, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, PrizotekaLevelEntity prizotekaLevelEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((prizotekaLevelEntity instanceof r89) && !n0.isFrozen(prizotekaLevelEntity)) {
            r89 r89Var = (r89) prizotekaLevelEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(PrizotekaLevelEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(PrizotekaLevelEntity.class);
        long j = aVar.h;
        String realmGet$id = prizotekaLevelEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(prizotekaLevelEntity, Long.valueOf(j2));
        Table.nativeSetDouble(nativePtr, aVar.e, j2, prizotekaLevelEntity.realmGet$minCartValue(), false);
        String realmGet$progressDescription = prizotekaLevelEntity.realmGet$progressDescription();
        if (realmGet$progressDescription != null) {
            Table.nativeSetString(nativePtr, aVar.f, j2, realmGet$progressDescription, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f, j2, false);
        }
        String realmGet$giftDescription = prizotekaLevelEntity.realmGet$giftDescription();
        if (realmGet$giftDescription != null) {
            Table.nativeSetString(nativePtr, aVar.g, j2, realmGet$giftDescription, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j2, false);
        }
        return j2;
    }

    static com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(PrizotekaLevelEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy com_dodopizza_persistence_entity_prizoteka_prizotekalevelentityrealmproxy = new com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_prizoteka_prizotekalevelentityrealmproxy;
    }

    static PrizotekaLevelEntity k(d0 d0Var, a aVar, PrizotekaLevelEntity prizotekaLevelEntity, PrizotekaLevelEntity prizotekaLevelEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PrizotekaLevelEntity.class), set);
        osObjectBuilder.l0(aVar.e, Double.valueOf(prizotekaLevelEntity2.realmGet$minCartValue()));
        osObjectBuilder.E0(aVar.f, prizotekaLevelEntity2.realmGet$progressDescription());
        osObjectBuilder.E0(aVar.g, prizotekaLevelEntity2.realmGet$giftDescription());
        osObjectBuilder.E0(aVar.h, prizotekaLevelEntity2.realmGet$id());
        osObjectBuilder.K0();
        return prizotekaLevelEntity;
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
        c0<PrizotekaLevelEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy com_dodopizza_persistence_entity_prizoteka_prizotekalevelentityrealmproxy = (com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_prizoteka_prizotekalevelentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_prizoteka_prizotekalevelentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_prizoteka_prizotekalevelentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity, defpackage.ohc
    public String realmGet$giftDescription() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity, defpackage.ohc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity, defpackage.ohc
    public double realmGet$minCartValue() {
        this.c.f().c();
        return this.c.g().K(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity, defpackage.ohc
    public String realmGet$progressDescription() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity, defpackage.ohc
    public void realmSet$giftDescription(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.g, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'giftDescription' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'giftDescription' to null.");
    }

    @Override // com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity, defpackage.ohc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity, defpackage.ohc
    public void realmSet$minCartValue(double d2) {
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

    @Override // com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity, defpackage.ohc
    public void realmSet$progressDescription(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.f, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'progressDescription' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'progressDescription' to null.");
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("PrizotekaLevelEntity = proxy[");
        sb.append("{minCartValue:");
        sb.append(realmGet$minCartValue());
        sb.append("}");
        sb.append(",");
        sb.append("{progressDescription:");
        sb.append(realmGet$progressDescription());
        sb.append("}");
        sb.append(",");
        sb.append("{giftDescription:");
        sb.append(realmGet$giftDescription());
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
