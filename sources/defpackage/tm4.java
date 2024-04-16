package defpackage;

import java.lang.reflect.Array;
/* renamed from: tm4  reason: default package */
/* loaded from: classes3.dex */
public class tm4 extends vm4 {
    private static final byte[][] d = {new byte[]{6, -124, 112, 76, -26, 32, -64, 10, -78, -59, -2, -16, 117, -127, 123, -99}, new byte[]{-117, 102, -76, -31, -120, -13, -96, 107, 100, 15, 107, -92, 47, 8, -9, 23}, new byte[]{52, 2, -34, 45, 83, -14, -124, -104, -49, 2, -99, 96, -97, 2, -111, 20}, new byte[]{14, -42, -22, -26, 46, 123, 79, 8, -69, -13, -68, -81, -3, 91, 79, 121}, new byte[]{-53, -49, -80, -53, 72, 114, 68, -117, 121, -18, -51, 28, -66, 57, 112, 68}, new byte[]{126, -22, -51, -18, 110, -112, 50, -73, -115, 83, 53, -19, 43, -118, 5, 123}, new byte[]{103, -62, -113, 67, 94, 46, 124, -48, -30, 65, 39, 97, -38, 79, -17, 27}, new byte[]{41, 36, -39, -80, -81, -54, -52, 7, 103, 95, -3, -30, 31, -57, 11, 59}, new byte[]{-85, 77, 99, -15, -26, -122, Byte.MAX_VALUE, -23, -20, -37, -113, -54, -71, -44, 101, -18}, new byte[]{28, 48, -65, -124, -44, -73, -51, 100, 91, 42, 64, 79, -83, 3, 126, 51}, new byte[]{-78, -52, 11, -71, -108, 23, 35, -65, 105, 2, -117, 46, -115, -10, -104, 0}, new byte[]{-6, 4, 120, -90, -34, 111, 85, 114, 74, -86, -98, -56, 92, -99, 45, -118}, new byte[]{-33, -76, -97, 43, 107, 119, 42, 18, 14, -6, 79, 46, 41, 18, -97, -44}, new byte[]{30, -95, 3, 68, -12, 73, -94, 54, 50, -42, 17, -82, -69, 106, 18, -18}, new byte[]{-81, 4, 73, -120, 75, 5, 0, -124, 95, -106, 0, -55, -100, -88, -20, -90}, new byte[]{33, 2, 94, -40, -99, 25, -100, 79, 120, -94, -57, -29, 39, -27, -109, -20}, new byte[]{-65, 58, -86, -8, -89, 89, -55, -73, -71, 40, 46, -51, -126, -44, 1, 115}, new byte[]{98, 96, 112, 13, 97, -122, -80, 23, 55, -14, -17, -39, 16, 48, 125, 107}, new byte[]{90, -54, 69, -62, 33, 48, 4, 67, -127, -62, -111, 83, -10, -4, -102, -58}, new byte[]{-110, 35, -105, 60, 34, 107, 104, -69, 44, -81, -110, -24, 54, -47, -108, 58}};
    private final byte[] b;
    private int c;

    public tm4() {
        this.b = new byte[32];
    }

