package defpackage;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import defpackage.ua7;
import java.util.List;
/* compiled from: EnqueueRunnable.java */
/* renamed from: ci3  reason: default package */
/* loaded from: classes.dex */
public class ci3 implements Runnable {
    private static final String c = nx5.f("EnqueueRunnable");
    private final x6c a;
    private final za7 b = new za7();

    public ci3(@NonNull x6c x6cVar) {
        this.a = x6cVar;
    }

    private static boolean b(@NonNull x6c x6cVar) {
        boolean c2 = c(x6cVar.g(), x6cVar.f(), (String[]) x6c.l(x6cVar).toArray(new String[0]), x6cVar.d(), x6cVar.b());
        x6cVar.k();
        return c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01dc A[LOOP:5: B:122:0x01d6->B:124:0x01dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean c(defpackage.j7c r19, @androidx.annotation.NonNull java.util.List<? extends defpackage.s7c> r20, java.lang.String[] r21, java.lang.String r22, defpackage.ym3 r23) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci3.c(j7c, java.util.List, java.lang.String[], java.lang.String, ym3):boolean");
    }

    private static boolean e(@NonNull x6c x6cVar) {
        List<x6c> e = x6cVar.e();
        boolean z = false;
        if (e != null) {
            boolean z2 = false;
            for (x6c x6cVar2 : e) {
                if (!x6cVar2.j()) {
                    z2 |= e(x6cVar2);
                } else {
                    nx5.c().h(c, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", x6cVar2.c())), new Throwable[0]);
                }
            }
            z = z2;
        }
        return b(x6cVar) | z;
    }

    private static void g(WorkSpec workSpec) {
        or1 or1Var = workSpec.j;
        String str = workSpec.c;
        if (!str.equals(ConstraintTrackingWorker.class.getName())) {
            if (or1Var.f() || or1Var.i()) {
                b.a aVar = new b.a();
                aVar.c(workSpec.e).h("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                workSpec.c = ConstraintTrackingWorker.class.getName();
                workSpec.e = aVar.a();
            }
        }
    }

    private static boolean h(@NonNull j7c j7cVar, @NonNull String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (yv9 yv9Var : j7cVar.s()) {
                if (cls.isAssignableFrom(yv9Var.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public boolean a() {
        WorkDatabase t = this.a.g().t();
        t.e();
        try {
            boolean e = e(this.a);
            t.B();
            return e;
        } finally {
            t.i();
        }
    }

    @NonNull
    public ua7 d() {
        return this.b;
    }

    public void f() {
        j7c g = this.a.g();
        ew9.b(g.n(), g.t(), g.s());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!this.a.h()) {
                if (a()) {
                    so7.a(this.a.g().m(), RescheduleReceiver.class, true);
                    f();
                }
                this.b.a(ua7.a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.a));
        } catch (Throwable th) {
            this.b.a(new ua7.b.a(th));
        }
    }
}
