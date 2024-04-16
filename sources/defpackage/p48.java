package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.actions.SearchIntents;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k6;
import defpackage.l48;
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
import ru.dodopizza.app.di.AppComponent;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.di.onboarding.OnboardingComponent;
import ru.dodopizza.app.presentation.phonenumberlogin.phoneprefixlist.PhonePrefixListPresenter;
import ru.dodopizza.app.presentation.phonenumberlogin.phoneprefixlist.PhonePrefixVH;
/* compiled from: PhonePrefixListFragment.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 B2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001CB\u0007¢\u0006\u0004\b@\u0010AJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001a\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u0016\u0010\u0018\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010(R\u001b\u0010,\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010(R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R(\u00109\u001a\b\u0012\u0004\u0012\u000202018\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R#\u0010?\u001a\n :*\u0004\u0018\u000102028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006D"}, d2 = {"Lp48;", "Lf70;", "Lu48;", "Lw50;", "Lf63;", "Ch", "", "wh", "Ah", "zh", "", "show", "Dh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "La58;", "prefixes", "u", "onBackPressed", "Landroidx/recyclerview/widget/RecyclerView;", com.huawei.hms.opendevice.c.a, "Lk79;", "th", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/appcompat/widget/Toolbar;", DateTokenConverter.CONVERTER_KEY, "vh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/TextView;", com.huawei.hms.push.e.a, "uh", "()Landroid/widget/TextView;", "title", "f", "qh", "emptySearch", "Landroidx/appcompat/widget/SearchView;", "g", "Landroidx/appcompat/widget/SearchView;", "searchView", "Las8;", "Lru/dodopizza/app/presentation/phonenumberlogin/phoneprefixlist/PhonePrefixListPresenter;", Image.TYPE_HIGH, "Las8;", "sh", "()Las8;", "setPresenterProvider$app_prodRelease", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "i", "Lmoxy/ktx/MoxyKtxDelegate;", "rh", "()Lru/dodopizza/app/presentation/phonenumberlogin/phoneprefixlist/PhonePrefixListPresenter;", "presenter", "<init>", "()V", "j", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: p48  reason: default package */
/* loaded from: classes4.dex */
public final class p48 extends f70 implements u48, w50 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private SearchView g;
    public as8<PhonePrefixListPresenter> h;
    private final MoxyKtxDelegate i;
    static final /* synthetic */ je5<Object>[] k = {bc9.f(new ar8(p48.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(p48.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(p48.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(p48.class, "emptySearch", "getEmptySearch()Landroid/widget/TextView;", 0)), bc9.f(new ar8(p48.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/phonenumberlogin/phoneprefixlist/PhonePrefixListPresenter;", 0))};
    public static final a j = new a(null);

    /* compiled from: PhonePrefixListFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lp48$a;", "", "Lb7a;", "args", "Lp48;", "a", "", "EXTRA_KEY_ARGS", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: p48$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p48 a(b7a b7aVar) {
            z65.h(b7aVar, "args");
            return (p48) y64.d(new p48(), bi0.c(bi0.d("extra_key_args", b7aVar)));
        }
    }

    /* compiled from: PhonePrefixListFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"p48$b", "Landroidx/appcompat/widget/SearchView$m;", "", "newText", "", "a", SearchIntents.EXTRA_QUERY, "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: p48$b */
    /* loaded from: classes4.dex */
    public static final class b implements SearchView.m {
        b() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean a(String str) {
            p48.this.rh().t(str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean b(String str) {
            return false;
        }
    }

    /* compiled from: PhonePrefixListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/phonenumberlogin/phoneprefixlist/PhonePrefixListPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/phonenumberlogin/phoneprefixlist/PhonePrefixListPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: p48$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<PhonePrefixListPresenter> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final PhonePrefixListPresenter invoke() {
            return p48.this.sh().get();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: p48$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function1<Object, Boolean> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof a58);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: p48$e */
    /* loaded from: classes4.dex */
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
            Object newInstance = PhonePrefixVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: PhonePrefixListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La58;", "prefix", "", "a", "(La58;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: p48$f */
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function1<a58, Unit> {
        f() {
            super(1);
        }

        public final void a(a58 a58Var) {
            z65.h(a58Var, "prefix");
            p48.this.rh().u(a58Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(a58 a58Var) {
            a(a58Var);
            return Unit.a;
        }
    }

    public p48() {
        super(R.layout.fragment_phone_prefix_list);
        this.c = kb0.e(this, R.id.phone_prefix_list);
        this.d = kb0.e(this, R.id.phone_prefix_toolbar);
        this.e = kb0.e(this, R.id.phone_prefix_title);
        this.f = kb0.e(this, R.id.phone_prefix_search_empty);
        c cVar = new c();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.i = new MoxyKtxDelegate(mvpDelegate, PhonePrefixListPresenter.class.getName() + ".presenter", cVar);
    }

    private final void Ah() {
        un3.e(uh());
        Dh(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bh(p48 p48Var, View view) {
        z65.h(p48Var, "this$0");
        p48Var.rh().onBackPressed();
    }

    private final f63 Ch() {
        if (getParentFragment() instanceof a6a) {
            return ((OnboardingComponent) getComponentDependenciesRegistry().a(bc9.b(OnboardingComponent.class))).b();
        }
        return ((LocalityComponent) getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).b();
    }

    private final void Dh(boolean z) {
        Drawable e2;
        Toolbar vh = vh();
        Drawable drawable = null;
        if (z && (e2 = iu1.e(vh().getContext(), R.drawable.ic_cross)) != null) {
            e2.setTint(iu1.c(vh().getContext(), R.color.textIconPrimaryColor));
            drawable = e2;
        }
        vh.setNavigationIcon(drawable);
    }

    private final TextView qh() {
        return (TextView) this.f.a(this, k[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhonePrefixListPresenter rh() {
        return (PhonePrefixListPresenter) this.i.getValue(this, k[4]);
    }

    private final RecyclerView th() {
        return (RecyclerView) this.c.a(this, k[0]);
    }

    private final TextView uh() {
        return (TextView) this.e.a(this, k[2]);
    }

    private final Toolbar vh() {
        return (Toolbar) this.d.a(this, k[1]);
    }

    private final void wh() {
        View actionView = vh().getMenu().findItem(R.id.action_search).getActionView();
        z65.f(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        this.g = searchView;
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
        searchView.setQueryHint(searchView.getResources().getString(R.string.phone_prefix_list_search_hint));
        searchView.setOnQueryTextListener(new b());
        searchView.setOnSearchClickListener(new View.OnClickListener() { // from class: n48
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p48.xh(p48.this, view);
            }
        });
        searchView.setOnCloseListener(new SearchView.l() { // from class: o48
            @Override // androidx.appcompat.widget.SearchView.l
            public final boolean onClose() {
                boolean yh;
                yh = p48.yh(p48.this);
                return yh;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xh(p48 p48Var, View view) {
        z65.h(p48Var, "this$0");
        p48Var.Ah();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean yh(p48 p48Var) {
        z65.h(p48Var, "this$0");
        p48Var.zh();
        return false;
    }

    private final void zh() {
        un3.k(uh());
        un3.e(qh());
        Dh(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        l48.a u3 = ((AppComponent) getComponentDependenciesRegistry().a(bc9.b(AppComponent.class))).u3();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("extra_key_args")) == null) ? null : null;
        if (obj != null && !(obj instanceof b7a)) {
            throw new ClassCastException("Property extra_key_args has different class type");
        } else if (obj != null) {
            u3.c((b7a) obj).b(Ch()).a().a(this);
            super.onAttach(context);
        } else {
            throw new IllegalArgumentException("Argument with key = extra_key_args not found in bundle");
        }
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        rh().onBackPressed();
        return true;
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView th = th();
        v99 v99Var = v99.a;
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        th.addItemDecoration(v99.b(v99Var, requireContext, 0, 2, null));
        Toolbar vh = vh();
        vh.setNavigationOnClickListener(new View.OnClickListener() { // from class: m48
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                p48.Bh(p48.this, view2);
            }
        });
        vh.getMenu().clear();
        vh.x(R.menu.search_menu);
        Dh(true);
        wh();
    }

    public final as8<PhonePrefixListPresenter> sh() {
        as8<PhonePrefixListPresenter> as8Var = this.h;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.u48
    public void u(List<a58> list) {
        boolean O;
        int i;
        z65.h(list, "prefixes");
        th().setAdapter(new k6.a(new k6(list), d.a, new k48(new f()), e.a).b().d());
        TextView qh = qh();
        O = sc1.O(list);
        if (O) {
            i = 8;
        } else {
            i = 0;
        }
        qh.setVisibility(i);
    }
}
