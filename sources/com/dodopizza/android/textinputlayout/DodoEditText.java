package com.dodopizza.android.textinputlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.BidiFormatter;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.textinputlayout.DodoEditText;
import com.google.android.material.textfield.TextInputEditText;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DodoEditText.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00032\u00020\u0001:\u0002NOB\u001b\b\u0016\u0012\u0006\u0010I\u001a\u00020H\u0012\b\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\bL\u0010MJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0019\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u001c\u001a\u00020\u0002H\u0002J\u0018\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018H\u0002J\u000e\u0010 \u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J(\u0010%\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tH\u0014J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014J\u000e\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0005R\u0016\u0010+\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00100R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00104R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00104R\u0016\u00107\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u0016\u00108\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u0016\u0010:\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00109R\u0016\u0010;\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00109R\u0016\u0010<\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0016\u0010=\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00109R\u0016\u0010>\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00109R\u0016\u0010@\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00109R\u0016\u0010B\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010AR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010AR(\u0010G\u001a\u0004\u0018\u00010\u00052\b\u0010C\u001a\u0004\u0018\u00010\u00058\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0004\u0010D\"\u0004\bE\u0010F¨\u0006P"}, d2 = {"Lcom/dodopizza/android/textinputlayout/DodoEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "", "t", Image.TYPE_SMALL, "", "inProgress", "setRightPaddingWithProgress", "setLeftPaddingWithProgress", "", "l", Image.TYPE_MEDIUM, "o", "n", "", "firstLetter", "k", "(Ljava/lang/Character;)Z", "Landroid/graphics/Canvas;", "canvas", "isFirstLetterRtl", "i", "q", "r", "", "getCenterXIfLtr", "getCenterXIfRtl", "j", "f", "touchX", "touchY", Image.TYPE_HIGH, "setProgress", "horiz", "vert", "oldHoriz", "oldVert", "onScrollChanged", "onDraw", "isEnabled", "g", c.a, "F", "cenX", DateTokenConverter.CONVERTER_KEY, "cenY", "Landroid/graphics/Paint;", e.a, "Landroid/graphics/Paint;", "progressPaint", "clearButtonPaint", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "progressRectF", "clearButtonRectF", "startAngleForProgress", "sweepAngleForProgress", "I", "scrollVerticalValue", "scrollHorizontalValue", "initialPadding", "initialPaddingTop", "initialPaddingBottom", "p", "paddingWithClearButton", "Z", "showClearButton", "value", "Ljava/lang/Boolean;", "setRTL", "(Ljava/lang/Boolean;)V", "isRTL", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class DodoEditText extends TextInputEditText {
    public static final b t = new b(null);
    private float c;
    private float d;
    private Paint e;
    private Paint f;
    private RectF g;
    private RectF h;
    private float i;
    private float j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private Boolean s;

    /* compiled from: DodoEditText.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/dodopizza/android/textinputlayout/DodoEditText$b;", "", "", "CLEAR_BUTTON_RADIUS", "F", "CROSS_SIZE", "OUTER_PROGRESS_RADIUS", "VERTICAL_DEFAULT_PADDING", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DodoEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.e = new Paint();
        this.f = new Paint();
        this.g = new RectF();
        this.h = new RectF();
        this.j = 320.0f;
        this.m = getPaddingRight();
        this.n = getPaddingTop();
        this.o = getPaddingBottom();
        this.p = (int) ((this.m * 2) + 32.0f);
        m();
    }

    private final void f() {
        float f = this.i + 5.0f;
        this.i = f;
        float f2 = this.j + 5.0f;
        this.j = f2;
        if (f >= 360.0f) {
            this.i = 0.0f;
        } else if (f2 >= 360.0f) {
            this.j = 0.0f;
        }
        invalidate();
    }

    private final float getCenterXIfLtr() {
        float width;
        int i;
        if (this.q) {
            width = (getWidth() - this.p) - 13.0f;
            i = this.l;
        } else {
            width = (getWidth() - this.m) - 13.0f;
            i = this.l;
        }
        return width + i;
    }

    private final float getCenterXIfRtl() {
        float f;
        int i;
        if (this.q) {
            f = this.p + 13.0f;
            i = this.l;
        } else {
            f = this.m + 13.0f;
            i = this.l;
        }
        return f + i;
    }

    private final boolean h(float f, float f2) {
        float f3 = this.c;
        int i = this.l;
        if (f < f3 + 16.0f + i && f > (f3 - 16.0f) - i) {
            float f4 = this.d;
            int i2 = this.k;
            if (f2 < f4 + 16.0f + i2 && f2 > (f4 - 16.0f) - i2) {
                return true;
            }
        }
        return false;
    }

    private final void i(Canvas canvas, boolean z) {
        if (z) {
            q();
        } else {
            r();
        }
        if (this.s == null) {
            setRTL(Boolean.valueOf(z));
        }
        if (!z65.c(this.s, Boolean.valueOf(z))) {
            setRTL(Boolean.valueOf(z));
        }
        RectF rectF = this.h;
        float f = this.c;
        float f2 = this.d;
        rectF.set((f - 16.0f) + 10.0f, (f2 - 16.0f) + 10.0f, (f + 16.0f) - 10.0f, (f2 + 16.0f) - 10.0f);
        RectF rectF2 = this.h;
        canvas.drawLine(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, this.f);
        RectF rectF3 = this.h;
        canvas.drawLine(rectF3.right, rectF3.top, rectF3.left, rectF3.bottom, this.f);
        canvas.drawCircle(this.c, this.d, 16.0f, this.f);
    }

    private final void j(Canvas canvas) {
        float centerXIfLtr;
        f();
        if (z65.c(this.s, Boolean.TRUE)) {
            centerXIfLtr = getCenterXIfRtl();
        } else {
            centerXIfLtr = getCenterXIfLtr();
        }
        float height = (getHeight() / 2.0f) + this.k;
        this.g.set(centerXIfLtr - 13.0f, height - 13.0f, centerXIfLtr + 13.0f, height + 13.0f);
        canvas.drawArc(this.g, this.i, this.j, false, this.e);
    }

    private final boolean k(Character ch2) {
        if (ch2 != null) {
            return BidiFormatter.getInstance().isRtl(ch2.toString());
        }
        return false;
    }

    private final int l(boolean z) {
        if (z) {
            return (int) (this.p + 26.0f + 4);
        }
        return this.p;
    }

    private final void m() {
        o();
        n();
        addTextChangedListener(new a());
    }

    private final void n() {
        Paint paint = new Paint(1);
        Context context = getContext();
        int i = jw8.n;
        paint.setColor(iu1.c(context, i));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics()));
        this.e = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(iu1.c(getContext(), i));
        paint2.setStyle(style);
        paint2.setStrokeWidth(TypedValue.applyDimension(1, 1.5f, getResources().getDisplayMetrics()));
        this.f = paint2;
    }

    private final void o() {
        setOnTouchListener(new View.OnTouchListener() { // from class: w53
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean p;
                p = DodoEditText.p(DodoEditText.this, view, motionEvent);
                return p;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(DodoEditText dodoEditText, View view, MotionEvent motionEvent) {
        z65.h(dodoEditText, "this$0");
        view.performClick();
        if (motionEvent.getAction() != 1 || !dodoEditText.h(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        dodoEditText.setText("");
        return true;
    }

    private final void q() {
        this.c = this.m + 16.0f + this.l;
        this.d = (getHeight() / 2.0f) + this.k;
    }

    private final void r() {
        this.c = ((getWidth() - this.m) - 16.0f) + this.l;
        this.d = (getHeight() / 2.0f) + this.k;
    }

    private final void s() {
        setPadding(this.m, getPaddingTop(), this.p, getPaddingBottom());
    }

    private final void setLeftPaddingWithProgress(boolean z) {
        setPadding(l(z), getPaddingTop(), this.m, getPaddingBottom());
    }

    private final void setRTL(Boolean bool) {
        this.s = bool;
        if (bool != null) {
            if (bool.booleanValue()) {
                t();
            } else {
                s();
            }
        }
    }

    private final void setRightPaddingWithProgress(boolean z) {
        setPadding(this.m, getPaddingTop(), l(z), getPaddingBottom());
    }

    private final void t() {
        setPadding(this.p, getPaddingTop(), this.m, getPaddingBottom());
    }

    public final void g(boolean z) {
        if (z) {
            setPadding(getPaddingLeft(), this.n, getPaddingRight(), this.o);
        } else {
            setPadding(getPaddingLeft(), mpb.a(16.0f, getContext()), getPaddingRight(), mpb.a(16.0f, getContext()));
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Character ch2;
        z65.h(canvas, "canvas");
        super.onDraw(canvas);
        if (this.q && hasFocus()) {
            Editable text = getText();
            if (text != null) {
                ch2 = o0b.V0(text);
            } else {
                ch2 = null;
            }
            i(canvas, k(ch2));
        }
        if (this.r) {
            j(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        this.k = i2;
        this.l = i;
        invalidate();
        super.onScrollChanged(i, i2, i3, i4);
    }

    public final void setProgress(boolean z) {
        this.r = z;
        if (z65.c(this.s, Boolean.TRUE)) {
            setLeftPaddingWithProgress(z);
        } else {
            setRightPaddingWithProgress(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DodoEditText.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J*\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\u0010"}, d2 = {"Lcom/dodopizza/android/textinputlayout/DodoEditText$a;", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", Image.TYPE_SMALL, "", "afterTextChanged", "", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "<init>", "(Lcom/dodopizza/android/textinputlayout/DodoEditText;)V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable == null || editable.length() == 0) {
                DodoEditText.this.q = false;
            } else if (!DodoEditText.this.q) {
                DodoEditText.this.q = true;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
