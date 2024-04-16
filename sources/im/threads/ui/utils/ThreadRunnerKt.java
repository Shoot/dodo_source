package im.threads.ui.utils;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
/* compiled from: ThreadRunner.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"runOnUiThread", "", "Ljava/lang/Runnable;", "threads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThreadRunnerKt {
    public static final void runOnUiThread(Runnable runnable) {
        z65.h(runnable, "<this>");
        if (z65.c(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }
}
