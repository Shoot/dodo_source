package defpackage;

import java.io.IOException;
/* compiled from: StringSerializer.java */
@o85
/* renamed from: vza  reason: default package */
/* loaded from: classes2.dex */
public final class vza extends bxa<Object> {
    public vza() {
        super(String.class, false);
    }

    @Override // defpackage.gc5
    public boolean d(bda bdaVar, Object obj) {
        return ((String) obj).isEmpty();
    }

    @Override // defpackage.cxa, defpackage.gc5
    public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
        ua5Var.q1((String) obj);
    }

    @Override // defpackage.bxa, defpackage.gc5
    public final void i(Object obj, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        ua5Var.q1((String) obj);
    }
}
