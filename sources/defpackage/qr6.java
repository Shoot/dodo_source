package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: MyersDiff.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001a \u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001aU\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a]\u0010\u0018\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a]\u0010\u001a\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0019\u001a8\u0010!\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0013H\u0000\u001a\u001c\u0010\"\u001a\u00020\t*\u00020\u00132\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0000H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"", "oldSize", "newSize", "Ld23;", "cb", "Ly55;", DateTokenConverter.CONVERTER_KEY, "diagonals", "callback", "", "b", e.a, "oldStart", "oldEnd", "newStart", "newEnd", "Lyt0;", "forward", "backward", "", "snake", "", Image.TYPE_HIGH, "(IIIILd23;[I[I[I)Z", "g", "(IIIILd23;[I[II[I)Z", c.a, "startX", "startY", "endX", "endY", "reverse", "data", "f", "i", "j", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: qr6  reason: default package */
/* loaded from: classes.dex */
public final class qr6 {
    private static final void b(y55 y55Var, d23 d23Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < y55Var.c()) {
            int i4 = i + 2;
            int b = y55Var.b(i) - y55Var.b(i4);
            int b2 = y55Var.b(i + 1) - y55Var.b(i4);
            int b3 = y55Var.b(i4);
            i += 3;
            while (i2 < b) {
                d23Var.a(i3, i2);
                i2++;
            }
            while (i3 < b2) {
                d23Var.c(i3);
                i3++;
            }
            while (true) {
                int i5 = b3 - 1;
                if (b3 > 0) {
                    d23Var.d(i2, i3);
                    i2++;
                    i3++;
                    b3 = i5;
                }
            }
        }
    }

    private static final boolean c(int i, int i2, int i3, int i4, d23 d23Var, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        boolean z;
        int b;
        int i6;
        int i7;
        int i8;
        int i9 = (i2 - i) - (i4 - i3);
        if (i9 % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        int i10 = -i5;
        for (int i11 = i10; i11 <= i5; i11 += 2) {
            if (i11 != i10 && (i11 == i5 || yt0.b(iArr2, i11 + 1) >= yt0.b(iArr2, i11 - 1))) {
                b = yt0.b(iArr2, i11 - 1);
                i6 = b - 1;
            } else {
                b = yt0.b(iArr2, i11 + 1);
                i6 = b;
            }
            int i12 = i4 - ((i2 - i6) - i11);
            if (i5 != 0 && i6 == b) {
                i7 = i12 + 1;
            } else {
                i7 = i12;
            }
            while (i6 > i && i12 > i3) {
                if (!d23Var.b(i6 - 1, i12 - 1)) {
                    break;
                }
                i6--;
                i12--;
            }
            yt0.d(iArr2, i11, i6);
            if (z && (i8 = i9 - i11) >= i10 && i8 <= i5) {
                if (yt0.b(iArr, i8) >= i6) {
                    f(i6, i12, b, i7, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final y55 d(int i, int i2, d23 d23Var) {
        int i3 = ((i + i2) + 1) / 2;
        y55 y55Var = new y55(i3 * 3);
        y55 y55Var2 = new y55(i3 * 4);
        y55Var2.h(0, i, 0, i2);
        int i4 = (i3 * 2) + 1;
        int[] a = yt0.a(new int[i4]);
        int[] a2 = yt0.a(new int[i4]);
        int[] b = woa.b(new int[5]);
        while (y55Var2.d()) {
            int f = y55Var2.f();
            int f2 = y55Var2.f();
            int f3 = y55Var2.f();
            int f4 = y55Var2.f();
            int[] iArr = a;
            int[] iArr2 = a2;
            if (h(f4, f3, f2, f, d23Var, a, a2, b)) {
                if (woa.c(b) > 0) {
                    woa.a(b, y55Var);
                }
                y55Var2.h(f4, woa.h(b), f2, woa.i(b));
                y55Var2.h(woa.d(b), f3, woa.e(b), f);
            }
            a = iArr;
            a2 = iArr2;
        }
        y55Var.j();
        y55Var.g(i, i2, 0);
        return y55Var;
    }

    public static final void e(int i, int i2, d23 d23Var) {
        z65.h(d23Var, "callback");
        b(d(i, i2, d23Var), d23Var);
    }

    public static final void f(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        z65.h(iArr, "data");
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }

    private static final boolean g(int i, int i2, int i3, int i4, d23 d23Var, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        boolean z;
        int b;
        int i6;
        int i7;
        int i8 = (i2 - i) - (i4 - i3);
        if (Math.abs(i8) % 2 == 1) {
            z = true;
        } else {
            z = false;
        }
        int i9 = -i5;
        for (int i10 = i9; i10 <= i5; i10 += 2) {
            if (i10 != i9 && (i10 == i5 || yt0.b(iArr, i10 + 1) <= yt0.b(iArr, i10 - 1))) {
                b = yt0.b(iArr, i10 - 1);
                i6 = b + 1;
            } else {
                b = yt0.b(iArr, i10 + 1);
                i6 = b;
            }
            int i11 = (i3 + (i6 - i)) - i10;
            int i12 = (i5 != 0 && i6 == b) ? i11 - 1 : i11;
            while (i6 < i2 && i11 < i4) {
                if (!d23Var.b(i6, i11)) {
                    break;
                }
                i6++;
                i11++;
            }
            yt0.d(iArr, i10, i6);
            if (z && (i7 = i8 - i10) >= i9 + 1 && i7 <= i5 - 1) {
                if (yt0.b(iArr2, i7) <= i6) {
                    f(b, i12, i6, i11, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean h(int i, int i2, int i3, int i4, d23 d23Var, int[] iArr, int[] iArr2, int[] iArr3) {
        int i5 = i2 - i;
        int i6 = i4 - i3;
        if (i5 >= 1 && i6 >= 1) {
            int i7 = ((i5 + i6) + 1) / 2;
            yt0.d(iArr, 1, i);
            yt0.d(iArr2, 1, i2);
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i8;
                if (g(i, i2, i3, i4, d23Var, iArr, iArr2, i8, iArr3) || c(i, i2, i3, i4, d23Var, iArr, iArr2, i9, iArr3)) {
                    return true;
                }
                i8 = i9 + 1;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}
