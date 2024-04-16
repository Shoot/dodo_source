package io.realm;

import com.dodopizza.persistence.entity.payment.CardEntity;
import com.dodopizza.persistence.entity.payment.GooglePayInitDataEntity;
import com.dodopizza.persistence.entity.payment.PaymentMethodEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_payment_CardEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_payment_GooglePayInitDataEntityRealmProxy;
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
public class com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy extends PaymentMethodEntity implements r89, fhc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<PaymentMethodEntity> c;

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
            OsObjectSchemaInfo b = osSchemaInfo.b("PaymentMethodEntity");
            this.e = a("id", "id", b);
            this.f = a("paymentType", "paymentType", b);
            this.g = a("acquirerName", "acquirerName", b);
            this.h = a("brandName", "brandName", b);
            this.i = a("integrationType", "integrationType", b);
            this.j = a("card", "card", b);
            this.k = a("priority", "priority", b);
            this.l = a("googlePayInitData", "googlePayInitData", b);
            this.m = a("isRedirectSaveCardEnabled", "isRedirectSaveCardEnabled", b);
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
    public com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy() {
        this.c.p();
    }

    public static PaymentMethodEntity c(d0 d0Var, a aVar, PaymentMethodEntity paymentMethodEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(paymentMethodEntity);
        if (r89Var != null) {
            return (PaymentMethodEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PaymentMethodEntity.class), set);
        osObjectBuilder.E0(aVar.e, paymentMethodEntity.realmGet$id());
        osObjectBuilder.o0(aVar.f, Integer.valueOf(paymentMethodEntity.realmGet$paymentType()));
        osObjectBuilder.E0(aVar.g, paymentMethodEntity.realmGet$acquirerName());
        osObjectBuilder.E0(aVar.h, paymentMethodEntity.realmGet$brandName());
        osObjectBuilder.E0(aVar.i, paymentMethodEntity.realmGet$integrationType());
        osObjectBuilder.o0(aVar.k, Integer.valueOf(paymentMethodEntity.realmGet$priority()));
        osObjectBuilder.j0(aVar.m, Boolean.valueOf(paymentMethodEntity.realmGet$isRedirectSaveCardEnabled()));
        com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(paymentMethodEntity, j);
        CardEntity realmGet$card = paymentMethodEntity.realmGet$card();
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
        GooglePayInitDataEntity realmGet$googlePayInitData = paymentMethodEntity.realmGet$googlePayInitData();
        if (realmGet$googlePayInitData == null) {
            j.realmSet$googlePayInitData(null);
        } else {
            GooglePayInitDataEntity googlePayInitDataEntity = (GooglePayInitDataEntity) map.get(realmGet$googlePayInitData);
            if (googlePayInitDataEntity != null) {
                j.realmSet$googlePayInitData(googlePayInitDataEntity);
            } else {
                j.realmSet$googlePayInitData(com_dodopizza_persistence_entity_payment_GooglePayInitDataEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_payment_GooglePayInitDataEntityRealmProxy.a) d0Var.u().e(GooglePayInitDataEntity.class), realmGet$googlePayInitData, z, map, set));
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
    public static com.dodopizza.persistence.entity.payment.PaymentMethodEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy.a r9, com.dodopizza.persistence.entity.payment.PaymentMethodEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.payment.PaymentMethodEntity r1 = (com.dodopizza.persistence.entity.payment.PaymentMethodEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.payment.PaymentMethodEntity> r2 = com.dodopizza.persistence.entity.payment.PaymentMethodEntity.class
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
            io.realm.com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.payment.PaymentMethodEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.payment.PaymentMethodEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy$a, com.dodopizza.persistence.entity.payment.PaymentMethodEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.payment.PaymentMethodEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static PaymentMethodEntity f(PaymentMethodEntity paymentMethodEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        PaymentMethodEntity paymentMethodEntity2;
        if (i <= i2 && paymentMethodEntity != null) {
            r89.a<o89> aVar = map.get(paymentMethodEntity);
            if (aVar == null) {
                paymentMethodEntity2 = new PaymentMethodEntity();
                map.put(paymentMethodEntity, new r89.a<>(i, paymentMethodEntity2));
            } else if (i >= aVar.a) {
                return (PaymentMethodEntity) aVar.b;
            } else {
                aVar.a = i;
                paymentMethodEntity2 = (PaymentMethodEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) paymentMethodEntity).a().f();
            paymentMethodEntity2.realmSet$id(paymentMethodEntity.realmGet$id());
            paymentMethodEntity2.realmSet$paymentType(paymentMethodEntity.realmGet$paymentType());
            paymentMethodEntity2.realmSet$acquirerName(paymentMethodEntity.realmGet$acquirerName());
            paymentMethodEntity2.realmSet$brandName(paymentMethodEntity.realmGet$brandName());
            paymentMethodEntity2.realmSet$integrationType(paymentMethodEntity.realmGet$integrationType());
            int i3 = i + 1;
            paymentMethodEntity2.realmSet$card(com_dodopizza_persistence_entity_payment_CardEntityRealmProxy.f(paymentMethodEntity.realmGet$card(), i3, i2, map));
            paymentMethodEntity2.realmSet$priority(paymentMethodEntity.realmGet$priority());
            paymentMethodEntity2.realmSet$googlePayInitData(com_dodopizza_persistence_entity_payment_GooglePayInitDataEntityRealmProxy.f(paymentMethodEntity.realmGet$googlePayInitData(), i3, i2, map));
            paymentMethodEntity2.realmSet$isRedirectSaveCardEnabled(paymentMethodEntity.realmGet$isRedirectSaveCardEnabled());
            return paymentMethodEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "PaymentMethodEntity", false, 9, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.b("", "paymentType", realmFieldType2, false, false, true);
        bVar.b("", "acquirerName", realmFieldType, false, false, false);
        bVar.b("", "brandName", realmFieldType, false, false, false);
        bVar.b("", "integrationType", realmFieldType, false, false, false);
        RealmFieldType realmFieldType3 = RealmFieldType.OBJECT;
        bVar.a("", "card", realmFieldType3, "CardEntity");
        bVar.b("", "priority", realmFieldType2, false, false, true);
        bVar.a("", "googlePayInitData", realmFieldType3, "GooglePayInitDataEntity");
        bVar.b("", "isRedirectSaveCardEnabled", RealmFieldType.BOOLEAN, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, PaymentMethodEntity paymentMethodEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((paymentMethodEntity instanceof r89) && !n0.isFrozen(paymentMethodEntity)) {
            r89 r89Var = (r89) paymentMethodEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(PaymentMethodEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(PaymentMethodEntity.class);
        long j = aVar.e;
        String realmGet$id = paymentMethodEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(paymentMethodEntity, Long.valueOf(j2));
        Table.nativeSetLong(nativePtr, aVar.f, j2, paymentMethodEntity.realmGet$paymentType(), false);
        String realmGet$acquirerName = paymentMethodEntity.realmGet$acquirerName();
        if (realmGet$acquirerName != null) {
            Table.nativeSetString(nativePtr, aVar.g, j2, realmGet$acquirerName, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j2, false);
        }
        String realmGet$brandName = paymentMethodEntity.realmGet$brandName();
        if (realmGet$brandName != null) {
            Table.nativeSetString(nativePtr, aVar.h, j2, realmGet$brandName, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, j2, false);
        }
        String realmGet$integrationType = paymentMethodEntity.realmGet$integrationType();
        if (realmGet$integrationType != null) {
            Table.nativeSetString(nativePtr, aVar.i, j2, realmGet$integrationType, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.i, j2, false);
        }
        CardEntity realmGet$card = paymentMethodEntity.realmGet$card();
        if (realmGet$card != null) {
            Long l = map.get(realmGet$card);
            if (l == null) {
                l = Long.valueOf(com_dodopizza_persistence_entity_payment_CardEntityRealmProxy.i(d0Var, realmGet$card, map));
            }
            Table.nativeSetLink(nativePtr, aVar.j, j2, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.j, j2);
        }
        Table.nativeSetLong(nativePtr, aVar.k, j2, paymentMethodEntity.realmGet$priority(), false);
        GooglePayInitDataEntity realmGet$googlePayInitData = paymentMethodEntity.realmGet$googlePayInitData();
        if (realmGet$googlePayInitData != null) {
            Long l2 = map.get(realmGet$googlePayInitData);
            if (l2 == null) {
                l2 = Long.valueOf(com_dodopizza_persistence_entity_payment_GooglePayInitDataEntityRealmProxy.i(d0Var, realmGet$googlePayInitData, map));
            }
            Table.nativeSetLink(nativePtr, aVar.l, j2, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.l, j2);
        }
        Table.nativeSetBoolean(nativePtr, aVar.m, j2, paymentMethodEntity.realmGet$isRedirectSaveCardEnabled(), false);
        return j2;
    }

    static com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(PaymentMethodEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy com_dodopizza_persistence_entity_payment_paymentmethodentityrealmproxy = new com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_payment_paymentmethodentityrealmproxy;
    }

    static PaymentMethodEntity k(d0 d0Var, a aVar, PaymentMethodEntity paymentMethodEntity, PaymentMethodEntity paymentMethodEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PaymentMethodEntity.class), set);
        osObjectBuilder.E0(aVar.e, paymentMethodEntity2.realmGet$id());
        osObjectBuilder.o0(aVar.f, Integer.valueOf(paymentMethodEntity2.realmGet$paymentType()));
        osObjectBuilder.E0(aVar.g, paymentMethodEntity2.realmGet$acquirerName());
        osObjectBuilder.E0(aVar.h, paymentMethodEntity2.realmGet$brandName());
        osObjectBuilder.E0(aVar.i, paymentMethodEntity2.realmGet$integrationType());
        CardEntity realmGet$card = paymentMethodEntity2.realmGet$card();
        if (realmGet$card == null) {
            osObjectBuilder.r0(aVar.j);
        } else {
            CardEntity cardEntity = (CardEntity) map.get(realmGet$card);
            if (cardEntity != null) {
                osObjectBuilder.x0(aVar.j, cardEntity);
            } else {
                osObjectBuilder.x0(aVar.j, com_dodopizza_persistence_entity_payment_CardEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_payment_CardEntityRealmProxy.a) d0Var.u().e(CardEntity.class), realmGet$card, true, map, set));
            }
        }
        osObjectBuilder.o0(aVar.k, Integer.valueOf(paymentMethodEntity2.realmGet$priority()));
        GooglePayInitDataEntity realmGet$googlePayInitData = paymentMethodEntity2.realmGet$googlePayInitData();
        if (realmGet$googlePayInitData == null) {
            osObjectBuilder.r0(aVar.l);
        } else {
            GooglePayInitDataEntity googlePayInitDataEntity = (GooglePayInitDataEntity) map.get(realmGet$googlePayInitData);
            if (googlePayInitDataEntity != null) {
                osObjectBuilder.x0(aVar.l, googlePayInitDataEntity);
            } else {
                osObjectBuilder.x0(aVar.l, com_dodopizza_persistence_entity_payment_GooglePayInitDataEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_payment_GooglePayInitDataEntityRealmProxy.a) d0Var.u().e(GooglePayInitDataEntity.class), realmGet$googlePayInitData, true, map, set));
            }
        }
        osObjectBuilder.j0(aVar.m, Boolean.valueOf(paymentMethodEntity2.realmGet$isRedirectSaveCardEnabled()));
        osObjectBuilder.K0();
        return paymentMethodEntity;
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
        c0<PaymentMethodEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy com_dodopizza_persistence_entity_payment_paymentmethodentityrealmproxy = (com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_payment_paymentmethodentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_payment_paymentmethodentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_payment_paymentmethodentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.payment.PaymentMethodEntity, defpackage.fhc
    public String realmGet$acquirerName() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.payment.PaymentMethodEntity, defpackage.fhc
    public String realmGet$brandName() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.payment.PaymentMethodEntity, defpackage.fhc
    public CardEntity realmGet$card() {
        this.c.f().c();
        if (this.c.g().o0(this.b.j)) {
            return null;
        }
        return (CardEntity) this.c.f().o(CardEntity.class, this.c.g().L(this.b.j), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.payment.PaymentMethodEntity, defpackage.fhc
    public GooglePayInitDataEntity realmGet$googlePayInitData() {
        this.c.f().c();
        if (this.c.g().o0(this.b.l)) {
            return null;
        }
        return (GooglePayInitDataEntity) this.c.f().o(GooglePayInitDataEntity.class, this.c.g().L(this.b.l), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.payment.PaymentMethodEntity, defpackage.fhc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.payment.PaymentMethodEntity, defpackage.fhc
    public String realmGet$integrationType() {
        this.c.f().c();
        return this.c.g().p0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.payment.PaymentMethodEntity, defpackage.fhc
    public boolean realmGet$isRedirectSaveCardEnabled() {
        this.c.f().c();
        return this.c.g().b0(this.b.m);
    }

    @Override // com.dodopizza.persistence.entity.payment.PaymentMethodEntity, defpackage.fhc
    public int realmGet$paymentType() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.payment.PaymentMethodEntity, defpackage.fhc
    public int realmGet$priority() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.payment.PaymentMethodEntity, defpackage.fhc
    public void realmSet$acquirerName(String str) {
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

    @Override // com.dodopizza.persistence.entity.payment.PaymentMethodEntity, defpackage.fhc
    public void realmSet$brandName(String str) {
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

    @Override // com.dodopizza.persistence.entity.payment.PaymentMethodEntity, defpackage.fhc
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
                g.l0(this.b.j);
                return;
            }
            this.c.c(cardEntity);
            g.o().B(this.b.j, g.E0(), ((r89) cardEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (cardEntity == null) {
            this.c.g().l0(this.b.j);
            return;
        }
        this.c.c(cardEntity);
        this.c.g().s(this.b.j, ((r89) cardEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.payment.PaymentMethodEntity, defpackage.fhc
    public void realmSet$googlePayInitData(GooglePayInitDataEntity googlePayInitDataEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("googlePayInitData")) {
                return;
            }
            if (googlePayInitDataEntity != null && !n0.isManaged(googlePayInitDataEntity)) {
                googlePayInitDataEntity = (GooglePayInitDataEntity) d0Var.j0(googlePayInitDataEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (googlePayInitDataEntity == null) {
                g.l0(this.b.l);
                return;
            }
            this.c.c(googlePayInitDataEntity);
            g.o().B(this.b.l, g.E0(), ((r89) googlePayInitDataEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (googlePayInitDataEntity == null) {
            this.c.g().l0(this.b.l);
            return;
        }
        this.c.c(googlePayInitDataEntity);
        this.c.g().s(this.b.l, ((r89) googlePayInitDataEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.payment.PaymentMethodEntity, defpackage.fhc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.payment.PaymentMethodEntity, defpackage.fhc
    public void realmSet$integrationType(String str) {
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

    @Override // com.dodopizza.persistence.entity.payment.PaymentMethodEntity, defpackage.fhc
    public void realmSet$isRedirectSaveCardEnabled(boolean z) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().y(this.b.m, g.E0(), z, true);
            return;
        }
        this.c.f().c();
        this.c.g().Q(this.b.m, z);
    }

    @Override // com.dodopizza.persistence.entity.payment.PaymentMethodEntity, defpackage.fhc
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

    @Override // com.dodopizza.persistence.entity.payment.PaymentMethodEntity, defpackage.fhc
    public void realmSet$priority(int i) {
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

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("PaymentMethodEntity = proxy[");
        sb.append("{id:");
        String str6 = "null";
        if (realmGet$id() == null) {
            str = "null";
        } else {
            str = realmGet$id();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{paymentType:");
        sb.append(realmGet$paymentType());
        sb.append("}");
        sb.append(",");
        sb.append("{acquirerName:");
        if (realmGet$acquirerName() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$acquirerName();
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{brandName:");
        if (realmGet$brandName() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$brandName();
        }
        sb.append(str3);
        sb.append("}");
        sb.append(",");
        sb.append("{integrationType:");
        if (realmGet$integrationType() == null) {
            str4 = "null";
        } else {
            str4 = realmGet$integrationType();
        }
        sb.append(str4);
        sb.append("}");
        sb.append(",");
        sb.append("{card:");
        if (realmGet$card() == null) {
            str5 = "null";
        } else {
            str5 = "CardEntity";
        }
        sb.append(str5);
        sb.append("}");
        sb.append(",");
        sb.append("{priority:");
        sb.append(realmGet$priority());
        sb.append("}");
        sb.append(",");
        sb.append("{googlePayInitData:");
        if (realmGet$googlePayInitData() != null) {
            str6 = "GooglePayInitDataEntity";
        }
        sb.append(str6);
        sb.append("}");
        sb.append(",");
        sb.append("{isRedirectSaveCardEnabled:");
        sb.append(realmGet$isRedirectSaveCardEnabled());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
