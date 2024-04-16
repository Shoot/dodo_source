package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.impl.a;
import defpackage.un9;
import defpackage.z2b;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class WorkDatabase extends un9 {
    private static final long p = TimeUnit.DAYS.toMillis(1);

    /* loaded from: classes.dex */
    class a implements z2b.c {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // defpackage.z2b.c
        @NonNull
        public z2b a(@NonNull z2b.b bVar) {
            z2b.b.a a = z2b.b.a(this.a);
            a.c(bVar.b).b(bVar.c).d(true);
            return new p74().a(a.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends un9.b {
        b() {
        }

        @Override // defpackage.un9.b
        public void c(@NonNull y2b y2bVar) {
            super.c(y2bVar);
            y2bVar.beginTransaction();
            try {
                y2bVar.C(WorkDatabase.H());
                y2bVar.X();
            } finally {
                y2bVar.g0();
            }
        }
    }

    @NonNull
    public static WorkDatabase D(@NonNull Context context, @NonNull Executor executor, boolean z) {
        un9.a a2;
        if (z) {
            a2 = tn9.c(context, WorkDatabase.class).c();
        } else {
            a2 = tn9.a(context, WorkDatabase.class, y6c.d());
            a2.f(new a(context));
        }
        return (WorkDatabase) a2.g(executor).a(F()).b(androidx.work.impl.a.a).b(new a.h(context, 2, 3)).b(androidx.work.impl.a.b).b(androidx.work.impl.a.c).b(new a.h(context, 5, 6)).b(androidx.work.impl.a.d).b(androidx.work.impl.a.e).b(androidx.work.impl.a.f).b(new a.i(context)).b(new a.h(context, 10, 11)).b(androidx.work.impl.a.g).e().d();
    }

    static un9.b F() {
        return new b();
    }

    static long G() {
        return System.currentTimeMillis() - p;
    }

    @NonNull
    static String H() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + G() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    @NonNull
    public abstract f03 E();

    @NonNull
    public abstract rh8 I();

    @NonNull
    public abstract i4b J();

    @NonNull
    public abstract l7c K();

    @NonNull
    public abstract n7c L();

    @NonNull
    public abstract androidx.work.impl.model.a M();

    @NonNull
    public abstract v7c N();
}
