package defpackage;

import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import defpackage.mm6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: MultiModelLoaderFactory.java */
/* renamed from: qp6  reason: default package */
/* loaded from: classes.dex */
public class qp6 {
    private static final c e = new c();
    private static final mm6<Object, Object> f = new a();
    private final List<b<?, ?>> a;
    private final c b;
    private final Set<b<?, ?>> c;
    private final jf8<List<Throwable>> d;

    /* compiled from: MultiModelLoaderFactory.java */
    /* renamed from: qp6$a */
    /* loaded from: classes.dex */
    private static class a implements mm6<Object, Object> {
        a() {
        }

        @Override // defpackage.mm6
        public boolean a(@NonNull Object obj) {
            return false;
        }

        @Override // defpackage.mm6
        public mm6.a<Object> b(@NonNull Object obj, int i, int i2, @NonNull ac7 ac7Var) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MultiModelLoaderFactory.java */
    /* renamed from: qp6$b */
    /* loaded from: classes.dex */
    public static class b<Model, Data> {
        private final Class<Model> a;
        final Class<Data> b;
        final nm6<? extends Model, ? extends Data> c;

        public b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull nm6<? extends Model, ? extends Data> nm6Var) {
            this.a = cls;
            this.b = cls2;
            this.c = nm6Var;
        }

        public boolean a(@NonNull Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }

        public boolean b(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            if (a(cls) && this.b.isAssignableFrom(cls2)) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* renamed from: qp6$c */
    /* loaded from: classes.dex */
    static class c {
        c() {
        }

        @NonNull
        public <Model, Data> pp6<Model, Data> a(@NonNull List<mm6<Model, Data>> list, @NonNull jf8<List<Throwable>> jf8Var) {
            return new pp6<>(list, jf8Var);
        }
    }

    public qp6(@NonNull jf8<List<Throwable>> jf8Var) {
        this(jf8Var, e);
    }

    private <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull nm6<? extends Model, ? extends Data> nm6Var, boolean z) {
        int i;
        b<?, ?> bVar = new b<>(cls, cls2, nm6Var);
        List<b<?, ?>> list = this.a;
        if (z) {
            i = list.size();
        } else {
            i = 0;
        }
        list.add(i, bVar);
    }

    @NonNull
    private <Model, Data> mm6<Model, Data> c(@NonNull b<?, ?> bVar) {
        return (mm6) eh8.d(bVar.c.d(this));
    }

    @NonNull
    private static <Model, Data> mm6<Model, Data> f() {
        return (mm6<Model, Data>) f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <Model, Data> void b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull nm6<? extends Model, ? extends Data> nm6Var) {
        a(cls, cls2, nm6Var, true);
    }

    @NonNull
    public synchronized <Model, Data> mm6<Model, Data> d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.a) {
                if (this.c.contains(bVar)) {
                    z = true;
                } else if (bVar.b(cls, cls2)) {
                    this.c.add(bVar);
                    arrayList.add(c(bVar));
                    this.c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.b.a(arrayList, this.d);
            } else if (arrayList.size() == 1) {
                return (mm6) arrayList.get(0);
            } else if (z) {
                return f();
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public synchronized <Model> List<mm6<Model, ?>> e(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.a) {
                if (!this.c.contains(bVar) && bVar.a(cls)) {
                    this.c.add(bVar);
                    arrayList.add(c(bVar));
                    this.c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public synchronized List<Class<?>> g(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.a) {
            if (!arrayList.contains(bVar.b) && bVar.a(cls)) {
                arrayList.add(bVar.b);
            }
        }
        return arrayList;
    }

    qp6(@NonNull jf8<List<Throwable>> jf8Var, @NonNull c cVar) {
        this.a = new ArrayList();
        this.c = new HashSet();
        this.d = jf8Var;
        this.b = cVar;
    }
}
