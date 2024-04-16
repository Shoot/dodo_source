package defpackage;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.b8c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
/* compiled from: Processor.java */
/* renamed from: al8  reason: default package */
/* loaded from: classes.dex */
public class al8 implements bm3, c54 {
    private static final String l = nx5.f("Processor");
    private Context b;
    private androidx.work.a c;
    private d7b d;
    private WorkDatabase e;
    private List<yv9> h;
    private Map<String, b8c> g = new HashMap();
    private Map<String, b8c> f = new HashMap();
    private Set<String> i = new HashSet();
    private final List<bm3> j = new ArrayList();
    private PowerManager.WakeLock a = null;
    private final Object k = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Processor.java */
    /* renamed from: al8$a */
    /* loaded from: classes.dex */
    public static class a implements Runnable {
        @NonNull
        private bm3 a;
        @NonNull
        private String b;
        @NonNull
        private kr5<Boolean> c;

        a(@NonNull bm3 bm3Var, @NonNull String str, @NonNull kr5<Boolean> kr5Var) {
            this.a = bm3Var;
            this.b = str;
            this.c = kr5Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                z = this.c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.a.e(this.b, z);
        }
    }

    public al8(@NonNull Context context, @NonNull androidx.work.a aVar, @NonNull d7b d7bVar, @NonNull WorkDatabase workDatabase, @NonNull List<yv9> list) {
        this.b = context;
        this.c = aVar;
        this.d = d7bVar;
        this.e = workDatabase;
        this.h = list;
    }

    private static boolean d(@NonNull String str, b8c b8cVar) {
        if (b8cVar != null) {
            b8cVar.d();
            nx5.c().a(l, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
            return true;
        }
        nx5.c().a(l, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
        return false;
    }

    private void m() {
        synchronized (this.k) {
            try {
                if (!(!this.f.isEmpty())) {
                    this.b.startService(androidx.work.impl.foreground.a.d(this.b));
                    PowerManager.WakeLock wakeLock = this.a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.a = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.c54
    public void a(@NonNull String str, @NonNull a54 a54Var) {
        synchronized (this.k) {
            try {
                nx5.c().d(l, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
                b8c remove = this.g.remove(str);
                if (remove != null) {
                    if (this.a == null) {
                        PowerManager.WakeLock b = x2c.b(this.b, "ProcessorForegroundLck");
                        this.a = b;
                        b.acquire();
                    }
                    this.f.put(str, remove);
                    iu1.m(this.b, androidx.work.impl.foreground.a.c(this.b, str, a54Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.c54
    public void b(@NonNull String str) {
        synchronized (this.k) {
            this.f.remove(str);
            m();
        }
    }

    public void c(@NonNull bm3 bm3Var) {
        synchronized (this.k) {
            this.j.add(bm3Var);
        }
    }

    @Override // defpackage.bm3
    public void e(@NonNull String str, boolean z) {
        synchronized (this.k) {
            try {
                this.g.remove(str);
                nx5.c().a(l, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
                for (bm3 bm3Var : this.j) {
                    bm3Var.e(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean f(@NonNull String str) {
        boolean contains;
        synchronized (this.k) {
            contains = this.i.contains(str);
        }
        return contains;
    }

    public boolean g(@NonNull String str) {
        boolean z;
        synchronized (this.k) {
            try {
                if (!this.g.containsKey(str) && !this.f.containsKey(str)) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    public boolean h(@NonNull String str) {
        boolean containsKey;
        synchronized (this.k) {
            containsKey = this.f.containsKey(str);
        }
        return containsKey;
    }

    public void i(@NonNull bm3 bm3Var) {
        synchronized (this.k) {
            this.j.remove(bm3Var);
        }
    }

    public boolean j(@NonNull String str) {
        return k(str, null);
    }

    public boolean k(@NonNull String str, WorkerParameters.a aVar) {
        synchronized (this.k) {
            try {
                if (g(str)) {
                    nx5.c().a(l, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                    return false;
                }
                b8c a2 = new b8c.c(this.b, this.c, this.d, this, this.e, str).c(this.h).b(aVar).a();
                kr5<Boolean> b = a2.b();
                b.k(new a(this, str, b), this.d.a());
                this.g.put(str, a2);
                this.d.c().execute(a2);
                nx5.c().a(l, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean l(@NonNull String str) {
        boolean d;
        synchronized (this.k) {
            try {
                boolean z = true;
                nx5.c().a(l, String.format("Processor cancelling %s", str), new Throwable[0]);
                this.i.add(str);
                b8c remove = this.f.remove(str);
                if (remove == null) {
                    z = false;
                }
                if (remove == null) {
                    remove = this.g.remove(str);
                }
                d = d(str, remove);
                if (z) {
                    m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d;
    }

    public boolean n(@NonNull String str) {
        boolean d;
        synchronized (this.k) {
            nx5.c().a(l, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            d = d(str, this.f.remove(str));
        }
        return d;
    }

    public boolean o(@NonNull String str) {
        boolean d;
        synchronized (this.k) {
            nx5.c().a(l, String.format("Processor stopping background work %s", str), new Throwable[0]);
            d = d(str, this.g.remove(str));
        }
        return d;
    }
}
