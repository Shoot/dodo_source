package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
/* compiled from: DefaultRunnableScheduler.java */
/* renamed from: mr2  reason: default package */
/* loaded from: classes.dex */
public class mr2 implements qp9 {
    private final Handler a = cm4.a(Looper.getMainLooper());

    @Override // defpackage.qp9
    public void a(@NonNull Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.qp9
    public void b(long j, @NonNull Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
