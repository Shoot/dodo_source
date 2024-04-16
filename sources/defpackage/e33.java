package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: DiskCacheWriteLocker.java */
/* renamed from: e33  reason: default package */
/* loaded from: classes.dex */
final class e33 {
    private final Map<String, a> a = new HashMap();
    private final b b = new b();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiskCacheWriteLocker.java */
    /* renamed from: e33$a */
    /* loaded from: classes.dex */
    public static class a {
        final Lock a = new ReentrantLock();
        int b;

        a() {
        }
    }

    /* compiled from: DiskCacheWriteLocker.java */
    /* renamed from: e33$b */
    /* loaded from: classes.dex */
    private static class b {
        private final Queue<a> a = new ArrayDeque();

        b() {
        }

        a a() {
            a poll;
            synchronized (this.a) {
                poll = this.a.poll();
            }
            if (poll == null) {
                return new a();
            }
            return poll;
        }

        void b(a aVar) {
            synchronized (this.a) {
                try {
                    if (this.a.size() < 10) {
                        this.a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = this.a.get(str);
                if (aVar == null) {
                    aVar = this.b.a();
                    this.a.put(str, aVar);
                }
                aVar.b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.a.lock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) eh8.d(this.a.get(str));
                int i = aVar.b;
                if (i >= 1) {
                    int i2 = i - 1;
                    aVar.b = i2;
                    if (i2 == 0) {
                        a remove = this.a.remove(str);
                        if (remove.equals(aVar)) {
                            this.b.b(remove);
                        } else {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                        }
                    }
                } else {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.a.unlock();
    }
}
