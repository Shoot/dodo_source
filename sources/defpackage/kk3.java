package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: ReferralCodeApplyingInfo.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\n\u0010\u0016¨\u0006\u001a"}, d2 = {"Lkk3;", "Lja9;", "", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "countryName", c.a, DateTokenConverter.CONVERTER_KEY, "errorMessage", "errorDescription", "Lka9;", e.a, "Lka9;", "()Lka9;", "errorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lka9;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: kk3  reason: default package */
/* loaded from: classes4.dex */
public final class kk3 extends ja9 {
    private final String b;
    private final String c;
    private final String d;
    private final ka9 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk3(String str, String str2, String str3, ka9 ka9Var) {
        super(jb9.c, null);
        z65.h(str, "countryName");
        z65.h(str2, "errorMessage");
        z65.h(str3, "errorDescription");
        z65.h(ka9Var, "errorCode");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = ka9Var;
    }

    public final String a() {
        return this.b;
    }

    public final ka9 b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk3)) {
            return false;
        }
        kk3 kk3Var = (kk3) obj;
        if (z65.c(this.b, kk3Var.b) && z65.c(this.c, kk3Var.c) && z65.c(this.d, kk3Var.d) && this.e == kk3Var.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        ka9 ka9Var = this.e;
        return "ErrorReferralCodeApplyingInfo(countryName=" + str + ", errorMessage=" + str2 + ", errorDescription=" + str3 + ", errorCode=" + ka9Var + ")";
    }
}
