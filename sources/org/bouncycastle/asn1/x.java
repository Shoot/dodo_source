package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
public class x extends l {
    private final int b;
    private final l[] c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Enumeration {
        int a = 0;

        a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            if (this.a < x.this.a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i = this.a;
            x xVar = x.this;
            byte[] bArr = xVar.a;
            if (i < bArr.length) {
                int min = Math.min(bArr.length - i, xVar.b);
                byte[] bArr2 = new byte[min];
                System.arraycopy(x.this.a, this.a, bArr2, 0, min);
                this.a += min;
                return new s0(bArr2);
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Enumeration {
        int a = 0;

        b() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            if (this.a < x.this.c.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            if (this.a < x.this.c.length) {
                l[] lVarArr = x.this.c;
                int i = this.a;
                this.a = i + 1;
                return lVarArr[i];
            }
            throw new NoSuchElementException();
        }
    }

    public x(byte[] bArr) {
        this(bArr, 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x I(p pVar) {
        int size = pVar.size();
        l[] lVarArr = new l[size];
        for (int i = 0; i < size; i++) {
            lVarArr[i] = l.D(pVar.F(i));
        }
        return new x(lVarArr);
    }

    private static byte[] O(l[] lVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != lVarArr.length; i++) {
            try {
                byteArrayOutputStream.write(lVarArr[i].F());
            } catch (IOException e) {
                throw new IllegalArgumentException("exception converting octets " + e.toString());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        return true;
    }

    public Enumeration J() {
        if (this.c == null) {
            return new a();
        }
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        mVar.p(z, 36, J());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() throws IOException {
        Enumeration J = J();
        int i = 0;
        while (J.hasMoreElements()) {
            i += ((defpackage.h0) J.nextElement()).f().v();
        }
        return i + 4;
    }

    public x(byte[] bArr, int i) {
        this(bArr, null, i);
    }

    private x(byte[] bArr, l[] lVarArr, int i) {
        super(bArr);
        this.c = lVarArr;
        this.b = i;
    }

    public x(l[] lVarArr) {
        this(lVarArr, 1000);
    }

    public x(l[] lVarArr, int i) {
        this(O(lVarArr), lVarArr, i);
    }
}
