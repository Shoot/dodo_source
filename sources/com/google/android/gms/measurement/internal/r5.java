package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class r5 extends Thread {
    private final Object a;
    private final BlockingQueue<s5<?>> b;
    private boolean c = false;
    private final /* synthetic */ o5 d;

    public r5(o5 o5Var, String str, BlockingQueue<s5<?>> blockingQueue) {
        this.d = o5Var;
        gh8.j(str);
        gh8.j(blockingQueue);
        this.a = new Object();
        this.b = blockingQueue;
        setName(str);
    }

    private final void b(InterruptedException interruptedException) {
        m4 K = this.d.n().K();
        String name = getName();
        K.b(name + " was interrupted", interruptedException);
    }

    private final void c() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        r5 r5Var;
        r5 r5Var2;
        obj = this.d.i;
        synchronized (obj) {
            try {
                if (!this.c) {
                    semaphore = this.d.j;
                    semaphore.release();
                    obj2 = this.d.i;
                    obj2.notifyAll();
                    r5Var = this.d.c;
                    if (this != r5Var) {
                        r5Var2 = this.d.d;
                        if (this == r5Var2) {
                            this.d.d = null;
                        } else {
                            this.d.n().F().a("Current scheduler thread is neither worker nor network");
                        }
                    } else {
                        this.d.c = null;
                    }
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        synchronized (this.a) {
            this.a.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i;
        Object obj;
        boolean z;
        Semaphore semaphore;
        boolean z2 = false;
        while (!z2) {
            try {
                semaphore = this.d.j;
                semaphore.acquire();
                z2 = true;
            } catch (InterruptedException e) {
                b(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                s5<?> poll = this.b.poll();
                if (poll != null) {
                    if (poll.b) {
                        i = threadPriority;
                    } else {
                        i = 10;
                    }
                    Process.setThreadPriority(i);
                    poll.run();
                } else {
                    synchronized (this.a) {
                        if (this.b.peek() == null) {
                            z = this.d.k;
                            if (!z) {
                                try {
                                    this.a.wait(30000L);
                                } catch (InterruptedException e2) {
                                    b(e2);
                                }
                            }
                        }
                    }
                    obj = this.d.i;
                    synchronized (obj) {
                        if (this.b.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }
}
