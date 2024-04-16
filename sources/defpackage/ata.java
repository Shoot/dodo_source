package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.airbnb.lottie.LottieAnimationView;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: StackGameRewardDialogFragment.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b#\u0010$J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\"\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010!¨\u0006'"}, d2 = {"Lata;", "Lt74;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Lcom/airbnb/lottie/LottieAnimationView;", "b", "Lk79;", "hh", "()Lcom/airbnb/lottie/LottieAnimationView;", "animationView", "Landroid/widget/TextView;", c.a, "jh", "()Landroid/widget/TextView;", "rewardAmountView", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "ih", "()Landroid/widget/Button;", "playMoreButton", e.a, "getRewardContainer", "()Landroid/view/ViewGroup;", "rewardContainer", "<init>", "()V", "f", "a", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ata  reason: default package */
/* loaded from: classes2.dex */
public final class ata extends t74 {
    private final k79 b = kb0.e(this, ey8.stack_game_reward_animation_view);
    private final k79 c = kb0.e(this, ey8.stack_game_reward_amount_title);
    private final k79 d = kb0.e(this, ey8.stack_game_reward_play_more_button);
    private final k79 e = kb0.e(this, ey8.stack_game_reward_badge);
    static final /* synthetic */ je5<Object>[] g = {bc9.f(new ar8(ata.class, "animationView", "getAnimationView()Lcom/airbnb/lottie/LottieAnimationView;", 0)), bc9.f(new ar8(ata.class, "rewardAmountView", "getRewardAmountView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ata.class, "playMoreButton", "getPlayMoreButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(ata.class, "rewardContainer", "getRewardContainer()Landroid/view/ViewGroup;", 0))};
    public static final a f = new a(null);

    /* compiled from: StackGameRewardDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lata$a;", "", "", "rewardAmount", "", "animationUrl", "Lata;", "a", "ARG_ANIMATION_URL", "Ljava/lang/String;", "ARG_REWARD_AMOUNT", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ata$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ata a(double d, String str) {
            z65.h(str, "animationUrl");
            return (ata) y64.d(new ata(), bi0.c(bi0.d("arg_reward_amount", Double.valueOf(d)), bi0.d("arg_animation_url", str)));
        }
    }

    /* compiled from: StackGameRewardDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ata$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ata.this.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    private final LottieAnimationView hh() {
        return (LottieAnimationView) this.b.a(this, g[0]);
    }

    private final Button ih() {
        return (Button) this.d.a(this, g[2]);
    }

    private final TextView jh() {
        return (TextView) this.c.a(this, g[1]);
    }

    @Override // defpackage.t74, defpackage.kn, androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        WindowManager.LayoutParams layoutParams;
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.windowAnimations = r19.a;
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(ez8.dialog_stack_game_reward, viewGroup, false);
        jb0.a.a(this);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object obj;
        boolean y;
        Object obj2;
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Object obj3 = null;
        if (arguments == null || (obj = arguments.get("arg_reward_amount")) == null) {
            obj = null;
        }
        if (obj != null && !(obj instanceof Double)) {
            throw new ClassCastException("Property arg_reward_amount has different class type");
        } else if (obj != null) {
            double doubleValue = ((Double) obj).doubleValue();
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (obj2 = arguments2.get("arg_animation_url")) != null) {
                obj3 = obj2;
            }
            if (obj3 != null && !(obj3 instanceof String)) {
                throw new ClassCastException("Property arg_animation_url has different class type");
            } else if (obj3 != null) {
                String str = (String) obj3;
                y = l0b.y(str);
                if (!y) {
                    hh().setAnimationFromUrl(str);
                    hh().x();
                }
                jh().setText(getString(p09.x, String.valueOf((int) doubleValue)));
                oma.a(ih(), new b());
            } else {
                throw new IllegalArgumentException("Argument with key = arg_animation_url not found in bundle");
            }
        } else {
            throw new IllegalArgumentException("Argument with key = arg_reward_amount not found in bundle");
        }
    }
}
