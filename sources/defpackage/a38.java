package defpackage;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.KeyboardAlwaysVisibleEditText;
import com.dodopizza.geo.feature.phonenumbercollector.PhoneNumberCollectorDependencies;
import com.dodopizza.geo.feature.phonenumbercollector.presentation.PhoneNumberCollectorPresenter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import moxy.MvpDelegate;
import moxy.MvpPresenter;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: PhoneNumberCollectorFragment.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\bC\u0010DJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0006\u0010\t\u001a\u00020\u0000J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010,R\u001b\u00100\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001b\u001a\u0004\b/\u0010\u001dR(\u00109\u001a\b\u0012\u0004\u0012\u000202018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001b\u0010>\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006E"}, d2 = {"La38;", "Lf70;", "Ll38;", "Lw50;", "", "xh", "zh", "Bh", "qb", "Ah", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "", "phonePrefix", "D", "phoneNumber", "A", "", "isEnabled", "ke", "onBackPressed", "Landroid/widget/TextView;", com.huawei.hms.opendevice.c.a, "Lk79;", "qh", "()Landroid/widget/TextView;", "countryPhonePrefixButton", "Lcom/dodopizza/android/view/custom/KeyboardAlwaysVisibleEditText;", DateTokenConverter.CONVERTER_KEY, "sh", "()Lcom/dodopizza/android/view/custom/KeyboardAlwaysVisibleEditText;", "phoneNumberInput", "Landroid/widget/Button;", com.huawei.hms.push.e.a, "rh", "()Landroid/widget/Button;", "nextButton", "Landroidx/appcompat/widget/Toolbar;", "f", "wh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "g", "vh", "termsOfUseTextView", "Las8;", "Lcom/dodopizza/geo/feature/phonenumbercollector/presentation/PhoneNumberCollectorPresenter;", Image.TYPE_HIGH, "Las8;", "uh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "i", "Lmoxy/ktx/MoxyKtxDelegate;", "th", "()Lcom/dodopizza/geo/feature/phonenumbercollector/presentation/PhoneNumberCollectorPresenter;", "presenter", "Landroid/text/TextWatcher;", "j", "Landroid/text/TextWatcher;", "textWatcher", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: a38  reason: default package */
/* loaded from: classes2.dex */
public final class a38 extends f70 implements l38, w50 {
    static final /* synthetic */ je5<Object>[] k = {bc9.f(new ar8(a38.class, "countryPhonePrefixButton", "getCountryPhonePrefixButton()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a38.class, "phoneNumberInput", "getPhoneNumberInput()Lcom/dodopizza/android/view/custom/KeyboardAlwaysVisibleEditText;", 0)), bc9.f(new ar8(a38.class, "nextButton", "getNextButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(a38.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(a38.class, "termsOfUseTextView", "getTermsOfUseTextView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a38.class, "presenter", "getPresenter()Lcom/dodopizza/geo/feature/phonenumbercollector/presentation/PhoneNumberCollectorPresenter;", 0))};
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    public as8<PhoneNumberCollectorPresenter> h;
    private final MoxyKtxDelegate i;
    private TextWatcher j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneNumberCollectorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: a38$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function1<View, Unit> {
        a() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            gg5.c(a38.this.sh());
            a38.this.th().q();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneNumberCollectorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: a38$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            a38.this.th().u();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneNumberCollectorFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: a38$c */
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a38.this.Bh();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneNumberCollectorFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: a38$d */
    /* loaded from: classes2.dex */
    public /* synthetic */ class d extends m94 implements Function1<String, Unit> {
        d(Object obj) {
            super(1, obj, PhoneNumberCollectorPresenter.class, "tryToResolveSuggest", "tryToResolveSuggest(Ljava/lang/String;)V", 0);
        }

        public final void b(String str) {
            z65.h(str, "p0");
            ((PhoneNumberCollectorPresenter) this.receiver).x(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            b(str);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneNumberCollectorFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: a38$e */
    /* loaded from: classes2.dex */
    public /* synthetic */ class e extends m94 implements Function1<String, Unit> {
        e(Object obj) {
            super(1, obj, PhoneNumberCollectorPresenter.class, "onPhoneTextEntered", "onPhoneTextEntered(Ljava/lang/String;)V", 0);
        }

        public final void b(String str) {
            z65.h(str, "p0");
            ((PhoneNumberCollectorPresenter) this.receiver).t(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            b(str);
            return Unit.a;
        }
    }

    /* compiled from: PhoneNumberCollectorFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"a38$f", "Lcom/dodopizza/android/view/custom/KeyboardAlwaysVisibleEditText$a;", "", "a", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: a38$f */
    /* loaded from: classes2.dex */
    public static final class f implements KeyboardAlwaysVisibleEditText.a {
        f() {
        }

        @Override // com.dodopizza.android.view.custom.KeyboardAlwaysVisibleEditText.a
        public void a() {
            gg5.c(a38.this.sh());
        }
    }

    /* compiled from: PhoneNumberCollectorFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/geo/feature/phonenumbercollector/presentation/PhoneNumberCollectorPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/geo/feature/phonenumbercollector/presentation/PhoneNumberCollectorPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: a38$g */
    /* loaded from: classes2.dex */
    static final class g extends ej5 implements Function0<PhoneNumberCollectorPresenter> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final PhoneNumberCollectorPresenter invoke() {
            return a38.this.uh().get();
        }
    }

    public a38() {
        super(dz8.fragment_phone_number_collector);
        this.c = kb0.e(this, dy8.phone_number_country_prefix);
        this.d = kb0.e(this, dy8.phone_number_catcher_input);
        this.e = kb0.e(this, dy8.phone_number_next_button);
        this.f = kb0.e(this, dy8.phone_number_toolbar);
        this.g = kb0.e(this, dy8.phone_number_terms_of_use_label);
        g gVar = new g();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.i = new MoxyKtxDelegate(mvpDelegate, PhoneNumberCollectorPresenter.class.getName() + ".presenter", gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Bh() {
        KeyboardAlwaysVisibleEditText sh = sh();
        TextWatcher textWatcher = this.j;
        if (textWatcher == null) {
            z65.z("textWatcher");
            textWatcher = null;
        }
        sh.removeTextChangedListener(textWatcher);
    }

    private final void qb() {
        String string = getString(o09.phone_collector_legal_docs_link_prefix);
        z65.g(string, "getString(...)");
        String string2 = getString(o09.login_legal_docs_link_text);
        z65.g(string2, "getString(...)");
        String string3 = getString(o09.phone_collector_legal_docs_link_postfix);
        z65.g(string3, "getString(...)");
        un3.k(vh());
        TextView vh = vh();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string + " " + string2 + " " + string3);
        spannableStringBuilder.setSpan(new UnderlineSpan(), string.length() + 1, string.length() + string2.length() + 1, 33);
        vh.setText(spannableStringBuilder);
    }

    private final TextView qh() {
        return (TextView) this.c.a(this, k[0]);
    }

    private final Button rh() {
        return (Button) this.e.a(this, k[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KeyboardAlwaysVisibleEditText sh() {
        return (KeyboardAlwaysVisibleEditText) this.d.a(this, k[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhoneNumberCollectorPresenter th() {
        MvpPresenter value = this.i.getValue(this, k[5]);
        z65.g(value, "getValue(...)");
        return (PhoneNumberCollectorPresenter) value;
    }

    private final TextView vh() {
        return (TextView) this.g.a(this, k[4]);
    }

    private final Toolbar wh() {
        return (Toolbar) this.f.a(this, k[3]);
    }

    private final void xh() {
        wh().setNavigationOnClickListener(new View.OnClickListener() { // from class: z28
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a38.yh(a38.this, view);
            }
        });
        rh().setEnabled(false);
        oma.a(rh(), new a());
        oma.a(vh(), new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yh(a38 a38Var, View view) {
        z65.h(a38Var, "this$0");
        a38Var.th().onBackPressed();
    }

    private final void zh() {
        sh().setHint(getString(o09.phone_collector_phone_number_hint));
        this.j = new f48(new c(), new d(th()), new e(th()));
        sh().setListener(new f());
        KeyboardAlwaysVisibleEditText sh = sh();
        TextWatcher textWatcher = this.j;
        String str = null;
        if (textWatcher == null) {
            z65.z("textWatcher");
            textWatcher = null;
        }
        sh.addTextChangedListener(textWatcher);
        String valueOf = String.valueOf(sh().getText());
        if (valueOf.length() > 0) {
            str = valueOf;
        }
        if (str != null) {
            th().t(str);
        }
    }

    @Override // defpackage.l38
    public void A(String str) {
        z65.h(str, "phoneNumber");
        if (!z65.c(String.valueOf(sh().getText()), str)) {
            sh().setText(str);
            sh().setSelection(str.length());
        }
        KeyboardAlwaysVisibleEditText sh = sh();
        TextWatcher textWatcher = this.j;
        if (textWatcher == null) {
            z65.z("textWatcher");
            textWatcher = null;
        }
        sh.addTextChangedListener(textWatcher);
    }

    public final a38 Ah() {
        return new a38();
    }

    @Override // defpackage.l38
    public void D(String str) {
        z65.h(str, "phonePrefix");
        qh().setText(str);
    }

    @Override // defpackage.l38
    public void ke(boolean z) {
        rh().setEnabled(z);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        th().onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        y28.a.a().a((PhoneNumberCollectorDependencies) getComponentDependenciesRegistry().a(bc9.b(PhoneNumberCollectorDependencies.class))).a(this);
        super.onCreate(bundle);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        zh();
        xh();
        qb();
        gg5.d(sh());
    }

    public final as8<PhoneNumberCollectorPresenter> uh() {
        as8<PhoneNumberCollectorPresenter> as8Var = this.h;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
