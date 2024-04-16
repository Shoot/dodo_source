package defpackage;

import java.io.IOException;
/* renamed from: rbc  reason: default package */
/* loaded from: classes3.dex */
public final class rbc extends abc implements wg3 {
    private final nbc c;
    private final int d;
    private final byte[] e;
    private final byte[] f;

    /* renamed from: rbc$b */
    /* loaded from: classes3.dex */
    public static class b {
        private final nbc a;
        private byte[] b = null;
        private byte[] c = null;
        private byte[] d = null;

        public b(nbc nbcVar) {
            this.a = nbcVar;
        }

        public rbc e() {
            return new rbc(this);
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

    private rbc(b bVar) {
        super(false, bVar.a.f());
        nbc nbcVar = bVar.a;
        this.c = nbcVar;
        if (nbcVar == null) {
            throw new NullPointerException("params == null");
        }
        int h = nbcVar.h();
        byte[] bArr = bVar.d;
        if (bArr != null) {
            if (bArr.length == h + h) {
                this.d = 0;
                this.e = sbc.g(bArr, 0, h);
                this.f = sbc.g(bArr, h, h);
                return;
            } else if (bArr.length != h + 4 + h) {
                throw new IllegalArgumentException("public key has wrong size");
            } else {
                this.d = mo7.a(bArr, 0);
                this.e = sbc.g(bArr, 4, h);
                this.f = sbc.g(bArr, 4 + h, h);
                return;
            }
        }
        if (nbcVar.e() != null) {
            this.d = nbcVar.e().a();
        } else {
            this.d = 0;
        }
        byte[] bArr2 = bVar.b;
        if (bArr2 == null) {
            this.e = new byte[h];
        } else if (bArr2.length != h) {
            throw new IllegalArgumentException("length of root must be equal to length of digest");
        } else {
            this.e = bArr2;
        }
        byte[] bArr3 = bVar.c;
        if (bArr3 == null) {
            this.f = new byte[h];
        } else if (bArr3.length != h) {
            throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
        } else {
            this.f = bArr3;
        }
    }

    public nbc c() {
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
        int h = this.c.h();
        int i = this.d;
        int i2 = 0;
        if (i != 0) {
            bArr = new byte[h + 4 + h];
            mo7.f(i, bArr, 0);
            i2 = 4;
        } else {
            bArr = new byte[h + h];
        }
        sbc.e(bArr, this.e, i2);
        sbc.e(bArr, this.f, i2 + h);
        return bArr;
    }

    @Override // defpackage.wg3
    public byte[] getEncoded() throws IOException {
        return f();
    }
}
