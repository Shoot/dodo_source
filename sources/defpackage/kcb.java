package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: TextRange.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"", "start", "end", "Ljcb;", "b", "(II)J", "index", "a", "(I)J", "minimumValue", "maximumValue", c.a, "(JII)J", "", DateTokenConverter.CONVERTER_KEY, "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: kcb  reason: default package */
/* loaded from: classes.dex */
public final class kcb {
    public static final long a(int i) {
        return b(i, i);
    }

    public static final long b(int i, int i2) {
        return jcb.c(d(i, i2));
    }

    public static final long c(long j, int i, int i2) {
        int l;
        int l2;
        l = i.l(jcb.j(j), i, i2);
        l2 = i.l(jcb.g(j), i, i2);
        if (l == jcb.j(j) && l2 == jcb.g(j)) {
            return j;
        }
        return b(l, l2);
    }

    private static final long d(int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                return (i2 & 4294967295L) | (i << 32);
            }
            throw new IllegalArgumentException(("end cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
    }
}
