package defpackage;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
/* compiled from: PathInterpolatorCompat.java */
/* renamed from: tr7  reason: default package */
/* loaded from: classes.dex */
public final class tr7 {

    /* compiled from: PathInterpolatorCompat.java */
    /* renamed from: tr7$a */
    /* loaded from: classes.dex */
    static class a {
        static PathInterpolator a(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        static PathInterpolator b(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        static PathInterpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    @NonNull
    public static Interpolator a(float f, float f2, float f3, float f4) {
        return a.b(f, f2, f3, f4);
    }

    @NonNull
    public static Interpolator b(@NonNull Path path) {
        return a.c(path);
    }
}
