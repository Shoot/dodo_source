package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SyncTask.java */
/* loaded from: classes2.dex */
public class b0 implements Runnable {
    private final long a;
    private final PowerManager.WakeLock b;
    private final FirebaseMessaging c;
    @SuppressLint({"ThreadPoolCreation"})
    ExecutorService d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new rs6("firebase-iid-executor"));

    /* compiled from: SyncTask.java */
    /* loaded from: classes2.dex */
    static class a extends BroadcastReceiver {
        private b0 a;

        public a(b0 b0Var) {
            this.a = b0Var;
        }

        public void a() {
            if (b0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            b0 b0Var = this.a;
            if (b0Var == null || !b0Var.d()) {
                return;
            }
            if (b0.c()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.a.c.j(this.a, 0L);
            this.a.b().unregisterReceiver(this);
            this.a = null;
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public b0(FirebaseMessaging firebaseMessaging, long j) {
        this.c = firebaseMessaging;
        this.a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    Context b() {
        return this.c.k();
    }

    boolean d() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    boolean e() throws IOException {
        try {
            if (this.c.i() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            } else {
                return true;
            }
        } catch (IOException e) {
            if (n.g(e.getMessage())) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (x.b().e(b())) {
            this.b.acquire();
        }
        try {
            try {
                this.c.A(true);
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                this.c.A(false);
                if (!x.b().e(b())) {
                    return;
                }
            }
            if (!this.c.t()) {
                this.c.A(false);
                if (x.b().e(b())) {
                    this.b.release();
                }
            } else if (x.b().d(b()) && !d()) {
                new a(this).a();
                if (x.b().e(b())) {
                    this.b.release();
                }
            } else {
                if (e()) {
                    this.c.A(false);
                } else {
                    this.c.D(this.a);
                }
                if (!x.b().e(b())) {
                    return;
                }
                this.b.release();
            }
        } catch (Throwable th) {
            if (x.b().e(b())) {
                this.b.release();
            }
            throw th;
        }
    }
}
