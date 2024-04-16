package defpackage;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: vk0  reason: default package */
/* loaded from: classes3.dex */
public class vk0 implements m {
    private xc0 a;
    private int b;
    private boolean c;
    private byte[] d;
    private byte[] e;
    private int f;
    private v71 g;
    private byte[] h;
    private a i = new a();
    private a j = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vk0$a */
    /* loaded from: classes3.dex */
    public class a extends ByteArrayOutputStream {
        public a() {
        }

        public byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public vk0(xc0 xc0Var) {
        this.a = xc0Var;
        int a2 = xc0Var.a();
        this.b = a2;
        this.h = new byte[a2];
        if (a2 == 16) {
            return;
        }
        throw new IllegalArgumentException("cipher required with a block size of 16.");
    }

    private int c(byte[] bArr, int i, int i2, byte[] bArr2) {
        uk0 uk0Var = new uk0(this.a, this.f * 8);
        uk0Var.init(this.g);
        byte[] bArr3 = new byte[16];
        if (f()) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        int i3 = 2;
        byte macSize = (byte) (bArr3[0] | ((((uk0Var.getMacSize() - 2) / 2) & 7) << 3));
        bArr3[0] = macSize;
        byte[] bArr4 = this.d;
        bArr3[0] = (byte) (macSize | ((14 - bArr4.length) & 7));
        System.arraycopy(bArr4, 0, bArr3, 1, bArr4.length);
        int i4 = i2;
        int i5 = 1;
        while (i4 > 0) {
            bArr3[16 - i5] = (byte) (i4 & 255);
            i4 >>>= 8;
            i5++;
        }
        uk0Var.update(bArr3, 0, 16);
        if (f()) {
            int d = d();
            if (d < 65280) {
                uk0Var.update((byte) (d >> 8));
                uk0Var.update((byte) d);
            } else {
                uk0Var.update((byte) -1);
                uk0Var.update((byte) -2);
                uk0Var.update((byte) (d >> 24));
                uk0Var.update((byte) (d >> 16));
                uk0Var.update((byte) (d >> 8));
                uk0Var.update((byte) d);
                i3 = 6;
            }
            byte[] bArr5 = this.e;
            if (bArr5 != null) {
                uk0Var.update(bArr5, 0, bArr5.length);
            }
            if (this.i.size() > 0) {
                uk0Var.update(this.i.a(), 0, this.i.size());
            }
            int i6 = (i3 + d) % 16;
            if (i6 != 0) {
                while (i6 != 16) {
                    uk0Var.update((byte) 0);
                    i6++;
                }
            }
        }
        uk0Var.update(bArr, i, i2);
        return uk0Var.doFinal(bArr2, 0);
    }

    private int d() {
        int length;
        int size = this.i.size();
        byte[] bArr = this.e;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        return size + length;
    }

    private int e(boolean z, int i) {
        if (z && (i < 32 || i > 128 || (i & 15) != 0)) {
            throw new IllegalArgumentException("tag length in octets must be one of {4,6,8,10,12,14,16}");
        }
        return i >>> 3;
    }

