package defpackage;

import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.a;
import defpackage.b7c;
/* compiled from: StopWorkRunnable.java */
/* renamed from: oxa  reason: default package */
/* loaded from: classes.dex */
public class oxa implements Runnable {
    private static final String d = nx5.f("StopWorkRunnable");
    private final j7c a;
    private final String b;
    private final boolean c;

    public oxa(@NonNull j7c j7cVar, @NonNull String str, boolean z) {
        this.a = j7cVar;
        this.b = str;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean o;
        WorkDatabase t = this.a.t();
        al8 r = this.a.r();
        a M = t.M();
        t.e();
        try {
            boolean h = r.h(this.b);
            if (this.c) {
                o = this.a.r().n(this.b);
            } else {
                if (!h && M.f(this.b) == b7c.a.RUNNING) {
                    M.u(b7c.a.ENQUEUED, this.b);
                }
                o = this.a.r().o(this.b);
            }
            nx5.c().a(d, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.b, Boolean.valueOf(o)), new Throwable[0]);
            t.B();
            t.i();
        } catch (Throwable th) {
            t.i();
            throw th;
        }
    }
}
