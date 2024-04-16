package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PizzeriaSuggestionData.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010#\u001a\u00020\b\u0012\b\b\u0002\u0010%\u001a\u00020\b¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0014\u0010\u001eR\u0017\u0010#\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u0017\u0010%\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b \u0010\"¨\u0006("}, d2 = {"Li98;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ldt5;", "a", "Ldt5;", DateTokenConverter.CONVERTER_KEY, "()Ldt5;", "locality", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "address", c.a, LocalityEntity.FIELD_COUNTRY_CODE, "Lnaa;", "Lnaa;", "i", "()Lnaa;", MessageAttributes.TYPE, "Lhn3;", e.a, "Lhn3;", "()Lhn3;", "expectedPizzeriaType", "f", "Z", "()Z", "requestUserLocationOnStart", "g", "showToolbar", "<init>", "(Ldt5;Ljava/lang/String;Ljava/lang/String;Lnaa;Lhn3;ZZ)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: i98  reason: default package */
/* loaded from: classes2.dex */
public final class i98 implements Serializable {
    private final dt5 a;
    private final String b;
    private final String c;
    private final naa d;
    private final hn3 e;
    private final boolean f;
    private final boolean g;

    public i98(dt5 dt5Var, String str, String str2, naa naaVar, hn3 hn3Var, boolean z, boolean z2) {
        z65.h(str, "address");
        z65.h(str2, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(naaVar, MessageAttributes.TYPE);
        this.a = dt5Var;
        this.b = str;
        this.c = str2;
        this.d = naaVar;
        this.e = hn3Var;
        this.f = z;
        this.g = z2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final hn3 c() {
        return this.e;
    }

    public final dt5 d() {
        return this.a;
    }

    public final boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i98)) {
            return false;
        }
        i98 i98Var = (i98) obj;
        if (z65.c(this.a, i98Var.a) && z65.c(this.b, i98Var.b) && z65.c(this.c, i98Var.c) && this.d == i98Var.d && this.e == i98Var.e && this.f == i98Var.f && this.g == i98Var.g) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.g;
    }

    public int hashCode() {
        int hashCode;
        dt5 dt5Var = this.a;
        int i = 0;
        if (dt5Var == null) {
            hashCode = 0;
        } else {
            hashCode = dt5Var.hashCode();
        }
        int hashCode2 = ((((((hashCode * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        hn3 hn3Var = this.e;
        if (hn3Var != null) {
            i = hn3Var.hashCode();
        }
        return ((((hashCode2 + i) * 31) + a91.a(this.f)) * 31) + a91.a(this.g);
    }

    public final naa i() {
        return this.d;
    }

    public String toString() {
        dt5 dt5Var = this.a;
        String str = this.b;
        String str2 = this.c;
        naa naaVar = this.d;
        hn3 hn3Var = this.e;
        boolean z = this.f;
        boolean z2 = this.g;
        return "PizzeriaSuggestionData(locality=" + dt5Var + ", address=" + str + ", countryCode=" + str2 + ", type=" + naaVar + ", expectedPizzeriaType=" + hn3Var + ", requestUserLocationOnStart=" + z + ", showToolbar=" + z2 + ")";
    }

    public /* synthetic */ i98(dt5 dt5Var, String str, String str2, naa naaVar, hn3 hn3Var, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dt5Var, str, str2, naaVar, (i & 16) != 0 ? null : hn3Var, (i & 32) != 0 ? false : z, (i & 64) != 0 ? true : z2);
    }
}
