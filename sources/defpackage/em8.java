package defpackage;

import ch.qos.logback.core.CoreConstants;
import cloud.mindbox.mobile_sdk.models.operation.Ids;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ProductSegmentationResponseDto.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\n\u0010\u0013¨\u0006\u0015"}, d2 = {"Lem8;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "a", "Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "getIds", "()Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "ids", "", "Lc4a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "segmentations", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: em8  reason: default package */
/* loaded from: classes.dex */
public final class em8 {
    @uca("ids")
    private final Ids a;
    @uca("segmentations")
    private final List<c4a> b;

    public final List<c4a> a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em8)) {
            return false;
        }
        em8 em8Var = (em8) obj;
        if (z65.c(this.a, em8Var.a) && z65.c(this.b, em8Var.b)) {
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
        List<c4a> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "ProductResponseDto(ids=" + this.a + ", segmentations=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
