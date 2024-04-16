package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: zkc  reason: default package */
/* loaded from: classes2.dex */
public final class zkc extends iu1 {
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent n(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i;
        Intent registerReceiver;
        if (vkc.a()) {
            if (true != vkc.a()) {
                i = 0;
            } else {
                i = 2;
            }
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, i);
            return registerReceiver;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
