package defpackage;

import kotlin.Metadata;
/* compiled from: LimitedDispatcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"", "", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: up5  reason: default package */
/* loaded from: classes3.dex */
public final class up5 {
    public static final void a(int i) {
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i).toString());
    }
}
