package defpackage;

import org.bouncycastle.asn1.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kg5  reason: default package */
/* loaded from: classes3.dex */
public final class kg5 {
    private final e23 a;
    private final int b;

    /* JADX INFO: Access modifiers changed from: protected */
    public kg5(k kVar, int i) {
        if (kVar != null) {
            this.a = j23.a(kVar);
            this.b = i;
            return;
        }
        throw new NullPointerException("digest == null");
    }

    private byte[] d(int i, byte[] bArr, byte[] bArr2) {
        byte[] q = sbc.q(i, this.b);
        this.a.update(q, 0, q.length);
        this.a.update(bArr, 0, bArr.length);
        this.a.update(bArr2, 0, bArr2.length);
        int i2 = this.b;
        byte[] bArr3 = new byte[i2];
        e23 e23Var = this.a;
        if (e23Var instanceof acc) {
            ((acc) e23Var).c(bArr3, 0, i2);
        } else {
            e23Var.doFinal(bArr3, 0);
        }
        return bArr3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.b;
        if (length == i) {
            if (bArr2.length == i) {
                return d(0, bArr, bArr2);
            }
            throw new IllegalArgumentException("wrong in length");
        }
        throw new IllegalArgumentException("wrong key length");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.b;
        if (length == i) {
            if (bArr2.length == i * 2) {
                return d(1, bArr, bArr2);
            }
            throw new IllegalArgumentException("wrong in length");
        }
        throw new IllegalArgumentException("wrong key length");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length == this.b) {
            if (bArr2.length == 32) {
                return d(3, bArr, bArr2);
            }
            throw new IllegalArgumentException("wrong address length");
        }
        throw new IllegalArgumentException("wrong key length");
    }
}
