package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FlashLight.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u001d!B\u001b\b\u0016\u0012\b\u0010B\u001a\u0004\u0018\u00010A\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\bC\u0010DJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\tJ\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0014J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0017J\u0006\u0010\u0019\u001a\u00020\u0006J\u0006\u0010\u001a\u001a\u00020\u0006J\b\u0010\u001b\u001a\u00020\u0006H\u0014R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010:\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b6\u00107\u0012\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00107R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010>R\u0016\u0010@\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00107¨\u0006E"}, d2 = {"Lyy3;", "Landroid/widget/LinearLayout;", "", "l", "", "text", "", "setTitle", "k", "", "gravity", "setTitleGravity", "", Image.TYPE_MEDIUM, "y", "setTitleVerticalPosition", "o", "textAppearance", "setTextAppearance", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "n", "j", "onDetachedFromWindow", "Landroid/view/View;", "a", "Landroid/view/View;", "targetView", "Landroid/graphics/Paint;", "b", "Landroid/graphics/Paint;", "selfPaint", com.huawei.hms.opendevice.c.a, "targetPaint", "Landroid/graphics/RectF;", DateTokenConverter.CONVERTER_KEY, "Landroid/graphics/RectF;", "targetRect", "Landroid/graphics/Rect;", e.a, "Landroid/graphics/Rect;", "selfRect", "Landroidx/fragment/app/c;", "f", "Landroidx/fragment/app/c;", "dialogFragment", "Landroid/graphics/Xfermode;", "g", "Landroid/graphics/Xfermode;", "xFerModeClear", Image.TYPE_HIGH, "I", "getBackgroundColor$annotations", "()V", "backgroundColor", "i", "titleColor", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "titleTextView", "yMessageView", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yy3  reason: default package */
/* loaded from: classes.dex */
public final class yy3 extends LinearLayout {
    public static final b l = new b(null);
    private static final int m = (int) kx9.a(16);
    private static final int n = p19.TextAppearance_Dodo_Heading_H1;
    private View a;
    private final Paint b;
    private final Paint c;
    private RectF d;
    private final Rect e;
    private androidx.fragment.app.c f;
    private final Xfermode g;
    private final int h;
    private final int i;
    private final TextView j;
    private int k;

    /* compiled from: FlashLight.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\"\u0010\u001a\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0012\u0010\u0019¨\u0006\u001d"}, d2 = {"Lyy3$a;", "", "Landroid/view/View;", "view", "b", "", "text", DateTokenConverter.CONVERTER_KEY, "", "gravity", e.a, "Lyy3;", "a", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/String;", "title", com.huawei.hms.opendevice.c.a, "I", "titleGravity", "Landroid/view/View;", "targetView", "getTextAppearance", "()I", "(I)V", "textAppearance", "<init>", "(Landroid/content/Context;)V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: yy3$a */
    /* loaded from: classes.dex */
    public static final class a {
        private final Context a;
        private String b;
        private int c;
        private View d;
        private int e;

        public a(Context context) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            this.a = context;
            this.c = 17;
            this.e = p19.TextAppearance_Dodo_Heading_H1;
        }

        public final yy3 a() {
            boolean y;
            Context context = this.a;
            View view = this.d;
            if (view == null) {
                z65.z("targetView");
                view = null;
            }
            yy3 yy3Var = new yy3(context, view);
            String str = this.b;
            if (str != null) {
                y = l0b.y(str);
                if (!y) {
                    yy3Var.setTitle(this.b);
                    yy3Var.setTitleGravity(this.c);
                    yy3Var.setTextAppearance(this.e);
                    return yy3Var;
                }
            }
            yy3Var.k();
            yy3Var.setTitleGravity(this.c);
            yy3Var.setTextAppearance(this.e);
            return yy3Var;
        }

        public final a b(View view) {
            z65.h(view, "view");
            this.d = view;
            return this;
        }

        public final void c(int i) {
            this.e = i;
        }

        public final a d(String str) {
            this.b = str;
            return this;
        }

