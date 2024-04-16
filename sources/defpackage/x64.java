package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.s;
import defpackage.clb;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FragmentTransitionSupport.java */
@SuppressLint({"RestrictedApi"})
/* renamed from: x64  reason: default package */
/* loaded from: classes.dex */
public class x64 extends s {

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: x64$a */
    /* loaded from: classes.dex */
    class a extends clb.e {
        final /* synthetic */ Rect a;

        a(Rect rect) {
            this.a = rect;
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: x64$c */
    /* loaded from: classes.dex */
    class c extends glb {
        final /* synthetic */ Object a;
        final /* synthetic */ ArrayList b;
        final /* synthetic */ Object c;
        final /* synthetic */ ArrayList d;
        final /* synthetic */ Object e;
        final /* synthetic */ ArrayList f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.b = arrayList;
            this.c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        @Override // defpackage.glb, defpackage.clb.f
        public void a(@NonNull clb clbVar) {
            Object obj = this.a;
            if (obj != null) {
                x64.this.w(obj, this.b, null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                x64.this.w(obj2, this.d, null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                x64.this.w(obj3, this.f, null);
            }
        }

        @Override // defpackage.clb.f
        public void b(@NonNull clb clbVar) {
            clbVar.T(this);
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: x64$d */
    /* loaded from: classes.dex */
    class d extends clb.e {
        final /* synthetic */ Rect a;

        d(Rect rect) {
            this.a = rect;
        }
    }

    private static boolean v(clb clbVar) {
        if (s.i(clbVar.C()) && s.i(clbVar.D()) && s.i(clbVar.F())) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.s
    public void a(Object obj, View view) {
        if (obj != null) {
            ((clb) obj).c(view);
        }
    }

    @Override // androidx.fragment.app.s
    public void b(Object obj, ArrayList<View> arrayList) {
        clb clbVar = (clb) obj;
        if (clbVar == null) {
            return;
        }
        int i = 0;
        if (clbVar instanceof jlb) {
            jlb jlbVar = (jlb) clbVar;
            int m0 = jlbVar.m0();
            while (i < m0) {
                b(jlbVar.l0(i), arrayList);
                i++;
            }
        } else if (!v(clbVar) && s.i(clbVar.G())) {
            int size = arrayList.size();
            while (i < size) {
                clbVar.c(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.s
    public void c(ViewGroup viewGroup, Object obj) {
        hlb.a(viewGroup, (clb) obj);
    }

    @Override // androidx.fragment.app.s
    public boolean e(Object obj) {
        return obj instanceof clb;
    }

    @Override // androidx.fragment.app.s
    public Object f(Object obj) {
        if (obj != null) {
            return ((clb) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.s
    public Object j(Object obj, Object obj2, Object obj3) {
        clb clbVar = (clb) obj;
        clb clbVar2 = (clb) obj2;
        clb clbVar3 = (clb) obj3;
        if (clbVar != null && clbVar2 != null) {
            clbVar = new jlb().j0(clbVar).j0(clbVar2).t0(1);
        } else if (clbVar == null) {
            if (clbVar2 != null) {
                clbVar = clbVar2;
            } else {
                clbVar = null;
            }
        }
        if (clbVar3 != null) {
            jlb jlbVar = new jlb();
            if (clbVar != null) {
                jlbVar.j0(clbVar);
            }
            jlbVar.j0(clbVar3);
            return jlbVar;
        }
        return clbVar;
    }

    @Override // androidx.fragment.app.s
    public Object k(Object obj, Object obj2, Object obj3) {
        jlb jlbVar = new jlb();
        if (obj != null) {
            jlbVar.j0((clb) obj);
        }
        if (obj2 != null) {
            jlbVar.j0((clb) obj2);
        }
        if (obj3 != null) {
            jlbVar.j0((clb) obj3);
        }
        return jlbVar;
    }

    @Override // androidx.fragment.app.s
    public void m(Object obj, View view, ArrayList<View> arrayList) {
        ((clb) obj).b(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.s
    public void n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((clb) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.s
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((clb) obj).a0(new d(rect));
        }
    }

    @Override // androidx.fragment.app.s
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((clb) obj).a0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.s
    public void s(Object obj, View view, ArrayList<View> arrayList) {
        jlb jlbVar = (jlb) obj;
        List<View> G = jlbVar.G();
        G.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            s.d(G, arrayList.get(i));
        }
        G.add(view);
        arrayList.add(view);
        b(jlbVar, arrayList);
    }

    @Override // androidx.fragment.app.s
    public void t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        jlb jlbVar = (jlb) obj;
        if (jlbVar != null) {
            jlbVar.G().clear();
            jlbVar.G().addAll(arrayList2);
            w(jlbVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.s
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        jlb jlbVar = new jlb();
        jlbVar.j0((clb) obj);
        return jlbVar;
    }

    public void w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int size;
        clb clbVar = (clb) obj;
        int i = 0;
        if (clbVar instanceof jlb) {
            jlb jlbVar = (jlb) clbVar;
            int m0 = jlbVar.m0();
            while (i < m0) {
                w(jlbVar.l0(i), arrayList, arrayList2);
                i++;
            }
        } else if (!v(clbVar)) {
            List<View> G = clbVar.G();
            if (G.size() == arrayList.size() && G.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i < size) {
                    clbVar.c(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    clbVar.U(arrayList.get(size2));
                }
            }
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: x64$b */
    /* loaded from: classes.dex */
    class b implements clb.f {
        final /* synthetic */ View a;
        final /* synthetic */ ArrayList b;

        b(View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // defpackage.clb.f
        public void b(@NonNull clb clbVar) {
            clbVar.T(this);
            this.a.setVisibility(8);
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.b.get(i)).setVisibility(0);
            }
        }

        @Override // defpackage.clb.f
        public void a(@NonNull clb clbVar) {
        }

        @Override // defpackage.clb.f
        public void c(@NonNull clb clbVar) {
        }

        @Override // defpackage.clb.f
        public void d(@NonNull clb clbVar) {
        }

        @Override // defpackage.clb.f
        public void e(@NonNull clb clbVar) {
        }
    }
}
