package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AssistantSender.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lrv;", "", "Lqd;", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rv  reason: default package */
/* loaded from: classes2.dex */
public final class rv implements qd {
    public static final rv b = new rv("WELCOME", 0, "welcome");
    public static final rv c = new rv("ERROR", 1, "error");
    public static final rv d = new rv("RESULT", 2, "generatedPizza");
    public static final rv e = new rv("LOADING", 3, "loading");
    public static final rv f = new rv("SHARING", 4, "shareScreenshot");
    private static final /* synthetic */ rv[] g;
    private static final /* synthetic */ kj3 h;
    private final String a;

    static {
        rv[] a = a();
        g = a;
        h = lj3.a(a);
    }

    private rv(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ rv[] a() {
        return new rv[]{b, c, d, e, f};
    }

    public static rv valueOf(String str) {
        return (rv) Enum.valueOf(rv.class, str);
    }

    public static rv[] values() {
        return (rv[]) g.clone();
    }

    @Override // defpackage.qd
    public String getValue() {
        return this.a;
    }
}
