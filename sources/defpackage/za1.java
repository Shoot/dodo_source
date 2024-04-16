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
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CoinsExpirationsFAQDialogFragment.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lza1;", "Lt74;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Landroid/widget/TextView;", "b", "Lk79;", "hh", "()Landroid/widget/TextView;", "dodocoinsSubtitle", c.a, "ih", "flashDodocoinsDescription", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "jh", "()Landroid/widget/Button;", "okButton", "<init>", "()V", e.a, "a", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: za1  reason: default package */
/* loaded from: classes2.dex */
public final class za1 extends t74 {
    private final k79 b = kb0.e(this, ey8.coins_expirations_faq_dodocoins_subtitle);
    private final k79 c = kb0.e(this, ey8.coins_expirations_faq_flashdodocoins_description);
    private final k79 d = kb0.e(this, ey8.coins_expirations_faq_button);
    static final /* synthetic */ je5<Object>[] f = {bc9.f(new ar8(za1.class, "dodocoinsSubtitle", "getDodocoinsSubtitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(za1.class, "flashDodocoinsDescription", "getFlashDodocoinsDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(za1.class, "okButton", "getOkButton()Landroid/widget/Button;", 0))};
    public static final a e = new a(null);

    /* compiled from: CoinsExpirationsFAQDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lza1$a;", "", "Lya1;", "data", "Lza1;", "a", "", "EXPIRATIONS_TIME_IN_DAY", "Ljava/lang/String;", "EXTRA_EXPIRATIONS_TIME_IN_DAY", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: za1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final za1 a(ya1 ya1Var) {
            z65.h(ya1Var, "data");
            return (za1) y64.d(new za1(), bi0.c(bi0.d("expirations_time_in_day", Integer.valueOf(ya1Var.a())), bi0.d("extra_expirations_time_in_day", Integer.valueOf(ya1Var.b()))));
        }
    }

    /* compiled from: CoinsExpirationsFAQDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: za1$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            za1.this.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    private final TextView hh() {
        return (TextView) this.b.a(this, f[0]);
    }

    private final TextView ih() {
        return (TextView) this.c.a(this, f[1]);
    }

    private final Button jh() {
        return (Button) this.d.a(this, f[2]);
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
        View inflate = layoutInflater.inflate(ez8.dialog_coins_expirations, viewGroup, false);
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
        if (arguments == null || (obj = arguments.get("expirations_time_in_day")) == null) {
            obj = num;
        }
        if (obj != null && !(obj instanceof Integer)) {
            throw new ClassCastException("Property expirations_time_in_day has different class type");
        } else if (obj != null) {
            int intValue = ((Integer) obj).intValue();
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (obj2 = arguments2.get("extra_expirations_time_in_day")) != null) {
                num = obj2;
            }
            if (num != null && !(num instanceof Integer)) {
                throw new ClassCastException("Property extra_expirations_time_in_day has different class type");
            } else if (num != null) {
                int intValue2 = num.intValue();
                hh().setText(getResources().getQuantityString(d09.coins_expiration_faq_dodocoins_subtitle, intValue, Integer.valueOf(intValue)));
                ih().setText(getResources().getQuantityString(d09.coins_expiration_faq_flash_dodocoins_description_v3, intValue2, Integer.valueOf(intValue2)));
                oma.a(jh(), new b());
            } else {
                throw new IllegalArgumentException("Argument with key = extra_expirations_time_in_day not found in bundle");
            }
        } else {
            throw new IllegalArgumentException("Argument with key = expirations_time_in_day not found in bundle");
        }
    }
}