    private boolean f() {
        if (d() > 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.n
    public byte[] a() {
        int i = this.f;
        byte[] bArr = new byte[i];
        System.arraycopy(this.h, 0, bArr, 0, i);
        return bArr;
    }

    @Override // defpackage.n
    public void b(byte[] bArr, int i, int i2) {
        this.i.write(bArr, i, i2);
    }

    @Override // defpackage.n
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        int h = h(this.j.a(), 0, this.j.size(), bArr, i);
        i();
        return h;
    }

    public void g(byte b) {
        this.i.write(b);
    }

    @Override // defpackage.n
    public String getAlgorithmName() {
        return this.a.getAlgorithmName() + "/CCM";
    }

    @Override // defpackage.n
    public int getOutputSize(int i) {
        int size = i + this.j.size();
        if (this.c) {
            return size + this.f;
        }
        int i2 = this.f;
        if (size < i2) {
            return 0;
        }
        return size - i2;
    }

    @Override // defpackage.m
    public xc0 getUnderlyingCipher() {
        return this.a;
    }

    @Override // defpackage.n
    public int getUpdateOutputSize(int i) {
        return 0;
    }

    public int h(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, InvalidCipherTextException, DataLengthException {
        int i4;
        if (this.g != null) {
            byte[] bArr3 = this.d;
            int length = bArr3.length;
            int i5 = 15 - length;
            if (i5 < 4 && i2 >= (1 << (i5 * 8))) {
                throw new IllegalStateException("CCM packet too large for choice of q.");
            }
            byte[] bArr4 = new byte[this.b];
            bArr4[0] = (byte) ((14 - length) & 7);
            System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
            kq9 kq9Var = new kq9(this.a);
            kq9Var.init(this.c, new pq7(this.g, bArr4));
            if (this.c) {
                int i6 = this.f + i2;
                if (bArr2.length >= i6 + i3) {
                    c(bArr, i, i2, this.h);
                    byte[] bArr5 = new byte[this.b];
                    kq9Var.b(this.h, 0, bArr5, 0);
                    int i7 = i;
                    int i8 = i3;
                    while (true) {
                        int i9 = i + i2;
                        int i10 = this.b;
                        if (i7 < i9 - i10) {
                            kq9Var.b(bArr, i7, bArr2, i8);
                            int i11 = this.b;
                            i8 += i11;
                            i7 += i11;
                        } else {
                            byte[] bArr6 = new byte[i10];
                            int i12 = i9 - i7;
                            System.arraycopy(bArr, i7, bArr6, 0, i12);
                            kq9Var.b(bArr6, 0, bArr6, 0);
                            System.arraycopy(bArr6, 0, bArr2, i8, i12);
                            System.arraycopy(bArr5, 0, bArr2, i3 + i2, this.f);
                            return i6;
                        }
                    }
                } else {
                    throw new OutputLengthException("Output buffer too short.");
                }
            } else {
                int i13 = this.f;
                if (i2 >= i13) {
                    int i14 = i2 - i13;
                    if (bArr2.length >= i14 + i3) {
                        int i15 = i + i14;
                        System.arraycopy(bArr, i15, this.h, 0, i13);
                        byte[] bArr7 = this.h;
                        kq9Var.b(bArr7, 0, bArr7, 0);
                        int i16 = this.f;
                        while (true) {
                            byte[] bArr8 = this.h;
                            if (i16 == bArr8.length) {
                                break;
                            }
                            bArr8[i16] = 0;
                            i16++;
                        }
                        int i17 = i;
                        int i18 = i3;
                        while (true) {
                            i4 = this.b;
                            if (i17 >= i15 - i4) {
                                break;
                            }
                            kq9Var.b(bArr, i17, bArr2, i18);
                            int i19 = this.b;
                            i18 += i19;
                            i17 += i19;
                        }
                        byte[] bArr9 = new byte[i4];
                        int i20 = i14 - (i17 - i);
                        System.arraycopy(bArr, i17, bArr9, 0, i20);
                        kq9Var.b(bArr9, 0, bArr9, 0);
                        System.arraycopy(bArr9, 0, bArr2, i18, i20);
                        byte[] bArr10 = new byte[this.b];
                        c(bArr2, i3, i14, bArr10);
                        if (tr.u(this.h, bArr10)) {
                            return i14;
                        }
                        throw new InvalidCipherTextException("mac check in CCM failed");
                    }
                    throw new OutputLengthException("Output buffer too short.");
                }
                throw new InvalidCipherTextException("data too short");
            }
        } else {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
    }

    public void i() {
        this.a.reset();
        this.i.reset();
        this.j.reset();
    }

    @Override // defpackage.n
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        v71 b;
        this.c = z;
        if (v71Var instanceof p) {
            p pVar = (p) v71Var;
            this.d = pVar.d();
            this.e = pVar.a();
            this.f = e(z, pVar.c());
            b = pVar.b();
        } else if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            this.d = pq7Var.a();
            this.e = null;
            this.f = e(z, 64);
            b = pq7Var.b();
        } else {
            throw new IllegalArgumentException("invalid parameters passed to CCM: " + v71Var.getClass().getName());
        }
        if (b != null) {
            this.g = b;
        }
        byte[] bArr = this.d;
        if (bArr != null && bArr.length >= 7 && bArr.length <= 13) {
            i();
            return;
        }
        throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
    }

    @Override // defpackage.n
    public int processByte(byte b, byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        this.j.write(b);
        return 0;
    }

    @Override // defpackage.n
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        if (bArr.length >= i + i2) {
            this.j.write(bArr, i, i2);
            return 0;
        }
        throw new DataLengthException("Input buffer too short");
    }
}
