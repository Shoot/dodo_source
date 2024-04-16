package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UpsaleSizeDetails.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\rR$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013R\"\u0010!\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Letb;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "setDoughTypeId", "(Ljava/lang/Integer;)V", "doughTypeId", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "setDoughTypeName", "(Ljava/lang/String;)V", "doughTypeName", c.a, DateTokenConverter.CONVERTER_KEY, "setSizeGroupId", "sizeGroupId", e.a, "setSizeGroupName", "sizeGroupName", "Lvsb;", "Lvsb;", "()Lvsb;", "setMeasureInfo", "(Lvsb;)V", "measureInfo", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lvsb;)V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: etb  reason: default package */
/* loaded from: classes.dex */
public final class etb {
    private Integer a;
    private String b;
    private Integer c;
    private String d;
    private vsb e;

    public etb() {
        this(null, null, null, null, null, 31, null);
    }

    public final Integer a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final vsb c() {
        return this.e;
    }

    public final Integer d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etb)) {
            return false;
        }
        etb etbVar = (etb) obj;
        if (z65.c(this.a, etbVar.a) && z65.c(this.b, etbVar.b) && z65.c(this.c, etbVar.c) && z65.c(this.d, etbVar.d) && z65.c(this.e, etbVar.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Integer num = this.a;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num2 = this.c;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((i4 + i) * 31) + this.e.hashCode();
    }

    public String toString() {
        Integer num = this.a;
        String str = this.b;
        Integer num2 = this.c;
        String str2 = this.d;
        vsb vsbVar = this.e;
        return "UpsaleSizeDetails(doughTypeId=" + num + ", doughTypeName=" + str + ", sizeGroupId=" + num2 + ", sizeGroupName=" + str2 + ", measureInfo=" + vsbVar + ")";
    }

    public etb(Integer num, String str, Integer num2, String str2, vsb vsbVar) {
        z65.h(vsbVar, "measureInfo");
        this.a = num;
        this.b = str;
        this.c = num2;
        this.d = str2;
        this.e = vsbVar;
    }

    public /* synthetic */ etb(Integer num, String str, Integer num2, String str2, vsb vsbVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? new vsb(0, 0.0f, 3, null) : vsbVar);
    }
}
