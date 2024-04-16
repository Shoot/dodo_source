package io.realm;

import com.dodopizza.persistence.entity.cart.EncryptionDataEntity;
import defpackage.r89;
import im.threads.business.transport.MessageAttributes;
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
public class com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy extends EncryptionDataEntity implements r89, sfc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<EncryptionDataEntity> c;

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

        a(OsSchemaInfo osSchemaInfo) {
            super(9);
            OsObjectSchemaInfo b = osSchemaInfo.b("EncryptionDataEntity");
            this.e = a("timestamp", "timestamp", b);
            this.f = a(MessageAttributes.UUID, MessageAttributes.UUID, b);
            this.g = a("mdorder", "mdorder", b);
            this.h = a("publicKey", "publicKey", b);
            this.i = a("apiKey", "apiKey", b);
            this.j = a("projectId", "projectId", b);
            this.k = a(MessageAttributes.CLIENT_ID, MessageAttributes.CLIENT_ID, b);
            this.l = a("tokenizationHost", "tokenizationHost", b);
            this.m = a("id", "id", b);
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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy() {
        this.c.p();
    }

    public static EncryptionDataEntity c(d0 d0Var, a aVar, EncryptionDataEntity encryptionDataEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(encryptionDataEntity);
        if (r89Var != null) {
            return (EncryptionDataEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(EncryptionDataEntity.class), set);
        osObjectBuilder.E0(aVar.e, encryptionDataEntity.realmGet$timestamp());
        osObjectBuilder.E0(aVar.f, encryptionDataEntity.realmGet$uuid());
        osObjectBuilder.E0(aVar.g, encryptionDataEntity.realmGet$mdorder());
        osObjectBuilder.E0(aVar.h, encryptionDataEntity.realmGet$publicKey());
        osObjectBuilder.E0(aVar.i, encryptionDataEntity.realmGet$apiKey());
        osObjectBuilder.E0(aVar.j, encryptionDataEntity.realmGet$projectId());
        osObjectBuilder.E0(aVar.k, encryptionDataEntity.realmGet$clientId());
        osObjectBuilder.E0(aVar.l, encryptionDataEntity.realmGet$tokenizationHost());
        osObjectBuilder.E0(aVar.m, encryptionDataEntity.realmGet$id());
        com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(encryptionDataEntity, j);
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dodopizza.persistence.entity.cart.EncryptionDataEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy.a r9, com.dodopizza.persistence.entity.cart.EncryptionDataEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.cart.EncryptionDataEntity r1 = (com.dodopizza.persistence.entity.cart.EncryptionDataEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.cart.EncryptionDataEntity> r2 = com.dodopizza.persistence.entity.cart.EncryptionDataEntity.class
            io.realm.internal.Table r2 = r8.I0(r2)
            long r3 = r9.m
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
            io.realm.com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.cart.EncryptionDataEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.cart.EncryptionDataEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy$a, com.dodopizza.persistence.entity.cart.EncryptionDataEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.cart.EncryptionDataEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static EncryptionDataEntity f(EncryptionDataEntity encryptionDataEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        EncryptionDataEntity encryptionDataEntity2;
        if (i <= i2 && encryptionDataEntity != null) {
            r89.a<o89> aVar = map.get(encryptionDataEntity);
            if (aVar == null) {
                encryptionDataEntity2 = new EncryptionDataEntity();
                map.put(encryptionDataEntity, new r89.a<>(i, encryptionDataEntity2));
            } else if (i >= aVar.a) {
                return (EncryptionDataEntity) aVar.b;
            } else {
                aVar.a = i;
                encryptionDataEntity2 = (EncryptionDataEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) encryptionDataEntity).a().f();
            encryptionDataEntity2.realmSet$timestamp(encryptionDataEntity.realmGet$timestamp());
            encryptionDataEntity2.realmSet$uuid(encryptionDataEntity.realmGet$uuid());
            encryptionDataEntity2.realmSet$mdorder(encryptionDataEntity.realmGet$mdorder());
            encryptionDataEntity2.realmSet$publicKey(encryptionDataEntity.realmGet$publicKey());
            encryptionDataEntity2.realmSet$apiKey(encryptionDataEntity.realmGet$apiKey());
            encryptionDataEntity2.realmSet$projectId(encryptionDataEntity.realmGet$projectId());
            encryptionDataEntity2.realmSet$clientId(encryptionDataEntity.realmGet$clientId());
            encryptionDataEntity2.realmSet$tokenizationHost(encryptionDataEntity.realmGet$tokenizationHost());
            encryptionDataEntity2.realmSet$id(encryptionDataEntity.realmGet$id());
            return encryptionDataEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "EncryptionDataEntity", false, 9, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "timestamp", realmFieldType, false, false, true);
        bVar.b("", MessageAttributes.UUID, realmFieldType, false, false, true);
        bVar.b("", "mdorder", realmFieldType, false, false, true);
        bVar.b("", "publicKey", realmFieldType, false, false, true);
        bVar.b("", "apiKey", realmFieldType, false, false, true);
        bVar.b("", "projectId", realmFieldType, false, false, true);
        bVar.b("", MessageAttributes.CLIENT_ID, realmFieldType, false, false, true);
        bVar.b("", "tokenizationHost", realmFieldType, false, false, true);
        bVar.b("", "id", realmFieldType, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, EncryptionDataEntity encryptionDataEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((encryptionDataEntity instanceof r89) && !n0.isFrozen(encryptionDataEntity)) {
            r89 r89Var = (r89) encryptionDataEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(EncryptionDataEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(EncryptionDataEntity.class);
        long j = aVar.m;
        String realmGet$id = encryptionDataEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(encryptionDataEntity, Long.valueOf(j2));
        String realmGet$timestamp = encryptionDataEntity.realmGet$timestamp();
        if (realmGet$timestamp != null) {
            Table.nativeSetString(nativePtr, aVar.e, j2, realmGet$timestamp, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.e, j2, false);
        }
        String realmGet$uuid = encryptionDataEntity.realmGet$uuid();
        if (realmGet$uuid != null) {
            Table.nativeSetString(nativePtr, aVar.f, j2, realmGet$uuid, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f, j2, false);
        }
        String realmGet$mdorder = encryptionDataEntity.realmGet$mdorder();
        if (realmGet$mdorder != null) {
            Table.nativeSetString(nativePtr, aVar.g, j2, realmGet$mdorder, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j2, false);
        }
        String realmGet$publicKey = encryptionDataEntity.realmGet$publicKey();
        if (realmGet$publicKey != null) {
            Table.nativeSetString(nativePtr, aVar.h, j2, realmGet$publicKey, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, j2, false);
        }
        String realmGet$apiKey = encryptionDataEntity.realmGet$apiKey();
        if (realmGet$apiKey != null) {
            Table.nativeSetString(nativePtr, aVar.i, j2, realmGet$apiKey, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.i, j2, false);
        }
        String realmGet$projectId = encryptionDataEntity.realmGet$projectId();
        if (realmGet$projectId != null) {
            Table.nativeSetString(nativePtr, aVar.j, j2, realmGet$projectId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.j, j2, false);
        }
        String realmGet$clientId = encryptionDataEntity.realmGet$clientId();
        if (realmGet$clientId != null) {
            Table.nativeSetString(nativePtr, aVar.k, j2, realmGet$clientId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.k, j2, false);
        }
        String realmGet$tokenizationHost = encryptionDataEntity.realmGet$tokenizationHost();
        if (realmGet$tokenizationHost != null) {
            Table.nativeSetString(nativePtr, aVar.l, j2, realmGet$tokenizationHost, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.l, j2, false);
        }
        return j2;
    }

    static com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(EncryptionDataEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy com_dodopizza_persistence_entity_cart_encryptiondataentityrealmproxy = new com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_cart_encryptiondataentityrealmproxy;
    }

    static EncryptionDataEntity k(d0 d0Var, a aVar, EncryptionDataEntity encryptionDataEntity, EncryptionDataEntity encryptionDataEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(EncryptionDataEntity.class), set);
        osObjectBuilder.E0(aVar.e, encryptionDataEntity2.realmGet$timestamp());
        osObjectBuilder.E0(aVar.f, encryptionDataEntity2.realmGet$uuid());
        osObjectBuilder.E0(aVar.g, encryptionDataEntity2.realmGet$mdorder());
        osObjectBuilder.E0(aVar.h, encryptionDataEntity2.realmGet$publicKey());
        osObjectBuilder.E0(aVar.i, encryptionDataEntity2.realmGet$apiKey());
        osObjectBuilder.E0(aVar.j, encryptionDataEntity2.realmGet$projectId());
        osObjectBuilder.E0(aVar.k, encryptionDataEntity2.realmGet$clientId());
        osObjectBuilder.E0(aVar.l, encryptionDataEntity2.realmGet$tokenizationHost());
        osObjectBuilder.E0(aVar.m, encryptionDataEntity2.realmGet$id());
        osObjectBuilder.K0();
        return encryptionDataEntity;
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
        c0<EncryptionDataEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy com_dodopizza_persistence_entity_cart_encryptiondataentityrealmproxy = (com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_cart_encryptiondataentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_cart_encryptiondataentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_cart_encryptiondataentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.cart.EncryptionDataEntity, defpackage.sfc
    public String realmGet$apiKey() {
        this.c.f().c();
        return this.c.g().p0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.cart.EncryptionDataEntity, defpackage.sfc
    public String realmGet$clientId() {
        this.c.f().c();
        return this.c.g().p0(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.cart.EncryptionDataEntity, defpackage.sfc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.m);
    }

    @Override // com.dodopizza.persistence.entity.cart.EncryptionDataEntity, defpackage.sfc
    public String realmGet$mdorder() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.cart.EncryptionDataEntity, defpackage.sfc
    public String realmGet$projectId() {
        this.c.f().c();
        return this.c.g().p0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.cart.EncryptionDataEntity, defpackage.sfc
    public String realmGet$publicKey() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.cart.EncryptionDataEntity, defpackage.sfc
    public String realmGet$timestamp() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.cart.EncryptionDataEntity, defpackage.sfc
    public String realmGet$tokenizationHost() {
        this.c.f().c();
        return this.c.g().p0(this.b.l);
    }

    @Override // com.dodopizza.persistence.entity.cart.EncryptionDataEntity, defpackage.sfc
    public String realmGet$uuid() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.cart.EncryptionDataEntity, defpackage.sfc
    public void realmSet$apiKey(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.i, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'apiKey' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.i, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'apiKey' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.EncryptionDataEntity, defpackage.sfc
    public void realmSet$clientId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.k, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'clientId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.k, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'clientId' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.EncryptionDataEntity, defpackage.sfc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.cart.EncryptionDataEntity, defpackage.sfc
    public void realmSet$mdorder(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.g, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'mdorder' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'mdorder' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.EncryptionDataEntity, defpackage.sfc
    public void realmSet$projectId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.j, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'projectId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.j, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'projectId' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.EncryptionDataEntity, defpackage.sfc
    public void realmSet$publicKey(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.h, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'publicKey' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.h, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'publicKey' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.EncryptionDataEntity, defpackage.sfc
    public void realmSet$timestamp(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.e, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'timestamp' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.e, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'timestamp' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.EncryptionDataEntity, defpackage.sfc
    public void realmSet$tokenizationHost(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.l, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'tokenizationHost' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.l, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'tokenizationHost' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.EncryptionDataEntity, defpackage.sfc
    public void realmSet$uuid(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.f, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'uuid' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'uuid' to null.");
    }

    public String toString() {
        String str;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("EncryptionDataEntity = proxy[");
        sb.append("{timestamp:");
        sb.append(realmGet$timestamp());
        sb.append("}");
        sb.append(",");
        sb.append("{uuid:");
        sb.append(realmGet$uuid());
        sb.append("}");
        sb.append(",");
        sb.append("{mdorder:");
        sb.append(realmGet$mdorder());
        sb.append("}");
        sb.append(",");
        sb.append("{publicKey:");
        sb.append(realmGet$publicKey());
        sb.append("}");
        sb.append(",");
        sb.append("{apiKey:");
        sb.append(realmGet$apiKey());
        sb.append("}");
        sb.append(",");
        sb.append("{projectId:");
        sb.append(realmGet$projectId());
        sb.append("}");
        sb.append(",");
        sb.append("{clientId:");
        sb.append(realmGet$clientId());
        sb.append("}");
        sb.append(",");
        sb.append("{tokenizationHost:");
        sb.append(realmGet$tokenizationHost());
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
