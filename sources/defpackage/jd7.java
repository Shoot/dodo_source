package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: OrderDetailsSauceVO.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0015"}, d2 = {"Ljd7;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "title", "b", "I", "()I", "count", "imageUrl", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jd7  reason: default package */
/* loaded from: classes.dex */
public final class jd7 {
    private final String a;
    private final int b;
    private final String c;

    public jd7(String str, int i, String str2) {
        z65.h(str, "title");
        z65.h(str2, "imageUrl");
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd7)) {
            return false;
        }
        jd7 jd7Var = (jd7) obj;
        if (z65.c(this.a, jd7Var.a) && this.b == jd7Var.b && z65.c(this.c, jd7Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        return "OrderDetailsSauceVO(title=" + str + ", count=" + i + ", imageUrl=" + str2 + ")";
    }
}
