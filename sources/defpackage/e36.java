package defpackage;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* compiled from: LruArrayPool.java */
/* renamed from: e36  reason: default package */
/* loaded from: classes.dex */
public final class e36 implements mr {
    private final si4<a, Object> a = new si4<>();
    private final b b = new b();
    private final Map<Class<?>, NavigableMap<Integer, Integer>> c = new HashMap();
    private final Map<Class<?>, cr<?>> d = new HashMap();
    private final int e;
    private int f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LruArrayPool.java */
    /* renamed from: e36$a */
    /* loaded from: classes.dex */
    public static final class a implements df8 {
        private final b a;
        int b;
        private Class<?> c;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.df8
        public void a() {
            this.a.c(this);
        }

        void b(int i, Class<?> cls) {
            this.b = i;
            this.c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b != aVar.b || this.c != aVar.c) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2 = this.b * 31;
            Class<?> cls = this.c;
            if (cls != null) {
                i = cls.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return "Key{size=" + this.b + "array=" + this.c + CoreConstants.CURLY_RIGHT;
        }
    }

    /* compiled from: LruArrayPool.java */
    /* renamed from: e36$b */
    /* loaded from: classes.dex */
    private static final class b extends r70<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.r70
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        a e(int i, Class<?> cls) {
            a b = b();
            b.b(i, cls);
            return b;
        }
    }

    public e36(int i) {
        this.e = i;
    }

    private void e(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> l = l(cls);
        Integer num = l.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                l.remove(Integer.valueOf(i));
                return;
            } else {
                l.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    private void f() {
        g(this.e);
    }

    private void g(int i) {
        while (this.f > i) {
            Object f = this.a.f();
            eh8.d(f);
            cr h = h(f);
            this.f -= h.c(f) * h.b();
            e(h.c(f), f.getClass());
            if (Log.isLoggable(h.a(), 2)) {
                Log.v(h.a(), "evicted: " + h.c(f));
            }
        }
    }

    private <T> cr<T> h(T t) {
        return i(t.getClass());
    }

    private <T> cr<T> i(Class<T> cls) {
        c65 c65Var = (cr<T>) this.d.get(cls);
        if (c65Var == null) {
            if (cls.equals(int[].class)) {
                c65Var = new c65();
            } else if (cls.equals(byte[].class)) {
                c65Var = new mj0();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.d.put(cls, c65Var);
        }
        return c65Var;
    }

    private <T> T j(a aVar) {
        return (T) this.a.a(aVar);
    }

    private <T> T k(a aVar, Class<T> cls) {
        cr<T> i = i(cls);
        T t = (T) j(aVar);
        if (t != null) {
            this.f -= i.c(t) * i.b();
            e(i.c(t), cls);
        }
        if (t == null) {
            if (Log.isLoggable(i.a(), 2)) {
                Log.v(i.a(), "Allocated " + aVar.b + " bytes");
            }
            return i.newArray(aVar.b);
        }
        return t;
    }

    private NavigableMap<Integer, Integer> l(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.c.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    private boolean m() {
        int i = this.f;
        if (i != 0 && this.e / i < 2) {
            return false;
        }
        return true;
    }

    private boolean n(int i) {
        if (i <= this.e / 2) {
            return true;
        }
        return false;
    }

    private boolean o(int i, Integer num) {
        if (num != null && (m() || num.intValue() <= i * 8)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mr
    public synchronized void a(int i) {
        try {
            if (i >= 40) {
                b();
            } else if (i >= 20 || i == 15) {
                g(this.e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.mr
    public synchronized void b() {
        g(0);
    }

    @Override // defpackage.mr
    public synchronized <T> T c(int i, Class<T> cls) {
        a e;
        try {
            Integer ceilingKey = l(cls).ceilingKey(Integer.valueOf(i));
            if (o(i, ceilingKey)) {
                e = this.b.e(ceilingKey.intValue(), cls);
            } else {
                e = this.b.e(i, cls);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (T) k(e, cls);
    }

    @Override // defpackage.mr
    public synchronized <T> T d(int i, Class<T> cls) {
        return (T) k(this.b.e(i, cls), cls);
    }

    @Override // defpackage.mr
    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        cr<T> i = i(cls);
        int c = i.c(t);
        int b2 = i.b() * c;
        if (!n(b2)) {
            return;
        }
        a e = this.b.e(c, cls);
        this.a.d(e, t);
        NavigableMap<Integer, Integer> l = l(cls);
        Integer num = l.get(Integer.valueOf(e.b));
        Integer valueOf = Integer.valueOf(e.b);
        int i2 = 1;
        if (num != null) {
            i2 = 1 + num.intValue();
        }
        l.put(valueOf, Integer.valueOf(i2));
        this.f += b2;
        f();
    }
}
