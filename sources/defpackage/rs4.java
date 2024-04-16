package defpackage;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
/* compiled from: IRegisterReceiver.java */
/* renamed from: rs4  reason: default package */
/* loaded from: classes3.dex */
public interface rs4 {
    Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter);

    void b(BroadcastReceiver broadcastReceiver);

    void destroy();
}
