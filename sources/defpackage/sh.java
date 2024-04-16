package defpackage;

import java.util.Locale;
/* compiled from: AndroidLogger.java */
/* renamed from: sh  reason: default package */
/* loaded from: classes2.dex */
public class sh {
    private static volatile sh c;
    private final kx5 a;
    private boolean b;

    public sh(kx5 kx5Var) {
        this.b = false;
        this.a = kx5Var == null ? kx5.c() : kx5Var;
    }

    public static sh e() {
        if (c == null) {
            synchronized (sh.class) {
                try {
                    if (c == null) {
                        c = new sh();
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public void a(String str) {
        if (this.b) {
            this.a.a(str);
        }
    }

    public void b(String str, Object... objArr) {
        if (this.b) {
            this.a.a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void c(String str) {
        if (this.b) {
            this.a.b(str);
        }
    }

    public void d(String str, Object... objArr) {
        if (this.b) {
            this.a.b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void f(String str) {
        if (this.b) {
            this.a.d(str);
        }
    }

    public void g(String str, Object... objArr) {
        if (this.b) {
            this.a.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public boolean h() {
        return this.b;
    }

    public void i(boolean z) {
        this.b = z;
    }

    public void j(String str) {
        if (this.b) {
            this.a.e(str);
        }
    }

    public void k(String str, Object... objArr) {
        if (this.b) {
            this.a.e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    private sh() {
        this(null);
    }
}
