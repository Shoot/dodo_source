package defpackage;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.lk0;
import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: Path.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u001a\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u000b\u001a\u00020\u0000*\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0003H\u0000\u001a\f\u0010\r\u001a\u00020\f*\u00020\bH\u0002\u001a\f\u0010\u000f\u001a\u00020\f*\u00020\u000eH\u0002\u001a\u0014\u0010\u0011\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0002\"\u001a\u0010\u0016\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0019\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u0012\u0004\b\u0018\u0010\u0015\"\u001a\u0010\u001c\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u0012\u0004\b\u001b\u0010\u0015\"\u001a\u0010\u001f\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u0012\u0004\b\u001e\u0010\u0015\"\u001a\u0010\"\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b \u0010\u0013\u0012\u0004\b!\u0010\u0015\"\u0018\u0010%\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u001a\u0010\u0010\u001a\u0004\u0018\u00010\f*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lnr7;", "", "o", "", "n", "child", "normalize", "j", "", "k", "Lyg0;", "q", "Llk0;", Image.TYPE_SMALL, "", "r", "slash", "p", "a", "Llk0;", "getSLASH$annotations", "()V", "SLASH", "b", "getBACKSLASH$annotations", "BACKSLASH", c.a, "getANY_SLASH$annotations", "ANY_SLASH", DateTokenConverter.CONVERTER_KEY, "getDOT$annotations", "DOT", e.a, "getDOT_DOT$annotations", "DOT_DOT", "l", "(Lnr7;)I", "indexOfLastSlash", Image.TYPE_MEDIUM, "(Lnr7;)Llk0;", "okio"}, k = 2, mv = {1, 9, 0})
/* renamed from: g  reason: default package */
/* loaded from: classes3.dex */
public final class g {
    private static final lk0 a;
    private static final lk0 b;
    private static final lk0 c;
    private static final lk0 d;
    private static final lk0 e;

