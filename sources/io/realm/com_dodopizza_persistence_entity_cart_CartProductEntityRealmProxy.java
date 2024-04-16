package io.realm;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.ImageEntity;
import com.dodopizza.persistence.entity.cart.CartProductEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_ImageEntityRealmProxy;
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
public class com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy extends CartProductEntity implements r89, nfc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<CartProductEntity> c;

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
            OsObjectSchemaInfo b = osSchemaInfo.b("CartProductEntity");
            this.e = a(ShoppingInfoEntity.FIELD_EXTERNAL_ID, ShoppingInfoEntity.FIELD_EXTERNAL_ID, b);
            this.f = a("category", "category", b);
            this.g = a("price", "price", b);
            this.h = a("size", "size", b);
            this.i = a(ElementGenerator.TYPE_IMAGE, ElementGenerator.TYPE_IMAGE, b);
            this.j = a(Action.NAME_ATTRIBUTE, Action.NAME_ATTRIBUTE, b);
            this.k = a("dough", "dough", b);
            this.l = a("isInStop", "isInStop", b);
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
    public com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy() {
        this.c.p();
    }

    public static CartProductEntity c(d0 d0Var, a aVar, CartProductEntity cartProductEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(cartProductEntity);
        if (r89Var != null) {
            return (CartProductEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(CartProductEntity.class), set);
        osObjectBuilder.E0(aVar.e, cartProductEntity.realmGet$externalId());
        osObjectBuilder.E0(aVar.f, cartProductEntity.realmGet$category());
        osObjectBuilder.l0(aVar.g, Double.valueOf(cartProductEntity.realmGet$price()));
        osObjectBuilder.o0(aVar.h, Integer.valueOf(cartProductEntity.realmGet$size()));
        osObjectBuilder.E0(aVar.j, cartProductEntity.realmGet$name());
        osObjectBuilder.o0(aVar.k, Integer.valueOf(cartProductEntity.realmGet$dough()));
        osObjectBuilder.j0(aVar.l, Boolean.valueOf(cartProductEntity.realmGet$isInStop()));
        osObjectBuilder.E0(aVar.m, cartProductEntity.realmGet$id());
        com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(cartProductEntity, j);
        ImageEntity realmGet$image = cartProductEntity.realmGet$image();
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
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dodopizza.persistence.entity.cart.CartProductEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.a r9, com.dodopizza.persistence.entity.cart.CartProductEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.cart.CartProductEntity r1 = (com.dodopizza.persistence.entity.cart.CartProductEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.cart.CartProductEntity> r2 = com.dodopizza.persistence.entity.cart.CartProductEntity.class
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
            io.realm.com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.cart.CartProductEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.cart.CartProductEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy$a, com.dodopizza.persistence.entity.cart.CartProductEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.cart.CartProductEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static CartProductEntity f(CartProductEntity cartProductEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        CartProductEntity cartProductEntity2;
        if (i <= i2 && cartProductEntity != null) {
            r89.a<o89> aVar = map.get(cartProductEntity);
            if (aVar == null) {
                cartProductEntity2 = new CartProductEntity();
                map.put(cartProductEntity, new r89.a<>(i, cartProductEntity2));
            } else if (i >= aVar.a) {
                return (CartProductEntity) aVar.b;
            } else {
                aVar.a = i;
                cartProductEntity2 = (CartProductEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) cartProductEntity).a().f();
            cartProductEntity2.realmSet$externalId(cartProductEntity.realmGet$externalId());
            cartProductEntity2.realmSet$category(cartProductEntity.realmGet$category());
            cartProductEntity2.realmSet$price(cartProductEntity.realmGet$price());
            cartProductEntity2.realmSet$size(cartProductEntity.realmGet$size());
            cartProductEntity2.realmSet$image(com_dodopizza_persistence_entity_ImageEntityRealmProxy.f(cartProductEntity.realmGet$image(), i + 1, i2, map));
            cartProductEntity2.realmSet$name(cartProductEntity.realmGet$name());
            cartProductEntity2.realmSet$dough(cartProductEntity.realmGet$dough());
            cartProductEntity2.realmSet$isInStop(cartProductEntity.realmGet$isInStop());
            cartProductEntity2.realmSet$id(cartProductEntity.realmGet$id());
            return cartProductEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "CartProductEntity", false, 9, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", ShoppingInfoEntity.FIELD_EXTERNAL_ID, realmFieldType, false, false, false);
        bVar.b("", "category", realmFieldType, false, false, true);
        bVar.b("", "price", RealmFieldType.DOUBLE, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.b("", "size", realmFieldType2, false, false, true);
        bVar.a("", ElementGenerator.TYPE_IMAGE, RealmFieldType.OBJECT, "ImageEntity");
        bVar.b("", Action.NAME_ATTRIBUTE, realmFieldType, false, false, true);
        bVar.b("", "dough", realmFieldType2, false, false, true);
        bVar.b("", "isInStop", RealmFieldType.BOOLEAN, false, false, true);
        bVar.b("", "id", realmFieldType, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, CartProductEntity cartProductEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((cartProductEntity instanceof r89) && !n0.isFrozen(cartProductEntity)) {
            r89 r89Var = (r89) cartProductEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(CartProductEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(CartProductEntity.class);
        long j = aVar.m;
        String realmGet$id = cartProductEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(cartProductEntity, Long.valueOf(j2));
        String realmGet$externalId = cartProductEntity.realmGet$externalId();
        if (realmGet$externalId != null) {
            Table.nativeSetString(nativePtr, aVar.e, j2, realmGet$externalId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.e, j2, false);
        }
        String realmGet$category = cartProductEntity.realmGet$category();
        if (realmGet$category != null) {
            Table.nativeSetString(nativePtr, aVar.f, j2, realmGet$category, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f, j2, false);
        }
        Table.nativeSetDouble(nativePtr, aVar.g, j2, cartProductEntity.realmGet$price(), false);
        Table.nativeSetLong(nativePtr, aVar.h, j2, cartProductEntity.realmGet$size(), false);
        ImageEntity realmGet$image = cartProductEntity.realmGet$image();
        if (realmGet$image != null) {
            Long l = map.get(realmGet$image);
            if (l == null) {
                l = Long.valueOf(com_dodopizza_persistence_entity_ImageEntityRealmProxy.i(d0Var, realmGet$image, map));
            }
            Table.nativeSetLink(nativePtr, aVar.i, j2, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.i, j2);
        }
        String realmGet$name = cartProductEntity.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, aVar.j, j2, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.j, j2, false);
        }
        Table.nativeSetLong(nativePtr, aVar.k, j2, cartProductEntity.realmGet$dough(), false);
        Table.nativeSetBoolean(nativePtr, aVar.l, j2, cartProductEntity.realmGet$isInStop(), false);
        return j2;
    }

    static com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(CartProductEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy com_dodopizza_persistence_entity_cart_cartproductentityrealmproxy = new com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_cart_cartproductentityrealmproxy;
    }

    static CartProductEntity k(d0 d0Var, a aVar, CartProductEntity cartProductEntity, CartProductEntity cartProductEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(CartProductEntity.class), set);
        osObjectBuilder.E0(aVar.e, cartProductEntity2.realmGet$externalId());
        osObjectBuilder.E0(aVar.f, cartProductEntity2.realmGet$category());
        osObjectBuilder.l0(aVar.g, Double.valueOf(cartProductEntity2.realmGet$price()));
        osObjectBuilder.o0(aVar.h, Integer.valueOf(cartProductEntity2.realmGet$size()));
        ImageEntity realmGet$image = cartProductEntity2.realmGet$image();
        if (realmGet$image == null) {
            osObjectBuilder.r0(aVar.i);
        } else {
            ImageEntity imageEntity = (ImageEntity) map.get(realmGet$image);
            if (imageEntity != null) {
                osObjectBuilder.x0(aVar.i, imageEntity);
            } else {
                osObjectBuilder.x0(aVar.i, com_dodopizza_persistence_entity_ImageEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_ImageEntityRealmProxy.a) d0Var.u().e(ImageEntity.class), realmGet$image, true, map, set));
            }
        }
        osObjectBuilder.E0(aVar.j, cartProductEntity2.realmGet$name());
        osObjectBuilder.o0(aVar.k, Integer.valueOf(cartProductEntity2.realmGet$dough()));
        osObjectBuilder.j0(aVar.l, Boolean.valueOf(cartProductEntity2.realmGet$isInStop()));
        osObjectBuilder.E0(aVar.m, cartProductEntity2.realmGet$id());
        osObjectBuilder.K0();
        return cartProductEntity;
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
        c0<CartProductEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy com_dodopizza_persistence_entity_cart_cartproductentityrealmproxy = (com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_cart_cartproductentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_cart_cartproductentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_cart_cartproductentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.cart.CartProductEntity, defpackage.nfc
    public String realmGet$category() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartProductEntity, defpackage.nfc
    public int realmGet$dough() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartProductEntity, defpackage.nfc
    public String realmGet$externalId() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartProductEntity, defpackage.nfc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.m);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartProductEntity, defpackage.nfc
    public ImageEntity realmGet$image() {
        this.c.f().c();
        if (this.c.g().o0(this.b.i)) {
            return null;
        }
        return (ImageEntity) this.c.f().o(ImageEntity.class, this.c.g().L(this.b.i), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.CartProductEntity, defpackage.nfc
    public boolean realmGet$isInStop() {
        this.c.f().c();
        return this.c.g().b0(this.b.l);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartProductEntity, defpackage.nfc
    public String realmGet$name() {
        this.c.f().c();
        return this.c.g().p0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartProductEntity, defpackage.nfc
    public double realmGet$price() {
        this.c.f().c();
        return this.c.g().K(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartProductEntity, defpackage.nfc
    public int realmGet$size() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartProductEntity, defpackage.nfc
    public void realmSet$category(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.f, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'category' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'category' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.CartProductEntity, defpackage.nfc
    public void realmSet$dough(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.k, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.k, i);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartProductEntity, defpackage.nfc
    public void realmSet$externalId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.e, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.e, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.e);
        } else {
            this.c.g().i(this.b.e, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.CartProductEntity, defpackage.nfc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.cart.CartProductEntity, defpackage.nfc
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
                g.l0(this.b.i);
                return;
            }
            this.c.c(imageEntity);
            g.o().B(this.b.i, g.E0(), ((r89) imageEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (imageEntity == null) {
            this.c.g().l0(this.b.i);
            return;
        }
        this.c.c(imageEntity);
        this.c.g().s(this.b.i, ((r89) imageEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.CartProductEntity, defpackage.nfc
    public void realmSet$isInStop(boolean z) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().y(this.b.l, g.E0(), z, true);
            return;
        }
        this.c.f().c();
        this.c.g().Q(this.b.l, z);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartProductEntity, defpackage.nfc
    public void realmSet$name(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.j, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.j, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.CartProductEntity, defpackage.nfc
    public void realmSet$price(double d2) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.g, g.E0(), d2, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.g, d2);
    }

    @Override // com.dodopizza.persistence.entity.cart.CartProductEntity, defpackage.nfc
    public void realmSet$size(int i) {
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

    public String toString() {
        String str;
        String str2;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CartProductEntity = proxy[");
        sb.append("{externalId:");
        String str3 = "null";
        if (realmGet$externalId() == null) {
            str = "null";
        } else {
            str = realmGet$externalId();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{category:");
        sb.append(realmGet$category());
        sb.append("}");
        sb.append(",");
        sb.append("{price:");
        sb.append(realmGet$price());
        sb.append("}");
        sb.append(",");
        sb.append("{size:");
        sb.append(realmGet$size());
        sb.append("}");
        sb.append(",");
        sb.append("{image:");
        if (realmGet$image() == null) {
            str2 = "null";
        } else {
            str2 = "ImageEntity";
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(realmGet$name());
        sb.append("}");
        sb.append(",");
        sb.append("{dough:");
        sb.append(realmGet$dough());
        sb.append("}");
        sb.append(",");
        sb.append("{isInStop:");
        sb.append(realmGet$isInStop());
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
