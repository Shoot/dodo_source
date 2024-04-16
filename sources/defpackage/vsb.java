package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UpsaleMeasureInfo.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lvsb;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "measure", "", "b", "F", "()F", "value", "<init>", "(IF)V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: vsb  reason: default package */
/* loaded from: classes.dex */
public final class vsb {
    private final int a;
    private final float b;

    public vsb() {
        this(0, 0.0f, 3, null);
    }

    public final int a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsb)) {
            return false;
        }
        vsb vsbVar = (vsb) obj;
        if (this.a == vsbVar.a && Float.compare(this.b, vsbVar.b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a * 31) + Float.floatToIntBits(this.b);
    }

    public String toString() {
        int i = this.a;
        float f = this.b;
        return "UpsaleMeasureInfo(measure=" + i + ", value=" + f + ")";
    }

    public vsb(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public /* synthetic */ vsb(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f);
    }
}
