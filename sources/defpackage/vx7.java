package defpackage;

import kotlin.Metadata;
/* compiled from: CornerSize.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lvx7;", "Lex1;", "", "Lcna;", "shapeSize", "La03;", "density", "", "a", "(JLa03;)F", "", "toString", "", "hashCode", "other", "", "equals", "F", "percent", "<init>", "(F)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: vx7  reason: default package */
/* loaded from: classes.dex */
final class vx7 implements ex1 {
    private final float a;

    public vx7(float f) {
        this.a = f;
        if (f >= 0.0f && f <= 100.0f) {
            return;
        }
        throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
    }

    @Override // defpackage.ex1
    public float a(long j, a03 a03Var) {
        z65.h(a03Var, "density");
        return cna.h(j) * (this.a / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof vx7) && Float.compare(this.a, ((vx7) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