        public final a e(int i) {
            this.c = i;
            return this;
        }
    }

    /* compiled from: FlashLight.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lyy3$b;", "", "", "DEFAULT_TITLE_TEXT_APPEARANCE", "I", "TITLE_HORIZONTAL_MARGIN", "", "enterAnimationDuration", "J", "targetRadius", "titleMargin", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: yy3$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: FlashLight.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"yy3$c", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: yy3$c */
    /* loaded from: classes.dex */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {
        c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            yy3.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (!yy3.this.l()) {
                yy3.this.j();
                return;
            }
            int[] iArr = new int[2];
            View view = yy3.this.a;
            if (view != null) {
                yy3 yy3Var = yy3.this;
                view.getLocationOnScreen(iArr);
                int i = iArr[0];
                yy3Var.d = new RectF(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
            }
            yy3 yy3Var2 = yy3.this;
            yy3Var2.setTitleVerticalPosition(yy3Var2.m());
            yy3.this.e.set(yy3.this.getPaddingLeft(), yy3.this.getPaddingTop(), yy3.this.getWidth() - yy3.this.getPaddingRight(), yy3.this.getHeight() - yy3.this.getPaddingBottom());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy3(Context context, View view) {
        super(context);
        z65.h(view, "targetView");
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        this.e = new Rect();
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.g = porterDuffXfermode;
        int i = jw8.surfaceTooltipsColor;
        this.h = i;
        this.i = jw8.e;
        TextView textView = new TextView(getContext());
        this.j = textView;
        paint.setColor(iu1.c(getContext(), i));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint2.setXfermode(porterDuffXfermode);
        paint2.setAntiAlias(true);
        textView.setPadding(getPaddingLeft(), getPaddingRight(), getPaddingTop(), getPaddingBottom());
        textView.setGravity(3);
        setTextAppearance(n);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i2 = m;
        layoutParams.setMarginStart(i2);
        layoutParams.setMarginEnd(i2);
        Unit unit = Unit.a;
        addView(textView, layoutParams);
        setWillNotDraw(false);
        setLayerType(2, null);
        getViewTreeObserver().addOnGlobalLayoutListener(new c());
        this.a = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        removeView(this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l() {
        Rect rect = new Rect();
        View view = this.a;
        if (view != null) {
            view.getGlobalVisibleRect(rect);
        }
        jx9 jx9Var = jx9.a;
        Context context = getContext();
        z65.g(context, "getContext(...)");
        int e = jx9Var.e(context);
        Context context2 = getContext();
        z65.g(context2, "getContext(...)");
        return rect.intersect(new Rect(0, 0, e, jx9Var.d(context2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float m() {
        int a2;
        RectF rectF = this.d;
        if (rectF == null) {
            return 0.0f;
        }
        float f = rectF.top;
        float f2 = rectF.bottom;
        if (getHeight() - f2 < f) {
            a2 = (((int) rectF.top) - ((int) kx9.a(24))) - this.j.getHeight();
        } else {
            a2 = ((int) f2) + ((int) kx9.a(24));
        }
        this.k = a2;
        return a2;
    }

    private final void o() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setDuration(300L);
        startAnimation(alphaAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTitle(String str) {
        this.j.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTitleGravity(int i) {
        this.j.setGravity(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTitleVerticalPosition(float f) {
        this.j.setY(f);
        postInvalidate();
    }

    public final void j() {
        View view;
        ViewGroup viewGroup;
        Dialog dialog;
        Window window;
        androidx.fragment.app.c cVar = this.f;
        if (cVar != null) {
            if (cVar != null && (dialog = cVar.getDialog()) != null && (window = dialog.getWindow()) != null) {
                view = window.getDecorView();
            } else {
                view = null;
            }
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(this);
            }
            this.f = null;
            return;
        }
        Context context = getContext();
        z65.f(context, "null cannot be cast to non-null type android.app.Activity");
        View decorView = ((Activity) context).getWindow().getDecorView();
        z65.f(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) decorView).removeView(this);
    }

    public final void n() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setClickable(false);
        Context context = getContext();
        z65.f(context, "null cannot be cast to non-null type android.app.Activity");
        View decorView = ((Activity) context).getWindow().getDecorView();
        z65.f(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) decorView).addView(this);
        o();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a = null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        z65.h(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawRect(this.e, this.b);
        RectF rectF = this.d;
        if (rectF != null) {
            canvas.drawRoundRect(rectF, kx9.a(12), kx9.a(12), this.c);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        z65.h(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            RectF rectF = this.d;
            if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY()) && (view = this.a) != null) {
                view.performClick();
            }
            j();
            return true;
        }
        return false;
    }

    public final void setTextAppearance(int i) {
        gdb.a.b(this.j, i);
        this.j.setTextColor(iu1.c(getContext(), this.i));
    }

    private static /* synthetic */ void getBackgroundColor$annotations() {
    }
}
