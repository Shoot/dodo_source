package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.appcompat.app.a;
import androidx.appcompat.app.e;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f0;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ToolbarActionBar.java */
/* loaded from: classes.dex */
public class i extends androidx.appcompat.app.a {
    final so2 a;
    final Window.Callback b;
    final e.g c;
    boolean d;
    private boolean e;
    private boolean f;
    private ArrayList<a.b> g = new ArrayList<>();
    private final Runnable h = new a();
    private final Toolbar.f i;

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.A();
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    class b implements Toolbar.f {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return i.this.b.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class c implements j.a {
        private boolean a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(@NonNull androidx.appcompat.view.menu.e eVar, boolean z) {
            if (this.a) {
                return;
            }
            this.a = true;
            i.this.a.r();
            i.this.b.onPanelClosed(108, eVar);
            this.a = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(@NonNull androidx.appcompat.view.menu.e eVar) {
            i.this.b.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
            if (i.this.a.f()) {
                i.this.b.onPanelClosed(108, eVar);
            } else if (i.this.b.onPreparePanel(0, null, eVar)) {
                i.this.b.onMenuOpened(108, eVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    private class e implements e.g {
        e() {
        }

        @Override // androidx.appcompat.app.e.g
        public boolean a(int i) {
            if (i == 0) {
                i iVar = i.this;
                if (!iVar.d) {
                    iVar.a.g();
                    i.this.d = true;
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // androidx.appcompat.app.e.g
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(i.this.a.getContext());
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(@NonNull Toolbar toolbar, CharSequence charSequence, @NonNull Window.Callback callback) {
        b bVar = new b();
        this.i = bVar;
        kh8.f(toolbar);
        f0 f0Var = new f0(toolbar, false);
        this.a = f0Var;
        this.b = (Window.Callback) kh8.f(callback);
        f0Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        f0Var.setWindowTitle(charSequence);
        this.c = new e();
    }

    private Menu z() {
        if (!this.e) {
            this.a.v(new c(), new d());
            this.e = true;
        }
        return this.a.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void A() {
        /*
            r5 = this;
            android.view.Menu r0 = r5.z()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.e
            r2 = 0
            if (r1 == 0) goto Ld
            r1 = r0
            androidx.appcompat.view.menu.e r1 = (androidx.appcompat.view.menu.e) r1
            goto Le
        Ld:
            r1 = r2
        Le:
            if (r1 == 0) goto L13
            r1.h0()
        L13:
            r0.clear()     // Catch: java.lang.Throwable -> L28
            android.view.Window$Callback r3 = r5.b     // Catch: java.lang.Throwable -> L28
            r4 = 0
            boolean r3 = r3.onCreatePanelMenu(r4, r0)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L2a
            android.view.Window$Callback r3 = r5.b     // Catch: java.lang.Throwable -> L28
            boolean r2 = r3.onPreparePanel(r4, r2, r0)     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L2d
            goto L2a
        L28:
            r0 = move-exception
            goto L33
        L2a:
            r0.clear()     // Catch: java.lang.Throwable -> L28
        L2d:
            if (r1 == 0) goto L32
            r1.g0()
        L32:
            return
        L33:
            if (r1 == 0) goto L38
            r1.g0()
        L38:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.i.A():void");
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        return this.a.c();
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        if (this.a.i()) {
            this.a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.g.get(i).a(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.a.x();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        return this.a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        this.a.n().removeCallbacks(this.h);
        syb.m0(this.a.n(), this.h);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.a
    public void n() {
        this.a.n().removeCallbacks(this.h);
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i, KeyEvent keyEvent) {
        int i2;
        Menu z = z();
        if (z == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z2 = false;
        }
        z.setQwertyMode(z2);
        return z.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean q() {
        return this.a.d();
    }

    @Override // androidx.appcompat.app.a
    public void r(Drawable drawable) {
        this.a.a(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void t(int i) {
        this.a.u(i);
    }

    @Override // androidx.appcompat.app.a
    public void u(Drawable drawable) {
        this.a.z(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void x(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z) {
    }
}
