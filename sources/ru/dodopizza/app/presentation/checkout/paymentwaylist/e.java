package ru.dodopizza.app.presentation.checkout.paymentwaylist;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.et7;
import defpackage.k6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.adapter.BigDividerVH;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.adapter.CashMethodVH;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.adapter.EmailForCheckVH;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.adapter.PaymentMethodVH;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.adapter.TaxPayerIdVH;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.c;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.d;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.e;
/* compiled from: PaymentMethodListFragment.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 L2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001MB\u0007¢\u0006\u0004\bJ\u0010KJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\u000b\u001a\u00020\u0006*\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\tH\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\tH\u0016J\b\u0010\u001f\u001a\u00020\u0006H\u0016J\b\u0010 \u001a\u00020\u0006H\u0016J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0016H\u0016J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u00103R\u001b\u00108\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u00107R\u001b\u0010;\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\b:\u00107R\u001b\u0010>\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010,\u001a\u0004\b=\u00107R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010,\u001a\u0004\bA\u0010BR\u001b\u0010I\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006N"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/e;", "Lc70;", "Lxt7;", "Lw50;", "", "message", "", "Ih", "Landroidx/appcompat/widget/Toolbar;", "", "resId", "Fh", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "", "onBackPressed", "vb", "isVisible", "Z8", "Og", "Ce", "cardsToRemoveCount", "H4", "U8", "P", "isLoading", "ra", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/c;", "error", "o6", "Ll6;", "Let7;", Image.TYPE_HIGH, "Ll6;", "dataSet", "i", "Lk79;", "Dh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/recyclerview/widget/RecyclerView;", "j", "Ah", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "k", "yh", "()Landroid/view/View;", "editButton", "l", "Bh", "removeButton", Image.TYPE_MEDIUM, "Ch", "removeButtonProgress", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "n", "xh", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "coordinator", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/PaymentMethodListPresenter;", "o", "Lmoxy/ktx/MoxyKtxDelegate;", "zh", "()Lru/dodopizza/app/presentation/checkout/paymentwaylist/PaymentMethodListPresenter;", "presenter", "<init>", "()V", "p", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class e extends c70 implements xt7, w50 {
    private final l6<et7> h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    private final k79 m;
    private final k79 n;
    private final MoxyKtxDelegate o;
    static final /* synthetic */ je5<Object>[] q = {bc9.f(new ar8(e.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(e.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(e.class, "editButton", "getEditButton()Landroid/view/View;", 0)), bc9.f(new ar8(e.class, "removeButton", "getRemoveButton()Landroid/view/View;", 0)), bc9.f(new ar8(e.class, "removeButtonProgress", "getRemoveButtonProgress()Landroid/view/View;", 0)), bc9.f(new ar8(e.class, "coordinator", "getCoordinator()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", 0)), bc9.f(new ar8(e.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/checkout/paymentwaylist/PaymentMethodListPresenter;", 0))};
    public static final a p = new a(null);

    /* compiled from: PaymentMethodListFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/e$a;", "", "", "isCarryoutOrRestaurant", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/e;", "a", "", "EXTRA_IS_CARRYOUT_OR_RESTAURANT", "Ljava/lang/String;", "", "ICON_BACK_RES_ID", "I", "ICON_CLOSE_RES_ID", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(boolean z) {
            return (e) y64.d(d70.a(new e(), false), bi0.c(bi0.d("extra_is_carryout_or_restaurant", Boolean.valueOf(z))));
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final b a = new b();

        public b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = TaxPayerIdVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
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
            return Boolean.valueOf(obj instanceof et7.c.b);
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
            Object newInstance = PaymentMethodVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.e$e  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0552e extends ej5 implements Function1<Object, Boolean> {
        public static final C0552e a = new C0552e();

        public C0552e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof et7.c.a);
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
            Object newInstance = CashMethodVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class g extends ej5 implements Function1<Object, Boolean> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof et7.a);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class h extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final h a = new h();

        public h() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = BigDividerVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
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
            return Boolean.valueOf(obj instanceof et7.b);
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
            Object newInstance = EmailForCheckVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
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
            return Boolean.valueOf(obj instanceof et7.d);
        }
    }

    /* compiled from: PaymentMethodListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Let7$c$b;", "paymentMethodVO", "", "a", "(Let7$c$b;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class l extends ej5 implements Function1<et7.c.b, Unit> {
        l() {
            super(1);
        }

        public final void a(et7.c.b bVar) {
            z65.h(bVar, "paymentMethodVO");
            e.this.zh().w(new d.g(bVar));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(et7.c.b bVar) {
            a(bVar);
            return Unit.a;
        }
    }

    /* compiled from: PaymentMethodListFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Let7$c$b;", "paymentMethodVO", "", "isChecked", "", "a", "(Let7$c$b;Z)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class m extends ej5 implements Function2<et7.c.b, Boolean, Unit> {
        m() {
            super(2);
        }

        public final void a(et7.c.b bVar, boolean z) {
            z65.h(bVar, "paymentMethodVO");
            e.this.zh().w(new d.f(bVar, z));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(et7.c.b bVar, Boolean bool) {
            a(bVar, bool.booleanValue());
            return Unit.a;
        }
    }

    /* compiled from: PaymentMethodListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Let7$c$a;", "cashVO", "", "a", "(Let7$c$a;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class n extends ej5 implements Function1<et7.c.a, Unit> {
        n() {
            super(1);
        }

        public final void a(et7.c.a aVar) {
            z65.h(aVar, "cashVO");
            e.this.zh().w(new d.g(aVar));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(et7.c.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    /* compiled from: PaymentMethodListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class o extends ej5 implements Function0<Unit> {
        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            e.this.zh().w(d.c.a);
        }
    }

    /* compiled from: PaymentMethodListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class p extends ej5 implements Function0<Unit> {
        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            e.this.zh().w(d.l.a);
        }
    }

    /* compiled from: PaymentMethodListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class q extends ej5 implements Function1<View, Unit> {
        q() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            e.this.zh().w(d.a.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: PaymentMethodListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class r extends ej5 implements Function1<View, Unit> {
        r() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            e.this.zh().w(d.j.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: PaymentMethodListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/PaymentMethodListPresenter;", "a", "()Lru/dodopizza/app/presentation/checkout/paymentwaylist/PaymentMethodListPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class s extends ej5 implements Function0<PaymentMethodListPresenter> {
        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final PaymentMethodListPresenter invoke() {
            return ((CheckoutComponent) e.this.getComponentDependenciesRegistry().a(bc9.b(CheckoutComponent.class))).d4().c(e.this.h).b(e.this.requireArguments().getBoolean("extra_is_carryout_or_restaurant")).a().a();
        }
    }

    public e() {
        super(R.layout.fragment_payment_method_list);
        this.h = new l6<>(null, 1, null);
        this.i = kb0.e(this, R.id.toolbar);
        this.j = kb0.e(this, R.id.payment_method_recycler_view);
        this.k = kb0.e(this, R.id.edit_button);
        this.l = kb0.e(this, R.id.remove_button);
        this.m = kb0.e(this, R.id.remove_button_progress);
        this.n = kb0.e(this, R.id.coordinator);
        s sVar = new s();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.o = new MoxyKtxDelegate(mvpDelegate, PaymentMethodListPresenter.class.getName() + ".presenter", sVar);
    }

    private final RecyclerView Ah() {
        return (RecyclerView) this.j.a(this, q[1]);
    }

    private final View Bh() {
        return (View) this.l.a(this, q[3]);
    }

    private final View Ch() {
        return (View) this.m.a(this, q[4]);
    }

    private final Toolbar Dh() {
        return (Toolbar) this.i.a(this, q[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Eh(e eVar, View view) {
        z65.h(eVar, "this$0");
        eVar.zh().w(d.C0551d.a);
    }

    private final void Fh(Toolbar toolbar, int i2) {
        toolbar.setNavigationIcon(iu1.e(requireContext(), i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Gh(e eVar, DialogInterface dialogInterface, int i2) {
        z65.h(eVar, "this$0");
        eVar.zh().w(d.h.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Hh(e eVar, DialogInterface dialogInterface, int i2) {
        z65.h(eVar, "this$0");
        eVar.zh().w(d.i.a);
    }

    private final void Ih(String str) {
        if (getView() != null) {
            Snackbar.i0(xh(), str, 0).U();
        }
    }

    private final CoordinatorLayout xh() {
        return (CoordinatorLayout) this.n.a(this, q[5]);
    }

    private final View yh() {
        return (View) this.k.a(this, q[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentMethodListPresenter zh() {
        return (PaymentMethodListPresenter) this.o.getValue(this, q[6]);
    }

    @Override // defpackage.xt7
    public void Ce(boolean z) {
        un3.o(yh(), z);
    }

    @Override // defpackage.xt7
    public void H4(int i2) {
        int i3;
        if (i2 == 1) {
            i3 = R.string.paymentmethods_dialog_confirm_delete_one_card;
        } else {
            i3 = R.string.paymentmethods_dialog_confirm_delete_many_cards;
        }
        new b.a(requireContext()).g(i3).n(R.string.delete, new DialogInterface.OnClickListener() { // from class: mt7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                e.Gh(e.this, dialogInterface, i4);
            }
        }).j(R.string.keep, new DialogInterface.OnClickListener() { // from class: nt7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                e.Hh(e.this, dialogInterface, i4);
            }
        }).d(false).u();
    }

    @Override // defpackage.xt7
    public void Og() {
        Fh(Dh(), R.drawable.ic_arrow_start);
        un3.e(Ch());
        un3.e(Bh());
        un3.k(yh());
        Ah().getLayoutParams().height = -2;
    }

    @Override // defpackage.xt7
    public void P() {
        startPostponedEnterTransition();
    }

    @Override // defpackage.xt7
    public void U8() {
        Toast.makeText(getContext(), (int) R.string.paymentmethods_loading_failed, 1).show();
    }

    @Override // defpackage.xt7
    public void Z8(boolean z) {
        un3.o(Bh(), z);
    }

    @Override // defpackage.xt7
    public void o6(ru.dodopizza.app.presentation.checkout.paymentwaylist.c cVar) {
        z65.h(cVar, "error");
        if (z65.c(cVar, c.d.a)) {
            Ih("Unknown error");
        } else if (z65.c(cVar, c.a.a)) {
            String string = requireContext().getResources().getString(R.string.paymentmethods_message_failed_to_remove_cards);
            z65.g(string, "getString(...)");
            Ih(string);
        } else if (z65.c(cVar, c.b.a)) {
            String string2 = requireContext().getResources().getString(R.string.paymentmethods_message_failed_to_update_email);
            z65.g(string2, "getString(...)");
            Ih(string2);
        } else if (z65.c(cVar, c.C0550c.a)) {
            String string3 = requireContext().getResources().getString(R.string.paymentmethods_message_failed_to_update_tax_payer_id);
            z65.g(string3, "getString(...)");
            Ih(string3);
        }
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        zh().w(d.C0551d.a);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        postponeEnterTransition();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Ah().setAdapter(new k6.a(new k6.a(new k6.a(new k6.a(new k6.a(new k6(this.h), c.a, new gt7(new l(), new m()), d.a).b(), C0552e.a, new at0(new n()), f.a).b(), g.a, cb0.a, h.a).b(), i.a, new cf3(new o()), j.a).b(), k.a, new s7b(new p()), b.a).b().d());
        RecyclerView Ah = Ah();
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        Ah.addItemDecoration(new jt7(requireContext));
        Dh().setNavigationOnClickListener(new View.OnClickListener() { // from class: lt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e.Eh(e.this, view2);
            }
        });
        oma.a(yh(), new q());
        oma.a(Bh(), new r());
    }

    @Override // defpackage.xt7
    public void ra(boolean z) {
        un3.o(Bh(), !z);
        un3.o(Ch(), z);
    }

    @Override // defpackage.xt7
    public void vb() {
        Fh(Dh(), R.drawable.ic_cross);
        un3.e(Ch());
        un3.e(Bh());
        un3.e(yh());
        Ah().getLayoutParams().height = Ah().getHeight();
    }
}
