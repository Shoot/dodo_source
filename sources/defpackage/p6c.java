package defpackage;

import kotlin.Metadata;
/* compiled from: WithSuggestedField.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\r\u001a\u00028\u0000\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\r\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lp6c;", "T", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "element", "b", "Z", "()Z", "suggested", "<init>", "(Ljava/lang/Object;Z)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: p6c  reason: default package */
/* loaded from: classes.dex */
public final class p6c<T> {
    private final T a;
    private final boolean b;

    public p6c(T t, boolean z) {
        this.a = t;
        this.b = z;
    }

    public final T a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6c)) {
            return false;
        }
        p6c p6cVar = (p6c) obj;
        if (z65.c(this.a, p6cVar.a) && this.b == p6cVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        T t = this.a;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        return (hashCode * 31) + a91.a(this.b);
    }

    public String toString() {
        T t = this.a;
        boolean z = this.b;
        return "WithSuggestedField(element=" + t + ", suggested=" + z + ")";
    }
}
