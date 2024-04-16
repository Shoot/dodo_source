package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
/* compiled from: ActionMode.java */
/* renamed from: x4  reason: default package */
/* loaded from: classes.dex */
public abstract class x4 {
    private Object a;
    private boolean b;

    /* compiled from: ActionMode.java */
    /* renamed from: x4$a */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(x4 x4Var, MenuItem menuItem);

        void b(x4 x4Var);

        boolean c(x4 x4Var, Menu menu);

        boolean d(x4 x4Var, Menu menu);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.a;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.b;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.a = obj;
    }

    public abstract void q(int i);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z) {
        this.b = z;
    }
}
