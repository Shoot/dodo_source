package io.realm;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.ImageEntity;
import com.dodopizza.persistence.entity.cart.UpsaleProductEntity;
import com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_ImageEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy;
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
public class com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy extends UpsaleProductEntity implements r89, cgc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<UpsaleProductEntity> c;

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
            OsObjectSchemaInfo b = osSchemaInfo.b("UpsaleProductEntity");
            this.e = a("upsaleProductId", "upsaleProductId", b);
            this.f = a(ElementGenerator.TYPE_IMAGE, ElementGenerator.TYPE_IMAGE, b);
            this.g = a(Action.NAME_ATTRIBUTE, Action.NAME_ATTRIBUTE, b);
            this.h = a("orderInCart", "orderInCart", b);
            this.i = a("price", "price", b);
            this.j = a("category", "category", b);
            this.k = a("promotingSizeDetailsEntity", "promotingSizeDetailsEntity", b);
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
    public com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy() {
        this.c.p();
    }

    public static UpsaleProductEntity c(d0 d0Var, a aVar, UpsaleProductEntity upsaleProductEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(upsaleProductEntity);
        if (r89Var != null) {
            return (UpsaleProductEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(UpsaleProductEntity.class), set);
        osObjectBuilder.E0(aVar.e, upsaleProductEntity.realmGet$upsaleProductId());
        osObjectBuilder.E0(aVar.g, upsaleProductEntity.realmGet$name());
        osObjectBuilder.o0(aVar.h, Integer.valueOf(upsaleProductEntity.realmGet$orderInCart()));
        osObjectBuilder.l0(aVar.i, Double.valueOf(upsaleProductEntity.realmGet$price()));
        osObjectBuilder.o0(aVar.j, upsaleProductEntity.realmGet$category());
        osObjectBuilder.E0(aVar.l, upsaleProductEntity.realmGet$id());
        com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(upsaleProductEntity, j);
        ImageEntity realmGet$image = upsaleProductEntity.realmGet$image();
        if (realmGet$image == null) {
            j.realmSet$image(null);
        } else {
            ImageEntity imageEntity = (ImageEntity) map.get(realmGet$image);
            if (imageEntity != null) {
                j.realmSet$image(imageEntity);
            } else {
                j.realmSet$image(com_dodopizza_persistence_entity_ImageEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_ImageEntityRealmProxy.a) d0Var.u().e(ImageEntity.class), realmGet$image, z, map, set));
            }
        }
        UpsaleSizeDetailsEntity realmGet$promotingSizeDetailsEntity = upsaleProductEntity.realmGet$promotingSizeDetailsEntity();
        if (realmGet$promotingSizeDetailsEntity == null) {
            j.realmSet$promotingSizeDetailsEntity(null);
        } else {
            UpsaleSizeDetailsEntity upsaleSizeDetailsEntity = (UpsaleSizeDetailsEntity) map.get(realmGet$promotingSizeDetailsEntity);
            if (upsaleSizeDetailsEntity != null) {
                j.realmSet$promotingSizeDetailsEntity(upsaleSizeDetailsEntity);
            } else {
                j.realmSet$promotingSizeDetailsEntity(com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy.a) d0Var.u().e(UpsaleSizeDetailsEntity.class), realmGet$promotingSizeDetailsEntity, z, map, set));
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
    public static com.dodopizza.persistence.entity.cart.UpsaleProductEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy.a r9, com.dodopizza.persistence.entity.cart.UpsaleProductEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.cart.UpsaleProductEntity r1 = (com.dodopizza.persistence.entity.cart.UpsaleProductEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.cart.UpsaleProductEntity> r2 = com.dodopizza.persistence.entity.cart.UpsaleProductEntity.class
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
            io.realm.com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.cart.UpsaleProductEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.cart.UpsaleProductEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy$a, com.dodopizza.persistence.entity.cart.UpsaleProductEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.cart.UpsaleProductEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static UpsaleProductEntity f(UpsaleProductEntity upsaleProductEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        UpsaleProductEntity upsaleProductEntity2;
        if (i <= i2 && upsaleProductEntity != null) {
            r89.a<o89> aVar = map.get(upsaleProductEntity);
            if (aVar == null) {
                upsaleProductEntity2 = new UpsaleProductEntity();
                map.put(upsaleProductEntity, new r89.a<>(i, upsaleProductEntity2));
            } else if (i >= aVar.a) {
                return (UpsaleProductEntity) aVar.b;
            } else {
                aVar.a = i;
                upsaleProductEntity2 = (UpsaleProductEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) upsaleProductEntity).a().f();
            upsaleProductEntity2.realmSet$upsaleProductId(upsaleProductEntity.realmGet$upsaleProductId());
            int i3 = i + 1;
            upsaleProductEntity2.realmSet$image(com_dodopizza_persistence_entity_ImageEntityRealmProxy.f(upsaleProductEntity.realmGet$image(), i3, i2, map));
            upsaleProductEntity2.realmSet$name(upsaleProductEntity.realmGet$name());
            upsaleProductEntity2.realmSet$orderInCart(upsaleProductEntity.realmGet$orderInCart());
            upsaleProductEntity2.realmSet$price(upsaleProductEntity.realmGet$price());
            upsaleProductEntity2.realmSet$category(upsaleProductEntity.realmGet$category());
            upsaleProductEntity2.realmSet$promotingSizeDetailsEntity(com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy.f(upsaleProductEntity.realmGet$promotingSizeDetailsEntity(), i3, i2, map));
            upsaleProductEntity2.realmSet$id(upsaleProductEntity.realmGet$id());
            return upsaleProductEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "UpsaleProductEntity", false, 8, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "upsaleProductId", realmFieldType, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.OBJECT;
        bVar.a("", ElementGenerator.TYPE_IMAGE, realmFieldType2, "ImageEntity");
        bVar.b("", Action.NAME_ATTRIBUTE, realmFieldType, false, false, true);
        RealmFieldType realmFieldType3 = RealmFieldType.INTEGER;
        bVar.b("", "orderInCart", realmFieldType3, false, false, true);
        bVar.b("", "price", RealmFieldType.DOUBLE, false, false, true);
        bVar.b("", "category", realmFieldType3, false, false, false);
        bVar.a("", "promotingSizeDetailsEntity", realmFieldType2, "UpsaleSizeDetailsEntity");
        bVar.b("", "id", realmFieldType, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, UpsaleProductEntity upsaleProductEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((upsaleProductEntity instanceof r89) && !n0.isFrozen(upsaleProductEntity)) {
            r89 r89Var = (r89) upsaleProductEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(UpsaleProductEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(UpsaleProductEntity.class);
        long j = aVar.l;
        String realmGet$id = upsaleProductEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(upsaleProductEntity, Long.valueOf(j2));
        String realmGet$upsaleProductId = upsaleProductEntity.realmGet$upsaleProductId();
        if (realmGet$upsaleProductId != null) {
            Table.nativeSetString(nativePtr, aVar.e, j2, realmGet$upsaleProductId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.e, j2, false);
        }
        ImageEntity realmGet$image = upsaleProductEntity.realmGet$image();
        if (realmGet$image != null) {
            Long l = map.get(realmGet$image);
            if (l == null) {
                l = Long.valueOf(com_dodopizza_persistence_entity_ImageEntityRealmProxy.i(d0Var, realmGet$image, map));
            }
            Table.nativeSetLink(nativePtr, aVar.f, j2, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f, j2);
        }
        String realmGet$name = upsaleProductEntity.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, aVar.g, j2, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j2, false);
        }
        Table.nativeSetLong(nativePtr, aVar.h, j2, upsaleProductEntity.realmGet$orderInCart(), false);
        Table.nativeSetDouble(nativePtr, aVar.i, j2, upsaleProductEntity.realmGet$price(), false);
        Integer realmGet$category = upsaleProductEntity.realmGet$category();
        if (realmGet$category != null) {
            Table.nativeSetLong(nativePtr, aVar.j, j2, realmGet$category.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.j, j2, false);
        }
        UpsaleSizeDetailsEntity realmGet$promotingSizeDetailsEntity = upsaleProductEntity.realmGet$promotingSizeDetailsEntity();
        if (realmGet$promotingSizeDetailsEntity != null) {
            Long l2 = map.get(realmGet$promotingSizeDetailsEntity);
            if (l2 == null) {
                l2 = Long.valueOf(com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy.i(d0Var, realmGet$promotingSizeDetailsEntity, map));
            }
            Table.nativeSetLink(nativePtr, aVar.k, j2, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.k, j2);
        }
        return j2;
    }

    static com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(UpsaleProductEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy com_dodopizza_persistence_entity_cart_upsaleproductentityrealmproxy = new com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_cart_upsaleproductentityrealmproxy;
    }

    static UpsaleProductEntity k(d0 d0Var, a aVar, UpsaleProductEntity upsaleProductEntity, UpsaleProductEntity upsaleProductEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(UpsaleProductEntity.class), set);
        osObjectBuilder.E0(aVar.e, upsaleProductEntity2.realmGet$upsaleProductId());
        ImageEntity realmGet$image = upsaleProductEntity2.realmGet$image();
        if (realmGet$image == null) {
            osObjectBuilder.r0(aVar.f);
        } else {
            ImageEntity imageEntity = (ImageEntity) map.get(realmGet$image);
            if (imageEntity != null) {
                osObjectBuilder.x0(aVar.f, imageEntity);
            } else {
                osObjectBuilder.x0(aVar.f, com_dodopizza_persistence_entity_ImageEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_ImageEntityRealmProxy.a) d0Var.u().e(ImageEntity.class), realmGet$image, true, map, set));
            }
        }
        osObjectBuilder.E0(aVar.g, upsaleProductEntity2.realmGet$name());
        osObjectBuilder.o0(aVar.h, Integer.valueOf(upsaleProductEntity2.realmGet$orderInCart()));
        osObjectBuilder.l0(aVar.i, Double.valueOf(upsaleProductEntity2.realmGet$price()));
        osObjectBuilder.o0(aVar.j, upsaleProductEntity2.realmGet$category());
        UpsaleSizeDetailsEntity realmGet$promotingSizeDetailsEntity = upsaleProductEntity2.realmGet$promotingSizeDetailsEntity();
        if (realmGet$promotingSizeDetailsEntity == null) {
            osObjectBuilder.r0(aVar.k);
        } else {
            UpsaleSizeDetailsEntity upsaleSizeDetailsEntity = (UpsaleSizeDetailsEntity) map.get(realmGet$promotingSizeDetailsEntity);
            if (upsaleSizeDetailsEntity != null) {
                osObjectBuilder.x0(aVar.k, upsaleSizeDetailsEntity);
            } else {
                osObjectBuilder.x0(aVar.k, com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy.a) d0Var.u().e(UpsaleSizeDetailsEntity.class), realmGet$promotingSizeDetailsEntity, true, map, set));
            }
        }
        osObjectBuilder.E0(aVar.l, upsaleProductEntity2.realmGet$id());
        osObjectBuilder.K0();
        return upsaleProductEntity;
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
        c0<UpsaleProductEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy com_dodopizza_persistence_entity_cart_upsaleproductentityrealmproxy = (com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_cart_upsaleproductentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_cart_upsaleproductentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_cart_upsaleproductentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.cart.UpsaleProductEntity, defpackage.cgc
    public Integer realmGet$category() {
        this.c.f().c();
        if (this.c.g().w(this.b.j)) {
            return null;
        }
        return Integer.valueOf((int) this.c.g().e0(this.b.j));
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleProductEntity, defpackage.cgc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.l);
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleProductEntity, defpackage.cgc
    public ImageEntity realmGet$image() {
        this.c.f().c();
        if (this.c.g().o0(this.b.f)) {
            return null;
        }
        return (ImageEntity) this.c.f().o(ImageEntity.class, this.c.g().L(this.b.f), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleProductEntity, defpackage.cgc
    public String realmGet$name() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleProductEntity, defpackage.cgc
    public int realmGet$orderInCart() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleProductEntity, defpackage.cgc
    public double realmGet$price() {
        this.c.f().c();
        return this.c.g().K(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleProductEntity, defpackage.cgc
    public UpsaleSizeDetailsEntity realmGet$promotingSizeDetailsEntity() {
        this.c.f().c();
        if (this.c.g().o0(this.b.k)) {
            return null;
        }
        return (UpsaleSizeDetailsEntity) this.c.f().o(UpsaleSizeDetailsEntity.class, this.c.g().L(this.b.k), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleProductEntity, defpackage.cgc
    public String realmGet$upsaleProductId() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleProductEntity, defpackage.cgc
    public void realmSet$category(Integer num) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (num == null) {
                g.o().D(this.b.j, g.E0(), true);
                return;
            } else {
                g.o().C(this.b.j, g.E0(), num.intValue(), true);
                return;
            }
        }
        this.c.f().c();
        if (num == null) {
            this.c.g().G(this.b.j);
        } else {
            this.c.g().u(this.b.j, num.intValue());
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleProductEntity, defpackage.cgc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleProductEntity, defpackage.cgc
    public void realmSet$image(ImageEntity imageEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains(ElementGenerator.TYPE_IMAGE)) {
                return;
            }
            if (imageEntity != null && !n0.isManaged(imageEntity)) {
                imageEntity = (ImageEntity) d0Var.f0(imageEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (imageEntity == null) {
                g.l0(this.b.f);
                return;
            }
            this.c.c(imageEntity);
            g.o().B(this.b.f, g.E0(), ((r89) imageEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (imageEntity == null) {
            this.c.g().l0(this.b.f);
            return;
        }
        this.c.c(imageEntity);
        this.c.g().s(this.b.f, ((r89) imageEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleProductEntity, defpackage.cgc
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

    @Override // com.dodopizza.persistence.entity.cart.UpsaleProductEntity, defpackage.cgc
    public void realmSet$orderInCart(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.h, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.h, i);
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleProductEntity, defpackage.cgc
    public void realmSet$price(double d2) {
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

    @Override // com.dodopizza.persistence.entity.cart.UpsaleProductEntity, defpackage.cgc
    public void realmSet$promotingSizeDetailsEntity(UpsaleSizeDetailsEntity upsaleSizeDetailsEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("promotingSizeDetailsEntity")) {
                return;
            }
            if (upsaleSizeDetailsEntity != null && !n0.isManaged(upsaleSizeDetailsEntity)) {
                upsaleSizeDetailsEntity = (UpsaleSizeDetailsEntity) d0Var.j0(upsaleSizeDetailsEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (upsaleSizeDetailsEntity == null) {
                g.l0(this.b.k);
                return;
            }
            this.c.c(upsaleSizeDetailsEntity);
            g.o().B(this.b.k, g.E0(), ((r89) upsaleSizeDetailsEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (upsaleSizeDetailsEntity == null) {
            this.c.g().l0(this.b.k);
            return;
        }
        this.c.c(upsaleSizeDetailsEntity);
        this.c.g().s(this.b.k, ((r89) upsaleSizeDetailsEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleProductEntity, defpackage.cgc
    public void realmSet$upsaleProductId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.e, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'upsaleProductId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.e, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'upsaleProductId' to null.");
    }

    public String toString() {
        String str;
        Integer num;
        String str2;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("UpsaleProductEntity = proxy[");
        sb.append("{upsaleProductId:");
        sb.append(realmGet$upsaleProductId());
        sb.append("}");
        sb.append(",");
        sb.append("{image:");
        String str3 = "null";
        if (realmGet$image() == null) {
            str = "null";
        } else {
            str = "ImageEntity";
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(realmGet$name());
        sb.append("}");
        sb.append(",");
        sb.append("{orderInCart:");
        sb.append(realmGet$orderInCart());
        sb.append("}");
        sb.append(",");
        sb.append("{price:");
        sb.append(realmGet$price());
        sb.append("}");
        sb.append(",");
        sb.append("{category:");
        if (realmGet$category() == null) {
            num = "null";
        } else {
            num = realmGet$category();
        }
        sb.append(num);
        sb.append("}");
        sb.append(",");
        sb.append("{promotingSizeDetailsEntity:");
        if (realmGet$promotingSizeDetailsEntity() == null) {
            str2 = "null";
        } else {
            str2 = "UpsaleSizeDetailsEntity";
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{id:");
        if (realmGet$id() != null) {
            str3 = realmGet$id();
        }
        sb.append(str3);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
