package defpackage;

import androidx.annotation.NonNull;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Map;
/* compiled from: DelayedWorkTracker.java */
/* renamed from: yt2  reason: default package */
/* loaded from: classes.dex */
public class yt2 {
    static final String d = nx5.f("DelayedWorkTracker");
    final ki4 a;
    private final qp9 b;
    private final Map<String, Runnable> c = new HashMap();

    /* compiled from: DelayedWorkTracker.java */
    /* renamed from: yt2$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        final /* synthetic */ WorkSpec a;

        a(WorkSpec workSpec) {
            this.a = workSpec;
        }

        @Override // java.lang.Runnable
        public void run() {
            nx5.c().a(yt2.d, String.format("Scheduling work %s", this.a.a), new Throwable[0]);
            yt2.this.a.c(this.a);
        }
    }

    public yt2(@NonNull ki4 ki4Var, @NonNull qp9 qp9Var) {
        this.a = ki4Var;
        this.b = qp9Var;
    }

    public void a(@NonNull WorkSpec workSpec) {
        Runnable remove = this.c.remove(workSpec.a);
        if (remove != null) {
            this.b.a(remove);
        }
        a aVar = new a(workSpec);
        this.c.put(workSpec.a, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.b.b(workSpec.a() - currentTimeMillis, aVar);
    }

    public void b(@NonNull String str) {
        Runnable remove = this.c.remove(str);
        if (remove != null) {
            this.b.a(remove);
        }
    }
}
