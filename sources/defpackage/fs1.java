package defpackage;

import kotlin.Metadata;
import kotlin.ranges.IntRange;
/* compiled from: ContactMeSwitchVisibilityResolver.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lfs1;", "", "", "ratingValue", "", "isAnyTagSelected", "arePhotosAttached", "isCommentFilled", "a", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fs1  reason: default package */
/* loaded from: classes.dex */
public final class fs1 {
    public final boolean a(int i, boolean z, boolean z2, boolean z3) {
        IntRange intRange;
        intRange = gs1.a;
        int h = intRange.h();
        if (i <= intRange.k() && h <= i) {
            return true;
        }
        if (i != 5 && i == 4 && (z || z2 || z3)) {
            return true;
        }
        return false;
    }
}
