package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
/* compiled from: ConstructorConstructor.java */
/* renamed from: rr1  reason: default package */
/* loaded from: classes2.dex */
public final class rr1 {
    private final Map<Type, y45<?>> a;
    private final cc9 b = cc9.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: rr1$a */
    /* loaded from: classes2.dex */
    public class a<T> implements r47<T> {
        a() {
        }

        @Override // defpackage.r47
        public T a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: rr1$b */
    /* loaded from: classes2.dex */
    public class b<T> implements r47<T> {
        b() {
        }

        @Override // defpackage.r47
        public T a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: rr1$c */
    /* loaded from: classes2.dex */
    public class c<T> implements r47<T> {
        c() {
        }

        @Override // defpackage.r47
        public T a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: rr1$d */
    /* loaded from: classes2.dex */
    public class d<T> implements r47<T> {
        d() {
        }

        @Override // defpackage.r47
        public T a() {
            return (T) new rq5();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: rr1$e */
    /* loaded from: classes2.dex */
    public class e<T> implements r47<T> {
        private final hrb a = hrb.b();
        final /* synthetic */ Class b;
        final /* synthetic */ Type c;

        e(Class cls, Type type) {
            this.b = cls;
            this.c = type;
        }

        @Override // defpackage.r47
        public T a() {
            try {
                return (T) this.a.c(this.b);
            } catch (Exception e) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: rr1$f */
    /* loaded from: classes2.dex */
    class f<T> implements r47<T> {
        final /* synthetic */ y45 a;
        final /* synthetic */ Type b;

        f(y45 y45Var, Type type) {
            this.a = y45Var;
            this.b = type;
        }

        @Override // defpackage.r47
        public T a() {
            return (T) this.a.a(this.b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: rr1$g */
    /* loaded from: classes2.dex */
    class g<T> implements r47<T> {
        final /* synthetic */ y45 a;
        final /* synthetic */ Type b;

        g(y45 y45Var, Type type) {
            this.a = y45Var;
            this.b = type;
        }

        @Override // defpackage.r47
        public T a() {
            return (T) this.a.a(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: rr1$h */
    /* loaded from: classes2.dex */
    public class h<T> implements r47<T> {
        final /* synthetic */ Constructor a;

        h(Constructor constructor) {
            this.a = constructor;
        }

        @Override // defpackage.r47
        public T a() {
            try {
                return (T) this.a.newInstance(null);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Failed to invoke " + this.a + " with no args", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to invoke " + this.a + " with no args", e3.getTargetException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: rr1$i */
    /* loaded from: classes2.dex */
    public class i<T> implements r47<T> {
        i() {
        }

        @Override // defpackage.r47
        public T a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: rr1$j */
    /* loaded from: classes2.dex */
    public class j<T> implements r47<T> {
        final /* synthetic */ Type a;

        j(Type type) {
            this.a = type;
        }

        @Override // defpackage.r47
        public T a() {
            Type type = this.a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return (T) EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + this.a.toString());
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: rr1$k */
    /* loaded from: classes2.dex */
    public class k<T> implements r47<T> {
        k() {
        }

        @Override // defpackage.r47
        public T a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: rr1$l */
    /* loaded from: classes2.dex */
    public class l<T> implements r47<T> {
        l() {
        }

        @Override // defpackage.r47
        public T a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: rr1$m */
    /* loaded from: classes2.dex */
    public class m<T> implements r47<T> {
        m() {
        }

        @Override // defpackage.r47
        public T a() {
            return (T) new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: rr1$n */
    /* loaded from: classes2.dex */
    public class n<T> implements r47<T> {
        n() {
        }

        @Override // defpackage.r47
        public T a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    public rr1(Map<Type, y45<?>> map) {
        this.a = map;
    }

    private <T> r47<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.b.b(declaredConstructor);
            }
            return new h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> r47<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new i();
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new j(type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new k();
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new l();
            }
            return new m();
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new n();
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new a();
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new b();
            }
            if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                return new c();
            }
            return new d();
        } else {
            return null;
        }
    }

    private <T> r47<T> d(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    public <T> r47<T> a(TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        y45<?> y45Var = this.a.get(type);
        if (y45Var != null) {
            return new f(y45Var, type);
        }
        y45<?> y45Var2 = this.a.get(rawType);
        if (y45Var2 != null) {
            return new g(y45Var2, type);
        }
        r47<T> b2 = b(rawType);
        if (b2 != null) {
            return b2;
        }
        r47<T> c2 = c(type, rawType);
        if (c2 != null) {
            return c2;
        }
        return d(type, rawType);
    }

    public String toString() {
        return this.a.toString();
    }
}
