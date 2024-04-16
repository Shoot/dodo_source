package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
/* compiled from: DrawableUtils.java */
/* renamed from: u83  reason: default package */
/* loaded from: classes3.dex */
public abstract class u83 {
    public static void a(@NonNull Drawable drawable) {
        drawable.setBounds(b(drawable));
    }

    @NonNull
    public static Rect b(@NonNull Drawable drawable) {
        return new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }
}
