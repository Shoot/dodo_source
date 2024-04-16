package defpackage;

import java.io.ByteArrayOutputStream;
/* renamed from: tc3  reason: default package */
/* loaded from: classes3.dex */
public class tc3 implements oka {
    private final b g = new b();
    private final byte[] h;
    private boolean i;
    private rc3 j;
    private sc3 k;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tc3$b */
    /* loaded from: classes3.dex */
    public static class b extends ByteArrayOutputStream {
        private b() {
        }

        synchronized byte[] a(rc3 rc3Var, byte[] bArr) {
            byte[] bArr2;
            bArr2 = new byte[114];
            rc3Var.c(0, bArr, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, bArr2, 0);
            reset();
            return bArr2;
        }

        synchronized boolean b(sc3 sc3Var, byte[] bArr, byte[] bArr2) {
            if (114 != bArr2.length) {
                reset();
                return false;
            }
            boolean R = oc3.R(bArr2, 0, sc3Var.getEncoded(), 0, bArr, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            reset();
            return R;
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized void reset() {
            tr.z(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
            ((ByteArrayOutputStream) this).count = 0;
        }
    }

    public tc3(byte[] bArr) {
        this.h = tr.h(bArr);
    }

    @Override // defpackage.oka
    public boolean a(byte[] bArr) {
        sc3 sc3Var;
        if (!this.i && (sc3Var = this.k) != null) {
            return this.g.b(sc3Var, this.h, bArr);
        }
        throw new IllegalStateException("Ed448Signer not initialised for verification");
    }

    @Override // defpackage.oka
    public byte[] b() {
        rc3 rc3Var;
        if (this.i && (rc3Var = this.j) != null) {
            return this.g.a(rc3Var, this.h);
        }
        throw new IllegalStateException("Ed448Signer not initialised for signature generation.");
    }

    public void c() {
        this.g.reset();
    }

    @Override // defpackage.oka
    public void init(boolean z, v71 v71Var) {
        this.i = z;
        if (z) {
            this.j = (rc3) v71Var;
            this.k = null;
        } else {
            this.j = null;
            this.k = (sc3) v71Var;
        }
        c();
    }

    @Override // defpackage.oka
    public void update(byte b2) {
        this.g.write(b2);
    }

    @Override // defpackage.oka
    public void update(byte[] bArr, int i, int i2) {
        this.g.write(bArr, i, i2);
    }
}
