package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatTextViewAutoSizeHelper.java */
/* loaded from: classes.dex */
public class s {
    private static final RectF l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Field> n = new ConcurrentHashMap<>();
    private int a = 0;
    private boolean b = false;
    private float c = -1.0f;
    private float d = -1.0f;
    private float e = -1.0f;
    private int[] f = new int[0];
    private boolean g = false;
    private TextPaint h;
    @NonNull
    private final TextView i;
    private final Context j;
    private final f k;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static final class a {
        @NonNull
        static StaticLayout a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i, @NonNull TextView textView, @NonNull TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        static int b(@NonNull TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static final class b {
        static boolean a(@NonNull View view) {
            return view.isInLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static final class c {
        @NonNull
        static StaticLayout a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i, int i2, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    private static class d extends f {
        d() {
        }

        @Override // androidx.appcompat.widget.s.f
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) s.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    private static class e extends d {
        e() {
        }

        @Override // androidx.appcompat.widget.s.d, androidx.appcompat.widget.s.f
        void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.s.f
        boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(@NonNull TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.k = new e();
        } else if (i >= 23) {
            this.k = new d();
        } else {
            this.k = new f();
        }
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.a = 0;
        this.d = -1.0f;
        this.e = -1.0f;
        this.c = -1.0f;
        this.f = new int[0];
        this.b = false;
    }

    private int e(RectF rectF) {
        int length = this.f.length;
        if (length != 0) {
            int i = 1;
            int i2 = length - 1;
            int i3 = 0;
            while (i <= i2) {
                int i4 = (i + i2) / 2;
                if (x(this.f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i;
                    i = i5;
                } else {
                    i3 = i4 - 1;
                    i2 = i3;
                }
            }
            return this.f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private static Method k(@NonNull String str) {
        try {
            Method method = m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                m.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    static <T> T m(@NonNull Object obj, @NonNull String str, @NonNull T t) {
        try {
            return (T) k(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    private void s(float f2) {
        if (f2 != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(f2);
            boolean a2 = b.a(this.i);
            if (this.i.getLayout() != null) {
                this.b = false;
                try {
                    Method k = k("nullLayouts");
                    if (k != null) {
                        k.invoke(this.i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!a2) {
                    this.i.requestLayout();
                } else {
                    this.i.forceLayout();
                }
                this.i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.a == 1) {
            if (!this.g || this.f.length == 0) {
                int floor = ((int) Math.floor((this.e - this.d) / this.c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.d + (i * this.c));
                }
                this.f = b(iArr);
            }
            this.b = true;
        } else {
            this.b = false;
        }
        return this.b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f = b(iArr);
            w();
        }
    }

    private boolean w() {
        boolean z;
        int[] iArr = this.f;
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        if (z) {
            this.a = 1;
            this.d = iArr[0];
            this.e = iArr[length - 1];
            this.c = -1.0f;
        }
        return z;
    }

    private boolean x(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.i.getText();
        TransformationMethod transformationMethod = this.i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.i)) != null) {
            text = transformation;
        }
        int b2 = a.b(this.i);
        l(i);
        StaticLayout d2 = d(text, (Layout.Alignment) m(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b2);
        if ((b2 != -1 && (d2.getLineCount() > b2 || d2.getLineEnd(d2.getLineCount() - 1) != text.length())) || d2.getHeight() > rectF.bottom) {
            return false;
        }
        return true;
    }

    private boolean y() {
        return !(this.i instanceof AppCompatEditText);
    }

    private void z(float f2, float f3, float f4) throws IllegalArgumentException {
        if (f2 > 0.0f) {
            if (f3 > f2) {
                if (f4 > 0.0f) {
                    this.a = 1;
                    this.d = f2;
                    this.e = f3;
                    this.c = f4;
                    this.g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        int measuredWidth;
        if (!n()) {
            return;
        }
        if (this.b) {
            if (this.i.getMeasuredHeight() > 0 && this.i.getMeasuredWidth() > 0) {
                if (this.k.b(this.i)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                }
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = l;
                    synchronized (rectF) {
                        try {
                            rectF.setEmpty();
                            rectF.right = measuredWidth;
                            rectF.bottom = height;
                            float e2 = e(rectF);
                            if (e2 != this.i.getTextSize()) {
                                t(0, e2);
                            }
                        } finally {
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.b = true;
    }

    @NonNull
    StaticLayout d(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.a(charSequence, alignment, i, i2, this.i, this.h, this.k);
        }
        return a.a(charSequence, alignment, i, this.i, this.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return Math.round(this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return Math.round(this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return Math.round(this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] i() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.a;
    }

    void l(int i) {
        TextPaint textPaint = this.h;
        if (textPaint == null) {
            this.h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.h.set(this.i.getPaint());
        this.h.setTextSize(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        if (y() && this.a != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(AttributeSet attributeSet, int i) {
        float f2;
        float f3;
        float f4;
        int resourceId;
        Context context = this.j;
        int[] iArr = n29.i0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.i;
        syb.s0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = n29.n0;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.a = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = n29.m0;
        if (obtainStyledAttributes.hasValue(i3)) {
            f2 = obtainStyledAttributes.getDimension(i3, -1.0f);
        } else {
            f2 = -1.0f;
        }
        int i4 = n29.k0;
        if (obtainStyledAttributes.hasValue(i4)) {
            f3 = obtainStyledAttributes.getDimension(i4, -1.0f);
        } else {
            f3 = -1.0f;
        }
        int i5 = n29.j0;
        if (obtainStyledAttributes.hasValue(i5)) {
            f4 = obtainStyledAttributes.getDimension(i5, -1.0f);
        } else {
            f4 = -1.0f;
        }
        int i6 = n29.l0;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (y()) {
            if (this.a == 1) {
                if (!this.g) {
                    DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    if (f3 == -1.0f) {
                        f3 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (f4 == -1.0f) {
                        f4 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (f2 == -1.0f) {
                        f2 = 1.0f;
                    }
                    z(f3, f4, f2);
                }
                u();
                return;
            }
            return;
        }
        this.a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (y()) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f = b(iArr2);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(int i) {
        if (y()) {
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (u()) {
                        a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i, float f2) {
        Resources resources;
        Context context = this.j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        s(TypedValue.applyDimension(i, f2, resources.getDisplayMetrics()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static class f {
        f() {
        }

        boolean b(TextView textView) {
            return ((Boolean) s.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }

        void a(StaticLayout.Builder builder, TextView textView) {
        }
    }
}
