package io.realm;

import com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity;
import com.dodopizza.persistence.entity.PackageInfoEntity;
import com.dodopizza.persistence.entity.RealmString;
import com.dodopizza.persistence.entity.StateErrorEntity;
import com.dodopizza.persistence.entity.StateWarningEntity;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.dodopizza.persistence.entity.address.DeliveryAddressEntity;
import com.dodopizza.persistence.entity.cart.CartEntity;
import com.dodopizza.persistence.entity.cart.DataPaymentEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.dodopizza.persistence.entity.cart.UpsaleEntity;
import com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationEntity;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.dodopizza.persistence.entity.personalization.PersonalizationEntity;
import com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_RealmStringRealmProxy;
import io.realm.com_dodopizza_persistence_entity_StateErrorEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_StateWarningEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_address_DeliveryAddressEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_CartEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
public class com_dodopizza_persistence_entity_cart_StateEntityRealmProxy extends StateEntity implements r89, zfc {
    private static final OsObjectSchemaInfo h = g();
    private a b;
    private c0<StateEntity> c;
    private k0<RealmString> d;
    private k0<RealmString> e;
    private k0<StateErrorEntity> f;
    private k0<StateWarningEntity> g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long A;
        long B;
        long C;
        long D;
        long E;
        long F;
        long G;
        long H;
        long I;
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
        long u;
        long v;
        long w;
        long x;
        long y;
        long z;

