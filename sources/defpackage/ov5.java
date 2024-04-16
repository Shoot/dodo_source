package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Location.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001c"}, d2 = {"Lov5;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "D", "b", "()D", "latitude", c.a, "longitude", "", "Ljava/lang/Float;", "()Ljava/lang/Float;", "accuracy", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "()Ljava/lang/String;", "timestamp", "<init>", "(DDLjava/lang/Float;Ljava/lang/String;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ov5  reason: default package */
/* loaded from: classes4.dex */
public final class ov5 implements Serializable {
    private final double a;
    private final double b;
    private final Float c;
    private final String d;

    public ov5(double d, double d2, Float f, String str) {
        this.a = d;
        this.b = d2;
        this.c = f;
        this.d = str;
    }

    public final Float a() {
        return this.c;
    }

    public final double b() {
        return this.a;
    }

    public final double c() {
        return this.b;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov5)) {
            return false;
        }
        ov5 ov5Var = (ov5) obj;
        if (Double.compare(this.a, ov5Var.a) == 0 && Double.compare(this.b, ov5Var.b) == 0 && z65.c(this.c, ov5Var.c) && z65.c(this.d, ov5Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int a = ((nkb.a(this.a) * 31) + nkb.a(this.b)) * 31;
        Float f = this.c;
        int i = 0;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        double d = this.a;
        double d2 = this.b;
        Float f = this.c;
        String str = this.d;
        return "Location(latitude=" + d + ", longitude=" + d2 + ", accuracy=" + f + ", timestamp=" + str + ")";
    }

    public /* synthetic */ ov5(double d, double d2, Float f, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : str);
    }
}
