package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.y;
/* compiled from: DecorToolbar.java */
/* renamed from: so2  reason: default package */
/* loaded from: classes.dex */
public interface so2 {
    void a(Drawable drawable);

    boolean b();

    boolean c();

    void collapseActionView();

    boolean d();

    void e(Menu menu, j.a aVar);

    boolean f();

    void g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    boolean i();

    void j(int i);

    Menu k();

    int l();

    j0c m(int i, long j);

    ViewGroup n();

    void o(boolean z);

    void p();

    void q(boolean z);

    void r();

    void s(y yVar);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(int i);

    void u(int i);

    void v(j.a aVar, e.a aVar2);

    void w(int i);

    int x();

    void y();

    void z(Drawable drawable);
}
