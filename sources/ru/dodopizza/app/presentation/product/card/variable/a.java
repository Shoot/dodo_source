package ru.dodopizza.app.presentation.product.card.variable;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.personalprice.PersonalPriceBadgeView;
import com.dodopizza.order.feature.product.card.presentation.pizza.view.VariationControlViewLite;
import com.dodopizza.order.feature.product.card.presentation.shoppingitem.ProductCardBottomView;
import com.dodopizza.order.feature.product.card.presentation.shoppingitem.ShoppingItemNavigationBar;
import com.dodopizza.order.feature.product.card.presentation.view.ExpandableFoodValueInfoIconView;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k6;
import defpackage.twb;
import defpackage.ym;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.MvpPresenter;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.modules.presentation.product.card.variable.VariableProductCardFeatureDependencies;
import ru.dodopizza.app.presentation.product.card.variable.VariableProductCardPresenter;
import ru.dodopizza.app.presentation.product.card.variable.topping.ToppingViewHolder;
/* compiled from: VariableProductCardFragment.kt */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u0090\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0091\u0001B\t¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001a\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\u0016\u0010\u001d\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J2\u0010$\u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001a2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001a2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001aH\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020 H\u0016J\u001c\u0010)\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0'H\u0016J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\bH\u0016J\u0016\u0010.\u001a\u00020\u00042\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0,H\u0016J\u001e\u00102\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\b2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u001aH\u0016J\b\u00103\u001a\u00020\u0004H\u0016J\u0010\u00106\u001a\u00020\u00042\u0006\u00105\u001a\u000204H\u0016J \u00108\u001a\u00020\u00042\u0006\u00107\u001a\u0002042\u0006\u00105\u001a\u0002042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u00109\u001a\u00020\u00042\u0006\u00105\u001a\u0002042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010:\u001a\u00020\u0004H\u0016J\b\u0010;\u001a\u00020\u0004H\u0016J\b\u0010<\u001a\u00020\u0004H\u0016J\b\u0010=\u001a\u00020\u0004H\u0016J\u0010\u0010@\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0016J\u0010\u0010C\u001a\u00020\u00042\u0006\u0010B\u001a\u00020AH\u0016J\b\u0010D\u001a\u00020\u0004H\u0016J\u0010\u0010F\u001a\u00020\u00042\u0006\u0010E\u001a\u00020>H\u0016R\u001b\u0010L\u001a\u00020G8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020M8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010I\u001a\u0004\bT\u0010UR\u001b\u0010[\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010I\u001a\u0004\bY\u0010ZR\u001b\u0010^\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010I\u001a\u0004\b]\u0010PR\u001b\u0010c\u001a\u00020_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010I\u001a\u0004\ba\u0010bR\u001b\u0010f\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010I\u001a\u0004\be\u0010PR\u001b\u0010k\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010I\u001a\u0004\bi\u0010jR\u001b\u0010n\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010I\u001a\u0004\bm\u0010PR\u001b\u0010s\u001a\u00020o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010I\u001a\u0004\bq\u0010rR\u001b\u0010x\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010I\u001a\u0004\bv\u0010wR#\u0010\u0080\u0001\u001a\u00020y8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR1\u0010\u0089\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010\u008d\u0001\u001a\u00030\u0082\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\b:\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u0092\u0001"}, d2 = {"Lru/dodopizza/app/presentation/product/card/variable/a;", "Lb2;", "Lru/dodopizza/app/presentation/product/card/variable/d;", "Lw78;", "", "Bh", "Lru/dodopizza/app/presentation/product/card/variable/VariableProductCardPresenter$a;", "textOnButton", "", "Ch", "imageUrl", "z", "Laxb;", "variableProductCardVO", "Dh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "E5", "Qa", "", "Ljjb;", "toppingsVO", "C0", "O", "t", "", "availableSize", "discountForSize", "stopSize", "Q", "sizeGroup", "ob", "", "names", "H0", "description", "W4", "", "removedIngredientsIds", "Qf", "menuItemId", "Lvl8;", "ingredients", "T", "m0", "Lhn6;", "price", "i0", "rawPrice", "Ua", "E9", "p", "N", "w3", "E", "", "isEnabled", "I", "", "timeRemain", "x", "G0", "loyaltyEnable", "I5", "Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ShoppingItemNavigationBar;", com.huawei.hms.opendevice.c.a, "Lk79;", "mh", "()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ShoppingItemNavigationBar;", "navigationBar", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "xh", "()Landroid/widget/TextView;", "title", "Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ProductCardBottomView;", com.huawei.hms.push.e.a, "oh", "()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ProductCardBottomView;", "bottomView", "Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", "f", "qh", "()Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", "infoIcon", "g", "ph", "compositionDescription", "Landroid/widget/ImageView;", Image.TYPE_HIGH, "rh", "()Landroid/widget/ImageView;", "itemImage", "i", "vh", "removeIngredientsButton", "Lcom/dodopizza/order/feature/product/card/presentation/pizza/view/VariationControlViewLite;", "j", "Ah", "()Lcom/dodopizza/order/feature/product/card/presentation/pizza/view/VariationControlViewLite;", "variationControl", "k", "zh", "toppingsTitle", "Landroidx/recyclerview/widget/RecyclerView;", "l", "yh", "()Landroidx/recyclerview/widget/RecyclerView;", "toppingsRecycler", "Lcom/dodopizza/order/feature/personalprice/PersonalPriceBadgeView;", Image.TYPE_MEDIUM, "sh", "()Lcom/dodopizza/order/feature/personalprice/PersonalPriceBadgeView;", "personalPriceBadge", "Lu18;", "n", "Lu18;", "wh", "()Lu18;", "setTimerFormatter", "(Lu18;)V", "timerFormatter", "Las8;", "Lru/dodopizza/app/presentation/product/card/variable/VariableProductCardPresenter;", "o", "Las8;", "uh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "Lmoxy/ktx/MoxyKtxDelegate;", "th", "()Lru/dodopizza/app/presentation/product/card/variable/VariableProductCardPresenter;", "presenter", "<init>", "()V", "q", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class a extends b2 implements ru.dodopizza.app.presentation.product.card.variable.d, w78 {
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
    public u18 n;
    public as8<VariableProductCardPresenter> o;
    private final MoxyKtxDelegate p;
    static final /* synthetic */ je5<Object>[] r = {bc9.f(new ar8(a.class, "navigationBar", "getNavigationBar()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ShoppingItemNavigationBar;", 0)), bc9.f(new ar8(a.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "bottomView", "getBottomView()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ProductCardBottomView;", 0)), bc9.f(new ar8(a.class, "infoIcon", "getInfoIcon()Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", 0)), bc9.f(new ar8(a.class, "compositionDescription", "getCompositionDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "itemImage", "getItemImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(a.class, "removeIngredientsButton", "getRemoveIngredientsButton()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "variationControl", "getVariationControl()Lcom/dodopizza/order/feature/product/card/presentation/pizza/view/VariationControlViewLite;", 0)), bc9.f(new ar8(a.class, "toppingsTitle", "getToppingsTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "toppingsRecycler", "getToppingsRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(a.class, "personalPriceBadge", "getPersonalPriceBadge()Lcom/dodopizza/order/feature/personalprice/PersonalPriceBadgeView;", 0)), bc9.f(new ar8(a.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/product/card/variable/VariableProductCardPresenter;", 0))};
    public static final C0593a q = new C0593a(null);

    /* compiled from: VariableProductCardFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lru/dodopizza/app/presentation/product/card/variable/a$a;", "", "Luwb;", "arguments", "Lru/dodopizza/app/presentation/product/card/variable/a;", "a", "", "ARG_CART_ITEM_ID", "Ljava/lang/String;", "ARG_DEFAULT_SHOPPING_ITEM_ID", "ARG_IS_HERO", "ARG_MENU_ITEM_ID", "ARG_POSITION_IN_MENU", "ARG_SCREEN", "", "TOPPINGS_COLUMNS", "I", "TOPPINGS_SPACING", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.product.card.variable.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0593a {
        private C0593a() {
        }

        public /* synthetic */ C0593a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(uwb uwbVar) {
            z65.h(uwbVar, "arguments");
            return (a) y64.d(new a(), bi0.c(bi0.d("arg_cart_item_id", uwbVar.a()), bi0.d("arg_menu_item", uwbVar.c()), bi0.d("arg_selected_shopping_item_id", uwbVar.b()), bi0.d("arg_position_in_menu", Integer.valueOf(uwbVar.d())), bi0.d("arg_screen", uwbVar.e()), bi0.d("arg_is_hero", Boolean.valueOf(uwbVar.f()))));
        }
    }

    /* compiled from: VariableProductCardFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VariableProductCardPresenter.a.values().length];
            try {
                iArr[VariableProductCardPresenter.a.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VariableProductCardPresenter.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VariableProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            a.this.nh().W();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: VariableProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            a.this.nh().U();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: VariableProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/product/card/variable/VariableProductCardPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/product/card/variable/VariableProductCardPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function0<VariableProductCardPresenter> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final VariableProductCardPresenter invoke() {
            return a.this.uh().get();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class f extends ej5 implements Function1<Object, Boolean> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof jjb);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
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
            Object newInstance = ToppingViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: VariableProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljjb;", "toppingVO", "", "isAdded", "", "a", "(Ljjb;Z)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class h extends ej5 implements Function2<jjb, Boolean, Unit> {
        h() {
            super(2);
        }

        public final void a(jjb jjbVar, boolean z) {
            z65.h(jjbVar, "toppingVO");
            a.this.nh().e0(jjbVar, z);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(jjb jjbVar, Boolean bool) {
            a(jjbVar, bool.booleanValue());
            return Unit.a;
        }
    }

    /* compiled from: VariableProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class i extends ej5 implements Function0<Unit> {
        final /* synthetic */ axb b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(axb axbVar) {
            super(0);
            this.b = axbVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VariableProductCardPresenter nh = a.this.nh();
            axb axbVar = this.b;
            Bundle arguments = a.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("arg_is_hero")) == null) ? null : null;
            if (obj != null && !(obj instanceof Boolean)) {
                throw new ClassCastException("Property arg_is_hero has different class type");
            } else if (obj != null) {
                nh.T(axbVar, ((Boolean) obj).booleanValue());
            } else {
                throw new IllegalArgumentException("Argument with key = arg_is_hero not found in bundle");
            }
        }
    }

    /* compiled from: VariableProductCardFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class j extends m94 implements Function1<Integer, Unit> {
        j(Object obj) {
            super(1, obj, VariableProductCardPresenter.class, "handleVariationChange", "handleVariationChange(I)V", 0);
        }

        public final void b(int i) {
            ((VariableProductCardPresenter) this.receiver).S(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            b(num.intValue());
            return Unit.a;
        }
    }

    /* compiled from: VariableProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class k extends ej5 implements Function0<Unit> {
        final /* synthetic */ axb b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(axb axbVar) {
            super(0);
            this.b = axbVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VariableProductCardPresenter nh = a.this.nh();
            axb axbVar = this.b;
            Bundle arguments = a.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("arg_is_hero")) == null) ? null : null;
            if (obj != null && !(obj instanceof Boolean)) {
                throw new ClassCastException("Property arg_is_hero has different class type");
            } else if (obj != null) {
                nh.T(axbVar, ((Boolean) obj).booleanValue());
            } else {
                throw new IllegalArgumentException("Argument with key = arg_is_hero not found in bundle");
            }
        }
    }

    public a() {
        super(R.layout.fragment_variable_product_card);
        this.c = kb0.e(this, R.id.item_navigation_bar);
        this.d = kb0.e(this, R.id.product_title);
        this.e = kb0.e(this, R.id.bottom_shopping_bar);
        this.f = kb0.e(this, R.id.info_icon);
        this.g = kb0.e(this, R.id.description);
        this.h = kb0.e(this, R.id.image);
        this.i = kb0.e(this, R.id.remove_ingredients_button);
        this.j = kb0.e(this, R.id.variation_control_view);
        this.k = kb0.e(this, R.id.toppings_title);
        this.l = kb0.e(this, R.id.toppings_recycler);
        this.m = kb0.e(this, R.id.pizza_discount_badge);
        e eVar = new e();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.p = new MoxyKtxDelegate(mvpDelegate, VariableProductCardPresenter.class.getName() + ".presenter", eVar);
    }

    private final VariationControlViewLite Ah() {
        return (VariationControlViewLite) this.j.a(this, r[7]);
    }

    private final void Bh() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        twb.b a = twb.a.a();
        VariableProductCardFeatureDependencies variableProductCardFeatureDependencies = (VariableProductCardFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(VariableProductCardFeatureDependencies.class));
        Bundle arguments = getArguments();
        ym.d dVar = null;
        if (arguments == null || (obj = arguments.get("arg_cart_item_id")) == null) {
            obj = null;
        }
        if (obj != null && !(obj instanceof String)) {
            throw new ClassCastException("Property arg_cart_item_id has different class type");
        } else if (obj != null) {
            String str = (String) obj;
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (obj2 = arguments2.get("arg_menu_item")) == null) {
                obj2 = null;
            }
            if (obj2 != null && !(obj2 instanceof String)) {
                throw new ClassCastException("Property arg_menu_item has different class type");
            } else if (obj2 != null) {
                String str2 = (String) obj2;
                Bundle arguments3 = getArguments();
                if (arguments3 == null || (obj3 = arguments3.get("arg_selected_shopping_item_id")) == null) {
                    obj3 = null;
                }
                if (obj3 != null && !(obj3 instanceof String)) {
                    throw new ClassCastException("Property arg_selected_shopping_item_id has different class type");
                } else if (obj3 != null) {
                    String str3 = (String) obj3;
                    Bundle arguments4 = getArguments();
                    if (arguments4 != null && (obj4 = arguments4.get("arg_screen")) != null) {
                        dVar = obj4;
                    }
                    if (dVar != null && !(dVar instanceof ym.d)) {
                        throw new ClassCastException("Property arg_screen has different class type");
                    } else if (dVar != null) {
                        a.a(variableProductCardFeatureDependencies, str, str2, str3, dVar).a(this);
                    } else {
                        throw new IllegalArgumentException("Argument with key = arg_screen not found in bundle");
                    }
                } else {
                    throw new IllegalArgumentException("Argument with key = arg_selected_shopping_item_id not found in bundle");
                }
            } else {
                throw new IllegalArgumentException("Argument with key = arg_menu_item not found in bundle");
            }
        } else {
            throw new IllegalArgumentException("Argument with key = arg_cart_item_id not found in bundle");
        }
    }

    private final String Ch(VariableProductCardPresenter.a aVar) {
        int i2 = b.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                String string = getString(R.string.add_to_cart_button);
                z65.g(string, "getString(...)");
                return string;
            }
            throw new NoWhenBranchMatchedException();
        }
        String string2 = getString(R.string.edit_in_cart_button_title);
        z65.g(string2, "getString(...)");
        return string2;
    }

    private final void Dh(axb axbVar) {
        List e2;
        ExpandableFoodValueInfoIconView qh = qh();
        e2 = jc1.e(new ExpandableFoodValueInfoIconView.c(axbVar.i(), axbVar.d(), axbVar.a(), axbVar.b()));
        ExpandableFoodValueInfoIconView.u(qh, e2, false, 2, null);
    }

    private final ProductCardBottomView oh() {
        return (ProductCardBottomView) this.e.a(this, r[2]);
    }

    private final TextView ph() {
        return (TextView) this.g.a(this, r[4]);
    }

    private final ExpandableFoodValueInfoIconView qh() {
        return (ExpandableFoodValueInfoIconView) this.f.a(this, r[3]);
    }

    private final ImageView rh() {
        return (ImageView) this.h.a(this, r[5]);
    }

    private final PersonalPriceBadgeView sh() {
        return (PersonalPriceBadgeView) this.m.a(this, r[10]);
    }

    private final TextView vh() {
        return (TextView) this.i.a(this, r[6]);
    }

    private final RecyclerView yh() {
        return (RecyclerView) this.l.a(this, r[9]);
    }

    private final void z(String str) {
        com.bumptech.glide.b.t(requireContext()).t(str).a0(R.drawable.ic_product_placeholder).o0(new xt0()).G0(rh());
    }

    private final TextView zh() {
        return (TextView) this.k.a(this, r[8]);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void C0(List<jjb> list) {
        z65.h(list, "toppingsVO");
        yh().setAdapter(new k6.a(new k6(list), f.a, new gjb(new h()), g.a).b().d());
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void E() {
        PersonalPriceBadgeView sh = sh();
        String string = getString(R.string.personal_price_badge_discount_expired);
        z65.g(string, "getString(...)");
        sh.setDiscountText(string);
        sh().a();
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void E5(axb axbVar) {
        z65.h(axbVar, "variableProductCardVO");
        xh().setText(axbVar.i());
        z(axbVar.f());
        Dh(axbVar);
        TextView vh = vh();
        Collection<ul8> h2 = axbVar.h();
        boolean z = false;
        if (!(h2 instanceof Collection) || !h2.isEmpty()) {
            Iterator<T> it = h2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((ul8) it.next()).d()) {
                    z = true;
                    break;
                }
            }
        }
        un3.o(vh, z);
        oh().a(new i(axbVar));
        Ah().setOnVariationChangeListener(new j(nh()));
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void E9(hn6 hn6Var, VariableProductCardPresenter.a aVar) {
        z65.h(hn6Var, "price");
        z65.h(aVar, "textOnButton");
        ProductCardBottomView oh = oh();
        String b2 = un6.b(hn6Var);
        String string = getString(R.string.edit_in_cart_button_title);
        z65.g(string, "getString(...)");
        oh.d(b2, string);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void G0() {
        Ah().c();
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void H0(Map<Integer, String> map) {
        z65.h(map, "names");
        VariationControlViewLite Ah = Ah();
        String str = map.get(1);
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Ah.setSmallSizeText(str);
        VariationControlViewLite Ah2 = Ah();
        String str3 = map.get(2);
        if (str3 == null) {
            str3 = "";
        }
        Ah2.setMediumSizeText(str3);
        VariationControlViewLite Ah3 = Ah();
        String str4 = map.get(3);
        if (str4 != null) {
            str2 = str4;
        }
        Ah3.setLargeSizeText(str2);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void I(boolean z) {
        sh().setEnabled(z);
        if (!z) {
            sh().a();
            PersonalPriceBadgeView sh = sh();
            String string = getString(R.string.personal_price_badge_discount_expired);
            z65.g(string, "getString(...)");
            sh.setDiscountText(string);
            return;
        }
        PersonalPriceBadgeView sh2 = sh();
        String string2 = getString(R.string.discount);
        z65.g(string2, "getString(...)");
        sh2.setDiscountText(string2);
    }

    @Override // defpackage.jl8
    public void I5(boolean z) {
        if (z) {
            oh().g();
        } else {
            oh().h();
        }
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void N() {
        un3.e(sh());
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void O() {
        un3.o(zh(), true);
        un3.o(yh(), true);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void Q(List<Integer> list, List<Integer> list2, List<Integer> list3) {
        int[] E0;
        int[] E02;
        int[] E03;
        z65.h(list, "availableSize");
        z65.h(list2, "discountForSize");
        z65.h(list3, "stopSize");
        Ah().setSizeControlVisible(true);
        if (list.size() <= 1) {
            Ah().setBackgroundAllSizes(R.color.surfaceSecondaryColor);
        }
        VariationControlViewLite Ah = Ah();
        E0 = sc1.E0(list);
        Ah.f(E0);
        VariationControlViewLite Ah2 = Ah();
        E02 = sc1.E0(list3);
        Ah2.b(E02);
        VariationControlViewLite Ah3 = Ah();
        E03 = sc1.E0(list2);
        Ah3.e(E03);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void Qa(axb axbVar) {
        z65.h(axbVar, "variableProductCardVO");
        z(axbVar.f());
        Dh(axbVar);
        oh().a(new k(axbVar));
    }

    @Override // defpackage.w78
    public void Qf(Collection<String> collection) {
        z65.h(collection, "removedIngredientsIds");
        nh().V(collection);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void T(String str, List<vl8> list) {
        z65.h(str, "menuItemId");
        z65.h(list, "ingredients");
        ud9 a = ud9.h.a(str, list);
        a.setTargetFragment(this, Integer.MIN_VALUE);
        a.show(getParentFragmentManager(), "RemoveIngredientsDialog");
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void Ua(hn6 hn6Var, hn6 hn6Var2, VariableProductCardPresenter.a aVar) {
        z65.h(hn6Var, "rawPrice");
        z65.h(hn6Var2, "price");
        z65.h(aVar, "textOnButton");
        oh().e(un6.b(hn6Var), un6.b(hn6Var2), Ch(aVar));
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void W4(String str) {
        z65.h(str, "description");
        ph().setText(str);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void i0(hn6 hn6Var) {
        z65.h(hn6Var, "price");
        String string = requireContext().getString(R.string.add_to_cart_button_title, un6.b(hn6Var));
        z65.g(string, "getString(...)");
        oh().c(string);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void m0() {
        un3.o(vh(), false);
        un3.o(Ah(), false);
        oh().f();
    }

    @Override // defpackage.b2
    public ShoppingItemNavigationBar mh() {
        return (ShoppingItemNavigationBar) this.c.a(this, r[0]);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void ob(int i2) {
        Ah().setSelectedSize(i2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Bh();
        super.onAttach(context);
    }

    @Override // defpackage.f70, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onResume() {
        Object obj;
        Object obj2;
        super.onResume();
        VariableProductCardPresenter nh = nh();
        Bundle arguments = getArguments();
        Boolean bool = null;
        if (arguments == null || (obj = arguments.get("arg_position_in_menu")) == null) {
            obj = null;
        }
        if (obj != null && !(obj instanceof Integer)) {
            throw new ClassCastException("Property arg_position_in_menu has different class type");
        } else if (obj != null) {
            int intValue = ((Integer) obj).intValue();
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (obj2 = arguments2.get("arg_is_hero")) != null) {
                bool = obj2;
            }
            if (bool != null && !(bool instanceof Boolean)) {
                throw new ClassCastException("Property arg_is_hero has different class type");
            } else if (bool != null) {
                nh.g0(intValue, bool.booleanValue());
            } else {
                throw new IllegalArgumentException("Argument with key = arg_is_hero not found in bundle");
            }
        } else {
            throw new IllegalArgumentException("Argument with key = arg_position_in_menu not found in bundle");
        }
    }

    @Override // defpackage.b2, defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(vh(), new c());
        oma.a(sh(), new d());
        yh().setLayoutManager(new GridLayoutManager(getContext(), 3));
        yh().addItemDecoration(new li4(8));
        yh().getViewTreeObserver().addOnGlobalLayoutListener(new hjb(yh()));
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void p() {
        PersonalPriceBadgeView sh = sh();
        String string = getString(R.string.discount);
        z65.g(string, "getString(...)");
        sh.setDiscountText(string);
        un3.k(sh());
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void t() {
        un3.o(zh(), false);
        un3.o(yh(), false);
    }

    @Override // defpackage.b2
    /* renamed from: th */
    public VariableProductCardPresenter nh() {
        MvpPresenter value = this.p.getValue(this, r[11]);
        z65.g(value, "getValue(...)");
        return (VariableProductCardPresenter) value;
    }

    public final as8<VariableProductCardPresenter> uh() {
        as8<VariableProductCardPresenter> as8Var = this.o;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void w3() {
        Ah().c();
    }

    public final u18 wh() {
        u18 u18Var = this.n;
        if (u18Var != null) {
            return u18Var;
        }
        z65.z("timerFormatter");
        return null;
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void x(long j2) {
        PersonalPriceBadgeView sh = sh();
        u18 wh = wh();
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        sh.setTimeRemain(wh.a(requireContext, j2));
    }

    public TextView xh() {
        return (TextView) this.d.a(this, r[1]);
    }
}
