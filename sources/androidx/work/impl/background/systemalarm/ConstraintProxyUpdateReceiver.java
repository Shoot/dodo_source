package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    static final String a = nx5.f("ConstrntProxyUpdtRecvr");

    /* loaded from: classes.dex */
    class a implements Runnable {
        final /* synthetic */ Intent a;
        final /* synthetic */ Context b;
        final /* synthetic */ BroadcastReceiver.PendingResult c;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.a = intent;
            this.b = context;
            this.c = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                nx5.c().a(ConstraintProxyUpdateReceiver.a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                so7.a(this.b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                so7.a(this.b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                so7.a(this.b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                so7.a(this.b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.c.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            nx5.c().a(a, String.format("Ignoring unknown action %s", str), new Throwable[0]);
        } else {
            j7c.p(context).u().b(new a(intent, context, goAsync()));
        }
    }
}
