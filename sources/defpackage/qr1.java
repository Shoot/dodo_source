package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: Constraints.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a:\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\r\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\n\u001a!\u0010\u000f\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0012\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u001a-\u0010\u0015\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"", "minWidth", "maxWidth", "minHeight", "maxHeight", "Lnr1;", "a", "(IIII)J", "otherConstraints", e.a, "(JJ)J", "Lw55;", "size", DateTokenConverter.CONVERTER_KEY, "width", "g", "(JI)I", "height", "f", "horizontal", "vertical", Image.TYPE_HIGH, "(JII)J", "max", "value", c.a, "ui-unit_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: qr1 */
/* loaded from: classes.dex */
public final class qr1 {
    public static final long a(int i, int i2, int i3, int i4) {
        if (i2 >= i) {
            if (i4 >= i3) {
                if (i >= 0 && i3 >= 0) {
                    return nr1.b.b(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public static /* synthetic */ long b(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return a(i, i2, i3, i4);
    }

    private static final int c(int i, int i2) {
        int e;
        if (i != Integer.MAX_VALUE) {
            e = i.e(i + i2, 0);
            return e;
        }
        return i;
    }

    public static final long d(long j, long j2) {
        int l;
        int l2;
        l = i.l(w55.g(j2), nr1.p(j), nr1.n(j));
        l2 = i.l(w55.f(j2), nr1.o(j), nr1.m(j));
        return x55.a(l, l2);
    }

    public static final long e(long j, long j2) {
        int l;
        int l2;
        int l3;
        int l4;
        l = i.l(nr1.p(j2), nr1.p(j), nr1.n(j));
        l2 = i.l(nr1.n(j2), nr1.p(j), nr1.n(j));
        l3 = i.l(nr1.o(j2), nr1.o(j), nr1.m(j));
        l4 = i.l(nr1.m(j2), nr1.o(j), nr1.m(j));
        return a(l, l2, l3, l4);
    }

    public static final int f(long j, int i) {
        int l;
        l = i.l(i, nr1.o(j), nr1.m(j));
        return l;
    }

    public static final int g(long j, int i) {
        int l;
        l = i.l(i, nr1.p(j), nr1.n(j));
        return l;
    }

    public static final long h(long j, int i, int i2) {
        int e;
        int e2;
        e = i.e(nr1.p(j) + i, 0);
        int c = c(nr1.n(j), i);
        e2 = i.e(nr1.o(j) + i2, 0);
        return a(e, c, e2, c(nr1.m(j), i2));
    }
}
