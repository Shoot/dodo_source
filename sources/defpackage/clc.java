package defpackage;

import android.os.Build;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: clc  reason: default package */
/* loaded from: classes2.dex */
public final class clc {
    public static final int a;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 33554432;
        } else {
            i = 0;
        }
        a = i;
    }
}
