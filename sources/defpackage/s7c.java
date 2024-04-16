package defpackage;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.b;
import androidx.work.impl.model.WorkSpec;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
/* compiled from: WorkRequest.java */
/* renamed from: s7c  reason: default package */
/* loaded from: classes.dex */
public abstract class s7c {
    @NonNull
    private UUID a;
    @NonNull
    private WorkSpec b;
    @NonNull
    private Set<String> c;

    /* compiled from: WorkRequest.java */
    /* renamed from: s7c$a */
    /* loaded from: classes.dex */
    public static abstract class a<B extends a<?, ?>, W extends s7c> {
        WorkSpec c;
        Class<? extends ListenableWorker> e;
        boolean a = false;
        Set<String> d = new HashSet();
        UUID b = UUID.randomUUID();

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(@NonNull Class<? extends ListenableWorker> cls) {
            this.e = cls;
            this.c = new WorkSpec(this.b.toString(), cls.getName());
            a(cls.getName());
        }

        @NonNull
        public final B a(@NonNull String str) {
            this.d.add(str);
            return d();
        }

        @NonNull
        public final W b() {
            boolean z;
            W c = c();
            or1 or1Var = this.c.j;
            int i = Build.VERSION.SDK_INT;
            if ((i < 24 || !or1Var.e()) && !or1Var.f() && !or1Var.g() && (i < 23 || !or1Var.h())) {
                z = false;
            } else {
                z = true;
            }
            WorkSpec workSpec = this.c;
            if (workSpec.q) {
                if (!z) {
                    if (workSpec.g > 0) {
                        throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                    }
                } else {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
            }
            this.b = UUID.randomUUID();
            WorkSpec workSpec2 = new WorkSpec(this.c);
            this.c = workSpec2;
            workSpec2.a = this.b.toString();
            return c;
        }

        @NonNull
        abstract W c();

        @NonNull
        abstract B d();

        @NonNull
        public final B e(@NonNull f60 f60Var, long j, @NonNull TimeUnit timeUnit) {
            this.a = true;
            WorkSpec workSpec = this.c;
            workSpec.l = f60Var;
            workSpec.e(timeUnit.toMillis(j));
            return d();
        }

        @NonNull
        public final B f(@NonNull or1 or1Var) {
            this.c.j = or1Var;
            return d();
        }

        @NonNull
        public B g(long j, @NonNull TimeUnit timeUnit) {
            this.c.g = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.c.g) {
                return d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        @NonNull
        public final B h(@NonNull b bVar) {
            this.c.e = bVar;
            return d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public s7c(@NonNull UUID uuid, @NonNull WorkSpec workSpec, @NonNull Set<String> set) {
        this.a = uuid;
        this.b = workSpec;
        this.c = set;
    }

    @NonNull
    public String a() {
        return this.a.toString();
    }

    @NonNull
    public Set<String> b() {
        return this.c;
    }

    @NonNull
    public WorkSpec c() {
        return this.b;
    }
}
