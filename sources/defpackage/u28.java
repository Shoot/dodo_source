package defpackage;

import kotlin.Metadata;
/* compiled from: PhoneInput.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0014"}, d2 = {"Lu28;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "phone", "Lj28;", "Lj28;", "()Lj28;", "format", "<init>", "(Ljava/lang/String;Lj28;)V", "phonenumber"}, k = 1, mv = {1, 9, 0})
/* renamed from: u28  reason: default package */
/* loaded from: classes2.dex */
public final class u28 {
    private final String a;
    private final j28 b;

    public u28(String str, j28 j28Var) {
        z65.h(str, "phone");
        z65.h(j28Var, "format");
        this.a = str;
        this.b = j28Var;
    }

    public final j28 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u28)) {
            return false;
        }
        u28 u28Var = (u28) obj;
        if (z65.c(this.a, u28Var.a) && z65.c(this.b, u28Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        j28 j28Var = this.b;
        return "PhoneInput(phone=" + str + ", format=" + j28Var + ")";
    }
}
