package defpackage;

import androidx.annotation.NonNull;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ConstraintController.java */
/* renamed from: ir1  reason: default package */
/* loaded from: classes.dex */
public abstract class ir1<T> implements jr1<T> {
    private final List<String> a = new ArrayList();
    private T b;
    private kr1<T> c;
    private a d;

    /* compiled from: ConstraintController.java */
    /* renamed from: ir1$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(@NonNull List<String> list);

        void b(@NonNull List<String> list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ir1(kr1<T> kr1Var) {
        this.c = kr1Var;
    }

    private void h(a aVar, T t) {
        if (!this.a.isEmpty() && aVar != null) {
            if (t != null && !c(t)) {
                aVar.a(this.a);
            } else {
                aVar.b(this.a);
            }
        }
    }

    @Override // defpackage.jr1
    public void a(T t) {
        this.b = t;
        h(this.d, t);
    }

    abstract boolean b(@NonNull WorkSpec workSpec);

    abstract boolean c(@NonNull T t);

    public boolean d(@NonNull String str) {
        T t = this.b;
        if (t != null && c(t) && this.a.contains(str)) {
            return true;
        }
        return false;
    }

    public void e(@NonNull Iterable<WorkSpec> iterable) {
        this.a.clear();
        for (WorkSpec workSpec : iterable) {
            if (b(workSpec)) {
                this.a.add(workSpec.a);
            }
        }
        if (this.a.isEmpty()) {
            this.c.c(this);
        } else {
            this.c.a(this);
        }
        h(this.d, this.b);
    }

    public void f() {
        if (!this.a.isEmpty()) {
            this.a.clear();
            this.c.c(this);
        }
    }

    public void g(a aVar) {
        if (this.d != aVar) {
            this.d = aVar;
            h(aVar, this.b);
        }
    }
}
