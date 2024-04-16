package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import kotlin.ranges.i;
/* compiled from: -HostnamesCommon.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\"\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000\u001a0\u0010\r\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tH\u0000\u001a\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\tH\u0002\u001a\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tH\u0000\u001a\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000\u001a\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0000\"\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0016¨\u0006\u0018"}, d2 = {"", "", "a", DateTokenConverter.CONVERTER_KEY, c.a, "input", "", "pos", "limit", "", "f", "address", "addressOffset", e.a, "i", "b", "j", Image.TYPE_HIGH, "k", "host", "g", "Lec9;", "Lec9;", "VERIFY_AS_IP_ADDRESS", "okhttp"}, k = 2, mv = {1, 9, 0})
/* renamed from: rdc  reason: default package */
/* loaded from: classes3.dex */
public final class rdc {
    private static final ec9 a = new ec9("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static final boolean a(String str) {
        z65.h(str, "<this>");
        return a.f(str);
    }

    public static final byte[] b(byte[] bArr) {
        IntRange q;
        byte[] S;
        z65.h(bArr, "address");
        if (j(bArr)) {
            q = i.q(12, 16);
            S = yr.S(bArr, q);
            return S;
        }
        return bArr;
    }

    public static final boolean c(String str) {
        int Y;
        z65.h(str, "<this>");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (z65.j(charAt, 31) > 0 && z65.j(charAt, 127) < 0) {
                Y = m0b.Y(" #%/:?@[\\]", charAt, 0, false, 6, null);
                if (Y != -1) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(String str) {
        int Y;
        int i;
        z65.h(str, "<this>");
        int length = str.length();
        if (1 <= length && length < 254) {
            int i2 = 0;
            while (true) {
                Y = m0b.Y(str, CoreConstants.DOT, i2, false, 4, null);
                if (Y == -1) {
                    i = str.length() - i2;
                } else {
                    i = Y - i2;
                }
                if (1 > i || i >= 64) {
                    break;
                } else if (Y == -1 || Y == str.length() - 1) {
                    break;
                } else {
                    i2 = Y + 1;
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean e(String str, int i, int i2, byte[] bArr, int i3) {
        z65.h(str, "input");
        z65.h(bArr, "address");
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (z65.j(charAt, 48) < 0 || z65.j(charAt, 57) > 0) {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        if (i4 != i3 + 4) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte[] f(java.lang.String r18, int r19, int r20) {
        /*
            r6 = r18
            r7 = r20
            java.lang.String r0 = "input"
            defpackage.z65.h(r6, r0)
            r8 = 16
            byte[] r9 = new byte[r8]
            r11 = -1
            r12 = r19
            r13 = 0
            r14 = -1
            r15 = -1
        L13:
            r16 = 0
            if (r12 >= r7) goto L9b
            if (r13 != r8) goto L1a
            return r16
        L1a:
            int r5 = r12 + 2
            if (r5 > r7) goto L3d
            java.lang.String r1 = "::"
            r3 = 0
            r4 = 4
            r17 = 0
            r0 = r18
            r2 = r12
            r10 = r5
            r5 = r17
            boolean r0 = defpackage.c0b.I(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L3d
            if (r14 == r11) goto L33
            return r16
        L33:
            int r13 = r13 + 2
            if (r10 != r7) goto L3a
            r14 = r13
            goto L9b
        L3a:
            r15 = r10
            r14 = r13
            goto L6c
        L3d:
            if (r13 == 0) goto L4f
            java.lang.String r1 = ":"
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r18
            r2 = r12
            boolean r0 = defpackage.c0b.I(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L51
            int r12 = r12 + 1
        L4f:
            r15 = r12
            goto L6c
        L51:
            java.lang.String r1 = "."
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r18
            r2 = r12
            boolean r0 = defpackage.c0b.I(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L6b
            int r0 = r13 + (-2)
            boolean r0 = e(r6, r15, r7, r9, r0)
            if (r0 != 0) goto L68
            return r16
        L68:
            int r13 = r13 + 2
            goto L9b
        L6b:
            return r16
        L6c:
            r12 = r15
            r0 = 0
        L6e:
            if (r12 >= r7) goto L80
            char r1 = r6.charAt(r12)
            int r1 = defpackage.zdc.D(r1)
            if (r1 == r11) goto L80
            int r0 = r0 << 4
            int r0 = r0 + r1
            int r12 = r12 + 1
            goto L6e
        L80:
            int r1 = r12 - r15
            if (r1 == 0) goto L9a
            r2 = 4
            if (r1 <= r2) goto L88
            goto L9a
        L88:
            int r1 = r13 + 1
            int r2 = r0 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r9[r13] = r2
            int r13 = r13 + 2
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r9[r1] = r0
            goto L13
        L9a:
            return r16
        L9b:
            if (r13 == r8) goto Lad
            if (r14 != r11) goto La0
            return r16
        La0:
            int r0 = r13 - r14
            int r0 = 16 - r0
            defpackage.ur.d(r9, r9, r0, r14, r13)
            int r8 = r8 - r13
            int r8 = r8 + r14
            r0 = 0
            defpackage.ur.o(r9, r0, r14, r8)
        Lad:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdc.f(java.lang.String, int, int):byte[]");
    }

    public static final String g(String str) {
        z65.h(str, "host");
        yg0 a0 = new yg0().a0(str);
        yg0 yg0Var = new yg0();
        while (!a0.U0()) {
            if (!ot4.a().c(a0.M(), yg0Var)) {
                return null;
            }
        }
        a0.a0(udc.a(yg0Var.L()));
        ns8 ns8Var = ns8.a;
        String c = ns8Var.c(a0.L());
        if (c == null || !z65.c(c, udc.a(c))) {
            return null;
        }
        return ns8Var.e(c);
    }

    public static final String h(byte[] bArr) {
        z65.h(bArr, "address");
        if (bArr.length == 4) {
            return new yg0().C0(zdc.b(bArr[0], 255)).V0(46).C0(zdc.b(bArr[1], 255)).V0(46).C0(zdc.b(bArr[2], 255)).V0(46).C0(zdc.b(bArr[3], 255)).L();
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final String i(byte[] bArr) {
        z65.h(bArr, "address");
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        yg0 yg0Var = new yg0();
        while (i2 < bArr.length) {
            if (i2 == i) {
                yg0Var.V0(58);
                i2 += i4;
                if (i2 == 16) {
                    yg0Var.V0(58);
                }
            } else {
                if (i2 > 0) {
                    yg0Var.V0(58);
                }
                yg0Var.u1((zdc.b(bArr[i2], 255) << 8) | zdc.b(bArr[i2 + 1], 255));
                i2 += 2;
            }
        }
        return yg0Var.L();
    }

    private static final boolean j(byte[] bArr) {
        if (bArr.length != 16) {
            return false;
        }
        for (int i = 0; i < 10; i++) {
            if (bArr[i] != 0) {
                return false;
            }
        }
        if (bArr[10] != -1 || bArr[11] != -1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String k(java.lang.String r4) {
        /*
            java.lang.String r0 = "<this>"
            defpackage.z65.h(r4, r0)
            java.lang.String r0 = ":"
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = defpackage.c0b.O(r4, r0, r1, r2, r3)
            if (r0 == 0) goto L69
            java.lang.String r0 = "["
            boolean r0 = defpackage.c0b.J(r4, r0, r1, r2, r3)
            if (r0 == 0) goto L2b
            java.lang.String r0 = "]"
            boolean r0 = defpackage.c0b.u(r4, r0, r1, r2, r3)
            if (r0 == 0) goto L2b
            int r0 = r4.length()
            r1 = 1
            int r0 = r0 - r1
            byte[] r0 = f(r4, r1, r0)
            goto L33
        L2b:
            int r0 = r4.length()
            byte[] r0 = f(r4, r1, r0)
        L33:
            if (r0 != 0) goto L36
            return r3
        L36:
            byte[] r0 = b(r0)
            int r1 = r0.length
            r2 = 16
            if (r1 != r2) goto L44
            java.lang.String r4 = i(r0)
            return r4
        L44:
            int r1 = r0.length
            r2 = 4
            if (r1 != r2) goto L4d
            java.lang.String r4 = h(r0)
            return r4
        L4d:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid IPv6 address: '"
            r1.append(r2)
            r1.append(r4)
            r4 = 39
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L69:
            java.lang.String r4 = g(r4)
            if (r4 != 0) goto L70
            return r3
        L70:
            int r0 = r4.length()
            if (r0 != 0) goto L77
            return r3
        L77:
            boolean r0 = c(r4)
            if (r0 == 0) goto L7e
            return r3
        L7e:
            boolean r0 = d(r4)
            if (r0 == 0) goto L85
            return r3
        L85:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdc.k(java.lang.String):java.lang.String");
    }
}
