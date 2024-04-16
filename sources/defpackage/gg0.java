package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
/* compiled from: BroadcastReceiverConstraintTracker.java */
/* renamed from: gg0  reason: default package */
/* loaded from: classes.dex */
public abstract class gg0<T> extends kr1<T> {
    private static final String h = nx5.f("BrdcstRcvrCnstrntTrckr");
    private final BroadcastReceiver g;

    /* compiled from: BroadcastReceiverConstraintTracker.java */
    /* renamed from: gg0$a */
    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                gg0.this.h(context, intent);
            }
        }
    }

    public gg0(@NonNull Context context, @NonNull d7b d7bVar) {
        super(context, d7bVar);
        this.g = new a();
    }

    @Override // defpackage.kr1
    public void e() {
        nx5.c().a(h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.b.registerReceiver(this.g, g());
    }

    @Override // defpackage.kr1
    public void f() {
        nx5.c().a(h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.b.unregisterReceiver(this.g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, @NonNull Intent intent);
}
