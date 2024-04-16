package defpackage;

import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.fragment.app.Fragment;
import defpackage.f74;
import java.util.HashMap;
import java.util.Map;
/* compiled from: FrameMetricsRecorder.java */
/* renamed from: g74  reason: default package */
/* loaded from: classes2.dex */
public class g74 {
    private static final sh e = sh.e();
    private final Activity a;
    private final e74 b;
    private final Map<Fragment, f74.a> c;
    private boolean d;

    public g74(Activity activity) {
        this(activity, new e74(), new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return true;
    }

    private qb7<f74.a> b() {
        if (!this.d) {
            e.a("No recording has been started.");
            return qb7.a();
        }
        SparseIntArray[] b = this.b.b();
        if (b == null) {
            e.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return qb7.a();
        } else if (b[0] == null) {
            e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return qb7.a();
        } else {
            return qb7.e(f74.a(b));
        }
    }

    public void c() {
        if (this.d) {
            e.b("FrameMetricsAggregator is already recording %s", this.a.getClass().getSimpleName());
            return;
        }
        this.b.a(this.a);
        this.d = true;
    }

    public void d(Fragment fragment) {
        if (!this.d) {
            e.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
        } else if (this.c.containsKey(fragment)) {
            e.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
        } else {
            qb7<f74.a> b = b();
            if (!b.d()) {
                e.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
            } else {
                this.c.put(fragment, b.c());
            }
        }
    }

    public qb7<f74.a> e() {
        if (!this.d) {
            e.a("Cannot stop because no recording was started");
            return qb7.a();
        }
        if (!this.c.isEmpty()) {
            e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.c.clear();
        }
        qb7<f74.a> b = b();
        try {
            this.b.c(this.a);
        } catch (IllegalArgumentException | NullPointerException e2) {
            if ((e2 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                throw e2;
            }
            e.k("View not hardware accelerated. Unable to collect FrameMetrics. %s", e2.toString());
            b = qb7.a();
        }
        this.b.d();
        this.d = false;
        return b;
    }

    public qb7<f74.a> f(Fragment fragment) {
        if (!this.d) {
            e.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return qb7.a();
        } else if (!this.c.containsKey(fragment)) {
            e.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return qb7.a();
        } else {
            f74.a remove = this.c.remove(fragment);
            qb7<f74.a> b = b();
            if (!b.d()) {
                e.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                return qb7.a();
            }
            return qb7.e(b.c().a(remove));
        }
    }

    g74(Activity activity, e74 e74Var, Map<Fragment, f74.a> map) {
        this.d = false;
        this.a = activity;
        this.b = e74Var;
        this.c = map;
    }
}
