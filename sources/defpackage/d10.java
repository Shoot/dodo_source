package defpackage;

import android.os.Build;
/* compiled from: AutoSizeableTextView.java */
/* renamed from: d10  reason: default package */
/* loaded from: classes.dex */
public interface d10 {
    public static final boolean C;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 27) {
            z = true;
        } else {
            z = false;
        }
        C = z;
    }
}
