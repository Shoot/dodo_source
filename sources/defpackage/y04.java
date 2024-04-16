package defpackage;

import java.util.Iterator;
/* compiled from: FlowableFromIterable.java */
/* renamed from: y04  reason: default package */
/* loaded from: classes3.dex */
public final class y04<T> extends l04<T> {
    final Iterable<? extends T> c;

    /* compiled from: FlowableFromIterable.java */
    /* renamed from: y04$a */
    /* loaded from: classes3.dex */
    static abstract class a<T> extends o90<T> {
        Iterator<? extends T> a;
        volatile boolean b;
        boolean c;

        a(Iterator<? extends T> it) {
            this.a = it;
        }

        abstract void a();

        abstract void b(long j);

        @Override // defpackage.k1b
        public final void cancel() {
            this.b = true;
        }

        @Override // defpackage.rla
        public final void clear() {
            this.a = null;
        }

        @Override // defpackage.rla
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.a;
            if (it != null && it.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // defpackage.bv8
        public final int k(int i) {
            return i & 1;
        }

        @Override // defpackage.rla
        public final T poll() {
            Iterator<? extends T> it = this.a;
            if (it == null) {
                return null;
            }
            if (!this.c) {
                this.c = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return (T) x47.e(this.a.next(), "Iterator.next() returned a null value");
        }

        @Override // defpackage.k1b
        public final void w(long j) {
            if (n1b.u(j) && g60.a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    a();
                } else {
                    b(j);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableFromIterable.java */
    /* renamed from: y04$b */
    /* loaded from: classes3.dex */
    public static final class b<T> extends a<T> {
        final hp1<? super T> d;

        b(hp1<? super T> hp1Var, Iterator<? extends T> it) {
            super(it);
            this.d = hp1Var;
        }

        @Override // defpackage.y04.a
        void a() {
            Iterator<? extends T> it = this.a;
            hp1<? super T> hp1Var = this.d;
            while (!this.b) {
                try {
                    Object obj = (T) it.next();
                    if (this.b) {
                        return;
                    }
                    if (obj == null) {
                        hp1Var.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    hp1Var.f(obj);
                    if (this.b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (!this.b) {
                                hp1Var.b();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        rl3.b(th);
                        hp1Var.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    rl3.b(th2);
                    hp1Var.onError(th2);
                    return;
                }
            }
        }

        @Override // defpackage.y04.a
        void b(long j) {
            Iterator<? extends T> it = this.a;
            hp1<? super T> hp1Var = this.d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 != j) {
                        if (this.b) {
                            return;
                        }
                        try {
                            Object obj = (T) it.next();
                            if (this.b) {
                                return;
                            }
                            if (obj == null) {
                                hp1Var.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean f = hp1Var.f(obj);
                            if (this.b) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (!this.b) {
                                        hp1Var.b();
                                        return;
                                    }
                                    return;
                                } else if (f) {
                                    j2++;
                                }
                            } catch (Throwable th) {
                                rl3.b(th);
                                hp1Var.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            rl3.b(th2);
                            hp1Var.onError(th2);
                            return;
                        }
                    } else {
                        j = get();
                        if (j2 == j) {
                            j = addAndGet(-j2);
                        }
                    }
                }
            } while (j != 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableFromIterable.java */
    /* renamed from: y04$c */
    /* loaded from: classes3.dex */
    public static final class c<T> extends a<T> {
        final i1b<? super T> d;

        c(i1b<? super T> i1bVar, Iterator<? extends T> it) {
            super(it);
            this.d = i1bVar;
        }

        @Override // defpackage.y04.a
        void a() {
            Iterator<? extends T> it = this.a;
            i1b<? super T> i1bVar = this.d;
            while (!this.b) {
                try {
                    Object obj = (T) it.next();
                    if (this.b) {
                        return;
                    }
                    if (obj == null) {
                        i1bVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    i1bVar.d(obj);
                    if (this.b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (!this.b) {
                                i1bVar.b();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        rl3.b(th);
                        i1bVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    rl3.b(th2);
                    i1bVar.onError(th2);
                    return;
                }
            }
        }

        @Override // defpackage.y04.a
        void b(long j) {
            Iterator<? extends T> it = this.a;
            i1b<? super T> i1bVar = this.d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 != j) {
                        if (this.b) {
                            return;
                        }
                        try {
                            Object obj = (T) it.next();
                            if (this.b) {
                                return;
                            }
                            if (obj == null) {
                                i1bVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            i1bVar.d(obj);
                            if (this.b) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (!this.b) {
                                        i1bVar.b();
                                        return;
                                    }
                                    return;
                                }
                                j2++;
                            } catch (Throwable th) {
                                rl3.b(th);
                                i1bVar.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            rl3.b(th2);
                            i1bVar.onError(th2);
                            return;
                        }
                    } else {
                        j = get();
                        if (j2 == j) {
                            j = addAndGet(-j2);
                        }
                    }
                }
            } while (j != 0);
        }
    }

    public y04(Iterable<? extends T> iterable) {
        this.c = iterable;
    }

    public static <T> void c0(i1b<? super T> i1bVar, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                vg3.a(i1bVar);
            } else if (i1bVar instanceof hp1) {
                i1bVar.c(new b((hp1) i1bVar, it));
            } else {
                i1bVar.c(new c(i1bVar, it));
            }
        } catch (Throwable th) {
            rl3.b(th);
            vg3.i(th, i1bVar);
        }
    }

    @Override // defpackage.l04
    public void S(i1b<? super T> i1bVar) {
        try {
            c0(i1bVar, this.c.iterator());
        } catch (Throwable th) {
            rl3.b(th);
            vg3.i(th, i1bVar);
        }
    }
}
