package defpackage;

import androidx.annotation.NonNull;
import defpackage.v86;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: RegistryImpl.java */
/* renamed from: mc9  reason: default package */
/* loaded from: classes3.dex */
class mc9 implements v86.b {
    private final List<v86> a;
    private final List<v86> b;
    private final Set<v86> c = new HashSet(3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public mc9(@NonNull List<v86> list) {
        this.a = list;
        this.b = new ArrayList(list.size());
    }

    private void b(@NonNull v86 v86Var) {
        if (!this.b.contains(v86Var)) {
            if (!this.c.contains(v86Var)) {
                this.c.add(v86Var);
                v86Var.configure(this);
                this.c.remove(v86Var);
                if (!this.b.contains(v86Var)) {
                    if (ww1.class.isAssignableFrom(v86Var.getClass())) {
                        this.b.add(0, v86Var);
                        return;
                    } else {
                        this.b.add(v86Var);
                        return;
                    }
                }
                return;
            }
            throw new IllegalStateException("Cyclic dependency chain found: " + this.c);
        }
    }

    private static <P extends v86> P c(@NonNull List<v86> list, @NonNull Class<P> cls) {
        Iterator<v86> it = list.iterator();
        while (it.hasNext()) {
            P p = (P) it.next();
            if (cls.isAssignableFrom(p.getClass())) {
                return p;
            }
        }
        return null;
    }

    @NonNull
    private <P extends v86> P d(@NonNull Class<P> cls) {
        P p = (P) c(this.b, cls);
        if (p == null) {
            p = (P) c(this.a, cls);
            if (p != null) {
                b(p);
            } else {
                throw new IllegalStateException("Requested plugin is not added: " + cls.getName() + ", plugins: " + this.a);
            }
        }
        return p;
    }

    @Override // defpackage.v86.b
    public <P extends v86> void a(@NonNull Class<P> cls, @NonNull v86.a<? super P> aVar) {
        aVar.apply(d(cls));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public List<v86> e() {
        for (v86 v86Var : this.a) {
            b(v86Var);
        }
        return this.b;
    }
}
