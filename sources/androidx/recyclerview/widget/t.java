package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewInfoStore.java */
/* loaded from: classes.dex */
public class t {
    final wka<RecyclerView.d0, a> a = new wka<>();
    final py5<RecyclerView.d0> b = new py5<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewInfoStore.java */
    /* loaded from: classes.dex */
    public static class a {
        static jf8<a> d = new lf8(20);
        int a;
        RecyclerView.m.c b;
        RecyclerView.m.c c;

        private a() {
        }

        static void a() {
            do {
            } while (d.b() != null);
        }

        static a b() {
            a b = d.b();
            if (b == null) {
                return new a();
            }
            return b;
        }

        static void c(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            d.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewInfoStore.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.d0 d0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void b(RecyclerView.d0 d0Var);

        void c(RecyclerView.d0 d0Var, @NonNull RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void d(RecyclerView.d0 d0Var, @NonNull RecyclerView.m.c cVar, @NonNull RecyclerView.m.c cVar2);
    }

    private RecyclerView.m.c l(RecyclerView.d0 d0Var, int i) {
        a o;
        RecyclerView.m.c cVar;
        int h = this.a.h(d0Var);
        if (h >= 0 && (o = this.a.o(h)) != null) {
            int i2 = o.a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                o.a = i3;
                if (i == 4) {
                    cVar = o.b;
                } else if (i == 8) {
                    cVar = o.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.a.m(h);
                    a.c(o);
                }
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RecyclerView.d0 d0Var, RecyclerView.m.c cVar) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.a |= 2;
        aVar.b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(long j, RecyclerView.d0 d0Var) {
        this.b.l(j, d0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(RecyclerView.d0 d0Var, RecyclerView.m.c cVar) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.c = cVar;
        aVar.a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(RecyclerView.d0 d0Var, RecyclerView.m.c cVar) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.b = cVar;
        aVar.a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.a.clear();
        this.b.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.d0 g(long j) {
        return this.b.g(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        if (aVar != null && (aVar.a & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        if (aVar != null && (aVar.a & 4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        a.a();
    }

    public void k(RecyclerView.d0 d0Var) {
        p(d0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.m.c m(RecyclerView.d0 d0Var) {
        return l(d0Var, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.m.c n(RecyclerView.d0 d0Var) {
        return l(d0Var, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(b bVar) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            RecyclerView.d0 k = this.a.k(size);
            a m = this.a.m(size);
            int i = m.a;
            if ((i & 3) == 3) {
                bVar.b(k);
            } else if ((i & 1) != 0) {
                RecyclerView.m.c cVar = m.b;
                if (cVar == null) {
                    bVar.b(k);
                } else {
                    bVar.c(k, cVar, m.c);
                }
            } else if ((i & 14) == 14) {
                bVar.a(k, m.b, m.c);
            } else if ((i & 12) == 12) {
                bVar.d(k, m.b, m.c);
            } else if ((i & 4) != 0) {
                bVar.c(k, m.b, null);
            } else if ((i & 8) != 0) {
                bVar.a(k, m.b, m.c);
            }
            a.c(m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            return;
        }
        aVar.a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(RecyclerView.d0 d0Var) {
        int o = this.b.o() - 1;
        while (true) {
            if (o < 0) {
                break;
            } else if (d0Var == this.b.p(o)) {
                this.b.n(o);
                break;
            } else {
                o--;
            }
        }
        a remove = this.a.remove(d0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
