package defpackage;

import java.io.IOException;
import java.util.Set;
/* compiled from: BeanSerializer.java */
/* renamed from: la0  reason: default package */
/* loaded from: classes2.dex */
public class la0 extends ma0 {
    public la0(y85 y85Var, na0 na0Var, ka0[] ka0VarArr, ka0[] ka0VarArr2) {
        super(y85Var, na0Var, ka0VarArr, ka0VarArr2);
    }

    public static la0 e0(y85 y85Var, na0 na0Var) {
        return new la0(y85Var, na0Var, ma0.l, null);
    }

    @Override // defpackage.ma0
    protected ma0 M() {
        if (this.i == null && this.f == null && this.g == null) {
            return new ea0(this);
        }
        return this;
    }

    @Override // defpackage.ma0
    protected ma0 T(Set<String> set, Set<String> set2) {
        return new la0(this, set, set2);
    }

    @Override // defpackage.ma0
    public ma0 W(Object obj) {
        return new la0(this, this.i, obj);
    }

    @Override // defpackage.ma0
    public ma0 Z(d57 d57Var) {
        return new la0(this, d57Var, this.g);
    }

    @Override // defpackage.ma0
    protected ma0 b0(ka0[] ka0VarArr, ka0[] ka0VarArr2) {
        return new la0(this, ka0VarArr, ka0VarArr2);
    }

    @Override // defpackage.cxa, defpackage.gc5
    public final void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
        if (this.i != null) {
            ua5Var.u(obj);
            K(obj, ua5Var, bdaVar, true);
            return;
        }
        ua5Var.i1(obj);
        if (this.g != null) {
            S(obj, ua5Var, bdaVar);
        } else {
            Q(obj, ua5Var, bdaVar);
        }
        ua5Var.b0();
    }

    @Override // defpackage.gc5
    public gc5<Object> j(ps6 ps6Var) {
        return new orb(this, ps6Var);
    }

    public String toString() {
        return "BeanSerializer for " + c().getName();
    }

    protected la0(ma0 ma0Var, d57 d57Var, Object obj) {
        super(ma0Var, d57Var, obj);
    }

    protected la0(ma0 ma0Var, Set<String> set, Set<String> set2) {
        super(ma0Var, set, set2);
    }

    protected la0(ma0 ma0Var, ka0[] ka0VarArr, ka0[] ka0VarArr2) {
        super(ma0Var, ka0VarArr, ka0VarArr2);
    }
}
