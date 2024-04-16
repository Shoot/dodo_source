package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.j;
/* compiled from: MenuDialogHelper.java */
/* loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {
    private e a;
    private androidx.appcompat.app.b b;
    c c;
    private j.a d;

    public f(e eVar) {
        this.a = eVar;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void a(@NonNull e eVar, boolean z) {
        if (z || eVar == this.a) {
            c();
        }
        j.a aVar = this.d;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean b(@NonNull e eVar) {
        j.a aVar = this.d;
        if (aVar != null) {
            return aVar.b(eVar);
        }
        return false;
    }

    public void c() {
        androidx.appcompat.app.b bVar = this.b;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        e eVar = this.a;
        b.a aVar = new b.a(eVar.w());
        c cVar = new c(aVar.b(), xz8.l);
        this.c = cVar;
        cVar.e(this);
        this.a.b(this.c);
        aVar.c(this.c.b(), this);
        View A = eVar.A();
        if (A != null) {
            aVar.e(A);
        } else {
            aVar.f(eVar.y()).s(eVar.z());
        }
        aVar.m(this);
        androidx.appcompat.app.b a = aVar.a();
        this.b = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.N((g) this.c.b().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.c.a(this.a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.a.performShortcut(i, keyEvent, 0);
    }
}
