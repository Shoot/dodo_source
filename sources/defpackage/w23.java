package defpackage;

import cloud.mindbox.mobile_sdk.models.operation.Ids;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DiscountCardRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lw23;", "", "Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "ids", "Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "getIds", "()Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "<init>", "(Lcloud/mindbox/mobile_sdk/models/operation/Ids;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: w23  reason: default package */
/* loaded from: classes.dex */
public class w23 {
    @uca("ids")
    private final Ids ids;

    public w23() {
        this(null, 1, null);
    }

    public final Ids getIds() {
        return this.ids;
    }

    public w23(Ids ids) {
        this.ids = ids;
    }

    public /* synthetic */ w23(Ids ids, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ids);
    }
}
