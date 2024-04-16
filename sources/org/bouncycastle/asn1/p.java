package org.bouncycastle.asn1;

import defpackage.tr;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
public abstract class p extends n implements Iterable {
    defpackage.h0[] a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Enumeration {
        private int a = 0;

        a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            if (this.a < p.this.a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i = this.a;
            defpackage.h0[] h0VarArr = p.this.a;
            if (i < h0VarArr.length) {
                this.a = i + 1;
                return h0VarArr[i];
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public p() {
        this.a = d.d;
    }

    public static p D(Object obj) {
        if (obj != null && !(obj instanceof p)) {
            if (obj instanceof defpackage.k0) {
                return D(((defpackage.k0) obj).f());
            }
            if (obj instanceof byte[]) {
                try {
                    return D(n.z((byte[]) obj));
                } catch (IOException e) {
                    throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e.getMessage());
                }
            }
            if (obj instanceof defpackage.h0) {
                n f = ((defpackage.h0) obj).f();
                if (f instanceof p) {
                    return (p) f;
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        return (p) obj;
    }

    public static p E(s sVar, boolean z) {
        if (z) {
            if (sVar.H()) {
                return D(sVar.F());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        n F = sVar.F();
        if (sVar.H()) {
            if (sVar instanceof f0) {
                return new b0(F);
            }
            return new k1(F);
        } else if (F instanceof p) {
            p pVar = (p) F;
            if (sVar instanceof f0) {
                return pVar;
            }
            return (p) pVar.C();
        } else {
            throw new IllegalArgumentException("unknown object in getInstance: " + sVar.getClass().getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n B() {
        return new w0(this.a, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n C() {
        return new k1(this.a, false);
    }

    public defpackage.h0 F(int i) {
        return this.a[i];
    }

    public Enumeration G() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public defpackage.h0[] H() {
        return this.a;
    }

    @Override // org.bouncycastle.asn1.n, defpackage.i0
    public int hashCode() {
        int length = this.a.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i = (i * 257) ^ this.a[length].f().hashCode();
            } else {
                return i;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<defpackage.h0> iterator() {
        return new tr.a(this.a);
    }

    public int size() {
        return this.a.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean t(n nVar) {
        if (!(nVar instanceof p)) {
            return false;
        }
        p pVar = (p) nVar;
        int size = size();
        if (pVar.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            n f = this.a[i].f();
            n f2 = pVar.a[i].f();
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
    public p(defpackage.h0 h0Var) {
        if (h0Var == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.a = new defpackage.h0[]{h0Var};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public p(d dVar) {
        if (dVar == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        this.a = dVar.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public p(defpackage.h0[] h0VarArr) {
        if (tr.O(h0VarArr)) {
            throw new NullPointerException("'elements' cannot be null, or contain null");
        }
        this.a = d.b(h0VarArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(defpackage.h0[] h0VarArr, boolean z) {
        this.a = z ? d.b(h0VarArr) : h0VarArr;
    }
}
