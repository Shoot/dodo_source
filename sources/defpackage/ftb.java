package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UpsaleSizeDetailsVO.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u0017\u0010\u001f\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0013\u0010\u001e¨\u0006\""}, d2 = {"Lftb;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "setDoughTypeId", "(Ljava/lang/Integer;)V", "doughTypeId", "b", DateTokenConverter.CONVERTER_KEY, "setSizeGroupId", "sizeGroupId", c.a, "Ljava/lang/String;", "()Ljava/lang/String;", "setDoughTypeName", "(Ljava/lang/String;)V", "doughTypeName", e.a, "setSizeGroupName", "sizeGroupName", "Lkm8;", "Lkm8;", "()Lkm8;", "productSize", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkm8;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ftb  reason: default package */
/* loaded from: classes2.dex */
public final class ftb {
    private Integer a;
    private Integer b;
    private String c;
    private String d;
    private final km8 e;

    public ftb() {
        this(null, null, null, null, null, 31, null);
    }

    public final Integer a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final km8 c() {
        return this.e;
    }

    public final Integer d() {
        return this.b;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftb)) {
            return false;
        }
        ftb ftbVar = (ftb) obj;
        if (z65.c(this.a, ftbVar.a) && z65.c(this.b, ftbVar.b) && z65.c(this.c, ftbVar.c) && z65.c(this.d, ftbVar.d) && z65.c(this.e, ftbVar.e)) {
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
        Integer num2 = this.b;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.c;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
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
        Integer num2 = this.b;
        String str = this.c;
        String str2 = this.d;
        km8 km8Var = this.e;
        return "UpsaleSizeDetailsVO(doughTypeId=" + num + ", sizeGroupId=" + num2 + ", doughTypeName=" + str + ", sizeGroupName=" + str2 + ", productSize=" + km8Var + ")";
    }

    public ftb(Integer num, Integer num2, String str, String str2, km8 km8Var) {
        z65.h(km8Var, "productSize");
        this.a = num;
        this.b = num2;
        this.c = str;
        this.d = str2;
        this.e = km8Var;
    }

    public /* synthetic */ ftb(Integer num, Integer num2, String str, String str2, km8 km8Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? new km8(null, null, 3, null) : km8Var);
    }
}
