package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
/* compiled from: ObjectAnimatorUtils.java */
/* renamed from: l47  reason: default package */
/* loaded from: classes.dex */
class l47 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> ObjectAnimator a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }
}
