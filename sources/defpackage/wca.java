package defpackage;
/* compiled from: SerializedSubscriber.java */
/* renamed from: wca  reason: default package */
/* loaded from: classes3.dex */
public final class wca<T> implements m14<T>, k1b {
    final i1b<? super T> a;
    final boolean b;
    k1b c;
    boolean d;
    mp<Object> e;
    volatile boolean f;

    public wca(i1b<? super T> i1bVar) {
        this(i1bVar, false);
    }

    void a() {
        mp<Object> mpVar;
        do {
            synchronized (this) {
                try {
                    mpVar = this.e;
                    if (mpVar == null) {
                        this.d = false;
                        return;
                    }
                    this.e = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (!mpVar.a((i1b<? super T>) this.a));
    }

    @Override // defpackage.i1b
    public void b() {
        if (this.f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f) {
                    return;
                }
                if (this.d) {
                    mp<Object> mpVar = this.e;
                    if (mpVar == null) {
                        mpVar = new mp<>(4);
                        this.e = mpVar;
                    }
                    mpVar.b(q27.k());
                    return;
                }
                this.f = true;
                this.d = true;
                this.a.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m14, defpackage.i1b
    public void c(k1b k1bVar) {
        if (n1b.x(this.c, k1bVar)) {
            this.c = k1bVar;
            this.a.c(this);
        }
    }

    @Override // defpackage.k1b
    public void cancel() {
        this.c.cancel();
    }

    @Override // defpackage.i1b
    public void d(T t) {
        if (this.f) {
            return;
        }
        if (t == null) {
            this.c.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f) {
                    return;
                }
                if (this.d) {
                    mp<Object> mpVar = this.e;
                    if (mpVar == null) {
                        mpVar = new mp<>(4);
                        this.e = mpVar;
                    }
                    mpVar.b(q27.x(t));
                    return;
                }
                this.d = true;
                this.a.d(t);
                a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.i1b
    public void onError(Throwable th) {
        if (this.f) {
            tp9.q(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f) {
                    if (this.d) {
                        this.f = true;
                        mp<Object> mpVar = this.e;
                        if (mpVar == null) {
                            mpVar = new mp<>(4);
                            this.e = mpVar;
                        }
                        Object o = q27.o(th);
                        if (this.b) {
                            mpVar.b(o);
                        } else {
                            mpVar.d(o);
                        }
                        return;
                    }
                    this.f = true;
                    this.d = true;
                    z = false;
                }
                if (z) {
                    tp9.q(th);
                } else {
                    this.a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.k1b
    public void w(long j) {
        this.c.w(j);
    }

    public wca(i1b<? super T> i1bVar, boolean z) {
        this.a = i1bVar;
        this.b = z;
    }
}
