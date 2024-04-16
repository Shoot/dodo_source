package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.NonNull;
/* compiled from: EditorInfoCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: yd3  reason: default package */
/* loaded from: classes.dex */
public final class yd3 {
    private static final String[] a = new String[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EditorInfoCompat.java */
    /* renamed from: yd3$a */
    /* loaded from: classes.dex */
    public static class a {
        static void a(@NonNull EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    @NonNull
    public static String[] a(@NonNull EditorInfo editorInfo) {
        String[] strArr;
        if (Build.VERSION.SDK_INT >= 25) {
            strArr = editorInfo.contentMimeTypes;
            if (strArr == null) {
                return a;
            }
            return strArr;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        if (stringArray == null) {
            return a;
        }
        return stringArray;
    }

    private static boolean b(CharSequence charSequence, int i, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return false;
            }
            return Character.isHighSurrogate(charSequence.charAt(i));
        }
        return Character.isLowSurrogate(charSequence.charAt(i));
    }

    private static boolean c(int i) {
        int i2 = i & 4095;
        if (i2 != 129 && i2 != 225 && i2 != 18) {
            return false;
        }
        return true;
    }

    public static void d(@NonNull EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static void e(@NonNull EditorInfo editorInfo, @NonNull CharSequence charSequence, int i) {
        int i2;
        int i3;
        kh8.f(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(editorInfo, charSequence, i);
            return;
        }
        int i4 = editorInfo.initialSelStart;
        int i5 = editorInfo.initialSelEnd;
        if (i4 > i5) {
            i2 = i5 - i;
        } else {
            i2 = i4 - i;
        }
        if (i4 > i5) {
            i3 = i4 - i;
        } else {
            i3 = i5 - i;
        }
        int length = charSequence.length();
        if (i >= 0 && i2 >= 0 && i3 <= length) {
            if (c(editorInfo.inputType)) {
                g(editorInfo, null, 0, 0);
                return;
            } else if (length <= 2048) {
                g(editorInfo, charSequence, i2, i3);
                return;
            } else {
                h(editorInfo, charSequence, i2, i3);
                return;
            }
        }
        g(editorInfo, null, 0, 0);
    }

    public static void f(@NonNull EditorInfo editorInfo, @NonNull CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(editorInfo, charSequence, 0);
        } else {
            e(editorInfo, charSequence, 0);
        }
    }

    private static void g(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    private static void h(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        int i3;
        CharSequence subSequence;
        int i4 = i2 - i;
        if (i4 > 1024) {
            i3 = 0;
        } else {
            i3 = i4;
        }
        int i5 = 2048 - i3;
        int min = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (i5 * 0.8d)));
        int min2 = Math.min(i, i5 - min);
        int i6 = i - min2;
        if (b(charSequence, i6, 0)) {
            i6++;
            min2--;
        }
        if (b(charSequence, (i2 + min) - 1, 1)) {
            min--;
        }
        int i7 = min2 + i3 + min;
        if (i3 != i4) {
            subSequence = TextUtils.concat(charSequence.subSequence(i6, i6 + min2), charSequence.subSequence(i2, min + i2));
        } else {
            subSequence = charSequence.subSequence(i6, i7 + i6);
        }
        g(editorInfo, subSequence, min2, i3 + min2);
    }
}
