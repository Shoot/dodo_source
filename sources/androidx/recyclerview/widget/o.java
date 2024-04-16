package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: classes.dex */
public class o extends s2 {
    final RecyclerView d;
    private final a e;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    /* loaded from: classes.dex */
    public static class a extends s2 {
        final o d;
        private Map<View, s2> e = new WeakHashMap();

        public a(@NonNull o oVar) {
            this.d = oVar;
        }

        @Override // defpackage.s2
        public boolean a(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            s2 s2Var = this.e.get(view);
            if (s2Var != null) {
                return s2Var.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // defpackage.s2
        public g4 b(@NonNull View view) {
            s2 s2Var = this.e.get(view);
            if (s2Var != null) {
                return s2Var.b(view);
            }
            return super.b(view);
        }

        @Override // defpackage.s2
        public void f(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            s2 s2Var = this.e.get(view);
            if (s2Var != null) {
                s2Var.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // defpackage.s2
        public void g(View view, d4 d4Var) {
            if (!this.d.o() && this.d.d.getLayoutManager() != null) {
                this.d.d.getLayoutManager().V0(view, d4Var);
                s2 s2Var = this.e.get(view);
                if (s2Var != null) {
                    s2Var.g(view, d4Var);
                    return;
                } else {
                    super.g(view, d4Var);
                    return;
                }
            }
            super.g(view, d4Var);
        }

        @Override // defpackage.s2
        public void h(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            s2 s2Var = this.e.get(view);
            if (s2Var != null) {
                s2Var.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // defpackage.s2
        public boolean i(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            s2 s2Var = this.e.get(viewGroup);
            if (s2Var != null) {
                return s2Var.i(viewGroup, view, accessibilityEvent);
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // defpackage.s2
        public boolean j(View view, int i, Bundle bundle) {
            if (!this.d.o() && this.d.d.getLayoutManager() != null) {
                s2 s2Var = this.e.get(view);
                if (s2Var != null) {
                    if (s2Var.j(view, i, bundle)) {
                        return true;
                    }
                } else if (super.j(view, i, bundle)) {
                    return true;
                }
                return this.d.d.getLayoutManager().p1(view, i, bundle);
            }
            return super.j(view, i, bundle);
        }

        @Override // defpackage.s2
        public void l(@NonNull View view, int i) {
            s2 s2Var = this.e.get(view);
            if (s2Var != null) {
                s2Var.l(view, i);
            } else {
                super.l(view, i);
            }
        }

        @Override // defpackage.s2
        public void m(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            s2 s2Var = this.e.get(view);
            if (s2Var != null) {
                s2Var.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public s2 n(View view) {
            return this.e.remove(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void o(View view) {
            s2 n = syb.n(view);
            if (n != null && n != this) {
                this.e.put(view, n);
            }
        }
    }

    public o(@NonNull RecyclerView recyclerView) {
        this.d = recyclerView;
        s2 n = n();
        if (n != null && (n instanceof a)) {
            this.e = (a) n;
        } else {
            this.e = new a(this);
        }
    }

    @Override // defpackage.s2
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().R0(accessibilityEvent);
            }
        }
    }

    @Override // defpackage.s2
    public void g(View view, d4 d4Var) {
        super.g(view, d4Var);
        if (!o() && this.d.getLayoutManager() != null) {
            this.d.getLayoutManager().T0(d4Var);
        }
    }

    @Override // defpackage.s2
    public boolean j(View view, int i, Bundle bundle) {
        if (super.j(view, i, bundle)) {
            return true;
        }
        if (!o() && this.d.getLayoutManager() != null) {
            return this.d.getLayoutManager().n1(i, bundle);
        }
        return false;
    }

    @NonNull
    public s2 n() {
        return this.e;
    }

    boolean o() {
        return this.d.hasPendingAdapterUpdates();
    }
}
