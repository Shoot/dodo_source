package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import defpackage.pw4;
import defpackage.ru4;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AsyncDrawableLoaderImpl.java */
/* renamed from: ay  reason: default package */
/* loaded from: classes3.dex */
public class ay extends yx {
    private final ExecutorService a;
    private final Map<String, qw9> b;
    private final Map<String, kc6> c;
    private final kc6 d;
    private final Handler e;
    private final Map<xx, Future<?>> f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncDrawableLoaderImpl.java */
    /* renamed from: ay$a */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        final /* synthetic */ xx a;

        /* compiled from: AsyncDrawableLoaderImpl.java */
        /* renamed from: ay$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0059a implements Runnable {
            final /* synthetic */ Drawable a;

            RunnableC0059a(Drawable drawable) {
                this.a = drawable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (((Future) ay.this.f.remove(a.this.a)) != null && this.a != null && a.this.a.i()) {
                    a.this.a.n(this.a);
                }
            }
        }

        a(xx xxVar) {
            this.a = xxVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rect bounds;
            String scheme;
            String a = this.a.a();
            Uri parse = Uri.parse(a);
            Drawable drawable = null;
            try {
                scheme = parse.getScheme();
            } catch (Throwable th) {
                ay.h(ay.this);
                Log.e("MARKWON-IMAGE", "Error loading image: " + a, th);
            }
            if (scheme != null && scheme.length() != 0) {
                qw9 qw9Var = (qw9) ay.this.b.get(scheme);
                if (qw9Var != null) {
                    ru4 a2 = qw9Var.a(a, parse);
                    if (a2.c()) {
                        ru4.b a3 = a2.a();
                        kc6 kc6Var = (kc6) ay.this.c.get(a3.e());
                        if (kc6Var == null) {
                            kc6Var = ay.this.d;
                        }
                        if (kc6Var != null) {
                            drawable = kc6Var.a(a3.e(), a3.f());
                            try {
                                a3.f().close();
                            } catch (IOException e) {
                                Log.e("MARKWON-IMAGE", "Error closing inputStream", e);
                            }
                            if (drawable != null && ((bounds = drawable.getBounds()) == null || bounds.isEmpty())) {
                                u83.a(drawable);
                            }
                            ay.this.e.postAtTime(new RunnableC0059a(drawable), this.a, SystemClock.uptimeMillis());
                            return;
                        }
                        throw new IllegalStateException("No media-decoder is found: " + a);
                    }
                    a2.b();
                    throw null;
                }
                throw new IllegalStateException("No scheme-handler is found: " + a);
            }
            throw new IllegalStateException("No scheme is found: " + a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ay(@NonNull zx zxVar) {
        this(zxVar, new Handler(Looper.getMainLooper()));
    }

    static /* synthetic */ pw4.a h(ay ayVar) {
        ayVar.getClass();
        return null;
    }

    @NonNull
    private Future<?> k(@NonNull xx xxVar) {
        return this.a.submit(new a(xxVar));
    }

    @Override // defpackage.yx
    public void a(@NonNull xx xxVar) {
        Future<?> remove = this.f.remove(xxVar);
        if (remove != null) {
            remove.cancel(true);
        }
        this.e.removeCallbacksAndMessages(xxVar);
    }

    @Override // defpackage.yx
    public void b(@NonNull xx xxVar) {
        if (this.f.get(xxVar) == null) {
            this.f.put(xxVar, k(xxVar));
        }
    }

    @Override // defpackage.yx
    public Drawable d(@NonNull xx xxVar) {
        return null;
    }

    ay(@NonNull zx zxVar, @NonNull Handler handler) {
        this.f = new HashMap(2);
        this.a = zxVar.a;
        this.b = zxVar.b;
        this.c = zxVar.c;
        this.d = zxVar.d;
        this.e = handler;
    }
}
