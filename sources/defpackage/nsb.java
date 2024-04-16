package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UpsaleExperimentInfo.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0005HÖ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lnsb;", "", "", "productCount", "", "", "additionalData", "a", "toString", "hashCode", "other", "", "equals", "I", DateTokenConverter.CONVERTER_KEY, "()I", "b", "Ljava/util/Map;", c.a, "()Ljava/util/Map;", "<init>", "(ILjava/util/Map;)V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: nsb  reason: default package */
/* loaded from: classes.dex */
public final class nsb {
    private final int a;
    private final Map<String, String> b;

    public nsb() {
        this(0, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ nsb b(nsb nsbVar, int i, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = nsbVar.a;
        }
        if ((i2 & 2) != 0) {
            map = nsbVar.b;
        }
        return nsbVar.a(i, map);
    }

    public final nsb a(int i, Map<String, String> map) {
        z65.h(map, "additionalData");
        return new nsb(i, map);
    }

    public final Map<String, String> c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsb)) {
            return false;
        }
        nsb nsbVar = (nsb) obj;
        if (this.a == nsbVar.a && z65.c(this.b, nsbVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public String toString() {
        int i = this.a;
        Map<String, String> map = this.b;
        return "UpsaleExperimentInfo(productCount=" + i + ", additionalData=" + map + ")";
    }

    public nsb(int i, Map<String, String> map) {
        z65.h(map, "additionalData");
        this.a = i;
        this.b = map;
    }

    public /* synthetic */ nsb(int i, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? g86.h() : map);
    }
}
