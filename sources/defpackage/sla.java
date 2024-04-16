package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* compiled from: SimpleRegisterReceiver.java */
/* renamed from: sla  reason: default package */
/* loaded from: classes3.dex */
public class sla implements rs4 {
    private Context a;

    public sla(Context context) {
        this.a = context;
    }

    @Override // defpackage.rs4
    public Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return this.a.registerReceiver(broadcastReceiver, intentFilter);
    }

    @Override // defpackage.rs4
    public void b(BroadcastReceiver broadcastReceiver) {
        this.a.unregisterReceiver(broadcastReceiver);
    }

    @Override // defpackage.rs4
    public void destroy() {
        this.a = null;
    }
}
