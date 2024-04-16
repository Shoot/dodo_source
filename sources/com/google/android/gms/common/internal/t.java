package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
final class t implements ServiceConnection, dad {
    private final Map a = new HashMap();
    private int b = 2;
    private boolean c;
    private IBinder d;
    private final y4d e;
    private ComponentName f;
    final /* synthetic */ v g;

    public t(v vVar, y4d y4dVar) {
        this.g = vVar;
        this.e = y4dVar;
    }

    public final int a() {
        return this.b;
    }

    public final ComponentName b() {
        return this.f;
    }

    public final IBinder c() {
        return this.d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        uq1 uq1Var;
        Context context;
        Context context2;
        uq1 uq1Var2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (ad8.l()) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            v vVar = this.g;
            uq1Var = vVar.j;
            context = vVar.g;
            y4d y4dVar = this.e;
            context2 = vVar.g;
            boolean d = uq1Var.d(context, str, y4dVar.c(context2), this, this.e.a(), executor);
            this.c = d;
            if (d) {
                handler = this.g.h;
                Message obtainMessage = handler.obtainMessage(1, this.e);
                handler2 = this.g.h;
                j = this.g.l;
                handler2.sendMessageDelayed(obtainMessage, j);
            } else {
                this.b = 2;
                try {
                    v vVar2 = this.g;
                    uq1Var2 = vVar2.j;
                    context3 = vVar2.g;
                    uq1Var2.c(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.a.remove(serviceConnection);
    }

    public final void g(String str) {
        Handler handler;
        uq1 uq1Var;
        Context context;
        handler = this.g.h;
        handler.removeMessages(1, this.e);
        v vVar = this.g;
        uq1Var = vVar.j;
        context = vVar.g;
        uq1Var.c(context, this);
        this.c = false;
        this.b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.a.isEmpty();
    }

    public final boolean j() {
        return this.c;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.g.f;
        synchronized (hashMap) {
            try {
                handler = this.g.h;
                handler.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                for (ServiceConnection serviceConnection : this.a.values()) {
                    serviceConnection.onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.g.f;
        synchronized (hashMap) {
            try {
                handler = this.g.h;
                handler.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                for (ServiceConnection serviceConnection : this.a.values()) {
                    serviceConnection.onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
