package defpackage;

import java.io.IOException;
/* compiled from: ToStringSerializerBase.java */
/* renamed from: vhb  reason: default package */
/* loaded from: classes2.dex */
public abstract class vhb extends cxa<Object> {
    public vhb(Class<?> cls) {
        super(cls, false);
    }

    public abstract String G(Object obj);

    @Override // defpackage.gc5
    public boolean d(bda bdaVar, Object obj) {
        return G(obj).isEmpty();
    }

    @Override // defpackage.cxa, defpackage.gc5
    public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
        ua5Var.q1(G(obj));
    }

    @Override // defpackage.gc5
    public void i(Object obj, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        c9c g = bobVar.g(ua5Var, bobVar.d(obj, nc5.VALUE_STRING));
        f(obj, ua5Var, bdaVar);
        bobVar.h(ua5Var, g);
    }
}
