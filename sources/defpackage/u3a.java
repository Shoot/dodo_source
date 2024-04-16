package defpackage;

import ch.qos.logback.core.CoreConstants;
import cloud.mindbox.mobile_sdk.models.operation.Ids;
import kotlin.Metadata;
/* compiled from: ProductSegmentationResponseDto.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"Lu3a;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "a", "Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "()Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "ids", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: u3a  reason: default package */
/* loaded from: classes.dex */
public final class u3a {
    @uca("ids")
    private final Ids a;

    public final Ids a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u3a) && z65.c(this.a, ((u3a) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Ids ids = this.a;
        if (ids == null) {
            return 0;
        }
        return ids.hashCode();
    }

    public String toString() {
        return "SegmentResponseDto(ids=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
