package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: SelectCountryData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Ln4a;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", "b", "()Z", "isFirstAppStart", "Ljava/lang/String;", "()Ljava/lang/String;", "deviceLocalityCode", "<init>", "(ZLjava/lang/String;)V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: n4a  reason: default package */
/* loaded from: classes2.dex */
public final class n4a implements Serializable {
    private final boolean a;
    private final String b;

    public n4a(boolean z, String str) {
        z65.h(str, "deviceLocalityCode");
        this.a = z;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4a)) {
            return false;
        }
        n4a n4aVar = (n4a) obj;
        if (this.a == n4aVar.a && z65.c(this.b, n4aVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (a91.a(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        boolean z = this.a;
        String str = this.b;
        return "SelectCountryData(isFirstAppStart=" + z + ", deviceLocalityCode=" + str + ")";
    }
}
