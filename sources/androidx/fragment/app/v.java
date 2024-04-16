package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import defpackage.ln0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SpecialEffectsController.java */
/* loaded from: classes.dex */
public abstract class v {
    private final ViewGroup a;
    final ArrayList<e> b = new ArrayList<>();
    final ArrayList<e> c = new ArrayList<>();
    boolean d = false;
    boolean e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        final /* synthetic */ d a;

        a(d dVar) {
            this.a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v.this.b.contains(this.a)) {
                this.a.e().a(this.a.f().mView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        final /* synthetic */ d a;

        b(d dVar) {
            this.a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.b.remove(this.a);
            v.this.c.remove(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[e.b.values().length];
            b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class d extends e {
        @NonNull
        private final m h;

        d(@NonNull e.c cVar, @NonNull e.b bVar, @NonNull m mVar, @NonNull ln0 ln0Var) {
            super(cVar, bVar, mVar.k(), ln0Var);
            this.h = mVar;
        }

        @Override // androidx.fragment.app.v.e
        public void c() {
            super.c();
            this.h.m();
        }

        @Override // androidx.fragment.app.v.e
        void l() {
            if (g() == e.b.ADDING) {
                Fragment k = this.h.k();
                View findFocus = k.mView.findFocus();
                if (findFocus != null) {
                    k.setFocusedView(findFocus);
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k);
                    }
                }
                View requireView = f().requireView();
                if (requireView.getParent() == null) {
                    this.h.b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(k.getPostOnViewCreatedAlpha());
            } else if (g() == e.b.REMOVING) {
                Fragment k2 = this.h.k();
                View requireView2 = k2.requireView();
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + k2);
                }
                requireView2.clearFocus();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(@NonNull ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    private void a(@NonNull e.c cVar, @NonNull e.b bVar, @NonNull m mVar) {
        synchronized (this.b) {
            try {
                ln0 ln0Var = new ln0();
                e h = h(mVar.k());
                if (h != null) {
                    h.k(cVar, bVar);
                    return;
                }
                d dVar = new d(cVar, bVar, mVar, ln0Var);
                this.b.add(dVar);
                dVar.a(new a(dVar));
                dVar.a(new b(dVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private e h(@NonNull Fragment fragment) {
        Iterator<e> it = this.b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    private e i(@NonNull Fragment fragment) {
        Iterator<e> it = this.c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static v n(@NonNull ViewGroup viewGroup, @NonNull FragmentManager fragmentManager) {
        return o(viewGroup, fragmentManager.E0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static v o(@NonNull ViewGroup viewGroup, @NonNull w wVar) {
        int i = sy8.b;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof v) {
            return (v) tag;
        }
        v a2 = wVar.a(viewGroup);
        viewGroup.setTag(i, a2);
        return a2;
    }

    private void q() {
        Iterator<e> it = this.b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.i(next.f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(@NonNull e.c cVar, @NonNull m mVar) {
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + mVar.k());
        }
        a(cVar, e.b.ADDING, mVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(@NonNull m mVar) {
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + mVar.k());
        }
        a(e.c.GONE, e.b.NONE, mVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(@NonNull m mVar) {
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + mVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, mVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(@NonNull m mVar) {
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + mVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, mVar);
    }

    abstract void f(@NonNull List<e> list, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        if (this.e) {
            return;
        }
        if (!syb.X(this.a)) {
            j();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.c);
                    this.c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (FragmentManager.M0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((e) it2.next()).l();
                    }
                    f(arrayList2, this.d);
                    this.d = false;
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        String str;
        String str2;
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean X = syb.X(this.a);
        synchronized (this.b) {
            try {
                q();
                Iterator<e> it = this.b.iterator();
                while (it.hasNext()) {
                    it.next().l();
                }
                Iterator it2 = new ArrayList(this.c).iterator();
                while (it2.hasNext()) {
                    e eVar = (e) it2.next();
                    if (FragmentManager.M0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (X) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(eVar);
                        Log.v("FragmentManager", sb.toString());
                    }
                    eVar.b();
                }
                Iterator it3 = new ArrayList(this.b).iterator();
                while (it3.hasNext()) {
                    e eVar2 = (e) it3.next();
                    if (FragmentManager.M0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (X) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(eVar2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    eVar2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        if (this.e) {
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.e = false;
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e.b l(@NonNull m mVar) {
        e.b bVar;
        e h = h(mVar.k());
        if (h != null) {
            bVar = h.g();
        } else {
            bVar = null;
        }
        e i = i(mVar.k());
        if (i != null && (bVar == null || bVar == e.b.NONE)) {
            return i.g();
        }
        return bVar;
    }

    @NonNull
    public ViewGroup m() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        synchronized (this.b) {
            try {
                q();
                this.e = false;
                int size = this.b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    e eVar = this.b.get(size);
                    e.c k = e.c.k(eVar.f().mView);
                    e.c e2 = eVar.e();
                    e.c cVar = e.c.VISIBLE;
                    if (e2 == cVar && k != cVar) {
                        this.e = eVar.f().isPostponed();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(boolean z) {
        this.d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class e {
        @NonNull
        private c a;
        @NonNull
        private b b;
        @NonNull
        private final Fragment c;
        @NonNull
        private final List<Runnable> d = new ArrayList();
        @NonNull
        private final HashSet<ln0> e = new HashSet<>();
        private boolean f = false;
        private boolean g = false;

        /* compiled from: SpecialEffectsController.java */
        /* loaded from: classes.dex */
        class a implements ln0.b {
            a() {
            }

            @Override // defpackage.ln0.b
            public void onCancel() {
                e.this.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SpecialEffectsController.java */
        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SpecialEffectsController.java */
        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* JADX INFO: Access modifiers changed from: package-private */
            @NonNull
            public static c i(int i) {
                if (i != 0) {
                    if (i != 4) {
                        if (i == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException("Unknown visibility " + i);
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @NonNull
            public static c k(@NonNull View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return i(view.getVisibility());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public void a(@NonNull View view) {
                int i = c.a[ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                if (FragmentManager.M0(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                                }
                                view.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        if (FragmentManager.M0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        view.setVisibility(8);
                        return;
                    }
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        e(@NonNull c cVar, @NonNull b bVar, @NonNull Fragment fragment, @NonNull ln0 ln0Var) {
            this.a = cVar;
            this.b = bVar;
            this.c = fragment;
            ln0Var.b(new a());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(@NonNull Runnable runnable) {
            this.d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f = true;
            if (this.e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.e).iterator();
            while (it.hasNext()) {
                ((ln0) it.next()).a();
            }
        }

        public void c() {
            if (this.g) {
                return;
            }
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            for (Runnable runnable : this.d) {
                runnable.run();
            }
        }

        public final void d(@NonNull ln0 ln0Var) {
            if (this.e.remove(ln0Var) && this.e.isEmpty()) {
                c();
            }
        }

        @NonNull
        public c e() {
            return this.a;
        }

        @NonNull
        public final Fragment f() {
            return this.c;
        }

        @NonNull
        b g() {
            return this.b;
        }

        final boolean h() {
            return this.f;
        }

        final boolean i() {
            return this.g;
        }

        public final void j(@NonNull ln0 ln0Var) {
            l();
            this.e.add(ln0Var);
        }

        final void k(@NonNull c cVar, @NonNull b bVar) {
            int i = c.b[bVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && this.a != c.REMOVED) {
                        if (FragmentManager.M0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + " -> " + cVar + ". ");
                        }
                        this.a = cVar;
                        return;
                    }
                    return;
                }
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
                }
                this.a = c.REMOVED;
                this.b = b.REMOVING;
            } else if (this.a == c.REMOVED) {
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
                }
                this.a = c.VISIBLE;
                this.b = b.ADDING;
            }
        }

        @NonNull
        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.a + "} {mLifecycleImpact = " + this.b + "} {mFragment = " + this.c + "}";
        }

        void l() {
        }
    }
}
