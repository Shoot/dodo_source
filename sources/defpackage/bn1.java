package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import defpackage.bn1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ComponentRuntime.java */
/* renamed from: bn1  reason: default package */
/* loaded from: classes2.dex */
public class bn1 implements im1, sm1 {
    private static final bs8<Set<Object>> i = new bs8() { // from class: ym1
        @Override // defpackage.bs8
        public final Object get() {
            return Collections.emptySet();
        }
    };
    private final Map<bm1<?>, bs8<?>> a;
    private final Map<su8<?>, bs8<?>> b;
    private final Map<su8<?>, ao5<?>> c;
    private final List<bs8<ComponentRegistrar>> d;
    private Set<String> e;
    private final rk3 f;
    private final AtomicReference<Boolean> g;
    private final wm1 h;

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List<bm1<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator<bs8<ComponentRegistrar>> it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator<bm1<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = it2.next().j().toArray();
                int length = array.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Object obj = array[i2];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.e.add(obj.toString());
                        }
                        i2++;
                    }
                }
            }
            if (this.a.isEmpty()) {
                i62.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.a.keySet());
                arrayList2.addAll(list);
                i62.a(arrayList2);
            }
            for (final bm1<?> bm1Var : list) {
                this.a.put(bm1Var, new qn5(new bs8() { // from class: xm1
                    @Override // defpackage.bs8
                    public final Object get() {
                        Object r;
                        r = bn1.this.r(bm1Var);
                        return r;
                    }
                }));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        u();
    }

    private void o(Map<bm1<?>, bs8<?>> map, boolean z) {
        for (Map.Entry<bm1<?>, bs8<?>> entry : map.entrySet()) {
            bm1<?> key = entry.getKey();
            bs8<?> value = entry.getValue();
            if (key.n() || (key.o() && z)) {
                value.get();
            }
        }
        this.f.d();
    }

    private static <T> List<T> q(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(t);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(bm1 bm1Var) {
        return bm1Var.h().a(new pk9(bm1Var, this));
    }

    private void u() {
        Boolean bool = this.g.get();
        if (bool != null) {
            o(this.a, bool.booleanValue());
        }
    }

    private void v() {
        for (bm1<?> bm1Var : this.a.keySet()) {
            for (d03 d03Var : bm1Var.g()) {
                if (d03Var.g() && !this.c.containsKey(d03Var.c())) {
                    this.c.put(d03Var.c(), ao5.b(Collections.emptySet()));
                } else if (this.b.containsKey(d03Var.c())) {
                    continue;
                } else if (!d03Var.f()) {
                    if (!d03Var.g()) {
                        this.b.put(d03Var.c(), yb7.e());
                    }
                } else {
                    throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", bm1Var, d03Var.c()));
                }
            }
        }
    }

    private List<Runnable> w(List<bm1<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (bm1<?> bm1Var : list) {
            if (bm1Var.p()) {
                final bs8<?> bs8Var = this.a.get(bm1Var);
                for (su8<? super Object> su8Var : bm1Var.j()) {
                    if (!this.b.containsKey(su8Var)) {
                        this.b.put(su8Var, bs8Var);
                    } else {
                        final yb7 yb7Var = (yb7) this.b.get(su8Var);
                        arrayList.add(new Runnable() { // from class: zm1
                            @Override // java.lang.Runnable
                            public final void run() {
                                yb7.this.j(bs8Var);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> x() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<bm1<?>, bs8<?>> entry : this.a.entrySet()) {
            bm1<?> key = entry.getKey();
            if (!key.p()) {
                bs8<?> value = entry.getValue();
                for (su8<? super Object> su8Var : key.j()) {
                    if (!hashMap.containsKey(su8Var)) {
                        hashMap.put(su8Var, new HashSet());
                    }
                    ((Set) hashMap.get(su8Var)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.c.containsKey(entry2.getKey())) {
                this.c.put((su8) entry2.getKey(), ao5.b((Collection) entry2.getValue()));
            } else {
                final ao5<?> ao5Var = this.c.get(entry2.getKey());
                for (final bs8 bs8Var : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: an1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ao5.this.a(bs8Var);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.im1
    public /* synthetic */ Object a(Class cls) {
        return hm1.b(this, cls);
    }

    @Override // defpackage.im1
    public synchronized <T> bs8<Set<T>> b(su8<T> su8Var) {
        ao5<?> ao5Var = this.c.get(su8Var);
        if (ao5Var != null) {
            return ao5Var;
        }
        return (bs8<Set<T>>) i;
    }

    @Override // defpackage.im1
    public /* synthetic */ Set c(Class cls) {
        return hm1.f(this, cls);
    }

    @Override // defpackage.im1
    public synchronized <T> bs8<T> d(su8<T> su8Var) {
        ih8.c(su8Var, "Null interface requested.");
        return (bs8<T>) this.b.get(su8Var);
    }

    @Override // defpackage.im1
    public /* synthetic */ Object e(su8 su8Var) {
        return hm1.a(this, su8Var);
    }

    @Override // defpackage.im1
    public /* synthetic */ Set f(su8 su8Var) {
        return hm1.e(this, su8Var);
    }

    @Override // defpackage.im1
    public /* synthetic */ bs8 g(Class cls) {
        return hm1.d(this, cls);
    }

    @Override // defpackage.im1
    public <T> gs2<T> h(su8<T> su8Var) {
        bs8<T> d = d(su8Var);
        if (d == null) {
            return yb7.e();
        }
        if (d instanceof yb7) {
            return (yb7) d;
        }
        return yb7.i(d);
    }

    @Override // defpackage.im1
    public /* synthetic */ gs2 i(Class cls) {
        return hm1.c(this, cls);
    }

    public void p(boolean z) {
        HashMap hashMap;
        if (!ho1.a(this.g, null, Boolean.valueOf(z))) {
            return;
        }
        synchronized (this) {
            hashMap = new HashMap(this.a);
        }
        o(hashMap, z);
    }

    private bn1(Executor executor, Iterable<bs8<ComponentRegistrar>> iterable, Collection<bm1<?>> collection, wm1 wm1Var) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = new HashSet();
        this.g = new AtomicReference<>();
        rk3 rk3Var = new rk3(executor);
        this.f = rk3Var;
        this.h = wm1Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(bm1.s(rk3Var, rk3.class, j1b.class, ms8.class));
        arrayList.add(bm1.s(this, sm1.class, new Class[0]));
        for (bm1<?> bm1Var : collection) {
            if (bm1Var != null) {
                arrayList.add(bm1Var);
            }
        }
        this.d = q(iterable);
        n(arrayList);
    }

    /* compiled from: ComponentRuntime.java */
    /* renamed from: bn1$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private final Executor a;
        private final List<bs8<ComponentRegistrar>> b = new ArrayList();
        private final List<bm1<?>> c = new ArrayList();
        private wm1 d = wm1.a;

        b(Executor executor) {
            this.a = executor;
        }

        public b b(bm1<?> bm1Var) {
            this.c.add(bm1Var);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.b.add(new bs8() { // from class: cn1
                @Override // defpackage.bs8
                public final Object get() {
                    ComponentRegistrar f;
                    f = bn1.b.f(ComponentRegistrar.this);
                    return f;
                }
            });
            return this;
        }

        public b d(Collection<bs8<ComponentRegistrar>> collection) {
            this.b.addAll(collection);
            return this;
        }

        public bn1 e() {
            return new bn1(this.a, this.b, this.c, this.d);
        }

        public b g(wm1 wm1Var) {
            this.d = wm1Var;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
