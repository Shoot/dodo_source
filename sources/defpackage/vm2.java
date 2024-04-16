package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import defpackage.vm2;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DatePickerDialogFragment.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\"¨\u0006+"}, d2 = {"Lvm2;", "Lt74;", "", "isYearsPickerShow", "", "uh", "isMonthPickerShow", "sh", "rh", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Landroid/widget/NumberPicker;", "b", "Lk79;", "nh", "()Landroid/widget/NumberPicker;", "daysOfMonthPicker", com.huawei.hms.opendevice.c.a, "oh", "monthsPicker", DateTokenConverter.CONVERTER_KEY, "qh", "yearPicker", "Landroid/widget/Button;", e.a, "ph", "()Landroid/widget/Button;", "okButton", "f", "mh", "cancelButton", "<init>", "()V", "g", "a", "profile_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vm2 */
/* loaded from: classes2.dex */
public final class vm2 extends t74 {
    private final k79 b = kb0.e(this, iy8.date_picker_days_of_month);
    private final k79 c = kb0.e(this, iy8.date_picker_months);
    private final k79 d = kb0.e(this, iy8.date_picker_year);
    private final k79 e = kb0.e(this, iy8.ok_button);
    private final k79 f = kb0.e(this, iy8.a);
    static final /* synthetic */ je5<Object>[] h = {bc9.f(new ar8(vm2.class, "daysOfMonthPicker", "getDaysOfMonthPicker()Landroid/widget/NumberPicker;", 0)), bc9.f(new ar8(vm2.class, "monthsPicker", "getMonthsPicker()Landroid/widget/NumberPicker;", 0)), bc9.f(new ar8(vm2.class, "yearPicker", "getYearPicker()Landroid/widget/NumberPicker;", 0)), bc9.f(new ar8(vm2.class, "okButton", "getOkButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(vm2.class, "cancelButton", "getCancelButton()Landroid/widget/Button;", 0))};
    public static final a g = new a(null);

    /* compiled from: DatePickerDialogFragment.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002J2\u0010\u000e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lvm2$a;", "", "", "showDaysOfMonth", "showMonths", "showYears", "Lvm2;", "b", "Landroidx/fragment/app/Fragment;", "recipient", "Lkotlin/Function3;", "", "", "resultListener", DateTokenConverter.CONVERTER_KEY, "", "ARG_SHOW_DAYS_OF_MONTH", "Ljava/lang/String;", "ARG_SHOW_MONTHS", "ARG_SHOW_YEARS", "RESULT_ARG_DAY_OF_MONTH", "RESULT_ARG_MONTH", "RESULT_ARG_YEAR", "RESULT_KEY_DATE_SELECTED", "YEAR_BACK_DELTA", "I", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: vm2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ vm2 c(a aVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            if ((i & 4) != 0) {
                z3 = true;
            }
            return aVar.b(z, z2, z3);
        }

        public static final void e(y84 y84Var, String str, Bundle bundle) {
            z65.h(y84Var, "$resultListener");
            z65.h(str, "<anonymous parameter 0>");
            z65.h(bundle, "bundle");
            y84Var.invoke(Integer.valueOf(bundle.getInt("result_arg_day_of_month", -1)), Integer.valueOf(bundle.getInt("result_arg_month", -1)), Integer.valueOf(bundle.getInt("result_arg_year", -1)));
        }

        public final vm2 b(boolean z, boolean z2, boolean z3) {
            return (vm2) y64.d(new vm2(), bi0.c(bi0.d("arg_show_days_of_month", Boolean.valueOf(z)), bi0.d("arg_show_months", Boolean.valueOf(z2)), bi0.d("arg_show_years", Boolean.valueOf(z3))));
        }

        public final vm2 d(vm2 vm2Var, Fragment fragment, final y84<? super Integer, ? super Integer, ? super Integer, Unit> y84Var) {
            z65.h(vm2Var, "<this>");
            z65.h(fragment, "recipient");
            z65.h(y84Var, "resultListener");
            fragment.getChildFragmentManager().A1("result_key_date_selected", fragment, new r64() { // from class: um2
                @Override // defpackage.r64
                public final void a(String str, Bundle bundle) {
                    vm2.a.e(y84.this, str, bundle);
                }
            });
            return vm2Var;
        }
    }

    /* compiled from: DatePickerDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: vm2$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ boolean a;
        final /* synthetic */ vm2 b;
        final /* synthetic */ boolean c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z, vm2 vm2Var, boolean z2, boolean z3) {
            super(1);
            this.a = z;
            this.b = vm2Var;
            this.c = z2;
            this.d = z3;
        }

        public final void a(View view) {
            int i;
            int i2;
            z65.h(view, "it");
            int i3 = -1;
            if (this.a) {
                i = this.b.nh().getValue();
            } else {
                i = -1;
            }
            if (this.c) {
                i2 = this.b.oh().getValue() + 1;
            } else {
                i2 = -1;
            }
            if (this.d) {
                i3 = this.b.qh().getValue();
            }
            i64.a(this.b, "result_key_date_selected", bi0.c(bi0.d("result_arg_day_of_month", Integer.valueOf(i)), bi0.d("result_arg_month", Integer.valueOf(i2)), bi0.d("result_arg_year", Integer.valueOf(i3))));
            this.b.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: DatePickerDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: vm2$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(1);
            vm2.this = r1;
        }

        public final void a(View view) {
            z65.h(view, "it");
            vm2.this.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    private final Button mh() {
        return (Button) this.f.a(this, h[4]);
    }

    public final NumberPicker nh() {
        return (NumberPicker) this.b.a(this, h[0]);
    }

    public final NumberPicker oh() {
        return (NumberPicker) this.c.a(this, h[1]);
    }

    private final Button ph() {
        return (Button) this.e.a(this, h[3]);
    }

    public final NumberPicker qh() {
        return (NumberPicker) this.d.a(this, h[2]);
    }

    private final void rh() {
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("arg_show_days_of_month")) == null) ? null : null;
        if (obj != null && !(obj instanceof Boolean)) {
            throw new ClassCastException("Property arg_show_days_of_month has different class type");
        } else if (obj != null) {
            if (((Boolean) obj).booleanValue()) {
                Calendar calendar = Calendar.getInstance(Locale.getDefault());
                calendar.set(qh().getValue(), oh().getValue(), 1);
                int actualMaximum = calendar.getActualMaximum(5);
                nh().setMinValue(1);
                nh().setMaxValue(actualMaximum);
                un3.k(nh());
                return;
            }
            un3.e(nh());
        } else {
            throw new IllegalArgumentException("Argument with key = arg_show_days_of_month not found in bundle");
        }
    }

    private final void sh(boolean z) {
        if (z) {
            String[] months = new DateFormatSymbols(Locale.getDefault()).getMonths();
            oh().setDisplayedValues(months);
            oh().setMinValue(0);
            oh().setMaxValue(months.length - 1);
            oh().setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: tm2
                @Override // android.widget.NumberPicker.OnValueChangeListener
                public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
                    vm2.th(vm2.this, numberPicker, i, i2);
                }
            });
            un3.k(oh());
            return;
        }
        un3.e(oh());
    }

    public static final void th(vm2 vm2Var, NumberPicker numberPicker, int i, int i2) {
        z65.h(vm2Var, "this$0");
        vm2Var.rh();
    }

    private final void uh(boolean z) {
        if (z) {
            int i = Calendar.getInstance().get(1);
            qh().setMinValue(i - 100);
            qh().setMaxValue(i);
            qh().setValue(i);
            qh().setWrapSelectorWheel(false);
            qh().setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: sm2
                @Override // android.widget.NumberPicker.OnValueChangeListener
                public final void onValueChange(NumberPicker numberPicker, int i2, int i3) {
                    vm2.vh(vm2.this, numberPicker, i2, i3);
                }
            });
            un3.k(qh());
            return;
        }
        un3.e(qh());
    }

    public static final void vh(vm2 vm2Var, NumberPicker numberPicker, int i, int i2) {
        z65.h(vm2Var, "this$0");
        vm2Var.rh();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(iz8.dialog_fragment_date_picker, viewGroup, false);
        jb0.a.a(this);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object obj;
        Object obj2;
        Object obj3;
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Boolean bool = null;
        if (arguments == null || (obj = arguments.get("arg_show_years")) == null) {
            obj = null;
        }
        if (obj != null && !(obj instanceof Boolean)) {
            throw new ClassCastException("Property arg_show_years has different class type");
        } else if (obj != null) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            uh(booleanValue);
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (obj2 = arguments2.get("arg_show_months")) == null) {
                obj2 = null;
            }
            if (obj2 != null && !(obj2 instanceof Boolean)) {
                throw new ClassCastException("Property arg_show_months has different class type");
            } else if (obj2 != null) {
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                sh(booleanValue2);
                Bundle arguments3 = getArguments();
                if (arguments3 != null && (obj3 = arguments3.get("arg_show_days_of_month")) != null) {
                    bool = obj3;
                }
                if (bool != null && !(bool instanceof Boolean)) {
                    throw new ClassCastException("Property arg_show_days_of_month has different class type");
                } else if (bool != null) {
                    boolean booleanValue3 = bool.booleanValue();
                    rh();
                    oma.a(ph(), new b(booleanValue3, this, booleanValue2, booleanValue));
                    oma.a(mh(), new c());
                } else {
                    throw new IllegalArgumentException("Argument with key = arg_show_days_of_month not found in bundle");
                }
            } else {
                throw new IllegalArgumentException("Argument with key = arg_show_months not found in bundle");
            }
        } else {
            throw new IllegalArgumentException("Argument with key = arg_show_years not found in bundle");
        }
    }
}
