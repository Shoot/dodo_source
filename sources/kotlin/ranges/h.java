package kotlin.ranges;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Ranges.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\u0002\u001a\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¨\u0006\n"}, d2 = {"", "that", "Lca1;", "b", "", "isPositive", "", "step", "", "a", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/ranges/RangesKt")
/* loaded from: classes3.dex */
public class h {
    public static final void a(boolean z, Number number) {
        z65.h(number, "step");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + CoreConstants.DOT);
    }

    public static ca1<Float> b(float f, float f2) {
        return new c(f, f2);
    }
}
