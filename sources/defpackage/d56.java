package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cloud.mindbox.mobile_sdk.MindboxConfiguration;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.z46;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter;
import ru.dodopizza.mindbox.model.MindboxProperties;
/* compiled from: MainScreenFragment.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001dB\u0007¢\u0006\u0004\bb\u0010cJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\f\u0010\u0014\u001a\u00020\u0013*\u00020\u0007H\u0002J\u0012\u0010\u0016\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\tH\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u001a\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\tH\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\tH\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0007H\u0016J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0007H\u0016J\u0018\u0010-\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0016J\u0018\u00101\u001a\u00020\u00052\u0006\u0010/\u001a\u00020.2\u0006\u0010,\u001a\u000200H\u0016J\u0010\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u000202H\u0016J\u0018\u00106\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+2\u0006\u00105\u001a\u00020)H\u0016J\b\u00108\u001a\u000207H\u0016J\u0010\u0010;\u001a\u00020\u00052\u0006\u0010:\u001a\u000209H\u0016J\b\u0010<\u001a\u00020\u0005H\u0016J\u0010\u0010?\u001a\u00020\u00052\u0006\u0010>\u001a\u00020=H\u0016J\b\u0010@\u001a\u00020\u0005H\u0016J\b\u0010A\u001a\u00020\u0005H\u0016R\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR \u0010L\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u0002070H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR(\u0010U\u001a\b\u0012\u0004\u0012\u00020N0M8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR#\u0010[\u001a\n V*\u0004\u0018\u00010N0N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R \u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010K¨\u0006e"}, d2 = {"Ld56;", "Lf70;", "Lp56;", "Lbl2;", "Lw50;", "", "zh", "Ln56;", "screenTab", "", "number", "Ch", "wh", "currentTab", "newTab", "Dh", "tab", "Landroidx/fragment/app/Fragment;", "xh", "", "Eh", "menuResId", "sh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "messagesCount", Image.TYPE_HIGH, "i", "goodsCount", "Pa", "yg", "menuTab", "C7", "nextTab", "f8", "Lce0;", "specialOffer", "Lcq8;", "sender", "yb", "Lp67;", "personalOffer", "Lh18;", "X5", "Lrb1;", "collaborationPromo", "g4", "promoCodeOffer", "A6", "", "onBackPressed", "", "data", "ve", "ad", "Lru/dodopizza/mindbox/model/MindboxProperties;", "mindboxProps", "Kc", "hd", "g6", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", com.huawei.hms.opendevice.c.a, "Lk79;", "th", "()Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "bottomNavigation", "Lkotlin/Function1;", "Landroid/view/MenuItem;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function1;", "navigationItemSelectedListener", "Las8;", "Lru/dodopizza/app/presentation/mainscreen/MainScreenPresenter;", com.huawei.hms.push.e.a, "Las8;", "vh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "f", "Lmoxy/ktx/MoxyKtxDelegate;", "uh", "()Lru/dodopizza/app/presentation/mainscreen/MainScreenPresenter;", "presenter", "Lkotlin/Function0;", "Ltia;", "g", "Lkotlin/jvm/functions/Function0;", "shoppingCartFragmentFactory", "tabsFactoryFragment", "<init>", "()V", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: d56  reason: default package */
/* loaded from: classes4.dex */
public final class d56 extends f70 implements p56, bl2, w50 {
    private final k79 c;
    private final Function1<MenuItem, Boolean> d;
    public as8<MainScreenPresenter> e;
    private final MoxyKtxDelegate f;
    private Function0<? extends tia> g;
    private final Function1<n56, Fragment> h;
    static final /* synthetic */ je5<Object>[] j = {bc9.f(new ar8(d56.class, "bottomNavigation", "getBottomNavigation()Lcom/google/android/material/bottomnavigation/BottomNavigationView;", 0)), bc9.f(new ar8(d56.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/mainscreen/MainScreenPresenter;", 0))};
    public static final a i = new a(null);

    /* compiled from: MainScreenFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Ld56$a;", "", "Ln56;", "initialTab", "Ld56;", "a", "", "INITIAL_TAB", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: d56$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d56 a(n56 n56Var) {
            z65.h(n56Var, "initialTab");
            return (d56) y64.d(new d56(), bi0.c(bi0.d("initial_tab", n56Var)));
        }
    }

    /* compiled from: MainScreenFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: d56$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[n56.values().length];
            try {
                iArr[n56.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n56.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n56.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MainScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltia;", "a", "()Ltia;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: d56$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<tia> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final tia invoke() {
            return tia.q5.a();
        }
    }

    /* compiled from: MainScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Luia;", "a", "()Luia;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: d56$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function0<uia> {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final uia invoke() {
            return uia.t5.a();
        }
    }

    /* compiled from: MainScreenFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MenuItem;", "menuItem", "", "a", "(Landroid/view/MenuItem;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: d56$e */
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function1<MenuItem, Boolean> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(MenuItem menuItem) {
            z65.h(menuItem, "menuItem");
            d56.this.uh().K(d56.this.sh(menuItem.getItemId()), false);
            return Boolean.TRUE;
        }
    }

    /* compiled from: MainScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/mainscreen/MainScreenPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/mainscreen/MainScreenPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: d56$f */
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function0<MainScreenPresenter> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final MainScreenPresenter invoke() {
            return d56.this.vh().get();
        }
    }

    /* compiled from: MainScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltia;", "a", "()Ltia;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: d56$g */
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function0<tia> {
        public static final g a = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final tia invoke() {
            return tia.q5.a();
        }
    }

    /* compiled from: MainScreenFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln56;", "tab", "Landroidx/fragment/app/Fragment;", "a", "(Ln56;)Landroidx/fragment/app/Fragment;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: d56$h */
    /* loaded from: classes4.dex */
    static final class h extends ej5 implements Function1<n56, Fragment> {

        /* compiled from: MainScreenFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: d56$h$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[n56.values().length];
                try {
                    iArr[n56.a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[n56.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[n56.c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Fragment invoke(n56 n56Var) {
            z65.h(n56Var, "tab");
            int i = a.$EnumSwitchMapping$0[n56Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return (Fragment) d56.this.g.invoke();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return ms1.u.a();
            }
            return b44.g5.a();
        }
    }

    public d56() {
        super(R.layout.fragment_main);
        this.c = kb0.e(this, R.id.main_screen_navigation);
        this.d = new e();
        f fVar = new f();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.f = new MoxyKtxDelegate(mvpDelegate, MainScreenPresenter.class.getName() + ".presenter", fVar);
        this.g = g.a;
        this.h = new h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Ah(Function1 function1, MenuItem menuItem) {
        z65.h(function1, "$tmp0");
        z65.h(menuItem, "p0");
        return ((Boolean) function1.invoke(menuItem)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bh(d56 d56Var, MenuItem menuItem) {
        z65.h(d56Var, "this$0");
        z65.h(menuItem, "menuItem");
        d56Var.uh().K(d56Var.sh(menuItem.getItemId()), true);
    }

    private final void Ch(n56 n56Var, int i2) {
        com.google.android.material.badge.a f2 = th().f(e56.a(n56Var));
        z65.g(f2, "getOrCreateBadge(...)");
        f2.K(true);
        f2.H(mpb.a(4.0f, requireContext()));
        f2.z(iu1.c(requireContext(), R.color.surfaceDodoColor));
        f2.D(3);
        f2.E(i2);
    }

    private final void Dh(n56 n56Var, n56 n56Var2) {
        p y = getChildFragmentManager().p().y(R.anim.alpha, R.anim.alpha_out);
        z65.g(y, "setCustomAnimations(...)");
        String Eh = Eh(n56Var2);
        List<Fragment> y0 = getChildFragmentManager().y0();
        z65.g(y0, "getFragments(...)");
        if (!y0.isEmpty()) {
            Fragment l0 = getChildFragmentManager().l0(Eh(n56Var));
            if (l0 != null) {
                y.p(l0);
            }
            Fragment l02 = getChildFragmentManager().l0(Eh);
            if (l02 != null) {
                y.j(l02);
            } else {
                y.c(R.id.main_screen_fragment_container, xh(n56Var2), Eh);
            }
            y.k();
            return;
        }
        y.c(R.id.main_screen_fragment_container, xh(n56Var2), Eh).k();
    }

    private final String Eh(n56 n56Var) {
        int i2 = b.$EnumSwitchMapping$0[n56Var.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return "shoping_cart_fragment";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "pizzerias_fragment";
        }
        return "food_menu_fragment";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n56 sh(int i2) {
        if (i2 != R.id.menu_nav) {
            if (i2 != R.id.shopping_cart_nav) {
                if (i2 == R.id.store_nav) {
                    return n56.b;
                }
                throw new IllegalStateException(("No tab associated with menuResId: " + i2).toString());
            }
            return n56.c;
        }
        return n56.a;
    }

    private final BottomNavigationView th() {
        return (BottomNavigationView) this.c.a(this, j[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MainScreenPresenter uh() {
        return (MainScreenPresenter) this.f.getValue(this, j[1]);
    }

    private final void wh(n56 n56Var) {
        com.google.android.material.badge.a e2 = th().e(e56.a(n56Var));
        if (e2 != null) {
            e2.K(false);
            e2.c();
        }
    }

    private final Fragment xh(n56 n56Var) {
        return this.h.invoke(n56Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean yh(Function1 function1, MenuItem menuItem) {
        z65.h(function1, "$tmp0");
        z65.h(menuItem, "p0");
        return ((Boolean) function1.invoke(menuItem)).booleanValue();
    }

    private final void zh() {
        th().setItemIconTintList(null);
        BottomNavigationView th = th();
        final Function1<MenuItem, Boolean> function1 = this.d;
        th.setOnNavigationItemSelectedListener(new BottomNavigationView.c() { // from class: b56
            @Override // com.google.android.material.navigation.NavigationBarView.c
            public final boolean a(MenuItem menuItem) {
                boolean Ah;
                Ah = d56.Ah(Function1.this, menuItem);
                return Ah;
            }
        });
        th().setOnNavigationItemReselectedListener(new BottomNavigationView.b() { // from class: c56
            @Override // com.google.android.material.navigation.NavigationBarView.b
            public final void a(MenuItem menuItem) {
                d56.Bh(d56.this, menuItem);
            }
        });
    }

    @Override // defpackage.p56
    public void A6(cq8 cq8Var, ce0 ce0Var) {
        z65.h(cq8Var, "sender");
        z65.h(ce0Var, "promoCodeOffer");
        String string = getString(R.string.promocode_with_value, ce0Var.d());
        z65.g(string, "getString(...)");
        ira.n.d(ce0.b(ce0Var, null, null, string, null, null, 27, null), cq8Var).show(getChildFragmentManager(), "apply_promocode_fragment");
    }

    @Override // defpackage.p56
    public void C7(n56 n56Var) {
        z65.h(n56Var, "menuTab");
        th().setSelectedItemId(e56.a(n56Var));
    }

    @Override // defpackage.p56
    public void Kc(MindboxProperties mindboxProperties) {
        List<? extends qk6> e2;
        List<? extends qk6> e3;
        z65.h(mindboxProperties, "mindboxProps");
        String prevInstallationId = mindboxProperties.getPrevInstallationId();
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        MindboxConfiguration.a n = new MindboxConfiguration.a(requireContext, mindboxProperties.getBaseUrl(), mindboxProperties.getEndpointId()).n(false);
        if (prevInstallationId.length() > 0) {
            n.m(prevInstallationId);
        }
        if (mindboxProperties.isFMSPushService()) {
            mj6 mj6Var = mj6.a;
            Context requireContext2 = requireContext();
            z65.g(requireContext2, "requireContext(...)");
            MindboxConfiguration a2 = n.a();
            e3 = jc1.e(uj6.a);
            mj6Var.N(requireContext2, a2, e3);
            return;
        }
        mj6 mj6Var2 = mj6.a;
        Context requireContext3 = requireContext();
        z65.g(requireContext3, "requireContext(...)");
        MindboxConfiguration a3 = n.a();
        e2 = jc1.e(wj6.a);
        mj6Var2.N(requireContext3, a3, e2);
    }

    @Override // defpackage.p56
    public void Pa(int i2) {
        Ch(n56.c, i2);
    }

    @Override // defpackage.p56
    public void X5(p67 p67Var, h18 h18Var) {
        z65.h(p67Var, "personalOffer");
        z65.h(h18Var, "sender");
        ira.n.e(p67Var, i18.b(h18Var)).show(getChildFragmentManager(), "special_offer_fragment");
    }

    @Override // defpackage.p56
    public void ad() {
        b44 b44Var;
        Fragment l0 = getChildFragmentManager().l0(Eh(n56.a));
        if (l0 instanceof b44) {
            b44Var = (b44) l0;
        } else {
            b44Var = null;
        }
        if (b44Var != null) {
            b44Var.ui();
        }
    }

    @Override // defpackage.p56
    public void f8(n56 n56Var) {
        z65.h(n56Var, "nextTab");
        Dh(sh(th().getSelectedItemId()), n56Var);
    }

    @Override // defpackage.p56
    public void g4(rb1 rb1Var) {
        z65.h(rb1Var, "collaborationPromo");
        lb1.n.a(rb1Var).show(getChildFragmentManager(), "collaboration_promo_fragment");
    }

    @Override // defpackage.p56
    public void g6() {
        this.g = d.a;
    }

    @Override // defpackage.p56
    public void h(int i2) {
        Ch(n56.b, i2);
    }

    @Override // defpackage.p56
    public void hd() {
        this.g = c.a;
    }

    @Override // defpackage.p56
    public void i() {
        wh(n56.b);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z46.a k4 = ((LocalityComponent) getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).k4();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("initial_tab")) == null) ? null : null;
        if (obj != null && !(obj instanceof n56)) {
            throw new ClassCastException("Property initial_tab has different class type");
        } else if (obj != null) {
            k4.a((n56) obj).a(this);
            super.onAttach(context);
        } else {
            throw new IllegalArgumentException("Argument with key = initial_tab not found in bundle");
        }
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        uh().H(sh(th().getSelectedItemId()));
        return true;
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        zh();
    }

    @Override // defpackage.bl2
    public void ve(Object obj) {
        z65.h(obj, "data");
        if (obj instanceof vo2) {
            uh().Q((vo2) obj);
        } else if (obj instanceof n56) {
            n56 sh = sh(th().getSelectedItemId());
            th().setOnNavigationItemSelectedListener(null);
            n56 n56Var = (n56) obj;
            th().setSelectedItemId(e56.a(n56Var));
            BottomNavigationView th = th();
            final Function1<MenuItem, Boolean> function1 = this.d;
            th.setOnNavigationItemSelectedListener(new BottomNavigationView.c() { // from class: a56
                @Override // com.google.android.material.navigation.NavigationBarView.c
                public final boolean a(MenuItem menuItem) {
                    boolean yh;
                    yh = d56.yh(Function1.this, menuItem);
                    return yh;
                }
            });
            Dh(sh, n56Var);
        }
    }

    public final as8<MainScreenPresenter> vh() {
        as8<MainScreenPresenter> as8Var = this.e;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.p56
    public void yb(ce0 ce0Var, cq8 cq8Var) {
        z65.h(ce0Var, "specialOffer");
        z65.h(cq8Var, "sender");
        ira.n.d(ce0Var, cq8Var).show(getChildFragmentManager(), "bonus_action_fragment");
    }

    @Override // defpackage.p56
    public void yg() {
        wh(n56.c);
    }
}
