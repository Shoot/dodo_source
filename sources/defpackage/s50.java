package defpackage;

import defpackage.aj5;
import defpackage.an4;
import defpackage.h47;
import java.io.Serializable;
import java.util.Stack;
/* renamed from: s50  reason: default package */
/* loaded from: classes3.dex */
class s50 implements Serializable, Cloneable {
    private kbc a;
    private final int b;
    private int c;
    private int d;
    private boolean e = false;
    private boolean f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s50(int i) {
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public s50 clone() {
        s50 s50Var = new s50(this.b);
        s50Var.a = this.a;
        s50Var.c = this.c;
        s50Var.d = this.d;
        s50Var.e = this.e;
        s50Var.f = this.f;
        return s50Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        if (this.e && !this.f) {
            return this.c;
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.d;
    }

    public kbc e() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(int i) {
        this.a = null;
        this.c = this.b;
        this.d = i;
        this.e = true;
        this.f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(kbc kbcVar) {
        this.a = kbcVar;
        int a = kbcVar.a();
        this.c = a;
        if (a == this.b) {
            this.f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(Stack<kbc> stack, o2c o2cVar, byte[] bArr, byte[] bArr2, h47 h47Var) {
        if (h47Var == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.f || !this.e) {
            throw new IllegalStateException("finished or not initialized");
        }
        h47 h47Var2 = (h47) new h47.b().g(h47Var.b()).h(h47Var.c()).p(this.d).n(h47Var.e()).o(h47Var.f()).f(h47Var.a()).l();
        an4 an4Var = (an4) new an4.b().g(h47Var2.b()).h(h47Var2.c()).n(this.d).k();
        o2cVar.h(o2cVar.g(bArr2, h47Var2), bArr);
        kbc a = lbc.a(o2cVar, o2cVar.e(h47Var2), (aj5) new aj5.b().g(h47Var2.b()).h(h47Var2.c()).n(this.d).l());
        while (!stack.isEmpty() && stack.peek().a() == a.a() && stack.peek().a() != this.b) {
            an4 an4Var2 = (an4) new an4.b().g(an4Var.b()).h(an4Var.c()).m(an4Var.e()).n((an4Var.f() - 1) / 2).f(an4Var.a()).k();
            kbc b = lbc.b(o2cVar, stack.pop(), a, an4Var2);
            kbc kbcVar = new kbc(b.a() + 1, b.b());
            an4Var = (an4) new an4.b().g(an4Var2.b()).h(an4Var2.c()).m(an4Var2.e() + 1).n(an4Var2.f()).f(an4Var2.a()).k();
            a = kbcVar;
        }
        kbc kbcVar2 = this.a;
        if (kbcVar2 == null) {
            this.a = a;
        } else if (kbcVar2.a() == a.a()) {
            an4 an4Var3 = (an4) new an4.b().g(an4Var.b()).h(an4Var.c()).m(an4Var.e()).n((an4Var.f() - 1) / 2).f(an4Var.a()).k();
            a = new kbc(this.a.a() + 1, lbc.b(o2cVar, this.a, a, an4Var3).b());
            this.a = a;
            an4 an4Var4 = (an4) new an4.b().g(an4Var3.b()).h(an4Var3.c()).m(an4Var3.e() + 1).n(an4Var3.f()).f(an4Var3.a()).k();
        } else {
            stack.push(a);
        }
        if (this.a.a() == this.b) {
            this.f = true;
            return;
        }
        this.c = a.a();
        this.d++;
    }
}
