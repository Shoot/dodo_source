package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: RxThreadFactory.java */
/* renamed from: vp9  reason: default package */
/* loaded from: classes3.dex */
public final class vp9 extends AtomicLong implements ThreadFactory {
    final String a;
    final int b;
    final boolean c;

    /* compiled from: RxThreadFactory.java */
    /* renamed from: vp9$a */
    /* loaded from: classes3.dex */
    static final class a extends Thread {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public vp9(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread;
        String str = this.a + CoreConstants.DASH_CHAR + incrementAndGet();
        if (this.c) {
            thread = new a(runnable, str);
        } else {
            thread = new Thread(runnable, str);
        }
        thread.setPriority(this.b);
        thread.setDaemon(true);
        return thread;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.a + "]";
    }

    public vp9(String str, int i) {
        this(str, i, false);
    }

    public vp9(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }
}
