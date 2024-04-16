package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.b0;
import com.google.android.gms.measurement.internal.u5;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: f9d  reason: default package */
/* loaded from: classes2.dex */
public final class f9d extends BroadcastReceiver {
    private final u5 a;

    public f9d(u5 u5Var) {
        this.a = u5Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.a.n().K().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.a.n().K().a("App receiver called with null action");
        } else if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.a.n().K().a("App receiver called with unknown action");
        } else {
            final u5 u5Var = this.a;
            if (g8d.a() && u5Var.y().E(null, b0.I0)) {
                u5Var.n().J().a("App receiver notified triggers are available");
                u5Var.k().C(new Runnable() { // from class: com.google.android.gms.measurement.internal.mb
                    @Override // java.lang.Runnable
                    public final void run() {
                        u5 u5Var2 = u5.this;
                        if (!u5Var2.K().U0()) {
                            u5Var2.n().K().a("registerTrigger called but app not eligible");
                            return;
                        }
                        final z6 G = u5Var2.G();
                        Objects.requireNonNull(G);
                        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.kb
                            @Override // java.lang.Runnable
                            public final void run() {
                                z6.this.p0();
                            }
                        }).start();
                    }
                });
            }
        }
    }
}
