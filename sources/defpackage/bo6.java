package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
/* compiled from: InAppConfigResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\u001b\u0010\u0006\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lbo6;", "", "", "Lyw5;", "component1", "logs", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getLogs", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: bo6  reason: default package */
/* loaded from: classes.dex */
public final class bo6 {
    @uca("logs")
    private final List<yw5> logs;

    public bo6(List<yw5> list) {
        this.logs = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ bo6 copy$default(bo6 bo6Var, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bo6Var.logs;
        }
        return bo6Var.copy(list);
    }

    public final List<yw5> component1() {
        return this.logs;
    }

    public final bo6 copy(List<yw5> list) {
        return new bo6(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bo6) && z65.c(this.logs, ((bo6) obj).logs)) {
            return true;
        }
        return false;
    }

    public final List<yw5> getLogs() {
        return this.logs;
    }

    public int hashCode() {
        List<yw5> list = this.logs;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "MonitoringDto(logs=" + this.logs + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
