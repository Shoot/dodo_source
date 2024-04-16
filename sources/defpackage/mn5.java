package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: LayoutUtils.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001a5\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lnr1;", "constraints", "", "softWrap", "Lgcb;", "overflow", "", "maxIntrinsicWidth", "a", "(JZIF)J", "", c.a, "(JZIF)I", "maxLinesIn", "b", "(ZII)I", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: mn5  reason: default package */
/* loaded from: classes.dex */
public final class mn5 {
    public static final long a(long j, boolean z, int i, float f) {
        return qr1.b(0, c(j, z, i, f), 0, nr1.m(j), 5, null);
    }

    public static final int b(boolean z, int i, int i2) {
        int e;
        if (z || !gcb.e(i, gcb.a.b())) {
            e = i.e(i2, 1);
            return e;
        }
        return 1;
    }

    public static final int c(long j, boolean z, int i, float f) {
        int n;
        int l;
        if ((z || gcb.e(i, gcb.a.b())) && nr1.j(j)) {
            n = nr1.n(j);
        } else {
            n = Integer.MAX_VALUE;
        }
        if (nr1.p(j) != n) {
            l = i.l(nab.a(f), nr1.p(j), n);
            return l;
        }
        return n;
    }
}
