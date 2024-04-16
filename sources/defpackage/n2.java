package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
/* renamed from: n2  reason: default package */
/* loaded from: classes3.dex */
public abstract class n2 implements u9c {
    private int d(h0 h0Var) {
        return sr4.d(h0Var).hashCode();
    }

    public static Hashtable e(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    private boolean f(boolean z, x29 x29Var, x29[] x29VarArr) {
        if (z) {
            for (int length = x29VarArr.length - 1; length >= 0; length--) {
                x29 x29Var2 = x29VarArr[length];
                if (x29Var2 != null && g(x29Var, x29Var2)) {
                    x29VarArr[length] = null;
                    return true;
                }
            }
        } else {
            for (int i = 0; i != x29VarArr.length; i++) {
                x29 x29Var3 = x29VarArr[i];
                if (x29Var3 != null && g(x29Var, x29Var3)) {
                    x29VarArr[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.u9c
    public int a(t9c t9cVar) {
        x29[] w = t9cVar.w();
        int i = 0;
        for (int i2 = 0; i2 != w.length; i2++) {
            if (w[i2].w()) {
                fz[] v = w[i2].v();
                for (int i3 = 0; i3 != v.length; i3++) {
                    i = (i ^ v[i3].u().hashCode()) ^ d(v[i3].v());
                }
            } else {
                i = (i ^ w[i2].t().u().hashCode()) ^ d(w[i2].t().v());
            }
        }
        return i;
    }

    @Override // defpackage.u9c
    public boolean c(t9c t9cVar, t9c t9cVar2) {
        x29[] w = t9cVar.w();
        x29[] w2 = t9cVar2.w();
        if (w.length != w2.length) {
            return false;
        }
        boolean z = (w[0].t() != null && w2[0].t() != null) ? !w[0].t().u().x(w2[0].t().u()) : false;
        for (int i = 0; i != w.length; i++) {
            if (!f(z, w[i], w2)) {
                return false;
            }
        }
        return true;
    }

    protected boolean g(x29 x29Var, x29 x29Var2) {
        return sr4.g(x29Var, x29Var2);
    }
}
