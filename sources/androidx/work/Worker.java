package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    ufa<ListenableWorker.a> mFuture;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.mFuture.p(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.q(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @NonNull
    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    @NonNull
    public final kr5<ListenableWorker.a> startWork() {
        this.mFuture = ufa.t();
        getBackgroundExecutor().execute(new a());
        return this.mFuture;
    }
}
