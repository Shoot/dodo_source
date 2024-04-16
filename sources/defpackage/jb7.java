package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PizzeriaMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Ljb7;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jb7  reason: default package */
/* loaded from: classes2.dex */
public final class jb7 {
    public static final jb7 a = new jb7("ALL_TYPES", 0);
    public static final jb7 b = new jb7("WITHOUT_CARRYOUT", 1);
    public static final jb7 c = new jb7("WITHOUT_DELIVERY", 2);
    public static final jb7 d = new jb7("WITHOUT_RESTAURANT", 3);
    public static final jb7 e = new jb7("DELIVERY_ONLY", 4);
    public static final jb7 f = new jb7(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
    private static final /* synthetic */ jb7[] g;
    private static final /* synthetic */ kj3 h;

    static {
        jb7[] a2 = a();
        g = a2;
        h = lj3.a(a2);
    }

    private jb7(String str, int i) {
    }

    private static final /* synthetic */ jb7[] a() {
        return new jb7[]{a, b, c, d, e, f};
    }

    public static jb7 valueOf(String str) {
        return (jb7) Enum.valueOf(jb7.class, str);
    }

    public static jb7[] values() {
        return (jb7[]) g.clone();
    }
}
