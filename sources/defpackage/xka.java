package defpackage;

import defpackage.cb5;
/* compiled from: SimpleBeanPropertyDefinition.java */
/* renamed from: xka  reason: default package */
/* loaded from: classes2.dex */
public class xka extends ja0 {
    protected final ql b;
    protected final hl c;
    protected final uq8 d;
    protected final vq8 e;
    protected final cb5.b f;

    protected xka(ql qlVar, hl hlVar, vq8 vq8Var, uq8 uq8Var, cb5.b bVar) {
        this.b = qlVar;
        this.c = hlVar;
        this.e = vq8Var;
        this.d = uq8Var == null ? uq8.i : uq8Var;
        this.f = bVar;
    }

    public static xka D(w76<?> w76Var, hl hlVar, vq8 vq8Var, uq8 uq8Var, cb5.a aVar) {
        cb5.b bVar;
        if (aVar != null && aVar != cb5.a.USE_DEFAULTS) {
            bVar = cb5.b.a(aVar, null);
        } else {
            bVar = ja0.a;
        }
        return new xka(w76Var.i(), hlVar, vq8Var, uq8Var, bVar);
    }

    @Override // defpackage.ja0
    public vq8 A() {
        hl hlVar;
        ql qlVar = this.b;
        if (qlVar != null && (hlVar = this.c) != null) {
            return qlVar.E0(hlVar);
        }
        return null;
    }

    @Override // defpackage.ja0
    public boolean B() {
        return false;
    }

    @Override // defpackage.ja0
    public cb5.b g() {
        return this.f;
    }

    @Override // defpackage.ja0
    public ll o() {
        hl hlVar = this.c;
        if (hlVar instanceof ll) {
            return (ll) hlVar;
        }
        return null;
    }

    @Override // defpackage.ja0
    public fl p() {
        hl hlVar = this.c;
        if (hlVar instanceof fl) {
            return (fl) hlVar;
        }
        return null;
    }

    @Override // defpackage.ja0
    public vq8 q() {
        return this.e;
    }

    @Override // defpackage.ja0
    public il s() {
        hl hlVar = this.c;
        if ((hlVar instanceof il) && ((il) hlVar).y() == 0) {
            return (il) this.c;
        }
        return null;
    }

    @Override // defpackage.ja0
    public uq8 t() {
        return this.d;
    }

    @Override // defpackage.ja0
    public String v() {
        return this.e.c();
    }

    @Override // defpackage.ja0
    public hl w() {
        return this.c;
    }

    @Override // defpackage.ja0
    public Class<?> x() {
        hl hlVar = this.c;
        if (hlVar == null) {
            return Object.class;
        }
        return hlVar.c();
    }

    @Override // defpackage.ja0
    public il z() {
        hl hlVar = this.c;
        if ((hlVar instanceof il) && ((il) hlVar).y() == 1) {
            return (il) this.c;
        }
        return null;
    }
}
