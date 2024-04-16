package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SegmentationCheckRequest.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\u001b\u0010\u0006\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lv3a;", "", "", "Ly3a;", "component1", "segmentations", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getSegmentations", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: v3a  reason: default package */
/* loaded from: classes.dex */
public final class v3a {
    @uca("segmentations")
    private final List<y3a> segmentations;

    public v3a(List<y3a> list) {
        this.segmentations = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ v3a copy$default(v3a v3aVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = v3aVar.segmentations;
        }
        return v3aVar.copy(list);
    }

    public final List<y3a> component1() {
        return this.segmentations;
    }

    public final v3a copy(List<y3a> list) {
        return new v3a(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof v3a) && z65.c(this.segmentations, ((v3a) obj).segmentations)) {
            return true;
        }
        return false;
    }

    public final List<y3a> getSegmentations() {
        return this.segmentations;
    }

    public int hashCode() {
        List<y3a> list = this.segmentations;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "SegmentationCheckRequest(segmentations=" + this.segmentations + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
