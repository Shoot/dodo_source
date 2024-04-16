package defpackage;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.graphics.Path;
import androidx.annotation.NonNull;
/* compiled from: ObjectAnimatorCompatLollipop.java */
@TargetApi(21)
/* renamed from: k47  reason: default package */
/* loaded from: classes.dex */
class k47 {
    @NonNull
    public static ObjectAnimator a(Object obj, @NonNull String str, @NonNull String str2, @NonNull Path path) {
        return ObjectAnimator.ofFloat(obj, str, str2, path);
    }
}
