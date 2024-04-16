package io.realm.internal;

import io.realm.internal.e.b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ObserverPairList.java */
/* loaded from: classes3.dex */
public class e<T extends b> {
    private List<T> a = new CopyOnWriteArrayList();
    private boolean b = false;

    /* compiled from: ObserverPairList.java */
    /* loaded from: classes3.dex */
    public interface a<T extends b> {
        void a(T t, Object obj);
    }

    /* compiled from: ObserverPairList.java */
    /* loaded from: classes3.dex */
    public static abstract class b<T, S> {
        final WeakReference<T> a;
        protected final S b;
        boolean c = false;

        public b(T t, S s) {
            this.b = s;
            this.a = new WeakReference<>(t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.b.equals(bVar.b) && this.a.get() == bVar.a.get()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            T t = this.a.get();
            int i2 = 0;
            if (t != null) {
                i = t.hashCode();
            } else {
                i = 0;
            }
            int i3 = (527 + i) * 31;
            S s = this.b;
            if (s != null) {
                i2 = s.hashCode();
            }
            return i3 + i2;
        }
    }

    public void a(T t) {
        if (!this.a.contains(t)) {
            this.a.add(t);
            t.c = false;
        }
        if (this.b) {
            this.b = false;
        }
    }

    public void b() {
        this.b = true;
        this.a.clear();
    }

    public void c(a<T> aVar) {
        for (T t : this.a) {
            if (!this.b) {
                Object obj = t.a.get();
                if (obj == null) {
                    this.a.remove(t);
                } else if (!t.c) {
                    aVar.a(t, obj);
                }
            } else {
                return;
            }
        }
    }

    public boolean d() {
        return this.a.isEmpty();
    }

    public <S, U> void e(S s, U u) {
        for (T t : this.a) {
            if (s == t.a.get() && u.equals(t.b)) {
                t.c = true;
                this.a.remove(t);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Object obj) {
        for (T t : this.a) {
            Object obj2 = t.a.get();
            if (obj2 == null || obj2 == obj) {
                t.c = true;
                this.a.remove(t);
            }
        }
    }

    public int g() {
        return this.a.size();
    }
}
