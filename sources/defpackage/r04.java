package defpackage;

import io.reactivex.exceptions.CompositeException;
/* compiled from: FlowableDoOnEach.java */
/* renamed from: r04  reason: default package */
/* loaded from: classes3.dex */
public final class r04<T> extends j1<T, T> {
    final wr1<? super T> d;
    final wr1<? super Throwable> e;
    final t4 f;
    final t4 g;

    /* compiled from: FlowableDoOnEach.java */
    /* renamed from: r04$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends g90<T, T> {
        final wr1<? super T> f;
        final wr1<? super Throwable> g;
        final t4 h;
        final t4 i;

        a(hp1<? super T> hp1Var, wr1<? super T> wr1Var, wr1<? super Throwable> wr1Var2, t4 t4Var, t4 t4Var2) {
            super(hp1Var);
            this.f = wr1Var;
            this.g = wr1Var2;
            this.h = t4Var;
            this.i = t4Var2;
        }

        @Override // defpackage.g90, defpackage.i1b
        public void b() {
            if (this.d) {
                return;
            }
            try {
                this.h.run();
                this.d = true;
                this.a.b();
                try {
                    this.i.run();
                } catch (Throwable th) {
                    rl3.b(th);
                    tp9.q(th);
                }
            } catch (Throwable th2) {
                g(th2);
            }
        }

        @Override // defpackage.i1b
        public void d(T t) {
            if (this.d) {
                return;
            }
            if (this.e != 0) {
                this.a.d(null);
                return;
            }
            try {
                this.f.accept(t);
                this.a.d(t);
            } catch (Throwable th) {
                g(th);
            }
        }

        @Override // defpackage.hp1
        public boolean f(T t) {
            if (this.d) {
                return false;
            }
            try {
                this.f.accept(t);
                return this.a.f(t);
            } catch (Throwable th) {
                g(th);
                return false;
            }
        }

        @Override // defpackage.bv8
        public int k(int i) {
            return h(i);
        }

        @Override // defpackage.g90, defpackage.i1b
        public void onError(Throwable th) {
            if (this.d) {
                tp9.q(th);
                return;
            }
            this.d = true;
            try {
                this.g.accept(th);
                this.a.onError(th);
            } catch (Throwable th2) {
                rl3.b(th2);
                this.a.onError(new CompositeException(th, th2));
            }
            try {
                this.i.run();
            } catch (Throwable th3) {
                rl3.b(th3);
                tp9.q(th3);
            }
        }

        @Override // defpackage.rla
        public T poll() throws Exception {
            try {
                T poll = this.c.poll();
                if (poll != null) {
                    try {
                        this.f.accept(poll);
                        this.i.run();
                    } catch (Throwable th) {
                        try {
                            rl3.b(th);
                            this.g.accept(th);
                            throw pl3.c(th);
                        } catch (Throwable th2) {
                            this.i.run();
                            throw th2;
                        }
                    }
                } else if (this.e == 1) {
                    this.h.run();
                    this.i.run();
                }
                return poll;
            } catch (Throwable th3) {
                rl3.b(th3);
                try {
                    this.g.accept(th3);
                    throw pl3.c(th3);
                } catch (Throwable th4) {
                    throw new CompositeException(th3, th4);
                }
            }
        }
    }

    /* compiled from: FlowableDoOnEach.java */
    /* renamed from: r04$b */
    /* loaded from: classes3.dex */
    static final class b<T> extends i90<T, T> {
        final wr1<? super T> f;
        final wr1<? super Throwable> g;
        final t4 h;
        final t4 i;

        b(i1b<? super T> i1bVar, wr1<? super T> wr1Var, wr1<? super Throwable> wr1Var2, t4 t4Var, t4 t4Var2) {
            super(i1bVar);
            this.f = wr1Var;
            this.g = wr1Var2;
            this.h = t4Var;
            this.i = t4Var2;
        }

        @Override // defpackage.i90, defpackage.i1b
        public void b() {
            if (this.d) {
                return;
            }
            try {
                this.h.run();
                this.d = true;
                this.a.b();
                try {
                    this.i.run();
                } catch (Throwable th) {
                    rl3.b(th);
                    tp9.q(th);
                }
            } catch (Throwable th2) {
                g(th2);
            }
        }

        @Override // defpackage.i1b
        public void d(T t) {
            if (this.d) {
                return;
            }
            if (this.e != 0) {
                this.a.d(null);
                return;
            }
            try {
                this.f.accept(t);
                this.a.d(t);
            } catch (Throwable th) {
                g(th);
            }
        }

        @Override // defpackage.bv8
        public int k(int i) {
            return h(i);
        }

        @Override // defpackage.i90, defpackage.i1b
        public void onError(Throwable th) {
            if (this.d) {
                tp9.q(th);
                return;
            }
            this.d = true;
            try {
                this.g.accept(th);
                this.a.onError(th);
            } catch (Throwable th2) {
                rl3.b(th2);
                this.a.onError(new CompositeException(th, th2));
            }
            try {
                this.i.run();
            } catch (Throwable th3) {
                rl3.b(th3);
                tp9.q(th3);
            }
        }

        @Override // defpackage.rla
        public T poll() throws Exception {
            try {
                T poll = this.c.poll();
                if (poll != null) {
                    try {
                        this.f.accept(poll);
                        this.i.run();
                    } catch (Throwable th) {
                        try {
                            rl3.b(th);
                            this.g.accept(th);
                            throw pl3.c(th);
                        } catch (Throwable th2) {
                            this.i.run();
                            throw th2;
                        }
                    }
                } else if (this.e == 1) {
                    this.h.run();
                    this.i.run();
                }
                return poll;
            } catch (Throwable th3) {
                rl3.b(th3);
                try {
                    this.g.accept(th3);
                    throw pl3.c(th3);
                } catch (Throwable th4) {
                    throw new CompositeException(th3, th4);
                }
            }
        }
    }

    public r04(l04<T> l04Var, wr1<? super T> wr1Var, wr1<? super Throwable> wr1Var2, t4 t4Var, t4 t4Var2) {
        super(l04Var);
        this.d = wr1Var;
        this.e = wr1Var2;
        this.f = t4Var;
        this.g = t4Var2;
    }

    @Override // defpackage.l04
    protected void S(i1b<? super T> i1bVar) {
        if (i1bVar instanceof hp1) {
            this.c.R(new a((hp1) i1bVar, this.d, this.e, this.f, this.g));
        } else {
            this.c.R(new b(i1bVar, this.d, this.e, this.f, this.g));
        }
    }
}
