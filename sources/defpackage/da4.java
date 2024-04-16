package defpackage;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: da4  reason: default package */
/* loaded from: classes3.dex */
public class da4 implements m {
    private final xc0 a;
    private final ba4 b;
    private final byte[] c;
    private final byte[] d;
    private final c e;
    private final c f;
    private b g;
    private b h;
    private boolean i;
    private byte[] j;
    private byte[] k;
    private int l;
    private byte[] m;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: da4$b */
    /* loaded from: classes3.dex */
    public static class b extends ByteArrayOutputStream {
        b() {
        }

        void a() {
            tr.y(b(), (byte) 0);
        }

        byte[] b() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: da4$c */
    /* loaded from: classes3.dex */
    public class c {
        private final byte[] a;
        private final byte[] b;
        private int c;
        private long d;

        private c() {
            this.a = new byte[16];
            this.b = new byte[1];
        }

        void a() {
            if (this.c > 0) {
                tr.y(da4.this.d, (byte) 0);
                da4.o(this.a, 0, this.c, da4.this.d);
                da4 da4Var = da4.this;
                da4Var.p(da4Var.d);
            }
        }

        long b() {
            return this.d;
        }

        void c() {
            this.c = 0;
            this.d = 0L;
        }

        void d(byte b) {
            byte[] bArr = this.b;
            bArr[0] = b;
            e(bArr, 0, 1);
        }

        void e(byte[] bArr, int i, int i2) {
            int i3;
            int i4 = this.c;
            int i5 = 16 - i4;
            int i6 = 0;
            if (i4 > 0 && i2 >= i5) {
                System.arraycopy(bArr, i, this.a, i4, i5);
                da4.o(this.a, 0, 16, da4.this.d);
                da4 da4Var = da4.this;
                da4Var.p(da4Var.d);
                i3 = i2 - i5;
                this.c = 0;
                i6 = i5;
            } else {
                i3 = i2;
            }
            while (i3 >= 16) {
                da4.o(bArr, i + i6, 16, da4.this.d);
                da4 da4Var2 = da4.this;
                da4Var2.p(da4Var2.d);
                i6 += i5;
                i3 -= i5;
            }
            if (i3 > 0) {
                System.arraycopy(bArr, i + i6, this.a, this.c, i3);
                this.c += i3;
            }
            this.d += i2;
        }
    }

    public da4(xc0 xc0Var) {
        this(xc0Var, new d6b());
    }

