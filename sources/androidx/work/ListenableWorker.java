package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class ListenableWorker {
    @NonNull
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    @NonNull
    private WorkerParameters mWorkerParams;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0050a extends a {
            private final androidx.work.b a;

            public C0050a() {
                this(androidx.work.b.c);
            }

            @NonNull
            public androidx.work.b e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && C0050a.class == obj.getClass()) {
                    return this.a.equals(((C0050a) obj).a);
                }
                return false;
            }

            public int hashCode() {
                return (C0050a.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.a + CoreConstants.CURLY_RIGHT;
            }

            public C0050a(@NonNull androidx.work.b bVar) {
                this.a = bVar;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && b.class == obj.getClass()) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {
            private final androidx.work.b a;

            public c() {
                this(androidx.work.b.c);
            }

            @NonNull
            public androidx.work.b e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && c.class == obj.getClass()) {
                    return this.a.equals(((c) obj).a);
                }
                return false;
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.a + CoreConstants.CURLY_RIGHT;
            }

            public c(@NonNull androidx.work.b bVar) {
                this.a = bVar;
            }
        }

        a() {
        }

        @NonNull
        public static a a() {
            return new C0050a();
        }

        @NonNull
        public static a b() {
            return new b();
        }

        @NonNull
        public static a c() {
            return new c();
        }

        @NonNull
        public static a d(@NonNull androidx.work.b bVar) {
            return new c(bVar);
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.mAppContext = context;
                this.mWorkerParams = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    @NonNull
    public kr5<a54> getForegroundInfoAsync() {
        ufa t = ufa.t();
        t.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return t;
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.c();
    }

    @NonNull
    public final b getInputData() {
        return this.mWorkerParams.d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.g();
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.h();
    }

    @NonNull
    public d7b getTaskExecutor() {
        return this.mWorkerParams.i();
    }

    @NonNull
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.j();
    }

    @NonNull
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.k();
    }

    @NonNull
    public a8c getWorkerFactory() {
        return this.mWorkerParams.l();
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    @NonNull
    public final kr5<Void> setForegroundAsync(@NonNull a54 a54Var) {
        this.mRunInForeground = true;
        return this.mWorkerParams.b().a(getApplicationContext(), getId(), a54Var);
    }

    @NonNull
    public kr5<Void> setProgressAsync(@NonNull b bVar) {
        return this.mWorkerParams.f().a(getApplicationContext(), getId(), bVar);
    }

    public void setRunInForeground(boolean z) {
        this.mRunInForeground = z;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    @NonNull
    public abstract kr5<a> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
