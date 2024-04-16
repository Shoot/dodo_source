package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.AppComponent;
import ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent;
import ru.dodopizza.app.presentation.payment.card.secure3d.Secure3DWebView;
import ru.dodopizza.app.presentation.payment.card.secure3d.Secure3dPresenter;
/* compiled from: Secure3dFragment.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001*B\u0007¢\u0006\u0004\b'\u0010(J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006+"}, d2 = {"Le3a;", "Lf70;", "Ll3a;", "Lw50;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Lrs7;", "authorizationParams", "X8", "", "onBackPressed", "b", "U9", "Lru/dodopizza/app/presentation/payment/card/secure3d/Secure3DWebView;", com.huawei.hms.opendevice.c.a, "Lk79;", "rh", "()Lru/dodopizza/app/presentation/payment/card/secure3d/Secure3DWebView;", "secure3dView", DateTokenConverter.CONVERTER_KEY, "qh", "()Landroid/view/View;", "progressContainer", "Lf3a;", e.a, "Lrn5;", "oh", "()Lf3a;", "data", "Lru/dodopizza/app/presentation/payment/card/secure3d/Secure3dPresenter;", "f", "Lmoxy/ktx/MoxyKtxDelegate;", "ph", "()Lru/dodopizza/app/presentation/payment/card/secure3d/Secure3dPresenter;", "presenter", "<init>", "()V", "g", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: e3a  reason: default package */
/* loaded from: classes4.dex */
public final class e3a extends f70 implements l3a, w50 {
    private final k79 c;
    private final k79 d;
    private final rn5 e;
    private final MoxyKtxDelegate f;
    static final /* synthetic */ je5<Object>[] h = {bc9.f(new ar8(e3a.class, "secure3dView", "getSecure3dView()Lru/dodopizza/app/presentation/payment/card/secure3d/Secure3DWebView;", 0)), bc9.f(new ar8(e3a.class, "progressContainer", "getProgressContainer()Landroid/view/View;", 0)), bc9.f(new ar8(e3a.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/payment/card/secure3d/Secure3dPresenter;", 0))};
    public static final a g = new a(null);

    /* compiled from: Secure3dFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Le3a$a;", "", "Lf3a;", "data", "Le3a;", "a", "", "EXTRA_AUTHORIZATION", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e3a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e3a a(f3a f3aVar) {
            z65.h(f3aVar, "data");
            return (e3a) y64.d(new e3a(), bi0.c(bi0.d("extra_authorization", f3aVar)));
        }
    }

    /* compiled from: Secure3dFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf3a;", "a", "()Lf3a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: e3a$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<f3a> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final f3a invoke() {
            Serializable serializable = e3a.this.requireArguments().getSerializable("extra_authorization");
            z65.f(serializable, "null cannot be cast to non-null type ru.dodopizza.app.presentation.payment.card.secure3d.Secure3dFragmentData");
            return (f3a) serializable;
        }
    }

    /* compiled from: Secure3dFragment.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\tH\u0016¨\u0006\u0012"}, d2 = {"e3a$c", "Lj62;", "Lru/dodopizza/app/presentation/payment/card/secure3d/Secure3DWebView;", "view", "", DateTokenConverter.CONVERTER_KEY, "", "progress", "b", "", "json", e.a, "errorCode", "description", "failingUrl", "a", "finalizationUrl", com.huawei.hms.opendevice.c.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e3a$c */
    /* loaded from: classes4.dex */
    public static final class c implements j62 {
        final /* synthetic */ rs7 b;

        c(rs7 rs7Var) {
            this.b = rs7Var;
        }

        @Override // defpackage.j62
        public void a(int i, String str, String str2) {
            z65.h(str, "description");
            z65.h(str2, "failingUrl");
            e3a.this.ph().s(str2, str);
        }

        @Override // defpackage.j62
        public void b(int i) {
            e3a.this.ph().u(i);
        }

        @Override // defpackage.j62
        public void c(String str) {
            z65.h(str, "finalizationUrl");
        }

        @Override // defpackage.j62
        public void d(Secure3DWebView secure3DWebView) {
            z65.h(secure3DWebView, "view");
            e3a.this.ph().t();
        }

        @Override // defpackage.j62
        public void e(String str) {
            z65.h(str, "json");
            e3a.this.ph().w(this.b, str);
        }
    }

    /* compiled from: Secure3dFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/payment/card/secure3d/Secure3dPresenter;", "a", "()Lru/dodopizza/app/presentation/payment/card/secure3d/Secure3dPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: e3a$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function0<Secure3dPresenter> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Secure3dPresenter invoke() {
            return ((AppComponent) e3a.this.getComponentDependenciesRegistry().a(bc9.b(AppComponent.class))).Z1().b(((CheckoutComponent) e3a.this.getComponentDependenciesRegistry().a(bc9.b(CheckoutComponent.class))).b()).c(e3a.this.oh().a()).a().a();
        }
    }

    public e3a() {
        super(R.layout.fragment_secure_3d);
        rn5 b2;
        this.c = kb0.e(this, R.id.secure3d);
        this.d = kb0.e(this, R.id.progress_container);
        b2 = yn5.b(new b());
        this.e = b2;
        d dVar = new d();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.f = new MoxyKtxDelegate(mvpDelegate, Secure3dPresenter.class.getName() + ".presenter", dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f3a oh() {
        return (f3a) this.e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Secure3dPresenter ph() {
        return (Secure3dPresenter) this.f.getValue(this, h[2]);
    }

    private final View qh() {
        return (View) this.d.a(this, h[1]);
    }

    private final Secure3DWebView rh() {
        return (Secure3DWebView) this.c.a(this, h[0]);
    }

    @Override // defpackage.l3a
    public void U9() {
        un3.e(qh());
        un3.k(rh());
    }

    @Override // defpackage.l3a
    public void X8(rs7 rs7Var) {
        String str;
        z65.h(rs7Var, "authorizationParams");
        rh().setAuthorizationListener(new c(rs7Var));
        Secure3DWebView rh = rh();
        do3 b2 = oh().b();
        if (b2 != null) {
            str = b2.b() + "; " + b2.a();
        } else {
            str = null;
        }
        rh.setDebugExtraPaymentData(str);
        rh().g(rs7Var.c(), rs7Var.b(), rs7Var.d(), rs7Var.e());
    }

    @Override // defpackage.l3a
    public void b() {
        un3.k(qh());
        un3.e(rh());
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        ph().onBackPressed();
        return true;
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        y31 y31Var;
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof y31) {
            y31Var = (y31) parentFragment;
        } else {
            y31Var = null;
        }
        if (y31Var != null) {
            y31Var.setCancelable(false);
        }
    }
}
