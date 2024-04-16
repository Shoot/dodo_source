package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.d;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.e1b;
import defpackage.y7;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.AppComponent;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent;
import ru.dodopizza.app.presentation.deliveryaddressform.DeliveryAddressPresenter;
/* compiled from: DeliveryAddressFragment.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 O2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001eB\u0007¢\u0006\u0004\bM\u0010NJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001a\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\fH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u0012\u0010\u001c\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016R\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010F\u001a\b\u0012\u0004\u0012\u00020?0>8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER#\u0010L\u001a\n G*\u0004\u0018\u00010?0?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006P"}, d2 = {"Lbv2;", "Lf70;", "Lax2;", "Lw50;", "Lf63;", "zh", "Lm54;", "field", "", "errorCode", "", "Ah", "", "onBackPressed", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "show", "M", "Xe", "H5", "outState", "onSaveInstanceState", "onViewStateRestored", "Landroidx/appcompat/widget/Toolbar;", com.huawei.hms.opendevice.c.a, "Lk79;", "wh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "vh", "()Landroid/widget/Button;", "saveBtn", "Landroid/widget/ProgressBar;", e.a, "uh", "()Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/LinearLayout;", "f", "qh", "()Landroid/widget/LinearLayout;", "addressLayout", "Le54;", "g", "Le54;", "form", "Lh54;", Image.TYPE_HIGH, "Lh54;", "rh", "()Lh54;", "setFormBuilder", "(Lh54;)V", "formBuilder", "Las8;", "Lru/dodopizza/app/presentation/deliveryaddressform/DeliveryAddressPresenter;", "i", "Las8;", "th", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "j", "Lmoxy/ktx/MoxyKtxDelegate;", "sh", "()Lru/dodopizza/app/presentation/deliveryaddressform/DeliveryAddressPresenter;", "presenter", "<init>", "()V", "k", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: bv2  reason: default package */
/* loaded from: classes4.dex */
public final class bv2 extends f70 implements ax2, w50 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private e54 g;
    public h54 h;
    public as8<DeliveryAddressPresenter> i;
    private final MoxyKtxDelegate j;
    static final /* synthetic */ je5<Object>[] l = {bc9.f(new ar8(bv2.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(bv2.class, "saveBtn", "getSaveBtn()Landroid/widget/Button;", 0)), bc9.f(new ar8(bv2.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)), bc9.f(new ar8(bv2.class, "addressLayout", "getAddressLayout()Landroid/widget/LinearLayout;", 0)), bc9.f(new ar8(bv2.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/deliveryaddressform/DeliveryAddressPresenter;", 0))};
    public static final c k = new c(null);

    /* compiled from: DeliveryAddressFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh54;", "", "a", "(Lh54;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bv2$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<h54, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DeliveryAddressFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isReady", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: bv2$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0077a extends ej5 implements Function1<Boolean, Unit> {
            final /* synthetic */ bv2 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0077a(bv2 bv2Var) {
                super(1);
                this.a = bv2Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.a;
            }

            public final void invoke(boolean z) {
                this.a.vh().setEnabled(z);
            }
        }

        a() {
            super(1);
        }

        public final void a(h54 h54Var) {
            z65.h(h54Var, "$this$invoke");
            h54Var.c(bv2.this.qh());
            h54Var.d(new C0077a(bv2.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(h54 h54Var) {
            a(h54Var);
            return Unit.a;
        }
    }

    /* compiled from: DeliveryAddressFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/deliveryaddressform/DeliveryAddressPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/deliveryaddressform/DeliveryAddressPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bv2$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<DeliveryAddressPresenter> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final DeliveryAddressPresenter invoke() {
            return bv2.this.th().get();
        }
    }

    /* compiled from: DeliveryAddressFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lbv2$c;", "", "Lq6;", "data", "Lbv2;", "a", "", "EXTRA_IS_FROM_NEW_CHECKOUT", "Ljava/lang/String;", "EXTRA_KEY_SOURCE", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bv2$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final bv2 a(q6 q6Var) {
            z65.h(q6Var, "data");
            bv2 bv2Var = new bv2();
            Bundle bundle = new Bundle();
            bundle.putBoolean("extra_is_from_new_checkout", q6Var.b());
            bundle.putSerializable("extra_key_source", q6Var.a());
            bv2Var.setArguments(bundle);
            return bv2Var;
        }
    }

    public bv2() {
        super(R.layout.fragment_auto_address);
        this.c = kb0.e(this, R.id.toolbar);
        this.d = kb0.e(this, R.id.save_button);
        this.e = kb0.e(this, R.id.progress_bar);
        this.f = kb0.e(this, R.id.address_layout);
        b bVar = new b();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.j = new MoxyKtxDelegate(mvpDelegate, DeliveryAddressPresenter.class.getName() + ".presenter", bVar);
    }

    private final void Ah(m54 m54Var, int i) {
        Context context = getContext();
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        Toast.makeText(context, g8.a(m54Var, requireContext, i), 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearLayout qh() {
        return (LinearLayout) this.f.a(this, l[3]);
    }

    private final DeliveryAddressPresenter sh() {
        return (DeliveryAddressPresenter) this.j.getValue(this, l[4]);
    }

    private final ProgressBar uh() {
        return (ProgressBar) this.e.a(this, l[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Button vh() {
        return (Button) this.d.a(this, l[1]);
    }

    private final Toolbar wh() {
        return (Toolbar) this.c.a(this, l[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xh(bv2 bv2Var, View view) {
        z65.h(bv2Var, "this$0");
        gg5.c(bv2Var.wh());
        bv2Var.sh().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yh(bv2 bv2Var, View view) {
        z65.h(bv2Var, "this$0");
        e54 e54Var = bv2Var.g;
        if (e54Var == null) {
            z65.z("form");
            e54Var = null;
        }
        e1b q = e54Var.q();
        if (q instanceof e1b.b) {
            bv2Var.sh().x(((e1b.b) q).a());
        } else if (q instanceof e1b.a) {
            e1b.a aVar = (e1b.a) q;
            bv2Var.Ah(aVar.b(), aVar.a());
        }
        gg5.c(bv2Var.vh());
    }

    private final f63 zh() {
        if (getParentFragment() instanceof c70) {
            return ((CheckoutComponent) getComponentDependenciesRegistry().a(bc9.b(CheckoutComponent.class))).b();
        }
        return ((AppComponent) getComponentDependenciesRegistry().a(bc9.b(AppComponent.class))).A1();
    }

    @Override // defpackage.ax2
    public void H5() {
        Toast.makeText(requireContext(), (int) R.string.add_new_address_failed_label, 1).show();
    }

    @Override // defpackage.ax2
    public void M(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        uh().setVisibility(i);
    }

    @Override // defpackage.ax2
    public void Xe(boolean z) {
        int i;
        Button vh = vh();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        vh.setVisibility(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        y7.a b2 = ((LocalityComponent) getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).R3().b(zh());
        d requireActivity = requireActivity();
        z65.g(requireActivity, "requireActivity(...)");
        y7.a d = b2.e(requireActivity).d(requireArguments().getBoolean("extra_is_from_new_checkout"));
        Serializable serializable = requireArguments().getSerializable("extra_key_source");
        z65.f(serializable, "null cannot be cast to non-null type ru.dodopizza.app.presentation.deliveryaddress.AddAddressSource");
        d.c((s6) serializable).a().a(this);
        super.onAttach(context);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        sh().onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        z65.h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        e54 e54Var = this.g;
        if (e54Var == null) {
            z65.z("form");
            e54Var = null;
        }
        e54Var.p(bundle);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        e54 b2 = rh().b(new a());
        this.g = b2;
        if (b2 == null) {
            z65.z("form");
            b2 = null;
        }
        b2.init();
        wh().setNavigationOnClickListener(new View.OnClickListener() { // from class: yu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bv2.xh(bv2.this, view2);
            }
        });
        vh().setOnClickListener(new View.OnClickListener() { // from class: zu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bv2.yh(bv2.this, view2);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            e54 e54Var = this.g;
            if (e54Var == null) {
                z65.z("form");
                e54Var = null;
            }
            e54Var.r(bundle);
        }
    }

    public final h54 rh() {
        h54 h54Var = this.h;
        if (h54Var != null) {
            return h54Var;
        }
        z65.z("formBuilder");
        return null;
    }

    public final as8<DeliveryAddressPresenter> th() {
        as8<DeliveryAddressPresenter> as8Var = this.i;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
