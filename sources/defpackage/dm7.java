package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0081@\u0018\u00002\u00020\u0001B,\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u001c\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0006B\u0014\b\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J>\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u0011\u0092\u0001\u00020\u0004ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Ldm7;", "", "Lkn5;", "orientation", "Lnr1;", "f", "(JLkn5;)J", "", "mainAxisMin", "mainAxisMax", "crossAxisMin", "crossAxisMax", DateTokenConverter.CONVERTER_KEY, "(JIIII)J", "a", "(IIII)J", c.a, "value", "b", "(J)J", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: dm7  reason: default package */
/* loaded from: classes.dex */
public final class dm7 {
    public static long a(int i, int i2, int i3, int i4) {
        return b(qr1.a(i, i2, i3, i4));
    }

    public static long c(long j, kn5 kn5Var) {
        int o;
        int m;
        int p;
        int n;
        z65.h(kn5Var, "orientation");
        kn5 kn5Var2 = kn5.Horizontal;
        if (kn5Var == kn5Var2) {
            o = nr1.p(j);
        } else {
            o = nr1.o(j);
        }
        if (kn5Var == kn5Var2) {
            m = nr1.n(j);
        } else {
            m = nr1.m(j);
        }
        if (kn5Var == kn5Var2) {
            p = nr1.o(j);
        } else {
            p = nr1.p(j);
        }
        if (kn5Var == kn5Var2) {
            n = nr1.m(j);
        } else {
            n = nr1.n(j);
        }
        return a(o, m, p, n);
    }

    public static final long d(long j, int i, int i2, int i3, int i4) {
        return a(i, i2, i3, i4);
    }

    public static /* synthetic */ long e(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = nr1.p(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = nr1.n(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = nr1.o(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = nr1.m(j);
        }
        return d(j, i6, i7, i8, i4);
    }

    public static final long f(long j, kn5 kn5Var) {
        z65.h(kn5Var, "orientation");
        if (kn5Var == kn5.Horizontal) {
            return qr1.a(nr1.p(j), nr1.n(j), nr1.o(j), nr1.m(j));
        }
        return qr1.a(nr1.o(j), nr1.m(j), nr1.p(j), nr1.n(j));
    }

    private static long b(long j) {
        return j;
    }
}
