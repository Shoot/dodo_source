package defpackage;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import defpackage.f74;
import java.util.WeakHashMap;
/* compiled from: FragmentStateMonitor.java */
/* renamed from: t64  reason: default package */
/* loaded from: classes2.dex */
public class t64 extends FragmentManager.l {
    private static final sh f = sh.e();
    private final WeakHashMap<Fragment, Trace> a = new WeakHashMap<>();
    private final v91 b;
    private final jmb c;
    private final gp d;
    private final g74 e;

    public t64(v91 v91Var, jmb jmbVar, gp gpVar, g74 g74Var) {
        this.b = v91Var;
        this.c = jmbVar;
        this.d = gpVar;
        this.e = g74Var;
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public void f(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        super.f(fragmentManager, fragment);
        sh shVar = f;
        shVar.b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.a.containsKey(fragment)) {
            shVar.k("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = this.a.get(fragment);
        this.a.remove(fragment);
        qb7<f74.a> f2 = this.e.f(fragment);
        if (!f2.d()) {
            shVar.k("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
            return;
        }
        hx9.a(trace, f2.c());
        trace.stop();
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public void i(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        String simpleName;
        super.i(fragmentManager, fragment);
        f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(o(fragment), this.c, this.b, this.d);
        trace.start();
        if (fragment.getParentFragment() == null) {
            simpleName = "No parent";
        } else {
            simpleName = fragment.getParentFragment().getClass().getSimpleName();
        }
        trace.putAttribute("Parent_fragment", simpleName);
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.a.put(fragment, trace);
        this.e.d(fragment);
    }

    public String o(Fragment fragment) {
        return "_st_" + fragment.getClass().getSimpleName();
    }
}
