package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
/* compiled from: BatteryNotLowTracker.java */
/* renamed from: aa0  reason: default package */
/* loaded from: classes.dex */
public class aa0 extends gg0<Boolean> {
    private static final String i = nx5.f("BatteryNotLowTracker");

    public aa0(@NonNull Context context, @NonNull d7b d7bVar) {
        super(context, d7bVar);
    }

    @Override // defpackage.gg0
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // defpackage.gg0
    public void h(Context context, @NonNull Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        nx5.c().a(i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (!action.equals("android.intent.action.BATTERY_OKAY")) {
            if (action.equals("android.intent.action.BATTERY_LOW")) {
                d(Boolean.FALSE);
                return;
            }
            return;
        }
        d(Boolean.TRUE);
    }

    @Override // defpackage.kr1
    /* renamed from: i */
    public Boolean b() {
        Intent registerReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            nx5.c().b(i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        return Boolean.valueOf((registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f) ? true : true);
    }
}
