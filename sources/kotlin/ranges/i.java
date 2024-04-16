package kotlin.ranges;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.ranges.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Ranges.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\u001a\u0015\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0004\u001a\u0015\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0004\u001a\u0015\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0004\u001a\u0012\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000\u001a\u0012\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004\u001a\u0012\u0010\u000f\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000e\u001a\u0012\u0010\u0011\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0010\u001a\u0012\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000\u001a\u0012\u0010\u0014\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004\u001a\u0012\u0010\u0015\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e\u001a\u001a\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000\u001a\u001a\u0010\u0017\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004\u001a\u001a\u0010\u0018\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e\u001a\u001a\u0010\u0019\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010¨\u0006\u001a"}, d2 = {"", RemoteMessageConst.TO, "Lkotlin/ranges/d;", "n", "", "Lkotlin/ranges/e;", "o", "step", "p", "Lkotlin/ranges/IntRange;", "q", "minimumValue", com.huawei.hms.push.e.a, "f", "", DateTokenConverter.CONVERTER_KEY, "", com.huawei.hms.opendevice.c.a, "maximumValue", Image.TYPE_HIGH, "i", "g", "l", Image.TYPE_MEDIUM, "k", "j", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/ranges/RangesKt")
/* loaded from: classes3.dex */
public class i extends h {
    public static double c(double d, double d2) {
        if (d < d2) {
            return d2;
        }
        return d;
    }

    public static float d(float f, float f2) {
        if (f < f2) {
            return f2;
        }
        return f;
    }

    public static int e(int i, int i2) {
        if (i < i2) {
            return i2;
        }
        return i;
    }

    public static long f(long j, long j2) {
        if (j < j2) {
            return j2;
        }
        return j;
    }

    public static float g(float f, float f2) {
        if (f > f2) {
            return f2;
        }
        return f;
    }

    public static int h(int i, int i2) {
        if (i > i2) {
            return i2;
        }
        return i;
    }

    public static long i(long j, long j2) {
        if (j > j2) {
            return j2;
        }
        return j;
    }

    public static double j(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            if (d > d3) {
                return d3;
            }
            return d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + CoreConstants.DOT);
    }

    public static float k(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            if (f > f3) {
                return f3;
            }
            return f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + CoreConstants.DOT);
    }

    public static int l(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            if (i > i3) {
                return i3;
            }
            return i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + CoreConstants.DOT);
    }

    public static long m(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            if (j > j3) {
                return j3;
            }
            return j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + CoreConstants.DOT);
    }

    public static d n(int i, int i2) {
        return d.d.a(i, i2, -1);
    }

    public static e o(long j, int i) {
        return e.d.a(j, i, -1L);
    }

    public static d p(d dVar, int i) {
        boolean z;
        z65.h(dVar, "<this>");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        h.a(z, Integer.valueOf(i));
        d.a aVar = d.d;
        int h = dVar.h();
        int k = dVar.k();
        if (dVar.p() <= 0) {
            i = -i;
        }
        return aVar.a(h, k, i);
    }

    public static IntRange q(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return IntRange.e.a();
        }
        return new IntRange(i, i2 - 1);
    }
}
