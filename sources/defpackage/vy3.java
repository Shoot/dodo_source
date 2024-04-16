package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: ContentScale.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lvy3;", "Lau1;", "Lcna;", "srcSize", "dstSize", "Lfv9;", "a", "(JJ)J", "", "toString", "", "hashCode", "", "other", "", "equals", "", "b", "F", "getValue", "()F", "value", "<init>", "(F)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: vy3  reason: default package */
/* loaded from: classes.dex */
public final class vy3 implements au1 {
    private final float b;

    public vy3(float f) {
        this.b = f;
    }

    @Override // defpackage.au1
    public long a(long j, long j2) {
        float f = this.b;
        return gv9.a(f, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof vy3) && Float.compare(this.b, ((vy3) obj).b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.b);
    }

    public String toString() {
        return "FixedScale(value=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
