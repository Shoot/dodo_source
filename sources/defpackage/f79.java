package defpackage;

import java.io.IOException;
/* compiled from: RawValue.java */
/* renamed from: f79  reason: default package */
/* loaded from: classes2.dex */
public class f79 implements dc5 {
    protected Object a;

    public f79(String str) {
        this.a = str;
    }

    @Override // defpackage.dc5
    public void a(ua5 ua5Var, bda bdaVar) throws IOException {
        Object obj = this.a;
        if (obj instanceof dc5) {
            ((dc5) obj).a(ua5Var, bdaVar);
        } else {
            b(ua5Var);
        }
    }

    protected void b(ua5 ua5Var) throws IOException {
        Object obj = this.a;
        if (obj instanceof mca) {
            ua5Var.Q0((mca) obj);
        } else {
            ua5Var.S0(String.valueOf(obj));
        }
    }

    @Override // defpackage.dc5
    public void d(ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        Object obj = this.a;
        if (obj instanceof dc5) {
            ((dc5) obj).d(ua5Var, bdaVar, bobVar);
        } else if (obj instanceof mca) {
            a(ua5Var, bdaVar);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f79)) {
            return false;
        }
        Object obj2 = this.a;
        Object obj3 = ((f79) obj).a;
        if (obj2 == obj3) {
            return true;
        }
        if (obj2 != null && obj2.equals(obj3)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return String.format("[RawValue of type %s]", q81.h(this.a));
    }
}
