package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ViewSwitcher;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k6;
import defpackage.ni0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.presentation.product.card.combo.BuyMorePresenter;
import ru.dodopizza.app.presentation.product.card.combo.BuyMoreViewHolder;
/* compiled from: BuyMoreFragment.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001;B\u0007¢\u0006\u0004\b8\u00109J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0016\u0010\u0011\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016R(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR#\u0010$\u001a\n \u001f*\u0004\u0018\u00010\u00170\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.R\u001b\u00102\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b1\u0010.R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u00106¨\u0006<"}, d2 = {"Lqi0;", "Lf70;", "Ljj0;", "", "sh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "onAttach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "Lwi0;", "items", "c1", "Lhn6;", "price", "J0", "Ca", "Las8;", "Lru/dodopizza/app/presentation/product/card/combo/BuyMorePresenter;", com.huawei.hms.opendevice.c.a, "Las8;", "qh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lmoxy/ktx/MoxyKtxDelegate;", "ph", "()Lru/dodopizza/app/presentation/product/card/combo/BuyMorePresenter;", "presenter", "Landroidx/recyclerview/widget/RecyclerView;", com.huawei.hms.push.e.a, "Lk79;", "rh", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/Button;", "f", "nh", "()Landroid/widget/Button;", "addToCartButton", "g", "oh", "noThanksButton", "Landroid/widget/ViewSwitcher;", Image.TYPE_HIGH, "th", "()Landroid/widget/ViewSwitcher;", "viewSwitcher", "<init>", "()V", "i", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: qi0  reason: default package */
/* loaded from: classes4.dex */
public final class qi0 extends f70 implements jj0 {
    public as8<BuyMorePresenter> c;
    private final MoxyKtxDelegate d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    static final /* synthetic */ je5<Object>[] j = {bc9.f(new ar8(qi0.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/product/card/combo/BuyMorePresenter;", 0)), bc9.f(new ar8(qi0.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(qi0.class, "addToCartButton", "getAddToCartButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(qi0.class, "noThanksButton", "getNoThanksButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(qi0.class, "viewSwitcher", "getViewSwitcher()Landroid/widget/ViewSwitcher;", 0))};
    public static final a i = new a(null);
    private static final int k = (int) kx9.a(12);

    /* compiled from: BuyMoreFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"Lqi0$a;", "", "Loi0;", "products", "Lqi0;", "a", "", "BUY_MORE_PRODUCTS_ARG", "Ljava/lang/String;", "", "HORIZONTAL_MARGIN", "I", "ITEM_ADD_TO_CART", "ITEM_NO_THANKS", "TIGHT_SPAN_COUNT", "WIDE_SCREEN_WIDTH", "WIDE_SPAN_COUNT", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qi0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final qi0 a(oi0 oi0Var) {
            z65.h(oi0Var, "products");
            return (qi0) y64.d(new qi0(), bi0.c(bi0.d("buyMore", oi0Var.a())));
        }
    }

    /* compiled from: BuyMoreFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qi0$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            qi0.this.ph().t();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: BuyMoreFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qi0$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            qi0.this.ph().u();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: BuyMoreFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/BuyMorePresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/product/card/combo/BuyMorePresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qi0$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function0<BuyMorePresenter> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final BuyMorePresenter invoke() {
            return qi0.this.qh().get();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qi0$e */
    /* loaded from: classes4.dex */
    public static final class e extends ej5 implements Function1<Object, Boolean> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof wi0);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qi0$f */
    /* loaded from: classes4.dex */
    public static final class f extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final f a = new f();

        public f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = BuyMoreViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: BuyMoreFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwi0;", "buyMoreItemVO", "", "a", "(Lwi0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qi0$g */
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function1<wi0, Unit> {
        g() {
            super(1);
        }

        public final void a(wi0 wi0Var) {
            z65.h(wi0Var, "buyMoreItemVO");
            qi0.this.ph().v(wi0Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(wi0 wi0Var) {
            a(wi0Var);
            return Unit.a;
        }
    }

    public qi0() {
        super(R.layout.buy_more);
        d dVar = new d();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.d = new MoxyKtxDelegate(mvpDelegate, BuyMorePresenter.class.getName() + ".presenter", dVar);
        this.e = kb0.e(this, R.id.buy_more_recycler_view);
        this.f = kb0.e(this, R.id.buy_more_add_to_cart);
        this.g = kb0.e(this, R.id.buy_more_no_thanks);
        this.h = kb0.e(this, R.id.buy_more_view_switcher);
    }

    private final Button nh() {
        return (Button) this.f.a(this, j[2]);
    }

    private final Button oh() {
        return (Button) this.g.a(this, j[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BuyMorePresenter ph() {
        return (BuyMorePresenter) this.d.getValue(this, j[0]);
    }

    private final RecyclerView rh() {
        return (RecyclerView) this.e.a(this, j[1]);
    }

    private final int sh() {
        Context context = getContext();
        if (context == null || jx9.a.e(context) >= 360) {
            return 3;
        }
        return 2;
    }

    private final ViewSwitcher th() {
        return (ViewSwitcher) this.h.a(this, j[4]);
    }

    @Override // defpackage.jj0
    public void Ca() {
        th().setDisplayedChild(1);
    }

    @Override // defpackage.jj0
    public void J0(hn6 hn6Var) {
        z65.h(hn6Var, "price");
        if (th().getDisplayedChild() != 0) {
            th().setDisplayedChild(0);
        }
        nh().setText(getString(R.string.buy_more_add_to_cart, un6.b(hn6Var)));
    }

    @Override // defpackage.jj0
    public void c1(List<wi0> list) {
        z65.h(list, "items");
        rh().setAdapter(new k6.a(new k6(list), e.a, new ki0(new g()), f.a).b().d());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        super.onAttach(context);
        ni0.a l2 = ((LocalityComponent) getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).l2();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("buyMore")) == null) ? null : null;
        if (obj != null && !(obj instanceof si0)) {
            throw new ClassCastException("Property buyMore has different class type");
        } else if (obj != null) {
            l2.b((si0) obj).a().a(this);
        } else {
            throw new IllegalArgumentException("Argument with key = buyMore not found in bundle");
        }
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        int sh = sh();
        rh().setLayoutManager(new GridLayoutManager(requireContext(), sh));
        rh().addItemDecoration(new mi4(sh, k, false));
        oma.a(nh(), new b());
        oma.a(oh(), new c());
    }

    public final as8<BuyMorePresenter> qh() {
        as8<BuyMorePresenter> as8Var = this.c;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
