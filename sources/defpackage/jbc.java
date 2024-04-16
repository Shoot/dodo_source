package defpackage;

import java.io.IOException;
/* renamed from: jbc  reason: default package */
/* loaded from: classes3.dex */
public final class jbc extends dbc implements wg3 {
    private final fbc c;
    private final int d;
    private final byte[] e;
    private final byte[] f;

    /* renamed from: jbc$b */
    /* loaded from: classes3.dex */
    public static class b {
        private final fbc a;
        private byte[] b = null;
        private byte[] c = null;
        private byte[] d = null;

        public b(fbc fbcVar) {
            this.a = fbcVar;
        }

        public jbc e() {
            return new jbc(this);
        }

        public b f(byte[] bArr) {
            this.d = sbc.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.c = sbc.c(bArr);
            return this;
        }

        public b h(byte[] bArr) {
            this.b = sbc.c(bArr);
            return this;
        }
    }

    private jbc(b bVar) {
        super(false, bVar.a.e());
        fbc fbcVar = bVar.a;
        this.c = fbcVar;
        if (fbcVar == null) {
            throw new NullPointerException("params == null");
        }
        int f = fbcVar.f();
        byte[] bArr = bVar.d;
        if (bArr != null) {
            if (bArr.length == f + f) {
                this.d = 0;
                this.e = sbc.g(bArr, 0, f);
                this.f = sbc.g(bArr, f, f);
                return;
            } else if (bArr.length != f + 4 + f) {
                throw new IllegalArgumentException("public key has wrong size");
            } else {
                this.d = mo7.a(bArr, 0);
                this.e = sbc.g(bArr, 4, f);
                this.f = sbc.g(bArr, 4 + f, f);
                return;
            }
        }
        if (fbcVar.d() != null) {
            this.d = fbcVar.d().a();
        } else {
            this.d = 0;
        }
        byte[] bArr2 = bVar.b;
        if (bArr2 == null) {
            this.e = new byte[f];
        } else if (bArr2.length != f) {
            throw new IllegalArgumentException("length of root must be equal to length of digest");
        } else {
            this.e = bArr2;
        }
        byte[] bArr3 = bVar.c;
        if (bArr3 == null) {
            this.f = new byte[f];
        } else if (bArr3.length != f) {
            throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
        } else {
            this.f = bArr3;
        }
    }

    public fbc c() {
        return this.c;
    }

    public byte[] d() {
        return sbc.c(this.f);
    }

    public byte[] e() {
        return sbc.c(this.e);
    }

    public byte[] f() {
        byte[] bArr;
        int f = this.c.f();
        int i = this.d;
        int i2 = 0;
        if (i != 0) {
            bArr = new byte[f + 4 + f];
            mo7.f(i, bArr, 0);
            i2 = 4;
        } else {
            bArr = new byte[f + f];
        }
        sbc.e(bArr, this.e, i2);
        sbc.e(bArr, this.f, i2 + f);
        return bArr;
    }

    @Override // defpackage.wg3
    public byte[] getEncoded() throws IOException {
        return f();
    }
}
