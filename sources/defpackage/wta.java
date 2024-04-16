package defpackage;

import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.firebase.crashlytics.a;
import com.google.firebase.perf.metrics.Trace;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: StartupMonitor.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0016\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\nR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lwta;", "", "Lfxa;", "step", "", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, "", "Z", "isRunningOnRealDevice", "", "Ljava/util/List;", "FINAL_STEPS", "tracingStarted", "", "Lcom/google/firebase/perf/metrics/Trace;", e.a, "Ljava/util/Map;", "traces", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wta  reason: default package */
/* loaded from: classes4.dex */
public final class wta {
    public static final wta a = new wta();
    private static final boolean b;
    private static final List<fxa> c;
    private static boolean d;
    private static final Map<fxa, Trace> e;

    static {
        boolean z;
        List<fxa> o;
        if (Build.DEVICE != null) {
            z = true;
        } else {
            z = false;
        }
        b = z;
        o = kc1.o(fxa.m, fxa.n);
        c = o;
        e = new LinkedHashMap();
    }

    private wta() {
    }

    private final void a(fxa fxaVar) {
        a.a().e("startup_last_step", fxaVar.i());
    }

    private final void b() {
        vw3 c2 = vw3.c();
        z65.g(c2, "getInstance(...)");
        for (fxa fxaVar : c) {
            Trace e2 = c2.e(fxaVar.i());
            z65.g(e2, "newTrace(...)");
            e2.start();
            e.put(fxaVar, e2);
        }
        d = true;
    }

    private final void c(fxa fxaVar) {
        if (!c.contains(fxaVar)) {
            return;
        }
        Map<fxa, Trace> map = e;
        Trace remove = map.remove(fxaVar);
        if (remove != null) {
            remove.stop();
        }
        map.clear();
    }

    public final synchronized void d(fxa fxaVar) {
        try {
            z65.h(fxaVar, "step");
            if (!b) {
                return;
            }
            a(fxaVar);
            if (d) {
                c(fxaVar);
            } else {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
