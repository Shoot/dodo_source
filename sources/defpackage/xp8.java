package defpackage;

import cloud.mindbox.mobile_sdk.models.operation.Ids;
import cloud.mindbox.mobile_sdk.models.operation.adapters.DateTimeAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PromoCodeRequest.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lxp8;", "", "Lym2;", "availableFromDateTimeUtc", "Lym2;", "getAvailableFromDateTimeUtc", "()Lym2;", "availableTillDateTimeUtc", "getAvailableTillDateTimeUtc", "Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "ids", "Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "getIds", "()Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "<init>", "(Lym2;Lym2;Lcloud/mindbox/mobile_sdk/models/operation/Ids;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: xp8  reason: default package */
/* loaded from: classes.dex */
public class xp8 {
    @y95(DateTimeAdapter.class)
    @uca("availableFromDateTimeUtc")
    private final ym2 availableFromDateTimeUtc;
    @y95(DateTimeAdapter.class)
    @uca("availableTillDateTimeUtc")
    private final ym2 availableTillDateTimeUtc;
    @uca("ids")
    private final Ids ids;

    public xp8() {
        this(null, null, null, 7, null);
    }

    public final ym2 getAvailableFromDateTimeUtc() {
        return this.availableFromDateTimeUtc;
    }

    public final ym2 getAvailableTillDateTimeUtc() {
        return this.availableTillDateTimeUtc;
    }

    public final Ids getIds() {
        return this.ids;
    }

    public xp8(ym2 ym2Var, ym2 ym2Var2, Ids ids) {
        this.availableFromDateTimeUtc = ym2Var;
        this.availableTillDateTimeUtc = ym2Var2;
        this.ids = ids;
    }

    public /* synthetic */ xp8(ym2 ym2Var, ym2 ym2Var2, Ids ids, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ym2Var, (i & 2) != 0 ? null : ym2Var2, (i & 4) != 0 ? null : ids);
    }
}
