package io.realm;

import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.cart.AppliedInfoEntity;
import com.dodopizza.persistence.entity.cart.DataPromoCodeEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_BonusActionEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
public class com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy extends DataPromoCodeEntity implements r89, qfc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<DataPromoCodeEntity> c;

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
            OsObjectSchemaInfo b = osSchemaInfo.b("DataPromoCodeEntity");
            this.e = a("promoCode", "promoCode", b);
            this.f = a("status", "status", b);
            this.g = a("appliedInfo", "appliedInfo", b);
            this.h = a("description", "description", b);
            this.i = a("bonusAction", "bonusAction", b);
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
    public com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy() {
        this.c.p();
    }

    public static DataPromoCodeEntity c(d0 d0Var, a aVar, DataPromoCodeEntity dataPromoCodeEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(dataPromoCodeEntity);
        if (r89Var != null) {
            return (DataPromoCodeEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(DataPromoCodeEntity.class), set);
        osObjectBuilder.E0(aVar.e, dataPromoCodeEntity.realmGet$promoCode());
        osObjectBuilder.o0(aVar.f, Integer.valueOf(dataPromoCodeEntity.realmGet$status()));
        osObjectBuilder.E0(aVar.h, dataPromoCodeEntity.realmGet$description());
        com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(dataPromoCodeEntity, j);
        AppliedInfoEntity realmGet$appliedInfo = dataPromoCodeEntity.realmGet$appliedInfo();
        if (realmGet$appliedInfo == null) {
            j.realmSet$appliedInfo(null);
        } else {
            AppliedInfoEntity appliedInfoEntity = (AppliedInfoEntity) map.get(realmGet$appliedInfo);
            if (appliedInfoEntity != null) {
                j.realmSet$appliedInfo(appliedInfoEntity);
            } else {
                j.realmSet$appliedInfo(com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy.a) d0Var.u().e(AppliedInfoEntity.class), realmGet$appliedInfo, z, map, set));
            }
        }
        BonusActionEntity realmGet$bonusAction = dataPromoCodeEntity.realmGet$bonusAction();
        if (realmGet$bonusAction == null) {
            j.realmSet$bonusAction(null);
        } else {
            BonusActionEntity bonusActionEntity = (BonusActionEntity) map.get(realmGet$bonusAction);
            if (bonusActionEntity != null) {
                j.realmSet$bonusAction(bonusActionEntity);
            } else {
                j.realmSet$bonusAction(com_dodopizza_persistence_entity_BonusActionEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_BonusActionEntityRealmProxy.a) d0Var.u().e(BonusActionEntity.class), realmGet$bonusAction, z, map, set));
            }
        }
        return j;
    }

    public static DataPromoCodeEntity d(d0 d0Var, a aVar, DataPromoCodeEntity dataPromoCodeEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        if ((dataPromoCodeEntity instanceof r89) && !n0.isFrozen(dataPromoCodeEntity)) {
            r89 r89Var = (r89) dataPromoCodeEntity;
            if (r89Var.a().f() != null) {
                io.realm.a f = r89Var.a().f();
                if (f.b == d0Var.b) {
                    if (f.getPath().equals(d0Var.getPath())) {
                        return dataPromoCodeEntity;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.k.get();
        r89 r89Var2 = map.get(dataPromoCodeEntity);
        if (r89Var2 != null) {
            return (DataPromoCodeEntity) r89Var2;
        }
        return c(d0Var, aVar, dataPromoCodeEntity, z, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static DataPromoCodeEntity f(DataPromoCodeEntity dataPromoCodeEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        DataPromoCodeEntity dataPromoCodeEntity2;
        if (i <= i2 && dataPromoCodeEntity != null) {
            r89.a<o89> aVar = map.get(dataPromoCodeEntity);
            if (aVar == null) {
                dataPromoCodeEntity2 = new DataPromoCodeEntity();
                map.put(dataPromoCodeEntity, new r89.a<>(i, dataPromoCodeEntity2));
            } else if (i >= aVar.a) {
                return (DataPromoCodeEntity) aVar.b;
            } else {
                aVar.a = i;
                dataPromoCodeEntity2 = (DataPromoCodeEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) dataPromoCodeEntity).a().f();
            dataPromoCodeEntity2.realmSet$promoCode(dataPromoCodeEntity.realmGet$promoCode());
            dataPromoCodeEntity2.realmSet$status(dataPromoCodeEntity.realmGet$status());
            int i3 = i + 1;
            dataPromoCodeEntity2.realmSet$appliedInfo(com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy.f(dataPromoCodeEntity.realmGet$appliedInfo(), i3, i2, map));
            dataPromoCodeEntity2.realmSet$description(dataPromoCodeEntity.realmGet$description());
            dataPromoCodeEntity2.realmSet$bonusAction(com_dodopizza_persistence_entity_BonusActionEntityRealmProxy.f(dataPromoCodeEntity.realmGet$bonusAction(), i3, i2, map));
            return dataPromoCodeEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "DataPromoCodeEntity", false, 5, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "promoCode", realmFieldType, false, false, false);
        bVar.b("", "status", RealmFieldType.INTEGER, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.OBJECT;
        bVar.a("", "appliedInfo", realmFieldType2, "AppliedInfoEntity");
        bVar.b("", "description", realmFieldType, false, false, false);
        bVar.a("", "bonusAction", realmFieldType2, "BonusActionEntity");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, DataPromoCodeEntity dataPromoCodeEntity, Map<o89, Long> map) {
        if ((dataPromoCodeEntity instanceof r89) && !n0.isFrozen(dataPromoCodeEntity)) {
            r89 r89Var = (r89) dataPromoCodeEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(DataPromoCodeEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(DataPromoCodeEntity.class);
        long createRow = OsObject.createRow(I0);
        map.put(dataPromoCodeEntity, Long.valueOf(createRow));
        String realmGet$promoCode = dataPromoCodeEntity.realmGet$promoCode();
        if (realmGet$promoCode != null) {
            Table.nativeSetString(nativePtr, aVar.e, createRow, realmGet$promoCode, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.e, createRow, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f, createRow, dataPromoCodeEntity.realmGet$status(), false);
        AppliedInfoEntity realmGet$appliedInfo = dataPromoCodeEntity.realmGet$appliedInfo();
        if (realmGet$appliedInfo != null) {
            Long l = map.get(realmGet$appliedInfo);
            if (l == null) {
                l = Long.valueOf(com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy.i(d0Var, realmGet$appliedInfo, map));
            }
            Table.nativeSetLink(nativePtr, aVar.g, createRow, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.g, createRow);
        }
        String realmGet$description = dataPromoCodeEntity.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, aVar.h, createRow, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, createRow, false);
        }
        BonusActionEntity realmGet$bonusAction = dataPromoCodeEntity.realmGet$bonusAction();
        if (realmGet$bonusAction != null) {
            Long l2 = map.get(realmGet$bonusAction);
            if (l2 == null) {
                l2 = Long.valueOf(com_dodopizza_persistence_entity_BonusActionEntityRealmProxy.i(d0Var, realmGet$bonusAction, map));
            }
            Table.nativeSetLink(nativePtr, aVar.i, createRow, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.i, createRow);
        }
        return createRow;
    }

    static com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(DataPromoCodeEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy com_dodopizza_persistence_entity_cart_datapromocodeentityrealmproxy = new com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_cart_datapromocodeentityrealmproxy;
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
        c0<DataPromoCodeEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy com_dodopizza_persistence_entity_cart_datapromocodeentityrealmproxy = (com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_cart_datapromocodeentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_cart_datapromocodeentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_cart_datapromocodeentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.cart.DataPromoCodeEntity, defpackage.qfc
    public AppliedInfoEntity realmGet$appliedInfo() {
        this.c.f().c();
        if (this.c.g().o0(this.b.g)) {
            return null;
        }
        return (AppliedInfoEntity) this.c.f().o(AppliedInfoEntity.class, this.c.g().L(this.b.g), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPromoCodeEntity, defpackage.qfc
    public BonusActionEntity realmGet$bonusAction() {
        this.c.f().c();
        if (this.c.g().o0(this.b.i)) {
            return null;
        }
        return (BonusActionEntity) this.c.f().o(BonusActionEntity.class, this.c.g().L(this.b.i), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPromoCodeEntity, defpackage.qfc
    public String realmGet$description() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPromoCodeEntity, defpackage.qfc
    public String realmGet$promoCode() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPromoCodeEntity, defpackage.qfc
    public int realmGet$status() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPromoCodeEntity, defpackage.qfc
    public void realmSet$appliedInfo(AppliedInfoEntity appliedInfoEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("appliedInfo")) {
                return;
            }
            if (appliedInfoEntity != null && !n0.isManaged(appliedInfoEntity)) {
                appliedInfoEntity = (AppliedInfoEntity) d0Var.j0(appliedInfoEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (appliedInfoEntity == null) {
                g.l0(this.b.g);
                return;
            }
            this.c.c(appliedInfoEntity);
            g.o().B(this.b.g, g.E0(), ((r89) appliedInfoEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (appliedInfoEntity == null) {
            this.c.g().l0(this.b.g);
            return;
        }
        this.c.c(appliedInfoEntity);
        this.c.g().s(this.b.g, ((r89) appliedInfoEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPromoCodeEntity, defpackage.qfc
    public void realmSet$bonusAction(BonusActionEntity bonusActionEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("bonusAction")) {
                return;
            }
            if (bonusActionEntity != null && !n0.isManaged(bonusActionEntity)) {
                bonusActionEntity = (BonusActionEntity) d0Var.j0(bonusActionEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (bonusActionEntity == null) {
                g.l0(this.b.i);
                return;
            }
            this.c.c(bonusActionEntity);
            g.o().B(this.b.i, g.E0(), ((r89) bonusActionEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (bonusActionEntity == null) {
            this.c.g().l0(this.b.i);
            return;
        }
        this.c.c(bonusActionEntity);
        this.c.g().s(this.b.i, ((r89) bonusActionEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPromoCodeEntity, defpackage.qfc
    public void realmSet$description(String str) {
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

    @Override // com.dodopizza.persistence.entity.cart.DataPromoCodeEntity, defpackage.qfc
    public void realmSet$promoCode(String str) {
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

    @Override // com.dodopizza.persistence.entity.cart.DataPromoCodeEntity, defpackage.qfc
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

    public String toString() {
        String str;
        String str2;
        String str3;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("DataPromoCodeEntity = proxy[");
        sb.append("{promoCode:");
        String str4 = "null";
        if (realmGet$promoCode() == null) {
            str = "null";
        } else {
            str = realmGet$promoCode();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{status:");
        sb.append(realmGet$status());
        sb.append("}");
        sb.append(",");
        sb.append("{appliedInfo:");
        if (realmGet$appliedInfo() == null) {
            str2 = "null";
        } else {
            str2 = "AppliedInfoEntity";
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{description:");
        if (realmGet$description() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$description();
        }
        sb.append(str3);
        sb.append("}");
        sb.append(",");
        sb.append("{bonusAction:");
        if (realmGet$bonusAction() != null) {
            str4 = "BonusActionEntity";
        }
        sb.append(str4);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
