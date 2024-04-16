package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: MinimumDeliveryAnalytics.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0013\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lnl6;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getPartnerMinimumDeliveryPrice", "()Ljava/lang/String;", "partnerMinimumDeliveryPrice", "b", "getDynamicMinimumDeliveryPrice", "dynamicMinimumDeliveryPrice", "", c.a, "Ljava/util/Map;", "getAdditionalData", "()Ljava/util/Map;", "additionalData", "Lqd;", DateTokenConverter.CONVERTER_KEY, "Lqd;", "getSender", "()Lqd;", "sender", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lqd;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nl6  reason: default package */
/* loaded from: classes4.dex */
public final class nl6 implements dc {
    private final String a;
    private final String b;
    private final Map<String, String> c;
    private final qd d;

    public nl6(String str, String str2, Map<String, String> map, qd qdVar) {
        z65.h(str, "partnerMinimumDeliveryPrice");
        z65.h(str2, "dynamicMinimumDeliveryPrice");
        z65.h(map, "additionalData");
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = qdVar;
    }

    @Override // defpackage.dc
    public qc a() {
        return vc.z(bc.e(bc.e(bc.e(new bc("minimum_delivery_price_shown"), "partnerMinimumDeliveryPrice", this.a, false, 4, null), "dynamicMinimumDeliveryPrice", this.b, false, 4, null), "additional_data", this.c, false, 4, null), this.d).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl6)) {
            return false;
        }
        nl6 nl6Var = (nl6) obj;
        if (z65.c(this.a, nl6Var.a) && z65.c(this.b, nl6Var.b) && z65.c(this.c, nl6Var.c) && z65.c(this.d, nl6Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        qd qdVar = this.d;
        if (qdVar == null) {
            hashCode = 0;
        } else {
            hashCode = qdVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        Map<String, String> map = this.c;
        qd qdVar = this.d;
        return "ShowMinimumDeliveryPricerEvent(partnerMinimumDeliveryPrice=" + str + ", dynamicMinimumDeliveryPrice=" + str2 + ", additionalData=" + map + ", sender=" + qdVar + ")";
    }
}
