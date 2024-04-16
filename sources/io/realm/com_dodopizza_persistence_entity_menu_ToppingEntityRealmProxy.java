package io.realm;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.MoneyType;
import com.dodopizza.persistence.entity.menu.ToppingEntity;
import defpackage.r89;
import im.threads.business.transport.MessageAttributes;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_MoneyTypeRealmProxy;
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
public class com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy extends ToppingEntity implements r89, ahc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<ToppingEntity> c;

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

        a(OsSchemaInfo osSchemaInfo) {
            super(8);
            OsObjectSchemaInfo b = osSchemaInfo.b("ToppingEntity");
            this.e = a(MessageAttributes.UUID, MessageAttributes.UUID, b);
            this.f = a("parentUuid", "parentUuid", b);
            this.g = a(Action.NAME_ATTRIBUTE, Action.NAME_ATTRIBUTE, b);
            this.h = a("imageUrl", "imageUrl", b);
            this.i = a("price", "price", b);
            this.j = a("isInStop", "isInStop", b);
            this.k = a("canAddToVariation", "canAddToVariation", b);
            this.l = a("id", "id", b);
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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy() {
        this.c.p();
    }

    public static ToppingEntity c(d0 d0Var, a aVar, ToppingEntity toppingEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(toppingEntity);
        if (r89Var != null) {
            return (ToppingEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(ToppingEntity.class), set);
        osObjectBuilder.E0(aVar.e, toppingEntity.realmGet$uuid());
        osObjectBuilder.E0(aVar.f, toppingEntity.realmGet$parentUuid());
        osObjectBuilder.E0(aVar.g, toppingEntity.realmGet$name());
        osObjectBuilder.E0(aVar.h, toppingEntity.realmGet$imageUrl());
        osObjectBuilder.j0(aVar.j, Boolean.valueOf(toppingEntity.realmGet$isInStop()));
        osObjectBuilder.j0(aVar.k, Boolean.valueOf(toppingEntity.realmGet$canAddToVariation()));
        osObjectBuilder.E0(aVar.l, toppingEntity.realmGet$id());
        com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(toppingEntity, j);
        MoneyType realmGet$price = toppingEntity.realmGet$price();
        if (realmGet$price == null) {
            j.realmSet$price(null);
        } else {
            MoneyType moneyType = (MoneyType) map.get(realmGet$price);
            if (moneyType != null) {
                j.realmSet$price(moneyType);
            } else {
                j.realmSet$price(com_dodopizza_persistence_entity_MoneyTypeRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_MoneyTypeRealmProxy.a) d0Var.u().e(MoneyType.class), realmGet$price, z, map, set));
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
    public static com.dodopizza.persistence.entity.menu.ToppingEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy.a r9, com.dodopizza.persistence.entity.menu.ToppingEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.menu.ToppingEntity r1 = (com.dodopizza.persistence.entity.menu.ToppingEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.menu.ToppingEntity> r2 = com.dodopizza.persistence.entity.menu.ToppingEntity.class
            io.realm.internal.Table r2 = r8.I0(r2)
            long r3 = r9.l
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
            io.realm.com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.menu.ToppingEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.menu.ToppingEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy$a, com.dodopizza.persistence.entity.menu.ToppingEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.menu.ToppingEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static ToppingEntity f(ToppingEntity toppingEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        ToppingEntity toppingEntity2;
        if (i <= i2 && toppingEntity != null) {
            r89.a<o89> aVar = map.get(toppingEntity);
            if (aVar == null) {
                toppingEntity2 = new ToppingEntity();
                map.put(toppingEntity, new r89.a<>(i, toppingEntity2));
            } else if (i >= aVar.a) {
                return (ToppingEntity) aVar.b;
            } else {
                aVar.a = i;
                toppingEntity2 = (ToppingEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) toppingEntity).a().f();
            toppingEntity2.realmSet$uuid(toppingEntity.realmGet$uuid());
            toppingEntity2.realmSet$parentUuid(toppingEntity.realmGet$parentUuid());
            toppingEntity2.realmSet$name(toppingEntity.realmGet$name());
            toppingEntity2.realmSet$imageUrl(toppingEntity.realmGet$imageUrl());
            toppingEntity2.realmSet$price(com_dodopizza_persistence_entity_MoneyTypeRealmProxy.f(toppingEntity.realmGet$price(), i + 1, i2, map));
            toppingEntity2.realmSet$isInStop(toppingEntity.realmGet$isInStop());
            toppingEntity2.realmSet$canAddToVariation(toppingEntity.realmGet$canAddToVariation());
            toppingEntity2.realmSet$id(toppingEntity.realmGet$id());
            return toppingEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "ToppingEntity", false, 8, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", MessageAttributes.UUID, realmFieldType, false, false, true);
        bVar.b("", "parentUuid", realmFieldType, false, false, true);
        bVar.b("", Action.NAME_ATTRIBUTE, realmFieldType, false, false, true);
        bVar.b("", "imageUrl", realmFieldType, false, false, true);
        bVar.a("", "price", RealmFieldType.OBJECT, "MoneyType");
        RealmFieldType realmFieldType2 = RealmFieldType.BOOLEAN;
        bVar.b("", "isInStop", realmFieldType2, false, false, true);
        bVar.b("", "canAddToVariation", realmFieldType2, false, false, true);
        bVar.b("", "id", realmFieldType, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, ToppingEntity toppingEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((toppingEntity instanceof r89) && !n0.isFrozen(toppingEntity)) {
            r89 r89Var = (r89) toppingEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(ToppingEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(ToppingEntity.class);
        long j = aVar.l;
        String realmGet$id = toppingEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(toppingEntity, Long.valueOf(j2));
        String realmGet$uuid = toppingEntity.realmGet$uuid();
        if (realmGet$uuid != null) {
            Table.nativeSetString(nativePtr, aVar.e, j2, realmGet$uuid, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.e, j2, false);
        }
        String realmGet$parentUuid = toppingEntity.realmGet$parentUuid();
        if (realmGet$parentUuid != null) {
            Table.nativeSetString(nativePtr, aVar.f, j2, realmGet$parentUuid, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f, j2, false);
        }
        String realmGet$name = toppingEntity.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, aVar.g, j2, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j2, false);
        }
        String realmGet$imageUrl = toppingEntity.realmGet$imageUrl();
        if (realmGet$imageUrl != null) {
            Table.nativeSetString(nativePtr, aVar.h, j2, realmGet$imageUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, j2, false);
        }
        MoneyType realmGet$price = toppingEntity.realmGet$price();
        if (realmGet$price != null) {
            Long l = map.get(realmGet$price);
            if (l == null) {
                l = Long.valueOf(com_dodopizza_persistence_entity_MoneyTypeRealmProxy.i(d0Var, realmGet$price, map));
            }
            Table.nativeSetLink(nativePtr, aVar.i, j2, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.i, j2);
        }
        Table.nativeSetBoolean(nativePtr, aVar.j, j2, toppingEntity.realmGet$isInStop(), false);
        Table.nativeSetBoolean(nativePtr, aVar.k, j2, toppingEntity.realmGet$canAddToVariation(), false);
        return j2;
    }

    static com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(ToppingEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy com_dodopizza_persistence_entity_menu_toppingentityrealmproxy = new com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_menu_toppingentityrealmproxy;
    }

    static ToppingEntity k(d0 d0Var, a aVar, ToppingEntity toppingEntity, ToppingEntity toppingEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(ToppingEntity.class), set);
        osObjectBuilder.E0(aVar.e, toppingEntity2.realmGet$uuid());
        osObjectBuilder.E0(aVar.f, toppingEntity2.realmGet$parentUuid());
        osObjectBuilder.E0(aVar.g, toppingEntity2.realmGet$name());
        osObjectBuilder.E0(aVar.h, toppingEntity2.realmGet$imageUrl());
        MoneyType realmGet$price = toppingEntity2.realmGet$price();
        if (realmGet$price == null) {
            osObjectBuilder.r0(aVar.i);
        } else {
            MoneyType moneyType = (MoneyType) map.get(realmGet$price);
            if (moneyType != null) {
                osObjectBuilder.x0(aVar.i, moneyType);
            } else {
                osObjectBuilder.x0(aVar.i, com_dodopizza_persistence_entity_MoneyTypeRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_MoneyTypeRealmProxy.a) d0Var.u().e(MoneyType.class), realmGet$price, true, map, set));
            }
        }
        osObjectBuilder.j0(aVar.j, Boolean.valueOf(toppingEntity2.realmGet$isInStop()));
        osObjectBuilder.j0(aVar.k, Boolean.valueOf(toppingEntity2.realmGet$canAddToVariation()));
        osObjectBuilder.E0(aVar.l, toppingEntity2.realmGet$id());
        osObjectBuilder.K0();
        return toppingEntity;
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
        c0<ToppingEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy com_dodopizza_persistence_entity_menu_toppingentityrealmproxy = (com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_menu_toppingentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_menu_toppingentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_menu_toppingentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.menu.ToppingEntity, defpackage.ahc
    public boolean realmGet$canAddToVariation() {
        this.c.f().c();
        return this.c.g().b0(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.menu.ToppingEntity, defpackage.ahc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.l);
    }

    @Override // com.dodopizza.persistence.entity.menu.ToppingEntity, defpackage.ahc
    public String realmGet$imageUrl() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.menu.ToppingEntity, defpackage.ahc
    public boolean realmGet$isInStop() {
        this.c.f().c();
        return this.c.g().b0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.menu.ToppingEntity, defpackage.ahc
    public String realmGet$name() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.menu.ToppingEntity, defpackage.ahc
    public String realmGet$parentUuid() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.menu.ToppingEntity, defpackage.ahc
    public MoneyType realmGet$price() {
        this.c.f().c();
        if (this.c.g().o0(this.b.i)) {
            return null;
        }
        return (MoneyType) this.c.f().o(MoneyType.class, this.c.g().L(this.b.i), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.menu.ToppingEntity, defpackage.ahc
    public String realmGet$uuid() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.menu.ToppingEntity, defpackage.ahc
    public void realmSet$canAddToVariation(boolean z) {
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

    @Override // com.dodopizza.persistence.entity.menu.ToppingEntity, defpackage.ahc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ToppingEntity, defpackage.ahc
    public void realmSet$imageUrl(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.h, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'imageUrl' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.h, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'imageUrl' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ToppingEntity, defpackage.ahc
    public void realmSet$isInStop(boolean z) {
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

    @Override // com.dodopizza.persistence.entity.menu.ToppingEntity, defpackage.ahc
    public void realmSet$name(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.g, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ToppingEntity, defpackage.ahc
    public void realmSet$parentUuid(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.f, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'parentUuid' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'parentUuid' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ToppingEntity, defpackage.ahc
    public void realmSet$price(MoneyType moneyType) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("price")) {
                return;
            }
            if (moneyType != null && !n0.isManaged(moneyType)) {
                moneyType = (MoneyType) d0Var.f0(moneyType, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (moneyType == null) {
                g.l0(this.b.i);
                return;
            }
            this.c.c(moneyType);
            g.o().B(this.b.i, g.E0(), ((r89) moneyType).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (moneyType == null) {
            this.c.g().l0(this.b.i);
            return;
        }
        this.c.c(moneyType);
        this.c.g().s(this.b.i, ((r89) moneyType).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.menu.ToppingEntity, defpackage.ahc
    public void realmSet$uuid(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.e, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'uuid' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.e, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'uuid' to null.");
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ToppingEntity = proxy[");
        sb.append("{uuid:");
        sb.append(realmGet$uuid());
        sb.append("}");
        sb.append(",");
        sb.append("{parentUuid:");
        sb.append(realmGet$parentUuid());
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(realmGet$name());
        sb.append("}");
        sb.append(",");
        sb.append("{imageUrl:");
        sb.append(realmGet$imageUrl());
        sb.append("}");
        sb.append(",");
        sb.append("{price:");
        String str2 = "null";
        if (realmGet$price() == null) {
            str = "null";
        } else {
            str = "MoneyType";
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{isInStop:");
        sb.append(realmGet$isInStop());
        sb.append("}");
        sb.append(",");
        sb.append("{canAddToVariation:");
        sb.append(realmGet$canAddToVariation());
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
