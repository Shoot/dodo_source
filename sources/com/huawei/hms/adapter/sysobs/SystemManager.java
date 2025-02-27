package com.huawei.hms.adapter.sysobs;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class SystemManager {
    public static SystemManager a = new SystemManager();
    public static final Object b = new Object();
    public static SystemNotifier c = new a();

    public static SystemManager getInstance() {
        return a;
    }

    public static SystemNotifier getSystemNotifier() {
        return c;
    }

    public void notifyNoticeResult(int i) {
        c.notifyNoticeObservers(i);
    }

    public void notifyResolutionResult(Intent intent, String str) {
        c.notifyObservers(intent, str);
    }

    public void notifyUpdateResult(int i) {
        c.notifyObservers(i);
    }

    /* loaded from: classes.dex */
    public static class a implements SystemNotifier {
        public final List<SystemObserver> a = new ArrayList();

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyNoticeObservers(int i) {
            synchronized (SystemManager.b) {
                try {
                    Iterator<SystemObserver> it = this.a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onNoticeResult(i)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(Intent intent, String str) {
            synchronized (SystemManager.b) {
                try {
                    Iterator<SystemObserver> it = this.a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onSolutionResult(intent, str)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void registerObserver(SystemObserver systemObserver) {
            if (systemObserver != null && !this.a.contains(systemObserver)) {
                synchronized (SystemManager.b) {
                    this.a.add(systemObserver);
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void unRegisterObserver(SystemObserver systemObserver) {
            synchronized (SystemManager.b) {
                this.a.remove(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(int i) {
            synchronized (SystemManager.b) {
                try {
                    Iterator<SystemObserver> it = this.a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onUpdateResult(i)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
