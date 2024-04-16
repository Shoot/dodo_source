package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
/* compiled from: SubMenuBuilder.java */
/* loaded from: classes.dex */
public class m extends e implements SubMenu {
    private e B;
    private g C;

    public m(Context context, e eVar, g gVar) {
        super(context);
        this.B = eVar;
        this.C = gVar;
    }

    @Override // androidx.appcompat.view.menu.e
    public e F() {
        return this.B.F();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean H() {
        return this.B.H();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean I() {
        return this.B.I();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean J() {
        return this.B.J();
    }

    @Override // androidx.appcompat.view.menu.e
    public void V(e.a aVar) {
        this.B.V(aVar);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean f(g gVar) {
        return this.B.f(gVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.view.menu.e
    public boolean h(@NonNull e eVar, @NonNull MenuItem menuItem) {
        if (!super.h(eVar, menuItem) && !this.B.h(eVar, menuItem)) {
            return false;
        }
        return true;
    }

    public Menu i0() {
        return this.B;
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean m(g gVar) {
        return this.B.m(gVar);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.B.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.Z(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.c0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.d0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.B.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.e
    public String v() {
        int i;
        g gVar = this.C;
        if (gVar != null) {
            i = gVar.getItemId();
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return super.v() + ":" + i;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.Y(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.b0(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.C.setIcon(i);
        return this;
    }
}
