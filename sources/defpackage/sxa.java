package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
/* compiled from: StorageNotLowTracker.java */
/* renamed from: sxa  reason: default package */
/* loaded from: classes.dex */
public class sxa extends gg0<Boolean> {
    private static final String i = nx5.f("StorageNotLowTracker");

    public sxa(@NonNull Context context, @NonNull d7b d7bVar) {
        super(context, d7bVar);
    }

    @Override // defpackage.gg0
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
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
        if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                d(Boolean.TRUE);
                return;
            }
            return;
        }
        d(Boolean.FALSE);
    }

    @Override // defpackage.kr1
    /* renamed from: i */
    public Boolean b() {
        Intent registerReceiver = this.b.registerReceiver(null, g());
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            action.hashCode();
            if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    return null;
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
