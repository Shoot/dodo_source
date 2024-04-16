package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.manager.g;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: Glide.java */
/* loaded from: classes.dex */
public class b implements ComponentCallbacks2 {
    private static volatile b k;
    private static volatile boolean l;
    private final j a;
    private final gc0 b;
    private final tc6 c;
    private final d d;
    private final mr e;
    private final com.bumptech.glide.manager.g f;
    private final xq1 g;
    private final a i;
    private final List<h> h = new ArrayList();
    private uc6 j = uc6.NORMAL;

    /* compiled from: Glide.java */
    /* loaded from: classes.dex */
    public interface a {
        @NonNull
        xi9 a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(@NonNull Context context, @NonNull j jVar, @NonNull tc6 tc6Var, @NonNull gc0 gc0Var, @NonNull mr mrVar, @NonNull com.bumptech.glide.manager.g gVar, @NonNull xq1 xq1Var, int i, @NonNull a aVar, @NonNull Map<Class<?>, i<?, ?>> map, @NonNull List<vi9<Object>> list, @NonNull List<ag4> list2, zn znVar, @NonNull e eVar) {
        this.a = jVar;
        this.b = gc0Var;
        this.e = mrVar;
        this.c = tc6Var;
        this.f = gVar;
        this.g = xq1Var;
        this.i = aVar;
        this.d = new d(context, mrVar, f.d(this, list2, znVar), new ew4(), aVar, map, list, jVar, eVar, i);
    }

    static void a(@NonNull Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!l) {
            l = true;
            try {
                m(context, generatedAppGlideModule);
                return;
            } finally {
                l = false;
            }
        }
        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
    }

    @NonNull
    public static b c(@NonNull Context context) {
        if (k == null) {
            GeneratedAppGlideModule d = d(context.getApplicationContext());
            synchronized (b.class) {
                try {
                    if (k == null) {
                        a(context, d);
                    }
                } finally {
                }
            }
        }
        return k;
    }

    private static GeneratedAppGlideModule d(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e) {
            q(e);
            return null;
        } catch (InstantiationException e2) {
            q(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            q(e3);
            return null;
        } catch (InvocationTargetException e4) {
            q(e4);
            return null;
        }
    }

    @NonNull
    private static com.bumptech.glide.manager.g l(Context context) {
        eh8.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c(context).k();
    }

    private static void m(@NonNull Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        n(context, new c(), generatedAppGlideModule);
    }

    private static void n(@NonNull Context context, @NonNull c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        g.b bVar;
        Context applicationContext = context.getApplicationContext();
        List<ag4> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            emptyList = new u56(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> d = generatedAppGlideModule.d();
            Iterator<ag4> it = emptyList.iterator();
            while (it.hasNext()) {
                ag4 next = it.next();
                if (d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<ag4> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        if (generatedAppGlideModule != null) {
            bVar = generatedAppGlideModule.e();
        } else {
            bVar = null;
        }
        cVar.b(bVar);
        for (ag4 ag4Var : emptyList) {
            ag4Var.a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, cVar);
        }
        b a2 = cVar.a(applicationContext, emptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(a2);
        k = a2;
    }

    private static void q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @NonNull
    public static h t(@NonNull Context context) {
        return l(context).f(context);
    }

    @NonNull
    public static h u(@NonNull View view) {
        return l(view.getContext()).g(view);
    }

    @NonNull
    public static h v(@NonNull Fragment fragment) {
        return l(fragment.getContext()).h(fragment);
    }

    public void b() {
        vub.b();
        this.c.b();
        this.b.b();
        this.e.b();
    }

    @NonNull
    public mr e() {
        return this.e;
    }

    @NonNull
    public gc0 f() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public xq1 g() {
        return this.g;
    }

    @NonNull
    public Context h() {
        return this.d.getBaseContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public d i() {
        return this.d;
    }

    @NonNull
    public Registry j() {
        return this.d.i();
    }

    @NonNull
    public com.bumptech.glide.manager.g k() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(h hVar) {
        synchronized (this.h) {
            try {
                if (!this.h.contains(hVar)) {
                    this.h.add(hVar);
                } else {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        r(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p(@NonNull n6b<?> n6bVar) {
        synchronized (this.h) {
            try {
                for (h hVar : this.h) {
                    if (hVar.A(n6bVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(int i) {
        vub.b();
        synchronized (this.h) {
            try {
                for (h hVar : this.h) {
                    hVar.onTrimMemory(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.a(i);
        this.b.a(i);
        this.e.a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(h hVar) {
        synchronized (this.h) {
            try {
                if (this.h.contains(hVar)) {
                    this.h.remove(hVar);
                } else {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