    private static int f(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    private byte[] g() {
        this.f.a();
        byte[] k = k();
        byte[] bArr = new byte[16];
        for (int i = 0; i < 12; i++) {
            k[i] = (byte) (k[i] ^ this.k[i]);
        }
        k[15] = (byte) (k[15] & (-129));
        this.a.b(k, 0, bArr, 0);
        return bArr;
    }

    private void h(int i) {
        int i2 = this.l;
        if ((i2 & 1) != 0) {
            if ((i2 & 2) == 0) {
                if (this.e.b() - Long.MIN_VALUE <= (2147483623 - i) - Long.MIN_VALUE) {
                    return;
                }
                throw new IllegalStateException("AEAD byte count exceeded");
            }
            throw new IllegalStateException("AEAD data cannot be processed after ordinary data");
        }
        throw new IllegalStateException("Cipher is not initialised");
    }

    private static void i(byte[] bArr, int i, int i2, boolean z) {
        int f = f(bArr);
        int i3 = i + i2;
        if (i2 >= 0 && i >= 0 && i3 >= 0 && i3 <= f) {
            return;
        }
        if (z) {
            throw new OutputLengthException("Output buffer too short.");
        }
        throw new DataLengthException("Input buffer too short.");
    }

    private void j(int i) {
        long j;
        int i2 = this.l;
        if ((i2 & 1) != 0) {
            if ((i2 & 2) == 0) {
                this.e.a();
                this.l |= 2;
            }
            long size = this.g.size();
            if (!this.i) {
                size = this.h.size();
                j = 2147483639;
            } else {
                j = 2147483623;
            }
            if (size - Long.MIN_VALUE <= (j - i) - Long.MIN_VALUE) {
                return;
            }
            throw new IllegalStateException("byte count exceeded");
        }
        throw new IllegalStateException("Cipher is not initialised");
    }

    private byte[] k() {
        byte[] bArr = new byte[16];
        q();
        o(this.c, 0, 16, bArr);
        return bArr;
    }

    private void l() throws InvalidCipherTextException {
        byte[] b2 = this.h.b();
        int size = this.h.size();
        int i = size - 16;
        if (i >= 0) {
            byte[] w = tr.w(b2, i, size);
            byte[] h = tr.h(w);
            h[15] = (byte) (h[15] | Byte.MIN_VALUE);
            byte[] bArr = new byte[16];
            int i2 = 0;
            while (i > 0) {
                this.a.b(h, 0, bArr, 0);
                int min = Math.min(16, i);
                w(bArr, b2, i2, min);
                this.g.write(bArr, 0, min);
                this.f.e(bArr, 0, min);
                i -= min;
                i2 += min;
                r(h);
            }
            byte[] g = g();
            if (tr.u(g, w)) {
                byte[] bArr2 = this.m;
                System.arraycopy(g, 0, bArr2, 0, bArr2.length);
                return;
            }
            t();
            throw new InvalidCipherTextException("mac check failed");
        }
        throw new InvalidCipherTextException("Data too short");
    }

    private void m(lf5 lf5Var) {
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        int length = lf5Var.a().length;
        byte[] bArr4 = new byte[length];
        System.arraycopy(this.k, 0, bArr, 4, 12);
        this.a.init(true, lf5Var);
        this.a.b(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr3, 0, 8);
        bArr[0] = (byte) (bArr[0] + 1);
        this.a.b(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr3, 8, 8);
        bArr[0] = (byte) (bArr[0] + 1);
        this.a.b(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr4, 0, 8);
        bArr[0] = (byte) (bArr[0] + 1);
        this.a.b(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr4, 8, 8);
        if (length == 32) {
            bArr[0] = (byte) (bArr[0] + 1);
            this.a.b(bArr, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr4, 16, 8);
            bArr[0] = (byte) (bArr[0] + 1);
            this.a.b(bArr, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr4, 24, 8);
        }
        this.a.init(true, new lf5(bArr4));
        o(bArr3, 0, 16, bArr2);
        s(bArr2);
        this.b.a(bArr2);
        this.l |= 1;
    }

    private int n(byte[] bArr, byte[] bArr2, int i) {
        byte[] b2 = this.g.b();
        byte[] h = tr.h(bArr);
        h[15] = (byte) (h[15] | Byte.MIN_VALUE);
        byte[] bArr3 = new byte[16];
        int size = this.g.size();
        int i2 = 0;
        while (size > 0) {
            this.a.b(h, 0, bArr3, 0);
            int min = Math.min(16, size);
            w(bArr3, b2, i2, min);
            System.arraycopy(bArr3, 0, bArr2, i + i2, min);
            size -= min;
            i2 += min;
            r(h);
        }
        return this.g.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(byte[] bArr, int i, int i2, byte[] bArr2) {
        int i3 = 0;
        int i4 = 15;
        while (i3 < i2) {
            bArr2[i4] = bArr[i + i3];
            i3++;
            i4--;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(byte[] bArr) {
        v(this.c, bArr);
        this.b.b(this.c);
    }

    private void q() {
        byte[] bArr = new byte[16];
        mo7.s(this.f.b() * 8, bArr, 0);
        mo7.s(this.e.b() * 8, bArr, 8);
        p(bArr);
    }

    private static void r(byte[] bArr) {
        for (int i = 0; i < 4; i++) {
            byte b2 = (byte) (bArr[i] + 1);
            bArr[i] = b2;
            if (b2 != 0) {
                return;
            }
        }
    }

    private static void s(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            bArr[i2] = (byte) (i | ((b2 >> 1) & 127));
            if ((b2 & 1) == 0) {
                i = 0;
            } else {
                i = -128;
            }
        }
        if (i != 0) {
            bArr[0] = (byte) (bArr[0] ^ (-31));
        }
    }

    private void u() {
        b bVar;
        b bVar2 = this.g;
        if (bVar2 != null) {
            bVar2.a();
        }
        this.e.c();
        this.f.c();
        this.g = new b();
        if (this.i) {
            bVar = null;
        } else {
            bVar = new b();
        }
        this.h = bVar;
        this.l &= -3;
        tr.y(this.c, (byte) 0);
        byte[] bArr = this.j;
        if (bArr != null) {
            this.e.e(bArr, 0, bArr.length);
        }
    }

    private static void v(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    private static void w(byte[] bArr, byte[] bArr2, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3 + i]);
        }
    }

    @Override // defpackage.n
    public byte[] a() {
        return tr.h(this.m);
    }

    @Override // defpackage.n
    public void b(byte[] bArr, int i, int i2) {
        h(i2);
        i(bArr, i, i2, false);
        this.e.e(bArr, i, i2);
    }

    @Override // defpackage.n
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        j(0);
        i(bArr, i, getOutputSize(0), true);
        if (this.i) {
            byte[] g = g();
            int n = n(g, bArr, i) + 16;
            System.arraycopy(g, 0, bArr, i + this.g.size(), 16);
            byte[] bArr2 = this.m;
            System.arraycopy(g, 0, bArr2, 0, bArr2.length);
            u();
            return n;
        }
        l();
        int size = this.g.size();
        System.arraycopy(this.g.b(), 0, bArr, i, size);
        u();
        return size;
    }

