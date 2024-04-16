package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.util.Set;
/* compiled from: BeanAsArraySerializer.java */
/* renamed from: ea0  reason: default package */
/* loaded from: classes2.dex */
public class ea0 extends ma0 {
    protected final ma0 m;

    public ea0(ma0 ma0Var) {
        super(ma0Var, (d57) null);
        this.m = ma0Var;
    }

    private boolean e0(bda bdaVar) {
        ka0[] ka0VarArr;
        if (this.e != null && bdaVar.h0() != null) {
            ka0VarArr = this.e;
        } else {
            ka0VarArr = this.d;
        }
        if (ka0VarArr.length == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ma0
    public ma0 W(Object obj) {
        return new ea0(this, this.i, obj);
    }

    @Override // defpackage.ma0
    public ma0 Z(d57 d57Var) {
        return this.m.Z(d57Var);
    }

    @Override // defpackage.gc5
    public boolean e() {
        return false;
    }

    @Override // defpackage.cxa, defpackage.gc5
    public final void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
        if (bdaVar.M0(qca.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && e0(bdaVar)) {
            f0(obj, ua5Var, bdaVar);
            return;
        }
        ua5Var.e1(obj);
        f0(obj, ua5Var, bdaVar);
        ua5Var.W();
    }

    protected final void f0(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
        ka0[] ka0VarArr;
        if (this.e != null && bdaVar.h0() != null) {
            ka0VarArr = this.e;
        } else {
            ka0VarArr = this.d;
        }
        int i = 0;
        try {
            int length = ka0VarArr.length;
            while (i < length) {
                ka0 ka0Var = ka0VarArr[i];
                if (ka0Var == null) {
                    ua5Var.l0();
                } else {
                    ka0Var.w(obj, ua5Var, bdaVar);
                }
                i++;
            }
        } catch (Exception e) {
            E(bdaVar, e, obj, ka0VarArr[i].getName());
        } catch (StackOverflowError e2) {
            JsonMappingException k = JsonMappingException.k(ua5Var, "Infinite recursion (StackOverflowError)", e2);
            k.e(obj, ka0VarArr[i].getName());
            throw k;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ma0
    /* renamed from: h0 */
    public ea0 T(Set<String> set, Set<String> set2) {
        return new ea0(this, set, set2);
    }

    @Override // defpackage.ma0, defpackage.gc5
    public void i(Object obj, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        if (this.i != null) {
            H(obj, ua5Var, bdaVar, bobVar);
            return;
        }
        c9c L = L(bobVar, obj, nc5.START_ARRAY);
        bobVar.g(ua5Var, L);
        ua5Var.u(obj);
        f0(obj, ua5Var, bdaVar);
        bobVar.h(ua5Var, L);
    }

    @Override // defpackage.gc5
    public gc5<Object> j(ps6 ps6Var) {
        return this.m.j(ps6Var);
    }

    public String toString() {
        return "BeanAsArraySerializer for " + c().getName();
    }

    protected ea0(ma0 ma0Var, Set<String> set, Set<String> set2) {
        super(ma0Var, set, set2);
        this.m = ma0Var;
    }

    protected ea0(ma0 ma0Var, d57 d57Var, Object obj) {
        super(ma0Var, d57Var, obj);
        this.m = ma0Var;
    }

    @Override // defpackage.ma0
    protected ma0 M() {
        return this;
    }

    @Override // defpackage.ma0
    protected ma0 b0(ka0[] ka0VarArr, ka0[] ka0VarArr2) {
        return this;
    }
}
