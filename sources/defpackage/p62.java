package defpackage;
/* renamed from: p62  reason: default package */
/* loaded from: classes3.dex */
public class p62 extends m62 {
    @Override // defpackage.m62, defpackage.t71
    public byte[] a() {
        int i = this.b;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            this.a.nextBytes(bArr);
            n62.c(bArr);
            i2++;
            if (i2 >= 20 || (!q62.g(bArr, 0, i) && q62.f(bArr, 0))) {
                break;
            }
        }
        if (!q62.g(bArr, 0, i) && q62.f(bArr, 0)) {
            return bArr;
        }
        throw new IllegalStateException("Unable to generate DES-EDE key");
    }

    @Override // defpackage.m62, defpackage.t71
    public void b(ff5 ff5Var) {
        this.a = ff5Var.a();
        int b = (ff5Var.b() + 7) / 8;
        this.b = b;
        if (b != 0 && b != 21) {
            if (b == 14) {
                this.b = 16;
                return;
            } else if (b != 24 && b != 16) {
                throw new IllegalArgumentException("DESede key must be 192 or 128 bits long.");
            } else {
                return;
            }
        }
        this.b = 24;
    }
}
