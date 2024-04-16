package defpackage;

import org.bouncycastle.crypto.DataLengthException;
/* renamed from: tvb  reason: default package */
/* loaded from: classes3.dex */
public class tvb implements x36 {
    private byte a;
    private byte b = 0;
    private byte[] c = null;
    private byte d = 0;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private byte h;
    private byte i;
    private byte j;
    private byte k;

    private void a(byte[] bArr, byte[] bArr2) {
        this.d = (byte) 0;
        this.c = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.c[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.c;
            byte b = this.d;
            int i3 = i2 & 255;
            byte b2 = bArr3[i3];
            byte b3 = bArr3[(b + b2 + bArr[i2 % bArr.length]) & 255];
            this.d = b3;
            bArr3[i3] = bArr3[b3 & 255];
            bArr3[b3 & 255] = b2;
        }
        for (int i4 = 0; i4 < 768; i4++) {
            byte[] bArr4 = this.c;
            byte b4 = this.d;
            int i5 = i4 & 255;
            byte b5 = bArr4[i5];
            byte b6 = bArr4[(b4 + b5 + bArr2[i4 % bArr2.length]) & 255];
            this.d = b6;
            bArr4[i5] = bArr4[b6 & 255];
            bArr4[b6 & 255] = b5;
        }
        this.b = (byte) 0;
    }

    @Override // defpackage.x36
    public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        for (int i2 = 1; i2 < 25; i2++) {
            byte[] bArr2 = this.c;
            byte b = this.d;
            byte b2 = this.b;
            byte b3 = bArr2[(b + bArr2[b2 & 255]) & 255];
            this.d = b3;
            byte b4 = this.k;
            byte b5 = this.j;
            byte b6 = bArr2[(b4 + b5 + i2) & 255];
            this.k = b6;
            byte b7 = this.i;
            byte b8 = bArr2[(b5 + b7 + i2) & 255];
            this.j = b8;
            byte b9 = this.h;
            byte b10 = bArr2[(b7 + b9 + i2) & 255];
            this.i = b10;
            byte b11 = bArr2[(b9 + b3 + i2) & 255];
            this.h = b11;
            byte[] bArr3 = this.e;
            byte b12 = this.a;
            bArr3[b12 & 31] = (byte) (b11 ^ bArr3[b12 & 31]);
            bArr3[(b12 + 1) & 31] = (byte) (b10 ^ bArr3[(b12 + 1) & 31]);
            bArr3[(b12 + 2) & 31] = (byte) (b8 ^ bArr3[(b12 + 2) & 31]);
            bArr3[(b12 + 3) & 31] = (byte) (b6 ^ bArr3[(b12 + 3) & 31]);
            this.a = (byte) ((b12 + 4) & 31);
            byte b13 = bArr2[b2 & 255];
            bArr2[b2 & 255] = bArr2[b3 & 255];
            bArr2[b3 & 255] = b13;
            this.b = (byte) ((b2 + 1) & 255);
        }
        for (int i3 = 0; i3 < 768; i3++) {
            byte[] bArr4 = this.c;
            byte b14 = this.d;
            int i4 = i3 & 255;
            byte b15 = bArr4[i4];
            byte b16 = bArr4[(b14 + b15 + this.e[i3 & 31]) & 255];
            this.d = b16;
            bArr4[i4] = bArr4[b16 & 255];
            bArr4[b16 & 255] = b15;
        }
        byte[] bArr5 = new byte[20];
        for (int i5 = 0; i5 < 20; i5++) {
            byte[] bArr6 = this.c;
            int i6 = i5 & 255;
            byte b17 = bArr6[(this.d + bArr6[i6]) & 255];
            this.d = b17;
            bArr5[i5] = bArr6[(bArr6[bArr6[b17 & 255] & 255] + 1) & 255];
            byte b18 = bArr6[i6];
            bArr6[i6] = bArr6[b17 & 255];
            bArr6[b17 & 255] = b18;
        }
        System.arraycopy(bArr5, 0, bArr, i, 20);
        reset();
        return 20;
    }

    @Override // defpackage.x36
    public String getAlgorithmName() {
        return "VMPC-MAC";
    }

    @Override // defpackage.x36
    public int getMacSize() {
        return 20;
    }

    @Override // defpackage.x36
    public void init(v71 v71Var) throws IllegalArgumentException {
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            lf5 lf5Var = (lf5) pq7Var.b();
            if (pq7Var.b() instanceof lf5) {
                byte[] a = pq7Var.a();
                this.f = a;
                if (a != null && a.length >= 1 && a.length <= 768) {
                    this.g = lf5Var.a();
                    reset();
                    return;
                }
                throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
            }
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
    }

    @Override // defpackage.x36
    public void reset() {
        a(this.g, this.f);
        this.b = (byte) 0;
        this.k = (byte) 0;
        this.j = (byte) 0;
        this.i = (byte) 0;
        this.h = (byte) 0;
        this.a = (byte) 0;
        this.e = new byte[32];
        for (int i = 0; i < 32; i++) {
            this.e[i] = 0;
        }
    }

    @Override // defpackage.x36
    public void update(byte b) throws IllegalStateException {
        byte[] bArr = this.c;
        byte b2 = this.d;
        byte b3 = this.b;
        byte b4 = bArr[(b2 + bArr[b3 & 255]) & 255];
        this.d = b4;
        byte b5 = this.k;
        byte b6 = this.j;
        byte b7 = bArr[(b5 + b6) & 255];
        this.k = b7;
        byte b8 = this.i;
        byte b9 = bArr[(b6 + b8) & 255];
        this.j = b9;
        byte b10 = this.h;
        byte b11 = bArr[(b8 + b10) & 255];
        this.i = b11;
        byte b12 = bArr[(b10 + b4 + ((byte) (b ^ bArr[(bArr[bArr[b4 & 255] & 255] + 1) & 255]))) & 255];
        this.h = b12;
        byte[] bArr2 = this.e;
        byte b13 = this.a;
        bArr2[b13 & 31] = (byte) (b12 ^ bArr2[b13 & 31]);
        bArr2[(b13 + 1) & 31] = (byte) (b11 ^ bArr2[(b13 + 1) & 31]);
        bArr2[(b13 + 2) & 31] = (byte) (b9 ^ bArr2[(b13 + 2) & 31]);
        bArr2[(b13 + 3) & 31] = (byte) (b7 ^ bArr2[(b13 + 3) & 31]);
        this.a = (byte) ((b13 + 4) & 31);
        byte b14 = bArr[b3 & 255];
        bArr[b3 & 255] = bArr[b4 & 255];
        bArr[b4 & 255] = b14;
        this.b = (byte) ((b3 + 1) & 255);
    }

    @Override // defpackage.x36
    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            update(bArr[i + i3]);
        }
    }
}
