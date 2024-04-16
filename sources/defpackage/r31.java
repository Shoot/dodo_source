package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import defpackage.aa6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: CheckableGroup.java */
/* renamed from: r31  reason: default package */
/* loaded from: classes2.dex */
public class r31<T extends aa6<T>> {
    private final Map<Integer, T> a = new HashMap();
    private final Set<Integer> b = new HashSet();
    private b c;
    private boolean d;
    private boolean e;

    /* compiled from: CheckableGroup.java */
    /* renamed from: r31$a */
    /* loaded from: classes2.dex */
    class a implements aa6.a<T> {
        a() {
        }

        @Override // defpackage.aa6.a
        /* renamed from: b */
        public void a(T t, boolean z) {
            if (z) {
                if (!r31.this.g(t)) {
                    return;
                }
            } else {
                r31 r31Var = r31.this;
                if (!r31Var.r(t, r31Var.e)) {
                    return;
                }
            }
            r31.this.m();
        }
    }

    /* compiled from: CheckableGroup.java */
    /* renamed from: r31$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a(@NonNull Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(@NonNull aa6<T> aa6Var) {
        int id = aa6Var.getId();
        if (this.b.contains(Integer.valueOf(id))) {
            return false;
        }
        T t = this.a.get(Integer.valueOf(k()));
        if (t != null) {
            r(t, false);
        }
        boolean add = this.b.add(Integer.valueOf(id));
        if (!aa6Var.isChecked()) {
            aa6Var.setChecked(true);
        }
        return add;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        b bVar = this.c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(@NonNull aa6<T> aa6Var, boolean z) {
        int id = aa6Var.getId();
        if (!this.b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && this.b.size() == 1 && this.b.contains(Integer.valueOf(id))) {
            aa6Var.setChecked(true);
            return false;
        }
        boolean remove = this.b.remove(Integer.valueOf(id));
        if (aa6Var.isChecked()) {
            aa6Var.setChecked(false);
        }
        return remove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(T t) {
        this.a.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            g(t);
        }
        t.setInternalOnCheckedChangeListener(new a());
    }

    public void f(int i) {
        T t = this.a.get(Integer.valueOf(i));
        if (t != null && g(t)) {
            m();
        }
    }

    public void h() {
        boolean z = !this.b.isEmpty();
        for (T t : this.a.values()) {
            r(t, false);
        }
        if (z) {
            m();
        }
    }

    @NonNull
    public Set<Integer> i() {
        return new HashSet(this.b);
    }

    @NonNull
    public List<Integer> j(@NonNull ViewGroup viewGroup) {
        Set<Integer> i = i();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof aa6) && i.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int k() {
        if (this.d && !this.b.isEmpty()) {
            return this.b.iterator().next().intValue();
        }
        return -1;
    }

    public boolean l() {
        return this.d;
    }

    public void n(T t) {
        t.setInternalOnCheckedChangeListener(null);
        this.a.remove(Integer.valueOf(t.getId()));
        this.b.remove(Integer.valueOf(t.getId()));
    }

    public void o(b bVar) {
        this.c = bVar;
    }

    public void p(boolean z) {
        this.e = z;
    }

    public void q(boolean z) {
        if (this.d != z) {
            this.d = z;
            h();
        }
    }
}
