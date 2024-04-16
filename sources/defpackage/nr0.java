package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ChangeWorkflowResult.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001f"}, d2 = {"Lnr0;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "Lkl8;", "b", "Lkl8;", "getProductCategory", "()Lkl8;", "productCategory", c.a, "I", "getDoughId", "()I", "doughId", DateTokenConverter.CONVERTER_KEY, "getSizeId", "sizeId", "<init>", "(Ljava/lang/String;Lkl8;II)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nr0  reason: default package */
/* loaded from: classes4.dex */
public final class nr0 implements Serializable {
    private final String a;
    private final kl8 b;
    private final int c;
    private final int d;

    public nr0(String str, kl8 kl8Var, int i, int i2) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(kl8Var, "productCategory");
        this.a = str;
        this.b = kl8Var;
        this.c = i;
        this.d = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr0)) {
            return false;
        }
        nr0 nr0Var = (nr0) obj;
        if (z65.c(this.a, nr0Var.a) && this.b == nr0Var.b && this.c == nr0Var.c && this.d == nr0Var.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        String str = this.a;
        kl8 kl8Var = this.b;
        int i = this.c;
        int i2 = this.d;
        return "CartProductInfo(name=" + str + ", productCategory=" + kl8Var + ", doughId=" + i + ", sizeId=" + i2 + ")";
    }
}
