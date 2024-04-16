package io.realm;

import com.dodopizza.persistence.entity.PaymentEntity;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import defpackage.r89;
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
public class com_dodopizza_persistence_entity_PaymentEntityRealmProxy extends PaymentEntity implements r89, yec {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<PaymentEntity> c;

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
            OsObjectSchemaInfo b = osSchemaInfo.b("PaymentEntity");
            this.e = a("id", "id", b);
            this.f = a("transactionId", "transactionId", b);
            this.g = a(UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, b);
            this.h = a("provider", "provider", b);
            this.i = a("status", "status", b);
            this.j = a("paymentScenario", "paymentScenario", b);
            this.k = a("paymentScenarioAuthorizeUrl", "paymentScenarioAuthorizeUrl", b);
            this.l = a("paymentScenarioRedirectUrl", "paymentScenarioRedirectUrl", b);
            this.m = a("paymentScenarioSuccessUrl", "paymentScenarioSuccessUrl", b);
            this.n = a("paymentScenarioFailureUrl", "paymentScenarioFailureUrl", b);
            this.o = a("paymentScenarioPublicKey", "paymentScenarioPublicKey", b);
            this.p = a("paymentScenarioMerchantId", "paymentScenarioMerchantId", b);
            this.q = a("paymentScenarioGateway", "paymentScenarioGateway", b);
            this.r = a("paymentScenarioLifetime", "paymentScenarioLifetime", b);
            this.s = a("paymentScenarioGooglePayString", "paymentScenarioGooglePayString", b);
            this.t = a("paymentScenarioGooglePayEnv", "paymentScenarioGooglePayEnv", b);
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
    public com_dodopizza_persistence_entity_PaymentEntityRealmProxy() {
        this.c.p();
    }

