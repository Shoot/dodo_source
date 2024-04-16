package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.b;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.rateapp.RateAppFeatureDependencies;
import com.dodopizza.controlling.feature.rateapp.presentation.RateAppDialogPresenter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpAppCompatDialogFragment;
import moxy.MvpDelegate;
import moxy.MvpPresenter;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: RateAppDialogFragment.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 !2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\"B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016R(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lk49;", "Lmoxy/MvpAppCompatDialogFragment;", "Lu49;", "Llm1;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/app/Dialog;", "onCreateDialog", "Fa", "Las8;", "Lcom/dodopizza/controlling/feature/rateapp/presentation/RateAppDialogPresenter;", "b", "Las8;", "jh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", c.a, "Lmoxy/ktx/MoxyKtxDelegate;", "ih", "()Lcom/dodopizza/controlling/feature/rateapp/presentation/RateAppDialogPresenter;", "presenter", "Lkm1;", DateTokenConverter.CONVERTER_KEY, "Lkm1;", "getComponentDependenciesRegistry", "()Lkm1;", "componentDependenciesRegistry", "<init>", "()V", e.a, "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: k49  reason: default package */
/* loaded from: classes.dex */
public final class k49 extends MvpAppCompatDialogFragment implements u49, lm1 {
    public as8<RateAppDialogPresenter> b;
    private final MoxyKtxDelegate c;
    private final km1 d;
    static final /* synthetic */ je5<Object>[] f = {bc9.f(new ar8(k49.class, "presenter", "getPresenter()Lcom/dodopizza/controlling/feature/rateapp/presentation/RateAppDialogPresenter;", 0))};
    public static final a e = new a(null);

    /* compiled from: RateAppDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lk49$a;", "", "Lk49;", "a", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: k49$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k49 a() {
            return new k49();
        }
    }

    /* compiled from: RateAppDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/controlling/feature/rateapp/presentation/RateAppDialogPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/controlling/feature/rateapp/presentation/RateAppDialogPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: k49$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<RateAppDialogPresenter> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final RateAppDialogPresenter invoke() {
            return k49.this.jh().get();
        }
    }

    public k49() {
        b bVar = new b();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.c = new MoxyKtxDelegate(mvpDelegate, RateAppDialogPresenter.class.getName() + ".presenter", bVar);
        this.d = eu2.d(this);
    }

    private final RateAppDialogPresenter ih() {
        MvpPresenter value = this.c.getValue(this, f[0]);
        z65.g(value, "getValue(...)");
        return (RateAppDialogPresenter) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kh(k49 k49Var, DialogInterface dialogInterface, int i) {
        z65.h(k49Var, "this$0");
        k49Var.ih().t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lh(k49 k49Var, DialogInterface dialogInterface, int i) {
        z65.h(k49Var, "this$0");
        k49Var.ih().u();
    }

    @Override // defpackage.u49
    public void Fa() {
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        av1.d(requireContext);
    }

    @Override // defpackage.lm1
    public km1 getComponentDependenciesRegistry() {
        return this.d;
    }

    public final as8<RateAppDialogPresenter> jh() {
        as8<RateAppDialogPresenter> as8Var = this.b;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        h49.a.a().a((RateAppFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(RateAppFeatureDependencies.class))).a(this);
        super.onCreate(bundle);
    }

    @Override // defpackage.kn, androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        androidx.appcompat.app.b a2 = new b.a(requireContext()).d(false).r(g19.rate_app_dialog_title).g(g19.rate_app_dialog_description).j(g19.rate_app_dialog_button_later, new DialogInterface.OnClickListener() { // from class: i49
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                k49.kh(k49.this, dialogInterface, i);
            }
        }).n(g19.rate_app_dialog_button_rate, new DialogInterface.OnClickListener() { // from class: j49
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                k49.lh(k49.this, dialogInterface, i);
            }
        }).a();
        z65.g(a2, "create(...)");
        return a2;
    }
}
