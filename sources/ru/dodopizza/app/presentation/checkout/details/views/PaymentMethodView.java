package ru.dodopizza.app.presentation.checkout.details.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.cu7;
import defpackage.mw7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.presentation.checkout.details.views.PaymentMethodView;
/* compiled from: PaymentMethodView.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u001d\b\u0016\u0012\b\u0010=\u001a\u0004\u0018\u00010<\u0012\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010AJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\"\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J$\u0010\u000f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\u001a\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0012J\u0016\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u001b\u0010%\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010!R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010)R\u001b\u0010,\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b+\u0010)R\u001b\u0010/\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010)R\u001b\u00103\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b1\u00102R\u001b\u00105\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b4\u0010)R\u001b\u00107\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b6\u0010)R\u001b\u0010;\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b9\u0010:¨\u0006B"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/views/PaymentMethodView;", "Lbm7;", "Ljw7;", "paymentWay", "Lwk7;", "orderTypeState", "", "j", "Lru/dodopizza/app/presentation/checkout/details/views/PaymentMethodView$a;", "error", "payment", "g", Image.TYPE_HIGH, "", "isError", e.a, "", "getLayoutId", "Lkotlin/Function1;", "checkedChangeListener", "setOnSaveRecurrentSwitcherCheckedChangeListener", "Lcu7;", "method", "i", "Landroid/widget/ImageView;", "a", "Lk79;", "getPaymentWayIcon", "()Landroid/widget/ImageView;", "paymentWayIcon", "Landroid/widget/TextView;", "b", "getPaymentWayName", "()Landroid/widget/TextView;", "paymentWayName", c.a, "getErrorLabel", "errorLabel", "Landroid/view/View;", DateTokenConverter.CONVERTER_KEY, "getTitleContainer", "()Landroid/view/View;", "titleContainer", "getProgress", "progress", "f", "getArrowIcon", "arrowIcon", "Landroid/view/ViewGroup;", "getIconsContainer", "()Landroid/view/ViewGroup;", "iconsContainer", "getErrorIcon", "errorIcon", "getDivider", "divider", "Landroidx/appcompat/widget/SwitchCompat;", "getSaveRecurrentSwitcher", "()Landroidx/appcompat/widget/SwitchCompat;", "saveRecurrentSwitcher", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PaymentMethodView extends bm7 {
    static final /* synthetic */ je5<Object>[] k = {bc9.f(new ar8(PaymentMethodView.class, "paymentWayIcon", "getPaymentWayIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(PaymentMethodView.class, "paymentWayName", "getPaymentWayName()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PaymentMethodView.class, "errorLabel", "getErrorLabel()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PaymentMethodView.class, "titleContainer", "getTitleContainer()Landroid/view/View;", 0)), bc9.f(new ar8(PaymentMethodView.class, "progress", "getProgress()Landroid/view/View;", 0)), bc9.f(new ar8(PaymentMethodView.class, "arrowIcon", "getArrowIcon()Landroid/view/View;", 0)), bc9.f(new ar8(PaymentMethodView.class, "iconsContainer", "getIconsContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(PaymentMethodView.class, "errorIcon", "getErrorIcon()Landroid/view/View;", 0)), bc9.f(new ar8(PaymentMethodView.class, "divider", "getDivider()Landroid/view/View;", 0)), bc9.f(new ar8(PaymentMethodView.class, "saveRecurrentSwitcher", "getSaveRecurrentSwitcher()Landroidx/appcompat/widget/SwitchCompat;", 0))};
    public static final int l = 8;
    private final k79 a;
    private final k79 b;
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentMethodView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/views/PaymentMethodView$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        public static final a a = new a("PAYMENT_FAILED", 0);
        public static final a b = new a("PAYMENT_METHOD_UNAVAILABLE", 1);
        public static final a c = new a("UNKNOWN_FAIL", 2);
        private static final /* synthetic */ a[] d;
        private static final /* synthetic */ kj3 e;

        static {
            a[] a2 = a();
            d = a2;
            e = lj3.a(a2);
        }

        private a(String str, int i) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    /* compiled from: PaymentMethodView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PaymentMethodView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = kb0.d(this, gy8.payment_method_icon);
        this.b = kb0.d(this, gy8.payment_method_name);
        this.c = kb0.d(this, gy8.error_label);
        this.d = kb0.d(this, gy8.title_container);
        this.e = kb0.d(this, gy8.g3);
        this.f = kb0.d(this, gy8.arrow_icon);
        this.g = kb0.d(this, gy8.icons_container);
        this.h = kb0.d(this, gy8.u0);
        this.i = kb0.d(this, gy8.payment_method_divider);
        this.j = kb0.d(this, gy8.save_recurrent_switcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function1 function1, CompoundButton compoundButton, boolean z) {
        z65.h(function1, "$checkedChangeListener");
        function1.invoke(Boolean.valueOf(z));
    }

    private final void e(jw7 jw7Var, wk7 wk7Var, boolean z) {
        int a2;
        View titleContainer = getTitleContainer();
        ViewGroup.LayoutParams layoutParams = titleContainer.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z) {
                a2 = mpb.a(12.0f, getContext());
            } else {
                a2 = mpb.a(16.0f, getContext());
            }
            marginLayoutParams.setMarginStart(a2);
            marginLayoutParams.setMarginEnd(0);
            marginLayoutParams.bottomMargin = 0;
            titleContainer.setLayoutParams(marginLayoutParams);
            if (jw7Var == null) {
                un3.e(getPaymentWayIcon());
                getPaymentWayName().setText(getContext().getString(r09.checkout_select_payment));
                return;
            }
            mw7 mw7Var = mw7.a;
            Context context = getContext();
            z65.g(context, "getContext(...)");
            mw7.a a3 = mw7Var.a(context, jw7Var, wk7Var.a());
            getPaymentWayName().setText(a3.d());
            getPaymentWayIcon().setImageResource(a3.a());
            getPaymentWayIcon().setVisibility(a3.c());
            if (a3.b() != null) {
                getPaymentWayIcon().setImageTintList(iu1.d(getContext(), a3.b().intValue()));
            } else {
                getPaymentWayIcon().setImageTintList(null);
            }
            un3.o(getDivider(), a3.e());
            SwitchCompat saveRecurrentSwitcher = getSaveRecurrentSwitcher();
            saveRecurrentSwitcher.setChecked(a3.e());
            un3.o(saveRecurrentSwitcher, a3.e());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    static /* synthetic */ void f(PaymentMethodView paymentMethodView, jw7 jw7Var, wk7 wk7Var, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        paymentMethodView.e(jw7Var, wk7Var, z);
    }

    private final void g(a aVar, jw7 jw7Var, wk7 wk7Var) {
        e(jw7Var, wk7Var, true);
        int i = b.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    un3.k(getErrorLabel());
                    n1c.e(getIconsContainer(), getErrorIcon());
                    getErrorLabel().setText(getContext().getText(r09.checkout_payment_failed));
                    return;
                }
                return;
            }
            un3.k(getErrorLabel());
            n1c.e(getIconsContainer(), getErrorIcon());
            getErrorLabel().setText(getContext().getText(r09.checkout_payment_method_unavailable));
            return;
        }
        un3.k(getErrorLabel());
        n1c.e(getIconsContainer(), getArrowIcon());
        getErrorLabel().setText(getContext().getText(r09.checkout_payment_failed));
    }

    private final View getArrowIcon() {
        return (View) this.f.a(this, k[5]);
    }

    private final View getDivider() {
        return (View) this.i.a(this, k[8]);
    }

    private final View getErrorIcon() {
        return (View) this.h.a(this, k[7]);
    }

    private final TextView getErrorLabel() {
        return (TextView) this.c.a(this, k[2]);
    }

    private final ViewGroup getIconsContainer() {
        return (ViewGroup) this.g.a(this, k[6]);
    }

    private final ImageView getPaymentWayIcon() {
        return (ImageView) this.a.a(this, k[0]);
    }

    private final TextView getPaymentWayName() {
        return (TextView) this.b.a(this, k[1]);
    }

    private final View getProgress() {
        return (View) this.e.a(this, k[4]);
    }

    private final SwitchCompat getSaveRecurrentSwitcher() {
        return (SwitchCompat) this.j.a(this, k[9]);
    }

    private final View getTitleContainer() {
        return (View) this.d.a(this, k[3]);
    }

    private final void h(jw7 jw7Var, wk7 wk7Var) {
        j(jw7Var, wk7Var);
        un3.e(getErrorLabel());
        n1c.e(getIconsContainer(), getProgress());
    }

    private final void j(jw7 jw7Var, wk7 wk7Var) {
        f(this, jw7Var, wk7Var, false, 4, null);
        un3.e(getErrorLabel());
        n1c.e(getIconsContainer(), getArrowIcon());
    }

    @Override // defpackage.bm7
    protected int getLayoutId() {
        return gz8.payment_method_layout;
    }

    public final void i(cu7 cu7Var, wk7 wk7Var) {
        jw7 a2;
        a aVar;
        z65.h(cu7Var, "method");
        z65.h(wk7Var, "orderTypeState");
        boolean z = cu7Var instanceof cu7.a;
        if (z) {
            a2 = cu7Var.a();
        } else if (cu7Var instanceof cu7.c) {
            a2 = null;
        } else if (cu7Var instanceof cu7.b) {
            a2 = cu7Var.a();
        } else if (cu7Var instanceof cu7.d) {
            a2 = cu7Var.a();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (cu7Var instanceof cu7.b) {
            h(a2, wk7Var);
        } else if (z) {
            j(a2, wk7Var);
        } else if (cu7Var instanceof cu7.c) {
            j(null, wk7Var);
        } else if (cu7Var instanceof cu7.d) {
            cu7.d dVar = (cu7.d) cu7Var;
            if (dVar instanceof cu7.d.b) {
                aVar = a.b;
            } else if (dVar instanceof cu7.d.a) {
                aVar = a.a;
            } else if (dVar instanceof cu7.d.c) {
                aVar = a.c;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            g(aVar, a2, wk7Var);
        }
    }

    public final void setOnSaveRecurrentSwitcherCheckedChangeListener(final Function1<? super Boolean, Unit> function1) {
        z65.h(function1, "checkedChangeListener");
        getSaveRecurrentSwitcher().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: fu7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PaymentMethodView.d(Function1.this, compoundButton, z);
            }
        });
    }
}
