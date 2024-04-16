package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.loyalty.products.di.LoyaltyProductsDependencies;
import com.dodopizza.loyalty.products.presentation.LoyaltyProductsPresenter;
import com.dodopizza.loyalty.products.presentation.adapter.LoyaltyProductViewHolder;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.snackbar.Snackbar;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.g26;
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
/* compiled from: LoyaltyProductsFragment.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001CB\u0007¢\u0006\u0004\b@\u0010AJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0014J\u0016\u0010\u000e\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010\u001d\u001a\u00020\u0007H\u0016R\u001b\u0010\"\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b4\u00105R\u001b\u00109\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u001f\u001a\u0004\b8\u0010&R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006D"}, d2 = {"Lj26;", "Lf70;", "Lo26;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "", "hh", "", "", "items", "u", "", "points", "re", "", "title", "r", "pointsPrice", "V4", "minLegalPrice", "De", "neededPointPrice", "mf", "productName", "D2", "u0", com.huawei.hms.opendevice.c.a, "Lk79;", "qh", "()Landroid/view/View;", "container", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "rh", "()Landroid/widget/TextView;", "loyaltyPointsTextView", "Landroidx/recyclerview/widget/RecyclerView;", com.huawei.hms.push.e.a, "sh", "()Landroidx/recyclerview/widget/RecyclerView;", "loyaltyProductsRecyclerView", "Landroidx/appcompat/widget/Toolbar;", "f", "uh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "g", "ph", "()Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingLayout", Image.TYPE_HIGH, "oh", "categorySubtitleTextView", "Lcom/dodopizza/loyalty/products/presentation/LoyaltyProductsPresenter;", "i", "Lmoxy/ktx/MoxyKtxDelegate;", "th", "()Lcom/dodopizza/loyalty/products/presentation/LoyaltyProductsPresenter;", "presenter", "<init>", "()V", "j", "a", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: j26  reason: default package */
/* loaded from: classes2.dex */
public final class j26 extends f70 implements o26 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final MoxyKtxDelegate i;
    static final /* synthetic */ je5<Object>[] k = {bc9.f(new ar8(j26.class, "container", "getContainer()Landroid/view/View;", 0)), bc9.f(new ar8(j26.class, "loyaltyPointsTextView", "getLoyaltyPointsTextView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(j26.class, "loyaltyProductsRecyclerView", "getLoyaltyProductsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(j26.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(j26.class, "collapsingLayout", "getCollapsingLayout()Lcom/google/android/material/appbar/CollapsingToolbarLayout;", 0)), bc9.f(new ar8(j26.class, "categorySubtitleTextView", "getCategorySubtitleTextView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(j26.class, "presenter", "getPresenter()Lcom/dodopizza/loyalty/products/presentation/LoyaltyProductsPresenter;", 0))};
    public static final a j = new a(null);

    /* compiled from: LoyaltyProductsFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lj26$a;", "", "Lh26;", "args", "Lj26;", "a", "", "ARGS_LOYALTY_PRODUCTS_DATA", "Ljava/lang/String;", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: j26$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j26 a(h26 h26Var) {
            z65.h(h26Var, "args");
            return (j26) y64.d(new j26(), bi0.c(bi0.d("loyalty_products_data", h26Var)));
        }
    }

    /* compiled from: LoyaltyProductsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/loyalty/products/presentation/LoyaltyProductsPresenter;", "a", "()Lcom/dodopizza/loyalty/products/presentation/LoyaltyProductsPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: j26$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function0<LoyaltyProductsPresenter> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final LoyaltyProductsPresenter invoke() {
            g26.b a = g26.a.a();
            LoyaltyProductsDependencies loyaltyProductsDependencies = (LoyaltyProductsDependencies) j26.this.getComponentDependenciesRegistry().a(bc9.b(LoyaltyProductsDependencies.class));
            Bundle arguments = j26.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("loyalty_products_data")) == null) ? null : null;
            if (obj != null && !(obj instanceof h26)) {
                throw new ClassCastException("Property loyalty_products_data has different class type");
            } else if (obj != null) {
                return a.a(loyaltyProductsDependencies, (h26) obj).a();
            } else {
                throw new IllegalArgumentException("Argument with key = loyalty_products_data not found in bundle");
            }
        }
    }

    /* compiled from: LoyaltyProductsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luoa;", "", "a", "(Luoa;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: j26$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<uoa, Unit> {
        final /* synthetic */ View a;
        final /* synthetic */ j26 b;
        final /* synthetic */ String c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyProductsFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: j26$c$a */
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<View> {
            final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final View invoke() {
                return this.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyProductsFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: j26$c$b */
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function0<String> {
            final /* synthetic */ j26 a;
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j26 j26Var, String str) {
                super(0);
                this.a = j26Var;
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                String string = this.a.getString(p09.loyalty_products_added_message, this.b);
                z65.g(string, "getString(...)");
                return string;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyProductsFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/material/snackbar/Snackbar;", "it", "", "a", "(Lcom/google/android/material/snackbar/Snackbar;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: j26$c$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0391c extends ej5 implements Function1<Snackbar, Unit> {
            final /* synthetic */ j26 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0391c(j26 j26Var) {
                super(1);
                this.a = j26Var;
            }

            public final void a(Snackbar snackbar) {
                z65.h(snackbar, "it");
                this.a.th().A();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Snackbar snackbar) {
                a(snackbar);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View view, j26 j26Var, String str) {
            super(1);
            this.a = view;
            this.b = j26Var;
            this.c = str;
        }

        public final void a(uoa uoaVar) {
            z65.h(uoaVar, "$this$invoke");
            uoaVar.e(new a(this.a));
            uoaVar.h(new b(this.b, this.c));
            uoaVar.g(p09.loyalty_products_open_cart, new C0391c(this.b));
            uoaVar.b();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uoa uoaVar) {
            a(uoaVar);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: j26$d */
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
            return Boolean.valueOf(obj instanceof e26);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: j26$e */
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
            Object newInstance = LoyaltyProductViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: LoyaltyProductsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le26;", "item", "", "a", "(Le26;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: j26$f */
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function1<e26, Unit> {
        f() {
            super(1);
        }

        public final void a(e26 e26Var) {
            z65.h(e26Var, "item");
            j26.this.th().x(e26Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e26 e26Var) {
            a(e26Var);
            return Unit.a;
        }
    }

    public j26() {
        super(ez8.fragment_loyalty_products);
        this.c = kb0.e(this, ey8.loyalty_products_container);
        this.d = kb0.e(this, ey8.loyalty_points_count_text_view);
        this.e = kb0.e(this, ey8.loyalty_products_list);
        this.f = kb0.e(this, ey8.loyalty_product_toolbar);
        this.g = kb0.e(this, ey8.loyalty_collapsing_layout);
        this.h = kb0.e(this, ey8.loyalty_products_subtitle);
        b bVar = new b();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.i = new MoxyKtxDelegate(mvpDelegate, LoyaltyProductsPresenter.class.getName() + ".presenter", bVar);
    }

    private final TextView oh() {
        return (TextView) this.h.a(this, k[5]);
    }

    private final CollapsingToolbarLayout ph() {
        return (CollapsingToolbarLayout) this.g.a(this, k[4]);
    }

    private final View qh() {
        return (View) this.c.a(this, k[0]);
    }

    private final TextView rh() {
        return (TextView) this.d.a(this, k[1]);
    }

    private final RecyclerView sh() {
        return (RecyclerView) this.e.a(this, k[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoyaltyProductsPresenter th() {
        return (LoyaltyProductsPresenter) this.i.getValue(this, k[6]);
    }

    private final Toolbar uh() {
        return (Toolbar) this.f.a(this, k[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vh(j26 j26Var, View view) {
        z65.h(j26Var, "this$0");
        j26Var.th().z();
    }

    @Override // defpackage.o26
    public void D2(String str) {
        z65.h(str, "productName");
        soa.a.a(new c(qh(), this, str)).U();
    }

    @Override // defpackage.o26
    public void De(double d2, String str) {
        z65.h(str, "minLegalPrice");
        oh().setText(getResources().getQuantityString(d09.loyalty_products_cost_label_with_legal_price, (int) d2, eb1.a.a(d2), str));
    }

    @Override // defpackage.o26
    public void V4(double d2) {
        oh().setText(getResources().getQuantityString(d09.loyalty_products_cost_label, (int) d2, eb1.a.a(d2)));
    }

    @Override // defpackage.f70
    protected int hh() {
        return ow8.b;
    }

    @Override // defpackage.o26
    public void mf(double d2) {
        oh().setText(getResources().getQuantityString(d09.loyalty_products_not_enough_subtitle, (int) d2, eb1.a.a(d2)));
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        sh().setLayoutManager(new LinearLayoutManager(requireContext()));
        sh().addItemDecoration(new eyb(16, 0, 0, 4, null));
        uh().setNavigationOnClickListener(new View.OnClickListener() { // from class: i26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                j26.vh(j26.this, view2);
            }
        });
        CollapsingToolbarLayout ph = ph();
        Resources resources = getResources();
        int i = ow8.e;
        ph.setCollapsedTitleTextColor(resources.getColor(i));
        ph().setExpandedTitleColor(getResources().getColor(i));
    }

    @Override // defpackage.o26
    public void r(String str) {
        z65.h(str, "title");
        uh().setTitle(str);
    }

    @Override // defpackage.o26
    public void re(double d2) {
        rh().setText(eb1.a.a(d2));
    }

    @Override // defpackage.o26
    public void u(List<? extends Object> list) {
        z65.h(list, "items");
        sh().setAdapter(new k6.a(new k6(list), d.a, new z16(new f()), e.a).b().d());
    }

    @Override // defpackage.o26
    public void u0() {
        jyb.d(this);
    }
}
