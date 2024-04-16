package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: OptionItem.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\n\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0019"}, d2 = {"Lnb7;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", "I", c.a, "()I", "titleRes", "imageRes", DateTokenConverter.CONVERTER_KEY, "imageTintRes", "<init>", "(Ljava/lang/String;III)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nb7  reason: default package */
/* loaded from: classes.dex */
public final class nb7 implements Serializable {
    private final String a;
    private final int b;
    private final int c;
    private final int d;

    public nb7(String str, int i, int i2, int i3) {
        z65.h(str, "id");
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb7)) {
            return false;
        }
        nb7 nb7Var = (nb7) obj;
        if (z65.c(this.a, nb7Var.a) && this.b == nb7Var.b && this.c == nb7Var.c && this.d == nb7Var.d) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.a;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        String str = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        return "OptionItem(id=" + str + ", titleRes=" + i + ", imageRes=" + i2 + ", imageTintRes=" + i3 + ")";
    }
}
