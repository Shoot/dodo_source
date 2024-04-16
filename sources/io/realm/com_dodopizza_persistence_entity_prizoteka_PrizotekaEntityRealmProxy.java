package io.realm;

import com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity;
import com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy;
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
public class com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy extends PrizotekaEntity implements r89, nhc {
    private static final OsObjectSchemaInfo e = g();
    private a b;
    private c0<PrizotekaEntity> c;
    private k0<PrizotekaLevelEntity> d;

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
            OsObjectSchemaInfo b = osSchemaInfo.b("PrizotekaEntity");
            this.e = a("title", "title", b);
            this.f = a("subtitle", "subtitle", b);
            this.g = a("legalDocumentUrl", "legalDocumentUrl", b);
            this.h = a("levels", "levels", b);
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
    public com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy() {
        this.c.p();
    }

    public static PrizotekaEntity c(d0 d0Var, a aVar, PrizotekaEntity prizotekaEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(prizotekaEntity);
        if (r89Var != null) {
            return (PrizotekaEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PrizotekaEntity.class), set);
        osObjectBuilder.E0(aVar.e, prizotekaEntity.realmGet$title());
        osObjectBuilder.E0(aVar.f, prizotekaEntity.realmGet$subtitle());
        osObjectBuilder.E0(aVar.g, prizotekaEntity.realmGet$legalDocumentUrl());
        osObjectBuilder.E0(aVar.i, prizotekaEntity.realmGet$id());
        com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(prizotekaEntity, j);
        k0<PrizotekaLevelEntity> realmGet$levels = prizotekaEntity.realmGet$levels();
        if (realmGet$levels != null) {
            k0<PrizotekaLevelEntity> realmGet$levels2 = j.realmGet$levels();
            realmGet$levels2.clear();
            for (int i = 0; i < realmGet$levels.size(); i++) {
                PrizotekaLevelEntity prizotekaLevelEntity = realmGet$levels.get(i);
                PrizotekaLevelEntity prizotekaLevelEntity2 = (PrizotekaLevelEntity) map.get(prizotekaLevelEntity);
                if (prizotekaLevelEntity2 != null) {
                    realmGet$levels2.add(prizotekaLevelEntity2);
                } else {
                    realmGet$levels2.add(com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy.a) d0Var.u().e(PrizotekaLevelEntity.class), prizotekaLevelEntity, z, map, set));
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
    public static com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy.a r9, com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity r1 = (com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity> r2 = com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity.class
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
            io.realm.com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy$a, com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static PrizotekaEntity f(PrizotekaEntity prizotekaEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        PrizotekaEntity prizotekaEntity2;
        if (i > i2 || prizotekaEntity == null) {
            return null;
        }
        r89.a<o89> aVar = map.get(prizotekaEntity);
        if (aVar == null) {
            prizotekaEntity2 = new PrizotekaEntity();
            map.put(prizotekaEntity, new r89.a<>(i, prizotekaEntity2));
        } else if (i >= aVar.a) {
            return (PrizotekaEntity) aVar.b;
        } else {
            aVar.a = i;
            prizotekaEntity2 = (PrizotekaEntity) aVar.b;
        }
        d0 d0Var = (d0) ((r89) prizotekaEntity).a().f();
        prizotekaEntity2.realmSet$title(prizotekaEntity.realmGet$title());
        prizotekaEntity2.realmSet$subtitle(prizotekaEntity.realmGet$subtitle());
        prizotekaEntity2.realmSet$legalDocumentUrl(prizotekaEntity.realmGet$legalDocumentUrl());
        if (i == i2) {
            prizotekaEntity2.realmSet$levels(null);
        } else {
            k0<PrizotekaLevelEntity> realmGet$levels = prizotekaEntity.realmGet$levels();
            k0<PrizotekaLevelEntity> k0Var = new k0<>();
            prizotekaEntity2.realmSet$levels(k0Var);
            int i3 = i + 1;
            int size = realmGet$levels.size();
            for (int i4 = 0; i4 < size; i4++) {
                k0Var.add(com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy.f(realmGet$levels.get(i4), i3, i2, map));
            }
        }
        prizotekaEntity2.realmSet$id(prizotekaEntity.realmGet$id());
        return prizotekaEntity2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "PrizotekaEntity", false, 5, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "title", realmFieldType, false, false, true);
        bVar.b("", "subtitle", realmFieldType, false, false, true);
        bVar.b("", "legalDocumentUrl", realmFieldType, false, false, true);
        bVar.a("", "levels", RealmFieldType.LIST, "PrizotekaLevelEntity");
        bVar.b("", "id", realmFieldType, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return e;
    }

    public static long i(d0 d0Var, PrizotekaEntity prizotekaEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        long j;
        if ((prizotekaEntity instanceof r89) && !n0.isFrozen(prizotekaEntity)) {
            r89 r89Var = (r89) prizotekaEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(PrizotekaEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(PrizotekaEntity.class);
        long j2 = aVar.i;
        String realmGet$id = prizotekaEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j2, realmGet$id);
        }
        long j3 = nativeFindFirstString;
        map.put(prizotekaEntity, Long.valueOf(j3));
        String realmGet$title = prizotekaEntity.realmGet$title();
        if (realmGet$title != null) {
            j = j3;
            Table.nativeSetString(nativePtr, aVar.e, j3, realmGet$title, false);
        } else {
            j = j3;
            Table.nativeSetNull(nativePtr, aVar.e, j, false);
        }
        String realmGet$subtitle = prizotekaEntity.realmGet$subtitle();
        if (realmGet$subtitle != null) {
            Table.nativeSetString(nativePtr, aVar.f, j, realmGet$subtitle, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f, j, false);
        }
        String realmGet$legalDocumentUrl = prizotekaEntity.realmGet$legalDocumentUrl();
        if (realmGet$legalDocumentUrl != null) {
            Table.nativeSetString(nativePtr, aVar.g, j, realmGet$legalDocumentUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j, false);
        }
        long j4 = j;
        OsList osList = new OsList(I0.r(j4), aVar.h);
        k0<PrizotekaLevelEntity> realmGet$levels = prizotekaEntity.realmGet$levels();
        if (realmGet$levels != null && realmGet$levels.size() == osList.X()) {
            int size = realmGet$levels.size();
            for (int i = 0; i < size; i++) {
                PrizotekaLevelEntity prizotekaLevelEntity = realmGet$levels.get(i);
                Long l = map.get(prizotekaLevelEntity);
                if (l == null) {
                    l = Long.valueOf(com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy.i(d0Var, prizotekaLevelEntity, map));
                }
                osList.U(i, l.longValue());
            }
        } else {
            osList.J();
            if (realmGet$levels != null) {
                Iterator<PrizotekaLevelEntity> it = realmGet$levels.iterator();
                while (it.hasNext()) {
                    PrizotekaLevelEntity next = it.next();
                    Long l2 = map.get(next);
                    if (l2 == null) {
                        l2 = Long.valueOf(com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy.i(d0Var, next, map));
                    }
                    osList.k(l2.longValue());
                }
            }
        }
        return j4;
    }

    static com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(PrizotekaEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy com_dodopizza_persistence_entity_prizoteka_prizotekaentityrealmproxy = new com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_prizoteka_prizotekaentityrealmproxy;
    }

    static PrizotekaEntity k(d0 d0Var, a aVar, PrizotekaEntity prizotekaEntity, PrizotekaEntity prizotekaEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PrizotekaEntity.class), set);
        osObjectBuilder.E0(aVar.e, prizotekaEntity2.realmGet$title());
        osObjectBuilder.E0(aVar.f, prizotekaEntity2.realmGet$subtitle());
        osObjectBuilder.E0(aVar.g, prizotekaEntity2.realmGet$legalDocumentUrl());
        k0<PrizotekaLevelEntity> realmGet$levels = prizotekaEntity2.realmGet$levels();
        if (realmGet$levels != null) {
            k0 k0Var = new k0();
            for (int i = 0; i < realmGet$levels.size(); i++) {
                PrizotekaLevelEntity prizotekaLevelEntity = realmGet$levels.get(i);
                PrizotekaLevelEntity prizotekaLevelEntity2 = (PrizotekaLevelEntity) map.get(prizotekaLevelEntity);
                if (prizotekaLevelEntity2 != null) {
                    k0Var.add(prizotekaLevelEntity2);
                } else {
                    k0Var.add(com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy.a) d0Var.u().e(PrizotekaLevelEntity.class), prizotekaLevelEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.h, k0Var);
        } else {
            osObjectBuilder.z0(aVar.h, new k0());
        }
        osObjectBuilder.E0(aVar.i, prizotekaEntity2.realmGet$id());
        osObjectBuilder.K0();
        return prizotekaEntity;
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
        c0<PrizotekaEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy com_dodopizza_persistence_entity_prizoteka_prizotekaentityrealmproxy = (com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_prizoteka_prizotekaentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_prizoteka_prizotekaentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_prizoteka_prizotekaentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity, defpackage.nhc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity, defpackage.nhc
    public String realmGet$legalDocumentUrl() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity, defpackage.nhc
    public k0<PrizotekaLevelEntity> realmGet$levels() {
        this.c.f().c();
        k0<PrizotekaLevelEntity> k0Var = this.d;
        if (k0Var != null) {
            return k0Var;
        }
        k0<PrizotekaLevelEntity> k0Var2 = new k0<>(PrizotekaLevelEntity.class, this.c.g().f0(this.b.h), this.c.f());
        this.d = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity, defpackage.nhc
    public String realmGet$subtitle() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity, defpackage.nhc
    public String realmGet$title() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity, defpackage.nhc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity, defpackage.nhc
    public void realmSet$legalDocumentUrl(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.g, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'legalDocumentUrl' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'legalDocumentUrl' to null.");
    }

    @Override // com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity, defpackage.nhc
    public void realmSet$levels(k0<PrizotekaLevelEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("levels")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<PrizotekaLevelEntity> k0Var2 = new k0<>();
                Iterator<PrizotekaLevelEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    PrizotekaLevelEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((PrizotekaLevelEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.h);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i < size) {
                PrizotekaLevelEntity prizotekaLevelEntity = k0Var.get(i);
                this.c.c(prizotekaLevelEntity);
                f0.U(i, ((r89) prizotekaLevelEntity).a().g().E0());
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
            PrizotekaLevelEntity prizotekaLevelEntity2 = k0Var.get(i);
            this.c.c(prizotekaLevelEntity2);
            f0.k(((r89) prizotekaLevelEntity2).a().g().E0());
            i++;
        }
    }

    @Override // com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity, defpackage.nhc
    public void realmSet$subtitle(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.f, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'subtitle' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'subtitle' to null.");
    }

    @Override // com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity, defpackage.nhc
    public void realmSet$title(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.e, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.e, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("PrizotekaEntity = proxy[");
        sb.append("{title:");
        sb.append(realmGet$title());
        sb.append("}");
        sb.append(",");
        sb.append("{subtitle:");
        sb.append(realmGet$subtitle());
        sb.append("}");
        sb.append(",");
        sb.append("{legalDocumentUrl:");
        sb.append(realmGet$legalDocumentUrl());
        sb.append("}");
        sb.append(",");
        sb.append("{levels:");
        sb.append("RealmList<PrizotekaLevelEntity>[");
        sb.append(realmGet$levels().size());
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
