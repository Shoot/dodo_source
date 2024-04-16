package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: ptc  reason: default package */
/* loaded from: classes2.dex */
public final class ptc {
    private static final int a;
    public static final int b;

    static {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        if (i2 >= 23) {
            i = 67108864;
        } else {
            i = 0;
        }
        a = i;
        if (i2 >= 31) {
            i3 = 33554432;
        }
        b = i3;
    }

    public static PendingIntent a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, 0, intent, i2);
    }
}
