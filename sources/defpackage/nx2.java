package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.address.AddressEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeliveryLocationDetailsField.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lnx2;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "i", "j", "k", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nx2  reason: default package */
/* loaded from: classes4.dex */
public final class nx2 {
    public static final nx2 b = new nx2("STREET", 0, "street");
    public static final nx2 c = new nx2("HOUSE", 1, AddressEntity.HOUSE_NUMBER_FIELD_NAME);
    public static final nx2 d = new nx2("BUILDING", 2, "building");
    public static final nx2 e = new nx2("APARTMENT", 3, AddressEntity.APARTMENT_FIELD_NAME);
    public static final nx2 f = new nx2("INTERCOM", 4, "intercom");
    public static final nx2 g = new nx2("PORCH", 5, "porch");
    public static final nx2 h = new nx2("FLOOR", 6, "floor");
    public static final nx2 i = new nx2("ADDRESS_ALIAS", 7, "addressAlias");
    public static final nx2 j = new nx2("POSTCODE", 8, "postcode");
    public static final nx2 k = new nx2("COMMENT", 9, "comment");
    private static final /* synthetic */ nx2[] l;
    private static final /* synthetic */ kj3 m;
    private final String a;

    static {
        nx2[] a = a();
        l = a;
        m = lj3.a(a);
    }

    private nx2(String str, int i2, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ nx2[] a() {
        return new nx2[]{b, c, d, e, f, g, h, i, j, k};
    }

    public static nx2 valueOf(String str) {
        return (nx2) Enum.valueOf(nx2.class, str);
    }

    public static nx2[] values() {
        return (nx2[]) l.clone();
    }

    public final String getValue() {
        return this.a;
    }
}
