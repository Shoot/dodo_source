package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import defpackage.x4;
import java.util.ArrayList;
/* compiled from: SupportActionModeWrapper.java */
/* renamed from: n2b  reason: default package */
/* loaded from: classes.dex */
public class n2b extends ActionMode {
    final Context a;
    final x4 b;

    /* compiled from: SupportActionModeWrapper.java */
    /* renamed from: n2b$a */
    /* loaded from: classes.dex */
    public static class a implements x4.a {
        final ActionMode.Callback a;
        final Context b;
        final ArrayList<n2b> c = new ArrayList<>();
        final wka<Menu, Menu> d = new wka<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.d.get(menu);
            if (menu2 == null) {
                oh6 oh6Var = new oh6(this.b, (q2b) menu);
                this.d.put(menu, oh6Var);
                return oh6Var;
            }
            return menu2;
        }

        @Override // defpackage.x4.a
        public boolean a(x4 x4Var, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(x4Var), new if6(this.b, (s2b) menuItem));
        }

        @Override // defpackage.x4.a
        public void b(x4 x4Var) {
            this.a.onDestroyActionMode(e(x4Var));
        }

        @Override // defpackage.x4.a
        public boolean c(x4 x4Var, Menu menu) {
            return this.a.onCreateActionMode(e(x4Var), f(menu));
        }

        @Override // defpackage.x4.a
        public boolean d(x4 x4Var, Menu menu) {
            return this.a.onPrepareActionMode(e(x4Var), f(menu));
        }

        public ActionMode e(x4 x4Var) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                n2b n2bVar = this.c.get(i);
                if (n2bVar != null && n2bVar.b == x4Var) {
                    return n2bVar;
                }
            }
            n2b n2bVar2 = new n2b(this.b, x4Var);
            this.c.add(n2bVar2);
            return n2bVar2;
        }
    }

    public n2b(Context context, x4 x4Var) {
        this.a = context;
        this.b = x4Var;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new oh6(this.a, (q2b) this.b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.b.s(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.b.n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.b.q(i);
    }
}
