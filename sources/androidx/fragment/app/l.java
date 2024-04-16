package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.s;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentManagerViewModel.java */
/* loaded from: classes.dex */
public final class l extends androidx.lifecycle.r {
    private static final s.b k = new a();
    private final boolean g;
    private final HashMap<String, Fragment> d = new HashMap<>();
    private final HashMap<String, l> e = new HashMap<>();
    private final HashMap<String, androidx.lifecycle.t> f = new HashMap<>();
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;

    /* compiled from: FragmentManagerViewModel.java */
    /* loaded from: classes.dex */
    class a implements s.b {
        a() {
        }

        @Override // androidx.lifecycle.s.b
        @NonNull
        public <T extends androidx.lifecycle.r> T a(@NonNull Class<T> cls) {
            return new l(true);
        }

        @Override // androidx.lifecycle.s.b
        public /* synthetic */ androidx.lifecycle.r b(Class cls, n22 n22Var) {
            return tzb.b(this, cls, n22Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(boolean z) {
        this.g = z;
    }

    private void i(@NonNull String str) {
        l lVar = this.e.get(str);
        if (lVar != null) {
            lVar.d();
            this.e.remove(str);
        }
        androidx.lifecycle.t tVar = this.f.get(str);
        if (tVar != null) {
            tVar.a();
            this.f.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static l l(androidx.lifecycle.t tVar) {
        return (l) new androidx.lifecycle.s(tVar, k).a(l.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.r
    public void d() {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.d.equals(lVar.d) && this.e.equals(lVar.e) && this.f.equals(lVar.f)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(@NonNull Fragment fragment) {
        if (this.j) {
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.d.containsKey(fragment.mWho)) {
        } else {
            this.d.put(fragment.mWho, fragment);
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(@NonNull Fragment fragment) {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        i(fragment.mWho);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(@NonNull String str) {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        i(str);
    }

    public int hashCode() {
        return (((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment j(String str) {
        return this.d.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public l k(@NonNull Fragment fragment) {
        l lVar = this.e.get(fragment.mWho);
        if (lVar == null) {
            l lVar2 = new l(this.g);
            this.e.put(fragment.mWho, lVar2);
            return lVar2;
        }
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Collection<Fragment> m() {
        return new ArrayList(this.d.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public androidx.lifecycle.t n(@NonNull Fragment fragment) {
        androidx.lifecycle.t tVar = this.f.get(fragment.mWho);
        if (tVar == null) {
            androidx.lifecycle.t tVar2 = new androidx.lifecycle.t();
            this.f.put(fragment.mWho, tVar2);
            return tVar2;
        }
        return tVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(@NonNull Fragment fragment) {
        if (this.j) {
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.d.remove(fragment.mWho) != null && FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(boolean z) {
        this.j = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(@NonNull Fragment fragment) {
        if (!this.d.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.g) {
            return this.h;
        }
        return !this.i;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }
}
