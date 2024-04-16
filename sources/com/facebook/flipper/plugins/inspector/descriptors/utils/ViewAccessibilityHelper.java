package com.facebook.flipper.plugins.inspector.descriptors.utils;

import android.view.View;
/* loaded from: classes2.dex */
public final class ViewAccessibilityHelper {
    public static d4 createNodeInfoFromView(View view) {
        if (view == null) {
            return null;
        }
        d4 Z = d4.Z();
        try {
            syb.h0(view, Z);
            return Z;
        } catch (NullPointerException unused) {
            if (Z != null) {
                Z.d0();
            }
            return null;
        }
    }
}
