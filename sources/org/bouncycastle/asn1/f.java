package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public abstract class f extends n {
    protected k a;
    protected i b;
    protected n c;
    protected int d;
    protected n e;

    public f(d dVar) {
        int i = 0;
        n I = I(dVar, 0);
        if (I instanceof k) {
            this.a = (k) I;
            I = I(dVar, 1);
            i = 1;
        }
        if (I instanceof i) {
            this.b = (i) I;
            i++;
            I = I(dVar, i);
        }
        if (!(I instanceof s)) {
            this.c = I;
            i++;
            I = I(dVar, i);
        }
        if (dVar.f() != i + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(I instanceof s)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        s sVar = (s) I;
        P(sVar.G());
        this.e = sVar.F();
    }

    private n I(d dVar, int i) {
        if (dVar.f() > i) {
            return dVar.d(i).f();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    private void J(n nVar) {
        this.c = nVar;
    }

    private void O(k kVar) {
        this.a = kVar;
    }

    private void P(int i) {
        if (i >= 0 && i <= 2) {
            this.d = i;
            return;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i);
    }

    private void Q(n nVar) {
        this.e = nVar;
    }

    private void R(i iVar) {
        this.b = iVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n B() {
        return new k0(this.a, this.b, this.c, this.d, this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n C() {
        return new g1(this.a, this.b, this.c, this.d, this.e);
    }

    public n D() {
        return this.c;
    }

    public k E() {
        return this.a;
    }

    public int F() {
        return this.d;
    }

    public n G() {
        return this.e;
    }

    public i H() {
        return this.b;
    }

    @Override // org.bouncycastle.asn1.n, defpackage.i0
    public int hashCode() {
        int i;
        k kVar = this.a;
        if (kVar != null) {
            i = kVar.hashCode();
        } else {
            i = 0;
        }
        i iVar = this.b;
        if (iVar != null) {
            i ^= iVar.hashCode();
        }
        n nVar = this.c;
        if (nVar != null) {
            i ^= nVar.hashCode();
        }
        return i ^ this.e.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean t(n nVar) {
        n nVar2;
        i iVar;
        k kVar;
        if (!(nVar instanceof f)) {
            return false;
        }
        if (this == nVar) {
            return true;
        }
        f fVar = (f) nVar;
        k kVar2 = this.a;
        if (kVar2 != null && ((kVar = fVar.a) == null || !kVar.x(kVar2))) {
            return false;
        }
        i iVar2 = this.b;
        if (iVar2 != null && ((iVar = fVar.b) == null || !iVar.x(iVar2))) {
            return false;
        }
        n nVar3 = this.c;
        if (nVar3 != null && ((nVar2 = fVar.c) == null || !nVar2.x(nVar3))) {
            return false;
        }
        return this.e.x(fVar.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() throws IOException {
        return getEncoded().length;
    }

    public f(k kVar, i iVar, n nVar, int i, n nVar2) {
        O(kVar);
        R(iVar);
        J(nVar);
        P(i);
        Q(nVar2.f());
    }
}
