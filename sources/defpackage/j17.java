package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationChannelType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lj17;", "", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: j17  reason: default package */
/* loaded from: classes3.dex */
public final class j17 {
    public static final j17 b = new j17("MARKETING", 0, "1");
    public static final j17 c = new j17("MAPI", 1, "3");
    public static final j17 d = new j17("CHAT", 2, "4");
    private static final /* synthetic */ j17[] e;
    private static final /* synthetic */ kj3 f;
    private final String a;

    static {
        j17[] a = a();
        e = a;
        f = lj3.a(a);
    }

    private j17(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ j17[] a() {
        return new j17[]{b, c, d};
    }

    public static j17 valueOf(String str) {
        return (j17) Enum.valueOf(j17.class, str);
    }

    public static j17[] values() {
        return (j17[]) e.clone();
    }

    public final String getId() {
        return this.a;
    }
}
