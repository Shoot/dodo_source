package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.airbnb.lottie.LottieAnimationView;
import com.dodopizza.android.buttons.DodoButton;
import com.dodopizza.loyalty.missions.LoyaltyMissionDetailsPresenter;
import com.dodopizza.loyalty.missions.di.LoyaltyMissionDetailsDependencies;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.a16;
import defpackage.c5c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: LoyaltyMissionDetailsFragmentV2024.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u009a\u00012\u00020\u00012\u00020\u0002:\u0002\u009b\u0001B\t¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0012\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0002J$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u001a\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000fH\u0014J\b\u0010\u0017\u001a\u00020\u0003H\u0014J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0018H\u0016J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0003H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0018H\u0016J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0018H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\b\u0010*\u001a\u00020\u0005H\u0016J\u0018\u0010-\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003H\u0016J\u0010\u0010.\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0003H\u0016J\b\u0010/\u001a\u00020\u0005H\u0016J\b\u00100\u001a\u00020\u0005H\u0016J\u0010\u00101\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u00102\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u00103\u001a\u00020\u0005H\u0016J\u0010\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0003H\u0016J\b\u00106\u001a\u00020\u0005H\u0016J\b\u00107\u001a\u00020\u0005H\u0016J\b\u00108\u001a\u00020\u0005H\u0016J\u0010\u0010:\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u0018H\u0016J\b\u0010;\u001a\u00020\u0005H\u0016J\b\u0010<\u001a\u00020\u0005H\u0016J\b\u0010=\u001a\u00020\u0005H\u0016J\b\u0010>\u001a\u00020\u0005H\u0016J\b\u0010?\u001a\u00020\u0005H\u0016R\u001b\u0010E\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010B\u001a\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010B\u001a\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010B\u001a\u0004\bR\u0010SR\u001b\u0010Y\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010B\u001a\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010B\u001a\u0004\b\\\u0010]R\u001b\u0010a\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010B\u001a\u0004\b`\u0010]R\u001b\u0010d\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010B\u001a\u0004\bc\u0010]R\u001b\u0010g\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010B\u001a\u0004\bf\u0010]R\u001b\u0010l\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010B\u001a\u0004\bj\u0010kR\u001b\u0010q\u001a\u00020m8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010B\u001a\u0004\bo\u0010pR\u001b\u0010s\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010B\u001a\u0004\br\u0010]R\u001b\u0010v\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010B\u001a\u0004\bu\u0010]R\u001b\u0010y\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010B\u001a\u0004\bx\u0010DR\u001b\u0010|\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010B\u001a\u0004\b{\u0010DR\u001d\u0010\u0081\u0001\u001a\u00020}8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b~\u0010B\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001e\u0010\u0084\u0001\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010B\u001a\u0005\b\u0083\u0001\u0010]R \u0010\u0089\u0001\u001a\u00030\u0085\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0086\u0001\u0010B\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001e\u0010\u008c\u0001\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010B\u001a\u0005\b\u008b\u0001\u0010DR\u001d\u0010\u008e\u0001\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b2\u0010B\u001a\u0005\b\u008d\u0001\u0010]R\u001e\u0010\u0091\u0001\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010B\u001a\u0005\b\u0090\u0001\u0010]R!\u0010\u0097\u0001\u001a\u00030\u0092\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001¨\u0006\u009c\u0001"}, d2 = {"Ln16;", "Lf70;", "Ls16;", "", "messageRes", "", "I2", "", "endDateMillis", "textColorRes", "backgroundTintColorRes", "Zh", "Yh", "newAnswerCount", "ai", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onDestroyView", "rootView", "ih", "hh", "", "imageUrl", "ag", "rewardAmount", "Cg", "titleText", "tg", "conditionsText", "hf", "answerLimit", "pc", "za", "Le", "k7", "moderatorResponse", "r4", "u2", "ze", "be", "currentProgress", "totalProgress", "A1", "r2", "Y6", "k4", "n", "v", "B", "minLimit", "Ic", "F4", "Q7", "ib", "currentUserAnswer", "Hb", "q5", "pe", "ye", "mg", "f1", "Landroid/view/ViewGroup;", com.huawei.hms.opendevice.c.a, "Lk79;", "Nh", "()Landroid/view/ViewGroup;", "root", "Landroidx/core/widget/NestedScrollView;", DateTokenConverter.CONVERTER_KEY, "Oh", "()Landroidx/core/widget/NestedScrollView;", "scroll", "Landroidx/appcompat/widget/Toolbar;", com.huawei.hms.push.e.a, "Sh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/ImageView;", "f", "Gh", "()Landroid/widget/ImageView;", "missionImage", "Lcom/airbnb/lottie/LottieAnimationView;", "g", "Bh", "()Lcom/airbnb/lottie/LottieAnimationView;", "completeAnimationView", "Landroid/widget/TextView;", Image.TYPE_HIGH, "Mh", "()Landroid/widget/TextView;", "rewardTitle", "i", "Fh", "missionExpireTitle", "j", "Ih", "missionTitle", "k", "Eh", "missionConditions", "Lcom/google/android/material/card/MaterialCardView;", "l", "zh", "()Lcom/google/android/material/card/MaterialCardView;", "answerInputContainer", "Landroidx/appcompat/widget/AppCompatEditText;", Image.TYPE_MEDIUM, "yh", "()Landroidx/appcompat/widget/AppCompatEditText;", "answerInput", "xh", "answerCounter", "o", "Dh", "inputErrorText", "p", "Ah", "buttonContainer", "q", "Kh", "progressContainer", "Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "r", "Hh", "()Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "missionStatusProgress", Image.TYPE_SMALL, "Lh", "progressCounter", "Lcom/dodopizza/android/buttons/DodoButton;", "t", "Ph", "()Lcom/dodopizza/android/buttons/DodoButton;", "sendButton", "u", "Rh", "statusDescContainer", "Qh", "statusDesc", "w", "Ch", "doneTitleButton", "Lcom/dodopizza/loyalty/missions/LoyaltyMissionDetailsPresenter;", "x", "Lmoxy/ktx/MoxyKtxDelegate;", "Jh", "()Lcom/dodopizza/loyalty/missions/LoyaltyMissionDetailsPresenter;", "presenter", "<init>", "()V", "y", "a", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: n16  reason: default package */
/* loaded from: classes2.dex */
public final class n16 extends f70 implements s16 {
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
    private final k79 n;
    private final k79 o;
    private final k79 p;
    private final k79 q;
    private final k79 r;
    private final k79 s;
    private final k79 t;
    private final k79 u;
    private final k79 v;
    private final k79 w;
    private final MoxyKtxDelegate x;
    static final /* synthetic */ je5<Object>[] z = {bc9.f(new ar8(n16.class, "root", "getRoot()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(n16.class, "scroll", "getScroll()Landroidx/core/widget/NestedScrollView;", 0)), bc9.f(new ar8(n16.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(n16.class, "missionImage", "getMissionImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(n16.class, "completeAnimationView", "getCompleteAnimationView()Lcom/airbnb/lottie/LottieAnimationView;", 0)), bc9.f(new ar8(n16.class, "rewardTitle", "getRewardTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(n16.class, "missionExpireTitle", "getMissionExpireTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(n16.class, "missionTitle", "getMissionTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(n16.class, "missionConditions", "getMissionConditions()Landroid/widget/TextView;", 0)), bc9.f(new ar8(n16.class, "answerInputContainer", "getAnswerInputContainer()Lcom/google/android/material/card/MaterialCardView;", 0)), bc9.f(new ar8(n16.class, "answerInput", "getAnswerInput()Landroidx/appcompat/widget/AppCompatEditText;", 0)), bc9.f(new ar8(n16.class, "answerCounter", "getAnswerCounter()Landroid/widget/TextView;", 0)), bc9.f(new ar8(n16.class, "inputErrorText", "getInputErrorText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(n16.class, "buttonContainer", "getButtonContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(n16.class, "progressContainer", "getProgressContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(n16.class, "missionStatusProgress", "getMissionStatusProgress()Lcom/google/android/material/progressindicator/LinearProgressIndicator;", 0)), bc9.f(new ar8(n16.class, "progressCounter", "getProgressCounter()Landroid/widget/TextView;", 0)), bc9.f(new ar8(n16.class, "sendButton", "getSendButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(n16.class, "statusDescContainer", "getStatusDescContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(n16.class, "statusDesc", "getStatusDesc()Landroid/widget/TextView;", 0)), bc9.f(new ar8(n16.class, "doneTitleButton", "getDoneTitleButton()Landroid/widget/TextView;", 0)), bc9.f(new ar8(n16.class, "presenter", "getPresenter()Lcom/dodopizza/loyalty/missions/LoyaltyMissionDetailsPresenter;", 0))};
    public static final a y = new a(null);

    /* compiled from: LoyaltyMissionDetailsFragmentV2024.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Ln16$a;", "", "Lb16;", "mission", "Ln16;", "a", "", "EXTRA_KEY_MISSION", "Ljava/lang/String;", "", "SCROLLED_UP_THRESHOLD", "F", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n16$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n16 a(b16 b16Var) {
            z65.h(b16Var, "mission");
            return (n16) y64.d(new n16(), bi0.c(bi0.d("extra_key_mission", b16Var)));
        }
    }

    /* compiled from: LoyaltyMissionDetailsFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: n16$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<String, Unit> {
        public static final b a = new b();

        b() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            z65.h(str, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.a;
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: n16$c */
    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            n16.this.Oh().o(130);
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: n16$d */
    /* loaded from: classes2.dex */
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            n16.this.Oh().o(130);
        }
    }

    /* compiled from: LoyaltyMissionDetailsFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/loyalty/missions/LoyaltyMissionDetailsPresenter;", "a", "()Lcom/dodopizza/loyalty/missions/LoyaltyMissionDetailsPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: n16$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function0<LoyaltyMissionDetailsPresenter> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final LoyaltyMissionDetailsPresenter invoke() {
            a16.b a = a16.a.a();
            LoyaltyMissionDetailsDependencies loyaltyMissionDetailsDependencies = (LoyaltyMissionDetailsDependencies) n16.this.getComponentDependenciesRegistry().a(bc9.b(LoyaltyMissionDetailsDependencies.class));
            Bundle arguments = n16.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("extra_key_mission")) == null) ? null : null;
            if (obj != null && !(obj instanceof b16)) {
                throw new ClassCastException("Property extra_key_mission has different class type");
            } else if (obj != null) {
                return a.a(loyaltyMissionDetailsDependencies, (b16) obj).a();
            } else {
                throw new IllegalArgumentException("Argument with key = extra_key_mission not found in bundle");
            }
        }
    }

    /* compiled from: LoyaltyMissionDetailsFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: n16$f */
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function1<View, Unit> {
        f() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            n16.this.Bh().x();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: LoyaltyMissionDetailsFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: n16$g */
    /* loaded from: classes2.dex */
    static final class g extends ej5 implements Function1<View, Unit> {
        g() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            n16.this.Bh().x();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyMissionDetailsFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luoa;", "", "a", "(Luoa;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: n16$h */
    /* loaded from: classes2.dex */
    public static final class h extends ej5 implements Function1<uoa, Unit> {
        final /* synthetic */ int b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyMissionDetailsFragmentV2024.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: n16$h$a */
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<View> {
            final /* synthetic */ n16 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n16 n16Var) {
                super(0);
                this.a = n16Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final View invoke() {
                return this.a.Nh();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyMissionDetailsFragmentV2024.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: n16$h$b */
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function0<String> {
            final /* synthetic */ n16 a;
            final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(n16 n16Var, int i) {
                super(0);
                this.a = n16Var;
                this.b = i;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                String string = this.a.getString(this.b);
                z65.g(string, "getString(...)");
                return string;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyMissionDetailsFragmentV2024.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: n16$h$c */
        /* loaded from: classes2.dex */
        public static final class c extends ej5 implements Function0<Integer> {
            public static final c a = new c();

            c() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyMissionDetailsFragmentV2024.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: n16$h$d */
        /* loaded from: classes2.dex */
        public static final class d extends ej5 implements Function0<Integer> {
            public static final d a = new d();

            d() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 5;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i) {
            super(1);
            this.b = i;
        }

        public final void a(uoa uoaVar) {
            z65.h(uoaVar, "$this$invoke");
            uoaVar.e(new a(n16.this));
            uoaVar.h(new b(n16.this, this.b));
            uoaVar.f(c.a);
            uoaVar.d(d.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uoa uoaVar) {
            a(uoaVar);
            return Unit.a;
        }
    }

    /* compiled from: LoyaltyMissionDetailsFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: n16$i */
    /* loaded from: classes2.dex */
    static final class i extends ej5 implements Function1<View, Unit> {
        i() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            n16.this.Jh().v();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: LoyaltyMissionDetailsFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: n16$j */
    /* loaded from: classes2.dex */
    static final class j extends ej5 implements Function1<View, Unit> {
        j() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            n16.this.Jh().y(String.valueOf(n16.this.yh().getText()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: LoyaltyMissionDetailsFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: n16$k */
    /* loaded from: classes2.dex */
    static final class k extends ej5 implements Function1<View, Unit> {
        k() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            n16.this.Jh().y(String.valueOf(n16.this.yh().getText()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: LoyaltyMissionDetailsFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newAnswer", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: n16$l */
    /* loaded from: classes2.dex */
    static final class l extends ej5 implements Function1<String, Unit> {
        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            z65.h(str, "newAnswer");
            n16.this.ai(str.length());
            n16.this.Jh().w(str);
        }
    }

    public n16() {
        super(ez8.fragment_loyalty_mission_details_v2024);
        this.c = kb0.e(this, ey8.loyalty_mission_detail_root);
        this.d = kb0.e(this, ey8.loyalty_mission_detail_scroll_view);
        this.e = kb0.e(this, ey8.loyalty_mission_detail_toolbar);
        this.f = kb0.e(this, ey8.loyalty_mission_detail_image);
        this.g = kb0.e(this, ey8.loyalty_mission_complete_animation);
        this.h = kb0.e(this, ey8.loyalty_mission_detail_reward);
        this.i = kb0.e(this, ey8.loyalty_mission_detail_expire_title);
        this.j = kb0.e(this, ey8.loyalty_mission_detail_title);
        this.k = kb0.e(this, ey8.loyalty_mission_detail_conditions);
        this.l = kb0.e(this, ey8.loyalty_mission_detail_input_container);
        this.m = kb0.e(this, ey8.loyalty_mission_detail_input);
        this.n = kb0.e(this, ey8.loyalty_mission_detail_answer_counter);
        this.o = kb0.e(this, ey8.loyalty_mission_detail_input_error);
        this.p = kb0.e(this, ey8.loyalty_mission_detail_button_container);
        this.q = kb0.e(this, ey8.loyalty_mission_detail_progress_container);
        this.r = kb0.e(this, ey8.loyalty_mission_detail_status_progress);
        this.s = kb0.e(this, ey8.loyalty_mission_detail_progress_counter);
        this.t = kb0.e(this, ey8.loyalty_mission_detail_send_button);
        this.u = kb0.e(this, ey8.loyalty_mission_detail_status_description_container);
        this.v = kb0.e(this, ey8.loyalty_mission_detail_status_description);
        this.w = kb0.e(this, ey8.loyalty_mission_detail_done_title_button);
        e eVar = new e();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.x = new MoxyKtxDelegate(mvpDelegate, LoyaltyMissionDetailsPresenter.class.getName() + ".presenter", eVar);
    }

    private final ViewGroup Ah() {
        return (ViewGroup) this.p.a(this, z[13]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LottieAnimationView Bh() {
        return (LottieAnimationView) this.g.a(this, z[4]);
    }

    private final TextView Ch() {
        return (TextView) this.w.a(this, z[20]);
    }

    private final TextView Dh() {
        return (TextView) this.o.a(this, z[12]);
    }

    private final TextView Eh() {
        return (TextView) this.k.a(this, z[8]);
    }

    private final TextView Fh() {
        return (TextView) this.i.a(this, z[6]);
    }

    private final ImageView Gh() {
        return (ImageView) this.f.a(this, z[3]);
    }

    private final LinearProgressIndicator Hh() {
        return (LinearProgressIndicator) this.r.a(this, z[15]);
    }

    private final void I2(int i2) {
        soa.a.a(new h(i2)).U();
    }

    private final TextView Ih() {
        return (TextView) this.j.a(this, z[7]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoyaltyMissionDetailsPresenter Jh() {
        return (LoyaltyMissionDetailsPresenter) this.x.getValue(this, z[21]);
    }

    private final ViewGroup Kh() {
        return (ViewGroup) this.q.a(this, z[14]);
    }

    private final TextView Lh() {
        return (TextView) this.s.a(this, z[16]);
    }

    private final TextView Mh() {
        return (TextView) this.h.a(this, z[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewGroup Nh() {
        return (ViewGroup) this.c.a(this, z[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NestedScrollView Oh() {
        return (NestedScrollView) this.d.a(this, z[1]);
    }

    private final DodoButton Ph() {
        return (DodoButton) this.t.a(this, z[17]);
    }

    private final TextView Qh() {
        return (TextView) this.v.a(this, z[19]);
    }

    private final ViewGroup Rh() {
        return (ViewGroup) this.u.a(this, z[18]);
    }

    private final Toolbar Sh() {
        return (Toolbar) this.e.a(this, z[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5c Th(n16 n16Var, int i2, int i3, View view, c5c c5cVar) {
        z65.h(n16Var, "this$0");
        z65.h(view, "view");
        z65.h(c5cVar, "insets");
        n45 f2 = c5cVar.f(c5c.m.d());
        z65.g(f2, "getInsets(...)");
        n45 f3 = c5cVar.f(c5c.m.a());
        z65.g(f3, "getInsets(...)");
        int max = Math.max(f2.d, f3.d);
        p45.l(n16Var.Sh(), 0, i2 + f2.b, 0, 0, 13, null);
        p45.j(n16Var.Gh(), 0, i2 + f2.b, 0, 0, 13, null);
        p45.l(view, 0, 0, 0, i3 + max, 7, null);
        return c5cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uh(n16 n16Var, View view) {
        z65.h(n16Var, "this$0");
        n16Var.Jh().x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Vh(n16 n16Var, View view, MotionEvent motionEvent) {
        z65.h(n16Var, "this$0");
        n16Var.Oh().requestDisallowInterceptTouchEvent(true);
        n16Var.Oh().postDelayed(new c(), 500L);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Wh(n16 n16Var, View view, boolean z2) {
        z65.h(n16Var, "this$0");
        if (!z2) {
            z65.f(view, "null cannot be cast to non-null type android.widget.EditText");
            gg5.c((EditText) view);
            return;
        }
        n16Var.Oh().postDelayed(new d(), 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Xh(n16 n16Var, NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
        Pair a2;
        z65.h(n16Var, "this$0");
        z65.h(nestedScrollView, "<anonymous parameter 0>");
        if (i3 / n16Var.Gh().getHeight() >= 0.9f) {
            a2 = lnb.a(Integer.valueOf(ow8.a), Integer.valueOf(jx9.a.a(4)));
        } else {
            a2 = lnb.a(Integer.valueOf(ow8.u), Integer.valueOf(jx9.a.a(0)));
        }
        int intValue = ((Number) a2.a()).intValue();
        int intValue2 = ((Number) a2.b()).intValue();
        n16Var.Sh().setBackgroundColor(iu1.c(n16Var.requireContext(), intValue));
        n16Var.Sh().setElevation(intValue2);
    }

    private final void Yh() {
        Fh().setText(getString(p09.loyalty_mission_expire_time_done));
        Fh().setTextColor(iu1.c(requireContext(), ow8.s));
        Fh().setBackgroundTintList(iu1.d(requireContext(), ow8.surfaceSuccessSecondaryColor));
        un3.k(Fh());
    }

    private final void Zh(long j2, int i2, int i3) {
        Fh().setText(getString(p09.loyalty_mission_expire_time, chb.a(j2)));
        Fh().setTextColor(iu1.c(requireContext(), i2));
        Fh().setBackgroundTintList(iu1.d(requireContext(), i3));
        un3.k(Fh());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ai(int i2) {
        Integer num;
        Object tag = xh().getTag(ey8.loyalty_mission_detail_answer_counter);
        if (tag instanceof Integer) {
            num = (Integer) tag;
        } else {
            num = null;
        }
        xh().setText(getString(p09.proportion_with_space, Integer.valueOf(i2), mh5.c(num, 0)));
    }

    private final TextView xh() {
        return (TextView) this.n.a(this, z[11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatEditText yh() {
        return (AppCompatEditText) this.m.a(this, z[10]);
    }

    private final MaterialCardView zh() {
        return (MaterialCardView) this.l.a(this, z[9]);
    }

    @Override // defpackage.s16
    public void A1(int i2, int i3) {
        Hh().setMax(i3);
        Hh().setProgress(i2);
        Lh().setText(getString(p09.proportion, Integer.valueOf(i2), Integer.valueOf(i3)));
        un3.k(Kh());
        un3.e(Ah());
    }

    @Override // defpackage.s16
    public void B() {
        un3.e(Fh());
    }

    @Override // defpackage.s16
    public void Cg(long j2) {
        Mh().setText(getString(p09.x, String.valueOf(j2)));
    }

    @Override // defpackage.s16
    public void F4() {
        zh().setStrokeColor(iu1.c(requireContext(), ow8.strokeTertiaryColor));
        yh().setTextColor(iu1.d(requireContext(), ow8.enabling_text_color_selector));
        xh().setTextColor(iu1.c(requireContext(), ow8.r));
        Dh().setText((CharSequence) null);
        un3.e(Dh());
    }

    @Override // defpackage.s16
    public void Hb(String str) {
        z65.h(str, "currentUserAnswer");
        yh().setText(str);
    }

    @Override // defpackage.s16
    public void Ic(int i2) {
        zh().setStrokeColor(iu1.c(requireContext(), ow8.m));
        yh().setTextColor(iu1.c(requireContext(), ow8.t));
        Dh().setText(getString(p09.loyalty_mission_too_short_answer, String.valueOf(i2)));
        un3.k(Dh());
    }

    @Override // defpackage.s16
    public void Le() {
        Ph().setText(getString(p09.send));
        oma.a(Ph(), new j());
        un3.e(Ch());
        un3.e(Rh());
        un3.k(Ah());
    }

    @Override // defpackage.s16
    public void Q7() {
        zh().setStrokeColor(iu1.c(requireContext(), ow8.m));
        xh().setTextColor(iu1.c(requireContext(), ow8.t));
    }

    @Override // defpackage.s16
    public void Y6() {
        un3.e(Ch());
        un3.e(Rh());
        un3.e(Ah());
        un3.e(Kh());
    }

    @Override // defpackage.s16
    public void ag(String str) {
        z65.h(str, "imageUrl");
        com.bumptech.glide.b.u(Gh()).t(str).a0(zw8.ic_mission_placeholder).G0(Gh());
    }

    @Override // defpackage.s16
    public void be() {
        Ph().setText(getString(p09.loyalty_mission_get_starter));
        oma.a(Ph(), new i());
        Ph().setState(DodoButton.a.a);
        un3.e(Kh());
        un3.k(Ah());
    }

    @Override // defpackage.s16
    public void f1() {
        I2(p09.c);
    }

    @Override // defpackage.s16
    public void hf(String str) {
        z65.h(str, "conditionsText");
        Eh().setText(str);
    }

    @Override // defpackage.f70
    protected int hh() {
        if (Build.VERSION.SDK_INT >= 23) {
            return ow8.u;
        }
        return ow8.b;
    }

    @Override // defpackage.s16
    public void ib() {
        yh().setEnabled(true);
    }

    @Override // defpackage.f70
    protected void ih(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        final int i2;
        z65.h(view, "rootView");
        final int paddingBottom = view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = Sh().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i2 = marginLayoutParams.topMargin;
        } else {
            i2 = 0;
        }
        syb.I0(view, new h77() { // from class: i16
            @Override // defpackage.h77
            public final c5c a(View view2, c5c c5cVar) {
                c5c Th;
                Th = n16.Th(n16.this, i2, paddingBottom, view2, c5cVar);
                return Th;
            }
        });
    }

    @Override // defpackage.s16
    public void k4() {
        yh().setEnabled(false);
    }

    @Override // defpackage.s16
    public void k7() {
        Ph().setText(getString(p09.loyalty_mission_verifying));
        Ph().setIcon(iu1.e(requireContext(), zw8.ic_timer));
        Ph().setState(DodoButton.a.c);
        un3.e(Ch());
        un3.e(Rh());
        un3.k(Ah());
    }

    @Override // defpackage.s16
    public void mg() {
        Ph().setState(DodoButton.a.a);
    }

    @Override // defpackage.s16
    public void n(long j2) {
        Zh(j2, ow8.q, ow8.j);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Oh().setOnScrollChangeListener((NestedScrollView.c) null);
        super.onDestroyView();
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Sh().setNavigationOnClickListener(new View.OnClickListener() { // from class: j16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                n16.Uh(n16.this, view2);
            }
        });
        yh().setOnTouchListener(new View.OnTouchListener() { // from class: k16
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean Vh;
                Vh = n16.Vh(n16.this, view2, motionEvent);
                return Vh;
            }
        });
        yh().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l16
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z2) {
                n16.Wh(n16.this, view2, z2);
            }
        });
        Oh().setOnScrollChangeListener(new NestedScrollView.c() { // from class: m16
            @Override // androidx.core.widget.NestedScrollView.c
            public final void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
                n16.Xh(n16.this, nestedScrollView, i2, i3, i4, i5);
            }
        });
    }

    @Override // defpackage.s16
    public void pc(int i2) {
        xh().setTag(ey8.loyalty_mission_detail_answer_counter, Integer.valueOf(i2));
        ai(yh().length());
        e97.a(yh(), new l());
        un3.k(zh());
    }

    @Override // defpackage.s16
    public void pe() {
        Ph().setState(DodoButton.a.c);
    }

    @Override // defpackage.s16
    public void q5() {
        Ph().setState(DodoButton.a.a);
    }

    @Override // defpackage.s16
    public void r2(int i2) {
        Hh().setMax(i2);
        Hh().setProgress(i2);
        Lh().setText(getString(p09.proportion, Integer.valueOf(i2), Integer.valueOf(i2)));
        Yh();
        un3.k(Bh());
        Bh().x();
        oma.a(Ch(), new g());
        un3.k(Kh());
        un3.k(Ah());
        un3.k(Ch());
        un3.e(Ph());
    }

    @Override // defpackage.s16
    public void r4(String str) {
        z65.h(str, "moderatorResponse");
        k7();
        Qh().setText(str);
        un3.k(Rh());
    }

    @Override // defpackage.s16
    public void tg(String str) {
        z65.h(str, "titleText");
        Ih().setText(str);
    }

    @Override // defpackage.s16
    public void u2(String str) {
        z65.h(str, "moderatorResponse");
        Ph().setText(getString(p09.loyalty_mission_resend));
        oma.a(Ph(), new k());
        un3.k(Ah());
        un3.e(Ch());
        Qh().setText(str);
        un3.k(Rh());
    }

    @Override // defpackage.s16
    public void v(long j2) {
        Zh(j2, ow8.t, ow8.surfaceWarningSecondaryColor);
    }

    @Override // defpackage.s16
    public void ye() {
        Ph().setState(DodoButton.a.b);
    }

    @Override // defpackage.s16
    public void za() {
        e97.a(yh(), b.a);
        un3.e(zh());
    }

    @Override // defpackage.s16
    public void ze() {
        un3.k(Bh());
        Bh().x();
        Yh();
        oma.a(Ch(), new f());
        un3.k(Ch());
        un3.e(Ph());
        un3.k(Ah());
        un3.e(Rh());
    }
}
