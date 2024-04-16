package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
/* compiled from: FragmentController.java */
/* loaded from: classes.dex */
public class f {
    private final h<?> a;

    private f(h<?> hVar) {
        this.a = hVar;
    }

    @NonNull
    public static f b(@NonNull h<?> hVar) {
        return new f((h) kh8.g(hVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        h<?> hVar = this.a;
        hVar.e.n(hVar, hVar, fragment);
    }

    public void c() {
        this.a.e.A();
    }

    public boolean d(@NonNull MenuItem menuItem) {
        return this.a.e.D(menuItem);
    }

    public void e() {
        this.a.e.E();
    }

    public void f() {
        this.a.e.G();
    }

    public void g() {
        this.a.e.P();
    }

    public void h() {
        this.a.e.T();
    }

    public void i() {
        this.a.e.U();
    }

    public void j() {
        this.a.e.W();
    }

    public boolean k() {
        return this.a.e.d0(true);
    }

    @NonNull
    public FragmentManager l() {
        return this.a.e;
    }

    public void m() {
        this.a.e.d1();
    }

    public View n(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.a.e.A0().onCreateView(view, str, context, attributeSet);
    }
}
