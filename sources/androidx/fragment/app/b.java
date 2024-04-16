package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.fragment.app.e;
import androidx.fragment.app.v;
import defpackage.ln0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
class b extends v {

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[v.e.c.values().length];
            a = iArr;
            try {
                iArr[v.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[v.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[v.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[v.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0034b implements Runnable {
        final /* synthetic */ List a;
        final /* synthetic */ v.e b;

        RunnableC0034b(List list, v.e eVar) {
            this.a = list;
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.contains(this.b)) {
                this.a.remove(this.b);
                b.this.s(this.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ boolean c;
        final /* synthetic */ v.e d;
        final /* synthetic */ k e;

        c(ViewGroup viewGroup, View view, boolean z, v.e eVar, k kVar) {
            this.a = viewGroup;
            this.b = view;
            this.c = z;
            this.d = eVar;
            this.e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            if (this.c) {
                this.d.e().a(this.b);
            }
            this.e.a();
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.d + " has ended.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class d implements ln0.b {
        final /* synthetic */ Animator a;
        final /* synthetic */ v.e b;

        d(Animator animator, v.e eVar) {
            this.a = animator;
            this.b = eVar;
        }

        @Override // defpackage.ln0.b
        public void onCancel() {
            this.a.end();
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.b + " has been canceled.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class f implements ln0.b {
        final /* synthetic */ View a;
        final /* synthetic */ ViewGroup b;
        final /* synthetic */ k c;
        final /* synthetic */ v.e d;

        f(View view, ViewGroup viewGroup, k kVar, v.e eVar) {
            this.a = view;
            this.b = viewGroup;
            this.c = kVar;
            this.d = eVar;
        }

        @Override // defpackage.ln0.b
        public void onCancel() {
            this.a.clearAnimation();
            this.b.endViewTransition(this.a);
            this.c.a();
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.d + " has been cancelled.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        final /* synthetic */ v.e a;
        final /* synthetic */ v.e b;
        final /* synthetic */ boolean c;
        final /* synthetic */ lr d;

        g(v.e eVar, v.e eVar2, boolean z, lr lrVar) {
            this.a = eVar;
            this.b = eVar2;
            this.c = z;
            this.d = lrVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.a(this.a.f(), this.b.f(), this.c, this.d, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class h implements Runnable {
        final /* synthetic */ s a;
        final /* synthetic */ View b;
        final /* synthetic */ Rect c;

        h(s sVar, View view, Rect rect) {
            this.a = sVar;
            this.b = view;
            this.c = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.h(this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class i implements Runnable {
        final /* synthetic */ ArrayList a;

        i(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.e(this.a, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class j implements Runnable {
        final /* synthetic */ m a;
        final /* synthetic */ v.e b;

        j(m mVar, v.e eVar) {
            this.a = mVar;
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a();
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.b + "has completed");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class k extends l {
        private boolean c;
        private boolean d;
        private e.a e;

        k(@NonNull v.e eVar, @NonNull ln0 ln0Var, boolean z) {
            super(eVar, ln0Var);
            this.d = false;
            this.c = z;
        }

        e.a e(@NonNull Context context) {
            boolean z;
            if (this.d) {
                return this.e;
            }
            Fragment f = b().f();
            if (b().e() == v.e.c.VISIBLE) {
                z = true;
            } else {
                z = false;
            }
            e.a b = androidx.fragment.app.e.b(context, f, z, this.c);
            this.e = b;
            this.d = true;
            return b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class l {
        @NonNull
        private final v.e a;
        @NonNull
        private final ln0 b;

        l(@NonNull v.e eVar, @NonNull ln0 ln0Var) {
            this.a = eVar;
            this.b = ln0Var;
        }

        void a() {
            this.a.d(this.b);
        }

        @NonNull
        v.e b() {
            return this.a;
        }

        @NonNull
        ln0 c() {
            return this.b;
        }

        boolean d() {
            v.e.c cVar;
            v.e.c k = v.e.c.k(this.a.f().mView);
            v.e.c e = this.a.e();
            if (k != e && (k == (cVar = v.e.c.VISIBLE) || e == cVar)) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class m extends l {
        private final Object c;
        private final boolean d;
        private final Object e;

        m(@NonNull v.e eVar, @NonNull ln0 ln0Var, boolean z, boolean z2) {
            super(eVar, ln0Var);
            Object exitTransition;
            Object enterTransition;
            boolean allowEnterTransitionOverlap;
            if (eVar.e() == v.e.c.VISIBLE) {
                if (z) {
                    enterTransition = eVar.f().getReenterTransition();
                } else {
                    enterTransition = eVar.f().getEnterTransition();
                }
                this.c = enterTransition;
                if (z) {
                    allowEnterTransitionOverlap = eVar.f().getAllowReturnTransitionOverlap();
                } else {
                    allowEnterTransitionOverlap = eVar.f().getAllowEnterTransitionOverlap();
                }
                this.d = allowEnterTransitionOverlap;
            } else {
                if (z) {
                    exitTransition = eVar.f().getReturnTransition();
                } else {
                    exitTransition = eVar.f().getExitTransition();
                }
                this.c = exitTransition;
                this.d = true;
            }
            if (z2) {
                if (z) {
                    this.e = eVar.f().getSharedElementReturnTransition();
                    return;
                } else {
                    this.e = eVar.f().getSharedElementEnterTransition();
                    return;
                }
            }
            this.e = null;
        }

        private s f(Object obj) {
            if (obj == null) {
                return null;
            }
            s sVar = q.a;
            if (sVar != null && sVar.e(obj)) {
                return sVar;
            }
            s sVar2 = q.b;
            if (sVar2 != null && sVar2.e(obj)) {
                return sVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        s e() {
            s f = f(this.c);
            s f2 = f(this.e);
            if (f != null && f2 != null && f != f2) {
                throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.c + " which uses a different Transition  type than its shared element transition " + this.e);
            } else if (f == null) {
                return f2;
            } else {
                return f;
            }
        }

        public Object g() {
            return this.e;
        }

        Object h() {
            return this.c;
        }

        public boolean i() {
            if (this.e != null) {
                return true;
            }
            return false;
        }

        boolean j() {
            return this.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(@NonNull ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(@NonNull List<k> list, @NonNull List<v.e> list2, boolean z, @NonNull Map<v.e, Boolean> map) {
        int i2;
        boolean z2;
        Context context;
        View view;
        boolean z3;
        v.e eVar;
        ViewGroup m2 = m();
        Context context2 = m2.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator<k> it = list.iterator();
        boolean z4 = false;
        while (true) {
            i2 = 2;
            if (!it.hasNext()) {
                break;
            }
            k next = it.next();
            if (next.d()) {
                next.a();
            } else {
                e.a e2 = next.e(context2);
                if (e2 == null) {
                    next.a();
                } else {
                    Animator animator = e2.b;
                    if (animator == null) {
                        arrayList.add(next);
                    } else {
                        v.e b = next.b();
                        Fragment f2 = b.f();
                        if (Boolean.TRUE.equals(map.get(b))) {
                            if (FragmentManager.M0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + f2 + " as this Fragment was involved in a Transition.");
                            }
                            next.a();
                        } else {
                            if (b.e() == v.e.c.GONE) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                list2.remove(b);
                            }
                            View view2 = f2.mView;
                            m2.startViewTransition(view2);
                            animator.addListener(new c(m2, view2, z3, b, next));
                            animator.setTarget(view2);
                            animator.start();
                            if (FragmentManager.M0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Animator from operation ");
                                eVar = b;
                                sb.append(eVar);
                                sb.append(" has started.");
                                Log.v("FragmentManager", sb.toString());
                            } else {
                                eVar = b;
                            }
                            next.c().b(new d(animator, eVar));
                            z4 = true;
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar = (k) it2.next();
            v.e b2 = kVar.b();
            Fragment f3 = b2.f();
            if (z) {
                if (FragmentManager.M0(i2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f3 + " as Animations cannot run alongside Transitions.");
                }
                kVar.a();
            } else if (z4) {
                if (FragmentManager.M0(i2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f3 + " as Animations cannot run alongside Animators.");
                }
                kVar.a();
            } else {
                View view3 = f3.mView;
                Animation animation = (Animation) kh8.f(((e.a) kh8.f(kVar.e(context2))).a);
                if (b2.e() != v.e.c.REMOVED) {
                    view3.startAnimation(animation);
                    kVar.a();
                    z2 = z4;
                    context = context2;
                    view = view3;
                } else {
                    m2.startViewTransition(view3);
                    e.b bVar = new e.b(animation, m2, view3);
                    z2 = z4;
                    context = context2;
                    view = view3;
                    bVar.setAnimationListener(new e(b2, m2, view3, kVar));
                    view.startAnimation(bVar);
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + b2 + " has started.");
                    }
                }
                kVar.c().b(new f(view, m2, kVar, b2));
                z4 = z2;
                context2 = context;
                i2 = 2;
            }
        }
    }

    @NonNull
    private Map<v.e, Boolean> x(@NonNull List<m> list, @NonNull List<v.e> list2, boolean z, v.e eVar, v.e eVar2) {
        String str;
        View next;
        View next2;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        v.e eVar3;
        v.e eVar4;
        View view2;
        lr lrVar;
        v.e eVar5;
        HashMap hashMap;
        ArrayList<View> arrayList3;
        View view3;
        s sVar;
        ArrayList<View> arrayList4;
        v.e eVar6;
        Rect rect;
        rha enterTransitionCallback;
        rha exitTransitionCallback;
        ArrayList<String> arrayList5;
        int i2;
        View view4;
        String b;
        ArrayList<String> arrayList6;
        boolean z4 = z;
        v.e eVar7 = eVar;
        v.e eVar8 = eVar2;
        HashMap hashMap2 = new HashMap();
        s sVar2 = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                s e2 = mVar.e();
                if (sVar2 == null) {
                    sVar2 = e2;
                } else if (e2 != null && sVar2 != e2) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (sVar2 == null) {
            for (m mVar2 : list) {
                hashMap2.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return hashMap2;
        }
        View view5 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList7 = new ArrayList<>();
        ArrayList<View> arrayList8 = new ArrayList<>();
        lr lrVar2 = new lr();
        Iterator<m> it = list.iterator();
        Object obj3 = null;
        View view6 = null;
        boolean z5 = false;
        while (true) {
            str = "FragmentManager";
            if (!it.hasNext()) {
                break;
            }
            m next3 = it.next();
            if (next3.i() && eVar7 != null && eVar8 != null) {
                Object u = sVar2.u(sVar2.f(next3.g()));
                ArrayList<String> sharedElementSourceNames = eVar2.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.f().getSharedElementTargetNames();
                View view7 = view6;
                HashMap hashMap3 = hashMap2;
                int i3 = 0;
                while (i3 < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i3));
                    ArrayList<String> arrayList9 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i3));
                    }
                    i3++;
                    sharedElementTargetNames = arrayList9;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.f().getSharedElementTargetNames();
                if (!z4) {
                    enterTransitionCallback = eVar.f().getExitTransitionCallback();
                    exitTransitionCallback = eVar2.f().getEnterTransitionCallback();
                } else {
                    enterTransitionCallback = eVar.f().getEnterTransitionCallback();
                    exitTransitionCallback = eVar2.f().getExitTransitionCallback();
                }
                int size = sharedElementSourceNames.size();
                View view8 = view5;
                int i4 = 0;
                while (i4 < size) {
                    lrVar2.put(sharedElementSourceNames.get(i4), sharedElementTargetNames2.get(i4));
                    i4++;
                    size = size;
                    rect2 = rect2;
                }
                Rect rect3 = rect2;
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    for (Iterator<String> it2 = sharedElementTargetNames2.iterator(); it2.hasNext(); it2 = it2) {
                        Log.v("FragmentManager", "Name: " + it2.next());
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator<String> it3 = sharedElementSourceNames.iterator(); it3.hasNext(); it3 = it3) {
                        Log.v("FragmentManager", "Name: " + it3.next());
                    }
                }
                lr<String, View> lrVar3 = new lr<>();
                u(lrVar3, eVar.f().mView);
                lrVar3.q(sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "Executing exit callback for operation " + eVar7);
                    }
                    enterTransitionCallback.d(sharedElementSourceNames, lrVar3);
                    int size2 = sharedElementSourceNames.size() - 1;
                    while (size2 >= 0) {
                        String str4 = sharedElementSourceNames.get(size2);
                        View view9 = lrVar3.get(str4);
                        if (view9 == null) {
                            lrVar2.remove(str4);
                            arrayList6 = sharedElementSourceNames;
                        } else {
                            arrayList6 = sharedElementSourceNames;
                            if (!str4.equals(syb.N(view9))) {
                                lrVar2.put(syb.N(view9), (String) lrVar2.remove(str4));
                            }
                        }
                        size2--;
                        sharedElementSourceNames = arrayList6;
                    }
                    arrayList5 = sharedElementSourceNames;
                } else {
                    arrayList5 = sharedElementSourceNames;
                    lrVar2.q(lrVar3.keySet());
                }
                lr<String, View> lrVar4 = new lr<>();
                u(lrVar4, eVar2.f().mView);
                lrVar4.q(sharedElementTargetNames2);
                lrVar4.q(lrVar2.values());
                if (exitTransitionCallback != null) {
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "Executing enter callback for operation " + eVar8);
                    }
                    exitTransitionCallback.d(sharedElementTargetNames2, lrVar4);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str5 = sharedElementTargetNames2.get(size3);
                        View view10 = lrVar4.get(str5);
                        if (view10 == null) {
                            String b2 = q.b(lrVar2, str5);
                            if (b2 != null) {
                                lrVar2.remove(b2);
                            }
                        } else if (!str5.equals(syb.N(view10)) && (b = q.b(lrVar2, str5)) != null) {
                            lrVar2.put(b, syb.N(view10));
                        }
                    }
                } else {
                    q.d(lrVar2, lrVar4);
                }
                v(lrVar3, lrVar2.keySet());
                v(lrVar4, lrVar2.values());
                if (lrVar2.isEmpty()) {
                    arrayList7.clear();
                    arrayList8.clear();
                    lrVar = lrVar2;
                    arrayList4 = arrayList8;
                    eVar5 = eVar7;
                    arrayList3 = arrayList7;
                    sVar = sVar2;
                    view6 = view7;
                    view3 = view8;
                    hashMap = hashMap3;
                    rect = rect3;
                    obj3 = null;
                    eVar6 = eVar8;
                } else {
                    q.a(eVar2.f(), eVar.f(), z4, lrVar3, true);
                    lrVar = lrVar2;
                    ArrayList<View> arrayList10 = arrayList8;
                    z97.a(m(), new g(eVar2, eVar, z, lrVar4));
                    arrayList7.addAll(lrVar3.values());
                    if (!arrayList5.isEmpty()) {
                        i2 = 0;
                        view6 = lrVar3.get(arrayList5.get(0));
                        sVar2.p(u, view6);
                    } else {
                        i2 = 0;
                        view6 = view7;
                    }
                    arrayList10.addAll(lrVar4.values());
                    if (!sharedElementTargetNames2.isEmpty() && (view4 = lrVar4.get(sharedElementTargetNames2.get(i2))) != null) {
                        rect = rect3;
                        z97.a(m(), new h(sVar2, view4, rect));
                        view3 = view8;
                        z5 = true;
                    } else {
                        rect = rect3;
                        view3 = view8;
                    }
                    sVar2.s(u, view3, arrayList7);
                    arrayList3 = arrayList7;
                    sVar = sVar2;
                    sVar2.n(u, null, null, null, null, u, arrayList10);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    arrayList4 = arrayList10;
                    hashMap = hashMap3;
                    hashMap.put(eVar5, bool);
                    eVar6 = eVar2;
                    hashMap.put(eVar6, bool);
                    obj3 = u;
                }
            } else {
                lrVar = lrVar2;
                eVar5 = eVar7;
                hashMap = hashMap2;
                arrayList3 = arrayList7;
                view3 = view5;
                sVar = sVar2;
                arrayList4 = arrayList8;
                eVar6 = eVar8;
                rect = rect2;
                view6 = view6;
            }
            view5 = view3;
            rect2 = rect;
            arrayList7 = arrayList3;
            arrayList8 = arrayList4;
            eVar8 = eVar6;
            z4 = z;
            hashMap2 = hashMap;
            sVar2 = sVar;
            eVar7 = eVar5;
            lrVar2 = lrVar;
        }
        View view11 = view6;
        lr lrVar5 = lrVar2;
        v.e eVar9 = eVar7;
        HashMap hashMap4 = hashMap2;
        Collection<?> collection = arrayList7;
        View view12 = view5;
        s sVar3 = sVar2;
        Collection<?> collection2 = arrayList8;
        v.e eVar10 = eVar8;
        Rect rect4 = rect2;
        ArrayList arrayList11 = new ArrayList();
        Iterator<m> it4 = list.iterator();
        Object obj4 = null;
        Object obj5 = null;
        while (it4.hasNext()) {
            m next4 = it4.next();
            if (next4.d()) {
                hashMap4.put(next4.b(), Boolean.FALSE);
                next4.a();
                it4 = it4;
            } else {
                Iterator<m> it5 = it4;
                Object f2 = sVar3.f(next4.h());
                v.e b3 = next4.b();
                if (obj3 != null && (b3 == eVar9 || b3 == eVar10)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (f2 == null) {
                    if (!z3) {
                        hashMap4.put(b3, Boolean.FALSE);
                        next4.a();
                    }
                    view = view12;
                    str3 = str;
                    arrayList = collection;
                    arrayList2 = collection2;
                    obj = obj4;
                    obj2 = obj5;
                    eVar3 = eVar10;
                    view2 = view11;
                } else {
                    str3 = str;
                    ArrayList<View> arrayList12 = new ArrayList<>();
                    Object obj6 = obj4;
                    t(arrayList12, b3.f().mView);
                    if (z3) {
                        if (b3 == eVar9) {
                            arrayList12.removeAll(collection);
                        } else {
                            arrayList12.removeAll(collection2);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        sVar3.a(f2, view12);
                        view = view12;
                        arrayList = collection;
                        arrayList2 = collection2;
                        obj2 = obj5;
                        eVar4 = b3;
                        eVar3 = eVar10;
                        obj = obj6;
                    } else {
                        sVar3.b(f2, arrayList12);
                        view = view12;
                        obj = obj6;
                        arrayList = collection;
                        obj2 = obj5;
                        arrayList2 = collection2;
                        eVar3 = eVar10;
                        sVar3.n(f2, f2, arrayList12, null, null, null, null);
                        if (b3.e() == v.e.c.GONE) {
                            eVar4 = b3;
                            list2.remove(eVar4);
                            ArrayList<View> arrayList13 = new ArrayList<>(arrayList12);
                            arrayList13.remove(eVar4.f().mView);
                            sVar3.m(f2, eVar4.f().mView, arrayList13);
                            z97.a(m(), new i(arrayList12));
                        } else {
                            eVar4 = b3;
                        }
                    }
                    if (eVar4.e() == v.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z5) {
                            sVar3.o(f2, rect4);
                        }
                        view2 = view11;
                    } else {
                        view2 = view11;
                        sVar3.p(f2, view2);
                    }
                    hashMap4.put(eVar4, Boolean.TRUE);
                    if (next4.j()) {
                        obj2 = sVar3.k(obj2, f2, null);
                    } else {
                        obj = sVar3.k(obj, f2, null);
                    }
                }
                it4 = it5;
                obj4 = obj;
                view11 = view2;
                obj5 = obj2;
                eVar10 = eVar3;
                str = str3;
                view12 = view;
                collection = arrayList;
                collection2 = arrayList2;
            }
        }
        String str6 = str;
        ArrayList<View> arrayList14 = collection;
        ArrayList<View> arrayList15 = collection2;
        v.e eVar11 = eVar10;
        Object j2 = sVar3.j(obj5, obj4, obj3);
        if (j2 == null) {
            return hashMap4;
        }
        for (m mVar3 : list) {
            if (!mVar3.d()) {
                Object h2 = mVar3.h();
                v.e b4 = mVar3.b();
                if (obj3 != null && (b4 == eVar9 || b4 == eVar11)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (h2 == null && !z2) {
                    str2 = str6;
                } else if (!syb.Y(m())) {
                    if (FragmentManager.M0(2)) {
                        str2 = str6;
                        Log.v(str2, "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + b4);
                    } else {
                        str2 = str6;
                    }
                    mVar3.a();
                } else {
                    str2 = str6;
                    sVar3.q(mVar3.b().f(), j2, mVar3.c(), new j(mVar3, b4));
                }
                str6 = str2;
            }
        }
        String str7 = str6;
        if (!syb.Y(m())) {
            return hashMap4;
        }
        q.e(arrayList11, 4);
        ArrayList<String> l2 = sVar3.l(arrayList15);
        if (FragmentManager.M0(2)) {
            Log.v(str7, ">>>>> Beginning transition <<<<<");
            Log.v(str7, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator<View> it6 = arrayList14.iterator();
            while (it6.hasNext()) {
                Log.v(str7, "View: " + it6.next() + " Name: " + syb.N(next2));
            }
            Log.v(str7, ">>>>> SharedElementLastInViews <<<<<");
            Iterator<View> it7 = arrayList15.iterator();
            while (it7.hasNext()) {
                Log.v(str7, "View: " + it7.next() + " Name: " + syb.N(next));
            }
        }
        sVar3.c(m(), j2);
        sVar3.r(m(), arrayList14, arrayList15, l2, lrVar5);
        q.e(arrayList11, 0);
        sVar3.t(obj3, arrayList14, arrayList15);
        return hashMap4;
    }

    private void y(@NonNull List<v.e> list) {
        Fragment f2 = list.get(list.size() - 1).f();
        for (v.e eVar : list) {
            eVar.f().mAnimationInfo.c = f2.mAnimationInfo.c;
            eVar.f().mAnimationInfo.d = f2.mAnimationInfo.d;
            eVar.f().mAnimationInfo.e = f2.mAnimationInfo.e;
            eVar.f().mAnimationInfo.f = f2.mAnimationInfo.f;
        }
    }

    @Override // androidx.fragment.app.v
    void f(@NonNull List<v.e> list, boolean z) {
        v.e eVar = null;
        v.e eVar2 = null;
        for (v.e eVar3 : list) {
            v.e.c k2 = v.e.c.k(eVar3.f().mView);
            int i2 = a.a[eVar3.e().ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                if (i2 == 4 && k2 != v.e.c.VISIBLE) {
                    eVar2 = eVar3;
                }
            } else if (k2 == v.e.c.VISIBLE && eVar == null) {
                eVar = eVar3;
            }
        }
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Executing operations from " + eVar + " to " + eVar2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<v.e> arrayList3 = new ArrayList(list);
        y(list);
        for (v.e eVar4 : list) {
            ln0 ln0Var = new ln0();
            eVar4.j(ln0Var);
            arrayList.add(new k(eVar4, ln0Var, z));
            ln0 ln0Var2 = new ln0();
            eVar4.j(ln0Var2);
            boolean z2 = false;
            if (z) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, ln0Var2, z, z2));
                    eVar4.a(new RunnableC0034b(arrayList3, eVar4));
                }
                z2 = true;
                arrayList2.add(new m(eVar4, ln0Var2, z, z2));
                eVar4.a(new RunnableC0034b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, ln0Var2, z, z2));
                    eVar4.a(new RunnableC0034b(arrayList3, eVar4));
                }
                z2 = true;
                arrayList2.add(new m(eVar4, ln0Var2, z, z2));
                eVar4.a(new RunnableC0034b(arrayList3, eVar4));
            }
        }
        Map<v.e, Boolean> x = x(arrayList2, arrayList3, z, eVar, eVar2);
        w(arrayList, arrayList3, x.containsValue(Boolean.TRUE), x);
        for (v.e eVar5 : arrayList3) {
            s(eVar5);
        }
        arrayList3.clear();
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + eVar + " to " + eVar2);
        }
    }

    void s(@NonNull v.e eVar) {
        eVar.e().a(eVar.f().mView);
    }

    void t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (czb.a(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(viewGroup);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    t(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    void u(Map<String, View> map, @NonNull View view) {
        String N = syb.N(view);
        if (N != null) {
            map.put(N, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(@NonNull lr<String, View> lrVar, @NonNull Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = lrVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(syb.N(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {
        final /* synthetic */ v.e a;
        final /* synthetic */ ViewGroup b;
        final /* synthetic */ View c;
        final /* synthetic */ k d;

        /* compiled from: DefaultSpecialEffectsController.java */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.b.endViewTransition(eVar.c);
                e.this.d.a();
            }
        }

        e(v.e eVar, ViewGroup viewGroup, View view, k kVar) {
            this.a = eVar;
            this.b = viewGroup;
            this.c = view;
            this.d = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.b.post(new a());
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }
}
