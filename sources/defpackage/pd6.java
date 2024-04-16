package defpackage;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: MenuHostHelper.java */
/* renamed from: pd6  reason: default package */
/* loaded from: classes.dex */
public class pd6 {
    private final Runnable a;
    private final CopyOnWriteArrayList<vg6> b = new CopyOnWriteArrayList<>();
    private final Map<vg6, a> c = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MenuHostHelper.java */
    /* renamed from: pd6$a */
    /* loaded from: classes.dex */
    public static class a {
        final d a;
        private g b;

        a(@NonNull d dVar, @NonNull g gVar) {
            this.a = dVar;
            this.b = gVar;
            dVar.a(gVar);
        }

        void a() {
            this.a.d(this.b);
            this.b = null;
        }
    }

    public pd6(@NonNull Runnable runnable) {
        this.a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(vg6 vg6Var, op5 op5Var, d.a aVar) {
        if (aVar == d.a.ON_DESTROY) {
            l(vg6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(d.b bVar, vg6 vg6Var, op5 op5Var, d.a aVar) {
        if (aVar == d.a.o(bVar)) {
            c(vg6Var);
        } else if (aVar == d.a.ON_DESTROY) {
            l(vg6Var);
        } else if (aVar == d.a.i(bVar)) {
            this.b.remove(vg6Var);
            this.a.run();
        }
    }

    public void c(@NonNull vg6 vg6Var) {
        this.b.add(vg6Var);
        this.a.run();
    }

    public void d(@NonNull final vg6 vg6Var, @NonNull op5 op5Var) {
        c(vg6Var);
        d lifecycle = op5Var.getLifecycle();
        a remove = this.c.remove(vg6Var);
        if (remove != null) {
            remove.a();
        }
        this.c.put(vg6Var, new a(lifecycle, new g() { // from class: nd6
            @Override // androidx.lifecycle.g
            public final void d(op5 op5Var2, d.a aVar) {
                pd6.this.f(vg6Var, op5Var2, aVar);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void e(@NonNull final vg6 vg6Var, @NonNull op5 op5Var, @NonNull final d.b bVar) {
        d lifecycle = op5Var.getLifecycle();
        a remove = this.c.remove(vg6Var);
        if (remove != null) {
            remove.a();
        }
        this.c.put(vg6Var, new a(lifecycle, new g() { // from class: od6
            @Override // androidx.lifecycle.g
            public final void d(op5 op5Var2, d.a aVar) {
                pd6.this.g(bVar, vg6Var, op5Var2, aVar);
            }
        }));
    }

    public void h(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        Iterator<vg6> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().d(menu, menuInflater);
        }
    }

    public void i(@NonNull Menu menu) {
        Iterator<vg6> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(menu);
        }
    }

    public boolean j(@NonNull MenuItem menuItem) {
        Iterator<vg6> it = this.b.iterator();
        while (it.hasNext()) {
            if (it.next().c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(@NonNull Menu menu) {
        Iterator<vg6> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public void l(@NonNull vg6 vg6Var) {
        this.b.remove(vg6Var);
        a remove = this.c.remove(vg6Var);
        if (remove != null) {
            remove.a();
        }
        this.a.run();
    }
}
