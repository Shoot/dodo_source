package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.selectionmap.presentation.f;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: DeliveryAddressData.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u001b\u0012\b\b\u0002\u0010!\u001a\u00020\b\u0012\u0006\u0010$\u001a\u00020\b\u0012\b\u0010)\u001a\u0004\u0018\u00010%\u0012\u0006\u0010-\u001a\u00020*¢\u0006\u0004\b.\u0010/J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u000f\u0010\u001eR\u0017\u0010!\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b \u0010\rR\u0017\u0010$\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\rR\u0019\u0010)\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001c\u0010(R\u0017\u0010-\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b#\u0010+\u001a\u0004\b\n\u0010,¨\u00060"}, d2 = {"Lxu2;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", "k", "()Z", "isOnboarding", "b", "j", "isFromSuggestions", "Ldt5;", c.a, "Ldt5;", DateTokenConverter.CONVERTER_KEY, "()Ldt5;", "locality", "Ljava/lang/String;", "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "Le91;", e.a, "Le91;", "()Le91;", "clientDeliveryLocation", "f", "isAddressSelected", "g", "i", "isEmptyCart", "Lcom/dodopizza/order/feature/selectionmap/presentation/f$a;", Image.TYPE_HIGH, "Lcom/dodopizza/order/feature/selectionmap/presentation/f$a;", "()Lcom/dodopizza/order/feature/selectionmap/presentation/f$a;", "locationType", "Lev2;", "Lev2;", "()Lev2;", "addressInfoData", "<init>", "(ZZLdt5;Ljava/lang/String;Le91;ZZLcom/dodopizza/order/feature/selectionmap/presentation/f$a;Lev2;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xu2  reason: default package */
/* loaded from: classes2.dex */
public final class xu2 implements Serializable {
    private final boolean a;
    private final boolean b;
    private final dt5 c;
    private final String d;
    private final e91 e;
    private final boolean f;
    private final boolean g;
    private final f.a h;
    private final ev2 i;

    public xu2(boolean z, boolean z2, dt5 dt5Var, String str, e91 e91Var, boolean z3, boolean z4, f.a aVar, ev2 ev2Var) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(e91Var, "clientDeliveryLocation");
        z65.h(ev2Var, "addressInfoData");
        this.a = z;
        this.b = z2;
        this.c = dt5Var;
        this.d = str;
        this.e = e91Var;
        this.f = z3;
        this.g = z4;
        this.h = aVar;
        this.i = ev2Var;
    }

    public final ev2 a() {
        return this.i;
    }

    public final e91 b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final dt5 d() {
        return this.c;
    }

    public final f.a e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu2)) {
            return false;
        }
        xu2 xu2Var = (xu2) obj;
        if (this.a == xu2Var.a && this.b == xu2Var.b && z65.c(this.c, xu2Var.c) && z65.c(this.d, xu2Var.d) && z65.c(this.e, xu2Var.e) && this.f == xu2Var.f && this.g == xu2Var.g && this.h == xu2Var.h && z65.c(this.i, xu2Var.i)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f;
    }

    public int hashCode() {
        int hashCode;
        int a = ((a91.a(this.a) * 31) + a91.a(this.b)) * 31;
        dt5 dt5Var = this.c;
        int i = 0;
        if (dt5Var == null) {
            hashCode = 0;
        } else {
            hashCode = dt5Var.hashCode();
        }
        int hashCode2 = (((((((((a + hashCode) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + a91.a(this.f)) * 31) + a91.a(this.g)) * 31;
        f.a aVar = this.h;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.i.hashCode();
    }

    public final boolean i() {
        return this.g;
    }

    public final boolean j() {
        return this.b;
    }

    public final boolean k() {
        return this.a;
    }

    public String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        dt5 dt5Var = this.c;
        String str = this.d;
        e91 e91Var = this.e;
        boolean z3 = this.f;
        boolean z4 = this.g;
        f.a aVar = this.h;
        ev2 ev2Var = this.i;
        return "DeliveryAddressData(isOnboarding=" + z + ", isFromSuggestions=" + z2 + ", locality=" + dt5Var + ", countryCode=" + str + ", clientDeliveryLocation=" + e91Var + ", isAddressSelected=" + z3 + ", isEmptyCart=" + z4 + ", locationType=" + aVar + ", addressInfoData=" + ev2Var + ")";
    }
}
