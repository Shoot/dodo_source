package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
/* compiled from: TypeWrappedSerializer.java */
/* renamed from: dob  reason: default package */
/* loaded from: classes2.dex */
public final class dob extends gc5<Object> implements bv1 {
    protected final bob a;
    protected final gc5<Object> b;

    public dob(bob bobVar, gc5<?> gc5Var) {
        this.a = bobVar;
        this.b = gc5Var;
    }

    @Override // defpackage.bv1
    public gc5<?> a(bda bdaVar, ia0 ia0Var) throws JsonMappingException {
        gc5<?> gc5Var = this.b;
        if (gc5Var instanceof bv1) {
            gc5Var = bdaVar.I0(gc5Var, ia0Var);
        }
        if (gc5Var == this.b) {
            return this;
        }
        return new dob(this.a, gc5Var);
    }

    @Override // defpackage.gc5
    public Class<Object> c() {
        return Object.class;
    }

    @Override // defpackage.gc5
    public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
        this.b.i(obj, ua5Var, bdaVar, this.a);
    }

    @Override // defpackage.gc5
    public void i(Object obj, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        this.b.i(obj, ua5Var, bdaVar, bobVar);
    }
}