    static {
        lk0.a aVar = lk0.d;
        a = aVar.d("/");
        b = aVar.d("\\");
        c = aVar.d("/\\");
        d = aVar.d(".");
        e = aVar.d(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
    }

    public static final nr7 j(nr7 nr7Var, nr7 nr7Var2, boolean z) {
        z65.h(nr7Var, "<this>");
        z65.h(nr7Var2, "child");
        if (!nr7Var2.k() && nr7Var2.z() == null) {
            lk0 m = m(nr7Var);
            if (m == null && (m = m(nr7Var2)) == null) {
                m = s(nr7.c);
            }
            yg0 yg0Var = new yg0();
            yg0Var.d0(nr7Var.g());
            if (yg0Var.P() > 0) {
                yg0Var.d0(m);
            }
            yg0Var.d0(nr7Var2.g());
            return q(yg0Var, z);
        }
        return nr7Var2;
    }

    public static final nr7 k(String str, boolean z) {
        z65.h(str, "<this>");
        return q(new yg0().a0(str), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(nr7 nr7Var) {
        int T = lk0.T(nr7Var.g(), a, 0, 2, null);
        if (T != -1) {
            return T;
        }
        return lk0.T(nr7Var.g(), b, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lk0 m(nr7 nr7Var) {
        lk0 g = nr7Var.g();
        lk0 lk0Var = a;
        if (lk0.L(g, lk0Var, 0, 2, null) == -1) {
            lk0 g2 = nr7Var.g();
            lk0 lk0Var2 = b;
            if (lk0.L(g2, lk0Var2, 0, 2, null) == -1) {
                return null;
            }
            return lk0Var2;
        }
        return lk0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(nr7 nr7Var) {
        if (!nr7Var.g().q(e) || (nr7Var.g().n0() != 2 && !nr7Var.g().b0(nr7Var.g().n0() - 3, a, 0, 1) && !nr7Var.g().b0(nr7Var.g().n0() - 3, b, 0, 1))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(nr7 nr7Var) {
        if (nr7Var.g().n0() == 0) {
            return -1;
        }
        if (nr7Var.g().s(0) == 47) {
            return 1;
        }
        if (nr7Var.g().s(0) == 92) {
            if (nr7Var.g().n0() <= 2 || nr7Var.g().s(1) != 92) {
                return 1;
            }
            int H = nr7Var.g().H(b, 2);
            if (H == -1) {
                return nr7Var.g().n0();
            }
            return H;
        }
        if (nr7Var.g().n0() > 2 && nr7Var.g().s(1) == 58 && nr7Var.g().s(2) == 92) {
            char s = (char) nr7Var.g().s(0);
            if ('a' > s || s >= '{') {
                if ('A' <= s && s < '[') {
                    return 3;
                }
            } else {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean p(yg0 yg0Var, lk0 lk0Var) {
        if (!z65.c(lk0Var, b) || yg0Var.P() < 2 || yg0Var.n(1L) != 58) {
            return false;
        }
        char n = (char) yg0Var.n(0L);
        if (('a' > n || n >= '{') && ('A' > n || n >= '[')) {
            return false;
        }
        return true;
    }

    public static final nr7 q(yg0 yg0Var, boolean z) {
        lk0 lk0Var;
        boolean z2;
        boolean z3;
        lk0 J0;
        Object k0;
        z65.h(yg0Var, "<this>");
        yg0 yg0Var2 = new yg0();
        lk0 lk0Var2 = null;
        int i = 0;
        while (true) {
            if (!yg0Var.L1(0L, a)) {
                lk0Var = b;
                if (!yg0Var.L1(0L, lk0Var)) {
                    break;
                }
            }
            byte readByte = yg0Var.readByte();
            if (lk0Var2 == null) {
                lk0Var2 = r(readByte);
            }
            i++;
        }
        if (i >= 2 && z65.c(lk0Var2, lk0Var)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            z65.e(lk0Var2);
            yg0Var2.d0(lk0Var2);
            yg0Var2.d0(lk0Var2);
        } else if (i > 0) {
            z65.e(lk0Var2);
            yg0Var2.d0(lk0Var2);
        } else {
            long O1 = yg0Var.O1(c);
            if (lk0Var2 == null) {
                if (O1 == -1) {
                    lk0Var2 = s(nr7.c);
                } else {
                    lk0Var2 = r(yg0Var.n(O1));
                }
            }
            if (p(yg0Var, lk0Var2)) {
                if (O1 == 2) {
                    yg0Var2.r1(yg0Var, 3L);
                } else {
                    yg0Var2.r1(yg0Var, 2L);
                }
            }
        }
        if (yg0Var2.P() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList arrayList = new ArrayList();
        while (!yg0Var.U0()) {
            long O12 = yg0Var.O1(c);
            if (O12 == -1) {
                J0 = yg0Var.v1();
            } else {
                J0 = yg0Var.J0(O12);
                yg0Var.readByte();
            }
            lk0 lk0Var3 = e;
            if (z65.c(J0, lk0Var3)) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (z) {
                        if (!z3) {
                            if (!arrayList.isEmpty()) {
                                k0 = sc1.k0(arrayList);
                                if (z65.c(k0, lk0Var3)) {
                                }
                            }
                        }
                        if (!z2 || arrayList.size() != 1) {
                            pc1.K(arrayList);
                        }
                    }
                    arrayList.add(J0);
                }
            } else if (!z65.c(J0, d) && !z65.c(J0, lk0.e)) {
                arrayList.add(J0);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                yg0Var2.d0(lk0Var2);
            }
            yg0Var2.d0((lk0) arrayList.get(i2));
        }
        if (yg0Var2.P() == 0) {
            yg0Var2.d0(d);
        }
        return new nr7(yg0Var2.v1());
    }

    private static final lk0 r(byte b2) {
        if (b2 != 47) {
            if (b2 == 92) {
                return b;
            }
            throw new IllegalArgumentException("not a directory separator: " + ((int) b2));
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lk0 s(String str) {
        if (z65.c(str, "/")) {
            return a;
        }
        if (z65.c(str, "\\")) {
            return b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
