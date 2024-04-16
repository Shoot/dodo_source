package defpackage;

import cloud.mindbox.mobile_sdk.models.operation.CustomFields;
import cloud.mindbox.mobile_sdk.models.operation.Ids;
import cloud.mindbox.mobile_sdk.models.operation.adapters.DateOnlyAdapter;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CustomerRequest.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001BÃ\u0001\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u000103¢\u0006\u0004\b8\u00109B·\u0001\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u000103¢\u0006\u0004\b8\u0010;B\u009f\u0001\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u000103¢\u0006\u0004\b8\u0010<R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001d\u0010\u0006R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006R\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006R\u001c\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010/\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u00104\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u0006="}, d2 = {"Lp52;", "", "", "authenticationTicket", "Ljava/lang/String;", "getAuthenticationTicket", "()Ljava/lang/String;", "Lw23;", "discountCard", "Lw23;", "getDiscountCard", "()Lw23;", "Lrm2;", "birthDate", "Lrm2;", "getBirthDate", "()Lrm2;", "Lkga;", "sex", "Lkga;", "getSex", "()Lkga;", "timeZone", "getTimeZone", "lastName", "getLastName", "firstName", "getFirstName", "middleName", "getMiddleName", "fullName", "getFullName", "Lwq;", "area", "Lwq;", "getArea", "()Lwq;", "email", "getEmail", "mobilePhone", "getMobilePhone", "Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "ids", "Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "getIds", "()Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "Lcloud/mindbox/mobile_sdk/models/operation/CustomFields;", "customFields", "Lcloud/mindbox/mobile_sdk/models/operation/CustomFields;", "getCustomFields", "()Lcloud/mindbox/mobile_sdk/models/operation/CustomFields;", "", "subscriptions", "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Lw23;Lrm2;Lkga;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwq;Ljava/lang/String;Ljava/lang/String;Lcloud/mindbox/mobile_sdk/models/operation/Ids;Lcloud/mindbox/mobile_sdk/models/operation/CustomFields;Ljava/util/List;)V", "Ljava/util/TimeZone;", "(Ljava/lang/String;Lw23;Lrm2;Lkga;Ljava/util/TimeZone;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwq;Ljava/lang/String;Ljava/lang/String;Lcloud/mindbox/mobile_sdk/models/operation/Ids;Lcloud/mindbox/mobile_sdk/models/operation/CustomFields;Ljava/util/List;)V", "(Ljava/lang/String;Lw23;Lrm2;Lkga;Ljava/util/TimeZone;Ljava/lang/String;Lwq;Ljava/lang/String;Ljava/lang/String;Lcloud/mindbox/mobile_sdk/models/operation/Ids;Lcloud/mindbox/mobile_sdk/models/operation/CustomFields;Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: p52  reason: default package */
/* loaded from: classes.dex */
public class p52 {
    @uca("area")
    private final wq area;
    @uca("authenticationTicket")
    private final String authenticationTicket;
    @y95(DateOnlyAdapter.class)
    @uca("birthDate")
    private final rm2 birthDate;
    @uca("customFields")
    private final CustomFields customFields;
    @uca("discountCard")
    private final w23 discountCard;
    @uca("email")
    private final String email;
    @uca("firstName")
    private final String firstName;
    @uca("fullName")
    private final String fullName;
    @uca("ids")
    private final Ids ids;
    @uca("lastName")
    private final String lastName;
    @uca("middleName")
    private final String middleName;
    @uca("mobilePhone")
    private final String mobilePhone;
    @uca("sex")
    private final kga sex;
    @uca("subscriptions")
    private final List<Object> subscriptions;
    @uca("timeZone")
    private final String timeZone;

    private p52(String str, w23 w23Var, rm2 rm2Var, kga kgaVar, String str2, String str3, String str4, String str5, String str6, wq wqVar, String str7, String str8, Ids ids, CustomFields customFields, List<Object> list) {
        this.authenticationTicket = str;
        this.discountCard = w23Var;
        this.birthDate = rm2Var;
        this.sex = kgaVar;
        this.timeZone = str2;
        this.lastName = str3;
        this.firstName = str4;
        this.middleName = str5;
        this.fullName = str6;
        this.area = wqVar;
        this.email = str7;
        this.mobilePhone = str8;
        this.ids = ids;
        this.customFields = customFields;
        this.subscriptions = list;
    }

    public final wq getArea() {
        return this.area;
    }

    public final String getAuthenticationTicket() {
        return this.authenticationTicket;
    }

    public final rm2 getBirthDate() {
        return this.birthDate;
    }

    public final CustomFields getCustomFields() {
        return this.customFields;
    }

    public final w23 getDiscountCard() {
        return this.discountCard;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final Ids getIds() {
        return this.ids;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getMobilePhone() {
        return this.mobilePhone;
    }

    public final kga getSex() {
        return this.sex;
    }

    public final List<Object> getSubscriptions() {
        return this.subscriptions;
    }

    public final String getTimeZone() {
        return this.timeZone;
    }

    /* synthetic */ p52(String str, w23 w23Var, rm2 rm2Var, kga kgaVar, String str2, String str3, String str4, String str5, String str6, wq wqVar, String str7, String str8, Ids ids, CustomFields customFields, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : w23Var, (i & 4) != 0 ? null : rm2Var, (i & 8) != 0 ? null : kgaVar, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : wqVar, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : ids, (i & 8192) != 0 ? null : customFields, (i & 16384) == 0 ? list : null);
    }

    public /* synthetic */ p52(String str, w23 w23Var, rm2 rm2Var, kga kgaVar, TimeZone timeZone, String str2, String str3, String str4, wq wqVar, String str5, String str6, Ids ids, CustomFields customFields, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : w23Var, (i & 4) != 0 ? null : rm2Var, (i & 8) != 0 ? null : kgaVar, (i & 16) != 0 ? null : timeZone, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : wqVar, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : ids, (i & 4096) != 0 ? null : customFields, (i & 8192) == 0 ? list : null);
    }

    public p52(String str, w23 w23Var, rm2 rm2Var, kga kgaVar, TimeZone timeZone, String str2, String str3, String str4, wq wqVar, String str5, String str6, Ids ids, CustomFields customFields, List<Object> list) {
        this(str, w23Var, rm2Var, kgaVar, timeZone != null ? timeZone.getID() : null, str2, str3, str4, null, wqVar, str5, str6, ids, customFields, list, 256, null);
    }

    public /* synthetic */ p52(String str, w23 w23Var, rm2 rm2Var, kga kgaVar, TimeZone timeZone, String str2, wq wqVar, String str3, String str4, Ids ids, CustomFields customFields, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : w23Var, (i & 4) != 0 ? null : rm2Var, (i & 8) != 0 ? null : kgaVar, (i & 16) != 0 ? null : timeZone, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : wqVar, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : ids, (i & 1024) != 0 ? null : customFields, (i & 2048) == 0 ? list : null);
    }

    public p52(String str, w23 w23Var, rm2 rm2Var, kga kgaVar, TimeZone timeZone, String str2, wq wqVar, String str3, String str4, Ids ids, CustomFields customFields, List<Object> list) {
        this(str, w23Var, rm2Var, kgaVar, timeZone != null ? timeZone.getID() : null, null, null, null, str2, wqVar, str3, str4, ids, customFields, list, 224, null);
    }
}
