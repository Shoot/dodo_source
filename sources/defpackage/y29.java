package defpackage;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: y29  reason: default package */
/* loaded from: classes3.dex */
public class y29 implements l8c {
    private tk0 a;
    private pq7 b;
    private boolean c;
    private SecureRandom d;

    public y29(xc0 xc0Var) {
        this.a = new tk0(xc0Var);
    }

    @Override // defpackage.l8c
    public byte[] a(byte[] bArr, int i, int i2) {
        if (this.c) {
            if (i2 <= 255 && i2 >= 0) {
                this.a.init(true, this.b);
                int a = this.a.a();
                int i3 = i2 + 4;
                int i4 = a * 2;
                if (i3 >= i4) {
                    if (i3 % a == 0) {
                        i4 = i3;
                    } else {
                        i4 = ((i3 / a) + 1) * a;
                    }
                }
                byte[] bArr2 = new byte[i4];
                bArr2[0] = (byte) i2;
                System.arraycopy(bArr, i, bArr2, 4, i2);
                int length = bArr2.length - i3;
                byte[] bArr3 = new byte[length];
                this.d.nextBytes(bArr3);
                System.arraycopy(bArr3, 0, bArr2, i3, length);
                bArr2[1] = (byte) (~bArr2[4]);
                bArr2[2] = (byte) (~bArr2[5]);
                bArr2[3] = (byte) (~bArr2[6]);
                for (int i5 = 0; i5 < bArr2.length; i5 += a) {
                    this.a.b(bArr2, i5, bArr2, i5);
                }
                for (int i6 = 0; i6 < bArr2.length; i6 += a) {
                    this.a.b(bArr2, i6, bArr2, i6);
                }
                return bArr2;
            }
            throw new IllegalArgumentException("input must be from 0 to 255 bytes");
        }
        throw new IllegalStateException("not set for wrapping");
    }

    @Override // defpackage.l8c
    public byte[] b(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        boolean z;
        byte[] bArr2;
        if (!this.c) {
            int a = this.a.a();
            if (i2 >= a * 2) {
                byte[] bArr3 = new byte[i2];
                byte[] bArr4 = new byte[a];
                boolean z2 = false;
                System.arraycopy(bArr, i, bArr3, 0, i2);
                System.arraycopy(bArr, i, bArr4, 0, a);
                this.a.init(false, new pq7(this.b.b(), bArr4));
                for (int i3 = a; i3 < i2; i3 += a) {
                    this.a.b(bArr3, i3, bArr3, i3);
                }
                System.arraycopy(bArr3, i2 - a, bArr4, 0, a);
                this.a.init(false, new pq7(this.b.b(), bArr4));
                this.a.b(bArr3, 0, bArr3, 0);
                this.a.init(false, this.b);
                for (int i4 = 0; i4 < i2; i4 += a) {
                    this.a.b(bArr3, i4, bArr3, i4);
                }
                int i5 = bArr3[0];
                int i6 = i2 - 4;
                if ((i5 & 255) > i6) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    bArr2 = new byte[i6];
                } else {
                    bArr2 = new byte[i5 & 255];
                }
                System.arraycopy(bArr3, 4, bArr2, 0, bArr2.length);
                int i7 = 0;
                int i8 = 0;
                while (i7 != 3) {
                    int i9 = i7 + 1;
                    i8 |= bArr3[i7 + 4] ^ ((byte) (~bArr3[i9]));
                    i7 = i9;
                }
                tr.g(bArr3);
                if (i8 != 0) {
                    z2 = true;
                }
                if (!(z | z2)) {
                    return bArr2;
                }
                throw new InvalidCipherTextException("wrapped key corrupted");
            }
            throw new InvalidCipherTextException("input too short");
        }
        throw new IllegalStateException("not set for unwrapping");
    }

    @Override // defpackage.l8c
    public String getAlgorithmName() {
        return this.a.e().getAlgorithmName() + "/RFC3211Wrap";
    }

    @Override // defpackage.l8c
    public void init(boolean z, v71 v71Var) {
        this.c = z;
        if (v71Var instanceof qq7) {
            qq7 qq7Var = (qq7) v71Var;
            this.d = qq7Var.b();
            if (qq7Var.a() instanceof pq7) {
                this.b = (pq7) qq7Var.a();
                return;
            }
            throw new IllegalArgumentException("RFC3211Wrap requires an IV");
        }
        if (z) {
            this.d = b32.b();
        }
        if (v71Var instanceof pq7) {
            this.b = (pq7) v71Var;
            return;
        }
        throw new IllegalArgumentException("RFC3211Wrap requires an IV");
    }
}
