package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public abstract class d {
    private static int a = 4225;
    private static final Object b = new Object();
    private static v c = null;
    static HandlerThread d = null;
    private static boolean e = false;

    public static int a() {
        return a;
    }

    @NonNull
    public static d b(@NonNull Context context) {
        Looper mainLooper;
        synchronized (b) {
            try {
                if (c == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (e) {
                        mainLooper = c().getLooper();
                    } else {
                        mainLooper = context.getMainLooper();
                    }
                    c = new v(applicationContext, mainLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    @NonNull
    public static HandlerThread c() {
        synchronized (b) {
            try {
                HandlerThread handlerThread = d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                d = handlerThread2;
                handlerThread2.start();
                return d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract void d(y4d y4dVar, ServiceConnection serviceConnection, String str);

    public final void e(@NonNull String str, @NonNull String str2, int i, @NonNull ServiceConnection serviceConnection, @NonNull String str3, boolean z) {
        d(new y4d(str, str2, i, z), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean f(y4d y4dVar, ServiceConnection serviceConnection, String str, Executor executor);
}
