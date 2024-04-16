package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseMenuWrapper.java */
/* renamed from: a80  reason: default package */
/* loaded from: classes.dex */
public abstract class a80 {
    final Context a;
    private wka<s2b, MenuItem> b;
    private wka<d3b, SubMenu> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a80(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof s2b) {
            s2b s2bVar = (s2b) menuItem;
            if (this.b == null) {
                this.b = new wka<>();
            }
            MenuItem menuItem2 = this.b.get(s2bVar);
            if (menuItem2 == null) {
                if6 if6Var = new if6(this.a, s2bVar);
                this.b.put(s2bVar, if6Var);
                return if6Var;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof d3b) {
            d3b d3bVar = (d3b) subMenu;
            if (this.c == null) {
                this.c = new wka<>();
            }
            SubMenu subMenu2 = this.c.get(d3bVar);
            if (subMenu2 == null) {
                y0b y0bVar = new y0b(this.a, d3bVar);
                this.c.put(d3bVar, y0bVar);
                return y0bVar;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        wka<s2b, MenuItem> wkaVar = this.b;
        if (wkaVar != null) {
            wkaVar.clear();
        }
        wka<d3b, SubMenu> wkaVar2 = this.c;
        if (wkaVar2 != null) {
            wkaVar2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i) {
        if (this.b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.b.size()) {
            if (this.b.k(i2).getGroupId() == i) {
                this.b.m(i2);
                i2--;
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i) {
        if (this.b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (this.b.k(i2).getItemId() == i) {
                this.b.m(i2);
                return;
            }
        }
    }
}
