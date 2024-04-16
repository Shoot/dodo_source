package defpackage;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
/* compiled from: PropertyValuesHolderUtils.java */
/* renamed from: fr8  reason: default package */
/* loaded from: classes.dex */
class fr8 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static PropertyValuesHolder a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
    }
}
