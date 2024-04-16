package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.d;
import com.google.firebase.messaging.k0;
import java.util.concurrent.ExecutorService;
/* compiled from: EnhancedIntentService.java */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes2.dex */
public abstract class d extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = f.d();
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* compiled from: EnhancedIntentService.java */
    /* loaded from: classes2.dex */
    class a implements k0.a {
        a() {
        }

        @Override // com.google.firebase.messaging.k0.a
        public y6b<Void> a(Intent intent) {
            return d.this.processIntent(intent);
        }
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            i0.c(intent);
        }
        synchronized (this.lock) {
            try {
                int i = this.runningTasks - 1;
                this.runningTasks = i;
                if (i == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartCommand$1(Intent intent, y6b y6bVar) {
        finishTask(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processIntent$0(Intent intent, a7b a7bVar) {
        try {
            handleIntent(intent);
        } finally {
            a7bVar.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public y6b<Void> processIntent(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return o7b.e(null);
        }
        final a7b a7bVar = new a7b();
        this.executor.execute(new Runnable() { // from class: ai3
            @Override // java.lang.Runnable
            public final void run() {
                d.this.lambda$processIntent$0(intent, a7bVar);
            }
        });
        return a7bVar.a();
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new k0(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        y6b<Void> processIntent = processIntent(startCommandIntent);
        if (processIntent.p()) {
            finishTask(intent);
            return 2;
        }
        processIntent.d(new hc6(), new n77() { // from class: bi3
            @Override // defpackage.n77
            public final void a(y6b y6bVar) {
                d.this.lambda$onStartCommand$1(intent, y6bVar);
            }
        });
        return 3;
    }

    boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }

    protected Intent getStartCommandIntent(Intent intent) {
        return intent;
    }
}
