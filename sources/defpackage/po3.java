package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FactoryPools.java */
/* renamed from: po3  reason: default package */
/* loaded from: classes.dex */
public final class po3 {
    private static final g<Object> a = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    /* renamed from: po3$b */
    /* loaded from: classes.dex */
    public class b<T> implements d<List<T>> {
        b() {
        }

        @Override // defpackage.po3.d
        @NonNull
        /* renamed from: b */
        public List<T> a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    /* renamed from: po3$c */
    /* loaded from: classes.dex */
    public class c<T> implements g<List<T>> {
        c() {
        }

        @Override // defpackage.po3.g
        /* renamed from: b */
        public void a(@NonNull List<T> list) {
            list.clear();
        }
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: po3$d */
    /* loaded from: classes.dex */
    public interface d<T> {
        T a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FactoryPools.java */
    /* renamed from: po3$e */
    /* loaded from: classes.dex */
    public static final class e<T> implements jf8<T> {
        private final d<T> a;
        private final g<T> b;
        private final jf8<T> c;

        e(@NonNull jf8<T> jf8Var, @NonNull d<T> dVar, @NonNull g<T> gVar) {
            this.c = jf8Var;
            this.a = dVar;
            this.b = gVar;
        }

        @Override // defpackage.jf8
        public boolean a(@NonNull T t) {
            if (t instanceof f) {
                ((f) t).g().b(true);
            }
            this.b.a(t);
            return this.c.a(t);
        }

        @Override // defpackage.jf8
        public T b() {
            T b = this.c.b();
            if (b == null) {
                b = this.a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b.getClass());
                }
            }
            if (b instanceof f) {
                ((f) b).g().b(false);
            }
            return b;
        }
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: po3$f */
    /* loaded from: classes.dex */
    public interface f {
        @NonNull
        eva g();
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: po3$g */
    /* loaded from: classes.dex */
    public interface g<T> {
        void a(@NonNull T t);
    }

    @NonNull
    private static <T extends f> jf8<T> a(@NonNull jf8<T> jf8Var, @NonNull d<T> dVar) {
        return b(jf8Var, dVar, c());
    }

    @NonNull
    private static <T> jf8<T> b(@NonNull jf8<T> jf8Var, @NonNull d<T> dVar, @NonNull g<T> gVar) {
        return new e(jf8Var, dVar, gVar);
    }

    @NonNull
    private static <T> g<T> c() {
        return (g<T>) a;
    }

    @NonNull
    public static <T extends f> jf8<T> d(int i, @NonNull d<T> dVar) {
        return a(new nf8(i), dVar);
    }

    @NonNull
    public static <T> jf8<List<T>> e() {
        return f(20);
    }

    @NonNull
    public static <T> jf8<List<T>> f(int i) {
        return b(new nf8(i), new b(), new c());
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: po3$a */
    /* loaded from: classes.dex */
    class a implements g<Object> {
        a() {
        }

        @Override // defpackage.po3.g
        public void a(@NonNull Object obj) {
        }
    }
}
