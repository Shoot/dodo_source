package io.realm;

import com.dodopizza.persistence.entity.orderrating.RatingEntity;
import defpackage.r89;
import io.realm.a;
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
public class com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy extends RatingEntity implements r89, bhc {
    private static final OsObjectSchemaInfo e = g();
    private a b;
    private c0<RatingEntity> c;
    private k0<String> d;

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

        a(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo b = osSchemaInfo.b("RatingEntity");
            this.e = a("id", "id", b);
            this.f = a("rating", "rating", b);
            this.g = a("binaryRatingPositive", "binaryRatingPositive", b);
            this.h = a("comment", "comment", b);
            this.i = a("tagsIds", "tagsIds", b);
            this.j = a("isEditable", "isEditable", b);
            this.k = a("isSent", "isSent", b);
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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy() {
        this.c.p();
    }

    public static RatingEntity c(d0 d0Var, a aVar, RatingEntity ratingEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(ratingEntity);
        if (r89Var != null) {
            return (RatingEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(RatingEntity.class), set);
        osObjectBuilder.E0(aVar.e, ratingEntity.realmGet$id());
        osObjectBuilder.o0(aVar.f, Integer.valueOf(ratingEntity.realmGet$rating()));
        osObjectBuilder.j0(aVar.g, ratingEntity.realmGet$binaryRatingPositive());
        osObjectBuilder.E0(aVar.h, ratingEntity.realmGet$comment());
        osObjectBuilder.F0(aVar.i, ratingEntity.realmGet$tagsIds());
        osObjectBuilder.j0(aVar.j, Boolean.valueOf(ratingEntity.realmGet$isEditable()));
        osObjectBuilder.j0(aVar.k, Boolean.valueOf(ratingEntity.realmGet$isSent()));
        com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(ratingEntity, j);
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dodopizza.persistence.entity.orderrating.RatingEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy.a r9, com.dodopizza.persistence.entity.orderrating.RatingEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.orderrating.RatingEntity r1 = (com.dodopizza.persistence.entity.orderrating.RatingEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.orderrating.RatingEntity> r2 = com.dodopizza.persistence.entity.orderrating.RatingEntity.class
            io.realm.internal.Table r2 = r8.I0(r2)
            long r3 = r9.e
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
            io.realm.com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.orderrating.RatingEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.orderrating.RatingEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy$a, com.dodopizza.persistence.entity.orderrating.RatingEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.orderrating.RatingEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static RatingEntity f(RatingEntity ratingEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        RatingEntity ratingEntity2;
        if (i <= i2 && ratingEntity != null) {
            r89.a<o89> aVar = map.get(ratingEntity);
            if (aVar == null) {
                ratingEntity2 = new RatingEntity();
                map.put(ratingEntity, new r89.a<>(i, ratingEntity2));
            } else if (i >= aVar.a) {
                return (RatingEntity) aVar.b;
            } else {
                aVar.a = i;
                ratingEntity2 = (RatingEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) ratingEntity).a().f();
            ratingEntity2.realmSet$id(ratingEntity.realmGet$id());
            ratingEntity2.realmSet$rating(ratingEntity.realmGet$rating());
            ratingEntity2.realmSet$binaryRatingPositive(ratingEntity.realmGet$binaryRatingPositive());
            ratingEntity2.realmSet$comment(ratingEntity.realmGet$comment());
            ratingEntity2.realmSet$tagsIds(new k0<>());
            ratingEntity2.realmGet$tagsIds().addAll(ratingEntity.realmGet$tagsIds());
            ratingEntity2.realmSet$isEditable(ratingEntity.realmGet$isEditable());
            ratingEntity2.realmSet$isSent(ratingEntity.realmGet$isSent());
            return ratingEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "RatingEntity", false, 7, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, false);
        bVar.b("", "rating", RealmFieldType.INTEGER, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.BOOLEAN;
        bVar.b("", "binaryRatingPositive", realmFieldType2, false, false, false);
        bVar.b("", "comment", realmFieldType, false, false, true);
        bVar.c("", "tagsIds", RealmFieldType.STRING_LIST, false);
        bVar.b("", "isEditable", realmFieldType2, false, false, true);
        bVar.b("", "isSent", realmFieldType2, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return e;
    }

    public static long i(d0 d0Var, RatingEntity ratingEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((ratingEntity instanceof r89) && !n0.isFrozen(ratingEntity)) {
            r89 r89Var = (r89) ratingEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(RatingEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(RatingEntity.class);
        long j = aVar.e;
        String realmGet$id = ratingEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(ratingEntity, Long.valueOf(j2));
        Table.nativeSetLong(nativePtr, aVar.f, j2, ratingEntity.realmGet$rating(), false);
        Boolean realmGet$binaryRatingPositive = ratingEntity.realmGet$binaryRatingPositive();
        if (realmGet$binaryRatingPositive != null) {
            Table.nativeSetBoolean(nativePtr, aVar.g, j2, realmGet$binaryRatingPositive.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j2, false);
        }
        String realmGet$comment = ratingEntity.realmGet$comment();
        if (realmGet$comment != null) {
            Table.nativeSetString(nativePtr, aVar.h, j2, realmGet$comment, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, j2, false);
        }
        OsList osList = new OsList(I0.r(j2), aVar.i);
        osList.J();
        k0<String> realmGet$tagsIds = ratingEntity.realmGet$tagsIds();
        if (realmGet$tagsIds != null) {
            Iterator<String> it = realmGet$tagsIds.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.h();
                } else {
                    osList.l(next);
                }
            }
        }
        Table.nativeSetBoolean(nativePtr, aVar.j, j2, ratingEntity.realmGet$isEditable(), false);
        Table.nativeSetBoolean(nativePtr, aVar.k, j2, ratingEntity.realmGet$isSent(), false);
        return j2;
    }

    static com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(RatingEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy com_dodopizza_persistence_entity_orderrating_ratingentityrealmproxy = new com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_orderrating_ratingentityrealmproxy;
    }

    static RatingEntity k(d0 d0Var, a aVar, RatingEntity ratingEntity, RatingEntity ratingEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(RatingEntity.class), set);
        osObjectBuilder.E0(aVar.e, ratingEntity2.realmGet$id());
        osObjectBuilder.o0(aVar.f, Integer.valueOf(ratingEntity2.realmGet$rating()));
        osObjectBuilder.j0(aVar.g, ratingEntity2.realmGet$binaryRatingPositive());
        osObjectBuilder.E0(aVar.h, ratingEntity2.realmGet$comment());
        osObjectBuilder.F0(aVar.i, ratingEntity2.realmGet$tagsIds());
        osObjectBuilder.j0(aVar.j, Boolean.valueOf(ratingEntity2.realmGet$isEditable()));
        osObjectBuilder.j0(aVar.k, Boolean.valueOf(ratingEntity2.realmGet$isSent()));
        osObjectBuilder.K0();
        return ratingEntity;
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
        c0<RatingEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy com_dodopizza_persistence_entity_orderrating_ratingentityrealmproxy = (com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_orderrating_ratingentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_orderrating_ratingentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_orderrating_ratingentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.orderrating.RatingEntity, defpackage.bhc
    public Boolean realmGet$binaryRatingPositive() {
        this.c.f().c();
        if (this.c.g().w(this.b.g)) {
            return null;
        }
        return Boolean.valueOf(this.c.g().b0(this.b.g));
    }

    @Override // com.dodopizza.persistence.entity.orderrating.RatingEntity, defpackage.bhc
    public String realmGet$comment() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.orderrating.RatingEntity, defpackage.bhc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.orderrating.RatingEntity, defpackage.bhc
    public boolean realmGet$isEditable() {
        this.c.f().c();
        return this.c.g().b0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.orderrating.RatingEntity, defpackage.bhc
    public boolean realmGet$isSent() {
        this.c.f().c();
        return this.c.g().b0(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.orderrating.RatingEntity, defpackage.bhc
    public int realmGet$rating() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.orderrating.RatingEntity, defpackage.bhc
    public k0<String> realmGet$tagsIds() {
        this.c.f().c();
        k0<String> k0Var = this.d;
        if (k0Var != null) {
            return k0Var;
        }
        k0<String> k0Var2 = new k0<>(String.class, this.c.g().N(this.b.i, RealmFieldType.STRING_LIST), this.c.f());
        this.d = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.orderrating.RatingEntity, defpackage.bhc
    public void realmSet$binaryRatingPositive(Boolean bool) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (bool == null) {
                g.o().D(this.b.g, g.E0(), true);
                return;
            } else {
                g.o().y(this.b.g, g.E0(), bool.booleanValue(), true);
                return;
            }
        }
        this.c.f().c();
        if (bool == null) {
            this.c.g().G(this.b.g);
        } else {
            this.c.g().Q(this.b.g, bool.booleanValue());
        }
    }

    @Override // com.dodopizza.persistence.entity.orderrating.RatingEntity, defpackage.bhc
    public void realmSet$comment(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.h, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'comment' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.h, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'comment' to null.");
    }

    @Override // com.dodopizza.persistence.entity.orderrating.RatingEntity, defpackage.bhc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.orderrating.RatingEntity, defpackage.bhc
    public void realmSet$isEditable(boolean z) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().y(this.b.j, g.E0(), z, true);
            return;
        }
        this.c.f().c();
        this.c.g().Q(this.b.j, z);
    }

    @Override // com.dodopizza.persistence.entity.orderrating.RatingEntity, defpackage.bhc
    public void realmSet$isSent(boolean z) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().y(this.b.k, g.E0(), z, true);
            return;
        }
        this.c.f().c();
        this.c.g().Q(this.b.k, z);
    }

    @Override // com.dodopizza.persistence.entity.orderrating.RatingEntity, defpackage.bhc
    public void realmSet$rating(int i) {
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

    @Override // com.dodopizza.persistence.entity.orderrating.RatingEntity, defpackage.bhc
    public void realmSet$tagsIds(k0<String> k0Var) {
        if (this.c.i() && (!this.c.d() || this.c.e().contains("tagsIds"))) {
            return;
        }
        this.c.f().c();
        OsList N = this.c.g().N(this.b.i, RealmFieldType.STRING_LIST);
        N.J();
        if (k0Var == null) {
            return;
        }
        Iterator<String> it = k0Var.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next == null) {
                N.h();
            } else {
                N.l(next);
            }
        }
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RatingEntity = proxy[");
        sb.append("{id:");
        Object obj = "null";
        if (realmGet$id() == null) {
            str = "null";
        } else {
            str = realmGet$id();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{rating:");
        sb.append(realmGet$rating());
        sb.append("}");
        sb.append(",");
        sb.append("{binaryRatingPositive:");
        if (realmGet$binaryRatingPositive() != null) {
            obj = realmGet$binaryRatingPositive();
        }
        sb.append(obj);
        sb.append("}");
        sb.append(",");
        sb.append("{comment:");
        sb.append(realmGet$comment());
        sb.append("}");
        sb.append(",");
        sb.append("{tagsIds:");
        sb.append("RealmList<String>[");
        sb.append(realmGet$tagsIds().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{isEditable:");
        sb.append(realmGet$isEditable());
        sb.append("}");
        sb.append(",");
        sb.append("{isSent:");
        sb.append(realmGet$isSent());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
