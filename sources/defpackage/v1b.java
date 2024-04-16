package defpackage;

import kotlin.Metadata;
/* compiled from: SuggestedTips.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Lv1b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "amount", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "predefinedUrl", "<init>", "(ILjava/lang/String;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: v1b  reason: default package */
/* loaded from: classes.dex */
public final class v1b {
    private final int a;
    private final String b;

    public v1b(int i, String str) {
        z65.h(str, "predefinedUrl");
        this.a = i;
        this.b = str;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1b)) {
            return false;
        }
        v1b v1bVar = (v1b) obj;
        if (this.a == v1bVar.a && z65.c(this.b, v1bVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        return "SuggestedTips(amount=" + i + ", predefinedUrl=" + str + ")";
    }
}
