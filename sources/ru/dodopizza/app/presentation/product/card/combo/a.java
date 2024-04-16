package ru.dodopizza.app.presentation.product.card.combo;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.product.card.presentation.shoppingitem.ProductCardBottomView;
import com.dodopizza.order.feature.product.card.presentation.shoppingitem.ShoppingItemNavigationBar;
import com.dodopizza.order.feature.product.card.presentation.view.ExpandableFoodValueInfoIconView;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k6;
import defpackage.oi1;
import defpackage.sh1;
import defpackage.wg0;
import defpackage.ym;
import java.util.ArrayList;
import java.util.List;
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
import ru.dodopizza.app.di.modules.presentation.product.card.combo.ComboProductCardFeatureDependencies;
import ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter;
import ru.dodopizza.app.presentation.product.card.combo.customize.CustomizeComboSlotViewHolder;
import ru.dodopizza.app.presentation.product.card.combo.h;
/* compiled from: ComboProductCardFragment.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 w2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001xB\u0007¢\u0006\u0004\bu\u0010vJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J \u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\tH\u0002J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u001a\u0010$\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J\b\u0010&\u001a\u00020\u0005H\u0016J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0016\u0010)\u001a\u00020\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J \u00100\u001a\u00020\u00052\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u00102\u001a\u00020\u00052\f\u00101\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0016J\u0010\u00103\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u00104\u001a\u00020\u00052\u0006\u0010/\u001a\u00020-H\u0016J\b\u00105\u001a\u00020\u0017H\u0016R\u001b\u0010;\u001a\u0002068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u00108\u001a\u0004\bH\u0010IR\u001b\u0010M\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u00108\u001a\u0004\bL\u0010?R\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u00108\u001a\u0004\bP\u0010QR\u001b\u0010W\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u00108\u001a\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u00108\u001a\u0004\bZ\u0010[R\u001b\u0010_\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u00108\u001a\u0004\b^\u0010[R\u001b\u0010b\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u00108\u001a\u0004\ba\u0010?R\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR(\u0010o\u001a\b\u0012\u0004\u0012\u00020h0g8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001b\u0010t\u001a\u00020h8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010s¨\u0006y"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/a;", "Lb2;", "Lru/dodopizza/app/presentation/product/card/combo/e;", "Lii1;", "Lw50;", "", "Dh", "Lru/dodopizza/app/presentation/product/card/combo/ComboProductCardPresenter$a;", "textOnButton", "", "Eh", "Ljh1;", "comboInfoVO", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "qh", "", "Lru/dodopizza/app/presentation/product/card/combo/h;", "summaries", "rh", "", "slotIndex", "selectedProductId", "", "isComboCustomize", "Fh", "imageUrl", "z", "Gh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "Mc", "l2", "summary", "B2", "f9", "fb", "R2", "Lhn6;", "rawPrice", "price", "Be", "toppingsNames", "N8", "k5", "gg", "onBackPressed", "Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ShoppingItemNavigationBar;", com.huawei.hms.opendevice.c.a, "Lk79;", "mh", "()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ShoppingItemNavigationBar;", "navigationBar", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Ch", "()Landroid/widget/TextView;", "title", "Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ProductCardBottomView;", com.huawei.hms.push.e.a, "sh", "()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ProductCardBottomView;", "bottomView", "Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", "f", "yh", "()Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", "infoIcon", "g", "xh", "compositionDescription", "Landroid/widget/ImageView;", Image.TYPE_HIGH, "zh", "()Landroid/widget/ImageView;", "itemImage", "Landroidx/core/widget/NestedScrollView;", "i", "uh", "()Landroidx/core/widget/NestedScrollView;", "comboRootScrollView", "Landroidx/recyclerview/widget/RecyclerView;", "j", "th", "()Landroidx/recyclerview/widget/RecyclerView;", "comboEntityList", "k", "vh", "comboSummaryList", "l", "wh", "comboWeight", "Lwg0;", Image.TYPE_MEDIUM, "Lwg0;", "bubbleView", "Las8;", "Lru/dodopizza/app/presentation/product/card/combo/ComboProductCardPresenter;", "n", "Las8;", "Bh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "o", "Lmoxy/ktx/MoxyKtxDelegate;", "Ah", "()Lru/dodopizza/app/presentation/product/card/combo/ComboProductCardPresenter;", "presenter", "<init>", "()V", "p", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class a extends b2 implements ru.dodopizza.app.presentation.product.card.combo.e, ii1, w50 {
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
    private wg0 m;
    public as8<ComboProductCardPresenter> n;
    private final MoxyKtxDelegate o;
    static final /* synthetic */ je5<Object>[] q = {bc9.f(new ar8(a.class, "navigationBar", "getNavigationBar()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ShoppingItemNavigationBar;", 0)), bc9.f(new ar8(a.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "bottomView", "getBottomView()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ProductCardBottomView;", 0)), bc9.f(new ar8(a.class, "infoIcon", "getInfoIcon()Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", 0)), bc9.f(new ar8(a.class, "compositionDescription", "getCompositionDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "itemImage", "getItemImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(a.class, "comboRootScrollView", "getComboRootScrollView()Landroidx/core/widget/NestedScrollView;", 0)), bc9.f(new ar8(a.class, "comboEntityList", "getComboEntityList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(a.class, "comboSummaryList", "getComboSummaryList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(a.class, "comboWeight", "getComboWeight()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/product/card/combo/ComboProductCardPresenter;", 0))};
    public static final C0588a p = new C0588a(null);

    /* compiled from: ComboProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\b¨\u0006\u0010"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/a$a;", "", "Lth1;", "arguments", "Lru/dodopizza/app/presentation/product/card/combo/a;", "a", "", "ARG_CART_ITEM_ID", "Ljava/lang/String;", "ARG_IS_HERO", "ARG_MENU_ITEM_ID", "ARG_POSITION_IN_MENU", "ARG_PREFERRED_SLOT_PRODUCTS", "ARG_SCREEN", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.product.card.combo.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0588a {
        private C0588a() {
        }

        public /* synthetic */ C0588a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(th1 th1Var) {
            z65.h(th1Var, "arguments");
            return (a) y64.d(new a(), bi0.c(bi0.d("arg_menu_item", th1Var.b()), bi0.d("arg_cart_item_id", th1Var.a()), bi0.d("arg_screen", th1Var.e()), bi0.d("arg_position_in_menu", Integer.valueOf(th1Var.c())), bi0.d("arg_preferred_slot_products", th1Var.d()), bi0.d("arg_is_hero", Boolean.valueOf(th1Var.f()))));
        }
    }

    /* compiled from: ComboProductCardFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComboProductCardPresenter.a.values().length];
            try {
                iArr[ComboProductCardPresenter.a.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComboProductCardPresenter.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<Object, Boolean> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof fi1);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final d a = new d();

        public d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = CustomizeComboSlotViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
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
            return Boolean.valueOf(obj instanceof fi1);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
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
            Object newInstance = DefaultComboSlotViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "slotIndex", "", "selectedProductId", "", "a", "(ILjava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class g extends ej5 implements Function2<Integer, String, Unit> {
        final /* synthetic */ jh1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(jh1 jh1Var) {
            super(2);
            this.b = jh1Var;
        }

        public final void a(int i, String str) {
            z65.h(str, "selectedProductId");
            a.this.Fh(i, str, this.b.i());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str) {
            a(num.intValue(), str);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "slotIndex", "", "selectedProductId", "", "a", "(ILjava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class h extends ej5 implements Function2<Integer, String, Unit> {
        final /* synthetic */ jh1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(jh1 jh1Var) {
            super(2);
            this.b = jh1Var;
        }

        public final void a(int i, String str) {
            z65.h(str, "selectedProductId");
            a.this.Fh(i, str, this.b.i());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str) {
            a(num.intValue(), str);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class i extends ej5 implements Function1<Object, Boolean> {
        public static final i a = new i();

        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof h.b);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class j extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final j a = new j();

        public j() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = SummaryComboPriceViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class k extends ej5 implements Function1<Object, Boolean> {
        public static final k a = new k();

        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof h.a);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class l extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final l a = new l();

        public l() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = SummarySlotPriceViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: ComboProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class m extends ej5 implements Function0<Unit> {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a.this.nh().onBackPressed();
        }
    }

    /* compiled from: ComboProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/ComboProductCardPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/product/card/combo/ComboProductCardPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class n extends ej5 implements Function0<ComboProductCardPresenter> {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ComboProductCardPresenter invoke() {
            return a.this.Bh().get();
        }
    }

    /* compiled from: ComboProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class o extends ej5 implements Function0<Unit> {
        final /* synthetic */ jh1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(jh1 jh1Var) {
            super(0);
            this.b = jh1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ComboProductCardPresenter nh = a.this.nh();
            jh1 jh1Var = this.b;
            Bundle arguments = a.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("arg_is_hero")) == null) ? null : null;
            if (obj != null && !(obj instanceof Boolean)) {
                throw new ClassCastException("Property arg_is_hero has different class type");
            } else if (obj != null) {
                nh.J(jh1Var, ((Boolean) obj).booleanValue());
            } else {
                throw new IllegalArgumentException("Argument with key = arg_is_hero not found in bundle");
            }
        }
    }

    /* compiled from: ComboProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwg0;", "bubbleShowCase", "", "a", "(Lwg0;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class p extends ej5 implements Function1<wg0, Unit> {
        final /* synthetic */ View a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(View view) {
            super(1);
            this.a = view;
        }

        public final void a(wg0 wg0Var) {
            z65.h(wg0Var, "bubbleShowCase");
            wg0Var.m();
            this.a.performClick();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(wg0 wg0Var) {
            a(wg0Var);
            return Unit.a;
        }
    }

    /* compiled from: ComboProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwg0;", "bubbleShowCase", "", "a", "(Lwg0;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class q extends ej5 implements Function1<wg0, Unit> {
        public static final q a = new q();

        q() {
            super(1);
        }

        public final void a(wg0 wg0Var) {
            z65.h(wg0Var, "bubbleShowCase");
            wg0Var.m();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(wg0 wg0Var) {
            a(wg0Var);
            return Unit.a;
        }
    }

    /* compiled from: ComboProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwg0;", "bubbleShowCase", "", "a", "(Lwg0;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class r extends ej5 implements Function1<wg0, Unit> {
        public static final r a = new r();

        r() {
            super(1);
        }

        public final void a(wg0 wg0Var) {
            z65.h(wg0Var, "bubbleShowCase");
            wg0Var.m();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(wg0 wg0Var) {
            a(wg0Var);
            return Unit.a;
        }
    }

    /* compiled from: ComboProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwg0;", "bubbleShowCase", "", "a", "(Lwg0;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class s extends ej5 implements Function1<wg0, Unit> {
        public static final s a = new s();

        s() {
            super(1);
        }

        public final void a(wg0 wg0Var) {
            z65.h(wg0Var, "bubbleShowCase");
            wg0Var.m();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(wg0 wg0Var) {
            a(wg0Var);
            return Unit.a;
        }
    }

    /* compiled from: ComboProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class t extends ej5 implements Function0<Unit> {
        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a.this.m = null;
            a.this.nh().L();
        }
    }

    /* compiled from: ComboProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class u extends ej5 implements Function0<Unit> {
        final /* synthetic */ jh1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(jh1 jh1Var) {
            super(0);
            this.b = jh1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ComboProductCardPresenter nh = a.this.nh();
            jh1 jh1Var = this.b;
            Bundle arguments = a.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("arg_is_hero")) == null) ? null : null;
            if (obj != null && !(obj instanceof Boolean)) {
                throw new ClassCastException("Property arg_is_hero has different class type");
            } else if (obj != null) {
                nh.J(jh1Var, ((Boolean) obj).booleanValue());
            } else {
                throw new IllegalArgumentException("Argument with key = arg_is_hero not found in bundle");
            }
        }
    }

    public a() {
        super(R.layout.fragment_combo_product_card);
        this.c = kb0.e(this, R.id.combo_card_item_navigation_bar);
        this.d = kb0.e(this, R.id.product_title);
        this.e = kb0.e(this, R.id.combo_card_bottom_shopping_bar);
        this.f = kb0.e(this, R.id.combo_card_info_icon);
        this.g = kb0.e(this, R.id.combo_card_description);
        this.h = kb0.e(this, R.id.combo_card_image);
        this.i = kb0.e(this, R.id.combo_card_scroll_view);
        this.j = kb0.e(this, R.id.combo_card_entity_list);
        this.k = kb0.e(this, R.id.combo_card_summary_list);
        this.l = kb0.e(this, R.id.combo_card_weight);
        n nVar = new n();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.o = new MoxyKtxDelegate(mvpDelegate, ComboProductCardPresenter.class.getName() + ".presenter", nVar);
    }

    private final void Dh() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        sh1.b a = sh1.a.a();
        ComboProductCardFeatureDependencies comboProductCardFeatureDependencies = (ComboProductCardFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(ComboProductCardFeatureDependencies.class));
        Bundle arguments = getArguments();
        List<si8> list = null;
        if (arguments == null || (obj = arguments.get("arg_menu_item")) == null) {
            obj = null;
        }
        if (obj != null && !(obj instanceof String)) {
            throw new ClassCastException("Property arg_menu_item has different class type");
        } else if (obj != null) {
            String str = (String) obj;
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (obj2 = arguments2.get("arg_cart_item_id")) == null) {
                obj2 = null;
            }
            if (obj2 != null && !(obj2 instanceof String)) {
                throw new ClassCastException("Property arg_cart_item_id has different class type");
            } else if (obj2 != null) {
                String str2 = (String) obj2;
                Bundle arguments3 = getArguments();
                if (arguments3 == null || (obj3 = arguments3.get("arg_screen")) == null) {
                    obj3 = null;
                }
                if (obj3 != null && !(obj3 instanceof ym.d)) {
                    throw new ClassCastException("Property arg_screen has different class type");
                } else if (obj3 != null) {
                    ym.d dVar = (ym.d) obj3;
                    Bundle arguments4 = getArguments();
                    if (arguments4 != null && (obj4 = arguments4.get("arg_preferred_slot_products")) != null) {
                        list = obj4;
                    }
                    if (list != null && !(list instanceof List)) {
                        throw new ClassCastException("Property arg_preferred_slot_products has different class type");
                    } else if (list != null) {
                        a.a(comboProductCardFeatureDependencies, str, str2, dVar, list).a(this);
                    } else {
                        throw new IllegalArgumentException("Argument with key = arg_preferred_slot_products not found in bundle");
                    }
                } else {
                    throw new IllegalArgumentException("Argument with key = arg_screen not found in bundle");
                }
            } else {
                throw new IllegalArgumentException("Argument with key = arg_cart_item_id not found in bundle");
            }
        } else {
            throw new IllegalArgumentException("Argument with key = arg_menu_item not found in bundle");
        }
    }

    private final String Eh(ComboProductCardPresenter.a aVar) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void Fh(int i2, String str, boolean z) {
        gj1 gj1Var;
        Object obj;
        Object obj2;
        View a = dzb.a(th(), i2);
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        flb flbVar = new flb(a.getWidth(), a.getHeight(), iArr[0], iArr[1]);
        if (z) {
            gj1Var = gj1.b;
        } else {
            gj1Var = gj1.a;
        }
        gj1 gj1Var2 = gj1Var;
        oi1.a aVar = oi1.j;
        Bundle arguments = getArguments();
        ym.d dVar = null;
        if (arguments == null || (obj = arguments.get("arg_menu_item")) == null) {
            obj = null;
        }
        if (obj != null && !(obj instanceof String)) {
            throw new ClassCastException("Property arg_menu_item has different class type");
        } else if (obj != null) {
            String str2 = (String) obj;
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (obj2 = arguments2.get("arg_screen")) != null) {
                dVar = obj2;
            }
            if (dVar != null && !(dVar instanceof ym.d)) {
                throw new ClassCastException("Property arg_screen has different class type");
            } else if (dVar != null) {
                oi1 a2 = aVar.a(new ki1(str2, i2, flbVar, str, dVar, gj1Var2));
                a2.setTargetFragment(this, 0);
                a2.show(getParentFragmentManager(), "");
            } else {
                throw new IllegalArgumentException("Argument with key = arg_screen not found in bundle");
            }
        } else {
            throw new IllegalArgumentException("Argument with key = arg_menu_item not found in bundle");
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    private final void Gh(jh1 jh1Var) {
        int w;
        int w2;
        List<fi1> g2 = jh1Var.g();
        w = lc1.w(g2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (fi1 fi1Var : g2) {
            arrayList.add(fi1Var.g());
        }
        ArrayList<??> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((fl8) obj).i().e().length() > 0) {
                arrayList2.add(obj);
            }
        }
        Function1<fl8, ExpandableFoodValueInfoIconView.c> a = ExpandableFoodValueInfoIconView.e.a();
        w2 = lc1.w(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(w2);
        for (?? r1 : arrayList2) {
            arrayList3.add(a.invoke(r1));
        }
        un3.o(yh(), !arrayList3.isEmpty());
        ExpandableFoodValueInfoIconView.u(yh(), arrayList3, false, 2, null);
    }

    private final RecyclerView.h<RecyclerView.d0> qh(jh1 jh1Var) {
        k6 k6Var = new k6(new l6(jh1Var.g()));
        if (jh1Var.i()) {
            new k6.a(k6Var, c.a, new di1(jh1Var.j(), new g(jh1Var)), d.a).b();
        } else {
            new k6.a(k6Var, e.a, new di1(jh1Var.j(), new h(jh1Var)), f.a).b();
        }
        return k6Var.d();
    }

    private final RecyclerView.h<RecyclerView.d0> rh(List<? extends ru.dodopizza.app.presentation.product.card.combo.h> list) {
        k6 k6Var = new k6(new l6(list));
        new k6.a(new k6.a(k6Var, i.a, new ru.dodopizza.app.presentation.product.card.combo.f(), j.a).b(), k.a, new ru.dodopizza.app.presentation.product.card.combo.g(), l.a).b();
        return k6Var.d();
    }

    private final ProductCardBottomView sh() {
        return (ProductCardBottomView) this.e.a(this, q[2]);
    }

    private final RecyclerView th() {
        return (RecyclerView) this.j.a(this, q[7]);
    }

    private final NestedScrollView uh() {
        return (NestedScrollView) this.i.a(this, q[6]);
    }

    private final RecyclerView vh() {
        return (RecyclerView) this.k.a(this, q[8]);
    }

    private final TextView wh() {
        return (TextView) this.l.a(this, q[9]);
    }

    private final TextView xh() {
        return (TextView) this.g.a(this, q[4]);
    }

    private final ExpandableFoodValueInfoIconView yh() {
        return (ExpandableFoodValueInfoIconView) this.f.a(this, q[3]);
    }

    private final void z(String str) {
        zh().setLayoutParams(new LinearLayout.LayoutParams(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().widthPixels));
        com.bumptech.glide.b.t(requireContext()).t(str).a0(R.drawable.ic_product_placeholder).i(R.drawable.ic_product_placeholder).g(d33.a).o0(new wu3(zh().getLayoutParams().width)).G0(zh());
    }

    private final ImageView zh() {
        return (ImageView) this.h.a(this, q[5]);
    }

    @Override // defpackage.b2
    /* renamed from: Ah */
    public ComboProductCardPresenter nh() {
        MvpPresenter value = this.o.getValue(this, q[10]);
        z65.g(value, "getValue(...)");
        return (ComboProductCardPresenter) value;
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.e
    public void B2(List<? extends ru.dodopizza.app.presentation.product.card.combo.h> list) {
        z65.h(list, "summary");
        if (list.isEmpty()) {
            un3.e(vh());
            return;
        }
        un3.k(vh());
        vh().setAdapter(rh(list));
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.e
    public void Be(hn6 hn6Var, hn6 hn6Var2, ComboProductCardPresenter.a aVar) {
        z65.h(hn6Var, "rawPrice");
        z65.h(hn6Var2, "price");
        z65.h(aVar, "textOnButton");
        sh().e(un6.b(hn6Var), un6.b(hn6Var2), Eh(aVar));
    }

    public final as8<ComboProductCardPresenter> Bh() {
        as8<ComboProductCardPresenter> as8Var = this.n;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    public TextView Ch() {
        return (TextView) this.d.a(this, q[1]);
    }

    @Override // defpackage.ii1
    public void Mc() {
        nh().I();
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.e
    public void N8(List<String> list) {
        String i0;
        z65.h(list, "toppingsNames");
        i0 = sc1.i0(list, ", ", null, null, 0, null, null, 62, null);
        String string = getString(R.string.combo_template_removed_toppings_message, i0);
        z65.g(string, "getString(...)");
        y64.c(this, string, 0, 2, null);
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.e
    public void R2() {
        Boolean bool;
        if (th().getChildCount() == 0) {
            return;
        }
        View a = dzb.a(th(), 0);
        Object tag = a.getTag(R.id.combo_onboarding_view_id);
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        } else {
            bool = null;
        }
        if (((Boolean) mh5.c(bool, Boolean.FALSE)).booleanValue()) {
            uh().J(0, a.getBottom());
            wg0 wg0Var = this.m;
            if (wg0Var != null) {
                wg0Var.m();
            }
            androidx.fragment.app.d requireActivity = requireActivity();
            z65.g(requireActivity, "requireActivity(...)");
            xg0 xg0Var = new xg0(requireActivity);
            String string = getString(R.string.combo_tooltip_message);
            z65.g(string, "getString(...)");
            this.m = xg0Var.b(string).I(a).A(wg0.c.b).a(wg0.a.b).B(true).G(new p(a)).E(q.a).C(r.a).D(s.a).F(new t()).H();
        }
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.e
    public void f9(jh1 jh1Var) {
        z65.h(jh1Var, "comboInfoVO");
        Gh(jh1Var);
        sh().a(new u(jh1Var));
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.e
    public void fb(jh1 jh1Var) {
        z65.h(jh1Var, "comboInfoVO");
        th().setAdapter(qh(jh1Var));
        String h2 = jh1Var.h();
        if (h2.length() > 0) {
            wh().setText(getString(R.string.weight_only, h2));
        } else {
            wh().setVisibility(8);
        }
        if (isResumed()) {
            nh().M();
        }
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.e
    public void gg(hn6 hn6Var) {
        z65.h(hn6Var, "price");
        ProductCardBottomView sh = sh();
        String string = getString(R.string.add_to_cart_button_title, un6.b(hn6Var));
        z65.g(string, "getString(...)");
        sh.c(string);
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.e
    public void k5(ComboProductCardPresenter.a aVar) {
        z65.h(aVar, "textOnButton");
        sh().c(Eh(aVar));
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.e
    public void l2(jh1 jh1Var) {
        z65.h(jh1Var, "comboInfoVO");
        Ch().setText(jh1Var.e());
        xh().setText(jh1Var.c());
        z(jh1Var.d());
        Gh(jh1Var);
        sh().a(new o(jh1Var));
        if (jh1Var.j()) {
            sh().f();
        }
    }

    @Override // defpackage.b2
    public ShoppingItemNavigationBar mh() {
        return (ShoppingItemNavigationBar) this.c.a(this, q[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Dh();
        super.onAttach(context);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        wg0 wg0Var = this.m;
        if (wg0Var != null) {
            nh().onBackPressed();
            wg0Var.m();
            return true;
        }
        return false;
    }

    @Override // defpackage.f70, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onResume() {
        Object obj;
        Object obj2;
        super.onResume();
        ComboProductCardPresenter nh = nh();
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
                nh.N(intValue, bool.booleanValue());
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
        th().setLayoutManager(new LinearLayoutManager(requireContext()));
        vh().setLayoutManager(new LinearLayoutManager(requireContext()));
        th().addItemDecoration(new eyb(8, 0, 0, 6, null));
        vh().addItemDecoration(new eyb(8, 0, 0, 6, null));
        mh().setOnBackButtonClick(new m());
    }
}
