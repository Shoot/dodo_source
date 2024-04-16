package defpackage;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
/* compiled from: NavigationMenu.java */
/* renamed from: uu6  reason: default package */
/* loaded from: classes2.dex */
public class uu6 extends e {
    public uu6(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        g gVar = (g) a(i, i2, i3, charSequence);
        bv6 bv6Var = new bv6(w(), this, gVar);
        gVar.x(bv6Var);
        return bv6Var;
    }
}
