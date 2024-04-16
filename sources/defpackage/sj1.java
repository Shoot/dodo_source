package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: CommonData.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\n\u0010\u0013\u001a\u00060\u0002j\u0002`\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00060\u0002j\u0002`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lsj1;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", c.a, "()Z", "isEmptyCart", "Lru/dodopizza/app/domain/country/models/CountryCode;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "Ldt5;", "Ldt5;", "()Ldt5;", "currentLocality", "Lck1;", DateTokenConverter.CONVERTER_KEY, "Lck1;", "getCommonSender", "()Lck1;", "commonSender", "<init>", "(ZLjava/lang/String;Ldt5;Lck1;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sj1  reason: default package */
/* loaded from: classes2.dex */
public final class sj1 implements Serializable {
    private final boolean a;
    private final String b;
    private final dt5 c;
    private final ck1 d;

    public sj1(boolean z, String str, dt5 dt5Var, ck1 ck1Var) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(ck1Var, "commonSender");
        this.a = z;
        this.b = str;
        this.c = dt5Var;
        this.d = ck1Var;
    }

    public final String a() {
        return this.b;
    }

    public final dt5 b() {
        return this.c;
    }

    public final boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj1)) {
            return false;
        }
        sj1 sj1Var = (sj1) obj;
        if (this.a == sj1Var.a && z65.c(this.b, sj1Var.b) && z65.c(this.c, sj1Var.c) && this.d == sj1Var.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int a = ((a91.a(this.a) * 31) + this.b.hashCode()) * 31;
        dt5 dt5Var = this.c;
        if (dt5Var == null) {
            hashCode = 0;
        } else {
            hashCode = dt5Var.hashCode();
        }
        return ((a + hashCode) * 31) + this.d.hashCode();
    }

    public String toString() {
        boolean z = this.a;
        String str = this.b;
        dt5 dt5Var = this.c;
        ck1 ck1Var = this.d;
        return "CommonData(isEmptyCart=" + z + ", countryCode=" + str + ", currentLocality=" + dt5Var + ", commonSender=" + ck1Var + ")";
    }
}
