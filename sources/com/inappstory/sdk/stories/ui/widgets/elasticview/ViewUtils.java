package com.inappstory.sdk.stories.ui.widgets.elasticview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.inappstory.sdk.stories.ui.widgets.elasticview.AnimUtils;
/* loaded from: classes3.dex */
public class ViewUtils {
    public static final Property<View, Integer> BACKGROUND_COLOR = AnimUtils.createIntProperty(new a("backgroundColor"));
    public static final Property<TextView, Integer> TEXT_COLOR = AnimUtils.createIntProperty(new b("textColor"));
    public static final Property<Drawable, Integer> DRAWABLE_ALPHA = AnimUtils.createIntProperty(new c("alpha"));
    public static final Property<ImageView, Integer> IMAGE_ALPHA = AnimUtils.createIntProperty(new d("imageAlpha"));
    public static final ViewOutlineProvider CIRCULAR_OUTLINE = new e();

    /* loaded from: classes3.dex */
    static class a extends AnimUtils.IntProp<View> {
        a(String str) {
            super(str);
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.elasticview.AnimUtils.IntProp
        /* renamed from: a */
        public int get(View view) {
            Drawable background = view.getBackground();
            if (background instanceof ColorDrawable) {
                return ((ColorDrawable) background).getColor();
            }
            return 0;
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.elasticview.AnimUtils.IntProp
        /* renamed from: b */
        public void set(View view, int i) {
            view.setBackgroundColor(i);
        }
    }

    /* loaded from: classes3.dex */
    static class b extends AnimUtils.IntProp<TextView> {
        b(String str) {
            super(str);
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.elasticview.AnimUtils.IntProp
        /* renamed from: a */
        public int get(TextView textView) {
            return textView.getCurrentTextColor();
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.elasticview.AnimUtils.IntProp
        /* renamed from: b */
        public void set(TextView textView, int i) {
            textView.setTextColor(i);
        }
    }

    /* loaded from: classes3.dex */
    static class c extends AnimUtils.IntProp<Drawable> {
        c(String str) {
            super(str);
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.elasticview.AnimUtils.IntProp
        /* renamed from: a */
        public int get(Drawable drawable) {
            return drawable.getAlpha();
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.elasticview.AnimUtils.IntProp
        /* renamed from: b */
        public void set(Drawable drawable, int i) {
            drawable.setAlpha(i);
        }
    }

    /* loaded from: classes3.dex */
    static class d extends AnimUtils.IntProp<ImageView> {
        d(String str) {
            super(str);
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.elasticview.AnimUtils.IntProp
        /* renamed from: a */
        public int get(ImageView imageView) {
            return imageView.getImageAlpha();
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.elasticview.AnimUtils.IntProp
        /* renamed from: b */
        public void set(ImageView imageView, int i) {
            imageView.setImageAlpha(i);
        }
    }

    /* loaded from: classes3.dex */
    static class e extends ViewOutlineProvider {
        e() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setOval(view.getPaddingLeft(), view.getPaddingTop(), view.getWidth() - view.getPaddingRight(), view.getHeight() - view.getPaddingBottom());
        }
    }

    private ViewUtils() {
    }

    public static void clearLightStatusBar(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setSystemUiVisibility(view.getSystemUiVisibility() & (-8193));
        }
    }

    public static RippleDrawable createRipple(int i, float f, boolean z) {
        return new RippleDrawable(ColorStateList.valueOf(ColorUtils.modifyAlpha(i, f)), null, z ? new ColorDrawable(-1) : null);
    }

    public static int getActionBarSize(@NonNull Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843499, typedValue, true);
        return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    public static float getSingleLineTextSize(String str, TextPaint textPaint, float f, float f2, float f3, float f4, DisplayMetrics displayMetrics) {
        float f5 = (f2 + f3) / 2.0f;
        textPaint.setTextSize(TypedValue.applyDimension(0, f5, displayMetrics));
        float measureText = textPaint.measureText(str);
        if (f3 - f2 < f4) {
            return f2;
        }
        if (measureText > f) {
            return getSingleLineTextSize(str, textPaint, f, f2, f5, f4, displayMetrics);
        }
        if (measureText < f) {
            return getSingleLineTextSize(str, textPaint, f, f5, f3, f4, displayMetrics);
        }
        return f5;
    }

    public static boolean isNavBarOnBottom(@NonNull Context context) {
        Resources resources = context.getResources();
        Configuration configuration = context.getResources().getConfiguration();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (i != i2 && configuration.smallestScreenWidthDp < 600 && i >= i2) {
            return false;
        }
        return true;
    }

    public static void setLightStatusBar(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setSystemUiVisibility(view.getSystemUiVisibility() | 8192);
        }
    }

    public static void setPaddingBottom(View view, int i) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), i);
    }

    public static void setPaddingEnd(View view, int i) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static void setPaddingStart(View view, int i) {
        view.setPaddingRelative(i, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }

    public static void setPaddingTop(View view, int i) {
        view.setPaddingRelative(view.getPaddingStart(), i, view.getPaddingEnd(), view.getPaddingBottom());
    }

    public static boolean viewsIntersect(View view, View view2) {
        if (view == null || view2 == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        int i2 = iArr2[0];
        return rect.intersect(new Rect(i2, iArr2[1], view2.getWidth() + i2, iArr2[1] + view2.getHeight()));
    }

    public static RippleDrawable createRipple(xp7 xp7Var, float f, float f2, int i, boolean z) {
        if (xp7Var != null) {
            if (xp7Var.n() != null) {
                i = ColorUtils.modifyAlpha(xp7Var.n().e(), f);
            } else if (xp7Var.i() != null) {
                i = ColorUtils.modifyAlpha(xp7Var.i().e(), f2);
            } else if (xp7Var.g() != null) {
                i = ColorUtils.modifyAlpha(xp7Var.g().e(), f);
            } else if (xp7Var.k() != null) {
                i = ColorUtils.modifyAlpha(xp7Var.k().e(), f);
            } else if (xp7Var.h() != null) {
                i = ColorUtils.modifyAlpha(xp7Var.h().e(), f2);
            } else if (xp7Var.f() != null) {
                i = ColorUtils.modifyAlpha(xp7Var.f().e(), f);
            }
        }
        return new RippleDrawable(ColorStateList.valueOf(i), null, z ? new ColorDrawable(-1) : null);
    }
}
