package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.Set;
/* compiled from: UnwrappingBeanSerializer.java */
/* renamed from: orb  reason: default package */
/* loaded from: classes2.dex */
public class orb extends ma0 implements Serializable {
    protected final ps6 m;

    public orb(ma0 ma0Var, ps6 ps6Var) {
        super(ma0Var, ps6Var);
        this.m = ps6Var;
    }

    @Override // defpackage.ma0
    protected ma0 T(Set<String> set, Set<String> set2) {
        return new orb(this, set, set2);
    }

    @Override // defpackage.ma0
    public ma0 W(Object obj) {
        return new orb(this, this.i, obj);
    }

    @Override // defpackage.ma0
    public ma0 Z(d57 d57Var) {
        return new orb(this, d57Var);
    }

    @Override // defpackage.ma0
    protected ma0 b0(ka0[] ka0VarArr, ka0[] ka0VarArr2) {
        return new orb(this, ka0VarArr, ka0VarArr2);
    }

    @Override // defpackage.gc5
    public boolean e() {
        return true;
    }

    @Override // defpackage.cxa, defpackage.gc5
    public final void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
        ua5Var.u(obj);
        if (this.i != null) {
            K(obj, ua5Var, bdaVar, false);
        } else if (this.g != null) {
            S(obj, ua5Var, bdaVar);
        } else {
            Q(obj, ua5Var, bdaVar);
        }
    }

    @Override // defpackage.ma0, defpackage.gc5
    public void i(Object obj, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        if (bdaVar.M0(qca.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            bdaVar.l(c(), "Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
        }
        ua5Var.u(obj);
        if (this.i != null) {
            H(obj, ua5Var, bdaVar, bobVar);
        } else if (this.g != null) {
            S(obj, ua5Var, bdaVar);
        } else {
            Q(obj, ua5Var, bdaVar);
        }
    }

    @Override // defpackage.gc5
    public gc5<Object> j(ps6 ps6Var) {
        return new orb(this, ps6Var);
    }

    public String toString() {
        return "UnwrappingBeanSerializer for " + c().getName();
    }

    public orb(orb orbVar, d57 d57Var) {
        super(orbVar, d57Var);
        this.m = orbVar.m;
    }

    public orb(orb orbVar, d57 d57Var, Object obj) {
        super(orbVar, d57Var, obj);
        this.m = orbVar.m;
    }

    protected orb(orb orbVar, Set<String> set, Set<String> set2) {
        super(orbVar, set, set2);
        this.m = orbVar.m;
    }

    protected orb(orb orbVar, ka0[] ka0VarArr, ka0[] ka0VarArr2) {
        super(orbVar, ka0VarArr, ka0VarArr2);
        this.m = orbVar.m;
    }

    @Override // defpackage.ma0
    protected ma0 M() {
        return this;
    }
}
