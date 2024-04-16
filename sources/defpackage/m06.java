package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.loyalty.history.adapter.LoyaltyHistoryOperationViewHolder;
import com.dodopizza.loyalty.history.adapter.footer.TextFooterViewHolder;
import com.dodopizza.loyalty.history.adapter.pagination.LoyaltyLoadingItemCreator;
import com.dodopizza.loyalty.menu.LoyaltyPresenter;
import com.dodopizza.loyalty.menu.adapter.LoyaltyCategoryViewHolder;
import com.dodopizza.loyalty.menu.di.LoyaltyDependencies;
import com.dodopizza.loyalty.menu.view.ZoomCenterCardLayoutManager;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.c5c;
import defpackage.d06;
import defpackage.k6;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: LoyaltyFragment.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u007f2\u00020\u00012\u00020\u0002:\u0002\u0080\u0001B\u0007¢\u0006\u0004\b}\u0010~J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0016J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J\u0016\u0010\u001d\u001a\u00020\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u000bH\u0016J\b\u0010\u001f\u001a\u00020\u000bH\u0016J\b\u0010 \u001a\u00020\u000bH\u0016J\b\u0010!\u001a\u00020\u000bH\u0016J\b\u0010\"\u001a\u00020\u000bH\u0016J\u0016\u0010%\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001aH\u0016J\b\u0010&\u001a\u00020\u000bH\u0016J\b\u0010'\u001a\u00020\u000bH\u0016J\b\u0010(\u001a\u00020\u000bH\u0016J\b\u0010)\u001a\u00020\u000bH\u0016J\b\u0010*\u001a\u00020\u000bH\u0016J\u0010\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+H\u0016J\b\u0010.\u001a\u00020\u000bH\u0016J\u0018\u00100\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+2\u0006\u0010/\u001a\u00020+H\u0016J\u0018\u00103\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000fH\u0016R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010=R\u001b\u0010A\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b@\u0010=R\u001b\u0010D\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00106\u001a\u0004\bC\u0010=R\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u00106\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u00106\u001a\u0004\bQ\u0010RR\u001b\u0010W\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u00106\u001a\u0004\bU\u0010VR\u001b\u0010Z\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u00106\u001a\u0004\bY\u0010=R\u001b\u0010]\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u00106\u001a\u0004\b\\\u0010=R\u001b\u0010`\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u00106\u001a\u0004\b_\u0010=R\u001b\u0010c\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u00106\u001a\u0004\bb\u0010=R\u001b\u0010h\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u00106\u001a\u0004\bf\u0010gR\u001b\u0010k\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u00106\u001a\u0004\bj\u0010RR\u001b\u0010n\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u00106\u001a\u0004\bm\u0010MR\u0018\u0010r\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020\u001b0s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u001b\u0010|\u001a\u00020w8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{¨\u0006\u0081\u0001"}, d2 = {"Lm06;", "Lf70;", "La36;", "", "endDateMillis", "", "sh", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "rootView", "ih", "", "hh", "", "balance", "h2", "Dg", "p2", "n5", "lb", "addedProductsCount", "B3", "", "Lb26;", "categoriesVO", "qd", "M3", "M7", "Nf", "Kd", "Q9", "", "operations", "R7", "b4", "Ea", "t5", "Sb", "z6", "Lxa1;", "coinsExpirations", "Sd", "cc", "coinsExpirationsMore", "Se", "expirationPeriodInDays", "extraExpirationPeriodInDays", "td", "Landroidx/appcompat/widget/Toolbar;", com.huawei.hms.opendevice.c.a, "Lk79;", "Ih", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "xh", "()Landroid/widget/TextView;", "coinBalance", com.huawei.hms.push.e.a, "th", "addedProductsCounter", "f", "uh", "balanceDescription", "Landroid/widget/ViewSwitcher;", "g", "wh", "()Landroid/widget/ViewSwitcher;", "categoryLoadingSwitcher", "Landroidx/recyclerview/widget/RecyclerView;", Image.TYPE_HIGH, "vh", "()Landroidx/recyclerview/widget/RecyclerView;", "categories", "Landroid/view/ViewGroup;", "i", "yh", "()Landroid/view/ViewGroup;", "coinsExpirationsContainer", "j", "zh", "()Landroid/view/View;", "coinsExpirationsFAQ", "k", "Bh", "firstCoinsExpirationTitle", "l", "Ah", "firstCoinsExpirationAmount", Image.TYPE_MEDIUM, "Hh", "secondCoinsExpirationTitle", "n", "Fh", "secondCoinsExpirationAmount", "Landroid/widget/ImageView;", "o", "Gh", "()Landroid/widget/ImageView;", "secondCoinsExpirationAmountIcon", "p", "Ch", "historyItem", "q", "Dh", "operationsList", "Lgp7;", "r", "Lgp7;", "paginator", "Ll6;", Image.TYPE_SMALL, "Ll6;", "categoriesAdapter", "Lcom/dodopizza/loyalty/menu/LoyaltyPresenter;", "t", "Lmoxy/ktx/MoxyKtxDelegate;", "Eh", "()Lcom/dodopizza/loyalty/menu/LoyaltyPresenter;", "presenter", "<init>", "()V", "u", "a", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: m06  reason: default package */
/* loaded from: classes2.dex */
public final class m06 extends f70 implements a36 {
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
    private final k79 o;
    private final k79 p;
    private final k79 q;
    private gp7 r;
    private final l6<b26> s;
    private final MoxyKtxDelegate t;
    static final /* synthetic */ je5<Object>[] v = {bc9.f(new ar8(m06.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(m06.class, "coinBalance", "getCoinBalance()Landroid/widget/TextView;", 0)), bc9.f(new ar8(m06.class, "addedProductsCounter", "getAddedProductsCounter()Landroid/widget/TextView;", 0)), bc9.f(new ar8(m06.class, "balanceDescription", "getBalanceDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(m06.class, "categoryLoadingSwitcher", "getCategoryLoadingSwitcher()Landroid/widget/ViewSwitcher;", 0)), bc9.f(new ar8(m06.class, "categories", "getCategories()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(m06.class, "coinsExpirationsContainer", "getCoinsExpirationsContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(m06.class, "coinsExpirationsFAQ", "getCoinsExpirationsFAQ()Landroid/view/View;", 0)), bc9.f(new ar8(m06.class, "firstCoinsExpirationTitle", "getFirstCoinsExpirationTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(m06.class, "firstCoinsExpirationAmount", "getFirstCoinsExpirationAmount()Landroid/widget/TextView;", 0)), bc9.f(new ar8(m06.class, "secondCoinsExpirationTitle", "getSecondCoinsExpirationTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(m06.class, "secondCoinsExpirationAmount", "getSecondCoinsExpirationAmount()Landroid/widget/TextView;", 0)), bc9.f(new ar8(m06.class, "secondCoinsExpirationAmountIcon", "getSecondCoinsExpirationAmountIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(m06.class, "historyItem", "getHistoryItem()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(m06.class, "operationsList", "getOperationsList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(m06.class, "presenter", "getPresenter()Lcom/dodopizza/loyalty/menu/LoyaltyPresenter;", 0))};
    public static final a u = new a(null);

    /* compiled from: LoyaltyFragment.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lm06$a;", "", "Le06;", "loyaltyData", "Lm06;", "a", "", "ANIMATION_DELAY", "J", "", "ANIMATION_FIX_SCROLL", "I", "LIST_INDEX", "LOADING_INDEX", "", "SENDER_ARG", "Ljava/lang/String;", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: m06$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m06 a(e06 e06Var) {
            z65.h(e06Var, "loyaltyData");
            return (m06) y64.d(new m06(), bi0.c(bi0.d("SENDER", e06Var)));
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", ElementGenerator.TEXT_ALIGN_LEFT, "top", ElementGenerator.TEXT_ALIGN_RIGHT, "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "", "onLayoutChange", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: m06$b */
    /* loaded from: classes2.dex */
    public static final class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            z65.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            int width = (m06.this.vh().getWidth() / 2) - jx9.a.a(90);
            m06.this.vh().setPadding(width, 0, width, 0);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m06$c */
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function1<Object, Boolean> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof b26);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m06$d */
    /* loaded from: classes2.dex */
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
            Object newInstance = LoyaltyCategoryViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: LoyaltyFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb26;", "categoryVO", "", "a", "(Lb26;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m06$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function1<b26, Unit> {
        e() {
            super(1);
        }

        public final void a(b26 b26Var) {
            z65.h(b26Var, "categoryVO");
            m06.this.Eh().I(b26Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b26 b26Var) {
            a(b26Var);
            return Unit.a;
        }
    }

    /* compiled from: LoyaltyFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/loyalty/menu/LoyaltyPresenter;", "a", "()Lcom/dodopizza/loyalty/menu/LoyaltyPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m06$f */
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function0<LoyaltyPresenter> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final LoyaltyPresenter invoke() {
            d06.b a = d06.a.a();
            LoyaltyDependencies loyaltyDependencies = (LoyaltyDependencies) m06.this.getComponentDependenciesRegistry().a(bc9.b(LoyaltyDependencies.class));
            Bundle arguments = m06.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("SENDER")) == null) ? null : null;
            if (obj != null && !(obj instanceof e06)) {
                throw new ClassCastException("Property SENDER has different class type");
            } else if (obj != null) {
                return a.a(loyaltyDependencies, (e06) obj).a();
            } else {
                throw new IllegalArgumentException("Argument with key = SENDER not found in bundle");
            }
        }
    }

    /* compiled from: LoyaltyFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m06$g */
    /* loaded from: classes2.dex */
    static final class g extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ m06 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i, int i2, m06 m06Var) {
            super(1);
            this.a = i;
            this.b = i2;
            this.c = m06Var;
        }

        public final void a(View view) {
            z65.h(view, "it");
            za1.e.a(new ya1(this.a, this.b)).show(this.c.getParentFragmentManager(), "");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: LoyaltyFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luoa;", "", "a", "(Luoa;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m06$h */
    /* loaded from: classes2.dex */
    static final class h extends ej5 implements Function1<uoa, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: m06$h$a */
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<View> {
            final /* synthetic */ m06 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m06 m06Var) {
                super(0);
                this.a = m06Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final View invoke() {
                View requireView = this.a.requireView();
                z65.g(requireView, "requireView(...)");
                return requireView;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: m06$h$b */
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function0<String> {
            final /* synthetic */ m06 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(m06 m06Var) {
                super(0);
                this.a = m06Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                String string = this.a.getString(p09.loyalty_history_loading_error_title);
                z65.g(string, "getString(...)");
                return string;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: m06$h$c */
        /* loaded from: classes2.dex */
        public static final class c extends ej5 implements Function0<Integer> {
            public static final c a = new c();

            c() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 5;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: m06$h$d */
        /* loaded from: classes2.dex */
        public static final class d extends ej5 implements Function0<Integer> {
            public static final d a = new d();

            d() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 2;
            }
        }

        h() {
            super(1);
        }

        public final void a(uoa uoaVar) {
            z65.h(uoaVar, "$this$invoke");
            uoaVar.e(new a(m06.this));
            uoaVar.h(new b(m06.this));
            uoaVar.d(c.a);
            uoaVar.f(d.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uoa uoaVar) {
            a(uoaVar);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m06$i */
    /* loaded from: classes2.dex */
    public static final class i extends ej5 implements Function1<Object, Boolean> {
        public static final i a = new i();

        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof r06);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m06$j */
    /* loaded from: classes2.dex */
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
            Object newInstance = LoyaltyHistoryOperationViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m06$k */
    /* loaded from: classes2.dex */
    public static final class k extends ej5 implements Function1<Object, Boolean> {
        public static final k a = new k();

        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof abb);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m06$l */
    /* loaded from: classes2.dex */
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
            Object newInstance = TextFooterViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: LoyaltyFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lb26;", "old", "new", "Landroidx/recyclerview/widget/e$e;", "a", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/e$e;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m06$m */
    /* loaded from: classes2.dex */
    static final class m extends ej5 implements Function2<List<? extends b26>, List<? extends b26>, e.C0047e> {
        public static final m a = new m();

        m() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final e.C0047e invoke(List<b26> list, List<b26> list2) {
            z65.h(list, "old");
            z65.h(list2, "new");
            e.C0047e b = androidx.recyclerview.widget.e.b(new vt0(list, list2));
            z65.g(b, "calculateDiff(...)");
            return b;
        }
    }

    /* compiled from: LoyaltyFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m06$n */
    /* loaded from: classes2.dex */
    static final class n implements RecyclerView.m.a {
        final /* synthetic */ RecyclerView a;

        /* compiled from: LoyaltyFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: m06$n$a */
        /* loaded from: classes2.dex */
        static final class a implements Runnable {
            final /* synthetic */ RecyclerView a;

            a(RecyclerView recyclerView) {
                this.a = recyclerView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.smoothScrollBy(100, 0);
                this.a.smoothScrollBy(-100, 0);
            }
        }

        n(RecyclerView recyclerView) {
            this.a = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.a
        public final void a() {
            RecyclerView recyclerView = this.a;
            recyclerView.postDelayed(new a(recyclerView), 10L);
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", ElementGenerator.TEXT_ALIGN_LEFT, "top", ElementGenerator.TEXT_ALIGN_RIGHT, "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "", "onLayoutChange", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: m06$o */
    /* loaded from: classes2.dex */
    public static final class o implements View.OnLayoutChangeListener {
        final /* synthetic */ RecyclerView a;

        public o(RecyclerView recyclerView) {
            this.a = recyclerView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            z65.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            RecyclerView.m itemAnimator = this.a.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.q(new n(this.a));
            }
        }
    }

    public m06() {
        super(ez8.fragment_loyalty);
        this.c = kb0.e(this, ey8.loyalty_toolbar);
        this.d = kb0.e(this, ey8.loyalty_coin_balance);
        this.e = kb0.e(this, ey8.loyalty_added_products_counter);
        this.f = kb0.e(this, ey8.loyalty_balance_description);
        this.g = kb0.e(this, ey8.loyalty_categories_switcher);
        this.h = kb0.e(this, ey8.loyalty_categories_list);
        this.i = kb0.e(this, ey8.loyalty_coins_expirations_container);
        this.j = kb0.e(this, ey8.loyalty_coins_expirations_faq_icon);
        this.k = kb0.e(this, ey8.loyalty_coins_expiration_first_operation_title);
        this.l = kb0.e(this, ey8.loyalty_coins_expiration_first_operation_amount);
        this.m = kb0.e(this, ey8.loyalty_coins_expiration_second_operation_title);
        this.n = kb0.e(this, ey8.loyalty_coins_expiration_second_operation_amount);
        this.o = kb0.e(this, ey8.loyalty_coins_expiration_second_operation_amount_icon);
        this.p = kb0.e(this, ey8.loyalty_history_item);
        this.q = kb0.e(this, ey8.loyalty_history_operations_list);
        this.s = new l6<>(null, 1, null);
        f fVar = new f();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.t = new MoxyKtxDelegate(mvpDelegate, LoyaltyPresenter.class.getName() + ".presenter", fVar);
    }

    private final TextView Ah() {
        return (TextView) this.l.a(this, v[9]);
    }

    private final TextView Bh() {
        return (TextView) this.k.a(this, v[8]);
    }

    private final ViewGroup Ch() {
        return (ViewGroup) this.p.a(this, v[13]);
    }

    private final RecyclerView Dh() {
        return (RecyclerView) this.q.a(this, v[14]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoyaltyPresenter Eh() {
        return (LoyaltyPresenter) this.t.getValue(this, v[15]);
    }

    private final TextView Fh() {
        return (TextView) this.n.a(this, v[11]);
    }

    private final ImageView Gh() {
        return (ImageView) this.o.a(this, v[12]);
    }

    private final TextView Hh() {
        return (TextView) this.m.a(this, v[10]);
    }

    private final Toolbar Ih() {
        return (Toolbar) this.c.a(this, v[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5c Jh(int i2, m06 m06Var, int i3, View view, c5c c5cVar) {
        z65.h(m06Var, "this$0");
        z65.h(view, "view");
        z65.h(c5cVar, "insets");
        n45 f2 = c5cVar.f(c5c.m.d());
        z65.g(f2, "getInsets(...)");
        p45.l(view, 0, 0, 0, i2 + f2.d, 7, null);
        p45.j(m06Var.Ih(), 0, i3 + f2.b, 0, 0, 13, null);
        return c5cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Kh(m06 m06Var, MenuItem menuItem) {
        z65.h(m06Var, "this$0");
        if (menuItem.getItemId() == ey8.loyalty_how_this_works_icon) {
            m06Var.Eh().J();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lh(m06 m06Var, View view) {
        z65.h(m06Var, "this$0");
        m06Var.Eh().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Mh(m06 m06Var) {
        z65.h(m06Var, "this$0");
        m06Var.Eh().K();
    }

    private final String sh(long j2) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(5, 1);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(j2);
        if (calendar.get(1) == calendar3.get(1) && calendar.get(6) >= calendar3.get(6)) {
            String string = getString(p09.coins_expiration_today_date_title);
            z65.g(string, "getString(...)");
            return string;
        } else if (calendar2.get(1) == calendar3.get(1) && calendar2.get(6) == calendar3.get(6)) {
            String string2 = getString(p09.coins_expiration_tomorrow_date_title);
            z65.g(string2, "getString(...)");
            return string2;
        } else {
            return chb.a(j2);
        }
    }

    private final TextView th() {
        return (TextView) this.e.a(this, v[2]);
    }

    private final TextView uh() {
        return (TextView) this.f.a(this, v[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView vh() {
        return (RecyclerView) this.h.a(this, v[5]);
    }

    private final ViewSwitcher wh() {
        return (ViewSwitcher) this.g.a(this, v[4]);
    }

    private final TextView xh() {
        return (TextView) this.d.a(this, v[1]);
    }

    private final ViewGroup yh() {
        return (ViewGroup) this.i.a(this, v[6]);
    }

    private final View zh() {
        return (View) this.j.a(this, v[7]);
    }

    @Override // defpackage.a36
    public void B3(int i2) {
        th().setText(String.valueOf(i2));
        un3.k(th());
        uh().setText(getResources().getQuantityString(d09.loyalty_already_in_cart, i2));
    }

    @Override // defpackage.a36
    public void Dg() {
        un3.e(th());
        uh().setText(getString(p09.loyalty_not_enough_balance_description));
    }

    @Override // defpackage.a36
    public void Ea() {
        gp7 gp7Var = this.r;
        if (gp7Var != null) {
            gp7Var.f(false);
        }
    }

    @Override // defpackage.a36
    public void Kd() {
        Ih().getMenu().findItem(ey8.loyalty_how_this_works_icon).setVisible(false);
    }

    @Override // defpackage.a36
    public void M3() {
        wh().setDisplayedChild(1);
    }

    @Override // defpackage.a36
    public void M7() {
        wh().setDisplayedChild(0);
    }

    @Override // defpackage.a36
    public void Nf() {
        Ih().getMenu().findItem(ey8.loyalty_how_this_works_icon).setVisible(true);
    }

    @Override // defpackage.a36
    public void Q9() {
        un3.k(Ch());
    }

    @Override // defpackage.a36
    public void R7(List<? extends Object> list) {
        z65.h(list, "operations");
        Dh().setHasFixedSize(false);
        RecyclerView Dh = Dh();
        k6 b2 = new k6.a(new k6(list), i.a, new p06(), j.a).b();
        String string = getString(p09.loyalty_history_operations_footer);
        z65.g(string, "getString(...)");
        Dh.setAdapter(new k6.a(b2, k.a, new zab(string), l.a).b().d());
        this.r = gp7.h.a(Dh()).e(new l87() { // from class: i06
            @Override // defpackage.l87
            public final void a() {
                m06.Mh(m06.this);
            }
        }).d(new LoyaltyLoadingItemCreator()).b();
    }

    @Override // defpackage.a36
    public void Sb() {
        gp7 gp7Var = this.r;
        if (gp7Var != null) {
            gp7Var.g(true);
        }
    }

    @Override // defpackage.a36
    public void Sd(xa1 xa1Var) {
        z65.h(xa1Var, "coinsExpirations");
        Bh().setText(sh(xa1Var.b()));
        Ah().setText(eb1.a.a(xa1Var.a()));
        un3.e(Hh());
        un3.e(Fh());
        un3.e(Gh());
        un3.k(yh());
    }

    @Override // defpackage.a36
    public void Se(xa1 xa1Var, xa1 xa1Var2) {
        z65.h(xa1Var, "coinsExpirations");
        z65.h(xa1Var2, "coinsExpirationsMore");
        Sd(xa1Var);
        Hh().setText(sh(xa1Var2.b()));
        Fh().setText(eb1.a.a(xa1Var2.a()));
        un3.k(Hh());
        un3.k(Fh());
        un3.k(Gh());
        un3.k(yh());
    }

    @Override // defpackage.a36
    public void b4() {
        gp7 gp7Var = this.r;
        if (gp7Var != null) {
            gp7Var.f(true);
        }
    }

    @Override // defpackage.a36
    public void cc() {
        un3.e(yh());
    }

    @Override // defpackage.a36
    public void h2(double d2) {
        xh().setText(getString(p09.loyalty_balance_title, eb1.a.a(d2)));
    }

    @Override // defpackage.f70
    protected int hh() {
        return ow8.b;
    }

    @Override // defpackage.f70
    protected void ih(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        final int i2;
        z65.h(view, "rootView");
        final int paddingBottom = view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = Ih().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i2 = marginLayoutParams.topMargin;
        } else {
            i2 = 0;
        }
        syb.I0(view, new h77() { // from class: l06
            @Override // defpackage.h77
            public final c5c a(View view2, c5c c5cVar) {
                c5c Jh;
                Jh = m06.Jh(paddingBottom, this, i2, view2, c5cVar);
                return Jh;
            }
        });
    }

    @Override // defpackage.a36
    public void lb() {
        un3.e(th());
        uh().setText(getString(p09.loyalty_enough_for_anything_balance_description));
    }

    @Override // defpackage.a36
    public void n5() {
        un3.e(th());
        uh().setText(getString(p09.loyalty_enough_balance_description));
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Ih().setOnMenuItemClickListener(new Toolbar.f() { // from class: j06
            @Override // androidx.appcompat.widget.Toolbar.f
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean Kh;
                Kh = m06.Kh(m06.this, menuItem);
                return Kh;
            }
        });
        Ih().setNavigationOnClickListener(new View.OnClickListener() { // from class: k06
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                m06.Lh(m06.this, view2);
            }
        });
        vh().setLayoutManager(new ZoomCenterCardLayoutManager(getContext(), 0, false));
        RecyclerView vh = vh();
        if (syb.Y(vh) && !vh.isLayoutRequested()) {
            int width = (vh().getWidth() / 2) - jx9.a.a(90);
            vh().setPadding(width, 0, width, 0);
        } else {
            vh.addOnLayoutChangeListener(new b());
        }
        new androidx.recyclerview.widget.k().b(vh());
        vh().setAdapter(new k6.a(new k6(this.s), c.a, new c06(new e()), d.a).b().d());
    }

    @Override // defpackage.a36
    public void p2() {
        un3.e(th());
        uh().setText(getString(p09.loyalty_almost_enough_balance_description));
    }

    @Override // defpackage.a36
    public void qd(List<b26> list) {
        z65.h(list, "categoriesVO");
        this.s.Z(list, m.a);
        if (!list.isEmpty()) {
            RecyclerView vh = vh();
            if (syb.Y(vh) && !vh.isLayoutRequested()) {
                RecyclerView.m itemAnimator = vh.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.q(new n(vh));
                    return;
                }
                return;
            }
            vh.addOnLayoutChangeListener(new o(vh));
        }
    }

    @Override // defpackage.a36
    public void t5() {
        soa.a.a(new h()).U();
    }

    @Override // defpackage.a36
    public void td(int i2, int i3) {
        oma.a(zh(), new g(i2, i3, this));
        un3.k(zh());
    }

    @Override // defpackage.a36
    public void z6() {
        un3.e(Ch());
    }
}
