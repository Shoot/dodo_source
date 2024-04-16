package defpackage;

import kotlin.Metadata;
/* compiled from: MeasureExtensions.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Lrb6;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "unit", "<init>", "(I)V", "feature-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rb6  reason: default package */
/* loaded from: classes.dex */
public final class rb6 {
    private final int a;

    public rb6(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rb6) && this.a == ((rb6) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        int i = this.a;
        return "MeasureResources(unit=" + i + ")";
    }
}
