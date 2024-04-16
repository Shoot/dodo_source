package com.huawei.hms.framework.network.grs.g;

import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
/* loaded from: classes3.dex */
public class h {
    private final ExecutorService a = ExecutorsUtils.newCachedThreadPool("GRS_RequestController-Task");
    private final Map<String, com.huawei.hms.framework.network.grs.g.k.b> b = new ConcurrentHashMap(16);
    private final Object c = new Object();
    private com.huawei.hms.framework.network.grs.e.a d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Callable<d> {
        final /* synthetic */ com.huawei.hms.framework.network.grs.g.k.c a;
        final /* synthetic */ String b;
        final /* synthetic */ com.huawei.hms.framework.network.grs.e.c c;

        a(com.huawei.hms.framework.network.grs.g.k.c cVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2) {
            this.a = cVar;
            this.b = str;
            this.c = cVar2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public d call() {
            return new c(this.a, h.this.d).a(h.this.a, this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        final /* synthetic */ com.huawei.hms.framework.network.grs.g.k.c a;
        final /* synthetic */ String b;
        final /* synthetic */ com.huawei.hms.framework.network.grs.e.c c;
        final /* synthetic */ com.huawei.hms.framework.network.grs.b d;

        b(com.huawei.hms.framework.network.grs.g.k.c cVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2, com.huawei.hms.framework.network.grs.b bVar) {
            this.a = cVar;
            this.b = str;
            this.c = cVar2;
            this.d = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.a(hVar.a(this.a, this.b, this.c), this.d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        if (r2.a() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.hms.framework.network.grs.g.d a(com.huawei.hms.framework.network.grs.g.k.c r7, java.lang.String r8, com.huawei.hms.framework.network.grs.e.c r9) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "request to server with service name is: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RequestController"
            com.huawei.hms.framework.common.Logger.d(r1, r0)
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r7.b()
            android.content.Context r1 = r7.a()
            r2 = 1
            java.lang.String r0 = r0.getGrsParasKey(r2, r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "request spUrlKey: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "RequestController"
            com.huawei.hms.framework.common.Logger.v(r2, r1)
            java.lang.Object r1 = r6.c
            monitor-enter(r1)
            android.content.Context r2 = r7.a()     // Catch: java.lang.Throwable -> L49
            boolean r2 = com.huawei.hms.framework.common.NetworkUtil.isNetworkAvailable(r2)     // Catch: java.lang.Throwable -> L49
            r3 = 0
            if (r2 != 0) goto L4b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            return r3
        L49:
            r7 = move-exception
            goto Lad
        L4b:
            com.huawei.hms.framework.network.grs.h.d$a r2 = com.huawei.hms.framework.network.grs.h.d.a(r0)     // Catch: java.lang.Throwable -> L49
            java.util.Map<java.lang.String, com.huawei.hms.framework.network.grs.g.k.b> r4 = r6.b     // Catch: java.lang.Throwable -> L49
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L49
            com.huawei.hms.framework.network.grs.g.k.b r4 = (com.huawei.hms.framework.network.grs.g.k.b) r4     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto L65
            boolean r5 = r4.b()     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L60
            goto L65
        L60:
            java.util.concurrent.Future r7 = r4.a()     // Catch: java.lang.Throwable -> L49
            goto L8c
        L65:
            if (r2 == 0) goto L70
            boolean r2 = r2.a()     // Catch: java.lang.Throwable -> L49
            if (r2 != 0) goto L6e
            goto L70
        L6e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            return r3
        L70:
            java.lang.String r2 = "RequestController"
            java.lang.String r4 = "hitGrsRequestBean == null or request block is released."
            com.huawei.hms.framework.common.Logger.d(r2, r4)     // Catch: java.lang.Throwable -> L49
            java.util.concurrent.ExecutorService r2 = r6.a     // Catch: java.lang.Throwable -> L49
            com.huawei.hms.framework.network.grs.g.h$a r4 = new com.huawei.hms.framework.network.grs.g.h$a     // Catch: java.lang.Throwable -> L49
            r4.<init>(r7, r8, r9)     // Catch: java.lang.Throwable -> L49
            java.util.concurrent.Future r7 = r2.submit(r4)     // Catch: java.lang.Throwable -> L49
            java.util.Map<java.lang.String, com.huawei.hms.framework.network.grs.g.k.b> r8 = r6.b     // Catch: java.lang.Throwable -> L49
            com.huawei.hms.framework.network.grs.g.k.b r9 = new com.huawei.hms.framework.network.grs.g.k.b     // Catch: java.lang.Throwable -> L49
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L49
            r8.put(r0, r9)     // Catch: java.lang.Throwable -> L49
        L8c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            java.lang.Object r7 = r7.get()     // Catch: java.lang.InterruptedException -> L94 java.util.concurrent.ExecutionException -> L96 java.util.concurrent.CancellationException -> L98
            com.huawei.hms.framework.network.grs.g.d r7 = (com.huawei.hms.framework.network.grs.g.d) r7     // Catch: java.lang.InterruptedException -> L94 java.util.concurrent.ExecutionException -> L96 java.util.concurrent.CancellationException -> L98
            return r7
        L94:
            r7 = move-exception
            goto L9a
        L96:
            r7 = move-exception
            goto La2
        L98:
            r7 = move-exception
            goto La7
        L9a:
            java.lang.String r8 = "RequestController"
            java.lang.String r9 = "when check result, find InterruptedException, check others"
        L9e:
            com.huawei.hms.framework.common.Logger.w(r8, r9, r7)
            goto Lac
        La2:
            java.lang.String r8 = "RequestController"
            java.lang.String r9 = "when check result, find ExecutionException, check others"
            goto L9e
        La7:
            java.lang.String r8 = "RequestController"
            java.lang.String r9 = "when check result, find CancellationException, check others"
            goto L9e
        Lac:
            return r3
        Lad:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.h.a(com.huawei.hms.framework.network.grs.g.k.c, java.lang.String, com.huawei.hms.framework.network.grs.e.c):com.huawei.hms.framework.network.grs.g.d");
    }

    public void a(com.huawei.hms.framework.network.grs.e.a aVar) {
        this.d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar, com.huawei.hms.framework.network.grs.b bVar) {
        if (bVar != null) {
            if (dVar == null) {
                Logger.v("RequestController", "GrsResponse is null");
                bVar.a();
                return;
            }
            Logger.v("RequestController", "GrsResponse is not null");
            bVar.a(dVar);
        }
    }

    public void a(com.huawei.hms.framework.network.grs.g.k.c cVar, com.huawei.hms.framework.network.grs.b bVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2) {
        this.a.execute(new b(cVar, str, cVar2, bVar));
    }

    public void a(String str) {
        synchronized (this.c) {
            this.b.remove(str);
        }
    }
}
