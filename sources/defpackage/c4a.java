package defpackage;

import ch.qos.logback.core.CoreConstants;
import cloud.mindbox.mobile_sdk.models.operation.Ids;
import defpackage.tmb;
import kotlin.Metadata;
/* compiled from: ProductSegmentationResponseDto.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lc4a;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "a", "Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "()Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "ids", "Lu3a;", "b", "Lu3a;", "()Lu3a;", tmb.g.SEGMENT_JSON_NAME, "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: c4a  reason: default package */
/* loaded from: classes.dex */
public final class c4a {
    @uca("ids")
    private final Ids a;
    @uca(tmb.g.SEGMENT_JSON_NAME)
    private final u3a b;

    public final Ids a() {
        return this.a;
    }

    public final u3a b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4a)) {
            return false;
        }
        c4a c4aVar = (c4a) obj;
        if (z65.c(this.a, c4aVar.a) && z65.c(this.b, c4aVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Ids ids = this.a;
        int i = 0;
        if (ids == null) {
            hashCode = 0;
        } else {
            hashCode = ids.hashCode();
        }
        int i2 = hashCode * 31;
        u3a u3aVar = this.b;
        if (u3aVar != null) {
            i = u3aVar.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "SegmentationResponseDto(ids=" + this.a + ", segment=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
