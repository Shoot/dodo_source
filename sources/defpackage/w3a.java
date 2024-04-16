package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SegmentationCheckResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J'\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lw3a;", "", "", "component1", "", "Ls52;", "component2", "status", "customerSegmentations", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "Ljava/util/List;", "getCustomerSegmentations", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: w3a  reason: default package */
/* loaded from: classes.dex */
public final class w3a {
    @uca("customerSegmentations")
    private final List<s52> customerSegmentations;
    @uca("status")
    private final String status;

    public w3a(String str, List<s52> list) {
        this.status = str;
        this.customerSegmentations = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ w3a copy$default(w3a w3aVar, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = w3aVar.status;
        }
        if ((i & 2) != 0) {
            list = w3aVar.customerSegmentations;
        }
        return w3aVar.copy(str, list);
    }

    public final String component1() {
        return this.status;
    }

    public final List<s52> component2() {
        return this.customerSegmentations;
    }

    public final w3a copy(String str, List<s52> list) {
        return new w3a(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3a)) {
            return false;
        }
        w3a w3aVar = (w3a) obj;
        if (z65.c(this.status, w3aVar.status) && z65.c(this.customerSegmentations, w3aVar.customerSegmentations)) {
            return true;
        }
        return false;
    }

    public final List<s52> getCustomerSegmentations() {
        return this.customerSegmentations;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode;
        String str = this.status;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        List<s52> list = this.customerSegmentations;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "SegmentationCheckResponse(status=" + this.status + ", customerSegmentations=" + this.customerSegmentations + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
