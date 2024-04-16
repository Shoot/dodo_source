package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ch.qos.logback.core.joran.action.Action;
/* compiled from: MapTileFileStorageProviderBase.java */
/* renamed from: i76  reason: default package */
/* loaded from: classes3.dex */
public abstract class i76 extends m76 {
    private final rs4 e;
    private b f;

    /* compiled from: MapTileFileStorageProviderBase.java */
    /* renamed from: i76$b */
    /* loaded from: classes3.dex */
    private class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.MEDIA_MOUNTED".equals(action)) {
                i76.this.n();
            } else if ("android.intent.action.MEDIA_UNMOUNTED".equals(action)) {
                i76.this.o();
            }
        }
    }

    public i76(rs4 rs4Var, int i, int i2) {
        super(i, i2);
        this.e = rs4Var;
        this.f = new b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme(Action.FILE_ATTRIBUTE);
        rs4Var.a(this.f, intentFilter);
    }

    @Override // defpackage.m76
    public void c() {
        b bVar = this.f;
        if (bVar != null) {
            this.e.b(bVar);
            this.f = null;
        }
        super.c();
    }

    protected void n() {
    }

    protected void o() {
    }
}
