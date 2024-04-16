package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ProductIngredient.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001a"}, d2 = {"Lul8;", "Ljava/io/Serializable;", "", "id", "parentId", Action.NAME_ATTRIBUTE, "", "removable", "a", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", c.a, "getName", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: ul8  reason: default package */
/* loaded from: classes.dex */
public final class ul8 implements Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;

    public ul8(String str, String str2, String str3, boolean z) {
        z65.h(str, "id");
        z65.h(str2, "parentId");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public static /* synthetic */ ul8 b(ul8 ul8Var, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ul8Var.a;
        }
        if ((i & 2) != 0) {
            str2 = ul8Var.b;
        }
        if ((i & 4) != 0) {
            str3 = ul8Var.c;
        }
        if ((i & 8) != 0) {
            z = ul8Var.d;
        }
        return ul8Var.a(str, str2, str3, z);
    }

    public final ul8 a(String str, String str2, String str3, boolean z) {
        z65.h(str, "id");
        z65.h(str2, "parentId");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        return new ul8(str, str2, str3, z);
    }

    public final String c() {
        return this.b;
    }

    public final boolean d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul8)) {
            return false;
        }
        ul8 ul8Var = (ul8) obj;
        if (z65.c(this.a, ul8Var.a) && z65.c(this.b, ul8Var.b) && z65.c(this.c, ul8Var.c) && this.d == ul8Var.d) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.a;
    }

    public final String getName() {
        return this.c;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a91.a(this.d);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        boolean z = this.d;
        return "ProductIngredient(id=" + str + ", parentId=" + str2 + ", name=" + str3 + ", removable=" + z + ")";
    }
}
