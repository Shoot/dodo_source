package defpackage;

import java.io.IOException;
/* compiled from: ToEmptyObjectSerializer.java */
@o85
/* renamed from: phb  reason: default package */
/* loaded from: classes2.dex */
public class phb extends cxa<Object> {
    /* JADX INFO: Access modifiers changed from: protected */
    public phb(Class<?> cls) {
        super(cls, false);
    }

    @Override // defpackage.gc5
    public boolean d(bda bdaVar, Object obj) {
        return true;
    }

    @Override // defpackage.cxa, defpackage.gc5
    public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
        ua5Var.j1(obj, 0);
        ua5Var.b0();
    }

    @Override // defpackage.gc5
    public void i(Object obj, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        bobVar.h(ua5Var, bobVar.g(ua5Var, bobVar.d(obj, nc5.START_OBJECT)));
    }

    public phb(y85 y85Var) {
        super(y85Var);
    }
}
