package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: InAppConfigResponse.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001BM\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\u0011\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002HÆ\u0003JW\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\bHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a¨\u0006\""}, d2 = {"Lmx4;", "", "", "Lqx4;", "component1", "Lxw5;", "component2", "", "", "Lya7;", "component3", "Lk;", "component4", "inApps", "monitoring", "settings", "abtests", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getInApps", "()Ljava/util/List;", "getMonitoring", "Ljava/util/Map;", "getSettings", "()Ljava/util/Map;", "getAbtests", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: mx4  reason: default package */
/* loaded from: classes.dex */
public final class mx4 {
    @uca("abtests")
    private final List<k> abtests;
    @uca("inapps")
    private final List<qx4> inApps;
    @uca("monitoring")
    private final List<xw5> monitoring;
    @uca("settings")
    private final Map<String, ya7> settings;

    public mx4(List<qx4> list, List<xw5> list2, Map<String, ya7> map, List<k> list3) {
        this.inApps = list;
        this.monitoring = list2;
        this.settings = map;
        this.abtests = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ mx4 copy$default(mx4 mx4Var, List list, List list2, Map map, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mx4Var.inApps;
        }
        if ((i & 2) != 0) {
            list2 = mx4Var.monitoring;
        }
        if ((i & 4) != 0) {
            map = mx4Var.settings;
        }
        if ((i & 8) != 0) {
            list3 = mx4Var.abtests;
        }
        return mx4Var.copy(list, list2, map, list3);
    }

    public final List<qx4> component1() {
        return this.inApps;
    }

    public final List<xw5> component2() {
        return this.monitoring;
    }

    public final Map<String, ya7> component3() {
        return this.settings;
    }

    public final List<k> component4() {
        return this.abtests;
    }

    public final mx4 copy(List<qx4> list, List<xw5> list2, Map<String, ya7> map, List<k> list3) {
        return new mx4(list, list2, map, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx4)) {
            return false;
        }
        mx4 mx4Var = (mx4) obj;
        if (z65.c(this.inApps, mx4Var.inApps) && z65.c(this.monitoring, mx4Var.monitoring) && z65.c(this.settings, mx4Var.settings) && z65.c(this.abtests, mx4Var.abtests)) {
            return true;
        }
        return false;
    }

    public final List<k> getAbtests() {
        return this.abtests;
    }

    public final List<qx4> getInApps() {
        return this.inApps;
    }

    public final List<xw5> getMonitoring() {
        return this.monitoring;
    }

    public final Map<String, ya7> getSettings() {
        return this.settings;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        List<qx4> list = this.inApps;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        List<xw5> list2 = this.monitoring;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Map<String, ya7> map = this.settings;
        if (map == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = map.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        List<k> list3 = this.abtests;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        return "InAppConfigResponse(inApps=" + this.inApps + ", monitoring=" + this.monitoring + ", settings=" + this.settings + ", abtests=" + this.abtests + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
