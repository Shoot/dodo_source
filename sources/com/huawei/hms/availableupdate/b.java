package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: AppSpoofResolveMgr.java */
/* loaded from: classes3.dex */
public class b {
    public static final b c = new b();
    public static final Object d = new Object();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public List<Activity> b = new ArrayList(1);

    public AtomicBoolean a() {
        return this.a;
    }

    public void b(Activity activity) {
        synchronized (d) {
            this.b.remove(activity);
        }
    }

    public void a(Activity activity) {
        synchronized (d) {
            try {
                for (Activity activity2 : this.b) {
                    if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                        activity2.finish();
                    }
                }
                this.b.add(activity);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(boolean z) {
        this.a.set(z);
    }
}
