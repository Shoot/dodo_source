package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* loaded from: classes.dex */
public class j {
    @NonNull
    private final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();
    @NonNull
    private final FragmentManager b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FragmentLifecycleCallbacksDispatcher.java */
    /* loaded from: classes.dex */
    public static final class a {
        @NonNull
        final FragmentManager.l a;
        final boolean b;

        a(@NonNull FragmentManager.l lVar, boolean z) {
            this.a = lVar;
            this.b = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(@NonNull FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@NonNull Fragment fragment, Bundle bundle, boolean z) {
        Fragment C0 = this.b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.a(this.b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(@NonNull Fragment fragment, boolean z) {
        Context f = this.b.z0().f();
        Fragment C0 = this.b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().b(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.b(this.b, fragment, f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(@NonNull Fragment fragment, Bundle bundle, boolean z) {
        Fragment C0 = this.b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.c(this.b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(@NonNull Fragment fragment, boolean z) {
        Fragment C0 = this.b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().d(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.d(this.b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(@NonNull Fragment fragment, boolean z) {
        Fragment C0 = this.b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().e(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.e(this.b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(@NonNull Fragment fragment, boolean z) {
        Fragment C0 = this.b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().f(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.f(this.b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(@NonNull Fragment fragment, boolean z) {
        Context f = this.b.z0().f();
        Fragment C0 = this.b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().g(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.g(this.b, fragment, f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(@NonNull Fragment fragment, Bundle bundle, boolean z) {
        Fragment C0 = this.b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.h(this.b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(@NonNull Fragment fragment, boolean z) {
        Fragment C0 = this.b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().i(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.i(this.b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(@NonNull Fragment fragment, @NonNull Bundle bundle, boolean z) {
        Fragment C0 = this.b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.j(this.b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(@NonNull Fragment fragment, boolean z) {
        Fragment C0 = this.b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().k(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.k(this.b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(@NonNull Fragment fragment, boolean z) {
        Fragment C0 = this.b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().l(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.l(this.b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(@NonNull Fragment fragment, @NonNull View view, Bundle bundle, boolean z) {
        Fragment C0 = this.b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.m(this.b, fragment, view, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(@NonNull Fragment fragment, boolean z) {
        Fragment C0 = this.b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().n(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.n(this.b, fragment);
            }
        }
    }

    public void o(@NonNull FragmentManager.l lVar, boolean z) {
        this.a.add(new a(lVar, z));
    }

    public void p(@NonNull FragmentManager.l lVar) {
        synchronized (this.a) {
            try {
                int size = this.a.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (this.a.get(i).a == lVar) {
                        this.a.remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
