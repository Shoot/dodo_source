package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.PrintWriter;
/* compiled from: TimeUtils.java */
/* renamed from: tgb  reason: default package */
/* loaded from: classes.dex */
public final class tgb {
    private static final Object a = new Object();
    private static char[] b = new char[24];

    private static int a(int i, int i2, boolean z, int i3) {
        if (i <= 99 && (!z || i3 < 3)) {
            if (i <= 9 && (!z || i3 < 2)) {
                if (!z && i <= 0) {
                    return 0;
                }
                return i2 + 1;
            }
            return i2 + 2;
        }
        return i2 + 3;
    }

    public static void b(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            d(j - j2, printWriter, 0);
        }
    }

    public static void c(long j, PrintWriter printWriter) {
        d(j, printWriter, 0);
    }

    public static void d(long j, PrintWriter printWriter, int i) {
        synchronized (a) {
            printWriter.print(new String(b, 0, e(j, i)));
        }
    }

    private static int e(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        int i9;
        int i10;
        boolean z5;
        boolean z6;
        boolean z7;
        int i11;
        long j2 = j;
        if (b.length < i) {
            b = new char[i];
        }
        char[] cArr = b;
        int i12 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i12 == 0) {
            int i13 = i - 1;
            while (i13 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (i12 > 0) {
            c = '+';
        } else {
            j2 = -j2;
            c = CoreConstants.DASH_CHAR;
        }
        int i14 = (int) (j2 % 1000);
        int floor = (int) Math.floor(j2 / 1000);
        if (floor > 86400) {
            i2 = floor / RemoteMessageConst.DEFAULT_TTL;
            floor -= RemoteMessageConst.DEFAULT_TTL * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i15 = floor / 60;
            i4 = floor - (i15 * 60);
            i5 = i15;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i != 0) {
            int a2 = a(i2, 1, false, 0);
            if (a2 > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            int a3 = a2 + a(i3, 1, z5, 2);
            if (a3 > 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            int a4 = a3 + a(i5, 1, z6, 2);
            if (a4 > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int a5 = a4 + a(i4, 1, z7, 2);
            if (a5 > 0) {
                i11 = 3;
            } else {
                i11 = 0;
            }
            i6 = 0;
            for (int a6 = a5 + a(i14, 2, true, i11) + 1; a6 < i; a6++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i16 = i6 + 1;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        int f = f(cArr, i2, 'd', i16, false, 0);
        if (f != i16) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        int f2 = f(cArr, i3, 'h', f, z2, i7);
        if (f2 != i16) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            i8 = 2;
        } else {
            i8 = 0;
        }
        int f3 = f(cArr, i5, 'm', f2, z3, i8);
        if (f3 != i16) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        int f4 = f(cArr, i4, 's', f3, z4, i9);
        if (z && f4 != i16) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        int f5 = f(cArr, i14, 'm', f4, true, i10);
        cArr[f5] = 's';
        return f5 + 1;
    }

    private static int f(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (z || i > 0) {
            if ((z && i3 >= 3) || i > 99) {
                int i5 = i / 100;
                cArr[i2] = (char) (i5 + 48);
                i4 = i2 + 1;
                i -= i5 * 100;
            } else {
                i4 = i2;
            }
            if ((z && i3 >= 2) || i > 9 || i2 != i4) {
                int i6 = i / 10;
                cArr[i4] = (char) (i6 + 48);
                i4++;
                i -= i6 * 10;
            }
            cArr[i4] = (char) (i + 48);
            cArr[i4 + 1] = c;
            return i4 + 2;
        }
        return i2;
    }
}
