package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.annotation.NonNull;
/* compiled from: WindowInsetsControllerCompat.java */
/* renamed from: z5c  reason: default package */
/* loaded from: classes.dex */
public final class z5c {
    private final e a;

    /* compiled from: WindowInsetsControllerCompat.java */
    /* renamed from: z5c$a */
    /* loaded from: classes.dex */
    private static class a extends e {
        @NonNull
        protected final Window a;
        @NonNull
        private final View b;

        a(@NonNull Window window, @NonNull View view) {
            this.a = window;
            this.b = view;
        }

        protected void c(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        protected void d(int i) {
            this.a.addFlags(i);
        }

        protected void e(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        protected void f(int i) {
            this.a.clearFlags(i);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* renamed from: z5c$b */
    /* loaded from: classes.dex */
    private static class b extends a {
        b(@NonNull Window window, View view) {
            super(window, view);
        }

        @Override // defpackage.z5c.e
        public void b(boolean z) {
            if (z) {
                f(67108864);
                d(Integer.MIN_VALUE);
                c(8192);
                return;
            }
            e(8192);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* renamed from: z5c$c */
    /* loaded from: classes.dex */
    private static class c extends b {
        c(@NonNull Window window, View view) {
            super(window, view);
        }

        @Override // defpackage.z5c.e
        public void a(boolean z) {
            if (z) {
                f(134217728);
                d(Integer.MIN_VALUE);
                c(16);
                return;
            }
            e(16);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* renamed from: z5c$d */
    /* loaded from: classes.dex */
    private static class d extends e {
        final z5c a;
        final WindowInsetsController b;
        private final wka<Object, WindowInsetsController.OnControllableInsetsChangedListener> c;
        protected Window d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        d(@androidx.annotation.NonNull android.view.Window r2, @androidx.annotation.NonNull defpackage.z5c r3) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = defpackage.b6c.a(r2)
                r1.<init>(r0, r3)
                r1.d = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.z5c.d.<init>(android.view.Window, z5c):void");
        }

        @Override // defpackage.z5c.e
        public void a(boolean z) {
            if (z) {
                if (this.d != null) {
                    c(16);
                }
                this.b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.d != null) {
                d(16);
            }
            this.b.setSystemBarsAppearance(0, 16);
        }

        @Override // defpackage.z5c.e
        public void b(boolean z) {
            if (z) {
                if (this.d != null) {
                    c(8192);
                }
                this.b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.d != null) {
                d(8192);
            }
            this.b.setSystemBarsAppearance(0, 8);
        }

        protected void c(int i) {
            View decorView = this.d.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        protected void d(int i) {
            View decorView = this.d.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        d(@NonNull WindowInsetsController windowInsetsController, @NonNull z5c z5cVar) {
            this.c = new wka<>();
            this.b = windowInsetsController;
            this.a = z5cVar;
        }
    }

    @Deprecated
    private z5c(@NonNull WindowInsetsController windowInsetsController) {
        this.a = new d(windowInsetsController, this);
    }

    @NonNull
    @Deprecated
    public static z5c c(@NonNull WindowInsetsController windowInsetsController) {
        return new z5c(windowInsetsController);
    }

    public void a(boolean z) {
        this.a.a(z);
    }

    public void b(boolean z) {
        this.a.b(z);
    }

    public z5c(@NonNull Window window, @NonNull View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.a = new d(window, this);
        } else if (i >= 26) {
            this.a = new c(window, view);
        } else if (i >= 23) {
            this.a = new b(window, view);
        } else {
            this.a = new a(window, view);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* renamed from: z5c$e */
    /* loaded from: classes.dex */
    private static class e {
        e() {
        }

        public void a(boolean z) {
        }

        public void b(boolean z) {
        }
    }
}
