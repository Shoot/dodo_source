package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.NonNull;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.profileinstaller.f;
import ch.qos.logback.classic.Level;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements y25<c> {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        public static void c(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.g
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    runnable.run();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        public static Handler a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(@NonNull final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: jn8
            @Override // java.lang.Runnable
            public final void run() {
                f.i(context);
            }
        });
    }

    @Override // defpackage.y25
    @NonNull
    public List<Class<? extends y25<?>>> a() {
        return Collections.emptyList();
    }

    @Override // defpackage.y25
    @NonNull
    /* renamed from: f */
    public c b(@NonNull Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new c();
        }
        g(context.getApplicationContext());
        return new c();
    }

    void g(@NonNull final Context context) {
        a.c(new Runnable() { // from class: hn8
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.this.i(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void i(@NonNull final Context context) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = b.a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new Runnable() { // from class: in8
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.l(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + Level.TRACE_INT);
    }
}
