package defpackage;

import kotlin.Metadata;
/* compiled from: Toggle.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lwhb;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "b", "Z", "()Z", "setEnabled", "(Z)V", "isEnabled", "<init>", "(Ljava/lang/String;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: whb  reason: default package */
/* loaded from: classes4.dex */
public final class whb {
    private final String a;
    private boolean b;

    public whb(String str, boolean z) {
        z65.h(str, "code");
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whb)) {
            return false;
        }
        whb whbVar = (whb) obj;
        if (z65.c(this.a, whbVar.a) && this.b == whbVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + a91.a(this.b);
    }

    public String toString() {
        String str = this.a;
        boolean z = this.b;
        return "Toggle(code=" + str + ", isEnabled=" + z + ")";
    }
}
