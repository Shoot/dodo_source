package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: SettingsCache.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\t\u0010\u0016R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u000f\u0010\u001b¨\u0006\u001f"}, d2 = {"Lbea;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Boolean;", c.a, "()Ljava/lang/Boolean;", "sessionEnabled", "", "b", "Ljava/lang/Double;", e.a, "()Ljava/lang/Double;", "sessionSamplingRate", "Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Integer;", "sessionRestartTimeout", "cacheDuration", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "cacheUpdatedTime", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: bea  reason: default package */
/* loaded from: classes2.dex */
public final class bea {
    private final Boolean a;
    private final Double b;
    private final Integer c;
    private final Integer d;
    private final Long e;

    public bea(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }

    public final Integer a() {
        return this.d;
    }

    public final Long b() {
        return this.e;
    }

    public final Boolean c() {
        return this.a;
    }

    public final Integer d() {
        return this.c;
    }

    public final Double e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bea)) {
            return false;
        }
        bea beaVar = (bea) obj;
        if (z65.c(this.a, beaVar.a) && z65.c(this.b, beaVar.b) && z65.c(this.c, beaVar.c) && z65.c(this.d, beaVar.d) && z65.c(this.e, beaVar.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Boolean bool = this.a;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = hashCode * 31;
        Double d = this.b;
        if (d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num = this.c;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num2 = this.d;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Long l = this.e;
        if (l != null) {
            i = l.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.a + ", sessionSamplingRate=" + this.b + ", sessionRestartTimeout=" + this.c + ", cacheDuration=" + this.d + ", cacheUpdatedTime=" + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
