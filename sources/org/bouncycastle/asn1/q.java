package org.bouncycastle.asn1;

import defpackage.tr;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
public abstract class q extends n implements Iterable {
    protected final defpackage.h0[] a;
    protected final boolean b;

    /* loaded from: classes3.dex */
    class a implements Enumeration {
        private int a = 0;

        a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            if (this.a < q.this.a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i = this.a;
            defpackage.h0[] h0VarArr = q.this.a;
            if (i < h0VarArr.length) {
                this.a = i + 1;
                return h0VarArr[i];
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q() {
        this.a = d.d;
        this.b = true;
    }

    private static byte[] D(defpackage.h0 h0Var) {
        try {
            return h0Var.f().p("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static q E(Object obj) {
        if (obj != null && !(obj instanceof q)) {
            if (obj instanceof defpackage.l0) {
                return E(((defpackage.l0) obj).f());
            }
            if (obj instanceof byte[]) {
                try {
                    return E(n.z((byte[]) obj));
                } catch (IOException e) {
                    throw new IllegalArgumentException("failed to construct set from byte[]: " + e.getMessage());
                }
            }
            if (obj instanceof defpackage.h0) {
                n f = ((defpackage.h0) obj).f();
                if (f instanceof q) {
                    return (q) f;
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        return (q) obj;
    }

    public static q F(s sVar, boolean z) {
        if (z) {
            if (sVar.H()) {
                return E(sVar.F());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        n F = sVar.F();
        if (sVar.H()) {
            if (sVar instanceof f0) {
                return new d0(F);
            }
            return new m1(F);
        } else if (F instanceof q) {
            q qVar = (q) F;
            if (sVar instanceof f0) {
                return qVar;
            }
            return (q) qVar.C();
        } else if (F instanceof p) {
            defpackage.h0[] H = ((p) F).H();
            if (sVar instanceof f0) {
                return new d0(false, H);
            }
            return new m1(false, H);
        } else {
            throw new IllegalArgumentException("unknown object in getInstance: " + sVar.getClass().getName());
        }
    }

    private static boolean I(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & (-33);
        int i2 = bArr2[0] & (-33);
        if (i != i2) {
            if (i >= i2) {
                return false;
            }
            return true;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < min; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                if ((b & 255) >= (b2 & 255)) {
                    return false;
                }
                return true;
            }
        }
        if ((bArr[min] & 255) > (bArr2[min] & 255)) {
            return false;
        }
        return true;
    }

    private static void J(defpackage.h0[] h0VarArr) {
        int i;
        int length = h0VarArr.length;
        if (length < 2) {
            return;
        }
        defpackage.h0 h0Var = h0VarArr[0];
        defpackage.h0 h0Var2 = h0VarArr[1];
        byte[] D = D(h0Var);
        byte[] D2 = D(h0Var2);
        if (I(D2, D)) {
            h0Var2 = h0Var;
            h0Var = h0Var2;
            D2 = D;
            D = D2;
        }
        for (int i2 = 2; i2 < length; i2++) {
            defpackage.h0 h0Var3 = h0VarArr[i2];
            byte[] D3 = D(h0Var3);
            if (I(D2, D3)) {
                h0VarArr[i2 - 2] = h0Var;
                h0Var = h0Var2;
                D = D2;
                h0Var2 = h0Var3;
                D2 = D3;
            } else if (I(D, D3)) {
                h0VarArr[i2 - 2] = h0Var;
                h0Var = h0Var3;
                D = D3;
            } else {
                int i3 = i2 - 1;
                while (true) {
                    i = i3 - 1;
                    if (i <= 0) {
                        break;
                    }
                    defpackage.h0 h0Var4 = h0VarArr[i3 - 2];
                    if (I(D(h0Var4), D3)) {
                        break;
                    }
                    h0VarArr[i] = h0Var4;
                    i3 = i;
                }
                h0VarArr[i] = h0Var3;
            }
        }
        h0VarArr[length - 2] = h0Var;
        h0VarArr[length - 1] = h0Var2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n B() {
        defpackage.h0[] h0VarArr;
        if (this.b) {
            h0VarArr = this.a;
        } else {
            h0VarArr = (defpackage.h0[]) this.a.clone();
            J(h0VarArr);
        }
        return new x0(true, h0VarArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n C() {
        return new m1(this.b, this.a);
    }

    public defpackage.h0 G(int i) {
        return this.a[i];
    }

    public Enumeration H() {
        return new a();
    }

    public defpackage.h0[] O() {
        return d.b(this.a);
    }

    @Override // org.bouncycastle.asn1.n, defpackage.i0
    public int hashCode() {
        int length = this.a.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i += this.a[length].f().hashCode();
            } else {
                return i;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<defpackage.h0> iterator() {
        return new tr.a(O());
    }

    public int size() {
        return this.a.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean t(n nVar) {
        if (!(nVar instanceof q)) {
            return false;
        }
        q qVar = (q) nVar;
        int size = size();
        if (qVar.size() != size) {
            return false;
        }
        x0 x0Var = (x0) B();
        x0 x0Var2 = (x0) qVar.B();
        for (int i = 0; i < size; i++) {
            n f = x0Var.a[i].f();
            n f2 = x0Var2.a[i].f();
            if (f != f2 && !f.t(f2)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i = 0;
        while (true) {
            stringBuffer.append(this.a[i]);
            i++;
            if (i >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q(defpackage.h0 h0Var) {
        if (h0Var == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.a = new defpackage.h0[]{h0Var};
        this.b = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q(d dVar, boolean z) {
        defpackage.h0[] g;
        if (dVar == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        if (!z || dVar.f() < 2) {
            g = dVar.g();
        } else {
            g = dVar.c();
            J(g);
        }
        this.a = g;
        this.b = z || g.length < 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(boolean z, defpackage.h0[] h0VarArr) {
        this.a = h0VarArr;
        this.b = z || h0VarArr.length < 2;
    }
}
