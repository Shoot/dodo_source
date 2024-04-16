package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InAppNotificationType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Luy4;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: uy4  reason: default package */
/* loaded from: classes4.dex */
public final class uy4 {
    public static final uy4 b = new uy4("LOYALTY", 0, "loyalty");
    public static final uy4 c = new uy4("BONUS", 1, "bonuses");
    public static final uy4 d = new uy4("DODOCOINS_EXPIRATION", 2, "expiration");
    public static final uy4 e = new uy4("UNDEFINED", 3, "undefined");
    private static final /* synthetic */ uy4[] f;
    private static final /* synthetic */ kj3 g;
    private final String a;

    static {
        uy4[] a = a();
        f = a;
        g = lj3.a(a);
    }

    private uy4(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ uy4[] a() {
        return new uy4[]{b, c, d, e};
    }

    public static uy4 valueOf(String str) {
        return (uy4) Enum.valueOf(uy4.class, str);
    }

    public static uy4[] values() {
        return (uy4[]) f.clone();
    }

    public final String getValue() {
        return this.a;
    }
}
