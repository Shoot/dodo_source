package defpackage;

import defpackage.dc5;
import java.io.IOException;
/* compiled from: SerializableSerializer.java */
@o85
/* renamed from: lca  reason: default package */
/* loaded from: classes2.dex */
public class lca extends cxa<dc5> {
    public static final lca c = new lca();

    protected lca() {
        super(dc5.class);
    }

    @Override // defpackage.gc5
    /* renamed from: G */
    public boolean d(bda bdaVar, dc5 dc5Var) {
        if (dc5Var instanceof dc5.a) {
            return ((dc5.a) dc5Var).f(bdaVar);
        }
        return false;
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: H */
    public void f(dc5 dc5Var, ua5 ua5Var, bda bdaVar) throws IOException {
        dc5Var.a(ua5Var, bdaVar);
    }

    @Override // defpackage.gc5
    /* renamed from: K */
    public final void i(dc5 dc5Var, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        dc5Var.d(ua5Var, bdaVar, bobVar);
    }
}
