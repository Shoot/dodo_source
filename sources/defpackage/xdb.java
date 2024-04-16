package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ThreadLocalBufferManager.java */
/* renamed from: xdb  reason: default package */
/* loaded from: classes2.dex */
class xdb {
    private final Object a = new Object();
    private final Map<SoftReference<ah0>, Boolean> b = new ConcurrentHashMap();
    private final ReferenceQueue<ah0> c = new ReferenceQueue<>();

    /* compiled from: ThreadLocalBufferManager.java */
    /* renamed from: xdb$a */
    /* loaded from: classes2.dex */
    private static final class a {
        static final xdb a = new xdb();
    }

    xdb() {
    }

    public static xdb a() {
        return a.a;
    }

    private void b() {
        while (true) {
            SoftReference softReference = (SoftReference) this.c.poll();
            if (softReference != null) {
                this.b.remove(softReference);
            } else {
                return;
            }
        }
    }

    public SoftReference<ah0> c(ah0 ah0Var) {
        SoftReference<ah0> softReference = new SoftReference<>(ah0Var, this.c);
        this.b.put(softReference, Boolean.TRUE);
        b();
        return softReference;
    }
}
