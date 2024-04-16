package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
/* compiled from: StdDelegatingSerializer.java */
/* renamed from: wwa  reason: default package */
/* loaded from: classes2.dex */
public class wwa extends cxa<Object> implements bv1, ij9 {
    protected final lw1<Object, ?> c;
    protected final y85 d;
    protected final gc5<Object> e;

    public wwa(lw1<Object, ?> lw1Var, y85 y85Var, gc5<?> gc5Var) {
        super(y85Var);
        this.c = lw1Var;
        this.d = y85Var;
        this.e = gc5Var;
    }

    protected gc5<Object> G(Object obj, bda bdaVar) throws JsonMappingException {
        return bdaVar.e0(obj.getClass());
    }

    protected Object H(Object obj) {
        return this.c.convert(obj);
    }

    protected wwa K(lw1<Object, ?> lw1Var, y85 y85Var, gc5<?> gc5Var) {
        q81.Z(wwa.class, this, "withDelegate");
        return new wwa(lw1Var, y85Var, gc5Var);
    }

    @Override // defpackage.bv1
    public gc5<?> a(bda bdaVar, ia0 ia0Var) throws JsonMappingException {
        gc5<?> gc5Var = this.e;
        y85 y85Var = this.d;
        if (gc5Var == null) {
            if (y85Var == null) {
                y85Var = this.c.a(bdaVar.i());
            }
            if (!y85Var.W()) {
                gc5Var = bdaVar.Z(y85Var);
            }
        }
        if (gc5Var instanceof bv1) {
            gc5Var = bdaVar.I0(gc5Var, ia0Var);
        }
        if (gc5Var == this.e && y85Var == this.d) {
            return this;
        }
        return K(this.c, y85Var, gc5Var);
    }

    @Override // defpackage.ij9
    public void b(bda bdaVar) throws JsonMappingException {
        gc5<Object> gc5Var = this.e;
        if (gc5Var != null && (gc5Var instanceof ij9)) {
            ((ij9) gc5Var).b(bdaVar);
        }
    }

    @Override // defpackage.gc5
    public boolean d(bda bdaVar, Object obj) {
        Object H = H(obj);
        if (H == null) {
            return true;
        }
        gc5<Object> gc5Var = this.e;
        if (gc5Var == null) {
            if (obj == null) {
                return true;
            }
            return false;
        }
        return gc5Var.d(bdaVar, H);
    }

    @Override // defpackage.cxa, defpackage.gc5
    public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
        Object H = H(obj);
        if (H == null) {
            bdaVar.G(ua5Var);
            return;
        }
        gc5<Object> gc5Var = this.e;
        if (gc5Var == null) {
            gc5Var = G(H, bdaVar);
        }
        gc5Var.f(H, ua5Var, bdaVar);
    }

    @Override // defpackage.gc5
    public void i(Object obj, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        Object H = H(obj);
        gc5<Object> gc5Var = this.e;
        if (gc5Var == null) {
            gc5Var = G(obj, bdaVar);
        }
        gc5Var.i(H, ua5Var, bdaVar, bobVar);
    }
}
