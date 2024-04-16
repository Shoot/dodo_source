package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.core.feature.debugtools.toggles.FeatureTogglesFeatureDependencies;
import com.dodopizza.core.feature.debugtools.toggles.presentation.TogglesPresenter;
import com.dodopizza.core.feature.debugtools.toggles.presentation.adapter.ToggleTitleViewHolder;
import com.dodopizza.core.feature.debugtools.toggles.presentation.adapter.ToggleViewHolder;
import com.huawei.hms.actions.SearchIntents;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bib;
import defpackage.c5c;
import defpackage.k6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: TogglesFragment.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b1\u00102J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H\u0014R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010 \u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010#\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u001fR\u001b\u0010&\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u001fR\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lhib;", "Lf70;", "Ljib;", "", "xh", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Ll6;", "Lbib;", "toggles", "H2", "finish", "y", "rootView", "ih", "Landroidx/recyclerview/widget/RecyclerView;", com.huawei.hms.opendevice.c.a, "Lk79;", "rh", "()Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/appcompat/widget/Toolbar;", DateTokenConverter.CONVERTER_KEY, "uh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", com.huawei.hms.push.e.a, "ph", "()Landroid/view/View;", "applyButton", "f", "th", "restartButton", "g", "sh", "resetButton", "Landroidx/appcompat/widget/SearchView;", Image.TYPE_HIGH, "Landroidx/appcompat/widget/SearchView;", "searchView", "Lcom/dodopizza/core/feature/debugtools/toggles/presentation/TogglesPresenter;", "i", "Lmoxy/ktx/MoxyKtxDelegate;", "qh", "()Lcom/dodopizza/core/feature/debugtools/toggles/presentation/TogglesPresenter;", "presenter", "<init>", "()V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hib  reason: default package */
/* loaded from: classes.dex */
public final class hib extends f70 implements jib {
    static final /* synthetic */ je5<Object>[] j = {bc9.f(new ar8(hib.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(hib.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(hib.class, "applyButton", "getApplyButton()Landroid/view/View;", 0)), bc9.f(new ar8(hib.class, "restartButton", "getRestartButton()Landroid/view/View;", 0)), bc9.f(new ar8(hib.class, "resetButton", "getResetButton()Landroid/view/View;", 0)), bc9.f(new ar8(hib.class, "presenter", "getPresenter()Lcom/dodopizza/core/feature/debugtools/toggles/presentation/TogglesPresenter;", 0))};
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private SearchView h;
    private final MoxyKtxDelegate i;

    /* compiled from: TogglesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hib$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<View, Unit> {
        a() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            hib.this.qh().x();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: TogglesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hib$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            hib.this.qh().A();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: TogglesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hib$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            hib.this.qh().B();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: TogglesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/core/feature/debugtools/toggles/presentation/TogglesPresenter;", "a", "()Lcom/dodopizza/core/feature/debugtools/toggles/presentation/TogglesPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hib$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function0<TogglesPresenter> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TogglesPresenter invoke() {
            return eib.a.a().a((FeatureTogglesFeatureDependencies) hib.this.getComponentDependenciesRegistry().a(bc9.b(FeatureTogglesFeatureDependencies.class))).a();
        }
    }

    /* compiled from: TogglesFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"hib$e", "Landroidx/appcompat/widget/SearchView$m;", "", "newText", "", "a", SearchIntents.EXTRA_QUERY, "b", "core_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: hib$e */
    /* loaded from: classes.dex */
    public static final class e implements SearchView.m {
        e() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean a(String str) {
            TogglesPresenter qh = hib.this.qh();
            if (str == null) {
                str = "";
            }
            qh.z(str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean b(String str) {
            return false;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hib$f */
    /* loaded from: classes.dex */
    public static final class f extends ej5 implements Function1<Object, Boolean> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof bib.a);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hib$g */
    /* loaded from: classes.dex */
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
            Object newInstance = ToggleViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hib$h */
    /* loaded from: classes.dex */
    public static final class h extends ej5 implements Function1<Object, Boolean> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof bib.b);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hib$i */
    /* loaded from: classes.dex */
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
            Object newInstance = ToggleTitleViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: TogglesFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbq3;", "featureCode", "", "isEnabled", "", "a", "(Lbq3;Z)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hib$j */
    /* loaded from: classes.dex */
    static final class j extends ej5 implements Function2<bq3, Boolean, Unit> {
        j() {
            super(2);
        }

        public final void a(bq3 bq3Var, boolean z) {
            z65.h(bq3Var, "featureCode");
            hib.this.qh().y(bq3Var, z);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(bq3 bq3Var, Boolean bool) {
            a(bq3Var, bool.booleanValue());
            return Unit.a;
        }
    }

    public hib() {
        super(bz8.fragment_toggles);
        this.c = kb0.e(this, by8.d);
        this.d = kb0.e(this, by8.i);
        this.e = kb0.e(this, by8.b);
        this.f = kb0.e(this, by8.restart);
        this.g = kb0.e(this, by8.reset_toggles);
        d dVar = new d();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.i = new MoxyKtxDelegate(mvpDelegate, TogglesPresenter.class.getName() + ".presenter", dVar);
    }

    private final View ph() {
        return (View) this.e.a(this, j[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TogglesPresenter qh() {
        return (TogglesPresenter) this.i.getValue(this, j[5]);
    }

    private final RecyclerView rh() {
        return (RecyclerView) this.c.a(this, j[0]);
    }

    private final View sh() {
        return (View) this.g.a(this, j[4]);
    }

    private final View th() {
        return (View) this.f.a(this, j[3]);
    }

    private final Toolbar uh() {
        return (Toolbar) this.d.a(this, j[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5c vh(hib hibVar, View view, c5c c5cVar) {
        z65.h(hibVar, "this$0");
        z65.h(view, "<anonymous parameter 0>");
        z65.h(c5cVar, "insets");
        n45 f2 = c5cVar.f(c5c.m.a());
        z65.g(f2, "getInsets(...)");
        n45 f3 = c5cVar.f(c5c.m.d());
        z65.g(f3, "getInsets(...)");
        int i2 = f2.d;
        if (i2 > 0) {
            i2 -= f3.d;
        }
        int i3 = i2;
        View view2 = hibVar.getView();
        if (view2 != null) {
            p45.l(view2, 0, 0, 0, i3, 7, null);
        }
        return c5cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wh(hib hibVar, View view) {
        z65.h(hibVar, "this$0");
        hibVar.finish();
    }

    private final void xh() {
        uh().getMenu().clear();
        uh().x(zz8.search_menu);
        View actionView = uh().getMenu().findItem(by8.action_search).getActionView();
        z65.f(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        this.h = searchView;
        SearchView searchView2 = null;
        if (searchView == null) {
            z65.z("searchView");
            searchView = null;
        }
        searchView.setQueryHint("Найти тоггл");
        SearchView searchView3 = this.h;
        if (searchView3 == null) {
            z65.z("searchView");
            searchView3 = null;
        }
        ImageView imageView = (ImageView) searchView3.findViewById(ay8.D);
        imageView.setImageResource(mx8.ic_search);
        Context context = searchView3.getContext();
        int i2 = mw8.c;
        imageView.setColorFilter(iu1.c(context, i2));
        ((ImageView) searchView3.findViewById(ay8.E)).setColorFilter(iu1.c(searchView3.getContext(), i2));
        SearchView searchView4 = this.h;
        if (searchView4 == null) {
            z65.z("searchView");
        } else {
            searchView2 = searchView4;
        }
        searchView2.setOnQueryTextListener(new e());
    }

    @Override // defpackage.jib
    public void H2(l6<bib> l6Var) {
        z65.h(l6Var, "toggles");
        rh().setAdapter(new k6.a(new k6.a(new k6(l6Var), f.a, new xhb(new j()), g.a).b(), h.a, new aib(), i.a).b().d());
    }

    @Override // defpackage.jib
    public void finish() {
        getParentFragmentManager().g1();
    }

    @Override // defpackage.f70
    protected void ih(View view) {
        z65.h(view, "rootView");
        View decorView = requireActivity().getWindow().getDecorView();
        decorView.setFitsSystemWindows(true);
        syb.I0(decorView, new h77() { // from class: fib
            @Override // defpackage.h77
            public final c5c a(View view2, c5c c5cVar) {
                c5c vh;
                vh = hib.vh(hib.this, view2, c5cVar);
                return vh;
            }
        });
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        rh().setLayoutManager(new LinearLayoutManager(getContext()));
        uh().setTitle("Локальные рубильники");
        uh().setNavigationOnClickListener(new View.OnClickListener() { // from class: gib
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hib.wh(hib.this, view2);
            }
        });
        xh();
        oma.a(ph(), new a());
        oma.a(sh(), new b());
        oma.a(th(), new c());
    }

    @Override // defpackage.jib
    public void y() {
        androidx.fragment.app.d requireActivity = requireActivity();
        z65.f(requireActivity, "null cannot be cast to non-null type com.dodopizza.presentation.activities.BaseActivityView");
        ((y60) requireActivity).y();
    }
}
