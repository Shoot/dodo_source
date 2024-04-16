package defpackage;

import java.io.ByteArrayOutputStream;
/* renamed from: nc3  reason: default package */
/* loaded from: classes3.dex */
public class nc3 implements oka {
    private final b g = new b();
    private boolean h;
    private lc3 i;
    private mc3 j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nc3$b */
    /* loaded from: classes3.dex */
    public static class b extends ByteArrayOutputStream {
        private b() {
        }

        synchronized byte[] a(lc3 lc3Var) {
            byte[] bArr;
            bArr = new byte[64];
            lc3Var.c(0, null, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, bArr, 0);
            reset();
            return bArr;
        }

        synchronized boolean b(mc3 mc3Var, byte[] bArr) {
            if (64 != bArr.length) {
                reset();
                return false;
            }
            boolean W = ic3.W(bArr, 0, mc3Var.getEncoded(), 0, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            reset();
            return W;
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized void reset() {
            tr.z(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
            ((ByteArrayOutputStream) this).count = 0;
        }
    }

    @Override // defpackage.oka
    public boolean a(byte[] bArr) {
        mc3 mc3Var;
        if (!this.h && (mc3Var = this.j) != null) {
            return this.g.b(mc3Var, bArr);
        }
        throw new IllegalStateException("Ed25519Signer not initialised for verification");
    }

    @Override // defpackage.oka
    public byte[] b() {
        lc3 lc3Var;
        if (this.h && (lc3Var = this.i) != null) {
            return this.g.a(lc3Var);
        }
        throw new IllegalStateException("Ed25519Signer not initialised for signature generation.");
    }

    public void c() {
        this.g.reset();
    }

    @Override // defpackage.oka
    public void init(boolean z, v71 v71Var) {
        this.h = z;
        if (z) {
            this.i = (lc3) v71Var;
            this.j = null;
        } else {
            this.i = null;
            this.j = (mc3) v71Var;
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