        a(OsSchemaInfo osSchemaInfo) {
            super(31);
            OsObjectSchemaInfo b = osSchemaInfo.b("StateEntity");
            this.e = a(UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, b);
            this.f = a("placedOrderId", "placedOrderId", b);
            this.g = a("step", "step", b);
            this.h = a("isWorkload", "isWorkload", b);
            this.i = a("orderPizzeriaId", "orderPizzeriaId", b);
            this.j = a("cart", "cart", b);
            this.k = a("cartError", "cartError", b);
            this.l = a("localityId", "localityId", b);
            this.m = a("minDeliveryPrice", "minDeliveryPrice", b);
            this.n = a("minDeliveryPriceCustomized", "minDeliveryPriceCustomized", b);
            this.o = a("expectedMinutesToReceiveForASAP", "expectedMinutesToReceiveForASAP", b);
            this.p = a("deliveryAddressEntity", "deliveryAddressEntity", b);
            this.q = a("clientDeliveryLocationEntity", "clientDeliveryLocationEntity", b);
            this.r = a("deferredOrderTime", "deferredOrderTime", b);
            this.s = a(LocalityEntity.FIELD_COUNTRY_CODE, LocalityEntity.FIELD_COUNTRY_CODE, b);
            this.t = a("currentOrderType", "currentOrderType", b);
            this.u = a("languageCode", "languageCode", b);
            this.v = a("productIdsStopList", "productIdsStopList", b);
            this.w = a("toppingIdsStopList", "toppingIdsStopList", b);
            this.x = a("dataPayment", "dataPayment", b);
            this.y = a("errors", "errors", b);
            this.z = a("warnings", "warnings", b);
            this.A = a("upsale", "upsale", b);
            this.B = a("isTakeaway", "isTakeaway", b);
            this.C = a("taxPayerId", "taxPayerId", b);
            this.D = a("tableNumber", "tableNumber", b);
            this.E = a("prizoteka", "prizoteka", b);
            this.F = a("personalization", "personalization", b);
            this.G = a("delivery", "delivery", b);
            this.H = a("pizzeriaAverageServiceTimeMinutes", "pizzeriaAverageServiceTimeMinutes", b);
            this.I = a("packageInfo", "packageInfo", b);
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
            aVar2.u = aVar.u;
            aVar2.v = aVar.v;
            aVar2.w = aVar.w;
            aVar2.x = aVar.x;
            aVar2.y = aVar.y;
            aVar2.z = aVar.z;
            aVar2.A = aVar.A;
            aVar2.B = aVar.B;
            aVar2.C = aVar.C;
            aVar2.D = aVar.D;
            aVar2.E = aVar.E;
            aVar2.F = aVar.F;
            aVar2.G = aVar.G;
            aVar2.H = aVar.H;
            aVar2.I = aVar.I;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_cart_StateEntityRealmProxy() {
        this.c.p();
    }

    public static StateEntity c(d0 d0Var, a aVar, StateEntity stateEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        int i;
        int i2;
        r89 r89Var = map.get(stateEntity);
        if (r89Var != null) {
            return (StateEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(StateEntity.class), set);
        osObjectBuilder.E0(aVar.e, stateEntity.realmGet$workflowId());
        osObjectBuilder.E0(aVar.f, stateEntity.realmGet$placedOrderId());
        osObjectBuilder.o0(aVar.g, stateEntity.realmGet$step());
        osObjectBuilder.j0(aVar.h, Boolean.valueOf(stateEntity.realmGet$isWorkload()));
        osObjectBuilder.E0(aVar.i, stateEntity.realmGet$orderPizzeriaId());
        osObjectBuilder.o0(aVar.k, stateEntity.realmGet$cartError());
        osObjectBuilder.E0(aVar.l, stateEntity.realmGet$localityId());
        osObjectBuilder.l0(aVar.m, Double.valueOf(stateEntity.realmGet$minDeliveryPrice()));
        osObjectBuilder.l0(aVar.n, Double.valueOf(stateEntity.realmGet$minDeliveryPriceCustomized()));
        osObjectBuilder.o0(aVar.o, Integer.valueOf(stateEntity.realmGet$expectedMinutesToReceiveForASAP()));
        osObjectBuilder.E0(aVar.r, stateEntity.realmGet$deferredOrderTime());
        osObjectBuilder.o0(aVar.s, stateEntity.realmGet$countryCode());
        osObjectBuilder.o0(aVar.t, stateEntity.realmGet$currentOrderType());
        osObjectBuilder.E0(aVar.u, stateEntity.realmGet$languageCode());
        osObjectBuilder.j0(aVar.B, stateEntity.realmGet$isTakeaway());
        osObjectBuilder.E0(aVar.C, stateEntity.realmGet$taxPayerId());
        osObjectBuilder.o0(aVar.D, stateEntity.realmGet$tableNumber());
        osObjectBuilder.o0(aVar.H, Integer.valueOf(stateEntity.realmGet$pizzeriaAverageServiceTimeMinutes()));
        com_dodopizza_persistence_entity_cart_StateEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(stateEntity, j);
        CartEntity realmGet$cart = stateEntity.realmGet$cart();
        if (realmGet$cart == null) {
            j.realmSet$cart(null);
        } else {
            CartEntity cartEntity = (CartEntity) map.get(realmGet$cart);
            if (cartEntity != null) {
                j.realmSet$cart(cartEntity);
            } else {
                j.realmSet$cart(com_dodopizza_persistence_entity_cart_CartEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartEntityRealmProxy.a) d0Var.u().e(CartEntity.class), realmGet$cart, z, map, set));
            }
        }
        DeliveryAddressEntity realmGet$deliveryAddressEntity = stateEntity.realmGet$deliveryAddressEntity();
        if (realmGet$deliveryAddressEntity == null) {
            j.realmSet$deliveryAddressEntity(null);
        } else {
            DeliveryAddressEntity deliveryAddressEntity = (DeliveryAddressEntity) map.get(realmGet$deliveryAddressEntity);
            if (deliveryAddressEntity != null) {
                j.realmSet$deliveryAddressEntity(deliveryAddressEntity);
            } else {
                j.realmSet$deliveryAddressEntity(com_dodopizza_persistence_entity_address_DeliveryAddressEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_address_DeliveryAddressEntityRealmProxy.a) d0Var.u().e(DeliveryAddressEntity.class), realmGet$deliveryAddressEntity, z, map, set));
            }
        }
        ClientDeliveryLocationEntity realmGet$clientDeliveryLocationEntity = stateEntity.realmGet$clientDeliveryLocationEntity();
        if (realmGet$clientDeliveryLocationEntity == null) {
            j.realmSet$clientDeliveryLocationEntity(null);
        } else {
            ClientDeliveryLocationEntity clientDeliveryLocationEntity = (ClientDeliveryLocationEntity) map.get(realmGet$clientDeliveryLocationEntity);
            if (clientDeliveryLocationEntity != null) {
                j.realmSet$clientDeliveryLocationEntity(clientDeliveryLocationEntity);
            } else {
                j.realmSet$clientDeliveryLocationEntity(com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationEntityRealmProxy.a) d0Var.u().e(ClientDeliveryLocationEntity.class), realmGet$clientDeliveryLocationEntity, z, map, set));
            }
        }
        k0<RealmString> realmGet$productIdsStopList = stateEntity.realmGet$productIdsStopList();
        if (realmGet$productIdsStopList != null) {
            k0<RealmString> realmGet$productIdsStopList2 = j.realmGet$productIdsStopList();
            realmGet$productIdsStopList2.clear();
            int i3 = 0;
            while (i3 < realmGet$productIdsStopList.size()) {
                RealmString realmString = realmGet$productIdsStopList.get(i3);
                RealmString realmString2 = (RealmString) map.get(realmString);
                if (realmString2 != null) {
                    realmGet$productIdsStopList2.add(realmString2);
                    i2 = i3;
                } else {
                    i2 = i3;
                    realmGet$productIdsStopList2.add(com_dodopizza_persistence_entity_RealmStringRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_RealmStringRealmProxy.a) d0Var.u().e(RealmString.class), realmString, z, map, set));
                }
                i3 = i2 + 1;
            }
        }
        k0<RealmString> realmGet$toppingIdsStopList = stateEntity.realmGet$toppingIdsStopList();
        if (realmGet$toppingIdsStopList != null) {
            k0<RealmString> realmGet$toppingIdsStopList2 = j.realmGet$toppingIdsStopList();
            realmGet$toppingIdsStopList2.clear();
            int i4 = 0;
            while (i4 < realmGet$toppingIdsStopList.size()) {
                RealmString realmString3 = realmGet$toppingIdsStopList.get(i4);
                RealmString realmString4 = (RealmString) map.get(realmString3);
                if (realmString4 != null) {
                    realmGet$toppingIdsStopList2.add(realmString4);
                    i = i4;
                } else {
                    i = i4;
                    realmGet$toppingIdsStopList2.add(com_dodopizza_persistence_entity_RealmStringRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_RealmStringRealmProxy.a) d0Var.u().e(RealmString.class), realmString3, z, map, set));
                }
                i4 = i + 1;
            }
        }
        DataPaymentEntity realmGet$dataPayment = stateEntity.realmGet$dataPayment();
        if (realmGet$dataPayment == null) {
            j.realmSet$dataPayment(null);
        } else {
            DataPaymentEntity dataPaymentEntity = (DataPaymentEntity) map.get(realmGet$dataPayment);
            if (dataPaymentEntity != null) {
                j.realmSet$dataPayment(dataPaymentEntity);
            } else {
                j.realmSet$dataPayment(com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy.a) d0Var.u().e(DataPaymentEntity.class), realmGet$dataPayment, z, map, set));
            }
        }
        k0<StateErrorEntity> realmGet$errors = stateEntity.realmGet$errors();
        if (realmGet$errors != null) {
            k0<StateErrorEntity> realmGet$errors2 = j.realmGet$errors();
            realmGet$errors2.clear();
            for (int i5 = 0; i5 < realmGet$errors.size(); i5++) {
                StateErrorEntity stateErrorEntity = realmGet$errors.get(i5);
                StateErrorEntity stateErrorEntity2 = (StateErrorEntity) map.get(stateErrorEntity);
                if (stateErrorEntity2 != null) {
                    realmGet$errors2.add(stateErrorEntity2);
                } else {
                    realmGet$errors2.add(com_dodopizza_persistence_entity_StateErrorEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_StateErrorEntityRealmProxy.a) d0Var.u().e(StateErrorEntity.class), stateErrorEntity, z, map, set));
                }
            }
        }
        k0<StateWarningEntity> realmGet$warnings = stateEntity.realmGet$warnings();
        if (realmGet$warnings != null) {
            k0<StateWarningEntity> realmGet$warnings2 = j.realmGet$warnings();
            realmGet$warnings2.clear();
            for (int i6 = 0; i6 < realmGet$warnings.size(); i6++) {
                StateWarningEntity stateWarningEntity = realmGet$warnings.get(i6);
                StateWarningEntity stateWarningEntity2 = (StateWarningEntity) map.get(stateWarningEntity);
                if (stateWarningEntity2 != null) {
                    realmGet$warnings2.add(stateWarningEntity2);
                } else {
                    realmGet$warnings2.add(com_dodopizza_persistence_entity_StateWarningEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_StateWarningEntityRealmProxy.a) d0Var.u().e(StateWarningEntity.class), stateWarningEntity, z, map, set));
                }
            }
        }
        UpsaleEntity realmGet$upsale = stateEntity.realmGet$upsale();
        if (realmGet$upsale == null) {
            j.realmSet$upsale(null);
        } else {
            UpsaleEntity upsaleEntity = (UpsaleEntity) map.get(realmGet$upsale);
            if (upsaleEntity != null) {
                j.realmSet$upsale(upsaleEntity);
            } else {
                j.realmSet$upsale(com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy.a) d0Var.u().e(UpsaleEntity.class), realmGet$upsale, z, map, set));
            }
        }
        PrizotekaEntity realmGet$prizoteka = stateEntity.realmGet$prizoteka();
        if (realmGet$prizoteka == null) {
            j.realmSet$prizoteka(null);
        } else {
            PrizotekaEntity prizotekaEntity = (PrizotekaEntity) map.get(realmGet$prizoteka);
            if (prizotekaEntity != null) {
                j.realmSet$prizoteka(prizotekaEntity);
            } else {
                j.realmSet$prizoteka(com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy.a) d0Var.u().e(PrizotekaEntity.class), realmGet$prizoteka, z, map, set));
            }
        }
        PersonalizationEntity realmGet$personalization = stateEntity.realmGet$personalization();
        if (realmGet$personalization == null) {
            j.realmSet$personalization(null);
        } else {
            PersonalizationEntity personalizationEntity = (PersonalizationEntity) map.get(realmGet$personalization);
            if (personalizationEntity != null) {
                j.realmSet$personalization(personalizationEntity);
            } else {
                j.realmSet$personalization(com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy.a) d0Var.u().e(PersonalizationEntity.class), realmGet$personalization, z, map, set));
            }
        }
        DeliveryFeeLevelsEntity realmGet$delivery = stateEntity.realmGet$delivery();
        if (realmGet$delivery == null) {
            j.realmSet$delivery(null);
        } else {
            DeliveryFeeLevelsEntity deliveryFeeLevelsEntity = (DeliveryFeeLevelsEntity) map.get(realmGet$delivery);
            if (deliveryFeeLevelsEntity != null) {
                j.realmSet$delivery(deliveryFeeLevelsEntity);
            } else {
                j.realmSet$delivery(com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy.a) d0Var.u().e(DeliveryFeeLevelsEntity.class), realmGet$delivery, z, map, set));
            }
        }
        PackageInfoEntity realmGet$packageInfo = stateEntity.realmGet$packageInfo();
        if (realmGet$packageInfo == null) {
            j.realmSet$packageInfo(null);
        } else {
            PackageInfoEntity packageInfoEntity = (PackageInfoEntity) map.get(realmGet$packageInfo);
            if (packageInfoEntity != null) {
                j.realmSet$packageInfo(packageInfoEntity);
            } else {
                j.realmSet$packageInfo(com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy.a) d0Var.u().e(PackageInfoEntity.class), realmGet$packageInfo, z, map, set));
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
    public static com.dodopizza.persistence.entity.cart.StateEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_cart_StateEntityRealmProxy.a r9, com.dodopizza.persistence.entity.cart.StateEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
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
            com.dodopizza.persistence.entity.cart.StateEntity r1 = (com.dodopizza.persistence.entity.cart.StateEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.cart.StateEntity> r2 = com.dodopizza.persistence.entity.cart.StateEntity.class
            io.realm.internal.Table r2 = r8.I0(r2)
            long r3 = r9.l
            java.lang.String r5 = r10.realmGet$localityId()
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
            io.realm.com_dodopizza_persistence_entity_cart_StateEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_cart_StateEntityRealmProxy     // Catch: java.lang.Throwable -> L90
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
            com.dodopizza.persistence.entity.cart.StateEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.cart.StateEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_cart_StateEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_cart_StateEntityRealmProxy$a, com.dodopizza.persistence.entity.cart.StateEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.cart.StateEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static StateEntity f(StateEntity stateEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        StateEntity stateEntity2;
        if (i > i2 || stateEntity == null) {
            return null;
        }
        r89.a<o89> aVar = map.get(stateEntity);
        if (aVar == null) {
            stateEntity2 = new StateEntity();
            map.put(stateEntity, new r89.a<>(i, stateEntity2));
        } else if (i >= aVar.a) {
            return (StateEntity) aVar.b;
        } else {
            aVar.a = i;
            stateEntity2 = (StateEntity) aVar.b;
        }
        d0 d0Var = (d0) ((r89) stateEntity).a().f();
        stateEntity2.realmSet$workflowId(stateEntity.realmGet$workflowId());
        stateEntity2.realmSet$placedOrderId(stateEntity.realmGet$placedOrderId());
        stateEntity2.realmSet$step(stateEntity.realmGet$step());
        stateEntity2.realmSet$isWorkload(stateEntity.realmGet$isWorkload());
        stateEntity2.realmSet$orderPizzeriaId(stateEntity.realmGet$orderPizzeriaId());
        int i3 = i + 1;
        stateEntity2.realmSet$cart(com_dodopizza_persistence_entity_cart_CartEntityRealmProxy.f(stateEntity.realmGet$cart(), i3, i2, map));
        stateEntity2.realmSet$cartError(stateEntity.realmGet$cartError());
        stateEntity2.realmSet$localityId(stateEntity.realmGet$localityId());
        stateEntity2.realmSet$minDeliveryPrice(stateEntity.realmGet$minDeliveryPrice());
        stateEntity2.realmSet$minDeliveryPriceCustomized(stateEntity.realmGet$minDeliveryPriceCustomized());
        stateEntity2.realmSet$expectedMinutesToReceiveForASAP(stateEntity.realmGet$expectedMinutesToReceiveForASAP());
        stateEntity2.realmSet$deliveryAddressEntity(com_dodopizza_persistence_entity_address_DeliveryAddressEntityRealmProxy.f(stateEntity.realmGet$deliveryAddressEntity(), i3, i2, map));
        stateEntity2.realmSet$clientDeliveryLocationEntity(com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationEntityRealmProxy.f(stateEntity.realmGet$clientDeliveryLocationEntity(), i3, i2, map));
        stateEntity2.realmSet$deferredOrderTime(stateEntity.realmGet$deferredOrderTime());
        stateEntity2.realmSet$countryCode(stateEntity.realmGet$countryCode());
        stateEntity2.realmSet$currentOrderType(stateEntity.realmGet$currentOrderType());
        stateEntity2.realmSet$languageCode(stateEntity.realmGet$languageCode());
        if (i == i2) {
            stateEntity2.realmSet$productIdsStopList(null);
        } else {
            k0<RealmString> realmGet$productIdsStopList = stateEntity.realmGet$productIdsStopList();
            k0<RealmString> k0Var = new k0<>();
            stateEntity2.realmSet$productIdsStopList(k0Var);
            int size = realmGet$productIdsStopList.size();
            for (int i4 = 0; i4 < size; i4++) {
                k0Var.add(com_dodopizza_persistence_entity_RealmStringRealmProxy.f(realmGet$productIdsStopList.get(i4), i3, i2, map));
            }
        }
        if (i == i2) {
            stateEntity2.realmSet$toppingIdsStopList(null);
        } else {
            k0<RealmString> realmGet$toppingIdsStopList = stateEntity.realmGet$toppingIdsStopList();
            k0<RealmString> k0Var2 = new k0<>();
            stateEntity2.realmSet$toppingIdsStopList(k0Var2);
            int size2 = realmGet$toppingIdsStopList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                k0Var2.add(com_dodopizza_persistence_entity_RealmStringRealmProxy.f(realmGet$toppingIdsStopList.get(i5), i3, i2, map));
            }
        }
        stateEntity2.realmSet$dataPayment(com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy.f(stateEntity.realmGet$dataPayment(), i3, i2, map));
        if (i == i2) {
            stateEntity2.realmSet$errors(null);
        } else {
            k0<StateErrorEntity> realmGet$errors = stateEntity.realmGet$errors();
            k0<StateErrorEntity> k0Var3 = new k0<>();
            stateEntity2.realmSet$errors(k0Var3);
            int size3 = realmGet$errors.size();
            for (int i6 = 0; i6 < size3; i6++) {
                k0Var3.add(com_dodopizza_persistence_entity_StateErrorEntityRealmProxy.f(realmGet$errors.get(i6), i3, i2, map));
            }
        }
        if (i == i2) {
            stateEntity2.realmSet$warnings(null);
        } else {
            k0<StateWarningEntity> realmGet$warnings = stateEntity.realmGet$warnings();
            k0<StateWarningEntity> k0Var4 = new k0<>();
            stateEntity2.realmSet$warnings(k0Var4);
            int size4 = realmGet$warnings.size();
            for (int i7 = 0; i7 < size4; i7++) {
                k0Var4.add(com_dodopizza_persistence_entity_StateWarningEntityRealmProxy.f(realmGet$warnings.get(i7), i3, i2, map));
            }
        }
        stateEntity2.realmSet$upsale(com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy.f(stateEntity.realmGet$upsale(), i3, i2, map));
        stateEntity2.realmSet$isTakeaway(stateEntity.realmGet$isTakeaway());
        stateEntity2.realmSet$taxPayerId(stateEntity.realmGet$taxPayerId());
        stateEntity2.realmSet$tableNumber(stateEntity.realmGet$tableNumber());
        stateEntity2.realmSet$prizoteka(com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy.f(stateEntity.realmGet$prizoteka(), i3, i2, map));
        stateEntity2.realmSet$personalization(com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy.f(stateEntity.realmGet$personalization(), i3, i2, map));
        stateEntity2.realmSet$delivery(com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy.f(stateEntity.realmGet$delivery(), i3, i2, map));
        stateEntity2.realmSet$pizzeriaAverageServiceTimeMinutes(stateEntity.realmGet$pizzeriaAverageServiceTimeMinutes());
        stateEntity2.realmSet$packageInfo(com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy.f(stateEntity.realmGet$packageInfo(), i3, i2, map));
        return stateEntity2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "StateEntity", false, 31, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, realmFieldType, false, false, true);
        bVar.b("", "placedOrderId", realmFieldType, false, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.b("", "step", realmFieldType2, false, false, false);
        RealmFieldType realmFieldType3 = RealmFieldType.BOOLEAN;
        bVar.b("", "isWorkload", realmFieldType3, false, false, true);
        bVar.b("", "orderPizzeriaId", realmFieldType, false, false, false);
        RealmFieldType realmFieldType4 = RealmFieldType.OBJECT;
        bVar.a("", "cart", realmFieldType4, "CartEntity");
        bVar.b("", "cartError", realmFieldType2, false, false, false);
        bVar.b("", "localityId", realmFieldType, true, false, false);
        RealmFieldType realmFieldType5 = RealmFieldType.DOUBLE;
        bVar.b("", "minDeliveryPrice", realmFieldType5, false, false, true);
        bVar.b("", "minDeliveryPriceCustomized", realmFieldType5, false, false, true);
        bVar.b("", "expectedMinutesToReceiveForASAP", realmFieldType2, false, false, true);
        bVar.a("", "deliveryAddressEntity", realmFieldType4, "DeliveryAddressEntity");
        bVar.a("", "clientDeliveryLocationEntity", realmFieldType4, "ClientDeliveryLocationEntity");
        bVar.b("", "deferredOrderTime", realmFieldType, false, false, false);
        bVar.b("", LocalityEntity.FIELD_COUNTRY_CODE, realmFieldType2, false, false, false);
        bVar.b("", "currentOrderType", realmFieldType2, false, false, false);
        bVar.b("", "languageCode", realmFieldType, false, false, false);
        RealmFieldType realmFieldType6 = RealmFieldType.LIST;
        bVar.a("", "productIdsStopList", realmFieldType6, "RealmString");
        bVar.a("", "toppingIdsStopList", realmFieldType6, "RealmString");
        bVar.a("", "dataPayment", realmFieldType4, "DataPaymentEntity");
        bVar.a("", "errors", realmFieldType6, "StateErrorEntity");
        bVar.a("", "warnings", realmFieldType6, "StateWarningEntity");
        bVar.a("", "upsale", realmFieldType4, "UpsaleEntity");
        bVar.b("", "isTakeaway", realmFieldType3, false, false, false);
        bVar.b("", "taxPayerId", realmFieldType, false, false, false);
        bVar.b("", "tableNumber", realmFieldType2, false, false, false);
        bVar.a("", "prizoteka", realmFieldType4, "PrizotekaEntity");
        bVar.a("", "personalization", realmFieldType4, "PersonalizationEntity");
        bVar.a("", "delivery", realmFieldType4, "DeliveryFeeLevelsEntity");
        bVar.b("", "pizzeriaAverageServiceTimeMinutes", realmFieldType2, false, false, true);
        bVar.a("", "packageInfo", realmFieldType4, "PackageInfoEntity");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return h;
    }

    public static long i(d0 d0Var, StateEntity stateEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        long j;
        long j2;
        long j3;
        if ((stateEntity instanceof r89) && !n0.isFrozen(stateEntity)) {
            r89 r89Var = (r89) stateEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(StateEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(StateEntity.class);
        long j4 = aVar.l;
        String realmGet$localityId = stateEntity.realmGet$localityId();
        if (realmGet$localityId == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j4);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j4, realmGet$localityId);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j4, realmGet$localityId);
        }
        long j5 = nativeFindFirstString;
        map.put(stateEntity, Long.valueOf(j5));
        String realmGet$workflowId = stateEntity.realmGet$workflowId();
        if (realmGet$workflowId != null) {
            j = j5;
            Table.nativeSetString(nativePtr, aVar.e, j5, realmGet$workflowId, false);
        } else {
            j = j5;
            Table.nativeSetNull(nativePtr, aVar.e, j, false);
        }
        String realmGet$placedOrderId = stateEntity.realmGet$placedOrderId();
        if (realmGet$placedOrderId != null) {
            Table.nativeSetString(nativePtr, aVar.f, j, realmGet$placedOrderId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f, j, false);
        }
        Integer realmGet$step = stateEntity.realmGet$step();
        if (realmGet$step != null) {
            Table.nativeSetLong(nativePtr, aVar.g, j, realmGet$step.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.h, j, stateEntity.realmGet$isWorkload(), false);
        String realmGet$orderPizzeriaId = stateEntity.realmGet$orderPizzeriaId();
        if (realmGet$orderPizzeriaId != null) {
            Table.nativeSetString(nativePtr, aVar.i, j, realmGet$orderPizzeriaId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.i, j, false);
        }
        CartEntity realmGet$cart = stateEntity.realmGet$cart();
        if (realmGet$cart != null) {
            Long l = map.get(realmGet$cart);
            if (l == null) {
                l = Long.valueOf(com_dodopizza_persistence_entity_cart_CartEntityRealmProxy.i(d0Var, realmGet$cart, map));
            }
            Table.nativeSetLink(nativePtr, aVar.j, j, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.j, j);
        }
        Integer realmGet$cartError = stateEntity.realmGet$cartError();
        if (realmGet$cartError != null) {
            Table.nativeSetLong(nativePtr, aVar.k, j, realmGet$cartError.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.k, j, false);
        }
        long j6 = j;
        Table.nativeSetDouble(nativePtr, aVar.m, j6, stateEntity.realmGet$minDeliveryPrice(), false);
        Table.nativeSetDouble(nativePtr, aVar.n, j6, stateEntity.realmGet$minDeliveryPriceCustomized(), false);
        Table.nativeSetLong(nativePtr, aVar.o, j6, stateEntity.realmGet$expectedMinutesToReceiveForASAP(), false);
        DeliveryAddressEntity realmGet$deliveryAddressEntity = stateEntity.realmGet$deliveryAddressEntity();
        if (realmGet$deliveryAddressEntity != null) {
            Long l2 = map.get(realmGet$deliveryAddressEntity);
            if (l2 == null) {
                l2 = Long.valueOf(com_dodopizza_persistence_entity_address_DeliveryAddressEntityRealmProxy.i(d0Var, realmGet$deliveryAddressEntity, map));
            }
            Table.nativeSetLink(nativePtr, aVar.p, j, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.p, j);
        }
        ClientDeliveryLocationEntity realmGet$clientDeliveryLocationEntity = stateEntity.realmGet$clientDeliveryLocationEntity();
        if (realmGet$clientDeliveryLocationEntity != null) {
            Long l3 = map.get(realmGet$clientDeliveryLocationEntity);
            if (l3 == null) {
                l3 = Long.valueOf(com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationEntityRealmProxy.i(d0Var, realmGet$clientDeliveryLocationEntity, map));
            }
            Table.nativeSetLink(nativePtr, aVar.q, j, l3.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.q, j);
        }
        String realmGet$deferredOrderTime = stateEntity.realmGet$deferredOrderTime();
        if (realmGet$deferredOrderTime != null) {
            Table.nativeSetString(nativePtr, aVar.r, j, realmGet$deferredOrderTime, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.r, j, false);
        }
        Integer realmGet$countryCode = stateEntity.realmGet$countryCode();
        if (realmGet$countryCode != null) {
            Table.nativeSetLong(nativePtr, aVar.s, j, realmGet$countryCode.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.s, j, false);
        }
        Integer realmGet$currentOrderType = stateEntity.realmGet$currentOrderType();
        if (realmGet$currentOrderType != null) {
            Table.nativeSetLong(nativePtr, aVar.t, j, realmGet$currentOrderType.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.t, j, false);
        }
        String realmGet$languageCode = stateEntity.realmGet$languageCode();
        if (realmGet$languageCode != null) {
            Table.nativeSetString(nativePtr, aVar.u, j, realmGet$languageCode, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.u, j, false);
        }
        long j7 = j;
        OsList osList = new OsList(I0.r(j7), aVar.v);
        k0<RealmString> realmGet$productIdsStopList = stateEntity.realmGet$productIdsStopList();
        if (realmGet$productIdsStopList != null && realmGet$productIdsStopList.size() == osList.X()) {
            int size = realmGet$productIdsStopList.size();
            int i = 0;
            while (i < size) {
                RealmString realmString = realmGet$productIdsStopList.get(i);
                Long l4 = map.get(realmString);
                if (l4 == null) {
                    l4 = Long.valueOf(com_dodopizza_persistence_entity_RealmStringRealmProxy.i(d0Var, realmString, map));
                }
                osList.U(i, l4.longValue());
                i++;
                nativePtr = nativePtr;
            }
            j2 = nativePtr;
        } else {
            j2 = nativePtr;
            osList.J();
            if (realmGet$productIdsStopList != null) {
                Iterator<RealmString> it = realmGet$productIdsStopList.iterator();
                while (it.hasNext()) {
                    RealmString next = it.next();
                    Long l5 = map.get(next);
                    if (l5 == null) {
                        l5 = Long.valueOf(com_dodopizza_persistence_entity_RealmStringRealmProxy.i(d0Var, next, map));
                    }
                    osList.k(l5.longValue());
                }
            }
        }
        OsList osList2 = new OsList(I0.r(j7), aVar.w);
        k0<RealmString> realmGet$toppingIdsStopList = stateEntity.realmGet$toppingIdsStopList();
        if (realmGet$toppingIdsStopList != null && realmGet$toppingIdsStopList.size() == osList2.X()) {
            int size2 = realmGet$toppingIdsStopList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                RealmString realmString2 = realmGet$toppingIdsStopList.get(i2);
                Long l6 = map.get(realmString2);
                if (l6 == null) {
                    l6 = Long.valueOf(com_dodopizza_persistence_entity_RealmStringRealmProxy.i(d0Var, realmString2, map));
                }
                osList2.U(i2, l6.longValue());
            }
        } else {
            osList2.J();
            if (realmGet$toppingIdsStopList != null) {
                Iterator<RealmString> it2 = realmGet$toppingIdsStopList.iterator();
                while (it2.hasNext()) {
                    RealmString next2 = it2.next();
                    Long l7 = map.get(next2);
                    if (l7 == null) {
                        l7 = Long.valueOf(com_dodopizza_persistence_entity_RealmStringRealmProxy.i(d0Var, next2, map));
                    }
                    osList2.k(l7.longValue());
                }
            }
        }
        DataPaymentEntity realmGet$dataPayment = stateEntity.realmGet$dataPayment();
        if (realmGet$dataPayment != null) {
            Long l8 = map.get(realmGet$dataPayment);
            if (l8 == null) {
                l8 = Long.valueOf(com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy.i(d0Var, realmGet$dataPayment, map));
            }
            j3 = j7;
            Table.nativeSetLink(j2, aVar.x, j7, l8.longValue(), false);
        } else {
            j3 = j7;
            Table.nativeNullifyLink(j2, aVar.x, j3);
        }
        long j8 = j3;
        OsList osList3 = new OsList(I0.r(j8), aVar.y);
        k0<StateErrorEntity> realmGet$errors = stateEntity.realmGet$errors();
        if (realmGet$errors != null && realmGet$errors.size() == osList3.X()) {
            int size3 = realmGet$errors.size();
            for (int i3 = 0; i3 < size3; i3++) {
                StateErrorEntity stateErrorEntity = realmGet$errors.get(i3);
                Long l9 = map.get(stateErrorEntity);
                if (l9 == null) {
                    l9 = Long.valueOf(com_dodopizza_persistence_entity_StateErrorEntityRealmProxy.i(d0Var, stateErrorEntity, map));
                }
                osList3.U(i3, l9.longValue());
            }
        } else {
            osList3.J();
            if (realmGet$errors != null) {
                Iterator<StateErrorEntity> it3 = realmGet$errors.iterator();
                while (it3.hasNext()) {
                    StateErrorEntity next3 = it3.next();
                    Long l10 = map.get(next3);
                    if (l10 == null) {
                        l10 = Long.valueOf(com_dodopizza_persistence_entity_StateErrorEntityRealmProxy.i(d0Var, next3, map));
                    }
                    osList3.k(l10.longValue());
                }
            }
        }
        OsList osList4 = new OsList(I0.r(j8), aVar.z);
        k0<StateWarningEntity> realmGet$warnings = stateEntity.realmGet$warnings();
        if (realmGet$warnings != null && realmGet$warnings.size() == osList4.X()) {
            int size4 = realmGet$warnings.size();
            for (int i4 = 0; i4 < size4; i4++) {
                StateWarningEntity stateWarningEntity = realmGet$warnings.get(i4);
                Long l11 = map.get(stateWarningEntity);
                if (l11 == null) {
                    l11 = Long.valueOf(com_dodopizza_persistence_entity_StateWarningEntityRealmProxy.i(d0Var, stateWarningEntity, map));
                }
                osList4.U(i4, l11.longValue());
            }
        } else {
            osList4.J();
            if (realmGet$warnings != null) {
                Iterator<StateWarningEntity> it4 = realmGet$warnings.iterator();
                while (it4.hasNext()) {
                    StateWarningEntity next4 = it4.next();
                    Long l12 = map.get(next4);
                    if (l12 == null) {
                        l12 = Long.valueOf(com_dodopizza_persistence_entity_StateWarningEntityRealmProxy.i(d0Var, next4, map));
                    }
                    osList4.k(l12.longValue());
                }
            }
        }
        UpsaleEntity realmGet$upsale = stateEntity.realmGet$upsale();
        if (realmGet$upsale != null) {
            Long l13 = map.get(realmGet$upsale);
            if (l13 == null) {
                l13 = Long.valueOf(com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy.i(d0Var, realmGet$upsale, map));
            }
            Table.nativeSetLink(j2, aVar.A, j8, l13.longValue(), false);
        } else {
            Table.nativeNullifyLink(j2, aVar.A, j8);
        }
        Boolean realmGet$isTakeaway = stateEntity.realmGet$isTakeaway();
        if (realmGet$isTakeaway != null) {
            Table.nativeSetBoolean(j2, aVar.B, j8, realmGet$isTakeaway.booleanValue(), false);
        } else {
            Table.nativeSetNull(j2, aVar.B, j8, false);
        }
        String realmGet$taxPayerId = stateEntity.realmGet$taxPayerId();
        if (realmGet$taxPayerId != null) {
            Table.nativeSetString(j2, aVar.C, j8, realmGet$taxPayerId, false);
        } else {
            Table.nativeSetNull(j2, aVar.C, j8, false);
        }
        Integer realmGet$tableNumber = stateEntity.realmGet$tableNumber();
        if (realmGet$tableNumber != null) {
            Table.nativeSetLong(j2, aVar.D, j8, realmGet$tableNumber.longValue(), false);
        } else {
            Table.nativeSetNull(j2, aVar.D, j8, false);
        }
        PrizotekaEntity realmGet$prizoteka = stateEntity.realmGet$prizoteka();
        if (realmGet$prizoteka != null) {
            Long l14 = map.get(realmGet$prizoteka);
            if (l14 == null) {
                l14 = Long.valueOf(com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy.i(d0Var, realmGet$prizoteka, map));
            }
            Table.nativeSetLink(j2, aVar.E, j8, l14.longValue(), false);
        } else {
            Table.nativeNullifyLink(j2, aVar.E, j8);
        }
        PersonalizationEntity realmGet$personalization = stateEntity.realmGet$personalization();
        if (realmGet$personalization != null) {
            Long l15 = map.get(realmGet$personalization);
            if (l15 == null) {
                l15 = Long.valueOf(com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy.i(d0Var, realmGet$personalization, map));
            }
            Table.nativeSetLink(j2, aVar.F, j8, l15.longValue(), false);
        } else {
            Table.nativeNullifyLink(j2, aVar.F, j8);
        }
        DeliveryFeeLevelsEntity realmGet$delivery = stateEntity.realmGet$delivery();
        if (realmGet$delivery != null) {
            Long l16 = map.get(realmGet$delivery);
            if (l16 == null) {
                l16 = Long.valueOf(com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy.i(d0Var, realmGet$delivery, map));
            }
            Table.nativeSetLink(j2, aVar.G, j8, l16.longValue(), false);
        } else {
            Table.nativeNullifyLink(j2, aVar.G, j8);
        }
        Table.nativeSetLong(j2, aVar.H, j8, stateEntity.realmGet$pizzeriaAverageServiceTimeMinutes(), false);
        PackageInfoEntity realmGet$packageInfo = stateEntity.realmGet$packageInfo();
        if (realmGet$packageInfo != null) {
            Long l17 = map.get(realmGet$packageInfo);
            if (l17 == null) {
                l17 = Long.valueOf(com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy.i(d0Var, realmGet$packageInfo, map));
            }
            Table.nativeSetLink(j2, aVar.I, j8, l17.longValue(), false);
        } else {
            Table.nativeNullifyLink(j2, aVar.I, j8);
        }
        return j8;
    }

    static com_dodopizza_persistence_entity_cart_StateEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(StateEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_cart_StateEntityRealmProxy com_dodopizza_persistence_entity_cart_stateentityrealmproxy = new com_dodopizza_persistence_entity_cart_StateEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_cart_stateentityrealmproxy;
    }

    static StateEntity k(d0 d0Var, a aVar, StateEntity stateEntity, StateEntity stateEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(StateEntity.class), set);
        osObjectBuilder.E0(aVar.e, stateEntity2.realmGet$workflowId());
        osObjectBuilder.E0(aVar.f, stateEntity2.realmGet$placedOrderId());
        osObjectBuilder.o0(aVar.g, stateEntity2.realmGet$step());
        osObjectBuilder.j0(aVar.h, Boolean.valueOf(stateEntity2.realmGet$isWorkload()));
        osObjectBuilder.E0(aVar.i, stateEntity2.realmGet$orderPizzeriaId());
        CartEntity realmGet$cart = stateEntity2.realmGet$cart();
        if (realmGet$cart == null) {
            osObjectBuilder.r0(aVar.j);
        } else {
            CartEntity cartEntity = (CartEntity) map.get(realmGet$cart);
            if (cartEntity != null) {
                osObjectBuilder.x0(aVar.j, cartEntity);
            } else {
                osObjectBuilder.x0(aVar.j, com_dodopizza_persistence_entity_cart_CartEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartEntityRealmProxy.a) d0Var.u().e(CartEntity.class), realmGet$cart, true, map, set));
            }
        }
        osObjectBuilder.o0(aVar.k, stateEntity2.realmGet$cartError());
        osObjectBuilder.E0(aVar.l, stateEntity2.realmGet$localityId());
        osObjectBuilder.l0(aVar.m, Double.valueOf(stateEntity2.realmGet$minDeliveryPrice()));
        osObjectBuilder.l0(aVar.n, Double.valueOf(stateEntity2.realmGet$minDeliveryPriceCustomized()));
        osObjectBuilder.o0(aVar.o, Integer.valueOf(stateEntity2.realmGet$expectedMinutesToReceiveForASAP()));
        DeliveryAddressEntity realmGet$deliveryAddressEntity = stateEntity2.realmGet$deliveryAddressEntity();
        if (realmGet$deliveryAddressEntity == null) {
            osObjectBuilder.r0(aVar.p);
        } else {
            DeliveryAddressEntity deliveryAddressEntity = (DeliveryAddressEntity) map.get(realmGet$deliveryAddressEntity);
            if (deliveryAddressEntity != null) {
                osObjectBuilder.x0(aVar.p, deliveryAddressEntity);
            } else {
                osObjectBuilder.x0(aVar.p, com_dodopizza_persistence_entity_address_DeliveryAddressEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_address_DeliveryAddressEntityRealmProxy.a) d0Var.u().e(DeliveryAddressEntity.class), realmGet$deliveryAddressEntity, true, map, set));
            }
        }
        ClientDeliveryLocationEntity realmGet$clientDeliveryLocationEntity = stateEntity2.realmGet$clientDeliveryLocationEntity();
        if (realmGet$clientDeliveryLocationEntity == null) {
            osObjectBuilder.r0(aVar.q);
        } else {
            ClientDeliveryLocationEntity clientDeliveryLocationEntity = (ClientDeliveryLocationEntity) map.get(realmGet$clientDeliveryLocationEntity);
            if (clientDeliveryLocationEntity != null) {
                osObjectBuilder.x0(aVar.q, clientDeliveryLocationEntity);
            } else {
                osObjectBuilder.x0(aVar.q, com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationEntityRealmProxy.a) d0Var.u().e(ClientDeliveryLocationEntity.class), realmGet$clientDeliveryLocationEntity, true, map, set));
            }
        }
        osObjectBuilder.E0(aVar.r, stateEntity2.realmGet$deferredOrderTime());
        osObjectBuilder.o0(aVar.s, stateEntity2.realmGet$countryCode());
        osObjectBuilder.o0(aVar.t, stateEntity2.realmGet$currentOrderType());
        osObjectBuilder.E0(aVar.u, stateEntity2.realmGet$languageCode());
        k0<RealmString> realmGet$productIdsStopList = stateEntity2.realmGet$productIdsStopList();
        if (realmGet$productIdsStopList != null) {
            k0 k0Var = new k0();
            for (int i = 0; i < realmGet$productIdsStopList.size(); i++) {
                RealmString realmString = realmGet$productIdsStopList.get(i);
                RealmString realmString2 = (RealmString) map.get(realmString);
                if (realmString2 != null) {
                    k0Var.add(realmString2);
                } else {
                    k0Var.add(com_dodopizza_persistence_entity_RealmStringRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_RealmStringRealmProxy.a) d0Var.u().e(RealmString.class), realmString, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.v, k0Var);
        } else {
            osObjectBuilder.z0(aVar.v, new k0());
        }
        k0<RealmString> realmGet$toppingIdsStopList = stateEntity2.realmGet$toppingIdsStopList();
        if (realmGet$toppingIdsStopList != null) {
            k0 k0Var2 = new k0();
            for (int i2 = 0; i2 < realmGet$toppingIdsStopList.size(); i2++) {
                RealmString realmString3 = realmGet$toppingIdsStopList.get(i2);
                RealmString realmString4 = (RealmString) map.get(realmString3);
                if (realmString4 != null) {
                    k0Var2.add(realmString4);
                } else {
                    k0Var2.add(com_dodopizza_persistence_entity_RealmStringRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_RealmStringRealmProxy.a) d0Var.u().e(RealmString.class), realmString3, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.w, k0Var2);
        } else {
            osObjectBuilder.z0(aVar.w, new k0());
        }
        DataPaymentEntity realmGet$dataPayment = stateEntity2.realmGet$dataPayment();
        if (realmGet$dataPayment == null) {
            osObjectBuilder.r0(aVar.x);
        } else {
            DataPaymentEntity dataPaymentEntity = (DataPaymentEntity) map.get(realmGet$dataPayment);
            if (dataPaymentEntity != null) {
                osObjectBuilder.x0(aVar.x, dataPaymentEntity);
            } else {
                osObjectBuilder.x0(aVar.x, com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy.a) d0Var.u().e(DataPaymentEntity.class), realmGet$dataPayment, true, map, set));
            }
        }
        k0<StateErrorEntity> realmGet$errors = stateEntity2.realmGet$errors();
        if (realmGet$errors != null) {
            k0 k0Var3 = new k0();
            for (int i3 = 0; i3 < realmGet$errors.size(); i3++) {
                StateErrorEntity stateErrorEntity = realmGet$errors.get(i3);
                StateErrorEntity stateErrorEntity2 = (StateErrorEntity) map.get(stateErrorEntity);
                if (stateErrorEntity2 != null) {
                    k0Var3.add(stateErrorEntity2);
                } else {
                    k0Var3.add(com_dodopizza_persistence_entity_StateErrorEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_StateErrorEntityRealmProxy.a) d0Var.u().e(StateErrorEntity.class), stateErrorEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.y, k0Var3);
        } else {
            osObjectBuilder.z0(aVar.y, new k0());
        }
        k0<StateWarningEntity> realmGet$warnings = stateEntity2.realmGet$warnings();
        if (realmGet$warnings != null) {
            k0 k0Var4 = new k0();
            for (int i4 = 0; i4 < realmGet$warnings.size(); i4++) {
                StateWarningEntity stateWarningEntity = realmGet$warnings.get(i4);
                StateWarningEntity stateWarningEntity2 = (StateWarningEntity) map.get(stateWarningEntity);
                if (stateWarningEntity2 != null) {
                    k0Var4.add(stateWarningEntity2);
                } else {
                    k0Var4.add(com_dodopizza_persistence_entity_StateWarningEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_StateWarningEntityRealmProxy.a) d0Var.u().e(StateWarningEntity.class), stateWarningEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.z, k0Var4);
        } else {
            osObjectBuilder.z0(aVar.z, new k0());
        }
        UpsaleEntity realmGet$upsale = stateEntity2.realmGet$upsale();
        if (realmGet$upsale == null) {
            osObjectBuilder.r0(aVar.A);
        } else {
            UpsaleEntity upsaleEntity = (UpsaleEntity) map.get(realmGet$upsale);
            if (upsaleEntity != null) {
                osObjectBuilder.x0(aVar.A, upsaleEntity);
            } else {
                osObjectBuilder.x0(aVar.A, com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy.a) d0Var.u().e(UpsaleEntity.class), realmGet$upsale, true, map, set));
            }
        }
        osObjectBuilder.j0(aVar.B, stateEntity2.realmGet$isTakeaway());
        osObjectBuilder.E0(aVar.C, stateEntity2.realmGet$taxPayerId());
        osObjectBuilder.o0(aVar.D, stateEntity2.realmGet$tableNumber());
        PrizotekaEntity realmGet$prizoteka = stateEntity2.realmGet$prizoteka();
        if (realmGet$prizoteka == null) {
            osObjectBuilder.r0(aVar.E);
        } else {
            PrizotekaEntity prizotekaEntity = (PrizotekaEntity) map.get(realmGet$prizoteka);
            if (prizotekaEntity != null) {
                osObjectBuilder.x0(aVar.E, prizotekaEntity);
            } else {
                osObjectBuilder.x0(aVar.E, com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy.a) d0Var.u().e(PrizotekaEntity.class), realmGet$prizoteka, true, map, set));
            }
        }
        PersonalizationEntity realmGet$personalization = stateEntity2.realmGet$personalization();
        if (realmGet$personalization == null) {
            osObjectBuilder.r0(aVar.F);
        } else {
            PersonalizationEntity personalizationEntity = (PersonalizationEntity) map.get(realmGet$personalization);
            if (personalizationEntity != null) {
                osObjectBuilder.x0(aVar.F, personalizationEntity);
            } else {
                osObjectBuilder.x0(aVar.F, com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy.a) d0Var.u().e(PersonalizationEntity.class), realmGet$personalization, true, map, set));
            }
        }
        DeliveryFeeLevelsEntity realmGet$delivery = stateEntity2.realmGet$delivery();
        if (realmGet$delivery == null) {
            osObjectBuilder.r0(aVar.G);
        } else {
            DeliveryFeeLevelsEntity deliveryFeeLevelsEntity = (DeliveryFeeLevelsEntity) map.get(realmGet$delivery);
            if (deliveryFeeLevelsEntity != null) {
                osObjectBuilder.x0(aVar.G, deliveryFeeLevelsEntity);
            } else {
                osObjectBuilder.x0(aVar.G, com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy.a) d0Var.u().e(DeliveryFeeLevelsEntity.class), realmGet$delivery, true, map, set));
            }
        }
        osObjectBuilder.o0(aVar.H, Integer.valueOf(stateEntity2.realmGet$pizzeriaAverageServiceTimeMinutes()));
        PackageInfoEntity realmGet$packageInfo = stateEntity2.realmGet$packageInfo();
        if (realmGet$packageInfo == null) {
            osObjectBuilder.r0(aVar.I);
        } else {
            PackageInfoEntity packageInfoEntity = (PackageInfoEntity) map.get(realmGet$packageInfo);
            if (packageInfoEntity != null) {
                osObjectBuilder.x0(aVar.I, packageInfoEntity);
            } else {
                osObjectBuilder.x0(aVar.I, com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy.a) d0Var.u().e(PackageInfoEntity.class), realmGet$packageInfo, true, map, set));
            }
        }
        osObjectBuilder.K0();
        return stateEntity;
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
        c0<StateEntity> c0Var = new c0<>(this);
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
        com_dodopizza_persistence_entity_cart_StateEntityRealmProxy com_dodopizza_persistence_entity_cart_stateentityrealmproxy = (com_dodopizza_persistence_entity_cart_StateEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_cart_stateentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_cart_stateentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_cart_stateentityrealmproxy.c.g().E0()) {
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

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public CartEntity realmGet$cart() {
        this.c.f().c();
        if (this.c.g().o0(this.b.j)) {
            return null;
        }
        return (CartEntity) this.c.f().o(CartEntity.class, this.c.g().L(this.b.j), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public Integer realmGet$cartError() {
        this.c.f().c();
        if (this.c.g().w(this.b.k)) {
            return null;
        }
        return Integer.valueOf((int) this.c.g().e0(this.b.k));
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public ClientDeliveryLocationEntity realmGet$clientDeliveryLocationEntity() {
        this.c.f().c();
        if (this.c.g().o0(this.b.q)) {
            return null;
        }
        return (ClientDeliveryLocationEntity) this.c.f().o(ClientDeliveryLocationEntity.class, this.c.g().L(this.b.q), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public Integer realmGet$countryCode() {
        this.c.f().c();
        if (this.c.g().w(this.b.s)) {
            return null;
        }
        return Integer.valueOf((int) this.c.g().e0(this.b.s));
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public Integer realmGet$currentOrderType() {
        this.c.f().c();
        if (this.c.g().w(this.b.t)) {
            return null;
        }
        return Integer.valueOf((int) this.c.g().e0(this.b.t));
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public DataPaymentEntity realmGet$dataPayment() {
        this.c.f().c();
        if (this.c.g().o0(this.b.x)) {
            return null;
        }
        return (DataPaymentEntity) this.c.f().o(DataPaymentEntity.class, this.c.g().L(this.b.x), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public String realmGet$deferredOrderTime() {
        this.c.f().c();
        return this.c.g().p0(this.b.r);
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public DeliveryFeeLevelsEntity realmGet$delivery() {
        this.c.f().c();
        if (this.c.g().o0(this.b.G)) {
            return null;
        }
        return (DeliveryFeeLevelsEntity) this.c.f().o(DeliveryFeeLevelsEntity.class, this.c.g().L(this.b.G), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public DeliveryAddressEntity realmGet$deliveryAddressEntity() {
        this.c.f().c();
        if (this.c.g().o0(this.b.p)) {
            return null;
        }
        return (DeliveryAddressEntity) this.c.f().o(DeliveryAddressEntity.class, this.c.g().L(this.b.p), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public k0<StateErrorEntity> realmGet$errors() {
        this.c.f().c();
        k0<StateErrorEntity> k0Var = this.f;
        if (k0Var != null) {
            return k0Var;
        }
        k0<StateErrorEntity> k0Var2 = new k0<>(StateErrorEntity.class, this.c.g().f0(this.b.y), this.c.f());
        this.f = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public int realmGet$expectedMinutesToReceiveForASAP() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.o);
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public Boolean realmGet$isTakeaway() {
        this.c.f().c();
        if (this.c.g().w(this.b.B)) {
            return null;
        }
        return Boolean.valueOf(this.c.g().b0(this.b.B));
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public boolean realmGet$isWorkload() {
        this.c.f().c();
        return this.c.g().b0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public String realmGet$languageCode() {
        this.c.f().c();
        return this.c.g().p0(this.b.u);
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public String realmGet$localityId() {
        this.c.f().c();
        return this.c.g().p0(this.b.l);
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public double realmGet$minDeliveryPrice() {
        this.c.f().c();
        return this.c.g().K(this.b.m);
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public double realmGet$minDeliveryPriceCustomized() {
        this.c.f().c();
        return this.c.g().K(this.b.n);
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public String realmGet$orderPizzeriaId() {
        this.c.f().c();
        return this.c.g().p0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public PackageInfoEntity realmGet$packageInfo() {
        this.c.f().c();
        if (this.c.g().o0(this.b.I)) {
            return null;
        }
        return (PackageInfoEntity) this.c.f().o(PackageInfoEntity.class, this.c.g().L(this.b.I), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public PersonalizationEntity realmGet$personalization() {
        this.c.f().c();
        if (this.c.g().o0(this.b.F)) {
            return null;
        }
        return (PersonalizationEntity) this.c.f().o(PersonalizationEntity.class, this.c.g().L(this.b.F), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public int realmGet$pizzeriaAverageServiceTimeMinutes() {
        this.c.f().c();
        return (int) this.c.g().e0(this.b.H);
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public String realmGet$placedOrderId() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public PrizotekaEntity realmGet$prizoteka() {
        this.c.f().c();
        if (this.c.g().o0(this.b.E)) {
            return null;
        }
        return (PrizotekaEntity) this.c.f().o(PrizotekaEntity.class, this.c.g().L(this.b.E), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public k0<RealmString> realmGet$productIdsStopList() {
        this.c.f().c();
        k0<RealmString> k0Var = this.d;
        if (k0Var != null) {
            return k0Var;
        }
        k0<RealmString> k0Var2 = new k0<>(RealmString.class, this.c.g().f0(this.b.v), this.c.f());
        this.d = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public Integer realmGet$step() {
        this.c.f().c();
        if (this.c.g().w(this.b.g)) {
            return null;
        }
        return Integer.valueOf((int) this.c.g().e0(this.b.g));
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public Integer realmGet$tableNumber() {
        this.c.f().c();
        if (this.c.g().w(this.b.D)) {
            return null;
        }
        return Integer.valueOf((int) this.c.g().e0(this.b.D));
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public String realmGet$taxPayerId() {
        this.c.f().c();
        return this.c.g().p0(this.b.C);
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public k0<RealmString> realmGet$toppingIdsStopList() {
        this.c.f().c();
        k0<RealmString> k0Var = this.e;
        if (k0Var != null) {
            return k0Var;
        }
        k0<RealmString> k0Var2 = new k0<>(RealmString.class, this.c.g().f0(this.b.w), this.c.f());
        this.e = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public UpsaleEntity realmGet$upsale() {
        this.c.f().c();
        if (this.c.g().o0(this.b.A)) {
            return null;
        }
        return (UpsaleEntity) this.c.f().o(UpsaleEntity.class, this.c.g().L(this.b.A), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public k0<StateWarningEntity> realmGet$warnings() {
        this.c.f().c();
        k0<StateWarningEntity> k0Var = this.g;
        if (k0Var != null) {
            return k0Var;
        }
        k0<StateWarningEntity> k0Var2 = new k0<>(StateWarningEntity.class, this.c.g().f0(this.b.z), this.c.f());
        this.g = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public String realmGet$workflowId() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$cart(CartEntity cartEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("cart")) {
                return;
            }
            if (cartEntity != null && !n0.isManaged(cartEntity)) {
                cartEntity = (CartEntity) d0Var.f0(cartEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (cartEntity == null) {
                g.l0(this.b.j);
                return;
            }
            this.c.c(cartEntity);
            g.o().B(this.b.j, g.E0(), ((r89) cartEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (cartEntity == null) {
            this.c.g().l0(this.b.j);
            return;
        }
        this.c.c(cartEntity);
        this.c.g().s(this.b.j, ((r89) cartEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$cartError(Integer num) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (num == null) {
                g.o().D(this.b.k, g.E0(), true);
                return;
            } else {
                g.o().C(this.b.k, g.E0(), num.intValue(), true);
                return;
            }
        }
        this.c.f().c();
        if (num == null) {
            this.c.g().G(this.b.k);
        } else {
            this.c.g().u(this.b.k, num.intValue());
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$clientDeliveryLocationEntity(ClientDeliveryLocationEntity clientDeliveryLocationEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("clientDeliveryLocationEntity")) {
                return;
            }
            if (clientDeliveryLocationEntity != null && !n0.isManaged(clientDeliveryLocationEntity)) {
                clientDeliveryLocationEntity = (ClientDeliveryLocationEntity) d0Var.j0(clientDeliveryLocationEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (clientDeliveryLocationEntity == null) {
                g.l0(this.b.q);
                return;
            }
            this.c.c(clientDeliveryLocationEntity);
            g.o().B(this.b.q, g.E0(), ((r89) clientDeliveryLocationEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (clientDeliveryLocationEntity == null) {
            this.c.g().l0(this.b.q);
            return;
        }
        this.c.c(clientDeliveryLocationEntity);
        this.c.g().s(this.b.q, ((r89) clientDeliveryLocationEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$countryCode(Integer num) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (num == null) {
                g.o().D(this.b.s, g.E0(), true);
                return;
            } else {
                g.o().C(this.b.s, g.E0(), num.intValue(), true);
                return;
            }
        }
        this.c.f().c();
        if (num == null) {
            this.c.g().G(this.b.s);
        } else {
            this.c.g().u(this.b.s, num.intValue());
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$currentOrderType(Integer num) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (num == null) {
                g.o().D(this.b.t, g.E0(), true);
                return;
            } else {
                g.o().C(this.b.t, g.E0(), num.intValue(), true);
                return;
            }
        }
        this.c.f().c();
        if (num == null) {
            this.c.g().G(this.b.t);
        } else {
            this.c.g().u(this.b.t, num.intValue());
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$dataPayment(DataPaymentEntity dataPaymentEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("dataPayment")) {
                return;
            }
            if (dataPaymentEntity != null && !n0.isManaged(dataPaymentEntity)) {
                dataPaymentEntity = (DataPaymentEntity) d0Var.f0(dataPaymentEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (dataPaymentEntity == null) {
                g.l0(this.b.x);
                return;
            }
            this.c.c(dataPaymentEntity);
            g.o().B(this.b.x, g.E0(), ((r89) dataPaymentEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (dataPaymentEntity == null) {
            this.c.g().l0(this.b.x);
            return;
        }
        this.c.c(dataPaymentEntity);
        this.c.g().s(this.b.x, ((r89) dataPaymentEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$deferredOrderTime(String str) {
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

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$delivery(DeliveryFeeLevelsEntity deliveryFeeLevelsEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("delivery")) {
                return;
            }
            if (deliveryFeeLevelsEntity != null && !n0.isManaged(deliveryFeeLevelsEntity)) {
                deliveryFeeLevelsEntity = (DeliveryFeeLevelsEntity) d0Var.j0(deliveryFeeLevelsEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (deliveryFeeLevelsEntity == null) {
                g.l0(this.b.G);
                return;
            }
            this.c.c(deliveryFeeLevelsEntity);
            g.o().B(this.b.G, g.E0(), ((r89) deliveryFeeLevelsEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (deliveryFeeLevelsEntity == null) {
            this.c.g().l0(this.b.G);
            return;
        }
        this.c.c(deliveryFeeLevelsEntity);
        this.c.g().s(this.b.G, ((r89) deliveryFeeLevelsEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$deliveryAddressEntity(DeliveryAddressEntity deliveryAddressEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("deliveryAddressEntity")) {
                return;
            }
            if (deliveryAddressEntity != null && !n0.isManaged(deliveryAddressEntity)) {
                deliveryAddressEntity = (DeliveryAddressEntity) d0Var.j0(deliveryAddressEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (deliveryAddressEntity == null) {
                g.l0(this.b.p);
                return;
            }
            this.c.c(deliveryAddressEntity);
            g.o().B(this.b.p, g.E0(), ((r89) deliveryAddressEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (deliveryAddressEntity == null) {
            this.c.g().l0(this.b.p);
            return;
        }
        this.c.c(deliveryAddressEntity);
        this.c.g().s(this.b.p, ((r89) deliveryAddressEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$errors(k0<StateErrorEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("errors")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<StateErrorEntity> k0Var2 = new k0<>();
                Iterator<StateErrorEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    StateErrorEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((StateErrorEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.y);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i < size) {
                StateErrorEntity stateErrorEntity = k0Var.get(i);
                this.c.c(stateErrorEntity);
                f0.U(i, ((r89) stateErrorEntity).a().g().E0());
                i++;
            }
            return;
        }
        f0.J();
        if (k0Var == null) {
            return;
        }
        int size2 = k0Var.size();
        while (i < size2) {
            StateErrorEntity stateErrorEntity2 = k0Var.get(i);
            this.c.c(stateErrorEntity2);
            f0.k(((r89) stateErrorEntity2).a().g().E0());
            i++;
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$expectedMinutesToReceiveForASAP(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.o, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.o, i);
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$isTakeaway(Boolean bool) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (bool == null) {
                g.o().D(this.b.B, g.E0(), true);
                return;
            } else {
                g.o().y(this.b.B, g.E0(), bool.booleanValue(), true);
                return;
            }
        }
        this.c.f().c();
        if (bool == null) {
            this.c.g().G(this.b.B);
        } else {
            this.c.g().Q(this.b.B, bool.booleanValue());
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$isWorkload(boolean z) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().y(this.b.h, g.E0(), z, true);
            return;
        }
        this.c.f().c();
        this.c.g().Q(this.b.h, z);
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$languageCode(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.u, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.u, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.u);
        } else {
            this.c.g().i(this.b.u, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$localityId(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'localityId' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$minDeliveryPrice(double d) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.m, g.E0(), d, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.m, d);
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$minDeliveryPriceCustomized(double d) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().z(this.b.n, g.E0(), d, true);
            return;
        }
        this.c.f().c();
        this.c.g().x0(this.b.n, d);
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$orderPizzeriaId(String str) {
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

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$packageInfo(PackageInfoEntity packageInfoEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("packageInfo")) {
                return;
            }
            if (packageInfoEntity != null && !n0.isManaged(packageInfoEntity)) {
                packageInfoEntity = (PackageInfoEntity) d0Var.f0(packageInfoEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (packageInfoEntity == null) {
                g.l0(this.b.I);
                return;
            }
            this.c.c(packageInfoEntity);
            g.o().B(this.b.I, g.E0(), ((r89) packageInfoEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (packageInfoEntity == null) {
            this.c.g().l0(this.b.I);
            return;
        }
        this.c.c(packageInfoEntity);
        this.c.g().s(this.b.I, ((r89) packageInfoEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$personalization(PersonalizationEntity personalizationEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("personalization")) {
                return;
            }
            if (personalizationEntity != null && !n0.isManaged(personalizationEntity)) {
                personalizationEntity = (PersonalizationEntity) d0Var.j0(personalizationEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (personalizationEntity == null) {
                g.l0(this.b.F);
                return;
            }
            this.c.c(personalizationEntity);
            g.o().B(this.b.F, g.E0(), ((r89) personalizationEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (personalizationEntity == null) {
            this.c.g().l0(this.b.F);
            return;
        }
        this.c.c(personalizationEntity);
        this.c.g().s(this.b.F, ((r89) personalizationEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$pizzeriaAverageServiceTimeMinutes(int i) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            g.o().C(this.b.H, g.E0(), i, true);
            return;
        }
        this.c.f().c();
        this.c.g().u(this.b.H, i);
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$placedOrderId(String str) {
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

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$prizoteka(PrizotekaEntity prizotekaEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("prizoteka")) {
                return;
            }
            if (prizotekaEntity != null && !n0.isManaged(prizotekaEntity)) {
                prizotekaEntity = (PrizotekaEntity) d0Var.j0(prizotekaEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (prizotekaEntity == null) {
                g.l0(this.b.E);
                return;
            }
            this.c.c(prizotekaEntity);
            g.o().B(this.b.E, g.E0(), ((r89) prizotekaEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (prizotekaEntity == null) {
            this.c.g().l0(this.b.E);
            return;
        }
        this.c.c(prizotekaEntity);
        this.c.g().s(this.b.E, ((r89) prizotekaEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$productIdsStopList(k0<RealmString> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("productIdsStopList")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<RealmString> k0Var2 = new k0<>();
                Iterator<RealmString> it = k0Var.iterator();
                while (it.hasNext()) {
                    RealmString next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((RealmString) d0Var.f0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.v);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i < size) {
                RealmString realmString = k0Var.get(i);
                this.c.c(realmString);
                f0.U(i, ((r89) realmString).a().g().E0());
                i++;
            }
            return;
        }
        f0.J();
        if (k0Var == null) {
            return;
        }
        int size2 = k0Var.size();
        while (i < size2) {
            RealmString realmString2 = k0Var.get(i);
            this.c.c(realmString2);
            f0.k(((r89) realmString2).a().g().E0());
            i++;
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$step(Integer num) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (num == null) {
                g.o().D(this.b.g, g.E0(), true);
                return;
            } else {
                g.o().C(this.b.g, g.E0(), num.intValue(), true);
                return;
            }
        }
        this.c.f().c();
        if (num == null) {
            this.c.g().G(this.b.g);
        } else {
            this.c.g().u(this.b.g, num.intValue());
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$tableNumber(Integer num) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (num == null) {
                g.o().D(this.b.D, g.E0(), true);
                return;
            } else {
                g.o().C(this.b.D, g.E0(), num.intValue(), true);
                return;
            }
        }
        this.c.f().c();
        if (num == null) {
            this.c.g().G(this.b.D);
        } else {
            this.c.g().u(this.b.D, num.intValue());
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$taxPayerId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.C, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.C, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.C);
        } else {
            this.c.g().i(this.b.C, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$toppingIdsStopList(k0<RealmString> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("toppingIdsStopList")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<RealmString> k0Var2 = new k0<>();
                Iterator<RealmString> it = k0Var.iterator();
                while (it.hasNext()) {
                    RealmString next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((RealmString) d0Var.f0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.w);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i < size) {
                RealmString realmString = k0Var.get(i);
                this.c.c(realmString);
                f0.U(i, ((r89) realmString).a().g().E0());
                i++;
            }
            return;
        }
        f0.J();
        if (k0Var == null) {
            return;
        }
        int size2 = k0Var.size();
        while (i < size2) {
            RealmString realmString2 = k0Var.get(i);
            this.c.c(realmString2);
            f0.k(((r89) realmString2).a().g().E0());
            i++;
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$upsale(UpsaleEntity upsaleEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("upsale")) {
                return;
            }
            if (upsaleEntity != null && !n0.isManaged(upsaleEntity)) {
                upsaleEntity = (UpsaleEntity) d0Var.j0(upsaleEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (upsaleEntity == null) {
                g.l0(this.b.A);
                return;
            }
            this.c.c(upsaleEntity);
            g.o().B(this.b.A, g.E0(), ((r89) upsaleEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (upsaleEntity == null) {
            this.c.g().l0(this.b.A);
            return;
        }
        this.c.c(upsaleEntity);
        this.c.g().s(this.b.A, ((r89) upsaleEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$warnings(k0<StateWarningEntity> k0Var) {
        int i = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("warnings")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<StateWarningEntity> k0Var2 = new k0<>();
                Iterator<StateWarningEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    StateWarningEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((StateWarningEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.z);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i < size) {
                StateWarningEntity stateWarningEntity = k0Var.get(i);
                this.c.c(stateWarningEntity);
                f0.U(i, ((r89) stateWarningEntity).a().g().E0());
                i++;
            }
            return;
        }
        f0.J();
        if (k0Var == null) {
            return;
        }
        int size2 = k0Var.size();
        while (i < size2) {
            StateWarningEntity stateWarningEntity2 = k0Var.get(i);
            this.c.c(stateWarningEntity2);
            f0.k(((r89) stateWarningEntity2).a().g().E0());
            i++;
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.StateEntity, defpackage.zfc
    public void realmSet$workflowId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.e, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'workflowId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.e, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'workflowId' to null.");
    }
}
