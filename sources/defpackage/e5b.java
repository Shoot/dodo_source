package defpackage;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SystemProps.common.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a,\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000\u001a,\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\tH\u0000¨\u0006\u000b"}, d2 = {"", "propertyName", "", "defaultValue", c.a, "", "minValue", "maxValue", "a", "", "b", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* renamed from: e5b  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class e5b {
    public static final int a(String str, int i, int i2, int i3) {
        return (int) c5b.c(str, i, i2, i3);
    }

    public static final long b(String str, long j, long j2, long j3) {
        Long m;
        String d = c5b.d(str);
        if (d != null) {
            m = k0b.m(d);
            if (m != null) {
                long longValue = m.longValue();
                if (j2 <= longValue && longValue <= j3) {
                    return longValue;
                }
                throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + CallerDataConverter.DEFAULT_RANGE_DELIMITER + j3 + ", but is '" + longValue + CoreConstants.SINGLE_QUOTE_CHAR).toString());
            }
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d + CoreConstants.SINGLE_QUOTE_CHAR).toString());
        }
        return j;
    }

    public static final boolean c(String str, boolean z) {
        String d = c5b.d(str);
        if (d != null) {
            return Boolean.parseBoolean(d);
        }
        return z;
    }

    public static /* synthetic */ int d(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return c5b.b(str, i, i2, i3);
    }

    public static /* synthetic */ long e(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return c5b.c(str, j, j4, j3);
    }
}
