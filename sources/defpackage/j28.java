package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: PhoneFormat.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u000f\u001a\u00060\u0002j\u0002`\n\u0012\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001b\u0010\u000f\u001a\u00060\u0002j\u0002`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00060\u0002j\u0002`\u00108\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u000e¨\u0006\u0014"}, d2 = {"Lj28;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/dodopizza/phonenumber/format/InternationalPhonePrefix;", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "internationalPrefix", "Lcom/dodopizza/phonenumber/format/CountryIsoCode;", "countryIsoName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "phonenumber"}, k = 1, mv = {1, 9, 0})
/* renamed from: j28  reason: default package */
/* loaded from: classes2.dex */
public final class j28 implements Serializable {
    private final String a;
    private final String b;

    public j28(String str, String str2) {
        z65.h(str, "internationalPrefix");
        z65.h(str2, "countryIsoName");
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
        if (!(obj instanceof j28)) {
            return false;
        }
        j28 j28Var = (j28) obj;
        if (z65.c(this.a, j28Var.a) && z65.c(this.b, j28Var.b)) {
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
        return "PhoneFormat(internationalPrefix=" + str + ", countryIsoName=" + str2 + ")";
    }
}
