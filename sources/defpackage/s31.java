package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
/* compiled from: CheckedTextViewCompat.java */
/* renamed from: s31  reason: default package */
/* loaded from: classes.dex */
public final class s31 {

    /* compiled from: CheckedTextViewCompat.java */
    /* renamed from: s31$a */
    /* loaded from: classes.dex */
    private static class a {
        static Drawable a(@NonNull CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* compiled from: CheckedTextViewCompat.java */
    /* renamed from: s31$b */
    /* loaded from: classes.dex */
    private static class b {
        static void a(@NonNull CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        static void b(@NonNull CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    public static Drawable a(@NonNull CheckedTextView checkedTextView) {
        return a.a(checkedTextView);
    }

    public static void b(@NonNull CheckedTextView checkedTextView, ColorStateList colorStateList) {
        b.a(checkedTextView, colorStateList);
    }

    public static void c(@NonNull CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        b.b(checkedTextView, mode);
    }
}
