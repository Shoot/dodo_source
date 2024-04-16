package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Map;
/* compiled from: AnyGetterWriter.java */
/* renamed from: vl  reason: default package */
/* loaded from: classes2.dex */
public class vl {
    protected final ia0 a;
    protected final hl b;
    protected gc5<Object> c;
    protected w66 d;

    public vl(ia0 ia0Var, hl hlVar, gc5<?> gc5Var) {
        this.b = hlVar;
        this.a = ia0Var;
        this.c = gc5Var;
        if (gc5Var instanceof w66) {
            this.d = (w66) gc5Var;
        }
    }

    public void a(pca pcaVar) {
        this.b.i(pcaVar.S(y76.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public void b(Object obj, ua5 ua5Var, bda bdaVar, tq8 tq8Var) throws Exception {
        Object n = this.b.n(obj);
        if (n == null) {
            return;
        }
        if (!(n instanceof Map)) {
            bdaVar.k(this.a.getType(), String.format("Value returned by 'any-getter' (%s()) not java.util.Map but %s", this.b.getName(), n.getClass().getName()));
        }
        w66 w66Var = this.d;
        if (w66Var != null) {
            w66Var.l0(bdaVar, ua5Var, obj, (Map) n, tq8Var, null);
        } else {
            this.c.f(n, ua5Var, bdaVar);
        }
    }

    public void c(Object obj, ua5 ua5Var, bda bdaVar) throws Exception {
        Object n = this.b.n(obj);
        if (n == null) {
            return;
        }
        if (!(n instanceof Map)) {
            bdaVar.k(this.a.getType(), String.format("Value returned by 'any-getter' %s() not java.util.Map but %s", this.b.getName(), n.getClass().getName()));
        }
        w66 w66Var = this.d;
        if (w66Var != null) {
            w66Var.q0((Map) n, ua5Var, bdaVar);
        } else {
            this.c.f(n, ua5Var, bdaVar);
        }
    }

    public void d(bda bdaVar) throws JsonMappingException {
        gc5<?> gc5Var = this.c;
        if (gc5Var instanceof bv1) {
            gc5<?> F0 = bdaVar.F0(gc5Var, this.a);
            this.c = F0;
            if (F0 instanceof w66) {
                this.d = (w66) F0;
            }
        }
    }
}
