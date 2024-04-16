package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TakeTypeAnalytics.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lk6b;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: k6b  reason: default package */
/* loaded from: classes4.dex */
public final class k6b {
    public static final k6b b = new k6b("DINE_IN", 0, "dine-in");
    public static final k6b c = new k6b("TAKE_AWAY", 1, "take-away");
    public static final k6b d = new k6b("TABLE", 2, "table");
    private static final /* synthetic */ k6b[] e;
    private static final /* synthetic */ kj3 f;
    private final String a;

    static {
        k6b[] a = a();
        e = a;
        f = lj3.a(a);
    }

    private k6b(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ k6b[] a() {
        return new k6b[]{b, c, d};
    }

    public static k6b valueOf(String str) {
        return (k6b) Enum.valueOf(k6b.class, str);
    }

    public static k6b[] values() {
        return (k6b[]) e.clone();
    }

    public final String getValue() {
        return this.a;
    }
}
