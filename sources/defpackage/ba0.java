package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* compiled from: BatteryState.java */
/* renamed from: ba0  reason: default package */
/* loaded from: classes2.dex */
class ba0 {
    private final Float a;
    private final boolean b;

    private ba0(Float f, boolean z) {
        this.b = z;
        this.a = f;
    }

    public static ba0 a(Context context) {
        boolean z = false;
        Float f = null;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = e(registerReceiver);
                f = d(registerReceiver);
            }
        } catch (IllegalStateException e) {
            rx5.f().e("An error occurred getting battery state.", e);
        }
        return new ba0(f, z);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra != -1 && intExtra2 != -1) {
            return Float.valueOf(intExtra / intExtra2);
        }
        return null;
    }

    private static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        if (intExtra != 2 && intExtra != 5) {
            return false;
        }
        return true;
    }

    public Float b() {
        return this.a;
    }

    public int c() {
        Float f;
        if (this.b && (f = this.a) != null) {
            if (f.floatValue() < 0.99d) {
                return 2;
            }
            return 3;
        }
        return 1;
    }
}
