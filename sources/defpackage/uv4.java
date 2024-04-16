package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageTypeV5.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Luv4;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: uv4  reason: default package */
/* loaded from: classes.dex */
public final class uv4 {
    public static final uv4 b = new uv4("WEB_P", 0, "webp");
    public static final uv4 c = new uv4("PNG", 1, "png");
    public static final uv4 d = new uv4("JPEG", 2, "jpeg");
    private static final /* synthetic */ uv4[] e;
    private static final /* synthetic */ kj3 f;
    private final String a;

    static {
        uv4[] a = a();
        e = a;
        f = lj3.a(a);
    }

    private uv4(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ uv4[] a() {
        return new uv4[]{b, c, d};
    }

    public static uv4 valueOf(String str) {
        return (uv4) Enum.valueOf(uv4.class, str);
    }

    public static uv4[] values() {
        return (uv4[]) e.clone();
    }

    public final String getValue() {
        return this.a;
    }
}
