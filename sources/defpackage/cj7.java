package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderSummaryAnalytics.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcj7;", "", "Lqd;", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cj7  reason: default package */
/* loaded from: classes4.dex */
public final class cj7 implements qd {
    public static final cj7 b = new cj7("PIZZERIA", 0, "pizzeria");
    public static final cj7 c = new cj7("HOME", 1, "home");
    public static final cj7 d = new cj7("COURIER", 2, "courier");
    private static final /* synthetic */ cj7[] e;
    private static final /* synthetic */ kj3 f;
    private final String a;

    static {
        cj7[] a = a();
        e = a;
        f = lj3.a(a);
    }

    private cj7(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ cj7[] a() {
        return new cj7[]{b, c, d};
    }

    public static cj7 valueOf(String str) {
        return (cj7) Enum.valueOf(cj7.class, str);
    }

    public static cj7[] values() {
        return (cj7[]) e.clone();
    }

    @Override // defpackage.qd
    public String getValue() {
        return this.a;
    }
}
