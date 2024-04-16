package defpackage;

import defpackage.h47;
import java.io.IOException;
/* renamed from: pbc  reason: default package */
/* loaded from: classes3.dex */
public final class pbc extends abc implements wg3 {
    private final nbc c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final byte[] g;
    private volatile q50 h;

    /* renamed from: pbc$b */
    /* loaded from: classes3.dex */
    public static class b {
        private final nbc a;
        private int b = 0;
        private int c = -1;
        private byte[] d = null;
        private byte[] e = null;
        private byte[] f = null;
        private byte[] g = null;
        private q50 h = null;
        private byte[] i = null;

        public b(nbc nbcVar) {
            this.a = nbcVar;
        }

        public pbc j() {
            return new pbc(this);
        }

        public b k(q50 q50Var) {
            this.h = q50Var;
            return this;
        }

        public b l(int i) {
            this.b = i;
            return this;
        }

        public b m(int i) {
            this.c = i;
            return this;
        }

        public b n(byte[] bArr) {
            this.f = sbc.c(bArr);
            return this;
        }

        public b o(byte[] bArr) {
            this.g = sbc.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.e = sbc.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.d = sbc.c(bArr);
            return this;
        }
    }

    private pbc(b bVar) {
        super(true, bVar.a.f());
        nbc nbcVar = bVar.a;
        this.c = nbcVar;
        if (nbcVar == null) {
            throw new NullPointerException("params == null");
        }
        int h = nbcVar.h();
        byte[] bArr = bVar.i;
        if (bArr != null) {
            int b2 = nbcVar.b();
            int a2 = mo7.a(bArr, 0);
            if (!sbc.l(b2, a2)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.d = sbc.g(bArr, 4, h);
            int i = 4 + h;
            this.e = sbc.g(bArr, i, h);
            int i2 = i + h;
            this.f = sbc.g(bArr, i2, h);
            int i3 = i2 + h;
            this.g = sbc.g(bArr, i3, h);
            int i4 = i3 + h;
            try {
                q50 q50Var = (q50) sbc.f(sbc.g(bArr, i4, bArr.length - i4), q50.class);
                if (q50Var.b() != a2) {
                    throw new IllegalStateException("serialized BDS has wrong index");
                }
                this.h = q50Var.j(bVar.a.g());
                return;
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage(), e);
            } catch (ClassNotFoundException e2) {
                throw new IllegalArgumentException(e2.getMessage(), e2);
            }
        }
        byte[] bArr2 = bVar.d;
        if (bArr2 == null) {
            this.d = new byte[h];
        } else if (bArr2.length != h) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
        } else {
            this.d = bArr2;
        }
        byte[] bArr3 = bVar.e;
        if (bArr3 == null) {
            this.e = new byte[h];
        } else if (bArr3.length != h) {
            throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
        } else {
            this.e = bArr3;
        }
        byte[] bArr4 = bVar.f;
        if (bArr4 == null) {
            this.f = new byte[h];
        } else if (bArr4.length != h) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
        } else {
            this.f = bArr4;
        }
        byte[] bArr5 = bVar.g;
        if (bArr5 == null) {
            this.g = new byte[h];
        } else if (bArr5.length != h) {
            throw new IllegalArgumentException("size of root needs to be equal size of digest");
        } else {
            this.g = bArr5;
        }
        q50 q50Var2 = bVar.h;
        this.h = q50Var2 == null ? (bVar.b >= (1 << nbcVar.b()) + (-2) || bArr4 == null || bArr2 == null) ? new q50(nbcVar, (1 << nbcVar.b()) - 1, bVar.b) : new q50(nbcVar, bArr4, bArr2, (h47) new h47.b().l(), bVar.b) : q50Var2;
        if (bVar.c >= 0 && bVar.c != this.h.c()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public nbc c() {
        return this.c;
    }

    public byte[] d() {
        byte[] p;
        synchronized (this) {
            try {
                int h = this.c.h();
                byte[] bArr = new byte[h + 4 + h + h + h];
                mo7.f(this.h.b(), bArr, 0);
                sbc.e(bArr, this.d, 4);
                int i = 4 + h;
                sbc.e(bArr, this.e, i);
                int i2 = i + h;
                sbc.e(bArr, this.f, i2);
                sbc.e(bArr, this.g, i2 + h);
                try {
                    p = tr.p(bArr, sbc.p(this.h));
                } catch (IOException e) {
                    throw new RuntimeException("error serializing bds state: " + e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return p;
    }

    @Override // defpackage.wg3
    public byte[] getEncoded() throws IOException {
        byte[] d;
        synchronized (this) {
            d = d();
        }
        return d;
    }
}
