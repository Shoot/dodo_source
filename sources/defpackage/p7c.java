package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkSpec;
import defpackage.b7c;
import java.util.UUID;
/* compiled from: WorkProgressUpdater.java */
/* renamed from: p7c  reason: default package */
/* loaded from: classes.dex */
public class p7c implements ep8 {
    static final String c = nx5.f("WorkProgressUpdater");
    final WorkDatabase a;
    final d7b b;

    /* compiled from: WorkProgressUpdater.java */
    /* renamed from: p7c$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        final /* synthetic */ UUID a;
        final /* synthetic */ b b;
        final /* synthetic */ ufa c;

        a(UUID uuid, b bVar, ufa ufaVar) {
            this.a = uuid;
            this.b = bVar;
            this.c = ufaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            WorkSpec g;
            String uuid = this.a.toString();
            nx5 c = nx5.c();
            String str = p7c.c;
            c.a(str, String.format("Updating progress for %s (%s)", this.a, this.b), new Throwable[0]);
            p7c.this.a.e();
            try {
                g = p7c.this.a.M().g(uuid);
            } finally {
                try {
                    return;
                } finally {
                }
            }
            if (g != null) {
                if (g.b == b7c.a.RUNNING) {
                    p7c.this.a.L().c(new WorkProgress(uuid, this.b));
                } else {
                    nx5.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid), new Throwable[0]);
                }
                this.c.p(null);
                p7c.this.a.B();
                return;
            }
            throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
    }

    public p7c(@NonNull WorkDatabase workDatabase, @NonNull d7b d7bVar) {
        this.a = workDatabase;
        this.b = d7bVar;
    }

    @Override // defpackage.ep8
    @NonNull
    public kr5<Void> a(@NonNull Context context, @NonNull UUID uuid, @NonNull b bVar) {
        ufa t = ufa.t();
        this.b.b(new a(uuid, bVar, t));
        return t;
    }
}
