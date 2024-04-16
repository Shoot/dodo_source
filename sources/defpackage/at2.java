package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k6;
import defpackage.ts2;
import java.util.List;
import java.util.Set;
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
import ru.dodopizza.app.presentation.checkout.deferredtime.DeferredTimePresenter;
import ru.dodopizza.app.presentation.checkout.deferredtime.adapter.DeferredTimeIntervalViewHolder;
/* compiled from: DeferredTimeFragment.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 G2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001HB\u0007¢\u0006\u0004\bE\u0010FJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0016\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016R\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u001e\u001a\u0004\b3\u00104R(\u0010>\u001a\b\u0012\u0004\u0012\u000207068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R#\u0010D\u001a\n ?*\u0004\u0018\u000107078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006I"}, d2 = {"Lat2;", "Lc70;", "Lrt2;", "Lw50;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "", "onBackPressed", "", "position", "y5", "", "Lms2;", "dataSet", "Q6", "x6", "b", "C", "qe", "m3", "", "warning", "we", "Landroidx/appcompat/widget/Toolbar;", Image.TYPE_HIGH, "Lk79;", "zh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/TextView;", "i", "Ah", "()Landroid/widget/TextView;", "workloadWarning", "Landroidx/recyclerview/widget/RecyclerView;", "j", "yh", "()Landroidx/recyclerview/widget/RecyclerView;", "timePickerRecycler", "Landroid/widget/ViewSwitcher;", "k", "vh", "()Landroid/widget/ViewSwitcher;", "loadingSwitcher", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "l", "getSnackbarAnchor", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "snackbarAnchor", "Las8;", "Lru/dodopizza/app/presentation/checkout/deferredtime/DeferredTimePresenter;", Image.TYPE_MEDIUM, "Las8;", "xh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "n", "Lmoxy/ktx/MoxyKtxDelegate;", "wh", "()Lru/dodopizza/app/presentation/checkout/deferredtime/DeferredTimePresenter;", "presenter", "<init>", "()V", "o", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: at2  reason: default package */
/* loaded from: classes4.dex */
public final class at2 extends c70 implements rt2, w50 {
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    public as8<DeferredTimePresenter> m;
    private final MoxyKtxDelegate n;
    static final /* synthetic */ je5<Object>[] p = {bc9.f(new ar8(at2.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(at2.class, "workloadWarning", "getWorkloadWarning()Landroid/widget/TextView;", 0)), bc9.f(new ar8(at2.class, "timePickerRecycler", "getTimePickerRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(at2.class, "loadingSwitcher", "getLoadingSwitcher()Landroid/widget/ViewSwitcher;", 0)), bc9.f(new ar8(at2.class, "snackbarAnchor", "getSnackbarAnchor()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", 0)), bc9.f(new ar8(at2.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/checkout/deferredtime/DeferredTimePresenter;", 0))};
    public static final a o = new a(null);

    /* compiled from: DeferredTimeFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0011"}, d2 = {"Lat2$a;", "", "Lbt2;", "data", "Lat2;", "a", "", "EXTRA_DEFERRED_TIME_STATE", "Ljava/lang/String;", "EXTRA_EXPECTED_MINUTES_TO_RECEIVE_ASAP", "EXTRA_IS_RESTAURANT_MVP", "", "SWITCHER_CONTENT_INDEX", "I", "SWITCHER_LOADING_INDEX", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: at2$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final at2 a(bt2 bt2Var) {
            z65.h(bt2Var, "data");
            return (at2) y64.d(new at2(), bi0.c(bi0.d("extra_deferred_time_state", bt2Var.a()), bi0.d("extra_is_restaurant_mvp", Boolean.valueOf(bt2Var.c())), bi0.d("extra_expected_minutes_to_receive_asap", Integer.valueOf(bt2Var.b()))));
        }
    }

    /* compiled from: DeferredTimeFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/checkout/deferredtime/DeferredTimePresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/checkout/deferredtime/DeferredTimePresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: at2$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<DeferredTimePresenter> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final DeferredTimePresenter invoke() {
            return at2.this.xh().get();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: at2$c */
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
            return Boolean.valueOf(obj instanceof ms2);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: at2$d */
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
            Object newInstance = DeferredTimeIntervalViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: DeferredTimeFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lms2;", "timeVO", "", "a", "(Lms2;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: at2$e */
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function1<ms2, Unit> {
        e() {
            super(1);
        }

        public final void a(ms2 ms2Var) {
            z65.h(ms2Var, "timeVO");
            at2.this.wh().t(ms2Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ms2 ms2Var) {
            a(ms2Var);
            return Unit.a;
        }
    }

    public at2() {
        super(R.layout.fragment_deferred_time);
        this.h = kb0.e(this, R.id.deferred_time_toolbar);
        this.i = kb0.e(this, R.id.deferred_time_workload_warning);
        this.j = kb0.e(this, R.id.deferred_time_list);
        this.k = kb0.e(this, R.id.deferred_time_view_switcher);
        this.l = kb0.e(this, R.id.snackbar_anchor);
        b bVar = new b();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.n = new MoxyKtxDelegate(mvpDelegate, DeferredTimePresenter.class.getName() + ".presenter", bVar);
    }

    private final TextView Ah() {
        return (TextView) this.i.a(this, p[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bh(at2 at2Var, View view) {
        z65.h(at2Var, "this$0");
        at2Var.wh().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ch(at2 at2Var, int i) {
        z65.h(at2Var, "this$0");
        at2Var.yh().scrollToPosition(i);
    }

    private final ViewSwitcher vh() {
        return (ViewSwitcher) this.k.a(this, p[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeferredTimePresenter wh() {
        return (DeferredTimePresenter) this.n.getValue(this, p[5]);
    }

    private final RecyclerView yh() {
        return (RecyclerView) this.j.a(this, p[2]);
    }

    private final Toolbar zh() {
        return (Toolbar) this.h.a(this, p[0]);
    }

    @Override // defpackage.rt2
    public void C() {
        vh().setDisplayedChild(0);
    }

    @Override // defpackage.rt2
    public void Q6(List<ms2> list) {
        z65.h(list, "dataSet");
        e eVar = new e();
        yh().setAdapter(new k6.a(new k6(list), c.a, new ft2(eVar), d.a).b().d());
    }

    @Override // defpackage.rt2
    public void b() {
        vh().setDisplayedChild(1);
    }

    @Override // defpackage.rt2
    public void m3() {
        un3.k(Ah());
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        wh().onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Object obj;
        boolean z;
        Object obj2;
        Object obj3;
        Set<String> keySet;
        ts2.a m3 = ((CheckoutComponent) getComponentDependenciesRegistry().a(bc9.b(CheckoutComponent.class))).m3();
        Bundle arguments = getArguments();
        Integer num = null;
        if (arguments == null || (obj = arguments.get("extra_deferred_time_state")) == null) {
            obj = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (keySet = arguments2.keySet()) != null) {
            z = keySet.contains("extra_deferred_time_state");
        } else {
            z = false;
        }
        if (obj != null && !(obj instanceof pt2)) {
            throw new ClassCastException("Property extra_deferred_time_state has different class type");
        } else if (obj == null && !z) {
            throw new IllegalArgumentException("Argument with key = extra_deferred_time_state not found in bundle");
        } else if (obj != null) {
            ts2.a c2 = m3.c((pt2) obj);
            Bundle arguments3 = getArguments();
            if (arguments3 == null || (obj2 = arguments3.get("extra_is_restaurant_mvp")) == null) {
                obj2 = null;
            }
            if (obj2 != null && !(obj2 instanceof Boolean)) {
                throw new ClassCastException("Property extra_is_restaurant_mvp has different class type");
            } else if (obj2 != null) {
                ts2.a d2 = c2.d(((Boolean) obj2).booleanValue());
                Bundle arguments4 = getArguments();
                if (arguments4 != null && (obj3 = arguments4.get("extra_expected_minutes_to_receive_asap")) != null) {
                    num = obj3;
                }
                if (num != null && !(num instanceof Integer)) {
                    throw new ClassCastException("Property extra_expected_minutes_to_receive_asap has different class type");
                } else if (num != null) {
                    d2.b(num.intValue()).a().a(this);
                    super.onCreate(bundle);
                } else {
                    throw new IllegalArgumentException("Argument with key = extra_expected_minutes_to_receive_asap not found in bundle");
                }
            } else {
                throw new IllegalArgumentException("Argument with key = extra_is_restaurant_mvp not found in bundle");
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type ru.dodopizza.app.presentation.checkout.state.DeferredTimeState");
        }
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        ph();
        d70.a(this, false);
        zh().setNavigationOnClickListener(new View.OnClickListener() { // from class: zs2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                at2.Bh(at2.this, view2);
            }
        });
        yh().setHasFixedSize(true);
        yh().setLayoutManager(new LinearLayoutManager(requireContext()));
        yh().addItemDecoration(new eyb(12, 4, 0, 4, null));
    }

    @Override // defpackage.rt2
    public void qe() {
        zh().setTitle(getString(R.string.deferred_time_delivery_title));
    }

    @Override // defpackage.rt2
    public void we(String str) {
        z65.h(str, "warning");
        Ah().setText(str);
    }

    @Override // defpackage.rt2
    public void x6() {
        zh().setTitle(getString(R.string.deferred_time_carryout_title));
    }

    public final as8<DeferredTimePresenter> xh() {
        as8<DeferredTimePresenter> as8Var = this.m;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.rt2
    public void y5(final int i) {
        yh().postDelayed(new Runnable() { // from class: ys2
            @Override // java.lang.Runnable
            public final void run() {
                at2.Ch(at2.this, i);
            }
        }, 100L);
    }
}
