package defpackage;

import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import defpackage.j12;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
/* compiled from: SessionReportingCoordinator.java */
/* renamed from: bfa  reason: default package */
/* loaded from: classes2.dex */
public class bfa {
    private final k12 a;
    private final z12 b;
    private final rl2 c;
    private final sw5 d;
    private final mub e;
    private final gt4 f;

    bfa(k12 k12Var, z12 z12Var, rl2 rl2Var, sw5 sw5Var, mub mubVar, gt4 gt4Var) {
        this.a = k12Var;
        this.b = z12Var;
        this.c = rl2Var;
        this.d = sw5Var;
        this.e = mubVar;
        this.f = gt4Var;
    }

    private j12.e.d c(j12.e.d dVar, sw5 sw5Var, mub mubVar) {
        j12.e.d.b h = dVar.h();
        String c = sw5Var.c();
        if (c != null) {
            h.d(j12.e.d.AbstractC0388d.a().b(c).a());
        } else {
            rx5.f().i("No log data to include with this event.");
        }
        List<j12.c> m = m(mubVar.e());
        List<j12.c> m2 = m(mubVar.f());
        if (!m.isEmpty() || !m2.isEmpty()) {
            h.b(dVar.b().i().e(m).g(m2).a());
        }
        return h.a();
    }

    private j12.e.d d(j12.e.d dVar) {
        return e(c(dVar, this.d, this.e), this.e);
    }

    private j12.e.d e(j12.e.d dVar, mub mubVar) {
        List<j12.e.d.AbstractC0389e> g = mubVar.g();
        if (g.isEmpty()) {
            return dVar;
        }
        j12.e.d.b h = dVar.h();
        h.e(j12.e.d.f.a().b(g).a());
        return h.a();
    }

    private static j12.a f(ApplicationExitInfo applicationExitInfo) {
        String applicationExitInfo2;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        InputStream traceInputStream;
        String str = null;
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = g(traceInputStream);
            }
        } catch (IOException e) {
            rx5 f = rx5.f();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get input trace in application exit info: ");
            applicationExitInfo2 = applicationExitInfo.toString();
            sb.append(applicationExitInfo2);
            sb.append(" Error: ");
            sb.append(e);
            f.k(sb.toString());
        }
        j12.a.b a = j12.a.a();
        importance = applicationExitInfo.getImportance();
        j12.a.b c = a.c(importance);
        processName = applicationExitInfo.getProcessName();
        j12.a.b e2 = c.e(processName);
        reason = applicationExitInfo.getReason();
        j12.a.b g = e2.g(reason);
        timestamp = applicationExitInfo.getTimestamp();
        j12.a.b i = g.i(timestamp);
        pid = applicationExitInfo.getPid();
        j12.a.b d = i.d(pid);
        pss = applicationExitInfo.getPss();
        j12.a.b f2 = d.f(pss);
        rss = applicationExitInfo.getRss();
        return f2.h(rss).j(str).a();
    }

    public static String g(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
        }
    }

    public static bfa h(Context context, gt4 gt4Var, hu3 hu3Var, yn ynVar, sw5 sw5Var, mub mubVar, hta htaVar, gga ggaVar, w77 w77Var, v02 v02Var) {
        return new bfa(new k12(context, gt4Var, ynVar, htaVar, ggaVar), new z12(hu3Var, ggaVar, v02Var), rl2.b(context, ggaVar, w77Var), sw5Var, mubVar, gt4Var);
    }

    private a22 i(a22 a22Var) {
        if (a22Var.b().g() == null) {
            return a22.a(a22Var.b().r(this.f.d()), a22Var.d(), a22Var.c());
        }
        return a22Var;
    }

    private ApplicationExitInfo l(String str, List<ApplicationExitInfo> list) {
        long timestamp;
        int reason;
        long q = this.b.q(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            ApplicationExitInfo a = x44.a(applicationExitInfo);
            timestamp = a.getTimestamp();
            if (timestamp >= q) {
                reason = a.getReason();
                if (reason == 6) {
                    return a;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    @NonNull
    private static List<j12.c> m(@NonNull Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(j12.c.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: zea
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int o;
                o = bfa.o((j12.c) obj, (j12.c) obj2);
                return o;
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int o(j12.c cVar, j12.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(@NonNull y6b<a22> y6bVar) {
        if (y6bVar.q()) {
            a22 m = y6bVar.m();
            rx5 f = rx5.f();
            f.b("Crashlytics report successfully enqueued to DataTransport: " + m.d());
            File c = m.c();
            if (c.delete()) {
                rx5 f2 = rx5.f();
                f2.b("Deleted report file: " + c.getPath());
                return true;
            }
            rx5 f3 = rx5.f();
            f3.k("Crashlytics could not delete report file: " + c.getPath());
            return true;
        }
        rx5.f().l("Crashlytics report could not be enqueued to DataTransport", y6bVar.l());
        return false;
    }

    private void s(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, @NonNull String str2, long j, boolean z) {
        this.b.y(d(this.a.d(th, thread, str2, j, 4, 8, z)), str, str2.equals(CrashHianalyticsData.EVENT_ID_CRASH));
    }

    public void j(@NonNull String str, @NonNull List<mu6> list, j12.a aVar) {
        rx5.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (mu6 mu6Var : list) {
            j12.d.b a = mu6Var.a();
            if (a != null) {
                arrayList.add(a);
            }
        }
        this.b.l(str, j12.d.a().b(Collections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void k(long j, String str) {
        this.b.k(str, j);
    }

    public boolean n() {
        return this.b.r();
    }

    public SortedSet<String> p() {
        return this.b.p();
    }

    public void q(@NonNull String str, long j) {
        this.b.z(this.a.e(str, j));
    }

    public void t(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, long j) {
        rx5 f = rx5.f();
        f.i("Persisting fatal event for session " + str);
        s(th, thread, str, CrashHianalyticsData.EVENT_ID_CRASH, j, true);
    }

    public void u(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, long j) {
        rx5 f = rx5.f();
        f.i("Persisting non-fatal event for session " + str);
        s(th, thread, str, "error", j, false);
    }

    public void v(String str, List<ApplicationExitInfo> list, sw5 sw5Var, mub mubVar) {
        ApplicationExitInfo l = l(str, list);
        if (l == null) {
            rx5 f = rx5.f();
            f.i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        j12.e.d c = this.a.c(f(l));
        rx5 f2 = rx5.f();
        f2.b("Persisting anr for session " + str);
        this.b.y(e(c(c, sw5Var, mubVar), mubVar), str, true);
    }

    public void w() {
        this.b.i();
    }

    public y6b<Void> x(@NonNull Executor executor) {
        return y(executor, null);
    }

    public y6b<Void> y(@NonNull Executor executor, String str) {
        boolean z;
        List<a22> w = this.b.w();
        ArrayList arrayList = new ArrayList();
        for (a22 a22Var : w) {
            if (str == null || str.equals(a22Var.d())) {
                rl2 rl2Var = this.c;
                a22 i = i(a22Var);
                if (str != null) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(rl2Var.c(i, z).j(executor, new dv1() { // from class: afa
                    @Override // defpackage.dv1
                    public final Object a(y6b y6bVar) {
                        boolean r;
                        r = bfa.this.r(y6bVar);
                        return Boolean.valueOf(r);
                    }
                }));
            }
        }
        return o7b.f(arrayList);
    }
}
