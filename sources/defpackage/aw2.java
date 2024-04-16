package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.c;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.h;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import defpackage.ep9;
import defpackage.zo9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DeliveryAddressListRoutingHandlerImpl.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020&\u0012\u0006\u0010+\u001a\u00020)¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002Jb\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u0016H\u0016Jb\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u0016H\u0016JD\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J(\u0010\"\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0016R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*¨\u0006."}, d2 = {"Law2;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c;", "Lep9;", "strategyResult", "", "g", "Le91;", "location", "", "isEmptyCart", "isAddressSelected", "Ldt5;", "currentLocality", "", "Lru/dodopizza/app/domain/country/models/CountryCode;", LocalityEntity.FIELD_COUNTRY_CODE, "Lqx1;", Action.SCOPE_ATTRIBUTE, "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a$a;", "locationType", "Lck1;", "sender", "Lkotlin/Function1;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "action", "a", "b", com.huawei.hms.opendevice.c.a, "onBackPressed", "selectedClientDeliveryLocation", "locationHaveBeenChanged", "localityHaveBeenChanged", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "stateError", DateTokenConverter.CONVERTER_KEY, "Lf63;", "Lf63;", "geoRouter", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a;", "appRouter", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;", "data", "<init>", "(Lf63;Lcom/dodopizza/geo/feature/selectdeliveryaddress/a;Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: aw2  reason: default package */
/* loaded from: classes2.dex */
public final class aw2 implements com.dodopizza.geo.feature.deliveryaddresslist.presentation.c {
    public static final a d = new a(null);
    private static final int e = dy8.geo_edit_address_result;
    private final f63 a;
    private final com.dodopizza.geo.feature.selectdeliveryaddress.a b;
    private final com.dodopizza.geo.feature.selectdeliveryaddress.b c;

    /* compiled from: DeliveryAddressListRoutingHandlerImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Law2$a;", "", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: aw2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: aw2$b */
    /* loaded from: classes2.dex */
    public static final class b implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: aw2$b$a */
        /* loaded from: classes2.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.geo.feature.selectdeliveryaddress.routingholders.DeliveryAddressListRoutingHandlerImpl$openEditDeliveryAddressMapFSMFragmentAndListen$$inlined$listenOnce$1$2", f = "DeliveryAddressListRoutingHandlerImpl.kt", l = {224}, m = "emit")
            /* renamed from: aw2$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0057a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0057a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof defpackage.aw2.b.a.C0057a
                    if (r0 == 0) goto L13
                    r0 = r6
                    aw2$b$a$a r0 = (defpackage.aw2.b.a.C0057a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    aw2$b$a$a r0 = new aw2$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    boolean r2 = r5 instanceof com.dodopizza.geo.feature.deliveryaddresslist.presentation.c.a
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aw2.b.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public b(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: DodoRouterExt.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: aw2$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends j6 implements Function2<c.a, cv1<? super Unit>, Object> {
        public c(Object obj) {
            super(2, obj, wk9.class, "onResult", "onResult(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(c.a aVar, cv1<? super Unit> cv1Var) {
            Object b;
            b = h63.b((wk9) this.receiver, aVar, cv1Var);
            return b;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: aw2$d */
    /* loaded from: classes2.dex */
    public static final class d implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: aw2$d$a */
        /* loaded from: classes2.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.geo.feature.selectdeliveryaddress.routingholders.DeliveryAddressListRoutingHandlerImpl$openEditDeliveryAddressMapFragmentAndListen$$inlined$listenOnce$1$2", f = "DeliveryAddressListRoutingHandlerImpl.kt", l = {224}, m = "emit")
            /* renamed from: aw2$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0058a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0058a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof defpackage.aw2.d.a.C0058a
                    if (r0 == 0) goto L13
                    r0 = r6
                    aw2$d$a$a r0 = (defpackage.aw2.d.a.C0058a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    aw2$d$a$a r0 = new aw2$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    boolean r2 = r5 instanceof com.dodopizza.geo.feature.deliveryaddresslist.presentation.c.a
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aw2.d.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public d(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: DodoRouterExt.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: aw2$e */
    /* loaded from: classes2.dex */
    public /* synthetic */ class e extends j6 implements Function2<c.a, cv1<? super Unit>, Object> {
        public e(Object obj) {
            super(2, obj, wk9.class, "onResult", "onResult(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(c.a aVar, cv1<? super Unit> cv1Var) {
            Object b;
            b = h63.b((wk9) this.receiver, aVar, cv1Var);
            return b;
        }
    }

    public aw2(f63 f63Var, com.dodopizza.geo.feature.selectdeliveryaddress.a aVar, com.dodopizza.geo.feature.selectdeliveryaddress.b bVar) {
        z65.h(f63Var, "geoRouter");
        z65.h(aVar, "appRouter");
        z65.h(bVar, "data");
        this.a = f63Var;
        this.b = aVar;
        this.c = bVar;
    }

    private final void g(ep9 ep9Var) {
        if (ep9Var instanceof ep9.a) {
            this.b.a(((ep9.a) ep9Var).a());
        } else if (ep9Var instanceof ep9.b) {
            this.b.b();
        } else if (!(ep9Var instanceof ep9.d) && !(ep9Var instanceof ep9.c) && (ep9Var instanceof ep9.e)) {
            this.a.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Function1 function1, c.a aVar) {
        z65.h(function1, "$action");
        z65.h(aVar, "result");
        function1.invoke(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Function1 function1, c.a aVar) {
        z65.h(function1, "$action");
        z65.h(aVar, "result");
        function1.invoke(aVar);
    }

    @Override // com.dodopizza.geo.feature.deliveryaddresslist.presentation.c
    public void a(e91 e91Var, boolean z, boolean z2, dt5 dt5Var, String str, qx1 qx1Var, a.EnumC0142a enumC0142a, ck1 ck1Var, final Function1<? super c.a, Unit> function1) {
        z65.h(e91Var, "location");
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        z65.h(enumC0142a, "locationType");
        z65.h(ck1Var, "sender");
        z65.h(function1, "action");
        f63 f63Var = this.a;
        int i = e;
        f63Var.e(new h(new com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a(i, e91Var, z, z2, dt5Var, str, enumC0142a, false, null, ck1Var)));
        wz3.C(uz3.a.a(new d(this.a.k(i)), new e(new wk9() { // from class: yv2
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                aw2.i(Function1.this, (c.a) obj);
            }
        })), qx1Var);
    }

    @Override // com.dodopizza.geo.feature.deliveryaddresslist.presentation.c
    public void b(e91 e91Var, boolean z, boolean z2, dt5 dt5Var, String str, qx1 qx1Var, a.EnumC0142a enumC0142a, ck1 ck1Var, final Function1<? super c.a, Unit> function1) {
        z65.h(e91Var, "location");
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        z65.h(enumC0142a, "locationType");
        z65.h(ck1Var, "sender");
        z65.h(function1, "action");
        f63 f63Var = this.a;
        int i = e;
        f63Var.e(new com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.c(new com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a(i, e91Var, z, z2, dt5Var, str, enumC0142a, false, null, ck1Var)));
        wz3.C(uz3.a.a(new b(this.a.k(i)), new c(new wk9() { // from class: wv2
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                aw2.h(Function1.this, (c.a) obj);
            }
        })), qx1Var);
    }

    @Override // com.dodopizza.geo.feature.deliveryaddresslist.presentation.c
    public void c(e91 e91Var, boolean z, boolean z2, qx1 qx1Var, ck1 ck1Var, Function1<? super c.a, Unit> function1) {
        z65.h(e91Var, "location");
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        z65.h(ck1Var, "sender");
        z65.h(function1, "action");
    }

    @Override // com.dodopizza.geo.feature.deliveryaddresslist.presentation.c
    public void d(e91 e91Var, boolean z, boolean z2, a.b bVar) {
        z65.h(e91Var, "selectedClientDeliveryLocation");
        z65.h(bVar, "stateError");
        g(this.c.e().c0(new zo9.c(e91Var, z, z2, bVar)));
    }

    @Override // com.dodopizza.geo.feature.deliveryaddresslist.presentation.c
    public void onBackPressed() {
        g(this.c.e().u0());
    }
}
