package com.dodopizza.activeorder.feature.activeorderwidget.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.activeorder.feature.activeorderwidget.ActiveOrderFoodMenuFeatureDependencies;
import com.dodopizza.activeorder.feature.activeorderwidget.presentation.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: ActiveOrderFoodMenuFragment.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001RB\t\b\u0000¢\u0006\u0004\bO\u0010PJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0012H\u0016R\u001b\u0010\u0018\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u001cR\u001b\u0010#\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u0017R\u001b\u0010&\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u001cR\u001b\u0010)\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0015\u001a\u0004\b(\u0010\u001cR\u001b\u0010,\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0015\u001a\u0004\b+\u0010\u001cR\u001b\u0010/\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0015\u001a\u0004\b.\u0010\u001cR\u001b\u00102\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0015\u001a\u0004\b1\u0010\u0017R\u001b\u00105\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0015\u001a\u0004\b4\u0010\u001cR\u001b\u00108\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0015\u001a\u0004\b7\u0010\u001cR\u001b\u0010;\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0015\u001a\u0004\b:\u0010\u001cR\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R(\u0010H\u001a\b\u0012\u0004\u0012\u00020A0@8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR#\u0010N\u001a\n I*\u0004\u0018\u00010A0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M¨\u0006S"}, d2 = {"Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/b;", "Lf70;", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/d;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e$d;", "activeOrderVO", "W9", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e$b;", "hc", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e$c;", "e1", com.huawei.hms.opendevice.c.a, "Lk79;", "yh", "()Landroid/view/View;", "readyView", "Landroidx/appcompat/widget/AppCompatTextView;", DateTokenConverter.CONVERTER_KEY, "Ah", "()Landroidx/appcompat/widget/AppCompatTextView;", "readyViewTitle", com.huawei.hms.push.e.a, "zh", "readyViewStatus", "f", "nh", "inProgressView", "g", "rh", "inProgressViewTitle", Image.TYPE_HIGH, "oh", "inProgressViewStatus", "i", "qh", "inProgressViewStatusTime", "j", "ph", "inProgressViewStatusSorryLate", "k", "uh", "rateView", "l", "xh", "rateViewTitle", Image.TYPE_MEDIUM, "vh", "rateViewStatus", "n", "wh", "rateViewSubtitle", "Lahb;", "o", "Lahb;", "timerFormatter", "Las8;", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/ActiveOrderFoodMenuPresenter;", "p", "Las8;", "th", "()Las8;", "setPresenterProvider$activeorder_release", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "q", "Lmoxy/ktx/MoxyKtxDelegate;", "sh", "()Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/ActiveOrderFoodMenuPresenter;", "presenter", "<init>", "()V", "r", "a", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends f70 implements com.dodopizza.activeorder.feature.activeorderwidget.presentation.d {
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
    private ahb o;
    public as8<ActiveOrderFoodMenuPresenter> p;
    private final MoxyKtxDelegate q;
    static final /* synthetic */ je5<Object>[] s = {bc9.f(new ar8(b.class, "readyView", "getReadyView()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "readyViewTitle", "getReadyViewTitle()Landroidx/appcompat/widget/AppCompatTextView;", 0)), bc9.f(new ar8(b.class, "readyViewStatus", "getReadyViewStatus()Landroidx/appcompat/widget/AppCompatTextView;", 0)), bc9.f(new ar8(b.class, "inProgressView", "getInProgressView()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "inProgressViewTitle", "getInProgressViewTitle()Landroidx/appcompat/widget/AppCompatTextView;", 0)), bc9.f(new ar8(b.class, "inProgressViewStatus", "getInProgressViewStatus()Landroidx/appcompat/widget/AppCompatTextView;", 0)), bc9.f(new ar8(b.class, "inProgressViewStatusTime", "getInProgressViewStatusTime()Landroidx/appcompat/widget/AppCompatTextView;", 0)), bc9.f(new ar8(b.class, "inProgressViewStatusSorryLate", "getInProgressViewStatusSorryLate()Landroidx/appcompat/widget/AppCompatTextView;", 0)), bc9.f(new ar8(b.class, "rateView", "getRateView()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "rateViewTitle", "getRateViewTitle()Landroidx/appcompat/widget/AppCompatTextView;", 0)), bc9.f(new ar8(b.class, "rateViewStatus", "getRateViewStatus()Landroidx/appcompat/widget/AppCompatTextView;", 0)), bc9.f(new ar8(b.class, "rateViewSubtitle", "getRateViewSubtitle()Landroidx/appcompat/widget/AppCompatTextView;", 0)), bc9.f(new ar8(b.class, "presenter", "getPresenter()Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/ActiveOrderFoodMenuPresenter;", 0))};
    public static final a r = new a(null);

    /* compiled from: ActiveOrderFoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/b$a;", "", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/b;", "a", "<init>", "()V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            return new b();
        }
    }

    /* compiled from: ActiveOrderFoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/ActiveOrderFoodMenuPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/ActiveOrderFoodMenuPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.activeorder.feature.activeorderwidget.presentation.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0108b extends ej5 implements Function0<ActiveOrderFoodMenuPresenter> {
        C0108b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ActiveOrderFoodMenuPresenter invoke() {
            return b.this.th().get();
        }
    }

    /* compiled from: ActiveOrderFoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            b.this.sh().y();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ActiveOrderFoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            b.this.sh().y();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ActiveOrderFoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            b.this.sh().y();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    public b() {
        super(rz8.fragment_active_order_widget);
        this.c = kb0.e(this, ux8.activeOrderMayBringContainer);
        this.d = kb0.e(this, ux8.activeOrderMayBringTitle);
        this.e = kb0.e(this, ux8.activeOrderMayBringStatus);
        this.f = kb0.e(this, ux8.activeOrderProcessContainer);
        this.g = kb0.e(this, ux8.activeOrderProcessTitle);
        this.h = kb0.e(this, ux8.activeOrderProcessStatus);
        this.i = kb0.e(this, ux8.activeOrderProcessStatusTimeText);
        this.j = kb0.e(this, ux8.activeOrderProcessSorryLate);
        this.k = kb0.e(this, ux8.activeOrderRateOrderContainer);
        this.l = kb0.e(this, ux8.activeOrderRateOrderTitle);
        this.m = kb0.e(this, ux8.activeOrderRateOrderStatus);
        this.n = kb0.e(this, ux8.activeOrderRateOrderSubtitle);
        C0108b c0108b = new C0108b();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.q = new MoxyKtxDelegate(mvpDelegate, ActiveOrderFoodMenuPresenter.class.getName() + ".presenter", c0108b);
    }

    private final AppCompatTextView Ah() {
        return (AppCompatTextView) this.d.a(this, s[1]);
    }

    private final View nh() {
        return (View) this.f.a(this, s[3]);
    }

    private final AppCompatTextView oh() {
        return (AppCompatTextView) this.h.a(this, s[5]);
    }

    private final AppCompatTextView ph() {
        return (AppCompatTextView) this.j.a(this, s[7]);
    }

    private final AppCompatTextView qh() {
        return (AppCompatTextView) this.i.a(this, s[6]);
    }

    private final AppCompatTextView rh() {
        return (AppCompatTextView) this.g.a(this, s[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActiveOrderFoodMenuPresenter sh() {
        return (ActiveOrderFoodMenuPresenter) this.q.getValue(this, s[12]);
    }

    private final View uh() {
        return (View) this.k.a(this, s[8]);
    }

    private final AppCompatTextView vh() {
        return (AppCompatTextView) this.m.a(this, s[10]);
    }

    private final AppCompatTextView wh() {
        return (AppCompatTextView) this.n.a(this, s[11]);
    }

    private final AppCompatTextView xh() {
        return (AppCompatTextView) this.l.a(this, s[9]);
    }

    private final View yh() {
        return (View) this.c.a(this, s[0]);
    }

    private final AppCompatTextView zh() {
        return (AppCompatTextView) this.e.a(this, s[2]);
    }

    @Override // com.dodopizza.activeorder.feature.activeorderwidget.presentation.d
    public void W9(e.d dVar) {
        z65.h(dVar, "activeOrderVO");
        un3.k(yh());
        Ah().setText(getString(dVar.c(), Integer.valueOf(dVar.a())));
        zh().setText(dVar.b());
        oma.a(yh(), new e());
        un3.e(nh());
        un3.e(uh());
    }

    @Override // com.dodopizza.activeorder.feature.activeorderwidget.presentation.d
    public void e1(e.c cVar) {
        z65.h(cVar, "activeOrderVO");
        un3.k(uh());
        AppCompatTextView xh = xh();
        pza pzaVar = pza.a;
        String string = getString(cVar.c());
        z65.g(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(cVar.a())}, 1));
        z65.g(format, "format(...)");
        xh.setText(format);
        vh().setText(cVar.b());
        if (cVar.d() != null) {
            wh().setText(cVar.d().intValue());
        }
        oma.a(uh(), new d());
        un3.e(yh());
        un3.e(nh());
    }

    @Override // com.dodopizza.activeorder.feature.activeorderwidget.presentation.d
    public void hc(e.b bVar) {
        z65.h(bVar, "activeOrderVO");
        un3.k(nh());
        rh().setText(getString(bVar.c(), Integer.valueOf(bVar.a())));
        AppCompatTextView oh = oh();
        int b = bVar.b();
        String[] e2 = bVar.e();
        oh.setText(getString(b, Arrays.copyOf(e2, e2.length)));
        if (bVar.d()) {
            if (bVar.f() != null) {
                un3.k(ph());
                un3.e(qh());
                ph().setText(bVar.f().intValue());
            } else {
                un3.k(qh());
                un3.e(ph());
                AppCompatTextView qh = qh();
                ahb ahbVar = this.o;
                if (ahbVar == null) {
                    z65.z("timerFormatter");
                    ahbVar = null;
                }
                qh.setText(ahbVar.a(bVar.g()));
            }
        } else {
            un3.e(ph());
            un3.e(qh());
        }
        oma.a(nh(), new c());
        un3.e(yh());
        un3.e(uh());
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        e5.a.a().a(v33.b(), (ActiveOrderFoodMenuFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(ActiveOrderFoodMenuFeatureDependencies.class))).a(this);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        String string = getString(d19.order_countdown_time_format);
        z65.g(string, "getString(...)");
        this.o = new ol6(string);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public final as8<ActiveOrderFoodMenuPresenter> th() {
        as8<ActiveOrderFoodMenuPresenter> as8Var = this.p;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
