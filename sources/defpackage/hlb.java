package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: TransitionManager.java */
/* renamed from: hlb  reason: default package */
/* loaded from: classes.dex */
public class hlb {
    private static clb a = new e10();
    private static ThreadLocal<WeakReference<lr<ViewGroup, ArrayList<clb>>>> b = new ThreadLocal<>();
    static ArrayList<ViewGroup> c = new ArrayList<>();

    public static void a(@NonNull ViewGroup viewGroup, clb clbVar) {
        if (!c.contains(viewGroup) && syb.Y(viewGroup)) {
            c.add(viewGroup);
            if (clbVar == null) {
                clbVar = a;
            }
            clb clone = clbVar.clone();
            d(viewGroup, clone);
            lv9.c(viewGroup, null);
            c(viewGroup, clone);
        }
    }

    static lr<ViewGroup, ArrayList<clb>> b() {
        lr<ViewGroup, ArrayList<clb>> lrVar;
        WeakReference<lr<ViewGroup, ArrayList<clb>>> weakReference = b.get();
        if (weakReference != null && (lrVar = weakReference.get()) != null) {
            return lrVar;
        }
        lr<ViewGroup, ArrayList<clb>> lrVar2 = new lr<>();
        b.set(new WeakReference<>(lrVar2));
        return lrVar2;
    }

    private static void c(ViewGroup viewGroup, clb clbVar) {
        if (clbVar != null && viewGroup != null) {
            a aVar = new a(clbVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void d(ViewGroup viewGroup, clb clbVar) {
        ArrayList<clb> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<clb> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().R(viewGroup);
            }
        }
        if (clbVar != null) {
            clbVar.l(viewGroup, true);
        }
        lv9 b2 = lv9.b(viewGroup);
        if (b2 != null) {
            b2.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TransitionManager.java */
    /* renamed from: hlb$a */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        clb a;
        ViewGroup b;

        /* compiled from: TransitionManager.java */
        /* renamed from: hlb$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0347a extends glb {
            final /* synthetic */ lr a;

            C0347a(lr lrVar) {
                this.a = lrVar;
            }

            @Override // defpackage.clb.f
            public void b(@NonNull clb clbVar) {
                ((ArrayList) this.a.get(a.this.b)).remove(clbVar);
                clbVar.T(this);
            }
        }

        a(clb clbVar, ViewGroup viewGroup) {
            this.a = clbVar;
            this.b = viewGroup;
        }

        private void a() {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!hlb.c.remove(this.b)) {
                return true;
            }
            lr<ViewGroup, ArrayList<clb>> b = hlb.b();
            ArrayList<clb> arrayList = b.get(this.b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                b.put(this.b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.a);
            this.a.b(new C0347a(b));
            this.a.l(this.b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((clb) it.next()).V(this.b);
                }
            }
            this.a.S(this.b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            hlb.c.remove(this.b);
            ArrayList<clb> arrayList = hlb.b().get(this.b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<clb> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().V(this.b);
                }
            }
            this.a.m(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
