package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: RotaryScrollEvent.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lfo9;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "a", "F", "getVerticalScrollPixels", "()F", "verticalScrollPixels", "b", "getHorizontalScrollPixels", "horizontalScrollPixels", "", c.a, "J", "getUptimeMillis", "()J", "uptimeMillis", "<init>", "(FFJ)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: fo9  reason: default package */
/* loaded from: classes.dex */
public final class fo9 {
    private final float a;
    private final float b;
    private final long c;

    public fo9(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof fo9) {
            fo9 fo9Var = (fo9) obj;
            if (fo9Var.a == this.a && fo9Var.b == this.b && fo9Var.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + ax1.a(this.c);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.a + ",horizontalScrollPixels=" + this.b + ",uptimeMillis=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
