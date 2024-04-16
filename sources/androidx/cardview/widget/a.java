package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CardViewApi21Impl.java */
/* loaded from: classes.dex */
public class a implements c {
    private d p(b bVar) {
        return (d) bVar.d();
    }

    @Override // androidx.cardview.widget.c
    public void a(b bVar, float f) {
        p(bVar).h(f);
    }

    @Override // androidx.cardview.widget.c
    public float b(b bVar) {
        return p(bVar).d();
    }

    @Override // androidx.cardview.widget.c
    public void c(b bVar, float f) {
        bVar.f().setElevation(f);
    }

    @Override // androidx.cardview.widget.c
    public float d(b bVar) {
        return p(bVar).c();
    }

    @Override // androidx.cardview.widget.c
    public ColorStateList e(b bVar) {
        return p(bVar).b();
    }

    @Override // androidx.cardview.widget.c
    public float f(b bVar) {
        return b(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public void g(b bVar) {
        o(bVar, d(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void h(b bVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        bVar.a(new d(colorStateList, f));
        View f4 = bVar.f();
        f4.setClipToOutline(true);
        f4.setElevation(f2);
        o(bVar, f3);
    }

    @Override // androidx.cardview.widget.c
    public float i(b bVar) {
        return bVar.f().getElevation();
    }

    @Override // androidx.cardview.widget.c
    public void j(b bVar) {
        o(bVar, d(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void k(b bVar) {
        if (!bVar.c()) {
            bVar.b(0, 0, 0, 0);
            return;
        }
        float d = d(bVar);
        float b = b(bVar);
        int ceil = (int) Math.ceil(e.a(d, b, bVar.e()));
        int ceil2 = (int) Math.ceil(e.b(d, b, bVar.e()));
        bVar.b(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.c
    public float m(b bVar) {
        return b(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public void n(b bVar, ColorStateList colorStateList) {
        p(bVar).f(colorStateList);
    }

    @Override // androidx.cardview.widget.c
    public void o(b bVar, float f) {
        p(bVar).g(f, bVar.c(), bVar.e());
        k(bVar);
    }

    @Override // androidx.cardview.widget.c
    public void l() {
    }
}