    @Override // defpackage.n
    public String getAlgorithmName() {
        return this.a.getAlgorithmName() + "-GCM-SIV";
    }

    @Override // defpackage.n
    public int getOutputSize(int i) {
        if (this.i) {
            return i + this.g.size() + 16;
        }
        int size = i + this.h.size();
        if (size > 16) {
            return size - 16;
        }
        return 0;
    }

    @Override // defpackage.m
    public xc0 getUnderlyingCipher() {
        return this.a;
    }

    @Override // defpackage.n
    public int getUpdateOutputSize(int i) {
        return 0;
    }

    @Override // defpackage.n
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        byte[] a2;
        lf5 lf5Var;
        byte[] bArr;
        if (v71Var instanceof p) {
            p pVar = (p) v71Var;
            bArr = pVar.a();
            a2 = pVar.d();
            lf5Var = pVar.b();
        } else if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            a2 = pq7Var.a();
            lf5Var = (lf5) pq7Var.b();
            bArr = null;
        } else {
            throw new IllegalArgumentException("invalid parameters passed to GCM-SIV");
        }
        if (a2 != null && a2.length == 12) {
            if (lf5Var != null && (lf5Var.a().length == 16 || lf5Var.a().length == 32)) {
                this.i = z;
                this.j = bArr;
                this.k = a2;
                m(lf5Var);
                u();
                return;
            }
            throw new IllegalArgumentException("Invalid key");
        }
        throw new IllegalArgumentException("Invalid nonce");
    }

    @Override // defpackage.n
    public int processByte(byte b2, byte[] bArr, int i) throws DataLengthException {
        j(1);
        if (this.i) {
            this.g.write(b2);
            this.f.d(b2);
            return 0;
        }
        this.h.write(b2);
        return 0;
    }

    @Override // defpackage.n
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        j(i2);
        i(bArr, i, i2, false);
        if (this.i) {
            this.g.write(bArr, i, i2);
            this.f.e(bArr, i, i2);
        } else {
            this.h.write(bArr, i, i2);
        }
        return 0;
    }

    public void t() {
        u();
    }

    public da4(xc0 xc0Var, ba4 ba4Var) {
        this.c = new byte[16];
        this.d = new byte[16];
        this.m = new byte[16];
        if (xc0Var.a() != 16) {
            throw new IllegalArgumentException("Cipher required with a block size of 16.");
        }
        this.a = xc0Var;
        this.b = ba4Var;
        this.e = new c();
        this.f = new c();
    }
}
