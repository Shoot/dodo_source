package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.impl.model.WorkSpec;
import defpackage.ir1;
import java.util.ArrayList;
import java.util.List;
/* compiled from: WorkConstraintsTracker.java */
/* renamed from: v6c  reason: default package */
/* loaded from: classes.dex */
public class v6c implements ir1.a {
    private static final String d = nx5.f("WorkConstraintsTracker");
    private final u6c a;
    private final ir1<?>[] b;
    private final Object c;

    public v6c(@NonNull Context context, @NonNull d7b d7bVar, u6c u6cVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = u6cVar;
        this.b = new ir1[]{new x90(applicationContext, d7bVar), new z90(applicationContext, d7bVar), new rxa(applicationContext, d7bVar), new yv6(applicationContext, d7bVar), new qw6(applicationContext, d7bVar), new cw6(applicationContext, d7bVar), new bw6(applicationContext, d7bVar)};
        this.c = new Object();
    }

    @Override // defpackage.ir1.a
    public void a(@NonNull List<String> list) {
        synchronized (this.c) {
            try {
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    if (c(str)) {
                        nx5.c().a(d, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                u6c u6cVar = this.a;
                if (u6cVar != null) {
                    u6cVar.f(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ir1.a
    public void b(@NonNull List<String> list) {
        synchronized (this.c) {
            try {
                u6c u6cVar = this.a;
                if (u6cVar != null) {
                    u6cVar.b(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c(@NonNull String str) {
        ir1<?>[] ir1VarArr;
        synchronized (this.c) {
            try {
                for (ir1<?> ir1Var : this.b) {
                    if (ir1Var.d(str)) {
                        nx5.c().a(d, String.format("Work %s constrained by %s", str, ir1Var.getClass().getSimpleName()), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(@NonNull Iterable<WorkSpec> iterable) {
        synchronized (this.c) {
            try {
                for (ir1<?> ir1Var : this.b) {
                    ir1Var.g(null);
                }
                for (ir1<?> ir1Var2 : this.b) {
                    ir1Var2.e(iterable);
                }
                for (ir1<?> ir1Var3 : this.b) {
                    ir1Var3.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.c) {
            try {
                for (ir1<?> ir1Var : this.b) {
                    ir1Var.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
