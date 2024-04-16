package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: ViewBindings.java */
/* renamed from: pyb  reason: default package */
/* loaded from: classes.dex */
public class pyb {
    public static <T extends View> T a(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            T t = (T) viewGroup.getChildAt(i2).findViewById(i);
            if (t != null) {
                return t;
            }
        }
        return null;
    }
}
