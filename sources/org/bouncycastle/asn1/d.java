package org.bouncycastle.asn1;
/* loaded from: classes3.dex */
public class d {
    static final defpackage.h0[] d = new defpackage.h0[0];
    private defpackage.h0[] a;
    private int b;
    private boolean c;

    public d() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static defpackage.h0[] b(defpackage.h0[] h0VarArr) {
        if (h0VarArr.length < 1) {
            return d;
        }
        return (defpackage.h0[]) h0VarArr.clone();
    }

    private void e(int i) {
        defpackage.h0[] h0VarArr = new defpackage.h0[Math.max(this.a.length, i + (i >> 1))];
        System.arraycopy(this.a, 0, h0VarArr, 0, this.b);
        this.a = h0VarArr;
        this.c = false;
    }

    public void a(defpackage.h0 h0Var) {
        if (h0Var != null) {
            int length = this.a.length;
            boolean z = true;
            int i = this.b + 1;
            if (i <= length) {
                z = false;
            }
            if (this.c | z) {
                e(i);
            }
            this.a[this.b] = h0Var;
            this.b = i;
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public defpackage.h0[] c() {
        int i = this.b;
        if (i == 0) {
            return d;
        }
        defpackage.h0[] h0VarArr = new defpackage.h0[i];
        System.arraycopy(this.a, 0, h0VarArr, 0, i);
        return h0VarArr;
    }

    public defpackage.h0 d(int i) {
        if (i < this.b) {
            return this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.b);
    }

    public int f() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public defpackage.h0[] g() {
        int i = this.b;
        if (i == 0) {
            return d;
        }
        defpackage.h0[] h0VarArr = this.a;
        if (h0VarArr.length == i) {
            this.c = true;
            return h0VarArr;
        }
        defpackage.h0[] h0VarArr2 = new defpackage.h0[i];
        System.arraycopy(h0VarArr, 0, h0VarArr2, 0, i);
        return h0VarArr2;
    }

    public d(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.a = i == 0 ? d : new defpackage.h0[i];
        this.b = 0;
        this.c = false;
    }
}
