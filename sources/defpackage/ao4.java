package defpackage;

import kotlin.Metadata;
/* compiled from: HeightInLinesModifier.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"", "minLines", "maxLines", "", "a", "", "typeface", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ao4  reason: default package */
/* loaded from: classes.dex */
public final class ao4 {
    public static final void a(int i, int i2) {
        if (i > 0 && i2 > 0) {
            if (i <= i2) {
                return;
            }
            throw new IllegalArgumentException(("minLines " + i + " must be less than or equal to maxLines " + i2).toString());
        }
        throw new IllegalArgumentException(("both minLines " + i + " and maxLines " + i2 + " must be greater than zero").toString());
    }
}
