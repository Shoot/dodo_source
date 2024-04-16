package com.dodopizza.order.feature.delivery.address.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.c;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter;
import com.dodopizza.order.feature.selectionmap.presentation.f;
import com.dodopizza.presentation.presenters.BasePresenter;
import defpackage.hv0;
import defpackage.k9a;
import defpackage.y6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: DeliveryAddressPresenter.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010!\u001a\u00020\u0019\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*¢\u0006\u0004\b3\u00104J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u0003J\u0016\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010!\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u00102\u001a\n /*\u0004\u0018\u00010.0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/dodopizza/order/feature/delivery/address/presentation/DeliveryAddressPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lbx2;", "", "w", "Le91;", "location", "C", "newClientDeliveryLocation", "E", "Lk9a$a;", "result", "z", "Lk9a$b;", "request", "", "isNewLocality", "D", "clientDeliveryLocation", "B", "Liv0;", "changeLocationResult", "x", "Ltl5;", "y", "Lxu2;", "updatedData", "F", "v", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter$a;", "A", "a", "Lxu2;", "data", "Lfv2;", "b", "Lfv2;", "deliveryAddressInteractor", "Lny1;", com.huawei.hms.opendevice.c.a, "Lny1;", "languageConfigs", "Lgc;", DateTokenConverter.CONVERTER_KEY, "Lgc;", "analytics", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", com.huawei.hms.push.e.a, "Lorg/slf4j/Logger;", "logger", "<init>", "(Lxu2;Lfv2;Lny1;Lgc;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DeliveryAddressPresenter extends BasePresenter<bx2> {
    private xu2 a;
    private final fv2 b;
    private final ny1 c;
    private final gc d;
    private final Logger e;

    /* compiled from: DeliveryAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.delivery.address.presentation.DeliveryAddressPresenter$applyNewDeliverableLocation$1", f = "DeliveryAddressPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((bx2) DeliveryAddressPresenter.this.getViewState()).b();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Liv0;", "changeLocalityResult", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.delivery.address.presentation.DeliveryAddressPresenter$applyNewDeliverableLocation$2", f = "DeliveryAddressPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function2<iv0, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(iv0 iv0Var, cv1<? super Unit> cv1Var) {
            return ((b) create(iv0Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                iv0 iv0Var = (iv0) this.b;
                ((bx2) DeliveryAddressPresenter.this.getViewState()).C();
                if (!DeliveryAddressPresenter.this.a.k()) {
                    DeliveryAddressPresenter.this.x(iv0Var);
                } else {
                    ((bx2) DeliveryAddressPresenter.this.getViewState()).La();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.delivery.address.presentation.DeliveryAddressPresenter$applyNewDeliverableLocation$3", f = "DeliveryAddressPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((c) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryAddressPresenter.this.e.error("Error select new delivery location", (Throwable) this.b);
                ((bx2) DeliveryAddressPresenter.this.getViewState()).C();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.delivery.address.presentation.DeliveryAddressPresenter$saveClientDeliveryLocationToProfile$1", f = "DeliveryAddressPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((bx2) DeliveryAddressPresenter.this.getViewState()).b();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.delivery.address.presentation.DeliveryAddressPresenter$saveClientDeliveryLocationToProfile$2", f = "DeliveryAddressPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ e91 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(e91 e91Var, cv1<? super e> cv1Var) {
            super(2, cv1Var);
            this.c = e91Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new e(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((e) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryAddressPresenter.this.B(this.c, false);
                ((bx2) DeliveryAddressPresenter.this.getViewState()).C();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.delivery.address.presentation.DeliveryAddressPresenter$saveClientDeliveryLocationToProfile$3", f = "DeliveryAddressPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f(cv1<? super f> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f fVar = new f(cv1Var);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((f) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryAddressPresenter.this.e.error("Failed to save delivery location", (Throwable) this.b);
                ((bx2) DeliveryAddressPresenter.this.getViewState()).C();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.delivery.address.presentation.DeliveryAddressPresenter$saveDeliveryLocationToProfileAndSetToState$1", f = "DeliveryAddressPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        g(cv1<? super g> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new g(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((g) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((bx2) DeliveryAddressPresenter.this.getViewState()).b();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Liv0;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.delivery.address.presentation.DeliveryAddressPresenter$saveDeliveryLocationToProfileAndSetToState$2", f = "DeliveryAddressPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends f3b implements Function2<iv0, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ k9a.b c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(k9a.b bVar, boolean z, cv1<? super h> cv1Var) {
            super(2, cv1Var);
            this.c = bVar;
            this.d = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new h(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(iv0 iv0Var, cv1<? super Unit> cv1Var) {
            return ((h) create(iv0Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((bx2) DeliveryAddressPresenter.this.getViewState()).C();
                if (!DeliveryAddressPresenter.this.a.k()) {
                    DeliveryAddressPresenter.this.B(this.c.c(), this.d);
                } else {
                    ((bx2) DeliveryAddressPresenter.this.getViewState()).La();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.delivery.address.presentation.DeliveryAddressPresenter$saveDeliveryLocationToProfileAndSetToState$3", f = "DeliveryAddressPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        i(cv1<? super i> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            i iVar = new i(cv1Var);
            iVar.b = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((i) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryAddressPresenter.this.e.error("Error select new delivery location", (Throwable) this.b);
                ((bx2) DeliveryAddressPresenter.this.getViewState()).C();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.delivery.address.presentation.DeliveryAddressPresenter$trySetClientDeliveryLocationToStateAndSaveToProfile$1", f = "DeliveryAddressPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        j(cv1<? super j> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new j(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((j) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((bx2) DeliveryAddressPresenter.this.getViewState()).b();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lk9a$a;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.delivery.address.presentation.DeliveryAddressPresenter$trySetClientDeliveryLocationToStateAndSaveToProfile$2", f = "DeliveryAddressPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends f3b implements Function2<k9a.a, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        k(cv1<? super k> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            k kVar = new k(cv1Var);
            kVar.b = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(k9a.a aVar, cv1<? super Unit> cv1Var) {
            return ((k) create(aVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryAddressPresenter.this.z((k9a.a) this.b);
                ((bx2) DeliveryAddressPresenter.this.getViewState()).C();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.delivery.address.presentation.DeliveryAddressPresenter$trySetClientDeliveryLocationToStateAndSaveToProfile$3", f = "DeliveryAddressPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        l(cv1<? super l> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            l lVar = new l(cv1Var);
            lVar.b = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((l) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryAddressPresenter.this.e.error("Error handleSelectedAddress", (Throwable) this.b);
                ((bx2) DeliveryAddressPresenter.this.getViewState()).C();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public DeliveryAddressPresenter(xu2 xu2Var, fv2 fv2Var, ny1 ny1Var, gc gcVar) {
        z65.h(xu2Var, "data");
        z65.h(fv2Var, "deliveryAddressInteractor");
        z65.h(ny1Var, "languageConfigs");
        z65.h(gcVar, "analytics");
        this.a = xu2Var;
        this.b = fv2Var;
        this.c = ny1Var;
        this.d = gcVar;
        this.e = LoggerFactory.getLogger("DeliveryAddressPresenter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(e91 e91Var, boolean z) {
        boolean z2;
        if (this.a.e() == f.a.a) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean f2 = this.a.f();
        if (fv3.a(z2, f2, z)) {
            ((bx2) getViewState()).Gf();
        } else {
            ((bx2) getViewState()).K2(new c.a.C0131a(e91Var, z2, f2, z));
        }
    }

    private final void C(e91 e91Var) {
        p(z77.a(y87.a(r77.a(this.b.n(e91Var), new d(null)), new e(e91Var, null)), new f(null)));
    }

    private final void D(k9a.b bVar, boolean z) {
        p(z77.a(y87.a(r77.a(this.b.p(new hv0.a(bVar.d(), bVar.c(), true, y())), new g(null)), new h(bVar, z, null)), new i(null)));
    }

    private final void E(e91 e91Var) {
        String str;
        fv2 fv2Var = this.b;
        boolean i2 = this.a.i();
        String c2 = this.a.c();
        dt5 d2 = this.a.d();
        if (d2 != null) {
            str = d2.d();
        } else {
            str = null;
        }
        p(z77.a(y87.a(r77.a(fv2Var.j(e91Var, i2, c2, str), new j(null)), new k(null)), new l(null)));
    }

    private final void w() {
        if (!this.a.a().l()) {
            e91 b2 = e91.b(this.a.b(), null, this.a.a().j(), false, 5, null);
            if (this.a.e() != f.a.a && !this.a.f()) {
                C(b2);
            } else {
                E(b2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(iv0 iv0Var) {
        ((bx2) getViewState()).K9(iv0Var);
    }

    private final tl5 y() {
        return this.c.c(this.a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(k9a.a aVar) {
        if (!(aVar instanceof k9a.a.C0407a)) {
            if (aVar instanceof k9a.a.e) {
                D(((k9a.a.e) aVar).a(), false);
            } else if (aVar instanceof k9a.a.c) {
                D(((k9a.a.c) aVar).a(), true);
            } else if (aVar instanceof k9a.a.d) {
                ((bx2) getViewState()).q(((k9a.a.d) aVar).a());
            } else if (aVar instanceof k9a.a.b) {
                ((bx2) getViewState()).z2();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        mh5.a(Unit.a);
    }

    public final void A(EditDeliveryAddressMapPresenter.a aVar, k9a.b bVar) {
        z65.h(aVar, "result");
        z65.h(bVar, "request");
        if (aVar instanceof EditDeliveryAddressMapPresenter.a.b) {
            this.d.a(y6.a.g(y6.b.b));
            D(bVar, true);
            return;
        }
        this.d.a(y6.a.g(y6.b.c));
    }

    public final void F(xu2 xu2Var) {
        z65.h(xu2Var, "updatedData");
        this.a = xu2Var;
    }

    public final void v() {
        if (this.a.d() != null && this.a.b().c().f().length() != 0) {
            fv2 fv2Var = this.b;
            dt5 d2 = this.a.d();
            z65.e(d2);
            p(z77.a(y87.a(r77.a(fv2Var.p(new hv0.a(d2, this.a.b(), true, y())), new a(null)), new b(null)), new c(null)));
            return;
        }
        w();
    }
}
