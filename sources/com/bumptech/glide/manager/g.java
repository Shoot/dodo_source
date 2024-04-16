package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.h;
import java.util.Collection;
import java.util.Map;
/* compiled from: RequestManagerRetriever.java */
/* loaded from: classes.dex */
public class g implements Handler.Callback {
    private static final b f = new a();
    private volatile h a;
    private final b b;
    private final lr<View, Fragment> c = new lr<>();
    private final e d;
    private final f e;

    /* compiled from: RequestManagerRetriever.java */
    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.manager.g.b
        @NonNull
        public h a(@NonNull com.bumptech.glide.b bVar, @NonNull fp5 fp5Var, @NonNull wi9 wi9Var, @NonNull Context context) {
            return new h(bVar, fp5Var, wi9Var, context);
        }
    }

    /* compiled from: RequestManagerRetriever.java */
    /* loaded from: classes.dex */
    public interface b {
        @NonNull
        h a(@NonNull com.bumptech.glide.b bVar, @NonNull fp5 fp5Var, @NonNull wi9 wi9Var, @NonNull Context context);
    }

    public g(b bVar) {
        bVar = bVar == null ? f : bVar;
        this.b = bVar;
        this.e = new f(bVar);
        this.d = b();
    }

    @TargetApi(17)
    private static void a(@NonNull Activity activity) {
        if (!activity.isDestroyed()) {
            return;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    private static e b() {
        if (xm4.f && xm4.e) {
            return new d();
        }
        return new com.bumptech.glide.manager.b();
    }

    private static Activity c(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static void d(Collection<Fragment> collection, @NonNull Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                d(fragment.getChildFragmentManager().y0(), map);
            }
        }
    }

    private Fragment e(@NonNull View view, @NonNull androidx.fragment.app.d dVar) {
        this.c.clear();
        d(dVar.getSupportFragmentManager().y0(), this.c);
        View findViewById = dVar.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.c.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.c.clear();
        return fragment;
    }

    @NonNull
    private h j(@NonNull Context context) {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        this.a = this.b.a(com.bumptech.glide.b.c(context.getApplicationContext()), new com.bumptech.glide.manager.a(), new c(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    private static boolean k(Context context) {
        Activity c = c(context);
        if (c != null && c.isFinishing()) {
            return false;
        }
        return true;
    }

    @NonNull
    public h f(@NonNull Context context) {
        if (context != null) {
            if (vub.t() && !(context instanceof Application)) {
                if (context instanceof androidx.fragment.app.d) {
                    return i((androidx.fragment.app.d) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return f(contextWrapper.getBaseContext());
                    }
                }
            }
            return j(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @NonNull
    public h g(@NonNull View view) {
        if (vub.s()) {
            return f(view.getContext().getApplicationContext());
        }
        eh8.d(view);
        eh8.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity c = c(view.getContext());
        if (c == null) {
            return f(view.getContext().getApplicationContext());
        }
        if (c instanceof androidx.fragment.app.d) {
            androidx.fragment.app.d dVar = (androidx.fragment.app.d) c;
            Fragment e = e(view, dVar);
            if (e != null) {
                return h(e);
            }
            return i(dVar);
        }
        return f(view.getContext().getApplicationContext());
    }

    @NonNull
    public h h(@NonNull Fragment fragment) {
        eh8.e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (vub.s()) {
            return f(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.d.a(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.e.b(context, com.bumptech.glide.b.c(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }

    @NonNull
    public h i(@NonNull androidx.fragment.app.d dVar) {
        if (vub.s()) {
            return f(dVar.getApplicationContext());
        }
        a(dVar);
        this.d.a(dVar);
        boolean k = k(dVar);
        return this.e.b(dVar, com.bumptech.glide.b.c(dVar.getApplicationContext()), dVar.getLifecycle(), dVar.getSupportFragmentManager(), k);
    }
}
