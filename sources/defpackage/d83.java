package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import java.util.WeakHashMap;
/* compiled from: DrawableAlphaProperty.java */
/* renamed from: d83  reason: default package */
/* loaded from: classes2.dex */
public class d83 extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> b = new d83();
    private final WeakHashMap<Drawable, Integer> a;

    private d83() {
        super(Integer.class, "drawableAlphaCompat");
        this.a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Integer get(@NonNull Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(@NonNull Drawable drawable, @NonNull Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
