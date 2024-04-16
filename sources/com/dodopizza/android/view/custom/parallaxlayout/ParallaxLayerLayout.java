package com.dodopizza.android.view.custom.parallaxlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: ParallaxLayerLayout.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\u00020\u0001:\u0003\b\u0003\u001aB\u001d\b\u0007\u0012\u0006\u00101\u001a\u000200\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0003J\b\u0010\t\u001a\u00020\u0002H\u0014J0\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0014J\u0010\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014J\b\u0010\u001a\u001a\u00020\u0019H\u0014J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0014R\u001c\u0010\"\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0016\u0010'\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010&R\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010&R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u0016\u0010-\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00065"}, d2 = {"Lcom/dodopizza/android/view/custom/parallaxlayout/ParallaxLayerLayout;", "Landroid/widget/FrameLayout;", "", "b", "Landroid/view/View;", "child", "", "translations", "a", "onFinishInflate", "", "changed", "", ElementGenerator.TEXT_ALIGN_LEFT, "top", ElementGenerator.TEXT_ALIGN_RIGHT, "bottom", "onLayout", e.a, "Lcom/dodopizza/android/view/custom/parallaxlayout/ParallaxLayerLayout$c;", "translationUpdater", "setTranslationUpdater", "Landroid/view/ViewGroup$LayoutParams;", "params", "checkLayoutParams", "Lcom/dodopizza/android/view/custom/parallaxlayout/ParallaxLayerLayout$b;", com.huawei.hms.opendevice.c.a, "Landroid/util/AttributeSet;", "attrs", DateTokenConverter.CONVERTER_KEY, "generateLayoutParams", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "Landroid/view/animation/Interpolator;", "Landroid/view/animation/Interpolator;", "interpolator", "I", "offsetIncrementPx", "baseOffsetPx", "", "F", "scaleX", "f", "scaleY", "g", "Lcom/dodopizza/android/view/custom/parallaxlayout/ParallaxLayerLayout$c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", Image.TYPE_HIGH, "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ParallaxLayerLayout extends FrameLayout {
    public static final a h = new a(null);
    private final Logger a;
    private final Interpolator b;
    private int c;
    private int d;
    private float e;
    private float f;
    private c g;

    /* compiled from: ParallaxLayerLayout.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/dodopizza/android/view/custom/parallaxlayout/ParallaxLayerLayout$a;", "", "", "DEFAULT_BASE_OFFSET_DP", "I", "DEFAULT_OFFSET_INCREMENT_DP", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ParallaxLayerLayout.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/android/view/custom/parallaxlayout/ParallaxLayerLayout$c;", "", "Lcom/dodopizza/android/view/custom/parallaxlayout/ParallaxLayerLayout;", "parallaxLayerLayout", "", "a", "b", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public interface c {
        void a(ParallaxLayerLayout parallaxLayerLayout);

        void b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParallaxLayerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = LoggerFactory.getLogger("ParallaxLayerLayout");
        this.b = new DecelerateInterpolator();
        this.e = 1.0f;
        this.f = 1.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w19.K1);
        z65.g(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(w19.L1, -1);
            this.d = dimensionPixelSize;
            if (dimensionPixelSize == -1) {
                this.d = (int) TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics());
            }
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(w19.M1, -1);
            this.c = dimensionPixelSize2;
            if (dimensionPixelSize2 == -1) {
                this.c = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
            }
            this.e = obtainStyledAttributes.getFloat(w19.N1, 1.0f);
            float f = obtainStyledAttributes.getFloat(w19.O1, 1.0f);
            this.f = f;
            double d = this.e;
            if (-1.0d <= d && d <= 1.0d) {
                double d2 = f;
                if (-1.0d <= d2 && d2 <= 1.0d) {
                    obtainStyledAttributes.recycle();
                    return;
                }
            }
            throw new IllegalArgumentException("Parallax scale must be a value between -1.0 and 1.0".toString());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final float[] a(View view, float[] fArr) {
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        z65.f(layoutParams, "null cannot be cast to non-null type com.dodopizza.android.view.custom.parallaxlayout.ParallaxLayerLayout.LayoutParams");
        b bVar = (b) layoutParams;
        if (!bVar.b()) {
            return new float[]{0.0f, 0.0f};
        }
        int i2 = -1;
        if (fArr[0] > 0.0f) {
            i = 1;
        } else {
            i = -1;
        }
        if (fArr[1] > 0.0f) {
            i2 = 1;
        }
        return new float[]{i * bVar.d() * this.b.getInterpolation(Math.abs(fArr[0])) * this.e, i2 * bVar.d() * this.b.getInterpolation(Math.abs(fArr[1])) * this.f};
    }

    private final void b() {
        int a2;
        int childCount = getChildCount() - 1;
        for (int i = childCount; -1 < i; i--) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
            z65.f(layoutParams, "null cannot be cast to non-null type com.dodopizza.android.view.custom.parallaxlayout.ParallaxLayerLayout.LayoutParams");
            b bVar = (b) layoutParams;
            if (bVar.a() == -1) {
                a2 = childCount - i;
            } else {
                a2 = bVar.a();
            }
            bVar.e((bVar.c() * this.d) + (a2 * this.c));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: c */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        z65.h(layoutParams, "params");
        return layoutParams instanceof b;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: d */
    public b generateLayoutParams(AttributeSet attributeSet) {
        z65.h(attributeSet, "attrs");
        Context context = getContext();
        z65.g(context, "getContext(...)");
        return new b(context, attributeSet);
    }

    public final void e(float[] fArr) {
        z65.h(fArr, "translations");
        if (Math.abs(fArr[0]) > 1.0f || Math.abs(fArr[1]) > 1.0f) {
            this.a.error("Translation values >1: 0=" + fArr[0] + ", 1=" + fArr[1]);
            float f = fArr[0];
            float abs = f / Math.abs(f);
            float f2 = fArr[1];
            fArr = new float[]{abs, f2 / Math.abs(f2)};
        }
        for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = getChildAt(childCount);
            z65.e(childAt);
            float[] a2 = a(childAt, fArr);
            childAt.setTranslationX(a2[0]);
            childAt.setTranslationY(a2[1]);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        b();
        if (isInEditMode()) {
            e(new float[]{1.0f, 1.0f});
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b();
        if (isInEditMode()) {
            e(new float[]{1.0f, 1.0f});
        }
    }

    public final void setTranslationUpdater(c cVar) {
        c cVar2 = this.g;
        if (cVar2 != null && cVar2 != null) {
            cVar2.b();
        }
        this.g = cVar;
        if (cVar != null) {
            cVar.a(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        z65.h(layoutParams, "params");
        return new b(layoutParams.width, layoutParams.height);
    }

    /* compiled from: ParallaxLayerLayout.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eB\u0019\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\u0006\u0010 \u001a\u00020\n¢\u0006\u0004\b\u001d\u0010!R\"\u0010\t\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0003\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\"\u0010\u0019\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u000b\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/dodopizza/android/view/custom/parallaxlayout/ParallaxLayerLayout$b;", "Landroid/widget/FrameLayout$LayoutParams;", "", "a", "F", DateTokenConverter.CONVERTER_KEY, "()F", e.a, "(F)V", "offsetPx", "", "b", "I", "()I", "setCustomIndex$android_release", "(I)V", "customIndex", com.huawei.hms.opendevice.c.a, "setIncrementMultiplier$android_release", "incrementMultiplier", "", "Z", "()Z", "setEnabled$android_release", "(Z)V", "enabled", "Landroid/content/Context;", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "width", "height", "(II)V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class b extends FrameLayout.LayoutParams {
        private float a;
        private int b;
        private float c;
        private boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            z65.h(context, com.huawei.hms.opendevice.c.a);
            this.b = -1;
            this.c = 1.0f;
            this.d = true;
            ((FrameLayout.LayoutParams) this).gravity = 17;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w19.P1);
            z65.g(obtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                this.b = obtainStyledAttributes.getInt(w19.S1, -1);
                this.c = obtainStyledAttributes.getFloat(w19.R1, 1.0f);
                this.d = obtainStyledAttributes.getBoolean(w19.Q1, true);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        public final int a() {
            return this.b;
        }

        public final boolean b() {
            return this.d;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.a;
        }

        public final void e(float f) {
            this.a = f;
        }

        public b(int i, int i2) {
            super(i, i2);
            this.b = -1;
            this.c = 1.0f;
            this.d = true;
            ((FrameLayout.LayoutParams) this).gravity = 17;
        }
    }
}
