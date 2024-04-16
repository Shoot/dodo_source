package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: LocalityListData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lut5;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "b", "I", "()I", "resultCode", "<init>", "(Ljava/lang/String;I)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ut5  reason: default package */
/* loaded from: classes4.dex */
public final class ut5 implements Serializable {
    private final String a;
    private final int b;

    public ut5(String str, int i) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut5)) {
            return false;
        }
        ut5 ut5Var = (ut5) obj;
        if (z65.c(this.a, ut5Var.a) && this.b == ut5Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public String toString() {
        String str = this.a;
        int i = this.b;
        return "LocalityListData(countryCode=" + str + ", resultCode=" + i + ")";
    }
}
