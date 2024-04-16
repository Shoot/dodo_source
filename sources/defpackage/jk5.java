package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.KeyboardAlwaysVisibleEditText;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gk5;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.MvpPresenter;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.modules.presentation.landing.phoneinput.LandingPhoneInputDependencies;
import ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput.LandingPhoneInputPresenter;
/* compiled from: LandingPhoneInputFragment.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 d2\u00020\u00012\u00020\u0002:\u0001\fB\u0007¢\u0006\u0004\bb\u0010cJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\u0012\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0002J-\u0010\u0013\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0017\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u001a\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0007H\u0016J\b\u0010\"\u001a\u00020\u0003H\u0016J\b\u0010#\u001a\u00020\u0003H\u0016J0\u0010)\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0016J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0016R\u001b\u0010$\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00102\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b:\u0010;R\u001b\u0010?\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010-\u001a\u0004\b>\u0010/R\u001b\u0010B\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010-\u001a\u0004\bA\u0010/R\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010-\u001a\u0004\bE\u0010FR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010O\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR(\u0010\\\u001a\b\u0012\u0004\u0012\u00020U0T8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001b\u0010a\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`¨\u0006e"}, d2 = {"Ljk5;", "Lf70;", "Lsk5;", "", "Dh", "Gh", "Hh", "", "th", "privacyUrl", "termsUrl", "Ih", "a", "", "resId", "uh", "", "", "args", "vh", "(I[Ljava/lang/Object;)Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/View;", "view", "onViewCreated", "phonePrefix", "D", "phoneNumber", "A", "R", "h0", "promoText", "personalDataUrl", "termsAndConditions", "buttonText", "address", "r9", "N0", "Landroid/widget/TextView;", com.huawei.hms.opendevice.c.a, "Lk79;", "Ah", "()Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "xh", "phonePrefixBtn", "Landroid/widget/CheckBox;", com.huawei.hms.push.e.a, "sh", "()Landroid/widget/CheckBox;", "checkBox", "Landroid/widget/Button;", "f", "Bh", "()Landroid/widget/Button;", "sentCodeBtn", "g", "Ch", "termsText", Image.TYPE_HIGH, "rh", "addressText", "Lcom/dodopizza/android/view/custom/KeyboardAlwaysVisibleEditText;", "i", "wh", "()Lcom/dodopizza/android/view/custom/KeyboardAlwaysVisibleEditText;", "phoneNumberInput", "Landroid/text/TextWatcher;", "j", "Landroid/text/TextWatcher;", "textWatcher", "Lfk5;", "k", "Lfk5;", "landingCallback", "Lks5;", "l", "Lks5;", "localeContextProvider", "Las8;", "Lru/dodopizza/app/presentation/selectlocation/landing/landingphoneinput/LandingPhoneInputPresenter;", Image.TYPE_MEDIUM, "Las8;", "zh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "n", "Lmoxy/ktx/MoxyKtxDelegate;", "yh", "()Lru/dodopizza/app/presentation/selectlocation/landing/landingphoneinput/LandingPhoneInputPresenter;", "presenter", "<init>", "()V", "o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: jk5  reason: default package */
/* loaded from: classes4.dex */
public final class jk5 extends f70 implements sk5 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private TextWatcher j;
    private fk5 k;
    private ks5 l;
    public as8<LandingPhoneInputPresenter> m;
    private final MoxyKtxDelegate n;
    static final /* synthetic */ je5<Object>[] p = {bc9.f(new ar8(jk5.class, "promoText", "getPromoText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(jk5.class, "phonePrefixBtn", "getPhonePrefixBtn()Landroid/widget/TextView;", 0)), bc9.f(new ar8(jk5.class, "checkBox", "getCheckBox()Landroid/widget/CheckBox;", 0)), bc9.f(new ar8(jk5.class, "sentCodeBtn", "getSentCodeBtn()Landroid/widget/Button;", 0)), bc9.f(new ar8(jk5.class, "termsText", "getTermsText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(jk5.class, "addressText", "getAddressText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(jk5.class, "phoneNumberInput", "getPhoneNumberInput()Lcom/dodopizza/android/view/custom/KeyboardAlwaysVisibleEditText;", 0)), bc9.f(new ar8(jk5.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/selectlocation/landing/landingphoneinput/LandingPhoneInputPresenter;", 0))};
    public static final a o = new a(null);

    /* compiled from: LandingPhoneInputFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ljk5$a;", "", "", "EXTRA_KEY_LOCALITY", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jk5$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LandingPhoneInputFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jk5$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            jk5.this.a();
            jk5.this.yh().E();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LandingPhoneInputFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jk5$c */
    /* loaded from: classes4.dex */
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
            jk5.this.Hh();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LandingPhoneInputFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jk5$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class d extends m94 implements Function1<String, Unit> {
        d(Object obj) {
            super(1, obj, LandingPhoneInputPresenter.class, "tryToResolveSuggest", "tryToResolveSuggest(Ljava/lang/String;)V", 0);
        }

        public final void b(String str) {
            z65.h(str, "p0");
            ((LandingPhoneInputPresenter) this.receiver).K(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            b(str);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LandingPhoneInputFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jk5$e */
    /* loaded from: classes4.dex */
    public /* synthetic */ class e extends m94 implements Function1<String, Unit> {
        e(Object obj) {
            super(1, obj, LandingPhoneInputPresenter.class, "onPhoneTextEntered", "onPhoneTextEntered(Ljava/lang/String;)V", 0);
        }

        public final void b(String str) {
            z65.h(str, "p0");
            ((LandingPhoneInputPresenter) this.receiver).C(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            b(str);
            return Unit.a;
        }
    }

    /* compiled from: LandingPhoneInputFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"jk5$f", "Lcom/dodopizza/android/view/custom/KeyboardAlwaysVisibleEditText$a;", "", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jk5$f */
    /* loaded from: classes4.dex */
    public static final class f implements KeyboardAlwaysVisibleEditText.a {
        f() {
        }

        @Override // com.dodopizza.android.view.custom.KeyboardAlwaysVisibleEditText.a
        public void a() {
            jk5.this.a();
        }
    }

    /* compiled from: LandingPhoneInputFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/landingphoneinput/LandingPhoneInputPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/selectlocation/landing/landingphoneinput/LandingPhoneInputPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jk5$g */
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function0<LandingPhoneInputPresenter> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final LandingPhoneInputPresenter invoke() {
            return jk5.this.zh().get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LandingPhoneInputFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jk5$h */
    /* loaded from: classes4.dex */
    public /* synthetic */ class h extends m94 implements Function1<String, Unit> {
        h(Object obj) {
            super(1, obj, LandingPhoneInputPresenter.class, "openWebView", "openWebView(Ljava/lang/String;)V", 0);
        }

        public final void b(String str) {
            z65.h(str, "p0");
            ((LandingPhoneInputPresenter) this.receiver).D(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            b(str);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LandingPhoneInputFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jk5$i */
    /* loaded from: classes4.dex */
    public /* synthetic */ class i extends m94 implements Function1<String, Unit> {
        i(Object obj) {
            super(1, obj, LandingPhoneInputPresenter.class, "openWebView", "openWebView(Ljava/lang/String;)V", 0);
        }

        public final void b(String str) {
            z65.h(str, "p0");
            ((LandingPhoneInputPresenter) this.receiver).D(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            b(str);
            return Unit.a;
        }
    }

    public jk5() {
        super(2131558647);
        this.c = kb0.e(this, R.id.landing_phone_promo_title_tv);
        this.d = kb0.e(this, R.id.landing_phone_country_phone_prefix_button);
        this.e = kb0.e(this, R.id.landing_phone_check_box);
        this.f = kb0.e(this, R.id.landing_phone_try_btn);
        this.g = kb0.e(this, R.id.landing_phone_terms_tv);
        this.h = kb0.e(this, R.id.landing_phone_address);
        this.i = kb0.e(this, R.id.landing_phone_number_et);
        g gVar = new g();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.n = new MoxyKtxDelegate(mvpDelegate, LandingPhoneInputPresenter.class.getName() + ".presenter", gVar);
    }

    private final TextView Ah() {
        return (TextView) this.c.a(this, p[0]);
    }

    private final Button Bh() {
        return (Button) this.f.a(this, p[3]);
    }

    private final TextView Ch() {
        return (TextView) this.g.a(this, p[4]);
    }

    private final void Dh() {
        oma.a(xh(), new b());
        sh().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: hk5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                jk5.Eh(jk5.this, compoundButton, z);
            }
        });
        Bh().setOnClickListener(new View.OnClickListener() { // from class: ik5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jk5.Fh(jk5.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Eh(jk5 jk5Var, CompoundButton compoundButton, boolean z) {
        z65.h(jk5Var, "this$0");
        jk5Var.yh().y(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Fh(jk5 jk5Var, View view) {
        z65.h(jk5Var, "this$0");
        jk5Var.yh().G();
    }

    private final void Gh() {
        wh().setHint(uh(R.string.hint_login_phone_number));
        this.j = new vi3(new c(), new d(yh()), new e(yh()));
        wh().setListener(new f());
        KeyboardAlwaysVisibleEditText wh = wh();
        TextWatcher textWatcher = this.j;
        String str = null;
        if (textWatcher == null) {
            z65.z("textWatcher");
            textWatcher = null;
        }
        wh.addTextChangedListener(textWatcher);
        String valueOf = String.valueOf(wh().getText());
        if (valueOf.length() > 0) {
            str = valueOf;
        }
        if (str != null) {
            yh().C(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Hh() {
        KeyboardAlwaysVisibleEditText wh = wh();
        TextWatcher textWatcher = this.j;
        if (textWatcher == null) {
            z65.z("textWatcher");
            textWatcher = null;
        }
        wh.removeTextChangedListener(textWatcher);
    }

    private final void Ih(String str, String str2) {
        int Z;
        int Z2;
        int Z3;
        int Z4;
        String th = th();
        SpannableString spannableString = new SpannableString(th);
        b91 b91Var = new b91(new h(yh()), uh(R.string.landing_dialog_personal_data), str);
        b91 b91Var2 = new b91(new i(yh()), uh(R.string.landing_dialog_terms_and_conditions), str2);
        Z = m0b.Z(th, uh(R.string.landing_dialog_personal_data), 0, false, 6, null);
        Z2 = m0b.Z(th, uh(R.string.landing_dialog_personal_data), 0, false, 6, null);
        spannableString.setSpan(b91Var, Z, Z2 + uh(R.string.landing_dialog_personal_data).length(), 33);
        Z3 = m0b.Z(th, uh(R.string.landing_dialog_terms_and_conditions), 0, false, 6, null);
        Z4 = m0b.Z(th, uh(R.string.landing_dialog_terms_and_conditions), 0, false, 6, null);
        spannableString.setSpan(b91Var2, Z3, Z4 + uh(R.string.landing_dialog_terms_and_conditions).length(), 33);
        Ch().setText(spannableString);
        Ch().setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        gg5.c(wh());
    }

    private final TextView rh() {
        return (TextView) this.h.a(this, p[5]);
    }

    private final CheckBox sh() {
        return (CheckBox) this.e.a(this, p[2]);
    }

    private final String th() {
        return vh(R.string.landing_dialog_confirmation, uh(R.string.landing_dialog_personal_data), uh(R.string.landing_dialog_terms_and_conditions));
    }

    private final String uh(int i2) {
        ks5 ks5Var = this.l;
        if (ks5Var == null) {
            z65.z("localeContextProvider");
            ks5Var = null;
        }
        String string = ks5Var.G3().getString(i2);
        z65.g(string, "getString(...)");
        return string;
    }

    private final String vh(int i2, Object... objArr) {
        ks5 ks5Var = this.l;
        if (ks5Var == null) {
            z65.z("localeContextProvider");
            ks5Var = null;
        }
        String string = ks5Var.G3().getString(i2, Arrays.copyOf(objArr, objArr.length));
        z65.g(string, "getString(...)");
        return string;
    }

    private final KeyboardAlwaysVisibleEditText wh() {
        return (KeyboardAlwaysVisibleEditText) this.i.a(this, p[6]);
    }

    private final TextView xh() {
        return (TextView) this.d.a(this, p[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LandingPhoneInputPresenter yh() {
        MvpPresenter value = this.n.getValue(this, p[7]);
        z65.g(value, "getValue(...)");
        return (LandingPhoneInputPresenter) value;
    }

    @Override // defpackage.sk5
    public void A(String str) {
        z65.h(str, "phoneNumber");
        if (!z65.c(String.valueOf(wh().getText()), str)) {
            wh().setText(str);
            wh().setSelection(str.length());
        }
        KeyboardAlwaysVisibleEditText wh = wh();
        TextWatcher textWatcher = this.j;
        if (textWatcher == null) {
            z65.z("textWatcher");
            textWatcher = null;
        }
        wh.addTextChangedListener(textWatcher);
    }

    @Override // defpackage.sk5
    public void D(String str) {
        z65.h(str, "phonePrefix");
        xh().setText(str);
    }

    @Override // defpackage.sk5
    public void N0(String str, String str2) {
        z65.h(str, "phoneNumber");
        z65.h(str2, "address");
        fk5 fk5Var = this.k;
        if (fk5Var == null) {
            z65.z("landingCallback");
            fk5Var = null;
        }
        fk5Var.N0(str, str2);
    }

    @Override // defpackage.sk5
    public void R() {
        Bh().setEnabled(true);
    }

    @Override // defpackage.sk5
    public void h0() {
        Bh().setEnabled(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        z65.f(parentFragment, "null cannot be cast to non-null type ru.dodopizza.app.presentation.selectlocation.landing.LandingNavigationCallback");
        this.k = (fk5) parentFragment;
        Fragment parentFragment2 = getParentFragment();
        z65.f(parentFragment2, "null cannot be cast to non-null type ru.dodopizza.app.presentation.selectlocation.landing.LocaleContextProvider");
        this.l = (ks5) parentFragment2;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Object obj;
        Object obj2;
        gk5.b a2 = gk5.a.a();
        LandingPhoneInputDependencies landingPhoneInputDependencies = (LandingPhoneInputDependencies) getComponentDependenciesRegistry().a(bc9.b(LandingPhoneInputDependencies.class));
        Bundle arguments = getArguments();
        dt5 dt5Var = null;
        if (arguments == null || (obj = arguments.get("extra_key_locality")) == null) {
            obj = null;
        }
        if (obj != null && !(obj instanceof dt5)) {
            throw new ClassCastException("Property extra_key_locality has different class type");
        } else if (obj != null) {
            String a3 = ((dt5) obj).a();
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (obj2 = arguments2.get("extra_key_locality")) != null) {
                dt5Var = obj2;
            }
            if (dt5Var != null && !(dt5Var instanceof dt5)) {
                throw new ClassCastException("Property extra_key_locality has different class type");
            } else if (dt5Var != null) {
                a2.a(landingPhoneInputDependencies, a3, dt5Var.getId()).a(this);
                super.onCreate(bundle);
            } else {
                throw new IllegalArgumentException("Argument with key = extra_key_locality not found in bundle");
            }
        } else {
            throw new IllegalArgumentException("Argument with key = extra_key_locality not found in bundle");
        }
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Gh();
        Dh();
    }

    @Override // defpackage.sk5
    public void r9(String str, String str2, String str3, String str4, String str5) {
        z65.h(str, "promoText");
        z65.h(str2, "personalDataUrl");
        z65.h(str3, "termsAndConditions");
        z65.h(str4, "buttonText");
        z65.h(str5, "address");
        Ah().setText(str);
        Bh().setText(str4);
        rh().setText(str5);
        Ch().setMovementMethod(LinkMovementMethod.getInstance());
        Ih(str2, str3);
    }

    public final as8<LandingPhoneInputPresenter> zh() {
        as8<LandingPhoneInputPresenter> as8Var = this.m;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
