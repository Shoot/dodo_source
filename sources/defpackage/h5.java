package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.BonusActionEntity;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ActiveOrderFoodMenuInteractor.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\nB#\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lh5;", "Lg5;", "Lbc7;", com.huawei.hms.push.e.a, "Loz3;", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e;", "b", "Lkotlin/Pair;", "", "", "a", "(Lcv1;)Ljava/lang/Object;", "Lli7;", "Lli7;", "orderService", "Lb5;", "Lb5;", "activeOrderConverter", "Lkx1;", com.huawei.hms.opendevice.c.a, "Lkx1;", "ioDispatcher", "<init>", "(Lli7;Lb5;Lkx1;)V", DateTokenConverter.CONVERTER_KEY, "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: h5  reason: default package */
/* loaded from: classes.dex */
public final class h5 implements g5 {
    public static final a d = new a(null);
    private static final long e = TimeUnit.SECONDS.toMillis(30);
    private final li7 a;
    private final b5 b;
    private final kx1 c;

    /* compiled from: ActiveOrderFoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lh5$a;", "", "", "DELIVERY_TYPE", "I", "", "UPDATE_ORDERS_INTERVAL", "J", "<init>", "()V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h5$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h5$b */
    /* loaded from: classes.dex */
    public static final class b implements oz3<com.dodopizza.activeorder.feature.activeorderwidget.presentation.e> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ h5 b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: h5$b$a */
        /* loaded from: classes.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ h5 b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.activeorder.feature.activeorderwidget.presentation.ActiveOrderFoodMenuInteractorImpl$lastActiveOrder$$inlined$map$1$2", f = "ActiveOrderFoodMenuInteractor.kt", l = {223}, m = "emit")
            /* renamed from: h5$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0344a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0344a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, h5 h5Var) {
                this.a = pz3Var;
                this.b = h5Var;
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
                    boolean r0 = r6 instanceof defpackage.h5.b.a.C0344a
                    if (r0 == 0) goto L13
                    r0 = r6
                    h5$b$a$a r0 = (defpackage.h5.b.a.C0344a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    h5$b$a$a r0 = new h5$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    bc7 r5 = (defpackage.bc7) r5
                    h5 r2 = r4.b
                    b5 r2 = defpackage.h5.d(r2)
                    com.dodopizza.activeorder.feature.activeorderwidget.presentation.e r5 = r2.a(r5)
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.h5.b.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public b(oz3 oz3Var, h5 h5Var) {
            this.a = oz3Var;
            this.b = h5Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super com.dodopizza.activeorder.feature.activeorderwidget.presentation.e> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: ActiveOrderFoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lbc7;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.activeorderwidget.presentation.ActiveOrderFoodMenuInteractorImpl$lastActiveOrder$1", f = "ActiveOrderFoodMenuInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: h5$c */
    /* loaded from: classes.dex */
    static final class c extends f3b implements Function1<cv1<? super bc7>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super bc7> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return h5.this.e();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ActiveOrderFoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lbc7;", BonusActionEntity.ORDER, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.activeorderwidget.presentation.ActiveOrderFoodMenuInteractorImpl$lastActiveOrder$2", f = "ActiveOrderFoodMenuInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: h5$d */
    /* loaded from: classes.dex */
    static final class d extends f3b implements Function2<bc7, cv1<? super Boolean>, Object> {
        int a;
        /* synthetic */ Object b;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(bc7 bc7Var, cv1<? super Boolean> cv1Var) {
            return ((d) create(bc7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (((bc7) this.b) != null) {
                    z = true;
                } else {
                    z = false;
                }
                return nf0.a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ActiveOrderFoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lkotlin/Pair;", "", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.activeorderwidget.presentation.ActiveOrderFoodMenuInteractorImpl$lastOrder$2", f = "ActiveOrderFoodMenuInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: h5$e */
    /* loaded from: classes.dex */
    static final class e extends f3b implements Function2<qx1, cv1<? super Pair<? extends Boolean, ? extends String>>, Object> {
        int a;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new e(cv1Var);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(qx1 qx1Var, cv1<? super Pair<Boolean, String>> cv1Var) {
            return ((e) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            String str;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                bc7 e = h5.this.e();
                boolean z = false;
                if (e != null && e.E() == 1) {
                    z = true;
                }
                Boolean a = nf0.a(z);
                if (e != null) {
                    str = e.t();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                return new Pair(a, str);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Pair<? extends Boolean, ? extends String>> cv1Var) {
            return invoke2(qx1Var, (cv1<? super Pair<Boolean, String>>) cv1Var);
        }
    }

    public h5(li7 li7Var, b5 b5Var, kx1 kx1Var) {
        z65.h(li7Var, "orderService");
        z65.h(b5Var, "activeOrderConverter");
        z65.h(kx1Var, "ioDispatcher");
        this.a = li7Var;
        this.b = b5Var;
        this.c = kx1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bc7 e() {
        Object a0;
        a0 = sc1.a0(this.a.getActiveOrders());
        return (bc7) a0;
    }

    @Override // defpackage.g5
    public Object a(cv1<? super Pair<Boolean, String>> cv1Var) {
        return qh0.g(this.c, new e(null), cv1Var);
    }

    @Override // defpackage.g5
    public oz3<com.dodopizza.activeorder.feature.activeorderwidget.presentation.e> b() {
        return wz3.B(new b(wz3.M(uz3.a.d(e, new c(null)), new d(null)), this), this.c);
    }
}
