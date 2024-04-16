package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.tmb;
import defpackage.yg0;
import kotlin.Metadata;
/* compiled from: Buffer.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a0\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\bH\u0000\u001a\u0014\u0010\u0015\u001a\u00020\u0013*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\" \u0010\u001b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lr3a;", tmb.g.SEGMENT_JSON_NAME, "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", c.a, "Lyg0;", "", "newline", "", DateTokenConverter.CONVERTER_KEY, "Lzb7;", "options", "selectTruncated", e.a, "Lyg0$a;", "unsafeCursor", "a", "[B", "b", "()[B", "getHEX_DIGIT_BYTES$annotations", "()V", "HEX_DIGIT_BYTES", "okio"}, k = 2, mv = {1, 9, 0})
/* renamed from: d */
/* loaded from: classes3.dex */
public final class d {
    private static final byte[] a = sdc.a("0123456789abcdef");

    public static final yg0.a a(yg0 yg0Var, yg0.a aVar) {
        z65.h(yg0Var, "<this>");
        z65.h(aVar, "unsafeCursor");
        yg0.a g = i.g(aVar);
        if (g.a == null) {
            g.a = yg0Var;
            g.b = true;
            return g;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    public static final byte[] b() {
        return a;
    }

    public static final boolean c(r3a r3aVar, int i, byte[] bArr, int i2, int i3) {
        z65.h(r3aVar, tmb.g.SEGMENT_JSON_NAME);
        z65.h(bArr, "bytes");
        int i4 = r3aVar.c;
        byte[] bArr2 = r3aVar.a;
        while (i2 < i3) {
            if (i == i4) {
                r3aVar = r3aVar.f;
                z65.e(r3aVar);
                byte[] bArr3 = r3aVar.a;
                bArr2 = bArr3;
                i = r3aVar.b;
                i4 = r3aVar.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String d(yg0 yg0Var, long j) {
        z65.h(yg0Var, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (yg0Var.n(j2) == 13) {
                String G0 = yg0Var.G0(j2);
                yg0Var.skip(2L);
                return G0;
            }
        }
        String G02 = yg0Var.G0(j);
        yg0Var.skip(1L);
        return G02;
    }

    public static final int e(yg0 yg0Var, zb7 zb7Var, boolean z) {
        int i;
        int i2;
        boolean z2;
        r3a r3aVar;
        int i3;
        int i4;
        z65.h(yg0Var, "<this>");
        z65.h(zb7Var, "options");
        r3a r3aVar2 = yg0Var.a;
        if (r3aVar2 == null) {
            if (z) {
                return -2;
            }
            return -1;
        }
        byte[] bArr = r3aVar2.a;
        int i5 = r3aVar2.b;
        int i6 = r3aVar2.c;
        int[] E = zb7Var.E();
        r3a r3aVar3 = r3aVar2;
        int i7 = 0;
        int i8 = -1;
        loop0: while (true) {
            int i9 = i7 + 1;
            int i10 = E[i7];
            int i11 = i7 + 2;
            int i12 = E[i9];
            if (i12 != -1) {
                i8 = i12;
            }
            if (r3aVar3 == null) {
                break;
            }
            if (i10 < 0) {
                int i13 = i11 + (i10 * (-1));
                while (true) {
                    int i14 = i5 + 1;
                    int i15 = i11 + 1;
                    if ((bArr[i5] & 255) != E[i11]) {
                        return i8;
                    }
                    if (i15 == i13) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i14 == i6) {
                        z65.e(r3aVar3);
                        r3a r3aVar4 = r3aVar3.f;
                        z65.e(r3aVar4);
                        i4 = r3aVar4.b;
                        byte[] bArr2 = r3aVar4.a;
                        i3 = r3aVar4.c;
                        if (r3aVar4 == r3aVar2) {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr2;
                            r3aVar = null;
                        } else {
                            r3aVar = r3aVar4;
                            bArr = bArr2;
                        }
                    } else {
                        r3aVar = r3aVar3;
                        i3 = i6;
                        i4 = i14;
                    }
                    if (z2) {
                        i2 = E[i15];
                        i = i4;
                        i6 = i3;
                        r3aVar3 = r3aVar;
                        break;
                    }
                    i5 = i4;
                    i6 = i3;
                    r3aVar3 = r3aVar;
                    i11 = i15;
                }
            } else {
                i = i5 + 1;
                int i16 = bArr[i5] & 255;
                int i17 = i11 + i10;
                while (i11 != i17) {
                    if (i16 == E[i11]) {
                        i2 = E[i11 + i10];
                        if (i == i6) {
                            r3aVar3 = r3aVar3.f;
                            z65.e(r3aVar3);
                            i = r3aVar3.b;
                            bArr = r3aVar3.a;
                            i6 = r3aVar3.c;
                            if (r3aVar3 == r3aVar2) {
                                r3aVar3 = null;
                            }
                        }
                    } else {
                        i11++;
                    }
                }
                return i8;
            }
            if (i2 >= 0) {
                return i2;
            }
            i7 = -i2;
            i5 = i;
        }
        if (z) {
            return -2;
        }
        return i8;
    }

    public static /* synthetic */ int f(yg0 yg0Var, zb7 zb7Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return e(yg0Var, zb7Var, z);
    }
}
