package defpackage;

import java.io.IOException;
/* renamed from: hbc  reason: default package */
/* loaded from: classes3.dex */
public final class hbc extends dbc implements wg3 {
    private final fbc c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final byte[] g;
    private volatile long h;
    private volatile r50 i;

    /* renamed from: hbc$b */
    /* loaded from: classes3.dex */
    public static class b {
        private final fbc a;
        private long b = 0;
        private long c = -1;
        private byte[] d = null;
        private byte[] e = null;
        private byte[] f = null;
        private byte[] g = null;
        private r50 h = null;
        private byte[] i = null;
        private nbc j = null;

        public b(fbc fbcVar) {
            this.a = fbcVar;
        }

        public hbc k() {
            return new hbc(this);
        }

        public b l(r50 r50Var) {
            if (r50Var.b() == 0) {
                this.h = new r50(r50Var, (1 << this.a.a()) - 1);
            } else {
                this.h = r50Var;
            }
            return this;
        }

        public b m(long j) {
            this.b = j;
            return this;
        }

        public b n(long j) {
            this.c = j;
            return this;
        }

        public b o(byte[] bArr) {
            this.f = sbc.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.g = sbc.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.e = sbc.c(bArr);
            return this;
        }

        public b r(byte[] bArr) {
            this.d = sbc.c(bArr);
            return this;
        }
    }

    private hbc(b bVar) {
        super(true, bVar.a.e());
        fbc fbcVar = bVar.a;
        this.c = fbcVar;
        if (fbcVar == null) {
            throw new NullPointerException("params == null");
        }
        int f = fbcVar.f();
        byte[] bArr = bVar.i;
        if (bArr != null) {
            if (bVar.j == null) {
                throw new NullPointerException("xmss == null");
            }
            int a2 = fbcVar.a();
            int i = (a2 + 7) / 8;
            this.h = sbc.a(bArr, 0, i);
            if (!sbc.l(a2, this.h)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.d = sbc.g(bArr, i, f);
            int i2 = i + f;
            this.e = sbc.g(bArr, i2, f);
            int i3 = i2 + f;
            this.f = sbc.g(bArr, i3, f);
            int i4 = i3 + f;
            this.g = sbc.g(bArr, i4, f);
            int i5 = i4 + f;
            try {
                this.i = ((r50) sbc.f(sbc.g(bArr, i5, bArr.length - i5), r50.class)).f(bVar.j.g());
                return;
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage(), e);
            } catch (ClassNotFoundException e2) {
                throw new IllegalArgumentException(e2.getMessage(), e2);
            }
        }
        this.h = bVar.b;
        byte[] bArr2 = bVar.d;
        if (bArr2 == null) {
            this.d = new byte[f];
        } else if (bArr2.length != f) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
        } else {
            this.d = bArr2;
        }
        byte[] bArr3 = bVar.e;
        if (bArr3 == null) {
            this.e = new byte[f];
        } else if (bArr3.length != f) {
            throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
        } else {
            this.e = bArr3;
        }
        byte[] bArr4 = bVar.f;
        if (bArr4 == null) {
            this.f = new byte[f];
        } else if (bArr4.length != f) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
        } else {
            this.f = bArr4;
        }
        byte[] bArr5 = bVar.g;
        if (bArr5 == null) {
            this.g = new byte[f];
        } else if (bArr5.length != f) {
            throw new IllegalArgumentException("size of root needs to be equal size of digest");
        } else {
            this.g = bArr5;
        }
        r50 r50Var = bVar.h;
        if (r50Var == null) {
            r50Var = (!sbc.l(fbcVar.a(), bVar.b) || bArr4 == null || bArr2 == null) ? new r50(bVar.c + 1) : new r50(fbcVar, bVar.b, bArr4, bArr2);
        }
        this.i = r50Var;
        if (bVar.c >= 0 && bVar.c != this.i.b()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public fbc c() {
        return this.c;
    }

    public byte[] d() {
        byte[] p;
        synchronized (this) {
            try {
                int f = this.c.f();
                int a2 = (this.c.a() + 7) / 8;
                byte[] bArr = new byte[a2 + f + f + f + f];
                sbc.e(bArr, sbc.q(this.h, a2), 0);
                sbc.e(bArr, this.d, a2);
                int i = a2 + f;
                sbc.e(bArr, this.e, i);
                int i2 = i + f;
                sbc.e(bArr, this.f, i2);
                sbc.e(bArr, this.g, i2 + f);
                try {
                    p = tr.p(bArr, sbc.p(this.i));
                } catch (IOException e) {
                    throw new IllegalStateException("error serializing bds state: " + e.getMessage(), e);
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
