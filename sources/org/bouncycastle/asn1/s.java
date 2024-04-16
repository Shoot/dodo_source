package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public abstract class s extends n implements defpackage.h0, yz4 {
    final int a;
    final boolean b;
    final defpackage.h0 c;

    public s(boolean z, int i, defpackage.h0 h0Var) {
        boolean z2;
        if (h0Var != null) {
            this.a = i;
            if (!z && !(h0Var instanceof defpackage.f0)) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.b = z2;
            this.c = h0Var;
            return;
        }
        throw new NullPointerException("'obj' cannot be null");
    }

    public static s D(Object obj) {
        if (obj != null && !(obj instanceof s)) {
            if (obj instanceof byte[]) {
                try {
                    return D(n.z((byte[]) obj));
                } catch (IOException e) {
                    throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e.getMessage());
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        return (s) obj;
    }

    public static s E(s sVar, boolean z) {
        if (z) {
            return D(sVar.F());
        }
        throw new IllegalArgumentException("implicitly tagged tagged object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n B() {
        return new z0(this.b, this.a, this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n C() {
        return new o1(this.b, this.a, this.c);
    }

    public n F() {
        return this.c.f();
    }

    public int G() {
        return this.a;
    }

    public boolean H() {
        return this.b;
    }

    @Override // defpackage.yz4
    public n d() {
        return f();
    }

    @Override // org.bouncycastle.asn1.n, defpackage.i0
    public int hashCode() {
        int i;
        int i2 = this.a;
        if (this.b) {
            i = 15;
        } else {
            i = 240;
        }
        return (i2 ^ i) ^ this.c.f().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean t(n nVar) {
        if (!(nVar instanceof s)) {
            return false;
        }
        s sVar = (s) nVar;
        if (this.a != sVar.a || this.b != sVar.b) {
            return false;
        }
        n f = this.c.f();
        n f2 = sVar.c.f();
        if (f != f2 && !f.t(f2)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "[" + this.a + "]" + this.c;
    }
}
