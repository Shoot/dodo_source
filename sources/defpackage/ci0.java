package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ReferralCodeStatus.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u000e¨\u0006\u0013"}, d2 = {"Lci0;", "Lla9;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "errorTitle", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ci0  reason: default package */
/* loaded from: classes2.dex */
public final class ci0 extends la9 implements Serializable {
    private final String a;
    private final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci0(String str, String str2) {
        super(null);
        z65.h(str, "errorTitle");
        z65.h(str2, "errorMessage");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci0)) {
            return false;
        }
        ci0 ci0Var = (ci0) obj;
        if (z65.c(this.a, ci0Var.a) && z65.c(this.b, ci0Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        return "BusinessReferralCodeStatus(errorTitle=" + str + ", errorMessage=" + str2 + ")";
    }
}
