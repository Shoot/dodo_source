package defpackage;

import java.lang.reflect.Array;
/* renamed from: rh4  reason: default package */
/* loaded from: classes3.dex */
public final class rh4 {
    public static ia4 a(ka4 ka4Var, we8 we8Var) {
        int d = ka4Var.d();
        int i = 1 << d;
        int g = we8Var.g();
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance(cls, g, i);
        int[][] iArr2 = (int[][]) Array.newInstance(cls, g, i);
        for (int i2 = 0; i2 < i; i2++) {
            iArr2[0][i2] = ka4Var.f(we8Var.e(i2));
        }
        for (int i3 = 1; i3 < g; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                iArr2[i3][i4] = ka4Var.h(iArr2[i3 - 1][i4], i4);
            }
        }
        for (int i5 = 0; i5 < g; i5++) {
            for (int i6 = 0; i6 < i; i6++) {
                for (int i7 = 0; i7 <= i5; i7++) {
                    int[] iArr3 = iArr[i5];
                    iArr3[i6] = ka4Var.a(iArr3[i6], ka4Var.h(iArr2[i7][i6], we8Var.f((g + i7) - i5)));
                }
            }
        }
        int[][] iArr4 = (int[][]) Array.newInstance(Integer.TYPE, g * d, (i + 31) >>> 5);
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = i8 >>> 5;
            int i10 = 1 << (i8 & 31);
            for (int i11 = 0; i11 < g; i11++) {
                int i12 = iArr[i11][i8];
                for (int i13 = 0; i13 < d; i13++) {
                    if (((i12 >>> i13) & 1) != 0) {
                        int[] iArr5 = iArr4[(((i11 + 1) * d) - i13) - 1];
                        iArr5[i9] = iArr5[i9] ^ i10;
                    }
                }
            }
        }
        return new ia4(i, iArr4);
    }
}
