package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.couriertipscard.CourierTipsCardFeatureDependencies;
import com.dodopizza.controlling.feature.couriertipscard.presentation.CourierTipsCardPresenter;
import com.huawei.hms.push.e;
import defpackage.dz1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: CourierTipsCardFragment.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001+B\u0007¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0016\u0010\u0010\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#¨\u0006,"}, d2 = {"Lhz1;", "Lf70;", "Loz1;", "Lcom/dodopizza/controlling/feature/couriertipscard/presentation/a;", "suggestedTip", "Landroid/view/View;", "rh", "clickedView", "", "th", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/LayoutInflater;", "onGetLayoutInflater", "", "suggestedTips", "Na", "Yc", "b2", "Lcom/dodopizza/controlling/feature/couriertipscard/presentation/CourierTipsCardPresenter;", com.huawei.hms.opendevice.c.a, "Lmoxy/ktx/MoxyKtxDelegate;", "ph", "()Lcom/dodopizza/controlling/feature/couriertipscard/presentation/CourierTipsCardPresenter;", "presenter", "Lmz1;", DateTokenConverter.CONVERTER_KEY, "Lrn5;", "qh", "()Lmz1;", "uiConfig", "Landroid/view/ViewGroup;", e.a, "Lk79;", "oh", "()Landroid/view/ViewGroup;", "courierTipsContainer", "f", "nh", "courierTips", "<init>", "()V", "g", "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hz1  reason: default package */
/* loaded from: classes.dex */
public final class hz1 extends f70 implements oz1 {
    private final MoxyKtxDelegate c;
    private final rn5 d;
    private final k79 e;
    private final k79 f;
    static final /* synthetic */ je5<Object>[] h = {bc9.f(new ar8(hz1.class, "presenter", "getPresenter()Lcom/dodopizza/controlling/feature/couriertipscard/presentation/CourierTipsCardPresenter;", 0)), bc9.f(new ar8(hz1.class, "courierTipsContainer", "getCourierTipsContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(hz1.class, "courierTips", "getCourierTips()Landroid/view/ViewGroup;", 0))};
    public static final a g = new a(null);

    /* compiled from: CourierTipsCardFragment.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lhz1$a;", "", "Lez1;", "data", "Lmz1;", "uiConfig", "Landroid/os/Bundle;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "EXTRA_KEY_UI_CONFIG", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: hz1$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bundle a(ez1 ez1Var, mz1 mz1Var) {
            z65.h(ez1Var, "data");
            z65.h(mz1Var, "uiConfig");
            return bi0.c(bi0.d("data", ez1Var), bi0.d("ui_config", mz1Var));
        }
    }

    /* compiled from: CourierTipsCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/controlling/feature/couriertipscard/presentation/CourierTipsCardPresenter;", "a", "()Lcom/dodopizza/controlling/feature/couriertipscard/presentation/CourierTipsCardPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hz1$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<CourierTipsCardPresenter> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CourierTipsCardPresenter invoke() {
            dz1.b a = dz1.a.a();
            CourierTipsCardFeatureDependencies courierTipsCardFeatureDependencies = (CourierTipsCardFeatureDependencies) hz1.this.getComponentDependenciesRegistry().a(bc9.b(CourierTipsCardFeatureDependencies.class));
            Bundle arguments = hz1.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
            if (obj != null && !(obj instanceof ez1)) {
                throw new ClassCastException("Property data has different class type");
            } else if (obj != null) {
                return a.a(courierTipsCardFeatureDependencies, (ez1) obj).a();
            } else {
                throw new IllegalArgumentException("Argument with key = data not found in bundle");
            }
        }
    }

    /* compiled from: CourierTipsCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lmz1;", "a", "()Lmz1;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hz1$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<mz1> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final mz1 invoke() {
            Bundle arguments = hz1.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("ui_config")) == null) ? null : null;
            if (obj != null && !(obj instanceof mz1)) {
                throw new ClassCastException("Property ui_config has different class type");
            } else if (obj != null) {
                return (mz1) obj;
            } else {
                throw new IllegalArgumentException("Argument with key = ui_config not found in bundle");
            }
        }
    }

    public hz1() {
        super(wz8.fragment_courier_tips_card);
        rn5 b2;
        b bVar = new b();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.c = new MoxyKtxDelegate(mvpDelegate, CourierTipsCardPresenter.class.getName() + ".presenter", bVar);
        b2 = yn5.b(new c());
        this.d = b2;
        this.e = kb0.e(this, zx8.order_rating_tips_container);
        this.f = kb0.e(this, zx8.order_rating_tips);
    }

    private final ViewGroup nh() {
        return (ViewGroup) this.f.a(this, h[2]);
    }

    private final ViewGroup oh() {
        return (ViewGroup) this.e.a(this, h[1]);
    }

    private final CourierTipsCardPresenter ph() {
        return (CourierTipsCardPresenter) this.c.getValue(this, h[0]);
    }

    private final mz1 qh() {
        return (mz1) this.d.getValue();
    }

    private final View rh(final com.dodopizza.controlling.feature.couriertipscard.presentation.a aVar) {
        boolean z = false;
        View inflate = getLayoutInflater().inflate(wz8.item_rating_tips, nh(), false);
        z65.f(inflate, "null cannot be cast to non-null type android.widget.CheckBox");
        final CheckBox checkBox = (CheckBox) inflate;
        checkBox.setText(un6.b(kn6.c.c(aVar.b())));
        if (aVar.d() && qh().a()) {
            z = true;
        }
        checkBox.setChecked(z);
        checkBox.setOnClickListener(new View.OnClickListener() { // from class: gz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hz1.sh(hz1.this, aVar, checkBox, view);
            }
        });
        return checkBox;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sh(hz1 hz1Var, com.dodopizza.controlling.feature.couriertipscard.presentation.a aVar, CheckBox checkBox, View view) {
        z65.h(hz1Var, "this$0");
        z65.h(aVar, "$suggestedTip");
        z65.h(checkBox, "$this_apply");
        hz1Var.ph().w(aVar, checkBox.isChecked());
        hz1Var.th(checkBox);
    }

    private final void th(View view) {
        boolean z;
        for (View view2 : dzb.b(nh())) {
            z65.f(view2, "null cannot be cast to non-null type android.widget.CheckBox");
            CheckBox checkBox = (CheckBox) view2;
            if (checkBox.isChecked() && z65.c(view, checkBox) && qh().a()) {
                z = true;
            } else {
                z = false;
            }
            checkBox.setChecked(z);
        }
    }

    @Override // defpackage.oz1
    public void Na(List<com.dodopizza.controlling.feature.couriertipscard.presentation.a> list) {
        z65.h(list, "suggestedTips");
        nh().removeAllViews();
        for (com.dodopizza.controlling.feature.couriertipscard.presentation.a aVar : list) {
            nh().addView(rh(aVar));
        }
    }

    @Override // defpackage.oz1
    public void Yc() {
        un3.k(oh());
    }

    @Override // defpackage.oz1
    public void b2() {
        un3.e(oh());
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        z65.g(onGetLayoutInflater, "onGetLayoutInflater(...)");
        return tdb.a(onGetLayoutInflater, qh().b());
    }
}
