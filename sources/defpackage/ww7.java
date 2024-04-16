package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.b;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpAppCompatDialogFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.presentation.paymentbrokendialog.PaymentWorkflowBrokenPresenter;
/* compiled from: PaymentWorkflowBrokenDialog.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 !2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\"B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lww7;", "Lmoxy/MvpAppCompatDialogFragment;", "Ldx7;", "Llm1;", "Landroid/view/View;", "hh", "", "phone", "", "G6", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "u9", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "authErrorPhoneLabel", "Lkm1;", com.huawei.hms.opendevice.c.a, "Lkm1;", "getComponentDependenciesRegistry", "()Lkm1;", "componentDependenciesRegistry", "Lru/dodopizza/app/presentation/paymentbrokendialog/PaymentWorkflowBrokenPresenter;", DateTokenConverter.CONVERTER_KEY, "Lmoxy/ktx/MoxyKtxDelegate;", "ih", "()Lru/dodopizza/app/presentation/paymentbrokendialog/PaymentWorkflowBrokenPresenter;", "presenter", "<init>", "()V", e.a, "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ww7  reason: default package */
/* loaded from: classes4.dex */
public final class ww7 extends MvpAppCompatDialogFragment implements dx7, lm1 {
    private TextView b;
    private final km1 c = eu2.d(this);
    private final MoxyKtxDelegate d;
    static final /* synthetic */ je5<Object>[] f = {bc9.f(new ar8(ww7.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/paymentbrokendialog/PaymentWorkflowBrokenPresenter;", 0))};
    public static final a e = new a(null);

    /* compiled from: PaymentWorkflowBrokenDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lww7$a;", "", "Lww7;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ww7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ww7 a() {
            return new ww7();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentWorkflowBrokenDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ww7$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ww7.this.ih().t();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentWorkflowBrokenDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ww7$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ww7.this.ih().s();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: PaymentWorkflowBrokenDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/paymentbrokendialog/PaymentWorkflowBrokenPresenter;", "a", "()Lru/dodopizza/app/presentation/paymentbrokendialog/PaymentWorkflowBrokenPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ww7$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function0<PaymentWorkflowBrokenPresenter> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final PaymentWorkflowBrokenPresenter invoke() {
            return ((LocalityComponent) ww7.this.getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).Z2().a();
        }
    }

    public ww7() {
        d dVar = new d();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.d = new MoxyKtxDelegate(mvpDelegate, PaymentWorkflowBrokenPresenter.class.getName() + ".presenter", dVar);
    }

    private final View hh() {
        TextView textView = null;
        View inflate = getLayoutInflater().inflate(R.layout.payment_broken_dialog, (ViewGroup) null, true);
        View findViewById = inflate.findViewById(R.id.auth_error_phone);
        z65.g(findViewById, "findViewById(...)");
        TextView textView2 = (TextView) findViewById;
        this.b = textView2;
        if (textView2 == null) {
            z65.z("authErrorPhoneLabel");
        } else {
            textView = textView2;
        }
        oma.a(textView, new b());
        View findViewById2 = inflate.findViewById(R.id.close);
        z65.g(findViewById2, "findViewById(...)");
        oma.a(findViewById2, new c());
        z65.g(inflate, "also(...)");
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentWorkflowBrokenPresenter ih() {
        return (PaymentWorkflowBrokenPresenter) this.d.getValue(this, f[0]);
    }

    @Override // defpackage.dx7
    public void G6(String str) {
        z65.h(str, "phone");
        TextView textView = this.b;
        if (textView == null) {
            z65.z("authErrorPhoneLabel");
            textView = null;
        }
        textView.setText(str);
    }

    @Override // defpackage.lm1
    public km1 getComponentDependenciesRegistry() {
        return this.c;
    }

    @Override // defpackage.kn, androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        androidx.appcompat.app.b a2 = new b.a(requireActivity()).t(hh()).a();
        z65.g(a2, "create(...)");
        return a2;
    }

    @Override // defpackage.dx7
    public void u9(String str) {
        z65.h(str, "phone");
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        av1.f(requireContext, str);
    }
}
