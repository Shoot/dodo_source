package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
/* compiled from: WorkManagerTaskExecutor.java */
/* renamed from: k7c  reason: default package */
/* loaded from: classes.dex */
public class k7c implements d7b {
    private final kca a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final Executor c = new a();

    /* compiled from: WorkManagerTaskExecutor.java */
    /* renamed from: k7c$a */
    /* loaded from: classes.dex */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            k7c.this.d(runnable);
        }
    }

    public k7c(@NonNull Executor executor) {
        this.a = new kca(executor);
    }

    @Override // defpackage.d7b
    public Executor a() {
        return this.c;
    }

    @Override // defpackage.d7b
    public void b(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // defpackage.d7b
    @NonNull
    public kca c() {
        return this.a;
    }

    public void d(Runnable runnable) {
        this.b.post(runnable);
    }
}
