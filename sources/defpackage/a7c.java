package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import defpackage.b7c;
import java.util.UUID;
/* compiled from: WorkForegroundUpdater.java */
/* renamed from: a7c  reason: default package */
/* loaded from: classes.dex */
public class a7c implements d54 {
    private static final String d = nx5.f("WMFgUpdater");
    private final d7b a;
    final c54 b;
    final androidx.work.impl.model.a c;

    /* compiled from: WorkForegroundUpdater.java */
    /* renamed from: a7c$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        final /* synthetic */ ufa a;
        final /* synthetic */ UUID b;
        final /* synthetic */ a54 c;
        final /* synthetic */ Context d;

        a(ufa ufaVar, UUID uuid, a54 a54Var, Context context) {
            this.a = ufaVar;
            this.b = uuid;
            this.c = a54Var;
            this.d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.a.isCancelled()) {
                    String uuid = this.b.toString();
                    b7c.a f = a7c.this.c.f(uuid);
                    if (f != null && !f.a()) {
                        a7c.this.b.a(uuid, this.c);
                        this.d.startService(androidx.work.impl.foreground.a.a(this.d, uuid, this.c));
                    } else {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                }
                this.a.p(null);
            } catch (Throwable th) {
                this.a.q(th);
            }
        }
    }

    public a7c(@NonNull WorkDatabase workDatabase, @NonNull c54 c54Var, @NonNull d7b d7bVar) {
        this.b = c54Var;
        this.a = d7bVar;
        this.c = workDatabase.M();
    }

    @Override // defpackage.d54
    @NonNull
    public kr5<Void> a(@NonNull Context context, @NonNull UUID uuid, @NonNull a54 a54Var) {
        ufa t = ufa.t();
        this.a.b(new a(t, uuid, a54Var, context));
        return t;
    }
}
