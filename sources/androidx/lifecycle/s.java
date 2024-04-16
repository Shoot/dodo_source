package androidx.lifecycle;

import android.app.Application;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.n22;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ViewModelProvider.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0006\n\u0013\u001bB#\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017B\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u001aJ(\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0097\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0097\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/s;", "", "Landroidx/lifecycle/r;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/r;", "", Action.KEY_ATTRIBUTE, "b", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/r;", "Landroidx/lifecycle/t;", "Landroidx/lifecycle/t;", "store", "Landroidx/lifecycle/s$b;", "Landroidx/lifecycle/s$b;", "factory", "Ln22;", com.huawei.hms.opendevice.c.a, "Ln22;", "defaultCreationExtras", "<init>", "(Landroidx/lifecycle/t;Landroidx/lifecycle/s$b;Ln22;)V", "Lvzb;", "owner", "(Lvzb;Landroidx/lifecycle/s$b;)V", DateTokenConverter.CONVERTER_KEY, "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class s {
    private final t a;
    private final b b;
    private final n22 c;

    /* compiled from: ViewModelProvider.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u000eB\u001b\b\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\t\b\u0016¢\u0006\u0004\b\u0015\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0018J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/s$a;", "Landroidx/lifecycle/s$c;", "Landroidx/lifecycle/r;", "T", "Ljava/lang/Class;", "modelClass", "Landroid/app/Application;", "app", "g", "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/r;", "Ln22;", "extras", "b", "(Ljava/lang/Class;Ln22;)Landroidx/lifecycle/r;", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/r;", DateTokenConverter.CONVERTER_KEY, "Landroid/app/Application;", "application", "", "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", com.huawei.hms.push.e.a, "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static class a extends c {
        private static a f;
        private final Application d;
        public static final C0040a e = new C0040a(null);
        public static final n22.b<Application> g = C0040a.C0041a.a;

        /* compiled from: ViewModelProvider.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/s$a$a;", "", "Landroid/app/Application;", "application", "Landroidx/lifecycle/s$a;", "a", "Ln22$b;", "APPLICATION_KEY", "Ln22$b;", "", "DEFAULT_KEY", "Ljava/lang/String;", "sInstance", "Landroidx/lifecycle/s$a;", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: androidx.lifecycle.s$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0040a {

            /* compiled from: ViewModelProvider.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/s$a$a$a;", "Ln22$b;", "Landroid/app/Application;", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
            /* renamed from: androidx.lifecycle.s$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            private static final class C0041a implements n22.b<Application> {
                public static final C0041a a = new C0041a();

                private C0041a() {
                }
            }

            private C0040a() {
            }

            public /* synthetic */ C0040a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Application application) {
                z65.h(application, "application");
                if (a.f == null) {
                    a.f = new a(application);
                }
                a aVar = a.f;
                z65.e(aVar);
                return aVar;
            }
        }

        private a(Application application, int i) {
            this.d = application;
        }

        private final <T extends r> T g(Class<T> cls, Application application) {
            if (lj.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    z65.g(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e2);
                } catch (InstantiationException e3) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e3);
                } catch (NoSuchMethodException e4) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e4);
                } catch (InvocationTargetException e5) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e5);
                }
            }
            return (T) super.a(cls);
        }

        @Override // androidx.lifecycle.s.c, androidx.lifecycle.s.b
        public <T extends r> T a(Class<T> cls) {
            z65.h(cls, "modelClass");
            Application application = this.d;
            if (application != null) {
                return (T) g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.s.c, androidx.lifecycle.s.b
        public <T extends r> T b(Class<T> cls, n22 n22Var) {
            z65.h(cls, "modelClass");
            z65.h(n22Var, "extras");
            if (this.d != null) {
                return (T) a(cls);
            }
            Application application = (Application) n22Var.a(g);
            if (application != null) {
                return (T) g(cls, application);
            }
            if (!lj.class.isAssignableFrom(cls)) {
                return (T) super.a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            z65.h(application, "application");
        }
    }

    /* compiled from: ViewModelProvider.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/s$b;", "", "Landroidx/lifecycle/r;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/r;", "Ln22;", "extras", "b", "(Ljava/lang/Class;Ln22;)Landroidx/lifecycle/r;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public interface b {
        <T extends r> T a(Class<T> cls);

        <T extends r> T b(Class<T> cls, n22 n22Var);
    }

    /* compiled from: ViewModelProvider.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/lifecycle/s$c;", "Landroidx/lifecycle/s$b;", "Landroidx/lifecycle/r;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/r;", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static class c implements b {
        private static c b;
        public static final a a = new a(null);
        public static final n22.b<String> c = a.C0042a.a;

        /* compiled from: ViewModelProvider.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/s$c$a;", "", "Landroidx/lifecycle/s$c;", "a", "()Landroidx/lifecycle/s$c;", "getInstance$annotations", "()V", "instance", "Ln22$b;", "", "VIEW_MODEL_KEY", "Ln22$b;", "sInstance", "Landroidx/lifecycle/s$c;", "<init>", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
        /* loaded from: classes.dex */
        public static final class a {

            /* compiled from: ViewModelProvider.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/s$c$a$a;", "Ln22$b;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
            /* renamed from: androidx.lifecycle.s$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            private static final class C0042a implements n22.b<String> {
                public static final C0042a a = new C0042a();

                private C0042a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                if (c.b == null) {
                    c.b = new c();
                }
                c cVar = c.b;
                z65.e(cVar);
                return cVar;
            }
        }

        @Override // androidx.lifecycle.s.b
        public <T extends r> T a(Class<T> cls) {
            z65.h(cls, "modelClass");
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                z65.g(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        }

        @Override // androidx.lifecycle.s.b
        public /* synthetic */ r b(Class cls, n22 n22Var) {
            return tzb.b(this, cls, n22Var);
        }
    }

    /* compiled from: ViewModelProvider.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Landroidx/lifecycle/s$d;", "", "Landroidx/lifecycle/r;", "viewModel", "", com.huawei.hms.opendevice.c.a, "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static class d {
        public void c(r rVar) {
            z65.h(rVar, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(t tVar, b bVar) {
        this(tVar, bVar, null, 4, null);
        z65.h(tVar, "store");
        z65.h(bVar, "factory");
    }

    public <T extends r> T a(Class<T> cls) {
        z65.h(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends r> T b(String str, Class<T> cls) {
        T t;
        d dVar;
        z65.h(str, Action.KEY_ATTRIBUTE);
        z65.h(cls, "modelClass");
        T t2 = (T) this.a.b(str);
        if (cls.isInstance(t2)) {
            b bVar = this.b;
            if (bVar instanceof d) {
                dVar = (d) bVar;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                z65.e(t2);
                dVar.c(t2);
            }
            z65.f(t2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return t2;
        }
        jq6 jq6Var = new jq6(this.c);
        jq6Var.c(c.c, str);
        try {
            t = (T) this.b.b(cls, jq6Var);
        } catch (AbstractMethodError unused) {
            t = (T) this.b.a(cls);
        }
        this.a.d(str, t);
        return t;
    }

    public s(t tVar, b bVar, n22 n22Var) {
        z65.h(tVar, "store");
        z65.h(bVar, "factory");
        z65.h(n22Var, "defaultCreationExtras");
        this.a = tVar;
        this.b = bVar;
        this.c = n22Var;
    }

    public /* synthetic */ s(t tVar, b bVar, n22 n22Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tVar, bVar, (i & 4) != 0 ? n22.a.b : n22Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(vzb vzbVar, b bVar) {
        this(vzbVar.getViewModelStore(), bVar, uzb.a(vzbVar));
        z65.h(vzbVar, "owner");
        z65.h(bVar, "factory");
    }
}
