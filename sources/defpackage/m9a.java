package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: analytics.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lm9a;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: m9a  reason: default package */
/* loaded from: classes4.dex */
public final class m9a {
    public static final m9a b = new m9a("DELIVERY", 0, "delivery");
    public static final m9a c = new m9a("RESTAURANT", 1, "restaurant");
    public static final m9a d = new m9a("CARRYOUT", 2, "carryout");
    private static final /* synthetic */ m9a[] e;
    private static final /* synthetic */ kj3 f;
    private final String a;

    static {
        m9a[] a = a();
        e = a;
        f = lj3.a(a);
    }

    private m9a(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ m9a[] a() {
        return new m9a[]{b, c, d};
    }

    public static m9a valueOf(String str) {
        return (m9a) Enum.valueOf(m9a.class, str);
    }

    public static m9a[] values() {
        return (m9a[]) e.clone();
    }

    public final String getValue() {
        return this.a;
    }
}
