package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.e;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements y25<Boolean> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends e.c {
        protected a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements e.g {
        private final Context a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends e.h {
            final /* synthetic */ e.h a;
            final /* synthetic */ ThreadPoolExecutor b;

            a(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.a = hVar;
                this.b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.e.h
            public void a(Throwable th) {
                try {
                    this.a.a(th);
                } finally {
                    this.b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.e.h
            public void b(@NonNull l lVar) {
                try {
                    this.a.b(lVar);
                } finally {
                    this.b.shutdown();
                }
            }
        }

        b(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.e.g
        public void a(@NonNull final e.h hVar) {
            final ThreadPoolExecutor b = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            b.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b.this.d(hVar, b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public void d(@NonNull e.h hVar, @NonNull ThreadPoolExecutor threadPoolExecutor) {
            try {
                i a2 = androidx.emoji2.text.c.a(this.a);
                if (a2 != null) {
                    a2.c(threadPoolExecutor);
                    a2.a().a(new a(hVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                hVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ujb.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.h()) {
                    e.b().k();
                }
            } finally {
                ujb.b();
            }
        }
    }

    @Override // defpackage.y25
    @NonNull
    public List<Class<? extends y25<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.y25
    @NonNull
    /* renamed from: c */
    public Boolean b(@NonNull Context context) {
        e.g(new a(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(@NonNull Context context) {
        final androidx.lifecycle.d lifecycle = ((op5) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new pq2() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // defpackage.pq2
            public /* synthetic */ void onCreate(op5 op5Var) {
                oq2.a(this, op5Var);
            }

            @Override // defpackage.pq2
            public /* synthetic */ void onDestroy(op5 op5Var) {
                oq2.b(this, op5Var);
            }

            @Override // defpackage.pq2
            public /* synthetic */ void onPause(op5 op5Var) {
                oq2.c(this, op5Var);
            }

            @Override // defpackage.pq2
            public void onResume(@NonNull op5 op5Var) {
                EmojiCompatInitializer.this.e();
                lifecycle.d(this);
            }

            @Override // defpackage.pq2
            public /* synthetic */ void onStart(op5 op5Var) {
                oq2.e(this, op5Var);
            }

            @Override // defpackage.pq2
            public /* synthetic */ void onStop(op5 op5Var) {
                oq2.f(this, op5Var);
            }
        });
    }

    void e() {
        androidx.emoji2.text.b.d().postDelayed(new c(), 500L);
    }
}
