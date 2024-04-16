package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: ExtraInfo.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\t\u0010\u0015¨\u0006\u0019"}, d2 = {"Lbo3;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "isAuthorized", "b", "hasAddresses", c.a, "Ljava/lang/String;", "()Ljava/lang/String;", "noPaymentMethodErrorMessage", "I", "()I", "averageDeliveryTimeMinutes", "<init>", "(ZZLjava/lang/String;I)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bo3  reason: default package */
/* loaded from: classes2.dex */
public final class bo3 {
    private final boolean a;
    private final boolean b;
    private final String c;
    private final int d;

    public bo3(boolean z, boolean z2, String str, int i) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = i;
    }

    public final int a() {
        return this.d;
    }

    public final boolean b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo3)) {
            return false;
        }
        bo3 bo3Var = (bo3) obj;
        if (this.a == bo3Var.a && this.b == bo3Var.b && z65.c(this.c, bo3Var.c) && this.d == bo3Var.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int a = ((a91.a(this.a) * 31) + a91.a(this.b)) * 31;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((a + hashCode) * 31) + this.d;
    }

    public String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        String str = this.c;
        int i = this.d;
        return "ExtraInfo(isAuthorized=" + z + ", hasAddresses=" + z2 + ", noPaymentMethodErrorMessage=" + str + ", averageDeliveryTimeMinutes=" + i + ")";
    }
}
