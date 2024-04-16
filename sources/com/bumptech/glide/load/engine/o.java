package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
/* compiled from: EngineResource.java */
/* loaded from: classes.dex */
class o<Z> implements nj9<Z> {
    private final boolean a;
    private final boolean b;
    private final nj9<Z> c;
    private final a d;
    private final se5 e;
    private int f;
    private boolean g;

    /* compiled from: EngineResource.java */
    /* loaded from: classes.dex */
    interface a {
        void a(se5 se5Var, o<?> oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(nj9<Z> nj9Var, boolean z, boolean z2, se5 se5Var, a aVar) {
        this.c = (nj9) eh8.d(nj9Var);
        this.a = z;
        this.b = z2;
        this.e = se5Var;
        this.d = (a) eh8.d(aVar);
    }

    @Override // defpackage.nj9
    public int a() {
        return this.c.a();
    }

    @Override // defpackage.nj9
    public synchronized void b() {
        if (this.f <= 0) {
            if (!this.g) {
                this.g = true;
                if (this.b) {
                    this.c.b();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    @Override // defpackage.nj9
    @NonNull
    public Class<Z> c() {
        return this.c.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void d() {
        if (!this.g) {
            this.f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public nj9<Z> e() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        boolean z;
        synchronized (this) {
            int i = this.f;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.f = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.d.a(this.e, this);
        }
    }

    @Override // defpackage.nj9
    @NonNull
    public Z get() {
        return this.c.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.d + ", key=" + this.e + ", acquired=" + this.f + ", isRecycled=" + this.g + ", resource=" + this.c + CoreConstants.CURLY_RIGHT;
    }
}
