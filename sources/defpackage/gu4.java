package defpackage;

import kotlin.Metadata;
/* compiled from: ImageBitmap.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"", "width", "height", "Lfu4;", "config", "", "hasAlpha", "Ljd1;", "colorSpace", "Leu4;", "a", "(IIIZLjd1;)Leu4;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: gu4  reason: default package */
/* loaded from: classes.dex */
public final class gu4 {
    public static final eu4 a(int i, int i2, int i3, boolean z, jd1 jd1Var) {
        z65.h(jd1Var, "colorSpace");
        return bh.a(i, i2, i3, z, jd1Var);
    }

    public static /* synthetic */ eu4 b(int i, int i2, int i3, boolean z, jd1 jd1Var, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = fu4.a.b();
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        if ((i4 & 16) != 0) {
            jd1Var = lf1.a.w();
        }
        return a(i, i2, i3, z, jd1Var);
    }
}
