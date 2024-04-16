package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
/* compiled from: PopupMenu.java */
/* renamed from: sf8  reason: default package */
/* loaded from: classes.dex */
public class sf8 {
    private final Context a;
    private final e b;
    private final View c;
    final i d;
    c e;

    /* compiled from: PopupMenu.java */
    /* renamed from: sf8$b */
    /* loaded from: classes.dex */
    class b implements PopupWindow.OnDismissListener {
        b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            sf8.this.getClass();
        }
    }

    /* compiled from: PopupMenu.java */
    /* renamed from: sf8$c */
    /* loaded from: classes.dex */
    public interface c {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public sf8(@NonNull Context context, @NonNull View view) {
        this(context, view, 0);
    }

    @NonNull
    public MenuInflater a() {
        return new r2b(this.a);
    }

    public void b(int i) {
        a().inflate(i, this.b);
    }

    public void c(c cVar) {
        this.e = cVar;
    }

    public void d() {
        this.d.k();
    }

    public sf8(@NonNull Context context, @NonNull View view, int i) {
        this(context, view, i, aw8.I, 0);
    }

    public sf8(@NonNull Context context, @NonNull View view, int i, int i2, int i3) {
        this.a = context;
        this.c = view;
        e eVar = new e(context);
        this.b = eVar;
        eVar.V(new a());
        i iVar = new i(context, eVar, view, false, i2, i3);
        this.d = iVar;
        iVar.h(i);
        iVar.i(new b());
    }

    /* compiled from: PopupMenu.java */
    /* renamed from: sf8$a */
    /* loaded from: classes.dex */
    class a implements e.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(@NonNull e eVar, @NonNull MenuItem menuItem) {
            c cVar = sf8.this.e;
            if (cVar != null) {
                return cVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(@NonNull e eVar) {
        }
    }
}
