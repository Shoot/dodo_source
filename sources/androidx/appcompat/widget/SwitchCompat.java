package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    private static final Property<SwitchCompat, Float> h5 = new a(Float.class, "thumbPos");
    private static final int[] i5 = {16842912};
    private int A;
    private int B;
    private int I;
    private int S4;
    private int T4;
    private int U4;
    private int V4;
    private boolean W4;
    private final TextPaint X4;
    private ColorStateList Y4;
    private Layout Z4;
    private Drawable a;
    private Layout a5;
    private ColorStateList b;
    private TransformationMethod b5;
    private PorterDuff.Mode c;
    ObjectAnimator c5;
    private boolean d;
    private final r d5;
    private boolean e;
    @NonNull
    private k e5;
    private Drawable f;
    private c f5;
    private ColorStateList g;
    private final Rect g5;
    private PorterDuff.Mode h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private CharSequence o;
    private CharSequence p;
    private CharSequence q;
    private CharSequence r;
    private boolean s;
    private int t;
    private int u;
    private float v;
    private float w;
    private VelocityTracker x;
    private int y;
    float z;

    /* loaded from: classes.dex */
    class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.z);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static void a(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends e.AbstractC0033e {
        private final Reference<SwitchCompat> a;

        c(SwitchCompat switchCompat) {
            this.a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.e.AbstractC0033e
        public void a(Throwable th) {
            SwitchCompat switchCompat = this.a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.e.AbstractC0033e
        public void b() {
            SwitchCompat switchCompat = this.a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, aw8.O);
    }

    private void a(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, h5, f);
        this.c5 = ofFloat;
        ofFloat.setDuration(250L);
        b.a(this.c5, true);
        this.c5.start();
    }

    private void b() {
        Drawable drawable = this.a;
        if (drawable != null) {
            if (this.d || this.e) {
                Drawable mutate = f83.r(drawable).mutate();
                this.a = mutate;
                if (this.d) {
                    f83.o(mutate, this.b);
                }
                if (this.e) {
                    f83.p(this.a, this.c);
                }
                if (this.a.isStateful()) {
                    this.a.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable mutate = f83.r(drawable).mutate();
                this.f = mutate;
                if (this.i) {
                    f83.o(mutate, this.g);
                }
                if (this.j) {
                    f83.p(this.f, this.h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.c5;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float f(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        if (f > f3) {
            return f3;
        }
        return f;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod f = getEmojiTextViewHelper().f(this.b5);
        if (f != null) {
            return f.getTransformation(charSequence, this);
        }
        return charSequence;
    }

    @NonNull
    private k getEmojiTextViewHelper() {
        if (this.e5 == null) {
            this.e5 = new k(this);
        }
        return this.e5;
    }

    private boolean getTargetCheckedState() {
        if (this.z > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f;
        if (b1c.b(this)) {
            f = 1.0f - this.z;
        } else {
            f = this.z;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f;
        if (drawable != null) {
            Rect rect2 = this.g5;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.a;
            if (drawable2 != null) {
                rect = u.d(drawable2);
            } else {
                rect = u.c;
            }
            return ((((this.A - this.I) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private boolean h(float f, float f2) {
        if (this.a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.a.getPadding(this.g5);
        int i = this.T4;
        int i2 = this.u;
        int i3 = i - i2;
        int i4 = (this.S4 + thumbOffset) - i2;
        Rect rect = this.g5;
        int i6 = this.I + i4 + rect.left + rect.right + i2;
        int i7 = this.V4 + i2;
        if (f <= i4 || f >= i6 || f2 <= i3 || f2 >= i7) {
            return false;
        }
        return true;
    }

    private Layout i(CharSequence charSequence) {
        int i;
        TextPaint textPaint = this.X4;
        if (charSequence != null) {
            i = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i = 0;
        }
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.q;
            if (charSequence == null) {
                charSequence = getResources().getString(h19.d);
            }
            syb.N0(this, charSequence);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.o;
            if (charSequence == null) {
                charSequence = getResources().getString(h19.e);
            }
            syb.N0(this, charSequence);
        }
    }

    private void o(int i, int i2) {
        Typeface typeface;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    typeface = null;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
            } else {
                typeface = Typeface.SERIF;
            }
        } else {
            typeface = Typeface.SANS_SERIF;
        }
        n(typeface, i2);
    }

    private void p() {
        if (this.f5 == null && this.e5.b() && androidx.emoji2.text.e.h()) {
            androidx.emoji2.text.e b2 = androidx.emoji2.text.e.b();
            int d = b2.d();
            if (d == 3 || d == 0) {
                c cVar = new c(this);
                this.f5 = cVar;
                b2.s(cVar);
            }
        }
    }

    private void q(MotionEvent motionEvent) {
        boolean z;
        this.t = 0;
        boolean z2 = true;
        if (motionEvent.getAction() == 1 && isEnabled()) {
            z = true;
        } else {
            z = false;
        }
        boolean isChecked = isChecked();
        if (z) {
            this.x.computeCurrentVelocity(1000);
            float xVelocity = this.x.getXVelocity();
            if (Math.abs(xVelocity) > this.y) {
                if (!b1c.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z2 = false;
                }
            } else {
                z2 = getTargetCheckedState();
            }
        } else {
            z2 = isChecked;
        }
        if (z2 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z2);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.q = charSequence;
        this.r = g(charSequence);
        this.a5 = null;
        if (this.s) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.o = charSequence;
        this.p = g(charSequence);
        this.Z4 = null;
        if (this.s) {
            p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.g5;
        int i3 = this.S4;
        int i4 = this.T4;
        int i6 = this.U4;
        int i7 = this.V4;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.a;
        if (drawable != null) {
            rect = u.d(drawable);
        } else {
            rect = u.c;
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i8 = rect2.left;
            thumbOffset += i8;
            if (rect != null) {
                int i9 = rect.left;
                if (i9 > i8) {
                    i3 += i9 - i8;
                }
                int i10 = rect.top;
                int i11 = rect2.top;
                if (i10 > i11) {
                    i = (i10 - i11) + i4;
                } else {
                    i = i4;
                }
                int i12 = rect.right;
                int i13 = rect2.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = rect.bottom;
                int i15 = rect2.bottom;
                if (i14 > i15) {
                    i2 = i7 - (i14 - i15);
                    this.f.setBounds(i3, i, i6, i2);
                }
            } else {
                i = i4;
            }
            i2 = i7;
            this.f.setBounds(i3, i, i6, i2);
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i16 = thumbOffset - rect2.left;
            int i17 = thumbOffset + this.I + rect2.right;
            this.a.setBounds(i16, i4, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                f83.l(background, i16, i4, i17, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.a;
        if (drawable != null) {
            f83.k(drawable, f, f2);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            f83.k(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.a;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        } else {
            z = false;
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!b1c.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.m;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (b1c.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.m;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return edb.q(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.s;
    }

    public boolean getSplitTrack() {
        return this.n;
    }

    public int getSwitchMinWidth() {
        return this.l;
    }

    public int getSwitchPadding() {
        return this.m;
    }

    public CharSequence getTextOff() {
        return this.q;
    }

    public CharSequence getTextOn() {
        return this.o;
    }

    public Drawable getThumbDrawable() {
        return this.a;
    }

    protected final float getThumbPosition() {
        return this.z;
    }

    public int getThumbTextPadding() {
        return this.k;
    }

    public ColorStateList getThumbTintList() {
        return this.b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.c;
    }

    public Drawable getTrackDrawable() {
        return this.f;
    }

    public ColorStateList getTrackTintList() {
        return this.g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.h;
    }

    void j() {
        setTextOnInternal(this.o);
        setTextOffInternal(this.q);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.c5;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.c5.end();
            this.c5 = null;
        }
    }

    public void m(Context context, int i) {
        e0 t = e0.t(context, i, n29.U2);
        ColorStateList c2 = t.c(n29.Y2);
        if (c2 != null) {
            this.Y4 = c2;
        } else {
            this.Y4 = getTextColors();
        }
        int f = t.f(n29.V2, 0);
        if (f != 0) {
            float f2 = f;
            if (f2 != this.X4.getTextSize()) {
                this.X4.setTextSize(f2);
                requestLayout();
            }
        }
        o(t.k(n29.W2, -1), t.k(n29.X2, -1));
        if (t.a(n29.f3, false)) {
            this.b5 = new lb(getContext());
        } else {
            this.b5 = null;
        }
        setTextOnInternal(this.o);
        setTextOffInternal(this.q);
        t.w();
    }

    public void n(Typeface typeface, int i) {
        Typeface create;
        int i2;
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i);
            } else {
                create = Typeface.create(typeface, i);
            }
            setSwitchTypeface(create);
            if (create != null) {
                i2 = create.getStyle();
            } else {
                i2 = 0;
            }
            int i3 = (~i2) & i;
            TextPaint textPaint = this.X4;
            if ((i3 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.X4;
            if ((i3 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.X4.setFakeBoldText(false);
        this.X4.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, i5);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.g5;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.T4;
        int i2 = this.V4;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.a;
        if (drawable != null) {
            if (this.n && drawable2 != null) {
                Rect d = u.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.Z4;
        } else {
            layout = this.a5;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.Y4;
            if (colorStateList != null) {
                this.X4.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.X4.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.o;
            } else {
                charSequence = this.q;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i6;
        int width;
        int i7;
        int i8;
        int paddingTop;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.a != null) {
            Rect rect = this.g5;
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = u.d(this.a);
            i6 = Math.max(0, d.left - rect.left);
            i10 = Math.max(0, d.right - rect.right);
        } else {
            i6 = 0;
        }
        if (b1c.b(this)) {
            i7 = getPaddingLeft() + i6;
            width = ((this.A + i7) - i6) - i10;
        } else {
            width = (getWidth() - getPaddingRight()) - i10;
            i7 = (width - this.A) + i6 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i8 = this.B;
            } else {
                i9 = getHeight() - getPaddingBottom();
                paddingTop = i9 - this.B;
                this.S4 = i7;
                this.T4 = paddingTop;
                this.V4 = i9;
                this.U4 = width;
            }
        } else {
            i8 = this.B;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i8 / 2);
        }
        i9 = i8 + paddingTop;
        this.S4 = i7;
        this.T4 = paddingTop;
        this.V4 = i9;
        this.U4 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i6;
        int i7;
        if (this.s) {
            if (this.Z4 == null) {
                this.Z4 = i(this.p);
            }
            if (this.a5 == null) {
                this.a5 = i(this.r);
            }
        }
        Rect rect = this.g5;
        Drawable drawable = this.a;
        int i8 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.a.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.a.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.s) {
            i6 = Math.max(this.Z4.getWidth(), this.a5.getWidth()) + (this.k * 2);
        } else {
            i6 = 0;
        }
        this.I = Math.max(i6, i3);
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i8 = this.f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i9 = rect.left;
        int i10 = rect.right;
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            Rect d = u.d(drawable3);
            i9 = Math.max(i9, d.left);
            i10 = Math.max(i10, d.right);
        }
        if (this.W4) {
            i7 = Math.max(this.l, (this.I * 2) + i9 + i10);
        } else {
            i7 = this.l;
        }
        int max = Math.max(i8, i4);
        this.A = i7;
        this.B = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.o;
        } else {
            charSequence = this.q;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != 3) goto L8;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.x
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9f
            r2 = 2
            if (r0 == r1) goto L8b
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L8b
            goto Lb9
        L16:
            int r0 = r6.t
            if (r0 == r1) goto L57
            if (r0 == r2) goto L1e
            goto Lb9
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.v
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3d
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L39
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3d
        L39:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3d:
            boolean r0 = defpackage.b1c.b(r6)
            if (r0 == 0) goto L44
            float r2 = -r2
        L44:
            float r0 = r6.z
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L56
            r6.v = r7
            r6.setThumbPosition(r0)
        L56:
            return r1
        L57:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7d
            float r4 = r6.w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb9
        L7d:
            r6.t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.v = r0
            r6.w = r3
            return r1
        L8b:
            int r0 = r6.t
            if (r0 != r2) goto L96
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L96:
            r0 = 0
            r6.t = r0
            android.view.VelocityTracker r0 = r6.x
            r0.clear()
            goto Lb9
        L9f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb9
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb9
            r6.t = r1
            r6.v = r0
            r6.w = r2
        Lb9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        float f;
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && syb.Y(this)) {
            a(isChecked);
            return;
        }
        d();
        if (isChecked) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        setThumbPosition(f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(edb.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
        setTextOnInternal(this.o);
        setTextOffInternal(this.q);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z) {
        this.W4 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.s != z) {
            this.s = z;
            requestLayout();
            if (z) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.n = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.l = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.m = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.X4.getTypeface() != null && !this.X4.getTypeface().equals(typeface)) || (this.X4.getTypeface() == null && typeface != null)) {
            this.X4.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            k();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f) {
        this.z = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(on.b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.k = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(on.b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        this.i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        this.j = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.a && drawable != this.f) {
            return false;
        }
        return true;
    }

    public SwitchCompat(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.x = VelocityTracker.obtain();
        this.W4 = true;
        this.g5 = new Rect();
        a0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.X4 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = n29.F2;
        e0 v = e0.v(context, attributeSet, iArr, i, 0);
        syb.s0(this, context, iArr, attributeSet, v.r(), i, 0);
        Drawable g = v.g(n29.I2);
        this.a = g;
        if (g != null) {
            g.setCallback(this);
        }
        Drawable g2 = v.g(n29.R2);
        this.f = g2;
        if (g2 != null) {
            g2.setCallback(this);
        }
        setTextOnInternal(v.p(n29.G2));
        setTextOffInternal(v.p(n29.H2));
        this.s = v.a(n29.J2, true);
        this.k = v.f(n29.O2, 0);
        this.l = v.f(n29.L2, 0);
        this.m = v.f(n29.M2, 0);
        this.n = v.a(n29.K2, false);
        ColorStateList c2 = v.c(n29.P2);
        if (c2 != null) {
            this.b = c2;
            this.d = true;
        }
        PorterDuff.Mode e = u.e(v.k(n29.Q2, -1), null);
        if (this.c != e) {
            this.c = e;
            this.e = true;
        }
        if (this.d || this.e) {
            b();
        }
        ColorStateList c3 = v.c(n29.S2);
        if (c3 != null) {
            this.g = c3;
            this.i = true;
        }
        PorterDuff.Mode e2 = u.e(v.k(n29.T2, -1), null);
        if (this.h != e2) {
            this.h = e2;
            this.j = true;
        }
        if (this.i || this.j) {
            c();
        }
        int n = v.n(n29.N2, 0);
        if (n != 0) {
            m(context, n);
        }
        r rVar = new r(this);
        this.d5 = rVar;
        rVar.m(attributeSet, i);
        v.w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.u = viewConfiguration.getScaledTouchSlop();
        this.y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
