package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.b;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.onboarding.feature.apprestartapprove.AppRestartApproveFeatureDependencies;
import com.dodopizza.onboarding.feature.apprestartapprove.presentation.AppRestartApprovePresenter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.mo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpAppCompatDialogFragment;
import moxy.MvpDelegate;
import moxy.MvpView;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: AppRestartApproveFragment.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 !2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\"B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R#\u0010\u001e\u001a\n \u0019*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lqo;", "Lmoxy/MvpAppCompatDialogFragment;", "Llm1;", "", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/app/Dialog;", "onCreateDialog", "Lkm1;", "b", "Lkm1;", "getComponentDependenciesRegistry", "()Lkm1;", "componentDependenciesRegistry", "Las8;", "Lcom/dodopizza/onboarding/feature/apprestartapprove/presentation/AppRestartApprovePresenter;", c.a, "Las8;", "jh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lmoxy/ktx/MoxyKtxDelegate;", "ih", "()Lcom/dodopizza/onboarding/feature/apprestartapprove/presentation/AppRestartApprovePresenter;", "presenter", "<init>", "()V", e.a, "a", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qo  reason: default package */
/* loaded from: classes2.dex */
public final class qo extends MvpAppCompatDialogFragment implements lm1, MvpView {
    private final km1 b = eu2.d(this);
    public as8<AppRestartApprovePresenter> c;
    private final MoxyKtxDelegate d;
    static final /* synthetic */ je5<Object>[] f = {bc9.f(new ar8(qo.class, "presenter", "getPresenter()Lcom/dodopizza/onboarding/feature/apprestartapprove/presentation/AppRestartApprovePresenter;", 0))};
    public static final a e = new a(null);

    /* compiled from: AppRestartApproveFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lqo$a;", "", "Lno;", "data", "Lqo;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "<init>", "()V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qo$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final qo a(no noVar) {
            z65.h(noVar, "data");
            return (qo) y64.d(new qo(), bi0.c(bi0.d("data", noVar)));
        }
    }

    /* compiled from: AppRestartApproveFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/onboarding/feature/apprestartapprove/presentation/AppRestartApprovePresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/onboarding/feature/apprestartapprove/presentation/AppRestartApprovePresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qo$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function0<AppRestartApprovePresenter> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AppRestartApprovePresenter invoke() {
            return qo.this.jh().get();
        }
    }

    public qo() {
        b bVar = new b();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.d = new MoxyKtxDelegate(mvpDelegate, AppRestartApprovePresenter.class.getName() + ".presenter", bVar);
    }

    private final AppRestartApprovePresenter ih() {
        return (AppRestartApprovePresenter) this.d.getValue(this, f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kh(qo qoVar, DialogInterface dialogInterface, int i) {
        z65.h(qoVar, "this$0");
        qoVar.ih().s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lh(qo qoVar, DialogInterface dialogInterface, int i) {
        z65.h(qoVar, "this$0");
        qoVar.ih().r();
    }

    @Override // defpackage.lm1
    public km1 getComponentDependenciesRegistry() {
        return this.b;
    }

    public final as8<AppRestartApprovePresenter> jh() {
        as8<AppRestartApprovePresenter> as8Var = this.c;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        mo.b a2 = mo.a.a();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
        if (obj != null && !(obj instanceof no)) {
            throw new ClassCastException("Property data has different class type");
        } else if (obj != null) {
            a2.a((no) obj, (AppRestartApproveFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(AppRestartApproveFeatureDependencies.class))).a(this);
            super.onCreate(bundle);
        } else {
            throw new IllegalArgumentException("Argument with key = data not found in bundle");
        }
    }

    @Override // defpackage.kn, androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        androidx.appcompat.app.b a2 = new b.a(requireContext()).d(false).g(q09.app_restart_dialog_message).j(q09.app_restart_dialog_reject_button, new DialogInterface.OnClickListener() { // from class: oo
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                qo.kh(qo.this, dialogInterface, i);
            }
        }).n(q09.app_restart_dialog_approve_button, new DialogInterface.OnClickListener() { // from class: po
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                qo.lh(qo.this, dialogInterface, i);
            }
        }).a();
        z65.g(a2, "create(...)");
        return a2;
    }
}
