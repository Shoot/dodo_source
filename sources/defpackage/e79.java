package defpackage;

import java.io.IOException;
/* compiled from: RawSerializer.java */
/* renamed from: e79  reason: default package */
/* loaded from: classes2.dex */
public class e79<T> extends cxa<T> {
    public e79(Class<?> cls) {
        super(cls, false);
    }

    @Override // defpackage.cxa, defpackage.gc5
    public void f(T t, ua5 ua5Var, bda bdaVar) throws IOException {
        ua5Var.S0(t.toString());
    }

    @Override // defpackage.gc5
    public void i(T t, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        c9c g = bobVar.g(ua5Var, bobVar.d(t, nc5.VALUE_EMBEDDED_OBJECT));
        f(t, ua5Var, bdaVar);
        bobVar.h(ua5Var, g);
    }
}
