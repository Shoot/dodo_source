package defpackage;

import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzft;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* renamed from: og4  reason: default package */
/* loaded from: classes2.dex */
public final class og4 extends hmc {
    private static List<Runnable> j = new ArrayList();
    private boolean f;
    private Set<Object> g;
    private boolean h;
    private volatile boolean i;

    public og4(zzbv zzbvVar) {
        super(zzbvVar);
        this.g = new HashSet();
    }

    public static void k() {
        synchronized (og4.class) {
            try {
                List<Runnable> list = j;
                if (list != null) {
                    for (Runnable runnable : list) {
                        runnable.run();
                    }
                    j = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean h() {
        return this.i;
    }

    public boolean i() {
        return this.h;
    }

    public void j(boolean z) {
        this.h = z;
    }

    public final void l() {
        zzft zzq = e().zzq();
        zzq.zzf();
        if (zzq.zze()) {
            j(zzq.zzc());
        }
        zzq.zzf();
        this.f = true;
    }

    public final boolean m() {
        if (this.f) {
            return true;
        }
        return false;
    }
}
