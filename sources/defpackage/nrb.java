package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.Serializable;
/* compiled from: UnwrappingBeanPropertyWriter.java */
/* renamed from: nrb  reason: default package */
/* loaded from: classes2.dex */
public class nrb extends ka0 implements Serializable {
    protected final ps6 t;

    public nrb(ka0 ka0Var, ps6 ps6Var) {
        super(ka0Var);
        this.t = ps6Var;
    }

    protected nrb M(ps6 ps6Var, vca vcaVar) {
        return new nrb(this, ps6Var, vcaVar);
    }

    @Override // defpackage.ka0
    /* renamed from: N */
    public nrb u(ps6 ps6Var) {
        return M(ps6.a(ps6Var, this.t), new vca(ps6Var.c(this.b.getValue())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ka0
    public gc5<Object> d(er8 er8Var, Class<?> cls, bda bdaVar) throws JsonMappingException {
        gc5<Object> f0;
        y85 y85Var = this.f;
        if (y85Var != null) {
            f0 = bdaVar.b0(bdaVar.w(y85Var, cls), this);
        } else {
            f0 = bdaVar.f0(cls, this);
        }
        ps6 ps6Var = this.t;
        if (f0.e() && (f0 instanceof orb)) {
            ps6Var = ps6.a(ps6Var, ((orb) f0).m);
        }
        gc5<Object> j = f0.j(ps6Var);
        this.n = this.n.i(cls, j);
        return j;
    }

    @Override // defpackage.ka0
    public void j(gc5<Object> gc5Var) {
        if (gc5Var != null) {
            ps6 ps6Var = this.t;
            if (gc5Var.e() && (gc5Var instanceof orb)) {
                ps6Var = ps6.a(ps6Var, ((orb) gc5Var).m);
            }
            gc5Var = gc5Var.j(ps6Var);
        }
        super.j(gc5Var);
    }

    @Override // defpackage.ka0
    public void x(Object obj, ua5 ua5Var, bda bdaVar) throws Exception {
        Object m = m(obj);
        if (m == null) {
            return;
        }
        gc5<?> gc5Var = this.k;
        if (gc5Var == null) {
            Class<?> cls = m.getClass();
            er8 er8Var = this.n;
            gc5<?> j = er8Var.j(cls);
            if (j == null) {
                gc5Var = d(er8Var, cls, bdaVar);
            } else {
                gc5Var = j;
            }
        }
        Object obj2 = this.p;
        if (obj2 != null) {
            if (ka0.s == obj2) {
                if (gc5Var.d(bdaVar, m)) {
                    return;
                }
            } else if (obj2.equals(m)) {
                return;
            }
        }
        if (m == obj && e(obj, ua5Var, bdaVar, gc5Var)) {
            return;
        }
        if (!gc5Var.e()) {
            ua5Var.f0(this.b);
        }
        bob bobVar = this.m;
        if (bobVar == null) {
            gc5Var.f(m, ua5Var, bdaVar);
        } else {
            gc5Var.i(m, ua5Var, bdaVar, bobVar);
        }
    }

    protected nrb(nrb nrbVar, ps6 ps6Var, vca vcaVar) {
        super(nrbVar, vcaVar);
        this.t = ps6Var;
    }
}
