package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: Offset.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"!\u0010\u000b\u001a\u00020\u0006*\u00020\u00038FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\"!\u0010\u000e\u001a\u00020\u0006*\u00020\u00038FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"", "x", "y", "Ls67;", "a", "(FF)J", "", "b", "(J)Z", "isFinite-k-4lQ0M$annotations", "(J)V", "isFinite", c.a, "isSpecified-k-4lQ0M$annotations", "isSpecified", "ui-geometry_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: x67  reason: default package */
/* loaded from: classes.dex */
public final class x67 {
    public static final long a(float f, float f2) {
        return s67.g((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    public static final boolean b(long j) {
        float l = s67.l(j);
        if (!Float.isInfinite(l) && !Float.isNaN(l)) {
            float m = s67.m(j);
            if (!Float.isInfinite(m) && !Float.isNaN(m)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(long j) {
        if (j != s67.b.b()) {
            return true;
        }
        return false;
    }
}
