package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: GarbageCollector.java */
/* renamed from: rc4  reason: default package */
/* loaded from: classes3.dex */
public class rc4 {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final Runnable b;

    /* compiled from: GarbageCollector.java */
    /* renamed from: rc4$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                rc4.this.b.run();
            } finally {
                rc4.this.a.set(false);
            }
        }
    }

    public rc4(Runnable runnable) {
        this.b = runnable;
    }

    public boolean c() {
        if (this.a.getAndSet(true)) {
            return false;
        }
        Thread thread = new Thread(new a());
        thread.setName("GarbageCollector");
        thread.setPriority(1);
        thread.start();
        return true;
    }

    public boolean d() {
        return this.a.get();
    }
}
