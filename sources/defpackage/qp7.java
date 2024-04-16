package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.NonNull;
import com.inappstory.sdk.stories.api.models.Image;
/* compiled from: PaintCompat.java */
/* renamed from: qp7  reason: default package */
/* loaded from: classes.dex */
public final class qp7 {
    private static final ThreadLocal<wp7<Rect, Rect>> a = new ThreadLocal<>();

    /* compiled from: PaintCompat.java */
    /* renamed from: qp7$a */
    /* loaded from: classes.dex */
    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean a(@NonNull Paint paint, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.a(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("\udfffd");
        float measureText2 = paint.measureText(Image.TYPE_MEDIUM);
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        wp7<Rect, Rect> b = b();
        paint.getTextBounds("\udfffd", 0, 2, b.a);
        paint.getTextBounds(str, 0, length, b.b);
        return !b.a.equals(b.b);
    }

    private static wp7<Rect, Rect> b() {
        ThreadLocal<wp7<Rect, Rect>> threadLocal = a;
        wp7<Rect, Rect> wp7Var = threadLocal.get();
        if (wp7Var == null) {
            wp7<Rect, Rect> wp7Var2 = new wp7<>(new Rect(), new Rect());
            threadLocal.set(wp7Var2);
            return wp7Var2;
        }
        wp7Var.a.setEmpty();
        wp7Var.b.setEmpty();
        return wp7Var;
    }
}