    private int j(byte[] bArr, byte[] bArr2, int i) {
        Class cls = Byte.TYPE;
        byte[][] bArr3 = (byte[][]) Array.newInstance(cls, 2, 16);
        byte[][] bArr4 = (byte[][]) Array.newInstance(cls, 2, 16);
        System.arraycopy(bArr, 0, bArr3[0], 0, 16);
        System.arraycopy(bArr, 16, bArr3[1], 0, 16);
        byte[] bArr5 = bArr3[0];
        byte[][] bArr6 = d;
        bArr3[0] = vm4.a(bArr5, bArr6[0]);
        bArr3[1] = vm4.a(bArr3[1], bArr6[1]);
        bArr3[0] = vm4.a(bArr3[0], bArr6[2]);
        bArr3[1] = vm4.a(bArr3[1], bArr6[3]);
        k(bArr3, bArr4);
        bArr3[0] = vm4.a(bArr4[0], bArr6[4]);
        bArr3[1] = vm4.a(bArr4[1], bArr6[5]);
        bArr3[0] = vm4.a(bArr3[0], bArr6[6]);
        bArr3[1] = vm4.a(bArr3[1], bArr6[7]);
        k(bArr3, bArr4);
        bArr3[0] = vm4.a(bArr4[0], bArr6[8]);
        bArr3[1] = vm4.a(bArr4[1], bArr6[9]);
        bArr3[0] = vm4.a(bArr3[0], bArr6[10]);
        bArr3[1] = vm4.a(bArr3[1], bArr6[11]);
        k(bArr3, bArr4);
        bArr3[0] = vm4.a(bArr4[0], bArr6[12]);
        bArr3[1] = vm4.a(bArr4[1], bArr6[13]);
        bArr3[0] = vm4.a(bArr3[0], bArr6[14]);
        bArr3[1] = vm4.a(bArr3[1], bArr6[15]);
        k(bArr3, bArr4);
        bArr3[0] = vm4.a(bArr4[0], bArr6[16]);
        bArr3[1] = vm4.a(bArr4[1], bArr6[17]);
        bArr3[0] = vm4.a(bArr3[0], bArr6[18]);
        bArr3[1] = vm4.a(bArr3[1], bArr6[19]);
        k(bArr3, bArr4);
        bArr3[0] = vm4.h(bArr4[0], bArr, 0);
        bArr3[1] = vm4.h(bArr4[1], bArr, 16);
        System.arraycopy(bArr3[0], 0, bArr2, i, 16);
        System.arraycopy(bArr3[1], 0, bArr2, i + 16, 16);
        return 32;
    }

    private void k(byte[][] bArr, byte[][] bArr2) {
        System.arraycopy(bArr[0], 0, bArr2[0], 0, 4);
        System.arraycopy(bArr[1], 0, bArr2[0], 4, 4);
        System.arraycopy(bArr[0], 4, bArr2[0], 8, 4);
        System.arraycopy(bArr[1], 4, bArr2[0], 12, 4);
        System.arraycopy(bArr[0], 8, bArr2[1], 0, 4);
        System.arraycopy(bArr[1], 8, bArr2[1], 4, 4);
        System.arraycopy(bArr[0], 12, bArr2[1], 8, 4);
        System.arraycopy(bArr[1], 12, bArr2[1], 12, 4);
    }

    @Override // defpackage.e23
    public int doFinal(byte[] bArr, int i) {
        if (this.c == 32) {
            if (bArr.length - i >= 32) {
                int j = j(this.b, bArr, i);
                reset();
                return j;
            }
            throw new IllegalArgumentException("output too short to receive digest");
        }
        throw new IllegalStateException("input must be exactly 32 bytes");
    }

    @Override // defpackage.e23
    public String getAlgorithmName() {
        return "Haraka-256";
    }

    @Override // defpackage.e23
    public void reset() {
        this.c = 0;
        tr.g(this.b);
    }

    @Override // defpackage.e23
    public void update(byte b) {
        int i = this.c;
        if (i + 1 > 32) {
            throw new IllegalArgumentException("total input cannot be more than 32 bytes");
        }
        byte[] bArr = this.b;
        this.c = i + 1;
        bArr[i] = b;
    }

    public tm4(tm4 tm4Var) {
        this.b = tr.h(tm4Var.b);
        this.c = tm4Var.c;
    }

    @Override // defpackage.e23
    public void update(byte[] bArr, int i, int i2) {
        int i3 = this.c;
        if (i3 + i2 > 32) {
            throw new IllegalArgumentException("total input cannot be more than 32 bytes");
        }
        System.arraycopy(bArr, i, this.b, i3, i2);
        this.c += i2;
    }
}
