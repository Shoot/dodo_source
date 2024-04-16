package defpackage;

import android.view.View;
import com.google.android.gms.maps.model.MarkerOptions;
import defpackage.rg4;
import defpackage.u66;
/* compiled from: MarkerManager.java */
/* renamed from: p86  reason: default package */
/* loaded from: classes.dex */
public class p86 extends u66<m86, a> implements rg4.e, rg4.g, rg4.h, rg4.b {

    /* compiled from: MarkerManager.java */
    /* renamed from: p86$a */
    /* loaded from: classes.dex */
    public class a extends u66.b {
        private rg4.e c;
        private rg4.g d;
        private rg4.h e;
        private rg4.b f;

        public a() {
            super();
        }

        public m86 h(MarkerOptions markerOptions) {
            m86 a = p86.this.a.a(markerOptions);
            super.a(a);
            return a;
        }

        public void i(rg4.e eVar) {
            this.c = eVar;
        }

        public void j(rg4.g gVar) {
            this.d = gVar;
        }
    }

    public p86(rg4 rg4Var) {
        super(rg4Var);
    }

    @Override // defpackage.rg4.g
    public boolean a(m86 m86Var) {
        a aVar = (a) this.c.get(m86Var);
        if (aVar != null && aVar.d != null) {
            return aVar.d.a(m86Var);
        }
        return false;
    }

    @Override // defpackage.rg4.b
    public View b(m86 m86Var) {
        a aVar = (a) this.c.get(m86Var);
        if (aVar != null && aVar.f != null) {
            return aVar.f.b(m86Var);
        }
        return null;
    }

    @Override // defpackage.rg4.h
    public void c(m86 m86Var) {
        a aVar = (a) this.c.get(m86Var);
        if (aVar != null && aVar.e != null) {
            aVar.e.c(m86Var);
        }
    }

    @Override // defpackage.rg4.h
    public void d(m86 m86Var) {
        a aVar = (a) this.c.get(m86Var);
        if (aVar != null && aVar.e != null) {
            aVar.e.d(m86Var);
        }
    }

    @Override // defpackage.rg4.h
    public void e(m86 m86Var) {
        a aVar = (a) this.c.get(m86Var);
        if (aVar != null && aVar.e != null) {
            aVar.e.e(m86Var);
        }
    }

    @Override // defpackage.rg4.b
    public View f(m86 m86Var) {
        a aVar = (a) this.c.get(m86Var);
        if (aVar != null && aVar.f != null) {
            return aVar.f.f(m86Var);
        }
        return null;
    }

    @Override // defpackage.rg4.e
    public void g(m86 m86Var) {
        a aVar = (a) this.c.get(m86Var);
        if (aVar != null && aVar.c != null) {
            aVar.c.g(m86Var);
        }
    }

    @Override // defpackage.u66
    public /* bridge */ /* synthetic */ boolean h(m86 m86Var) {
        return super.h(m86Var);
    }

    @Override // defpackage.u66
    void j() {
        rg4 rg4Var = this.a;
        if (rg4Var != null) {
            rg4Var.o(this);
            this.a.q(this);
            this.a.r(this);
            this.a.k(this);
        }
    }

    public a k() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.u66
    /* renamed from: l */
    public void i(m86 m86Var) {
        m86Var.f();
    }
}
