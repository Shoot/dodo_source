package defpackage;

import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ModelLoaderRegistry.java */
/* renamed from: om6  reason: default package */
/* loaded from: classes.dex */
public class om6 {
    private final qp6 a;
    private final a b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModelLoaderRegistry.java */
    /* renamed from: om6$a */
    /* loaded from: classes.dex */
    public static class a {
        private final Map<Class<?>, C0463a<?>> a = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: om6$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0463a<Model> {
            final List<mm6<Model, ?>> a;

            public C0463a(List<mm6<Model, ?>> list) {
                this.a = list;
            }
        }

        a() {
        }

        public void a() {
            this.a.clear();
        }

        public <Model> List<mm6<Model, ?>> b(Class<Model> cls) {
            C0463a<?> c0463a = this.a.get(cls);
            if (c0463a == null) {
                return null;
            }
            return (List<mm6<Model, ?>>) c0463a.a;
        }

        public <Model> void c(Class<Model> cls, List<mm6<Model, ?>> list) {
            if (this.a.put(cls, new C0463a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public om6(@NonNull jf8<List<Throwable>> jf8Var) {
        this(new qp6(jf8Var));
    }

    @NonNull
    private static <A> Class<A> b(@NonNull A a2) {
        return (Class<A>) a2.getClass();
    }

    @NonNull
    private synchronized <A> List<mm6<A, ?>> e(@NonNull Class<A> cls) {
        List<mm6<A, ?>> b;
        b = this.b.b(cls);
        if (b == null) {
            b = Collections.unmodifiableList(this.a.e(cls));
            this.b.c(cls, b);
        }
        return b;
    }

    public synchronized <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull nm6<? extends Model, ? extends Data> nm6Var) {
        this.a.b(cls, cls2, nm6Var);
        this.b.a();
    }

    @NonNull
    public synchronized List<Class<?>> c(@NonNull Class<?> cls) {
        return this.a.g(cls);
    }

    @NonNull
    public <A> List<mm6<A, ?>> d(@NonNull A a2) {
        List<mm6<A, ?>> e = e(b(a2));
        if (!e.isEmpty()) {
            int size = e.size();
            List<mm6<A, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                mm6<A, ?> mm6Var = e.get(i);
                if (mm6Var.a(a2)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(mm6Var);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new Registry.NoModelLoaderAvailableException(a2, e);
        }
        throw new Registry.NoModelLoaderAvailableException(a2);
    }

    private om6(@NonNull qp6 qp6Var) {
        this.b = new a();
        this.a = qp6Var;
    }
}
