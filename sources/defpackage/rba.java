package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Sender.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lrba;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rba  reason: default package */
/* loaded from: classes2.dex */
public final class rba {
    public static final rba a = new rba("LOYALTY", 0);
    public static final rba b = new rba("PROFILE", 1);
    public static final rba c = new rba("MENU", 2);
    public static final rba d = new rba("WIDGET", 3);
    public static final rba e = new rba("PUSH", 4);
    public static final rba f = new rba("REFERRAL", 5);
    private static final /* synthetic */ rba[] g;
    private static final /* synthetic */ kj3 h;

    static {
        rba[] a2 = a();
        g = a2;
        h = lj3.a(a2);
    }

    private rba(String str, int i) {
    }

    private static final /* synthetic */ rba[] a() {
        return new rba[]{a, b, c, d, e, f};
    }

    public static rba valueOf(String str) {
        return (rba) Enum.valueOf(rba.class, str);
    }

    public static rba[] values() {
        return (rba[]) g.clone();
    }
}
