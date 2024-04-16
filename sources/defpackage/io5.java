package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeafNode.java */
/* renamed from: io5  reason: default package */
/* loaded from: classes3.dex */
public abstract class io5 extends kz6 {
    Object d;

    private void Y() {
        if (!s()) {
            Object obj = this.d;
            hz hzVar = new hz();
            this.d = hzVar;
            if (obj != null) {
                hzVar.U(y(), (String) obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String V() {
        return e(y());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kz6
    /* renamed from: X */
    public io5 n(kz6 kz6Var) {
        io5 io5Var = (io5) super.n(kz6Var);
        if (s()) {
            io5Var.d = ((hz) this.d).clone();
        }
        return io5Var;
    }

    @Override // defpackage.kz6
    public String b(String str) {
        Y();
        return super.b(str);
    }

    @Override // defpackage.kz6
    public kz6 d(String str, String str2) {
        if (!s() && str.equals(y())) {
            this.d = str2;
        } else {
            Y();
            super.d(str, str2);
        }
        return this;
    }

    @Override // defpackage.kz6
    public String e(String str) {
        if (!s()) {
            if (y().equals(str)) {
                return (String) this.d;
            }
            return "";
        }
        return super.e(str);
    }

    @Override // defpackage.kz6
    public final hz f() {
        Y();
        return (hz) this.d;
    }

    @Override // defpackage.kz6
    public String g() {
        if (t()) {
            return G().g();
        }
        return "";
    }

    @Override // defpackage.kz6
    public int j() {
        return 0;
    }

    @Override // defpackage.kz6
    protected List<kz6> q() {
        return kz6.c;
    }

    @Override // defpackage.kz6
    public boolean r(String str) {
        Y();
        return super.r(str);
    }

    @Override // defpackage.kz6
    protected final boolean s() {
        return this.d instanceof hz;
    }

    @Override // defpackage.kz6
    public kz6 p() {
        return this;
    }

    @Override // defpackage.kz6
    protected void o(String str) {
    }
}
