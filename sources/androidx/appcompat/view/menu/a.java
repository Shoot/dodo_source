package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;
/* compiled from: BaseMenuPresenter.java */
/* loaded from: classes.dex */
public abstract class a implements j {
    protected Context a;
    protected Context b;
    protected e c;
    protected LayoutInflater d;
    protected LayoutInflater e;
    private j.a f;
    private int g;
    private int h;
    protected k i;
    private int j;

    public a(Context context, int i, int i2) {
        this.a = context;
        this.d = LayoutInflater.from(context);
        this.g = i;
        this.h = i2;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z) {
        j.a aVar = this.f;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    protected void c(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.i).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.j
    public boolean g(m mVar) {
        j.a aVar = this.f;
        m mVar2 = mVar;
        if (aVar != null) {
            if (mVar == null) {
                mVar2 = this.c;
            }
            return aVar.b(mVar2);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.j;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z) {
        g gVar;
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.c;
        int i = 0;
        if (eVar != null) {
            eVar.t();
            ArrayList<g> G = this.c.G();
            int size = G.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                g gVar2 = G.get(i3);
                if (t(i2, gVar2)) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof k.a) {
                        gVar = ((k.a) childAt).getItemData();
                    } else {
                        gVar = null;
                    }
                    View q = q(gVar2, childAt, viewGroup);
                    if (gVar2 != gVar) {
                        q.setPressed(false);
                        q.jumpDrawablesToCurrentState();
                    }
                    if (q != childAt) {
                        c(q, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!o(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(Context context, e eVar) {
        this.b = context;
        this.e = LayoutInflater.from(context);
        this.c = eVar;
    }

    public abstract void m(g gVar, k.a aVar);

    public k.a n(ViewGroup viewGroup) {
        return (k.a) this.d.inflate(this.h, viewGroup, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean o(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public j.a p() {
        return this.f;
    }

    public View q(g gVar, View view, ViewGroup viewGroup) {
        k.a n;
        if (view instanceof k.a) {
            n = (k.a) view;
        } else {
            n = n(viewGroup);
        }
        m(gVar, n);
        return (View) n;
    }

    public k r(ViewGroup viewGroup) {
        if (this.i == null) {
            k kVar = (k) this.d.inflate(this.g, viewGroup, false);
            this.i = kVar;
            kVar.c(this.c);
            i(true);
        }
        return this.i;
    }

    public void s(int i) {
        this.j = i;
    }

    public abstract boolean t(int i, g gVar);
}
