package com.android.volley;
/* loaded from: classes.dex */
public class VolleyError extends Exception {
    public final iw6 a;
    private long b;

    public VolleyError() {
        this.a = null;
    }

    public long a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(long j) {
        this.b = j;
    }

    public VolleyError(iw6 iw6Var) {
        this.a = iw6Var;
    }

    public VolleyError(Throwable th) {
        super(th);
        this.a = null;
    }
}
