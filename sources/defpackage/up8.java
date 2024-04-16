package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.promocode.PromoCodeFeatureDependencies;
import com.dodopizza.order.feature.promocode.presentation.PromoCodePresenter;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.qp8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: PromoCodeDialog.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b-\u0010.J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\"\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b \u0010!R\u001b\u0010&\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u00061"}, d2 = {"Lup8;", "Lip6;", "Lhq8;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "", "error", "R9", "", "errorRes", "I2", "b8", "l9", "f", "g", "close", "Lcom/google/android/material/textfield/TextInputLayout;", DateTokenConverter.CONVERTER_KEY, "Lk79;", "mh", "()Lcom/google/android/material/textfield/TextInputLayout;", "promoCodeContainer", "Lcom/google/android/material/textfield/TextInputEditText;", e.a, "nh", "()Lcom/google/android/material/textfield/TextInputEditText;", "promoCodeInputText", "Landroid/widget/Button;", "jh", "()Landroid/widget/Button;", "applyBtn", "Landroid/widget/ProgressBar;", "lh", "()Landroid/widget/ProgressBar;", "progressBar", "Lcom/dodopizza/order/feature/promocode/presentation/PromoCodePresenter;", Image.TYPE_HIGH, "Lmoxy/ktx/MoxyKtxDelegate;", "kh", "()Lcom/dodopizza/order/feature/promocode/presentation/PromoCodePresenter;", "presenter", "<init>", "()V", "i", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: up8  reason: default package */
/* loaded from: classes2.dex */
public final class up8 extends ip6 implements hq8 {
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final MoxyKtxDelegate h;
    static final /* synthetic */ je5<Object>[] j = {bc9.f(new ar8(up8.class, "promoCodeContainer", "getPromoCodeContainer()Lcom/google/android/material/textfield/TextInputLayout;", 0)), bc9.f(new ar8(up8.class, "promoCodeInputText", "getPromoCodeInputText()Lcom/google/android/material/textfield/TextInputEditText;", 0)), bc9.f(new ar8(up8.class, "applyBtn", "getApplyBtn()Landroid/widget/Button;", 0)), bc9.f(new ar8(up8.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)), bc9.f(new ar8(up8.class, "presenter", "getPresenter()Lcom/dodopizza/order/feature/promocode/presentation/PromoCodePresenter;", 0))};
    public static final a i = new a(null);
    public static final int k = 8;

    /* compiled from: PromoCodeDialog.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lup8$a;", "", "Lcq8;", "sender", "Lup8;", "a", "", "ARG_ENTER_CODE_SENDER", "Ljava/lang/String;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: up8$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final up8 a(cq8 cq8Var) {
            z65.h(cq8Var, "sender");
            return (up8) y64.d(new up8(), bi0.c(bi0.d("arg_enter_code_sender", cq8Var)));
        }
    }

    /* compiled from: PromoCodeDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: up8$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            up8.this.kh().v(String.valueOf(up8.this.nh().getText()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: PromoCodeDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lbb;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promocode.presentation.PromoCodeDialog$onViewCreated$2", f = "PromoCodeDialog.kt", l = {}, m = "invokeSuspend")
    /* renamed from: up8$c */
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function2<bb, cv1<? super Unit>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(bb bbVar, cv1<? super Unit> cv1Var) {
            return ((c) create(bbVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                up8.this.l9();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PromoCodeDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/order/feature/promocode/presentation/PromoCodePresenter;", "a", "()Lcom/dodopizza/order/feature/promocode/presentation/PromoCodePresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: up8$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function0<PromoCodePresenter> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final PromoCodePresenter invoke() {
            qp8.b a = qp8.a.a();
            Bundle arguments = up8.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("arg_enter_code_sender")) == null) ? null : null;
            if (obj != null && !(obj instanceof cq8)) {
                throw new ClassCastException("Property arg_enter_code_sender has different class type");
            } else if (obj != null) {
                return a.a((cq8) obj, (PromoCodeFeatureDependencies) up8.this.getComponentDependenciesRegistry().a(bc9.b(PromoCodeFeatureDependencies.class))).a();
            } else {
                throw new IllegalArgumentException("Argument with key = arg_enter_code_sender not found in bundle");
            }
        }
    }

    public up8() {
        super(gz8.dialog_promocode);
        this.d = kb0.e(this, gy8.promocode_input_field_container);
        this.e = kb0.e(this, gy8.promocode_input_field);
        this.f = kb0.e(this, gy8.promocode_apply_button);
        this.g = kb0.e(this, gy8.ppromocode_progress_bar);
        d dVar = new d();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.h = new MoxyKtxDelegate(mvpDelegate, PromoCodePresenter.class.getName() + ".presenter", dVar);
    }

    private final Button jh() {
        return (Button) this.f.a(this, j[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PromoCodePresenter kh() {
        return (PromoCodePresenter) this.h.getValue(this, j[4]);
    }

    private final ProgressBar lh() {
        return (ProgressBar) this.g.a(this, j[3]);
    }

    private final TextInputLayout mh() {
        return (TextInputLayout) this.d.a(this, j[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextInputEditText nh() {
        return (TextInputEditText) this.e.a(this, j[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean oh(up8 up8Var, TextView textView, int i2, KeyEvent keyEvent) {
        z65.h(up8Var, "this$0");
        if (i2 == 6) {
            up8Var.kh().v(String.valueOf(up8Var.nh().getText()));
            return true;
        }
        return false;
    }

    @Override // defpackage.hq8
    public void I2(int i2) {
        String string = getString(i2);
        z65.g(string, "getString(...)");
        R9(string);
    }

    @Override // defpackage.hq8
    public void R9(String str) {
        z65.h(str, "error");
        mh().setErrorEnabled(true);
        mh().setError(str);
    }

    @Override // defpackage.hq8
    public void b8() {
        String string = getString(r09.promocode_empty);
        z65.g(string, "getString(...)");
        R9(string);
    }

    @Override // defpackage.hq8
    public void close() {
        dismiss();
    }

    @Override // defpackage.hq8
    public void f() {
        jh().setVisibility(4);
        lh().setVisibility(0);
    }

    @Override // defpackage.hq8
    public void g() {
        lh().setVisibility(4);
        jh().setVisibility(0);
    }

    @Override // defpackage.hq8
    public void l9() {
        mh().setErrorEnabled(false);
    }

    @Override // defpackage.ip6, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        gg5.e(nh(), getDialog());
        oma.a(jh(), new b());
        wz3.C(wz3.F(bdb.a(nh()), new c(null)), pp5.a(this));
        nh().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: tp8
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                boolean oh;
                oh = up8.oh(up8.this, textView, i2, keyEvent);
                return oh;
            }
        });
    }
}
