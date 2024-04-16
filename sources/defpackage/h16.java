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
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: LoyaltyMissionDetailsFragment.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u0095\u00012\u00020\u00012\u00020\u0002:\u0002\u0096\u0001B\t¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0012\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u001a\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0017J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\rH\u0014J\b\u0010\u0015\u001a\u00020\u0003H\u0014J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0003H\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0016H\u0016J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0016H\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J\u0018\u0010+\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0003H\u0016J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0003H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\u0010\u0010/\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u00101\u001a\u00020\u0005H\u0016J\u0010\u00103\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0003H\u0016J\b\u00104\u001a\u00020\u0005H\u0016J\b\u00105\u001a\u00020\u0005H\u0016J\b\u00106\u001a\u00020\u0005H\u0016J\u0010\u00108\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0016H\u0016J\b\u00109\u001a\u00020\u0005H\u0016J\b\u0010:\u001a\u00020\u0005H\u0016J\b\u0010;\u001a\u00020\u0005H\u0016J\b\u0010<\u001a\u00020\u0005H\u0016J\b\u0010=\u001a\u00020\u0005H\u0016R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010@\u001a\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010@\u001a\u0004\bP\u0010QR\u001b\u0010W\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010@\u001a\u0004\bU\u0010VR\u001b\u0010Z\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010@\u001a\u0004\bY\u0010BR\u001b\u0010_\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010@\u001a\u0004\b]\u0010^R\u001b\u0010b\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010@\u001a\u0004\ba\u0010^R\u001b\u0010e\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010@\u001a\u0004\bd\u0010^R\u001b\u0010h\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010@\u001a\u0004\bg\u0010^R\u001b\u0010m\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010@\u001a\u0004\bk\u0010lR\u001b\u0010q\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010@\u001a\u0004\bo\u0010pR\u001b\u0010t\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010@\u001a\u0004\bs\u0010^R\u001b\u0010w\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010@\u001a\u0004\bv\u0010^R\u001b\u0010z\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010@\u001a\u0004\by\u0010BR\u001b\u0010\u007f\u001a\u00020{8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010@\u001a\u0004\b}\u0010~R \u0010\u0084\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0081\u0001\u0010@\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001e\u0010\u0087\u0001\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010@\u001a\u0005\b\u0086\u0001\u0010BR\u001e\u0010\u008a\u0001\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010@\u001a\u0005\b\u0089\u0001\u0010QR\u001d\u0010\u008c\u0001\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b0\u0010@\u001a\u0005\b\u008b\u0001\u0010^R!\u0010\u0092\u0001\u001a\u00030\u008d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0097\u0001"}, d2 = {"Lh16;", "Lf70;", "Ls16;", "", "messageRes", "", "I2", "", "endDateMillis", "colorRes", "Xh", "newAnswerCount", "Yh", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onDestroyView", "rootView", "ih", "hh", "", "imageUrl", "ag", "rewardAmount", "Cg", "titleText", "tg", "conditionsText", "hf", "answerLimit", "pc", "za", "Le", "k7", "moderatorResponse", "r4", "u2", "ze", "be", "currentProgress", "totalProgress", "A1", "r2", "Y6", "k4", "n", "v", "B", "minLimit", "Ic", "F4", "Q7", "ib", "currentUserAnswer", "Hb", "q5", "pe", "ye", "mg", "f1", "Landroid/view/ViewGroup;", com.huawei.hms.opendevice.c.a, "Lk79;", "Lh", "()Landroid/view/ViewGroup;", "root", "Landroidx/core/widget/NestedScrollView;", DateTokenConverter.CONVERTER_KEY, "Mh", "()Landroidx/core/widget/NestedScrollView;", "scroll", "Landroidx/appcompat/widget/Toolbar;", com.huawei.hms.push.e.a, "Rh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/ImageView;", "f", "Gh", "()Landroid/widget/ImageView;", "missionImage", "Lcom/airbnb/lottie/LottieAnimationView;", "g", "Bh", "()Lcom/airbnb/lottie/LottieAnimationView;", "completeAnimationView", Image.TYPE_HIGH, "Dh", "missionBack", "Landroid/widget/TextView;", "i", "Kh", "()Landroid/widget/TextView;", "rewardTitle", "j", "Fh", "missionExpireTitle", "k", "Ih", "missionTitle", "l", "Eh", "missionConditions", "Lcom/google/android/material/card/MaterialCardView;", Image.TYPE_MEDIUM, "zh", "()Lcom/google/android/material/card/MaterialCardView;", "answerInputContainer", "Landroidx/appcompat/widget/AppCompatEditText;", "yh", "()Landroidx/appcompat/widget/AppCompatEditText;", "answerInput", "o", "xh", "answerCounter", "p", "Ch", "inputErrorText", "q", "Ah", "buttonContainer", "Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "r", "Hh", "()Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "missionStatusProgress", "Lcom/dodopizza/android/buttons/DodoButton;", Image.TYPE_SMALL, "Nh", "()Lcom/dodopizza/android/buttons/DodoButton;", "sendButton", "t", "Oh", "statusContainer", "u", "Qh", "statusIcon", "Ph", "statusDesc", "Lcom/dodopizza/loyalty/missions/LoyaltyMissionDetailsPresenter;", "w", "Lmoxy/ktx/MoxyKtxDelegate;", "Jh", "()Lcom/dodopizza/loyalty/missions/LoyaltyMissionDetailsPresenter;", "presenter", "<init>", "()V", "x", "a", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: h16  reason: default package */
/* loaded from: classes2.dex */
public final class h16 extends f70 implements s16 {
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
    private final MoxyKtxDelegate w;
    static final /* synthetic */ je5<Object>[] y = {bc9.f(new ar8(h16.class, "root", "getRoot()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(h16.class, "scroll", "getScroll()Landroidx/core/widget/NestedScrollView;", 0)), bc9.f(new ar8(h16.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(h16.class, "missionImage", "getMissionImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(h16.class, "completeAnimationView", "getCompleteAnimationView()Lcom/airbnb/lottie/LottieAnimationView;", 0)), bc9.f(new ar8(h16.class, "missionBack", "getMissionBack()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(h16.class, "rewardTitle", "getRewardTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(h16.class, "missionExpireTitle", "getMissionExpireTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(h16.class, "missionTitle", "getMissionTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(h16.class, "missionConditions", "getMissionConditions()Landroid/widget/TextView;", 0)), bc9.f(new ar8(h16.class, "answerInputContainer", "getAnswerInputContainer()Lcom/google/android/material/card/MaterialCardView;", 0)), bc9.f(new ar8(h16.class, "answerInput", "getAnswerInput()Landroidx/appcompat/widget/AppCompatEditText;", 0)), bc9.f(new ar8(h16.class, "answerCounter", "getAnswerCounter()Landroid/widget/TextView;", 0)), bc9.f(new ar8(h16.class, "inputErrorText", "getInputErrorText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(h16.class, "buttonContainer", "getButtonContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(h16.class, "missionStatusProgress", "getMissionStatusProgress()Lcom/google/android/material/progressindicator/LinearProgressIndicator;", 0)), bc9.f(new ar8(h16.class, "sendButton", "getSendButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(h16.class, "statusContainer", "getStatusContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(h16.class, "statusIcon", "getStatusIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(h16.class, "statusDesc", "getStatusDesc()Landroid/widget/TextView;", 0)), bc9.f(new ar8(h16.class, "presenter", "getPresenter()Lcom/dodopizza/loyalty/missions/LoyaltyMissionDetailsPresenter;", 0))};
    public static final a x = new a(null);

    /* compiled from: LoyaltyMissionDetailsFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lh16$a;", "", "Lb16;", "mission", "Lh16;", "a", "", "EXTRA_KEY_MISSION", "Ljava/lang/String;", "", "SCROLLED_UP_THRESHOLD", "F", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h16$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h16 a(b16 b16Var) {
            z65.h(b16Var, "mission");
            return (h16) y64.d(new h16(), bi0.c(bi0.d("extra_key_mission", b16Var)));
        }
    }

    /* compiled from: LoyaltyMissionDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h16$b */
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
    /* renamed from: h16$c */
    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            h16.this.Mh().o(130);
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: h16$d */
    /* loaded from: classes2.dex */
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            h16.this.Mh().o(130);
        }
    }

    /* compiled from: LoyaltyMissionDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/loyalty/missions/LoyaltyMissionDetailsPresenter;", "a", "()Lcom/dodopizza/loyalty/missions/LoyaltyMissionDetailsPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: h16$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function0<LoyaltyMissionDetailsPresenter> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final LoyaltyMissionDetailsPresenter invoke() {
            a16.b a = a16.a.a();
            LoyaltyMissionDetailsDependencies loyaltyMissionDetailsDependencies = (LoyaltyMissionDetailsDependencies) h16.this.getComponentDependenciesRegistry().a(bc9.b(LoyaltyMissionDetailsDependencies.class));
            Bundle arguments = h16.this.getArguments();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyMissionDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: h16$f */
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function1<View, Unit> {
        f() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            h16.this.Bh().x();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyMissionDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luoa;", "", "a", "(Luoa;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: h16$g */
    /* loaded from: classes2.dex */
    public static final class g extends ej5 implements Function1<uoa, Unit> {
        final /* synthetic */ int b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyMissionDetailsFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: h16$g$a */
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<View> {
            final /* synthetic */ h16 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h16 h16Var) {
                super(0);
                this.a = h16Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final View invoke() {
                return this.a.Lh();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyMissionDetailsFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: h16$g$b */
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function0<String> {
            final /* synthetic */ h16 a;
            final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h16 h16Var, int i) {
                super(0);
                this.a = h16Var;
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
        /* compiled from: LoyaltyMissionDetailsFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: h16$g$c */
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
        /* compiled from: LoyaltyMissionDetailsFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: h16$g$d */
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
        g(int i) {
            super(1);
            this.b = i;
        }

        public final void a(uoa uoaVar) {
            z65.h(uoaVar, "$this$invoke");
            uoaVar.e(new a(h16.this));
            uoaVar.h(new b(h16.this, this.b));
            uoaVar.f(c.a);
            uoaVar.d(d.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uoa uoaVar) {
            a(uoaVar);
            return Unit.a;
        }
    }

    /* compiled from: LoyaltyMissionDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: h16$h */
    /* loaded from: classes2.dex */
    static final class h extends ej5 implements Function1<View, Unit> {
        h() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            h16.this.Jh().v();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyMissionDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: h16$i */
    /* loaded from: classes2.dex */
    public static final class i extends ej5 implements Function1<View, Unit> {
        i() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            h16.this.Jh().y(String.valueOf(h16.this.yh().getText()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: LoyaltyMissionDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newAnswer", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h16$j */
    /* loaded from: classes2.dex */
    static final class j extends ej5 implements Function1<String, Unit> {
        j() {
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
            h16.this.Yh(str.length());
            h16.this.Jh().w(str);
        }
    }

    public h16() {
        super(ez8.fragment_loyalty_mission_details);
        this.c = kb0.e(this, ey8.loyalty_mission_detail_root);
        this.d = kb0.e(this, ey8.loyalty_mission_detail_scroll_view);
        this.e = kb0.e(this, ey8.loyalty_mission_detail_toolbar);
        this.f = kb0.e(this, ey8.loyalty_mission_detail_image);
        this.g = kb0.e(this, ey8.loyalty_mission_complete_animation);
        this.h = kb0.e(this, ey8.loyalty_mission_detail_collapsing_container);
        this.i = kb0.e(this, ey8.loyalty_mission_detail_reward);
        this.j = kb0.e(this, ey8.loyalty_mission_detail_expire_title);
        this.k = kb0.e(this, ey8.loyalty_mission_detail_title);
        this.l = kb0.e(this, ey8.loyalty_mission_detail_conditions);
        this.m = kb0.e(this, ey8.loyalty_mission_detail_input_container);
        this.n = kb0.e(this, ey8.loyalty_mission_detail_input);
        this.o = kb0.e(this, ey8.loyalty_mission_detail_answer_counter);
        this.p = kb0.e(this, ey8.loyalty_mission_detail_input_error);
        this.q = kb0.e(this, ey8.loyalty_mission_detail_button_container);
        this.r = kb0.e(this, ey8.loyalty_mission_detail_status_progress);
        this.s = kb0.e(this, ey8.loyalty_mission_detail_send_button);
        this.t = kb0.e(this, ey8.loyalty_mission_detail_status_container);
        this.u = kb0.e(this, ey8.loyalty_mission_detail_status_icon);
        this.v = kb0.e(this, ey8.loyalty_mission_detail_status_description);
        e eVar = new e();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.w = new MoxyKtxDelegate(mvpDelegate, LoyaltyMissionDetailsPresenter.class.getName() + ".presenter", eVar);
    }

    private final ViewGroup Ah() {
        return (ViewGroup) this.q.a(this, y[14]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LottieAnimationView Bh() {
        return (LottieAnimationView) this.g.a(this, y[4]);
    }

    private final TextView Ch() {
        return (TextView) this.p.a(this, y[13]);
    }

    private final ViewGroup Dh() {
        return (ViewGroup) this.h.a(this, y[5]);
    }

    private final TextView Eh() {
        return (TextView) this.l.a(this, y[9]);
    }

    private final TextView Fh() {
        return (TextView) this.j.a(this, y[7]);
    }

    private final ImageView Gh() {
        return (ImageView) this.f.a(this, y[3]);
    }

    private final LinearProgressIndicator Hh() {
        return (LinearProgressIndicator) this.r.a(this, y[15]);
    }

    private final void I2(int i2) {
        soa.a.a(new g(i2)).U();
    }

    private final TextView Ih() {
        return (TextView) this.k.a(this, y[8]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoyaltyMissionDetailsPresenter Jh() {
        return (LoyaltyMissionDetailsPresenter) this.w.getValue(this, y[20]);
    }

    private final TextView Kh() {
        return (TextView) this.i.a(this, y[6]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewGroup Lh() {
        return (ViewGroup) this.c.a(this, y[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NestedScrollView Mh() {
        return (NestedScrollView) this.d.a(this, y[1]);
    }

    private final DodoButton Nh() {
        return (DodoButton) this.s.a(this, y[16]);
    }

    private final ViewGroup Oh() {
        return (ViewGroup) this.t.a(this, y[17]);
    }

    private final TextView Ph() {
        return (TextView) this.v.a(this, y[19]);
    }

    private final ImageView Qh() {
        return (ImageView) this.u.a(this, y[18]);
    }

    private final Toolbar Rh() {
        return (Toolbar) this.e.a(this, y[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5c Sh(h16 h16Var, int i2, int i3, View view, c5c c5cVar) {
        z65.h(h16Var, "this$0");
        z65.h(view, "view");
        z65.h(c5cVar, "insets");
        p45.l(h16Var.Rh(), 0, i2 + c5cVar.l(), 0, 0, 13, null);
        p45.j(h16Var.Gh(), 0, i2 + c5cVar.l(), 0, 0, 13, null);
        p45.l(view, 0, 0, 0, i3 + c5cVar.i(), 7, null);
        return c5cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Th(h16 h16Var, View view) {
        z65.h(h16Var, "this$0");
        h16Var.Jh().x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Uh(h16 h16Var, View view, MotionEvent motionEvent) {
        z65.h(h16Var, "this$0");
        h16Var.Mh().requestDisallowInterceptTouchEvent(true);
        h16Var.Mh().postDelayed(new c(), 500L);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Vh(h16 h16Var, View view, boolean z) {
        z65.h(h16Var, "this$0");
        if (!z) {
            z65.f(view, "null cannot be cast to non-null type android.widget.EditText");
            gg5.c((EditText) view);
            return;
        }
        h16Var.Mh().postDelayed(new d(), 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Wh(h16 h16Var, NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
        Pair a2;
        z65.h(h16Var, "this$0");
        z65.h(nestedScrollView, "<anonymous parameter 0>");
        float height = i3 / h16Var.Gh().getHeight();
        if (height >= 0.9f) {
            a2 = lnb.a(Integer.valueOf(ow8.a), Integer.valueOf(jx9.a.a(4)));
        } else {
            a2 = lnb.a(Integer.valueOf(ow8.u), Integer.valueOf(jx9.a.a(0)));
        }
        int intValue = ((Number) a2.a()).intValue();
        int intValue2 = ((Number) a2.b()).intValue();
        h16Var.Dh().setAlpha(1.0f - Math.abs(height));
        h16Var.Rh().setBackgroundColor(iu1.c(h16Var.requireContext(), intValue));
        h16Var.Rh().setElevation(intValue2);
    }

    private final void Xh(long j2, int i2) {
        Fh().setText(getString(p09.loyalty_mission_expire_time, chb.a(j2)));
        Fh().setTextColor(iu1.c(requireContext(), i2));
        un3.k(Fh());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Yh(int i2) {
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
        return (TextView) this.o.a(this, y[12]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatEditText yh() {
        return (AppCompatEditText) this.n.a(this, y[11]);
    }

    private final MaterialCardView zh() {
        return (MaterialCardView) this.m.a(this, y[10]);
    }

    @Override // defpackage.s16
    public void A1(int i2, int i3) {
        Nh().setText(getString(p09.proportion_with_space, Integer.valueOf(i2), Integer.valueOf(i3)));
        Nh().setTextColor(iu1.c(requireContext(), ow8.q));
        Nh().setBackgroundTintList(iu1.d(requireContext(), ow8.u));
        Nh().setClickable(false);
        Hh().setMax(i3);
        Hh().setProgress(i2);
        un3.k(Ah());
    }

    @Override // defpackage.s16
    public void B() {
        un3.e(Fh());
    }

    @Override // defpackage.s16
    public void Cg(long j2) {
        Kh().setText(getString(p09.plus_label_with_space, String.valueOf(j2)));
    }

    @Override // defpackage.s16
    public void F4() {
        zh().setStrokeColor(iu1.c(requireContext(), ow8.strokeTertiaryColor));
        yh().setTextColor(iu1.d(requireContext(), ow8.enabling_text_color_selector));
        xh().setTextColor(iu1.c(requireContext(), ow8.r));
        Ch().setText((CharSequence) null);
        un3.e(Ch());
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
        Ch().setText(getString(p09.loyalty_mission_too_short_answer, String.valueOf(i2)));
        un3.k(Ch());
    }

    @Override // defpackage.s16
    public void Le() {
        Nh().setText(getString(p09.send));
        Nh().setTextColor(iu1.c(requireContext(), ow8.p));
        Nh().setBackgroundTintList(iu1.d(requireContext(), ow8.loyalty_mission_send_button_color));
        oma.a(Nh(), new i());
        un3.k(Ah());
    }

    @Override // defpackage.s16
    public void Q7() {
        zh().setStrokeColor(iu1.c(requireContext(), ow8.m));
        xh().setTextColor(iu1.c(requireContext(), ow8.t));
    }

    @Override // defpackage.s16
    public void Y6() {
        un3.e(Ah());
    }

    @Override // defpackage.s16
    public void ag(String str) {
        z65.h(str, "imageUrl");
        com.bumptech.glide.b.u(Gh()).t(str).a0(zw8.ic_mission_placeholder).G0(Gh());
    }

    @Override // defpackage.s16
    public void be() {
        Nh().setText(getString(p09.loyalty_mission_get_starter));
        Nh().setTextColor(iu1.c(requireContext(), ow8.p));
        Nh().setBackgroundTintList(iu1.d(requireContext(), ow8.loyalty_mission_send_button_color));
        oma.a(Nh(), new h());
        Nh().setState(DodoButton.a.a);
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
        ViewGroup.LayoutParams layoutParams = Rh().getLayoutParams();
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
        syb.I0(view, new h77() { // from class: g16
            @Override // defpackage.h77
            public final c5c a(View view2, c5c c5cVar) {
                c5c Sh;
                Sh = h16.Sh(h16.this, i2, paddingBottom, view2, c5cVar);
                return Sh;
            }
        });
    }

    @Override // defpackage.s16
    public void k4() {
        yh().setEnabled(false);
    }

    @Override // defpackage.s16
    public void k7() {
        Nh().setText(getString(p09.loyalty_mission_verifying));
        Nh().setTextColor(iu1.c(requireContext(), ow8.q));
        Nh().setBackgroundTintList(iu1.d(requireContext(), ow8.h));
        Nh().setClickable(false);
        un3.k(Ah());
        Qh().setImageResource(zw8.ic_time);
        Ph().setText(getString(p09.loyalty_mission_default_on_verify_moderator_answer));
        un3.k(Oh());
    }

    @Override // defpackage.s16
    public void mg() {
        Nh().setState(DodoButton.a.a);
    }

    @Override // defpackage.s16
    public void n(long j2) {
        Xh(j2, ow8.r);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Mh().setOnScrollChangeListener((NestedScrollView.c) null);
        super.onDestroyView();
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Rh().setNavigationOnClickListener(new View.OnClickListener() { // from class: c16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h16.Th(h16.this, view2);
            }
        });
        yh().setOnTouchListener(new View.OnTouchListener() { // from class: d16
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean Uh;
                Uh = h16.Uh(h16.this, view2, motionEvent);
                return Uh;
            }
        });
        yh().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: e16
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                h16.Vh(h16.this, view2, z);
            }
        });
        Mh().setOnScrollChangeListener(new NestedScrollView.c() { // from class: f16
            @Override // androidx.core.widget.NestedScrollView.c
            public final void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
                h16.Wh(h16.this, nestedScrollView, i2, i3, i4, i5);
            }
        });
    }

    @Override // defpackage.s16
    public void pc(int i2) {
        xh().setTag(ey8.loyalty_mission_detail_answer_counter, Integer.valueOf(i2));
        Yh(yh().length());
        e97.a(yh(), new j());
        un3.k(zh());
    }

    @Override // defpackage.s16
    public void pe() {
        Nh().setState(DodoButton.a.c);
    }

    @Override // defpackage.s16
    public void q5() {
        Nh().setState(DodoButton.a.a);
    }

    @Override // defpackage.s16
    public void r2(int i2) {
        ze();
    }

    @Override // defpackage.s16
    public void r4(String str) {
        z65.h(str, "moderatorResponse");
        k7();
        Ph().setText(str);
    }

    @Override // defpackage.s16
    public void tg(String str) {
        z65.h(str, "titleText");
        Ih().setText(str);
    }

    @Override // defpackage.s16
    public void u2(String str) {
        z65.h(str, "moderatorResponse");
        Le();
        Qh().setImageResource(zw8.ic_alert);
        Ph().setText(str);
        un3.k(Oh());
    }

    @Override // defpackage.s16
    public void v(long j2) {
        Xh(j2, ow8.t);
    }

    @Override // defpackage.s16
    public void ye() {
        Nh().setState(DodoButton.a.b);
    }

    @Override // defpackage.s16
    public void za() {
        e97.a(yh(), b.a);
        un3.e(zh());
    }

    @Override // defpackage.s16
    public void ze() {
        Bh().x();
        Nh().setText(getString(p09.loyalty_mission_mission_completed));
        Nh().setTextColor(iu1.c(requireContext(), ow8.p));
        Nh().setBackgroundTintList(iu1.d(requireContext(), ow8.k));
        Nh().setState(DodoButton.a.a);
        oma.a(Nh(), new f());
        un3.k(Ah());
    }
}
