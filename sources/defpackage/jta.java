package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import defpackage.x4;
import java.lang.ref.WeakReference;
/* compiled from: StandaloneActionMode.java */
/* renamed from: jta  reason: default package */
/* loaded from: classes.dex */
public class jta extends x4 implements e.a {
    private Context c;
    private ActionBarContextView d;
    private x4.a e;
    private WeakReference<View> f;
    private boolean g;
    private boolean h;
    private e i;

    public jta(Context context, ActionBarContextView actionBarContextView, x4.a aVar, boolean z) {
        this.c = context;
        this.d = actionBarContextView;
        this.e = aVar;
        e W = new e(actionBarContextView.getContext()).W(1);
        this.i = W;
        W.V(this);
        this.h = z;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(@NonNull e eVar, @NonNull MenuItem menuItem) {
        return this.e.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(@NonNull e eVar) {
        k();
        this.d.l();
    }

    @Override // defpackage.x4
    public void c() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.b(this);
    }

    @Override // defpackage.x4
    public View d() {
        WeakReference<View> weakReference = this.f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // defpackage.x4
    public Menu e() {
        return this.i;
    }

    @Override // defpackage.x4
    public MenuInflater f() {
        return new r2b(this.d.getContext());
    }

    @Override // defpackage.x4
    public CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override // defpackage.x4
    public CharSequence i() {
        return this.d.getTitle();
    }

    @Override // defpackage.x4
    public void k() {
        this.e.d(this, this.i);
    }

    @Override // defpackage.x4
    public boolean l() {
        return this.d.j();
    }

    @Override // defpackage.x4
    public void m(View view) {
        WeakReference<View> weakReference;
        this.d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.f = weakReference;
    }

    @Override // defpackage.x4
    public void n(int i) {
        o(this.c.getString(i));
    }

    @Override // defpackage.x4
    public void o(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // defpackage.x4
    public void q(int i) {
        r(this.c.getString(i));
    }

    @Override // defpackage.x4
    public void r(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // defpackage.x4
    public void s(boolean z) {
        super.s(z);
        this.d.setTitleOptional(z);
    }
}
