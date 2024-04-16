package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: HitTestResult.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0083@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0088\u0001\u000f\u0092\u0001\u00020\u000eø\u0001\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lm43;", "", "other", "", "a", "(JJ)I", "", c.a, "(J)F", "distance", "", DateTokenConverter.CONVERTER_KEY, "(J)Z", "isInLayer", "", "packedValue", "b", "(J)J", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: m43  reason: default package */
/* loaded from: classes.dex */
final class m43 {
    public static final int a(long j, long j2) {
        boolean d = d(j);
        if (d != d(j2)) {
            if (d) {
                return -1;
            }
            return 1;
        }
        return (int) Math.signum(c(j) - c(j2));
    }

    public static final float c(long j) {
        gz3 gz3Var = gz3.a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean d(long j) {
        if (((int) (j & 4294967295L)) != 0) {
            return true;
        }
        return false;
    }

    public static long b(long j) {
        return j;
    }
}
