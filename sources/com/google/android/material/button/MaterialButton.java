package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, oha {
    private static final int[] n = {16842911};
    private static final int[] o = {16842912};
    private static final int p = i19.Widget_MaterialComponents_Button;
    @NonNull
    private final com.google.android.material.button.a a;
    @NonNull
    private final LinkedHashSet<a> b;
    private b c;
    private PorterDuff.Mode d;
    private ColorStateList e;
    private Drawable f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        boolean c;

        /* loaded from: classes2.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: a */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* renamed from: b */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(@NonNull Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.c = z;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    /* loaded from: classes2.dex */
    interface b {
        void a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qv8.materialButtonStyle);
    }

    private boolean b() {
        int i = this.m;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    private boolean c() {
        int i = this.m;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    private boolean d() {
        int i = this.m;
        if (i != 16 && i != 32) {
            return false;
        }
        return true;
    }

    private boolean e() {
        if (syb.E(this) == 1) {
            return true;
        }
        return false;
    }

    private boolean f() {
        com.google.android.material.button.a aVar = this.a;
        if (aVar != null && !aVar.o()) {
            return true;
        }
        return false;
    }

    private void g() {
        if (c()) {
            edb.j(this, this.f, null, null, null);
        } else if (b()) {
            edb.j(this, null, null, this.f, null);
        } else if (d()) {
            edb.j(this, null, this.f, null, null);
        }
    }

    @NonNull
    private String getA11yClassName() {
        Class cls;
        if (a()) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    private void h(boolean z) {
        Drawable drawable = this.f;
        if (drawable != null) {
            Drawable mutate = f83.r(drawable).mutate();
            this.f = mutate;
            f83.o(mutate, this.e);
            PorterDuff.Mode mode = this.d;
            if (mode != null) {
                f83.p(this.f, mode);
            }
            int i = this.g;
            if (i == 0) {
                i = this.f.getIntrinsicWidth();
            }
            int i2 = this.g;
            if (i2 == 0) {
                i2 = this.f.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f;
            int i3 = this.h;
            int i4 = this.i;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.f.setVisible(true, z);
        }
        if (z) {
            g();
            return;
        }
        Drawable[] a2 = edb.a(this);
        Drawable drawable3 = a2[0];
        Drawable drawable4 = a2[1];
        Drawable drawable5 = a2[2];
        if ((c() && drawable3 != this.f) || ((b() && drawable5 != this.f) || (d() && drawable4 != this.f))) {
            g();
        }
    }

    private void i(int i, int i2) {
        if (this.f != null && getLayout() != null) {
            if (!c() && !b()) {
                if (d()) {
                    this.h = 0;
                    if (this.m == 16) {
                        this.i = 0;
                        h(false);
                        return;
                    }
                    int i3 = this.g;
                    if (i3 == 0) {
                        i3 = this.f.getIntrinsicHeight();
                    }
                    int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i3) - this.j) - getPaddingBottom()) / 2;
                    if (this.i != textHeight) {
                        this.i = textHeight;
                        h(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.i = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i4 = this.m;
            boolean z = true;
            if (i4 != 1 && i4 != 3 && ((i4 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i4 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i5 = this.g;
                if (i5 == 0) {
                    i5 = this.f.getIntrinsicWidth();
                }
                int textWidth = ((((i - getTextWidth()) - syb.I(this)) - i5) - this.j) - syb.J(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textWidth /= 2;
                }
                boolean e = e();
                if (this.m != 4) {
                    z = false;
                }
                if (e != z) {
                    textWidth = -textWidth;
                }
                if (this.h != textWidth) {
                    this.h = textWidth;
                    h(false);
                    return;
                }
                return;
            }
            this.h = 0;
            h(false);
        }
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.a;
        if (aVar != null && aVar.p()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.a.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f;
    }

    public int getIconGravity() {
        return this.m;
    }

    public int getIconPadding() {
        return this.j;
    }

    public int getIconSize() {
        return this.g;
    }

    public ColorStateList getIconTint() {
        return this.e;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.d;
    }

    public int getInsetBottom() {
        return this.a.c();
    }

    public int getInsetTop() {
        return this.a.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.a.h();
        }
        return null;
    }

    @NonNull
    public uga getShapeAppearanceModel() {
        if (f()) {
            return this.a.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.a.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.a.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        if (f()) {
            return this.a.l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (f()) {
            return this.a.m();
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            ga6.f(this, this.a.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, n);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, o);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.google.android.material.button.a aVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.a) != null) {
            aVar.H(i4 - i2, i3 - i);
        }
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.c);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.k;
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f != null) {
            if (this.f.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (f()) {
            this.a.r(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (f()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.a.s();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = on.b(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (f()) {
            this.a.t(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (a() && isEnabled() && this.k != z) {
            this.k = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.k);
            }
            if (this.l) {
                return;
            }
            this.l = true;
            Iterator<a> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.k);
            }
            this.l = false;
        }
    }

    public void setCornerRadius(int i) {
        if (f()) {
            this.a.u(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (f()) {
            this.a.f().a0(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f != drawable) {
            this.f = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.m != i) {
            this.m = i;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.j != i) {
            this.j = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = on.b(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i >= 0) {
            if (this.g != i) {
                this.g = i;
                h(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.d != mode) {
            this.d = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(on.a(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.a.v(i);
    }

    public void setInsetTop(int i) {
        this.a.w(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(b bVar) {
        this.c = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.a.x(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (f()) {
            setRippleColor(on.a(getContext(), i));
        }
    }

    @Override // defpackage.oha
    public void setShapeAppearanceModel(@NonNull uga ugaVar) {
        if (f()) {
            this.a.y(ugaVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (f()) {
            this.a.z(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.a.A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (f()) {
            setStrokeColor(on.a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (f()) {
            this.a.B(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.a.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.a.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.k);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(@androidx.annotation.NonNull android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.p
            android.content.Context r9 = defpackage.ia6.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.b = r9
            r9 = 0
            r8.k = r9
            r8.l = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = defpackage.b29.x3
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = defpackage.sdb.h(r0, r1, r2, r3, r4, r5)
            int r1 = defpackage.b29.K3
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.j = r1
            int r1 = defpackage.b29.N3
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = defpackage.z0c.j(r1, r2)
            r8.d = r1
            android.content.Context r1 = r8.getContext()
            int r2 = defpackage.b29.M3
            android.content.res.ColorStateList r1 = defpackage.ea6.a(r1, r0, r2)
            r8.e = r1
            android.content.Context r1 = r8.getContext()
            int r2 = defpackage.b29.I3
            android.graphics.drawable.Drawable r1 = defpackage.ea6.e(r1, r0, r2)
            r8.f = r1
            int r1 = defpackage.b29.J3
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.m = r1
            int r1 = defpackage.b29.L3
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.g = r1
            uga$b r10 = defpackage.uga.e(r7, r10, r11, r6)
            uga r10 = r10.m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.a = r11
            r11.q(r0)
            r0.recycle()
            int r10 = r8.j
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f
            if (r10 == 0) goto L84
            r9 = 1
        L84:
            r8.h(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
