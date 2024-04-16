package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.rndigitalcard.RnDigitalCardFeatureDependencies;
import com.dodopizza.controlling.feature.rndigitalcard.presentation.RnDigitalCardPresenter;
import com.huawei.hms.push.e;
import defpackage.um9;
import defpackage.xm9;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: RnDigitalCardFragment.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001,B\u0007¢\u0006\u0004\b)\u0010*J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u001b\u0010\u0018\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006-"}, d2 = {"Lxm9;", "Lf70;", "Lcn9;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/LayoutInflater;", "onGetLayoutInflater", "Landroid/view/View;", "view", "", "onViewCreated", "h4", "E2", "", "productImageUrl", "title", "Qg", "", "available", "fd", com.huawei.hms.opendevice.c.a, "Lk79;", "ph", "()Landroid/view/View;", "rndFeedbackSector", "Landroid/widget/ImageView;", DateTokenConverter.CONVERTER_KEY, "oh", "()Landroid/widget/ImageView;", "rndFeedbackProductImage", "Landroid/widget/TextView;", e.a, "qh", "()Landroid/widget/TextView;", "rndFeedbackTitle", "Lcom/dodopizza/controlling/feature/rndigitalcard/presentation/RnDigitalCardPresenter;", "f", "Lmoxy/ktx/MoxyKtxDelegate;", "nh", "()Lcom/dodopizza/controlling/feature/rndigitalcard/presentation/RnDigitalCardPresenter;", "presenter", "<init>", "()V", "g", "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xm9  reason: default package */
/* loaded from: classes.dex */
public final class xm9 extends f70 implements cn9 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final MoxyKtxDelegate f;
    static final /* synthetic */ je5<Object>[] h = {bc9.f(new ar8(xm9.class, "rndFeedbackSector", "getRndFeedbackSector()Landroid/view/View;", 0)), bc9.f(new ar8(xm9.class, "rndFeedbackProductImage", "getRndFeedbackProductImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(xm9.class, "rndFeedbackTitle", "getRndFeedbackTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(xm9.class, "presenter", "getPresenter()Lcom/dodopizza/controlling/feature/rndigitalcard/presentation/RnDigitalCardPresenter;", 0))};
    public static final a g = new a(null);

    /* compiled from: RnDigitalCardFragment.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bJ&\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u001a"}, d2 = {"Lxm9$a;", "", "Landroid/os/Bundle;", "bundle", "", com.huawei.hms.opendevice.c.a, "Lvm9;", "data", "", "themeResId", "b", "Landroidx/fragment/app/Fragment;", "hostFragment", "Lkotlin/Function1;", "", "Lcom/dodopizza/controlling/feature/rndigitalcard/presentation/RnDigitalFormAvailabilityListener;", "action", DateTokenConverter.CONVERTER_KEY, "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "EXTRA_KEY_RESULT", "EXTRA_KEY_THEME", "RESULT_KEY", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xm9$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean c(Bundle bundle) {
            Serializable serializable = bundle.getSerializable("result");
            z65.f(serializable, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) serializable).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(Function1 function1, String str, Bundle bundle) {
            z65.h(function1, "$action");
            z65.h(str, "<anonymous parameter 0>");
            z65.h(bundle, "bundle");
            function1.invoke(Boolean.valueOf(xm9.g.c(bundle)));
        }

        public final Bundle b(vm9 vm9Var, int i) {
            z65.h(vm9Var, "data");
            return bi0.c(bi0.d("data", vm9Var), bi0.d("theme", Integer.valueOf(i)));
        }

        public final void d(Fragment fragment, final Function1<? super Boolean, Unit> function1) {
            z65.h(fragment, "hostFragment");
            z65.h(function1, "action");
            fragment.getChildFragmentManager().A1("rndigital_card_result", fragment, new r64() { // from class: wm9
                @Override // defpackage.r64
                public final void a(String str, Bundle bundle) {
                    xm9.a.e(Function1.this, str, bundle);
                }
            });
        }
    }

    /* compiled from: RnDigitalCardFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xm9$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            xm9.this.nh().u();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: RnDigitalCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/controlling/feature/rndigitalcard/presentation/RnDigitalCardPresenter;", "a", "()Lcom/dodopizza/controlling/feature/rndigitalcard/presentation/RnDigitalCardPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xm9$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<RnDigitalCardPresenter> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final RnDigitalCardPresenter invoke() {
            um9.b a = um9.a.a();
            RnDigitalCardFeatureDependencies rnDigitalCardFeatureDependencies = (RnDigitalCardFeatureDependencies) xm9.this.getComponentDependenciesRegistry().a(bc9.b(RnDigitalCardFeatureDependencies.class));
            Bundle arguments = xm9.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
            if (obj != null && !(obj instanceof vm9)) {
                throw new ClassCastException("Property data has different class type");
            } else if (obj != null) {
                return a.a(rnDigitalCardFeatureDependencies, (vm9) obj).a();
            } else {
                throw new IllegalArgumentException("Argument with key = data not found in bundle");
            }
        }
    }

    public xm9() {
        super(wz8.fragment_rndigital_card);
        this.c = kb0.e(this, zx8.rating_applied_rnd_feedback_sector);
        this.d = kb0.e(this, zx8.rating_applied_rnd_product_image);
        this.e = kb0.e(this, zx8.rating_applied_rnd_title);
        c cVar = new c();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.f = new MoxyKtxDelegate(mvpDelegate, RnDigitalCardPresenter.class.getName() + ".presenter", cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RnDigitalCardPresenter nh() {
        return (RnDigitalCardPresenter) this.f.getValue(this, h[3]);
    }

    private final ImageView oh() {
        return (ImageView) this.d.a(this, h[1]);
    }

    private final View ph() {
        return (View) this.c.a(this, h[0]);
    }

    private final TextView qh() {
        return (TextView) this.e.a(this, h[2]);
    }

    @Override // defpackage.cn9
    public void E2() {
        un3.e(ph());
    }

    @Override // defpackage.cn9
    public void Qg(String str, String str2) {
        z65.h(str, "productImageUrl");
        z65.h(str2, "title");
        qh().setText(str2);
        com.bumptech.glide.b.u(oh()).t(str).a0(lx8.b).G0(oh());
    }

    @Override // defpackage.cn9
    public void fd(boolean z) {
        getParentFragmentManager().z1("rndigital_card_result", bi0.c(bi0.d("result", Boolean.valueOf(z))));
    }

    @Override // defpackage.cn9
    public void h4() {
        un3.k(ph());
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        z65.g(onGetLayoutInflater, "onGetLayoutInflater(...)");
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("theme")) == null) ? null : null;
        if (obj != null && !(obj instanceof Integer)) {
            throw new ClassCastException("Property theme has different class type");
        } else if (obj != null) {
            return tdb.a(onGetLayoutInflater, ((Integer) obj).intValue());
        } else {
            throw new IllegalArgumentException("Argument with key = theme not found in bundle");
        }
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(ph(), new b());
    }
}
