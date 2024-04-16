package defpackage;

import java.util.ArrayList;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: t82  reason: default package */
/* loaded from: classes3.dex */
public class t82 implements l8c {
    private boolean a;
    private s82 b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private ArrayList<byte[]> g;

    public t82(int i) {
        s82 s82Var = new s82(i);
        this.b = s82Var;
        this.c = new byte[s82Var.a() / 2];
        this.e = new byte[this.b.a()];
        this.f = new byte[this.b.a()];
        this.g = new ArrayList<>();
        this.d = new byte[4];
    }

    private void c(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >> 24);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2] = (byte) i;
    }

    @Override // defpackage.l8c
    public byte[] a(byte[] bArr, int i, int i2) {
        if (this.a) {
            if (i2 % this.b.a() == 0) {
                if (i + i2 <= bArr.length) {
                    int a = ((i2 / this.b.a()) + 1) * 2;
                    int i3 = a - 1;
                    int i4 = i3 * 6;
                    int a2 = this.b.a() + i2;
                    byte[] bArr2 = new byte[a2];
                    System.arraycopy(bArr, i, bArr2, 0, i2);
                    System.arraycopy(bArr2, 0, this.c, 0, this.b.a() / 2);
                    this.g.clear();
                    int a3 = a2 - (this.b.a() / 2);
                    int a4 = this.b.a() / 2;
                    while (a3 != 0) {
                        byte[] bArr3 = new byte[this.b.a() / 2];
                        System.arraycopy(bArr2, a4, bArr3, 0, this.b.a() / 2);
                        this.g.add(bArr3);
                        a3 -= this.b.a() / 2;
                        a4 += this.b.a() / 2;
                    }
                    int i5 = 0;
                    while (i5 < i4) {
                        System.arraycopy(this.c, 0, bArr2, 0, this.b.a() / 2);
                        System.arraycopy(this.g.get(0), 0, bArr2, this.b.a() / 2, this.b.a() / 2);
                        this.b.b(bArr2, 0, bArr2, 0);
                        i5++;
                        c(i5, this.d, 0);
                        for (int i6 = 0; i6 < 4; i6++) {
                            int a5 = (this.b.a() / 2) + i6;
                            bArr2[a5] = (byte) (bArr2[a5] ^ this.d[i6]);
                        }
                        System.arraycopy(bArr2, this.b.a() / 2, this.c, 0, this.b.a() / 2);
                        for (int i7 = 2; i7 < a; i7++) {
                            System.arraycopy(this.g.get(i7 - 1), 0, this.g.get(i7 - 2), 0, this.b.a() / 2);
                        }
                        System.arraycopy(bArr2, 0, this.g.get(a - 2), 0, this.b.a() / 2);
                    }
                    System.arraycopy(this.c, 0, bArr2, 0, this.b.a() / 2);
                    int a6 = this.b.a() / 2;
                    for (int i8 = 0; i8 < i3; i8++) {
                        System.arraycopy(this.g.get(i8), 0, bArr2, a6, this.b.a() / 2);
                        a6 += this.b.a() / 2;
                    }
                    return bArr2;
                }
                throw new DataLengthException("input buffer too short");
            }
            throw new DataLengthException("wrap data must be a multiple of " + this.b.a() + " bytes");
        }
        throw new IllegalStateException("not set for wrapping");
    }

    @Override // defpackage.l8c
    public byte[] b(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (!this.a) {
            if (i2 % this.b.a() == 0) {
                int a = (i2 * 2) / this.b.a();
                int i3 = a - 1;
                int i4 = i3 * 6;
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                byte[] bArr3 = new byte[this.b.a() / 2];
                System.arraycopy(bArr2, 0, bArr3, 0, this.b.a() / 2);
                this.g.clear();
                int a2 = i2 - (this.b.a() / 2);
                int a3 = this.b.a() / 2;
                while (a2 != 0) {
                    byte[] bArr4 = new byte[this.b.a() / 2];
                    System.arraycopy(bArr2, a3, bArr4, 0, this.b.a() / 2);
                    this.g.add(bArr4);
                    a2 -= this.b.a() / 2;
                    a3 += this.b.a() / 2;
                }
                for (int i5 = 0; i5 < i4; i5++) {
                    System.arraycopy(this.g.get(a - 2), 0, bArr2, 0, this.b.a() / 2);
                    System.arraycopy(bArr3, 0, bArr2, this.b.a() / 2, this.b.a() / 2);
                    c(i4 - i5, this.d, 0);
                    for (int i6 = 0; i6 < 4; i6++) {
                        int a4 = (this.b.a() / 2) + i6;
                        bArr2[a4] = (byte) (bArr2[a4] ^ this.d[i6]);
                    }
                    this.b.b(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr3, 0, this.b.a() / 2);
                    for (int i7 = 2; i7 < a; i7++) {
                        int i8 = a - i7;
                        System.arraycopy(this.g.get(i8 - 1), 0, this.g.get(i8), 0, this.b.a() / 2);
                    }
                    System.arraycopy(bArr2, this.b.a() / 2, this.g.get(0), 0, this.b.a() / 2);
                }
                System.arraycopy(bArr3, 0, bArr2, 0, this.b.a() / 2);
                int a5 = this.b.a() / 2;
                for (int i9 = 0; i9 < i3; i9++) {
                    System.arraycopy(this.g.get(i9), 0, bArr2, a5, this.b.a() / 2);
                    a5 += this.b.a() / 2;
                }
                System.arraycopy(bArr2, i2 - this.b.a(), this.e, 0, this.b.a());
                byte[] bArr5 = new byte[i2 - this.b.a()];
                if (tr.c(this.e, this.f)) {
                    System.arraycopy(bArr2, 0, bArr5, 0, i2 - this.b.a());
                    return bArr5;
                }
                throw new InvalidCipherTextException("checksum failed");
            }
            throw new DataLengthException("unwrap data must be a multiple of " + this.b.a() + " bytes");
        }
        throw new IllegalStateException("not set for unwrapping");
    }

    @Override // defpackage.l8c
    public String getAlgorithmName() {
        return "DSTU7624WrapEngine";
    }

    @Override // defpackage.l8c
    public void init(boolean z, v71 v71Var) {
        if (v71Var instanceof qq7) {
            v71Var = ((qq7) v71Var).a();
        }
        this.a = z;
        if (v71Var instanceof lf5) {
            this.b.init(z, v71Var);
            return;
        }
        throw new IllegalArgumentException("invalid parameters passed to DSTU7624WrapEngine");
    }
}
