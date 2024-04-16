package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.KeyboardAlwaysVisibleEditText;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.d00;
import defpackage.m38;
import defpackage.t28;
import defpackage.yz;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.MvpPresenter;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter;
/* compiled from: PhoneNumberLoginFragment.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 w2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007B\u0007¢\u0006\u0004\bu\u0010vJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0015H\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0015H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J\u001a\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\u0018\u0010*\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0018H\u0016J\b\u0010+\u001a\u00020\u0015H\u0016R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00105R\u001b\u0010:\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010.\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010.\u001a\u0004\bB\u0010CR\u001b\u0010G\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010.\u001a\u0004\bF\u00100R\u001b\u0010J\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010.\u001a\u0004\bI\u00100R\u001b\u0010M\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010.\u001a\u0004\bL\u00100R\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010.\u001a\u0004\bP\u0010QR\u001b\u0010U\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\bS\u0010TR\u001b\u0010Z\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010.\u001a\u0004\bX\u0010YR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010b\u001a\u00020_8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010aR(\u0010k\u001a\b\u0012\u0004\u0012\u00020d0c8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u001b\u0010t\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010s¨\u0006x"}, d2 = {"Lp38;", "Lf70;", "La48;", "Lw50;", "", "Eh", "V", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "Fe", "onStop", "outState", "onSaveInstanceState", "", "isLoading", "l", "", "phonePrefix", "D", "phoneNumber", "A", "shouldBeEnabled", "Tg", "isSending", "Hg", com.huawei.hms.push.e.a, "t2", "callCenterPhone", "siteUrl", "Bf", "fa", "qb", "termsOfUseLink", "personalDataLink", "j2", "onBackPressed", "Landroid/widget/TextView;", com.huawei.hms.opendevice.c.a, "Lk79;", "sh", "()Landroid/widget/TextView;", "countryPhonePrefixButton", "Lcom/dodopizza/android/view/custom/KeyboardAlwaysVisibleEditText;", DateTokenConverter.CONVERTER_KEY, "vh", "()Lcom/dodopizza/android/view/custom/KeyboardAlwaysVisibleEditText;", "phoneNumberInput", "Landroid/widget/LinearLayout;", "wh", "()Landroid/widget/LinearLayout;", "phoneNumberInputContainer", "Landroid/widget/Button;", "f", "uh", "()Landroid/widget/Button;", "nextButton", "Landroidx/appcompat/widget/Toolbar;", "g", "Ch", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", Image.TYPE_HIGH, "Bh", "termsOfUseTextView", "i", "getTitle", "title", "j", "Ah", "subtitle", "Landroidx/constraintlayout/widget/ConstraintLayout;", "k", "rh", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "constraintLayout", "th", "()Landroid/view/View;", "loader", "Landroid/widget/ProgressBar;", Image.TYPE_MEDIUM, "zh", "()Landroid/widget/ProgressBar;", "sendLoader", "Ld00;", "n", "Ld00;", "authorizationIsNotAvailableDialog", "Lyz;", "o", "Lyz;", "cantSendSmsDialog", "Las8;", "Lru/dodopizza/app/presentation/phonenumberlogin/PhoneNumberLoginPresenter;", "p", "Las8;", "yh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "Landroid/text/TextWatcher;", "q", "Landroid/text/TextWatcher;", "textWatcher", "r", "Lmoxy/ktx/MoxyKtxDelegate;", "xh", "()Lru/dodopizza/app/presentation/phonenumberlogin/PhoneNumberLoginPresenter;", "presenter", "<init>", "()V", Image.TYPE_SMALL, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: p38  reason: default package */
/* loaded from: classes4.dex */
public final class p38 extends f70 implements a48, w50 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    private final k79 m;
    private d00 n;
    private yz o;
    public as8<PhoneNumberLoginPresenter> p;
    private final TextWatcher q;
    private final MoxyKtxDelegate r;
    static final /* synthetic */ je5<Object>[] t = {bc9.f(new ar8(p38.class, "countryPhonePrefixButton", "getCountryPhonePrefixButton()Landroid/widget/TextView;", 0)), bc9.f(new ar8(p38.class, "phoneNumberInput", "getPhoneNumberInput()Lcom/dodopizza/android/view/custom/KeyboardAlwaysVisibleEditText;", 0)), bc9.f(new ar8(p38.class, "phoneNumberInputContainer", "getPhoneNumberInputContainer()Landroid/widget/LinearLayout;", 0)), bc9.f(new ar8(p38.class, "nextButton", "getNextButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(p38.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(p38.class, "termsOfUseTextView", "getTermsOfUseTextView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(p38.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(p38.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(p38.class, "constraintLayout", "getConstraintLayout()Landroidx/constraintlayout/widget/ConstraintLayout;", 0)), bc9.f(new ar8(p38.class, "loader", "getLoader()Landroid/view/View;", 0)), bc9.f(new ar8(p38.class, "sendLoader", "getSendLoader()Landroid/widget/ProgressBar;", 0)), bc9.f(new ar8(p38.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/phonenumberlogin/PhoneNumberLoginPresenter;", 0))};
    public static final a s = new a(null);

    /* compiled from: PhoneNumberLoginFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lp38$a;", "", "Lru/dodopizza/app/presentation/phonenumberlogin/e;", "request", "Lp38;", "a", "", "EXTRA_REQUEST", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: p38$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p38 a(ru.dodopizza.app.presentation.phonenumberlogin.e eVar) {
            z65.h(eVar, "request");
            return (p38) y64.d(new p38(), bi0.c(bi0.d("extra_request", eVar)));
        }
    }

    /* compiled from: PhoneNumberLoginFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ld00$b;", "", "a", "(Ld00$b;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: p38$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<d00.b, Unit> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.a = str;
        }

        public final void a(d00.b bVar) {
            z65.h(bVar, "$this$newInstance");
            bVar.c(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(d00.b bVar) {
            a(bVar);
            return Unit.a;
        }
    }

    /* compiled from: PhoneNumberLoginFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: p38$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            p38.this.a();
            p38.this.xh().X();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: PhoneNumberLoginFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: p38$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            p38.this.a();
            p38.this.xh().K();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: PhoneNumberLoginFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"p38$e", "Lcom/dodopizza/android/view/custom/KeyboardAlwaysVisibleEditText$a;", "", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: p38$e */
    /* loaded from: classes4.dex */
    public static final class e implements KeyboardAlwaysVisibleEditText.a {
        e() {
        }

        @Override // com.dodopizza.android.view.custom.KeyboardAlwaysVisibleEditText.a
        public void a() {
            androidx.fragment.app.d activity = p38.this.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* compiled from: PhoneNumberLoginFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/phonenumberlogin/PhoneNumberLoginPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/phonenumberlogin/PhoneNumberLoginPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: p38$f */
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function0<PhoneNumberLoginPresenter> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final PhoneNumberLoginPresenter invoke() {
            return p38.this.yh().get();
        }
    }

    /* compiled from: PhoneNumberLoginFragment.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"p38$g", "Lt28$a;", "", "phone", "", com.huawei.hms.opendevice.c.a, "b", "", "resultCode", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: p38$g */
    /* loaded from: classes4.dex */
    public static final class g implements t28.a {
        g() {
        }

        @Override // defpackage.t28.a
        public void a(int i) {
            p38.this.xh().O(i);
        }

        @Override // defpackage.t28.a
        public void b() {
            p38.this.xh().L();
        }

        @Override // defpackage.t28.a
        public void c(String str) {
            z65.h(str, "phone");
            p38.this.xh().N(str);
        }
    }

    /* compiled from: PhoneNumberLoginFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p38$h */
    /* loaded from: classes4.dex */
    /* synthetic */ class h extends m94 implements Function1<String, Unit> {
        h(Object obj) {
            super(1, obj, PhoneNumberLoginPresenter.class, "onBelarusLegalInfoClicked", "onBelarusLegalInfoClicked(Ljava/lang/String;)V", 0);
        }

        public final void b(String str) {
            z65.h(str, "p0");
            ((PhoneNumberLoginPresenter) this.receiver).J(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            b(str);
            return Unit.a;
        }
    }

    /* compiled from: PhoneNumberLoginFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p38$i */
    /* loaded from: classes4.dex */
    /* synthetic */ class i extends m94 implements Function1<String, Unit> {
        i(Object obj) {
            super(1, obj, PhoneNumberLoginPresenter.class, "onBelarusLegalInfoClicked", "onBelarusLegalInfoClicked(Ljava/lang/String;)V", 0);
        }

        public final void b(String str) {
            z65.h(str, "p0");
            ((PhoneNumberLoginPresenter) this.receiver).J(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            b(str);
            return Unit.a;
        }
    }

    /* compiled from: PhoneNumberLoginFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: p38$j */
    /* loaded from: classes4.dex */
    static final class j extends ej5 implements Function1<View, Unit> {
        j() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            p38.this.a();
            PhoneNumberLoginPresenter xh = p38.this.xh();
            String string = p38.this.getString(R.string.terms_of_use);
            z65.g(string, "getString(...)");
            xh.R(string);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    public p38() {
        super(R.layout.fragment_phonenumberlogin);
        this.c = kb0.e(this, R.id.phone_number_country_prefix);
        this.d = kb0.e(this, R.id.phone_number_login_input);
        this.e = kb0.e(this, R.id.phone_number_input_container);
        this.f = kb0.e(this, R.id.phone_number_next_button);
        this.g = kb0.e(this, R.id.phone_number_toolbar);
        this.h = kb0.e(this, R.id.phone_number_terms_of_use_label);
        this.i = kb0.e(this, R.id.phone_number_title);
        this.j = kb0.e(this, R.id.phone_number_subtitle);
        this.k = kb0.e(this, R.id.phone_number_main_layout);
        this.l = kb0.e(this, R.id.phone_number_loader);
        this.m = kb0.e(this, R.id.phone_number_send_loader);
        this.q = new k();
        f fVar = new f();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.r = new MoxyKtxDelegate(mvpDelegate, PhoneNumberLoginPresenter.class.getName() + ".presenter", fVar);
    }

    private final TextView Ah() {
        return (TextView) this.j.a(this, t[7]);
    }

    private final TextView Bh() {
        return (TextView) this.h.a(this, t[5]);
    }

    private final Toolbar Ch() {
        return (Toolbar) this.g.a(this, t[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Dh(p38 p38Var, View view) {
        z65.h(p38Var, "this$0");
        p38Var.xh().onBackPressed();
    }

    private final void Eh() {
        int b2 = un3.b(Ah(), wh());
        int a2 = jx9.a.a(25);
        if (b2 > a2) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.p(rh());
            dVar.n(wh().getId(), 4);
            dVar.i(rh());
            ViewGroup.LayoutParams layoutParams = wh().getLayoutParams();
            z65.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = a2;
            wh().setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Fh(p38 p38Var) {
        z65.h(p38Var, "this$0");
        p38Var.e();
    }

    private final void V() {
        gg5.d(vh());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        gg5.c(vh());
    }

    private final ConstraintLayout rh() {
        return (ConstraintLayout) this.k.a(this, t[8]);
    }

    private final TextView sh() {
        return (TextView) this.c.a(this, t[0]);
    }

    private final View th() {
        return (View) this.l.a(this, t[9]);
    }

    private final Button uh() {
        return (Button) this.f.a(this, t[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KeyboardAlwaysVisibleEditText vh() {
        return (KeyboardAlwaysVisibleEditText) this.d.a(this, t[1]);
    }

    private final LinearLayout wh() {
        return (LinearLayout) this.e.a(this, t[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhoneNumberLoginPresenter xh() {
        MvpPresenter value = this.r.getValue(this, t[11]);
        z65.g(value, "getValue(...)");
        return (PhoneNumberLoginPresenter) value;
    }

    private final ProgressBar zh() {
        return (ProgressBar) this.m.a(this, t[10]);
    }

    @Override // defpackage.a48
    public void A(String str) {
        z65.h(str, "phoneNumber");
        if (!z65.c(String.valueOf(vh().getText()), str)) {
            vh().setText(str);
            vh().setSelection(str.length());
        }
        vh().addTextChangedListener(this.q);
    }

    @Override // defpackage.a48
    public void Bf(String str, String str2) {
        z65.h(str, "callCenterPhone");
        d00.c cVar = d00.g;
        androidx.fragment.app.d requireActivity = requireActivity();
        z65.g(requireActivity, "requireActivity(...)");
        this.n = cVar.a(requireActivity, str2, new b(str));
    }

    @Override // defpackage.a48
    public void D(String str) {
        z65.h(str, "phonePrefix");
        sh().setText(str);
    }

    @Override // defpackage.a48
    public void Fe() {
        t28 t28Var = t28.a;
        androidx.fragment.app.d requireActivity = requireActivity();
        z65.g(requireActivity, "requireActivity(...)");
        t28Var.b(requireActivity, new g());
    }

    @Override // defpackage.a48
    public void Hg(boolean z) {
        if (z) {
            un3.k(zh());
        } else {
            un3.e(zh());
        }
    }

    @Override // defpackage.a48
    public void Tg(boolean z) {
        uh().setEnabled(z);
    }

    @Override // defpackage.a48
    public void e() {
        d00 d00Var = this.n;
        if (d00Var != null) {
            if (d00Var == null) {
                z65.z("authorizationIsNotAvailableDialog");
                d00Var = null;
            }
            d00Var.show();
            return;
        }
        new Handler().postDelayed(new Runnable() { // from class: o38
            @Override // java.lang.Runnable
            public final void run() {
                p38.Fh(p38.this);
            }
        }, 100L);
    }

    @Override // defpackage.a48
    public void fa() {
        un3.e(Bh());
    }

    @Override // defpackage.a48
    public void j2(String str, String str2) {
        z65.h(str, "termsOfUseLink");
        z65.h(str2, "personalDataLink");
        String string = getString(R.string.term_belarus_login_part1);
        z65.g(string, "getString(...)");
        String string2 = getString(R.string.term_belarus_login_link1);
        z65.g(string2, "getString(...)");
        String string3 = getString(R.string.term_belarus_login_link2);
        z65.g(string3, "getString(...)");
        b91 b91Var = new b91(new i(xh()), string2, str);
        b91 b91Var2 = new b91(new h(xh()), string3, str2);
        un3.k(Bh());
        TextView Bh = Bh();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string + string2 + string3);
        spannableStringBuilder.setSpan(b91Var, string.length(), string.length() + string2.length(), 33);
        spannableStringBuilder.setSpan(b91Var2, string.length() + string2.length(), string.length() + string2.length() + string3.length(), 33);
        spannableStringBuilder.setSpan(new UnderlineSpan(), string.length(), string.length() + string2.length() + string3.length(), 33);
        Bh.setText(spannableStringBuilder);
        Bh().setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // defpackage.a48
    public void l(boolean z) {
        un3.o(th(), z);
        un3.o(rh(), !z);
        if (!z) {
            gg5.d(vh());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        boolean z;
        Set<String> keySet;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        m38.a O1 = ((LocalityComponent) getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).O1();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("extra_request")) == null) ? null : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (keySet = arguments2.keySet()) != null) {
            z = keySet.contains("extra_request");
        } else {
            z = false;
        }
        if (obj != null && !(obj instanceof ru.dodopizza.app.presentation.phonenumberlogin.e)) {
            throw new ClassCastException("Property extra_request has different class type");
        } else if (obj == null && !z) {
            throw new IllegalArgumentException("Argument with key = extra_request not found in bundle");
        } else {
            ru.dodopizza.app.presentation.phonenumberlogin.e eVar = (ru.dodopizza.app.presentation.phonenumberlogin.e) obj;
            if (eVar != null) {
                O1.b(eVar).a().a(this);
                super.onAttach(context);
                return;
            }
            throw new IllegalArgumentException("Finish screen key must be defined");
        }
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        xh().onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            xh().V(bundle);
        }
        yz.c cVar = yz.b;
        androidx.fragment.app.d requireActivity = requireActivity();
        z65.g(requireActivity, "requireActivity(...)");
        this.o = cVar.a(requireActivity);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        z65.h(bundle, "outState");
        xh().W(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onStop() {
        a();
        super.onStop();
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(sh(), new c());
        Ch().setNavigationOnClickListener(new View.OnClickListener() { // from class: n38
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                p38.Dh(p38.this, view2);
            }
        });
        uh().setEnabled(false);
        oma.a(uh(), new d());
        V();
        Eh();
        vh().setListener(new e());
        vh().addTextChangedListener(this.q);
        String valueOf = String.valueOf(vh().getText());
        if (valueOf.length() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            xh().Q(valueOf);
        }
    }

    @Override // defpackage.a48
    public void qb() {
        String string = getString(R.string.login_legal_docs_link_prefix);
        z65.g(string, "getString(...)");
        String string2 = getString(R.string.login_legal_docs_link_text);
        z65.g(string2, "getString(...)");
        un3.k(Bh());
        TextView Bh = Bh();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string + string2);
        spannableStringBuilder.setSpan(new UnderlineSpan(), string.length(), string.length() + string2.length(), 33);
        Bh.setText(spannableStringBuilder);
        oma.a(Bh(), new j());
    }

    @Override // defpackage.a48
    public void t2() {
        yz yzVar = this.o;
        if (yzVar == null) {
            z65.z("cantSendSmsDialog");
            yzVar = null;
        }
        yzVar.show();
    }

    public final as8<PhoneNumberLoginPresenter> yh() {
        as8<PhoneNumberLoginPresenter> as8Var = this.p;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    /* compiled from: PhoneNumberLoginFragment.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J*\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"p38$k", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", Image.TYPE_SMALL, "", "afterTextChanged", "", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "", "a", "Ljava/lang/String;", "previousText", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: p38$k */
    /* loaded from: classes4.dex */
    public static final class k implements TextWatcher {
        private String a = "";

        k() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String obj;
            if (editable != null && (obj = editable.toString()) != null) {
                p38 p38Var = p38.this;
                p38Var.vh().removeTextChangedListener(this);
                if (this.a.length() == 0 && obj.length() > 1) {
                    p38Var.xh().b0(obj);
                } else {
                    p38Var.xh().Q(obj);
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            this.a = str;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
