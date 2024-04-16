package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.Toolbar;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.di3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.presentation.entername.EnterNamePresenter;
/* compiled from: EnterNameFragment.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\nB\u0007¢\u0006\u0004\b:\u0010;J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\"\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010+R\u001b\u00100\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0016\u001a\u0004\b.\u0010/R\u001b\u00103\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0016\u001a\u0004\b2\u0010/R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006="}, d2 = {"Lii3;", "Lf70;", "Lqi3;", "Lw50;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "a", "Y8", "U5", "mb", "rf", "Bg", "u1", e.a, "", "onBackPressed", "Landroidx/appcompat/widget/Toolbar;", com.huawei.hms.opendevice.c.a, "Lk79;", "xh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/EditText;", DateTokenConverter.CONVERTER_KEY, "th", "()Landroid/widget/EditText;", "nameEditText", "Landroid/view/ViewGroup;", "wh", "()Landroid/view/ViewGroup;", "promotionsSection", "Lcom/google/android/material/switchmaterial/SwitchMaterial;", "f", "uh", "()Lcom/google/android/material/switchmaterial/SwitchMaterial;", "personalOffersSwitcher", "Landroid/widget/ViewSwitcher;", "g", "sh", "()Landroid/widget/ViewSwitcher;", "loadingSwitcher", Image.TYPE_HIGH, "qh", "()Landroid/view/View;", "applyButton", "i", "rh", "coordinator", "Lru/dodopizza/app/presentation/entername/EnterNamePresenter;", "j", "Lmoxy/ktx/MoxyKtxDelegate;", "vh", "()Lru/dodopizza/app/presentation/entername/EnterNamePresenter;", "presenter", "<init>", "()V", "k", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ii3  reason: default package */
/* loaded from: classes4.dex */
public final class ii3 extends f70 implements qi3, w50 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final MoxyKtxDelegate j;
    static final /* synthetic */ je5<Object>[] l = {bc9.f(new ar8(ii3.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(ii3.class, "nameEditText", "getNameEditText()Landroid/widget/EditText;", 0)), bc9.f(new ar8(ii3.class, "promotionsSection", "getPromotionsSection()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(ii3.class, "personalOffersSwitcher", "getPersonalOffersSwitcher()Lcom/google/android/material/switchmaterial/SwitchMaterial;", 0)), bc9.f(new ar8(ii3.class, "loadingSwitcher", "getLoadingSwitcher()Landroid/widget/ViewSwitcher;", 0)), bc9.f(new ar8(ii3.class, "applyButton", "getApplyButton()Landroid/view/View;", 0)), bc9.f(new ar8(ii3.class, "coordinator", "getCoordinator()Landroid/view/View;", 0)), bc9.f(new ar8(ii3.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/entername/EnterNamePresenter;", 0))};
    public static final a k = new a(null);

    /* compiled from: EnterNameFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lii3$a;", "", "Lei3;", "data", "Lii3;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "", "SWITCHER_CONTENT_INDEX", "I", "SWITCHER_LOADING_INDEX", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ii3$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ii3 a(ei3 ei3Var) {
            z65.h(ei3Var, "data");
            return (ii3) y64.d(new ii3(), bi0.c(bi0.d("data", ei3Var)));
        }
    }

    /* compiled from: EnterNameFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ii3$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ii3.this.vh().v();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: EnterNameFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ii3$c */
    /* loaded from: classes4.dex */
    /* synthetic */ class c extends m94 implements Function1<String, Unit> {
        c(Object obj) {
            super(1, obj, EnterNamePresenter.class, "onNameChanged", "onNameChanged(Ljava/lang/String;)V", 0);
        }

        public final void b(String str) {
            z65.h(str, "p0");
            ((EnterNamePresenter) this.receiver).w(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            b(str);
            return Unit.a;
        }
    }

    /* compiled from: EnterNameFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/entername/EnterNamePresenter;", "a", "()Lru/dodopizza/app/presentation/entername/EnterNamePresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ii3$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function0<EnterNamePresenter> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final EnterNamePresenter invoke() {
            di3.a W1 = ((LocalityComponent) ii3.this.getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).W1();
            Bundle arguments = ii3.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
            if (obj != null && !(obj instanceof ei3)) {
                throw new ClassCastException("Property data has different class type");
            } else if (obj != null) {
                return W1.a((ei3) obj).a();
            } else {
                throw new IllegalArgumentException("Argument with key = data not found in bundle");
            }
        }
    }

    public ii3() {
        super(R.layout.fragment_enter_name);
        this.c = kb0.e(this, R.id.enter_name_toolbar);
        this.d = kb0.e(this, R.id.enter_name_input);
        this.e = kb0.e(this, R.id.enter_name_promotions_container);
        this.f = kb0.e(this, R.id.enter_name_offers_switch);
        this.g = kb0.e(this, R.id.enter_name_apply_button_switcher);
        this.h = kb0.e(this, R.id.enter_name_apply_button);
        this.i = kb0.e(this, R.id.coordinator);
        d dVar = new d();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.j = new MoxyKtxDelegate(mvpDelegate, EnterNamePresenter.class.getName() + ".presenter", dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ah(ii3 ii3Var) {
        z65.h(ii3Var, "this$0");
        gg5.d(ii3Var.th());
    }

    private final View qh() {
        return (View) this.h.a(this, l[5]);
    }

    private final View rh() {
        return (View) this.i.a(this, l[6]);
    }

    private final ViewSwitcher sh() {
        return (ViewSwitcher) this.g.a(this, l[4]);
    }

    private final EditText th() {
        return (EditText) this.d.a(this, l[1]);
    }

    private final SwitchMaterial uh() {
        return (SwitchMaterial) this.f.a(this, l[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EnterNamePresenter vh() {
        return (EnterNamePresenter) this.j.getValue(this, l[7]);
    }

    private final ViewGroup wh() {
        return (ViewGroup) this.e.a(this, l[2]);
    }

    private final Toolbar xh() {
        return (Toolbar) this.c.a(this, l[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yh(ii3 ii3Var, View view) {
        z65.h(ii3Var, "this$0");
        ii3Var.vh().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zh(ii3 ii3Var, CompoundButton compoundButton, boolean z) {
        z65.h(ii3Var, "this$0");
        ii3Var.vh().x(z);
    }

    @Override // defpackage.qi3
    public void Bg() {
        un3.k(wh());
    }

    @Override // defpackage.qi3
    public void U5() {
        qh().setEnabled(false);
    }

    @Override // defpackage.qi3
    public void Y8() {
        qh().setEnabled(true);
    }

    @Override // defpackage.qi3
    public void a() {
        gg5.c(th());
    }

    @Override // defpackage.qi3
    public void e() {
        Snackbar.h0(rh(), R.string.entername_failed_to_set_name, 0).U();
    }

    @Override // defpackage.qi3
    public void mb() {
        uh().setEnabled(false);
        sh().setDisplayedChild(1);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        vh().onBackPressed();
        return true;
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        xh().setNavigationOnClickListener(new View.OnClickListener() { // from class: fi3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ii3.yh(ii3.this, view2);
            }
        });
        oma.a(qh(), new b());
        uh().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: gi3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ii3.zh(ii3.this, compoundButton, z);
            }
        });
        e97.a(th(), new c(vh()));
        th().post(new Runnable() { // from class: hi3
            @Override // java.lang.Runnable
            public final void run() {
                ii3.Ah(ii3.this);
            }
        });
    }

    @Override // defpackage.qi3
    public void rf() {
        uh().setEnabled(true);
        sh().setDisplayedChild(0);
    }

    @Override // defpackage.qi3
    public void u1() {
        un3.e(wh());
    }
}
