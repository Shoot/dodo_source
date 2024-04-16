package ru.dodopizza.app.presentation.product.card.combo;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BuyMorePresenter.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0014J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0003J\u0006\u0010\n\u001a\u00020\u0003R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0017j\b\u0012\u0004\u0012\u00020\u0006`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/BuyMorePresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Ljj0;", "", Image.TYPE_SMALL, "onFirstViewAttach", "Lwi0;", "product", "v", "t", "u", "Lui0;", "a", "Lui0;", "buyMoreInteractor", "Lf63;", "b", "Lf63;", "router", "Lgc;", com.huawei.hms.opendevice.c.a, "Lgc;", "analytics", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/ArrayList;", "selectedItems", "Ll6;", com.huawei.hms.push.e.a, "Ll6;", StatisticManager.LIST, "<init>", "(Lui0;Lf63;Lgc;)V", "f", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BuyMorePresenter extends BasePresenter<jj0> {
    public static final a f = new a(null);
    private final ui0 a;
    private final f63 b;
    private final gc c;
    private final ArrayList<wi0> d;
    private final l6<wi0> e;

    /* compiled from: BuyMorePresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/BuyMorePresenter$a;", "", "", "BUY_MORE_DONE", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: BuyMorePresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.BuyMorePresenter$onAddToCart$2", f = "BuyMorePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((b) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                f63 f63Var = BuyMorePresenter.this.b;
                Unit unit = Unit.a;
                f63Var.i(1000, unit);
                return unit;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: BuyMorePresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lwi0;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.BuyMorePresenter$onFirstViewAttach$1", f = "BuyMorePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends f3b implements Function2<List<? extends wi0>, cv1<? super Unit>, Object> {
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
        public final Object invoke(List<wi0> list, cv1<? super Unit> cv1Var) {
            return ((c) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                BuyMorePresenter.this.e.clear();
                BuyMorePresenter.this.e.addAll((List) this.b);
                ((jj0) BuyMorePresenter.this.getViewState()).c1(BuyMorePresenter.this.e);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: BuyMorePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwi0;", "buyMoreItemVO", "", "a", "(Lwi0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<wi0, Boolean> {
        final /* synthetic */ wi0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(wi0 wi0Var) {
            super(1);
            this.a = wi0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(wi0 wi0Var) {
            z65.h(wi0Var, "buyMoreItemVO");
            return Boolean.valueOf(z65.c(wi0Var, this.a));
        }
    }

    /* compiled from: BuyMorePresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwi0;", "it", "", "", "a", "(Lwi0;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function1<wi0, List<? extends String>> {
        public static final e a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(wi0 wi0Var) {
            List<String> e;
            z65.h(wi0Var, "it");
            e = jc1.e("unselected_state");
            return e;
        }
    }

    /* compiled from: BuyMorePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwi0;", "buyMoreItemVO", "", "a", "(Lwi0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function1<wi0, Boolean> {
        final /* synthetic */ wi0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(wi0 wi0Var) {
            super(1);
            this.a = wi0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(wi0 wi0Var) {
            z65.h(wi0Var, "buyMoreItemVO");
            return Boolean.valueOf(z65.c(wi0Var, this.a));
        }
    }

    /* compiled from: BuyMorePresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwi0;", "it", "", "", "a", "(Lwi0;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function1<wi0, List<? extends String>> {
        public static final g a = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(wi0 wi0Var) {
            List<String> e;
            z65.h(wi0Var, "it");
            e = jc1.e("selected_state");
            return e;
        }
    }

    public BuyMorePresenter(ui0 ui0Var, f63 f63Var, gc gcVar) {
        z65.h(ui0Var, "buyMoreInteractor");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        this.a = ui0Var;
        this.b = f63Var;
        this.c = gcVar;
        this.d = new ArrayList<>();
        this.e = new l6<>(null, 1, null);
    }

    private final void s() {
        ArrayList<wi0> arrayList = this.d;
        hn6 f2 = kn6.f();
        for (wi0 wi0Var : arrayList) {
            f2 = rn6.f(f2, wi0Var.c());
        }
        if (!f2.d()) {
            ((jj0) getViewState()).J0(f2);
        } else {
            ((jj0) getViewState()).Ca();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        ((jj0) getViewState()).Ca();
        p(y87.a(this.a.i(), new c(null)));
    }

    public final void t() {
        int w;
        ui0 ui0Var = this.a;
        ArrayList<wi0> arrayList = this.d;
        w = lc1.w(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(w);
        for (wi0 wi0Var : arrayList) {
            arrayList2.add(wi0Var.d());
        }
        p(y87.a(ui0Var.f(arrayList2), new b(null)));
    }

    public final void u() {
        this.c.a(gi0.a);
        this.b.i(1000, Unit.a);
    }

    public final void v(wi0 wi0Var) {
        z65.h(wi0Var, "product");
        if (this.d.contains(wi0Var)) {
            this.d.remove(wi0Var);
            this.e.S(new d(wi0Var), e.a);
        } else {
            this.d.add(wi0Var);
            this.e.S(new f(wi0Var), g.a);
        }
        s();
    }
}
