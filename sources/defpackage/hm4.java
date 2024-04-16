package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: hm4  reason: default package */
/* loaded from: classes2.dex */
public class hm4 implements Executor {
    private final Handler a;

    public hm4(@NonNull Looper looper) {
        this.a = new v0d(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.a.post(runnable);
    }
}
