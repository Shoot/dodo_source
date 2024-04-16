package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: CardCredentials.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0017"}, d2 = {"Lxo0;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "number", "b", "cvv", c.a, "I", "()I", "expireMonth", "expireYear", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "payment-core_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: xo0  reason: default package */
/* loaded from: classes2.dex */
public final class xo0 {
    private final String a;
    private final String b;
    private final int c;
    private final int d;

    public xo0(String str, String str2, int i, int i2) {
        z65.h(str, "number");
        z65.h(str2, "cvv");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo0)) {
            return false;
        }
        xo0 xo0Var = (xo0) obj;
        if (z65.c(this.a, xo0Var.a) && z65.c(this.b, xo0Var.b) && this.c == xo0Var.c && this.d == xo0Var.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        return "CardCredentials(number=" + this.a + ", cvv=" + this.b + ", expireMonth=" + this.c + ", expireYear=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
