package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: Tuples.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001f\u0012\u0006\u0010\u0014\u001a\u00028\u0000\u0012\u0006\u0010\u0016\u001a\u00028\u0001\u0012\u0006\u0010\u0018\u001a\u00028\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0014\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0016\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0018\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0017\u0010\t¨\u0006\u001b"}, d2 = {"Ldnb;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "toString", "a", "()Ljava/lang/Object;", "b", c.a, "", "hashCode", "", "other", "", "equals", "Ljava/lang/Object;", "getFirst", "first", DateTokenConverter.CONVERTER_KEY, "second", "getThird", "third", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: dnb  reason: default package */
/* loaded from: classes3.dex */
public final class dnb<A, B, C> implements Serializable {
    private final A a;
    private final B b;
    private final C c;

    public dnb(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public final A a() {
        return this.a;
    }

    public final B b() {
        return this.b;
    }

    public final C c() {
        return this.c;
    }

    public final B d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnb)) {
            return false;
        }
        dnb dnbVar = (dnb) obj;
        if (z65.c(this.a, dnbVar.a) && z65.c(this.b, dnbVar.b) && z65.c(this.c, dnbVar.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        A a = this.a;
        int i = 0;
        if (a == null) {
            hashCode = 0;
        } else {
            hashCode = a.hashCode();
        }
        int i2 = hashCode * 31;
        B b = this.b;
        if (b == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = b.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C c = this.c;
        if (c != null) {
            i = c.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + this.a + ", " + this.b + ", " + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
