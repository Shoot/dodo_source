package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.work.impl.workers.DiagnosticsWorker;
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a = nx5.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        nx5.c().a(a, "Requesting diagnostics", new Throwable[0]);
        try {
            h7c.i(context).d(aa7.d(DiagnosticsWorker.class));
        } catch (IllegalStateException e) {
            nx5.c().b(a, "WorkManager is not initialized", e);
        }
    }
}
