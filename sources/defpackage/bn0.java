package defpackage;

import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import defpackage.b7c;
import defpackage.ua7;
import java.util.LinkedList;
import java.util.UUID;
/* compiled from: CancelWorkRunnable.java */
/* renamed from: bn0  reason: default package */
/* loaded from: classes.dex */
public abstract class bn0 implements Runnable {
    private final za7 a = new za7();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CancelWorkRunnable.java */
    /* renamed from: bn0$a */
    /* loaded from: classes.dex */
    public class a extends bn0 {
        final /* synthetic */ j7c b;
        final /* synthetic */ UUID c;

        a(j7c j7cVar, UUID uuid) {
            this.b = j7cVar;
            this.c = uuid;
        }

        @Override // defpackage.bn0
        void h() {
            WorkDatabase t = this.b.t();
            t.e();
            try {
                a(this.b, this.c.toString());
                t.B();
                t.i();
                g(this.b);
            } catch (Throwable th) {
                t.i();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CancelWorkRunnable.java */
    /* renamed from: bn0$b */
    /* loaded from: classes.dex */
    public class b extends bn0 {
        final /* synthetic */ j7c b;
        final /* synthetic */ String c;

        b(j7c j7cVar, String str) {
            this.b = j7cVar;
            this.c = str;
        }

        @Override // defpackage.bn0
        void h() {
            WorkDatabase t = this.b.t();
            t.e();
            try {
                for (String str : t.M().h(this.c)) {
                    a(this.b, str);
                }
                t.B();
                t.i();
                g(this.b);
            } catch (Throwable th) {
                t.i();
                throw th;
            }
        }
    }

    /* compiled from: CancelWorkRunnable.java */
    /* renamed from: bn0$c */
    /* loaded from: classes.dex */
    class c extends bn0 {
        final /* synthetic */ j7c b;
        final /* synthetic */ String c;
        final /* synthetic */ boolean d;

        c(j7c j7cVar, String str, boolean z) {
            this.b = j7cVar;
            this.c = str;
            this.d = z;
        }

        @Override // defpackage.bn0
        void h() {
            WorkDatabase t = this.b.t();
            t.e();
            try {
                for (String str : t.M().e(this.c)) {
                    a(this.b, str);
                }
                t.B();
                t.i();
                if (this.d) {
                    g(this.b);
                }
            } catch (Throwable th) {
                t.i();
                throw th;
            }
        }
    }

    public static bn0 b(@NonNull UUID uuid, @NonNull j7c j7cVar) {
        return new a(j7cVar, uuid);
    }

    public static bn0 c(@NonNull String str, @NonNull j7c j7cVar, boolean z) {
        return new c(j7cVar, str, z);
    }

    public static bn0 d(@NonNull String str, @NonNull j7c j7cVar) {
        return new b(j7cVar, str);
    }

    private void f(WorkDatabase workDatabase, String str) {
        androidx.work.impl.model.a M = workDatabase.M();
        f03 E = workDatabase.E();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            b7c.a f = M.f(str2);
            if (f != b7c.a.SUCCEEDED && f != b7c.a.FAILED) {
                M.u(b7c.a.CANCELLED, str2);
            }
            linkedList.addAll(E.b(str2));
        }
    }

    void a(j7c j7cVar, String str) {
        f(j7cVar.t(), str);
        j7cVar.r().l(str);
        for (yv9 yv9Var : j7cVar.s()) {
            yv9Var.a(str);
        }
    }

    public ua7 e() {
        return this.a;
    }

    void g(j7c j7cVar) {
        ew9.b(j7cVar.n(), j7cVar.t(), j7cVar.s());
    }

    abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.a.a(ua7.a);
        } catch (Throwable th) {
            this.a.a(new ua7.b.a(th));
        }
    }
}
