package defpackage;
/* renamed from: svb  reason: default package */
/* loaded from: classes3.dex */
public class svb extends rvb {
    @Override // defpackage.rvb
    protected void a(byte[] bArr, byte[] bArr2) {
        this.c = (byte) 0;
        this.b = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.b[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.b;
            byte b = this.c;
            int i3 = i2 & 255;
            byte b2 = bArr3[i3];
            byte b3 = bArr3[(b + b2 + bArr[i2 % bArr.length]) & 255];
            this.c = b3;
            bArr3[i3] = bArr3[b3 & 255];
            bArr3[b3 & 255] = b2;
        }
        for (int i4 = 0; i4 < 768; i4++) {
            byte[] bArr4 = this.b;
            byte b4 = this.c;
            int i5 = i4 & 255;
            byte b5 = bArr4[i5];
            byte b6 = bArr4[(b4 + b5 + bArr2[i4 % bArr2.length]) & 255];
            this.c = b6;
            bArr4[i5] = bArr4[b6 & 255];
            bArr4[b6 & 255] = b5;
        }
        for (int i6 = 0; i6 < 768; i6++) {
            byte[] bArr5 = this.b;
            byte b7 = this.c;
            int i7 = i6 & 255;
            byte b8 = bArr5[i7];
            byte b9 = bArr5[(b7 + b8 + bArr[i6 % bArr.length]) & 255];
            this.c = b9;
            bArr5[i7] = bArr5[b9 & 255];
            bArr5[b9 & 255] = b8;
        }
        this.a = (byte) 0;
    }

    @Override // defpackage.rvb, defpackage.rya
    public String getAlgorithmName() {
        return "VMPC-KSA3";
    }
}
