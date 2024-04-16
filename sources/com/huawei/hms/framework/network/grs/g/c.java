package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import ch.qos.logback.classic.spi.CallerData;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.h.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
/* loaded from: classes3.dex */
public class c {
    private static final String n = "c";
    private final GrsBaseInfo a;
    private final Context b;
    private final com.huawei.hms.framework.network.grs.e.a c;
    private d d;
    private final com.huawei.hms.framework.network.grs.g.k.c j;
    private com.huawei.hms.framework.network.grs.g.k.d k;
    private final Map<String, Future<d>> e = new ConcurrentHashMap(16);
    private final List<d> f = new CopyOnWriteArrayList();
    private final JSONArray g = new JSONArray();
    private final List<String> h = new CopyOnWriteArrayList();
    private final List<String> i = new CopyOnWriteArrayList();
    private String l = "";
    private long m = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Callable<d> {
        final /* synthetic */ ExecutorService a;
        final /* synthetic */ String b;
        final /* synthetic */ com.huawei.hms.framework.network.grs.e.c c;

        a(ExecutorService executorService, String str, com.huawei.hms.framework.network.grs.e.c cVar) {
            this.a = executorService;
            this.b = str;
            this.c = cVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public d call() {
            return c.this.b(this.a, this.b, this.c);
        }
    }

    public c(com.huawei.hms.framework.network.grs.g.k.c cVar, com.huawei.hms.framework.network.grs.e.a aVar) {
        this.j = cVar;
        this.a = cVar.b();
        this.b = cVar.a();
        this.c = aVar;
        c();
        d();
    }

    private d b(d dVar) {
        String str;
        String str2;
        for (Map.Entry<String, Future<d>> entry : this.e.entrySet()) {
            if (dVar != null && (dVar.o() || dVar.m())) {
                break;
            }
            try {
                dVar = entry.getValue().get(40000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e = e;
                str = n;
                str2 = "{checkResponse} when check result, find InterruptedException, check others";
                Logger.w(str, str2, e);
            } catch (CancellationException unused) {
                Logger.i(n, "{checkResponse} when check result, find CancellationException, check others");
            } catch (ExecutionException e2) {
                e = e2;
                str = n;
                str2 = "{checkResponse} when check result, find ExecutionException, check others";
                Logger.w(str, str2, e);
            } catch (TimeoutException unused2) {
                Logger.w(n, "{checkResponse} when check result, find TimeoutException, cancel current request task");
                if (!entry.getValue().isCancelled()) {
                    entry.getValue().cancel(true);
                }
            }
        }
        return dVar;
    }

    private void c() {
        com.huawei.hms.framework.network.grs.g.k.d a2 = com.huawei.hms.framework.network.grs.g.j.a.a(this.b);
        if (a2 == null) {
            Logger.w(n, "g*s***_se****er_conf*** maybe has a big error");
            return;
        }
        a(a2);
        List<String> a3 = a2.a();
        if (a3 != null && a3.size() > 0) {
            if (a3.size() <= 10) {
                String c = a2.c();
                String b = a2.b();
                if (a3.size() > 0) {
                    for (String str : a3) {
                        if (!str.startsWith("https://")) {
                            Logger.w(n, "grs server just support https scheme url,please check.");
                        } else {
                            b(c, str);
                            a(b, str);
                        }
                    }
                }
                Logger.v(n, "request to GRS server url is{%s} and {%s}", this.h, this.i);
                return;
            }
            throw new IllegalArgumentException("grs_base_url's count is larger than MAX value 10");
        }
        Logger.v(n, "maybe grs_base_url config with [],please check.");
    }

    private void d() {
        String grsParasKey = this.a.getGrsParasKey(true, true, this.b);
        com.huawei.hms.framework.network.grs.e.c a2 = this.c.a();
        this.l = a2.a(grsParasKey + "ETag", "");
    }

    private String e() {
        com.huawei.hms.framework.network.grs.local.model.a aVar;
        com.huawei.hms.framework.network.grs.f.b a2 = com.huawei.hms.framework.network.grs.f.b.a(this.b.getPackageName(), this.a);
        if (a2 != null) {
            aVar = a2.a();
        } else {
            aVar = null;
        }
        if (aVar != null) {
            String b = aVar.b();
            Logger.v(n, "get appName from local assets is{%s}", b);
            return b;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d b(ExecutorService executorService, String str, com.huawei.hms.framework.network.grs.e.c cVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        d a2 = a(executorService, this.i, str, cVar);
        int b = a2 == null ? 0 : a2.b();
        String str2 = n;
        Logger.v(str2, "use 2.0 interface return http's code is：{%s}", Integer.valueOf(b));
        if (b == 404 || b == 401) {
            if (TextUtils.isEmpty(e()) && TextUtils.isEmpty(this.a.getAppName())) {
                Logger.i(str2, "request grs server use 1.0 API must set appName,please check.");
                return null;
            }
            this.e.clear();
            Logger.i(str2, "this env has not deploy new interface,so use old interface.");
            a2 = a(executorService, this.h, str, cVar);
        }
        e.a(new ArrayList(this.f), SystemClock.elapsedRealtime() - elapsedRealtime, this.g, this.b);
        this.f.clear();
        return a2;
    }

    public d a(ExecutorService executorService, String str, com.huawei.hms.framework.network.grs.e.c cVar) {
        String str2;
        String str3;
        if (this.h.isEmpty() && this.i.isEmpty()) {
            return null;
        }
        try {
            com.huawei.hms.framework.network.grs.g.k.d b = b();
            return (d) executorService.submit(new a(executorService, str, cVar)).get(b != null ? b.d() : 10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            str2 = n;
            str3 = "{submitExcutorTaskWithTimeout} the current thread was interrupted while waiting";
            Logger.w(str2, str3, e);
            return null;
        } catch (CancellationException unused) {
            Logger.i(n, "{submitExcutorTaskWithTimeout} the computation was cancelled");
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            str2 = n;
            str3 = "{submitExcutorTaskWithTimeout} the computation threw an ExecutionException";
            Logger.w(str2, str3, e);
            return null;
        } catch (TimeoutException unused2) {
            Logger.w(n, "{submitExcutorTaskWithTimeout} the wait timed out");
            return null;
        } catch (Exception e3) {
            e = e3;
            str2 = n;
            str3 = "{submitExcutorTaskWithTimeout} catch Exception";
            Logger.w(str2, str3, e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009b A[LOOP:0: B:3:0x0005->B:36:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.huawei.hms.framework.network.grs.g.d a(java.util.concurrent.ExecutorService r16, java.util.List<java.lang.String> r17, java.lang.String r18, com.huawei.hms.framework.network.grs.e.c r19) {
        /*
            r15 = this;
            r9 = r15
            r0 = 0
            r10 = 0
            r11 = r0
            r12 = 0
        L5:
            int r0 = r17.size()
            if (r12 >= r0) goto L9f
            r13 = r17
            java.lang.Object r0 = r13.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L8e
            com.huawei.hms.framework.network.grs.g.a r14 = new com.huawei.hms.framework.network.grs.g.a
            android.content.Context r5 = r9.b
            com.huawei.hms.framework.network.grs.GrsBaseInfo r7 = r9.a
            r1 = r14
            r2 = r0
            r3 = r12
            r4 = r15
            r6 = r18
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.Callable r1 = r14.g()
            r2 = r16
            java.util.concurrent.Future r1 = r2.submit(r1)
            java.util.Map<java.lang.String, java.util.concurrent.Future<com.huawei.hms.framework.network.grs.g.d>> r3 = r9.e
            r3.put(r0, r1)
            r3 = 1
            long r4 = r9.m     // Catch: java.lang.InterruptedException -> L6a java.util.concurrent.ExecutionException -> L6c java.util.concurrent.TimeoutException -> L6e java.util.concurrent.CancellationException -> L86
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L6a java.util.concurrent.ExecutionException -> L6c java.util.concurrent.TimeoutException -> L6e java.util.concurrent.CancellationException -> L86
            java.lang.Object r0 = r1.get(r4, r0)     // Catch: java.lang.InterruptedException -> L6a java.util.concurrent.ExecutionException -> L6c java.util.concurrent.TimeoutException -> L6e java.util.concurrent.CancellationException -> L86
            r1 = r0
            com.huawei.hms.framework.network.grs.g.d r1 = (com.huawei.hms.framework.network.grs.g.d) r1     // Catch: java.lang.InterruptedException -> L6a java.util.concurrent.ExecutionException -> L6c java.util.concurrent.TimeoutException -> L6e java.util.concurrent.CancellationException -> L86
            if (r1 == 0) goto L67
            boolean r0 = r1.o()     // Catch: java.lang.InterruptedException -> L54 java.util.concurrent.ExecutionException -> L57 java.util.concurrent.TimeoutException -> L63 java.util.concurrent.CancellationException -> L65
            if (r0 != 0) goto L5a
            boolean r0 = r1.m()     // Catch: java.lang.InterruptedException -> L54 java.util.concurrent.ExecutionException -> L57 java.util.concurrent.TimeoutException -> L63 java.util.concurrent.CancellationException -> L65
            if (r0 == 0) goto L67
            goto L5a
        L54:
            r0 = move-exception
            r11 = r1
            goto L76
        L57:
            r0 = move-exception
            r11 = r1
            goto L7e
        L5a:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.n     // Catch: java.lang.InterruptedException -> L54 java.util.concurrent.ExecutionException -> L57 java.util.concurrent.TimeoutException -> L63 java.util.concurrent.CancellationException -> L65
            java.lang.String r4 = "grs request return body is not null and is OK."
            com.huawei.hms.framework.common.Logger.i(r0, r4)     // Catch: java.lang.InterruptedException -> L54 java.util.concurrent.ExecutionException -> L57 java.util.concurrent.TimeoutException -> L63 java.util.concurrent.CancellationException -> L65
            r11 = r1
            goto L91
        L63:
            r11 = r1
            goto L6e
        L65:
            r11 = r1
            goto L86
        L67:
            r11 = r1
        L68:
            r3 = 0
            goto L91
        L6a:
            r0 = move-exception
            goto L76
        L6c:
            r0 = move-exception
            goto L7e
        L6e:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.n
            java.lang.String r1 = "the wait timed out"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            goto L68
        L76:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.c.n
            java.lang.String r4 = "the current thread was interrupted while waiting"
            com.huawei.hms.framework.common.Logger.w(r1, r4, r0)
            goto L91
        L7e:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.c.n
            java.lang.String r3 = "the computation threw an ExecutionException"
            com.huawei.hms.framework.common.Logger.w(r1, r3, r0)
            goto L68
        L86:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.n
            java.lang.String r1 = "{requestServer} the computation was cancelled"
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            goto L91
        L8e:
            r2 = r16
            goto L68
        L91:
            if (r3 == 0) goto L9b
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.n
            java.lang.String r1 = "needBreak is true so need break current circulation"
            com.huawei.hms.framework.common.Logger.v(r0, r1)
            goto L9f
        L9b:
            int r12 = r12 + 1
            goto L5
        L9f:
            com.huawei.hms.framework.network.grs.g.d r0 = r15.b(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.c.a(java.util.concurrent.ExecutorService, java.util.List, java.lang.String, com.huawei.hms.framework.network.grs.e.c):com.huawei.hms.framework.network.grs.g.d");
    }

    public com.huawei.hms.framework.network.grs.g.k.d b() {
        return this.k;
    }

    private void b(String str, String str2) {
        if (TextUtils.isEmpty(this.a.getAppName()) && TextUtils.isEmpty(e())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[1];
        objArr[0] = TextUtils.isEmpty(e()) ? this.a.getAppName() : e();
        sb.append(String.format(locale, str, objArr));
        String grsReqParamJoint = this.a.getGrsReqParamJoint(false, false, "1.0", this.b);
        if (!TextUtils.isEmpty(grsReqParamJoint)) {
            sb.append(CallerData.NA);
            sb.append(grsReqParamJoint);
        }
        this.h.add(sb.toString());
    }

    public String a() {
        return this.l;
    }

    public synchronized void a(d dVar) {
        try {
            this.f.add(dVar);
            d dVar2 = this.d;
            if (dVar2 == null || (!dVar2.o() && !this.d.m())) {
                if (dVar.n()) {
                    Logger.i(n, "GRS server open 503 limiting strategy.");
                    com.huawei.hms.framework.network.grs.h.d.a(this.a.getGrsParasKey(true, true, this.b), new d.a(dVar.k(), SystemClock.elapsedRealtime()));
                    return;
                }
                if (dVar.m()) {
                    Logger.i(n, "GRS server open 304 Not Modified.");
                }
                if (!dVar.o() && !dVar.m()) {
                    Logger.v(n, "grsResponseResult has exception so need return");
                    return;
                }
                this.d = dVar;
                this.c.a(this.a, dVar, this.b, this.j);
                for (Map.Entry<String, Future<d>> entry : this.e.entrySet()) {
                    if (!entry.getKey().equals(dVar.l()) && !entry.getValue().isCancelled()) {
                        Logger.i(n, "future cancel");
                        entry.getValue().cancel(true);
                    }
                }
                return;
            }
            Logger.v(n, "grsResponseResult is ok");
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(com.huawei.hms.framework.network.grs.g.k.d dVar) {
        this.k = dVar;
    }

    private void a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str);
        String grsReqParamJoint = this.a.getGrsReqParamJoint(false, false, e(), this.b);
        if (!TextUtils.isEmpty(grsReqParamJoint)) {
            sb.append(CallerData.NA);
            sb.append(grsReqParamJoint);
        }
        this.i.add(sb.toString());
    }
}
