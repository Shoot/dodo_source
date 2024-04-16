package com.huawei.hms.api;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BindingFailedResolveMgr.java */
/* loaded from: classes3.dex */
class a {
    static final a b = new a();
    private static final Object c = new Object();
    List<Activity> a = new ArrayList(1);

    a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Activity activity) {
        synchronized (c) {
            try {
                for (Activity activity2 : this.a) {
                    if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                        activity2.finish();
                    }
                }
                this.a.add(activity);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Activity activity) {
        synchronized (c) {
            this.a.remove(activity);
        }
    }
}
