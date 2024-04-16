package defpackage;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: StackGameInfoDialogFragment.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 -2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b+\u0010,J7\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010)¨\u0006/"}, d2 = {"Lxsa;", "Lt74;", "Landroid/text/SpannableString;", "", "imageTag", "", "imageResId", "imageSize", "imageTint", "", "hh", "(Landroid/text/SpannableString;Ljava/lang/String;IILjava/lang/Integer;)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Landroid/widget/TextView;", "b", "Lk79;", "jh", "()Landroid/widget/TextView;", "gameInfoDescription", c.a, "lh", "scoreProportion", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "mh", "()Landroid/widget/Button;", "startButton", "Landroid/widget/ImageView;", e.a, "kh", "()Landroid/widget/ImageView;", "infoImage", "<init>", "()V", "f", "a", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xsa  reason: default package */
/* loaded from: classes2.dex */
public final class xsa extends t74 {
    private final k79 b = kb0.e(this, ey8.stack_game_info_description);
    private final k79 c = kb0.e(this, ey8.stack_game_info_score_proportion);
    private final k79 d = kb0.e(this, ey8.stack_game_info_start_button);
    private final k79 e = kb0.e(this, ey8.stack_game_info_image);
    static final /* synthetic */ je5<Object>[] g = {bc9.f(new ar8(xsa.class, "gameInfoDescription", "getGameInfoDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(xsa.class, "scoreProportion", "getScoreProportion()Landroid/widget/TextView;", 0)), bc9.f(new ar8(xsa.class, "startButton", "getStartButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(xsa.class, "infoImage", "getInfoImage()Landroid/widget/ImageView;", 0))};
    public static final a f = new a(null);

    /* compiled from: StackGameInfoDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\u000f"}, d2 = {"Lxsa$a;", "", "", "pointsRatio", "coinsRatio", "Lxsa;", "a", "", "ARG_COINS_RATIO", "Ljava/lang/String;", "ARG_POINTS_RATIO", "COINS_IMAGE_TAG", "POINTS_IMAGE_TAG", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xsa$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final xsa a(int i, int i2) {
            return (xsa) y64.d(new xsa(), bi0.c(bi0.d("arg_points_ratio", Integer.valueOf(i)), bi0.d("arg_coins_ratio", Integer.valueOf(i2))));
        }
    }

    /* compiled from: StackGameInfoDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xsa$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            xsa.this.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    private final void hh(SpannableString spannableString, String str, int i, int i2, Integer num) {
        int Z;
        Object b2 = mh5.b(iu1.e(requireContext(), i), "Can`t be null");
        z65.g(b2, "notNullOrError(...)");
        Drawable drawable = (Drawable) b2;
        drawable.setBounds(0, 0, i2, i2);
        if (num != null) {
            drawable.setTint(iu1.c(requireContext(), num.intValue()));
        }
        sv4 sv4Var = new sv4(drawable, 2, null, 4, null);
        Z = m0b.Z(spannableString, str, 0, false, 6, null);
        spannableString.setSpan(sv4Var, Z, str.length() + Z, 17);
    }

    static /* synthetic */ void ih(xsa xsaVar, SpannableString spannableString, String str, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            num = null;
        }
        xsaVar.hh(spannableString, str, i, i2, num);
    }

    private final TextView jh() {
        return (TextView) this.b.a(this, g[0]);
    }

    private final ImageView kh() {
        return (ImageView) this.e.a(this, g[3]);
    }

    private final TextView lh() {
        return (TextView) this.c.a(this, g[1]);
    }

    private final Button mh() {
        return (Button) this.d.a(this, g[2]);
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
        onCreateDialog.setCancelable(false);
        onCreateDialog.setCanceledOnTouchOutside(false);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(ez8.dialog_stack_game_info, viewGroup, false);
        jb0.a.a(this);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object obj;
        Object obj2;
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Integer num = 0;
        Bundle arguments = getArguments();
        if (arguments == null || (obj = arguments.get("arg_points_ratio")) == null) {
            obj = num;
        }
        if (obj != null && !(obj instanceof Integer)) {
            throw new ClassCastException("Property arg_points_ratio has different class type");
        } else if (obj != null) {
            int intValue = ((Integer) obj).intValue();
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (obj2 = arguments2.get("arg_coins_ratio")) != null) {
                num = obj2;
            }
            if (num != null && !(num instanceof Integer)) {
                throw new ClassCastException("Property arg_coins_ratio has different class type");
            } else if (num != null) {
                int intValue2 = num.intValue();
                int textSize = (int) lh().getTextSize();
                SpannableString spannableString = new SpannableString(intValue + "@points_image_tag = " + intValue2 + "@coins_image_tag");
                ih(this, spannableString, "@points_image_tag", zw8.ic_pizzabox, mpb.e(20.0f, requireContext()), null, 8, null);
                hh(spannableString, "@coins_image_tag", zw8.ic_coin_24, textSize, Integer.valueOf(ow8.r));
                lh().setText(spannableString);
                jh().setText(getString(p09.stack_game_info_description));
                oma.a(mh(), new b());
                com.bumptech.glide.b.u(kh()).s(Integer.valueOf(j09.onboarding)).G0(kh());
            } else {
                throw new IllegalArgumentException("Argument with key = arg_coins_ratio not found in bundle");
            }
        } else {
            throw new IllegalArgumentException("Argument with key = arg_points_ratio not found in bundle");
        }
    }
}
