package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.p;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.c5c;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: MaterialDatePicker.java */
/* loaded from: classes2.dex */
public final class f<S> extends androidx.fragment.app.c {
    static final Object x = "CONFIRM_BUTTON_TAG";
    static final Object y = "CANCEL_BUTTON_TAG";
    static final Object z = "TOGGLE_BUTTON_TAG";
    private final LinkedHashSet<ca6<? super S>> b = new LinkedHashSet<>();
    private final LinkedHashSet<View.OnClickListener> c = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnCancelListener> d = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> e = new LinkedHashSet<>();
    private int f;
    private DateSelector<S> g;
    private i<S> h;
    private CalendarConstraints i;
    private com.google.android.material.datepicker.e<S> j;
    private int k;
    private CharSequence l;
    private boolean m;
    private int n;
    private int o;
    private CharSequence p;
    private int q;
    private CharSequence r;
    private TextView s;
    private CheckableImageButton t;
    private fa6 u;
    private Button v;
    private boolean w;

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = f.this.b.iterator();
            while (it.hasNext()) {
                ((ca6) it.next()).a(f.this.th());
            }
            f.this.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = f.this.c.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            f.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    public class c implements h77 {
        final /* synthetic */ int a;
        final /* synthetic */ View b;
        final /* synthetic */ int c;

        c(int i, View view, int i2) {
            this.a = i;
            this.b = view;
            this.c = i2;
        }

        @Override // defpackage.h77
        public c5c a(View view, c5c c5cVar) {
            int i = c5cVar.f(c5c.m.d()).b;
            if (this.a >= 0) {
                this.b.getLayoutParams().height = this.a + i;
                View view2 = this.b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.b;
            view3.setPadding(view3.getPaddingLeft(), this.c + i, this.b.getPaddingRight(), this.b.getPaddingBottom());
            return c5cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    public class d extends z87<S> {
        d() {
        }

        @Override // defpackage.z87
        public void a(S s) {
            f.this.Ah();
            f.this.v.setEnabled(f.this.qh().A1());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f.this.v.setEnabled(f.this.qh().A1());
            f.this.t.toggle();
            f fVar = f.this;
            fVar.Bh(fVar.t);
            f.this.zh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ah() {
        String rh = rh();
        this.s.setContentDescription(String.format(getString(w09.mtrl_picker_announce_current_selection), rh));
        this.s.setText(rh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bh(@NonNull CheckableImageButton checkableImageButton) {
        String string;
        if (this.t.isChecked()) {
            string = checkableImageButton.getContext().getString(w09.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton.getContext().getString(w09.mtrl_picker_toggle_to_text_input_mode);
        }
        this.t.setContentDescription(string);
    }

    @NonNull
    private static Drawable oh(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, on.b(context, dx8.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], on.b(context, dx8.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    private void ph(Window window) {
        if (this.w) {
            return;
        }
        View findViewById = requireView().findViewById(ky8.fullscreen_header);
        yc3.a(window, true, z0c.d(findViewById), null);
        syb.I0(findViewById, new c(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
        this.w = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DateSelector<S> qh() {
        if (this.g == null) {
            this.g = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.g;
    }

    private static int sh(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(ww8.mtrl_calendar_content_padding);
        int i = Month.i().d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(ww8.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(ww8.mtrl_calendar_month_horizontal_padding));
    }

    private int uh(Context context) {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        return qh().o0(context);
    }

    private void vh(Context context) {
        boolean z2;
        this.t.setTag(z);
        this.t.setImageDrawable(oh(context));
        CheckableImageButton checkableImageButton = this.t;
        if (this.n != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        checkableImageButton.setChecked(z2);
        syb.u0(this.t, null);
        Bh(this.t);
        this.t.setOnClickListener(new e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean wh(@NonNull Context context) {
        return yh(context, 16843277);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean xh(@NonNull Context context) {
        return yh(context, qv8.nestedScrollable);
    }

    static boolean yh(@NonNull Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(x96.d(context, qv8.materialCalendarStyle, com.google.android.material.datepicker.e.class.getCanonicalName()), new int[]{i});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zh() {
        i<S> iVar;
        int uh = uh(requireContext());
        this.j = com.google.android.material.datepicker.e.yh(qh(), uh, this.i);
        if (this.t.isChecked()) {
            iVar = g.ih(qh(), uh, this.i);
        } else {
            iVar = this.j;
        }
        this.h = iVar;
        Ah();
        p p = getChildFragmentManager().p();
        p.u(ky8.mtrl_calendar_frame, this.h);
        p.m();
        this.h.gh(new d());
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.g = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.i = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.k = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.l = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.n = bundle.getInt("INPUT_MODE_KEY");
        this.o = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.p = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.q = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.r = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    @Override // androidx.fragment.app.c
    @NonNull
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), uh(requireContext()));
        Context context = dialog.getContext();
        this.m = wh(context);
        int d2 = x96.d(context, qv8.colorSurface, f.class.getCanonicalName());
        fa6 fa6Var = new fa6(context, null, qv8.materialCalendarStyle, i19.Widget_MaterialComponents_MaterialCalendar);
        this.u = fa6Var;
        fa6Var.Q(context);
        this.u.b0(ColorStateList.valueOf(d2));
        this.u.a0(syb.y(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (this.m) {
            i = kz8.mtrl_picker_fullscreen;
        } else {
            i = kz8.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.m) {
            inflate.findViewById(ky8.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(sh(context), -2));
        } else {
            inflate.findViewById(ky8.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(sh(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(ky8.mtrl_picker_header_selection_text);
        this.s = textView;
        syb.w0(textView, 1);
        this.t = (CheckableImageButton) inflate.findViewById(ky8.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(ky8.mtrl_picker_title_text);
        CharSequence charSequence = this.l;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.k);
        }
        vh(context);
        this.v = (Button) inflate.findViewById(ky8.c);
        if (qh().A1()) {
            this.v.setEnabled(true);
        } else {
            this.v.setEnabled(false);
        }
        this.v.setTag(x);
        CharSequence charSequence2 = this.p;
        if (charSequence2 != null) {
            this.v.setText(charSequence2);
        } else {
            int i2 = this.o;
            if (i2 != 0) {
                this.v.setText(i2);
            }
        }
        this.v.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(ky8.a);
        button.setTag(y);
        CharSequence charSequence3 = this.r;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i3 = this.q;
            if (i3 != 0) {
                button.setText(i3);
            }
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.g);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.i);
        if (this.j.th() != null) {
            bVar.b(this.j.th().f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.k);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.l);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.o);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.p);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.q);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.r);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.m) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.u);
            ph(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(ww8.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.u, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new m45(requireDialog(), rect));
        }
        zh();
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onStop() {
        this.h.hh();
        super.onStop();
    }

    public String rh() {
        return qh().N0(getContext());
    }

    public final S th() {
        return qh().I1();
    }
}
