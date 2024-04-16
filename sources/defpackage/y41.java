package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: CheckoutState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\b\u0012\u0006\u0010#\u001a\u00020\b¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u0013\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\"\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\rR\u0017\u0010#\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u0017\u0010\r¨\u0006&"}, d2 = {"Ly41;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", c.a, "()Z", "hasAddresses", "b", "containsGoods", "f", "isCashChangeEnabled", DateTokenConverter.CONVERTER_KEY, "I", "()I", "expectedMinutesToReceiveForASAP", e.a, "j", "isShortStreetNameEnabled", "Ljava/lang/String;", "()Ljava/lang/String;", "paymentMethodsWarning", "g", "i", "isGoodsIncludedIntoMinDeliveryPrice", Image.TYPE_HIGH, "k", "isVpnWarningEnabled", "unknownErrorContainsFeedbackEmail", "<init>", "(ZZZIZLjava/lang/String;ZZZ)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: y41  reason: default package */
/* loaded from: classes4.dex */
public final class y41 implements Serializable {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final boolean e;
    private final String f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    public y41(boolean z, boolean z2, boolean z3, int i, boolean z4, String str, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = z4;
        this.f = str;
        this.g = z5;
        this.h = z6;
        this.i = z7;
    }

    public final boolean a() {
        return this.b;
    }

    public final int b() {
        return this.d;
    }

    public final boolean c() {
        return this.a;
    }

    public final String d() {
        return this.f;
    }

    public final boolean e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y41)) {
            return false;
        }
        y41 y41Var = (y41) obj;
        if (this.a == y41Var.a && this.b == y41Var.b && this.c == y41Var.c && this.d == y41Var.d && this.e == y41Var.e && z65.c(this.f, y41Var.f) && this.g == y41Var.g && this.h == y41Var.h && this.i == y41Var.i) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.c;
    }

    public int hashCode() {
        int hashCode;
        int a = ((((((((a91.a(this.a) * 31) + a91.a(this.b)) * 31) + a91.a(this.c)) * 31) + this.d) * 31) + a91.a(this.e)) * 31;
        String str = this.f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((a + hashCode) * 31) + a91.a(this.g)) * 31) + a91.a(this.h)) * 31) + a91.a(this.i);
    }

    public final boolean i() {
        return this.g;
    }

    public final boolean j() {
        return this.e;
    }

    public final boolean k() {
        return this.h;
    }

    public String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        int i = this.d;
        boolean z4 = this.e;
        String str = this.f;
        boolean z5 = this.g;
        boolean z6 = this.h;
        boolean z7 = this.i;
        return "CheckoutExtraInfo(hasAddresses=" + z + ", containsGoods=" + z2 + ", isCashChangeEnabled=" + z3 + ", expectedMinutesToReceiveForASAP=" + i + ", isShortStreetNameEnabled=" + z4 + ", paymentMethodsWarning=" + str + ", isGoodsIncludedIntoMinDeliveryPrice=" + z5 + ", isVpnWarningEnabled=" + z6 + ", unknownErrorContainsFeedbackEmail=" + z7 + ")";
    }
}
