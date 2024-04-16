package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: CardData.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0019"}, d2 = {"Lyo0;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "pan", "b", "cardHolder", c.a, "cvv", DateTokenConverter.CONVERTER_KEY, "I", "()I", "expirationMonth", "expirationYear", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "allsecure_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: yo0  reason: default package */
/* loaded from: classes.dex */
public final class yo0 {
    private final String a;
    private final String b;
    private final String c;
    private final int d;
    private final int e;

    public yo0(String str, String str2, String str3, int i, int i2) {
        z65.h(str, "pan");
        z65.h(str2, "cardHolder");
        z65.h(str3, "cvv");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.e;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo0)) {
            return false;
        }
        yo0 yo0Var = (yo0) obj;
        if (z65.c(this.a, yo0Var.a) && z65.c(this.b, yo0Var.b) && z65.c(this.c, yo0Var.c) && this.d == yo0Var.d && this.e == yo0Var.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e;
    }

    public String toString() {
        return "CardData(pan=" + this.a + ", cardHolder=" + this.b + ", cvv=" + this.c + ", expirationMonth=" + this.d + ", expirationYear=" + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
