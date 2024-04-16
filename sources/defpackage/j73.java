package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CornerSize.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0011ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u001d\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0012\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0016"}, d2 = {"Lj73;", "Lex1;", "", "Lcna;", "shapeSize", "La03;", "density", "", "a", "(JLa03;)F", "", "toString", "", "hashCode", "other", "", "equals", "Li73;", "F", "size", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: j73  reason: default package */
/* loaded from: classes.dex */
final class j73 implements ex1 {
    private final float a;

    public /* synthetic */ j73(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    @Override // defpackage.ex1
    public float a(long j, a03 a03Var) {
        z65.h(a03Var, "density");
        return a03Var.n0(this.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j73) && i73.q(this.a, ((j73) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return i73.s(this.a);
    }

    public String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }

    private j73(float f) {
        this.a = f;
    }
}
