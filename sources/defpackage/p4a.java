package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.onboarding.feature.selectcountry.SelectCountryDependencies;
import com.dodopizza.onboarding.feature.selectcountry.presentation.CountryVH;
import com.dodopizza.onboarding.feature.selectcountry.presentation.SelectCountryPresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k6;
import defpackage.m4a;
import defpackage.tmb;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: SelectCountryFragment.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u0003:\u00019B\u0007¢\u0006\u0004\b6\u00107J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010/\u001a\b\u0012\u0004\u0012\u00020(0'8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R#\u00105\u001a\n 0*\u0004\u0018\u00010(0(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u0006:"}, d2 = {"Lp4a;", "Lf70;", "Lc5a;", "Lw50;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "", "Lzy1;", "items", "Ie", "p4", "Gc", "", "onBackPressed", "Landroidx/recyclerview/widget/RecyclerView;", com.huawei.hms.opendevice.c.a, "Lk79;", "rh", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/appcompat/widget/Toolbar;", DateTokenConverter.CONVERTER_KEY, "sh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/TextView;", com.huawei.hms.push.e.a, "oh", "()Landroid/widget/TextView;", "countriesTitle", "Ll6;", "f", "Ll6;", "countriesList", "Las8;", "Lcom/dodopizza/onboarding/feature/selectcountry/presentation/SelectCountryPresenter;", "g", "Las8;", "qh", "()Las8;", "setPresenterProvider$onboarding_release", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", Image.TYPE_HIGH, "Lmoxy/ktx/MoxyKtxDelegate;", "ph", "()Lcom/dodopizza/onboarding/feature/selectcountry/presentation/SelectCountryPresenter;", "presenter", "<init>", "()V", "i", "a", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: p4a  reason: default package */
/* loaded from: classes2.dex */
public final class p4a extends f70 implements c5a, w50 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final l6<zy1> f;
    public as8<SelectCountryPresenter> g;
    private final MoxyKtxDelegate h;
    static final /* synthetic */ je5<Object>[] j = {bc9.f(new ar8(p4a.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(p4a.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(p4a.class, "countriesTitle", "getCountriesTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(p4a.class, "presenter", "getPresenter()Lcom/dodopizza/onboarding/feature/selectcountry/presentation/SelectCountryPresenter;", 0))};
    public static final a i = new a(null);

    /* compiled from: SelectCountryFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lp4a$a;", "", "Ln4a;", "data", "Lp4a;", "a", "", "COUNTRIES_TITLE_START_MARGIN", "I", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "<init>", "()V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: p4a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p4a a(n4a n4aVar) {
            z65.h(n4aVar, "data");
            return (p4a) y64.d(new p4a(), bi0.c(bi0.d("data", n4aVar)));
        }
    }

    /* compiled from: SelectCountryFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzy1;", tmb.c.COUNTRY_JSON_NAME, "", "a", "(Lzy1;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: p4a$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<zy1, Unit> {
        b() {
            super(1);
        }

        public final void a(zy1 zy1Var) {
            z65.h(zy1Var, tmb.c.COUNTRY_JSON_NAME);
            p4a.this.ph().v(zy1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(zy1 zy1Var) {
            a(zy1Var);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: p4a$c */
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
            return Boolean.valueOf(obj instanceof zy1);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: p4a$d */
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
            Object newInstance = CountryVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: SelectCountryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/onboarding/feature/selectcountry/presentation/SelectCountryPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/onboarding/feature/selectcountry/presentation/SelectCountryPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: p4a$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function0<SelectCountryPresenter> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SelectCountryPresenter invoke() {
            return p4a.this.qh().get();
        }
    }

    /* compiled from: SelectCountryFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lzy1;", "old", "new", "Landroidx/recyclerview/widget/e$e;", "a", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/e$e;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: p4a$f */
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function2<List<? extends zy1>, List<? extends zy1>, e.C0047e> {
        public static final f a = new f();

        f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final e.C0047e invoke(List<zy1> list, List<zy1> list2) {
            z65.h(list, "old");
            z65.h(list2, "new");
            e.C0047e b = androidx.recyclerview.widget.e.b(new az1(list, list2));
            z65.g(b, "calculateDiff(...)");
            return b;
        }
    }

    public p4a() {
        super(fz8.fragment_select_country);
        this.c = kb0.e(this, fy8.country_list);
        this.d = kb0.e(this, fy8.select_country_toolbar);
        this.e = kb0.e(this, fy8.countries);
        this.f = new l6<>(null, 1, null);
        e eVar = new e();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.h = new MoxyKtxDelegate(mvpDelegate, SelectCountryPresenter.class.getName() + ".presenter", eVar);
    }

    private final TextView oh() {
        return (TextView) this.e.a(this, j[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SelectCountryPresenter ph() {
        return (SelectCountryPresenter) this.h.getValue(this, j[3]);
    }

    private final RecyclerView rh() {
        return (RecyclerView) this.c.a(this, j[0]);
    }

    private final Toolbar sh() {
        return (Toolbar) this.d.a(this, j[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void th(p4a p4aVar, View view) {
        z65.h(p4aVar, "this$0");
        p4aVar.ph().u();
    }

    @Override // defpackage.c5a
    public void Gc() {
        sh().setNavigationIcon((Drawable) null);
        TextView oh = oh();
        ViewGroup.LayoutParams layoutParams = oh.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(jx9.a.a(16));
            oh.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // defpackage.c5a
    public void Ie(List<zy1> list) {
        z65.h(list, "items");
        this.f.Z(list, f.a);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        ph().onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        m4a.b a2 = m4a.a.a();
        SelectCountryDependencies selectCountryDependencies = (SelectCountryDependencies) getComponentDependenciesRegistry().a(bc9.b(SelectCountryDependencies.class));
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
        if (obj != null && !(obj instanceof n4a)) {
            throw new ClassCastException("Property data has different class type");
        } else if (obj != null) {
            a2.a(selectCountryDependencies, (n4a) obj).a(this);
            super.onCreate(bundle);
        } else {
            throw new IllegalArgumentException("Argument with key = data not found in bundle");
        }
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        rh().setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView rh = rh();
        v99 v99Var = v99.a;
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        rh.addItemDecoration(v99.b(v99Var, requireContext, 0, 2, null));
        RecyclerView rh2 = rh();
        k6 k6Var = new k6(this.f);
        new k6.a(k6Var, c.a, new vy1(new b()), d.a).b();
        rh2.setAdapter(k6Var.d());
    }

    @Override // defpackage.c5a
    public void p4() {
        sh().setNavigationIcon(ax8.a);
        sh().setNavigationOnClickListener(new View.OnClickListener() { // from class: o4a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p4a.th(p4a.this, view);
            }
        });
        TextView oh = oh();
        ViewGroup.LayoutParams layoutParams = oh.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            oh.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final as8<SelectCountryPresenter> qh() {
        as8<SelectCountryPresenter> as8Var = this.g;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
