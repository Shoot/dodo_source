package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: Color.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u001a>\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001a\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a4\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0013\u001a\u00020\n*\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"", "red", "green", "blue", "alpha", "Ljd1;", "colorSpace", "Luc1;", "a", "(FFFFLjd1;)J", "", RemoteMessageConst.Notification.COLOR, "b", "(I)J", "", DateTokenConverter.CONVERTER_KEY, "(J)J", c.a, "(IIII)J", "f", "(J)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: yc1  reason: default package */
/* loaded from: classes.dex */
public final class yc1 {
    public static final long a(float f, float f2, float f3, float f4, jd1 jd1Var) {
        z65.h(jd1Var, "colorSpace");
        float f5 = jd1Var.f(0);
        if (f <= jd1Var.e(0) && f5 <= f) {
            float f6 = jd1Var.f(1);
            if (f2 <= jd1Var.e(1) && f6 <= f2) {
                float f7 = jd1Var.f(2);
                if (f3 <= jd1Var.e(2) && f7 <= f3 && 0.0f <= f4 && f4 <= 1.0f) {
                    if (jd1Var.i()) {
                        return uc1.g(opb.g(opb.g(opb.g((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f))) & 4294967295L) << 32));
                    } else if (jd1Var.c() == 3) {
                        int d = jd1Var.d();
                        if (d != -1) {
                            short a = fz3.a(f);
                            short a2 = fz3.a(f2);
                            short a3 = fz3.a(f3);
                            return uc1.g(opb.g(opb.g(opb.g(opb.g(opb.g(opb.g(opb.g(a2) & 65535) << 32) | opb.g(opb.g(opb.g(a) & 65535) << 48)) | opb.g(opb.g(opb.g(a3) & 65535) << 16)) | opb.g(opb.g(opb.g((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | opb.g(opb.g(d) & 63)));
                        }
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces".toString());
                    } else {
                        throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components".toString());
                    }
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f + ", green = " + f2 + ", blue = " + f3 + ", alpha = " + f4 + " outside the range for " + jd1Var).toString());
    }

    public static final long b(int i) {
        return uc1.g(opb.g(opb.g(i) << 32));
    }

    public static final long c(int i, int i2, int i3, int i4) {
        return b(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final long d(long j) {
        return uc1.g(opb.g(opb.g(opb.g(j) & 4294967295L) << 32));
    }

    public static /* synthetic */ long e(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return c(i, i2, i3, i4);
    }

    public static final int f(long j) {
        return (int) opb.g(uc1.h(j, lf1.a.w()) >>> 32);
    }
}
