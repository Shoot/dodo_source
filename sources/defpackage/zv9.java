package defpackage;

import android.app.job.JobInfo;
import ch.qos.logback.core.CoreConstants;
import com.google.auto.value.AutoValue;
import defpackage.f30;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: SchedulerConfig.java */
@AutoValue
/* renamed from: zv9  reason: default package */
/* loaded from: classes2.dex */
public abstract class zv9 {

    /* compiled from: SchedulerConfig.java */
    /* renamed from: zv9$a */
    /* loaded from: classes2.dex */
    public static class a {
        private x91 a;
        private Map<xj8, b> b = new HashMap();

        public a a(xj8 xj8Var, b bVar) {
            this.b.put(xj8Var, bVar);
            return this;
        }

        public zv9 b() {
            if (this.a != null) {
                if (this.b.keySet().size() >= xj8.values().length) {
                    Map<xj8, b> map = this.b;
                    this.b = new HashMap();
                    return zv9.d(this.a, map);
                }
                throw new IllegalStateException("Not all priorities have been configured");
            }
            throw new NullPointerException("missing required property: clock");
        }

        public a c(x91 x91Var) {
            this.a = x91Var;
            return this;
        }
    }

    /* compiled from: SchedulerConfig.java */
    @AutoValue
    /* renamed from: zv9$b */
    /* loaded from: classes2.dex */
    public static abstract class b {

        /* compiled from: SchedulerConfig.java */
        @AutoValue.Builder
        /* renamed from: zv9$b$a */
        /* loaded from: classes2.dex */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j);

            public abstract a c(Set<c> set);

            public abstract a d(long j);
        }

        public static a a() {
            return new f30.b().c(Collections.emptySet());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Set<c> c();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long d();
    }

    /* compiled from: SchedulerConfig.java */
    /* renamed from: zv9$c */
    /* loaded from: classes2.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i, long j) {
        long j2;
        int i2 = i - 1;
        if (j > 1) {
            j2 = j;
        } else {
            j2 = 2;
        }
        return (long) (Math.pow(3.0d, i2) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log(j2 * i2)));
    }

    public static a b() {
        return new a();
    }

    static zv9 d(x91 x91Var, Map<xj8, b> map) {
        return new e30(x91Var, map);
    }

    public static zv9 f(x91 x91Var) {
        return b().a(xj8.DEFAULT, b.a().b(30000L).d(CoreConstants.MILLIS_IN_ONE_DAY).a()).a(xj8.HIGHEST, b.a().b(1000L).d(CoreConstants.MILLIS_IN_ONE_DAY).a()).a(xj8.VERY_LOW, b.a().b(CoreConstants.MILLIS_IN_ONE_DAY).d(CoreConstants.MILLIS_IN_ONE_DAY).c(i(c.DEVICE_IDLE)).a()).c(x91Var).b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, xj8 xj8Var, long j, int i) {
        builder.setMinimumLatency(g(xj8Var, j, i));
        j(builder, h().get(xj8Var).c());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract x91 e();

    public long g(xj8 xj8Var, long j, int i) {
        long a2 = j - e().a();
        b bVar = h().get(xj8Var);
        return Math.min(Math.max(a(i, bVar.b()), a2), bVar.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<xj8, b> h();
}
