package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: TextUnit.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0001ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\"!\u0010\u0011\u001a\u00020\f*\u00020\u00048FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\"!\u0010\u0016\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\"!\u0010\u0019\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0013\"!\u0010\u0016\u001a\u00020\u0004*\u00020\u001a8FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c\"!\u0010\u0019\u001a\u00020\u0004*\u00020\u001a8FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"", "value", "Lycb;", MessageAttributes.TYPE, "Lwcb;", "a", "(FJ)J", "", "unitType", "v", "g", "(JF)J", "", "f", "(J)Z", "isUnspecified--R2X_6o$annotations", "(J)V", "isUnspecified", DateTokenConverter.CONVERTER_KEY, "(F)J", "getSp$annotations", "(F)V", "sp", "b", "getEm$annotations", "em", "", e.a, "(I)J", "(I)V", c.a, "ui-unit_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: xcb  reason: default package */
/* loaded from: classes.dex */
public final class xcb {
    public static final long a(float f, long j) {
        return g(j, f);
    }

    public static final long b(float f) {
        return g(8589934592L, f);
    }

    public static final long c(int i) {
        return g(8589934592L, i);
    }

    public static final long d(float f) {
        return g(4294967296L, f);
    }

    public static final long e(int i) {
        return g(4294967296L, i);
    }

    public static final boolean f(long j) {
        if (wcb.f(j) == 0) {
            return true;
        }
        return false;
    }

    public static final long g(long j, float f) {
        return wcb.c(j | (Float.floatToIntBits(f) & 4294967295L));
    }
}
