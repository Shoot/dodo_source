package ru.dodopizza.app.presentation.selectlocation.landing.smsinput;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.xk5;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.MvpPresenter;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.modules.presentation.landing.smsinput.LandingSMSInputFeatureDependencies;
import ru.dodopizza.app.presentation.selectlocation.landing.smsinput.RectEntryEditTextView;
import ru.dodopizza.app.presentation.selectlocation.landing.smsinput.a;
/* compiled from: LandingSMSInputFragment.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 h2\u00020\u00012\u00020\u0002:\u0001iB\u0007¢\u0006\u0004\bf\u0010gJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0002J-\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\b2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u0012\u0010\u0016\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\b\u0010 \u001a\u00020\u0003H\u0016J\b\u0010!\u001a\u00020\u0003H\u0016J\b\u0010\"\u001a\u00020\u0003H\u0016J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#H\u0016J\u001a\u0010(\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\nH\u0016J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0018H\u0016J\b\u0010-\u001a\u00020\u0003H\u0016J\b\u0010.\u001a\u00020\u0003H\u0016R(\u00107\u001a\b\u0012\u0004\u0012\u0002000/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001b\u0010<\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u001b\u0010I\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010F\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010F\u001a\u0004\bQ\u0010RR\u001b\u0010X\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010F\u001a\u0004\bV\u0010WR\u001b\u0010[\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010F\u001a\u0004\bZ\u0010MR\u001b\u0010]\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010F\u001a\u0004\b\\\u0010MR\u001b\u0010b\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010F\u001a\u0004\b`\u0010aR\u001b\u0010e\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010F\u001a\u0004\bd\u0010M¨\u0006j"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/a;", "Lf70;", "Lll5;", "", "Eh", "Kh", "Ih", "Fh", "", "resId", "", "uh", "", "", "args", "vh", "(I[Ljava/lang/Object;)Ljava/lang/String;", "Lwk5;", "data", "Jh", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "E8", "", "delayTime", "f0", "", "isLoading", "l", "i2", "Fb", "Q8", "R", "h0", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/View;", "view", "onViewCreated", "addressText", "setAddress", CrashHianalyticsData.TIME, "F9", "onPause", com.huawei.hms.push.e.a, "Las8;", "Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/LandingSMSInputPresenter;", com.huawei.hms.opendevice.c.a, "Las8;", "yh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", DateTokenConverter.CONVERTER_KEY, "Lmoxy/ktx/MoxyKtxDelegate;", "xh", "()Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/LandingSMSInputPresenter;", "presenter", "Lfk5;", "Lfk5;", "landingCallback", "Lks5;", "f", "Lks5;", "localeContextProvider", "Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/RectEntryEditTextView;", "g", "Lk79;", "wh", "()Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/RectEntryEditTextView;", "pinEntryView", "Landroid/widget/TextView;", Image.TYPE_HIGH, "Ah", "()Landroid/widget/TextView;", "timerView", "Landroid/widget/ImageView;", "i", "th", "()Landroid/widget/ImageView;", "backBtn", "Landroid/widget/Button;", "j", "Ch", "()Landroid/widget/Button;", "tryAgainBtn", "k", "sh", "address", "Dh", "wrongPinLabel", "Landroid/widget/ProgressBar;", Image.TYPE_MEDIUM, "zh", "()Landroid/widget/ProgressBar;", "progressBar", "n", "Bh", "title", "<init>", "()V", "o", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class a extends f70 implements ll5 {
    public as8<LandingSMSInputPresenter> c;
    private final MoxyKtxDelegate d;
    private fk5 e;
    private ks5 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    private final k79 m;
    private final k79 n;
    static final /* synthetic */ je5<Object>[] p = {bc9.f(new ar8(a.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/LandingSMSInputPresenter;", 0)), bc9.f(new ar8(a.class, "pinEntryView", "getPinEntryView()Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/RectEntryEditTextView;", 0)), bc9.f(new ar8(a.class, "timerView", "getTimerView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "backBtn", "getBackBtn()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(a.class, "tryAgainBtn", "getTryAgainBtn()Landroid/widget/Button;", 0)), bc9.f(new ar8(a.class, "address", "getAddress()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "wrongPinLabel", "getWrongPinLabel()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)), bc9.f(new ar8(a.class, "title", "getTitle()Landroid/widget/TextView;", 0))};
    public static final C0612a o = new C0612a(null);

    /* compiled from: LandingSMSInputFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/a$a;", "", "", "EXTRA_KEY_ADDRESS", "Ljava/lang/String;", "EXTRA_KEY_LOCALITY", "EXTRA_KEY_PHONE_NUMBER", "", "TIMER_TEMP_DIVIDER", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.selectlocation.landing.smsinput.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0612a {
        private C0612a() {
        }

        public /* synthetic */ C0612a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LandingSMSInputFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.smsinput.LandingSMSInputFragment$clearPinWithDelay$1", f = "LandingSMSInputFragment.kt", l = {94}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ long b;
        final /* synthetic */ a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j, a aVar, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.b = j;
            this.c = aVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(this.b, this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                long j = this.b;
                this.a = 1;
                if (xt2.a(j, this) == d) {
                    return d;
                }
            }
            this.c.wh().h();
            return Unit.a;
        }
    }

    /* compiled from: LandingSMSInputFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ru/dodopizza/app/presentation/selectlocation/landing/smsinput/a$c", "Li77;", "", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c extends i77 {
        c() {
            super(true);
        }

        @Override // defpackage.i77
        public void b() {
            fk5 fk5Var = a.this.e;
            if (fk5Var == null) {
                z65.z("landingCallback");
                fk5Var = null;
            }
            fk5Var.pf();
        }
    }

    /* compiled from: LandingSMSInputFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"ru/dodopizza/app/presentation/selectlocation/landing/smsinput/a$d", "Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/RectEntryEditTextView$d;", "", "code", "", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class d implements RectEntryEditTextView.d {
        d() {
        }

        @Override // ru.dodopizza.app.presentation.selectlocation.landing.smsinput.RectEntryEditTextView.d
        public void a(String str) {
            z65.h(str, "code");
            a.this.xh().t(str);
        }
    }

    /* compiled from: LandingSMSInputFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"ru/dodopizza/app/presentation/selectlocation/landing/smsinput/a$e", "Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/RectEntryEditTextView$c;", "", "isAlerted", "", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class e implements RectEntryEditTextView.c {
        e() {
        }

        @Override // ru.dodopizza.app.presentation.selectlocation.landing.smsinput.RectEntryEditTextView.c
        public void a(boolean z) {
            un3.o(a.this.Dh(), z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LandingSMSInputFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class f extends ej5 implements Function0<Unit> {
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
            gg5.d(a.this.wh());
        }
    }

    /* compiled from: LandingSMSInputFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/LandingSMSInputPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/LandingSMSInputPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function0<LandingSMSInputPresenter> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final LandingSMSInputPresenter invoke() {
            return a.this.yh().get();
        }
    }

    public a() {
        super(R.layout.fragment_landing_sms_input);
        g gVar = new g();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.d = new MoxyKtxDelegate(mvpDelegate, LandingSMSInputPresenter.class.getName() + ".presenter", gVar);
        this.g = kb0.e(this, R.id.landing_sms_pin_entry);
        this.h = kb0.e(this, R.id.landing_sms_timer);
        this.i = kb0.e(this, R.id.landing_sms_back_btn);
        this.j = kb0.e(this, R.id.landing_sms_try_again_btn);
        this.k = kb0.e(this, R.id.landing_sms_address);
        this.l = kb0.e(this, R.id.landing_sms_wrong_pin_label);
        this.m = kb0.e(this, R.id.landing_sms_progress_bar);
        this.n = kb0.e(this, R.id.landing_sms_title_tv);
    }

    private final TextView Ah() {
        return (TextView) this.h.a(this, p[2]);
    }

    private final TextView Bh() {
        return (TextView) this.n.a(this, p[8]);
    }

    private final Button Ch() {
        return (Button) this.j.a(this, p[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView Dh() {
        return (TextView) this.l.a(this, p[6]);
    }

    private final void Eh() {
        requireActivity().getOnBackPressedDispatcher().b(this, new c());
    }

    private final void Fh() {
        th().setOnClickListener(new View.OnClickListener() { // from class: yk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.Gh(a.this, view);
            }
        });
        Ch().setOnClickListener(new View.OnClickListener() { // from class: zk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.Hh(a.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Gh(a aVar, View view) {
        z65.h(aVar, "this$0");
        fk5 fk5Var = aVar.e;
        if (fk5Var == null) {
            z65.z("landingCallback");
            fk5Var = null;
        }
        fk5Var.pf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Hh(a aVar, View view) {
        z65.h(aVar, "this$0");
        aVar.xh().B();
    }

    private final void Ih() {
        wh().setOnCodeEnteredListener(new d());
        wh().setOnCodeAlertChangedListener(new e());
        un3.g(this, new f());
    }

    private final void Kh() {
        Ch().setText(uh(R.string.landing_sms_request_try_again));
        TextView Bh = Bh();
        Object[] objArr = new Object[1];
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("extra_key_phone_number")) == null) ? null : null;
        if (obj != null) {
            objArr[0] = obj;
            Bh.setText(vh(R.string.pin_code_subtitle_promocode, objArr));
            return;
        }
        throw new IllegalArgumentException("Argument with key = extra_key_phone_number not found in bundle");
    }

    private final TextView sh() {
        return (TextView) this.k.a(this, p[5]);
    }

    private final ImageView th() {
        return (ImageView) this.i.a(this, p[3]);
    }

    private final String uh(int i) {
        ks5 ks5Var = this.f;
        if (ks5Var == null) {
            z65.z("localeContextProvider");
            ks5Var = null;
        }
        String string = ks5Var.G3().getString(i);
        z65.g(string, "getString(...)");
        return string;
    }

    private final String vh(int i, Object... objArr) {
        ks5 ks5Var = this.f;
        if (ks5Var == null) {
            z65.z("localeContextProvider");
            ks5Var = null;
        }
        String string = ks5Var.G3().getString(i, Arrays.copyOf(objArr, objArr.length));
        z65.g(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RectEntryEditTextView wh() {
        return (RectEntryEditTextView) this.g.a(this, p[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LandingSMSInputPresenter xh() {
        MvpPresenter value = this.d.getValue(this, p[0]);
        z65.g(value, "getValue(...)");
        return (LandingSMSInputPresenter) value;
    }

    private final ProgressBar zh() {
        return (ProgressBar) this.m.a(this, p[7]);
    }

    @Override // defpackage.ll5
    public void E8() {
        wh().f();
    }

    @Override // defpackage.ll5
    public void F9(long j) {
        un3.k(Ah());
        TextView Ah = Ah();
        pza pzaVar = pza.a;
        String format = String.format(uh(R.string.landing_sms_request_timer), Arrays.copyOf(new Object[]{Long.valueOf(j / 1000)}, 1));
        z65.g(format, "format(...)");
        Ah.setText(format);
    }

    @Override // defpackage.ll5
    public void Fb() {
        wh().g(true);
    }

    public final a Jh(wk5 wk5Var) {
        z65.h(wk5Var, "data");
        return (a) y64.d(new a(), bi0.c(bi0.d("extra_key_locality", wk5Var.b()), bi0.d("extra_key_phone_number", wk5Var.c()), bi0.d("extra_key_address", wk5Var.a())));
    }

    @Override // defpackage.ll5
    public void Q8() {
        gg5.c(wh());
        fk5 fk5Var = this.e;
        if (fk5Var == null) {
            z65.z("landingCallback");
            fk5Var = null;
        }
        fk5Var.U4();
    }

    @Override // defpackage.ll5
    public void R() {
        Ch().setEnabled(true);
        Ah().setVisibility(4);
    }

    @Override // defpackage.ll5
    public void e() {
        Toast.makeText(requireContext(), uh(R.string.landing_dialog_error), 0).show();
    }

    @Override // defpackage.ll5
    public void f0(long j) {
        sh0.d(pp5.a(this), null, null, new b(j, this, null), 3, null);
    }

    @Override // defpackage.ll5
    public void h0() {
        Ch().setEnabled(false);
    }

    @Override // defpackage.ll5
    public void i2() {
        wh().g(false);
    }

    @Override // defpackage.ll5
    public void l(boolean z) {
        un3.o(zh(), z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        super.onAttach(context);
        Eh();
        Fragment parentFragment = getParentFragment();
        z65.f(parentFragment, "null cannot be cast to non-null type ru.dodopizza.app.presentation.selectlocation.landing.LandingNavigationCallback");
        this.e = (fk5) parentFragment;
        Fragment parentFragment2 = getParentFragment();
        z65.f(parentFragment2, "null cannot be cast to non-null type ru.dodopizza.app.presentation.selectlocation.landing.LocaleContextProvider");
        this.f = (ks5) parentFragment2;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        xk5.b a = xk5.a.a();
        LandingSMSInputFeatureDependencies landingSMSInputFeatureDependencies = (LandingSMSInputFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(LandingSMSInputFeatureDependencies.class));
        Bundle arguments = getArguments();
        String str = null;
        if (arguments == null || (obj = arguments.get("extra_key_locality")) == null) {
            obj = null;
        }
        if (obj != null && !(obj instanceof dt5)) {
            throw new ClassCastException("Property extra_key_locality has different class type");
        } else if (obj != null) {
            String d2 = ((dt5) obj).d();
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (obj2 = arguments2.get("extra_key_locality")) == null) {
                obj2 = null;
            }
            if (obj2 != null && !(obj2 instanceof dt5)) {
                throw new ClassCastException("Property extra_key_locality has different class type");
            } else if (obj2 != null) {
                String id = ((dt5) obj2).getId();
                Bundle arguments3 = getArguments();
                if (arguments3 == null || (obj3 = arguments3.get("extra_key_locality")) == null) {
                    obj3 = null;
                }
                if (obj3 != null && !(obj3 instanceof dt5)) {
                    throw new ClassCastException("Property extra_key_locality has different class type");
                } else if (obj3 != null) {
                    String a2 = ((dt5) obj3).a();
                    Bundle arguments4 = getArguments();
                    if (arguments4 == null || (obj4 = arguments4.get("extra_key_address")) == null) {
                        obj4 = null;
                    }
                    if (obj4 != null && !(obj4 instanceof String)) {
                        throw new ClassCastException("Property extra_key_address has different class type");
                    } else if (obj4 != null) {
                        String str2 = (String) obj4;
                        Bundle arguments5 = getArguments();
                        if (arguments5 != null && (obj5 = arguments5.get("extra_key_phone_number")) != null) {
                            str = obj5;
                        }
                        if (str != null && !(str instanceof String)) {
                            throw new ClassCastException("Property extra_key_phone_number has different class type");
                        } else if (str != null) {
                            a.a(landingSMSInputFeatureDependencies, a2, str, d2, id, str2).a(this);
                            super.onCreate(bundle);
                        } else {
                            throw new IllegalArgumentException("Argument with key = extra_key_phone_number not found in bundle");
                        }
                    } else {
                        throw new IllegalArgumentException("Argument with key = extra_key_address not found in bundle");
                    }
                } else {
                    throw new IllegalArgumentException("Argument with key = extra_key_locality not found in bundle");
                }
            } else {
                throw new IllegalArgumentException("Argument with key = extra_key_locality not found in bundle");
            }
        } else {
            throw new IllegalArgumentException("Argument with key = extra_key_locality not found in bundle");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        gg5.c(wh());
        super.onPause();
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Fh();
        Ih();
        Kh();
    }

    @Override // defpackage.ll5
    public void setAddress(String str) {
        z65.h(str, "addressText");
        sh().setText(str);
    }

    public final as8<LandingSMSInputPresenter> yh() {
        as8<LandingSMSInputPresenter> as8Var = this.c;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
