package kotlin;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
/* compiled from: Tuples.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004B\u0017\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u0012\u0006\u0010\u0014\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0012\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0014\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0013\u0010\b¨\u0006\u0017"}, d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "toString", "a", "()Ljava/lang/Object;", "b", "", "hashCode", "", "other", "", "equals", "Ljava/lang/Object;", c.a, "first", DateTokenConverter.CONVERTER_KEY, "second", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class Pair<A, B> implements Serializable {
    private final A a;
    private final B b;

    public Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public final A a() {
        return this.a;
    }

    public final B b() {
        return this.b;
    }

    public final A c() {
        return this.a;
    }

    public final B d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (z65.c(this.a, pair.a) && z65.c(this.b, pair.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        A a = this.a;
        int i = 0;
        if (a == null) {
            hashCode = 0;
        } else {
            hashCode = a.hashCode();
        }
        int i2 = hashCode * 31;
        B b = this.b;
        if (b != null) {
            i = b.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + this.a + ", " + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
