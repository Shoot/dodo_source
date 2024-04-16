package defpackage;

import android.os.Build;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: dvc  reason: default package */
/* loaded from: classes2.dex */
public final class dvc {
    public static final int a;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 67108864;
        } else {
            i = 0;
        }
        a = i;
    }
}
