package io.realm;

import com.dodopizza.persistence.entity.payment.CardEntity;
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
public class com_dodopizza_persistence_entity_payment_CardEntityRealmProxy extends CardEntity implements r89, dhc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<CardEntity> c;

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
            OsObjectSchemaInfo b = osSchemaInfo.b("CardEntity");
            this.e = a("id", "id", b);
            this.f = a("startPart", "startPart", b);
            this.g = a("endPart", "endPart", b);
            this.h = a("expiryMonth", "expiryMonth", b);
            this.i = a("expiryYear", "expiryYear", b);
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
    public com_dodopizza_persistence_entity_payment_CardEntityRealmProxy() {
        this.c.p();
    }

    public static CardEntity c(d0 d0Var, a aVar, CardEntity cardEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(cardEntity);
        if (r89Var != null) {
            return (CardEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(CardEntity.class), set);
        osObjectBuilder.E0(aVar.e, cardEntity.realmGet$id());
        osObjectBuilder.E0(aVar.f, cardEntity.realmGet$startPart());
        osObjectBuilder.E0(aVar.g, cardEntity.realmGet$endPart());
        osObjectBuilder.E0(aVar.h, cardEntity.realmGet$expiryMonth());
        osObjectBuilder.E0(aVar.i, cardEntity.realmGet$expiryYear());
        com_dodopizza_persistence_entity_payment_CardEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(cardEntity, j);
        return j;
    }

    public static CardEntity d(d0 d0Var, a aVar, CardEntity cardEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        if ((cardEntity instanceof r89) && !n0.isFrozen(cardEntity)) {
            r89 r89Var = (r89) cardEntity;
            if (r89Var.a().f() != null) {
                io.realm.a f = r89Var.a().f();
                if (f.b == d0Var.b) {
                    if (f.getPath().equals(d0Var.getPath())) {
                        return cardEntity;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.k.get();
        r89 r89Var2 = map.get(cardEntity);
        if (r89Var2 != null) {
            return (CardEntity) r89Var2;
        }
        return c(d0Var, aVar, cardEntity, z, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static CardEntity f(CardEntity cardEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        CardEntity cardEntity2;
        if (i <= i2 && cardEntity != null) {
            r89.a<o89> aVar = map.get(cardEntity);
            if (aVar == null) {
                cardEntity2 = new CardEntity();
                map.put(cardEntity, new r89.a<>(i, cardEntity2));
            } else if (i >= aVar.a) {
                return (CardEntity) aVar.b;
            } else {
                aVar.a = i;
                cardEntity2 = (CardEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) cardEntity).a().f();
            cardEntity2.realmSet$id(cardEntity.realmGet$id());
            cardEntity2.realmSet$startPart(cardEntity.realmGet$startPart());
            cardEntity2.realmSet$endPart(cardEntity.realmGet$endPart());
            cardEntity2.realmSet$expiryMonth(cardEntity.realmGet$expiryMonth());
            cardEntity2.realmSet$expiryYear(cardEntity.realmGet$expiryYear());
            return cardEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "CardEntity", false, 5, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, false, false, false);
        bVar.b("", "startPart", realmFieldType, false, false, false);
        bVar.b("", "endPart", realmFieldType, false, false, false);
        bVar.b("", "expiryMonth", realmFieldType, false, false, false);
        bVar.b("", "expiryYear", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, CardEntity cardEntity, Map<o89, Long> map) {
        if ((cardEntity instanceof r89) && !n0.isFrozen(cardEntity)) {
            r89 r89Var = (r89) cardEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(CardEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(CardEntity.class);
        long createRow = OsObject.createRow(I0);
        map.put(cardEntity, Long.valueOf(createRow));
        String realmGet$id = cardEntity.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, aVar.e, createRow, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.e, createRow, false);
        }
        String realmGet$startPart = cardEntity.realmGet$startPart();
        if (realmGet$startPart != null) {
            Table.nativeSetString(nativePtr, aVar.f, createRow, realmGet$startPart, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f, createRow, false);
        }
        String realmGet$endPart = cardEntity.realmGet$endPart();
        if (realmGet$endPart != null) {
            Table.nativeSetString(nativePtr, aVar.g, createRow, realmGet$endPart, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, createRow, false);
        }
        String realmGet$expiryMonth = cardEntity.realmGet$expiryMonth();
        if (realmGet$expiryMonth != null) {
            Table.nativeSetString(nativePtr, aVar.h, createRow, realmGet$expiryMonth, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, createRow, false);
        }
        String realmGet$expiryYear = cardEntity.realmGet$expiryYear();
        if (realmGet$expiryYear != null) {
            Table.nativeSetString(nativePtr, aVar.i, createRow, realmGet$expiryYear, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.i, createRow, false);
        }
        return createRow;
    }

    static com_dodopizza_persistence_entity_payment_CardEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(CardEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_payment_CardEntityRealmProxy com_dodopizza_persistence_entity_payment_cardentityrealmproxy = new com_dodopizza_persistence_entity_payment_CardEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_payment_cardentityrealmproxy;
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
        c0<CardEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_payment_CardEntityRealmProxy com_dodopizza_persistence_entity_payment_cardentityrealmproxy = (com_dodopizza_persistence_entity_payment_CardEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_payment_cardentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_payment_cardentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_payment_cardentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.payment.CardEntity, defpackage.dhc
    public String realmGet$endPart() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.payment.CardEntity, defpackage.dhc
    public String realmGet$expiryMonth() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.payment.CardEntity, defpackage.dhc
    public String realmGet$expiryYear() {
        this.c.f().c();
        return this.c.g().p0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.payment.CardEntity, defpackage.dhc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.payment.CardEntity, defpackage.dhc
    public String realmGet$startPart() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.payment.CardEntity, defpackage.dhc
    public void realmSet$endPart(String str) {
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

    @Override // com.dodopizza.persistence.entity.payment.CardEntity, defpackage.dhc
    public void realmSet$expiryMonth(String str) {
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

    @Override // com.dodopizza.persistence.entity.payment.CardEntity, defpackage.dhc
    public void realmSet$expiryYear(String str) {
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

    @Override // com.dodopizza.persistence.entity.payment.CardEntity, defpackage.dhc
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

    @Override // com.dodopizza.persistence.entity.payment.CardEntity, defpackage.dhc
    public void realmSet$startPart(String str) {
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

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CardEntity = proxy[");
        sb.append("{id:");
        String str5 = "null";
        if (realmGet$id() == null) {
            str = "null";
        } else {
            str = realmGet$id();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{startPart:");
        if (realmGet$startPart() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$startPart();
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{endPart:");
        if (realmGet$endPart() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$endPart();
        }
        sb.append(str3);
        sb.append("}");
        sb.append(",");
        sb.append("{expiryMonth:");
        if (realmGet$expiryMonth() == null) {
            str4 = "null";
        } else {
            str4 = realmGet$expiryMonth();
        }
        sb.append(str4);
        sb.append("}");
        sb.append(",");
        sb.append("{expiryYear:");
        if (realmGet$expiryYear() != null) {
            str5 = realmGet$expiryYear();
        }
        sb.append(str5);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
