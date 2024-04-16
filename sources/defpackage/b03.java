package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: Density.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0015"}, d2 = {"Lb03;", "La03;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "F", "getDensity", "()F", "density", "b", "k0", "fontScale", "<init>", "(FF)V", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: b03  reason: default package */
/* loaded from: classes.dex */
final class b03 implements a03 {
    private final float a;
    private final float b;

    public b03(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.a03
    public /* synthetic */ int O(float f) {
        return zz2.a(this, f);
    }

    @Override // defpackage.a03
    public /* synthetic */ float S(long j) {
        return zz2.b(this, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b03)) {
            return false;
        }
        b03 b03Var = (b03) obj;
        if (Float.compare(this.a, b03Var.a) == 0 && Float.compare(this.b, b03Var.b) == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.a03
    public float getDensity() {
        return this.a;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    @Override // defpackage.a03
    public float k0() {
        return this.b;
    }

    @Override // defpackage.a03
    public /* synthetic */ float n0(float f) {
        return zz2.c(this, f);
    }

    public String toString() {
        return "DensityImpl(density=" + this.a + ", fontScale=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // defpackage.a03
    public /* synthetic */ long w0(long j) {
        return zz2.d(this, j);
    }

    @Override // defpackage.a03
    public /* synthetic */ long z(float f) {
        return zz2.e(this, f);
    }
}
