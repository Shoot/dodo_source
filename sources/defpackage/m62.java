package defpackage;
/* renamed from: m62  reason: default package */
/* loaded from: classes3.dex */
public class m62 extends t71 {
    @Override // defpackage.t71
    public byte[] a() {
        byte[] bArr = new byte[8];
        do {
            this.a.nextBytes(bArr);
            n62.c(bArr);
        } while (n62.b(bArr, 0));
        return bArr;
    }

    @Override // defpackage.t71
    public void b(ff5 ff5Var) {
        super.b(ff5Var);
        int i = this.b;
        if (i != 0 && i != 7) {
            if (i != 8) {
                throw new IllegalArgumentException("DES key must be 64 bits long.");
            }
            return;
        }
        this.b = 8;
    }
}
