package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.InfoMessage;
import com.dodopizza.orderhistory.feature.orderhistory.OrderHistoryFeatureDependencies;
import com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistory.OrderHistoryPresenter;
import com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistory.adapter.OrderHistoryFooterViewHolder;
import com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistory.adapter.OrderHistoryVH;
import com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistory.adapter.a;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k6;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: OrderHistoryFragment.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00016B\u0007¢\u0006\u0004\b3\u00104J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u0016\u0010\u000f\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016R\u001b\u0010\u0015\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0012\u001a\u0004\b*\u0010+R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00067"}, d2 = {"Lef7;", "Lf70;", "Lwf7;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "b", "n0", "Fg", "", "Luf7;", "orderHistories", "x9", "U", com.huawei.hms.opendevice.c.a, "Lk79;", "oh", "()Landroid/view/View;", "emptyContent", DateTokenConverter.CONVERTER_KEY, "rh", "loader", "Landroidx/recyclerview/widget/RecyclerView;", com.huawei.hms.push.e.a, "ph", "()Landroidx/recyclerview/widget/RecyclerView;", "historiesListView", "Landroidx/appcompat/widget/Toolbar;", "f", "uh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/Button;", "g", "sh", "()Landroid/widget/Button;", "openMenuButton", "Lcom/dodopizza/android/view/custom/InfoMessage;", Image.TYPE_HIGH, "qh", "()Lcom/dodopizza/android/view/custom/InfoMessage;", "infoMessage", "Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/OrderHistoryPresenter;", "i", "Lmoxy/ktx/MoxyKtxDelegate;", "th", "()Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/OrderHistoryPresenter;", "presenter", "<init>", "()V", "j", "a", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ef7  reason: default package */
/* loaded from: classes2.dex */
public final class ef7 extends f70 implements wf7 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final MoxyKtxDelegate i;
    static final /* synthetic */ je5<Object>[] k = {bc9.f(new ar8(ef7.class, "emptyContent", "getEmptyContent()Landroid/view/View;", 0)), bc9.f(new ar8(ef7.class, "loader", "getLoader()Landroid/view/View;", 0)), bc9.f(new ar8(ef7.class, "historiesListView", "getHistoriesListView()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(ef7.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(ef7.class, "openMenuButton", "getOpenMenuButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(ef7.class, "infoMessage", "getInfoMessage()Lcom/dodopizza/android/view/custom/InfoMessage;", 0)), bc9.f(new ar8(ef7.class, "presenter", "getPresenter()Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/OrderHistoryPresenter;", 0))};
    public static final a j = new a(null);

    /* compiled from: OrderHistoryFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lef7$a;", "", "Lef7;", "a", "<init>", "()V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ef7$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ef7 a() {
            return new ef7();
        }
    }

    /* compiled from: OrderHistoryFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ef7$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ef7.this.th().w();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderHistoryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/OrderHistoryPresenter;", "a", "()Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/OrderHistoryPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ef7$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function0<OrderHistoryPresenter> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OrderHistoryPresenter invoke() {
            return pg2.a().b((OrderHistoryFeatureDependencies) ef7.this.getComponentDependenciesRegistry().a(bc9.b(OrderHistoryFeatureDependencies.class))).a().a();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ef7$d */
    /* loaded from: classes2.dex */
    public static final class d extends ej5 implements Function1<Object, Boolean> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof ye7);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ef7$e */
    /* loaded from: classes2.dex */
    public static final class e extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final e a = new e();

        public e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = OrderHistoryVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ef7$f */
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function1<Object, Boolean> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof cf7);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ef7$g */
    /* loaded from: classes2.dex */
    public static final class g extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final g a = new g();

        public g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = OrderHistoryFooterViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: OrderHistoryFragment.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"ef7$h", "Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/adapter/a$a;", "Lae7;", "orderHistory", "", "position", "", "b", "a", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ef7$h */
    /* loaded from: classes2.dex */
    public static final class h implements a.InterfaceC0209a {
        h() {
        }

        @Override // com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistory.adapter.a.InterfaceC0209a
        public void a(ae7 ae7Var, int i) {
            z65.h(ae7Var, "orderHistory");
            ef7.this.th().x(ae7Var, i + 1);
        }

        @Override // com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistory.adapter.a.InterfaceC0209a
        public void b(ae7 ae7Var, int i) {
            z65.h(ae7Var, "orderHistory");
            ef7.this.th().v(ae7Var, i + 1);
        }
    }

    public ef7() {
        super(hz8.fragment_order_history);
        this.c = kb0.e(this, hy8.order_history_empty_content);
        this.d = kb0.e(this, hy8.order_history_loader);
        this.e = kb0.e(this, hy8.order_history_list);
        this.f = kb0.e(this, hy8.order_history_toolbar);
        this.g = kb0.e(this, hy8.order_history_open_menu_button);
        this.h = kb0.e(this, hy8.order_history_info);
        c cVar = new c();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.i = new MoxyKtxDelegate(mvpDelegate, OrderHistoryPresenter.class.getName() + ".presenter", cVar);
    }

    private final View oh() {
        return (View) this.c.a(this, k[0]);
    }

    private final RecyclerView ph() {
        return (RecyclerView) this.e.a(this, k[2]);
    }

    private final InfoMessage qh() {
        return (InfoMessage) this.h.a(this, k[5]);
    }

    private final View rh() {
        return (View) this.d.a(this, k[1]);
    }

    private final Button sh() {
        return (Button) this.g.a(this, k[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderHistoryPresenter th() {
        return (OrderHistoryPresenter) this.i.getValue(this, k[6]);
    }

    private final Toolbar uh() {
        return (Toolbar) this.f.a(this, k[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vh(ef7 ef7Var, View view) {
        z65.h(ef7Var, "this$0");
        ef7Var.th().onBackPressed();
    }

    @Override // defpackage.wf7
    public void Fg() {
        un3.k(ph());
        un3.e(rh());
        un3.e(oh());
    }

    @Override // defpackage.wf7
    public void U() {
        qh().h(s09.repeat_order_error, 2000);
    }

    @Override // defpackage.wf7
    public void b() {
        un3.k(rh());
        un3.e(oh());
        un3.k(ph());
    }

    @Override // defpackage.wf7
    public void n0() {
        un3.k(oh());
        un3.e(rh());
        un3.e(ph());
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        ph().setLayoutManager(new LinearLayoutManager(getContext()));
        ph().addItemDecoration(new eyb(16, 0, 0, 6, null));
        uh().setNavigationOnClickListener(new View.OnClickListener() { // from class: df7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ef7.vh(ef7.this, view2);
            }
        });
        oma.a(sh(), new b());
    }

    @Override // defpackage.wf7
    public void x9(List<? extends uf7> list) {
        z65.h(list, "orderHistories");
        ph().setAdapter(new k6.a(new k6.a(new k6(list), d.a, new com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistory.adapter.a(new h()), e.a).b(), f.a, new bf7(), g.a).b().d());
    }
}
