package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: DeliveryAddressListData.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\n\u0010\u0018\u001a\u00060\u0002j\u0002`\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u0019\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010&\u001a\u00020\"¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00060\u0002j\u0002`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b\u0015\u0010 R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\n\u0010%¨\u0006)"}, d2 = {"Liv2;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "I", "getResultId", "()I", "resultId", "b", "Z", e.a, "()Z", "isEmptyCart", "Lru/dodopizza/app/domain/country/models/CountryCode;", c.a, "Ljava/lang/String;", "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "Ljk7;", DateTokenConverter.CONVERTER_KEY, "Ljk7;", "()Ljk7;", "currentOrderType", "Ldt5;", "Ldt5;", "()Ldt5;", "currentLocality", "Lck1;", "f", "Lck1;", "()Lck1;", "commonSender", "<init>", "(IZLjava/lang/String;Ljk7;Ldt5;Lck1;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: iv2  reason: default package */
/* loaded from: classes2.dex */
public final class iv2 implements Serializable {
    private final int a;
    private final boolean b;
    private final String c;
    private final jk7 d;
    private final dt5 e;
    private final ck1 f;

    public iv2(int i, boolean z, String str, jk7 jk7Var, dt5 dt5Var, ck1 ck1Var) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(jk7Var, "currentOrderType");
        z65.h(ck1Var, "commonSender");
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = jk7Var;
        this.e = dt5Var;
        this.f = ck1Var;
    }

    public final ck1 a() {
        return this.f;
    }

    public final String b() {
        return this.c;
    }

    public final dt5 c() {
        return this.e;
    }

    public final jk7 d() {
        return this.d;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv2)) {
            return false;
        }
        iv2 iv2Var = (iv2) obj;
        if (this.a == iv2Var.a && this.b == iv2Var.b && z65.c(this.c, iv2Var.c) && this.d == iv2Var.d && z65.c(this.e, iv2Var.e) && this.f == iv2Var.f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int a = ((((((this.a * 31) + a91.a(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        dt5 dt5Var = this.e;
        if (dt5Var == null) {
            hashCode = 0;
        } else {
            hashCode = dt5Var.hashCode();
        }
        return ((a + hashCode) * 31) + this.f.hashCode();
    }

    public String toString() {
        int i = this.a;
        boolean z = this.b;
        String str = this.c;
        jk7 jk7Var = this.d;
        dt5 dt5Var = this.e;
        ck1 ck1Var = this.f;
        return "DeliveryAddressListData(resultId=" + i + ", isEmptyCart=" + z + ", countryCode=" + str + ", currentOrderType=" + jk7Var + ", currentLocality=" + dt5Var + ", commonSender=" + ck1Var + ")";
    }
}
