package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.buttons.DodoButton;
import com.dodopizza.profile.feature.profilelocalelist.ProfileLocaleListFeatureDependencies;
import com.dodopizza.profile.feature.profilelocalelist.presentation.LocaleVH;
import com.dodopizza.profile.feature.profilelocalelist.presentation.ProfileLocaleListPresenter;
import com.google.android.material.appbar.MaterialToolbar;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k6;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: ProfileLocaleListFragment.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u0003:\u00017B\u0007¢\u0006\u0004\b4\u00105J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R(\u0010-\u001a\b\u0012\u0004\u0012\u00020&0%8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R#\u00103\u001a\n .*\u0004\u0018\u00010&0&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00068"}, d2 = {"Lon8;", "Lf70;", "Lwn8;", "Lw50;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "", "Lct5;", "locales", "u", "", "onBackPressed", "Landroidx/recyclerview/widget/RecyclerView;", com.huawei.hms.opendevice.c.a, "Lk79;", "rh", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/google/android/material/appbar/MaterialToolbar;", DateTokenConverter.CONVERTER_KEY, "sh", "()Lcom/google/android/material/appbar/MaterialToolbar;", "toolbar", "Lcom/dodopizza/android/buttons/DodoButton;", com.huawei.hms.push.e.a, "oh", "()Lcom/dodopizza/android/buttons/DodoButton;", "doneBtn", "Ll6;", "f", "Ll6;", "localesAdapterList", "Las8;", "Lcom/dodopizza/profile/feature/profilelocalelist/presentation/ProfileLocaleListPresenter;", "g", "Las8;", "qh", "()Las8;", "setPresenterProvider$profile_release", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", Image.TYPE_HIGH, "Lmoxy/ktx/MoxyKtxDelegate;", "ph", "()Lcom/dodopizza/profile/feature/profilelocalelist/presentation/ProfileLocaleListPresenter;", "presenter", "<init>", "()V", "i", "a", "profile_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: on8  reason: default package */
/* loaded from: classes2.dex */
public final class on8 extends f70 implements wn8, w50 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final l6<ct5> f;
    public as8<ProfileLocaleListPresenter> g;
    private final MoxyKtxDelegate h;
    static final /* synthetic */ je5<Object>[] j = {bc9.f(new ar8(on8.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(on8.class, "toolbar", "getToolbar()Lcom/google/android/material/appbar/MaterialToolbar;", 0)), bc9.f(new ar8(on8.class, "doneBtn", "getDoneBtn()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(on8.class, "presenter", "getPresenter()Lcom/dodopizza/profile/feature/profilelocalelist/presentation/ProfileLocaleListPresenter;", 0))};
    public static final a i = new a(null);

    /* compiled from: ProfileLocaleListFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lon8$a;", "", "Lon8;", "a", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: on8$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final on8 a() {
            return new on8();
        }
    }

    /* compiled from: ProfileLocaleListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lct5;", "it", "", "a", "(Lct5;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: on8$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<ct5, Unit> {
        b() {
            super(1);
        }

        public final void a(ct5 ct5Var) {
            z65.h(ct5Var, "it");
            on8.this.ph().t(ct5Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ct5 ct5Var) {
            a(ct5Var);
            return Unit.a;
        }
    }

    /* compiled from: ProfileLocaleListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: on8$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            on8.this.ph().u();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: on8$d */
    /* loaded from: classes2.dex */
    public static final class d extends ej5 implements Function1<Object, Boolean> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof ct5);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: on8$e */
    /* loaded from: classes2.dex */
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
            Object newInstance = LocaleVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: ProfileLocaleListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/profile/feature/profilelocalelist/presentation/ProfileLocaleListPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/profile/feature/profilelocalelist/presentation/ProfileLocaleListPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: on8$f */
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function0<ProfileLocaleListPresenter> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ProfileLocaleListPresenter invoke() {
            return on8.this.qh().get();
        }
    }

    /* compiled from: ProfileLocaleListFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lct5;", "oldItems", "newItems", "Landroidx/recyclerview/widget/e$e;", "a", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/e$e;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: on8$g */
    /* loaded from: classes2.dex */
    static final class g extends ej5 implements Function2<List<? extends ct5>, List<? extends ct5>, e.C0047e> {
        public static final g a = new g();

        g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final e.C0047e invoke(List<ct5> list, List<ct5> list2) {
            z65.h(list, "oldItems");
            z65.h(list2, "newItems");
            e.C0047e b = androidx.recyclerview.widget.e.b(new ls5(list, list2));
            z65.g(b, "calculateDiff(...)");
            return b;
        }
    }

    public on8() {
        super(iz8.fragment_profile_locale_list);
        this.c = kb0.e(this, iy8.profile_locale_list);
        this.d = kb0.e(this, iy8.profile_locale_list_toolbar);
        this.e = kb0.e(this, iy8.profile_locale_list_done_button);
        this.f = new l6<>(null, 1, null);
        f fVar = new f();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.h = new MoxyKtxDelegate(mvpDelegate, ProfileLocaleListPresenter.class.getName() + ".presenter", fVar);
    }

    private final DodoButton oh() {
        return (DodoButton) this.e.a(this, j[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProfileLocaleListPresenter ph() {
        return (ProfileLocaleListPresenter) this.h.getValue(this, j[3]);
    }

    private final RecyclerView rh() {
        return (RecyclerView) this.c.a(this, j[0]);
    }

    private final MaterialToolbar sh() {
        return (MaterialToolbar) this.d.a(this, j[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void th(on8 on8Var, View view) {
        z65.h(on8Var, "this$0");
        on8Var.ph().s();
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        ph().s();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        mn8.a.a().a((ProfileLocaleListFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(ProfileLocaleListFeatureDependencies.class))).a(this);
        super.onCreate(bundle);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView rh = rh();
        v99 v99Var = v99.a;
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        rh.addItemDecoration(v99.b(v99Var, requireContext, 0, 2, null));
        RecyclerView rh2 = rh();
        k6 k6Var = new k6(this.f);
        new k6.a(k6Var, d.a, new js5(new b()), e.a).b();
        rh2.setAdapter(k6Var.d());
        sh().setNavigationOnClickListener(new View.OnClickListener() { // from class: nn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                on8.th(on8.this, view2);
            }
        });
        oma.a(oh(), new c());
    }

    public final as8<ProfileLocaleListPresenter> qh() {
        as8<ProfileLocaleListPresenter> as8Var = this.g;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.wn8
    public void u(List<ct5> list) {
        z65.h(list, "locales");
        this.f.Z(list, g.a);
    }
}
