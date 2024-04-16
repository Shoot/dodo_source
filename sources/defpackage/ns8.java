package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;
import kotlin.ranges.i;
/* compiled from: Punycode.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J(\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u001c\u0010\u0010\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u00020\u0004*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lns8;", "", "", "string", "", "pos", "limit", "Lyg0;", "result", "", "f", DateTokenConverter.CONVERTER_KEY, "delta", "numpoints", "first", "a", Image.TYPE_HIGH, "", "b", e.a, c.a, "Ljava/lang/String;", "getPREFIX_STRING", "()Ljava/lang/String;", "PREFIX_STRING", "Llk0;", "Llk0;", "getPREFIX", "()Llk0;", "PREFIX", "g", "(I)I", "punycodeDigit", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: ns8  reason: default package */
/* loaded from: classes3.dex */
public final class ns8 {
    public static final ns8 a = new ns8();
    private static final String b = "xn--";
    private static final lk0 c = lk0.d.d("xn--");

    private ns8() {
    }

    private final int a(int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = i / 700;
        } else {
            i3 = i / 2;
        }
        int i4 = i3 + (i3 / i2);
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return i5 + ((i4 * 36) / (i4 + 38));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [char] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    private final List<Integer> b(String str, int i, int i2) {
        boolean g;
        char c2;
        ArrayList arrayList = new ArrayList();
        while (i < i2) {
            int charAt = str.charAt(i);
            g = ow0.g(charAt);
            if (g) {
                int i3 = i + 1;
                if (i3 < i2) {
                    c2 = str.charAt(i3);
                } else {
                    c2 = 0;
                }
                if (!Character.isLowSurrogate(charAt) && Character.isLowSurrogate(c2)) {
                    charAt = 65536 + (((charAt & 1023) << 10) | (c2 & 1023));
                    i = i3;
                } else {
                    charAt = 63;
                }
            }
            arrayList.add(Integer.valueOf(charAt));
            i++;
        }
        return arrayList;
    }

    private final boolean d(String str, int i, int i2, yg0 yg0Var) {
        boolean z;
        int d0;
        IntRange q;
        d p;
        int i3;
        boolean z2;
        int i4;
        int i5;
        z = l0b.z(str, i, b, 0, 4, true);
        if (!z) {
            yg0Var.k0(str, i, i2);
            return true;
        }
        int i6 = i + 4;
        ArrayList<Number> arrayList = new ArrayList();
        d0 = m0b.d0(str, CoreConstants.DASH_CHAR, i2, false, 4, null);
        char c2 = '[';
        char c3 = CoreConstants.CURLY_LEFT;
        char c4 = 'A';
        if (d0 >= i6) {
            while (i6 < d0) {
                int i7 = i6 + 1;
                char charAt = str.charAt(i6);
                if (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && (('0' > charAt || charAt >= ':') && charAt != '-'))) {
                    return false;
                }
                arrayList.add(Integer.valueOf(charAt));
                i6 = i7;
            }
            i6++;
        }
        int i8 = 128;
        int i9 = 72;
        int i10 = 0;
        while (i6 < i2) {
            q = i.q(36, Integer.MAX_VALUE);
            p = i.p(q, 36);
            int h = p.h();
            int k = p.k();
            int p2 = p.p();
            if ((p2 > 0 && h <= k) || (p2 < 0 && k <= h)) {
                i3 = i10;
                int i11 = 1;
                while (i6 != i2) {
                    int i12 = i6 + 1;
                    char charAt2 = str.charAt(i6);
                    if ('a' <= charAt2 && charAt2 < c3) {
                        i4 = charAt2 - 'a';
                    } else if (c4 <= charAt2 && charAt2 < c2) {
                        i4 = charAt2 - 'A';
                    } else if ('0' > charAt2 || charAt2 >= ':') {
                        return false;
                    } else {
                        i4 = charAt2 - 22;
                    }
                    int i13 = i11;
                    int i14 = i4 * i13;
                    int i15 = i3;
                    if (i15 > Integer.MAX_VALUE - i14) {
                        return false;
                    }
                    i3 = i15 + i14;
                    if (h <= i9) {
                        i5 = 1;
                    } else if (h >= i9 + 26) {
                        i5 = 26;
                    } else {
                        i5 = h - i9;
                    }
                    if (i4 >= i5) {
                        int i16 = 36 - i5;
                        if (i13 > Integer.MAX_VALUE / i16) {
                            return false;
                        }
                        i11 = i13 * i16;
                        if (h != k) {
                            h += p2;
                            i6 = i12;
                            c2 = '[';
                            c3 = CoreConstants.CURLY_LEFT;
                            c4 = 'A';
                        }
                    }
                    i6 = i12;
                }
                return false;
            }
            i3 = i10;
            int i17 = i3 - i10;
            int size = arrayList.size() + 1;
            if (i10 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            i9 = a(i17, size, z2);
            int size2 = i3 / (arrayList.size() + 1);
            if (i8 > Integer.MAX_VALUE - size2) {
                return false;
            }
            i8 += size2;
            int size3 = i3 % (arrayList.size() + 1);
            if (i8 > 1114111) {
                return false;
            }
            arrayList.add(size3, Integer.valueOf(i8));
            i10 = size3 + 1;
            c2 = '[';
            c3 = CoreConstants.CURLY_LEFT;
            c4 = 'A';
        }
        for (Number number : arrayList) {
            yg0Var.G(number.intValue());
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean f(java.lang.String r19, int r20, int r21, defpackage.yg0 r22) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns8.f(java.lang.String, int, int, yg0):boolean");
    }

    private final int g(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i).toString());
    }

    private final boolean h(String str, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) >= 128) {
                return true;
            }
            i++;
        }
        return false;
    }

    public final String c(String str) {
        int Y;
        z65.h(str, "string");
        int length = str.length();
        yg0 yg0Var = new yg0();
        for (int i = 0; i < length; i = Y + 1) {
            Y = m0b.Y(str, CoreConstants.DOT, i, false, 4, null);
            if (Y == -1) {
                Y = length;
            }
            if (!d(str, i, Y, yg0Var)) {
                return null;
            }
            if (Y >= length) {
                break;
            }
            yg0Var.V0(46);
        }
        return yg0Var.L();
    }

    public final String e(String str) {
        int Y;
        z65.h(str, "string");
        int length = str.length();
        yg0 yg0Var = new yg0();
        for (int i = 0; i < length; i = Y + 1) {
            Y = m0b.Y(str, CoreConstants.DOT, i, false, 4, null);
            if (Y == -1) {
                Y = length;
            }
            if (!f(str, i, Y, yg0Var)) {
                return null;
            }
            if (Y >= length) {
                break;
            }
            yg0Var.V0(46);
        }
        return yg0Var.L();
    }
}
