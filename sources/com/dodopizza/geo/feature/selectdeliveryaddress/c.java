package com.dodopizza.geo.feature.selectdeliveryaddress;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.c;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectDeliveryAddressRouter.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002JV\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u0011JV\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u0011R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/c;", "", "", com.huawei.hms.push.e.a, "", "resultId", "Le91;", "clientDeliveryLocation", "", "isAddressSelected", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a$a;", "clientDeliveryLocationType", "isOnboarding", "Ltl5;", "currentLanguage", "Lqx1;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function1;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "action", "i", "f", "Lf63;", "a", "Lf63;", "router", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;", "b", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;", "data", "<init>", "(Lf63;Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;)V", com.huawei.hms.opendevice.c.a, "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class c {
    public static final a c = new a(null);
    private static final int d = dy8.geo_address_list_result;
    private static final int e = dy8.geo_edit_address_result;
    private static final int f = dy8.geo_onboarding_result;
    private final f63 a;
    private final com.dodopizza.geo.feature.selectdeliveryaddress.b b;

    /* compiled from: SelectDeliveryAddressRouter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/c$a;", "", "", "EDIT_ADDRESS_RESULT_ID", "I", "a", "()I", "ONBOARDING_RESULT_ID", "b", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return c.e;
        }

        public final int b() {
            return c.f;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.geo.feature.selectdeliveryaddress.SelectDeliveryAddressRouter$openEditDeliveryAddressMapFSMFragment$$inlined$listenOnce$1$2", f = "SelectDeliveryAddressRouter.kt", l = {224}, m = "emit")
            /* renamed from: com.dodopizza.geo.feature.selectdeliveryaddress.c$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0155a extends ev1 {
                /* synthetic */ Object a;
                int b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0155a(cv1 cv1Var) {
                    super(cv1Var);
                    a.this = r1;
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

            /* JADX WARN: Removed duplicated region for block: B:31:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.dodopizza.geo.feature.selectdeliveryaddress.c.b.a.C0155a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.dodopizza.geo.feature.selectdeliveryaddress.c$b$a$a r0 = (com.dodopizza.geo.feature.selectdeliveryaddress.c.b.a.C0155a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    com.dodopizza.geo.feature.selectdeliveryaddress.c$b$a$a r0 = new com.dodopizza.geo.feature.selectdeliveryaddress.c$b$a$a
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
                throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.geo.feature.selectdeliveryaddress.c.b.a.emit(java.lang.Object, cv1):java.lang.Object");
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
    /* renamed from: com.dodopizza.geo.feature.selectdeliveryaddress.c$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0156c extends j6 implements Function2<c.a, cv1<? super Unit>, Object> {
        public C0156c(Object obj) {
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
    /* loaded from: classes2.dex */
    public static final class d implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.geo.feature.selectdeliveryaddress.SelectDeliveryAddressRouter$openEditDeliveryAddressMapFragment$$inlined$listenOnce$1$2", f = "SelectDeliveryAddressRouter.kt", l = {224}, m = "emit")
            /* renamed from: com.dodopizza.geo.feature.selectdeliveryaddress.c$d$a$a */
            /* loaded from: classes2.dex */
            public static final class C0157a extends ev1 {
                /* synthetic */ Object a;
                int b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0157a(cv1 cv1Var) {
                    super(cv1Var);
                    a.this = r1;
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

            /* JADX WARN: Removed duplicated region for block: B:31:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.dodopizza.geo.feature.selectdeliveryaddress.c.d.a.C0157a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.dodopizza.geo.feature.selectdeliveryaddress.c$d$a$a r0 = (com.dodopizza.geo.feature.selectdeliveryaddress.c.d.a.C0157a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    com.dodopizza.geo.feature.selectdeliveryaddress.c$d$a$a r0 = new com.dodopizza.geo.feature.selectdeliveryaddress.c$d$a$a
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
                throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.geo.feature.selectdeliveryaddress.c.d.a.emit(java.lang.Object, cv1):java.lang.Object");
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

    public c(f63 f63Var, com.dodopizza.geo.feature.selectdeliveryaddress.b bVar) {
        z65.h(f63Var, "router");
        z65.h(bVar, "data");
        this.a = f63Var;
        this.b = bVar;
    }

    public static /* synthetic */ void g(c cVar, int i, e91 e91Var, boolean z, a.EnumC0142a enumC0142a, boolean z2, tl5 tl5Var, qx1 qx1Var, Function1 function1, int i2, Object obj) {
        tl5 tl5Var2;
        if ((i2 & 32) != 0) {
            tl5Var2 = null;
        } else {
            tl5Var2 = tl5Var;
        }
        cVar.f(i, e91Var, z, enumC0142a, z2, tl5Var2, qx1Var, function1);
    }

    public static final void h(Function1 function1, c.a aVar) {
        z65.h(function1, "$action");
        z65.h(aVar, "result");
        function1.invoke(aVar);
    }

    public static /* synthetic */ void j(c cVar, int i, e91 e91Var, boolean z, a.EnumC0142a enumC0142a, boolean z2, tl5 tl5Var, qx1 qx1Var, Function1 function1, int i2, Object obj) {
        tl5 tl5Var2;
        if ((i2 & 32) != 0) {
            tl5Var2 = null;
        } else {
            tl5Var2 = tl5Var;
        }
        cVar.i(i, e91Var, z, enumC0142a, z2, tl5Var2, qx1Var, function1);
    }

    public static final void k(Function1 function1, c.a aVar) {
        z65.h(function1, "$action");
        z65.h(aVar, "result");
        function1.invoke(aVar);
    }

    public final void e() {
        this.a.e(new cw2(new iv2(d, this.b.j(), this.b.a(), this.b.c(), this.b.b(), this.b.i())));
    }

    public final void f(int i, e91 e91Var, boolean z, a.EnumC0142a enumC0142a, boolean z2, tl5 tl5Var, qx1 qx1Var, final Function1<? super c.a, Unit> function1) {
        z65.h(e91Var, "clientDeliveryLocation");
        z65.h(enumC0142a, "clientDeliveryLocationType");
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        z65.h(function1, "action");
        this.a.e(new com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.c(new com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a(i, e91Var, this.b.j(), z, this.b.b(), this.b.a(), enumC0142a, z2, tl5Var, this.b.i())));
        wz3.C(uz3.a.a(new b(this.a.k(i)), new C0156c(new wk9() { // from class: r5a
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                com.dodopizza.geo.feature.selectdeliveryaddress.c.h(Function1.this, (c.a) obj);
            }
        })), qx1Var);
    }

    public final void i(int i, e91 e91Var, boolean z, a.EnumC0142a enumC0142a, boolean z2, tl5 tl5Var, qx1 qx1Var, final Function1<? super c.a, Unit> function1) {
        z65.h(e91Var, "clientDeliveryLocation");
        z65.h(enumC0142a, "clientDeliveryLocationType");
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        z65.h(function1, "action");
        this.a.e(new h(new com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a(i, e91Var, this.b.j(), z, this.b.b(), this.b.a(), enumC0142a, z2, tl5Var, this.b.i())));
        wz3.C(uz3.a.a(new d(this.a.k(i)), new e(new wk9() { // from class: s5a
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                com.dodopizza.geo.feature.selectdeliveryaddress.c.k(Function1.this, (c.a) obj);
            }
        })), qx1Var);
    }
}
