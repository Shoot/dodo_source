package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public abstract class l extends n implements defpackage.j0 {
    byte[] a;

    public l(byte[] bArr) {
        if (bArr != null) {
            this.a = bArr;
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    public static l D(Object obj) {
        if (obj != null && !(obj instanceof l)) {
            if (obj instanceof byte[]) {
                try {
                    return D(n.z((byte[]) obj));
                } catch (IOException e) {
                    throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e.getMessage());
                }
            }
            if (obj instanceof defpackage.h0) {
                n f = ((defpackage.h0) obj).f();
                if (f instanceof l) {
                    return (l) f;
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (l) obj;
    }

    public static l E(s sVar, boolean z) {
        if (z) {
            if (sVar.H()) {
                return D(sVar.F());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        n F = sVar.F();
        if (sVar.H()) {
            l D = D(F);
            if (sVar instanceof f0) {
                return new x(new l[]{D});
            }
            return (l) new x(new l[]{D}).C();
        } else if (F instanceof l) {
            l lVar = (l) F;
            if (sVar instanceof f0) {
                return lVar;
            }
            return (l) lVar.C();
        } else if (F instanceof p) {
            p pVar = (p) F;
            if (sVar instanceof f0) {
                return x.I(pVar);
            }
            return (l) x.I(pVar).C();
        } else {
            throw new IllegalArgumentException("unknown object in getInstance: " + sVar.getClass().getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n B() {
        return new s0(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n C() {
        return new s0(this.a);
    }

    public byte[] F() {
        return this.a;
    }

    @Override // defpackage.j0
    public InputStream a() {
        return new ByteArrayInputStream(this.a);
    }

    @Override // defpackage.yz4
    public n d() {
        return f();
    }

    @Override // org.bouncycastle.asn1.n, defpackage.i0
    public int hashCode() {
        return tr.F(F());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean t(n nVar) {
        if (!(nVar instanceof l)) {
            return false;
        }
        return tr.c(this.a, ((l) nVar).a);
    }

    public String toString() {
        return "#" + a0b.b(org.bouncycastle.util.encoders.b.d(this.a));
    }
}
