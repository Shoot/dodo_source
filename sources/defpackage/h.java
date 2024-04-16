package defpackage;

import kotlin.Metadata;
/* compiled from: SegmentedByteString.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¨\u0006\t"}, d2 = {"", "", "value", "fromIndex", "toIndex", "a", "Ld4a;", "pos", "b", "okio"}, k = 2, mv = {1, 9, 0})
/* renamed from: h  reason: default package */
/* loaded from: classes3.dex */
public final class h {
    public static final int a(int[] iArr, int i, int i2, int i3) {
        z65.h(iArr, "<this>");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 > i) {
                i4 = i5 - 1;
            } else {
                return i5;
            }
        }
        return (-i2) - 1;
    }

    public static final int b(d4a d4aVar, int i) {
        z65.h(d4aVar, "<this>");
        int a = a(d4aVar.F0(), i + 1, 0, d4aVar.I0().length);
        if (a < 0) {
            return ~a;
        }
        return a;
    }
}
