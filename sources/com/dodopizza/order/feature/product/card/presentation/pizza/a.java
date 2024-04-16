package com.dodopizza.order.feature.product.card.presentation.pizza;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.airbnb.lottie.LottieAnimationView;
import com.dodopizza.order.feature.personalprice.PersonalPriceBadgeView;
import com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter;
import com.dodopizza.order.feature.product.card.presentation.pizza.a;
import com.dodopizza.order.feature.product.card.presentation.pizza.topping.ComboToppingViewHolder;
import com.dodopizza.order.feature.product.card.presentation.pizza.view.PizzaVariationControlViewLite;
import com.dodopizza.order.feature.product.card.presentation.shoppingitem.ProductCardBottomView;
import com.dodopizza.order.feature.product.card.presentation.shoppingitem.ShoppingItemNavigationBar;
import com.dodopizza.order.feature.product.card.presentation.view.ExpandableFoodValueInfoIconView;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k6;
import defpackage.n78;
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
/* compiled from: PizzaProductCardFragment.kt */
@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 »\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002¼\u0001B\t¢\u0006\u0006\b¹\u0001\u0010º\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0012\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0016\u0010%\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\tH\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J2\u0010+\u001a\u00020\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0016\u0010,\u001a\u00020\u00042\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\nH\u0016J\u0010\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020/H\u0016J2\u00104\u001a\u00020\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u00105\u001a\u00020\u0004H\u0016J\b\u00106\u001a\u00020\u0004H\u0016J\u0018\u00109\u001a\u00020\u00042\u0006\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\nH\u0016J\u001c\u0010<\u001a\u00020\u00042\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060:H\u0016J\u001c\u0010=\u001a\u00020\u00042\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060:H\u0016J$\u0010B\u001a\u00020\u00042\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060>H\u0016J\u0016\u0010C\u001a\u00020\u00042\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060>H\u0016J\u001e\u0010G\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00062\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\tH\u0016J\b\u0010H\u001a\u00020\u0004H\u0016J\u0010\u0010K\u001a\u00020\u00042\u0006\u0010J\u001a\u00020IH\u0016J \u0010M\u001a\u00020\u00042\u0006\u0010L\u001a\u00020I2\u0006\u0010J\u001a\u00020I2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010N\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010O\u001a\u00020\u0004H\u0016J\b\u0010P\u001a\u00020\u0004H\u0016J\b\u0010Q\u001a\u00020\u0004H\u0016J\u0010\u0010S\u001a\u00020\u00042\u0006\u0010R\u001a\u00020/H\u0016J\u0010\u0010V\u001a\u00020\u00042\u0006\u0010U\u001a\u00020TH\u0016J\b\u0010W\u001a\u00020\u0004H\u0016J\u0016\u0010X\u001a\u00020\u00042\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010Y\u001a\u00020\u0004H\u0016J\b\u0010Z\u001a\u00020\u0004H\u0016R\u001b\u0010`\u001a\u00020[8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001b\u0010e\u001a\u00020a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bb\u0010]\u001a\u0004\bc\u0010dR\u001b\u0010j\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010]\u001a\u0004\bh\u0010iR\u001b\u0010m\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010]\u001a\u0004\bl\u0010dR\u001b\u0010r\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010]\u001a\u0004\bp\u0010qR\u001b\u0010u\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010]\u001a\u0004\bt\u0010dR\u001b\u0010x\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010]\u001a\u0004\bw\u0010dR\u001b\u0010}\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010]\u001a\u0004\b{\u0010|R\u001c\u0010\u0080\u0001\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b~\u0010]\u001a\u0004\b\u007f\u0010dR \u0010\u0085\u0001\u001a\u00030\u0081\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0082\u0001\u0010]\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R \u0010\u008a\u0001\u001a\u00030\u0086\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0087\u0001\u0010]\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R \u0010\u008f\u0001\u001a\u00030\u008b\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008c\u0001\u0010]\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R*\u0010\u0097\u0001\u001a\u00030\u0090\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R0\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u00030\u0099\u00010\u0098\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bP\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R!\u0010¤\u0001\u001a\u00030\u0099\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R*\u0010¬\u0001\u001a\u00030¥\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R*\u0010´\u0001\u001a\u00030\u00ad\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R\u001f\u0010¸\u0001\u001a\u00030µ\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b'\u0010]\u001a\u0006\b¶\u0001\u0010·\u0001¨\u0006½\u0001"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/pizza/a;", "Lb2;", "Lcom/dodopizza/order/feature/product/card/presentation/pizza/e;", "Lw78;", "", "Eh", "", "imageUrl", "z", "", "", "discountForDough", "Hh", "Lcom/dodopizza/order/feature/product/card/presentation/pizza/PizzaProductCardPresenter$a;", "textOnButton", "Fh", "Lx78;", "pizzaProductCardVO", "Jh", "Ih", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "onResume", "pa", "Lb78;", "pizzaConcept", "T0", "Vd", "Lkjb;", "toppingsVO", "C0", "O", "t", "availableSize", "discountForSize", "stopSize", "Q", "Gh", "sizeId", "R1", "", "loyaltyEnable", "I5", "availableDough", "stopDough", "t7", "va", "na", "sizeGroup", "dough", "ch", "", "names", "H0", "Ed", "", "Lul8;", "productIngredients", "removedIngredientsIds", "J5", "Qf", "menuItemId", "Lvl8;", "ingredients", "T", "m0", "Lhn6;", "price", "i0", "rawPrice", "n3", "X4", "G0", "p", "N", "isEnabled", "I", "", "timeRemain", "x", "E", "Xa", "Lg", "Ub", "Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ShoppingItemNavigationBar;", com.huawei.hms.opendevice.c.a, "Lk79;", "mh", "()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ShoppingItemNavigationBar;", "navigationBar", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Ah", "()Landroid/widget/TextView;", "title", "Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", com.huawei.hms.push.e.a, "qh", "()Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", "infoIcon", "f", "ph", "compositionDescription", "Landroid/widget/ImageView;", "g", "rh", "()Landroid/widget/ImageView;", "itemImage", Image.TYPE_HIGH, "uh", "pizzaSizeTitle", "i", "yh", "removeIngredientsButton", "Lcom/dodopizza/order/feature/product/card/presentation/pizza/view/PizzaVariationControlViewLite;", "j", "vh", "()Lcom/dodopizza/order/feature/product/card/presentation/pizza/view/PizzaVariationControlViewLite;", "pizzaVariationControl", "k", "Ch", "toppingsTitle", "Landroidx/recyclerview/widget/RecyclerView;", "l", "Bh", "()Landroidx/recyclerview/widget/RecyclerView;", "toppingsRecycler", "Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ProductCardBottomView;", Image.TYPE_MEDIUM, "oh", "()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ProductCardBottomView;", "bottomView", "Lcom/dodopizza/order/feature/personalprice/PersonalPriceBadgeView;", "n", "th", "()Lcom/dodopizza/order/feature/personalprice/PersonalPriceBadgeView;", "personalPriceBadge", "Lu18;", "o", "Lu18;", "zh", "()Lu18;", "setTimerFormatter", "(Lu18;)V", "timerFormatter", "Las8;", "Lcom/dodopizza/order/feature/product/card/presentation/pizza/PizzaProductCardPresenter;", "Las8;", "xh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "q", "Lmoxy/ktx/MoxyKtxDelegate;", "wh", "()Lcom/dodopizza/order/feature/product/card/presentation/pizza/PizzaProductCardPresenter;", "presenter", "Lvu4;", "r", "Lvu4;", "sh", "()Lvu4;", "setModifierFactory", "(Lvu4;)V", "modifierFactory", "Lhq3;", Image.TYPE_SMALL, "Lhq3;", "getFeatureService", "()Lhq3;", "setFeatureService", "(Lhq3;)V", "featureService", "Lcom/airbnb/lottie/LottieAnimationView;", "Dh", "()Lcom/airbnb/lottie/LottieAnimationView;", "viewInAr", "<init>", "()V", "u", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class a extends b2 implements com.dodopizza.order.feature.product.card.presentation.pizza.e, w78 {
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
    public u18 o;
    public as8<PizzaProductCardPresenter> p;
    private final MoxyKtxDelegate q;
    public vu4 r;
    public hq3 s;
    private final k79 t;
    static final /* synthetic */ je5<Object>[] v = {bc9.f(new ar8(a.class, "navigationBar", "getNavigationBar()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ShoppingItemNavigationBar;", 0)), bc9.f(new ar8(a.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "infoIcon", "getInfoIcon()Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", 0)), bc9.f(new ar8(a.class, "compositionDescription", "getCompositionDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "itemImage", "getItemImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(a.class, "pizzaSizeTitle", "getPizzaSizeTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "removeIngredientsButton", "getRemoveIngredientsButton()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "pizzaVariationControl", "getPizzaVariationControl()Lcom/dodopizza/order/feature/product/card/presentation/pizza/view/PizzaVariationControlViewLite;", 0)), bc9.f(new ar8(a.class, "toppingsTitle", "getToppingsTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "toppingsRecycler", "getToppingsRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(a.class, "bottomView", "getBottomView()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ProductCardBottomView;", 0)), bc9.f(new ar8(a.class, "personalPriceBadge", "getPersonalPriceBadge()Lcom/dodopizza/order/feature/personalprice/PersonalPriceBadgeView;", 0)), bc9.f(new ar8(a.class, "presenter", "getPresenter()Lcom/dodopizza/order/feature/product/card/presentation/pizza/PizzaProductCardPresenter;", 0)), bc9.f(new ar8(a.class, "viewInAr", "getViewInAr()Lcom/airbnb/lottie/LottieAnimationView;", 0))};
    public static final C0195a u = new C0195a(null);
    public static final int w = 8;

    /* compiled from: PizzaProductCardFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/pizza/a$a;", "", "Lo78;", "arguments", "Lcom/dodopizza/order/feature/product/card/presentation/pizza/a;", "a", "", "ARG_CART_ITEM_ID", "Ljava/lang/String;", "ARG_DEFAULT_SHOPPING_ITEM_ID", "ARG_IS_HERO", "ARG_MENU_ITEM_ID", "ARG_POSITION_IN_MENU", "ARG_SCREEN", "", "TOPPINGS_COLUMNS", "I", "TOPPINGS_SPACING", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.order.feature.product.card.presentation.pizza.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0195a {
        private C0195a() {
        }

        public /* synthetic */ C0195a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(o78 o78Var) {
            z65.h(o78Var, "arguments");
            return (a) y64.d(new a(), bi0.c(bi0.d("arg_menu_item", o78Var.c()), bi0.d("arg_cart_item_id", o78Var.a()), bi0.d("arg_selected_shopping_item_id", o78Var.b()), bi0.d("arg_position_in_menu", Integer.valueOf(o78Var.d())), bi0.d("arg_screen", o78Var.e()), bi0.d("arg_is_hero", Boolean.valueOf(o78Var.f()))));
        }
    }

    /* compiled from: PizzaProductCardFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PizzaProductCardPresenter.a.values().length];
            try {
                iArr[PizzaProductCardPresenter.a.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PizzaProductCardPresenter.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PizzaProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            a.this.nh().a0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: PizzaProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            a.this.nh().X();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: PizzaProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        e() {
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

    /* compiled from: PizzaProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function1<View, Unit> {
        f() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            a.this.nh().Y();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: PizzaProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/pizza/PizzaProductCardPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/order/feature/product/card/presentation/pizza/PizzaProductCardPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class g extends ej5 implements Function0<PizzaProductCardPresenter> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final PizzaProductCardPresenter invoke() {
            return a.this.xh().get();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class h extends ej5 implements Function1<Object, Boolean> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof kjb);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class i extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final i a = new i();

        public i() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = ComboToppingViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: PizzaProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkjb;", "toppingVO", "", "isAdded", "", "a", "(Lkjb;Z)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class j extends ej5 implements Function2<kjb, Boolean, Unit> {
        j() {
            super(2);
        }

        public final void a(kjb kjbVar, boolean z) {
            z65.h(kjbVar, "toppingVO");
            a.this.nh().i0(kjbVar, z);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(kjb kjbVar, Boolean bool) {
            a(kjbVar, bool.booleanValue());
            return Unit.a;
        }
    }

    /* compiled from: PizzaProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class k extends ej5 implements Function0<Unit> {
        final /* synthetic */ x78 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(x78 x78Var) {
            super(0);
            this.b = x78Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PizzaProductCardPresenter nh = a.this.nh();
            x78 x78Var = this.b;
            Bundle arguments = a.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("arg_is_hero")) == null) ? null : null;
            if (obj != null && !(obj instanceof Boolean)) {
                throw new ClassCastException("Property arg_is_hero has different class type");
            } else if (obj != null) {
                nh.V(x78Var, ((Boolean) obj).booleanValue());
            } else {
                throw new IllegalArgumentException("Argument with key = arg_is_hero not found in bundle");
            }
        }
    }

    /* compiled from: PizzaProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "dough", "", "a", "(II)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class l extends ej5 implements Function2<Integer, Integer, Unit> {
        l() {
            super(2);
        }

        public final void a(int i, int i2) {
            a.this.nh().U(i, i2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            a(num.intValue(), num2.intValue());
            return Unit.a;
        }
    }

    /* compiled from: PizzaProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lul8;", "ingredient", "", "a", "(Lul8;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class m extends ej5 implements Function1<ul8, CharSequence> {
        final /* synthetic */ Collection<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Collection<String> collection) {
            super(1);
            this.a = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(ul8 ul8Var) {
            z65.h(ul8Var, "ingredient");
            SpannableString spannableString = new SpannableString(qhb.a(ul8Var.getName()));
            if (this.a.contains(ul8Var.c())) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 0);
            }
            return spannableString;
        }
    }

    /* compiled from: PizzaProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class n extends ej5 implements Function0<Unit> {
        final /* synthetic */ x78 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(x78 x78Var) {
            super(0);
            this.b = x78Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PizzaProductCardPresenter nh = a.this.nh();
            x78 x78Var = this.b;
            Bundle arguments = a.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("arg_is_hero")) == null) ? null : null;
            if (obj != null && !(obj instanceof Boolean)) {
                throw new ClassCastException("Property arg_is_hero has different class type");
            } else if (obj != null) {
                nh.V(x78Var, ((Boolean) obj).booleanValue());
            } else {
                throw new IllegalArgumentException("Argument with key = arg_is_hero not found in bundle");
            }
        }
    }

    /* compiled from: PizzaProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/lottie/LottieAnimationView;", "", "b", "(Lcom/airbnb/lottie/LottieAnimationView;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class o extends ej5 implements Function1<LottieAnimationView, Unit> {
        public static final o a = new o();

        o() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ColorFilter c(int i, qz5 qz5Var) {
            return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }

        public final void b(LottieAnimationView lottieAnimationView) {
            z65.h(lottieAnimationView, "$this$bindView");
            final int c = iu1.c(lottieAnimationView.getContext(), ew8.A);
            lottieAnimationView.k(new of5("**"), xz5.K, new jla() { // from class: com.dodopizza.order.feature.product.card.presentation.pizza.b
                @Override // defpackage.jla
                public final Object a(qz5 qz5Var) {
                    ColorFilter c2;
                    c2 = a.o.c(c, qz5Var);
                    return c2;
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LottieAnimationView lottieAnimationView) {
            b(lottieAnimationView);
            return Unit.a;
        }
    }

    public a() {
        super(gz8.fragment_pizza_product_card);
        this.c = kb0.e(this, gy8.pizza_card_item_navigation_bar);
        this.d = kb0.e(this, gy8.product_title);
        this.e = kb0.e(this, gy8.pizza_card_info_icon);
        this.f = kb0.e(this, gy8.pizza_card_description);
        this.g = kb0.e(this, gy8.pizza_card_image);
        this.h = kb0.e(this, gy8.pizza_card_size_title);
        this.i = kb0.e(this, gy8.pizza_card_remove_ingredients_button);
        this.j = kb0.e(this, gy8.pizza_card_variation_control_view);
        this.k = kb0.e(this, gy8.pizza_card_toppings_title);
        this.l = kb0.e(this, gy8.pizza_card_toppings_recycler);
        this.m = kb0.e(this, gy8.pizza_card_bottom_shopping_bar);
        this.n = kb0.e(this, gy8.pizza_discount_badge);
        g gVar = new g();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.q = new MoxyKtxDelegate(mvpDelegate, PizzaProductCardPresenter.class.getName() + ".presenter", gVar);
        this.t = kb0.f(this, gy8.view_in_ar_button, o.a);
    }

    private final RecyclerView Bh() {
        return (RecyclerView) this.l.a(this, v[9]);
    }

    private final TextView Ch() {
        return (TextView) this.k.a(this, v[8]);
    }

    private final LottieAnimationView Dh() {
        return (LottieAnimationView) this.t.a(this, v[13]);
    }

    private final void Eh() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        n78.b a = n78.a.a();
        PizzaProductCardFeatureDependencies pizzaProductCardFeatureDependencies = (PizzaProductCardFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(PizzaProductCardFeatureDependencies.class));
        Bundle arguments = getArguments();
        ym.d dVar = null;
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
                        a.a(pizzaProductCardFeatureDependencies, str, str2, str3, dVar).a(this);
                    } else {
                        throw new IllegalArgumentException("Argument with key = arg_screen not found in bundle");
                    }
                } else {
                    throw new IllegalArgumentException("Argument with key = arg_selected_shopping_item_id not found in bundle");
                }
            } else {
                throw new IllegalArgumentException("Argument with key = arg_cart_item_id not found in bundle");
            }
        } else {
            throw new IllegalArgumentException("Argument with key = arg_menu_item not found in bundle");
        }
    }

    private final String Fh(PizzaProductCardPresenter.a aVar) {
        int i2 = b.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                String string = getString(r09.add_to_cart_button);
                z65.g(string, "getString(...)");
                return string;
            }
            throw new NoWhenBranchMatchedException();
        }
        String string2 = getString(r09.edit_in_cart_button_title);
        z65.g(string2, "getString(...)");
        return string2;
    }

    private final void Hh(List<Integer> list) {
        int[] E0;
        PizzaVariationControlViewLite vh = vh();
        E0 = sc1.E0(list);
        vh.p(E0);
    }

    private final void Ih(x78 x78Var) {
        List e2;
        ExpandableFoodValueInfoIconView qh = qh();
        e2 = jc1.e(new ExpandableFoodValueInfoIconView.c(x78Var.h(), x78Var.c(), x78Var.a(), x78Var.b()));
        ExpandableFoodValueInfoIconView.u(qh, e2, false, 2, null);
    }

    private final void Jh(x78 x78Var) {
        String string = getString(r09.card_pizza_size_dough_and_weight_label, x78Var.m(), x78Var.c().e());
        z65.g(string, "getString(...)");
        uh().setText(string);
    }

    private final ProductCardBottomView oh() {
        return (ProductCardBottomView) this.m.a(this, v[10]);
    }

    private final TextView ph() {
        return (TextView) this.f.a(this, v[3]);
    }

    private final ExpandableFoodValueInfoIconView qh() {
        return (ExpandableFoodValueInfoIconView) this.e.a(this, v[2]);
    }

    private final ImageView rh() {
        return (ImageView) this.g.a(this, v[4]);
    }

    private final PersonalPriceBadgeView th() {
        return (PersonalPriceBadgeView) this.n.a(this, v[11]);
    }

    private final TextView uh() {
        return (TextView) this.h.a(this, v[5]);
    }

    private final PizzaVariationControlViewLite vh() {
        return (PizzaVariationControlViewLite) this.j.a(this, v[7]);
    }

    private final TextView yh() {
        return (TextView) this.i.a(this, v[6]);
    }

    private final void z(String str) {
        com.bumptech.glide.b.t(requireContext()).t(str).a0(bx8.L).o0(new xt0()).G0(rh());
    }

    public TextView Ah() {
        return (TextView) this.d.a(this, v[1]);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void C0(List<kjb> list) {
        z65.h(list, "toppingsVO");
        Bh().setAdapter(new k6.a(new k6(list), h.a, new fjb(new j()), i.a).b().d());
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void E() {
        PersonalPriceBadgeView th = th();
        String string = getString(r09.personal_price_badge_discount_expired);
        z65.g(string, "getString(...)");
        th.setDiscountText(string);
        th().a();
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void Ed(Map<Integer, String> map) {
        z65.h(map, "names");
        PizzaVariationControlViewLite vh = vh();
        String str = map.get(1);
        String str2 = "";
        if (str == null) {
            str = "";
        }
        vh.setTraditionalDoughText(str);
        PizzaVariationControlViewLite vh2 = vh();
        String str3 = map.get(2);
        if (str3 != null) {
            str2 = str3;
        }
        vh2.setThinDoughText(str2);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void G0() {
        vh().g();
    }

    public void Gh(List<Integer> list) {
        int[] E0;
        z65.h(list, "discountForSize");
        PizzaVariationControlViewLite vh = vh();
        E0 = sc1.E0(list);
        vh.o(E0);
        vh().b(list, true);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void H0(Map<Integer, String> map) {
        z65.h(map, "names");
        PizzaVariationControlViewLite vh = vh();
        String str = map.get(1);
        String str2 = "";
        if (str == null) {
            str = "";
        }
        vh.setSmallSizeText(str);
        PizzaVariationControlViewLite vh2 = vh();
        String str3 = map.get(2);
        if (str3 == null) {
            str3 = "";
        }
        vh2.setMediumSizeText(str3);
        PizzaVariationControlViewLite vh3 = vh();
        String str4 = map.get(3);
        if (str4 != null) {
            str2 = str4;
        }
        vh3.setLargeSizeText(str2);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void I(boolean z) {
        th().setEnabled(z);
    }

    @Override // defpackage.jl8
    public void I5(boolean z) {
        if (z) {
            oh().g();
        } else {
            oh().h();
        }
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void J5(Collection<ul8> collection, Collection<String> collection2) {
        Appendable g0;
        z65.h(collection, "productIngredients");
        z65.h(collection2, "removedIngredientsIds");
        g0 = sc1.g0(collection, new SpannableStringBuilder(), null, null, null, 0, null, new m(collection2), 62, null);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) g0;
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.replace(0, 1, (CharSequence) String.valueOf(Character.toUpperCase(spannableStringBuilder.charAt(0))));
        }
        ph().setText(spannableStringBuilder);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void Lg() {
        un3.k(Dh());
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void N() {
        un3.e(th());
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void O() {
        un3.o(Ch(), true);
        un3.o(Bh(), true);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void Q(List<Integer> list, List<Integer> list2, List<Integer> list3) {
        int[] E0;
        int[] E02;
        z65.h(list, "availableSize");
        z65.h(list2, "discountForSize");
        z65.h(list3, "stopSize");
        vh().setSizeControlVisible(true);
        PizzaVariationControlViewLite vh = vh();
        E0 = sc1.E0(list);
        vh.r(E0);
        PizzaVariationControlViewLite vh2 = vh();
        E02 = sc1.E0(list3);
        vh2.d(E02);
        Gh(list2);
    }

    @Override // defpackage.w78
    public void Qf(Collection<String> collection) {
        z65.h(collection, "removedIngredientsIds");
        nh().Z(collection);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void R1(int i2) {
        List<Integer> e2;
        PizzaVariationControlViewLite vh = vh();
        e2 = jc1.e(Integer.valueOf(i2));
        vh.b(e2, false);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void T(String str, List<vl8> list) {
        z65.h(str, "menuItemId");
        z65.h(list, "ingredients");
        ud9 a = ud9.h.a(str, list);
        a.setTargetFragment(this, Integer.MIN_VALUE);
        a.show(getParentFragmentManager(), "RemoveIngredientsDialog");
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void T0(b78 b78Var) {
        z65.h(b78Var, "pizzaConcept");
        sh().a(b78Var).a(rh());
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void Vd(x78 x78Var) {
        z65.h(x78Var, "pizzaProductCardVO");
        Jh(x78Var);
        Ih(x78Var);
        oh().a(new n(x78Var));
        z(x78Var.e());
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void X4(hn6 hn6Var, PizzaProductCardPresenter.a aVar) {
        z65.h(hn6Var, "price");
        z65.h(aVar, "textOnButton");
        ProductCardBottomView oh = oh();
        String b2 = un6.b(hn6Var);
        String string = getString(r09.edit_in_cart_button_title);
        z65.g(string, "getString(...)");
        oh.d(b2, string);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void Xa(List<Integer> list) {
        z65.h(list, "discountForSize");
        vh().b(list, true);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void ch(int i2, int i3) {
        vh().n(i2, i3);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void i0(hn6 hn6Var) {
        z65.h(hn6Var, "price");
        String string = requireContext().getString(r09.add_to_cart_button_title, un6.b(hn6Var));
        z65.g(string, "getString(...)");
        oh().c(string);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void m0() {
        un3.o(yh(), false);
        un3.o(vh(), false);
        oh().f();
    }

    @Override // defpackage.b2
    public ShoppingItemNavigationBar mh() {
        return (ShoppingItemNavigationBar) this.c.a(this, v[0]);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void n3(hn6 hn6Var, hn6 hn6Var2, PizzaProductCardPresenter.a aVar) {
        z65.h(hn6Var, "rawPrice");
        z65.h(hn6Var2, "price");
        z65.h(aVar, "textOnButton");
        oh().e(un6.b(hn6Var), un6.b(hn6Var2), Fh(aVar));
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void na() {
        vh().setDoughControlVisible(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Eh();
        super.onAttach(context);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // defpackage.f70, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onResume() {
        Object obj;
        Object obj2;
        super.onResume();
        PizzaProductCardPresenter nh = nh();
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
                nh.k0(intValue, bool.booleanValue());
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
        oma.a(yh(), new c());
        oma.a(th(), new d());
        Bh().setLayoutManager(new GridLayoutManager(getContext(), 3));
        Bh().addItemDecoration(new li4(8));
        Bh().getViewTreeObserver().addOnGlobalLayoutListener(new hjb(Bh()));
        oma.a(Dh(), new e());
        oma.a(rh(), new f());
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void p() {
        PersonalPriceBadgeView th = th();
        String string = getString(r09.discount);
        z65.g(string, "getString(...)");
        th.setDiscountText(string);
        un3.k(th());
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void pa(x78 x78Var) {
        z65.h(x78Var, "pizzaProductCardVO");
        Ah().setText(x78Var.h());
        Jh(x78Var);
        Ih(x78Var);
        TextView yh = yh();
        Collection<ul8> g2 = x78Var.g();
        boolean z = false;
        if (!(g2 instanceof Collection) || !g2.isEmpty()) {
            Iterator<T> it = g2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((ul8) it.next()).d()) {
                    z = true;
                    break;
                }
            }
        }
        un3.o(yh, z);
        oh().a(new k(x78Var));
        vh().setOnVariationChangeListener(new l());
        z(x78Var.e());
    }

    public final vu4 sh() {
        vu4 vu4Var = this.r;
        if (vu4Var != null) {
            return vu4Var;
        }
        z65.z("modifierFactory");
        return null;
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void t() {
        un3.o(Ch(), false);
        un3.o(Bh(), false);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void t7(List<Integer> list, List<Integer> list2, List<Integer> list3) {
        int[] E0;
        int[] E02;
        z65.h(list, "availableDough");
        z65.h(list2, "discountForDough");
        z65.h(list3, "stopDough");
        vh().m();
        PizzaVariationControlViewLite vh = vh();
        E0 = sc1.E0(list);
        vh.q(E0);
        PizzaVariationControlViewLite vh2 = vh();
        E02 = sc1.E0(list3);
        vh2.c(E02);
        Hh(list2);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void va() {
        vh().setDoughControlVisible(true);
    }

    @Override // defpackage.b2
    /* renamed from: wh */
    public PizzaProductCardPresenter nh() {
        MvpPresenter value = this.q.getValue(this, v[12]);
        z65.g(value, "getValue(...)");
        return (PizzaProductCardPresenter) value;
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void x(long j2) {
        PersonalPriceBadgeView th = th();
        u18 zh = zh();
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        th.setTimeRemain(zh.a(requireContext, j2));
    }

    public final as8<PizzaProductCardPresenter> xh() {
        as8<PizzaProductCardPresenter> as8Var = this.p;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    public final u18 zh() {
        u18 u18Var = this.o;
        if (u18Var != null) {
            return u18Var;
        }
        z65.z("timerFormatter");
        return null;
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void Ub() {
    }
}
