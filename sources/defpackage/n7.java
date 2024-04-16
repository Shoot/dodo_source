package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.address.AddressEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AddressElement.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Ln7;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "i", "j", "k", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: n7  reason: default package */
/* loaded from: classes4.dex */
public final class n7 {
    public static final n7 b = new n7("STREET", 0, "street");
    public static final n7 c = new n7("HOUSE", 1, "house");
    public static final n7 d = new n7("BUILDING", 2, "building");
    public static final n7 e = new n7("APARTMENT", 3, AddressEntity.APARTMENT_FIELD_NAME);
    public static final n7 f = new n7("INTERCOME", 4, "intercome");
    public static final n7 g = new n7("ENTRANCE", 5, "entrance");
    public static final n7 h = new n7("FLOOR", 6, "floor");
    public static final n7 i = new n7("ADDRESS_NAME", 7, "address_name");
    public static final n7 j = new n7("POSTCODE", 8, "postcode");
    public static final n7 k = new n7("COMMENT", 9, "comment");
    private static final /* synthetic */ n7[] l;
    private static final /* synthetic */ kj3 m;
    private final String a;

    static {
        n7[] a = a();
        l = a;
        m = lj3.a(a);
    }

    private n7(String str, int i2, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ n7[] a() {
        return new n7[]{b, c, d, e, f, g, h, i, j, k};
    }

    public static n7 valueOf(String str) {
        return (n7) Enum.valueOf(n7.class, str);
    }

    public static n7[] values() {
        return (n7[]) l.clone();
    }

    public final String getValue() {
        return this.a;
    }
}
