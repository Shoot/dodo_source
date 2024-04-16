package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.doubleimageview.DoubleImageView;
import com.dodopizza.order.feature.product.card.presentation.pizza.view.PizzaVariationControlViewLite;
import com.dodopizza.order.feature.product.card.presentation.shoppingitem.ProductCardBottomView;
import com.dodopizza.order.feature.product.card.presentation.shoppingitem.ShoppingItemNavigationBar;
import com.dodopizza.order.feature.product.card.presentation.view.ExpandableFoodValueInfoIconView;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ll4;
import defpackage.ym;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.MvpPresenter;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.modules.presentation.product.card.halves.HalvesProductCardFeatureDependencies;
import ru.dodopizza.app.presentation.product.card.halves.HalvesProductCardPresenter;
/* compiled from: HalvesProductCardFragment.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 i2\u00020\u00012\u00020\u0002:\u0001jB\u0007¢\u0006\u0004\bg\u0010hJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001a\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u001e\u0010\u0018\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\tH\u0016J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0016R\u001b\u0010%\u001a\u00020 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u00103R\u001b\u00107\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\"\u001a\u0004\b6\u0010)R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\"\u001a\u0004\b:\u0010;R\u001b\u0010?\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\"\u001a\u0004\b>\u0010)R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\"\u001a\u0004\bB\u0010CR\u001b\u0010G\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\"\u001a\u0004\bF\u0010)R\u001b\u0010J\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010\"\u001a\u0004\bI\u0010)R\u001b\u0010M\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010\"\u001a\u0004\bL\u0010CR\u001b\u0010P\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010\"\u001a\u0004\bO\u0010)R\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR(\u0010a\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001b\u0010f\u001a\u00020Z8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e¨\u0006k"}, d2 = {"Lnl4;", "Lb2;", "Lxl4;", "", "Dh", "", "Lhl4;", "", "id", "", "ph", "halvesInfoVO", "Eh", "Fh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "vg", "currentDough", "sb", "price", "nf", "Ad", "Zg", "Lb78;", "pizzaConcept", "T0", "Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ShoppingItemNavigationBar;", com.huawei.hms.opendevice.c.a, "Lk79;", "mh", "()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ShoppingItemNavigationBar;", "navigationBar", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Ch", "()Landroid/widget/TextView;", "title", "Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ProductCardBottomView;", com.huawei.hms.push.e.a, "oh", "()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ProductCardBottomView;", "bottomView", "Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", "f", "vh", "()Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", "itemImage", "g", "th", "halvesSizeTitle", "Lcom/dodopizza/order/feature/product/card/presentation/pizza/view/PizzaVariationControlViewLite;", Image.TYPE_HIGH, "uh", "()Lcom/dodopizza/order/feature/product/card/presentation/pizza/view/PizzaVariationControlViewLite;", "halvesVariationControl", "i", "sh", "firstPizzaTitle", "Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", "j", "rh", "()Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", "firstPizzaFoodValueView", "k", "qh", "firstPizzaDescription", "l", "Bh", "secondPizzaTitle", Image.TYPE_MEDIUM, "Ah", "secondPizzaFoodValueView", "n", "zh", "secondPizzaDescription", "Lvu4;", "o", "Lvu4;", "wh", "()Lvu4;", "setModifierFactory", "(Lvu4;)V", "modifierFactory", "Las8;", "Lru/dodopizza/app/presentation/product/card/halves/HalvesProductCardPresenter;", "p", "Las8;", "yh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "q", "Lmoxy/ktx/MoxyKtxDelegate;", "xh", "()Lru/dodopizza/app/presentation/product/card/halves/HalvesProductCardPresenter;", "presenter", "<init>", "()V", "r", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: nl4  reason: default package */
/* loaded from: classes4.dex */
public final class nl4 extends b2 implements xl4 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    private final k79 m;
    private final k79 n;
    public vu4 o;
    public as8<HalvesProductCardPresenter> p;
    private final MoxyKtxDelegate q;
    static final /* synthetic */ je5<Object>[] s = {bc9.f(new ar8(nl4.class, "navigationBar", "getNavigationBar()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ShoppingItemNavigationBar;", 0)), bc9.f(new ar8(nl4.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(nl4.class, "bottomView", "getBottomView()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ProductCardBottomView;", 0)), bc9.f(new ar8(nl4.class, "itemImage", "getItemImage()Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", 0)), bc9.f(new ar8(nl4.class, "halvesSizeTitle", "getHalvesSizeTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(nl4.class, "halvesVariationControl", "getHalvesVariationControl()Lcom/dodopizza/order/feature/product/card/presentation/pizza/view/PizzaVariationControlViewLite;", 0)), bc9.f(new ar8(nl4.class, "firstPizzaTitle", "getFirstPizzaTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(nl4.class, "firstPizzaFoodValueView", "getFirstPizzaFoodValueView()Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", 0)), bc9.f(new ar8(nl4.class, "firstPizzaDescription", "getFirstPizzaDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(nl4.class, "secondPizzaTitle", "getSecondPizzaTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(nl4.class, "secondPizzaFoodValueView", "getSecondPizzaFoodValueView()Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", 0)), bc9.f(new ar8(nl4.class, "secondPizzaDescription", "getSecondPizzaDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(nl4.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/product/card/halves/HalvesProductCardPresenter;", 0))};
    public static final a r = new a(null);

    /* compiled from: HalvesProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lnl4$a;", "", "Lml4;", "args", "Lnl4;", "a", "", "ARG_HALVES_IDS", "Ljava/lang/String;", "ARG_MENU_ITEM_ID", "ARG_SCREEN", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nl4$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final nl4 a(ml4 ml4Var) {
            z65.h(ml4Var, "args");
            return (nl4) y64.d(new nl4(), bi0.c(bi0.d("arg_customize_components", ml4Var.a()), bi0.d("arg_screen", ml4Var.c()), bi0.d("arg_menu_item", ml4Var.b())));
        }
    }

    /* compiled from: HalvesProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dough", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nl4$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<Integer, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.a;
        }

        public final void invoke(int i) {
            nl4.this.nh().A(i);
        }
    }

    /* compiled from: HalvesProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/product/card/halves/HalvesProductCardPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/product/card/halves/HalvesProductCardPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: nl4$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<HalvesProductCardPresenter> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final HalvesProductCardPresenter invoke() {
            return nl4.this.yh().get();
        }
    }

    /* compiled from: HalvesProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lul8;", "ingredients", "", "a", "(Lul8;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: nl4$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<ul8, CharSequence> {
        public static final d a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(ul8 ul8Var) {
            z65.h(ul8Var, "ingredients");
            return ul8Var.getName();
        }
    }

    /* compiled from: HalvesProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lul8;", "ingredients", "", "a", "(Lul8;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: nl4$e */
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function1<ul8, CharSequence> {
        public static final e a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(ul8 ul8Var) {
            z65.h(ul8Var, "ingredients");
            return ul8Var.getName();
        }
    }

    /* compiled from: HalvesProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nl4$f */
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function0<Unit> {
        final /* synthetic */ hl4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(hl4 hl4Var) {
            super(0);
            this.b = hl4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nl4.this.nh().y(this.b);
        }
    }

    /* compiled from: HalvesProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nl4$g */
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function0<Unit> {
        final /* synthetic */ hl4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(hl4 hl4Var) {
            super(0);
            this.b = hl4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nl4.this.nh().y(this.b);
        }
    }

    public nl4() {
        super(R.layout.fragment_halves_product_card);
        this.c = kb0.e(this, R.id.halves_card_item_navigation_bar);
        this.d = kb0.e(this, R.id.halves_card_title);
        this.e = kb0.e(this, R.id.halves_card_bottom_shopping_bar);
        this.f = kb0.e(this, R.id.halves_card_image);
        this.g = kb0.e(this, R.id.halves_card_size_title);
        this.h = kb0.e(this, R.id.halves_card_variation_control_view);
        this.i = kb0.e(this, R.id.halves_card_first_pizza_title);
        this.j = kb0.e(this, R.id.halves_card_first_pizza_food_value);
        this.k = kb0.e(this, R.id.halves_card_first_description);
        this.l = kb0.e(this, R.id.halves_card_second_pizza_title);
        this.m = kb0.e(this, R.id.halves_card_second_pizza_food_value);
        this.n = kb0.e(this, R.id.halves_card_second_pizza_description);
        c cVar = new c();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.q = new MoxyKtxDelegate(mvpDelegate, HalvesProductCardPresenter.class.getName() + ".presenter", cVar);
    }

    private final ExpandableFoodValueInfoIconView Ah() {
        return (ExpandableFoodValueInfoIconView) this.m.a(this, s[10]);
    }

    private final TextView Bh() {
        return (TextView) this.l.a(this, s[9]);
    }

    private final void Dh() {
        Object obj;
        Object obj2;
        ll4.b a2 = ll4.a.a();
        HalvesProductCardFeatureDependencies halvesProductCardFeatureDependencies = (HalvesProductCardFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(HalvesProductCardFeatureDependencies.class));
        Bundle arguments = getArguments();
        ym.d dVar = null;
        if (arguments == null || (obj = arguments.get("arg_customize_components")) == null) {
            obj = null;
        }
        if (obj != null && !(obj instanceof Pair)) {
            throw new ClassCastException("Property arg_customize_components has different class type");
        } else if (obj != null) {
            Pair<String, String> pair = (Pair) obj;
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (obj2 = arguments2.get("arg_screen")) != null) {
                dVar = obj2;
            }
            if (dVar != null && !(dVar instanceof ym.d)) {
                throw new ClassCastException("Property arg_screen has different class type");
            } else if (dVar != null) {
                ym.d dVar2 = dVar;
                Bundle arguments3 = getArguments();
                String str = (arguments3 == null || (str = arguments3.get("arg_menu_item")) == null) ? "" : "";
                if (str instanceof String) {
                    a2.a(halvesProductCardFeatureDependencies, pair, dVar2, (String) str).a(this);
                    return;
                }
                throw new ClassCastException("Property arg_menu_item has different class type");
            } else {
                throw new IllegalArgumentException("Argument with key = arg_screen not found in bundle");
            }
        } else {
            throw new IllegalArgumentException("Argument with key = arg_customize_components not found in bundle");
        }
    }

    private final void Eh(hl4 hl4Var) {
        m78 c2 = hl4Var.c();
        m78 g2 = hl4Var.g();
        bl4 bl4Var = new bl4(null, null, 3, null);
        com.bumptech.glide.b.t(requireContext()).t(c2.d()).a0(R.drawable.ic_product_placeholder).J0(new cl4(bl4Var.a())).o0(new fj9(vh().getLayoutParams().width, vh().getLayoutParams().height)).D0(new pl4(bl4Var, vh()));
        com.bumptech.glide.b.t(requireContext()).t(g2.d()).a0(R.drawable.ic_product_placeholder).J0(new cl4(bl4Var.b())).o0(new fj9(vh().getLayoutParams().width, vh().getLayoutParams().height)).D0(new pl4(bl4Var, vh()));
    }

    private final void Fh(hl4 hl4Var) {
        m78 c2 = hl4Var.c();
        m78 g2 = hl4Var.g();
        bl4 bl4Var = new bl4(null, null, 3, null);
        pl4 pl4Var = new pl4(bl4Var, vh());
        com.bumptech.glide.b.t(requireContext()).t(c2.d()).J0(new cl4(bl4Var.a())).o0(new fj9(vh().getLayoutParams().width, vh().getLayoutParams().height)).D0(pl4Var);
        com.bumptech.glide.b.t(requireContext()).t(g2.d()).J0(new cl4(bl4Var.b())).o0(new fj9(vh().getLayoutParams().width, vh().getLayoutParams().height)).D0(pl4Var);
    }

    private final ProductCardBottomView oh() {
        return (ProductCardBottomView) this.e.a(this, s[2]);
    }

    private final String ph(List<hl4> list, int i) {
        String str;
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                obj = it.next();
                if (((hl4) obj).a() == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        hl4 hl4Var = (hl4) obj;
        if (hl4Var != null) {
            str = hl4Var.b();
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    private final TextView qh() {
        return (TextView) this.k.a(this, s[8]);
    }

    private final ExpandableFoodValueInfoIconView rh() {
        return (ExpandableFoodValueInfoIconView) this.j.a(this, s[7]);
    }

    private final TextView sh() {
        return (TextView) this.i.a(this, s[6]);
    }

    private final TextView th() {
        return (TextView) this.g.a(this, s[4]);
    }

    private final PizzaVariationControlViewLite uh() {
        return (PizzaVariationControlViewLite) this.h.a(this, s[5]);
    }

    private final DoubleImageView vh() {
        return (DoubleImageView) this.f.a(this, s[3]);
    }

    private final TextView zh() {
        return (TextView) this.n.a(this, s[11]);
    }

    @Override // defpackage.xl4
    public void Ad(hl4 hl4Var) {
        List e2;
        String i0;
        List e3;
        String i02;
        z65.h(hl4Var, "halvesInfoVO");
        m78 c2 = hl4Var.c();
        sh().setText(c2.getName());
        ExpandableFoodValueInfoIconView rh = rh();
        ExpandableFoodValueInfoIconView.b bVar = ExpandableFoodValueInfoIconView.e;
        e2 = jc1.e(bVar.a().invoke(c2));
        ExpandableFoodValueInfoIconView.u(rh, e2, false, 2, null);
        TextView qh = qh();
        i0 = sc1.i0(c2.k(), null, null, null, 0, null, d.a, 31, null);
        qh.setText(i0);
        m78 g2 = hl4Var.g();
        Bh().setText(g2.getName());
        ExpandableFoodValueInfoIconView Ah = Ah();
        e3 = jc1.e(bVar.a().invoke(g2));
        ExpandableFoodValueInfoIconView.u(Ah, e3, false, 2, null);
        TextView zh = zh();
        i02 = sc1.i0(g2.k(), null, null, null, 0, null, e.a, 31, null);
        zh.setText(i02);
    }

    public TextView Ch() {
        return (TextView) this.d.a(this, s[1]);
    }

    @Override // defpackage.xl4
    public void T0(b78 b78Var) {
        boolean z;
        z65.h(b78Var, "pizzaConcept");
        DoubleImageView vh = vh();
        if (b78Var == b78.a) {
            z = true;
        } else {
            z = false;
        }
        vh.setHasOffset(z);
        wh().a(b78Var).a(vh());
    }

    @Override // defpackage.xl4
    public void Zg(hl4 hl4Var) {
        z65.h(hl4Var, "halvesInfoVO");
        Fh(hl4Var);
        oh().a(new g(hl4Var));
        th().setText(hl4Var.h());
    }

    @Override // defpackage.b2
    public ShoppingItemNavigationBar mh() {
        return (ShoppingItemNavigationBar) this.c.a(this, s[0]);
    }

    @Override // defpackage.xl4
    public void nf(String str) {
        z65.h(str, "price");
        String string = requireContext().getString(R.string.add_to_cart_button_title, str);
        z65.g(string, "getString(...)");
        oh().c(string);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Dh();
        super.onAttach(context);
    }

    @Override // defpackage.b2, defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        p45.j(Ch(), 0, mpb.a(-36.0f, requireContext()), 0, 0, 13, null);
    }

    @Override // defpackage.xl4
    public void sb(List<hl4> list, int i) {
        int w;
        int[] E0;
        z65.h(list, "halvesInfoVO");
        boolean z = false;
        uh().setSizeControlVisible(false);
        PizzaVariationControlViewLite uh = uh();
        if (list.size() > 1) {
            z = true;
        }
        uh.setDoughControlVisible(z);
        uh().m();
        PizzaVariationControlViewLite uh2 = uh();
        List<hl4> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (hl4 hl4Var : list2) {
            arrayList.add(Integer.valueOf(hl4Var.a()));
        }
        E0 = sc1.E0(arrayList);
        uh2.q(E0);
        uh().setSelectedDough(i);
        uh().setOnDoughChangeListener(new b());
        uh().setTraditionalDoughText(ph(list, 1));
        uh().setThinDoughText(ph(list, 2));
    }

    @Override // defpackage.xl4
    public void vg(hl4 hl4Var) {
        z65.h(hl4Var, "halvesInfoVO");
        Ch().setText(hl4Var.d());
        Eh(hl4Var);
        oh().a(new f(hl4Var));
        th().setText(hl4Var.h());
    }

    public final vu4 wh() {
        vu4 vu4Var = this.o;
        if (vu4Var != null) {
            return vu4Var;
        }
        z65.z("modifierFactory");
        return null;
    }

    @Override // defpackage.b2
    /* renamed from: xh */
    public HalvesProductCardPresenter nh() {
        MvpPresenter value = this.q.getValue(this, s[12]);
        z65.g(value, "getValue(...)");
        return (HalvesProductCardPresenter) value;
    }

    public final as8<HalvesProductCardPresenter> yh() {
        as8<HalvesProductCardPresenter> as8Var = this.p;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
