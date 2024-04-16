package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: abd  reason: default package */
/* loaded from: classes2.dex */
final class abd implements Executor {
    private final Handler a = new rlc(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.a.post(runnable);
    }
}
