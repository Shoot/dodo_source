package defpackage;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
/* compiled from: ChildrenAlphaProperty.java */
/* renamed from: b71  reason: default package */
/* loaded from: classes2.dex */
public class b71 extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> a = new b71("childrenAlpha");

    private b71(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    @NonNull
    /* renamed from: a */
    public Float get(@NonNull ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(ky8.mtrl_internal_children_alpha_tag);
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(@NonNull ViewGroup viewGroup, @NonNull Float f) {
        float floatValue = f.floatValue();
        viewGroup.setTag(ky8.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
