package defpackage;

import ch.qos.logback.core.CoreConstants;
import cloud.mindbox.mobile_sdk.models.operation.Ids;
import kotlin.Metadata;
/* compiled from: ProductSegmentationRequestDto.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcm8;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "a", "Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "getIds", "()Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "ids", "<init>", "(Lcloud/mindbox/mobile_sdk/models/operation/Ids;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: cm8  reason: default package */
/* loaded from: classes.dex */
public final class cm8 {
    @uca("ids")
    private final Ids a;

    public cm8(Ids ids) {
        z65.h(ids, "ids");
        this.a = ids;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cm8) && z65.c(this.a, ((cm8) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "ProductRequestDto(ids=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
