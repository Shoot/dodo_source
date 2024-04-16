package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BrandName.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lpf0;", "", "", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "brand", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pf0  reason: default package */
/* loaded from: classes2.dex */
public final class pf0 {
    public static final pf0 b = new pf0("KASPI", 0, "kaspi");
    public static final pf0 c = new pf0("MOMO", 1, "momo");
    public static final pf0 d = new pf0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, "unknown");
    private static final /* synthetic */ pf0[] e;
    private static final /* synthetic */ kj3 f;
    private final String a;

    static {
        pf0[] a = a();
        e = a;
        f = lj3.a(a);
    }

    private pf0(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ pf0[] a() {
        return new pf0[]{b, c, d};
    }

    public static pf0 valueOf(String str) {
        return (pf0) Enum.valueOf(pf0.class, str);
    }

    public static pf0[] values() {
        return (pf0[]) e.clone();
    }

    public final String i() {
        return this.a;
    }
}
