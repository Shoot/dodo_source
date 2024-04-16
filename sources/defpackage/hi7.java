package defpackage;

import cloud.mindbox.mobile_sdk.models.operation.CustomFields;
import cloud.mindbox.mobile_sdk.models.operation.Ids;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderRequest.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010$¢\u0006\u0004\b+\u0010,R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(¨\u0006-"}, d2 = {"Lhi7;", "", "Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "ids", "Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "getIds", "()Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "Ldt0;", "cashdesk", "Ldt0;", "getCashdesk", "()Ldt0;", "", "deliveryCost", "Ljava/lang/Double;", "getDeliveryCost", "()Ljava/lang/Double;", "Lcloud/mindbox/mobile_sdk/models/operation/CustomFields;", "customFields", "Lcloud/mindbox/mobile_sdk/models/operation/CustomFields;", "getCustomFields", "()Lcloud/mindbox/mobile_sdk/models/operation/CustomFields;", "Lwq;", "area", "Lwq;", "getArea", "()Lwq;", "totalPrice", "getTotalPrice", "", "discounts", "Ljava/util/List;", "getDiscounts", "()Ljava/util/List;", "lines", "getLines", "", "email", "Ljava/lang/String;", "getEmail", "()Ljava/lang/String;", "mobilePhone", "getMobilePhone", "<init>", "(Lcloud/mindbox/mobile_sdk/models/operation/Ids;Ldt0;Ljava/lang/Double;Lcloud/mindbox/mobile_sdk/models/operation/CustomFields;Lwq;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: hi7  reason: default package */
/* loaded from: classes.dex */
public class hi7 {
    @uca("area")
    private final wq area;
    @uca("cashdesk")
    private final dt0 cashdesk;
    @uca("customFields")
    private final CustomFields customFields;
    @uca("deliveryCost")
    private final Double deliveryCost;
    @uca("discounts")
    private final List<Object> discounts;
    @uca("email")
    private final String email;
    @uca("ids")
    private final Ids ids;
    @uca("lines")
    private final List<Object> lines;
    @uca("mobilePhone")
    private final String mobilePhone;
    @uca("totalPrice")
    private final Double totalPrice;

    public hi7() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public final wq getArea() {
        return this.area;
    }

    public final dt0 getCashdesk() {
        return this.cashdesk;
    }

    public final CustomFields getCustomFields() {
        return this.customFields;
    }

    public final Double getDeliveryCost() {
        return this.deliveryCost;
    }

    public final List<Object> getDiscounts() {
        return this.discounts;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Ids getIds() {
        return this.ids;
    }

    public final List<Object> getLines() {
        return this.lines;
    }

    public final String getMobilePhone() {
        return this.mobilePhone;
    }

    public final Double getTotalPrice() {
        return this.totalPrice;
    }

    public hi7(Ids ids, dt0 dt0Var, Double d, CustomFields customFields, wq wqVar, Double d2, List<Object> list, List<Object> list2, String str, String str2) {
        this.ids = ids;
        this.cashdesk = dt0Var;
        this.deliveryCost = d;
        this.customFields = customFields;
        this.area = wqVar;
        this.totalPrice = d2;
        this.discounts = list;
        this.lines = list2;
        this.email = str;
        this.mobilePhone = str2;
    }

    public /* synthetic */ hi7(Ids ids, dt0 dt0Var, Double d, CustomFields customFields, wq wqVar, Double d2, List list, List list2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ids, (i & 2) != 0 ? null : dt0Var, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : customFields, (i & 16) != 0 ? null : wqVar, (i & 32) != 0 ? null : d2, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : str, (i & 512) == 0 ? str2 : null);
    }
}
