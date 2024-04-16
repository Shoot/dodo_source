package io.realm;

import com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity;
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
public class com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy extends PersonalPromoActionEntity implements r89, ufc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<PersonalPromoActionEntity> c;

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
            OsObjectSchemaInfo b = osSchemaInfo.b("PersonalPromoActionEntity");
            this.e = a("id", "id", b);
            this.f = a("status", "status", b);
            this.g = a("description", "description", b);
            this.h = a("title", "title", b);
            this.i = a("errorMessage", "errorMessage", b);
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
    public com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy() {
        this.c.p();
    }

    public static PersonalPromoActionEntity c(d0 d0Var, a aVar, PersonalPromoActionEntity personalPromoActionEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(personalPromoActionEntity);
        if (r89Var != null) {
            return (PersonalPromoActionEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PersonalPromoActionEntity.class), set);
        osObjectBuilder.E0(aVar.e, personalPromoActionEntity.realmGet$id());
        osObjectBuilder.o0(aVar.f, Integer.valueOf(personalPromoActionEntity.realmGet$status()));
        osObjectBuilder.E0(aVar.g, personalPromoActionEntity.realmGet$description());
        osObjectBuilder.E0(aVar.h, personalPromoActionEntity.realmGet$title());
        osObjectBuilder.E0(aVar.i, personalPromoActionEntity.realmGet$errorMessage());
        com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(personalPromoActionEntity, j);
        return j;
    }

    public static PersonalPromoActionEntity d(d0 d0Var, a aVar, PersonalPromoActionEntity personalPromoActionEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        if ((personalPromoActionEntity instanceof r89) && !n0.isFrozen(personalPromoActionEntity)) {
            r89 r89Var = (r89) personalPromoActionEntity;
            if (r89Var.a().f() != null) {
                io.realm.a f = r89Var.a().f();
                if (f.b == d0Var.b) {
                    if (f.getPath().equals(d0Var.getPath())) {
                        return personalPromoActionEntity;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.k.get();
        r89 r89Var2 = map.get(personalPromoActionEntity);
        if (r89Var2 != null) {
            return (PersonalPromoActionEntity) r89Var2;
        }
        return c(d0Var, aVar, personalPromoActionEntity, z, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static PersonalPromoActionEntity f(PersonalPromoActionEntity personalPromoActionEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        PersonalPromoActionEntity personalPromoActionEntity2;
        if (i <= i2 && personalPromoActionEntity != null) {
            r89.a<o89> aVar = map.get(personalPromoActionEntity);
            if (aVar == null) {
                personalPromoActionEntity2 = new PersonalPromoActionEntity();
                map.put(personalPromoActionEntity, new r89.a<>(i, personalPromoActionEntity2));
            } else if (i >= aVar.a) {
                return (PersonalPromoActionEntity) aVar.b;
            } else {
                aVar.a = i;
                personalPromoActionEntity2 = (PersonalPromoActionEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) personalPromoActionEntity).a().f();
            personalPromoActionEntity2.realmSet$id(personalPromoActionEntity.realmGet$id());
            personalPromoActionEntity2.realmSet$status(personalPromoActionEntity.realmGet$status());
            personalPromoActionEntity2.realmSet$description(personalPromoActionEntity.realmGet$description());
            personalPromoActionEntity2.realmSet$title(personalPromoActionEntity.realmGet$title());
            personalPromoActionEntity2.realmSet$errorMessage(personalPromoActionEntity.realmGet$errorMessage());
            return personalPromoActionEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "PersonalPromoActionEntity", false, 5, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, false, false, false);
        bVar.b("", "status", RealmFieldType.INTEGER, false, false, true);
        bVar.b("", "description", realmFieldType, false, false, false);
        bVar.b("", "title", realmFieldType, false, false, false);
        bVar.b("", "errorMessage", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, PersonalPromoActionEntity personalPromoActionEntity, Map<o89, Long> map) {
        if ((personalPromoActionEntity instanceof r89) && !n0.isFrozen(personalPromoActionEntity)) {
            r89 r89Var = (r89) personalPromoActionEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(PersonalPromoActionEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(PersonalPromoActionEntity.class);
        long createRow = OsObject.createRow(I0);
        map.put(personalPromoActionEntity, Long.valueOf(createRow));
        String realmGet$id = personalPromoActionEntity.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, aVar.e, createRow, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.e, createRow, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f, createRow, personalPromoActionEntity.realmGet$status(), false);
        String realmGet$description = personalPromoActionEntity.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, aVar.g, createRow, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, createRow, false);
        }
        String realmGet$title = personalPromoActionEntity.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, aVar.h, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, createRow, false);
        }
        String realmGet$errorMessage = personalPromoActionEntity.realmGet$errorMessage();
        if (realmGet$errorMessage != null) {
            Table.nativeSetString(nativePtr, aVar.i, createRow, realmGet$errorMessage, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.i, createRow, false);
        }
        return createRow;
    }

    static com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(PersonalPromoActionEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy com_dodopizza_persistence_entity_cart_personalpromoactionentityrealmproxy = new com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_cart_personalpromoactionentityrealmproxy;
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
        c0<PersonalPromoActionEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy com_dodopizza_persistence_entity_cart_personalpromoactionentityrealmproxy = (com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_cart_personalpromoactionentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_cart_personalpromoactionentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_cart_personalpromoactionentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity, defpackage.ufc
    public String realmGet$description() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity, defpackage.ufc
    public String realmGet$errorMessage() {
        this.c.f().c();
        return this.c.g().p0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity, defpackage.ufc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity, defpackage.ufc
    public int realmGet$status() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity, defpackage.ufc
    public String realmGet$title() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity, defpackage.ufc
    public void realmSet$description(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.g, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.g, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.g);
        } else {
            this.c.g().i(this.b.g, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity, defpackage.ufc
    public void realmSet$errorMessage(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.i, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.i, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.i);
        } else {
            this.c.g().i(this.b.i, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity, defpackage.ufc
    public void realmSet$id(String str) {
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

    @Override // com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity, defpackage.ufc
    public void realmSet$status(int i) {
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

    @Override // com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity, defpackage.ufc
    public void realmSet$title(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.h, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.h, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.h);
        } else {
            this.c.g().i(this.b.h, str);
        }
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("PersonalPromoActionEntity = proxy[");
        sb.append("{id:");
        String str4 = "null";
        if (realmGet$id() == null) {
            str = "null";
        } else {
            str = realmGet$id();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{status:");
        sb.append(realmGet$status());
        sb.append("}");
        sb.append(",");
        sb.append("{description:");
        if (realmGet$description() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$description();
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        if (realmGet$title() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$title();
        }
        sb.append(str3);
        sb.append("}");
        sb.append(",");
        sb.append("{errorMessage:");
        if (realmGet$errorMessage() != null) {
            str4 = realmGet$errorMessage();
        }
        sb.append(str4);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
