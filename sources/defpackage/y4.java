package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
/* compiled from: ActionProvider.java */
/* renamed from: y4  reason: default package */
/* loaded from: classes.dex */
public abstract class y4 {
    private final Context a;
    private a b;
    private b c;

    /* compiled from: ActionProvider.java */
    /* renamed from: y4$a */
    /* loaded from: classes.dex */
    public interface a {
        void b(boolean z);
    }

    /* compiled from: ActionProvider.java */
    /* renamed from: y4$b */
    /* loaded from: classes.dex */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public y4(@NonNull Context context) {
        this.a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    @NonNull
    public abstract View c();

    @NonNull
    public View d(@NonNull MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.c = null;
        this.b = null;
    }

    public void i(a aVar) {
        this.b = aVar;
    }

    public void j(b bVar) {
        if (this.c != null && bVar != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.c = bVar;
    }

    public void k(boolean z) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.b(z);
        }
    }

    public void f(@NonNull SubMenu subMenu) {
    }
}
