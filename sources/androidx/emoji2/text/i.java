package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.emoji2.text.e;
import androidx.emoji2.text.i;
import defpackage.w34;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
/* compiled from: FontRequestEmojiCompatConfig.java */
/* loaded from: classes.dex */
public class i extends e.c {
    private static final a j = new a();

    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class a {
        public Typeface a(@NonNull Context context, @NonNull w34.b bVar) throws PackageManager.NameNotFoundException {
            return w34.a(context, null, new w34.b[]{bVar});
        }

        @NonNull
        public w34.a b(@NonNull Context context, @NonNull n34 n34Var) throws PackageManager.NameNotFoundException {
            return w34.b(context, null, n34Var);
        }

        public void c(@NonNull Context context, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class b implements e.g {
        @NonNull
        private final Context a;
        @NonNull
        private final n34 b;
        @NonNull
        private final a c;
        @NonNull
        private final Object d = new Object();
        private Handler e;
        private Executor f;
        private ThreadPoolExecutor g;
        e.h h;
        private ContentObserver i;
        private Runnable j;

        b(@NonNull Context context, @NonNull n34 n34Var, @NonNull a aVar) {
            kh8.g(context, "Context cannot be null");
            kh8.g(n34Var, "FontRequest cannot be null");
            this.a = context.getApplicationContext();
            this.b = n34Var;
            this.c = aVar;
        }

        private void b() {
            synchronized (this.d) {
                try {
                    this.h = null;
                    ContentObserver contentObserver = this.i;
                    if (contentObserver != null) {
                        this.c.c(this.a, contentObserver);
                        this.i = null;
                    }
                    Handler handler = this.e;
                    if (handler != null) {
                        handler.removeCallbacks(this.j);
                    }
                    this.e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f = null;
                    this.g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private w34.b e() {
            try {
                w34.a b = this.c.b(this.a, this.b);
                if (b.c() == 0) {
                    w34.b[] b2 = b.b();
                    if (b2 != null && b2.length != 0) {
                        return b2[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b.c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        @Override // androidx.emoji2.text.e.g
        public void a(@NonNull e.h hVar) {
            kh8.g(hVar, "LoaderCallback cannot be null");
            synchronized (this.d) {
                this.h = hVar;
            }
            d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c() {
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    try {
                        w34.b e = e();
                        int b = e.b();
                        if (b == 2) {
                            synchronized (this.d) {
                            }
                        }
                        if (b == 0) {
                            ujb.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface a = this.c.a(this.a, e);
                            ByteBuffer f = qob.f(this.a, null, e.d());
                            if (f != null && a != null) {
                                l b2 = l.b(a, f);
                                ujb.b();
                                synchronized (this.d) {
                                    e.h hVar = this.h;
                                    if (hVar != null) {
                                        hVar.b(b2);
                                    }
                                }
                                b();
                                return;
                            }
                            throw new RuntimeException("Unable to open file.");
                        }
                        throw new RuntimeException("fetchFonts result is not OK. (" + b + ")");
                    } catch (Throwable th) {
                        synchronized (this.d) {
                            try {
                                e.h hVar2 = this.h;
                                if (hVar2 != null) {
                                    hVar2.a(th);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        void d() {
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    if (this.f == null) {
                        ThreadPoolExecutor b = androidx.emoji2.text.b.b("emojiCompat");
                        this.g = b;
                        this.f = b;
                    }
                    this.f.execute(new Runnable() { // from class: androidx.emoji2.text.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            i.b.this.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void f(@NonNull Executor executor) {
            synchronized (this.d) {
                this.f = executor;
            }
        }
    }

    public i(@NonNull Context context, @NonNull n34 n34Var) {
        super(new b(context, n34Var, j));
    }

    @NonNull
    public i c(@NonNull Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
