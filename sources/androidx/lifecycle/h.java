package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.d;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LifecycleRegistry.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 /2\u00020\u0001:\u0002\u0018\u001bB\u0019\b\u0002\u0012\u0006\u00106\u001a\u00020\f\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b7\u00108B\u0011\b\u0016\u0012\u0006\u00106\u001a\u00020\f¢\u0006\u0004\b7\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0003J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0017J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010'R\u0016\u0010)\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0016\u0010*\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR&\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u00020+j\b\u0012\u0004\u0012\u00020\u0002`,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010-R\u0014\u00101\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R$\u00105\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u00102\"\u0004\b3\u00104¨\u0006:"}, d2 = {"Landroidx/lifecycle/h;", "Landroidx/lifecycle/d;", "Landroidx/lifecycle/d$b;", StatisticManager.NEXT, "", "l", "Lnp5;", "observer", "f", Image.TYPE_MEDIUM, "state", "n", "Lop5;", "lifecycleOwner", Image.TYPE_HIGH, com.huawei.hms.push.e.a, "p", "", "methodName", "g", "k", "Landroidx/lifecycle/d$a;", "event", "i", "a", DateTokenConverter.CONVERTER_KEY, "", "b", "Z", "enforceMainThread", "Lcp3;", "Landroidx/lifecycle/h$b;", com.huawei.hms.opendevice.c.a, "Lcp3;", "observerMap", "Landroidx/lifecycle/d$b;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "I", "addingObserverCounter", "handlingEvent", "newEventOccurred", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "parentStates", "j", "()Z", "isSynced", "()Landroidx/lifecycle/d$b;", "o", "(Landroidx/lifecycle/d$b;)V", "currentState", "provider", "<init>", "(Lop5;Z)V", "(Lop5;)V", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class h extends d {
    public static final a j = new a(null);
    private final boolean b;
    private cp3<np5, b> c;
    private d.b d;
    private final WeakReference<op5> e;
    private int f;
    private boolean g;
    private boolean h;
    private ArrayList<d.b> i;

    /* compiled from: LifecycleRegistry.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/lifecycle/h$a;", "", "Landroidx/lifecycle/d$b;", "state1", "state2", "a", "(Landroidx/lifecycle/d$b;Landroidx/lifecycle/d$b;)Landroidx/lifecycle/d$b;", "<init>", "()V", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d.b a(d.b bVar, d.b bVar2) {
            z65.h(bVar, "state1");
            if (bVar2 != null && bVar2.compareTo(bVar) < 0) {
                return bVar2;
            }
            return bVar;
        }
    }

    /* compiled from: LifecycleRegistry.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/h$b;", "", "Lop5;", "owner", "Landroidx/lifecycle/d$a;", "event", "", "a", "Landroidx/lifecycle/d$b;", "Landroidx/lifecycle/d$b;", "b", "()Landroidx/lifecycle/d$b;", "setState", "(Landroidx/lifecycle/d$b;)V", "state", "Landroidx/lifecycle/g;", "Landroidx/lifecycle/g;", "getLifecycleObserver", "()Landroidx/lifecycle/g;", "setLifecycleObserver", "(Landroidx/lifecycle/g;)V", "lifecycleObserver", "Lnp5;", "observer", "initialState", "<init>", "(Lnp5;Landroidx/lifecycle/d$b;)V", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class b {
        private d.b a;
        private g b;

        public b(np5 np5Var, d.b bVar) {
            z65.h(bVar, "initialState");
            z65.e(np5Var);
            this.b = i.f(np5Var);
            this.a = bVar;
        }

        public final void a(op5 op5Var, d.a aVar) {
            z65.h(aVar, "event");
            d.b k = aVar.k();
            this.a = h.j.a(this.a, k);
            g gVar = this.b;
            z65.e(op5Var);
            gVar.d(op5Var, aVar);
            this.a = k;
        }

        public final d.b b() {
            return this.a;
        }
    }

    private h(op5 op5Var, boolean z) {
        this.b = z;
        this.c = new cp3<>();
        this.d = d.b.INITIALIZED;
        this.i = new ArrayList<>();
        this.e = new WeakReference<>(op5Var);
    }

    private final void e(op5 op5Var) {
        Iterator<Map.Entry<np5, b>> descendingIterator = this.c.descendingIterator();
        z65.g(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.h) {
            Map.Entry<np5, b> next = descendingIterator.next();
            z65.g(next, "next()");
            np5 key = next.getKey();
            b value = next.getValue();
            while (value.b().compareTo(this.d) > 0 && !this.h && this.c.contains(key)) {
                d.a a2 = d.a.Companion.a(value.b());
                if (a2 != null) {
                    n(a2.k());
                    value.a(op5Var, a2);
                    m();
                } else {
                    throw new IllegalStateException("no event down from " + value.b());
                }
            }
        }
    }

    private final d.b f(np5 np5Var) {
        d.b bVar;
        ArrayList<d.b> arrayList;
        b value;
        Map.Entry<np5, b> t = this.c.t(np5Var);
        d.b bVar2 = null;
        if (t != null && (value = t.getValue()) != null) {
            bVar = value.b();
        } else {
            bVar = null;
        }
        if (!this.i.isEmpty()) {
            bVar2 = this.i.get(arrayList.size() - 1);
        }
        a aVar = j;
        return aVar.a(aVar.a(this.d, bVar), bVar2);
    }

    @SuppressLint({"RestrictedApi"})
    private final void g(String str) {
        if (this.b && !uq.g().b()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    private final void h(op5 op5Var) {
        vs9<np5, b>.d f = this.c.f();
        z65.g(f, "observerMap.iteratorWithAdditions()");
        while (f.hasNext() && !this.h) {
            Map.Entry next = f.next();
            np5 np5Var = (np5) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.b().compareTo(this.d) < 0 && !this.h && this.c.contains(np5Var)) {
                n(bVar.b());
                d.a b2 = d.a.Companion.b(bVar.b());
                if (b2 != null) {
                    bVar.a(op5Var, b2);
                    m();
                } else {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
            }
        }
    }

    private final boolean j() {
        if (this.c.size() == 0) {
            return true;
        }
        Map.Entry<np5, b> a2 = this.c.a();
        z65.e(a2);
        d.b b2 = a2.getValue().b();
        Map.Entry<np5, b> g = this.c.g();
        z65.e(g);
        d.b b3 = g.getValue().b();
        if (b2 == b3 && this.d == b3) {
            return true;
        }
        return false;
    }

    private final void l(d.b bVar) {
        d.b bVar2 = this.d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == d.b.INITIALIZED && bVar == d.b.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.d + " in component " + this.e.get()).toString());
        }
        this.d = bVar;
        if (!this.g && this.f == 0) {
            this.g = true;
            p();
            this.g = false;
            if (this.d == d.b.DESTROYED) {
                this.c = new cp3<>();
                return;
            }
            return;
        }
        this.h = true;
    }

    private final void m() {
        ArrayList<d.b> arrayList = this.i;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void n(d.b bVar) {
        this.i.add(bVar);
    }

    private final void p() {
        op5 op5Var = this.e.get();
        if (op5Var != null) {
            while (!j()) {
                this.h = false;
                d.b bVar = this.d;
                Map.Entry<np5, b> a2 = this.c.a();
                z65.e(a2);
                if (bVar.compareTo(a2.getValue().b()) < 0) {
                    e(op5Var);
                }
                Map.Entry<np5, b> g = this.c.g();
                if (!this.h && g != null && this.d.compareTo(g.getValue().b()) > 0) {
                    h(op5Var);
                }
            }
            this.h = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    @Override // androidx.lifecycle.d
    public void a(np5 np5Var) {
        op5 op5Var;
        boolean z;
        z65.h(np5Var, "observer");
        g("addObserver");
        d.b bVar = this.d;
        d.b bVar2 = d.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = d.b.INITIALIZED;
        }
        b bVar3 = new b(np5Var, bVar2);
        if (this.c.k(np5Var, bVar3) != null || (op5Var = this.e.get()) == null) {
            return;
        }
        if (this.f == 0 && !this.g) {
            z = false;
        } else {
            z = true;
        }
        d.b f = f(np5Var);
        this.f++;
        while (bVar3.b().compareTo(f) < 0 && this.c.contains(np5Var)) {
            n(bVar3.b());
            d.a b2 = d.a.Companion.b(bVar3.b());
            if (b2 != null) {
                bVar3.a(op5Var, b2);
                m();
                f = f(np5Var);
            } else {
                throw new IllegalStateException("no event up from " + bVar3.b());
            }
        }
        if (!z) {
            p();
        }
        this.f--;
    }

    @Override // androidx.lifecycle.d
    public d.b b() {
        return this.d;
    }

    @Override // androidx.lifecycle.d
    public void d(np5 np5Var) {
        z65.h(np5Var, "observer");
        g("removeObserver");
        this.c.p(np5Var);
    }

    public void i(d.a aVar) {
        z65.h(aVar, "event");
        g("handleLifecycleEvent");
        l(aVar.k());
    }

    public void k(d.b bVar) {
        z65.h(bVar, "state");
        g("markState");
        o(bVar);
    }

    public void o(d.b bVar) {
        z65.h(bVar, "state");
        g("setCurrentState");
        l(bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(op5 op5Var) {
        this(op5Var, true);
        z65.h(op5Var, "provider");
    }
}
