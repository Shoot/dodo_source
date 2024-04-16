package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.WorkSpec;
import defpackage.b7c;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: WorkerWrapper.java */
/* renamed from: b8c  reason: default package */
/* loaded from: classes.dex */
public class b8c implements Runnable {
    static final String t = nx5.f("WorkerWrapper");
    Context a;
    private String b;
    private List<yv9> c;
    private WorkerParameters.a d;
    WorkSpec e;
    ListenableWorker f;
    d7b g;
    private androidx.work.a i;
    private c54 j;
    private WorkDatabase k;
    private androidx.work.impl.model.a l;
    private f03 m;
    private v7c n;
    private List<String> o;
    private String p;
    private volatile boolean s;
    @NonNull
    ListenableWorker.a h = ListenableWorker.a.a();
    @NonNull
    ufa<Boolean> q = ufa.t();
    kr5<ListenableWorker.a> r = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkerWrapper.java */
    /* renamed from: b8c$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        final /* synthetic */ kr5 a;
        final /* synthetic */ ufa b;

        a(kr5 kr5Var, ufa ufaVar) {
            this.a = kr5Var;
            this.b = ufaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.get();
                nx5.c().a(b8c.t, String.format("Starting work for %s", b8c.this.e.c), new Throwable[0]);
                b8c b8cVar = b8c.this;
                b8cVar.r = b8cVar.f.startWork();
                this.b.r(b8c.this.r);
            } catch (Throwable th) {
                this.b.q(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkerWrapper.java */
    /* renamed from: b8c$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        final /* synthetic */ ufa a;
        final /* synthetic */ String b;

        b(ufa ufaVar, String str) {
            this.a = ufaVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.a.get();
                    if (aVar == null) {
                        nx5.c().b(b8c.t, String.format("%s returned a null result. Treating it as a failure.", b8c.this.e.c), new Throwable[0]);
                    } else {
                        nx5.c().a(b8c.t, String.format("%s returned a %s result.", b8c.this.e.c, aVar), new Throwable[0]);
                        b8c.this.h = aVar;
                    }
                } catch (InterruptedException e) {
                    e = e;
                    nx5.c().b(b8c.t, String.format("%s failed because it threw an exception/error", this.b), e);
                } catch (CancellationException e2) {
                    nx5.c().d(b8c.t, String.format("%s was cancelled", this.b), e2);
                } catch (ExecutionException e3) {
                    e = e3;
                    nx5.c().b(b8c.t, String.format("%s failed because it threw an exception/error", this.b), e);
                }
                b8c.this.f();
            } catch (Throwable th) {
                b8c.this.f();
                throw th;
            }
        }
    }

    /* compiled from: WorkerWrapper.java */
    /* renamed from: b8c$c */
    /* loaded from: classes.dex */
    public static class c {
        @NonNull
        Context a;
        ListenableWorker b;
        @NonNull
        c54 c;
        @NonNull
        d7b d;
        @NonNull
        androidx.work.a e;
        @NonNull
        WorkDatabase f;
        @NonNull
        String g;
        List<yv9> h;
        @NonNull
        WorkerParameters.a i = new WorkerParameters.a();

        public c(@NonNull Context context, @NonNull androidx.work.a aVar, @NonNull d7b d7bVar, @NonNull c54 c54Var, @NonNull WorkDatabase workDatabase, @NonNull String str) {
            this.a = context.getApplicationContext();
            this.d = d7bVar;
            this.c = c54Var;
            this.e = aVar;
            this.f = workDatabase;
            this.g = str;
        }

        @NonNull
        public b8c a() {
            return new b8c(this);
        }

        @NonNull
        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.i = aVar;
            }
            return this;
        }

        @NonNull
        public c c(@NonNull List<yv9> list) {
            this.h = list;
            return this;
        }
    }

    b8c(@NonNull c cVar) {
        this.a = cVar.a;
        this.g = cVar.d;
        this.j = cVar.c;
        this.b = cVar.g;
        this.c = cVar.h;
        this.d = cVar.i;
        this.f = cVar.b;
        this.i = cVar.e;
        WorkDatabase workDatabase = cVar.f;
        this.k = workDatabase;
        this.l = workDatabase.M();
        this.m = this.k.E();
        this.n = this.k.N();
    }

    private String a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.b);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            nx5.c().d(t, String.format("Worker result SUCCESS for %s", this.p), new Throwable[0]);
            if (this.e.d()) {
                h();
            } else {
                m();
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            nx5.c().d(t, String.format("Worker result RETRY for %s", this.p), new Throwable[0]);
            g();
        } else {
            nx5.c().d(t, String.format("Worker result FAILURE for %s", this.p), new Throwable[0]);
            if (this.e.d()) {
                h();
            } else {
                l();
            }
        }
    }

    private void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.l.f(str2) != b7c.a.CANCELLED) {
                this.l.u(b7c.a.FAILED, str2);
            }
            linkedList.addAll(this.m.b(str2));
        }
    }

    private void g() {
        this.k.e();
        try {
            this.l.u(b7c.a.ENQUEUED, this.b);
            this.l.t(this.b, System.currentTimeMillis());
            this.l.l(this.b, -1L);
            this.k.B();
        } finally {
            this.k.i();
            i(true);
        }
    }

    private void h() {
        this.k.e();
        try {
            this.l.t(this.b, System.currentTimeMillis());
            this.l.u(b7c.a.ENQUEUED, this.b);
            this.l.r(this.b);
            this.l.l(this.b, -1L);
            this.k.B();
        } finally {
            this.k.i();
            i(false);
        }
    }

    private void i(boolean z) {
        ListenableWorker listenableWorker;
        this.k.e();
        try {
            if (!this.k.M().q()) {
                so7.a(this.a, RescheduleReceiver.class, false);
            }
            if (z) {
                this.l.u(b7c.a.ENQUEUED, this.b);
                this.l.l(this.b, -1L);
            }
            if (this.e != null && (listenableWorker = this.f) != null && listenableWorker.isRunInForeground()) {
                this.j.b(this.b);
            }
            this.k.B();
            this.k.i();
            this.q.p(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.k.i();
            throw th;
        }
    }

    private void j() {
        b7c.a f = this.l.f(this.b);
        if (f == b7c.a.RUNNING) {
            nx5.c().a(t, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.b), new Throwable[0]);
            i(true);
            return;
        }
        nx5.c().a(t, String.format("Status for %s is %s; not doing any work", this.b, f), new Throwable[0]);
        i(false);
    }

    private void k() {
        androidx.work.b b2;
        if (n()) {
            return;
        }
        this.k.e();
        try {
            WorkSpec g = this.l.g(this.b);
            this.e = g;
            if (g == null) {
                nx5.c().b(t, String.format("Didn't find WorkSpec for id %s", this.b), new Throwable[0]);
                i(false);
                this.k.B();
            } else if (g.b != b7c.a.ENQUEUED) {
                j();
                this.k.B();
                nx5.c().a(t, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.e.c), new Throwable[0]);
            } else {
                if (g.d() || this.e.c()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    WorkSpec workSpec = this.e;
                    if (workSpec.n != 0 && currentTimeMillis < workSpec.a()) {
                        nx5.c().a(t, String.format("Delaying execution for %s because it is being executed before schedule.", this.e.c), new Throwable[0]);
                        i(true);
                        this.k.B();
                        return;
                    }
                }
                this.k.B();
                this.k.i();
                if (this.e.d()) {
                    b2 = this.e.e;
                } else {
                    p35 b3 = this.i.f().b(this.e.d);
                    if (b3 == null) {
                        nx5.c().b(t, String.format("Could not create Input Merger %s", this.e.d), new Throwable[0]);
                        l();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.e.e);
                    arrayList.addAll(this.l.i(this.b));
                    b2 = b3.b(arrayList);
                }
                WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.b), b2, this.o, this.d, this.e.k, this.i.e(), this.g, this.i.m(), new p7c(this.k, this.g), new a7c(this.k, this.j, this.g));
                if (this.f == null) {
                    this.f = this.i.m().b(this.a, this.e.c, workerParameters);
                }
                ListenableWorker listenableWorker = this.f;
                if (listenableWorker == null) {
                    nx5.c().b(t, String.format("Could not create Worker %s", this.e.c), new Throwable[0]);
                    l();
                } else if (listenableWorker.isUsed()) {
                    nx5.c().b(t, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.e.c), new Throwable[0]);
                    l();
                } else {
                    this.f.setUsed();
                    if (o()) {
                        if (n()) {
                            return;
                        }
                        ufa t2 = ufa.t();
                        z6c z6cVar = new z6c(this.a, this.e, this.f, workerParameters.b(), this.g);
                        this.g.a().execute(z6cVar);
                        kr5<Void> a2 = z6cVar.a();
                        a2.k(new a(a2, t2), this.g.a());
                        t2.k(new b(t2, this.p), this.g.c());
                        return;
                    }
                    j();
                }
            }
        } finally {
            this.k.i();
        }
    }

    private void m() {
        this.k.e();
        try {
            this.l.u(b7c.a.SUCCEEDED, this.b);
            this.l.o(this.b, ((ListenableWorker.a.c) this.h).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.m.b(this.b)) {
                if (this.l.f(str) == b7c.a.BLOCKED && this.m.c(str)) {
                    nx5.c().d(t, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.l.u(b7c.a.ENQUEUED, str);
                    this.l.t(str, currentTimeMillis);
                }
            }
            this.k.B();
            this.k.i();
            i(false);
        } catch (Throwable th) {
            this.k.i();
            i(false);
            throw th;
        }
    }

    private boolean n() {
        if (!this.s) {
            return false;
        }
        nx5.c().a(t, String.format("Work interrupted for %s", this.p), new Throwable[0]);
        b7c.a f = this.l.f(this.b);
        if (f == null) {
            i(false);
        } else {
            i(!f.a());
        }
        return true;
    }

    private boolean o() {
        this.k.e();
        try {
            boolean z = false;
            if (this.l.f(this.b) == b7c.a.ENQUEUED) {
                this.l.u(b7c.a.RUNNING, this.b);
                this.l.s(this.b);
                z = true;
            }
            this.k.B();
            this.k.i();
            return z;
        } catch (Throwable th) {
            this.k.i();
            throw th;
        }
    }

    @NonNull
    public kr5<Boolean> b() {
        return this.q;
    }

    public void d() {
        boolean z;
        this.s = true;
        n();
        kr5<ListenableWorker.a> kr5Var = this.r;
        if (kr5Var != null) {
            z = kr5Var.isDone();
            this.r.cancel(true);
        } else {
            z = false;
        }
        ListenableWorker listenableWorker = this.f;
        if (listenableWorker != null && !z) {
            listenableWorker.stop();
        } else {
            nx5.c().a(t, String.format("WorkSpec %s is already done. Not interrupting.", this.e), new Throwable[0]);
        }
    }

    void f() {
        if (!n()) {
            this.k.e();
            try {
                b7c.a f = this.l.f(this.b);
                this.k.L().a(this.b);
                if (f == null) {
                    i(false);
                } else if (f == b7c.a.RUNNING) {
                    c(this.h);
                } else if (!f.a()) {
                    g();
                }
                this.k.B();
                this.k.i();
            } catch (Throwable th) {
                this.k.i();
                throw th;
            }
        }
        List<yv9> list = this.c;
        if (list != null) {
            for (yv9 yv9Var : list) {
                yv9Var.a(this.b);
            }
            ew9.b(this.i, this.k, this.c);
        }
    }

    void l() {
        this.k.e();
        try {
            e(this.b);
            this.l.o(this.b, ((ListenableWorker.a.C0050a) this.h).e());
            this.k.B();
        } finally {
            this.k.i();
            i(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> a2 = this.n.a(this.b);
        this.o = a2;
        this.p = a(a2);
        k();
    }
}
