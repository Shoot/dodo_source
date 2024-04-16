package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements u6c {
    private static final String f = nx5.f("ConstraintTrkngWrkr");
    private WorkerParameters a;
    final Object b;
    volatile boolean c;
    ufa<ListenableWorker.a> d;
    private ListenableWorker e;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        final /* synthetic */ kr5 a;

        b(kr5 kr5Var) {
            this.a = kr5Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.b) {
                try {
                    if (ConstraintTrackingWorker.this.c) {
                        ConstraintTrackingWorker.this.d();
                    } else {
                        ConstraintTrackingWorker.this.d.r(this.a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public ConstraintTrackingWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.a = workerParameters;
        this.b = new Object();
        this.c = false;
        this.d = ufa.t();
    }

    @NonNull
    public WorkDatabase a() {
        return j7c.p(getApplicationContext()).t();
    }

    @Override // defpackage.u6c
    public void b(@NonNull List<String> list) {
        nx5.c().a(f, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.b) {
            this.c = true;
        }
    }

    void c() {
        this.d.p(ListenableWorker.a.a());
    }

    void d() {
        this.d.p(ListenableWorker.a.b());
    }

    void e() {
        String m = getInputData().m("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(m)) {
            nx5.c().b(f, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        ListenableWorker b2 = getWorkerFactory().b(getApplicationContext(), m, this.a);
        this.e = b2;
        if (b2 == null) {
            nx5.c().a(f, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        WorkSpec g = a().M().g(getId().toString());
        if (g == null) {
            c();
            return;
        }
        v6c v6cVar = new v6c(getApplicationContext(), getTaskExecutor(), this);
        v6cVar.d(Collections.singletonList(g));
        if (v6cVar.c(getId().toString())) {
            nx5.c().a(f, String.format("Constraints met for delegate %s", m), new Throwable[0]);
            try {
                kr5<ListenableWorker.a> startWork = this.e.startWork();
                startWork.k(new b(startWork), getBackgroundExecutor());
                return;
            } catch (Throwable th) {
                nx5 c = nx5.c();
                String str = f;
                c.a(str, String.format("Delegated worker %s threw exception in startWork.", m), th);
                synchronized (this.b) {
                    try {
                        if (this.c) {
                            nx5.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                            d();
                        } else {
                            c();
                        }
                        return;
                    } finally {
                    }
                }
            }
        }
        nx5.c().a(f, String.format("Constraints not met for delegate %s. Requesting retry.", m), new Throwable[0]);
        d();
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public d7b getTaskExecutor() {
        return j7c.p(getApplicationContext()).u();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.e;
        if (listenableWorker != null && listenableWorker.isRunInForeground()) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.e;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.e.stop();
        }
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public kr5<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.d;
    }

    @Override // defpackage.u6c
    public void f(@NonNull List<String> list) {
    }
}
