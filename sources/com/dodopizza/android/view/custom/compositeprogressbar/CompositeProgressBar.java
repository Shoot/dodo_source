package com.dodopizza.android.view.custom.compositeprogressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CompositeProgressBar.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u000fB\u001d\b\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0016\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007R\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/dodopizza/android/view/custom/compositeprogressbar/CompositeProgressBar;", "Landroid/widget/LinearLayout;", "", c.a, "b", "Landroid/view/View;", "child", "", "position", DateTokenConverter.CONVERTER_KEY, "Landroid/util/AttributeSet;", "attrs", "setup", "total", "current", "a", "I", "totalBars", "currentBar", "barsBackgroundColor", "barsForegroundColor", e.a, "barsMargin", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "f", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class CompositeProgressBar extends LinearLayout {
    public static final a f = new a(null);
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    /* compiled from: CompositeProgressBar.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/dodopizza/android/view/custom/compositeprogressbar/CompositeProgressBar$a;", "", "", "DEFAULT_BACKGROUND_COLOR", "I", "DEFAULT_BARS_PADDING", "DEFAULT_CURRENT_BAR", "DEFAULT_FOREGROUND_COLOR", "DEFAULT_TOTAL_BARS", "", "MAX_PROGRESS", "F", "MIN_PROGRESS", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CompositeProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1;
        this.c = -7829368;
        this.d = -65536;
        this.e = 10;
        setOrientation(0);
        setup(attributeSet);
    }

    private final void b() {
        removeAllViewsInLayout();
        setWeightSum(this.a);
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            View view = new View(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            if (i2 < this.a - 1) {
                layoutParams.rightMargin = this.e;
            }
            if (i2 > 0) {
                layoutParams.leftMargin = this.e;
            }
            d(view, i2);
            view.setLayoutParams(layoutParams);
            addView(view);
        }
        requestLayout();
        invalidate();
    }

    private final void c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            z65.g(childAt, "getChildAt(...)");
            d(childAt, i);
        }
        invalidate();
    }

    private final void d(View view, int i) {
        if (i >= 0 && i < this.b) {
            cp8 cp8Var = new cp8();
            cp8Var.n(100.0f);
            view.setBackground(cp8Var);
        } else if (i == this.b) {
            view.setBackground(new x05());
            Drawable background = view.getBackground();
            z65.f(background, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
            ((Animatable) background).start();
        } else {
            cp8 cp8Var2 = new cp8();
            cp8Var2.n(0.0f);
            view.setBackground(cp8Var2);
        }
        Drawable background2 = view.getBackground();
        z65.f(background2, "null cannot be cast to non-null type com.dodopizza.android.view.custom.compositeprogressbar.drawable.ProgressDrawable");
        cp8 cp8Var3 = (cp8) background2;
        cp8Var3.l(this.c);
        cp8Var3.m(this.d);
    }

    public final void a(int i, int i2) {
        if (this.a != i) {
            this.a = i;
            this.b = i2;
            b();
        } else if (this.b != i2) {
            this.b = i2;
            c();
        }
    }

    public final void setup(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, w19.P, 0, 0);
        z65.g(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.a = obtainStyledAttributes.getInt(w19.U, 0);
        this.b = obtainStyledAttributes.getInt(w19.R, -1);
        this.d = obtainStyledAttributes.getColor(w19.S, -65536);
        this.c = obtainStyledAttributes.getColor(w19.Q, -7829368);
        this.e = obtainStyledAttributes.getDimensionPixelSize(w19.T, 10);
        obtainStyledAttributes.recycle();
        b();
    }
}
