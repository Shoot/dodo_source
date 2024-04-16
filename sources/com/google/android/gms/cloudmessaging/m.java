package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.1.0 */
/* loaded from: classes2.dex */
public final class m implements ServiceConnection {
    n c;
    final /* synthetic */ r f;
    int a = 0;
    final Messenger b = new Messenger(new dxc(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.k
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i);
            }
            m mVar = m.this;
            synchronized (mVar) {
                try {
                    p pVar = (p) mVar.e.get(i);
                    if (pVar == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                        return true;
                    }
                    mVar.e.remove(i);
                    mVar.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        pVar.c(new zzs(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    pVar.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));
    final Queue d = new ArrayDeque();
    final SparseArray e = new SparseArray();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ m(r rVar, d4d d4dVar) {
        this.f = rVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(int i, String str) {
        b(i, str, null);
    }

    final synchronized void b(int i, String str, Throwable th) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i2 = this.a;
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3) {
                        return;
                    }
                    this.a = 4;
                    return;
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.a = 4;
                uq1.b().c(r.a(this.f), this);
                zzs zzsVar = new zzs(i, str, th);
                for (p pVar : this.d) {
                    pVar.c(zzsVar);
                }
                this.d.clear();
                for (int i3 = 0; i3 < this.e.size(); i3++) {
                    ((p) this.e.valueAt(i3)).c(zzsVar);
                }
                this.e.clear();
                return;
            }
            throw new IllegalStateException();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        r.e(this.f).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.h
            @Override // java.lang.Runnable
            public final void run() {
                final p pVar;
                while (true) {
                    final m mVar = m.this;
                    synchronized (mVar) {
                        try {
                            if (mVar.a != 2) {
                                return;
                            }
                            if (mVar.d.isEmpty()) {
                                mVar.f();
                                return;
                            }
                            pVar = (p) mVar.d.poll();
                            mVar.e.put(pVar.a, pVar);
                            r.e(mVar.f).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.l
                                @Override // java.lang.Runnable
                                public final void run() {
                                    m.this.e(pVar.a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(pVar)));
                    }
                    r rVar = mVar.f;
                    Messenger messenger = mVar.b;
                    int i = pVar.c;
                    Context a = r.a(rVar);
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = pVar.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", pVar.b());
                    bundle.putString("pkg", a.getPackageName());
                    bundle.putBundle("data", pVar.d);
                    obtain.setData(bundle);
                    try {
                        mVar.c.a(obtain);
                    } catch (RemoteException e) {
                        mVar.a(2, e.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.a == 1) {
            a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(int i) {
        p pVar = (p) this.e.get(i);
        if (pVar != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i);
            this.e.remove(i);
            pVar.c(new zzs(3, "Timed out waiting for response", null));
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f() {
        try {
            if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.a = 3;
                uq1.b().c(r.a(this.f), this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean g(p pVar) {
        boolean z;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                this.d.add(pVar);
                c();
                return true;
            }
            this.d.add(pVar);
            return true;
        }
        this.d.add(pVar);
        if (this.a == 0) {
            z = true;
        } else {
            z = false;
        }
        gh8.m(z);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!uq1.b().a(r.a(this.f), intent, this, 1)) {
                a(0, "Unable to bind to service");
            } else {
                r.e(this.f).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.this.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e) {
            b(0, "Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        r.e(this.f).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.g
            @Override // java.lang.Runnable
            public final void run() {
                m mVar = m.this;
                IBinder iBinder2 = iBinder;
                synchronized (mVar) {
                    if (iBinder2 == null) {
                        mVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        mVar.c = new n(iBinder2);
                        mVar.a = 2;
                        mVar.c();
                    } catch (RemoteException e) {
                        mVar.a(0, e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        r.e(this.f).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.j
            @Override // java.lang.Runnable
            public final void run() {
                m.this.a(2, "Service disconnected");
            }
        });
    }
}
