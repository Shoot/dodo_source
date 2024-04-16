package defpackage;

import kotlin.Metadata;
/* compiled from: ContainerHelpers.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\"\u0014\u0010\u0006\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"", "", "size", "value", "a", "[I", "EMPTY_INTS", "", "", "b", "[Ljava/lang/Object;", "EMPTY_OBJECTS", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: bt1  reason: default package */
/* loaded from: classes.dex */
public final class bt1 {
    public static final int[] a = new int[0];
    public static final Object[] b = new Object[0];

    public static final int a(int[] iArr, int i, int i2) {
        z65.h(iArr, "<this>");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 > i2) {
                i3 = i5 - 1;
            } else {
                return i5;
            }
        }
        return ~i4;
    }
}
