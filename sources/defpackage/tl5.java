package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: LanguageConfig.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\f\b\u0002\u0010\u0010\u001a\u00060\u0002j\u0002`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00060\u0002j\u0002`\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0013"}, d2 = {"Ltl5;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "language", "Lcom/dodopizza/phonenumber/format/CountryIsoCode;", "countryIsoCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tl5  reason: default package */
/* loaded from: classes4.dex */
public final class tl5 implements Serializable {
    private final String a;
    private final String b;

    public tl5(String str, String str2) {
        z65.h(str, "language");
        z65.h(str2, "countryIsoCode");
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
        if (!(obj instanceof tl5)) {
            return false;
        }
        tl5 tl5Var = (tl5) obj;
        if (z65.c(this.a, tl5Var.a) && z65.c(this.b, tl5Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        if (str != null && str.length() != 0) {
            String str2 = this.b;
            if (str2 != null && str2.length() != 0) {
                String str3 = this.a;
                String str4 = this.b;
                return str3 + "-" + str4;
            }
            return this.a;
        }
        return "";
    }
}
