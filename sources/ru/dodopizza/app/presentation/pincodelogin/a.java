package ru.dodopizza.app.presentation.pincodelogin;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.BidiFormatter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.d00;
import defpackage.e68;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.presentation.phonenumberlogin.e;
import ru.dodopizza.app.presentation.pincodelogin.PinEntryEditTextView;
import ru.dodopizza.app.presentation.pincodelogin.a;
import ru.dodopizza.app.presentation.pincodelogin.d;
/* compiled from: PinCodeLoginFragment.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 z2\u00020\u00012\u00020\u0002:\u0001{B\u0007¢\u0006\u0004\bx\u0010yJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\b\u0010 \u001a\u00020\u0003H\u0016J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u001aH\u0016J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u001aH\u0016J\b\u0010%\u001a\u00020\u0003H\u0016J\b\u0010&\u001a\u00020\u0003H\u0016J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'H\u0016R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010,\u001a\u0004\b<\u0010=R\u001b\u0010A\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010,\u001a\u0004\b@\u0010=R\u001b\u0010D\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010,\u001a\u0004\bC\u0010=R\u001b\u0010G\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010,\u001a\u0004\bF\u0010=R\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010,\u001a\u0004\bJ\u0010KR\u001b\u0010O\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010,\u001a\u0004\bN\u0010=R\u001b\u0010S\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010,\u001a\u0004\bQ\u0010RR\u0016\u0010V\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010YR\u001b\u0010`\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR(\u0010q\u001a\b\u0012\u0004\u0012\u00020j0i8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR#\u0010w\u001a\n r*\u0004\u0018\u00010j0j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v¨\u0006|"}, d2 = {"Lru/dodopizza/app/presentation/pincodelogin/a;", "Lf70;", "Lo68;", "", "Ih", "Kh", "Landroid/view/View;", "topElement", "bottomElement", "", "sh", "remainSeconds", "Lh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "titleResId", "ac", "subtitleResId", "", "userPhone", "k8", "", "isLoading", "l", "Sc", "Z1", "onStop", "onPause", "isBlocked", "Qc", "isVisible", "M9", "R5", "y3", "", "delayTime", "f0", "Lru/dodopizza/app/presentation/pincodelogin/PinEntryEditTextView;", com.huawei.hms.opendevice.c.a, "Lk79;", "yh", "()Lru/dodopizza/app/presentation/pincodelogin/PinEntryEditTextView;", "pinEntryView", "Landroid/widget/LinearLayout;", DateTokenConverter.CONVERTER_KEY, "xh", "()Landroid/widget/LinearLayout;", "pinEntryContainer", "Landroidx/appcompat/widget/Toolbar;", com.huawei.hms.push.e.a, "Gh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/TextView;", "f", "Fh", "()Landroid/widget/TextView;", "title", "g", "Eh", "subtitle", Image.TYPE_HIGH, "Dh", "resendSmsCodeDescription", "i", "Ch", "resendCodeButton", "Landroid/widget/ProgressBar;", "j", "Bh", "()Landroid/widget/ProgressBar;", "progressBar", "k", "Hh", "wrongPinLabel", "Landroidx/constraintlayout/widget/ConstraintLayout;", "vh", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "constraintLayout", Image.TYPE_MEDIUM, "J", "startCounterTime", "Landroid/os/CountDownTimer;", "n", "Landroid/os/CountDownTimer;", "timer", "Ld00;", "o", "Lrn5;", "uh", "()Ld00;", "authorizationIsNotAvailableDialog", "Lru/dodopizza/app/presentation/pincodelogin/d;", "p", "Lru/dodopizza/app/presentation/pincodelogin/d;", "wh", "()Lru/dodopizza/app/presentation/pincodelogin/d;", "setPinCodeSmsHelper", "(Lru/dodopizza/app/presentation/pincodelogin/d;)V", "pinCodeSmsHelper", "Las8;", "Lru/dodopizza/app/presentation/pincodelogin/PinCodeLoginPresenter;", "q", "Las8;", "Ah", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "r", "Lmoxy/ktx/MoxyKtxDelegate;", "zh", "()Lru/dodopizza/app/presentation/pincodelogin/PinCodeLoginPresenter;", "presenter", "<init>", "()V", Image.TYPE_SMALL, "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class a extends f70 implements o68 {
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
    private long m;
    private CountDownTimer n;
    private final rn5 o;
    public ru.dodopizza.app.presentation.pincodelogin.d p;
    public as8<PinCodeLoginPresenter> q;
    private final MoxyKtxDelegate r;
    static final /* synthetic */ je5<Object>[] t = {bc9.f(new ar8(a.class, "pinEntryView", "getPinEntryView()Lru/dodopizza/app/presentation/pincodelogin/PinEntryEditTextView;", 0)), bc9.f(new ar8(a.class, "pinEntryContainer", "getPinEntryContainer()Landroid/widget/LinearLayout;", 0)), bc9.f(new ar8(a.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(a.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "resendSmsCodeDescription", "getResendSmsCodeDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "resendCodeButton", "getResendCodeButton()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)), bc9.f(new ar8(a.class, "wrongPinLabel", "getWrongPinLabel()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "constraintLayout", "getConstraintLayout()Landroidx/constraintlayout/widget/ConstraintLayout;", 0)), bc9.f(new ar8(a.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/pincodelogin/PinCodeLoginPresenter;", 0))};
    public static final C0583a s = new C0583a(null);

    /* compiled from: PinCodeLoginFragment.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/dodopizza/app/presentation/pincodelogin/a$a;", "", "Lru/dodopizza/app/presentation/pincodelogin/a$a$a;", "args", "Lru/dodopizza/app/presentation/pincodelogin/a;", "a", "", "COUNTER_TIME", "J", "COUNTER_UPDATE_INTERVAL", "", "EXTRA_KEY_CALL_CENTER_PHONE_NUMBER", "Ljava/lang/String;", "EXTRA_KEY_CONTEXT", "EXTRA_KEY_FORMATTED_PHONE_NUMBER", "EXTRA_KEY_PHONE_NUMBER", "EXTRA_KEY_SITE_URL", "", "MAX_TOP_MARGIN_DIMEN_RES_ID", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.pincodelogin.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0583a {

        /* compiled from: PinCodeLoginFragment.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\t\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u000e\u0010\u0016¨\u0006\u001a"}, d2 = {"Lru/dodopizza/app/presentation/pincodelogin/a$a$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "phoneNumber", "b", com.huawei.hms.opendevice.c.a, "formattedPhoneNumber", "callCenterPhone", com.huawei.hms.push.e.a, "siteUrl", "Lru/dodopizza/app/presentation/phonenumberlogin/e$a;", "Lru/dodopizza/app/presentation/phonenumberlogin/e$a;", "()Lru/dodopizza/app/presentation/phonenumberlogin/e$a;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/app/presentation/phonenumberlogin/e$a;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ru.dodopizza.app.presentation.pincodelogin.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0584a {
            private final String a;
            private final String b;
            private final String c;
            private final String d;
            private final e.a e;

            public C0584a(String str, String str2, String str3, String str4, e.a aVar) {
                z65.h(str, "phoneNumber");
                z65.h(str2, "formattedPhoneNumber");
                z65.h(str3, "callCenterPhone");
                z65.h(aVar, CoreConstants.CONTEXT_SCOPE_VALUE);
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = aVar;
            }

            public final String a() {
                return this.c;
            }

            public final e.a b() {
                return this.e;
            }

            public final String c() {
                return this.b;
            }

            public final String d() {
                return this.a;
            }

            public final String e() {
                return this.d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0584a)) {
                    return false;
                }
                C0584a c0584a = (C0584a) obj;
                if (z65.c(this.a, c0584a.a) && z65.c(this.b, c0584a.b) && z65.c(this.c, c0584a.c) && z65.c(this.d, c0584a.d) && this.e == c0584a.e) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
                String str = this.d;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return ((hashCode2 + hashCode) * 31) + this.e.hashCode();
            }

            public String toString() {
                String str = this.a;
                String str2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                e.a aVar = this.e;
                return "PinCodeLoginFragmentArgs(phoneNumber=" + str + ", formattedPhoneNumber=" + str2 + ", callCenterPhone=" + str3 + ", siteUrl=" + str4 + ", context=" + aVar + ")";
            }
        }

        private C0583a() {
        }

        public /* synthetic */ C0583a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(C0584a c0584a) {
            z65.h(c0584a, "args");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("extra_key_formatted_phone_number", c0584a.c());
            bundle.putString("extra_key_phone_number", c0584a.d());
            bundle.putString("extra_key_call_center_phone_number", c0584a.a());
            bundle.putString("extra_key_site_url", c0584a.e());
            bundle.putInt("extra_key_context", c0584a.b().ordinal());
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    /* compiled from: PinCodeLoginFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ld00;", "a", "()Ld00;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<d00> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PinCodeLoginFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ld00$b;", "", "a", "(Ld00$b;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: ru.dodopizza.app.presentation.pincodelogin.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0585a extends ej5 implements Function1<d00.b, Unit> {
            final /* synthetic */ a a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PinCodeLoginFragment.kt */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: ru.dodopizza.app.presentation.pincodelogin.a$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0586a extends ej5 implements Function0<Unit> {
                final /* synthetic */ a a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0586a(a aVar) {
                    super(0);
                    this.a = aVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void b(a aVar) {
                    z65.h(aVar, "this$0");
                    gg5.d(aVar.yh());
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Handler handler = new Handler();
                    final a aVar = this.a;
                    handler.post(new Runnable() { // from class: ru.dodopizza.app.presentation.pincodelogin.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.b.C0585a.C0586a.b(a.this);
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0585a(a aVar) {
                super(1);
                this.a = aVar;
            }

            public final void a(d00.b bVar) {
                String str;
                z65.h(bVar, "$this$newInstance");
                Bundle arguments = this.a.getArguments();
                if (arguments != null) {
                    str = arguments.getString("extra_key_call_center_phone_number");
                } else {
                    str = null;
                }
                if (str != null) {
                    bVar.c(str);
                    bVar.b(new C0586a(this.a));
                    return;
                }
                throw new IllegalArgumentException("Call center phone number must be set");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(d00.b bVar) {
                a(bVar);
                return Unit.a;
            }
        }

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final d00 invoke() {
            String str;
            d00.c cVar = d00.g;
            androidx.fragment.app.d requireActivity = a.this.requireActivity();
            z65.g(requireActivity, "requireActivity(...)");
            Bundle arguments = a.this.getArguments();
            if (arguments != null) {
                str = arguments.getString("extra_key_site_url");
            } else {
                str = null;
            }
            return cVar.a(requireActivity, str, new C0585a(a.this));
        }
    }

    /* compiled from: PinCodeLoginFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"ru/dodopizza/app/presentation/pincodelogin/a$c", "Lru/dodopizza/app/presentation/pincodelogin/PinEntryEditTextView$c;", "", "pin", "", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c implements PinEntryEditTextView.c {
        c() {
        }

        @Override // ru.dodopizza.app.presentation.pincodelogin.PinEntryEditTextView.c
        public void a(String str) {
            z65.h(str, "pin");
            a.this.zh().x(str);
        }
    }

    /* compiled from: PinCodeLoginFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"ru/dodopizza/app/presentation/pincodelogin/a$d", "Lru/dodopizza/app/presentation/pincodelogin/PinEntryEditTextView$b;", "", "isAlerted", "", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class d implements PinEntryEditTextView.b {
        d() {
        }

        @Override // ru.dodopizza.app.presentation.pincodelogin.PinEntryEditTextView.b
        public void a(boolean z) {
            un3.o(a.this.Hh(), z);
        }
    }

    /* compiled from: PinCodeLoginFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            a.this.zh().y();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: PinCodeLoginFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function0<Unit> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            gg5.d(a.this.yh());
        }
    }

    /* compiled from: PinCodeLoginFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/pincodelogin/PinCodeLoginPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/pincodelogin/PinCodeLoginPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function0<PinCodeLoginPresenter> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final PinCodeLoginPresenter invoke() {
            return a.this.Ah().get();
        }
    }

    /* compiled from: PinCodeLoginFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"ru/dodopizza/app/presentation/pincodelogin/a$h", "Landroid/os/CountDownTimer;", "", "onFinish", "", "millisUntilFinished", "onTick", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class h extends CountDownTimer {
        h() {
            super(60000L, 300L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            a.this.zh().z();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            a.this.Lh((int) (j / 1000));
        }
    }

    /* compiled from: PinCodeLoginFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"ru/dodopizza/app/presentation/pincodelogin/a$i", "Lru/dodopizza/app/presentation/pincodelogin/d$a;", "", "pinCode", "", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class i implements d.a {
        i() {
        }

        @Override // ru.dodopizza.app.presentation.pincodelogin.d.a
        public void a(String str) {
            z65.h(str, "pinCode");
            a.this.yh().setPin(str);
        }
    }

    public a() {
        super(R.layout.fragment_pincodelogin);
        rn5 b2;
        this.c = kb0.e(this, R.id.pin_entry);
        this.d = kb0.e(this, R.id.pin_entry_container);
        this.e = kb0.e(this, R.id.toolbar);
        this.f = kb0.e(this, R.id.pin_code_title);
        this.g = kb0.e(this, R.id.pin_code_subtitle);
        this.h = kb0.e(this, R.id.resend_sms_code_label);
        this.i = kb0.e(this, R.id.resend_code_button);
        this.j = kb0.e(this, R.id.progress);
        this.k = kb0.e(this, R.id.wrong_pin_label);
        this.l = kb0.e(this, R.id.frame);
        b2 = yn5.b(new b());
        this.o = b2;
        g gVar = new g();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.r = new MoxyKtxDelegate(mvpDelegate, PinCodeLoginPresenter.class.getName() + ".presenter", gVar);
    }

    private final ProgressBar Bh() {
        return (ProgressBar) this.j.a(this, t[7]);
    }

    private final TextView Ch() {
        return (TextView) this.i.a(this, t[6]);
    }

    private final TextView Dh() {
        return (TextView) this.h.a(this, t[5]);
    }

    private final TextView Eh() {
        return (TextView) this.g.a(this, t[4]);
    }

    private final TextView Fh() {
        return (TextView) this.f.a(this, t[3]);
    }

    private final Toolbar Gh() {
        return (Toolbar) this.e.a(this, t[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView Hh() {
        return (TextView) this.k.a(this, t[8]);
    }

    private final void Ih() {
        String str;
        String str2;
        e68.a u1 = ((LocalityComponent) getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).u1();
        Bundle arguments = getArguments();
        Integer num = null;
        if (arguments != null) {
            str = arguments.getString("extra_key_phone_number");
        } else {
            str = null;
        }
        if (str != null) {
            z65.g(str, "requireNotNull(...)");
            e68.a d2 = u1.d(str);
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                str2 = arguments2.getString("extra_key_formatted_phone_number");
            } else {
                str2 = null;
            }
            if (str2 != null) {
                z65.g(str2, "requireNotNull(...)");
                e68.a b2 = d2.b(str2);
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    num = Integer.valueOf(arguments3.getInt("extra_key_context"));
                }
                if (num != null) {
                    b2.c(e.a.values()[num.intValue()]).a().a(this);
                    return;
                }
                throw new IllegalArgumentException("Must have request context".toString());
            }
            throw new IllegalArgumentException("Must have formatted phone number".toString());
        }
        throw new IllegalArgumentException("Must have phone number".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jh(a aVar, View view) {
        z65.h(aVar, "this$0");
        aVar.zh().onBackPressed();
    }

    private final void Kh() {
        int sh = sh(Eh(), xh());
        int a = jx9.a.a(48);
        if (sh > a) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.p(vh());
            dVar.n(xh().getId(), 4);
            dVar.i(vh());
            ViewGroup.LayoutParams layoutParams = xh().getLayoutParams();
            z65.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = a;
            xh().setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Lh(int i2) {
        if (isAdded()) {
            Dh().setText(getString(R.string.resend_code, Integer.valueOf(i2)));
            return;
        }
        CountDownTimer countDownTimer = this.n;
        if (countDownTimer == null) {
            z65.z("timer");
            countDownTimer = null;
        }
        countDownTimer.cancel();
    }

    private final int sh(View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        return iArr2[1] - iArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void th(a aVar) {
        z65.h(aVar, "this$0");
        aVar.yh().h();
    }

    private final d00 uh() {
        return (d00) this.o.getValue();
    }

    private final ConstraintLayout vh() {
        return (ConstraintLayout) this.l.a(this, t[9]);
    }

    private final LinearLayout xh() {
        return (LinearLayout) this.d.a(this, t[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PinEntryEditTextView yh() {
        return (PinEntryEditTextView) this.c.a(this, t[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PinCodeLoginPresenter zh() {
        return (PinCodeLoginPresenter) this.r.getValue(this, t[10]);
    }

    public final as8<PinCodeLoginPresenter> Ah() {
        as8<PinCodeLoginPresenter> as8Var = this.q;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.o68
    public void M9(boolean z) {
        un3.o(Dh(), z);
    }

    @Override // defpackage.o68
    public void Qc(boolean z) {
        Ch().setEnabled(!z);
    }

    @Override // defpackage.o68
    public void R5() {
        yh().f();
    }

    @Override // defpackage.o68
    public void Sc() {
        this.m = System.currentTimeMillis();
        h hVar = new h();
        this.n = hVar;
        hVar.start();
    }

    @Override // defpackage.o68
    public void Z1() {
        ru.dodopizza.app.presentation.pincodelogin.d wh = wh();
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        wh.f(requireContext, new i());
    }

    @Override // defpackage.o68
    public void ac(int i2) {
        Fh().setText(i2);
    }

    @Override // defpackage.o68
    public void f0(long j) {
        yh().postDelayed(new Runnable() { // from class: g68
            @Override // java.lang.Runnable
            public final void run() {
                a.th(a.this);
            }
        }, j);
    }

    @Override // defpackage.o68
    public void k8(int i2, String str) {
        z65.h(str, "userPhone");
        Eh().setText(getString(i2, BidiFormatter.getInstance().unicodeWrap(str)));
    }

    @Override // defpackage.o68
    public void l(boolean z) {
        yh().g(z);
        un3.o(Bh(), z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Ih();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        gg5.c(yh());
        super.onPause();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onStop() {
        wh().e();
        super.onStop();
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Gh().setNavigationOnClickListener(new View.OnClickListener() { // from class: f68
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a.Jh(a.this, view2);
            }
        });
        yh().setOnPinEnteredListener(new c());
        yh().setOnPinAlertChangedListener(new d());
        oma.a(Ch(), new e());
        Kh();
        un3.g(this, new f());
    }

    public final ru.dodopizza.app.presentation.pincodelogin.d wh() {
        ru.dodopizza.app.presentation.pincodelogin.d dVar = this.p;
        if (dVar != null) {
            return dVar;
        }
        z65.z("pinCodeSmsHelper");
        return null;
    }

    @Override // defpackage.o68
    public void y3() {
        uh().show();
        l(false);
        yh().h();
    }
}
