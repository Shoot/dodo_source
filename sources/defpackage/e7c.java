package defpackage;

import defpackage.t3b;
import java.util.concurrent.Executor;
/* compiled from: WorkInitializer.java */
/* renamed from: e7c  reason: default package */
/* loaded from: classes2.dex */
public class e7c {
    private final Executor a;
    private final el3 b;
    private final t7c c;
    private final t3b d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e7c(Executor executor, el3 el3Var, t7c t7cVar, t3b t3bVar) {
        this.a = executor;
        this.b = el3Var;
        this.c = t7cVar;
        this.d = t3bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        for (wlb wlbVar : this.b.R()) {
            this.c.a(wlbVar, 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.d.b(new t3b.a() { // from class: d7c
            @Override // defpackage.t3b.a
            public final Object execute() {
                Object d;
                d = e7c.this.d();
                return d;
            }
        });
    }

    public void c() {
        this.a.execute(new Runnable() { // from class: c7c
            @Override // java.lang.Runnable
            public final void run() {
                e7c.this.e();
            }
        });
    }
}
