package defpackage;

import java.io.IOException;
/* compiled from: TokenBufferSerializer.java */
@o85
/* renamed from: oib  reason: default package */
/* loaded from: classes2.dex */
public class oib extends cxa<mib> {
    public oib() {
        super(mib.class);
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: G */
    public void f(mib mibVar, ua5 ua5Var, bda bdaVar) throws IOException {
        mibVar.Q1(ua5Var);
    }

    @Override // defpackage.gc5
    /* renamed from: H */
    public final void i(mib mibVar, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        c9c g = bobVar.g(ua5Var, bobVar.d(mibVar, nc5.VALUE_EMBEDDED_OBJECT));
        f(mibVar, ua5Var, bdaVar);
        bobVar.h(ua5Var, g);
    }
}
