package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: PizzaProductCardVO.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0017"}, d2 = {"Lfxb;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", c.a, "()I", "sizeId", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "sizeName", "doughId", "doughName", "<init>", "(ILjava/lang/String;ILjava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fxb  reason: default package */
/* loaded from: classes2.dex */
public final class fxb {
    private final int a;
    private final String b;
    private final int c;
    private final String d;

    public fxb(int i, String str, int i2, String str2) {
        z65.h(str, "sizeName");
        z65.h(str2, "doughName");
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
    }

    public final int a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final int c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxb)) {
            return false;
        }
        fxb fxbVar = (fxb) obj;
        if (this.a == fxbVar.a && z65.c(this.b, fxbVar.b) && this.c == fxbVar.c && z65.c(this.d, fxbVar.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        int i2 = this.c;
        String str2 = this.d;
        return "VariationVO(sizeId=" + i + ", sizeName=" + str + ", doughId=" + i2 + ", doughName=" + str2 + ")";
    }
}
