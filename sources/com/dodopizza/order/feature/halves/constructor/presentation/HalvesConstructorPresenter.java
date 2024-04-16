package com.dodopizza.order.feature.halves.constructor.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: HalvesConstructorPresenter.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\b\u0007\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209¢\u0006\u0004\bP\u0010QJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0014\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0014J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0003J\u0006\u0010\u0017\u001a\u00020\u0003J\u0006\u0010\u0018\u001a\u00020\u0003J\u0006\u0010\u0019\u001a\u00020\u0003J\u0016\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010 \u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010A\u001a\n >*\u0004\u0018\u00010=0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010H\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010GR\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020L0K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006R"}, d2 = {"Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesConstructorPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lwk4;", "", "v", "Lxk4;", "halvesDataVO", "u", "G", "", "leftId", "rightId", "D", "defaultShoppingItem", "E", "onFirstViewAttach", "view", "t", "", "position", "z", "B", "x", "w", "onBackPressed", "A", "Lwj4;", "data", "Lfka;", "sideHalf", "y", "Lmm8;", "C", "Lek4;", "a", "Lek4;", "halvesData", "Llk4;", "b", "Llk4;", "interactor", "Lf63;", com.huawei.hms.opendevice.c.a, "Lf63;", "router", "Lzl4;", DateTokenConverter.CONVERTER_KEY, "Lzl4;", "halvesTitleFormatter", "Lgc;", com.huawei.hms.push.e.a, "Lgc;", "analytics", "Ltk4;", "f", "Ltk4;", "externalHalvesRouter", "Lhq3;", "g", "Lhq3;", "featureService", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_HIGH, "Lorg/slf4j/Logger;", "logger", "Lkotlin/Pair;", "i", "Lkotlin/Pair;", "randomPairs", "j", "I", "lPos", "k", "rPos", "", "Lxj4;", "l", "Ljava/util/List;", "halvesItems", "<init>", "(Lek4;Llk4;Lf63;Lzl4;Lgc;Ltk4;Lhq3;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class HalvesConstructorPresenter extends BasePresenter<wk4> {
    private final ek4 a;
    private final lk4 b;
    private final f63 c;
    private final zl4 d;
    private final gc e;
    private final tk4 f;
    private final hq3 g;
    private final Logger h;
    private Pair<Integer, Integer> i;
    private int j;
    private int k;
    private List<xj4> l;

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Boolean.valueOf(((xj4) t).j()), Boolean.valueOf(((xj4) t2).j()));
            return d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesConstructorPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.halves.constructor.presentation.HalvesConstructorPresenter$loadData$1", f = "HalvesConstructorPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((wk4) HalvesConstructorPresenter.this.getViewState()).showLoader();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesConstructorPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.halves.constructor.presentation.HalvesConstructorPresenter$loadData$2", f = "HalvesConstructorPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(cv1Var);
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
                ((wk4) HalvesConstructorPresenter.this.getViewState()).w();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesConstructorPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lxk4;", "halvesDataVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.halves.constructor.presentation.HalvesConstructorPresenter$loadData$3", f = "HalvesConstructorPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function2<xk4, cv1<? super Unit>, Object> {
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
        public final Object invoke(xk4 xk4Var, cv1<? super Unit> cv1Var) {
            return ((d) create(xk4Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                HalvesConstructorPresenter.this.u((xk4) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesConstructorPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.halves.constructor.presentation.HalvesConstructorPresenter$loadData$4", f = "HalvesConstructorPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(cv1Var);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((e) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                HalvesConstructorPresenter.this.h.error(((Throwable) this.b).getMessage());
                ((wk4) HalvesConstructorPresenter.this.getViewState()).j4();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesConstructorPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "defaultShoppingId", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.halves.constructor.presentation.HalvesConstructorPresenter$openPizzaCard$1", f = "HalvesConstructorPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends f3b implements Function2<String, cv1<? super Unit>, Object> {
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
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((f) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                HalvesConstructorPresenter.this.E((String) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesConstructorPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.halves.constructor.presentation.HalvesConstructorPresenter$openPizzaCard$2", f = "HalvesConstructorPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g(cv1<? super g> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g gVar = new g(cv1Var);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((g) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                HalvesConstructorPresenter.this.h.warn("Can't fetch default shopping item", (Throwable) this.b);
                HalvesConstructorPresenter.F(HalvesConstructorPresenter.this, null, 1, null);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesConstructorPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ltja;", "shoppingItem", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.halves.constructor.presentation.HalvesConstructorPresenter$updateHalvesInformation$1", f = "HalvesConstructorPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends f3b implements Function2<tja, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        h(cv1<? super h> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            h hVar = new h(cv1Var);
            hVar.b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(tja tjaVar, cv1<? super Unit> cv1Var) {
            return ((h) create(tjaVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((wk4) HalvesConstructorPresenter.this.getViewState()).e7(((tja) this.b).h());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesConstructorPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.halves.constructor.presentation.HalvesConstructorPresenter$updateHalvesInformation$2", f = "HalvesConstructorPresenter.kt", l = {}, m = "invokeSuspend")
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
                ((wk4) HalvesConstructorPresenter.this.getViewState()).e7(kn6.c.c(0));
                HalvesConstructorPresenter.this.h.error(((Throwable) this.b).getMessage());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public HalvesConstructorPresenter(ek4 ek4Var, lk4 lk4Var, f63 f63Var, zl4 zl4Var, gc gcVar, tk4 tk4Var, hq3 hq3Var) {
        z65.h(ek4Var, "halvesData");
        z65.h(lk4Var, "interactor");
        z65.h(f63Var, "router");
        z65.h(zl4Var, "halvesTitleFormatter");
        z65.h(gcVar, "analytics");
        z65.h(tk4Var, "externalHalvesRouter");
        z65.h(hq3Var, "featureService");
        this.a = ek4Var;
        this.b = lk4Var;
        this.c = f63Var;
        this.d = zl4Var;
        this.e = gcVar;
        this.f = tk4Var;
        this.g = hq3Var;
        this.h = LoggerFactory.getLogger("HalvesConstructorPresenter");
        this.i = new Pair<>(-1, -1);
        gcVar.a(new ia7(ek4Var.d(), ek4Var.e()));
    }

    private final void D(String str, String str2) {
        boolean z;
        if (z65.c(str, str2)) {
            lk4 lk4Var = this.b;
            List<xj4> list = this.l;
            if (list == null) {
                z65.z("halvesItems");
                list = null;
            }
            p(z77.a(y87.a(lk4Var.f(list.get(this.k)), new f(null)), new g(null)));
        } else {
            if (this.i.c().intValue() == this.j && this.i.d().intValue() == this.k) {
                z = true;
            } else {
                z = false;
            }
            this.e.a(new bk4(z));
            this.f.a(str, str2, new ml4(lnb.a(str, str2), this.a.c(), this.a.a()));
        }
        this.i = new Pair<>(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(String str) {
        f63 f63Var = this.c;
        List<xj4> list = this.l;
        if (list == null) {
            z65.z("halvesItems");
            list = null;
        }
        f63Var.e(com.dodopizza.order.feature.product.card.presentation.pizza.c.a(new o78(list.get(this.k).f(), null, str, 0, this.a.a(), false, 42, null)));
    }

    static /* synthetic */ void F(HalvesConstructorPresenter halvesConstructorPresenter, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        halvesConstructorPresenter.E(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void G() {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.order.feature.halves.constructor.presentation.HalvesConstructorPresenter.G():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(xk4 xk4Var) {
        List<xj4> y0;
        y0 = sc1.y0(xk4Var.a(), new a());
        this.l = y0;
        wk4 wk4Var = (wk4) getViewState();
        List<xj4> list = this.l;
        List<xj4> list2 = null;
        if (list == null) {
            z65.z("halvesItems");
            list = null;
        }
        wk4Var.ug(list, xk4Var.c());
        wk4 wk4Var2 = (wk4) getViewState();
        List<xj4> list3 = this.l;
        if (list3 == null) {
            z65.z("halvesItems");
            list3 = null;
        }
        wk4Var2.Wa(list3, xk4Var.c());
        ((wk4) getViewState()).rb(this.d.a(xk4Var.b()));
        List<xj4> list4 = this.l;
        if (list4 == null) {
            z65.z("halvesItems");
            list4 = null;
        }
        Iterator<xj4> it = list4.iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (z65.c(it.next().b(), this.a.b().c())) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        List<xj4> list5 = this.l;
        if (list5 == null) {
            z65.z("halvesItems");
            list5 = null;
        }
        Iterator<xj4> it2 = list5.iterator();
        int i3 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (z65.c(it2.next().b(), this.a.b().d())) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i2 != -1 && i3 != -1) {
            ((wk4) getViewState()).s2(i2);
            ((wk4) getViewState()).bd(i3);
            List<xj4> list6 = this.l;
            if (list6 == null) {
                z65.z("halvesItems");
                list6 = null;
            }
            String b2 = list6.get(i2).b();
            List<xj4> list7 = this.l;
            if (list7 == null) {
                z65.z("halvesItems");
            } else {
                list2 = list7;
            }
            D(b2, list2.get(i3).b());
        } else {
            ((wk4) getViewState()).s2(0);
            ((wk4) getViewState()).bd(1);
        }
        ((wk4) getViewState()).E7();
    }

    private final void v() {
        p(z77.a(y87.a(o77.a(r77.a(this.b.e(), new b(null)), new c(null)), new d(null)), new e(null)));
    }

    public final void A() {
        v();
    }

    public final void B(int i2) {
        this.k = i2;
        G();
    }

    public final void C(mm8 mm8Var) {
        z65.h(mm8Var, "data");
        this.e.a(new yl4(mm8Var));
    }

    public final void onBackPressed() {
        this.e.a(fk4.a);
        this.c.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        v();
        if (this.g.a(bq3.K6)) {
            ((wk4) getViewState()).S7();
        }
    }

    @Override // moxy.MvpPresenter
    /* renamed from: t */
    public void attachView(wk4 wk4Var) {
        super.attachView(wk4Var);
        ((wk4) getViewState()).s2(this.j);
        ((wk4) getViewState()).bd(this.k);
    }

    public final void w() {
        List<xj4> list = this.l;
        List<xj4> list2 = null;
        if (list == null) {
            z65.z("halvesItems");
            list = null;
        }
        if (!list.get(this.j).j()) {
            List<xj4> list3 = this.l;
            if (list3 == null) {
                z65.z("halvesItems");
                list3 = null;
            }
            if (!list3.get(this.k).j()) {
                List<xj4> list4 = this.l;
                if (list4 == null) {
                    z65.z("halvesItems");
                    list4 = null;
                }
                String b2 = list4.get(this.j).b();
                List<xj4> list5 = this.l;
                if (list5 == null) {
                    z65.z("halvesItems");
                    list5 = null;
                }
                D(b2, list5.get(this.k).b());
                gc gcVar = this.e;
                List<xj4> list6 = this.l;
                if (list6 == null) {
                    z65.z("halvesItems");
                    list6 = null;
                }
                xj4 xj4Var = list6.get(this.j);
                List<xj4> list7 = this.l;
                if (list7 == null) {
                    z65.z("halvesItems");
                } else {
                    list2 = list7;
                }
                gcVar.a(ak4.b(xj4Var, list2.get(this.k)));
                return;
            }
        }
        ((wk4) getViewState()).y8();
    }

    public final void x() {
        IntRange m;
        List f2;
        int w;
        this.e.a(sk4.a);
        List<xj4> list = this.l;
        List<xj4> list2 = null;
        if (list == null) {
            z65.z("halvesItems");
            list = null;
        }
        if (list.size() > 1) {
            List<xj4> list3 = this.l;
            if (list3 == null) {
                z65.z("halvesItems");
                list3 = null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list3) {
                if (!((xj4) obj).j()) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() > 1) {
                m = kc1.m(arrayList);
                f2 = jc1.f(m);
                List<Number> list4 = f2;
                w = lc1.w(list4, 10);
                ArrayList arrayList2 = new ArrayList(w);
                for (Number number : list4) {
                    arrayList2.add((xj4) arrayList.get(number.intValue()));
                }
                xj4 xj4Var = (xj4) arrayList2.get(0);
                xj4 xj4Var2 = (xj4) arrayList2.get(1);
                List<xj4> list5 = this.l;
                if (list5 == null) {
                    z65.z("halvesItems");
                    list5 = null;
                }
                int indexOf = list5.indexOf(xj4Var);
                List<xj4> list6 = this.l;
                if (list6 == null) {
                    z65.z("halvesItems");
                } else {
                    list2 = list6;
                }
                int indexOf2 = list2.indexOf(xj4Var2);
                this.i = new Pair<>(Integer.valueOf(indexOf), Integer.valueOf(indexOf2));
                ((wk4) getViewState()).s2(indexOf);
                ((wk4) getViewState()).bd(indexOf2);
            }
        }
    }

    public final void y(wj4 wj4Var, fka fkaVar) {
        z65.h(wj4Var, "data");
        z65.h(fkaVar, "sideHalf");
        if (this.g.a(bq3.K6)) {
            ((wk4) getViewState()).eb(wj4Var);
            this.e.a(ak4.a(fkaVar, wj4Var.b(), wj4Var.c(), String.valueOf(wj4Var.h().a())));
        }
    }

    public final void z(int i2) {
        this.j = i2;
        G();
    }
}
