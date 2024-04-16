package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: AnalyticsEvent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J5\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lqc;", "", "", "toString", "event", "Li2b;", "sum", "", "params", "a", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "b", "Li2b;", e.a, "()Li2b;", "Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", "<init>", "(Ljava/lang/String;Li2b;Ljava/util/Map;)V", "analytics-core"}, k = 1, mv = {1, 7, 1})
/* renamed from: qc  reason: default package */
/* loaded from: classes.dex */
public final class qc {
    private final String a;
    private final i2b b;
    private final Map<String, Object> c;

    public qc(String str, i2b i2bVar, Map<String, ? extends Object> map) {
        z65.h(str, "event");
        z65.h(map, "params");
        this.a = str;
        this.b = i2bVar;
        this.c = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ qc b(qc qcVar, String str, i2b i2bVar, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qcVar.a;
        }
        if ((i & 2) != 0) {
            i2bVar = qcVar.b;
        }
        if ((i & 4) != 0) {
            map = qcVar.c;
        }
        return qcVar.a(str, i2bVar, map);
    }

    public final qc a(String str, i2b i2bVar, Map<String, ? extends Object> map) {
        z65.h(str, "event");
        z65.h(map, "params");
        return new qc(str, i2bVar, map);
    }

    public final String c() {
        return this.a;
    }

    public final Map<String, Object> d() {
        return this.c;
    }

    public final i2b e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc)) {
            return false;
        }
        qc qcVar = (qc) obj;
        if (z65.c(this.a, qcVar.a) && z65.c(this.b, qcVar.b) && z65.c(this.c, qcVar.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        i2b i2bVar = this.b;
        if (i2bVar == null) {
            hashCode = 0;
        } else {
            hashCode = i2bVar.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "AnalyticEvent(event='" + this.a + "', sum=" + this.b + ", params=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
