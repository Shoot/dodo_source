package io.realm;

import com.dodopizza.persistence.entity.cart.DataPaymentEntity;
import com.dodopizza.persistence.entity.cart.EncryptionDataEntity;
import com.dodopizza.persistence.entity.payment.CardEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_payment_CardEntityRealmProxy;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
public class com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy extends DataPaymentEntity implements r89, pfc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<DataPaymentEntity> c;

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
        long n;
        long o;
        long p;
        long q;
        long r;
        long s;
        long t;

        a(OsSchemaInfo osSchemaInfo) {
            super(16);
            OsObjectSchemaInfo b = osSchemaInfo.b("DataPaymentEntity");
            this.e = a("paymentId", "paymentId", b);
            this.f = a("paymentType", "paymentType", b);
            this.g = a("paymentMethodType", "paymentMethodType", b);
            this.h = a("clientNotes", "clientNotes", b);
            this.i = a("card", "card", b);
            this.j = a("redirectUrl", "redirectUrl", b);
            this.k = a("successUrl", "successUrl", b);
            this.l = a("failureUrl", "failureUrl", b);
            this.m = a("invoiceExpirationInMinutes", "invoiceExpirationInMinutes", b);
            this.n = a("authorizeUrl", "authorizeUrl", b);
            this.o = a("acquirerName", "acquirerName", b);
            this.p = a("brandName", "brandName", b);
            this.q = a("encryptionData", "encryptionData", b);
            this.r = a("pizzeriaPaymentKey", "pizzeriaPaymentKey", b);
            this.s = a("googlePayPaymentRequest", "googlePayPaymentRequest", b);
            this.t = a("integrationType", "integrationType", b);
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
            aVar2.n = aVar.n;
            aVar2.o = aVar.o;
            aVar2.p = aVar.p;
            aVar2.q = aVar.q;
            aVar2.r = aVar.r;
            aVar2.s = aVar.s;
            aVar2.t = aVar.t;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy() {
        this.c.p();
    }

    public static DataPaymentEntity c(d0 d0Var, a aVar, DataPaymentEntity dataPaymentEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(dataPaymentEntity);
        if (r89Var != null) {
            return (DataPaymentEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(DataPaymentEntity.class), set);
        osObjectBuilder.E0(aVar.e, dataPaymentEntity.realmGet$paymentId());
        osObjectBuilder.o0(aVar.f, Integer.valueOf(dataPaymentEntity.realmGet$paymentType()));
        osObjectBuilder.o0(aVar.g, Integer.valueOf(dataPaymentEntity.realmGet$paymentMethodType()));
        osObjectBuilder.l0(aVar.h, dataPaymentEntity.realmGet$clientNotes());
        osObjectBuilder.E0(aVar.j, dataPaymentEntity.realmGet$redirectUrl());
        osObjectBuilder.E0(aVar.k, dataPaymentEntity.realmGet$successUrl());
        osObjectBuilder.E0(aVar.l, dataPaymentEntity.realmGet$failureUrl());
        osObjectBuilder.o0(aVar.m, Integer.valueOf(dataPaymentEntity.realmGet$invoiceExpirationInMinutes()));
        osObjectBuilder.E0(aVar.n, dataPaymentEntity.realmGet$authorizeUrl());
        osObjectBuilder.E0(aVar.o, dataPaymentEntity.realmGet$acquirerName());
        osObjectBuilder.E0(aVar.p, dataPaymentEntity.realmGet$brandName());
        osObjectBuilder.E0(aVar.r, dataPaymentEntity.realmGet$pizzeriaPaymentKey());
        osObjectBuilder.E0(aVar.s, dataPaymentEntity.realmGet$googlePayPaymentRequest());
        osObjectBuilder.E0(aVar.t, dataPaymentEntity.realmGet$integrationType());
        com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(dataPaymentEntity, j);
        CardEntity realmGet$card = dataPaymentEntity.realmGet$card();
        if (realmGet$card == null) {
            j.realmSet$card(null);
        } else {
            CardEntity cardEntity = (CardEntity) map.get(realmGet$card);
            if (cardEntity != null) {
                j.realmSet$card(cardEntity);
            } else {
                j.realmSet$card(com_dodopizza_persistence_entity_payment_CardEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_payment_CardEntityRealmProxy.a) d0Var.u().e(CardEntity.class), realmGet$card, z, map, set));
            }
        }
        EncryptionDataEntity realmGet$encryptionData = dataPaymentEntity.realmGet$encryptionData();
        if (realmGet$encryptionData == null) {
            j.realmSet$encryptionData(null);
        } else {
            EncryptionDataEntity encryptionDataEntity = (EncryptionDataEntity) map.get(realmGet$encryptionData);
            if (encryptionDataEntity != null) {
                j.realmSet$encryptionData(encryptionDataEntity);
            } else {
                j.realmSet$encryptionData(com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy.a) d0Var.u().e(EncryptionDataEntity.class), realmGet$encryptionData, z, map, set));
            }
        }
        return j;
    }

    public static DataPaymentEntity d(d0 d0Var, a aVar, DataPaymentEntity dataPaymentEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        if ((dataPaymentEntity instanceof r89) && !n0.isFrozen(dataPaymentEntity)) {
            r89 r89Var = (r89) dataPaymentEntity;
            if (r89Var.a().f() != null) {
                io.realm.a f = r89Var.a().f();
                if (f.b == d0Var.b) {
                    if (f.getPath().equals(d0Var.getPath())) {
                        return dataPaymentEntity;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.k.get();
        r89 r89Var2 = map.get(dataPaymentEntity);
        if (r89Var2 != null) {
            return (DataPaymentEntity) r89Var2;
        }
        return c(d0Var, aVar, dataPaymentEntity, z, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static DataPaymentEntity f(DataPaymentEntity dataPaymentEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        DataPaymentEntity dataPaymentEntity2;
        if (i <= i2 && dataPaymentEntity != null) {
            r89.a<o89> aVar = map.get(dataPaymentEntity);
            if (aVar == null) {
                dataPaymentEntity2 = new DataPaymentEntity();
                map.put(dataPaymentEntity, new r89.a<>(i, dataPaymentEntity2));
            } else if (i >= aVar.a) {
                return (DataPaymentEntity) aVar.b;
            } else {
                aVar.a = i;
                dataPaymentEntity2 = (DataPaymentEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) dataPaymentEntity).a().f();
            dataPaymentEntity2.realmSet$paymentId(dataPaymentEntity.realmGet$paymentId());
            dataPaymentEntity2.realmSet$paymentType(dataPaymentEntity.realmGet$paymentType());
            dataPaymentEntity2.realmSet$paymentMethodType(dataPaymentEntity.realmGet$paymentMethodType());
            dataPaymentEntity2.realmSet$clientNotes(dataPaymentEntity.realmGet$clientNotes());
            int i3 = i + 1;
            dataPaymentEntity2.realmSet$card(com_dodopizza_persistence_entity_payment_CardEntityRealmProxy.f(dataPaymentEntity.realmGet$card(), i3, i2, map));
            dataPaymentEntity2.realmSet$redirectUrl(dataPaymentEntity.realmGet$redirectUrl());
            dataPaymentEntity2.realmSet$successUrl(dataPaymentEntity.realmGet$successUrl());
            dataPaymentEntity2.realmSet$failureUrl(dataPaymentEntity.realmGet$failureUrl());
            dataPaymentEntity2.realmSet$invoiceExpirationInMinutes(dataPaymentEntity.realmGet$invoiceExpirationInMinutes());
            dataPaymentEntity2.realmSet$authorizeUrl(dataPaymentEntity.realmGet$authorizeUrl());
            dataPaymentEntity2.realmSet$acquirerName(dataPaymentEntity.realmGet$acquirerName());
            dataPaymentEntity2.realmSet$brandName(dataPaymentEntity.realmGet$brandName());
            dataPaymentEntity2.realmSet$encryptionData(com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy.f(dataPaymentEntity.realmGet$encryptionData(), i3, i2, map));
            dataPaymentEntity2.realmSet$pizzeriaPaymentKey(dataPaymentEntity.realmGet$pizzeriaPaymentKey());
            dataPaymentEntity2.realmSet$googlePayPaymentRequest(dataPaymentEntity.realmGet$googlePayPaymentRequest());
            dataPaymentEntity2.realmSet$integrationType(dataPaymentEntity.realmGet$integrationType());
            return dataPaymentEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "DataPaymentEntity", false, 16, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "paymentId", realmFieldType, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.b("", "paymentType", realmFieldType2, false, false, true);
        bVar.b("", "paymentMethodType", realmFieldType2, false, false, true);
        bVar.b("", "clientNotes", RealmFieldType.DOUBLE, false, false, false);
        RealmFieldType realmFieldType3 = RealmFieldType.OBJECT;
        bVar.a("", "card", realmFieldType3, "CardEntity");
        bVar.b("", "redirectUrl", realmFieldType, false, false, true);
        bVar.b("", "successUrl", realmFieldType, false, false, true);
        bVar.b("", "failureUrl", realmFieldType, false, false, true);
        bVar.b("", "invoiceExpirationInMinutes", realmFieldType2, false, false, true);
        bVar.b("", "authorizeUrl", realmFieldType, false, false, true);
        bVar.b("", "acquirerName", realmFieldType, false, false, true);
        bVar.b("", "brandName", realmFieldType, false, false, true);
        bVar.a("", "encryptionData", realmFieldType3, "EncryptionDataEntity");
        bVar.b("", "pizzeriaPaymentKey", realmFieldType, false, false, false);
        bVar.b("", "googlePayPaymentRequest", realmFieldType, false, false, false);
        bVar.b("", "integrationType", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, DataPaymentEntity dataPaymentEntity, Map<o89, Long> map) {
        if ((dataPaymentEntity instanceof r89) && !n0.isFrozen(dataPaymentEntity)) {
            r89 r89Var = (r89) dataPaymentEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(DataPaymentEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(DataPaymentEntity.class);
        long createRow = OsObject.createRow(I0);
        map.put(dataPaymentEntity, Long.valueOf(createRow));
        String realmGet$paymentId = dataPaymentEntity.realmGet$paymentId();
        if (realmGet$paymentId != null) {
            Table.nativeSetString(nativePtr, aVar.e, createRow, realmGet$paymentId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.e, createRow, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f, createRow, dataPaymentEntity.realmGet$paymentType(), false);
        Table.nativeSetLong(nativePtr, aVar.g, createRow, dataPaymentEntity.realmGet$paymentMethodType(), false);
        Double realmGet$clientNotes = dataPaymentEntity.realmGet$clientNotes();
        if (realmGet$clientNotes != null) {
            Table.nativeSetDouble(nativePtr, aVar.h, createRow, realmGet$clientNotes.doubleValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, createRow, false);
        }
        CardEntity realmGet$card = dataPaymentEntity.realmGet$card();
        if (realmGet$card != null) {
            Long l = map.get(realmGet$card);
            if (l == null) {
                l = Long.valueOf(com_dodopizza_persistence_entity_payment_CardEntityRealmProxy.i(d0Var, realmGet$card, map));
            }
            Table.nativeSetLink(nativePtr, aVar.i, createRow, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.i, createRow);
        }
        String realmGet$redirectUrl = dataPaymentEntity.realmGet$redirectUrl();
        if (realmGet$redirectUrl != null) {
            Table.nativeSetString(nativePtr, aVar.j, createRow, realmGet$redirectUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.j, createRow, false);
        }
        String realmGet$successUrl = dataPaymentEntity.realmGet$successUrl();
        if (realmGet$successUrl != null) {
            Table.nativeSetString(nativePtr, aVar.k, createRow, realmGet$successUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.k, createRow, false);
        }
        String realmGet$failureUrl = dataPaymentEntity.realmGet$failureUrl();
        if (realmGet$failureUrl != null) {
            Table.nativeSetString(nativePtr, aVar.l, createRow, realmGet$failureUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.l, createRow, false);
        }
        Table.nativeSetLong(nativePtr, aVar.m, createRow, dataPaymentEntity.realmGet$invoiceExpirationInMinutes(), false);
        String realmGet$authorizeUrl = dataPaymentEntity.realmGet$authorizeUrl();
        if (realmGet$authorizeUrl != null) {
            Table.nativeSetString(nativePtr, aVar.n, createRow, realmGet$authorizeUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.n, createRow, false);
        }
        String realmGet$acquirerName = dataPaymentEntity.realmGet$acquirerName();
        if (realmGet$acquirerName != null) {
            Table.nativeSetString(nativePtr, aVar.o, createRow, realmGet$acquirerName, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.o, createRow, false);
        }
        String realmGet$brandName = dataPaymentEntity.realmGet$brandName();
        if (realmGet$brandName != null) {
            Table.nativeSetString(nativePtr, aVar.p, createRow, realmGet$brandName, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.p, createRow, false);
        }
        EncryptionDataEntity realmGet$encryptionData = dataPaymentEntity.realmGet$encryptionData();
        if (realmGet$encryptionData != null) {
            Long l2 = map.get(realmGet$encryptionData);
            if (l2 == null) {
                l2 = Long.valueOf(com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy.i(d0Var, realmGet$encryptionData, map));
            }
            Table.nativeSetLink(nativePtr, aVar.q, createRow, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.q, createRow);
        }
        String realmGet$pizzeriaPaymentKey = dataPaymentEntity.realmGet$pizzeriaPaymentKey();
        if (realmGet$pizzeriaPaymentKey != null) {
            Table.nativeSetString(nativePtr, aVar.r, createRow, realmGet$pizzeriaPaymentKey, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.r, createRow, false);
        }
        String realmGet$googlePayPaymentRequest = dataPaymentEntity.realmGet$googlePayPaymentRequest();
        if (realmGet$googlePayPaymentRequest != null) {
            Table.nativeSetString(nativePtr, aVar.s, createRow, realmGet$googlePayPaymentRequest, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.s, createRow, false);
        }
        String realmGet$integrationType = dataPaymentEntity.realmGet$integrationType();
        if (realmGet$integrationType != null) {
            Table.nativeSetString(nativePtr, aVar.t, createRow, realmGet$integrationType, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.t, createRow, false);
        }
        return createRow;
    }

    static com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(DataPaymentEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy com_dodopizza_persistence_entity_cart_datapaymententityrealmproxy = new com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_cart_datapaymententityrealmproxy;
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
        c0<DataPaymentEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy com_dodopizza_persistence_entity_cart_datapaymententityrealmproxy = (com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_cart_datapaymententityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_cart_datapaymententityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_cart_datapaymententityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public String realmGet$acquirerName() {
        this.c.f().c();
        return this.c.g().p0(this.b.o);
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public String realmGet$authorizeUrl() {
        this.c.f().c();
        return this.c.g().p0(this.b.n);
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public String realmGet$brandName() {
        this.c.f().c();
        return this.c.g().p0(this.b.p);
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public CardEntity realmGet$card() {
        this.c.f().c();
        if (this.c.g().o0(this.b.i)) {
            return null;
        }
        return (CardEntity) this.c.f().o(CardEntity.class, this.c.g().L(this.b.i), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public Double realmGet$clientNotes() {
        this.c.f().c();
        if (this.c.g().w(this.b.h)) {
            return null;
        }
        return Double.valueOf(this.c.g().K(this.b.h));
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public EncryptionDataEntity realmGet$encryptionData() {
        this.c.f().c();
        if (this.c.g().o0(this.b.q)) {
            return null;
        }
        return (EncryptionDataEntity) this.c.f().o(EncryptionDataEntity.class, this.c.g().L(this.b.q), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public String realmGet$failureUrl() {
        this.c.f().c();
        return this.c.g().p0(this.b.l);
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public String realmGet$googlePayPaymentRequest() {
        this.c.f().c();
        return this.c.g().p0(this.b.s);
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public String realmGet$integrationType() {
        this.c.f().c();
        return this.c.g().p0(this.b.t);
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public int realmGet$invoiceExpirationInMinutes() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.m);
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public String realmGet$paymentId() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public int realmGet$paymentMethodType() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public int realmGet$paymentType() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public String realmGet$pizzeriaPaymentKey() {
        this.c.f().c();
        return this.c.g().p0(this.b.r);
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public String realmGet$redirectUrl() {
        this.c.f().c();
        return this.c.g().p0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public String realmGet$successUrl() {
        this.c.f().c();
        return this.c.g().p0(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public void realmSet$acquirerName(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.o, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'acquirerName' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.o, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'acquirerName' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public void realmSet$authorizeUrl(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.n, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'authorizeUrl' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.n, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'authorizeUrl' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public void realmSet$brandName(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.p, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'brandName' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.p, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'brandName' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public void realmSet$card(CardEntity cardEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("card")) {
                return;
            }
            if (cardEntity != null && !n0.isManaged(cardEntity)) {
                cardEntity = (CardEntity) d0Var.f0(cardEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (cardEntity == null) {
                g.l0(this.b.i);
                return;
            }
            this.c.c(cardEntity);
            g.o().B(this.b.i, g.E0(), ((r89) cardEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (cardEntity == null) {
            this.c.g().l0(this.b.i);
            return;
        }
        this.c.c(cardEntity);
        this.c.g().s(this.b.i, ((r89) cardEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public void realmSet$clientNotes(Double d2) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (d2 == null) {
                g.o().D(this.b.h, g.E0(), true);
                return;
            } else {
                g.o().z(this.b.h, g.E0(), d2.doubleValue(), true);
                return;
            }
        }
        this.c.f().c();
        if (d2 == null) {
            this.c.g().G(this.b.h);
        } else {
            this.c.g().x0(this.b.h, d2.doubleValue());
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public void realmSet$encryptionData(EncryptionDataEntity encryptionDataEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("encryptionData")) {
                return;
            }
            if (encryptionDataEntity != null && !n0.isManaged(encryptionDataEntity)) {
                encryptionDataEntity = (EncryptionDataEntity) d0Var.j0(encryptionDataEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (encryptionDataEntity == null) {
                g.l0(this.b.q);
                return;
            }
            this.c.c(encryptionDataEntity);
            g.o().B(this.b.q, g.E0(), ((r89) encryptionDataEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (encryptionDataEntity == null) {
            this.c.g().l0(this.b.q);
            return;
        }
        this.c.c(encryptionDataEntity);
        this.c.g().s(this.b.q, ((r89) encryptionDataEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public void realmSet$failureUrl(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.l, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'failureUrl' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.l, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'failureUrl' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public void realmSet$googlePayPaymentRequest(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.s, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.s, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.s);
        } else {
            this.c.g().i(this.b.s, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public void realmSet$integrationType(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.t, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.t, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.t);
        } else {
            this.c.g().i(this.b.t, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public void realmSet$invoiceExpirationInMinutes(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.m, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.m, i);
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public void realmSet$paymentId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.e, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'paymentId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.e, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'paymentId' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public void realmSet$paymentMethodType(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.g, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.g, i);
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public void realmSet$paymentType(int i) {
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

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public void realmSet$pizzeriaPaymentKey(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.r, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.r, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.r);
        } else {
            this.c.g().i(this.b.r, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public void realmSet$redirectUrl(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.j, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'redirectUrl' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.j, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'redirectUrl' to null.");
    }

    @Override // com.dodopizza.persistence.entity.cart.DataPaymentEntity, defpackage.pfc
    public void realmSet$successUrl(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.k, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'successUrl' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.k, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'successUrl' to null.");
    }

    public String toString() {
        Double d2;
        String str;
        String str2;
        String str3;
        String str4;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("DataPaymentEntity = proxy[");
        sb.append("{paymentId:");
        sb.append(realmGet$paymentId());
        sb.append("}");
        sb.append(",");
        sb.append("{paymentType:");
        sb.append(realmGet$paymentType());
        sb.append("}");
        sb.append(",");
        sb.append("{paymentMethodType:");
        sb.append(realmGet$paymentMethodType());
        sb.append("}");
        sb.append(",");
        sb.append("{clientNotes:");
        String str5 = "null";
        if (realmGet$clientNotes() == null) {
            d2 = "null";
        } else {
            d2 = realmGet$clientNotes();
        }
        sb.append(d2);
        sb.append("}");
        sb.append(",");
        sb.append("{card:");
        if (realmGet$card() == null) {
            str = "null";
        } else {
            str = "CardEntity";
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{redirectUrl:");
        sb.append(realmGet$redirectUrl());
        sb.append("}");
        sb.append(",");
        sb.append("{successUrl:");
        sb.append(realmGet$successUrl());
        sb.append("}");
        sb.append(",");
        sb.append("{failureUrl:");
        sb.append(realmGet$failureUrl());
        sb.append("}");
        sb.append(",");
        sb.append("{invoiceExpirationInMinutes:");
        sb.append(realmGet$invoiceExpirationInMinutes());
        sb.append("}");
        sb.append(",");
        sb.append("{authorizeUrl:");
        sb.append(realmGet$authorizeUrl());
        sb.append("}");
        sb.append(",");
        sb.append("{acquirerName:");
        sb.append(realmGet$acquirerName());
        sb.append("}");
        sb.append(",");
        sb.append("{brandName:");
        sb.append(realmGet$brandName());
        sb.append("}");
        sb.append(",");
        sb.append("{encryptionData:");
        if (realmGet$encryptionData() == null) {
            str2 = "null";
        } else {
            str2 = "EncryptionDataEntity";
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{pizzeriaPaymentKey:");
        if (realmGet$pizzeriaPaymentKey() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$pizzeriaPaymentKey();
        }
        sb.append(str3);
        sb.append("}");
        sb.append(",");
        sb.append("{googlePayPaymentRequest:");
        if (realmGet$googlePayPaymentRequest() == null) {
            str4 = "null";
        } else {
            str4 = realmGet$googlePayPaymentRequest();
        }
        sb.append(str4);
        sb.append("}");
        sb.append(",");
        sb.append("{integrationType:");
        if (realmGet$integrationType() != null) {
            str5 = realmGet$integrationType();
        }
        sb.append(str5);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
