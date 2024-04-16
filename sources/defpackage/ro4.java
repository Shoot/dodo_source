package defpackage;

import kotlin.Metadata;
/* compiled from: HitTestResult.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"", "distance", "", "isInLayer", "Lm43;", "a", "(FZ)J", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ro4  reason: default package */
/* loaded from: classes.dex */
public final class ro4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long a(float f, boolean z) {
        long j;
        long floatToIntBits = Float.floatToIntBits(f);
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        return m43.b((j & 4294967295L) | (floatToIntBits << 32));
    }
}
