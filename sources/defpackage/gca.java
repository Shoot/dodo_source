package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SequentialExecutor.java */
/* renamed from: gca  reason: default package */
/* loaded from: classes2.dex */
public final class gca implements Executor {
    private static final Logger f = Logger.getLogger(gca.class.getName());
    private final Executor a;
    private final Deque<Runnable> b = new ArrayDeque();
    private c c = c.IDLE;
    private long d = 0;
    private final b e = new b(this, null);

    /* compiled from: SequentialExecutor.java */
    /* renamed from: gca$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {
        final /* synthetic */ Runnable a;

        a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.run();
        }

        public String toString() {
            return this.a.toString();
        }
    }

    /* compiled from: SequentialExecutor.java */
    /* renamed from: gca$b */
    /* loaded from: classes2.dex */
    private final class b implements Runnable {
        Runnable a;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
            if (r1 == false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
            r8.a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
            r4 = defpackage.gca.f;
            r5 = java.util.logging.Level.SEVERE;
            r4.log(r5, "Exception while executing runnable " + r8.a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = 0
            L2:
                gca r2 = defpackage.gca.this     // Catch: java.lang.Throwable -> L5e
                java.util.Deque r2 = defpackage.gca.a(r2)     // Catch: java.lang.Throwable -> L5e
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L5e
                if (r0 != 0) goto L2d
                gca r0 = defpackage.gca.this     // Catch: java.lang.Throwable -> L20
                gca$c r0 = defpackage.gca.b(r0)     // Catch: java.lang.Throwable -> L20
                gca$c r3 = defpackage.gca.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                r0 = move-exception
                goto L83
            L22:
                gca r0 = defpackage.gca.this     // Catch: java.lang.Throwable -> L20
                defpackage.gca.d(r0)     // Catch: java.lang.Throwable -> L20
                gca r0 = defpackage.gca.this     // Catch: java.lang.Throwable -> L20
                defpackage.gca.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                gca r3 = defpackage.gca.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = defpackage.gca.a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.a = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L4f
                gca r0 = defpackage.gca.this     // Catch: java.lang.Throwable -> L20
                gca$c r3 = defpackage.gca.c.IDLE     // Catch: java.lang.Throwable -> L20
                defpackage.gca.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L4e
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4e:
                return
            L4f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5e
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.a     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
                r3.run()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            L5b:
                r8.a = r2     // Catch: java.lang.Throwable -> L5e
                goto L2
            L5e:
                r0 = move-exception
                goto L85
            L60:
                r0 = move-exception
                goto L80
            L62:
                r3 = move-exception
                java.util.logging.Logger r4 = defpackage.gca.e()     // Catch: java.lang.Throwable -> L60
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L60
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
                r6.<init>()     // Catch: java.lang.Throwable -> L60
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.Runnable r7 = r8.a     // Catch: java.lang.Throwable -> L60
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L60
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L60
                goto L5b
            L80:
                r8.a = r2     // Catch: java.lang.Throwable -> L5e
                throw r0     // Catch: java.lang.Throwable -> L5e
            L83:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L5e
            L85:
                if (r1 == 0) goto L8e
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8e:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gca.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e) {
                synchronized (gca.this.b) {
                    gca.this.c = c.IDLE;
                    throw e;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + gca.this.c + "}";
        }

        /* synthetic */ b(gca gcaVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SequentialExecutor.java */
    /* renamed from: gca$c */
    /* loaded from: classes2.dex */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public gca(Executor executor) {
        this.a = (Executor) gh8.j(executor);
    }

    static /* synthetic */ long d(gca gcaVar) {
        long j = gcaVar.d;
        gcaVar.d = 1 + j;
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            defpackage.gh8.j(r8)
            java.util.Deque<java.lang.Runnable> r0 = r7.b
            monitor-enter(r0)
            gca$c r1 = r7.c     // Catch: java.lang.Throwable -> L6d
            gca$c r2 = defpackage.gca.c.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            gca$c r2 = defpackage.gca.c.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.d     // Catch: java.lang.Throwable -> L6d
            gca$a r1 = new gca$a     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L6d
            java.util.Deque<java.lang.Runnable> r8 = r7.b     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            gca$c r8 = defpackage.gca.c.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.c = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.a     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            gca$b r5 = r7.e     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            gca$c r0 = r7.c
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque<java.lang.Runnable> r0 = r7.b
            monitor-enter(r0)
            long r5 = r7.d     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            gca$c r1 = r7.c     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.c = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            goto L47
        L46:
            r8 = move-exception
        L47:
            java.util.Deque<java.lang.Runnable> r2 = r7.b
            monitor-enter(r2)
            gca$c r0 = r7.c     // Catch: java.lang.Throwable -> L55
            gca$c r3 = defpackage.gca.c.IDLE     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            gca$c r3 = defpackage.gca.c.QUEUING     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.Deque<java.lang.Runnable> r0 = r7.b     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r8
        L6d:
            r8 = move-exception
            goto L76
        L6f:
            java.util.Deque<java.lang.Runnable> r1 = r7.b     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gca.execute(java.lang.Runnable):void");
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.a + "}";
    }
}
