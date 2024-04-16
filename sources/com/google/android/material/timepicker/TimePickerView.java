package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
/* loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout {
    private final Chip a;
    private final Chip b;
    private final ClockHandView c;
    private final ClockFaceView d;
    private final MaterialButtonToggleGroup e;
    private final View.OnClickListener f;

    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.b(TimePickerView.this);
        }
    }

    /* loaded from: classes2.dex */
    class b implements MaterialButtonToggleGroup.d {
        b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            TimePickerView.c(TimePickerView.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.d(TimePickerView.this);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements View.OnTouchListener {
        final /* synthetic */ GestureDetector a;

        d(GestureDetector gestureDetector) {
            this.a = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    interface e {
    }

    /* loaded from: classes2.dex */
    interface f {
    }

    /* loaded from: classes2.dex */
    interface g {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static /* synthetic */ g b(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ f c(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ e d(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    private void e() {
        Chip chip = this.a;
        int i = ky8.selection_type;
        chip.setTag(i, 12);
        this.b.setTag(i, 10);
        this.a.setOnClickListener(this.f);
        this.b.setOnClickListener(this.f);
        this.a.setAccessibilityClassName("android.view.View");
        this.b.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void f() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.a.setOnTouchListener(dVar);
        this.b.setOnTouchListener(dVar);
    }

    private void g() {
        int i;
        if (this.e.getVisibility() == 0) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.p(this);
            if (syb.E(this) == 0) {
                i = 2;
            } else {
                i = 1;
            }
            dVar.n(ky8.material_clock_display, i);
            dVar.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            g();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new a();
        LayoutInflater.from(context).inflate(kz8.material_timepicker, this);
        this.d = (ClockFaceView) findViewById(ky8.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(ky8.material_clock_period_toggle);
        this.e = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new b());
        this.a = (Chip) findViewById(ky8.material_minute_tv);
        this.b = (Chip) findViewById(ky8.material_hour_tv);
        this.c = (ClockHandView) findViewById(ky8.material_clock_hand);
        f();
        e();
    }
}
