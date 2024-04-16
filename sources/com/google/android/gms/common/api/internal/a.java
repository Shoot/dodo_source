package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final a e = new a();
    private final AtomicBoolean a = new AtomicBoolean();
    private final AtomicBoolean b = new AtomicBoolean();
    private final ArrayList c = new ArrayList();
    private boolean d = false;

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* renamed from: com.google.android.gms.common.api.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0219a {
        void a(boolean z);
    }

    private a() {
    }

    @NonNull
    public static a b() {
        return e;
    }

    public static void c(@NonNull Application application) {
        a aVar = e;
        synchronized (aVar) {
            try {
                if (!aVar.d) {
                    application.registerActivityLifecycleCallbacks(aVar);
                    application.registerComponentCallbacks(aVar);
                    aVar.d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(boolean z) {
        synchronized (e) {
            try {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0219a) it.next()).a(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(@NonNull InterfaceC0219a interfaceC0219a) {
        synchronized (e) {
            this.c.add(interfaceC0219a);
        }
    }

    public boolean d() {
        return this.a.get();
    }

    @TargetApi(16)
    public boolean e(boolean z) {
        if (!this.b.get()) {
            if (ad8.b()) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                if (!this.b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                    this.a.set(true);
                }
            } else {
                return z;
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        boolean compareAndSet = this.a.compareAndSet(true, false);
        this.b.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull Activity activity) {
        boolean compareAndSet = this.a.compareAndSet(true, false);
        this.b.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.a.compareAndSet(false, true)) {
            this.b.set(true);
            f(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }
}
