package defpackage;

import java.io.IOException;
/* compiled from: WritableObjectId.java */
/* renamed from: b9c  reason: default package */
/* loaded from: classes2.dex */
public final class b9c {
    public final y47<?> a;
    public Object b;
    protected boolean c = false;

    public b9c(y47<?> y47Var) {
        this.a = y47Var;
    }

    public Object a(Object obj) {
        if (this.b == null) {
            this.b = this.a.c(obj);
        }
        return this.b;
    }

    public void b(ua5 ua5Var, bda bdaVar, d57 d57Var) throws IOException {
        String valueOf;
        this.c = true;
        if (ua5Var.j()) {
            Object obj = this.b;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = String.valueOf(obj);
            }
            ua5Var.E0(valueOf);
            return;
        }
        mca mcaVar = d57Var.b;
        if (mcaVar != null) {
            ua5Var.f0(mcaVar);
            d57Var.d.f(this.b, ua5Var, bdaVar);
        }
    }

    public boolean c(ua5 ua5Var, bda bdaVar, d57 d57Var) throws IOException {
        if (this.b != null) {
            if (this.c || d57Var.e) {
                if (ua5Var.j()) {
                    ua5Var.F0(String.valueOf(this.b));
                    return true;
                }
                d57Var.d.f(this.b, ua5Var, bdaVar);
                return true;
            }
            return false;
        }
        return false;
    }
}
