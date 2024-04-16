package defpackage;

import java.io.IOException;
import java.io.OutputStream;
/* renamed from: t60  reason: default package */
/* loaded from: classes3.dex */
public class t60 implements ah3 {
    protected final byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    protected byte b = 61;
    protected final byte[] c = new byte[128];

    public t60() {
        g();
    }

    private int d(OutputStream outputStream, char c, char c2, char c3, char c4) throws IOException {
        byte b = this.b;
        if (c3 == b) {
            if (c4 == b) {
                byte[] bArr = this.c;
                byte b2 = bArr[c];
                byte b3 = bArr[c2];
                if ((b2 | b3) >= 0) {
                    outputStream.write((b2 << 2) | (b3 >> 4));
                    return 1;
                }
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            throw new IOException("invalid characters encountered at end of base64 data");
        } else if (c4 == b) {
            byte[] bArr2 = this.c;
            byte b4 = bArr2[c];
            byte b5 = bArr2[c2];
            byte b6 = bArr2[c3];
            if ((b4 | b5 | b6) >= 0) {
                outputStream.write((b4 << 2) | (b5 >> 4));
                outputStream.write((b5 << 4) | (b6 >> 2));
                return 2;
            }
            throw new IOException("invalid characters encountered at end of base64 data");
        } else {
            byte[] bArr3 = this.c;
            byte b7 = bArr3[c];
            byte b8 = bArr3[c2];
            byte b9 = bArr3[c3];
            byte b10 = bArr3[c4];
            if ((b7 | b8 | b9 | b10) >= 0) {
                outputStream.write((b7 << 2) | (b8 >> 4));
                outputStream.write((b8 << 4) | (b9 >> 2));
                outputStream.write((b9 << 6) | b10);
                return 3;
            }
            throw new IOException("invalid characters encountered at end of base64 data");
        }
    }

    private boolean f(char c) {
        if (c != '\n' && c != '\r' && c != '\t' && c != ' ') {
            return false;
        }
        return true;
    }

    private int h(String str, int i, int i2) {
        while (i < i2 && f(str.charAt(i))) {
            i++;
        }
        return i;
    }

    @Override // defpackage.ah3
    public int a(int i) {
        return ((i + 2) / 3) * 4;
    }

    @Override // defpackage.ah3
    public int b(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[72];
        while (i2 > 0) {
            int min = Math.min(54, i2);
            outputStream.write(bArr2, 0, e(bArr, i, min, bArr2, 0));
            i += min;
            i2 -= min;
        }
        return ((i2 + 2) / 3) * 4;
    }

    @Override // defpackage.ah3
    public int c(String str, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0 && f(str.charAt(length - 1))) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        int i = length;
        int i2 = 0;
        while (i > 0 && i2 != 4) {
            if (!f(str.charAt(i - 1))) {
                i2++;
            }
            i--;
        }
        int h = h(str, 0, i);
        int i3 = 0;
        int i4 = 0;
        while (h < i) {
            int i5 = h + 1;
            byte b = this.c[str.charAt(h)];
            int h2 = h(str, i5, i);
            int i6 = h2 + 1;
            byte b2 = this.c[str.charAt(h2)];
            int h3 = h(str, i6, i);
            int i7 = h3 + 1;
            byte b3 = this.c[str.charAt(h3)];
            int h4 = h(str, i7, i);
            int i8 = h4 + 1;
            byte b4 = this.c[str.charAt(h4)];
            if ((b | b2 | b3 | b4) >= 0) {
                bArr[i3] = (byte) ((b << 2) | (b2 >> 4));
                int i9 = i3 + 2;
                bArr[i3 + 1] = (byte) ((b2 << 4) | (b3 >> 2));
                i3 += 3;
                bArr[i9] = (byte) ((b3 << 6) | b4);
                i4 += 3;
                if (i3 == 54) {
                    outputStream.write(bArr);
                    i3 = 0;
                }
                h = h(str, i8, i);
            } else {
                throw new IOException("invalid characters encountered in base64 data");
            }
        }
        if (i3 > 0) {
            outputStream.write(bArr, 0, i3);
        }
        int h5 = h(str, h, length);
        int h6 = h(str, h5 + 1, length);
        int h7 = h(str, h6 + 1, length);
        return i4 + d(outputStream, str.charAt(h5), str.charAt(h6), str.charAt(h7), str.charAt(h(str, h7 + 1, length)));
    }

    public int e(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        int i4 = (i + i2) - 2;
        int i5 = i;
        int i6 = i3;
        while (i5 < i4) {
            byte b = bArr[i5];
            int i7 = i5 + 2;
            int i8 = bArr[i5 + 1] & 255;
            i5 += 3;
            byte b2 = bArr[i7];
            byte[] bArr3 = this.a;
            bArr2[i6] = bArr3[(b >>> 2) & 63];
            bArr2[i6 + 1] = bArr3[((b << 4) | (i8 >>> 4)) & 63];
            int i9 = i6 + 3;
            bArr2[i6 + 2] = bArr3[((i8 << 2) | ((b2 & 255) >>> 6)) & 63];
            i6 += 4;
            bArr2[i9] = bArr3[b2 & 63];
        }
        int i10 = i2 - (i5 - i);
        if (i10 != 1) {
            if (i10 == 2) {
                int i11 = i5 + 1;
                int i12 = bArr[i5] & 255;
                int i13 = bArr[i11] & 255;
                byte[] bArr4 = this.a;
                bArr2[i6] = bArr4[(i12 >>> 2) & 63];
                bArr2[i6 + 1] = bArr4[((i12 << 4) | (i13 >>> 4)) & 63];
                int i14 = i6 + 3;
                bArr2[i6 + 2] = bArr4[(i13 << 2) & 63];
                i6 += 4;
                bArr2[i14] = this.b;
            }
        } else {
            int i15 = bArr[i5] & 255;
            byte[] bArr5 = this.a;
            bArr2[i6] = bArr5[(i15 >>> 2) & 63];
            bArr2[i6 + 1] = bArr5[(i15 << 4) & 63];
            int i16 = i6 + 3;
            byte b3 = this.b;
            bArr2[i6 + 2] = b3;
            i6 += 4;
            bArr2[i16] = b3;
        }
        return i6 - i3;
    }

    protected void g() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.c;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.a;
            if (i < bArr2.length) {
                this.c[bArr2[i]] = (byte) i;
                i++;
            } else {
                return;
            }
        }
    }
}
