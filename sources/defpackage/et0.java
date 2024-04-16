package defpackage;

import cloud.mindbox.mobile_sdk.models.operation.adapters.DateTimeAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CatalogProductListRequest.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Let0;", "", "Lym2;", "calculationDateTimeUtc", "Lym2;", "getCalculationDateTimeUtc", "()Lym2;", "Lwq;", "area", "Lwq;", "getArea", "()Lwq;", "", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "<init>", "(Lym2;Lwq;Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: et0  reason: default package */
/* loaded from: classes.dex */
public class et0 {
    @uca("area")
    private final wq area;
    @y95(DateTimeAdapter.class)
    @uca("calculationDateTimeUtc")
    private final ym2 calculationDateTimeUtc;
    @uca("items")
    private final List<Object> items;

    public et0() {
        this(null, null, null, 7, null);
    }

    public final wq getArea() {
        return this.area;
    }

    public final ym2 getCalculationDateTimeUtc() {
        return this.calculationDateTimeUtc;
    }

    public final List<Object> getItems() {
        return this.items;
    }

    public et0(ym2 ym2Var, wq wqVar, List<Object> list) {
        this.calculationDateTimeUtc = ym2Var;
        this.area = wqVar;
        this.items = list;
    }

    public /* synthetic */ et0(ym2 ym2Var, wq wqVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ym2Var, (i & 2) != 0 ? null : wqVar, (i & 4) != 0 ? null : list);
    }
}
