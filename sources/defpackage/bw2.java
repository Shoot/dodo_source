package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.c;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.h;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: DeliveryAddressListRoutingHandlerImpl.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b#\u0010$Jb\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0016Jb\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0016JD\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J(\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0016R\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!¨\u0006&"}, d2 = {"Lbw2;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c;", "Le91;", "location", "", "isEmptyCart", "isAddressSelected", "Ldt5;", "currentLocality", "", "Lru/dodopizza/app/domain/country/models/CountryCode;", LocalityEntity.FIELD_COUNTRY_CODE, "Lqx1;", Action.SCOPE_ATTRIBUTE, "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a$a;", "locationType", "Lck1;", "sender", "Lkotlin/Function1;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "", "action", "a", "b", com.huawei.hms.opendevice.c.a, "onBackPressed", "selectedClientDeliveryLocation", "locationHaveBeenChanged", "localityHaveBeenChanged", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "stateError", DateTokenConverter.CONVERTER_KEY, "Lf63;", "Lf63;", "router", "<init>", "(Lf63;)V", "g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: bw2  reason: default package */
/* loaded from: classes4.dex */
public final class bw2 implements com.dodopizza.geo.feature.deliveryaddresslist.presentation.c {
    public static final g b = new g(null);
    private final f63 a;

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bw2$a */
    /* loaded from: classes4.dex */
    public static final class a implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: bw2$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0078a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.impl.geo.DeliveryAddressListRoutingHandlerImpl$openDeliveryLocationDetailsFragmentAndListen$$inlined$listenOnce$1$2", f = "DeliveryAddressListRoutingHandlerImpl.kt", l = {224}, m = "emit")
            /* renamed from: bw2$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0079a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0079a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0078a.this.emit(null, this);
                }
            }

            public C0078a(pz3 pz3Var) {
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
                    boolean r0 = r6 instanceof defpackage.bw2.a.C0078a.C0079a
                    if (r0 == 0) goto L13
                    r0 = r6
                    bw2$a$a$a r0 = (defpackage.bw2.a.C0078a.C0079a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    bw2$a$a$a r0 = new bw2$a$a$a
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bw2.a.C0078a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public a(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new C0078a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: DodoRouterExt.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bw2$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b extends j6 implements Function2<c.a, cv1<? super Unit>, Object> {
        public b(Object obj) {
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
    /* renamed from: bw2$c */
    /* loaded from: classes4.dex */
    public static final class c implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: bw2$c$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.impl.geo.DeliveryAddressListRoutingHandlerImpl$openEditDeliveryAddressMapFSMFragmentAndListen$$inlined$listenOnce$1$2", f = "DeliveryAddressListRoutingHandlerImpl.kt", l = {224}, m = "emit")
            /* renamed from: bw2$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0080a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0080a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof defpackage.bw2.c.a.C0080a
                    if (r0 == 0) goto L13
                    r0 = r6
                    bw2$c$a$a r0 = (defpackage.bw2.c.a.C0080a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    bw2$c$a$a r0 = new bw2$c$a$a
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bw2.c.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public c(oz3 oz3Var) {
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
    /* renamed from: bw2$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class d extends j6 implements Function2<c.a, cv1<? super Unit>, Object> {
        public d(Object obj) {
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
    /* renamed from: bw2$e */
    /* loaded from: classes4.dex */
    public static final class e implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: bw2$e$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.impl.geo.DeliveryAddressListRoutingHandlerImpl$openEditDeliveryAddressMapFragmentAndListen$$inlined$listenOnce$1$2", f = "DeliveryAddressListRoutingHandlerImpl.kt", l = {224}, m = "emit")
            /* renamed from: bw2$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0081a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0081a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof defpackage.bw2.e.a.C0081a
                    if (r0 == 0) goto L13
                    r0 = r6
                    bw2$e$a$a r0 = (defpackage.bw2.e.a.C0081a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    bw2$e$a$a r0 = new bw2$e$a$a
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bw2.e.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public e(oz3 oz3Var) {
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
    /* renamed from: bw2$f */
    /* loaded from: classes4.dex */
    public /* synthetic */ class f extends j6 implements Function2<c.a, cv1<? super Unit>, Object> {
        public f(Object obj) {
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

    /* compiled from: DeliveryAddressListRoutingHandlerImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lbw2$g;", "", "", "RESULT_ID", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bw2$g */
    /* loaded from: classes4.dex */
    public static final class g {
        private g() {
        }

        public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public bw2(f63 f63Var) {
        z65.h(f63Var, "router");
        this.a = f63Var;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Function1 function1, c.a aVar) {
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
        this.a.e(new h(new com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a(R.id.select_delivery_location_details_id, e91Var, z, z2, dt5Var, str, enumC0142a, false, null, ck1Var)));
        wz3.C(uz3.a.a(new e(this.a.k(R.id.select_delivery_location_details_id)), new f(new wk9() { // from class: xv2
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                bw2.j(Function1.this, (c.a) obj);
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
        this.a.e(new com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.c(new com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a(R.id.select_delivery_location_details_id, e91Var, z, z2, dt5Var, str, enumC0142a, false, null, ck1Var)));
        wz3.C(uz3.a.a(new c(this.a.k(R.id.select_delivery_location_details_id)), new d(new wk9() { // from class: zv2
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                bw2.i(Function1.this, (c.a) obj);
            }
        })), qx1Var);
    }

    @Override // com.dodopizza.geo.feature.deliveryaddresslist.presentation.c
    public void c(e91 e91Var, boolean z, boolean z2, qx1 qx1Var, ck1 ck1Var, final Function1<? super c.a, Unit> function1) {
        z65.h(e91Var, "location");
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        z65.h(ck1Var, "sender");
        z65.h(function1, "action");
        this.a.e(new ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.f(new rx2(R.id.select_delivery_location_details_id, e91Var, true, true, z, z2, ck1Var)));
        wz3.C(uz3.a.a(new a(this.a.k(R.id.select_delivery_location_details_id)), new b(new wk9() { // from class: vv2
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                bw2.h(Function1.this, (c.a) obj);
            }
        })), qx1Var);
    }

    @Override // com.dodopizza.geo.feature.deliveryaddresslist.presentation.c
    public void d(e91 e91Var, boolean z, boolean z2, a.b bVar) {
        z65.h(e91Var, "selectedClientDeliveryLocation");
        z65.h(bVar, "stateError");
        if (z && z2) {
            this.a.f(h56.c(null, 1, null));
        }
    }

    @Override // com.dodopizza.geo.feature.deliveryaddresslist.presentation.c
    public void onBackPressed() {
        this.a.d();
    }
}
