package com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails;

import android.webkit.URLUtil;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import java.text.DateFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: OrderHistoryDetailsPresenter.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\b\b\u0001\u0010.\u001a\u00020\u000f\u0012\u0006\u00102\u001a\u00020/¢\u0006\u0004\bA\u0010BJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J&\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\u0016\u0010\u0018\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u0003H\u0014J\u0006\u0010\u001b\u001a\u00020\u0003J\u0006\u0010\u001c\u001a\u00020\u0003J\u0006\u0010\u001d\u001a\u00020\u0003J\u000e\u0010\u001e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00107\u001a\n 4*\u0004\u0018\u000103038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistorydetails/OrderHistoryDetailsPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lse7;", "", "z", "Lae7;", "currentOrder", "G", BonusActionEntity.ORDER, "F", "H", "Lz21;", "check", "E", "orderHistory", "", "positionInList", "J", "Lkotlin/Function0;", "consumer", "K", "y", "", "checks", "I", "D", "onFirstViewAttach", "onBackPressed", "C", "A", "B", "a", "Lae7;", "Lpe7;", "b", "Lpe7;", "router", "Lle7;", com.huawei.hms.opendevice.c.a, "Lle7;", "interactor", "Lhq3;", DateTokenConverter.CONVERTER_KEY, "Lhq3;", "featureService", com.huawei.hms.push.e.a, "position", "Lgc;", "f", "Lgc;", "analytics", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "g", "Lorg/slf4j/Logger;", "logger", "Ljava/text/DateFormat;", Image.TYPE_HIGH, "Ljava/text/DateFormat;", "dateFormat", "Ll6;", "Lxf7;", "i", "Ll6;", "dataSet", "<init>", "(Lae7;Lpe7;Lle7;Lhq3;ILgc;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class OrderHistoryDetailsPresenter extends BasePresenter<se7> {
    private final ae7 a;
    private final pe7 b;
    private final le7 c;
    private final hq3 d;
    private final int e;
    private final gc f;
    private final Logger g;
    private final DateFormat h;
    private final l6<xf7> i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderHistoryDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.OrderHistoryDetailsPresenter$getChecks$1", f = "OrderHistoryDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
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
                ((se7) OrderHistoryDetailsPresenter.this.getViewState()).uc();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderHistoryDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lz21;", "checks", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.OrderHistoryDetailsPresenter$getChecks$2", f = "OrderHistoryDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements Function2<List<? extends z21>, cv1<? super Unit>, Object> {
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
        public final Object invoke(List<z21> list, cv1<? super Unit> cv1Var) {
            return ((b) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object Z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                List<z21> list = (List) this.b;
                int size = list.size();
                if (size != 0) {
                    if (size != 1) {
                        ((se7) OrderHistoryDetailsPresenter.this.getViewState()).s3(list);
                    } else {
                        OrderHistoryDetailsPresenter orderHistoryDetailsPresenter = OrderHistoryDetailsPresenter.this;
                        Z = sc1.Z(list);
                        orderHistoryDetailsPresenter.E((z21) Z);
                    }
                } else {
                    ((se7) OrderHistoryDetailsPresenter.this.getViewState()).ic();
                }
                OrderHistoryDetailsPresenter.this.I(list);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderHistoryDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.OrderHistoryDetailsPresenter$getChecks$3", f = "OrderHistoryDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
                Throwable th = (Throwable) this.b;
                OrderHistoryDetailsPresenter.this.g.error("Failed to get order checks", th);
                ((se7) OrderHistoryDetailsPresenter.this.getViewState()).ic();
                OrderHistoryDetailsPresenter.this.f.a(new uo3(th));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderHistoryDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.OrderHistoryDetailsPresenter$getChecks$4", f = "OrderHistoryDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((d) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((se7) OrderHistoryDetailsPresenter.this.getViewState()).Od();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderHistoryDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ll3c;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.OrderHistoryDetailsPresenter$observeCheckSharing$1", f = "OrderHistoryDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements Function2<l3c, cv1<? super Unit>, Object> {
        int a;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new e(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(l3c l3cVar, cv1<? super Unit> cv1Var) {
            return ((e) create(l3cVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderHistoryDetailsPresenter.this.f.a(be7.a(OrderHistoryDetailsPresenter.this.a.getId()));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderHistoryDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Ll3c;", "", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.OrderHistoryDetailsPresenter$observeCheckSharing$2", f = "OrderHistoryDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends f3b implements y84<pz3<? super l3c>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f(cv1<? super f> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super l3c> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            f fVar = new f(cv1Var);
            fVar.b = th;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderHistoryDetailsPresenter.this.g.error("Check sharing observation failed", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderHistoryDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.OrderHistoryDetailsPresenter$onRepeatOrderButton$1", f = "OrderHistoryDetailsPresenter.kt", l = {}, m = "invokeSuspend")
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
                ((se7) OrderHistoryDetailsPresenter.this.getViewState()).b();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderHistoryDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.OrderHistoryDetailsPresenter$onRepeatOrderButton$2", f = "OrderHistoryDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OrderHistoryDetailsPresenter.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<Unit> {
            final /* synthetic */ OrderHistoryDetailsPresenter a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(OrderHistoryDetailsPresenter orderHistoryDetailsPresenter) {
                super(0);
                this.a = orderHistoryDetailsPresenter;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.b.a();
            }
        }

        h(cv1<? super h> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new h(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((h) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderHistoryDetailsPresenter orderHistoryDetailsPresenter = OrderHistoryDetailsPresenter.this;
                orderHistoryDetailsPresenter.K(orderHistoryDetailsPresenter.a, OrderHistoryDetailsPresenter.this.e, new a(OrderHistoryDetailsPresenter.this));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderHistoryDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.OrderHistoryDetailsPresenter$onRepeatOrderButton$3", f = "OrderHistoryDetailsPresenter.kt", l = {}, m = "invokeSuspend")
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
                OrderHistoryDetailsPresenter.this.g.error("Failed to repeat order", (Throwable) this.b);
                ((se7) OrderHistoryDetailsPresenter.this.getViewState()).w();
                ((se7) OrderHistoryDetailsPresenter.this.getViewState()).U();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderHistoryDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.OrderHistoryDetailsPresenter$trackOpenOrderCard$1", f = "OrderHistoryDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        j(cv1<? super j> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            j jVar = new j(cv1Var);
            jVar.b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((j) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderHistoryDetailsPresenter.this.g.error("Failed to track Open Order Card event", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderHistoryDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.OrderHistoryDetailsPresenter$trackRepeatOrder$1", f = "OrderHistoryDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ Function0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Function0<Unit> function0, cv1<? super k> cv1Var) {
            super(2, cv1Var);
            this.b = function0;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new k(this.b, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((k) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                this.b.invoke();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderHistoryDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.OrderHistoryDetailsPresenter$trackRepeatOrder$2", f = "OrderHistoryDetailsPresenter.kt", l = {}, m = "invokeSuspend")
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
                OrderHistoryDetailsPresenter.this.g.error("Failed to track Repeat Order event", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public OrderHistoryDetailsPresenter(ae7 ae7Var, pe7 pe7Var, le7 le7Var, hq3 hq3Var, int i2, gc gcVar) {
        z65.h(ae7Var, "currentOrder");
        z65.h(pe7Var, "router");
        z65.h(le7Var, "interactor");
        z65.h(hq3Var, "featureService");
        z65.h(gcVar, "analytics");
        this.a = ae7Var;
        this.b = pe7Var;
        this.c = le7Var;
        this.d = hq3Var;
        this.e = i2;
        this.f = gcVar;
        this.g = LoggerFactory.getLogger("OrderHistoryDetailsPresenter");
        this.h = ae7.k.a();
        this.i = new l6<>(null, 1, null);
        z();
    }

    private final void D(ae7 ae7Var) {
        boolean z;
        if (!this.d.a(bq3.j) && !URLUtil.isValidUrl(ae7Var.i())) {
            z = false;
        } else {
            z = true;
        }
        ((se7) getViewState()).j5(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(z21 z21Var) {
        this.b.d(z21Var);
    }

    private final void F(ae7 ae7Var) {
        if (this.d.a(bq3.a5) && ae7Var.j() == jk7.e) {
            if (ae7Var.d().d()) {
                ((se7) getViewState()).r0();
                return;
            } else {
                ((se7) getViewState()).D0(ae7Var.d());
                return;
            }
        }
        ((se7) getViewState()).J();
    }

    private final void G(ae7 ae7Var) {
        this.i.addAll(ae7Var.f());
        ((se7) getViewState()).n9(this.i);
        ((se7) getViewState()).r(ae7Var.e());
        ((se7) getViewState()).A0(ae7Var.b());
        ((se7) getViewState()).M1(ae7Var.j());
        ((se7) getViewState()).J0(ae7Var.h());
        String format = this.h.format(ae7Var.c());
        z65.g(format, "format(...)");
        ((se7) getViewState()).p8(format);
        F(ae7Var);
    }

    private final void H() {
        pe7 pe7Var = this.b;
        String i2 = this.a.i();
        if (i2 == null) {
            i2 = "";
        }
        pe7Var.c(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(List<z21> list) {
        if (list.size() == 0) {
            this.f.a(yy6.c);
        } else {
            this.f.a(sh4.c);
        }
    }

    private final void J(ae7 ae7Var, int i2) {
        p(z77.a(this.c.c(ae7Var.e(), ae7Var.getId(), i2), new j(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(ae7 ae7Var, int i2, Function0<Unit> function0) {
        p(z77.a(y87.a(this.c.a(ae7Var, i2), new k(function0, null)), new l(null)));
    }

    private final void y() {
        p(o77.a(z77.a(y87.a(r77.a(this.c.getChecks(this.a.getId()), new a(null)), new b(null)), new c(null)), new d(null)));
    }

    private final void z() {
        o(wz3.h(wz3.F(this.b.b(), new e(null)), new f(null)));
    }

    public final void A() {
        if (URLUtil.isValidUrl(this.a.i())) {
            H();
        } else if (this.d.a(bq3.j)) {
            y();
        }
    }

    public final void B(z21 z21Var) {
        z65.h(z21Var, "check");
        E(z21Var);
    }

    public final void C() {
        p(z77.a(y87.a(r77.a(this.c.b(this.a.getId()), new g(null)), new h(null)), new i(null)));
    }

    public final void onBackPressed() {
        this.b.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        D(this.a);
        G(this.a);
        J(this.a, this.e);
    }
}
