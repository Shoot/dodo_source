package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.actions.SearchIntents;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k6;
import defpackage.tt5;
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
import ru.dodopizza.app.di.modules.presentation.selectlocation.localitylist.LocalityListFeatureDependencies;
import ru.dodopizza.app.presentation.selectlocation.localitylist.LocalityListPresenter;
import ru.dodopizza.app.presentation.selectlocation.localitylist.adapter.LocalityVHImpl;
/* compiled from: LocalityListFragment.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 P2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001QB\u0007¢\u0006\u0004\bN\u0010OJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\bH\u0016J\u0016\u0010\u001d\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\"\u001a\u00020\u001eH\u0016R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00105\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R(\u0010G\u001a\b\u0012\u0004\u0012\u00020@0?8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR#\u0010M\u001a\n H*\u0004\u0018\u00010@0@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006R"}, d2 = {"Lyt5;", "Lf70;", "Lhu5;", "Lw50;", "", "Dh", "th", "Ch", "", "filter", "sh", "", "position", "Fh", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "s0", "O0", "B9", "hb", "countryName", "z0", "", "Ln6a;", "localities", "yc", "", "show", "ie", "i3", "onBackPressed", "Landroidx/appcompat/widget/Toolbar;", com.huawei.hms.opendevice.c.a, "Lk79;", "Bh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "wh", "()Landroid/widget/Button;", "countryButton", "Landroidx/appcompat/widget/SearchView;", com.huawei.hms.push.e.a, "Landroidx/appcompat/widget/SearchView;", "searchView", "f", "Ah", "()Landroid/view/View;", "searchEmptyView", "Landroidx/recyclerview/widget/RecyclerView;", "g", "zh", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lfq5;", Image.TYPE_HIGH, "Lfq5;", "linearSmoothScrollerToTop", "Las8;", "Lru/dodopizza/app/presentation/selectlocation/localitylist/LocalityListPresenter;", "i", "Las8;", "yh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "j", "Lmoxy/ktx/MoxyKtxDelegate;", "xh", "()Lru/dodopizza/app/presentation/selectlocation/localitylist/LocalityListPresenter;", "presenter", "<init>", "()V", "k", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: yt5  reason: default package */
/* loaded from: classes4.dex */
public final class yt5 extends f70 implements hu5, w50 {
    private final k79 c;
    private final k79 d;
    private SearchView e;
    private final k79 f;
    private final k79 g;
    private fq5 h;
    public as8<LocalityListPresenter> i;
    private final MoxyKtxDelegate j;
    static final /* synthetic */ je5<Object>[] l = {bc9.f(new ar8(yt5.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(yt5.class, "countryButton", "getCountryButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(yt5.class, "searchEmptyView", "getSearchEmptyView()Landroid/view/View;", 0)), bc9.f(new ar8(yt5.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(yt5.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/selectlocation/localitylist/LocalityListPresenter;", 0))};
    public static final a k = new a(null);

    /* compiled from: LocalityListFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, d2 = {"Lyt5$a;", "", "Lut5;", "args", "Lyt5;", "a", "", "COUNTRY_BUTTON_LEFT_MARGIN", "I", "", "EXTRA_KEY_ARGS", "Ljava/lang/String;", "START_SCROLL_FROM", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: yt5$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final yt5 a(ut5 ut5Var) {
            z65.h(ut5Var, "args");
            return (yt5) y64.d(new yt5(), bi0.c(bi0.d("extra_key_args", ut5Var)));
        }
    }

    /* compiled from: LocalityListFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"yt5$b", "Landroidx/appcompat/widget/SearchView$m;", "", "newText", "", "a", SearchIntents.EXTRA_QUERY, "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: yt5$b */
    /* loaded from: classes4.dex */
    public static final class b implements SearchView.m {
        b() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean a(String str) {
            if (str != null) {
                yt5.this.sh(str);
                return false;
            }
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean b(String str) {
            return false;
        }
    }

    /* compiled from: LocalityListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/localitylist/LocalityListPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/selectlocation/localitylist/LocalityListPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: yt5$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<LocalityListPresenter> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final LocalityListPresenter invoke() {
            return yt5.this.yh().get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalityListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: yt5$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            yt5.this.xh().u();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: yt5$e */
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
            return Boolean.valueOf(obj instanceof mv5);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: yt5$f */
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
            Object newInstance = LocalityVHImpl.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: LocalityListFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"yt5$g", "Lgt5;", "Lmv5;", "localityVO", "", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: yt5$g */
    /* loaded from: classes4.dex */
    public static final class g implements gt5 {
        g() {
        }

        @Override // defpackage.gt5
        public void a(mv5 mv5Var) {
            z65.h(mv5Var, "localityVO");
            yt5.this.xh().A(mv5Var);
            yt5.this.Ch();
        }
    }

    public yt5() {
        super(R.layout.fragment_locality_list);
        this.c = kb0.e(this, R.id.toolbar);
        this.d = kb0.e(this, R.id.country_button);
        this.f = kb0.e(this, R.id.search_empty);
        this.g = kb0.e(this, R.id.locality_list);
        c cVar = new c();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.j = new MoxyKtxDelegate(mvpDelegate, LocalityListPresenter.class.getName() + ".presenter", cVar);
    }

    private final View Ah() {
        return (View) this.f.a(this, l[2]);
    }

    private final Toolbar Bh() {
        return (Toolbar) this.c.a(this, l[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ch() {
        SearchView searchView = this.e;
        if (searchView != null) {
            SearchView searchView2 = null;
            if (searchView == null) {
                z65.z("searchView");
                searchView = null;
            }
            if (searchView.getVisibility() == 0) {
                SearchView searchView3 = this.e;
                if (searchView3 == null) {
                    z65.z("searchView");
                } else {
                    searchView2 = searchView3;
                }
                gg5.a(searchView2);
            }
        }
    }

    private final void Dh() {
        un3.k(Bh());
        th();
        oma.a(wh(), new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Eh(yt5 yt5Var, View view) {
        z65.h(yt5Var, "this$0");
        gg5.a(yt5Var.Bh());
        yt5Var.xh().y();
    }

    private final void Fh(int i) {
        RecyclerView.p layoutManager;
        fq5 fq5Var = this.h;
        fq5 fq5Var2 = null;
        if (fq5Var == null) {
            z65.z("linearSmoothScrollerToTop");
            fq5Var = null;
        }
        fq5Var.p(i);
        if (i > 10 && (layoutManager = zh().getLayoutManager()) != null) {
            layoutManager.F1(i - 10);
        }
        RecyclerView.p layoutManager2 = zh().getLayoutManager();
        if (layoutManager2 != null) {
            fq5 fq5Var3 = this.h;
            if (fq5Var3 == null) {
                z65.z("linearSmoothScrollerToTop");
            } else {
                fq5Var2 = fq5Var3;
            }
            layoutManager2.R1(fq5Var2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sh(String str) {
        xh().w(str);
    }

    private final void th() {
        Bh().getMenu().clear();
        Bh().x(R.menu.search_menu);
        View actionView = Bh().getMenu().findItem(R.id.action_search).getActionView();
        z65.f(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        this.e = searchView;
        SearchView searchView2 = null;
        if (searchView == null) {
            z65.z("searchView");
            searchView = null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        searchView.setMaxWidth(displayMetrics.widthPixels);
        ((ImageView) searchView.findViewById(R.id.search_button)).setImageResource(R.drawable.ic_search);
        ((ImageView) searchView.findViewById(R.id.search_button)).setColorFilter(iu1.c(searchView.getContext(), R.color.textIconAccentColor));
        ((ImageView) searchView.findViewById(R.id.search_close_btn)).setColorFilter(iu1.c(searchView.getContext(), R.color.textIconPrimaryColor));
        SearchView searchView3 = this.e;
        if (searchView3 == null) {
            z65.z("searchView");
            searchView3 = null;
        }
        searchView3.setOnQueryTextListener(new b());
        SearchView searchView4 = this.e;
        if (searchView4 == null) {
            z65.z("searchView");
            searchView4 = null;
        }
        searchView4.setQueryHint(getResources().getString(R.string.search_city_hint));
        SearchView searchView5 = this.e;
        if (searchView5 == null) {
            z65.z("searchView");
            searchView5 = null;
        }
        searchView5.setOnSearchClickListener(new View.OnClickListener() { // from class: wt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yt5.uh(yt5.this, view);
            }
        });
        SearchView searchView6 = this.e;
        if (searchView6 == null) {
            z65.z("searchView");
        } else {
            searchView2 = searchView6;
        }
        searchView2.setOnCloseListener(new SearchView.l() { // from class: xt5
            @Override // androidx.appcompat.widget.SearchView.l
            public final boolean onClose() {
                boolean vh;
                vh = yt5.vh(yt5.this);
                return vh;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uh(yt5 yt5Var, View view) {
        z65.h(yt5Var, "this$0");
        yt5Var.xh().B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean vh(yt5 yt5Var) {
        z65.h(yt5Var, "this$0");
        yt5Var.xh().z();
        return false;
    }

    private final Button wh() {
        return (Button) this.d.a(this, l[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocalityListPresenter xh() {
        return (LocalityListPresenter) this.j.getValue(this, l[4]);
    }

    private final RecyclerView zh() {
        return (RecyclerView) this.g.a(this, l[3]);
    }

    @Override // defpackage.hu5
    public void B9() {
        un3.o(wh(), true);
    }

    @Override // defpackage.hu5
    public void O0() {
        Toolbar Bh = Bh();
        Bh.setNavigationIcon((Drawable) null);
        Bh.setNavigationOnClickListener(null);
        ViewGroup.LayoutParams layoutParams = wh().getLayoutParams();
        z65.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = jx9.a.a(16);
    }

    @Override // defpackage.hu5
    public void hb() {
        un3.o(wh(), false);
    }

    @Override // defpackage.hu5
    public void i3(int i) {
        if (i != -1) {
            Fh(i);
        }
    }

    @Override // defpackage.hu5
    public void ie(boolean z) {
        un3.o(Ah(), z);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        xh().y();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        tt5.b a2 = tt5.a.a();
        LocalityListFeatureDependencies localityListFeatureDependencies = (LocalityListFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(LocalityListFeatureDependencies.class));
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("extra_key_args")) == null) ? null : null;
        if (obj != null && !(obj instanceof ut5)) {
            throw new ClassCastException("Property extra_key_args has different class type");
        } else if (obj != null) {
            a2.a(localityListFeatureDependencies, (ut5) obj).a(this);
            super.onCreate(bundle);
        } else {
            throw new IllegalArgumentException("Argument with key = extra_key_args not found in bundle");
        }
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        this.h = new fq5(getContext());
        zh().setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView zh = zh();
        v99 v99Var = v99.a;
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        zh.addItemDecoration(v99.b(v99Var, requireContext, 0, 2, null));
        Dh();
    }

    @Override // defpackage.hu5
    public void s0() {
        Toolbar Bh = Bh();
        Drawable e2 = iu1.e(Bh.getContext(), R.drawable.ic_cross);
        if (e2 != null) {
            e2.mutate();
            e2.setTint(iu1.c(Bh.getContext(), R.color.textIconDodoColor));
            Bh.setNavigationIcon(e2);
        }
        Bh.setNavigationOnClickListener(new View.OnClickListener() { // from class: vt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yt5.Eh(yt5.this, view);
            }
        });
        ViewGroup.LayoutParams layoutParams = wh().getLayoutParams();
        z65.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 0;
    }

    @Override // defpackage.hu5
    public void yc(List<? extends n6a> list) {
        z65.h(list, "localities");
        zh().setAdapter(new k6.a(new k6(list), e.a, new et5(new g()), f.a).b().d());
    }

    public final as8<LocalityListPresenter> yh() {
        as8<LocalityListPresenter> as8Var = this.i;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.hu5
    public void z0(String str) {
        z65.h(str, "countryName");
        wh().setText(str);
    }
}
