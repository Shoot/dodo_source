package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
/* compiled from: NavigationBarMenu.java */
/* renamed from: su6  reason: default package */
/* loaded from: classes2.dex */
public final class su6 extends e {
    @NonNull
    private final Class<?> B;
    private final int C;

    public su6(@NonNull Context context, @NonNull Class<?> cls, int i) {
        super(context);
        this.B = cls;
        this.C = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.view.menu.e
    @NonNull
    public MenuItem a(int i, int i2, int i3, @NonNull CharSequence charSequence) {
        if (size() + 1 <= this.C) {
            h0();
            MenuItem a = super.a(i, i2, i3, charSequence);
            if (a instanceof g) {
                ((g) a).t(true);
            }
            g0();
            return a;
        }
        String simpleName = this.B.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.C + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i, int i2, int i3, @NonNull CharSequence charSequence) {
        throw new UnsupportedOperationException(this.B.getSimpleName() + " does not support submenus");
    }
}
