package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.menu.adapters.menuitem.MenuItemVH;
import com.dodopizza.order.feature.menu.adapters.menuitem.d;
import com.huawei.hms.actions.SearchIntents;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k6;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.presentation.search.SearchPresenter;
/* compiled from: SearchFragment.kt */
@Metadata(d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bI\u0010JJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001e\u0010\u0018\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001b\u0010)\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010(R#\u00100\u001a\n +*\u0004\u0018\u00010*0*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R(\u00108\u001a\b\u0012\u0004\u0012\u00020*018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lfy9;", "Lf70;", "Lqy9;", "fy9$b", "ph", "()Lfy9$b;", "", "xh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "hint", "X9", "", "Lye6;", "results", "Lb78;", "pizzaConcept", "X3", "J2", "qc", "Landroidx/appcompat/widget/Toolbar;", com.huawei.hms.opendevice.c.a, "Lk79;", "wh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/recyclerview/widget/RecyclerView;", DateTokenConverter.CONVERTER_KEY, "th", "()Landroidx/recyclerview/widget/RecyclerView;", "searchResults", com.huawei.hms.push.e.a, "qh", "()Landroid/view/View;", "noSearchResultsView", "Lru/dodopizza/app/presentation/search/SearchPresenter;", "kotlin.jvm.PlatformType", "f", "Lmoxy/ktx/MoxyKtxDelegate;", "rh", "()Lru/dodopizza/app/presentation/search/SearchPresenter;", "presenter", "Las8;", "g", "Las8;", "sh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "Lu18;", Image.TYPE_HIGH, "Lu18;", "vh", "()Lu18;", "setTimerFormatter", "(Lu18;)V", "timerFormatter", "Lf5b;", "i", "Lf5b;", "uh", "()Lf5b;", "setSystemTimeProvider", "(Lf5b;)V", "systemTimeProvider", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: fy9  reason: default package */
/* loaded from: classes4.dex */
public final class fy9 extends f70 implements qy9 {
    static final /* synthetic */ je5<Object>[] j = {bc9.f(new ar8(fy9.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(fy9.class, "searchResults", "getSearchResults()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(fy9.class, "noSearchResultsView", "getNoSearchResultsView()Landroid/view/View;", 0)), bc9.f(new ar8(fy9.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/search/SearchPresenter;", 0))};
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final MoxyKtxDelegate f;
    public as8<SearchPresenter> g;
    public u18 h;
    public f5b i;

    /* compiled from: SearchFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fy9$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b78.values().length];
            try {
                iArr[b78.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b78.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SearchFragment.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"fy9$b", "Lrd6;", "Lye6;", "menuItemVO", "", "position", "", "b", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fy9$b */
    /* loaded from: classes4.dex */
    public static final class b implements rd6 {
        b() {
        }

        @Override // defpackage.rd6
        public void a(ye6 ye6Var, int i) {
            z65.h(ye6Var, "menuItemVO");
            fy9.this.rh().w(ye6Var, i);
        }

        @Override // defpackage.rd6
        public void b(ye6 ye6Var, int i) {
            z65.h(ye6Var, "menuItemVO");
            fy9.this.rh().w(ye6Var, i);
        }
    }

    /* compiled from: SearchFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/search/SearchPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/search/SearchPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fy9$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<SearchPresenter> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SearchPresenter invoke() {
            return fy9.this.sh().get();
        }
    }

    /* compiled from: SearchFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"fy9$d", "Landroidx/appcompat/widget/SearchView$m;", "", SearchIntents.EXTRA_QUERY, "", "b", "newText", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fy9$d */
    /* loaded from: classes4.dex */
    public static final class d implements SearchView.m {
        final /* synthetic */ Function1<String, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super String, Unit> function1) {
            this.a = function1;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean a(String str) {
            if (str != null) {
                this.a.invoke(str);
                return false;
            }
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean b(String str) {
            return false;
        }
    }

    /* compiled from: SearchFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fy9$e */
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function1<String, Unit> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            z65.h(str, "it");
            fy9.this.rh().y(str);
        }
    }

    /* compiled from: SearchFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/widget/ImageView;", "it", "", "a", "(Landroid/widget/ImageView;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fy9$f */
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function1<ImageView, Unit> {
        public static final f a = new f();

        f() {
            super(1);
        }

        public final void a(ImageView imageView) {
            z65.h(imageView, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ImageView imageView) {
            a(imageView);
            return Unit.a;
        }
    }

    /* compiled from: SearchFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/widget/ImageView;", "it", "", "a", "(Landroid/widget/ImageView;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fy9$g */
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function1<ImageView, Unit> {
        public static final g a = new g();

        g() {
            super(1);
        }

        public final void a(ImageView imageView) {
            z65.h(imageView, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ImageView imageView) {
            a(imageView);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fy9$h */
    /* loaded from: classes4.dex */
    public static final class h extends ej5 implements Function1<Object, Boolean> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof rc9);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fy9$i */
    /* loaded from: classes4.dex */
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
            Object newInstance = MenuItemVH.MenuItemRegularVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fy9$j */
    /* loaded from: classes4.dex */
    public static final class j extends ej5 implements Function1<Object, Boolean> {
        public static final j a = new j();

        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof rc9);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fy9$k */
    /* loaded from: classes4.dex */
    public static final class k extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final k a = new k();

        public k() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = MenuItemVH.MenuItemBigImageVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    public fy9() {
        super(R.layout.fragment_search);
        this.c = kb0.e(this, R.id.search_fragment_toolbar);
        this.d = kb0.e(this, R.id.search_results);
        this.e = kb0.e(this, R.id.no_search_results_view);
        c cVar = new c();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.f = new MoxyKtxDelegate(mvpDelegate, SearchPresenter.class.getName() + ".presenter", cVar);
    }

    private final b ph() {
        return new b();
    }

    private final View qh() {
        return (View) this.e.a(this, j[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchPresenter rh() {
        return (SearchPresenter) this.f.getValue(this, j[3]);
    }

    private final RecyclerView th() {
        return (RecyclerView) this.d.a(this, j[1]);
    }

    private final Toolbar wh() {
        return (Toolbar) this.c.a(this, j[0]);
    }

    private final void xh() {
        View view = getView();
        if (view != null) {
            gg5.c(view);
        }
        rh().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yh(fy9 fy9Var, View view) {
        z65.h(fy9Var, "this$0");
        fy9Var.xh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zh(SearchView searchView, View view, boolean z) {
        z65.h(searchView, "$this_apply");
        if (z) {
            View findFocus = view.findFocus();
            z65.g(findFocus, "findFocus(...)");
            gg5.f(findFocus);
            searchView.setOnQueryTextFocusChangeListener(null);
        }
    }

    @Override // defpackage.qy9
    public void J2() {
        un3.e(th());
        un3.k(qh());
    }

    @Override // defpackage.qy9
    public void X3(List<? extends ye6> list, b78 b78Var) {
        k6 b2;
        z65.h(list, "results");
        z65.h(b78Var, "pizzaConcept");
        b ph = ph();
        RecyclerView th = th();
        k6 k6Var = new k6(list);
        int i2 = a.$EnumSwitchMapping$0[b78Var.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                b2 = new k6.a(k6Var, j.a, new d.a(ph, g.a, vh(), uh()), k.a).b();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            b2 = new k6.a(k6Var, h.a, new d.b(ph, f.a, vh(), uh()), i.a).b();
        }
        th.setAdapter(b2.d());
        un3.k(th());
        un3.e(qh());
    }

    @Override // defpackage.qy9
    public void X9(String str) {
        z65.h(str, "hint");
        wh().x(R.menu.search_menu);
        Function1 b2 = kn2.b(pp5.a(this), 0L, new e(), 1, null);
        View actionView = wh().getMenu().findItem(R.id.action_search).getActionView();
        z65.f(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        final SearchView searchView = (SearchView) actionView;
        searchView.setQueryHint(str);
        searchView.setIconifiedByDefault(false);
        ((ImageView) searchView.findViewById(R.id.search_mag_icon)).setVisibility(8);
        ((ImageView) searchView.findViewById(R.id.search_button)).setImageResource(R.drawable.ic_search);
        searchView.setOnQueryTextListener(new d(b2));
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: ey9
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                fy9.zh(SearchView.this, view, z);
            }
        });
        searchView.requestFocus();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        ((LocalityComponent) getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).l1().a(this);
        super.onAttach(context);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        wh().setNavigationOnClickListener(new View.OnClickListener() { // from class: dy9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                fy9.yh(fy9.this, view2);
            }
        });
    }

    @Override // defpackage.qy9
    public void qc() {
        List l;
        RecyclerView th = th();
        l = kc1.l();
        th.setAdapter(new k6(l).d());
        un3.k(th());
        un3.e(qh());
    }

    public final as8<SearchPresenter> sh() {
        as8<SearchPresenter> as8Var = this.g;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    public final f5b uh() {
        f5b f5bVar = this.i;
        if (f5bVar != null) {
            return f5bVar;
        }
        z65.z("systemTimeProvider");
        return null;
    }

    public final u18 vh() {
        u18 u18Var = this.h;
        if (u18Var != null) {
            return u18Var;
        }
        z65.z("timerFormatter");
        return null;
    }
}
