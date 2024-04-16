package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lb37;", "", "", "a", "I", "i", "()I", "id", "<init>", "(Ljava/lang/String;II)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: b37  reason: default package */
/* loaded from: classes3.dex */
public final class b37 {
    public static final b37 b = new b37("MARKETING", 0, 0);
    public static final b37 c = new b37("ORDER_RATING", 1, 1);
    public static final b37 d = new b37("ORDER_TRACKING", 2, 2);
    public static final b37 e = new b37("NATIVE_CHAT", 3, 3);
    public static final b37 f = new b37("CLIENT_COMMUNICATION", 4, 4);
    private static final /* synthetic */ b37[] g;
    private static final /* synthetic */ kj3 h;
    private final int a;

    static {
        b37[] a = a();
        g = a;
        h = lj3.a(a);
    }

    private b37(String str, int i, int i2) {
        this.a = i2;
    }

    private static final /* synthetic */ b37[] a() {
        return new b37[]{b, c, d, e, f};
    }

    public static b37 valueOf(String str) {
        return (b37) Enum.valueOf(b37.class, str);
    }

    public static b37[] values() {
        return (b37[]) g.clone();
    }

    public final int i() {
        return this.a;
    }
}
