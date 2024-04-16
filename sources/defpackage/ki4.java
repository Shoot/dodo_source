package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.a;
import androidx.work.impl.model.WorkSpec;
import defpackage.b7c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: GreedyScheduler.java */
/* renamed from: ki4  reason: default package */
/* loaded from: classes.dex */
public class ki4 implements yv9, u6c, bm3 {
    private static final String i = nx5.f("GreedyScheduler");
    private final Context a;
    private final j7c b;
    private final v6c c;
    private yt2 e;
    private boolean f;
    Boolean h;
    private final Set<WorkSpec> d = new HashSet();
    private final Object g = new Object();

    public ki4(@NonNull Context context, @NonNull a aVar, @NonNull d7b d7bVar, @NonNull j7c j7cVar) {
        this.a = context;
        this.b = j7cVar;
        this.c = new v6c(context, d7bVar, this);
        this.e = new yt2(this, aVar.k());
    }

    private void g() {
        this.h = Boolean.valueOf(yk8.b(this.a, this.b.n()));
    }

    private void h() {
        if (!this.f) {
            this.b.r().c(this);
            this.f = true;
        }
    }

    private void i(@NonNull String str) {
        synchronized (this.g) {
            try {
                Iterator<WorkSpec> it = this.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    WorkSpec next = it.next();
                    if (next.a.equals(str)) {
                        nx5.c().a(i, String.format("Stopping tracking for %s", str), new Throwable[0]);
                        this.d.remove(next);
                        this.c.d(this.d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.yv9
    public void a(@NonNull String str) {
        if (this.h == null) {
            g();
        }
        if (!this.h.booleanValue()) {
            nx5.c().d(i, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        nx5.c().a(i, String.format("Cancelling work ID %s", str), new Throwable[0]);
        yt2 yt2Var = this.e;
        if (yt2Var != null) {
            yt2Var.b(str);
        }
        this.b.C(str);
    }

    @Override // defpackage.u6c
    public void b(@NonNull List<String> list) {
        for (String str : list) {
            nx5.c().a(i, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.b.C(str);
        }
    }

    @Override // defpackage.yv9
    public void c(@NonNull WorkSpec... workSpecArr) {
        if (this.h == null) {
            g();
        }
        if (!this.h.booleanValue()) {
            nx5.c().d(i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (WorkSpec workSpec : workSpecArr) {
            long a = workSpec.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (workSpec.b == b7c.a.ENQUEUED) {
                if (currentTimeMillis < a) {
                    yt2 yt2Var = this.e;
                    if (yt2Var != null) {
                        yt2Var.a(workSpec);
                    }
                } else if (workSpec.b()) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 23 && workSpec.j.h()) {
                        nx5.c().a(i, String.format("Ignoring WorkSpec %s, Requires device idle.", workSpec), new Throwable[0]);
                    } else if (i2 >= 24 && workSpec.j.e()) {
                        nx5.c().a(i, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", workSpec), new Throwable[0]);
                    } else {
                        hashSet.add(workSpec);
                        hashSet2.add(workSpec.a);
                    }
                } else {
                    nx5.c().a(i, String.format("Starting work for %s", workSpec.a), new Throwable[0]);
                    this.b.z(workSpec.a);
                }
            }
        }
        synchronized (this.g) {
            try {
                if (!hashSet.isEmpty()) {
                    nx5.c().a(i, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.d.addAll(hashSet);
                    this.c.d(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.yv9
    public boolean d() {
        return false;
    }

    @Override // defpackage.bm3
    public void e(@NonNull String str, boolean z) {
        i(str);
    }

    @Override // defpackage.u6c
    public void f(@NonNull List<String> list) {
        for (String str : list) {
            nx5.c().a(i, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.b.z(str);
        }
    }
}
