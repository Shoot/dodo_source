package defpackage;

import kotlin.Metadata;
/* compiled from: ScaleFactor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"", "scaleX", "scaleY", "Lfv9;", "a", "(FF)J", "Lcna;", "scaleFactor", "b", "(JJ)J", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: gv9  reason: default package */
/* loaded from: classes.dex */
public final class gv9 {
    public static final long a(float f, float f2) {
        return fv9.a((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    public static final long b(long j, long j2) {
        return ina.a(cna.i(j) * fv9.b(j2), cna.g(j) * fv9.c(j2));
    }
}