    public static PaymentEntity c(d0 d0Var, a aVar, PaymentEntity paymentEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(paymentEntity);
        if (r89Var != null) {
            return (PaymentEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PaymentEntity.class), set);
        osObjectBuilder.E0(aVar.e, paymentEntity.realmGet$id());
        osObjectBuilder.E0(aVar.f, paymentEntity.realmGet$transactionId());
        osObjectBuilder.E0(aVar.g, paymentEntity.realmGet$workflowId());
        osObjectBuilder.E0(aVar.h, paymentEntity.realmGet$provider());
        osObjectBuilder.E0(aVar.i, paymentEntity.realmGet$status());
        osObjectBuilder.E0(aVar.j, paymentEntity.realmGet$paymentScenario());
        osObjectBuilder.E0(aVar.k, paymentEntity.realmGet$paymentScenarioAuthorizeUrl());
        osObjectBuilder.E0(aVar.l, paymentEntity.realmGet$paymentScenarioRedirectUrl());
        osObjectBuilder.E0(aVar.m, paymentEntity.realmGet$paymentScenarioSuccessUrl());
        osObjectBuilder.E0(aVar.n, paymentEntity.realmGet$paymentScenarioFailureUrl());
        osObjectBuilder.E0(aVar.o, paymentEntity.realmGet$paymentScenarioPublicKey());
        osObjectBuilder.E0(aVar.p, paymentEntity.realmGet$paymentScenarioMerchantId());
        osObjectBuilder.E0(aVar.q, paymentEntity.realmGet$paymentScenarioGateway());
        osObjectBuilder.p0(aVar.r, Long.valueOf(paymentEntity.realmGet$paymentScenarioLifetime()));
        osObjectBuilder.E0(aVar.s, paymentEntity.realmGet$paymentScenarioGooglePayString());
        osObjectBuilder.E0(aVar.t, paymentEntity.realmGet$paymentScenarioGooglePayEnv());
        com_dodopizza_persistence_entity_PaymentEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(paymentEntity, j);
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dodopizza.persistence.entity.PaymentEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_PaymentEntityRealmProxy.a r9, com.dodopizza.persistence.entity.PaymentEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.PaymentEntity r1 = (com.dodopizza.persistence.entity.PaymentEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.PaymentEntity> r2 = com.dodopizza.persistence.entity.PaymentEntity.class
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
            io.realm.com_dodopizza_persistence_entity_PaymentEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_PaymentEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.PaymentEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.PaymentEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_PaymentEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_PaymentEntityRealmProxy$a, com.dodopizza.persistence.entity.PaymentEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.PaymentEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static PaymentEntity f(PaymentEntity paymentEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        PaymentEntity paymentEntity2;
        if (i <= i2 && paymentEntity != null) {
            r89.a<o89> aVar = map.get(paymentEntity);
            if (aVar == null) {
                paymentEntity2 = new PaymentEntity();
                map.put(paymentEntity, new r89.a<>(i, paymentEntity2));
            } else if (i >= aVar.a) {
                return (PaymentEntity) aVar.b;
            } else {
                aVar.a = i;
                paymentEntity2 = (PaymentEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) paymentEntity).a().f();
            paymentEntity2.realmSet$id(paymentEntity.realmGet$id());
            paymentEntity2.realmSet$transactionId(paymentEntity.realmGet$transactionId());
            paymentEntity2.realmSet$workflowId(paymentEntity.realmGet$workflowId());
            paymentEntity2.realmSet$provider(paymentEntity.realmGet$provider());
            paymentEntity2.realmSet$status(paymentEntity.realmGet$status());
            paymentEntity2.realmSet$paymentScenario(paymentEntity.realmGet$paymentScenario());
            paymentEntity2.realmSet$paymentScenarioAuthorizeUrl(paymentEntity.realmGet$paymentScenarioAuthorizeUrl());
            paymentEntity2.realmSet$paymentScenarioRedirectUrl(paymentEntity.realmGet$paymentScenarioRedirectUrl());
            paymentEntity2.realmSet$paymentScenarioSuccessUrl(paymentEntity.realmGet$paymentScenarioSuccessUrl());
            paymentEntity2.realmSet$paymentScenarioFailureUrl(paymentEntity.realmGet$paymentScenarioFailureUrl());
            paymentEntity2.realmSet$paymentScenarioPublicKey(paymentEntity.realmGet$paymentScenarioPublicKey());
            paymentEntity2.realmSet$paymentScenarioMerchantId(paymentEntity.realmGet$paymentScenarioMerchantId());
            paymentEntity2.realmSet$paymentScenarioGateway(paymentEntity.realmGet$paymentScenarioGateway());
            paymentEntity2.realmSet$paymentScenarioLifetime(paymentEntity.realmGet$paymentScenarioLifetime());
            paymentEntity2.realmSet$paymentScenarioGooglePayString(paymentEntity.realmGet$paymentScenarioGooglePayString());
            paymentEntity2.realmSet$paymentScenarioGooglePayEnv(paymentEntity.realmGet$paymentScenarioGooglePayEnv());
            return paymentEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "PaymentEntity", false, 16, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, false);
        bVar.b("", "transactionId", realmFieldType, false, false, true);
        bVar.b("", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, realmFieldType, false, false, true);
        bVar.b("", "provider", realmFieldType, false, false, true);
        bVar.b("", "status", realmFieldType, false, false, true);
        bVar.b("", "paymentScenario", realmFieldType, false, false, true);
        bVar.b("", "paymentScenarioAuthorizeUrl", realmFieldType, false, false, false);
        bVar.b("", "paymentScenarioRedirectUrl", realmFieldType, false, false, false);
        bVar.b("", "paymentScenarioSuccessUrl", realmFieldType, false, false, false);
        bVar.b("", "paymentScenarioFailureUrl", realmFieldType, false, false, false);
        bVar.b("", "paymentScenarioPublicKey", realmFieldType, false, false, false);
        bVar.b("", "paymentScenarioMerchantId", realmFieldType, false, false, false);
        bVar.b("", "paymentScenarioGateway", realmFieldType, false, false, false);
        bVar.b("", "paymentScenarioLifetime", RealmFieldType.INTEGER, false, false, true);
        bVar.b("", "paymentScenarioGooglePayString", realmFieldType, false, false, false);
        bVar.b("", "paymentScenarioGooglePayEnv", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, PaymentEntity paymentEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((paymentEntity instanceof r89) && !n0.isFrozen(paymentEntity)) {
            r89 r89Var = (r89) paymentEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(PaymentEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(PaymentEntity.class);
        long j = aVar.e;
        String realmGet$id = paymentEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(paymentEntity, Long.valueOf(j2));
        String realmGet$transactionId = paymentEntity.realmGet$transactionId();
        if (realmGet$transactionId != null) {
            Table.nativeSetString(nativePtr, aVar.f, j2, realmGet$transactionId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f, j2, false);
        }
        String realmGet$workflowId = paymentEntity.realmGet$workflowId();
        if (realmGet$workflowId != null) {
            Table.nativeSetString(nativePtr, aVar.g, j2, realmGet$workflowId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j2, false);
        }
        String realmGet$provider = paymentEntity.realmGet$provider();
        if (realmGet$provider != null) {
            Table.nativeSetString(nativePtr, aVar.h, j2, realmGet$provider, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, j2, false);
        }
        String realmGet$status = paymentEntity.realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(nativePtr, aVar.i, j2, realmGet$status, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.i, j2, false);
        }
        String realmGet$paymentScenario = paymentEntity.realmGet$paymentScenario();
        if (realmGet$paymentScenario != null) {
            Table.nativeSetString(nativePtr, aVar.j, j2, realmGet$paymentScenario, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.j, j2, false);
        }
        String realmGet$paymentScenarioAuthorizeUrl = paymentEntity.realmGet$paymentScenarioAuthorizeUrl();
        if (realmGet$paymentScenarioAuthorizeUrl != null) {
            Table.nativeSetString(nativePtr, aVar.k, j2, realmGet$paymentScenarioAuthorizeUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.k, j2, false);
        }
        String realmGet$paymentScenarioRedirectUrl = paymentEntity.realmGet$paymentScenarioRedirectUrl();
        if (realmGet$paymentScenarioRedirectUrl != null) {
            Table.nativeSetString(nativePtr, aVar.l, j2, realmGet$paymentScenarioRedirectUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.l, j2, false);
        }
        String realmGet$paymentScenarioSuccessUrl = paymentEntity.realmGet$paymentScenarioSuccessUrl();
        if (realmGet$paymentScenarioSuccessUrl != null) {
            Table.nativeSetString(nativePtr, aVar.m, j2, realmGet$paymentScenarioSuccessUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.m, j2, false);
        }
        String realmGet$paymentScenarioFailureUrl = paymentEntity.realmGet$paymentScenarioFailureUrl();
        if (realmGet$paymentScenarioFailureUrl != null) {
            Table.nativeSetString(nativePtr, aVar.n, j2, realmGet$paymentScenarioFailureUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.n, j2, false);
        }
        String realmGet$paymentScenarioPublicKey = paymentEntity.realmGet$paymentScenarioPublicKey();
        if (realmGet$paymentScenarioPublicKey != null) {
            Table.nativeSetString(nativePtr, aVar.o, j2, realmGet$paymentScenarioPublicKey, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.o, j2, false);
        }
        String realmGet$paymentScenarioMerchantId = paymentEntity.realmGet$paymentScenarioMerchantId();
        if (realmGet$paymentScenarioMerchantId != null) {
            Table.nativeSetString(nativePtr, aVar.p, j2, realmGet$paymentScenarioMerchantId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.p, j2, false);
        }
        String realmGet$paymentScenarioGateway = paymentEntity.realmGet$paymentScenarioGateway();
        if (realmGet$paymentScenarioGateway != null) {
            Table.nativeSetString(nativePtr, aVar.q, j2, realmGet$paymentScenarioGateway, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.q, j2, false);
        }
        Table.nativeSetLong(nativePtr, aVar.r, j2, paymentEntity.realmGet$paymentScenarioLifetime(), false);
        String realmGet$paymentScenarioGooglePayString = paymentEntity.realmGet$paymentScenarioGooglePayString();
        if (realmGet$paymentScenarioGooglePayString != null) {
            Table.nativeSetString(nativePtr, aVar.s, j2, realmGet$paymentScenarioGooglePayString, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.s, j2, false);
        }
        String realmGet$paymentScenarioGooglePayEnv = paymentEntity.realmGet$paymentScenarioGooglePayEnv();
        if (realmGet$paymentScenarioGooglePayEnv != null) {
            Table.nativeSetString(nativePtr, aVar.t, j2, realmGet$paymentScenarioGooglePayEnv, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.t, j2, false);
        }
        return j2;
    }

    static com_dodopizza_persistence_entity_PaymentEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(PaymentEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_PaymentEntityRealmProxy com_dodopizza_persistence_entity_paymententityrealmproxy = new com_dodopizza_persistence_entity_PaymentEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_paymententityrealmproxy;
    }

    static PaymentEntity k(d0 d0Var, a aVar, PaymentEntity paymentEntity, PaymentEntity paymentEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(PaymentEntity.class), set);
        osObjectBuilder.E0(aVar.e, paymentEntity2.realmGet$id());
        osObjectBuilder.E0(aVar.f, paymentEntity2.realmGet$transactionId());
        osObjectBuilder.E0(aVar.g, paymentEntity2.realmGet$workflowId());
        osObjectBuilder.E0(aVar.h, paymentEntity2.realmGet$provider());
        osObjectBuilder.E0(aVar.i, paymentEntity2.realmGet$status());
        osObjectBuilder.E0(aVar.j, paymentEntity2.realmGet$paymentScenario());
        osObjectBuilder.E0(aVar.k, paymentEntity2.realmGet$paymentScenarioAuthorizeUrl());
        osObjectBuilder.E0(aVar.l, paymentEntity2.realmGet$paymentScenarioRedirectUrl());
        osObjectBuilder.E0(aVar.m, paymentEntity2.realmGet$paymentScenarioSuccessUrl());
        osObjectBuilder.E0(aVar.n, paymentEntity2.realmGet$paymentScenarioFailureUrl());
        osObjectBuilder.E0(aVar.o, paymentEntity2.realmGet$paymentScenarioPublicKey());
        osObjectBuilder.E0(aVar.p, paymentEntity2.realmGet$paymentScenarioMerchantId());
        osObjectBuilder.E0(aVar.q, paymentEntity2.realmGet$paymentScenarioGateway());
        osObjectBuilder.p0(aVar.r, Long.valueOf(paymentEntity2.realmGet$paymentScenarioLifetime()));
        osObjectBuilder.E0(aVar.s, paymentEntity2.realmGet$paymentScenarioGooglePayString());
        osObjectBuilder.E0(aVar.t, paymentEntity2.realmGet$paymentScenarioGooglePayEnv());
        osObjectBuilder.K0();
        return paymentEntity;
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
        c0<PaymentEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_PaymentEntityRealmProxy com_dodopizza_persistence_entity_paymententityrealmproxy = (com_dodopizza_persistence_entity_PaymentEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_paymententityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_paymententityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_paymententityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public String realmGet$paymentScenario() {
        this.c.f().c();
        return this.c.g().p0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public String realmGet$paymentScenarioAuthorizeUrl() {
        this.c.f().c();
        return this.c.g().p0(this.b.k);
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public String realmGet$paymentScenarioFailureUrl() {
        this.c.f().c();
        return this.c.g().p0(this.b.n);
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public String realmGet$paymentScenarioGateway() {
        this.c.f().c();
        return this.c.g().p0(this.b.q);
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public String realmGet$paymentScenarioGooglePayEnv() {
        this.c.f().c();
        return this.c.g().p0(this.b.t);
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public String realmGet$paymentScenarioGooglePayString() {
        this.c.f().c();
        return this.c.g().p0(this.b.s);
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public long realmGet$paymentScenarioLifetime() {
        this.c.f().c();
        return this.c.g().e0(this.b.r);
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public String realmGet$paymentScenarioMerchantId() {
        this.c.f().c();
        return this.c.g().p0(this.b.p);
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public String realmGet$paymentScenarioPublicKey() {
        this.c.f().c();
        return this.c.g().p0(this.b.o);
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public String realmGet$paymentScenarioRedirectUrl() {
        this.c.f().c();
        return this.c.g().p0(this.b.l);
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public String realmGet$paymentScenarioSuccessUrl() {
        this.c.f().c();
        return this.c.g().p0(this.b.m);
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public String realmGet$provider() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public String realmGet$status() {
        this.c.f().c();
        return this.c.g().p0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public String realmGet$transactionId() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public String realmGet$workflowId() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public void realmSet$paymentScenario(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.j, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'paymentScenario' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.j, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'paymentScenario' to null.");
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public void realmSet$paymentScenarioAuthorizeUrl(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.k, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.k, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.k);
        } else {
            this.c.g().i(this.b.k, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public void realmSet$paymentScenarioFailureUrl(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.n, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.n, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.n);
        } else {
            this.c.g().i(this.b.n, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public void realmSet$paymentScenarioGateway(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.q, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.q, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.q);
        } else {
            this.c.g().i(this.b.q, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public void realmSet$paymentScenarioGooglePayEnv(String str) {
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

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public void realmSet$paymentScenarioGooglePayString(String str) {
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

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public void realmSet$paymentScenarioLifetime(long j) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.r, g.E0(), j, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.r, j);
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public void realmSet$paymentScenarioMerchantId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.p, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.p, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.p);
        } else {
            this.c.g().i(this.b.p, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public void realmSet$paymentScenarioPublicKey(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.o, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.o, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.o);
        } else {
            this.c.g().i(this.b.o, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public void realmSet$paymentScenarioRedirectUrl(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.l, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.l, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.l);
        } else {
            this.c.g().i(this.b.l, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public void realmSet$paymentScenarioSuccessUrl(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.m, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.m, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.m);
        } else {
            this.c.g().i(this.b.m, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public void realmSet$provider(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.h, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'provider' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.h, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'provider' to null.");
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public void realmSet$status(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.i, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'status' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.i, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'status' to null.");
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public void realmSet$transactionId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.f, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'transactionId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'transactionId' to null.");
    }

    @Override // com.dodopizza.persistence.entity.PaymentEntity, defpackage.yec
    public void realmSet$workflowId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.g, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'workflowId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'workflowId' to null.");
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("PaymentEntity = proxy[");
        sb.append("{id:");
        String str10 = "null";
        if (realmGet$id() == null) {
            str = "null";
        } else {
            str = realmGet$id();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{transactionId:");
        sb.append(realmGet$transactionId());
        sb.append("}");
        sb.append(",");
        sb.append("{workflowId:");
        sb.append(realmGet$workflowId());
        sb.append("}");
        sb.append(",");
        sb.append("{provider:");
        sb.append(realmGet$provider());
        sb.append("}");
        sb.append(",");
        sb.append("{status:");
        sb.append(realmGet$status());
        sb.append("}");
        sb.append(",");
        sb.append("{paymentScenario:");
        sb.append(realmGet$paymentScenario());
        sb.append("}");
        sb.append(",");
        sb.append("{paymentScenarioAuthorizeUrl:");
        if (realmGet$paymentScenarioAuthorizeUrl() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$paymentScenarioAuthorizeUrl();
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{paymentScenarioRedirectUrl:");
        if (realmGet$paymentScenarioRedirectUrl() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$paymentScenarioRedirectUrl();
        }
        sb.append(str3);
        sb.append("}");
        sb.append(",");
        sb.append("{paymentScenarioSuccessUrl:");
        if (realmGet$paymentScenarioSuccessUrl() == null) {
            str4 = "null";
        } else {
            str4 = realmGet$paymentScenarioSuccessUrl();
        }
        sb.append(str4);
        sb.append("}");
        sb.append(",");
        sb.append("{paymentScenarioFailureUrl:");
        if (realmGet$paymentScenarioFailureUrl() == null) {
            str5 = "null";
        } else {
            str5 = realmGet$paymentScenarioFailureUrl();
        }
        sb.append(str5);
        sb.append("}");
        sb.append(",");
        sb.append("{paymentScenarioPublicKey:");
        if (realmGet$paymentScenarioPublicKey() == null) {
            str6 = "null";
        } else {
            str6 = realmGet$paymentScenarioPublicKey();
        }
        sb.append(str6);
        sb.append("}");
        sb.append(",");
        sb.append("{paymentScenarioMerchantId:");
        if (realmGet$paymentScenarioMerchantId() == null) {
            str7 = "null";
        } else {
            str7 = realmGet$paymentScenarioMerchantId();
        }
        sb.append(str7);
        sb.append("}");
        sb.append(",");
        sb.append("{paymentScenarioGateway:");
        if (realmGet$paymentScenarioGateway() == null) {
            str8 = "null";
        } else {
            str8 = realmGet$paymentScenarioGateway();
        }
        sb.append(str8);
        sb.append("}");
        sb.append(",");
        sb.append("{paymentScenarioLifetime:");
        sb.append(realmGet$paymentScenarioLifetime());
        sb.append("}");
        sb.append(",");
        sb.append("{paymentScenarioGooglePayString:");
        if (realmGet$paymentScenarioGooglePayString() == null) {
            str9 = "null";
        } else {
            str9 = realmGet$paymentScenarioGooglePayString();
        }
        sb.append(str9);
        sb.append("}");
        sb.append(",");
        sb.append("{paymentScenarioGooglePayEnv:");
        if (realmGet$paymentScenarioGooglePayEnv() != null) {
            str10 = realmGet$paymentScenarioGooglePayEnv();
        }
        sb.append(str10);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
